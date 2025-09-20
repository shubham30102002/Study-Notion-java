package com.edtech.studyNotion.dto.course;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDto implements Serializable {
    private Long id;

    @NotBlank
    private String title;

    @Size(max = 1000)
    private String description;

    @NotNull
    private Integer durationInHours; // total expected hours

    private Long teacherId; // owner
    private String teacherName;

    private Integer enrolledCount;
    private Double averageRating;

    private LocalDateTime createdAt;
}
