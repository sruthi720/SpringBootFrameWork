package Demo;

//@Component
public class Doctor implements Staff {


    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    private String qualification;//we can inject he values of the properties from the xml files
    private warden nurse;//can inject a specific object also


    public warden getNurse() {
        return nurse;
    }

    public void setNurse(warden nurse) {
        this.nurse = nurse;
    }



    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    public void assist(){
        System.out.println("Doctor is assisting");
    }

}
