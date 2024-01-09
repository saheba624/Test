package c1.collection;

public class Person {
	private String name;
	private int age;
	// ...

	/*
	 * It is assumed that combination of Name and Age will be unique thus key is
	 * made by concatenating Name and Age
	 */

	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public int hashCode() {
		String key = name + age;
		return key.hashCode();
	}

	// Return true only if Name and Age of both objects are equal.

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (!(obj instanceof Person))
			return false;

		Person rhs = (Person) obj;

		if (name.equals(rhs.name) && age == rhs.age) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Person p = new Person("aman", 17);
		/* p.hashCode(); */
		System.out.println(p.hashCode());
		System.out.println(p.equals(p));
	}

}
