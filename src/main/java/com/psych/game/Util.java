package com.psych.game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Util
{
    public static List<Pair<String, String>> readQAFile(String filename) throws FileNotFoundException
    {
        BufferedReader br = new BufferedReader(new FileReader("qa_facts.txt"));
        String question, answer;
        List<Pair<String, String>> question_answers = new ArrayList<>();
        try
        {
            do {
                    question = br.readLine();
                    answer = br.readLine();
                    if(question==null || answer==null || question.length() > Constants.Max_question_length || answer.length() > Constants.Max_answer_length)
                    {
                        System.out.println("Skipping Question: " + question);
                        System.out.println("Skipping Answer:" + answer);
                        continue;
                    }
                    question_answers.add(new Pair<>(question, answer));
            }while(question != null && answer != null);
        }
        catch (IOException ignored) {
        }
        return question_answers;
    }
}
