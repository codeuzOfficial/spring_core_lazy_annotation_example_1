package dasturlash.uz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class SpringConfig {

    @Lazy
    @Bean
    public Assistant assistant() {
        Assistant assistant = new Assistant();
        return assistant;
    }

    @Bean
    public Professor professor() {
        Professor professor = new Professor();
        return professor;
    }

}
