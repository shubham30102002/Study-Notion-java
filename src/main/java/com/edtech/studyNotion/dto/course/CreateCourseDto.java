package com.edtech.studyNotion.dto.course;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateCourseDto implements Serializable {
    @NotBlank
    private String title;

    @Size(max = 1000)
    private String description;

    @NotNull
    @Min(1)
    private Integer durationInHours;
}
