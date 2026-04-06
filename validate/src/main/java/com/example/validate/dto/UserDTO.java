package com.example.validate.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @NotBlank(message = "Tên không được để trống")
    @Pattern(
            regexp = "^[A-Z][a-z]*(\\s[A-Z][a-z]+)+$",
            message = "Tên phải viết hoa chữ cái đầu mỗi từ (VD: Nguyen Van A)"
    )
    private String firstName;

    @NotBlank(message = "Họ không được để trống")
    @Pattern(
            regexp = "^[A-Z][a-z]*(\\s[A-Z][a-z]+)+$",
            message = "Họ phải viết hoa chữ cái đầu mỗi từ"
    )
    private String lastName;

    @Pattern(
            regexp = "^(0[0-9]{9})$",
            message = "SĐT phải có 10 số và bắt đầu bằng 0"
    )
    private String phoneNumber;

    @Min(value = 18, message = "Phải >= 18 tuổi")
    private Integer age;

    @Email(message = "Email không hợp lệ")
    @NotBlank(message = "Email không được để trống")
    private String email;

    @NotNull(message = "Giới tính không được để trống")
    private Boolean gender;
}