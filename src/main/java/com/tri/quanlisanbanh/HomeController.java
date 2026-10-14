package com.tri.quanlisanbanh;

import com.tri.quanlisanbanh.repository.SanBongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private SanBongRepository sanBongRepository;

    @GetMapping("/")
    public String home(Model model) {
        // Lấy danh sách tất cả sân bóng từ SQL Server truyền ra giao diện
        model.addAttribute("danhSachSan", sanBongRepository.findAll());
        return "index";
    }
}