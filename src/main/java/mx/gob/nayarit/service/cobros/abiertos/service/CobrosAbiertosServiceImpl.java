package mx.gob.nayarit.service.cobros.abiertos.service;

import mx.gob.nayarit.service.cobros.abiertos.repository.CobrosAbiertosRepository;
import mx.gob.nayarit.service.cobros.abiertos.repository.model.CobroAbierto;
import org.bson.types.ObjectId;
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

    @Override
    public String genera(CobroAbierto cobroAbierto) {
        cobrosAbiertosRepository.save(cobroAbierto);
        return "ok";
    }
}
