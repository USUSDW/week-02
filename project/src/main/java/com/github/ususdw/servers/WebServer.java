package com.github.ususdw.servers;

import com.github.ususdw.meta.WebServerMeta;

public class WebServer extends GeneralServer{
    private WebServerMeta meta;
    private boolean checked;
    private boolean hostnames;
    private boolean started;

    public WebServer() {}

    public WebServer(int clientLimit, String comment, String hostname, WebServerMeta meta) {
        super(clientLimit, comment, hostname);
        this.meta = meta;
    }

    public WebServerMeta getMeta() {
        return meta;
    }

    public void setMeta(WebServerMeta meta) {
        this.meta = meta;
    }

    public void checkSiteRoots() {
        this.checked = true;
        System.out.println("[INFO] Site roots checked and verified.");
    }

    public void bindHostnames() {
        if(!this.checked) {
            System.err.println("[WARN] Binding hostnames on unchecked site roots.");
            return;
        }
        System.out.println("[INFO] Binding hostnames to site roots.");
        this.hostnames = true;
    }

    public void startSites() {
        if(!this.checked) {
            System.err.println("[WARN] Starting server without binding hostnames.");
            return;
        }
        System.out.println("[INFO] Starting web server.");
        this.started = true;
    }

    public void handleRequest(String hostname, String page) {
        if(!this.started) {
            System.err.println("[CRIT] Trying to handle request on non-started server.");
            throw new RuntimeException("Trying to handle request on non-started server.");
        }
        if(!this.hostnames) {
            System.err.println("[CRIT] Trying to handle request on " + hostname + " but was not bound.");
            throw new RuntimeException("Trying to handle request on " + hostname + " but was not bound.");
        }
        System.out.println("[INFO] Handling request on " + hostname + " for page " + page + ".");
    }
}
