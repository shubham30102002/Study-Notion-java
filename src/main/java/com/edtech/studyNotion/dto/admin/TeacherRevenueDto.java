package com.edtech.studyNotion.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherRevenueDto implements Serializable {
    private Long teacherId;
    private String teacherName;
    private Double totalRevenue;
    private Integer totalCourses;
    private Integer totalStudents;
    private Map<String, Integer> skillsCount; // skill -> count of courses or endorsements
}
