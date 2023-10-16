// import java.util.Scanner;
// public class Practise5 {
//     public static void main (String args[]){
//         Scanner myObj = new Scanner (System.in);
//         String name = myObj.nextLine();
//         System.out.println("my name is"+name);
//     }
// }
// import java.util.Scanner;
// public class Practise5{
//     public static void main(String args[]){
//         Scanner myObj= new Scanner (System.in);
//         System.out.println("print num 1");
//         int x = myObj.nextInt();
//         int y = myObj.nextInt();
//         int sum = x+y;
//         System.out.println(" the sum is "+sum);

//     }
// }
import java.util.Scanner;
public class Practise5{
    public static void main (String args[]){
        Scanner take = new Scanner(System.in);
        System.out.println("input the num tocheck wheater even or odd");
        int num = take.nextInt();
        if (num%2==0){
            System.out.println("its an even num");

        }
        else{
            System.out.println("its an odd num you idiot");
        }
    }
}
