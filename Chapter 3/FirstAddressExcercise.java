public class FirstAddressExcercise {

    public static void main(String[] args) {
        System.out.println("First Java Application.");
        displayAddress();
    }

    public static void displayAddress() {
        String company = "Apple";
        String companyAddress = "One Apple Park Way\nCupertino, CA 95014";

        System.out.println("Address: " + companyAddress);
        System.out.println("Company: " + company);
    }

}
