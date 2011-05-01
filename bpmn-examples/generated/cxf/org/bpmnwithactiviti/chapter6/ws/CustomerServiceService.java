
/*
 * 
 */

package org.bpmnwithactiviti.chapter6.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.3
 * 2011-05-01T08:57:27.414+02:00
 * Generated source version: 2.3.3
 * 
 */


@WebServiceClient(name = "CustomerServiceService", 
                  wsdlLocation = "http://localhost:8081/book-sales-webapp/services/customer?wsdl",
                  targetNamespace = "http://ws.chapter6.bpmnwithactiviti.org/") 
public class CustomerServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.chapter6.bpmnwithactiviti.org/", "CustomerServiceService");
    public final static QName CustomerServicePort = new QName("http://ws.chapter6.bpmnwithactiviti.org/", "CustomerServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8081/book-sales-webapp/services/customer?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8081/book-sales-webapp/services/customer?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public CustomerServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns CustomerService
     */
    @WebEndpoint(name = "CustomerServicePort")
    public CustomerService getCustomerServicePort() {
        return super.getPort(CustomerServicePort, CustomerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerService
     */
    @WebEndpoint(name = "CustomerServicePort")
    public CustomerService getCustomerServicePort(WebServiceFeature... features) {
        return super.getPort(CustomerServicePort, CustomerService.class, features);
    }

}
