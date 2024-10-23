package ie.atu;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping
    public List<Product> getProducts()
    {
        return list;
    }

    @PostMapping
    public List<Product> newProduct(@RequestBody @Valid Product product)
    {
        //send it to business logic
       list =  myService.addProduct(product);
        return list;
    }

    @Autowired
    private ProductService productService;

    @PutMapping("/{id}")
    public ResponseEntity<List<Product>> updateProduct(@PathVariable String id, @RequestBody Product uProduct) {
        List<Product> updatedList = productService.updateProduct(id, uProduct);
        return ResponseEntity.ok(updatedList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Product>> deleteProduct(@PathVariable String id) {
        List<Product> updatedList = productService.deleteProduct(id);
        return ResponseEntity.ok(updatedList);
    }


}
