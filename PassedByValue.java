class TestPass{
	int i,j;
	TestPass(int a, int b){
		i=a;
		j=b;
	}
	//passed by value dengan parameter berupa tipe data primitif
	void calculate(int m, int n){
		m=m*10;
		n=n/2;
	}
	//passed by reference dengan berupa tipe data class
	void calculate(TestPass e){
		e.i=e.i*10;
		e.j=e.j/2;
	}
}
class PassedByValue{
	public static void main(String[] args){
		int x, y;
		TestPass z;
		z = new TestPass(50, 100);
		x = 10;
		y = 20;

		System.out.println("Nilai sebelum passed by value : ");
		System.out.println("X = "+x);
		System.out.println("Y = "+y);

		//passed by value
		z.calculate(x,y);
		System.out.println("Nilai sesudah passed by value : ");
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		System.out.println("Nilai sebelum passed by reference : ");
		System.out.println("z.i = "+z.i);
		System.out.println("z.j = "+z.j);

		//passed by reference
		z.calculate(z);
		System.out.println("Nilai sesudah passed by reference : ");
		System.out.println("z.i = "+z.i);
		System.out.println("z.j = "+z.j);
	}
}