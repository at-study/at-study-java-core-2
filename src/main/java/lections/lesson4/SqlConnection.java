package lections.lesson4;

public class SqlConnection {

    private static SqlConnection instance;

    private boolean isConnected = false;

    public static SqlConnection getInstance() {
        if (instance == null) {
            instance = new SqlConnection();
            instance.connect();
        }
        return instance;
    }

    private SqlConnection() {

    }

    private void connect() {
        System.out.println("Подключились к БД");
        isConnected = true;
    }

    public void disconnect() {
        System.out.println("Отключились от БД");
        isConnected = false;
    }

    public void executeQuery(String query) {
        if (!isConnected) {
            connect();
        }
        System.out.println("Выполнен запрос к БД: " + query);
    }


}
