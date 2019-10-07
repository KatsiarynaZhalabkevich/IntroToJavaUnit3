package by.epam.intro.unit3.counter;

import java.util.Random;

/*Опишите класс, реализующий десятичный счетчик, 
 * который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
 * Написать код, демонстрирующий все возможности класса.*/

public class Counter {

	private static int count;
	private final int MIN;
	private final int MAX;

	public Counter() {
		Random random = new Random();
		MIN = 0;
		MAX = 100;
		this.count = random.nextInt(MAX);
	}

	public Counter(int count) {
		MIN = 0;
		MAX = 100;
		this.count = count;
	}

	public void Increase() {
		if (count < MAX)
			count++;
		else
			System.out.println("Counter get MAX value");

	}

	public int getCount() {
		return count;
	}

	public void Decrease() {
		if (count > MIN)
			count--;
		else
			System.out.println("Counter get MIN value");
	}
}
