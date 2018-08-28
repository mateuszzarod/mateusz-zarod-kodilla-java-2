package com.kodilla.collections.map;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.util.stream.Collectors;

public class HashMapTest {

    public static void main(String[] args) {

        boolean loggedIn = false;
        int tryCounter = 0;
        Random random = new Random();

        while (!loggedIn){
            tryCounter++;
            System.out.println("Waiting to log + attempet" + tryCounter);
            if (random.nextInt(100) > 90){
                loggedIn = true;
            }
        }
        System.out.println("user has logged");

        Employee worker1 = new Employee("Jennifer", "Nowak", "12345678901");
        Employee worker2 = new Employee("Sarah", "Taylor", "12345612345");
        Employee worker3 = new Employee("Laura", "Pinelli", "12345698765");
        Employee worker4 = new Employee("Laura", "Pinelli", "12345045678");

        ArrayList<Integer> randomList = new ArrayList<>();
        Random random1 = new Random();
        for (int i=0; i < 500; i++){
            randomList.add(random1.nextInt(5000));
        }

        //Creating collection with 30000 elements of type Integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n = 0; n < 30000; n++) {
            list.add(n);
        }
        //Displaying quantity of elements
        System.out.println("Quantity of elements in the collection: " + list.size());
        //Deleting last element from the collection
        long begin = System.currentTimeMillis();     list.remove(list.size()-1);
        long end = System.currentTimeMillis();
        //Displaying time of the delete operation
        System.out.println("Removing last element has taken: " + (end - begin) + "ms");

        SalaryParameters params1 = new SalaryParameters(5000.0, 3000.0, 0.0, 0.0);
        SalaryParameters params2 = new SalaryParameters(4000.0, 2000.0, 1000.0, 0.0);
        SalaryParameters params3 = new SalaryParameters(4500.0, 3500.0, 0.0, 0.0);
        SalaryParameters params4 = new SalaryParameters(11000.0, 0.0, 2000.0, 1000.0);

        Map<Employee, SalaryParameters> paymmnentParams = new HashMap<Employee, SalaryParameters>();
        paymmnentParams.put(worker1, params1);
        paymmnentParams.put(worker2, params2);
        paymmnentParams.put(worker3, params3);
        paymmnentParams.put(worker4, params4);

        Student student1 = new Student("Monika", "Kowalska", "92120222202");
        Student student2 = new Student("Krzysztof", "Walas", "92021478203");
        Student student3 = new Student("Wioletta", "Baczkowska", "92041678456");
        Student student4 = new Student("Wojciech", "Więcki", "92071814340");

        ArrayList<Integer> grades1 = setGrades(5, 4, 5);
        ArrayList<Integer> grades2 = setGrades(1, 5, 3);
        ArrayList<Integer> grades3 = setGrades(3, 3, 3);
        ArrayList<Integer> grades4 = setGrades(5, 5, 2);

        Map<Student, ArrayList<Integer>> studentInfo = new HashMap<>();
        studentInfo.put(student1, grades1);
        studentInfo.put(student2, grades2);
        studentInfo.put(student3, grades3);
        studentInfo.put(student4, grades4);

        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);

        Iterator<Student> studentIterator = studentSet.iterator();
        while (studentIterator.hasNext()){
            Student currentStudent = studentIterator.next();
            System.out.println(currentStudent);
        }
        System.out.println("Loop while has finished");

        //Program ma wyświetlać średnią arytmetyczną ocen każdego ucznia.

        double average = 0;
        for (Map.Entry<Student, ArrayList<Integer>> entry: studentInfo.entrySet()){
            double sum = 0.0;

            for (int grade : entry.getValue()){
                if (entry.getValue() != null)
                    sum += grade;
            }
        }

        paymmnentParams.entrySet().stream()
                .forEach(e -> System.out.println(e));

        for (Map.Entry<Employee, SalaryParameters> entry: paymmnentParams.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

 /*       System.out.println(paymmnentParams.entrySet().stream()
                .map(b -> b.getKey().lastName)
                .collect(Collectors.toList()));
*/
        for (Map.Entry<Employee, SalaryParameters> entry: paymmnentParams.entrySet()){
            System.out.println("Salary of: " + entry.getKey() + " Equals: " + entry.getValue());
        }

       /* for (Map.Entry<Employee, SalaryParameters> entry: paymmnentParams.entrySet()){
            System.out.println(entry.getKey().firstName + " " + entry.getKey().lastName + " / " + entry.getValue());

        }
        System.out.println(paymmnentParams.entrySet());
        System.out.println(paymmnentParams.get(worker1));*/


    }

    private static ArrayList<Integer> setGrades(int i, int i1, int i2) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(i);
        grades.add(i1);
        grades.add(i2);
        return grades;
    }
}
