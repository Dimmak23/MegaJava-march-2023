package util;

import users.Admins;
import users.Singer;
import users.Users;
import users.Workers;

public class Main {
	public static void main(String[] args) {
		Admins admin = new Admins(11,
				"dimmak@eng.com",
				"DimmaK",
				"kat");
		Users[] users = {admin, new Workers()};
		System.out.println(users[0]);
		System.out.println(((Admins) users[0]).getRole());
	}

	// Define interface method with anonymous class
	Singer s1 = new Singer() {
		@Override
		public void sing() {

		}
	};
	

}
