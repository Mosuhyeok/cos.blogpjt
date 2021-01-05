package com.cos.blogproject.test;


import com.cos.blogproject.model.RoleType;
import com.cos.blogproject.model.User;
import com.cos.blogproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/test/insert")
    public String test(User user){
        user.setRole(RoleType.USER);
        userRepository.save(user);
        System.out.println(user.getUsername());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        System.out.println(user.getCreateDate());
        System.out.println(user.getId());
        System.out.println(user.getRole());
        System.out.println("회원가입이 완료 됐습니다");
        return "회원가이비 완료됐습니다";
    }
}
