package by.epam.intro.unit3.student;

public class StudentLogic {

	public void checkMarks(Student st) {

		int count = 0;
		int[] mark = st.getMarks();

		for (int i = 0; i < 5; i++) {
			if (mark[i] >= 9)
				count++;
		}
		if (count == mark.length)
			info(st);

	}

	public void info(Student st) {

		System.out.println("Student's name is " + st.getName());
		System.out.println("Group " + st.getGroupNum());

		for (int i : st.getMarks()) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
