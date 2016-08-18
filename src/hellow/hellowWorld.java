package hellow;

public class hellowWorld {

	
	public static  void newFunct (double a, double b, double c, double d){
		
		double out = a*(b+(c/d));
		System.out.println(out);
		
	}
	public static void ot10_do20(double a,double b) {
		boolean b1;
		
		if (a+b>10 && a+b<20) {
			b1 = true;
		}else{
			b1 = false;
		}
		System.out.println(b1);
	} //
	
	private static boolean god(int g) {
		boolean bb2;
		if (g%4 == 0 && g%100!=0) {
			bb2 = true;
		}else if(g%400==0){
			bb2 = true;
			}
		else{
			bb2 = false;
		}
		
		return bb2;

	}
	
	public static void main(String[] args) {
		/*
		byte b1 = -128;  //8
		short s1 = 32767; //16
		int i1=   2147483647; //32 (+/1)
		long l1 = 9223372036854775807L; //64
		float f1 = 120.0f; //
		double d1 = 15.721;
		
		boolean bb1= true;
		char c1 = 'Z';
		*/
	//	newFunct(4,3,2,1);
	// ot10_do20(10,9);
	System.out.println("ГГГ "+god(8));	
	}

}
