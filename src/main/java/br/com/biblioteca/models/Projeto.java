package br.com.biblioteca.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Projeto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_previsao_fim")
    private Date dataPrevisaoFim;

    @Column(name = "data_fim")
    private Date dataFim;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "status")
    private String status;

    @Column(name = "orcamento")
    private Float orcamento;

    @Column(name = "risco")
    private String risco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idgerente", referencedColumnName = "id")
    private Pessoa gerenteResponsavel;

    @ManyToMany
    @JoinTable(name = "membros",
        joinColumns = @JoinColumn(name = "idprojeto"),
        inverseJoinColumns = @JoinColumn(name = "idpessoa"))
    private List<Pessoa> pessoas;

}