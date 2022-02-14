package prototype;

import me.hsnam.prototype.GithubIssue;
import me.hsnam.prototype.GithubRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.ArrayList;

public class PrototypeTest {

    @Test
    @DisplayName("prototype 패턴 테스트")
    public void prototypeTest() throws CloneNotSupportedException{
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setName("hong-brother");
        githubRepository.setUser("hsnam");

        GithubIssue issue = new GithubIssue();
        issue.setTitle("디자인 패턴 이슈");
        issue.setId(1);
        issue.setGithubRepository(githubRepository);

        // System.out.println(issue.getUrl());

        GithubIssue anotherIssue = (GithubIssue) issue.clone();

        Assertions.assertNotEquals(issue, anotherIssue);
        Assertions.assertEquals(false, issue.equals(anotherIssue));
        Assertions.assertEquals(issue.getClass(), anotherIssue.getClass());
        Assertions.assertEquals(false, issue.getGithubRepository() == anotherIssue.getGithubRepository());

    }
}
