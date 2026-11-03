package th.ac.utc.product.service;

import java.util.List;
import java.util.Optional;
import th.ac.utc.product.model.Product;

///
public interface ProductService {
    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);
}
