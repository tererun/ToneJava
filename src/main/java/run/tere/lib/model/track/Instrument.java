package run.tere.lib.model.track;

public class Instrument {

    private final String family;
    private final int number;
    private final String name;

    public Instrument(String family, int number, String name) {
        this.family = family;
        this.number = number;
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

}
