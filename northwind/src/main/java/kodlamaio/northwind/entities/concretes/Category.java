package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//One to many:Ana tabloda 1 kere diğer tabloda çok kere geçebilir.
//One to One:Ana tabloda 1 kere diğer tabloda bir kez geçebilir.

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
public class Category {
	
	@Id
	@Column(name = "category_id")
	private int categoryId;
	@Column(name = "category_name")
	private String categoryName;
	
	//Kategori tablosu ile ilişkilendirilmiş durumda ve aralarındaki ilişki ise one to many
	@OneToMany(mappedBy = "category")//Tek kategori olduğu için prodcuts da yazılmış ada göre ilişkilendirecek.
	private List<Product> products;

}
