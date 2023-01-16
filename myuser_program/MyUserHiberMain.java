package myuser_program;

import java.util.Scanner;

public class MyUserHiberMain {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		MyUser user = new MyUser();
		MyUserHiber hiber = new MyUserHiber();
		boolean repeat = true;
		do {
			System.out.println("1.SignUp \n 2.login");
			System.out.println("Choose your option");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1: {
				System.out.println("enter the id");
				int id = scanner.nextInt();

				System.out.println("enter the username");
				String userName = scanner.next();

				System.out.println("enter the email");
				String email = scanner.next();

				System.out.println("enter the password");
				String password = scanner.next();

				System.out.println("enter the address");
				String address = scanner.next();

				user.setId(id);
				user.setUsername(userName);
				user.setEmail(email);
				user.setPassword(password);
				user.setAddress(address);
				hiber.signUp(user);
			}
				break;
			case 2: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				System.out.println("Enter the password");
				String password = scanner.next();
				boolean saved = hiber.login(id, password);
				if (saved == true)
					System.out.println("Logged in Successfully");
				do {
					System.out.println("1.Facebook \n 2.Instagram \n 3.Snapchat \n 4.Watsapp \n 5.Twitter");
					System.out.println("Enter your choice");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1: {
						System.out.println("Enter the password ");
						int saved1 = hiber.updateFbPassword(id, password);
						if (saved1 == 1) {
							System.out.println("Fb Password added successfully");
						}

						System.out.println("1.reset the fb password");

						int reset = scanner.nextInt();
						switch (reset) {
						case 1: {
							System.out.println("Enter the password to be reseted");
							String resetPassword = scanner.next();
							int save = hiber.updateFbPassword(id, resetPassword);
							if (save == 1) {
								System.out.println(" Reseted");
							}

							break;
						}
						}
					}
					}

				} while (repeat);
			}
			}

		} while (repeat);

	}
}
