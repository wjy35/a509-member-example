package com.ssafy.member.api.controller;

import com.ssafy.member.api.response.FormattedResponse;
import com.ssafy.member.api.response.MemberInfoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {

    @GetMapping("/me")
    public ResponseEntity<FormattedResponse> viewMemberInfo(@RequestHeader Long memberId){
        MemberInfoResponse memberInfoResponse = MemberInfoResponse
                .builder()
                .memberId(memberId)
                .memberNickname("왕준영")
                .build();

        return new ResponseEntity<>(
                FormattedResponse
                .builder()
                .meta("memberId",memberId)
                .documents("memberInfo",memberInfoResponse)
                .build(),HttpStatus.OK);
    }

}
