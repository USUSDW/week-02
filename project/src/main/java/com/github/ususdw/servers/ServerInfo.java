package com.github.ususdw.servers;

import java.io.File;

public class ServerInfo {
    private String type;
    private int port;
    private File config;
    private File runScript;

    public ServerInfo(){}

    public ServerInfo(String type, String configPath, int port, String runScriptPath) {
        this.type = type;
        this.port = port;
        this.config = new File(configPath);
        this.runScript = new File(runScriptPath);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ServerInfo{" +
                "type='" + type + '\'' +
                ", port=" + port +
                ", config=" + config +
                ", runScript=" + runScript +
                '}';
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public File getConfig() {
        return config;
    }

    public void setConfig(File config) {
        this.config = config;
    }

    public File getRunScript() {
        return runScript;
    }

    public void setRunScript(File runScript) {
        this.runScript = runScript;
    }
}
