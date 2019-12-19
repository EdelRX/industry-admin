package com.csim.industryadmin.activators;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.csim.industryadmin.model.IndustryModel;

@MessageEndpoint
public class HttpConsumingChannelActivator {
	@ServiceActivator(inputChannel = "httpConsumingChannel")
	public void upperCase(IndustryModel input) {
		System.out.println("Read message from JMS queue: " + input.toString());
	}
}
