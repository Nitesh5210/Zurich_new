package generalUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
// access specifier modifiername methodname(parameters if any )
	/**
	 * @author DIVYSIDDAPPA
	 * @param password
	 * @param url
	 * @param username
	 */
	private Connection connection;

	public Connection getconnectiontosql(String URL, String USERNAME, String PASSWORD) {
		Driver dbdriver = null;
		try {
			dbdriver = new Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbdriver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	// access specifier modifier name methodname(parameter if any)
	/**
	 * This method is used to get the data from the database
	 * 
	 * @author DIVYASIDDAPPA
	 * @param column_name
	 * @param query
	 */
	public List<String> getdatafromdb(String column_name, String query) {
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet result = null;
		try {
			result = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> arr = new ArrayList<String>();
		try {
			while (result.next()) {
				arr.add(result.getString(column_name));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}

	// access specifier modifier name method name(parameters if any )
	/**
	 * This method is used to close the database connection
	 * 
	 * @author DIVYASIDDAPPA
	 * 
	 */
	public void closedbconnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// access specifier modifiername methodname(parameter if any)
	/**
	 * This method is used to verify the datainside the database
	 * 
	 * @author DIVYASIDDAPPA
	 * @param query1
	 * @param col1
	 * @param expectedvalue
	 * @return
	 */
	public boolean verifyinsidedatabase(String query1, String col1, String expectedvalue) {
		List<String> arr = getdatafromdb(query1, col1);
		boolean flag = false;
		for (String s : arr) {
			if (s.equalsIgnoreCase(expectedvalue)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void setToDatabase(String query1) {

		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int result = 0;
		try {
			result = statement.executeUpdate(query1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 1) 
		{
			System.out.println(result + "dataupdatedsuccessfully");
		}
	}

}
