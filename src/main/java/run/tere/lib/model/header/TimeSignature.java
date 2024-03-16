package run.tere.lib.model.header;

public class TimeSignature {

    private final int ticks;
    private final int[] timeSignature;
    private final int measures;

    public TimeSignature(int ticks, int[] timeSignature, int measures) {
        this.ticks = ticks;
        this.timeSignature = timeSignature;
        this.measures = measures;
    }

    public int getTicks() {
        return ticks;
    }

    public int[] getTimeSignature() {
        return timeSignature;
    }

    public int getMeasures() {
        return measures;
    }

}
