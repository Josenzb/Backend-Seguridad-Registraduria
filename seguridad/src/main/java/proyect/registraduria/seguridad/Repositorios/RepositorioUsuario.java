package proyect.registraduria.seguridad.Repositorios;

import proyect.registraduria.seguridad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}
