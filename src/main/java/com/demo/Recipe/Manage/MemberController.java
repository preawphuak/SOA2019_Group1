package com.demo.Recipe.Manage;


import com.demo.Recipe.Member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    //GET Member
    @RequestMapping("/Member")
    public Member getMember(@PathVariable String id){
    return memberService.getMember(id) ;
    }

    //ADD Member
    @PostMapping("/Menber/{id}/Proflie")
    public Member addMember(@PathVariable  String id, Member member) {
        memberService.addMember(id, member);
    }

}

