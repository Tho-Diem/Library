package Model;

public class User implements Updateable {

	private String name;
	private int age;
	private int id;
	private static int counterId = 1;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = counterId++;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
