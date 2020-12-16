package com.example.mynotes.service;

import com.example.mynotes.dao.domain.Note;
import com.example.mynotes.dao.domain.NoteList;

import java.util.List;

public interface NoteService {
    //根据学生id查假条
    public List<NoteList> findNoteBySut(int student_id);

    //根据假条id查假条
    public NoteList findNoteById(int note_id);

    //新增假条
    public int createNote(Note note);

    //修改假条信息
    public int updateNote(Note note);

    //删除假条
    public int delNoteById(int note_id);

    //根据老师id查询
    public List<NoteList> findNoteByTId(int teacher_id);

}
