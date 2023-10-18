package com.ssafy.member.api.response;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class MemberInfoResponse {
    Long memberId;
    String memberNickname;
}
