package hello.hellospring.controller;

import hello.hellospring.sevice.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    //하나만 생성하고 공용으로 쓰면 되니까 new할 필요 없음
    private final MemberService memberService;

    //@AutoWired가 있으면 생성잘 memberService를 가져다가 연결을 잘 해준다. 의존관계를 넣어줘
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

}