package org.example;

public class DeploymentFacade {
    private final GitClient gitClient = new GitClient();
    private final MavenBuildRunner buildRunner = new MavenBuildRunner();
    private final DatabaseMigrator dbMigrator = new DatabaseMigrator();
    private final DockerEngine dockerEngine = new DockerEngine();

    public boolean deployRelease(String repoUrl, String branch, int port) {
        try {
            if (port < 1 || port > 65535) {
                throw new IllegalArgumentException("Port must be between 1 and 65535");
            }
            gitClient.fetchRepository(repoUrl);
            String source = gitClient.checkoutBranch(branch);
            buildRunner.runTests(source);
            String jarPath = buildRunner.packageArtifact(source);
            String imageTag = dockerEngine.buildImage(jarPath);
            dbMigrator.verifyConnection();
            dbMigrator.applyMigration();
            dockerEngine.stopRunningContainer();
            dockerEngine.runContainer(imageTag, port);
            System.out.println("Deployment successful");
            return true;
        } catch (IllegalArgumentException | IllegalStateException exception) {
            System.out.println("Deployment failed: " + exception.getMessage());
            return false;
        }
    }
}
