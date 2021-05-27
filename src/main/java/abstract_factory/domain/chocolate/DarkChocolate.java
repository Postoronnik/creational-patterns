package abstract_factory.domain.chocolate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DarkChocolate implements Chocolate {
    private String name;
    private int cacaoPercent;
}
