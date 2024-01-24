// package com.learnspring.hellospring;

// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.servlet.ModelAndView;

// /**
//  * GradeController
//  */

// @Controller
// public class GradeController {
    
//     // @GetMapping("/")
//     // public String getGrades(Model model) {
//     //     Grades grade1 = new Grades("harry", "deffense", "90");
//     //     model.addAttribute("grades", grade1);
//     //     return "shows";
//     // }
//     // @GetMapping("/")
//     // public String getEpisodes(Model model){
//     //     Episodes ep1 = new Episodes("Run", "Run girl run!", "10"); 
//     //     model.addAttribute("ep", ep1);
//     //     return "shows";
//     // }
//     @GetMapping("/")
//     public ModelAndView getShows() {
//         Map<String, Show> model = new HashMap<String, Show>(); 
//         model.put("first", new Show("Breaking bad", "Ozymandias", 10.0));
//         model.put("second", new Show("Attack on titan", "Perfect", 9.0));
//         model.put("third", new Show("Star War", "Perfect", 10.0)); 
//         return new ModelAndView("shows", model);
//     } 
// }