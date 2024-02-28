package hello.servlet.web.frontcontroller;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@RequiredArgsConstructor
public class ModelView {

    private final String viewName; // 논리 이름
    private Map<String, Object> model = new HashMap<>();
}
