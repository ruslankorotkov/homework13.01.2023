public class Main {
    public static void main(String[] args) {
        DriverB ivan = new DriverB(" Иван ", true, " 6 лет ");
        DriverB vova = new DriverB(" Вова ", true, " 32 лет ");
        DriverB zuric = new DriverB(" Зурик ", true, " 3 лет ");
        DriverB nik = new DriverB(" Николай ", true, " 6 лет ");
        DriverC oleg = new DriverC(" Олег ", true, " 5 лет ");
        DriverD boris = new DriverD(" Борис ", false, " 7 лет ");
        Car lada = new Car("Lada", "Granta", 1.7, ivan, "Седан");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, vova, "Внедорожник");
        Car bmv = new Car("BMW", "Z8", 3.0, zuric, "Кроссовер");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, nik, "");
        Bus hyundai = new Bus("Hyundai", "Avante", 1.6, boris, "большая (60–80)");
        Bus ural = new Bus("Урал", "Next", 20.22, boris, "малая (до 25)");
        Bus paz = new Bus(" Паз", "Вектор Next", 20.20, boris, "большая (60–80)");
        Bus мercedes = new Bus("Mercedes-Benz", "Tourismo", 20.21, boris, "особо большая (100–120 мест)");
        Truck kamaz = new Truck("Камаз", "компас", 12.45, oleg, "с полной массой до 3,5 тонн");
        Truck zil = new Truck("Зил", "43", 24.12, oleg, "с полной массой свыше 3,5 до 12 тонн");
        Truck man = new Truck("Man", "TGL", 12.45, oleg, "с полной массой свыше 12 тонн");
        System.out.println(" водитель " + boris.getName() + " управляет автомобилем " + мercedes + " и будет участвовать в заезде. ");
        System.out.println(" водитель " + oleg.getName() + " управляет автомобилем " + kamaz + " и будет участвовать в заезде. ");
        System.out.println(" водитель" + ivan.getName() + " управляет автомобилем " + lada + " и будет участвовать в заезде. ");
        System.out.println(" водитель" + vova.getName() + " управляет автомобилем " + audi + " и будет участвовать в заезде. ");
        System.out.println(" водитель" + zuric.getName() + " управляет автомобилем " + bmv + " и будет участвовать в заезде. ");
        System.out.println(" водитель" + nik.getName() + " управляет автомобилем " + kia + " и будет участвовать в заезде. ");
    }
}