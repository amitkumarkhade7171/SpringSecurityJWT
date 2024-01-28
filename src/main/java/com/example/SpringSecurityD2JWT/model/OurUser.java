package com.example.SpringSecurityD2JWT.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OurUser {
    private String userId;
    private String name;
    private String email;
}
