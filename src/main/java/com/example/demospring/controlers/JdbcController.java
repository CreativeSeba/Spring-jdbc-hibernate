package com.example.demospring.controlers;

import com.example.demospring.models.User;
import com.example.demospring.repositories.JdbcRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*http://192.168.0.126:8081/jdbc
http://192.168.0.126:8081/jdbc/1
http://192.168.0.126:8081/jdbc/by-email/michal.nowicki@example.com
http://192.168.0.126:8081/jdbc/exists/michal.nowicki@example.com
http://192.168.0.126:8081/jdbc/last5
http://192.168.0.126:8081/jdbc/countByName/Natalia Dąbrowska
http://192.168.0.126:8081/jdbc/nameIncludeCharacters/ab*/
@RestController
@RequestMapping("/jdbc")
public class JdbcController {
    JdbcRepo jr;
    public JdbcController(JdbcRepo jr) {
        this.jr = jr;
    }

    @GetMapping("")
    public List<User> getUsers() {
        return jr.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id) {
        return jr.getUserById(id);
    }

    @GetMapping("/by-email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return jr.getUserByEmail(email);
    }

    @GetMapping("/exists/{email}")
    public boolean checkIfExistsByEmail(@PathVariable String email) {
        return jr.checkIfExistsByEmail(email);
    }

    @GetMapping("/last5")
    public List<User> last5() {
        return null;
    }

    @GetMapping("/countByName/{name}")
    public int countByName(@PathVariable String name) {
        return jr.countByName(name);
    }

    @GetMapping("/nameIncludeCharacters/{characters}")
    public List<User> getUsersByCharacters(@PathVariable String characters) {
        return jr.getUsersByCharacters(characters);
    }
}
