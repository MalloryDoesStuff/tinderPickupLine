package pickupLine;

import lombok.experimental.SuperBuilder;

import lombok.Data;

@SuperBuilder
@Data
public abstract class Human {
	private String name;
	private int age;
	private Gender gender;
	private String bio;
	private String job;	
}
