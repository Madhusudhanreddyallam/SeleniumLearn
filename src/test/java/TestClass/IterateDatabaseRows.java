package TestClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IterateDatabaseRows {
    public static void main(String[] args) {
        // Set up JDBC connection parameters
        String jdbcUrl = "jdbc:mysql://your_database_url:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        // JDBC connection and query
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM your_table");

            // Iterate over the ResultSet
            while (resultSet.next()) {
                // Retrieve values from each column
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                // Process the retrieved values as needed
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Close JDBC resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
