package us.com.stapassoli.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsConfiguration {

    @Bean(name = "usName")
    public String usName(){
        return "Aplicação de fora do pacote que tem o spring";
    };


}
