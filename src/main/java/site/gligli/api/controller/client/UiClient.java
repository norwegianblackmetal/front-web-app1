package site.gligli.api.controller.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "gligli-ui", url = "localhost:5000")
public interface UiClient {

    @RequestMapping("/")
    String getSite();
}
