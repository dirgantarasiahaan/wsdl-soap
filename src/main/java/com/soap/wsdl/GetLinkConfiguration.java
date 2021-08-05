package com.soap.wsdl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class GetLinkConfiguration {

    @Bean
    public Jaxb2Marshaller  marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.soap.wsdl.wsdl");
        return marshaller;
    }
//
    @Bean
    public GetLinkClient getLinkClient(Jaxb2Marshaller marshaller) {
        GetLinkClient client = new GetLinkClient();
        client.setDefaultUri("http://10.243.215.42:9031");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
