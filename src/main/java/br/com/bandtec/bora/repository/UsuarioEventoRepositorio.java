package br.com.bandtec.bora.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.com.bandtec.bora.model.entity.UsuarioEvento;;

@Repository
public interface UsuarioEventoRepositorio extends JpaRepository<UsuarioEvento, Long> {

	@Query("select u from UsuarioEvento u where u.evento = :id")
	List<UsuarioEvento> participantes(@Param("id") int id);
}
