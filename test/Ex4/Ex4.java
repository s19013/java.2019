import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Ex4{

	public int [] ex4_1(int [] a){
		int[] t = new int[a.length];
      for( int i = 0; i < t.length; i++ )
      	t[i] = a[i] ;
				Arrays.sort(t);

		// int[] b = Arrays.sort(t)
		return t;
	}

	public int [] ex4_2(int [] a){
		Integer[] t = new Integer[a.length];
    for( int i = 0; i < t.length; i++ )
      t[i] = a[i] ;

		// Arrays.sort(t);
		Arrays.sort(t, Collections.reverseOrder());
		return t;
	}

	public String [] ex4_3(int [] a){

		String [] hantei = {"dummy"};

		return hantei;

	}

	public int ex4_4(int a){

		return -1;

	}

	public int ex4_5(int a){

		return -1;

	}

	public int [] ex4_6(int a){

		int [] ret = new int[1];

		return ret;

	}

	public boolean ex4_7(int a){

		return false;

	}

	public int ex4_8(int [] a){

		int ret = 0;

		return ret;

	}

	public int ex4_9(int [] a){

		int ret = 0;

		return ret;

	}
}
