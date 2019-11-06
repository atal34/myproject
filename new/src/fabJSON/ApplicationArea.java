package fabJSON;

public class ApplicationArea
{
    private String senderId;

    private String transactionDateTime;

    private String correlationId;

    private String language;

    private String countryOfOrigin;

    private String requiredExecutionDate;

    private String transactionId;

    private String creationDateTime;

    public String getSenderId ()
    {
        return senderId;
    }

    public void setSenderId (String senderId)
    {
        this.senderId = senderId;
    }

    public String getTransactionDateTime ()
    {
        return transactionDateTime;
    }

    public void setTransactionDateTime (String transactionDateTime)
    {
        this.transactionDateTime = transactionDateTime;
    }

    public String getCorrelationId ()
    {
        return correlationId;
    }

    public void setCorrelationId (String correlationId)
    {
        this.correlationId = correlationId;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    public String getCountryOfOrigin ()
    {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin (String countryOfOrigin)
    {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getRequiredExecutionDate ()
    {
        return requiredExecutionDate;
    }

    public void setRequiredExecutionDate (String requiredExecutionDate)
    {
        this.requiredExecutionDate = requiredExecutionDate;
    }

    public String getTransactionId ()
    {
        return transactionId;
    }

    public void setTransactionId (String transactionId)
    {
        this.transactionId = transactionId;
    }

    public String getCreationDateTime ()
    {
        return creationDateTime;
    }

    public void setCreationDateTime (String creationDateTime)
    {
        this.creationDateTime = creationDateTime;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [senderId = "+senderId+", transactionDateTime = "+transactionDateTime+", correlationId = "+correlationId+", language = "+language+", countryOfOrigin = "+countryOfOrigin+", requiredExecutionDate = "+requiredExecutionDate+", transactionId = "+transactionId+", creationDateTime = "+creationDateTime+"]";
    }
}
