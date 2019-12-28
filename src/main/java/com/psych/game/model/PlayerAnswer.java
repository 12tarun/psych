package com.psych.game.model;

import com.psych.game.Constants;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "player_answers")
public class PlayerAnswer extends Auditable
{
    @Getter
    @Setter
    @NotBlank
    @Column(length = Constants.Max_answer_length)
    private String answer;

    @Getter
    @Setter
    private Round round;

    @Getter
    @Setter
    @NotNull
    private Player player;
}
