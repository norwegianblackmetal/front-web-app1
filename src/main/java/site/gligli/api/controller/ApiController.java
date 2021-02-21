package site.gligli.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.gligli.api.dto.Params;

@RequestMapping("/")
public interface ApiController {

    @GetMapping("/")
    String getSite();
}
