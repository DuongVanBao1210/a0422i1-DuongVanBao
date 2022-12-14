package codegym.controller;

import codegym.entity.Song;
import codegym.repository.SongRepository;
import codegym.service.SongService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("songs", songService.getList());
        return "list";
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("create", "song", new Song());
        return modelAndView;
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Song song) {
        songService.save(song);
        return "redirect:/song/list";
    }

    @GetMapping("/{song}/update")
    public String update(@PathVariable String song, Model model) {
        model.addAttribute("song", songService.findBySong(song));
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Song song) {
        songService.updateSong(song);
        return "redirect:/song/list";
    }

    @GetMapping("/{song}/delete")
    public String delete(@PathVariable String song, Model model) {
        model.addAttribute("song", songService.findBySong(song));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Song song) {
        songService.remove(song);
        return "redirect:/song/list";
    }

    @PostMapping("/search")
    public ModelAndView search(@RequestParam("song") String song) {
        ModelAndView modelAndView = new ModelAndView("list", "songs", songService.findSongByName(song));
        return modelAndView;
    }
}
