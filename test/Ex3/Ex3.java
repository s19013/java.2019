import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

class Ex3{

	public String ex3_0(int n){
    String ret = "";
    if (n > 0) {
      ret = "その値は正です";
    } else {
      ret = "その値は０か負です";
    }
		return ret;
	}

	public int ex3_1(int n){
		if (n > 0)
		{
			return n;
		}
		else if (n < 0)
		{
			return -n;
		}
		else {
			return  0;
		}
	}

	public String ex3_2(int a, int b){
		String mes = "";
		if (a%b==0) {
			mes = "4は12の約数です";
			return mes;
		}
		else {
			mes = "5は12の約数ではありません";
			return mes;
		}
	}

	public String ex3_3(int a, int b){
		if (a > b)
		{
			return "8の方が大きいです";
		}
		else if (a < b){
			return "9の方が大きいです";
		}
		else{
			return "同じ値です";
		}
	}

	public String ex3_4(int a){
		if (a > 0 && a % 5 == 0) {
			return  "その値は5で割り切れます";
		}
		else if (a < 0) {
			return "正でない整数値です";
		}
		else {
			return "その値は5で割り切れません";
		}
	}

	public String ex3_5(int a){
		if (a % 10==0) {
			return "その値は10の倍数です";
		}
		else if (a < 0) {
			return "正でない整数値です";
		}
		else {
			return "その値は10の倍数ではありません";
		}
	}

	public String ex3_6(int a){
		if (a > 0 && a % 3 == 0) {
			return "その値は3で割り切れます";
		}
		else if (a > 0 && a % 3 == 1) {
			return "その値を3で割った余りは1です";
		}
		else if (a > 0 && a % 3 == 2) {
			return "その値を3で割った余りは2です";
		}
		else {
			return "正でない整数値です";
		}
	}

	public String ex3_7(int a){
		if (0 <= a && a <= 59) {
			return "不可";
		}
		else if (60 <= a  && a <= 69) {
			return "可";
		}
		else if (70 <= a && a <= 79) {
			return "良";
		}
		else if (80 <= a && a <= 100) {
			return "優";
		}
		else {
			return "範囲(0～100)外の値です";
		}
	}

	public double ex3_8(double a, double b){
		return Math.max(a, b);
	}

	public int ex3_9(int a, int b){
		return a-b;
	}

	public String ex3_10(int a, int b){
		int c = a-b;
		if (c <= 10) {
			return "それらの差は10以下です";
		}
		else {
			return "それらの差は11以上です";
		}
	}

	public int ex3_11(int a, int b, int c){
		ArrayList<Integer> data = new ArrayList<Integer>();
		int min = c;
		data.add(a);
		data.add(b);
		for(int i = 0; i < data.size(); i++){
			min = Math.min(min,data.get(i));
		}
		return min;
	}

	public int ex3_12(int a, int b, int c){
		int mi = 0;
		if (a<=b && a<=c) {
			mi = a;
		}
		else if (b<=a && b<=c) {
			mi = b;
		}
		else {
			mi = c;
		}
		if (mi == a && b<=c) {
			return b;
		}
		else if (mi == a && c<=b) {
			return c;
		}
		else if (mi == b && a<=c) {
			return a;
		}
		else if (mi == b && c<=a) {
			return c;
		}
		else if (mi == c && b<a) {
			return b;
		}
		else {
			return a;
		}


	}

	public String ex3_13(int a){
		if (a> 0 &&(a==12 || a<=2)) {
			return "冬";
		}
		else if (a > 0 &&(3<=a && a<=5)) {
			return "春";
		}
		else if (a > 0 &&(6<=a && a<=8)) {
			return "夏";
		}
		else if (a > 0 &&(9<=a && a<=11)) {
			return "秋";
		}
		else {
			return "範囲(1～12)外の値です";
		}
	}
}
