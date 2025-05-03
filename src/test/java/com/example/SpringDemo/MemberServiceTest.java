package com.example.SpringDemo;
import com.example.SpringDemo.Model.Member;
import com.example.SpringDemo.Repository.MemberRepository;
import com.example.SpringDemo.Services.MemberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MemberServiceTest {

    @Mock
    private MemberRepository memberRepository;

    @InjectMocks
    private MemberService memberService;

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void testGetAllMembers() {
        // given
        Member member1 = new Member();
        member1.setId(1);
        member1.setUserId("john_doe");
        member1.setPassword("password1");
        member1.setEmail("john@example.com");

        Member member2 = new Member();
        member2.setId(2);
        member2.setUserId("jane_doe");
        member2.setPassword("password2");
        member2.setEmail("jane@example.com");

        List<Member> dummyMembers = Arrays.asList(member1, member2);


        when(memberRepository.findAll()).thenReturn(dummyMembers);

        // when
        List<Member> result = memberService.getAllMembers();

        // then
        assertEquals(2, result.size(), "number of member should be 2");
        verify(memberRepository, times(1)).findAll();
    }
}
