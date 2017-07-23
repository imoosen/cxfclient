
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VerifyNameResponse_QNAME = new QName("http://service/", "verifyNameResponse");
    private final static QName _Print_QNAME = new QName("http://service/", "print");
    private final static QName _PrintResponse_QNAME = new QName("http://service/", "printResponse");
    private final static QName _GetSumResponse_QNAME = new QName("http://service/", "getSumResponse");
    private final static QName _VerifyName_QNAME = new QName("http://service/", "verifyName");
    private final static QName _GetSum_QNAME = new QName("http://service/", "getSum");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintResponse }
     * 
     */
    public PrintResponse createPrintResponse() {
        return new PrintResponse();
    }

    /**
     * Create an instance of {@link Print }
     * 
     */
    public Print createPrint() {
        return new Print();
    }

    /**
     * Create an instance of {@link VerifyNameResponse }
     * 
     */
    public VerifyNameResponse createVerifyNameResponse() {
        return new VerifyNameResponse();
    }

    /**
     * Create an instance of {@link GetSum }
     * 
     */
    public GetSum createGetSum() {
        return new GetSum();
    }

    /**
     * Create an instance of {@link GetSumResponse }
     * 
     */
    public GetSumResponse createGetSumResponse() {
        return new GetSumResponse();
    }

    /**
     * Create an instance of {@link VerifyName }
     * 
     */
    public VerifyName createVerifyName() {
        return new VerifyName();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verifyNameResponse")
    public JAXBElement<VerifyNameResponse> createVerifyNameResponse(VerifyNameResponse value) {
        return new JAXBElement<VerifyNameResponse>(_VerifyNameResponse_QNAME, VerifyNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Print }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "print")
    public JAXBElement<Print> createPrint(Print value) {
        return new JAXBElement<Print>(_Print_QNAME, Print.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "printResponse")
    public JAXBElement<PrintResponse> createPrintResponse(PrintResponse value) {
        return new JAXBElement<PrintResponse>(_PrintResponse_QNAME, PrintResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getSumResponse")
    public JAXBElement<GetSumResponse> createGetSumResponse(GetSumResponse value) {
        return new JAXBElement<GetSumResponse>(_GetSumResponse_QNAME, GetSumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verifyName")
    public JAXBElement<VerifyName> createVerifyName(VerifyName value) {
        return new JAXBElement<VerifyName>(_VerifyName_QNAME, VerifyName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getSum")
    public JAXBElement<GetSum> createGetSum(GetSum value) {
        return new JAXBElement<GetSum>(_GetSum_QNAME, GetSum.class, null, value);
    }

}
