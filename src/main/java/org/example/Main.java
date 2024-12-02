package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Employee işlemleri
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "izzet", "erden"));
       employees.add(new Employee(1, "izzet", "erden"));
        employees.add(new Employee(2, "derya", "erden"));
        employees.add(new Employee(3, "hasan", "demir"));
        employees.add(new Employee(3, "hasan", "demir"));
        employees.add(new Employee(4, "ali", "celik"));

        List<Employee> dublicates = findDuplicates(employees);
        System.out.println(dublicates);

        Map<Integer,Employee> uniques = findUniques(employees);
        System.out.println(uniques);


        System.out.println("*****************");
        System.out.println(uniques.values());
        System.out.println("******************");
        System.out.println(removeDuplicates(employees));

         

        System.out.println(WordCounter.calculatedWord());
        }




public  static List<Employee> findDuplicates (List<Employee> employees){
        Map<Integer,Employee> employeeMap = new HashMap<>();
        List<Employee> dublicates = new LinkedList<>();

        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            Employee employeew = it.next();
             if (employeew == null) {
                 System.out.println("Null employee founded");
                 continue;
             }
             if(employeeMap.containsKey(employeew.getId())){
                 dublicates.add(employeew);
             }else{
                 employeeMap.put(employeew.getId(),employeew);
             }
        }
        return dublicates;
}



public  static Map<Integer , Employee> findUniques(List<Employee> employees){
    Map<Integer,Employee> employeeMap = new HashMap<>();


    Iterator<Employee> it = employees.iterator();

    while (it.hasNext()) {
        Employee employee = it.next();
        if (employee == null) {
            System.out.println("Null employee founded");
            continue;
        }
        if(!employeeMap.containsKey(employee.getId())){
            employeeMap.put(employee.getId(),employee);
        }
        }

    return employeeMap;
}

public static List<Employee> removeDuplicates (List<Employee> employees){
        List<Employee> dublicates = findDuplicates(employees);
        Map<Integer,Employee> uniques = findUniques(employees);
        List<Employee> duclicatesRemoveList = new LinkedList<>(uniques.values());

        duclicatesRemoveList.removeAll(dublicates);
        return duclicatesRemoveList;
}

}



