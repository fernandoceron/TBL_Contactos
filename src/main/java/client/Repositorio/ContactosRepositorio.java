package client.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import client.Modelo.Contactos;

@Repository
public interface ContactosRepositorio extends JpaRepository<Contactos, Long> {

}
