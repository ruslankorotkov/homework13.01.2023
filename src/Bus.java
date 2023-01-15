public class Bus extends Transport<DriverD> {
    public enum PassengerCapacity {
        EXTRA_SMALL("особо малая (до 10 мест)"),
        SMALL("малая (до 25)"),
        AVERAGE("средняя (40–50)"),
        BIG("большая (60–80)"),
        ESPECIALLY_LARGE("особо большая (100–120 мест)");

        private final String places;

        public String getPlaces() {
            return places;
        }

        PassengerCapacity(String places) {
            this.places = places;
        }


    }

    private PassengerCapacity places;


    public Bus(String brand, String model, double engineVolume, DriverD driver, PassengerCapacity places) {
        super(brand, model, engineVolume, driver);
        if (places == null) {
            this.places = PassengerCapacity.valueOf(" НУЖНО УКАЗАТЬ МЕСТА ");
        } else {
            this.places = places;
        }
    }

    @Override

    public void startMoving() {
        System.out.println(" Автобус марки: " + getBrand() + " НАЧАЛ ДВИЖЕНИЕ. ");
    }

    @Override
    public void stopMoving() {
        System.out.println(" Автобус марки: " + getBrand() + " ЗАКОНЧИЛ ДВИЖЕНИЕ. ");
    }

    @Override
    public void printType() {
        System.out.println("Данных по транспортному средству АВТОБУС " + super.toString() +
                " вместимость " + places.getPlaces() + " недостаточно.");
    }


    @Override
    public void pitStop() {
        System.out.println(" ПИТ-СТОП у автобуса. " + getBrand());

    }

    @Override
    public void bestTimeCycle() {
        System.out.println("  ЛУЧШЕЕ ВРЕМЯ КРУГА у автобуса. " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println(" МАКСИМАЛЬНАЯ СКОРОСТЬ у автобуса. " + getBrand());

    }

    public PassengerCapacity getPlaces() {
        return places;
    }

    @Override
    public String toString() {
        return " АВТОБУС " + super.toString() +
                " вместимость " + places.getPlaces();
    }
}
