package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title, content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(String content, Integer likes, Date moment, String title) {
        this.content = content;
        this.likes = likes;
        this.moment = moment;
        this.title = title;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments:\n");
        for (Comment c : comments) {
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }
}
