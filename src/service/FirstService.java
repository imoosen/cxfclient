
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FirstService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FirstService {


    /**
     * 
     * @param arg0
     * @return
     *     returns service.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verifyName", targetNamespace = "http://service/", className = "service.VerifyName")
    @ResponseWrapper(localName = "verifyNameResponse", targetNamespace = "http://service/", className = "service.VerifyNameResponse")
    public User verifyName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSum", targetNamespace = "http://service/", className = "service.GetSum")
    @ResponseWrapper(localName = "getSumResponse", targetNamespace = "http://service/", className = "service.GetSumResponse")
    public int getSum(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "print", targetNamespace = "http://service/", className = "service.Print")
    @ResponseWrapper(localName = "printResponse", targetNamespace = "http://service/", className = "service.PrintResponse")
    public String print();

}