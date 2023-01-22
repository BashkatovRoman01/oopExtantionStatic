public class Car extends Transport {
    private final String bodyType;
    private boolean isSummerRubber;
    private String transmission;
    private String number;
    private final int seatCount;
    private double enginePower;
    private Key key;
    private Insuarance insuarance;

    public Car(String brand, String model, int year, String country, String color, Integer maxSpeed, String bodyType, boolean isSummerRubber, String transmission, String number, int seatCount, int enginePower) {
        super(brand, model, year, country, color, maxSpeed, String refillType);
        this.bodyType = validateCarParameters(bodyType);
        this.isSummerRubber = isSummerRubber;
        this.transmission = validateCarParameters(transmission);
        this.number = validateCarParameters(number);
        this.seatCount = validateCarParameters(seatCount);
        this.enginePower = validateCarParameters(enginePower);
    }

    public String getBodyType() {
        return bodyType;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getNumber() {
        return number;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public Key getKey() {
        return key;
    }

    public Insuarance getInsuarance() {
        return insuarance;
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }

    public void setNumber(String number) {
        this.number = validateCarNumber(number);
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsuarance(Insuarance insuarance) {
        this.insuarance = insuarance;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = validateEnginePower(enginePower);
    }

    @Override
    public String toString() {
        return " Марка автомобиля " + brand + " модель " + model + " объем двигателя " + enginePower + " цвет " + color + " год выпуска " + year + " страна производитель " + country;
    }

    public int validateSeatCount(int seatCount) {
        return seatCount <= 0 ? 4 : seatCount;
    }

    public static String validateCountry(String vslue) {
        return validateString(value, "Rus");
    }

    public static double validateEnginePower(double value) {
        return value < 0 ? 1.5 : value;
    }

    public static Integer validateYear(Integer value) {
        return value == null || value <= 1900 ? 2000 : value;
    }

    public static String validateCarParameters(String value) {
        return value == null ? "не указано" : value;
    }

    public static String validateCarColor(String value) {
        return validateString(value, "белый");
    }

    public static String validateTransmission(String value) {
        return validateString(value, "автомат");
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = validateBoolean(remoteStart);
            this.keylessAccess = validateBoolean(keylessAccess);
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }
}

