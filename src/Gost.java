
public class Gost extends Covek {
	
	private Konobar mojKonobar;
	
	public Gost (String na)
	{
		super(new Narudzbina(na));
	}
	
	public void primi(Konobar k)
	{
		usluzi()
		super.po = k.usluzi();		
		this.mojKonobar = k;
	}
	
	public Narudzbina izjasniSe()
	{
		return super.na;
	}

	public String feedback() {
		
		String zadovoljan = "i nisam zadovoljan!";
	
		if(super.po != null)
		{
			if(super.po.toString().equals(super.na.toString()) )
				zadovoljan = "i zadovoljan sam :-)";
			
			return ("narucio: " + super.na.toString() + ", a dobio sam: " + super.po.toString() + ", služio me: " + mojKonobar.predstaviSe()+ ", " + zadovoljan);
		}
		
		else
		{
			return ("Mene ovde niko nije usluzio! Nema konobara! Na sta ovo lici? Prijavicu vas!");
		}
		
	}
}
