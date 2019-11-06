package fabJSON;

public class ResponseStatus
{
    private MetaData metaData;

    private String status;

    public MetaData getMetaData ()
    {
        return metaData;
    }

    public void setMetaData (MetaData metaData)
    {
        this.metaData = metaData;
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
        return "ClassPojo [metaData = "+metaData+", status = "+status+"]";
    }
}
