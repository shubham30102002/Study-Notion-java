package com.edtech.studyNotion.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherProfileDto implements Serializable {
    private String fullName;
    private String bio;
    private List<String> skills;
    private Integer totalStudents; // aggregate
    private Double revenue; // aggregate revenue earned
}
