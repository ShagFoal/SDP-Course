package org.example;

public class MavenBuildRunner {
    private String testedSource;
    private int buildNumber;

    public void runTests(String source) {
        if (source == null || source.isBlank()) {
            throw new IllegalArgumentException("Source must not be blank");
        }
        testedSource = source;
        System.out.println("Tests passed for: " + source);
    }

    public String packageArtifact(String source) {
        if (testedSource == null || !testedSource.equals(source)) {
            throw new IllegalStateException("Run tests for this source before packaging");
        }
        String jarPath = "target/app-" + (++buildNumber) + ".jar";
        testedSource = null;
        System.out.println("Packaged artifact: " + jarPath);
        return jarPath;
    }
}
