package fabJSON;

public class PostingEntries
{
    private String showFT;

    private String transactionCurrency;

    private String exchangeRateToOriginalCurrency;

    private String balanceAmountAfterTransaction;

    private String transactionReference;

    private String valueDate;

    private String postingDate;

    private String transactionCode;

    private String beneficiaryCustomer;

    private String transactionDesc;

    private String postedAmount;

    private String transactionType;

    private String orderingCustomer;

    private String balanceAmountBeforeTransaction;

    private String customerReference;

    public String getShowFT ()
    {
        return showFT;
    }

    public void setShowFT (String showFT)
    {
        this.showFT = showFT;
    }

    public String getTransactionCurrency ()
    {
        return transactionCurrency;
    }

    public void setTransactionCurrency (String transactionCurrency)
    {
        this.transactionCurrency = transactionCurrency;
    }

    public String getExchangeRateToOriginalCurrency ()
    {
        return exchangeRateToOriginalCurrency;
    }

    public void setExchangeRateToOriginalCurrency (String exchangeRateToOriginalCurrency)
    {
        this.exchangeRateToOriginalCurrency = exchangeRateToOriginalCurrency;
    }

    public String getBalanceAmountAfterTransaction ()
    {
        return balanceAmountAfterTransaction;
    }

    public void setBalanceAmountAfterTransaction (String balanceAmountAfterTransaction)
    {
        this.balanceAmountAfterTransaction = balanceAmountAfterTransaction;
    }

    public String getTransactionReference ()
    {
        return transactionReference;
    }

    public void setTransactionReference (String transactionReference)
    {
        this.transactionReference = transactionReference;
    }

    public String getValueDate ()
    {
        return valueDate;
    }

    public void setValueDate (String valueDate)
    {
        this.valueDate = valueDate;
    }

    public String getPostingDate ()
    {
        return postingDate;
    }

    public void setPostingDate (String postingDate)
    {
        this.postingDate = postingDate;
    }

    public String getTransactionCode ()
    {
        return transactionCode;
    }

    public void setTransactionCode (String transactionCode)
    {
        this.transactionCode = transactionCode;
    }

    public String getBeneficiaryCustomer ()
    {
        return beneficiaryCustomer;
    }

    public void setBeneficiaryCustomer (String beneficiaryCustomer)
    {
        this.beneficiaryCustomer = beneficiaryCustomer;
    }

    public String getTransactionDesc ()
    {
        return transactionDesc;
    }

    public void setTransactionDesc (String transactionDesc)
    {
        this.transactionDesc = transactionDesc;
    }

    public String getPostedAmount ()
    {
        return postedAmount;
    }

    public void setPostedAmount (String postedAmount)
    {
        this.postedAmount = postedAmount;
    }

    public String getTransactionType ()
    {
        return transactionType;
    }

    public void setTransactionType (String transactionType)
    {
        this.transactionType = transactionType;
    }

    public String getOrderingCustomer ()
    {
        return orderingCustomer;
    }

    public void setOrderingCustomer (String orderingCustomer)
    {
        this.orderingCustomer = orderingCustomer;
    }

    public String getBalanceAmountBeforeTransaction ()
    {
        return balanceAmountBeforeTransaction;
    }

    public void setBalanceAmountBeforeTransaction (String balanceAmountBeforeTransaction)
    {
        this.balanceAmountBeforeTransaction = balanceAmountBeforeTransaction;
    }

    public String getCustomerReference ()
    {
        return customerReference;
    }

    public void setCustomerReference (String customerReference)
    {
        this.customerReference = customerReference;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [showFT = "+showFT+", transactionCurrency = "+transactionCurrency+", exchangeRateToOriginalCurrency = "+exchangeRateToOriginalCurrency+", balanceAmountAfterTransaction = "+balanceAmountAfterTransaction+", transactionReference = "+transactionReference+", valueDate = "+valueDate+", postingDate = "+postingDate+", transactionCode = "+transactionCode+", beneficiaryCustomer = "+beneficiaryCustomer+", transactionDesc = "+transactionDesc+", postedAmount = "+postedAmount+", transactionType = "+transactionType+", orderingCustomer = "+orderingCustomer+", balanceAmountBeforeTransaction = "+balanceAmountBeforeTransaction+", customerReference = "+customerReference+"]";
    }
}
