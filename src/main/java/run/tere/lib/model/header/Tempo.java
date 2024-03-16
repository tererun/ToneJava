package run.tere.lib.model.header;

public class Tempo {

    private final float bpm;
    private final int ticks;

    public Tempo(float bpm, int ticks) {
        this.bpm = bpm;
        this.ticks = ticks;
    }

    public float getBpm() {
        return bpm;
    }

    public int getTicks() {
        return ticks;
    }

}
