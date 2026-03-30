package com.ols2601.resumebuilder;

class DisplayResume {
    public static void classic(Resume resume) {
        System.out.println("RESUME");
        System.out.println(resume.getName());
        System.out.println(resume.getContact());
        Contact contact = resume.getContact();
        System.out.println(contact.getStreet());
    }

    public static void contemporary(Resume resume) {

    }
}