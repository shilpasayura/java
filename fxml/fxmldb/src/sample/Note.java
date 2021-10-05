package sample;

import java.util.Date;

public class Note {
    private Integer id;
    private String title;
    private String content;
    private Integer priority;

    public Note(Integer id, String title, String content, Integer priority){
        this.id = id;
        this.title = title;
        this.content = content;
        this.priority = priority;
    }


    public Integer getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getContent(){
        return this.content;
    }

    public Integer getPriority(){
        return this.priority;
    }

    public void setId(Integer id) {
        this.id=id;
    }

    public void setTitle(String note) {
        this.title=title;
    }

    public void setContent(String userName) {
        this.content=content;
    }
    public void setPriority(Integer priority) {
        this.priority=priority;
    }
}
