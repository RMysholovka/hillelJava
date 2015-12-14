package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by RMysholovka on 14.12.2015.
 */
public class ProductDbDAO implements ProductDAO {
    private Connection connection;

    public ProductDbDAO(Connection connection) {

        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        String connectionString = "jdbc:postgresql://localhost:5432/postgres";
        try {

            connection = DriverManager.getConnection(connectionString, "postgres", "postgres");

            this.connection = connection;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public Optional<Product> findById(int id) {
        try {
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
        } catch (Exception e) {
            throw new RuntimeException(e);

        } finally {
            //close result set :)
        }
    }


    @Override
    public List<Product> findAll() {
        try {
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

        } catch (SQLException e) {
            throw new RuntimeException(e);


        }
    }


    @Override
    public void deleteById(int id) {
        try {
            String sql = "DELETE FROM store WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Product product) {
        try {

            String sql = "UPDATE store SET name = ?, category = ?, price = ?,  WHERE id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getCategory());
            preparedStatement.setInt(3, product.getPrice());
            preparedStatement.setInt(4, product.getId());

            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void create(Product product) {
        try {
            String sql = "INSERT INTO store (id, name, category, price) VALUES (?,?.?.?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, product.getId());
            statement.setString(2, product.getName());
            statement.setString(3, product.getCategory());
            statement.setInt(4, product.getPrice());

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}