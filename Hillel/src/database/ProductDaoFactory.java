package database;

/**
 * Created by RMysholovka on 21.12.2015.
 */
public class ProductDaoFactory {

    public static ProductDAO createDao(String daoType) {
        ProductDAO productDAO;

        switch (daoType) {
            case "db":
                productDAO = new ProductDbDAO();
                break;
            case "memory":
                productDAO = new ProductMemoryDAO();
                break;
            case "xml":
                productDAO = new ProductXmlDAO();
                break;
            default:
                System.out.println("expectd: db, memory, xml, but found" + daoType);
                productDAO = new ProductMemoryDAO();
        }
        return productDAO;
    }
}
