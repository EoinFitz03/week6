package ie.atu;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product){

        myList.add(product);
        return myList;
    }

    public List<Product> updateProduct(String id, Product uProduct) {
        // Use a simple for loop to find and update the product
        for (Product product : myList) {
            if (product.getId().equals(id)) {
                // Remove the old product (should use iterator for safe removal)
                myList.remove(product);
            }
        }

        // Add the updated product (or if not found, just add it)
        myList.add(uProduct);
        return myList;
    }

    public List<Product> deleteProduct(String id) {
        for(Product p : myList){
            if(p.getId().equals(id)){
                myList.remove(p);
            }
        }
        return myList;

    }


}
