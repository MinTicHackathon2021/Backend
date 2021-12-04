/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.controller;

import PlataformaGame.Game.entity.CrearJuego;
import PlataformaGame.Game.service.CrearJuegoService;
import java.util.List;
import java.util.Optional;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eduar
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/crearJuego")
public class CrearJuegoController {

    @Autowired
    private CrearJuegoService crearJuegoService;

    @GetMapping("/api")
    public List<CrearJuego> findAllGames() {
        return crearJuegoService.getGames();
    }

    @GetMapping("/{id}")
    public Optional<CrearJuego> findGameId(@PathVariable int id) {
        return crearJuegoService.getGameId(id);
    }

    @PostMapping("/save")
    public ResponseEntity saveGame(@RequestBody CrearJuego crearJuego) {
        crearJuegoService.saveGame(crearJuego);
        return ResponseEntity.status(201).build();

    }

}
