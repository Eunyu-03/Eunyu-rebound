package com.example.rebound.domain;

import com.example.rebound.audit.Period;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(of="id")
@SuperBuilder
public class CommentAlarmVO extends Period {

    private Long id;
    private Long memberId;
    private Long commentId;
}
