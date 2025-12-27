// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("How many times you want to play Rock Scissors Paper game?: ");
       int n = sc.nextInt();
       int count1 = 0 ,count2 = 0;
       System.out.println("Press 'R' for Rock ,Press 'P' for Paper and Press 'S' for Scissors: ");
       for(int i=1;i<=n;i++){
           System.out.print("Enter choice(Person 1): ");
           char p1 = sc.next().charAt(0);
           System.out.print("Enter choice(Person 2): ");
           char p2 = sc.next().charAt(0);
           if(p1 == 'R' && p2 == 'S'){
               count1++;
           }else if(p1 == 'S' && p2 == 'R'){
               count2++;
           }else if(p1 == 'S' && p2 == 'P'){
               count1++;
           }else if(p1 == 'P' && p2 == 'S'){
               count2++;
           }else if(p1 == 'R' && p2 == 'P'){
               count2++;
           }else if(p1 == 'P' && p2 == 'R'){
               count1++ ;
           }else{
               System.out.println("INVALID INPUT");
           }
        }
      if(count1 > count2){
          System.out.println("Person 1 wins!!");
      }else if(count2 > count1){
          System.out.println("Person 2 wins!!");
      }else{
          System.out.println("There is a tie!!");
      }
    }
}
