public class Paper implements IManuscript {
    private String _class, _text, _student;

    public Paper(String clas, String text, String student) {
        _class = clas;
        _text = text;
        _student = student;
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

    public void Print(IFormatter formatter) {
        System.out.println(formatter.FormatText("This paper was made by " +_student + " from " + _class));
        System.out.println(formatter.FormatText(_text));
    }
}
