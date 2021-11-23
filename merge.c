#include<stdio.h>
void merge(int a[],int low,int mid,int high){
    int i,j,k;
    int n1=mid-low+1;// to get the size of the right subarray
    int n2=high-mid;//to get the size of the left subarray
    int temp_array1[n1],temp_array2[n2];
    for(i=0;i<n1;i++){//for copying the values of the right subarray to a temporary array
        temp_array1[i]=a[low+i];
    }
    for(i=0;i<n2;i++){//for copying the values of the left subarray to a temporary array
        temp_array2[i]=a[mid+i+1];
    }
    i=0;
    j=0;
    k=low;
    while(i<n1 && j<n2){
        
        if(temp_array1[i]>temp_array2[j]){
            a[k++]=temp_array2[j++];
        }
        else{
            a[k++]=temp_array1[i++];
           
        }
    }
    while(i<n1){
        a[k++]=temp_array1[i++];
    }
    while(j<n2){
        a[k++]=temp_array2[j++];
    }
}
void mergesort(int a[],int low,int high){
    if(low<high){
        int mid=(low+high)/2;
        mergesort(a,low,mid);
        mergesort(a,mid+1,high);
        merge(a,low,mid,high);
    }
}
int main(){
    int n;
    printf("enter the size of the array:");
    scanf("%d",&n);
    int a[n];
    printf("Enter the elements of the array:");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    mergesort(a,0,n-1);
    printf("\nThe values of the array after sorting in ascending order:");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}
