import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private String name;
    private int price;
    private Category category;
    private boolean delivery;
    private List<Shop> shops;
    private Producer producer;

}
