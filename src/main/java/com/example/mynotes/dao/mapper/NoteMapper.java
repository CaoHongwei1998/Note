package com.example.mynotes.dao.mapper;


import com.example.mynotes.dao.domain.Note;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface NoteMapper {

    //根据学生id查假条
    public List<Note> findNoteBySut(int student_id);

    //根据假条id查假条
    public Note findNoteById(int note_id);

    //新增假条
    public int createNote(Note note);

    //修改假条信息
    public int updateNote(Note note);

    //删除假条
    public int delNoteById(int note_id);

    //根据老师id查询
    public List<Note> findNoteByTId(int teacher_id);

}
