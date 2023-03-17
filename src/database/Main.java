package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws SQLException, IOException {
		Properties props = new Properties();
//		FileInputStream fis = new FileInputStream("src\\database\\DataBaseConfig.xml");
		FileInputStream fis = new FileInputStream("src\\database\\DataBaseConfig.properties");
		props.load(fis);
//		System.out.println(props.getProperty("table"));
//		System.out.println(props.getProperty("login"));
//		System.out.println(props.getProperty("password"));
		Connection connection = DriverManager.getConnection(
				props.getProperty("table"),
				props.getProperty("login"),
				props.getProperty("password"));

		PreparedStatement queryObject = connection.prepareStatement("SELECT * FROM SAKILA.ACTOR");
		ResultSet resultSet = queryObject.executeQuery();

		List<Actor> actorList = new ArrayList<>();

		while (resultSet.next()) {
			Actor actor = new Actor(
					resultSet.getInt(1),
					resultSet.getString(2),
					resultSet.getString(3));
			actorList.add(actor);
		}

//		System.out.println(actorList);
//		actorList.forEach(System.out::println);

		List<Actor> actors = actorList
				.stream()
				.filter(actor -> actor.get_name().length() > 6 && actor.get_name().length() < 9)
				.collect(Collectors.toList());

		actors.forEach(System.out::println);

		System.out.println("Actors with predicate: " + actors.size() + " quantity.");

		connection.close();
	}
}
