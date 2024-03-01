package Demo;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "demo") //same tag used in the XML
public class JavaConfig  {
//for annotation based injection


    //defining bean itself to use
    @Bean
    public Doctor doctor(){
        return new Doctor("MBBS");
    }

}
