package pl.tomsoch.movielibrary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @GetMapping("/test")
    public int test(){
        return 1;
    }
}
