package collectionsamples;

import java.io.FileWriter;
import java.util.Properties;

public class NewPropertiesFileCreation {
    public static void main(String[] args)throws Exception{

        Properties p=new Properties();
        p.setProperty("name","Suman Jaiswal");
        p.setProperty("email","sumanjaiswal@javatpoint.com");

        p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");

    }
}
