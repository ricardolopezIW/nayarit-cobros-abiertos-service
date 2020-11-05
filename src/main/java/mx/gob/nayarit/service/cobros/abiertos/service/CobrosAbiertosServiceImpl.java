package mx.gob.nayarit.service.cobros.abiertos.service;

import mx.gob.nayarit.service.cobros.abiertos.repository.CobrosAbiertosRepository;
import mx.gob.nayarit.service.cobros.abiertos.repository.model.CobroAbierto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CobrosAbiertosServiceImpl implements CobrosAbiertosService {

    @Autowired
    private CobrosAbiertosRepository cobrosAbiertosRepository;

    @Override
    public List<CobroAbierto> all() {
        return cobrosAbiertosRepository.findAll();
    }
}
