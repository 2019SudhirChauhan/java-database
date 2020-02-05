package MyDbProject.java_database;

import MyDbProject.Helper.databaseInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        databaseInfo db = new databaseInfo();
        
        System.out.println("URL : " + db.getURL());
        System.out.println("Username : " + db.getUsername());
        System.out.println("Password :"+ db.getPass());
    }
}
