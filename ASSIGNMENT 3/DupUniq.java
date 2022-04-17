import java.util.*;
public class DupUniq{
public static void main(String args[]){
int n,Dup=0,Uniq=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int [] arr = new int [n];
for(int i=0;i<n;i++)
{
   arr[i]=sc.nextInt();
}

Map<Integer,Integer>map=new HashMap<>();
int i=0;
while(i<n){
   if(map.containsKey(arr[i])==false){
     map.put(arr[i],1);
   }
   else{
     int oldval=map.get(arr[i]);
     int newval=oldval+1;
     map.put(arr[i],newval);
    }
    ++i;
}
Set<Map.Entry<Integer,Integer>>hmap=map.entrySet();
for(Map.Entry<Integer,Integer>data:hmap){
  if(data.getValue()>1)
   {
    Dup=Dup+1;
   }
   else{
    Uniq=Uniq+1;
   }
}  
    System.out.println("No.of Duplicate elment= : "+Dup);
        System.out.print("No.of Unique elment= : "+Uniq);
}
}

 