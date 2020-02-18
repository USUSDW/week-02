package com.github.ususdw;

import com.github.ususdw.io.ServerInfoLoader;
import com.github.ususdw.io.ServerLoader;
import com.github.ususdw.servers.GeneralServer;
import com.github.ususdw.servers.ServerInfo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServerInfoLoader loader = new ServerInfoLoader();
        ServerLoader serverLoader = new ServerLoader();
        List<ServerInfo> servers = null;
        List<GeneralServer> serverList = new ArrayList<>();
        try {
            servers = loader.loadServers();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        for (var serverInfo : servers) {
            var server = serverLoader.load(serverInfo);
            if(server != null) {
                serverList.add(server);
            }
        }
        for (var server : serverList) {
            server.start();
        }
    }
}
