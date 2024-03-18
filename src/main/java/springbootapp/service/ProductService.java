package springbootapp.service;

import springbootapp.enity.Product;
import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
