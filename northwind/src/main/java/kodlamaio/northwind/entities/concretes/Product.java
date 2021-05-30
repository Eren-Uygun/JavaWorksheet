package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data Lombok kullanırken bunu yazarsak  getter setter işlemlerini otomatik olarak yapar.
//Anotasyon bir class ve metodun calısma anında onunla ilgili bilgi toplamak için kullanılan yapılardır. 
//Anotasyon sistemleri olan yapılar solid'e ters düşebilmektedir.Bu javada kalıplaşmış bir durumdur.
//Anostasyonlarda sıra önemli olabilir.
//Solidi bozan yanı bir class'ın tek iş yapma prensibini bozuyor.İlk başta bozmasada değişim geldiğinde bozabiliyor.

//Orm lerde sonsuz döngü problemi için @JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"}) anotasyonunu uyguluyoruz.

@Data
@Entity
@Table(name="products")
@AllArgsConstructor //Tüm parametreleri olan constructor gibi çalışır.
@NoArgsConstructor //Parametresiz constructor gibi çalışır.
public class Product {
	
	@Id //Primary key olduğu
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Veri tabanı id stratejisi belirledik. Id nin nasıl olacağı
	@Column(name="product_id")
	private int id;
	

	 //@Column(name="category_id") 
	 //private int categoryId;
	
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne() //Ürünlerin 1 kategorisi olabilir.
	@JoinColumn(name = "category_id")
	private Category category;
	
	/*
	 * public Product() {
	 * 
	 * }
	 * 
	 * public Product(int id, int categoryId, String productName, double unitPrice,
	 * short unitsInStock, String quantityPerUnit) { super(); this.id = id;
	 * this.categoryId = categoryId; this.productName = productName; this.unitPrice
	 * = unitPrice; this.unitsInStock = unitsInStock; this.quantityPerUnit =
	 * quantityPerUnit; }
	 */


	/*
	 * public int getId() { return id; }
	 * 
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * 
	 * public int getCategoryId() { return categoryId; }
	 * 
	 * 
	 * public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
	 * 
	 * 
	 * public String getProductName() { return productName; }
	 * 
	 * 
	 * public void setProductName(String productName) { this.productName =
	 * productName; }
	 * 
	 * 
	 * public double getUnitPrice() { return unitPrice; }
	 * 
	 * 
	 * public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
	 * 
	 * 
	 * public short getUnitsInStock() { return unitsInStock; }
	 * 
	 * 
	 * public void setUnitsInStock(short unitsInStock) { this.unitsInStock =
	 * unitsInStock; }
	 * 
	 * 
	 * public String getQuantityPerUnit() { return quantityPerUnit; }
	 * 
	 * 
	 * public void setQuantityPerUnit(String quantityPerUnit) { this.quantityPerUnit
	 * = quantityPerUnit; }
	 * 
	 */
	

}
