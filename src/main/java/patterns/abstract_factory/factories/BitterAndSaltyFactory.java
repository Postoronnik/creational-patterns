package patterns.abstract_factory.factories;

import patterns.abstract_factory.domain.candies.Candie;
import patterns.abstract_factory.domain.candies.SaltyCandy;
import patterns.abstract_factory.domain.chocolate.Chocolate;
import patterns.abstract_factory.domain.chocolate.DarkChocolate;

public class BitterAndSaltyFactory implements SweetsFactory{
    @Override
    public Chocolate createChocolate() {
        return new DarkChocolate("Buh",80);
    }

    @Override
    public Candie createCandie() {
        return new SaltyCandy("Grij",15);
    }
}
