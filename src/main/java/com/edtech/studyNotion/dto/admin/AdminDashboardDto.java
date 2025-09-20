package com.edtech.studyNotion.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminDashboardDto implements Serializable {
    private Integer totalStudents;
    private Integer totalTeachers;
    private Integer totalCourses;
    private Double totalRevenue;

    // top N teacher revenues
    private List<TeacherRevenueDto> topTeachersByRevenue;

    // skills in demand (skill -> demand score or count)
    private Map<String, Integer> skillsInDemand;
}
