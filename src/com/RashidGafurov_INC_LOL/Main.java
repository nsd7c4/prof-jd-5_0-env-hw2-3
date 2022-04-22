package com.RashidGafurov_INC_LOL;

import java.util.*;


public class Main {
    public static int random100() {
        Random ran = new Random();
        int nxt = ran.nextInt(100);
        return nxt;
    }

    public static void compareTo(Hogwarts s1, Hogwarts s2) {
        StringBuilder temp = new StringBuilder();
        if (s1.sumOfAttributes() > s2.sumOfAttributes()) {
            temp.append(s1.getFullName() + " is better " + s1.getSchoolName() + " student, then " + s2.getFullName());
        } else {
            temp.append(s2.getFullName() + " is better " + s1.getSchoolName() + " student, then " + s1.getFullName());
        }

        if (s1.getClass() != s2.getClass()){
            temp.replace(0,temp.length(),"Different houses... Dose not compute)");
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        //Gryffindor - Harry Potter, Hermione Granger and Ron Weasley
        //nobility, honor and courage.

        //Slytherin.- Draco Malfoy, Graham Montagu, Gregory Goyle
        //cunning, determination, ambition, resourcefulness and a thirst for power.

        //Hufflepuff - Zachariah Smith, Cedric Diggory, Justin Finch-Fletchley.
        //hardworking, loyal, honest.

        //Ravenclaw - Zhou Chang, Padma Patil and Marcus Belby.
        //smart, wise, witty, and full of creativity.

        //all Hogwards power = 0..100, transDis = 0..100

        Hogwarts[] students = new Hogwarts[]{
                new Ravenclaw("Zhou Chang", random100(), random100(), random100(), random100(), random100(), random100()),
                new Ravenclaw("Padma Patil", random100(), random100(), random100(), random100(), random100(), random100()),
                new Ravenclaw("Marcus Belby", random100(), random100(), random100(), random100(), random100(), random100()),
                new Hufflepuff("Zachariah Smith", random100(), random100(), random100(), random100(), random100()),
                new Hufflepuff("Cedric Diggory", random100(), random100(), random100(), random100(), random100()),
                new Hufflepuff("Justin Finch-Fletchley", random100(), random100(), random100(), random100(), random100()),
                new Slytherin("Draco Malfoy", random100(), random100(), random100(), random100(), random100(), random100(), random100()),
                new Slytherin("Graham Montagu", random100(), random100(), random100(), random100(), random100(), random100(), random100()),
                new Slytherin("Gregory Goyle", random100(), random100(), random100(), random100(), random100(), random100(), random100()),
                new Gryffindor("Harry Potter", random100(), random100(), random100(), random100(), random100()),
                new Gryffindor("Hermione Granger", random100(), random100(), random100(), random100(), random100()),
                new Gryffindor("Gregory Goyle", random100(), random100(), random100(), random100(), random100()),
        };
        for (Hogwarts student : students) {
            System.out.println(student);
        }

        System.out.println();

        compareTo(students[4], students[3]);
        compareTo(students[0], students[1]);
        compareTo(students[4], students[9]);

        students[5].compareTo(students[7]);

    }
}
