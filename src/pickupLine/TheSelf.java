package pickupLine;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class TheSelf extends Human {

	public String comeUpWithPickupLine(HumanDate date) {
		String activity = date.getActivity();
		if (date.getBio().toLowerCase().contains("dog")) {
			return "would you like to meet my dog?";
		}
		else if (date.getJob().toLowerCase().contains("software")) {
			return "<<send them this code>>";
		}
		else if(activity != null) {
			return String.format("I love %s would you like to go %s with me", activity, activity);
		}
		else if (date.getGender() != null) {
			return String.format("Me to my friend \"Hey %s is super cute. How should I ask for %s number?\"", date.getGender().getSubject(), date.getGender().getPossesssiveAdjective());
		}
		else {
			return "I'm a lonely software developer Please love me";
		}
	}
}
