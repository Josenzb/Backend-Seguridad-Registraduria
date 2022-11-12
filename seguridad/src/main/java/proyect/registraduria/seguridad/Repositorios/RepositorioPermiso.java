package proyect.registraduria.seguridad.Repositorios;

import proyect.registraduria.seguridad.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}
