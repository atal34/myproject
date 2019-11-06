package fabJSON;

public class AccountTranHistory
{
    private ResponseStatus responseStatus;

    private ApplicationArea applicationArea;

    private DataArea dataArea;

    public ResponseStatus getResponseStatus ()
    {
        return responseStatus;
    }

    public void setResponseStatus (ResponseStatus responseStatus)
    {
        this.responseStatus = responseStatus;
    }

    public ApplicationArea getApplicationArea ()
    {
        return applicationArea;
    }

    public void setApplicationArea (ApplicationArea applicationArea)
    {
        this.applicationArea = applicationArea;
    }

    public DataArea getDataArea ()
    {
        return dataArea;
    }

    public void setDataArea (DataArea dataArea)
    {
        this.dataArea = dataArea;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [responseStatus = "+responseStatus+", applicationArea = "+applicationArea+", dataArea = "+dataArea+"]";
    }
}
	
