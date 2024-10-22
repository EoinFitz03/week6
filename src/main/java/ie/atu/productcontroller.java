package ie.atu;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class productcontroller {
    private ProductService myService;

    public productcontroller(ProductService myService) {
        this.myService = myService;
    }

    private List<Product> list = new ArrayList();

    @PostMapping
    public List<Product> newProduct(@RequestBody Product product)
    {
        //send it to business logic
       list =  myService.addProduct(product);
        return list;
    }
}
