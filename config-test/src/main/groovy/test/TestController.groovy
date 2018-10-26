package test

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


import javax.inject.Inject


@Controller("/test")
class TestController {

    @Inject
    TestService testService

    @Get("/")
    HttpResponse<String> index() {
        return HttpResponse.ok(testService.test()).contentType(MediaType.TEXT_PLAIN_TYPE)
    }
}