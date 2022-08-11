package com.westbank.ws.client.callbackloancontract;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2022-08-11T20:30:12.666+05:30
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "urn:com:westbank:ws:client:CallbackLoanContract", name = "CallbackLoanContract")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CallbackLoanContract {

    @WebMethod
    @Oneway
    public void send(
        @WebParam(partName = "request", name = "CallbackLoanContractRequest", targetNamespace = "urn:com:westbank:ws:client:CallbackLoanContract")
        CallbackLoanContractRequest request
    );
}
