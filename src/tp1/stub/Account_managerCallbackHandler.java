/**
 * Account_managerCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package tp1.stub;


/**
 *  Account_managerCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class Account_managerCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public Account_managerCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public Account_managerCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for createAccount method
     * override this method for handling normal response from createAccount operation
     */
    public void receiveResultcreateAccount(
        tp1.stub.Account_managerStub.CreateAccountResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createAccount operation
     */
    public void receiveErrorcreateAccount(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAccountById method
     * override this method for handling normal response from getAccountById operation
     */
    public void receiveResultgetAccountById(
        tp1.stub.Account_managerStub.GetAccountByIdResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAccountById operation
     */
    public void receiveErrorgetAccountById(java.lang.Exception e) {
    }

    // No methods generated for meps other than in-out
}

