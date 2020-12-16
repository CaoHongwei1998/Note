package com.example.mynotes;


import com.example.mynotes.dao.domain.Note;
import com.example.mynotes.dao.mapper.NoteMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MynotesApplication.class)
public class NoteTest {

    @Autowired
    private NoteMapper noteMapper;



    @Test
    public void testfindNoteBySut(){

        List<Note> noteList = noteMapper.findNoteBySut(2);
        for (Note n:noteList){
            System.out.println(n);
        }
    }

    @Test
    public void testfindNoteById(){

        Note note = noteMapper.findNoteById(1);
        System.out.println(note);
    }

    @Test
    public void testcreateNote(){

        Note note =new Note();
        note.setStudent_id(1);
        note.setNote_time(new Date());
        note.setNote_reason("huo");
        int line=noteMapper.createNote(note);
        System.out.println(line);
    }

    @Test
    public void testupdateNote(){

        Note note =new Note();
        note.setNote_id(5);
        note.setStudent_id(2);
        note.setNote_time(new Date());
        note.setNote_reason("ji");
        int line=noteMapper.updateNote(note);
        System.out.println(line);
    }

    @Test
    public void testdelNoteById(){
        int line=noteMapper.delNoteById(5);
        System.out.println(line);
    }

    @Test
    public void testdefindNoteByTClass(){
        List<Note> noteList = noteMapper.findNoteByTId(1);
        System.out.println(noteList);
    }


}
