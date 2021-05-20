public class Registrar {
    public String registrar_name;
    public String registrar_phone;
    public String registrar_experience;

    public void setRegistrar_name(String registrar_name) {
        this.registrar_name = registrar_name;
    }

    public String getRegistrar_name() {
        return registrar_name;
    }

    public void setRegistrar_phone(String registrar_phone) {
        this.registrar_phone = registrar_phone;
    }

    public String getRegistrar_phone(){
        return registrar_phone;
    }

    public void setRegistrar_experience(String registrar_experience) {
        this.registrar_experience = registrar_experience;
    }

    public String getRegistrar_experience() {
        return registrar_experience;
    }


    public void request() {
        System.out.println("The request for patient documents was made.");
    }

    public void data_entry() {
        System.out.println("Entering patient data in his/her personal card.");
    }

    public void making() {
        System.out.println("Make an appointment with:");
    }

    public void accepting() {
        System.out.println("Accepting payment.");
    }
}