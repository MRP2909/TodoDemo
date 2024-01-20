/*
 * package com.example.demo.exception;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * import org.springframework.http.ResponseEntity; import
 * org.springframework.validation.FieldError; import
 * org.springframework.web.bind.MethodArgumentNotValidException; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.bind.annotation.RestControllerAdvice;
 * 
 * @RestControllerAdvice public class GlobalExceptionHandler {
 * 
 * @ExceptionHandler(MethodArgumentNotValidException.class) public
 * ResponseEntity<Map<String, String>>
 * handleMethodArgsValidationException(MethodArgumentNotValidException ex) {
 * 
 * Map<String, String> errorResponse = new HashMap<>();
 * ex.getBindingResult().getAllErrors().forEach(error)->{
 * 
 * String contentError=((FieldError)error).
 * 
 * };
 * 
 * // return new ResponseEntity<>(null, null)
 * 
 * }
 * 
 * }
 */