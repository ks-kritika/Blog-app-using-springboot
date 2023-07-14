package com.app.blogging.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;
    @NotEmpty @Size(min=4, max=10, message = "username must be between 4to 10 characters")
    private String name;
    @Email(message = "Email address is not valid")
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    private String about;
}
