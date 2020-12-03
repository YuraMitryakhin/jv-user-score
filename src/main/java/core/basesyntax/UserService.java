package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        String[] valuesEmailAndScore;
        for (String record : records) {
           String[] valuesEmailAndScore = record.split(":");
            if (valuesEmailAndScore[0].equals(email)) {
                return Integer.parseInt(valuesEmailAndScore[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
