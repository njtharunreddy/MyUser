package myuser_program;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class MyUserCrud {
	public Connection getConnection() throws Exception {
		// create object for Driver class
		Driver driver = new Driver();
		// register the Driver
		DriverManager.registerDriver(driver);
		// passing file path which is having properties like url, username, password
		// related to database
		FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");

		// create object of properties
		Properties properties = new Properties();

		properties.load(fileInputStream);

		Connection connection = DriverManager.getConnection(properties.getProperty("url"),
				properties.getProperty("username"), properties.getProperty("password"));
		return connection;
	}

	// for signUp
	public void saveUsers(MyUser users) throws Exception {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("INSERT INTO MYUSER VALUES(?,?,?,?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, users.getId());
		preparedStatement.setString(2, users.getUsername());
		preparedStatement.setString(3, users.getEmail());
		preparedStatement.setString(4, users.getPassword());
		preparedStatement.setString(5, users.getAddress());
		preparedStatement.setString(6, users.getFacebookPassword());
		preparedStatement.setString(7, users.getInstaPassword());
		preparedStatement.setString(8, users.getSnapchatPassword());
		preparedStatement.setString(9, users.getWatsappPassword());
		preparedStatement.setString(10, users.getTwiterPassword());
		preparedStatement.execute();
		connection.close();
		System.out.println("signed in successfully");

	}

	public boolean loginUsers(MyUser users) throws Exception {
		String query = "select * from myuser where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, users.getEmail());

		ResultSet resultSet = preparedStatement.executeQuery();
		String password = null;
		while (resultSet.next()) {
			password = resultSet.getString("password");
		}
		if (users.getPassword().equals(password)) {
			return true;
		}
		return false;

	}

	public void resetFbPassword(String facebookPassword, String email) throws Exception {
		String query = "update myuser set facebookPassword=? where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, facebookPassword);
		preparedStatement.setString(2, email);
		preparedStatement.execute();
		connection.close();
	}

	public void resetInstaPassword(String instaPassword, String email) throws Exception {
		String query = "update myuser set instaPassword=? where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, instaPassword);
		preparedStatement.setString(2, email);
		preparedStatement.execute();
		connection.close();
	}

	public void resetSnapchatPassword(String snapchatPassword, String email) throws Exception {
		String query = "update myuser set snapchatPassword=? where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, snapchatPassword);
		preparedStatement.setString(2, email);
		preparedStatement.execute();
		connection.close();
	}

	public void resetWatsappPassword(String watsappPassword, String email) throws Exception {
		String query = "update myuser set watsappPassword=? where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, watsappPassword);
		preparedStatement.setString(2, email);
		preparedStatement.execute();
		connection.close();
	}
	public void resetTwiterPassword(String twiterPassword, String email) throws Exception {
		String query = "update myuser set twiterPassword=? where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, twiterPassword);
		preparedStatement.setString(2, email);
		preparedStatement.execute();
		connection.close();
	}
	public MyUser getUsers(String email) throws Exception {
		String query = "select*from myuser where email=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, email);
		ResultSet resultSet = preparedStatement.executeQuery();
		MyUser myUser = new MyUser();
		while (resultSet.next()) {
			myUser.setId(resultSet.getInt(1));
			myUser.setUsername(resultSet.getString(2));
			myUser.setEmail(resultSet.getString(3));
			myUser.setPassword(resultSet.getString(4));
			myUser.setAddress(resultSet.getString(5));
			myUser.setFacebookPassword(resultSet.getString(6));
			myUser.setInstaPassword(resultSet.getString(7));
			myUser.setSnapchatPassword(resultSet.getString(8));
			myUser.setWatsappPassword(resultSet.getString(9));
			myUser.setTwiterPassword(resultSet.getString(10));

		}
		return myUser;
	}
}
