package com.soap.wsdl;

import com.soap.wsdl.wsdl.Input;
import com.soap.wsdl.wsdl.Output;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class GetLinkClient extends WebServiceGatewaySupport {

    public Output getUrl(String remitanceNo) {

        Input request = new Input();
        request.setREFNO(remitanceNo);

        Output response = (Output) getWebServiceTemplate()
                .marshalSendAndReceive("http://10.243.215.42:9031/PrismaGateway/services/InquiryRemittanceNo.Soap11/",
                        request,
                        new SoapActionCallback("http://10.243.215.42:9031/PrismaGateway/services/InquiryRemittanceNo.Soap12/"));

        return response;
    }
}
