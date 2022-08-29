package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto {

    private Long id;

    // Title shouldn't be empty or null
    // Title should have at least 2 characters
    @NotEmpty
    @Size(min = 2, message = "Post title must have at least 2 characters")
    private String title;

    // Title shouldn't be empty or null
    // Title should have at least 10 characters
    @NotEmpty
    @Size(min = 10, message = "Post description must have at least 10 characters")
    private String description;

    // Post content should not be null or empty
    @NotEmpty
    private String content;
    private Set<CommentDto> commentDtoSet;
}
