
package cn.com.webxml;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> <strong>中文<->英文双向翻译 WEB 服务</strong>，本词典库中大部分单词是由程序根据词频和英<->中单词间相互关联程度自动生成，难免存在有解释错误和牵强的地方请大家谅解。</br>此中文<->英文双向翻译Web Services请不要用于任何商业目的，若有需要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>，欢迎技术交流。 QQ：8409035<br /><strong>使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持</strong>！<br /><br />&nbsp;
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TranslatorWebService", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "http://www.webxml.com.cn/WebServices/TranslatorWebService.asmx?wsdl")
public class TranslatorWebService
    extends Service
{

    private final static URL TRANSLATORWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSLATORWEBSERVICE_EXCEPTION;
    private final static QName TRANSLATORWEBSERVICE_QNAME = new QName("http://WebXml.com.cn/", "TranslatorWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webxml.com.cn/WebServices/TranslatorWebService.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSLATORWEBSERVICE_WSDL_LOCATION = url;
        TRANSLATORWEBSERVICE_EXCEPTION = e;
    }

    public TranslatorWebService() {
        super(__getWsdlLocation(), TRANSLATORWEBSERVICE_QNAME);
    }

    public TranslatorWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSLATORWEBSERVICE_QNAME, features);
    }

    public TranslatorWebService(URL wsdlLocation) {
        super(wsdlLocation, TRANSLATORWEBSERVICE_QNAME);
    }

    public TranslatorWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSLATORWEBSERVICE_QNAME, features);
    }

    public TranslatorWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TranslatorWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TranslatorWebServiceSoap
     */
    @WebEndpoint(name = "TranslatorWebServiceSoap")
    public TranslatorWebServiceSoap getTranslatorWebServiceSoap() {
        return super.getPort(new QName("http://WebXml.com.cn/", "TranslatorWebServiceSoap"), TranslatorWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TranslatorWebServiceSoap
     */
    @WebEndpoint(name = "TranslatorWebServiceSoap")
    public TranslatorWebServiceSoap getTranslatorWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "TranslatorWebServiceSoap"), TranslatorWebServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSLATORWEBSERVICE_EXCEPTION!= null) {
            throw TRANSLATORWEBSERVICE_EXCEPTION;
        }
        return TRANSLATORWEBSERVICE_WSDL_LOCATION;
    }

}
