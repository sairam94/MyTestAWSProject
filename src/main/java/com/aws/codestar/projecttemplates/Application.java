package com.aws.codestar.projecttemplates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Simple class to start up the application.
 *
 * @SpringBootApplication adds:
 *  @Configuration
 *  @EnableAutoConfiguration
 *  @ComponentScan
 */
@SpringBootApplication
public class Application {
	//Test Changes 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
