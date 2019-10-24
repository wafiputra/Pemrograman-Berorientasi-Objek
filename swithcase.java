class swithcase{
	public static void main(String[] args){
	String musim = "dingin";
	String bulan;

		switch (musim.toLowerCase()){
			case "dingin" :
			bulan = "Desember, Januari, dan Februari";
			break;

			case "semi" :
			bulan = "Maret, April, dan Mei";
			break;
			
			case "panas" :
			bulan = "Juni, Juli, dan Agustus";
			break;

			case "gugur" :
			bulan = "September, Oktober, dan November";
			break;

			default :
			bulan = " ";
			break;
		}

		System.out.println("Musim "+musim+" terjadi pada bulan "+bulan);
	}
}