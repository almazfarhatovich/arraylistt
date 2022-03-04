package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> arrayList = new ArrayList<>(List.of(new Student("Almaz", 20, "Java"),
                new Student("Mukhammad", 24, "Java"),
                new Student("Fariza", 21, "JS"),
                new Student("Klara", 30, "JS"),
                new Student("Sabina", 19, "JS"),
                new Student("Amina", 17, "JS"),
                new Student("Nurgazy", 19, "Java"),
                new Student("Larisa", 27, "JS"),
                new Student("Salima", 18, "Java"),
                new Student("Dastan", 23, "JS"),
                new Student("Almambet", 26, "JS"),
                new Student("Azat", 29, "Java"),
                new Student("Kurmanbek", 15, "Java"),
                new Student("Kanat", 31, "Java"),
                new Student("Maksat", 25, "Java"),
                new Student("Tologon", 24, "Java"),
                new Student("Kuba", 23, "Java"),
                new Student("Adilet", 18, "Java"),
                new Student("Jakyp", 17, "Java"),
                new Student("Mahabat", 33, "JS")));

        arrayList.removeIf(j -> j.getAge() < 16);

        ArrayList<Student> js = new ArrayList<>(arrayList);
        js.removeIf(a -> a.getGroup().equals("Java"));
        for (Student d : js) {
            System.out.println(d);
        }
        System.out.println("+-------------------------------------------------------+");
        ArrayList<Student> java = new ArrayList<>(arrayList);
        java.removeIf(s -> s.getGroup().equals("JS"));
        for (Student a : java) {
            System.out.println(a);
        }
        System.out.println("+-------------------------------------------------------+");
        ArrayList<Student> ageFilter = new ArrayList<>(arrayList);
        for (Student g : ageFilter) {
            if (g.getAge() >= 18 && g.getAge() <= 25) {
                System.out.println(g);
            }
        }
        System.out.println("+-------------------------------------------------------+");
        ArrayList<Student> nameFilter = new ArrayList<>(arrayList);
        for (Student n : nameFilter) {
            if (n.getName().startsWith("A")) {
                System.out.println(n);
            }
        }
        System.out.println("+-------------------------------------------------------+");
        ArrayList<Student> javaMoreThanThirty = new ArrayList<>(arrayList);
        for (Student t : javaMoreThanThirty) {
            if (t.getGroup().equals("Java") && t.getAge() >= 30) {
                System.out.println(t);
            }
        }
        System.out.println("+-------------------------------------------------------+");
        ArrayList<Student> jsWithKin = new ArrayList<>(arrayList);
        for (Student k : jsWithKin) {
            if (k.getGroup().equals("JS") && k.getName().contains("k") || k.getName().contains("K")) {
                System.out.println(k);
            }
        }
    }
}
