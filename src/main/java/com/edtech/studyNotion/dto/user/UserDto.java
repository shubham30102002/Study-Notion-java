package com.edtech.studyNotion.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto implements Serializable {
    private Long id;

    @NotBlank
    private String username;

    @Email
    @NotBlank
    private String email;

    private List<Dtos.Role> roles;

    private LocalDateTime createdAt;

    // profile details can be null for generic user
    private Dtos.TeacherProfileDto teacherProfile;
    private Dtos.StudentProfileDto studentProfile;
}
