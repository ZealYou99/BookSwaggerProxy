package gg.zeal.GeneratedLibrary.api;

import gg.zeal.GeneratedLibrary.model.Book;
import org.hibernate.annotations.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import gg.zeal.GeneratedLibrary.configuration.ClientConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(contextId="BookControllerApiClient", name="${openAPIDefinition.name:openAPIDefinition}", url="${openAPIDefinition.url:http://localhost:8080}", configuration = ClientConfiguration.class)
public interface BookControllerApiClient extends BookControllerApi {

}
