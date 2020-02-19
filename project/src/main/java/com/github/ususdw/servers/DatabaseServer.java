package com.github.ususdw.servers;

import com.github.ususdw.meta.DatabaseMeta;

public class DatabaseServer extends GeneralServer {
    private DatabaseMeta meta;
    private boolean connected;
    private boolean connectionTested;
    private boolean started;

    public DatabaseServer(int clientLimit, String comment, String hostname) {
        super(clientLimit, comment, hostname);
    }

    public DatabaseMeta getMeta() {
        return meta;
    }

    public void setMeta(DatabaseMeta meta) {
        this.meta = meta;
    }

    public void connectToDatabase() {
        System.out.println("[INFO] Connected to database.");
        this.connected = true;
    }

    public void testConnection() {
        if (!this.connected) {
            System.err.println("[ERR]  Testing connection failed.");
            return;
        }
        System.out.println("[INFO] Testing database connection succeeded.");
        this.connectionTested = true;
    }

    public void startDatabaseService() {
        if(!this.connected) {
            System.err.println("[CRIT] Failed to start service: database not connected.");
            throw new RuntimeException("Failed to start service: database not connected.");
        }
        if(!this.connectionTested) {
            System.err.println("[WARN] Starting untested database service.");
        }
        System.out.println("[INFO] Starting database server on port " + this.getPort() + ".");
        this.started = true;
    }

    public String executeQuery(String query) {
        if(!this.connected) {
            System.err.println("[CRIT] Failed to execute query: database not connected. Quitting.");
            throw new RuntimeException("Failed to execute query: database not connected.");
        }
        if(!this.started) {
            System.err.println("[CRIT] Failed to execute query: database service not running. Quitting...");
            throw new RuntimeException("Failed to execute query: database service not running.");
        }
        System.out.println("Query successful!");
        return "1";
    }
}
