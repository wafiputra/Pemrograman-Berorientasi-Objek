class mahasiswa{
	private String nama;
	private String umur;
	private String asalsekolah;
	private String tahunlulus;
	private String JK;
	public mahasiswa(String nama, String umur, String asalsekolah, String tahunlulus, String JK){
		this.nama=nama;
		this.umur=umur;
		this.asalsekolah=asalsekolah;
		this.tahunlulus=tahunlulus;
		this.JK=JK;
	}

	public void keterangan(){
		System.out.println("Nama : "+this.nama);
		System.out.println("Umur : "+this.umur);
		System.out.println("Asal Sekolah : "+this.asalsekolah);
		System.out.println("Tahun Lulus : "+this.tahunlulus);
		System.out.println("JK : "+this.JK);
		System.out.println("Pendaftaran Mahasiswa berhasil dilakukan");
	}
}

public class pendaftaran{
	public static void main(String[] args){
		mahasiswa formpendaftaran;
		
		formpendaftaran=new mahasiswa("Wafi Putra Aryansyah", "19", "SMK Telkom Purwokerto", "2018", "Laki-laki");

		formpendaftaran.keterangan();
	}
}