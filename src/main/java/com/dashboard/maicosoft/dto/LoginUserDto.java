package com.dashboard.maicosoft.dto;

import jakarta.validation.constraints.NotBlank;

public record LoginUserDto(
        @NotBlank String userName,
        @NotBlank String password
) {}