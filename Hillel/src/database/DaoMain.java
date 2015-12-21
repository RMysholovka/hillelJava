package database;

/**
 * Created by RMysholovka on 14.12.2015.
 */
public class DaoMain {

    public static void main(String[] args) {
        String daoType = args[0];

        ProductDAO productDAO;

        productDAO = ProductDaoFactory.createDao(daoType);


        System.out.println(productDAO.findAll());

        productDAO.create(new Product(5, "Mouse", "Computers", 10));

        System.out.println(productDAO.findById(4));

        // productDAO.deleteById(4);


    }


}

