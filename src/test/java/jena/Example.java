package jena;

public class Example
{
    private String timeStamp;

    private String cluster;

    private Scenarios[] scenarios;

    private String env;

    private String type;

    private String group;

    public String getTimeStamp ()
    {
        return timeStamp;
    }

    public void setTimeStamp (String timeStamp)
    {
        this.timeStamp = timeStamp;
    }

    public String getCluster ()
    {
        return cluster;
    }

    public void setCluster (String cluster)
    {
        this.cluster = cluster;
    }

    public Scenarios[] getScenarios ()
    {
        return scenarios;
    }

    public void setScenarios (Scenarios[] scenarios)
    {
        this.scenarios = scenarios;
    }

    public String getEnv ()
    {
        return env;
    }

    public void setEnv (String env)
    {
        this.env = env;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getGroup ()
    {
        return group;
    }

    public void setGroup (String group)
    {
        this.group = group;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timeStamp = "+timeStamp+", cluster = "+cluster+", scenarios = "+scenarios+", env = "+env+", type = "+type+", group = "+group+"]";
    }
}