/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fınalnotlarıveriyapıları;

/**
 *   1,4,3,6,7,8,2
 * @author Devrim
 */
public  class SAYMASIRALAMA {
   public static void sayma(int d[]){
   int n=d.length;
   int cikti[]=new int[n];
   int count[]=new int[n];
   for(int i=0;i<n;i++){
   count[d[i]]++;
   }
   for(int i=1;i<n;i++){
  
   count[i]+=count[i-1];
   
   }
   
   for(int i=0;i<n;i++){
   cikti[count[d[i]]-1] = d[i]; 
     --count[d[i]]; 
   }
   for (int i = 0; i<n; ++i) 
            d[i] = cikti[i]; 
   }
   
    public static void main(String[] args) {
        int d[]={3,5,4,7,1,2,4,3};
        sayma(d);
        for(int i=0;i<d.length;++i){
            System.out.print(d[i]+" ");
        }
    }
}
