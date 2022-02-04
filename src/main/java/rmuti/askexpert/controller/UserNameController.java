package rmuti.askexpert.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmuti.askexpert.model.services.CommentDataRepository;
import rmuti.askexpert.model.services.TopicDataRepository;
import rmuti.askexpert.model.services.UserNameRepository;
import rmuti.askexpert.model.table.UserName;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserNameController {
    @Autowired
    private UserNameRepository userNameRepository;

    @Autowired
    private TopicDataRepository topicDataRepository;

    @Autowired
    private CommentDataRepository commentDataRepository;

    @PostMapping("/register")
    public  Object register(@RequestBody UserName userName){
        APIResponse res = new APIResponse();
        userNameRepository.save(userName);
        return res;
    }

    @PostMapping("/login")
    public  Object login(@RequestBody UserName userName){
        APIResponse res = new APIResponse();
        //userNameRepository.save(userName);
        return res;
    }

    @GetMapping("/findAllUser")
    public Object findAll(){
        APIResponse res = new APIResponse();
        List<UserName> data = userNameRepository.findAll();
        System.out.println(data);
        res.setData(data);
        return res;
    }
}
