/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MartinLodahl
 */
public class Group {
    
    String groupNumber;
    String classe;
    String authors;

    public Group(String groupNumber, String classe, String authors) {
        this.groupNumber = groupNumber;
        this.classe = classe;
        this.authors = authors;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
    
}
