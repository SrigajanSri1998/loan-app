package com.westbank.ws.business.loanrisk._2018._06;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2022-08-11T20:30:14.407+05:30
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "urn:com:westbank:ws:business:LoanRisk:2018:06", name = "LoanRisk")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LoanRisk {

    @WebMethod
    @WebResult(name = "LoanRiskResponse", targetNamespace = "urn:com:westbank:ws:business:LoanRisk:2018:06", partName = "response")
    public LoanRiskResponse evaluate(
        @WebParam(partName = "request", name = "LoanRiskRequest", targetNamespace = "urn:com:westbank:ws:business:LoanRisk:2018:06")
        LoanRiskRequest request
    );
}
