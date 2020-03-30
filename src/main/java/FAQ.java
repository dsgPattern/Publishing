import java.util.ArrayList;

public class FAQ implements IManuscript {
    private String _title;
    private ArrayList<String> _questions;
    private IFormatter _formatter;

    public FAQ(String title, ArrayList<String> questions, IFormatter formatter) {
        _title = title;
        _questions = questions;
        _formatter = formatter;
    }

    public String getTitle() {
        return _title;
    }

    public ArrayList<String> getQuestions() {
        return _questions;
    }

    public void Print() {
        System.out.println(_formatter.FormatText(_title + ":"));
        for (String question : _questions) {
            System.out.println(_formatter.FormatText(question));
        }
    }
}