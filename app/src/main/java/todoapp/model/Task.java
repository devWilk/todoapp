package todoapp.model;

import java.util.Date;


public class Task {
    
    private int id;
    private int idProject;
    private String name;
    private String description;
    private boolean status;
    private String comments;
    private Date deadline;
    private Date createDate;
    private Date updateDate;

    public Task(int id, int idProject, String name, String description, boolean status, String comments, Date deadline, Date createDate, Date updateDate) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.status = status;
        this.comments = comments;
        this.deadline = deadline;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Task() {
        this.createDate = new Date();
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", idProject=" + idProject + ", name=" + name + ", description=" + description + ", status=" + status + ", comments=" + comments + ", deadline=" + deadline + ", createDate=" + createDate + ", updateDate=" + updateDate + '}';
    }


    
    
    
}
