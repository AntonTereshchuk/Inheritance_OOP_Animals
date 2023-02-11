package task;

public class Cat extends Animal {
	
	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getVoice() {
		return "meow, meow";
	}
	
	@Override
	public void eat() {
		System.out.println("eating mouses");
	}
	
	@Override
	public void sleep() {
		System.out.println("sleep in the bed");
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + getColor() + ", weight=" + getWeight() + ", ration=" + getRation() + "]";
	}

}
