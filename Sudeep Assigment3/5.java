import java.util.*;
public class main {


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the cost of the mobile : ");
        int cost=s.nextInt();
        if(cost<=15000){
            System.out.println("Mobile chosen is within the budget");
        }
        else{
            System.out.println("Mobile chosen is beyond the budget");
        }

         }
}
