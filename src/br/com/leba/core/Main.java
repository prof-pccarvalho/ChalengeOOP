package br.com.leba.core;

import br.com.leba.domain.Bootcamp;
import br.com.leba.domain.Course;
import br.com.leba.domain.Dev;
import br.com.leba.domain.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Curso Java");
        course1.setDescription("Descrição Curso Java");
        course1.setWorkload(16);

        Course course2 = new Course();
        course2.setTitle("Curso JS");
        course2.setDescription("Descrição Curso JS");
        course2.setWorkload(20);

        Course course3 = new Course();
        course3.setTitle("Curso C#");
        course3.setDescription("Descrição Curso C#");
        course3.setWorkload(24);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Mentoria de Java");
        mentorship.setDescription("Descrição Mentoria Java");
        mentorship.setData(LocalDate.now());

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Mentoria de Testes de Unidade");
        mentorship1.setDescription("Descrição Mentoria Testes");
        mentorship1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(course3);
        bootcamp.getContents().add(mentorship);
        bootcamp.getContents().add(mentorship1);

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.registerBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSubscribedContent());
        devCamila.progress();
        devCamila.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSubscribedContent());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getCompletedContents());
        System.out.println("XP:" + devCamila.calculateTotalXp());

        System.out.println("-------");

        /*System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship);*/

        Dev devJoao = new Dev();
        devJoao.setName("João");
        devJoao.registerBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getSubscribedContent());
        devJoao.progress();
        devJoao.progress();
        devJoao.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getSubscribedContent());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getCompletedContents());
        System.out.println("XP:" + devJoao.calculateTotalXp());

        Dev devMaria = new Dev();
        devMaria.setName("Maria");
        devMaria.registerBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getSubscribedContent());
        devMaria.progress();
        devMaria.progress();
        devMaria.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getSubscribedContent());
        System.out.println("Conteúdos Concluidos Maria:" + devMaria.getCompletedContents());
        System.out.println("XP:" + devMaria.calculateTotalXp());

    }
}
