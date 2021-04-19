
import java.util.Arrays;





public class MTANELİSTEBİRLESTİR {
    
    public int[] birlestir(int d[],int a[]){
        int S[]=new int[d.length+a.length];
        int n[]=new int[d.length+1];
       int m[]=new int[a.length+1];
       int i,j;
      
      
       
    
    
    
    
    
 if(!siralad(d) || !siralaa(a)){
    
    
    
    
for( i=0;i<d.length;i++){
   
n[i]=d[i];
if(n[i]==-1){
}
}
for(j=0;j<a.length;j++){
m[j]=a[j];
if(m[j]==-1){
   
}

}
n[i]=Integer.MAX_VALUE;
m[j]=Integer.MAX_VALUE;

  i=0;j=0;
for(int k=0;k<S.length;k++){
  if(n[i]<m[j]){
  S[k]=n[i];
  i++;
  }
  else if(m[j]<n[i]){
  S[k]=m[j];
  j++;
  }
    }}
        return S;
    }
    
   boolean siralad(int d[]){
    boolean gecerli=true;
       
       while(gecerli){
           gecerli=false;
    for(int l=1;l<=d.length-1;l++){
    if(d[l-1]>d[l]){
       
    int temp=d[l-1];
    d[l-1]=d[l];
    d[l]=temp;
     gecerli=true;
    }
    }   
       }
   return false;
   } 
    boolean siralaa(int d[]){
    boolean gecerli1=true;
  while(gecerli1){
           gecerli1=false;
   for(int c=1;c<=d.length-1;c++){
    if(d[c-1]>d[c]){
    int temp=d[c-1];
    d[c-1]=d[c];
    d[c]=temp;
    gecerli1=true;

    }
    }   
       }
  return false;
    }
    
    public static void main(String[] args) {
        int d[]={1,-3,2,3,-4000,700,5,89}; int a[]={-990,600,18,12};
        MTANELİSTEBİRLESTİR v=new MTANELİSTEBİRLESTİR(); 
     v.siralad(d);
     v.siralaa(a);
        System.out.println( Arrays.toString(v.birlestir(d, a))+" ");
    }
}
