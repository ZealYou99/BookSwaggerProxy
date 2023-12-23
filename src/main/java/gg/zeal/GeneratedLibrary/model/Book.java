package gg.zeal.GeneratedLibrary.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;


/**
 * Book
 */
@Validated
public class Book   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("bookName")
  private String bookName = null;

  @JsonProperty("bookCategory")
  private String bookCategory = null;

  @JsonProperty("description")
  private String description = null;

  public Book id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @ApiModelProperty(value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Book bookName(String bookName) {
    this.bookName = bookName;
    return this;
  }

  /**
   * Get bookName
   * @return bookName
   **/
  @ApiModelProperty(value = "")
  
    public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public Book bookCategory(String bookCategory) {
    this.bookCategory = bookCategory;
    return this;
  }

  /**
   * Get bookCategory
   * @return bookCategory
   **/
  @ApiModelProperty(value = "")
  
    public String getBookCategory() {
    return bookCategory;
  }

  public void setBookCategory(String bookCategory) {
    this.bookCategory = bookCategory;
  }

  public Book description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @ApiModelProperty(value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.bookName, book.bookName) &&
        Objects.equals(this.bookCategory, book.bookCategory) &&
        Objects.equals(this.description, book.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bookName, bookCategory, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bookName: ").append(toIndentedString(bookName)).append("\n");
    sb.append("    bookCategory: ").append(toIndentedString(bookCategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
