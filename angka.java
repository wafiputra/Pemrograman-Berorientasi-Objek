class angka{
	public static void main(String[] args){

		int i;
		System.out.println("\nPerulangan dengan For");
			for(i=1; i<=10; i++){
				System.out.print(Integer.toString(i));
				System.out.print(" ");
			}
		
		System.out.println("\nPerulangan dengan While");
		i=1;
		while(i<=10){
			System.out.print(Integer.toString(i));
			System.out.print(" ");
			i++;
		}

		System.out.println("\nPerulangan dengan Do-While");
		i=1;
		do{
			System.out.print(Integer.toString(i));
			System.out.print(" ");
			i++;
		}while(i<=10);
	}
}