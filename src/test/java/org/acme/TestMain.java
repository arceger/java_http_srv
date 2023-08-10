package org.acme;

import java.io.FileReader;
import java.util.Properties;

public class TestMain {
     public static void main(String[] args) throws Exception
    {
        // create a reader object on the properties file
        FileReader reader = new FileReader(".env");
  
        // create properties object
        Properties p = new Properties();
  
        // Add a wrapper around reader object
        p.load(reader);
  
        // access properties data
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
    }
 

    
}
