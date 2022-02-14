package me.hsnam.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class GithubIssue implements Cloneable{

    private int id;

    private String title;

    private GithubRepository githubRepository;

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d", githubRepository.getUser(), githubRepository.getName(), this.getId());
    }

    //얕은 복사의 Clone
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    // 깊은 복사
    @Override
    public Object clone() throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser(this.githubRepository.getUser());
        repository.setName(this.githubRepository.getName());

        GithubIssue issue = new GithubIssue();
        issue.setTitle(this.title);
        issue.setId(this.id);
        return issue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue issue = (GithubIssue) o;
        return id == issue.id && Objects.equals(title, issue.title) && Objects.equals(githubRepository, issue.githubRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, githubRepository);
    }
}