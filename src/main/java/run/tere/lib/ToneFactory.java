package run.tere.lib;

import com.google.gson.Gson;
import run.tere.lib.model.MidiJson;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ToneFactory {

    public static MidiJson parse(File file) {
        if (!file.exists()) return null;
        try (Reader reader = new InputStreamReader(
                new FileInputStream(file), StandardCharsets.UTF_8)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, MidiJson.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static MidiJson parse(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, MidiJson.class);
    }

}
