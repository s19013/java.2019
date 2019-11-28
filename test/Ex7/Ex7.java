import java.util.StringJoiner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Ex7{

	public int ex7_1(int a, int b){
		if (a <= b) {
			return a;
		}
		else {
			return b;
		}
	}

	public int ex7_1(int a, int b, int c){
		if (a<=b && a<=c) {
			return a;
		}
		else if (b<=a && b<=c) {
			return b;
		}
		else {
			return c;
		}
	}

	public int ex7_1(int [] a){
		int[] arr = new int[a.length];
		for( int i = 0; i < a.length; i++ ){
			arr[i] = a[i] ;
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
		    int v = arr[i];
		    if (v < min) {
		        min = v;
		    }
		}
		return min;
	}

	public int ex7_2(int x){
		if (x < 0) {
			x *= -1;
		}

		return x;
	}

	public long ex7_2(long x){
		if (x < 0) {
			x *= -1;
		}

		return x;
	}

	public float ex7_2(float x){
		if (x < 0) {
			x *= -1;
		}

		return x;
	}

	public double ex7_2(double x){
		if (x < 0) {
			x *= -1;
		}

		return x;
	}

	public String ex7_3(byte x){
		// final String oct = s;
		// final int dec = Integer.parseInt(oct, 8);
		// final String bin = Integer.toBinaryString(dec);
		String binary = Integer.toBinaryString( x );
		String[] split = binary.split("");
		ArrayList<String> list =new ArrayList<String>();
		for (int i = 0;i<split.length ;i++) {
			list.add(split[i]);
		}
		int l = list.size();
		if (l<8) {
			for (int i=0;i<8-l;i++) {
				list.add(0,"0");
			}
		}
		else if (l>8) {
			list.subList(0, list.size()-8).clear();;
		}
		String [] list2 = new String[list.size()];
		for (int i = 0 ;i<list.size();i++){
			list2[i]=list.get(i);
		}
		String A = String.join("", list2);
		return A;
	}

	public String ex7_3(short x){
		String binary = Integer.toBinaryString( x );
		String[] split = binary.split("");
		ArrayList<String> list =new ArrayList<String>();
		for (int i = 0;i<split.length ;i++) {
			list.add(split[i]);
		}
		int l = list.size();
		if (l<16) {
			for (int i=0;i<16-l;i++) {
				list.add(0,"0");
			}
		}
		else if (l>16) {
			list.subList(0, list.size()-16).clear();;
		}
		String [] list2 = new String[list.size()];
		for (int i = 0 ;i<list.size();i++){
			list2[i]=list.get(i);
		}
		String A = String.join("", list2);
		return A;
	}

	public String ex7_3(int x){
		String binary = Integer.toBinaryString( x );
		String[] split = binary.split("");
		ArrayList<String> list =new ArrayList<String>();
		for (int i = 0;i<split.length ;i++) {
			list.add(split[i]);
		}
		int l = list.size();
		if (l<32) {
			for (int i=0;i<32-l;i++) {
				list.add(0,"0");
			}
		}
		else if (l>32) {
			list.subList(0, list.size()-32).clear();;
		}
		String [] list2 = new String[list.size()];
		for (int i = 0 ;i<list.size();i++){
			list2[i]=list.get(i);
		}
		String A = String.join("", list2);
		return A;

	}

	public String ex7_3(long x){
		String binary = Integer.toBinaryString( x );
		String[] split = binary.split("");
		ArrayList<String> list =new ArrayList<String>();
		for (int i = 0;i<split.length ;i++) {
			list.add(split[i]);
		}
		int l = list.size();
		if (l<64) {
			for (int i=0;i<64-l;i++) {
				list.add(0,"0");
			}
		}
		else if (l>64) {
			list.subList(0, list.size()-64).clear();;
		}
		String [] list2 = new String[list.size()];
		for (int i = 0 ;i<list.size();i++){
			list2[i]=list.get(i);
		}
		String A = String.join("", list2);
		return A;

	}
}
