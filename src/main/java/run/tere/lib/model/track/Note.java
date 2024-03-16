package run.tere.lib.model.track;

public class Note {

    private final float duration;
    private final int durationTicks;
    private final int midi;
    private final String name;
    private final int ticks;
    private final double time;
    private final float velocity;

    public Note(float duration, int durationTicks, int midi, String name, int ticks, double time, float velocity) {
        this.duration = duration;
        this.durationTicks = durationTicks;
        this.midi = midi;
        this.name = name;
        this.ticks = ticks;
        this.time = time;
        this.velocity = velocity;
    }

    public float getDuration() {
        return duration;
    }

    public int getDurationTicks() {
        return durationTicks;
    }

    public int getMidi() {
        return midi;
    }

    public String getName() {
        return name;
    }

    public int getTicks() {
        return ticks;
    }

    public double getTime() {
        return time;
    }

    public float getVelocity() {
        return velocity;
    }

}
