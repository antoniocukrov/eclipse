package trgovina;

public class Primka extends Djelatnik {

	private Integer sifra;
	private String brojotpremnice;
	private String dobavljac;

	public Primka(Integer sifra, String naziv, String lozinka, Integer sifra2, String brojotpremnice,
			String dobavljac) 
	{
		super(sifra, naziv, lozinka);
		sifra = sifra2;
		this.brojotpremnice = brojotpremnice;
		this.dobavljac = dobavljac;
	}

	public Integer getSifra() {
		return sifra;
	}

	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}

	public String getBrojotpremnice() {
		return brojotpremnice;
	}

	public void setBrojotpremnice(String brojotpremnice) {
		this.brojotpremnice = brojotpremnice;
	}

	public String getDobavljac() {
		return dobavljac;
	}

	public void setDobavljac(String dobavljac) {
		this.dobavljac = dobavljac;
	}

}
