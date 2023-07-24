package org.example.arraylist;


import java.util.*;

class Employee{
    int id;
    String name;
    String address;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employee(int id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                salary == employee.salary &&
                Objects.equals(name, employee.name) &&
                Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, salary);
    }


}





public class CustomArraylistExample {
    public static void main(String[] args) {

        Employee employee1 = new Employee(101,"Binisha Basnet","Kathmandu", 10000);
        Employee employee2 = new Employee(102,"Ram Thapa","Bhaktapur",20000);
        Employee employee3 = new Employee(103,"Ashlesha Kakri","Bhaktapur",15000);
        Employee employee4 = new Employee(104,"Shyam Bista","Kathmandu",25000);

        ArrayList<Employee> arrayList = new ArrayList<Employee>();

        //Adding objects in arraylist
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);


        System.out.println("Traversing list through Iterator");
        //Traversing list through Iterator
        Iterator iterator = arrayList.listIterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();

            System.out.println(" Id: "+ employee.id + " Name:  " + employee.name + " Address: "+ employee.address + " Salary: "+ employee.salary);
        }


        //Accessing the elements using get() method
        Employee secondemp = arrayList.get(1);
        System.out.println("Returning element using get method is: " + secondemp.getName());

       //changing the element
        Employee firstemp = arrayList.get(0);
        firstemp.setId(110);
        System.out.println("Modified id using set method is: " + firstemp.getId());

        for (Employee employee : arrayList
             ) {
            System.out.println(" Id: "+ employee.id + " Name:  " + employee.name + " Address: "+ employee.address + " Salary: "+ employee.salary);
        }


        //Removing element on the basis of specific position
        arrayList.remove(1);

       /* Employee empremove = new Employee(104,"Shyam Bista","Kathmandu",25000);
        arrayList.remove(empremove);*/

       // or

      //  arrayList.remove(new Employee(103,"Ashlesha Kakri","Bhaktapur",15000));

        System.out.println("After removing elements");
        for (Employee employee : arrayList
        ) {

            System.out.println(" Id: "+ employee.id + " Name:  " + employee.name + " Address: "+ employee.address + " Salary: "+ employee.salary);
        }


        ArrayList<Employee> arrayList1 =new ArrayList<Employee>();
        arrayList1.add(new Employee(103,"Ashlesha Kakri","Bhaktapur",15000));
        arrayList1.add( new Employee(105,"Krishna Thapa","Bhaktapur",30000));
        arrayList1.add(new Employee(106,"Hari Sharma","Chitwan",25000));


        arrayList.retainAll(arrayList1);

        System.out.println("After retaining the elements ");


        for (Employee employee: arrayList
             ) {
            System.out.println(" Id: "+ employee.id + " Name:  " + employee.name + " Address: "+ employee.address + " Salary: "+ employee.salary);
        }

    }
}
