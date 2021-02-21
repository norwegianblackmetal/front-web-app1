package site.gligli.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.RequestMapping;
import site.gligli.api.dto.Params;

@FeignClient(name = "gligli-ui", url = "localhost:443")
public interface UiClient {

    @RequestMapping("/")
    String getSite(@SpringQueryMap Params params);
}
