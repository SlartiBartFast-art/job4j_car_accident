package ru.job4j.accident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.accident.repository.AccidentMem;

import java.util.ArrayList;
import java.util.List;

/**
 * контроллер для главной страницы
 * -@Controller для обработчиков запросов.
 */
@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        AccidentMem accidentMem = new AccidentMem();
        model.addAttribute("user", "Petr Arsentev");
        model.addAttribute("client", accidentMem);
        return "index";
    }
}
