class Example8
{
 public static void main(String[]args)
      {
	long curPopulation=312032486;
	long sec=(365*24*60*60)*5;
	long birth=sec/7;
	long death=sec/13;
	long immigrants=sec/45;
	
	long newPopulation=(curPopulation+birth+immigrants)-death;
	 
	 System.out.println("Current Population: " +curPopulation);
	 System.out.println("New Population after 5 years : " +newPopulation);
	}
}