package com.github.ususdw.servers;

import com.github.ususdw.meta.DatabaseMeta;

public class DatabaseServer extends GeneralServer {
    private DatabaseMeta meta;

    public DatabaseServer(int clientLimit, String comment, String hostname) {
        super(clientLimit, comment, hostname);
    }

    public DatabaseMeta getMeta() {
        return meta;
    }

    public void setMeta(DatabaseMeta meta) {
        this.meta = meta;
    }
}
