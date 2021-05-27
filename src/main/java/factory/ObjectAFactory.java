package factory;

import factory.domain.ObjectA;

public class ObjectAFactory implements Factory<ObjectA> {

    @Override
    public ObjectA createObject() {
        return new ObjectA("Object A data");
    }
}
