package com.edtech.studyNotion.dto.course;

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
public class EnrollmentDto implements Serializable {
    private Long id;
    private Long courseId;
    private Long studentId;
    private LocalDateTime enrolledAt;
    private Boolean active;
}