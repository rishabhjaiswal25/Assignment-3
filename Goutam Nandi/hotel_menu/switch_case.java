package new_pakage;
import java.util.*;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try { 
			 String str,str1; 
			 
			 Scanner sys=new Scanner(System.in); 
			 System.out.println("HMR Hotel\n Menu Card"); 
			 do {
			
			 System.out.println("1.Non-Vegetarian \n2.Vegetarian \n3.Chinese \nEnter your choice:"); 
			 int n=sys.nextInt(); 
			 switch(n) 
			 { 
			 case 1: 
				 System.out.println("Non-Vegetarian\n Menu Card"); 
			 do {
				 System.out.println("1.Chicken Briyani\n2.Mutton Briyani\n3.Fish Briyani\n4.Prawn Briyani\n Enter your choice:"); 
			 int n1=sys.nextInt();
			 switch(n1) { 
			 case 1: 
				 System.out.println("The Price is Rs.250"); 
				 break;
			 case 2: 
				 System.out.println("The Price is Rs.150"); 
				 break; 
			 case 3: 
				 System.out.println("The Price is Rs.350"); 
				 break; 
				 case 4: System.out.println("The Price is Rs.180");
				 break; 
				 default: 
					 System.out.println("No more Options are Available"); 
					 } 
			 sys.nextLine();
			 System.out.println("Do you want to continue(y/n)?"); 
			 str=sys.nextLine();
			 }
			 while(str.equals("y"));
			 break;
			 
			 case 2: 
				 System.out.println("Vegetarian\n Menu Card"); 
			 
			 do {
				 System.out.println("1.veg Briyani\n2.Polau \n3.zeera Rice\n4.lemon rice\n Enter your choice:"); 
			 int n2=sys.nextInt();
			 switch(n2)
			 { 
			 case 1: 
				 System.out.println("The Price is Rs.140"); 
				 break;
			 case 2: 
				 System.out.println("The Price is Rs.160"); 
				 break; 
			 case 3: 
				 System.out.println("The Price is Rs.170"); 
				 break; 
			 case 4: System.out.println("The Price is Rs.190");
				 break; 
			 default: 
					 System.out.println("No more Options are Available"); 
					 } 
			 sys.nextLine();
			 System.out.println("Do you want to continue(y/n)?"); 
			 str=sys.nextLine();
			 }
			 while(str.equals("y"));
			
			 
				 
			 case 3: 
				 System.out.println("chinese\n Menu Card"); 
			do {
					 System.out.println("1.Noodles\n2.momo \n3.chowmein\n4.spring roll\n Enter your choice:"); 
				 int n3=sys.nextInt();
				 switch(n3)
				 { 
				 case 1: 
					 System.out.println("The Price is Rs.140"); 
					 break;
				 case 2: 
					 System.out.println("The Price is Rs.160"); 
					 break; 
				 case 3: 
					 System.out.println("The Price is Rs.175"); 
					 break; 
				 case 4: System.out.println("The Price is Rs.145");
					 break; 
				 default: 
						 System.out.println("No more Options are Available"); 
						 } 
				 sys.nextLine();
				 System.out.println("Do you want to continue(y/n)?"); 
				 str=sys.nextLine();
				 }
				 while(str.equals("y"));
				
				 
				 default: 
					 System.out.println("No more Options are Available"); 
					 
				 
		  }
			 System.out.println("Do you want to continue(y/n)?"); 
			 str1=sys.nextLine();
			 } while(str1.equals("y"));
		 }
		 catch (InputMismatchException e) 
		 {
			 System.out.println("Need to enter only numbers"); 
			 } 
		 catch (Exception e) 
		 { 
			 System.out.println(e.getMessage());
			 }
		 finally { 
			 System.out.println("The Program execution is Terminated"); 
			 }
	}

}
