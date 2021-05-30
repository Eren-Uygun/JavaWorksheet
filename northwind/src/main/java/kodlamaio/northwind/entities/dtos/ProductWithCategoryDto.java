package kodlamaio.northwind.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Burada amaç 2 tablodaya join atıp birleştirmek.
//Class adları Pascal Case, metot adları camel Case yazılır.

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
	
	private int id;
	private String productName;
	private String categoryName;

}
