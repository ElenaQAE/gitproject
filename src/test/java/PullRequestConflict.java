import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PullRequestConflict {
    @Test
    void pullRequestConflict() {
        open("http://github.com/");

    }
}
