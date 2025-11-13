class Example7
{
	public static void main(String[]args)
	{
	 double distanceInKm=24*1.6;
	 double minutesToHours=40.0/60.0;
	 double secondsToHours=35.0/3600.0;
	 double hours=1.0;
	 double totalHours=hours+minutesToHours+secondsToHours;


	 
	 double averageSpeed=distanceInKm/totalHours;
	 
	 System.out.printf("Runner takes %f Hours to complete %f distance in kilometers\n with an average speed of %f km per hour",totalHours,distanceInKm,averageSpeed);
	}
}