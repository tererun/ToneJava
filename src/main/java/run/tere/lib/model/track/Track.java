package run.tere.lib.model.track;

import java.util.List;

public class Track {

    private final int channel;
    private final Object controlChanges;
    private final List<Object> pitchBends;
    private final Instrument instrument;
    private final String name;
    private final List<Note> notes;
    private final int endOfTrackTicks;

    public Track(int channel, Object controlChanges, List<Object> pitchBends, Instrument instrument, String name, List<Note> notes, int endOfTrackTicks) {
        this.channel = channel;
        this.controlChanges = controlChanges;
        this.pitchBends = pitchBends;
        this.instrument = instrument;
        this.name = name;
        this.notes = notes;
        this.endOfTrackTicks = endOfTrackTicks;
    }

    public int getChannel() {
        return channel;
    }

    public Object getControlChanges() {
        return controlChanges;
    }

    public List<Object> getPitchBends() {
        return pitchBends;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public String getName() {
        return name;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public int getEndOfTrackTicks() {
        return endOfTrackTicks;
    }

}
