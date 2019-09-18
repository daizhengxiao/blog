package com.itdai.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author liuyanzhao
 */
@Entity
@DynamicUpdate  //自动更新
@Table(name = "tag")
public class Tag implements Serializable{
    private static final long serialVersionUID = 605449151900057035L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tagId;

    @Column(name = "tag_name")
    private String tagName;

    @ManyToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
    @JoinTable(name="article_tag_ref",joinColumns=@JoinColumn(name="article_id"),inverseJoinColumns=@JoinColumn(name="tag_id"))
    private Set<Article> articles = new HashSet<>();

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
}