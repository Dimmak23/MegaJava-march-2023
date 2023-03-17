package product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

	private int _ID;
	private String _title;
	private Double _price;

	private String[] categories = new String[3];
	
}
