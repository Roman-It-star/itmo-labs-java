package labs.java.lab9.task5;
import java.util.HashMap;
import java.util.Map;

public class ScoreManager {
    private Map<User, Integer> scores;

    public ScoreManager() {
        scores = new HashMap<>();

        scores.put(new User("Alice"), 150);
        scores.put(new User("Bob"), 200);
        scores.put(new User("Charlie"), 120);
    }

    /**
     * Возвращает очки пользователя по имени или null, если не найден.
     */
    public Integer getScore(String userName) {
        User key = new User(userName);
        return scores.get(key);
    }
}
