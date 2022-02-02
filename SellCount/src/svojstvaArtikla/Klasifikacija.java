package svojstvaArtikla;

public class Klasifikacija {
	
	private Integer sifra;
	private String naziv;
	
	public Klasifikacija(Integer sifra, String naziv) {
		this.sifra = sifra;
		this.naziv = naziv;
	}
	public Integer getSifra() {
		return sifra;
	}
	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}
