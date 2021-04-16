
package com.registration.demo.registration;

import com.registration.demo.appUser.AppUser;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    AppUser appUser = new AppUser();
    
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

    
}
