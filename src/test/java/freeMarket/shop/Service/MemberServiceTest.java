package freeMarket.shop.Service;

import freeMarket.shop.Repository.MemberRepository;
import freeMarket.shop.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class MemberServiceTest {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;

    @Test()
    public void join()throws Exception{
        Member member1 = new Member();
        member1.setName("Lee");

        Member member2 = new Member();
        member2.setName("kee");

       memberService.join(member1);
       memberService.join(member2);

        List<Member> findMembers = memberService.findALl();
        for (Member findMember : findMembers) {
            System.out.println("findMember = " + findMember.getName());
        }
    }

    @Test
    public void 회원가입() {
        Member member = new Member();
        member.setName("Lee");

        Long saveMember = memberService.join(member);
        Member findMember = memberService.findOne(saveMember).get();
        assertThat(member.getId()).isEqualTo(findMember.getId());

    }


    @Test()
    public void duplicate() {
        Member member1 = new Member();
        member1.setName("Lee");

        Member member2 = new Member();
        member2.setName("Lee");

        memberService.join(member1);
        try {
            memberService.join(member2);
        } catch (IllegalStateException e) {
            return;
        }

    }

}