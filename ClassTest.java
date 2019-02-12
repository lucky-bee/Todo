class ClassTest {
	public static void main(String[] args) {
		Task task1 = new Task("A", true);
		Task task2 = new Task("A", true);
		Task task3 = task1;
		task3.setText("B");

		System.out.println(task1.getText());
	}
}