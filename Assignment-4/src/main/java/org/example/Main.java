package org.example;

public class Main {
    public static void main(String[] args) {
        DeploymentFacade deployment = new DeploymentFacade();
        String repoUrl = "https://github.com/example/app.git";

        System.out.println("--- First deployment ---");
        System.out.println("Result: " + deployment.deployRelease(repoUrl, "main", 8080));

        System.out.println("\n--- Update existing deployment ---");
        System.out.println("Result: " + deployment.deployRelease(repoUrl, "release", 8080));

        System.out.println("\n--- Invalid deployment ---");
        System.out.println("Result: " + deployment.deployRelease(repoUrl, "main", 0));
    }
}
