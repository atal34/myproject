package fabJSON;

public class DataArea
{
    private String closingBalanceCurrency;

    private String openingBalanceCurrency;

    private String accountIdentifier;

    private String closingBalanceAmount;

    private String openingBalanceAmount;

    private PostingEntries[] postingEntries;

    public String getClosingBalanceCurrency ()
    {
        return closingBalanceCurrency;
    }

    public void setClosingBalanceCurrency (String closingBalanceCurrency)
    {
        this.closingBalanceCurrency = closingBalanceCurrency;
    }

    public String getOpeningBalanceCurrency ()
    {
        return openingBalanceCurrency;
    }

    public void setOpeningBalanceCurrency (String openingBalanceCurrency)
    {
        this.openingBalanceCurrency = openingBalanceCurrency;
    }

    public String getAccountIdentifier ()
    {
        return accountIdentifier;
    }

    public void setAccountIdentifier (String accountIdentifier)
    {
        this.accountIdentifier = accountIdentifier;
    }

    public String getClosingBalanceAmount ()
    {
        return closingBalanceAmount;
    }

    public void setClosingBalanceAmount (String closingBalanceAmount)
    {
        this.closingBalanceAmount = closingBalanceAmount;
    }

    public String getOpeningBalanceAmount ()
    {
        return openingBalanceAmount;
    }

    public void setOpeningBalanceAmount (String openingBalanceAmount)
    {
        this.openingBalanceAmount = openingBalanceAmount;
    }

    public PostingEntries[] getPostingEntries ()
    {
        return postingEntries;
    }

    public void setPostingEntries (PostingEntries[] postingEntries)
    {
        this.postingEntries = postingEntries;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [closingBalanceCurrency = "+closingBalanceCurrency+", openingBalanceCurrency = "+openingBalanceCurrency+", accountIdentifier = "+accountIdentifier+", closingBalanceAmount = "+closingBalanceAmount+", openingBalanceAmount = "+openingBalanceAmount+", postingEntries = "+postingEntries+"]";
    }
}
