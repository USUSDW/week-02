package com.github.ususdw;

import com.github.ususdw.io.ServerInfoLoader;
import com.github.ususdw.io.ServerLoader;
import com.github.ususdw.io.ServerStarter;
import com.github.ususdw.servers.ServerInfo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServerInfoLoader loader = new ServerInfoLoader();
        ServerLoader serverLoader = new ServerLoader();
        ServerStarter starter = new ServerStarter();
        List<ServerInfo> servers = loader.loadServers();
        var serverList = serverLoader.loadServers(servers);
        starter.startServers(serverList);
    }
}
