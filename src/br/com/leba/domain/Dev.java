package br.com.leba.domain;

import java.util.*;

public class Dev {
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();
    private Object Set;

    public void registerBootcamp(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()) {
            this.completedContents.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp() {
        Iterator<Content> iterator = this.completedContents.iterator();
        double add = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calculateXp();
            add += next;
        }
        return add;
    }
        public String getName() {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public Set<Content> getSubscribedContent () {
            return subscribedContent;
        }

        public void setSubscribedContent (Set < Content > subscribedContent) {
            this.subscribedContent = subscribedContent;
        }

        public Set<Content> getCompletedContents () {
            return completedContents;
        }

        public void setCompletedContents (Set<Content> completedContents) {
            this.completedContents = completedContents;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContents);
    }

}