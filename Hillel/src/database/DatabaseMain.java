package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by RMysholovka on 10.12.2015.
 */
public class DatabaseMain {
    public static void main(String[] args) throws SQLException {


        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        String connectionString = "jdbc:postgresql://localhost:5432/postgres";


        Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres");


        // notCorrectUpdate(connection);


        //correctUpdate(connection);

        //create(connection, new Product(1, "Table", "Furniture", 100));

        deleteById(connection, 3);

        Optional<Product> possibleProduct = findById(connection, 1);

        if (possibleProduct.isPresent()) {
            System.out.println("product in optional:" + possibleProduct.get());
        }

        System.out.println(findAll(connection));
        connection.close();
    }

    private static void deleteById(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM store WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        statement.close();

    }

    private static void create(Connection connection, Product product) throws SQLException {
        String sql = "INSERT INTO store (id, name, category, price) VALUES (?,?.?.?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, product.getId());
        statement.setString(2, product.getName());
        statement.setString(3, product.getCategory());
        statement.setInt(4, product.getPrice());

        statement.executeUpdate();
        statement.close();

    }

    private static void correctUpdate(Connection connection) throws SQLException {
        String sql = "UPDATE store SET name = ? WHERE id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Keyboard'--");
        preparedStatement.setInt(2, 1);
        preparedStatement.executeUpdate();
        preparedStatement.close();

        findAll(connection);
        connection.close();
    }

    private static void notCorrectUpdate(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String newName = "Keyboard";
        int id = 1;

        String sql = "UPDATE store SET name = '" + newName + "' WHERE id = " + id;

        int rowsUpdated = statement.executeUpdate(sql);
        System.out.println("Rows updated: " + rowsUpdated);
    }

    private static List<Product> findAll(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "SELECT id AS item_id, name, category, price FROM store";

        ResultSet resultSet = statement.executeQuery(sql);
        List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("item_id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");

            Product product = new Product(id, name, category, price);

            products.add(product);
        }

        resultSet.close();
        return products;
    }

    private static Optional<Product> findById(Connection connection, int id) throws SQLException {

        String sql = "SELECT name, category, price FROM store WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);


        ResultSet resultSet = statement.executeQuery();
        Optional<Product> product = Optional.empty();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");

            product = Optional.of(new Product(id, name, category, price));


        }

        resultSet.close();
        return product;
    }
}
