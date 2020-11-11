package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(max = 450, message = "Max length of 450 characters has been reached.")
    public String description;


    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill (String description) {this.description = description; }

    public Skill() { }

    public List<Job> getJobs(){
        return jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}