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
		String s = String.valueOf(x);
		final String oct = s;
		final int dec = Integer.parseInt(oct, 10);
		final String bin = Integer.toBinaryString(dec);
		return bin;
	}

	public String ex7_3(short x){

		String ret = "";

		return ret;
	}

	public String ex7_3(int x){
		String ret = "";

		return ret;
	}

	public String ex7_3(long x){

		String ret = "";

		return ret;
	}
}
