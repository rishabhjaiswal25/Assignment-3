import java.util.*;
public class Matrix{
  public static void main(String args[]){
   int n,m;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   m=sc.nextInt();
   int arr[][]=new int[n][m];
   for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
         arr[i][j]=sc.nextInt();
      }
   }
   for(int i=0;i<n;i++){
      int max=arr[i][0];
      int min=arr[i][0]; 
      for(int j=0;j<m;j++){
        if(arr[i][j]>max)
        max=arr[i][j];
        if(arr[i][j]<min)
        min=arr[i][j];
      }
      System.out.println("Maximum element of "+ i +" row is : "+max );

      System.out.println("Minimum element of "+ i +" row is : "+min );
   }
   for(int i=0;i<m;i++){
      int max=arr[0][i];
      int min=arr[0][i]; 
      for(int j=0;j<n;j++){
        if(arr[j][i]>max)
        max=arr[j][i];
        if(arr[j][i]<min)
        min=arr[j][i];
      }
      System.out.println("Maximum element of "+ i +" column is : "+max );

      System.out.println("Minimum element of "+ i +" column is : "+min );
   }





  }
}