package revamp;

import java.util.Arrays;

public class P1SortingArraysandStrings {

	public static void main(String[] args) {
		int array1[]={2212,2342,1234,3234,2334,2121,2043,3324,25646};
        String array2[]={"aneesh","kumar","abhi","ballondar","cincinati","dhaka"};
       for(int i=0;i<array1.length;i++)
       {
           for(int j=i+1;j<array1.length;j++)
           {
               if(array1[i]>array1[j])
               {
                   int temp=array1[i];
                   array1[i]=array1[j];
                   array1[j]=temp;
               }
               
           }
       }
       System.out.println(Arrays.toString(array1));
       
       for(int a=0;a<array2.length-1;a++)
       {
           for(int b=a+1;b<array2.length;b++)
           {
               if(array2[a].compareTo(array2[b])>0)
               {
                   String temp2=array2[a];
                   array2[a]=array2[b];
                   array2[b]=temp2;
               }
           }
       }
       System.out.println(Arrays.toString(array2));
       
   }

}
