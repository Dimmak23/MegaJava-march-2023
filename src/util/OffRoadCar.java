package util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OffRoadCar {

	private String _producer;
	private String _model;
	private Engine _engine;

}
