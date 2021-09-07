package InMemoryDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication(scanBasePackages = {"InMemoryDB"})
@EnableWebSecurity
public class InMemoryDbApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(InMemoryDbApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(InMemoryDbApplication.class);
    }

}
