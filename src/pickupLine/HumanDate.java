package pickupLine;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class HumanDate extends Human {
	private int photos;
	// subjective values between 1 (min) and 10 (max) with normal distribution
	private float attractiveness;
	private float interest;

	public List<String> getActivities() {
	    List<String> allMatches = new ArrayList<String>();
	    Matcher m = Pattern.compile("\\b([a-z]+ing)", Pattern.CASE_INSENSITIVE).matcher(getBio());

	    while (m.find()) {
	    	allMatches.add(m.group(1));
	    }
		return allMatches;

	}
	public String getActivity() {
	    List<String> activities = this.getActivities();
	    if (activities.size() == 0) { return null; }
	    Random rand = new Random();
		return activities.get(rand.nextInt(activities.size()));
	}
}
