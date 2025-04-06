package Java_Bootcamp.Basics;

// public class Fibonacci {

//     static void fiboSequence(int n) {
//         int a = 0;
//         int b = 1;

//         for(int i = 0; i < n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next; 
            
//         }

//     }

//     public static void main(String[] args) {
//         fiboSequence(10);
        
//     }
    
// }

                             // To find Nth FiboNumber
class Santu {

    static int fiboN(int n) {
        int f1 = 0;
        int f2 = 1;

        if(n == 1)  
            return f1;
        
        if(n == 2) 
            return f2;

        for(int i = 3; i <= n; i++) {
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        return f2;    
    }
    public static void main(String[] args) {
        int result = fiboN(9);
        System.out.println(result);
        
    }

}


