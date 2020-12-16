package com.example.mynotes.dao.domain;

import java.util.Date;

public class Note {

    private Integer note_id;

    private Integer student_id;
    private Integer approver_id;

    private Date note_time;
    private Date note_start;
    private Date note_end;
    private String note_reason;

    private Integer approve_status;
    private Date approve_time;
    private String approve_reason;

    @Override
    public String toString() {
        return "Note{" +
                "note_id=" + note_id +
                ", student_id=" + student_id +
                ", approver_id=" + approver_id +
                ", note_time=" + note_time +
                ", note_start=" + note_start +
                ", note_end=" + note_end +
                ", note_reason='" + note_reason + '\'' +
                ", approve_status=" + approve_status +
                ", approve_time=" + approve_time +
                ", approve_reason='" + approve_reason + '\'' +
                '}';
    }

    public String getApprove_reason() {
        return approve_reason;
    }

    public void setApprove_reason(String approve_reason) {
        this.approve_reason = approve_reason;
    }

    public Integer getNote_id() {
        return note_id;
    }

    public void setNote_id(Integer note_id) {
        this.note_id = note_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getApprover_id() {
        return approver_id;
    }

    public void setApprover_id(Integer approver_id) {
        this.approver_id = approver_id;
    }

    public Date getNote_time() {
        return note_time;
    }

    public void setNote_time(Date note_time) {
        this.note_time = note_time;
    }

    public Date getNote_start() {
        return note_start;
    }

    public void setNote_start(Date note_start) {
        this.note_start = note_start;
    }

    public Date getNote_end() {
        return note_end;
    }

    public void setNote_end(Date note_end) {
        this.note_end = note_end;
    }

    public String getNote_reason() {
        return note_reason;
    }

    public void setNote_reason(String note_reason) {
        this.note_reason = note_reason;
    }

    public Integer getApprove_status() {
        return approve_status;
    }

    public void setApprove_status(Integer approve_status) {
        this.approve_status = approve_status;
    }

    public Date getApprove_time() {
        return approve_time;
    }

    public void setApprove_time(Date approve_time) {
        this.approve_time = approve_time;
    }

}
