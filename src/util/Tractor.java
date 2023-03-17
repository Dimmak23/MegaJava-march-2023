package util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tractor {

	private boolean _ladle = true;
	private String _mark;
	private Engine _engine;

	public Tractor(
			boolean ladle,
			String mark,
			int power,
			String model,
			int volume) {
		this._ladle = ladle;
		this._mark = mark;
		this._engine = new Engine(power, model, volume);
	}

}
