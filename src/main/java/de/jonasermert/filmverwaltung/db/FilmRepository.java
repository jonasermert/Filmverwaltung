package de.jonasermert.filmverwaltung.db;

import de.jonasermert.filmverwaltung.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface FilmRepository extends JpaRepository<Film, Integer> {
}
