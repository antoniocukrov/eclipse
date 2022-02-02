package trgovina;

public class Djelatnik {

	private Integer sifra;
	private String naziv;
	private String lozinka;

	public Djelatnik(Integer sifra, String naziv, String lozinka) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.lozinka = lozinka;
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

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

}
