package com.hepsiburada;


import com.google.common.eventbus.EventBus;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.mobile.DeviceResolverAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.reactor.ReactorAutoConfiguration;
import org.springframework.boot.autoconfigure.security.FallbackWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.web.WebAppConfiguration;

@ComponentScan(basePackages = {"com.hepsiburada"})
@EnableAsync
@SpringBootApplication(exclude = {
    AopAutoConfiguration.class,
    BatchAutoConfiguration.class,
    DeviceResolverAutoConfiguration.class,
    FallbackWebSecurityAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class,
    JpaRepositoriesAutoConfiguration.class,
    JmxAutoConfiguration.class,
    MessageSourceAutoConfiguration.class,
    MongoAutoConfiguration.class,
    MongoRepositoriesAutoConfiguration.class,
    MultipartAutoConfiguration.class,
    RabbitAutoConfiguration.class,
    ReactorAutoConfiguration.class,
    SecurityAutoConfiguration.class,
    ThymeleafAutoConfiguration.class,
    VelocityAutoConfiguration.class,
    WebAppConfiguration.class
})
/*@PropertySource(value = {"file:${CIMRI_CONFIG_PATH:/opt/hepsiburada/config}/${CIMRI_PROFILE:test}/automation-test.properties"})*/
public class ApplicationTest {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public EventBus eventBus() {
        return Mockito.mock(EventBus.class);
    }

}
