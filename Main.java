import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList<String>();
		ArrayList list2 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("Select one of these:\n1 - ADD\n2 - Remove\n3 - List done\n4 - List not done\n5 - Exit");
			int x = sc.nextInt();
			if (x == 1) {
				sc.nextLine();
				String tmp = sc.nextLine();
				
				list1.add(tmp);
			} else if (x == 2) {
				x = sc.nextInt();
				
				try {
					Object tmp = list1.get(x);
					list1.remove(x);
					list2.add(tmp);
				} catch (Exception e) {
					System.out.println("-----------------------")
					System.out.println("Error in number!");
					System.out.println("-----------------------")
				}
			} else if (x == 3) {
				for (int i = 0; i < list2.size(); i++) {
					System.out.println("-----------------------")
					System.out.println(i + " - " + list2.get(i));
					System.out.println("-----------------------")
				}
			} else if (x == 4) {
				for (int i = 0; i < list1.size(); i++) {
					System.out.println("-----------------------")
					System.out.println(i + " - " + list1.get(i));
					System.out.println("-----------------------")
				}
			} else { break; }
		}

		return;
	}
}