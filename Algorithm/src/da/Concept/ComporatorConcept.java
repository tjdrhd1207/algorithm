package da.Concept;

import java.util.Arrays;
import java.util.Comparator;

public class ComporatorConcept {

	public static void main(String[] args) {
		
		sortComparatorAge();
		
	}

	//Primitive Type 정렬
	public static void sortInt(){
		
		int arrInt[] = new int[]{1, 10, 4, 3, 2};
		Arrays.sort(arrInt);
		
		
		for(int i: arrInt){
			System.out.print(i+" ");
		}
		
	}
	//Reference Type 정렬
	public static void sortString(){
		
		String[] arrString = new String[]{"z","c","b","a"};

		Arrays.sort(arrString);

		for(String s: arrString){
			System.out.println(s);
		}
	}
	
	public static void sortComparator(){
		
		Student s1 = new Student("홍길동",27);
		Student s2 = new Student("이지수",31);
		Student s3 = new Student("이지수",30);
		Student arr[] = new Student[] {s1, s2, s3};
		
		Arrays.sort(arr);
		
		for(Student s : arr){
			System.out.println(s.getName()+" "+s.getAge());
		}
		
	}
	
	public static void sortComparatorAge(){
		
		Student s1 = new Student("홍길동", 27);
		Student s2 = new Student("이지수", 31);
		Student s3 = new Student("이지수", 30);
		Student arr[] = new Student[]{s1, s2, s3};
		
		
		Arrays.sort(arr, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				System.out.println(o1.getName()+o1.getAge()+", "+o2.getName()+o2.getAge());
				return o1.getAge()- o2.getAge();
			}
			
		});
		
		for(Student s : arr){
			System.out.println(s.getName() + " "+s.getAge());
		}
	
	}
	
}
