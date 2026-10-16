package org.example;

public class DockerEngine {
    private String builtImage;
    private String runningImage;

    public String buildImage(String jarPath) {
        if (jarPath == null || !jarPath.endsWith(".jar")) {
            throw new IllegalArgumentException("Image requires a JAR artifact");
        }
        builtImage = "deployment:" + jarPath;
        System.out.println("Built image: " + builtImage);
        return builtImage;
    }

    public void stopRunningContainer() {
        if (runningImage != null) {
            System.out.println("Stopped container: " + runningImage);
            runningImage = null;
        }
    }

    public void runContainer(String imageTag, int port) {
        if (builtImage == null || !builtImage.equals(imageTag)) {
            throw new IllegalStateException("Run the most recently built image");
        }
        if (port < 1 || port > 65535) {
            throw new IllegalArgumentException("Port must be between 1 and 65535");
        }
        if (runningImage != null) {
            throw new IllegalStateException("Stop the running container first");
        }
        runningImage = imageTag;
        System.out.println("Started container: " + imageTag + " on port " + port);
    }
}
