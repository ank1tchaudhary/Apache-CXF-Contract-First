import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"te.cxf.*"})
@EntityScan(basePackages = {"te.cxf.*"})
@EnableJpaRepositories(basePackages = {"te.cxf.*"})
public class CXFApplication {

    public static void main(String[] args) {
        SpringApplication.run(CXFApplication.class,args);
    }
}
