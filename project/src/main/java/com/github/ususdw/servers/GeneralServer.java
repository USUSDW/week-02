package com.github.ususdw.servers;

public class GeneralServer {
    private int clientLimit;
    private String comment;
    private String hostname;
    private int port;

    public GeneralServer() {}

    public GeneralServer(int clientLimit, String comment, String hostname) {
        this.clientLimit = clientLimit;
        this.comment = comment;
        this.hostname = hostname;
    }

    public int getClientLimit() {
        return clientLimit;
    }

    public void setClientLimit(int clientLimit) {
        this.clientLimit = clientLimit;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }
}
