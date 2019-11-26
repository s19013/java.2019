import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Ex4{

	public int [] ex4_1(int [] a){
		int[] t = new int[a.length];
      for( int i = 0; i < t.length; i++ ){
				t[i] = a[i] ;
			}
				Arrays.sort(t);

		// int[] b = Arrays.sort(t)
		return t;
	}

	public int [] ex4_2(int [] a){
		int[] t = new int[a.length];
		int[] t2 = new int[a.length];
    for( int i = 0; i < t2.length; i++ ){
			t2[i] = a[i] ;
		}
		Arrays.sort(t2);
		for( int i = 0; i < t2.length; i++ ){
			t[i] = t2[t2.length - 1 -i] ;
		}
		return t;
	}

	public String [] ex4_3(int [] a){
		String[] t = new String[a.length];
		for (int i = 0; i < a.length ;i++ ) {
			int A = a[i];
			if (A < 0) {
				t[i] = "負";
			}
			else if (A == 0) {
				t[i] = "零";
			}
			else {
				t[i] = "正";
			}
		}

		return t;

	}

	public int ex4_4(int a){
		int A = String.valueOf(a).length();

		return A;

	}

	public int ex4_5(int a){
		int A = 0;
		for (int i = 1;i<=a ;i++ ) {
			A += i;
		}

		return A;

	}

	public int [] ex4_6(int a){

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1;i<=a ;i++) {
			if (a%i == 0) {
				list.add(i);
			}
		}
		int[] ret = new int[list.size()];
		for (int i = 0; i< list.size() ;i++) {
			ret[i] = list.get(i);
		}
		return ret;

	}

	public boolean ex4_7(int a){
		boolean RE = true;
		if (a == 1) {
			RE = false;
		}
		else {
			for (int i = 2; i < a ;i++ ) {
				if (a % i == 0 ) {
					RE = false;
				}
			}
		}
		return RE;
	}

	public int ex4_8(int [] a){
		int ret = 0;
		for (int i = 0; i < a.length ;i++ ) {
			ret += a[i];
		}

		return ret;

	}

	public int ex4_9(int [] a){
		double ret = 0;
		for (int i = 0; i < a.length ;i++ ) {
			ret += a[i];
		}
		int i =  (int) (Math.round(ret /=a.length));

		return i;

	}
}
