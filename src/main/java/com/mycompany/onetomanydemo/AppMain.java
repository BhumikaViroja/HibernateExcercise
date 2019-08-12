package com.mycompany.onetomanydemo;

import com.mycompany.onetomanydemo.Qualification_Level.qualificationLevel;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bhumika
 */
public class AppMain {

    public static void main(String[] args) {
        ProposalDao proposalDao = new ProposalDao();
        AttachmentDao attachmentDao = new AttachmentDao();
        PersonnelDao personnelDao = new PersonnelDao();

        Qualification_Level ql;
        List<Personnel> pl = new ArrayList<>();
        List<Attachment> al = new ArrayList<>();
        ql = new Qualification_Level(qualificationLevel.Beginner);
        Date date = new Date();
        Attachment a = new Attachment("abc", "11", new Timestamp(date.getTime()), (byte) 3);
        Personnel personnel = new Personnel("Bhumika", ql, "9632015478");
        pl.add(personnel);
        al.add(a);
        Attachment a1 = new Attachment("pqr", "12", new Timestamp(date.getTime()), (byte) 3);
        Personnel personnel1 = new Personnel("Ankita", ql, "9852360147");
        pl.add(personnel1);
        al.add(a1);
        Proposal proposal = new Proposal("project1", "java", pl, al);
        proposalDao.insert(proposal);

        Proposal p2 = new Proposal("project2", "spring");
        Attachment a2 = new Attachment("pqr", "123", new Timestamp(date.getTime()), (byte) 4);
        Personnel personnel2 = new Personnel("Utsav", ql, "9510236478");
        attachmentDao.update(Long.valueOf(1), a2);
        proposalDao.update(Long.valueOf(1), p2);
        personnelDao.update(Long.valueOf(1), personnel2);

        proposalDao.delete(Long.valueOf(1));
        personnelDao.delete(Long.valueOf(1));
        attachmentDao.delete(Long.valueOf(1));
    }
}
