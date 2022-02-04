class Main {
    public static void main(String[] args) {
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        System.out.println("Especificaciones de tu UberX:");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        System.out.println("Especificaciones de tu UberVan:");
        uberVan.setPassenger(1);
        uberVan.printDataCar();


    }
}