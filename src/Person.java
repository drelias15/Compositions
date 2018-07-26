public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;

    public Person(){
        this.job=new Job();
        this.education=new Education();
        education.setGeorgiaTech("1990");
        job.setSalary(1000L);
    }

    public long getSalary() {
        return job.getSalary();
    }

    public String getGeorgiaTech() {
        return education.getGeorgiaTech();
    }

    @Override
    public String toString(){
        return  job + ". " + education;
    }
}