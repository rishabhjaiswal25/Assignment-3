import java.util.*;
public class Dice{
public static void main(String args[]){
int n=10,Dup=0,Uniq=0;
Scanner sc=new Scanner(System.in);
int [] arr = new int [n];
int [] array = new int [n];
int sum1=0;
int sum2=0;
System.out.println("Arun Dice Choice:");
for(int i=0;i<n;i++)
{
   arr[i]=sc.nextInt();
   sum1=sum1+arr[i];
}
System.out.println("Naveen Dice Choice:");
for(int i=0;i<n;i++)
{
   array[i]=sc.nextInt();
   sum2=sum2+arr[i];
}
if(sum1>sum2){
System.out.println("Arun Wins!!!");
}
else{
System.out.println("Naveen Wins!!!");
}
}
}