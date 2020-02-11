
public abstract class Covek {
	
	protected Porcija po;
	protected Narudzbina na;
	
	public Covek()
	{
		po = null;
		na = null;
	}
	
	
	public Covek(Narudzbina na)
	{
		this.na = na;
		this.po = null;
	}
	public abstract String feedback();

}
