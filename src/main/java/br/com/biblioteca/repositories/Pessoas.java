package br.com.biblioteca.repositories;

import br.com.biblioteca.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Pessoas  extends JpaRepository<Pessoa, Long> {
}
