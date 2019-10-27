package br.com.bandtec.bora.evento.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.bandtec.bora.core.model.Evento;
import br.com.bandtec.bora.evento.model.dto.CadastrarEvento;
import br.com.bandtec.bora.evento.model.service.EventoService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/v1/admin/eventos")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Api(value = "Endpoints para gerenciar eventos")
public class EventoController {

	private final EventoService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Iterable<Evento>> list(Pageable pageable) throws Exception {
		if (list(pageable).getBody().equals(null))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(service.buscarEventos(pageable), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Evento> buscarEventoPeloId(@PathVariable("id") Long id) {
		Evento evento = service.buscarEventoPeloId(id);

		if (evento.getId().equals(null))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		return ResponseEntity.ok(evento);
	}

}