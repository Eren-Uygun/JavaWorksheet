package kodlamaio.northwind.api.controllers;

//Bütün projelerde kullanılabilecek ortak şeyleri core katmanı içerisinde yazılır.

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

//Controller:

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductsController  {
	
	
	private ProductService productService;
	

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult <List<Product>> getAll(){
		return this.productService.getAll();
	}
	
	//@RequestBody c#'da FromBody olarak geçiyor, @PostMapping'de c#'da HttpPost olarak geçiyor.
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName) //@RequestParam productName parametresini oku
	{
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameAndCategory")
	public DataResult<Product> getByProductNameAndCategory(@RequestParam String productName,@RequestParam int categoryId){
		return this.productService.getByProductNameAndCategory_CategoryId(productName, categoryId);
	}
	
	
	//Swagger sıralamayı yanlış yapar ise
	@GetMapping("/getByProductNameOrCategory")
	public DataResult<List<Product>> getByProductNameOrCategory(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId){
		return this.productService.getByProductNameOrCategory_CategoryId(productName, categoryId);
		
	}
	
	@GetMapping("/getByProductNameContains")
	DataResult<List<Product>> getByProductNameContains(String name){
		return this.productService.getByProductNameContains(name);
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<Product>> getAll(int pageNo,int pageSize){
		return this.productService.getAll(pageNo, pageSize);
		
	}
	
	@GetMapping("/getAllSorted")
	public DataResult<List<Product>> getAllSorted()
	{
		return this.productService.getAllSorted();
	}
	
	@GetMapping("/getProductWithCategoryDetails")
	public DataResult <List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
		return this.productService.getProductWithCategoryDetails();
	}
	

	
	



}

//kodlama.io/api/products = Domain.
