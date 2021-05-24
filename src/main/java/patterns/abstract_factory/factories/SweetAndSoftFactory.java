package patterns.abstract_factory.factories;

import patterns.abstract_factory.domain.candies.Candie;
import patterns.abstract_factory.domain.candies.SweetCandie;
import patterns.abstract_factory.domain.chocolate.Chocolate;
import patterns.abstract_factory.domain.chocolate.MilkChocolate;

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
