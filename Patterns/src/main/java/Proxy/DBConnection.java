package Proxy;

import Singleton.Logger;

public class DBConnection implements Connection {
    private static final Logger log = Logger.getInstance();
    private String url;

    public DBConnection(String dbName) {
        this.url = dbName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void connect() {
        log.classLogg(this, "url is " + url);
    }
}
