package abstract_factory.factories;

import abstract_factory.domain.candies.Candie;
import abstract_factory.domain.chocolate.Chocolate;

public interface SweetsFactory {
    Chocolate createChocolate();
    Candie createCandie();
}
