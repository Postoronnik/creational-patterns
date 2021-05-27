package abstract_factory.domain.candies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SweetCandie implements Candie{
    private String name;
    private int sugarPercentage;
}
