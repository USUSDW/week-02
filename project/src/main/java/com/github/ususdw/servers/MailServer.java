package com.github.ususdw.servers;

import com.github.ususdw.meta.MailServerMeta;

public class MailServer extends GeneralServer {
    private MailServerMeta meta;

    public MailServer(int clientLimit, String comment, String hostname) {
        super(clientLimit, comment, hostname);
    }

    public MailServerMeta getMeta() {
        return meta;
    }

    public void setMeta(MailServerMeta meta) {
        this.meta = meta;
    }
}
