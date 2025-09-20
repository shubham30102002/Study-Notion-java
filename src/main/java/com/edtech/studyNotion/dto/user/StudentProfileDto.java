package com.edtech.studyNotion.dto.user;

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
public class StudentProfileDto implements Serializable {
    private String fullName;
    private LocalDateTime joinedAt;
    private Integer totalLearningHours; // lifetime
    private Integer weeklyLearningHours; // latest week
    private Integer monthlyLearningHours; // latest month
}
