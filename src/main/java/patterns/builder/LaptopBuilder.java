package patterns.builder;


import patterns.builder.domain.Laptop;

import java.util.Map;

public class LaptopBuilder extends Laptop implements Builder<Laptop>{

    @Override
    public void addName(String name) {
        this.setName(name);
    }

    @Override
    public void addCompany(String company) {
        this.setCompany(company);
    }

    @Override
    public void addVersion(String version) {
        this.setVersion(version);
    }

    @Override
    public void addPorts(Map<String, Integer> ports) {
        this.setPorts(ports);
    }

    @Override
    public void addProcessor(String processor) {
        this.setProcessor(processor);
    }

    @Override
    public void addCooling(boolean cooling) {
        this.setCooling(cooling);
    }

    @Override
    public Laptop build() {
        return this;
    }
}
