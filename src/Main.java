public class Main {
    public static void main(String[] args) {
        DriverB ivan = new DriverB(" Иван ", true, " 6 лет ");
        DriverC oleg = new DriverC(" Олег ", true, " 5 лет ");
        DriverD boris = new DriverD(" Борис ", false, " 7 лет ");
        Car lada = new Car("Lada", "Granta", 1.7, ivan);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, ivan);
        Car bmv = new Car("BMW", "Z8", 3.0, ivan);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, ivan);
        Bus hyundai = new Bus("Hyundai", "Avante", 1.6, boris);
        Bus ural = new Bus("Урал", "Next", 20.22, boris);
        Bus paz = new Bus(" Паз", "Вектор Next", 20.20, boris);
        Bus мercedes = new Bus("Mercedes-Benz", "Tourismo", 20.21, boris);
        Truck kamaz = new Truck("Камаз", "компас", 12.45, oleg);
        Truck zil = new Truck("Зил", "43", 24.12, oleg);
        Truck man = new Truck("Man", "TGL", 12.45, oleg);
        System.out.println(" водитель " + boris.getName() + " управляет автомобилем " + мercedes + " и будет участвовать в заезде. ");
        System.out.println(" водитель " + oleg + " управляет автомобилем " + kamaz + " и будет участвовать в заезде. ");
        System.out.println(" водитель" + ivan.getName() + " управляет автомобилем " + lada.getBrand() + " и будет участвовать в заезде. ");
        ivan.startMove();
        ivan.stopMove();
        ivan.refuel();
        lada.startMoving();
        lada.stopMoving();
        lada.pitStop();
        lada.bestTimeCycle();
        lada.maxSpeed();

    }
}