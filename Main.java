public class Main {
    public static void main(String[] args) {
        Registrar Olga = new Registrar();
        Olga.request();

        System.out.println();

        Polyclinic_card Marina = new Polyclinic_card("Marina", "55-22-45", "30.08.2000", "Jaundice and diabetes",
                "The last meeting was on 30.11.2020", "123412");
        Marina.output();

        System.out.println();

        Olga.making();

        System.out.println();

        Doctor Ivan_Sergeevich = new Doctor("Ivanov Ivan Sergeevich", "14-89-07", "Therapist", "9 years");
        Ivan_Sergeevich.output_doctor();

        System.out.println();

        Marina.payment();
        System.out.println();

        Ivan_Sergeevich.introduction();
        Ivan_Sergeevich.appointment();
        System.out.println();


    }

}