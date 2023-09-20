

import java.util.*;
class PQ{
    static class Student implements Comparable<Student>{
        String name;
        float cgpa;
        public Student(String name, float cgpa){
            this.name = name;
            this.cgpa = cgpa;
        }

        // @Override
        // public int compareTo(Student s2){
            // return s2.cgpa - this.cgpa;
            //decending order 
            // Max value have max priority
            //------------------------------------------
            // return this.cgpa - s2.cgpa;
            //Ascending order 
            // Min value have max priority
        // }

        @Override
        public int compareTo(Student s2) {
        // Compare based on CGPA (descending order)
            float diff = this.cgpa - s2.cgpa;

            if (diff < 0) {
                return 1;  // s2 has higher CGPA, so return a positive value
            } else if (diff > 0) {
                 return -1; // this has higher CGPA, so return a negative value
            } else {
                 return 0;  // CGPA is equal
            }
        }

    }
    public static void main(String args[]){

        //By default PQ, Gives Higher Priority to Minimum value 
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Now Changing Priority,
        //Max value have now max property
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(10);
        // pq.add(12);
        // pq.add(3);
        // pq.add(5);
        // pq.add(7);

        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }


        //Using Priority in Objects
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Ajay",8.9f));
        pq.add(new Student("Gargi",9.2f));
        pq.add(new Student("Radha",7.5f));
        pq.add(new Student("Raj",8.5f));
        
        System.out.println("Who have more CGPA stand before All:");
         while(!pq.isEmpty()){
            System.out.println(pq.peek().name);
            pq.remove();
        }
    }
}