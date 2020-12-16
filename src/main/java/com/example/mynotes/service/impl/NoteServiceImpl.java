package com.example.mynotes.service.impl;

import com.example.mynotes.dao.domain.Note;
import com.example.mynotes.dao.domain.NoteList;
import com.example.mynotes.dao.mapper.NoteMapper;
import com.example.mynotes.dao.mapper.StudentMapper;
import com.example.mynotes.dao.mapper.TeacherMapper;
import com.example.mynotes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    NoteMapper noteMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<NoteList> findNoteBySut(int student_id) {
        List<Note> noteList = noteMapper.findNoteBySut(student_id);
        List<NoteList> ns=new ArrayList<NoteList>();

        for (int i=0;i<noteList.size();i++){
            NoteList n=new NoteList();
            n.setNote_id(noteList.get(i).getNote_id());
            n.setStudent_id(noteList.get(i).getStudent_id());
            n.setStudent_name(studentMapper.findStudentById(noteList.get(i).getStudent_id()).getStudent_name());
            n.setApprover_id(noteList.get(i).getApprover_id());
            if(noteList.get(i).getApprover_id()!=null){
                n.setApprover_name(teacherMapper.findTeacherById(noteList.get(i).getApprover_id()).getTeacher_name());
            }
            n.setNote_time(noteList.get(i).getNote_time());
            n.setNote_start(noteList.get(i).getNote_start());
            n.setNote_end(noteList.get(i).getNote_end());
            n.setNote_reason(noteList.get(i).getNote_reason());
            n.setApprove_status(noteList.get(i).getApprove_status());
            n.setApprove_time(noteList.get(i).getApprove_time());
            n.setApprove_reason(noteList.get(i).getApprove_reason());
            ns.add(n);
        }
        return ns;
    }

    @Override
    public NoteList findNoteById(int note_id) {
        Note note = noteMapper.findNoteById(note_id);
        NoteList n=new NoteList();
        n.setNote_id(note.getNote_id());
        n.setStudent_id(note.getStudent_id());
        n.setStudent_name(studentMapper.findStudentById(note.getStudent_id()).getStudent_name());
        n.setApprover_id(note.getApprover_id());
        if(note.getApprover_id()!=null){
            n.setApprover_name(teacherMapper.findTeacherById(note.getApprover_id()).getTeacher_name());
        }
        n.setNote_time(note.getNote_time());
        n.setNote_start(note.getNote_start());
        n.setNote_end(note.getNote_end());
        n.setNote_reason(note.getNote_reason());
        n.setApprove_status(note.getApprove_status());
        n.setApprove_time(note.getApprove_time());
        n.setApprove_reason(note.getApprove_reason());
        return n;
    }

    @Override
    public int createNote(Note note) {
        int line = noteMapper.createNote(note);
        return line;
    }

    @Override
    public int updateNote(Note note) {
        int line = noteMapper.updateNote(note);
        return line;
    }

    @Override
    public int delNoteById(int note_id) {
        int line = noteMapper.delNoteById(note_id);
        return line;
    }

    @Override
    public List<NoteList> findNoteByTId(int teacher_id) {
        List<Note> noteList = noteMapper.findNoteByTId(teacher_id);
        List<NoteList> ns=new ArrayList<NoteList>();

        for (int i=0;i<noteList.size();i++){
            NoteList n=new NoteList();
            n.setNote_id(noteList.get(i).getNote_id());
            n.setStudent_id(noteList.get(i).getStudent_id());
            n.setStudent_name(studentMapper.findStudentById(noteList.get(i).getStudent_id()).getStudent_name());
            n.setApprover_id(noteList.get(i).getApprover_id());
            if(noteList.get(i).getApprover_id()!=null){
                n.setApprover_name(teacherMapper.findTeacherById(noteList.get(i).getApprover_id()).getTeacher_name());
            }
            n.setNote_time(noteList.get(i).getNote_time());
            n.setNote_start(noteList.get(i).getNote_start());
            n.setNote_end(noteList.get(i).getNote_end());
            n.setNote_reason(noteList.get(i).getNote_reason());
            n.setApprove_status(noteList.get(i).getApprove_status());
            n.setApprove_time(noteList.get(i).getApprove_time());
            n.setApprove_reason(noteList.get(i).getApprove_reason());
            ns.add(n);
        }
        return ns;
    }
}
