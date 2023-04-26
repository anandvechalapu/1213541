trigger RegularAdjustmentContribution_RemoveAdjustmentContributionBatch on RegularAdjustmentContribution__c (before delete)
{
    Set<Long> BatchIds = new Set<Long>();
    for(RegularAdjustmentContribution__c rac : Trigger.old)
    {
        BatchIds.add(rac.BatchId__c);
    }
    
    // Fetch all regular adjustment contribution records associated with the batchIds
    List<RegularAdjustmentContribution__c> racList = [SELECT Id, BatchId__c FROM RegularAdjustmentContribution__c WHERE BatchId__c IN :BatchIds];
    // If racList is empty, then there are no contribution records for the given batchIds
    if(racList.isEmpty())
    {
        // Return a JSON response indicating failure
        Map<String, String> response = new Map<String, String>();
        response.put('transactionStatus', 'FAILURE');
        response.put('transactionMessage', 'Batch Not Found');
        // Throw an exception with the response
        throw new RegularAdjustmentContribution_RemoveAdjustmentContributionBatchException(response);
    }
    else
    {
        try
        {
            delete racList;
            // Return a JSON response indicating success
            Map<String, String> response = new Map<String, String>();
            response.put('transactionStatus', 'SUCCESS');
            response.put('transactionMessage', 'Batch [batchId] is deleted successfully!!');
            // Throw an exception with the response
            throw new RegularAdjustmentContribution_RemoveAdjustmentContributionBatchException(response);
        }
        catch(Exception ex)
        {
            // Return a JSON response indicating failure
            Map<String, String> response = new Map<String, String>();
            response.put('transactionStatus', 'FAILURE');
            response.put('transactionMessage', 'Exception [' + ex.getMessage() + '].');
            // Throw an exception with the response
            throw new RegularAdjustmentContribution_RemoveAdjustmentContributionBatchException(response);
        }
    }
}

public class RegularAdjustmentContribution_RemoveAdjustmentContributionBatchException extends Exception
{
    Map<String, String> response;
    public RegularAdjustmentContribution_RemoveAdjustmentContributionBatchException(Map<String, String> response)
    {
        this.response = response;
    }
    public Map<String, String> getResponse()
    {
        return this.response;
    }
}