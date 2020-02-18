package com.github.ususdw.meta;

import java.util.LinkedList;
import java.util.List;

public class WebServerMeta {
    private List<String> sites;

    public WebServerMeta() {
        this.sites = new LinkedList<>();
    }

    public WebServerMeta(List<String> sites) {
        this.sites = sites;
    }

    public List<String> getSites() {
        return sites;
    }

    public void setSites(List<String> sites) {
        this.sites = sites;
    }
}
