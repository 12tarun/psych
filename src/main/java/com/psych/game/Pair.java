package com.psych.game;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

public class Pair<A,B>
{
    @Getter
    @Setter
    private A first;
    @Getter
    @Setter
    private B second;

    public Pair(A first, B second)
    {
        this.first = first;
        this.second = second;
    }

}
