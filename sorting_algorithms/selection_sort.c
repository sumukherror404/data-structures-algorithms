#include<stdio.h>
int main(){
    int n;//to store the value of the size of the array
    printf("Enter the size of the array:");
    scanf("%d",&n);
    int a[n];
    printf("Enter the elements of the array:");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int min_index;//to store the index of the minimum value in the each iteration
    int temp;// a temporary variable used for swapping values
    for(int i=0;i<n-1;i++){
        min_index=i;
        for(int j=i+1;j<n;j++){
            if(a[min_index]>a[j]){
                min_index=j;
            }
        }
        int temp=a[min_index];
        a[min_index]=a[i];
        a[i]=temp;
    }
    printf("\nThe array values after sorting in ascending order:");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    return 0;
}
