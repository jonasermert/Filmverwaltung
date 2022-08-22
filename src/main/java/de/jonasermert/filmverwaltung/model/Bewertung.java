package de.jonasermert.filmverwaltung.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "bewertung_id_gen", sequenceName = "bewertung_id_seq")
public class Bewertung {

    @Id
    @Column(name="bewertung_id")
    @GeneratedValue(generator = "bewertung.id.gen")
    private Integer id;

    @Column(name="bewertung_text")
    @NotBlank(message = "Die Bewertung darf nicht leer sein")
    @Length(min = 5, message = "Die Bewertung muss aus mindestens 5 zeichen bestehen")
    private String text;

    @Column(name="bewertung_score")
    @Min(value = 1, message = "Das Rating muss zwischen 1 und 10 liegen")
    @Max(value = 10, message = "Das Rating muss zwischen 1 und 10 liegen")
    private Integer score;

    @ManyToOne
    private Film film;

    @ManyToOne
    private Benutzer autor;

}
