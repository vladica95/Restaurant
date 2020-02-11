
public class Restoran {
	
	private Konobar[] kelner;
	private Gost[] musterija;
	private int brKelnera;
	private int brMusterija;
	
	public Restoran()
	{
		brKelnera = 0;
		brMusterija = 0;
	}
	
	public void zaposli(Konobar k)
	{
		 
		if (brKelnera == 0)
		{
			System.out.println("Nema kelnera, pravim niz duzine 1, upisujem kelnera: " + k.predstaviSe());
			kelner = new Konobar[1];
			kelner[0] = k;
			brKelnera = 1;
			System.out.println("Zavrsio sam sa upisom prvog kelnera.");
			System.out.println("================================");
		}
		 
		else
		{
			System.out.println("Upisujem novog kelnera u postojeci niz kelnera. brKelnera je trenutno: "+brKelnera);
			System.out.println("Trenutni niz kelnera je:");
			for (int i=0; i<brKelnera; i++)
			{
				System.out.println("kelner["+i+"] je "+ kelner[i].predstaviSe());
			}
			System.out.println("------------------------------");
			System.out.println("Formiran novi pomocni niz kelnera, duzine "+(brKelnera+1));
			Konobar pomK[] = new Konobar[brKelnera+1];
			for (int i=0; i<brKelnera; i++)
			{
				System.out.println("pomK["+i+"]=kelner["+i+"] a to je " + (kelner[i].predstaviSe()));
				pomK[i] = kelner[i];
			}
			pomK[brKelnera]=k;
			this.kelner = pomK;
			System.out.println("Upisan je novi kelner, broj "+(brKelnera+1)+", sada je br kelnera = "+(brKelnera+1));
			brKelnera++;
			System.out.println("Novi niz kelnera je:");
			for (int i=0; i<brKelnera; i++)
			{
				System.out.println("kelner["+i+"] je "+ kelner[i].predstaviSe());
			}
			System.out.println("================================");
		}
	}
	
	public void ugosti (Gost g)
	{
		 
				if (brMusterija == 0)
				{
					System.out.println("Nema gostiju, pravim niz duzine 1, upisujem prvog gosta.");
					musterija = new Gost[1];
					musterija[0] = g;
					brMusterija = 1;
					System.out.println("Zavrsio sam sa smestanjem prvog gosta.");
					System.out.println("================================");
				}
				 
				else
				{
					System.out.println("Upisujem novog gosta u postojeci niz gostiju. brMusterija je trenutno: "+brMusterija);
					System.out.println("Trenutni niz gostiju je:");
					for (int i=0; i<brMusterija; i++)
					{
						System.out.println("musterija["+i+"]");
					}
					System.out.println("------------------------------");
					System.out.println("Formiran novi pomocni niz musterija, duzine "+(brMusterija+1));
					Gost pomG[] = new Gost[brMusterija+1];
					for (int i=0; i<brMusterija; i++)
					{
						System.out.println("pomG["+i+"]=musterija["+i+"]");
						pomG[i] = musterija[i];
					}
					pomG[brMusterija]=g;
					this.musterija = pomG;
					System.out.println("Smesten je novi gost, broj "+(brKelnera+1)+", sada je br gostiju = "+(brKelnera+1));
					brMusterija++;
					System.out.println("Novi niz gostiju je je:");
					for (int i=0; i<brMusterija; i++)
					{
						System.out.println("musterija["+i+"]");
					}
					System.out.println("================================");
				}
	}  
	public void posluzi()
	{
		System.out.println("Broj gostiju je: "+brMusterija+", broj konobara je: "+brKelnera);
		
		int brojac = Math.min(brMusterija, brKelnera);
		System.out.println("Manji od ta dva je: "+brojac+", i brojim dotle.");
		int i=0;
		
		 
		while (i < brojac)
		{
		 
			System.out.println("kelner "+i+" uzima narudzbinu od gosta "+i);
			kelner[i].primi(musterija[i].izjasniSe());
			 
			System.out.println("kelner "+i+" daje svedskom kuvaru da skuva");
			SvedskiKuvar.skuvajOvo(kelner[i]);
			 
			System.out.println("gost "+i+" prima porciju od konobara "+i);
			musterija[i].primi(kelner[i]);
			i++;
		}
		 
		
		System.out.println("======== feedback konobara =========");
		
		for (i=0; i<brKelnera; i++)
			System.out.println(kelner[i].feedback());
		
		System.out.println("======== feedback gostiju ==========");
				
		for (i=0; i<brMusterija; i++)
			System.out.println(musterija[i].feedback());
		
	}  
	
}  