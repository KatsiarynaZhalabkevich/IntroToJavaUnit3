package by.epam.intro.unit3.time;

/*Составьте описание класса для представления времени.
 * Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) 
 * с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.*/

class Time {
	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour <= 24)
			this.hour = hour;
		else
			this.hour = 0;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 60)
			this.minute = minute;
		else
			this.minute = 0;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= 0 && second <= 60)
			this.second = second;
		else
			this.second = 0;
	}

	public void getTime() {
		System.out.println("Time is " + getHour() + " hours " + getMinute() + " minutes " + getSecond() + " seconds");
	}

	//перенести в другой класс, т.к. это к сущности не относится?
	public void changeHours(int h) { // дни не рассматриваются

		if ((this.hour + h) > 24)
			System.out.println("Invalid hour value");
		else
			this.hour += h;
		getTime();

	}

	public void changeMinutes(int m) {
		this.minute += m;
		if (this.minute > 60) {
			System.out.println("Minutes value more then 60. Hours changed");
			changeHours(this.minute / 60);
			this.minute %= 60;
		}
		// getTime();
	}

	public void changeSeconds(int s) {
		this.second += s;
		if (this.second > 60) {
			System.out.println("Seconds value more then 60. Minutes changed");
			changeMinutes(this.second / 60);
			this.second %= 60;
		}
		// getTime();
	}
}
