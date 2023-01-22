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
}

