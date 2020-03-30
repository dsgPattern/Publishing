public class Paper implements IManuscript {
    private String _class, _text, _student;
    private IFormatter _formatter;

    public Paper(String clas, String text, String student, IFormatter formatter) {
        _class = clas;
        _text = text;
        _student = student;
        _formatter = formatter;
    }

    public String getClas() {
        return _class;
    }

    public String getText() {
        return _text;
    }

    public String getStudent() {
        return _student;
    }

    public void Print() {
        System.out.println(_formatter.FormatText("This paper was made by " +_student + " from " + _class));
        System.out.println(_formatter.FormatText(_text));
    }
}
