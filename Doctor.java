public class Doctor {
    public String doc_name;
    public String doc_phone;
    public String skill;
    public String experience;


    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_phone(String doc_phone){
        this.doc_phone = doc_phone;
    }

    public String getDoc_phone() {
        return doc_phone;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkill(){
        return skill;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getExpereince() {
        return experience;
    }

    public void admission(){
        System.out.println("Patient admission is done.");
    }

    public void purpose(){
        System.out.println("Treatment appoinments were assigned.");
    }

    public void introduction (){
        System.out.println("The patient was examined, treatment was prescribed and symptoms were recorded.");
    }

    public void appointment (){
        System.out.println("We recommend you to visit us again in a week.");
    }

    public void output_doctor() {
        System.out.println("Doctor's name - " + doc_name);
        System.out.println("Doctor's phone -" + doc_phone);
        System.out.println("Direction of activity -" + skill);
        System.out.println("Work experience - " + experience);
    }

    public Doctor (String doc_name, String doc_phone, String skill, String experience) {
        this.doc_name = doc_name;
        this.doc_phone = doc_phone;
        this.skill = skill;
        this.experience = experience;
    }
}