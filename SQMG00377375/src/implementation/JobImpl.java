package implementation;

//importing interfaces
import interfaces.Job;

public class JobImpl implements Job {

	// variables
	double salary;
	String title;
	String company;

	public JobImpl(String t, int s, String c) {
		// constructor
		this.title = t;
		this.salary = s;
		this.company = c;
	}

	@Override
	public double getSalary() {
		// returns salary
		return salary;
	}

	@Override
	public String getTitle() {
		// returns title
		return title;
	}

	@Override
	public void setSalary(double s) {
		// if value is > than 0 it can be set
		if (s > 0) {

			this.salary = s;
		}
	}

	@Override
	public void setTitle(String t) {
		// if value is not equal to an empty string that title can be set
		if (!t.equals("")) {

			this.title = t;

		}
	}

	@Override
	public String getCompany() {
		// returns company name
		return company;
	}

	@Override
	public void setCompany(String c) {
		// if value is not equal to an empty string then company can be set
		if (!c.equals("")) {
			this.company = c;
		}

	}

	@Override
	public boolean equals(Job p) {
		if (title.compareTo(p.getTitle()) == 0 && company.compareTo(p.getCompany()) == 0 && salary == p.getSalary()) {
			return true;
		}
		return false;

	}

}
