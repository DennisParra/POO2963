package ec.edu.espe.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.demo.dao.IPerson;

@RestController
@RequestMapping("api/demo")
public class DemoRestController {

    @Autowired
    IPerson person;

    @Autowired
    IPerson person2;

    @GetMapping("/student")
    public String getStudent() {
        return person.sayHello();
    }

    @GetMapping("/teacher")
    public String getTeacher() {
        return person2.sayHello();
    }

}