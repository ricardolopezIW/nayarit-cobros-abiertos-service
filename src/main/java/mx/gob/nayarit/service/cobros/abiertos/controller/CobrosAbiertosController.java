package mx.gob.nayarit.service.cobros.abiertos.controller;

import mx.gob.nayarit.service.cobros.abiertos.repository.model.CobroAbierto;
import mx.gob.nayarit.service.cobros.abiertos.service.CobrosAbiertosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cobros-abiertos")
public class CobrosAbiertosController {

    @Autowired
    private CobrosAbiertosService cobrosAbiertosService;

    @GetMapping
    public ResponseEntity<List<CobroAbierto>> get(){
        return ResponseEntity.ok(cobrosAbiertosService.all());
    }
}



