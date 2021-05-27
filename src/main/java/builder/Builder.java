package builder;

import java.util.Map;

public interface Builder<T> {

    void addName(String name);
    void addCompany(String company);
    void addVersion(String version);
    void addPorts(Map<String,Integer> ports);
    void addProcessor(String processor);
    void addCooling(boolean cooling);
    T build();
}
