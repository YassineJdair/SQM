package implementation;

//importing interfaces
import interfaces.Job;
import interfaces.Person;

public class PersonImpl implements Person {

	// variables
	String name;
	int age;
	Job job;
	// person = p;

	private static final int ADULT_AGE = 18;
	// private static final int YOUNGER_THAN = 3;

	// this.name = n;
	// this.age = 53;

	public PersonImpl(String n, int a) {
		// constructor
		this.age = a;
		this.name = n;
	}

	@Override
	public String getName() {
		// returns name
		return name;
	}

	@Override
	public int getAge() {
		// returns age
		return age;
	}

	@Override
	public Job getJob() {
		// returns job
		return job;
	}

	@Override
	public void setJob(Job j) {
		// sets job
		this.job = j;

	}

	@Override
	public void setAge(int a) {
		// sets age if age is greater than 0
		if (a >= 0) {
			this.age = a;
		}
	}

	@Override
	public void setName(String n) {
		// sets name if name is null
		if (n != "" && n != null) {
			this.name = n;
		}

	}

	@Override
	public boolean equals(Person p) {
		// adds new person with name and age to
		Person s = new PersonImpl(name, age);
		if (s.getAge() == p.getAge()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean olderThan(Person p) {
		Person s = new PersonImpl(name, age);
		if (s.getAge() > p.getAge()) {
			return true;
		} else {

			return false;
		}
	}

	@Override
	public boolean youngerThan(Person p) {
		Person s = new PersonImpl(name, age);
		if (s.getAge() < p.getAge()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isAdult() {
		// returns adult if age is greater than adult age which is 18
		return this.age >= ADULT_AGE;

	}

	@Override
	public boolean isColleague(Person p) {
		if (this.getJob().getCompany() == p.getJob().getCompany()) {
			return true;
		} else {
			return false;
		}
	}

}
