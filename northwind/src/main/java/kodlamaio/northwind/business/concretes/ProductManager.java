package kodlamaio.northwind.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	
	//@Autowired buraya koyarsak her eklediğimiz için autowired yazmamız gerekir.Burdada yapsak constructor'a gerek kalmadan çalışır.
	private ProductDao _productDao;


	@Autowired //Autowired anotasyonu , spring arka planda buna karşılık gelebilcek bir instance , bir class oluşturuyor.
	public ProductManager(ProductDao _productDao) {
		super();
		this._productDao = _productDao;
	}
	
	/*@Override
	public List<Product> getAll() {
		
		return this._productDao.findAll();
	}
	
	*/

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this._productDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		this._productDao.save(product);
		return new SuccessDataResult<Product>("Ürün eklendi");
		
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>(this._productDao.getByProductName(productName), "Data Listelendi");
	}

	@Override
	public DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId) {
		//Business(iş) kodları , ekstra kurallar vs.
		return new SuccessDataResult<Product>(this._productDao.getByProductNameAndCategory_CategoryId(productName,categoryId), "Data Listelendi");
	}

	
	  @Override public DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId) { 
		  return new SuccessDataResult<List<Product>>(this._productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data Listelendi"); 
		  }
	 

	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>(this._productDao.getByCategory_CategoryIdIn(categories), "Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String name) {
		return new SuccessDataResult<List<Product>>(this._productDao.getByProductNameContains(name), "Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String name) {
		return new SuccessDataResult<List<Product>>(this._productDao.getByProductNameStartsWith(name), "Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameEndsWith(String name) {
		return new SuccessDataResult<List<Product>>(this._productDao.getByProductNameEndsWith(name), "Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory_CategoryId(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(this._productDao.getByNameAndCategory_CategoryId(productName,categoryId), "Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Product>>(this._productDao.findAll(pageable).getContent(),"Başarılı");
		
	}

	@Override
	public DataResult<List<Product>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"productName"); //Classdaki kolona denk gelen adı buraya yazıyoruz. Tablo adını değil.
		return new SuccessDataResult<List<Product>>(this._productDao.findAll(sort),"Başarılı");
	
	}

}
