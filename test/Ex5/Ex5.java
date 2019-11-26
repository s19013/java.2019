class Ex5{

	public double ex5_1(int [] a){
		double ret = 0;
		for (int i = 0; i < a.length ;i++ ) {
			ret += a[i];
		}
		ret /=a.length;
		return ret;
	}
}
