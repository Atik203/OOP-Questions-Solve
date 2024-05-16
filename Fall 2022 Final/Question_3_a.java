import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Person{
    int id,age;
    String country;
    Person(int id, int age, String country){
        this.id = id;
        this.age = age;
        this.country = country;
    }
}

public class Question_3_a {


    public  static  Person  maxAge(ArrayList<Person> persons){
        int max = Integer.MIN_VALUE;
        Person maxPerson = null;
        for(Person p: persons){
            if(p.age>max){
                max = p.age;
                maxPerson = p;
            }
        }
        return  maxPerson;

    }

    public static void main(String[] args) throws IOException {


        FileReader r = new FileReader("person.txt");

        Scanner sc = new Scanner(r);

        ArrayList<Person> persons = new ArrayList<Person>();

        while(sc.hasNextLine())
        {
            String[] data = sc.nextLine().split("/");
            Person p = new Person(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2]);
            persons.add(p);
        }

        Person  mxPerson = maxAge(persons);

        System.out.println("Max Person : "+mxPerson.id+" "+mxPerson.age+" "+mxPerson.country);

}
}
