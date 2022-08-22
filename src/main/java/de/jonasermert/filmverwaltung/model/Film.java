package de.jonasermert.filmverwaltung.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name="film_id_gen", sequenceName = "film_id-seq")
public class Film {

    @Id
    @Column(name="film_id")
    @GeneratedValue(generator = "film_id_gen")
    private Integer id;

    @Column(name="film_name")
    private String name;

    @Column(name="film_desc")
    private String description;

    @Column(name="film_year")
    private Integer year;

    @Column(name="film_image", columnDefinition = "BLOB")
    @Lob
    private byte[] image;

    @OneToMany(mappedBy = "Film")
    private List<Bewertung> bewertungen;

    private Benutzer benutzer;

}
