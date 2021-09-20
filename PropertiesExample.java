package collectionsamples;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args)throws Exception{
        FileReader reader=new FileReader("db.properties");

        Properties p=new Properties();
        p.load(reader);

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
    }
}
