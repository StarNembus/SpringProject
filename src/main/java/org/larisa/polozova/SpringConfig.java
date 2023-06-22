package org.larisa.polozova;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.larisa.polozova")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
