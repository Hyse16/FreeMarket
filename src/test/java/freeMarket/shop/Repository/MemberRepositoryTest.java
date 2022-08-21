package freeMarket.shop.Repository;

import freeMarket.shop.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;


    @Test
    public void TestMember() {
        Member member = new Member();
        member.setName("memberA");

        Member saveMember = memberRepository.save(member);
        Member member1 = memberRepository.findById(saveMember.getId()).get();
        System.out.println("member1 = " + member1.getName());
        Assertions.assertThat("memberA").isEqualTo(member1.getName());

    }

}