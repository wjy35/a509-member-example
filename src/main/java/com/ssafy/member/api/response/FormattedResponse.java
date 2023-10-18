package com.ssafy.member.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import java.util.Map;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class FormattedResponse {
    @Singular("meta")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String,Object> meta;

    @Singular("documents")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String,Object> documents;

}
