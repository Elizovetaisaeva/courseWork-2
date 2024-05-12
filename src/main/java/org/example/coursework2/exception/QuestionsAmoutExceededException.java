package org.example.coursework2.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionsAmoutExceededException extends RuntimeException{
    public QuestionsAmoutExceededException() {
    }

    public QuestionsAmoutExceededException(String message) {
        super(message);
    }

    public QuestionsAmoutExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionsAmoutExceededException(Throwable cause) {
        super(cause);
    }

    public QuestionsAmoutExceededException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
