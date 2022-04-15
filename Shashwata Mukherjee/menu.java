package Assignment3;
import java.util.InputMismatchException;

import java.util.Scanner;
public class menu{

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

						System.out.println("The Price is Rs.250");

						break;

					case 2:

						System.out.println("The Price is Rs.150");

						break;

					case 3:

						System.out.println("The Price is Rs.350");

						break;

					case 4:

						System.out.println("The Price is Rs.180");

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

					System.out.println("1.Paneer Briyani\n2.Aloo Briyani\n Enter your choice:");

					int n1=sys.nextInt();

					switch(n1)
				
					{

					case 1:

						System.out.println("The Price is Rs.250");

						break;

					case 2:

						System.out.println("The Price is Rs.150");

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

					System.out.println("1.Chicken Chowmein\n2.Veg Chowmein\n3.Fish Manchurian\n4.Chilli Chicken\n Enter your choice:");

					int n1=sys.nextInt();

					switch(n1)
				
					{

					case 1:

						System.out.println("The Price is Rs.250");

						break;

					case 2:

						System.out.println("The Price is Rs.150");

						break;

					case 3:

						System.out.println("The Price is Rs.350");

						break;

					case 4:

						System.out.println("The Price is Rs.180");

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