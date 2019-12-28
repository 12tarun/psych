package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stats")
public class Stats extends Auditable
{
    @Getter
    @Setter
    private Long correctAnswers = 0L;

    @Getter
    @Setter
    private Long gotPsychedCount = 0L;

    @Getter
    @Setter
    private Long psychedOthersCount = 0L;
}
