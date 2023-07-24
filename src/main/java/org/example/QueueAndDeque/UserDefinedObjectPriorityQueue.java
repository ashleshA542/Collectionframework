package org.example.QueueAndDeque;



import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class Student implements Comparable<Student> {
     int id;

     String name;

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

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


   /* @Override*/
    /*public int compareTo(Student student) {

        if(id>student.id){
            return 1;
        }else if(id<student.id){
            return -1;
        }else{
            return 0;
        }
    }*/

    public int compareTo(Student other) {
        // Compare persons based on their id
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


public class UserDefinedObjectPriorityQueue {
    public static void main(String[] args) {
        Queue<Student> queue=new PriorityQueue<Student>();
        Student student = new Student(1,"ashlesha");
        Student student1 = new Student(3,"Ritika");
        Student student2 = new Student(2,"Aasha");

        queue.add(student);
        queue.add(student1);
        queue.add(student2);

        System.out.println("Traversing the queue elements:");
        //Traversing queue elements

        for(Student std :queue){

            System.out.println(std.id + " "+ std.name);
        }


        System.out.println("first id : " + queue.peek());
        queue.poll();


        System.out.println("Second id: " + queue.peek());
        queue.poll();
    }

}
