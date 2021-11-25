/*implementation of linear search algorithm*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,key;
        System.out.print("enter the size of the array:");
        n=input.nextInt();
        int[] a = new int[n];
        System.out.print("enter the elements in the array:");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.print("Enter the key element to be searched:");
        key=input.nextInt();
        int i;
        for(i=0;i<n;i++){
            if(a[i]==key){
                System.out.println("Key element found at index:"+i);
                break;
            }
        }
        if(i==n){
            System.out.println("The key element is not found in the given array");
        }
    }
}
