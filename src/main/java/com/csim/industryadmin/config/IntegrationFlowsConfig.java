package com.csim.industryadmin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

import com.csim.industryadmin.handlers.HttpIntegrationHandler;
import com.csim.industryadmin.transformers.HttpIntegrationTransformer;

@Configuration
public class IntegrationFlowsConfig {
	
	@Autowired
	@Qualifier("httpConsumingChannel")
	DirectChannel channel;
	
	@Autowired
	HttpIntegrationTransformer httpIntegrationTransformer;
	
	@Autowired
	HttpIntegrationHandler httpIntegrationHandler;
	
	@Bean
	public IntegrationFlow httpReader() {
		return IntegrationFlows.from(channel)
				.transform(httpIntegrationTransformer,"transform")
				.handle(httpIntegrationHandler, "handle")
				.get();
	}
}
