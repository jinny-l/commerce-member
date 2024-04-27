package com.commerce.member.fixture;

import com.commerce.member.api.dto.MemberCreateRequest;

public enum MemberCreateFixture {

    정상_정보_회원(
            "commerce",
            "password",
            "커머스",
            "김커머스",
            "01012345678",
            "commerce@commerce.com"
    ),
    중복_로그인Id_회원(
            "commerce",
            "password1",
            "커머스1",
            "김커머스1",
            "01012345679",
            "commerce1@commerce.com"
    ),
    중복_이메일_회원(
            "commerce1",
            "password1",
            "커머스1",
            "김커머스1",
            "01012345679",
            "commerce@commerce.com"
    ),
    중복_닉네임_회원(
            "commerce1",
            "password1",
            "커머스",
            "김커머스1",
            "01012345679",
            "commerce1@commerce.com"
    );

    private final String loginId;
    private final String password;
    private final String nickname;
    private final String name;
    private final String phoneNumber;
    private final String email;

    MemberCreateFixture(String loginId, String password, String nickname, String name, String phoneNumber,
                        String email) {
        this.loginId = loginId;
        this.password = password;
        this.nickname = nickname;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public MemberCreateRequest toDto() {
        return MemberCreateRequest.builder()
                .loginId(loginId)
                .password(password)
                .nickname(nickname)
                .name(name)
                .phoneNumber(phoneNumber)
                .email(email)
                .build();
    }
}
