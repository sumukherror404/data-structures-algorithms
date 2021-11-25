/*to search for a key element in the array using binary search*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,key;
        System.out.print("Enter the size of the array:");
        n=input.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the array elements in sorted order:");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.print("Enter the key element to be searched:");
        key=input.nextInt();
        int start=0,end=n-1,mid=(n-1)/2;
        boolean found=false;
        while(start<=end){
            mid=(start+end)/2;
            if(a[mid]==key){
                found=true;
                break;
            }
            else if(a[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(found){
            System.out.println("The given key element is found at "+ mid +" index");
        }
        else{
            System.out.println("The given key element is not found in the given array");
        }
    }
}
