     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness;


import MarketAnalytics.SalesAnalyticsReport;
import TheBusiness.Business.Business;
import data.DataGenerator;
import java.io.IOException;

/**
 *
 * @author kal bugrara
 */
public class RangePricingApplication {

    /**
     * @param args the command line arguments
     */
    
    Business business;
    SalesAnalyticsReport salesAnalyticsReport;
    
    public RangePricingApplication() throws IOException  {
        DataGenerator generator = DataGenerator.getInstance();
        business = ConfigureABusiness.initializeMarkets();
        salesAnalyticsReport = new SalesAnalyticsReport(business);
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       //Business business = ConfigureABusiness.initializeMarkets();
       
       RangePricingApplication inst = new RangePricingApplication();       
       inst.runAnalysis();
    }

    private void runAnalysis(){
        // TODO
        salesAnalyticsReport.showTop3BestNegotiatedSolutions();
        
        salesAnalyticsReport.showTop3Customer();
        
        salesAnalyticsReport.showTop3BestSalesPeople();
        
        salesAnalyticsReport.showTotalMarginalRevenue();
        
        salesAnalyticsReport.showProductPriceRange();
        
    }
       
}

