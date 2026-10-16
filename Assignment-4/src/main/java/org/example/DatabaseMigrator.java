package org.example;

public class DatabaseMigrator {
    private boolean connected;
    private int schemaVersion;

    public void verifyConnection() {
        connected = true;
        System.out.println("Database connection verified");
    }

    public void applyMigration() {
        if (!connected) {
            throw new IllegalStateException("Verify database connection before migration");
        }
        schemaVersion++;
        System.out.println("Database migrated to version: " + schemaVersion);
    }
}
