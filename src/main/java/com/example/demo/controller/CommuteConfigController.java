package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommuteConfigController {

    // 1. ログイン画面を表示
    @GetMapping("/")
    public String index() {
        return "login";
    }

    // 2. ダッシュボードを表示（ログイン時）
    @PostMapping("/dashboard")
    public String dashboard(@RequestParam("userName") String name, Model model) {
        model.addAttribute("userName", name);
        return "dashboard";
    }

    // 3. 出発ボタン押下後の処理
    @PostMapping("/depart")
    public String depart(@RequestParam("userName") String name, Model model) {
        model.addAttribute("userName", name);
        // 画面側で「出発済み」と判定させるフラグ
        model.addAttribute("departed", true);
        return "dashboard";
    }
}