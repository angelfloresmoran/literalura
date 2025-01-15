package com.angelodev.literalura.repository;

import com.angelodev.literalura.modelo.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IAutorRepository extends JpaRepository <Autor, Long> {

    Autor findByNombreAutorContainsIgnoreCase(String nombreAutor);

    List<Autor> findByAnioNacimientoGreaterThanEqualAndAnioFallecimientoLessThanEqual(int anioNacimiento, int anioFallecimiento);

}
