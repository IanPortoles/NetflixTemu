package com.netflix.clone.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ChangePasswordRequest {
    @NotBlank(message="Current Passowrd is required")
    private String currentPassword;
    @NotBlank(message="New Passowrd is required")
    private String newPassword;
}
