package pickupLine;
import pickupLine.Gender;

public class main {
	public static void main(String args[]) {
		String name = "Jane";
		int age = 33;
		String bio = "Driving around the country, working from my campsite or Airbnb. Looking for the best hikes and 4x4 trails and maybe a new place to call home.\r\n" + 
				"\r\n" + 
				"⛰️🌲🥾🏕️🛣️";
		String job = "Software engineer";
		
		TheSelf me = TheSelf.builder().name("Mallory").build();
		HumanDate date = HumanDate.builder().name(name).age(33).bio(bio).job(job).build();
		System.out.println(me.comeUpWithPickupLine(date));
	}
}
