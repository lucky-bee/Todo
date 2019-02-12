import java.util.*;

class Todo {
	public static void main(String[] args) {
		ArrayList<Task> tasks = new ArrayList<Task>();
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("Select one of these:\n1 - ADD\n2 - Remove\n3 - List done\n4 - List not done\n5 - Exit");
			int x = sc.nextInt();
			System.out.println("-----------------------");
			if (x == 1) {
				sc.nextLine();
				String tmp = sc.nextLine();
				
				tasks.add(new Task(tmp));
			} else if (x == 2) {
				x = sc.nextInt();
				
				try {
					tasks.get(x).status = true;
				} catch (Exception e) {
					System.out.println("Error in number!");
				}
			} else if (x == 3) {
				for (int i = 0; i < tasks.size(); i++) {
					if (tasks.get(i).status == true) {
						System.out.println(i + " - " + tasks.get(i).text);
					}
				}
			} else if (x == 4) {
				for (int i = 0; i < tasks.size(); i++) {
					if (tasks.get(i).status == false) {
						System.out.println(i + " - " + tasks.get(i).text);
					}
				}
			} else { break; }
			System.out.println("-----------------------");
		}

		return;
	}
}