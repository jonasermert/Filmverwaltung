package de.jonasermert.filmverwaltung.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "benutzer_id_gen", sequenceName = "benutzer_id_seq")
public class Benutzer {

    @Id
    @Column(name="benutzer_id")
    @GeneratedValue(generator = "benutzer_id_gen")
    private Integer id;

    @Column(name="benutzer_username")
    @NotNull(message= "Der Benutzername darf nicht leer sein")
    private String username;

    @Column(name="benutzer_password")
    @Length(min = 8, message = "Das Passwort muss mindestens 8 Zeichen haben")
    private String password;

    @OneToMany(mappedBy = "autor")
    private List<Bewertung> bewertungen;

    @OneToMany(mappedBy = "benutzer")
    private List<Film> filme;
}
