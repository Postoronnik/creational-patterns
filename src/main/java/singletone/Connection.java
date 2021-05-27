package singletone;

import lombok.Getter;

@Getter
public class Connection {

    private static Connection instance;

    private String someData;

    private Connection(String someData){
        this.someData = someData;
    }

    public static Connection getInstance(String someData){
        if(instance == null){
            instance = new Connection(someData);
        }
        return instance;
    }
}
