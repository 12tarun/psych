package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "p_stats")
public class PlayerStats extends Stats
{
    @Getter
    @Setter
    private Long numberOfGamesPlayed = 0L;

    @Getter
    @Setter
    private Long timeSpent = 0L;
}
