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
      ArrayList<Integer> list =new ArrayList<Integer>();
      for (int i = 0;i<a.length ;i++) {
        list.add(a[i]);
      }
      int index = list.indexOf(key);

        return index;
    }

    public int ex6_6(int [] a, int key){
      ArrayList<Integer> list =new ArrayList<Integer>();
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
      if (idx == n) {
        int [] ret = new int[list.size()];
        for (int i = 0 ;i<list.size();i++){
          ret[i]=list.get(i);
        }
          return ret;
      }
      else {
        list.subList(idx, n+idx).clear();;
      }
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
      ArrayList<Integer> list =new ArrayList<Integer>();
      for (int i = 0;i<a.length ;i++) {
        list.add(a[i]);
      }

      list.add(idx,x);
      int [] ret = new int[list.size()];
      for (int i = 0 ;i<list.size();i++){
        ret[i]=list.get(i);
      }
        return ret;
    }

    public void ex6_10(int [] a, int [] b){
      int[] ea = new int[a.length];
      int[] eb = new int[b.length];
      int min = Math.min(a.length,b.length);
      for (int i=0;i<min;i++ ) {
        ea[i]=b[i];
      }
      for (int i=0;i<min;i++ ) {
        eb[i]=a[i];
      }
      for (int i=min;i<a.length ;i++ ) {
        ea[i]=a[i];
      }
      for (int i=min;i<b.length ;i++ ) {
        eb[i]=b[i];
      }

      for (int i=0;i<ea.length ;i++ ) {
        a[i]=ea[i];
      }
      for (int i=0;i<eb.length ;i++ ) {
        b[i]=eb[i];
      }
    }

    public int [] ex6_11(int [] a){

        int [] ret =a.clone();

        return ret;
    }

    public int [] ex6_12(int [] a, int x){
      ArrayList<Integer> ea =new ArrayList<Integer>();
      ArrayList<Integer> list =new ArrayList<Integer>();
      // int result = 0;
      for (int i = 0;i<a.length ;i++) {
        ea.add(a[i]);
      }
      for (int i = 0; i < ea.size(); i++) {
        if (ea.get(i) == x) {
          list.add(i);
        }
          }
      int [] ret = new int[list.size()];
      for (int i = 0 ;i<list.size();i++){
        ret[i]=list.get(i);
      }

      return ret;
  }

    public int [] ex6_13(int [] a, int idx){
      ArrayList<Integer> list =new ArrayList<Integer>();
      for (int i = 0;i<a.length ;i++) {
        list.add(a[i]);
      }
      if (idx>0 && idx!=0 && idx != a.length) {
        list.remove(idx);
      }

      int [] ret = new int[list.size()];
      for (int i = 0 ;i<list.size();i++){
        ret[i]=list.get(i);
      }

      return ret;
    }

    public int [] ex6_14(int [] a, int idx, int n){
      ArrayList<Integer> list =new ArrayList<Integer>();
      for (int i = 0;i<a.length ;i++) {
        list.add(a[i]);
      }
      if (idx < 0 || n < 0 || idx > n) {
        int [] ret = new int[list.size()];
        for (int i = 0 ;i<list.size();i++){
          ret[i]=list.get(i);
        }
          return ret;
      }
      else {
        if (n>a.length) {
          n = a.length;
        }
        list.subList(idx, n+idx).clear();;
      }

      int [] ret = new int[list.size()];
      for (int i = 0 ;i<list.size();i++){
        ret[i]=list.get(i);
      }

        return ret;
    }

    public int [] ex6_15(int [] a, int idx, int x){
      ArrayList<Integer> list =new ArrayList<Integer>();
      for (int i = 0;i<a.length ;i++) {
        list.add(a[i]);
      }

      if (idx < 0) {
        list.add(0,x);
      }
      else {
        list.add(idx, x);
      }

      int [] ret = new int[list.size()];
      for (int i = 0 ;i<list.size();i++){
        ret[i]=list.get(i);
      }
        return ret;
    }
}
