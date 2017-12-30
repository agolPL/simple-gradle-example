package pl.osec.simplegradleexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
class SimpleController {

    @GetMapping
    String greetings() {
        return "hello from gradle application :)";
    }
}
