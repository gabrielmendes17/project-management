package br.com.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class MainServer  {

//    Passar CPF do responsavel para salvar projeto ou nao ???
//    Criar validacoes e regras para salvar o projeto.
//    Criar listagem dinamica de projetos do banco de dados.
//    Criar edicao de projetos.
//    Criar exclusao de projetos.

	public static void main( String[] args )    {
        SpringApplication.run(MainServer.class, args);
    }

}
