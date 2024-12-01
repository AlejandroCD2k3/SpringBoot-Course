package SpringBootCourse.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping({"/helloWorld", "/hello", "hw"})
    public String helloWorld(){
        return "Hello world";
    }


}
