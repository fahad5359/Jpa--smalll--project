package com.example.iivote;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VotGen {
    @Id
    @GeneratedValue
    private long id ;
    private String who_Voted;
    private String voter_Comment;
    private String voters;

    public VotGen(String who_Voted, String voters, String voter_Comment) {
        this.who_Voted = who_Voted;
        this.voters = voters;
        this.voter_Comment=voter_Comment;
    }

    public VotGen() {

    }

    public String getVoter_Comment() {
        return voter_Comment;
    }

    public void setVoter_Comment(String voter_Comment) {
        this.voter_Comment = voter_Comment;
    }

    public String getWho_Voted() {
        return who_Voted;
    }

    public void setWho_Voted(String who_Voted) {
        this.who_Voted = who_Voted;
    }

    public String getVoters() {
        return voters;
    }

    public void setVoters(String voters) {
        this.voters = voters;
    }

    @Override
    public String toString() {
        return "Ivoting{" +
                "id=" + id +
                ", who_Voted='" + who_Voted + '\'' +
                ", voter_Comment='" + voter_Comment + '\'' +
                ", voters='" + voters + '\'' +
                '}';
    }
}
