package mx.gob.nayarit.service.cobros.abiertos.repository;

import mx.gob.nayarit.service.cobros.abiertos.repository.model.CobroAbierto;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CobrosAbiertosRepository extends MongoRepository<CobroAbierto, ObjectId> {
}
