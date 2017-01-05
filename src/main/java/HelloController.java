import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhxia on 05/01/2017.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello world!";
    }

}
