package by.epam.intro.unit3.train;

public class TrainLogic {

	public void info(Train tr) {
		System.out.println("Train information: ");
		System.out.println("Destination " + tr.getDestination());
		System.out.println("Number " + tr.getNumber());
		System.out.print("Departure time ");
		if (tr.getTimeHours() < 10)
			System.out.print("0" + tr.getTimeHours());
		else
			System.out.print(tr.getTimeHours());
		if (tr.getTimeMinutes() < 10)
			System.out.print(":0" + tr.getTimeMinutes());
		else
			System.out.print(":" + tr.getTimeMinutes());
		System.out.println();
		System.out.println("-------------------");

	}

	public void sortByNum(Train[] tr) {
		Train train;
		for (int j = 0; j < tr.length; j++) {
			for (int i = 0; i < tr.length - 1; i++) {

				if (tr[i].getNumber() > tr[i + 1].getNumber()) {
					train = tr[i];
					tr[i] = tr[i + 1];
					tr[i + 1] = train;
				}

			}
		}
	}

	public void infoByNum(Train[] tr, int num) {
		for (int i = 0; i < tr.length; i++)
			if (tr[i].getNumber() == num) {
				info(tr[i]);
			}
	}

	public void sortByDestination(Train[] tr) {
		Train train;
		for (int i = 0; i < tr.length - 1; i++) {
			int a = tr[i].getDestination().compareTo(tr[i + 1].getDestination());
			if (a > 0) {
				train = tr[i];
				tr[i] = tr[i + 1];
				tr[i + 1] = train;
			}
			
		}

	}
}
