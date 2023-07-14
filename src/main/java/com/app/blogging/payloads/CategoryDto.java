package com.app.blogging.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Integer categoryId;
    @NotEmpty(message = "title can not be empty")
    private String categoryTitle;
    @NotBlank(message = "description can not be blank")
    private String categoryDescription;
}
