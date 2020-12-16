package com.example.mynotes.web;

import com.example.mynotes.dao.domain.Note;
import com.example.mynotes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NoteListTController {

    @Autowired
    NoteService noteService;

    //查询
    @RequestMapping("/notelistt")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Object userLogin(@RequestBody String id){
        System.out.println("查询列表中..."+id);
        return noteService.findNoteByTId(Integer.parseInt(id));
    }

    //查询具体假条
    @GetMapping("/select/{note_id}")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Object findNote(@PathVariable("note_id") String  note_id){
        System.out.println("查询假条"+note_id+"中...");
        return noteService.findNoteById(Integer.parseInt(note_id));
    }
    //修改
    @PutMapping("/update/{note_id}")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Object updateNote(@PathVariable("note_id") String note_id,@RequestBody Note note){
        System.out.println("修改假条"+note_id+"中.....");
        return noteService.updateNote(note);
    }
}
