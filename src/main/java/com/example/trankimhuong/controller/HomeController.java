package com.example.trankimhuong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "CV Cá Nhân");
        model.addAttribute("name", "Trần Kim Hương");
        model.addAttribute("position", "Java Backend Developer / Sinh viên CNTT");
        model.addAttribute("intro",
                "Xin chào! Mình là Trần Kim Hương, đam mê phát triển ứng dụng web với Java Spring Boot. "
                        + "Mình yêu thích xây dựng các hệ thống gọn gàng, dễ bảo trì và giao diện thân thiện với người dùng.");

        model.addAttribute("email", "trankimhuong12a5.2122@gmail.com");
        model.addAttribute("phone", "0123 456 789");
        model.addAttribute("address", "Việt Nam");

        model.addAttribute("facebook", "https://facebook.com/yourprofile");
        model.addAttribute("github", "https://github.com/yourusername");
        model.addAttribute("linkedin", "https://linkedin.com/in/yourprofile");

        model.addAttribute("avatar", "/images/avatar.jpg");

        model.addAttribute("skills",
                new String[]{"Java", "Spring Boot", "HTML/CSS", "Thymeleaf", "MySQL", "Git/GitHub"});

        model.addAttribute("education", "Sinh viên Công nghệ Thông tin");
        model.addAttribute("careerGoal",
                "Mục tiêu của mình là trở thành Java Backend Developer chuyên nghiệp, xây dựng các hệ thống web hiệu quả, an toàn và tối ưu.");

        return "index";
    }
}