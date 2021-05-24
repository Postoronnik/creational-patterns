package patterns.builder.entry.point;

import patterns.builder.Builder;
import patterns.builder.Director;
import patterns.builder.LaptopBuilder;
import patterns.builder.UltrabookBuilder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new LaptopBuilder();
        Director.buildLaptop_Acer_Aspire_7A715_41G_R7MZ(builder);
        System.out.println(builder.build());

        builder = new UltrabookBuilder();
        Director.buildUltrabook_Apple_MacBook_Air_13(builder);
        System.out.println(builder.build());
    }
}
