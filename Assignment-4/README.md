# Assignment 4 — Facade: CI/CD Deployment

A Java simulation of a CI/CD deployment pipeline using the Facade pattern.
Operations use in-memory state instead of real Git, Maven, database, or Docker commands.

## Structure

- `Main` uses only `DeploymentFacade`.
- `DeploymentFacade` exposes `deployRelease(repoUrl, branch, port)` and coordinates the pipeline.
- `GitClient` stores the repository and checks branch selection.
- `MavenBuildRunner` tracks tested source and requires it before packaging an artifact.
- `DatabaseMigrator` tracks connection state and schema versions; `DockerEngine` tracks the latest built image and the running container.

Subsystems do not reference the facade and can also be used directly.

## Deployment Flow

```text
Fetch repository → Checkout branch → Run tests → Package artifact → Build image
→ Verify database connection → Apply migration → Stop old container → Run new container
```

The facade passes source information, the artifact path, and the image tag between
subsystems. It returns `true` on success or `false` when a handled error occurs.
Completed operations are not automatically reversed.

## Clean Code Principles

1. **Meaningful names:** methods such as `deployRelease` and `packageArtifact` describe their purpose.
2. **Single responsibility:** the facade coordinates; each subsystem handles its own part of deployment.
3. **Encapsulation:** private fields hide subsystem state, and the facade API hides artifact paths and image tags.
4. **Small methods:** methods perform focused operations and keep state checks inside the responsible subsystem.
5. **Error handling:** subsystems reject blank input or incorrect operation order with descriptive exceptions; the facade catches these errors and returns `false`.
