package com.company;

public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger; //Cantidad de pasajeros

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;

    }

    void printDataCar() {
        if(passenger!= null){
            System.out.println("La matrícula de su Uber es: " + license + ", Conductor: " + driver.name + ", Viaje para: " + passenger+ " pasajeros. ");
        }

    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if (passenger<=4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros.");
        }
    }


}
