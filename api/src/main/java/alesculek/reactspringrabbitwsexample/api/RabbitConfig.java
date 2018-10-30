package alesculek.reactspringrabbitwsexample.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Configuration
public class RabbitConfig {

	@Value("${rabbit.host}")
	private String host;

	private String user;

	private String pass;

	public String getHost() {
		return this.host;
	}

	public String getUser() {
		return this.user;
	}

	public String getPass() {
		return this.pass;
	}

}
