/*to find the first element in the array which greater than or equal to given key*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter the size of the array:");
	    int n=input.nextInt();
	    System.out.print("Enter the elements of the array (in sorted order only):");
	    int[] a=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=input.nextInt();
	    }
	    System.out.print("Enter the key value:");
	    int key=input.nextInt();
	    int first=0,last=n-1,mid=(first+last)/2;
	    while(first<=last){
	        mid=(first+last)/2;
	        if(a[mid]==key){
	            break;
	        }
	        else if(a[mid]>key){
	            last=mid-1;
	        }
	        else{
	            first=mid+1;
	        }
	    }
	    if(key<=a[mid]){
	        System.out.println("The required value in the array is:"+a[mid]);
	    }
	    else{
	        System.out.println("The required value in the array is:"+a[mid+1]);
	    }
	    input.close();
	    
	}
}
