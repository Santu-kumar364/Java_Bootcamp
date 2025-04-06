package Java_Bootcamp.OOPS.genrics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main implements Comparable<Student> {
    public static void main(String[] args) {
        Student santu = new Student(14, 78.80f);
        Student ajeet = new Student(5, 89.52f);
        Student anju = new Student(2, 95.80f);
        Student Abhi = new Student(21, 72.52f);
    
        Student[] list = {santu, ajeet, anju, Abhi};

        System.out.println(Arrays.toString(list));

        /*Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int) (o1.marks - o2.marks);
            }   
        });*/

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));
             

        System.out.println(Arrays.toString(list));


        /*if(santu.compareTo(ajeet) < 0) {
            System.out.println(santu.compareTo(ajeet));
            System.out.println("Ajeet has more marks.");
        }*/
    }

}




