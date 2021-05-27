package singletone.entry.point;

import singletone.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection1 = Connection.getInstance("Some data 1");
        Connection connection2 = Connection.getInstance("Some data 2");
        System.out.println("Data of connection 1" + connection1.getSomeData());
        System.out.println("Data of connection 2" + connection2.getSomeData());
        System.out.println("Is connection equal?" + connection1.equals(connection2));
    }
}
