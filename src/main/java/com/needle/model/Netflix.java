package com.needle.model;

import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;


@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EnableJpaRepositories
@Entity(name = "netflix")
public class Netflix  implements Serializable {
    @Id
    public @Getter @Setter
    String SHOW_ID;
    public @Getter @Setter
    String TYPE_;
    public @Getter @Setter
    String TITLE;
    public @Getter @Setter
    String DIRECTOR;
    public @Getter @Setter
    String CAST_;
    public @Getter @Setter
    String COUNTRY;
    public @Getter @Setter
    String DATE_ADDED;
    public @Getter @Setter
    String RELEASE_YEAR;
    public @Getter @Setter
    String RATING;
    public @Getter @Setter
    String DURATION;
    public @Getter @Setter
    String LISTED_IN;
    public @Getter @Setter
    String DESCRIPTION;
}
