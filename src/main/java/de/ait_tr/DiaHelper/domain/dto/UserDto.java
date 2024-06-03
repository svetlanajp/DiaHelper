package de.ait_tr.DiaHelper.domain.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;


public class UserDto {
//    @NotBlank(message = "User name can not be empty")
//    @Pattern(
//            regexp = "[A-Z][a-z]{2,}",
//            message = "User name should be at least 3 character length, " +
//                    " start with capital letter and may contain only latin characters"
//    )
    private String username;

//    @NotNull(message = "Password can not be null")
//    @NotEmpty(message = "Password can not be empty")
//    @Pattern(
//            regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
//            message = "Password must be at least 8 characters long, contain at least one uppercase letter, one digit, and one special character (@$!%*?&)"
//    )
    private String password;

//    @Pattern(
//            regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
//            message = "Invalid email format: email should contain only latin letters, digits, '@', '-', '_', and have a valid domain"
//    )
//    @NotNull(message = "Email can not be null")
//    @NotEmpty(message = "Email can not be empty")
    private String email;

//    @NotNull(message = "Glucose level can not be null")
//    @DecimalMin(value = "0", inclusive = false, message = "Glucose level must be greater than 0")
    private BigDecimal glucoseLevel;

//    @NotNull(message = "Weight can not be null")
    private double weight;

//    @NotNull(message = "Height can not be null")
    private double height;

//    @NotNull(message = "Age can not be null")
    private int age;

    // Геттеры и сеттеры
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getGlucoseLevel() {
        return glucoseLevel;
    }

    public void setGlucoseLevel(BigDecimal glucoseLevel) {
        this.glucoseLevel = glucoseLevel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
