package shop.mtcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    
    // @Autowired
    // private BoardRepository boardRepository;

    @GetMapping({"/", "/main"})
    public String main(){
        return "board/main";
    }

    @GetMapping("/board/saveForm" )
    public String boardSaveForm() {
        return "board/saveForm";
    }

    @GetMapping("/detail")
    public String detail() {
        return "board/detail";
    }

    @GetMapping("/boardUpdateForm")
    public String boardUpdateForm() {
        return "board/boardUpdateForm";
    }
    
}
