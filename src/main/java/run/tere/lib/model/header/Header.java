package run.tere.lib.model.header;

import java.util.List;

public class Header {

    private final List<KeySignature> keySignatures;
    private final List<Meta> meta;
    private final String name;
    private final int ppq;
    private final List<Tempo> tempos;
    private final List<TimeSignature> timeSignatures;

    public Header(List<KeySignature> keySignatures, List<Meta> meta, String name, int ppq, List<Tempo> tempos, List<TimeSignature> timeSignatures) {
        this.keySignatures = keySignatures;
        this.meta = meta;
        this.name = name;
        this.ppq = ppq;
        this.tempos = tempos;
        this.timeSignatures = timeSignatures;
    }

    public List<KeySignature> getKeySignatures() {
        return keySignatures;
    }

    public List<Meta> getMeta() {
        return meta;
    }

    public String getName() {
        return name;
    }

    public int getPpq() {
        return ppq;
    }

    public List<Tempo> getTempos() {
        return tempos;
    }

    public List<TimeSignature> getTimeSignatures() {
        return timeSignatures;
    }

}
