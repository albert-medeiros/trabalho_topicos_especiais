package trabalho.teii.trabalho.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trabalho.teii.trabalho.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
