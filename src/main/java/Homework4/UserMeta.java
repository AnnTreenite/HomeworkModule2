package main.java.Homework4;

public class UserMeta {
    @GetMetaData
    public String name;

    @GetMetaData
    public int count;

    @GetMetaData
    public String GetSuperName(String prefix) {
        return "Super" + name;
    }
}
