package site.gligli.api.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.gligli.api.controller.ApiController;
import site.gligli.api.controller.client.UiClient;

@RestController
public class ApiControllerImpl implements ApiController {
    private UiClient uiClient;

    @GetMapping("/")
    public String getSite(){
        return uiClient.getSite();
    }
}
