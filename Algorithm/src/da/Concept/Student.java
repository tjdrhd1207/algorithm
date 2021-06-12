package da.Concept;

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	/*
	 * 양수가 리턴되는 경우 현재 Object가 앞
	 * 음수가 리턴되는 경우 현재 Object가 뒤
	 * 0이 리턴되는 경우 동일 값으로 간주하고 입력순서 유지
	 * */

	@Override
	public int compareTo(Student o) {
		
		int result = this.getName().compareTo(o.getName());
		
		System.out.println(this.getName()+this.getAge()+", "+o.getName()+o.getAge());
		System.out.println(result);
		if(result == 0){
			result = this.getAge() - o.getAge();
		}
		
		return result;
	}

}
