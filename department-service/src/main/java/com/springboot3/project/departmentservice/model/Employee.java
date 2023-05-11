package com.springboot3.project.departmentservice.model;

public record Employee(Long id, Long departmentId, String name, int age, String position) {

}
