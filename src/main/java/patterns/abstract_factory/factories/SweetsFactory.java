package patterns.abstract_factory.factories;

import patterns.abstract_factory.domain.candies.Candie;
import patterns.abstract_factory.domain.chocolate.Chocolate;

public interface SweetsFactory {
    Chocolate createChocolate();
    Candie createCandie();
}
