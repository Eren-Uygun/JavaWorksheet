package InterfaceAndAbstractDemoD4A2;

public class StarbucksCustomerManager extends BaseCustomerManager {
	ICustomerCheckService _customerCheckService;
	
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this._customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if (_customerCheckService.checkIfRealPerson(customer)) {
		super.save(customer);
		}
		else {
			System.out.println("Error this person is not real ");
		}

	}

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}


	
	

}
