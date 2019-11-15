package al.prodream.embedded;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author aleksruci on 14/Nov/2019
 */

@SpringBootApplication
public class ProDreamEmbeddedApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProDreamEmbeddedApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
