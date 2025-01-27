package com.redlink.challenge.rl_user.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Table(name = "rl_user")
public class User {

    @Id
    private Long id;
    private String name;
    private String lastName;
}
