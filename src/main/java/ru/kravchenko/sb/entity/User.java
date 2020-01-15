package ru.kravchenko.sb.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Roman Kravchenko
 */

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "app_User")
public class User extends AbstractEntity {

    @Column(name = "login")
    private String login;

    @Column(name = "passwordHash")
    private String passwordHash;

}
