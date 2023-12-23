package gg.zeal.GeneratedLibrary;


import gg.zeal.GeneratedLibrary.Service.BookService;
import gg.zeal.GeneratedLibrary.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping("/books")
    List<Book> all(){
        return bookService.all().getBody();
    };
    @GetMapping("/books/{id}")
    Book get(@PathVariable("id") Long id){
        return bookService.get(id).getBody();
    };
    @PostMapping("/books")
    Book post(@RequestBody Book newBook){
        return bookService.post(newBook).getBody();
    };
    @PutMapping("/books/{id}")
    Book put(@RequestBody Book newBook, @PathVariable("id") Long id){
        return bookService.put(newBook, id).getBody();
    };
    @DeleteMapping("/books/{id}")
    void delete(@PathVariable("id") Long id){
        bookService.delete(id);
    };
}
