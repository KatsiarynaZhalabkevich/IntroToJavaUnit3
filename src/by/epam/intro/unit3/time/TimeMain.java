package by.epam.intro.unit3.time;

public class TimeMain {
	public static void main(String[] args) {
		
        Time time = new Time();
        time.setHour(5);
        time.setMinute(25);
        time.setSecond(59);

        time.getTime();
        time.changeHours(-3);
        time.changeMinutes(5);
        time.getTime();
        time.changeSeconds(13);
        time.getTime();

    }
}
