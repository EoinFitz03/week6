package ie.atu;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @NotBlank(message = "id cannot be blank")
    private String id;

    @Min(value = 0, message = "price must be above 0 ")
    private double price;

    @NotBlank(message = "name cannot be blank")
    private String name;
}
