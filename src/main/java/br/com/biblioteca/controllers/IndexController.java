package br.com.biblioteca.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.biblioteca.models.Projeto;
import br.com.biblioteca.repositories.PessoasRepository;
import br.com.biblioteca.repositories.ProjetosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Controller
public class IndexController {


	@Autowired
	PessoasRepository pessoasRepository;

	@Autowired
	ProjetosRepository projetoRepository;

	@GetMapping("/")
	public String home(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
			List<Projeto> listProjeto = projetoRepository.findAll();
			request.setAttribute("listProjeto", listProjeto);

			return "index";
	}
}
