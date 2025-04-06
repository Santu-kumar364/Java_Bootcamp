package Java_Bootcamp.OOPS.genrics.comparing;

public class Student  implements Comparable<Student>{
    int roll_no;
    float marks;

    Student(int roll_no, float marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return  marks + " " + roll_no;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        // diff == 0: means both are equals
        // diff < 0: means o is bigger else smaller
        return diff;
    }

    
}



