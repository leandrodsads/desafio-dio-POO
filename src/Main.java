import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de java");
		mentoria1.setDescricao("descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("mentoria de js");
		mentoria2.setDescricao("descrição mentoria js");
		mentoria2.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria1);
		System.out.println(mentoria2);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devLeandro = new Dev();
		devLeandro.setNome("Leandro");
		devLeandro.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Leandro:" + devLeandro.getConteudoInscritos());		
		devLeandro.progredir();
		devLeandro.progredir();
		System.out.println("-");		
		System.out.println("Conteúdos Inscritos Leandro:" + devLeandro.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Leandro:" + devLeandro.getConteudoConcluidos());
		System.out.println("XP:" + devLeandro.calcularTotalXp());
		
		System.out.println("------------");
		
		Dev devCaroline = new Dev();
		devCaroline.setNome("Caroline");
		devCaroline.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Caroline:" + devCaroline.getConteudoInscritos());
		devCaroline.progredir();
		devCaroline.progredir();
		devCaroline.progredir();
		System.out.println("-");		
		System.out.println("Conteúdos Inscritos Caroline:" + devCaroline.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Caroline:" + devCaroline.getConteudoConcluidos());
		System.out.println("XP:" + devCaroline.calcularTotalXp());

	}

}
