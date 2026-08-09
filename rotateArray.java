class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
    }
    public void rev(int arr[],int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
        
}