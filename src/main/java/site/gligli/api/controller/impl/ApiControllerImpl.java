package site.gligli.api.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import site.gligli.api.controller.ApiController;
import site.gligli.api.client.UiClient;
import site.gligli.api.dto.Params;


@RestController
public class ApiControllerImpl implements ApiController {
    @Autowired
    private UiClient uiClient;

    @GetMapping("/")
    public String getSite(){
        return uiClient.getSite(new Params(1, "Borsh"));
    }
}
