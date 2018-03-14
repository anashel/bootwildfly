package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }

    @RequestMapping(method= RequestMethod.GET ,  value="/categories", headers = "Accept=application/json")
    public ArrayList<Category> categories(@RequestParam(value="id", defaultValue= "1") int id) {

        ArrayList<Category> returnedCats = new CategoryFacade().getCategories();
        return returnedCats;
    }
}