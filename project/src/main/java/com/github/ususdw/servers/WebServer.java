package com.github.ususdw.servers;

import com.github.ususdw.meta.WebServerMeta;

public class WebServer extends GeneralServer{
    private WebServerMeta meta;

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
}
