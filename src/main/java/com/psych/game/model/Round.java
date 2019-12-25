package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Entity
@Table(name = "rounds")
public class Round extends Auditable
{
    @Getter
    @Setter
    @NotNull
    @ManyToOne
    private Games game;

    @Getter
    @Setter
    @ManyToOne
    private Question question;

    @Getter
    @Setter
    @NotNull
    private int roundNumber;

    @Getter
    @Setter
    @ManyToMany
    private Map<Player, PlayerAnswer> playerAnswers;
}
