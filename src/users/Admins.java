package users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
//@NoArgsConstructor
//@Data
@Getter
@Setter
public class Admins extends Users {
	private String role;

	public void fork() {

	}

	public Admins() {
		super();
		this.role = "";
	}

	public Admins(int id, String email, String name, String role) {
		super(id, email, name);
		this.role = role;
	}

	@Override
	public String toString() {
/*
		return String.format("Admin (role = %s), id: %d, name: %s, email: = %s",
				this.role,
				super.getId(),
				super.getName(),
				super.getEmail());
*/
		return String.format("Admin (role = %s), %s", this.role, super.toString());
	}
}
