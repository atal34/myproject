package fabJSON;

public class MetaData
{
    private String dateFormat;

    public String getDateFormat ()
    {
        return dateFormat;
    }

    public void setDateFormat (String dateFormat)
    {
        this.dateFormat = dateFormat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dateFormat = "+dateFormat+"]";
    }
}
