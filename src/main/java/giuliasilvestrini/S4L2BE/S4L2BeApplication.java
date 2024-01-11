package giuliasilvestrini.S4L2BE;

import giuliasilvestrini.S4L2BE.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EntityScan(basePackages = "giuliasilvestrini.S4L2BE.entities")

public class S4L2BeApplication {

    public static void main(String[] args) {
        SpringApplication.run(S4L2BeApplication.class, args);

    }

}
