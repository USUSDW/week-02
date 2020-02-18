package com.github.ususdw.io;

import com.github.ususdw.servers.ServerInfo;
import com.github.ususdw.servers.ServerList;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ServerInfoLoader {
    private final Yaml yaml = new Yaml(new Constructor(ServerList.class));

    public List<ServerInfo> loadServers() throws FileNotFoundException {
        ServerList servers = yaml.load(new FileReader(new File("config/settings.yml")));
        return servers.getServers();
    }
}
