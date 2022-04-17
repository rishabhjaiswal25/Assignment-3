import java.util.*;
public class Share{
 public static void main(String args[]){
    int n,choc;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    choc=sc.nextInt();
    if(choc%n==0){
     System.out.println("Yes");
   }
   else{
     System.out.println("No");
   }
}
}

    