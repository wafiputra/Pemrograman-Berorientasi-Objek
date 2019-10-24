class konversi{
	public static void main(String[] args){
		double c=27, f=72, k=167, r=227;
		double fahrenheit, kelvin, reamur, celcius;

		konversi suhu = new konversi();
		fahrenheit = suhu.ckef(c);
		kelvin = suhu.fkek(f);
		reamur = suhu.kker(k);
		celcius = suhu.rkec(r);

		System.out.println("Hasil dari konversi Celsius ke Fahrenheit : "+fahrenheit);
		System.out.println("Hasil dari konversi Farenheit ke Kelvin: "+kelvin); 
		System.out.println("Hasil dari konversi Kelvin ke Reamur : "+reamur); 
		System.out.println("Hasil dari konversiu Reamur ke Celcius : "+celcius);
	}
	
	double ckef(double a){ 
		return (a*1.8+32); 
	}

	 double fkek(double b){ 
		return ((b+459.67)/ 1.8); 
	}

	double kker(double c){ 
		return ((c-273.15)*0.8); 
	}

	double rkec(double d){ 
		return (d/0.8); 
	}
}