public class MenuDemo {
    public static void main(String[] args) {
        
        Gacoan gacoan1 = new Gacoan("Mie Gacoan", 10000, "50", "4.8", "3");
        gacoan1.buatMie("3");
        System.out.println(gacoan1.getInfo());

        Dikichi dikichi1 = new Dikichi("Ayam Dikichi", 15000, "30", "4.6", "Original");
        dikichi1.gorengAyam("Original");
        System.out.println(dikichi1.getInfo());
    }
}

