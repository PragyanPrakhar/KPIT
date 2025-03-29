package com.example;

import com.example.dao.ProductDAO;
import com.example.models.Product;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();

        // Save Products
        productDAO.saveProduct("Laptop", "Electronics");
        productDAO.saveProduct("Mobile", "Electronics");
        productDAO.saveProduct("Jeans", "Clothing");

        // Fetch Products by Category
        List<Product> electronics = productDAO.getProductsByCategory("Electronics");
        System.out.println("Electronics Category Products:");
        for (Product p : electronics) {
            System.out.println(p.getName());
        }
    }
}
