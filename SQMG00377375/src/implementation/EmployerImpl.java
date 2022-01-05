package implementation;

//importing interfaces
import java.util.ArrayList;
import java.util.List;

import interfaces.Employer;
import interfaces.Person;

public class EmployerImpl implements Employer {

	// variables
	private String name;
	private List<Person> employees;

	public EmployerImpl(String n) {
		// constructor
		// returns name
		this.name = n;
		// new array list
		employees = new ArrayList<Person>();
	}

	@Override
	public void hire(Person p, String title, double salary) {
		// p.setJob(null);

		JobImpl newHires = new JobImpl(title, (int) salary, this.getName());
		p.setJob(newHires);
		// add an employee into the array list
		employees.add(p);
		// this.title = t;

	}

	@Override
	public List<Person> getEmployees() {
		// returns array of employees in a list
		return employees;
	}

	@Override
	public int getEmployeeCount() {
		// returns employee size
		return employees.size();
	}

	@Override
	public boolean fire(Person p) {
		// returns employees to fire an employee from array list
		for (Person pp : employees) {
			if (pp.getName().equals(p.getName())) {
				employees.remove(pp);
				return true;
			}
		}
		return false;
	}

	@Override
	public String getName() {
		// retruns name
		return name;
	}

	@Override
	public boolean isEmployed(Person p) {
		// checks if person is part of employees array list
		for (Person person : employees) {
			if (person.equals(p))
				return true;
		}
		return false;
	}

	@Override
	public Person getHighestPaid()
	//
	{
		double highestPaidPerson = employees.get(0).getJob().getSalary();
		Person highestPersonPaid = employees.get(0);
		for (Person person : employees) {
			if (person.getJob().getSalary() > highestPaidPerson) {
				highestPaidPerson = person.getJob().getSalary();
				highestPersonPaid = person;
			}
		}
		return highestPersonPaid;
	}

	@Override
	public Person getLowestPaid() {
		double lowestPay = employees.get(0).getJob().getSalary();
		Person lowestPerson = employees.get(0);
		for (Person person : employees) {
			if (person.getJob().getSalary() < lowestPay) {
				lowestPay = person.getJob().getSalary();
				lowestPerson = person;
			}
		}
		return lowestPerson;
	}

	@Override
	public double getStaffCost() {
		double overallCost = 0;
		for (Person p : employees) {
			overallCost += p.getJob().getSalary();
		}
		return overallCost;
	}

	@Override
	public int getCountOf(String title) {
		int empCounter = 0;
		for (Person person : employees) {
			if (person.getJob().getTitle().equals(title))
				empCounter++;
		}
		return empCounter;
	}

	@Override
	public List<Person> getAll(String title) {
		List<Person> listEmployees = new ArrayList<>();
		for (Person person : employees) {
			if (person.getJob().getTitle().equals(title)) {
				listEmployees.add(person);
			}
		}
		return listEmployees;
	}
}
