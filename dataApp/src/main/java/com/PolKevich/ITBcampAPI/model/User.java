package com.PolKevich.ITBcampAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "user_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(exclude = "role")
@ToString(exclude = "role")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    @Size(max = 20,min = 2)
    @Pattern(regexp = "^[a-zA-Z]*$")
    private String firstname;

    @Column(name = "lastname")
    @Size(max = 40,min = 2)
    @Pattern(regexp = "^[a-zA-Z]*$")
    private String lastname;

    @Column(name = "patronymic")
    @Size(max = 40)
    @Pattern(regexp = "^[a-zA-Z]*$")
    private String patronymic;

    @Column(name = "email")
    @Size(max = 50)
    @Email
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @NotNull
    private Role role;

}
