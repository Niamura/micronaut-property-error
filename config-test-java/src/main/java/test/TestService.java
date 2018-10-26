package test;

import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Value;

import javax.inject.Singleton;
import java.util.Map;

@Singleton
public class TestService {

    @Value("${app.param1}")
    String param1;

    @Property(name = "app.param2")
    String param2;

    @Property(name = "app")
    Map<String, String> params;

    String test() {
        return "param1 = " + param1 + ", param2 = " + param2 + ", params = " + params;
    }

}