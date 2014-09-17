package junit4demo;

public class Person {

	
	private String name;
	
	public Person(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name == null || name.trim().isEmpty()){
			throw new IllegalArgumentException("No empty names please.");
		}
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object o) {
		return (o instanceof Person) && ((Person)o).getName().equals(this.getName());
	}
}
