package com.github.ususdw.servers;

import com.github.ususdw.meta.MailServerMeta;

public class MailServer extends GeneralServer {
    private MailServerMeta meta;
    private boolean bound;
    private boolean accepting;

    public MailServer(int clientLimit, String comment, String hostname) {
        super(clientLimit, comment, hostname);
    }

    public MailServerMeta getMeta() {
        return meta;
    }

    public void setMeta(MailServerMeta meta) {
        this.meta = meta;
    }

    public void bindToPort(int port) {
        this.bound = true;
        System.out.println("[INFO] Mail server is bound to port " + port + ".");
    }

    public void acceptSMTPConnections() {
        if (!this.bound) {
            System.err.println("[ERR]  Trying to accept connections on an unbound mail server.");
            return;
        }
        System.out.println("[INFO] Mail server is accepting connections.");
        this.accepting = true;
    }

    public void sendMail(String to, String from, String mail) {
        if (!this.accepting) {
            System.err.println("[CRIT] Attempting to send mail on a non-accepting server. Exiting.");
            throw new RuntimeException("Attempted to send mail on a non-accepting server.");
        }
    }
}
