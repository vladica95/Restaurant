
public class SvedskiKuvar {
	
	public static void skuvajOvo(Konobar k)
	{
		Narudzbina n = k.izdeklamuj();
		String pom[] = n.toString().split(" ");
		Porcija p = new Porcija(pom[0],pom[1],pom[2]);
		k.pokupi(p);
	}
}
