package task.controller;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/task")
public class TaskController {

    @GetMapping("/ping")
    public String ping(){
        val method = "ping():";
        log.info(method);
        log.info("This is a test.");
        return "Ping Pong";
    }

}
