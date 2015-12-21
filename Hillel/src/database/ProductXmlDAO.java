package database;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * Created by RMysholovka on 21.12.2015.
 */
public class ProductXmlDAO implements ProductDAO {
    public static final String PRODUCTS_XML_PATH = "d:/products.xml";
    private List<Product> products;

    public ProductXmlDAO() {

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PRODUCTS_XML_PATH)));
            products = (List<Product>) decoder.readObject();
            decoder.close();
        } catch (FileNotFoundException e) {
            products = new ArrayList<>();
            products.add(new Product(1, "Mouse", "Computers", 10));
            products.add(new Product(2, "Mouse", "Computers", 15));
        }
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    XMLEncoder encoder = new XMLEncoder(new FileOutputStream(PRODUCTS_XML_PATH));
                    encoder.writeObject(products);
                    encoder.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }));
    }


    @Override
    public Optional<Product> findById(int id) {
        Optional<Product> result = Optional.empty();
        /*for(Product product : products){
            if (product.getId() == id){
                return Optional.of(product);
            }
        }
        return Optional.empty();*/
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void deleteById(int id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }

    @Override
    public void update(Product product) {
        deleteById(product.getId());
        create(product);
    }

    @Override
    public void create(Product product) {

    }
}


