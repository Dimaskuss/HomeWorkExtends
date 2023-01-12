public class Main {

    public static Car[] cars = new Car[10];


    public static void main(String[] args) {



        cars[5] = new Car("lada", "Granta", 1.7, "желтый", 2015, "Россия",0);
        cars[6] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия",30);
        cars[7] = new Car("BMW", "", 3.0, "черный", 2021, "Германия",250);
        cars[8] = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея",0);
        cars[9] = new Car("", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",60);

        Bus[] buses = new Bus[3];
        buses[0] = new Bus("bus", "fjfj",400,"sjsk","sfd",99);

       printCars();

        System.out.println(buses[0]);
    }
    static void printCars () {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i]==null){
                continue;
            }
            System.out.println(cars[i].toString());
        }

    }



}