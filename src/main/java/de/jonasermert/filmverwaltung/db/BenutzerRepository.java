package de.jonasermert.filmverwaltung.db;

import de.jonasermert.filmverwaltung.model.Benutzer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenutzerRepository extends JpaRepository<Benutzer, Integer> {
}
