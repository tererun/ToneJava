package run.tere.lib.model.header;

public class KeySignature {

    private final String key;
    private final String scale;
    private final int ticks;

    public KeySignature(String key, String scale, int ticks) {
        this.key = key;
        this.scale = scale;
        this.ticks = ticks;
    }

    public String getKey() {
        return key;
    }

    public String getScale() {
        return scale;
    }

    public int getTicks() {
        return ticks;
    }

}
