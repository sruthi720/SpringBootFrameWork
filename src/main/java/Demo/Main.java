package Demo;

import Demo.scope.Attender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //xml injection and for annotation based

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//xml injection
//        Doctor staff = context.getBean(Doctor.class);
//        staff.assist();
//        System.out.println(staff.getQualification());//value "MBBS" is injected via setter from xml itself

//        Staff nurse = (Nurse)context.getBean("nurse");
//        nurse.assist();

//  annotation based injection
//        Helper helper =context.getBean(Helper.class);
//        helper.assist();
//
//        Staff staff =context.getBean(Nurse.class);
//        staff.assist();


//javaConfig based injection
        ApplicationContext context1 = new AnnotationConfigApplicationContext(JavaConfig.class);

        Staff staff =context1.getBean(Doctor.class);
        staff.assist();


//        scoping
        Attender attender = context1.getBean(Attender.class);
        attender.setQualification("MBBS");
        System.out.println(attender);




    }
}
