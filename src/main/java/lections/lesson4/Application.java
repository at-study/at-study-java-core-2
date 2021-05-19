package lections.lesson4;

public class Application {

    public static void main(String[] args) {
        SqlConnection.getInstance().executeQuery("SELECT * FROM users");
        SqlConnection.getInstance().executeQuery("SELECT * FROM tokens");
        SqlConnection.getInstance().executeQuery("SELECT * FROM secrets");
        SqlConnection.getInstance().disconnect();
        SqlConnection.getInstance().executeQuery("SELECT * FROM secrets");
    }
}
