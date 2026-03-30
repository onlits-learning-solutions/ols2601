package com.ols2601.resumebuilder;

public class ResumeBuilder {
    public static void main(String[] args) {
        Resume resume = new Resume(1);
        resume.setName("Amit Kumar");
        Contact contact = new Contact("Juran Chapra", "Muzaffarpur", "Bihar", "842001");
        resume.setContact(contact);
        DisplayResume.classic(resume);
    }
}