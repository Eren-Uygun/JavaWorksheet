public class CustomerManager  {
    private ICustomerDal _customerDal;
    public CustomerManager(ICustomerDal customerDal){

        this._customerDal = customerDal;
    }


    public void add()
    {
        // İş kodları yazılır.
        _customerDal.Add();


    }
}
