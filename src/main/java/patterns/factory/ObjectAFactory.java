package patterns.factory;

import patterns.factory.domain.ObjectA;

public class ObjectAFactory implements Factory<ObjectA> {

    @Override
    public ObjectA createObject() {
        return new ObjectA("Object A data");
    }
}
