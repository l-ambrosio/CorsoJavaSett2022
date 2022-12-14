package srl.neotech.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import srl.neotech.test.Automobile;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "srl.neotech")
public class SpringBootTomcatApplication  extends SpringBootServletInitializer{
	  
	public static void main(String[] args) {
		
		
		Automobile auto=new Automobile();
		auto.getMotore().setCilindrata(1550);

        SpringApplication.run(SpringBootTomcatApplication.class, args);
 
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    	
    	
        return builder.sources(SpringBootTomcatApplication.class);
    }
}
