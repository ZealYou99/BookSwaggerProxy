package gg.zeal.GeneratedLibrary.Service;

import gg.zeal.GeneratedLibrary.api.BookControllerApi;
import gg.zeal.GeneratedLibrary.api.BookControllerApiClient;
import gg.zeal.GeneratedLibrary.model.Book;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BookService{

   private final BookControllerApiClient bookControllerApiClient;

   public ResponseEntity<List<Book>> all(){
      return bookControllerApiClient.all();
   };

   public ResponseEntity<Book> get(Long id){
      return bookControllerApiClient.get(id);
   };

   public ResponseEntity<Book> post(Book newBook){
      return bookControllerApiClient.post(newBook);
   };

   public ResponseEntity<Book> put(Book newBook, Long id){
      return bookControllerApiClient.put(id,newBook);
   };

   public void delete(Long id){
      bookControllerApiClient.delete(id);
   };

}
