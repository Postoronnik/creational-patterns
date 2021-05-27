package abstract_factory.factories;

import abstract_factory.domain.candies.Candie;
import abstract_factory.domain.chocolate.Chocolate;
import abstract_factory.domain.candies.SweetCandie;
import abstract_factory.domain.chocolate.MilkChocolate;

public class SweetAndSoftFactory implements SweetsFactory{

    @Override
    public Chocolate createChocolate() {
        return new MilkChocolate("Yumie",40);
    }

    @Override
    public Candie createCandie() {
        return new SweetCandie("Silk",15);
    }
}
