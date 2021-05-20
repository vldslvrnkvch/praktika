public class Polyclinic_card extends Patient {
    public String card_number;
    public String diseases;
    public String appeal;

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getCard_number() {
        return card_number;
    }


    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getDiseases() {
        return diseases;
    }


    public void setAppeal(String appeal) {
        this.appeal = appeal;
    }

    public String getAppeal() {
        return appeal;
    }

    public Polyclinic_card(String name, String phone_number, String birthday, String diseases, String appeal, String card_number) {
        super.name = name;
        super.phone_number = phone_number;
        super.birthday = birthday;
        this.diseases = diseases;
        this.appeal = appeal;
        this.card_number = card_number;
    }

    public void output() {
        System.out.println ("Name - " + super.name);
        System.out.println ("Phone number - " +  super.phone_number);
        System.out.println ("Birthday - " + super.birthday);
        System.out.println ("Patient's diseases - " + diseases);
        System.out.println ("Patient's last appeal - " + appeal);
        System.out.println ("Number of the card - " + card_number);
    }

}