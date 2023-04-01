package org.example;

public class Track {

    public Double lineTrack;

    public Track(Double lineTrack) {
        this.lineTrack = lineTrack;
    }

    @Override
    public String toString() {
        return "Дистанция " + lineTrack;
    }
}
