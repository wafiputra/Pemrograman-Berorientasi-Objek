class prima{
	public static void main(String[] args){
		int index;
		int angka;

		String bilanganPrima = "";

		for(index = 1; index<=100; index++ ){
			int counter = 0;

			for(angka=index; angka>=1; angka--){
				if(index%angka == 0){
				counter = counter + 1;
				}
			}
			if(counter==2){
				bilanganPrima = bilanganPrima+index+" ";
			}
		}

		System.out.println("Bilangan Prima dari 1 sampai 100 :");
		System.out.println(bilanganPrima);
	}
}