package by.epam.intro.unit3.student;

public class StudentMain {
	public static void main(String[] args) {

		StudentLogic stL = new StudentLogic();

		String[] names = { "Ivanov I.I.", "Petrov P.P.", "Novikov N.N.", "Brawn B.B.", "Smith S.M.", "Small P.D.",
				"Pitt B.T.", "Hud R.B.", "White P.N.", "Black J.L." };
		Student[] st = new Student[10];

		for (int i = 0; i < names.length; i++) {
			st[i] = new Student(names[i]);
			stL.info(st[i]);

		}
		System.out.println("Good students: ");
		for (int i = 0; i < st.length; i++) {

			stL.checkMarks(st[i]);
		}

	}

}
