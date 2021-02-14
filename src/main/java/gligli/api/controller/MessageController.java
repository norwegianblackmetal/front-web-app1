package gligli.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("message")
public class MessageController {
    public HashMap<Integer, String> list = new HashMap<Integer, String>();

    public MessageController(){
        list.put(1, "Olivje");
        list.put(2, "Borsh");
        list.put(3, "Kompot");
    }

    @GetMapping
    public HashMap<Integer, String> list(){
        return list;
    }
}
