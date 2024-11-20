package june_2023;

public class Pair<T, U> {

	T obj1;
	U obj2;
	
	public Pair(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void getFirst() {
		System.out.println("First value :"+obj1);
	}
	public void getSecond() {
		System.out.println("Second value :"+obj2);
	}
}
