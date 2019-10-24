class cobain{
	public static void main(String[] args){
		int J = 10;
		int K;

		while(J>=1){
			K = 1;
			while(K<=J){
				System.out.print(K*J);
				System.out.print(" ");
				K++;
			}
			System.out.print("\n");
			J--;
		}
	}
}