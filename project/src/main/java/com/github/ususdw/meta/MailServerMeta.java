package com.github.ususdw.meta;

public class MailServerMeta {
    private String addressRegex;

    public MailServerMeta() {}

    public MailServerMeta(String addressRegex) {
        this.addressRegex = addressRegex;
    }

    public String getAddressRegex() {
        return addressRegex;
    }

    public void setAddressRegex(String addressRegex) {
        this.addressRegex = addressRegex;
    }
}
