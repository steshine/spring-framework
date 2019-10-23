package cn.steshine.readnote;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {
	@Bean(name = "tool")
	public ToolFactory toolFactory() {
		ToolFactory factory = new ToolFactory();
		factory.setFactoryId(7070);
		factory.setId(2);
		return factory;
	}

	@Bean
	public Tool tool() throws Exception {
		return toolFactory().getObject();
	}
}
