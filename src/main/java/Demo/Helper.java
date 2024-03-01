package Demo;


import org.springframework.stereotype.Component;

@Component
public class Helper implements Staff {
//for annotation based injection
    public void assist(){
        System.out.println("Helper is Supporting");
    }

}
