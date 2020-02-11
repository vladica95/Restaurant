
public class Konobar extends Covek {
	
	private String ime;
	private double promili;
	
	public Konobar (String ime)
	{
		super();
		this.ime = ime;
		promili = (Math.random()*3); 
	}
	
	public void primi(Narudzbina n)
	{
		if (promili>=1 && promili<= 2)
		{
			 
			double sansa = Math.random()*100;
			if (sansa >= 50.0)
			{
				super.na = new Narudzbina("cvarci kavurma brlja"); 
			}
			else super.na = n;
		}
		else if (promili>2)
			super.na = new Narudzbina("cvarci kavurma brlja"); 
		else
			super.na = n;
	}
	
	public Narudzbina izdeklamuj()
	{
		return super.na; 
	}
	
	public void pokupi(Porcija por)
	{
		super.po = por;
	}
	
	public Porcija usluzi()
	{
		return this.po;
	}
	
	public String feedback() {
			if (promili>1)
				return "ja sam srecan";
			else
				return "glava me nesto boli, ne znam sta je";
	}
	
	public String predstaviSe()
	{
		return this.ime;
	}
	

}
