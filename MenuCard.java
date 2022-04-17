package assignment_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCard {

	public static void main(String[] args) {
		try {
			String str;
			Scanner sys = new Scanner(System.in);
			System.out.println("ABC Hotel\nMenu Card");
			System.out.println("1.Non-Vegetarian\n2.Vegetarian\n3.Chinese\nEnter your choice:");
			int n = sys.nextInt();
			switch(n) {
			case 1:
				System.out.println("Non-Vegetarian\nMenu Card");
				do {
					System.out.println("1.Chicen Biryani\n2.Mutton Biryani\n3.Fish Biryani\nEnter your choice:");
					int n1=sys.nextInt();
					switch(n1) {
					case 1:
						System.out.println("The price is Rs.250");
						break;
					case 2:
						System.out.println("The price is Rs.200");
						break;
					case 3:
						System.out.println("The price is Rs.350");
						break;
					default:
						System.out.println("No more options are Available");
						
					}
					sys.nextLine();
					System.out.println("Do you want to continue(Y/N)?");
					str=sys.nextLine();
				}
				while(str.equals("Y"));
				break;
				default:
					System.out.println("No more options are available");
					
				case 2:
					System.out.println("Vegetarian\\nMenu Card");
					do {
					System.out.println("1.Cashew Biryani\n2.panner Biryani\n3.mushroom Biryani\nEnter your choice:");
						int n2=sys.nextInt();
						switch(n2) {
						case 1:
							System.out.println("The price is Rs.250");
							break;
						case 2:
							System.out.println("The price is Rs.200");
						break;
						case 3:
							System.out.println("The price is Rs.350");
							break;
						default:
							System.out.println("No more options are Available");
							
						}
						sys.nextLine();
						System.out.println("Do you want to continue(Y/N)?");
						str=sys.nextLine();
						
						}
					while(str.equals("Y"));
					break;
					
				case 3:
					System.out.println("chinese\nMenu Card");
					do {
						System.out.println("1.Cashew Biryani\n2.panner Biryani\n3.mushroom Biryani\nEnter your choice:");
							int n2=sys.nextInt();
							switch(n2) {
							case 1:
								System.out.println("The price is Rs.250");
								break;
							case 2:
								System.out.println("The price is Rs.200");
							break;
							case 3:
								System.out.println("The price is Rs.350");
								break;
							default:
								System.out.println("No more options are Available");
								
							}
							sys.nextLine();
							System.out.println("Do you want to continue(Y/N)?");
							str=sys.nextLine();
							}
					while(str.equals("Y"));
					break;
			}
	}	
	catch(InputMismatchException e) {
						System.out.println("need only numbers");
				
		}
		finally {
			System.out.println("The program execution is terminated");
		}
	}

}