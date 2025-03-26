package com.example.demospring.controlers;

/*http://192.168.0.126:8081/hibernate
http://192.168.0.126:8081/hibernate/1
http://192.168.0.126:8081/hibernate/by-email/michal.nowicki@example.com
http://192.168.0.126:8081/hibernate/exists/michal.nowicki@example.com
http://192.168.0.126:8081/hibernate/last5
http://192.168.0.126:8081/hibernate/countByName/Natalia Dąbrowska
http://192.168.0.126:8081/hibernate/nameIncludeCharacters/ab*/

import com.example.demospring.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hibernate")
public class HibernateController {
    @GetMapping("")
    public List<User> getUsers() {
        return null;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id) {
        return null;
    }

    @GetMapping("/by-email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return null;
    }

    @GetMapping("/exists/{email}")
    public boolean checkIfExistsByEmail(@PathVariable String email) {
        return true;
    }

    @GetMapping("/last5")
    public List<User> last5() {
        return null;
    }

    @GetMapping("/countByName/{name}")
    public int countByName(@PathVariable String name) {
        return 6;
    }

    @GetMapping("/nameIncludeCharacters/{characters}")
    public List<User> getUsersByCharacters(@PathVariable String characters) {
        return null;
    }
}
