package com.edtech.studyNotion.dto.leaderboard;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaderboardRequestDto implements Serializable {
    @NotBlank
    private String period; // accepted values: WEEKLY, MONTHLY, LIFETIME

    @Min(1)
    private Integer limit = 50;
}
