package proxy;

public class DBConnectionProxy implements Connection{
    private final DBConnection connection;

    public DBConnectionProxy(DBConnection connection, String address) {
        this.connection = connection;
        this.connection.setUrl(address + "/" + connection.getUrl());
    }

    @Override
    public void connect() {
        connection.connect();
    }
}
