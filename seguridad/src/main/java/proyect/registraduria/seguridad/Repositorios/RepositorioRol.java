package proyect.registraduria.seguridad.Repositorios;

import proyect.registraduria.seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends MongoRepository<Rol,String> {
}