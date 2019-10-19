package br.com.bandtec.bora.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bandtec.bora.model.dto.CadastrarEvento;
import br.com.bandtec.bora.model.entity.Categoria;
import br.com.bandtec.bora.model.entity.Evento;
import br.com.bandtec.bora.model.entity.SubCategoria;
import br.com.bandtec.bora.model.entity.Usuario;
import br.com.bandtec.bora.model.entity.UsuarioEvento;
import br.com.bandtec.bora.model.excecoes.DomainException;
import br.com.bandtec.bora.model.service.EventoService;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

	@Autowired
	private EventoService eventoService;

	// public List<Evento> buscarTodosEventos(Evento evento) {
	// 	return eventoService.buscarTodosEventos(evento);
	// }

	@PostMapping("/eventos")
	public ResponseEntity<CadastrarEvento> cadastrarEvento(@RequestBody CadastrarEvento cadastrarEvento) {
		eventoService.cadastrarEvento(cadastrarEvento);
		return cadastrarEvento(cadastrarEvento);
	}
	
	@GetMapping
	public List<Evento> buscarTodosEventos(Evento evento) {
		return eventoService.buscarTodosEventos(evento);
	}

	@PutMapping("/{idEvento}")
	public ResponseEntity<Evento> atualizarEvento(@PathVariable(value = "idEvento") Long idEvento,
			@Valid @RequestBody Evento evento) {
		return ResponseEntity.ok(eventoService.atualizarEvento(idEvento, evento));
	}

	@GetMapping("/{nomeEvento}")
	public ResponseEntity<List<Evento>> buscarEventoPorNome(@PathVariable(value = "nomeEvento") String nomeEvento) {
		return ResponseEntity.ok(eventoService.buscarEventoPorNome(nomeEvento));

	}

//	@GetMapping("/{usuario}")
//	public List<Evento> buscarEventosPorUsuario(@RequestBody Evento evento) {
//		return eventoService.buscarEventosPorUsuario(evento.getOrganizador());
//	}

	@GetMapping("/evento-subcategoria/{nmSubcategoria}")
	public List<Evento> buscarEventoPorSubCategoria(@PathVariable(value = "nmSubcategoria") String nmSubcategoria) {
		return (List <Evento>) eventoService.buscarEventoPorSubCategoria(nmSubcategoria);
	}

}