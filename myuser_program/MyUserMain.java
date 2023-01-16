package myuser_program;

import java.util.Scanner;

public class MyUserMain {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;

		MyUser users = new MyUser();
		MyUserCrud crud = new MyUserCrud();

		do {
			System.out.println(" 1.signUp \n 2.login \n 3.exit");
			System.out.println("enter your choice ");
			int choice = scanner.nextInt();

			switch (choice) {
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

				users.setId(id);
				users.setUsername(userName);
				users.setEmail(email);
				users.setPassword(password);
				users.setAddress(address);

				crud.saveUsers(users);
			}
				break;
			case 2: {
				do {
					System.out.println("Choose your option to login");
					System.out.println(
							" 1.Facebook \n 2.Instagram \n 3.Snapchat \n 4.Watsapp \n 5.Twitter");
					System.out.println("enter your choice ");
					int choice1 = scanner.nextInt();
					switch (choice1) {
					case 1: {
						System.out.println("enter the email");
						String email = scanner.next();

						System.out.println("enter the password");
						String password = scanner.next();

						users.setEmail(email);
						users.setPassword(password);

						boolean saved = crud.loginUsers(users);

						if (saved == true) {
							System.out.println("logged in successfully");
							MyUser user = crud.getUsers(email);
							System.out.println(user.getFacebookPassword());
							String faceBookpassword = users.getFacebookPassword();
							if (faceBookpassword == null) {
								System.out.println("Facebook password " + user.getFacebookPassword());
								System.out.println("Please update your Facebook password");
								String facebookPassword = scanner.next();
								crud.resetFbPassword(facebookPassword, email);
							} else {
								System.out.println("Please enter Facebook password");
								String facebookPassword = scanner.next();
								crud.resetFbPassword(facebookPassword, email);

							}
						}
					}

						break;

					case 2: {
						System.out.println("enter the email");
						String email = scanner.next();

						System.out.println("enter the password");
						String password = scanner.next();

						users.setEmail(email);
						users.setPassword(password);

						boolean saved1 = crud.loginUsers(users);

						if (saved1 == true) {
							System.out.println("logged in successfully");
							MyUser user = crud.getUsers(email);
							System.out.println(user.getInstaPassword());
							String instapassword = users.getInstaPassword();
							if (instapassword == null) {
								System.out.println("Insta password " + user.getInstaPassword());
								System.out.println("Please update your Insta password");
								String instaPassword = scanner.next();
								crud.resetInstaPassword(instaPassword, email);
							} else {
								System.out.println("Please enter Insta password");
								String instaPassword = scanner.next();
								crud.resetInstaPassword(instaPassword, email);
							}
						}
					}
						break;
					case 3: {
						System.out.println("enter the email");
						String email = scanner.next();

						System.out.println("enter the password");
						String password = scanner.next();

						users.setEmail(email);
						users.setPassword(password);

						boolean saved2 = crud.loginUsers(users);

						if (saved2 == true) {
							System.out.println("logged in successfully");
							MyUser user = crud.getUsers(email);
							System.out.println(user.getSnapchatPassword());
							String snapchatpassword = users.getSnapchatPassword();
							if (snapchatpassword == null) {
								System.out.println("Insta password " + user.getSnapchatPassword());
								System.out.println("Please update your SnapChat password");
								String snapchatPassword = scanner.next();
								crud.resetSnapchatPassword(snapchatPassword, email);
							} else {
								System.out.println("Please enter snapchat password");
								String snapchatPassword = scanner.next();
								crud.resetSnapchatPassword(snapchatPassword, email);
							}
						}
					}
						break;
					case 4: {
						System.out.println("enter the email");
						String email = scanner.next();

						System.out.println("enter the password");
						String password = scanner.next();

						users.setEmail(email);
						users.setPassword(password);

						boolean saved2 = crud.loginUsers(users);

						if (saved2 == true) {
							System.out.println("logged in successfully");
							MyUser user = crud.getUsers(email);
							System.out.println(user.getWatsappPassword());
							String watsapppassword = users.getWatsappPassword();
							if (watsapppassword == null) {
								System.out.println("Watsapp password " + user.getWatsappPassword());
								System.out.println("Please update your Watsapp password");
								String watsappPassword = scanner.next();
								crud.resetWatsappPassword(watsappPassword, email);
							} else {
								System.out.println("Please enter watsapp password");
								String watsappPassword = scanner.next();
								crud.resetWatsappPassword(watsappPassword, email);
							}
						}
					}
						break;
					case 5: {
						System.out.println("enter the email");
						String email = scanner.next();

						System.out.println("enter the password");
						String password = scanner.next();

						users.setEmail(email);
						users.setPassword(password);

						boolean saved2 = crud.loginUsers(users);

						if (saved2 == true) {
							System.out.println("logged in successfully");
							MyUser user = crud.getUsers(email);
							System.out.println(user.getTwiterPassword());
							String twiterpassword = users.getTwiterPassword();
							if (twiterpassword == null) {
								System.out.println("twiter password " + user.getTwiterPassword());
								System.out.println("Please update your twiter password");
								String twiterPassword = scanner.next();
								crud.resetTwiterPassword(twiterPassword, email);
							} else {
								System.out.println("Please enter watsapp password");
								String twiterPassword = scanner.next();
								crud.resetTwiterPassword(twiterPassword, email);
							}
						}
					}
						break;
					}
				} while (repeat);
			}
			}
		} while (repeat);
	}

}
