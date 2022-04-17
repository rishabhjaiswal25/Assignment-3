
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int i,n,uni=0,j,f1,c=0,k=0,f2=0,p;
		System.out.println("Enter the array size: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		System.out.println("Enter the numbers: ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			f1=0;
			c=0;
			for(j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					f1=1;
					p=0;
					for(int l=0;l<k+1;l++) {
						if(b[l]==a[i]) {
							p=1;
							break;
						}
					}
					if(p==0) {
					b[k]=a[i];
					k++;
					break;
					}
				}
			}
			if(f1==0) {
				f2=0;
				for(int l=0;l<k+1;l++) {
					if(b[l]==a[i]) {
						f2=1;
						break;
					}
				}
				if(f2==0) {
				uni+=1;
				}
			}
			
		}
		System.out.println("Number of duplicate numbers are: " + k);
		System.out.println("Number of unique numbers are: "+uni);
		
	}

}
