package com.tk16.microsrevices.books.infrastructure.in.web.controller;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tk16.microsrevices.books.application.ports.in.CreateBookUseCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ReadBookController.class)
class ReadBookControllerTest {
  @MockBean CreateBookUseCase createBookUseCase;
  @Autowired MockMvc mockMvc;
  @Autowired ObjectMapper objectMapper;

  @Test
  void readBookDetails() {}

  @Test
  void readAllBooks() {}
}
