package com.registration.demo.registration;

import com.registration.demo.appUser.AppUser;
import com.registration.demo.appUser.AppUserRole;
import com.registration.demo.appUser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author danielramirez
 */
@Service
@AllArgsConstructor
public class RegistrationService {
    
    private final EmailValidator emailValidator;
    private final AppUserService appUserService;
    
    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.
                test(request.getEmail());

        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        } else {

            return appUserService.signUpUser(
                    new AppUser(
                            request.getFirstName(),
                            request.getLastName(),
                            request.getEmail(),
                            request.getPassword(),
                            AppUserRole.USER));
        }
    }
}
