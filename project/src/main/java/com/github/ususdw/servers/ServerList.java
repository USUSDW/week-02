package com.github.ususdw.servers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ServerList {
    private List<ServerInfo> servers;

    public ServerList() {
        this.servers = new LinkedList<>();
    }

    public ServerList(ServerInfo... servers) {
        this.servers = Arrays.asList(servers);
    }

    public List<ServerInfo> getServers() {
        return servers;
    }

    public void setServers(List<ServerInfo> servers) {
        this.servers = servers;
    }
}
