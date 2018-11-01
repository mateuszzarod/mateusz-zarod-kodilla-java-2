package com.kodilla.collections.map;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> theMap = new HashMap<Integer, String>();
        theMap.put(1, "Mati");
        theMap.put(2, "Ola");
        theMap.put(3, "Rysio");
        theMap.put(5, "Zenon");
        for (Map.Entry entry : theMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        HashMap<Employee, SalaryParameters> mapWorkers = new HashMap<>();
        Employee worker1 = new Employee("Mati", "Zaród", "83082510533");
        Employee worker2 = new Employee("Ola", "Zaród", "839111111");
        Employee worker3 = new Employee("Roman", "Za", "850938143");

        SalaryParameters parameters1 = new SalaryParameters(123.0, 12333.0, 32123.0, 0.0);
        SalaryParameters parameters2 = new SalaryParameters(123.0, 12333.0, 32123.0, 0.0);
        SalaryParameters parameters3 = new SalaryParameters(123.0, 12333.0, 32123.0, 0.0);

        mapWorkers.put(worker1, parameters1);
        mapWorkers.put(worker2, parameters2);
        mapWorkers.put(worker3, parameters3);

        for (Map.Entry entry: mapWorkers.entrySet()){
            System.out.println(" salary of: " + entry.getKey() + "\n is equal to: " + entry.getValue());
        }

        ArrayDeque<SalaryParameters> deque = new ArrayDeque<>();

        deque.offer(parameters1);
        deque.offer(parameters2);
        deque.offer(parameters3);

        System.out.println(deque.size());



    }
}
