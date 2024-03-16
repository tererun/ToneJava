package run.tere.lib.model;

import run.tere.lib.model.header.Header;
import run.tere.lib.model.track.Track;

import java.util.List;

public class MidiJson {

    private final Header header;
    private final List<Track> tracks;

    public MidiJson(Header header, List<Track> tracks) {
        this.header = header;
        this.tracks = tracks;
    }

    public Header getHeader() {
        return header;
    }

    public List<Track> getTracks() {
        return tracks;
    }

}
