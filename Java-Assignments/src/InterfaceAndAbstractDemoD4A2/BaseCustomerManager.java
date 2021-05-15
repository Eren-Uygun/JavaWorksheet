package InterfaceAndAbstractDemoD4A2;

public abstract class BaseCustomerManager implements ICustomerService,ICustomerCheckService {

	@Override
	public void save(Customer customer) {
System.out.println("Saved to db : "+customer.getFirstName());
	}

}
