/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import org.springframework.stereotype.Service;

/**
 *
 * @author danielramirez
 */
@Service
public class RegistrationService {
    public String register(RegistrationRequest request){
        return "works"; 
    }
    
}
