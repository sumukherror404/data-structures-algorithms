/* to check whether the duplicate elements are present in the array or not*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("enter the size of the array:");
        n=input.nextInt();
        int[] a = new int[n];
        System.out.print("enter the elements in the array:");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        int count=0,i;
        for(i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && a[i]==a[j]){
                    count++;
                    System.out.println("The array has duplicate elements");
                    break;
                }
            }
            if(count!=0){
                break;
            }
        }
        if(count==0){
            System.out.println("The array doesn't have any duplicate elements");
        }
        
    }
}
