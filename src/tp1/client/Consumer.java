package tp1.client;

import tp1.stub.Account_managerStub;
import tp1.stub.Account_managerStub.*;
import tp1.stub.Account_managerCallbackHandler.*;

public class Consumer {

	public static void main(String[] args) throws Exception {
		 //TODO Auto-generated method stub
		Account_managerStub stub = new Account_managerStub("http://localhost:8080/axis2/services/account_manager");
		
		CreateAccount ca_Request = new CreateAccount();
		ca_Request.setId(3L);
		ca_Request.setAccountNumber("HI0200");
		ca_Request.setBalance(500.50);
		
		CreateAccountResponse ca_response = stub.createAccount(ca_Request);
		System.out.println(ca_response.get_return());
	}

}
