
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class command {
	public static void main(String[] args) {

		ArrayList<w1> list = new ArrayList<w1>(); // Creating an ArrayList using class W1

		int a = 1;
		String jsonArray;

		do {
			System.out.println("Enter the command:\n\n1.storeurl (domainname)\n2.get (domainname)\n3.count (domainname)\n4.list\n5.exit ");
			Scanner sc = new Scanner(System.in);
			String user_command = sc.nextLine();
			String[] command = user_command.split(" ");

			// To store a url in the table
			if (command[0].equals("storeurl")) {
				int shortkey = command[1].hashCode();
				w1 str = new w1(shortkey, command[1], 0);
				list.add(str);
				System.out.println("\nurl is stored.............");

			} else
			// incrementing count of the Url
			if (command[0].equals("get")) {
				int list_size = list.size();
				for (int i = 0; i < list_size; i++) {
					String value = list.get(i).domainname;
					if (value.equals(command[1])) {
						list.get(i).count += 1;
						System.out.println(list.get(i).stkey + " count incremented");
						break;
					}
				}
			} else
			// To view the Present Count of the url
			if (command[0].equals("count")) {
				int list_size = list.size();
				for (int i = 0; i < list_size; i++) {
					String val1 = list.get(i).domainname;
					if (val1.equals(command[1])) {
						System.out.println(list.get(i).count + " is the present count");
						break;
					}
				}
			} else
			// Listing complete urls details in Json format
			if (command[0].equals("list")) {
				System.out.println("\nThe list of URL'S are printing........");
				Gson gs = new Gson(); // Creating an object gson which is used to convert Arraylist to Json Format
				jsonArray = gs.toJson(list);
				System.out.println(jsonArray);
			} else if (command[0].equals("exit")) {
				System.out.println("The program is exiting................ ");
				a = 0;
			} else {

				System.out.println("Entered command is wrong");

			}
		} while (a == 1);

	}
}
