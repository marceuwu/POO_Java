package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido(a),");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Kia", "Sorento");
        uberX.setPassenger(3);
        uberX.printDataCar();
        System.out.println("Disfrute su viaje!");
    }
}

