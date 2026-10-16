package org.example;

public class GitClient {
    private String repositoryUrl;

    public void fetchRepository(String repoUrl) {
        if (repoUrl == null || repoUrl.isBlank()) {
            throw new IllegalArgumentException("Repository URL must not be blank");
        }
        repositoryUrl = repoUrl;
        System.out.println("Fetched repository: " + repoUrl);
    }

    public String checkoutBranch(String branch) {
        if (repositoryUrl == null) {
            throw new IllegalStateException("Fetch a repository before checkout");
        }
        if (branch == null || branch.isBlank()) {
            throw new IllegalArgumentException("Branch must not be blank");
        }
        String source = repositoryUrl + "#" + branch;
        System.out.println("Checked out branch: " + branch);
        return source;
    }
}
