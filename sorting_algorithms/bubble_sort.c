#include<stdio.h>
int main(){
    int n;//length of the array
    printf("Enter the number of elements in the array:");
    scanf("%d",&n);
    int a[n];
    printf("Enter the elements of the array:");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int temp;//a temporary variable for swapping
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    printf("\nThe array after sorting in ascending order:");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    return 0;
}
