package task_11_company_asset_tracker;

public class Main
{
    public static void main(String[] args)
    {
        CompanyAssetTracker tracker = new CompanyAssetTracker();

        Asset a1 = new Asset("A001", "Laptop", 1200.0);
        Asset a2 = new Asset("A002", "Printer", 300.0);
        Asset a3 = new Asset("A003", "Projector", 500.0);
        Asset a4 = new Asset("A001", "Monitor", 250.0);  // Duplicate ID

        tracker.addAsset("IT", a1);
        tracker.addAsset("HR", a2);
        tracker.addAsset("Finance", a3);
        tracker.addAsset("IT", a4);  // Should be rejected

        System.out.println("\nAll Department Assets:");
        tracker.printAssets();
    }
}

