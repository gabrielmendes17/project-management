package br.com.biblioteca.repositories;

import br.com.biblioteca.models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProjetosRepository extends JpaRepository<Projeto, Long> {
}
