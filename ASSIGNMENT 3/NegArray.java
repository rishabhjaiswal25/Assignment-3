import java.util.*;
public class NegArray{
public static void main(String args[]){
int n,Dup=0,Uniq=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int [] arr = new int [n];
for(int i=0;i<n;i++)
{
   arr[i]=sc.nextInt();
}

for(int i=0;i<n;i++){
   if(arr[i]<0){
   continue;
   } 
   else{
    for(int j=i+1;j<n;j++){
     if(arr[j]<0){
     int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
     
  
    }
    }
   } 
}

for(int i=0;i<n;i++)
{
   System.out.print(arr[i]+" ");
}


}
}