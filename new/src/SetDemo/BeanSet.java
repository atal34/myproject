package SetDemo;

public class BeanSet {
	
	int name;
	int age;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + name;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeanSet other = (BeanSet) obj;
		if (age != other.age)
			return false;
		if (name != other.name)
			return false;
		return true;
	}
	public BeanSet(int name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
