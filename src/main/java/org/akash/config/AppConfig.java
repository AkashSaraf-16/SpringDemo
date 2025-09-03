package org.akash.config;


import org.akash.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "desk")
    public Desktop desktop(){
        return new Desktop();
    }

    /* important annotations:
    Bean name:
    @Bean(name = {"Beast","desktop","com1"})
	@Bean
	Bean Scope:
	@Scope("prototype")
	public Desktop desktop() {
		return new Desktop();
	}


     */
}
