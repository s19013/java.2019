import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Ex6{

    public int [] ex6_1(){
      int [] ret = new int[5];
      for (int i=0 ;i<5 ;i++ ) {
        ret[i]=5-i;
      }


        return ret;
    }

    public double [] ex6_2(){
      double [] ret = new double[5];
      ret[0]=1.1;
      ret[1]=2.2;
      ret[2]=3.3;
      ret[3]=4.4;
      ret[4]=5.5;
      return ret;
    }

    public int [] ex6_3(int a, int b){
      int [] ret = new int[a];
      for (int i=0;i<a ;i++) {
        ret[i] = b;
      }


        return ret;
    }

    public int [] ex6_4(int [] a){
      int [] resalt = new int[4];
      double sum = 0;
      int ave = 0;
      int max = a[0];
      int min = a[0];
      for (int i = 0;i < a.length ;i++ ) {
        sum += a[i];
      }
      int isum = (int)sum;
      ave =(int)Math.round(sum/a.length);
      // int iave = (int)ave;
      for(int i = 0; i < a.length; i++)
        max = Math.max(max,a[i]);
      for(int i = 0; i < a.length; i++)
        min = Math.min(min,a[i]);

      resalt[0] = isum;
      resalt[1] = ave;
      resalt[2] = max;
      resalt[3] = min;
        return resalt;
    }

    public int ex6_5(int [] a, int key){
      // int[] b = new int[a.length];
      // for( int i = 0; i < a.length; i++ ){
      //   b[i] = a[i] ;
      // }
      // ArrayList list = new ArrayList(Arrays.asList(a));
      ArrayList<Integer> list =new ArrayList();
      for (int i = 0;i<a.length ;i++) {
        list.add(a[i]);
      }
      int index = list.indexOf(key);

        return index;
    }

    public int ex6_6(int [] a, int key){
      ArrayList<Integer> list =new ArrayList();
      for (int i = 0;i<a.length ;i++) {
        list.add(a[i]);
      }
      int index = list.lastIndexOf(key);
        return index;
    }

    public int [] ex6_7(int [] a, int idx){
      ArrayList<Integer> list =new ArrayList<Integer>();
      for (int i = 0;i<a.length ;i++) {
        list.add(a[i]);
      }
      list.remove(idx);
      int [] ret = new int[list.size()];
      for (int i = 0 ;i<list.size();i++){
        ret[i]=list.get(i);
      }
        return ret;
    }

    public int [] ex6_8(int [] a, int idx, int n){
      ArrayList<Integer> list =new ArrayList<Integer>();
      for (int i = 0;i<a.length ;i++) {
        list.add(a[i]);
      }
      list.subList(idx, n+1).clear();;
      // for (int i=idx;i<n;i++) {
      //   list.remove(i);
      // }
      int [] ret = new int[list.size()];
      for (int i = 0 ;i<list.size();i++){
        ret[i]=list.get(i);
      }
        return ret;

    }

    public int [] ex6_9(int [] a, int idx, int x){

        int [] ret = new int[1];

        return ret;
    }

    public void ex6_10(int [] a, int [] b){

        return;
    }

    public int [] ex6_11(int [] a){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex6_12(int [] a, int x){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex6_13(int [] a, int idx){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex6_14(int [] a, int idx, int n){

        int [] ret = new int[0];

        return ret;
    }

    public int [] ex6_15(int [] a, int idx, int x){

        int [] ret = new int[0];

        return ret;
    }
}
