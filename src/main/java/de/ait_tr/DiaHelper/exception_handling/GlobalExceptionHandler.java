package de.ait_tr.DiaHelper.exception_handling;


import de.ait_tr.DiaHelper.exception_handling.exceptions.InvalidUserDataException;
import de.ait_tr.DiaHelper.exception_handling.exceptions.UserAlreadyExistsException;
import de.ait_tr.DiaHelper.exception_handling.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Response> handleException(UserNotFoundException e) {
        Response response = new Response(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(InvalidUserDataException.class)
    public ResponseEntity<Response> handleException(InvalidUserDataException e) {
        Response response = new Response(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<Response> handleException(UserAlreadyExistsException e) {
        Response response = new Response(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }
}
