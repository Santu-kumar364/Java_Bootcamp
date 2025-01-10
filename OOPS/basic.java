package Java_Bootcamp.OOPS;

public class basic {
    public static void main(String[] args) {

        // store 5 numbers
        //int[] num = new int[5];

        // store 5 names
        //String[] name = new String[5];

        // to store data of 5 students(including name, roll_number, marks)
        Students[] students = new Students[5];

        students[0] = new Students(578, "santu", 80.8f);
        
        students[1] = new Students(143, "Ajeet", 72.4f);
        
        students[2] = new Students(123, "Anju", 65.8f);
        
        students[3] = new Students(58, "Gupta", 50.8f);
        
        students[4] = new Students(78, "kumar", 62f);

        for(Students s : students) {
            System.out.println(s);
        }
       
        
    }
    
}

class Students {
    int roll_number;
    String name;
    Float marks;

    Students (int roll_number, String name, Float marks) {
        this.roll_number = roll_number;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Name: " + name + ", Roll Number: " + roll_number + ", Marks: " + marks;
    }

  
}
