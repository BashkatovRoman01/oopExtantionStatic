public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, Integer maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public void refill(String fuel) {
        System.out.println(" The bus will be refueled with" + validateRefillType(fuel));
    }

    public static String validateRefillType(String value) {
        if (validateString(value) && (value.equals(" diesel") || value.equals("petrol"))) {
            else{
                return "diesel";
            }
        }
        public String toString () {
            return "Transport{" +
                    "brand='" + getbrand + '\'' +
                    ", model='" + getmodel + '\'' +
                    ", year=" + getyear +
                    ", country='" + getcountry + '\'' +
                    ", color='" + getcolor + '\'' +
                    ", maxSpeed=" + getmaxSpeed +
                    ", fuel='" + getfuel + '\'' +
                    '}';
        }
    }
}