package jena;

import java.util.List;

public class Scenarios
{
    private List<ChildServices> childServices;

    private String name;

    private String status;

    public List<ChildServices> getChildServices ()
    {
        return childServices;
    }

    public void setChildServices (List<ChildServices> childServices)
    {
        this.childServices = childServices;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [childServices = "+childServices+", name = "+name+", status = "+status+"]";
    }
}