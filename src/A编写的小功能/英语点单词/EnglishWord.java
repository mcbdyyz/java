package A编写的小功能.英语点单词;

public class EnglishWord {
    private String Eword="";
    private String Cword="";

    public EnglishWord(){}

    public EnglishWord(String eword, String cword) {
        Eword = eword;
        Cword = cword;
    }

    public String getEword() {
        return Eword;
    }

    public void setEword(String eword) {
        Eword = eword;
    }

    public String getCword() {
        return Cword;
    }

    public void setCword(String cword) {
        Cword = cword;
    }
}
