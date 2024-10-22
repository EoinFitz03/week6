package ie.atu;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product){
        // Do business stuff like retriving details from db, or generating files pdf
        myList.add(product);
        return myList;
    }
}
