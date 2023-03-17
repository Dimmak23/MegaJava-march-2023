package database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
	private int _id;
	private String _name;
	private String _surname;

	@Override
	public String toString() {
		return "[" + _id + "]: " + _name + " " + _surname;
	}
}
