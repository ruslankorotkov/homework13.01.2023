public class Truck extends Transport<DriverC> {
    public enum LoadCapacity {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");
        private String capacity;

        LoadCapacity(String capacity) {
        }
    }

    private String capacity;

    public String getCapacity() {
        return capacity;
    }

    public Truck(String brand, String model, double engineVolume, DriverC driver, String capacity) {
        super(brand, model, engineVolume, driver);
        if (capacity == null || capacity.isEmpty() || capacity.isBlank()) {
            this.capacity = " default ";
        }else {
            this.capacity = capacity;
        }
    }

    @Override
    public void startMoving() {
        System.out.println(" Грузовой  автомобиль марки: " + getBrand() + " НАЧАЛ ДВИЖЕНИЕ ");

    }

    @Override
    public void stopMoving() {
        System.out.println(" Грузовой автомобиль марки: " + getBrand() + " ЗАКОНЧИЛ ДВИЖЕНИЕ ");

    }

    @Override
    public void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
    }


    @Override
    public void pitStop() {
        System.out.println(" ПИТ-СТОП у грузовика " + getBrand());

    }

    @Override
    public void bestTimeCycle() {
        System.out.println("  ЛУЧШЕЕ ВРЕМЯ КРУГА у грузовика " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println(" МАКСИМАЛЬНАЯ СКОРОСТЬ у грузовика" + getBrand());

    }

    @Override
    public String toString() {
        return " ГРУЗОВИК " + super.toString() +
                " грузоподъёмность " + capacity;
    }

}

