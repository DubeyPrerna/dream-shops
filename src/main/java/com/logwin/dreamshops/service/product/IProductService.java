package com.logwin.dreamshops.service.product;

import com.logwin.dreamshops.model.Product;
import java.util.List;

public interface IProductService {

    Product addProduct(Product product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product,Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category,String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category,String name);
    Long  countProductsByBrandAndName(String name,String brand);

}
