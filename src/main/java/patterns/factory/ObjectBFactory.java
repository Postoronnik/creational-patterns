package patterns.factory;

import patterns.factory.domain.ObjectB;

public class ObjectBFactory implements Factory<ObjectB>{

    @Override
    public ObjectB createObject() {
        return new ObjectB("Object B data");
    }
}
