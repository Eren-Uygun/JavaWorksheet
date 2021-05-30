package kodlamaio.northwind.business.abstracts;

import java.util.*;

import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;

//İş kuralları bu katmanda yazılır.
//Örneğin sorgu yazımı yapılarak veri çekme işlemi gibi


import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;


public interface ProductService {

//	List<Product> getAll();

	DataResult<List<Product>> getAll();
	
	DataResult<List<Product>> getAll(int pageNo,int pageSize);
	
	DataResult<List<Product>> getAllSorted();
	
	
	

	Result add(Product product);

	DataResult<Product> getByProductName(String productName);

	//İd'yi category'e eşitlemeye çalışıyor.o yüzden Category'e _CategoryId ekliyoruz.
	DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

	DataResult<List<Product>> getByProductNameContains(String name);

	DataResult<List<Product>> getByProductNameStartsWith(String name);

	DataResult<List<Product>> getByProductNameEndsWith(String name);

	DataResult<List<Product>> getByNameAndCategory_CategoryId(String productName, int categoryId);
	
	DataResult<List<ProductWithCategoryDto>>  getProductWithCategoryDetails();
	

}
