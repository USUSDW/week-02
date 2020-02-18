package com.github.ususdw.meta;

import java.util.LinkedList;
import java.util.List;

public class WebServerMeta {
    private List<WebServerSite> sites;

    public WebServerMeta() {
        this.sites = new LinkedList<>();
    }

    public WebServerMeta(List<WebServerSite> sites) {
        this.sites = sites;
    }

    public List<WebServerSite> getSites() {
        return sites;
    }

    public void setSites(List<WebServerSite> sites) {
        this.sites = sites;
    }
}
