package object1;

import java.util.logging.Logger;

public class Main {
    //global variables are set here
    public static void main(String... args) {

        Person[] people = new Person[3];
        Person person0 = new Person("John Chen", 26, 149.86);
        Person person1 = new Person("Jia Lee", 26,170);
        Person person2 = new Person("David", 42, 180);
        people[0] = person0;
        people[1] = person1;
        people[2] = person2;
        for(int i = 0; i < people.length;i++){
            //people[i].getName();
            System.out.println(people[i].getName());
        }

        //System.out.println(person0.getName());
        //System.out.println(person1.getName());


        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        logger.info(person0.getHeight() + "");
        System.out.println(person1.getHeight());
        System.out.println(person2.getHeight());
    } // brb
}
