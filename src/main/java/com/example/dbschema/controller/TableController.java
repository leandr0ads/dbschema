package com.example.dbschema.controller;

import com.example.dbschema.model.TableDefinition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tables")
public class TableController {

    @GetMapping("/create")
    public String showForm(Model model) {
        model.addAttribute("tableDefinition", new TableDefinition());
        return "table-form";
    }

    @PostMapping("/create")
    public String createTable(@ModelAttribute TableDefinition tableDefinition, Model model) {
        model.addAttribute("tableDefinition", tableDefinition);
        return "table-result";
    }
}

//// src/main/java/com/example/dbschema/controller/TableController.java
//package com.example.dbschema.controller;
//
//import com.example.dbschema.model.TableDefinition;
//import com.example.dbschema.service.TableService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class TableController {
//
//    private final TableService tableService;
//
//    public TableController(TableService tableService) {
//        this.tableService = tableService;
//    }
//
//    @GetMapping("/")
//    public String showForm(Model model) {
//        model.addAttribute("tableDefinition", new TableDefinition());
//        return "table-form";
//    }
//
//    @PostMapping("/create-table")
//    public String createTable(@ModelAttribute TableDefinition tableDefinition, Model model) {
//        // Aqui você implementaria a lógica para criar a tabela no banco de dados
//        // Por enquanto, apenas mostraremos a definição
//        model.addAttribute("tableDefinition", tableDefinition);
//        return "table-result";
//    }
//}