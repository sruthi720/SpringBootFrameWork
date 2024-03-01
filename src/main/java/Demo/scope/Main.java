package Demo.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        Attender attender = context.getBean(Attender.class);
        attender.assist();
        attender.setQualification("MBBS");

//        System.out.println(attender.getQualification());
//        System.out.println(attender);
//
//        Attender attender1 = context.getBean(Attender.class);
//        System.out.println(attender1);
    }
}
