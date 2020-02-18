package com.github.ususdw.io;

import com.github.ususdw.servers.*;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ServerLoader {
    private static final Gson gson = new Gson();

    public GeneralServer load(ServerInfo info) {
        try {
            if(info.getType().equalsIgnoreCase("database")) {
                return gson.fromJson(new FileReader(info.getConfig()), DatabaseServer.class);
            }
            if(info.getType().equalsIgnoreCase("mail")) {
                return gson.fromJson(new FileReader(info.getConfig()), MailServer.class);
            }
            if(info.getType().equalsIgnoreCase("web")) {
                return gson.fromJson(new FileReader(info.getConfig()), WebServer.class);
            }
            return gson.fromJson(new FileReader(info.getConfig()), GeneralServer.class);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find config file " + info.getConfig().getPath());
            return null;
        }
    }
}
