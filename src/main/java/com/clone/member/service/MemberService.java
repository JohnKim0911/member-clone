package com.clone.member.service;

import com.clone.member.dto.MemberDTO;
import com.clone.member.entity.MemberEntity;
import com.clone.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    //repository의 save 메서드 호출 (조건. entity객체를 넘겨줘야 함)
    public void save(MemberDTO memberDTO) {
        // 1. dto -> entity 변환
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);

        // 2. repository의 save 메서드 호출
        memberRepository.save(memberEntity);
    }
}
