package org.example.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

class Employee {
    int id;
    String name;
    String address;
    int salary;

    public Employee(int id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}


public class CustomLinkedList {
    public static void main(String[] args) {

        Employee employee1 = new Employee(101,"Binisha Basnet","Kathmandu", 10000);
        Employee employee2 = new Employee(102,"Ram Thapa","Bhaktapur",20000);
        Employee employee3 = new Employee(103,"Ashlesha Kakri","Bhaktapur",15000);
        Employee employee4 = new Employee(104,"Shyam Bista","Kathmandu",25000);

        LinkedList<Employee> linkedList = new LinkedList<Employee>();
        linkedList.add(employee1);
        linkedList.add(employee2);
        linkedList.add(employee3);
        linkedList.add(employee4);

        System.out.println("Traversing list through Iterator");
        Iterator<Employee> itr=linkedList.iterator();
        while(itr.hasNext()) {
            Employee employee = itr.next();
            System.out.println(" Id: "+ employee.id + " Name:  " + employee.name + " Address: "+ employee.address + " Salary: "+ employee.salary);


        }
        System.out.println("After removing elements: ");
        //Removing element on the basis of specific position
        linkedList.remove(0);
        linkedList.removeLast();
        for (Employee employee : linkedList
        ) {
            System.out.println(" Id: "+ employee.id + " Name:  " + employee.name + " Address: "+ employee.address + " Salary: "+ employee.salary);

        }

        }


}
