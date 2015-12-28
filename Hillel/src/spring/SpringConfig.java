package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by RMysholovka on 28.12.2015.
 */
@Configuration
public class SpringConfig {

    @Bean
    public DamselRescuingKnight knight() {
        DamselRescuingKnight knight = new DamselRescuingKnight();

        return knight;
    }

    @Bean
    public DamselRescuingQuest quest() {
        return new DamselRescuingQuest();
    }
}
