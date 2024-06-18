//

package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
//added jobs field with many to many annotation and the argument and updated job model
    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public String description;

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {}


    public List getJobs() {
        return jobs;
    }

    public void setJobs(List jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}