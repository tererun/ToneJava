package run.tere.lib.model.header;

public class Meta {

    private final String title;
    private final int ticks;
    private final String type;

    public Meta(String title, int ticks, String type) {
        this.title = title;
        this.ticks = ticks;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public int getTicks() {
        return ticks;
    }

    public String getType() {
        return type;
    }

}
