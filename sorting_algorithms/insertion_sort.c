#include<stdio.h>
int main()
{
    int n;//to store the size of the array
    printf("Enter the size of the array:");
    scanf("%d",&n);
    int a[n];// an array to store the elements 
    printf("Enter the elements of the array:");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int j;//to iterate the inner loop
    for(int i=1;i<n;i++){
        int key=a[i];
        j=i-1;
        while(j>=0 && key<a[j]){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
    }
    printf("\n the array elements after being sorted in ascending order using insertion sort:");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    return 0;
}
