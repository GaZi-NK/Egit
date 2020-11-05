package ex;

public class Employee {
	private String id;
	private String name;
	private String test;
	public Employee(String id, String name) {
		this.id = id; this.name = name;
	}
	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
}
