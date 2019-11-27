import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * test
 */
public class test {
  public static void main(String[] args) {
    int [] a ={1, 3, 4, 7, 9, 11};
    int idx =2;
    ArrayList<Integer> list =new ArrayList<Integer>();
    for (int i = 0;i<a.length ;i++) {
      list.add(a[i]);
    }
    list.remove(idx);
    System.out.println(list);
    int [] ret =new int[list.size()];
    for (int i=0;i<list.size();i++) {
      ret[i] = list.get(i);
    }

    System.out.println(ret);
  }
}
