package proyect.registraduria.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import proyect.registraduria.seguridad.Modelos.PermisosRoles;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles, String>{
}
