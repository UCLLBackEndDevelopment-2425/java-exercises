package _5_collections_optionals_debugging.exercise3;

public class LicensePlate {

    // final variables cannot be changes after object creation
    private final String code;
    private final String landCode;

    public LicensePlate(String landCode, String code) {
        this.code = code;
        this.landCode = landCode;
    }

    @Override
    public String toString() {
        return landCode + " " + code;
    }
}
