package nextstep.jdbc.exception;

public class IncorrectResultSizeDataAccessException extends DataAccessException {

    public IncorrectResultSizeDataAccessException(int expectedSize, int actualSize) {
        super("Incorrect result size: expected " + expectedSize + ", actual " + actualSize);
    }
}
