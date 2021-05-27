package kodlamaIo.Hrms.core.utils.result;

//DataResult<T> yazar isek göndereceği şeyin bir T tipinde bir data olduğunu söylüyoruz.
public class DataResult<T> extends Result {

	private T data;
	public DataResult(T data,boolean success,String message) {
		super(success,message); //Super bilgisi base sınıfın constructorlarını çalıştırır.Yani Resultdaki constructorlar çalışır.
		this.data = data;
	}
	
	public DataResult(T data,boolean success) {
		super(success); //Super bilgisi base sınıfın constructorlarını çalıştırır.Yani Resultdaki constructorlar çalışır.
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}
	




}
