class Return{

	void m1(){
	System.out.println("m1 in class Return");
	}
	
	String m2(){
		System.out.println("m2 in class Return");
		return "Method";	
	}
	float m3(){
		System.out.println("m3 in class Return");
		return 12.34f;
	}
	String[] m4(){
		System.out.println("m4 is class Return");
		String ar1[] = {"Hello","hai"};
		return ar1;
	}

	int[] sort(int ar1[]){
		//int ar1[] = {1,-8,0,3,2,7,-9,11,10};
		
		for(int i = 0; i <= ar1.length-1; i++){
			int temp = 0;
			for(int j = i; j <= ar1.length-1; j++){
				if(ar1[i] > ar1[j]){
					temp = ar1[i];
					ar1[i] = ar1[j];
					ar1[j] = temp;
				} 

			}
		}
		return ar1;
	}

	void test(byte b, short c, int i, long l, float f, double d, boolean b2, char c1, String s2, boolean ar1[]){
		System.out.println("Test Method in Return Class");
	}
}
class Method{
	public static void main(String arg[]){
	Return o = new Return();
	o.m1();// caller
	String s1 = o.m2();
	System.out.println("s1 :- "+s1);
	float f1 = o.m3();
	System.out.println("f1 :- "+f1);
	String ar1[] = o.m4();
	for(int i = 0; i <= ar1.length-1; i++){
		System.out.println("Index :- "+i+" value :- "+ar1[i]);
		}

	System.out.println("=================");
	int ar3[] = {1,-8,0,3,2,7,-9,11,10};
	int ar2[] = o.sort(ar3);
	for(int i = 0; i <= ar2.length-1;i++){
		System.out.print(ar2[i]+" ");	
		}	
		int ar4[] = {505,606,707,808,909};
		int ar5[] = o.sort(ar4);
		System.out.println();
		for(int i = 0 ; i<= ar5.length-1 ; i++){
			System.out.println(ar5[i]+" ");
		}
		o.test((byte)12,(short)34,45,9875L,12.34f,56.78,false,'A',"Hello1",null);
	}
}
