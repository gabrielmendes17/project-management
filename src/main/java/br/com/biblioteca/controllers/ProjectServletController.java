package br.com.biblioteca.controllers;

import br.com.biblioteca.models.Pessoa;
import br.com.biblioteca.models.Projeto;
import br.com.biblioteca.repositories.PessoasRepository;
import br.com.biblioteca.repositories.ProjetosRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@WebServlet(name = "Servlet" , urlPatterns = {"/projectServletController"})
public class ProjectServletController extends HttpServlet {

    @Autowired
    IndexController indexController;

    @Autowired
    PessoasRepository pessoasRepository;

    @Autowired
    ProjetosRepository projetoRepository;

    @GetMapping("/projectServletController")
    public String home(Model model, HttpServletRequest httpServletRequest) {
        return "index";
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Projeto projeto = this.fromRequestToProject(request);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao Albino dos Santos");
        pessoa.setCpf("13989406744");
        pessoa.setDataNascimento(new Date());
        pessoasRepository.save(pessoa);


        projeto.setPessoas(Arrays.asList(pessoa));

        Projeto save = projetoRepository.save(projeto);

        System.out.println(save);

        response.sendRedirect("/");
    }

    private Projeto fromRequestToProject(HttpServletRequest request) throws ParseException {
        String name = request.getParameter("Name");
        String initialDateString = request.getParameter("InitialDate");
        Date initialDate = new SimpleDateFormat("yyyy-MM-dd").parse(initialDateString);
        String responsibleManager = request.getParameter("ResponsibleManager");
        String realEndDateString = request.getParameter("RealEndDate");
        Date realEndDate = new SimpleDateFormat("yyyy-MM-dd").parse(realEndDateString);
        Float totalBudget = Float.parseFloat(request.getParameter("TotalBudget"));
        String description = request.getParameter("Description");
        String status = request.getParameter("Status");

        Projeto projeto = new Projeto();
        projeto.setNome(name);
        projeto.setDataFim(realEndDate);
        projeto.setDescricao(description);
        projeto.setOrcamento(totalBudget);
        projeto.setDataPrevisaoFim(initialDate);
        return projeto;
    }
}
