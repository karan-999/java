public class MergeSort {

    public static void conquer(int arr[],int si,int mid,int ei){

        int[] mergearr=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x= 0;
        while(idx1<=mid && idx2<=ei ){
            if(arr[idx1]<=arr[idx2]){
            mergearr[x]=arr[idx1];
            x++; idx1++;
        }
            else {
                mergearr[x]=arr[idx2];
                x++; idx2++;
            }
        }
        while(idx1<=mid){
            mergearr[x++]=arr[idx1++];
        }

        while(idx2<=ei){
            mergearr[x++]=arr[idx2++];
        }

        for(int i=0,j=si;i<mergearr.length;i++,j++){
            arr[j] = mergearr[i];
        }
    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid= si + (ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);

    }
    public static void main(String[] args) {
        int[] arr={13,76,32,2,14};
        int n= arr.length;
        divide(arr,0,n-1);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
