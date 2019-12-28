package com.psych.game;

import com.psych.game.model.GameMode;

import java.util.HashMap;
import java.util.Map;

public class Constants
{
    public static final int MAX_ROUNDS = 100;
    public static final int Max_question_length = 1000;
    public static final int Max_answer_length = 1000;
    public static final int Max_questions_to_read = 100;
    public static final Map<String, GameMode> qa_files = new HashMap<>();
    static
    {
        qa_files.put("qa_facts.txt", GameMode.IS_THIS_A_FACT);
        qa_files.put("qa_unscramble.txt", GameMode.UNSCRAMBLE);
        qa_files.put("qa_word_up.txt", GameMode.WORD_UP);
    }
}
