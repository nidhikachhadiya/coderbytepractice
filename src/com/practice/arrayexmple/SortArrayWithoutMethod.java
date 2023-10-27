package com.practice.arrayexmple;

public class SortArrayWithoutMethod {

    public static void main(String[] args) {
        int a[]={0,1,2,0,2,1,0};
        int temp=0;
        for (int i=0;i<a.length;i++){
            for (int j=i+1; j<a.length;j++){
                if(a[i]>a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
       String aString[]={"Nidhi","Ravi","Kachhadiya","Jiyani"};
        String tempS;
        for(int i=0;i<aString.length;i++){
            for(int j=i+1;j<aString.length;j++){
              if(aString[i].compareTo(aString[j])>0){
                  tempS=aString[i];
                  aString[i]=aString[j];
                  aString[j]=tempS;
              }
            }
            System.out.println(aString[i]);
        }
    }
}
