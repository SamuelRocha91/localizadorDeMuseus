package com.betrybe.museumfinder.advice;

import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Cria classe de controle de exceções.
 */
@ControllerAdvice
public class GeneralControllerAdvice {

  /**
   * Escuta a exceção de inválida coordenada.
   *
   * @param exception unchecked.
   * @return uma response.
   */
  @ExceptionHandler(InvalidCoordinateException.class)
  public ResponseEntity<String> handleInvalidCoordinateException(InvalidCoordinateException
      exception) {
    Exception exception1 = new Exception("Coordenada inválida!");
    return ResponseEntity
        .status(HttpStatus.BAD_REQUEST)
        .body(exception1.getMessage());
  }

  /**
   * exceção de museu nao encontrado.
   *
   * @param exception unchecked.
   * @return uma response.
   */
  @ExceptionHandler(MuseumNotFoundException.class)
  public ResponseEntity<String> handleMuseumNotFoundException(MuseumNotFoundException
      exception) {
    Exception exception1 = new Exception("Museu não encontrado!");
    return ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .body(exception1.getMessage());
  }

  /**
   * Exceções em geral recebidas pela aplicação.
   *
   * @param exception all.
   * @return response.
   */
  @ExceptionHandler(Throwable.class)
  public ResponseEntity<String> handleThrowable(Throwable exception) {
    Exception exception1 = new Exception("Erro interno!");

    return ResponseEntity
        .status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(exception1.getMessage());
  }

}
