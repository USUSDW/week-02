package com.github.ususdw.meta;

public class WebServerSite {
    private String hostname;
    private String root;

    public WebServerSite(String hostname, String root) {
        this.hostname = hostname;
        this.root = root;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "WebServerSite{" +
                "hostname='" + hostname + '\'' +
                ", root='" + root + '\'' +
                '}';
    }
}
