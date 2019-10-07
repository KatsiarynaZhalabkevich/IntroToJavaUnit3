package by.epam.intro.unit3.counter;

public class CounterMain {
	public static void main(String[] args) {
		
		System.out.println("Count - static fild!");
		Counter counter = new Counter(25);
		System.out.println("Decrease");
		counter.Decrease();
		System.out.println("Increase");
		counter.Increase();
		System.out.println("Increase");
		counter.Increase();
		System.out.println(counter.getCount());
		
		System.out.println("Create new Count");
		Counter cc = new Counter();

		System.out.println(cc.getCount());
		System.out.println("Decrease");
		cc.Decrease();
		System.out.println("Decrease");
		cc.Decrease();
		System.out.println("Decrease");
		cc.Decrease();
		
		System.out.println("Second count = "+cc.getCount());
		System.out.println("First count = "+counter.getCount());
	}
}
