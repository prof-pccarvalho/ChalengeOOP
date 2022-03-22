package br.com.leba.domain;

public abstract class Content {

    protected static final double PATTERN_XP = 10d;

    private String title;
    private String description;

    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String titulo) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
