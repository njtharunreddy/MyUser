package myuser_program;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class MyUserCredentials {

	public static void main(String[] args) throws Exception {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		Connection connection = DriverManager.getConnection(properties.getProperty("url"),
				properties.getProperty("username"), properties.getProperty("password"));

		MyUser user1 = new MyUser();
		user1.setId(1);
		user1.setUsername("pavan");
		user1.setEmail("pa@gmail.com");
		user1.setPassword("111");
		user1.setAddress("Bangalore");
		user1.setFacebookPassword("345");
		user1.setInstaPassword("789");
		user1.setSnapchatPassword("675");
		user1.setWatsappPassword("908");
		user1.setTwiterPassword("143");

		MyUser user2 = new MyUser();
		user2.setId(2);
		user2.setUsername("Suresh");
		user2.setEmail("sur@gmail.com");
		user2.setPassword("121");
		user2.setAddress("Bangalore");
		user2.setFacebookPassword("3459");
		user2.setInstaPassword("34789");
		user2.setSnapchatPassword("76675");
		user2.setWatsappPassword("8908");
		user2.setTwiterPassword("0143");

		MyUser user3 = new MyUser();
		user3.setId(3);
		user3.setUsername("Hari");
		user3.setEmail("ha@gmail.com");
		user3.setPassword("118");
		user3.setAddress("Bangalore");
		user3.setFacebookPassword("2345");
		user3.setInstaPassword("7891");
		user3.setSnapchatPassword("23675");
		user3.setWatsappPassword("6908");
		user3.setTwiterPassword("9143");

		List<MyUser> list = new ArrayList<MyUser>();
		list.add(user1);
		list.add(user2);
		list.add(user3);

		PreparedStatement preparedStatement = connection
				.prepareStatement("INSERT INTO MYUSER VALUES(?,?,?,?,?,?,?,?,?,?)");
		boolean repeat=true;
		do {
			Scanner sc =new Scanner(System.in);
		System.out.println("Press 1. to signup");
		System.out.println("Press 2.to login");
		System.out.println("Press 3.to exit");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:for (MyUser u : list) {
			preparedStatement.setInt(1, u.getId());
			preparedStatement.setString(2, u.getUsername());
			preparedStatement.setString(3, u.getEmail());
			preparedStatement.setString(4, u.getPassword());
			preparedStatement.setString(5, u.getAddress());
			preparedStatement.setString(6, u.getFacebookPassword());
			preparedStatement.setString(7, u.getInstaPassword());
			preparedStatement.setString(8, u.getSnapchatPassword());
			preparedStatement.setString(9, u.getWatsappPassword());
			preparedStatement.setString(10, u.getTwiterPassword());
			preparedStatement.addBatch();

			System.out.println("saved in the batch ");

		}
		preparedStatement.executeBatch();
		}
		}while(repeat);
		connection.close();
	}

}
