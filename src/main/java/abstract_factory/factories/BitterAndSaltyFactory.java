package abstract_factory.factories;

import abstract_factory.domain.candies.Candie;
import abstract_factory.domain.chocolate.Chocolate;
import abstract_factory.domain.candies.SaltyCandy;
import abstract_factory.domain.chocolate.DarkChocolate;

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
