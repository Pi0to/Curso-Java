package model.entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

public class Log implements Comparable<Log>{

    private String name;
    private Instant instant;

    public Log() {
    }

    public Log(String name, Instant instant) {
        this.name = name;
        this.instant = instant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(name, log.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Log l){
        return name.compareTo(l.getName());
    }
}
