package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

//interface diğer bir interface'i extend eder.

//C#'daki baseRepository Javada JpaRepository'de hazır olarak yapılmıştır.

//DataAccess Domain driven yada onion architecture gibi mimarilede persistance katmanı olarak geçer.


//Burdaki veri tipi id nin veri tipi integerse integer , long sa long gibi
public interface ProductDao extends JpaRepository<Product,Integer> {
	
	//Getby ile başlamak önemli program ona koşul yazıyor;
	//İsimlendirme kurallarına uyarsak jpa repository otomatik olarak işlemi yapıyor.
	
	Product getByProductName (String productName);
	// Select * from products where product_name = abc
	
	Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);
	// Select * from products where product_name = abc and category_id = 1
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName,int categoryId);
	// Select * from products where product_name = abc or category_id = 1
	
	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);
	// Select * from products where  category_id in(1,2,3,4)
	
	List<Product> getByProductNameContains(String name);
	//Select * from products where category_name contains("name");
	
	List<Product> getByProductNameStartsWith(String name);
	//Select * from products where category_name StartsWith("name");
	
	List<Product> getByProductNameEndsWith(String name);
	//Select * from products where category_name EndsWith("name");
	
	//Select * from products where product_name = bisey and category_id = bisey
	
	@Query("from Product where productName=:productName and  category.categoryId=:categoryId") //Hangi entity olduğuna göre yazıcaz.Burdakiler Product ve Category classındaki fieldlardır.
	//: ile yazarsak değeri parametreden okur.
	List<Product> getByNameAndCategory_CategoryId(String productName,int categoryId);
	
	

	
	
	
	

}
