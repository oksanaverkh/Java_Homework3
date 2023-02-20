import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Goods2 {
    private String name;
    private String country;
    private Double weight;
    private Integer price;
    private Integer grade;
}
