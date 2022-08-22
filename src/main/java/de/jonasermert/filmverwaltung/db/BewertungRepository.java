package de.jonasermert.filmverwaltung.db;

import de.jonasermert.filmverwaltung.model.Bewertung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BewertungRepository extends JpaRepository<Bewertung, Integer> {
}
