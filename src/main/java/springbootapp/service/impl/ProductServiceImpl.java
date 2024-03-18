package springbootapp.service.impl;

import org.springframework.stereotype.Service;
import springbootapp.enity.Product;
import springbootapp.repository.ProductRepository;
import springbootapp.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    //Constructor based injection
    //Autowire annotation is not needed as there is only one constructor
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
