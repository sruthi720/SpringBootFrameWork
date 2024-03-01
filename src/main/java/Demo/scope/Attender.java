package Demo.scope;

import Demo.Staff;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "singleton")
public class Attender implements Staff, BeanNameAware { //BeanNameAware make aware before bean  called


    @Override
    public String toString() {
        return "Attender{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String qualification;
    public  void assist(){
        System.out.println("Attender is assisting");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set bean name method is called !");//aware interfaces

    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct method is called");

    }
    //after post construct method called object will be called
}
