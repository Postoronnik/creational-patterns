package patterns.builder;

import java.util.HashMap;
import java.util.Map;

public class Director {

    public static void  buildLaptop_Acer_Aspire_7A715_41G_R7MZ(Builder builder){
        builder.addName("Aspire 7 A715-41G-R7MZ");
        builder.addCompany("Acer");
        builder.addVersion("NH.Q8LEU.004");

        Map<String,Integer> ports = new HashMap<>();
        ports.put("USB Type-C",1);
        ports.put("USB 3.0",2);
        ports.put("USB 2.0",1);
        ports.put("HDMI",1);
        ports.put("LAN",1);
        ports.put("Audio/Microphone",1);

        builder.addPorts(ports);
        builder.addProcessor("Чотириядерний AMD Ryzen 5 3550H (2.1 — 3.7 ГГц)");
        builder.addCooling(true);
    }

    public static void buildUltrabook_Apple_MacBook_Air_13(Builder builder){
        builder.addName("MacBook Air 13\" M1 256GB 2020");
        builder.addCompany("Apple");
        builder.addVersion("MGN93");

        Map<String,Integer> ports = new HashMap<>();
        ports.put("USB Type-C",2);
        ports.put("Audio/Microphone",1);

        builder.addPorts(ports);
        builder.addProcessor("Восьмиядерний Apple M1");
        builder.addCooling(false);
    }
}
