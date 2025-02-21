package com.ups.poo.dto;
import com.ups.poo.dto.AuthorDto;
public class BookDto {

    String Title;

    String Editorial;

    public BookDto() {
    }

    AuthorDto authorDto;

    public BookDto(String title, String editorial) {
        Title = title;
        Editorial = editorial;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public AuthorDto getAuthorDto() {
        return authorDto;
    }

    public void setAuthorDto(AuthorDto authorDto) {
        this.authorDto = authorDto;
    }
}
