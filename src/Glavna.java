
public class Glavna {
	
	public static void main(String args[])
	{
		Restoran restoran= new Restoran();
		
		Konobar k1 = new Konobar("Mirko");
		Konobar k2 = new Konobar("Slavko");
		Konobar k3 = new Konobar("Djole");
		Konobar k4 = new Konobar("Goran");
		
		Gost g1 = new Gost("prase tulumba pivo");
		Gost g2 = new Gost("jagnje baklava pivdzan");
		Gost g3 = new Gost("tele bombica boza");
		Gost g4 = new Gost("pile krofna djus");
		Gost g5 = new Gost("jastog kakao sampanjac");
		
		restoran.zaposli(k1);
		restoran.zaposli(k2);
		restoran.zaposli(k3);
		restoran.zaposli(k4);
				
		restoran.ugosti(g1);
		restoran.ugosti(g2);
		restoran.ugosti(g3);
		restoran.ugosti(g4);
		restoran.ugosti(g5);
		
		restoran.posluzi();
		
	}

}
