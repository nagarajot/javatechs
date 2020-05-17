package in.codersclub.javatechs.java.sampleprograms;

// compare the Driver class w.r.t name
public class Driver implements Comparable<Driver>
{
	private int id;
	private String name;
	private String gender;
	private int age;
	
	public Driver(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Driver d)
	{
		return this.name.compareTo(d.getName());
	}
}



