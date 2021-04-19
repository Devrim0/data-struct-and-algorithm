
package fınalnotlarıveriyapıları;

/**
 
  @author Devrim
 */
public class QUICKSORT {

    public QUICKSORT() {
                      }
    
    void quicksort(int A[],int bas,int son){
    int pivot;
    if(bas<son){
    pivot =partition(A,bas,son);
    quicksort(A,bas,pivot-1);
    quicksort(A,pivot+1,son);
    }
    
    }
    
    int partition(int A[],int bas,int son){
    
    int x=A[son];
    int i=bas-1;int j;
    for(j=bas;j<son;j++){
    if(A[j]<=x){
    i++;
    swap(A,i,j);
    
    }
    }
    swap(A,i+1,son);
    return i+1;
    }
    
   void swap(int A[],int i,int j){
   int temp=A[i];
   A[i]=A[j];
   A[j]=temp;
   }
    void print(int d[]){
    int n=d.length;
    for(int i=0;i<n;i++){
        System.out.print(d[i]+" ");
    
    }
    }
    public static void main(String[] args) {
        int d[]={9,5,6,7,34,123,89,12,56,1,2,45,35,456};
        QUICKSORT q=new QUICKSORT();
        int n=d.length;
        q.quicksort(d, 0,n-1);
        q.print(d);
    }
}
