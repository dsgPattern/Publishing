public class Book implements IManuscript {
    private String _title, _text, _author;
    private IFormatter _formatter;
    public Book(String title, String text, String author, IFormatter formatter) {
        _title = title;
        _text = text;
        _author = author;
        _formatter=formatter;
    }

    public String getTitle() {
        return _title;
    }

    public String getText() {
        return _text;
    }

    public String getAuthor() {
        return _author;
    }

    public void Print() {
        System.out.println(_formatter.FormatText("=====" + _title + "====="));
        System.out.println(_formatter.FormatText("            by " + _author));
        System.out.println(_formatter.FormatText(_text));
    }
}