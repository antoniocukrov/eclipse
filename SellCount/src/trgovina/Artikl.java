package trgovina;

import svojstvaArtikla.Klasifikacija;

public class Artikl extends Klasifikacija {

	private Integer sifra;
	private String naziv;
	private String EANcode;
	private Double cijena;
	private String JM;

	public Artikl(Integer sifra, String naziv, Integer sifra2, String naziv2, String eANcode, Double cijena,
			String jM) {
		super(sifra, naziv);
		sifra = sifra2;
		naziv = naziv2;
		EANcode = eANcode;
		this.cijena = cijena;
		JM = jM;
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

	public String getEANcode() {
		return EANcode;
	}

	public void setEANcode(String eANcode) {
		EANcode = eANcode;
	}

	public Double getCijena() {
		return cijena;
	}

	public void setCijena(Double cijena) {
		this.cijena = cijena;
	}

	public String getJM() {
		return JM;
	}

	public void setJM(String jM) {
		JM = jM;
	}

}
