package study.java.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Person person = new Person("Frozz");
        Gson gson = new Gson();

        String data = gson.toJson(person);
        System.out.println(data);
    }
}
