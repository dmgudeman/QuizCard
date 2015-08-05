/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizcard;

/**
 *
 * @author davidgudeman
 */
public class QuizCard
{

    public String getQuestion()
    {
        return question;
    }

    public String getAnswer()
    {
        return answer;
    }
    private String question = null;
    private String answer = null;
    
    public QuizCard(String question, String answer)
    {
        this.question = question;
        this.answer = answer;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    }
    
}
