package edu.neumont.diyauto.Models;

import javafx.geometry.Pos;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Post")
public class PostModel
{

    @Id
    @Column(name="idCars")
    @SequenceGenerator(name="account_seq", sequenceName="account_seq", initialValue=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="account_seq")
	private int PostID;

    @Column(name="UserID", nullable = false)
    private int UserID;

    @Column(name="Description", nullable = false)
	private String Description;

    @OneToMany
    @Column(name="CommentID", nullable = false)
    private Set<CommentModel> comments;

    @Column(name="Title",nullable = false)
    private String title;

    public PostModel() {

    }

	public PostModel(String title, int PostID, int UserID, String Description)
	{
		this.PostID = PostID;
		this.UserID = UserID;
		this.Description = Description;
        this.title = title;
		comments = new HashSet<>();
	}

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPostID() {
		return PostID;
	}
	public int getUserID() {
		return UserID;
	}
	public Set<CommentModel> getComments() {
		return comments;
	}
    public void addComment(CommentModel comment) {
        comments.add(comment);
    }
	
}
