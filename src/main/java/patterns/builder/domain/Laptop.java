package patterns.builder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop{
    private String name;
    private String company;
    private String version;
    private Map<String,Integer> ports;// Key - port name, Value - amount of this port type
    private String processor;
    private boolean cooling;

    @Override
    public String toString(){
        String string = "Notebook:\n" +
                "Name: " + name + "\n" +
                "Company: " + company + "\n" +
                "Version: " + version + "\n" +
                "Ports: \n";
        for (Map.Entry<String, Integer> entry : ports.entrySet()) {
            string += "    Type: " + entry.getKey() + "\n" +
                    "    Amount: " + entry.getValue() + "\n";
        }

        string += "Processor: " + name + "\n" +
                "Cooling: " + (cooling ? "Active" : "Passive") + "\n";

        return string;
    }
}
