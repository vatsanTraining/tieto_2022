
package com.training.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ImageProcessingImplService", targetNamespace = "http://services.training.com/", wsdlLocation = "http://localhost:9000/images?wsdl")
public class ImageProcessingImplService
    extends Service
{

    private final static URL IMAGEPROCESSINGIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException IMAGEPROCESSINGIMPLSERVICE_EXCEPTION;
    private final static QName IMAGEPROCESSINGIMPLSERVICE_QNAME = new QName("http://services.training.com/", "ImageProcessingImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/images?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMAGEPROCESSINGIMPLSERVICE_WSDL_LOCATION = url;
        IMAGEPROCESSINGIMPLSERVICE_EXCEPTION = e;
    }

    public ImageProcessingImplService() {
        super(__getWsdlLocation(), IMAGEPROCESSINGIMPLSERVICE_QNAME);
    }

    public ImageProcessingImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMAGEPROCESSINGIMPLSERVICE_QNAME, features);
    }

    public ImageProcessingImplService(URL wsdlLocation) {
        super(wsdlLocation, IMAGEPROCESSINGIMPLSERVICE_QNAME);
    }

    public ImageProcessingImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMAGEPROCESSINGIMPLSERVICE_QNAME, features);
    }

    public ImageProcessingImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageProcessingImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ImageProcessing
     */
    @WebEndpoint(name = "ImageProcessingImplPort")
    public ImageProcessing getImageProcessingImplPort() {
        return super.getPort(new QName("http://services.training.com/", "ImageProcessingImplPort"), ImageProcessing.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImageProcessing
     */
    @WebEndpoint(name = "ImageProcessingImplPort")
    public ImageProcessing getImageProcessingImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.training.com/", "ImageProcessingImplPort"), ImageProcessing.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMAGEPROCESSINGIMPLSERVICE_EXCEPTION!= null) {
            throw IMAGEPROCESSINGIMPLSERVICE_EXCEPTION;
        }
        return IMAGEPROCESSINGIMPLSERVICE_WSDL_LOCATION;
    }

}
