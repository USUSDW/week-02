package com.github.ususdw.io;

import com.github.ususdw.servers.DatabaseServer;
import com.github.ususdw.servers.GeneralServer;
import com.github.ususdw.servers.MailServer;
import com.github.ususdw.servers.WebServer;

import java.util.List;

public class ServerStarter {
    public void startServers(List<GeneralServer> servers) {
        for (var server : servers) {
            if (server instanceof DatabaseServer) {
                var dbServer = (DatabaseServer) server;
                dbServer.connectToDatabase();
                dbServer.testConnection();
                dbServer.startDatabaseService();
            }
            else if (server instanceof MailServer) {
                var mailServer = (MailServer) server;
                mailServer.bindToPort(mailServer.getPort());
                mailServer.acceptSMTPConnections();
            }
            else if (server instanceof WebServer) {
                var webServer = (WebServer) server;
                webServer.checkSiteRoots();
                webServer.bindHostnames();
                webServer.startSites();
            }
        }
    }
}
