package com.example.mynotes.web;

import com.example.mynotes.dao.domain.Note;
import com.example.mynotes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NoteListController {

    @Autowired
    NoteService noteService;

//查询
    @RequestMapping("/notelist")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Object userLogin(@RequestBody String id){
        System.out.println("查询列表中..."+id);
        return noteService.findNoteBySut(Integer.parseInt(id));
    }
//添加
    @RequestMapping("/addnote")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Object addnote(@RequestBody Note note){
        System.out.println("添加假条中..."+note);
        return noteService.createNote(note);

    }
//删除
    @DeleteMapping("/del/{note_id}")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Object delNote(@PathVariable("note_id") String  note_id){
        System.out.println("删除假条中..."+note_id);
        return noteService.delNoteById(Integer.parseInt(note_id));
    }

}
