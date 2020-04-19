/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_sdt;

/**
 *
 * @author USER
 */
public class Java_Project_SDT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] t={0,1,2,3,4,5,6};
        
        for(int i=0; i<=6; i++)
         System.out.print(t[i]+" | ");
        
        System.out.println();
        
         for(int i=6; i>=0; i--)
         System.out.print(t[i]+" | ");
         
         int j=3;
         int v;
         
         for(int i=0; i<=2; i++){
           while(j<=6){
               v=t[i];
               t[i]=t[j];
               t[j]=v;
               j++;
           }
         }
         
         System.out.println();
         
          for(int i=0; i<=6; i++)
         System.out.print(t[i]+" | ");
    }
    
}
