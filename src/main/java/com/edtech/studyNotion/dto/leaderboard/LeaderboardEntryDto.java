package com.edtech.studyNotion.dto.leaderboard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaderboardEntryDto implements Serializable {
    private Long studentId;
    private String studentName;
    private Integer rank;
    private Integer hours; // hours in the given period
    private String period; // "WEEKLY" | "MONTHLY" | "LIFETIME"
}
