package br.com.leba.domain;

import java.time.LocalDate;

public class Mentorship  extends Content {
    private LocalDate date;

    @Override
    public double calculateXp() {
        return PATTERN_XP + 20d;
    }

    public Mentorship() {
    }

    public LocalDate getData() {
        return date;
    }

    public void setData(LocalDate data) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", data=" + date +
                '}';
    }
}
