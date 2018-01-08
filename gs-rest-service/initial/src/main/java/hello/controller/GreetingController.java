package hello.controller;

import hello.model.Greeting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by tangzhiqiang on 2018/1/2.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/{name}/greeting")
    public Greeting greeting(@PathVariable("name") String name, HttpServletRequest request) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
