
import java.util.InputMismatchException;

import java.util.Scanner;
public class Main{

	public static void main(String[] args)

	{

		try

		{

			String str,s;

			Scanner sys=new Scanner(System.in);
			do {

			System.out.println("HMR Hotel\n Menu Card");

			System.out.println("1.Non-Vegetarian \n2.Vegetarian \n3.Chinese \nEnter your choice:");

			int n=sys.nextInt();

			switch(n)

			{

			case 1:

				System.out.println("Non-Vegetarian\n Menu Card");

				do

				{

					System.out.println("1.Chicken Briyani\n2.Mutton Briyani\n3.Fish Briyani\n4.Prawn Briyani\n Enter your choice:");

					int n1=sys.nextInt();

					switch(n1)
				
					{

					case 1:

						System.out.println("The Price is Rs.359");

						break;

					case 2:

						System.out.println("The Price is Rs.149");

						break;

					case 3:

						System.out.println("The Price is Rs.650");

						break;

					case 4:

						System.out.println("The Price is Rs.140");

						break;

					default:

						System.out.println("No more Options are Available");

					}

					sys.nextLine();

					System.out.println("Do you want to continue(y/n)?");

					str=sys.nextLine();

				}while(str.equals("y"));

				break;
			case 2:

				System.out.println("Vegetarian\n Menu Card");

				do

				{

					System.out.println("1. Briyani\n2.Paneer Korma\n Enter your choice:");

					int n1=sys.nextInt();

					switch(n1)
				
					{

					case 1:

						System.out.println("The Price is Rs.450");

						break;

					case 2:

						System.out.println("The Price is Rs.600");

						break;

					default:

						System.out.println("No more Options are Available");

					}

					sys.nextLine();

					System.out.println("Do you want to continue(y/n)?");

					str=sys.nextLine();

				}while(str.equals("y"));
				break;
			case 3:

				System.out.println("Chinese\n Menu Card");

				do

				{

					System.out.println("1.Soup chowmein\n2.Veg Chowmein\n3.Manchurian\n4.Chilli Paneer\n Enter your choice:");

					int n1=sys.nextInt();

					switch(n1)
				
					{

					case 1:

						System.out.println("The Price is Rs.504");

						break;

					case 2:

						System.out.println("The Price is Rs.104");

						break;

					case 3:

						System.out.println("The Price is Rs.302");

						break;

					case 4:

						System.out.println("The Price is Rs.189");

						break;

					default:

						System.out.println("No more Options are Available");

					}

					sys.nextLine();

					System.out.println("Do you want to continue(y/n)?");

					str=sys.nextLine();

				}while(str.equals("y"));
				break;

			default:

				System.out.println("No more Options are Available");

			}


			System.out.println("Do you want to see the main menu (y/n) ");
			s=sys.nextLine();
			}while(s.equals("y"));
		}
			

		catch (InputMismatchException e) {

 // TODO: handle exception

			System.out.println("Need to enter only numbers");

		}

		catch (Exception e) {

 // TODO: handle exception

			System.out.println(e.getMessage());

		}

		finally

		{

			System.out.println("The Program execution is Terminated");

		}

	}
}
