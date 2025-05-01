package task_11_company_asset_tracker;

import java.util.*;

public class CompanyAssetTracker
{
    private Map<String, Set<Asset>> departmentAssets = new HashMap<>();
    private Set<String> globalAssetIds = new HashSet<>();

    // Add asset to a department if ID not already used globally
    public void addAsset(String department, Asset asset)
    {
        if (globalAssetIds.contains(asset.getId()))
        {
            System.out.println(" Duplicate asset ID: " + asset.getId() + " not added.");
            return;
        }

        // Add to global set and department map
        globalAssetIds.add(asset.getId());
        departmentAssets.computeIfAbsent(department, k -> new HashSet<>()).add(asset);
        System.out.println(" Added asset to " + department + ": " + asset);
    }

    // Print all assets per department
    public void printAssets()
    {
        for (String dept : departmentAssets.keySet())
        {
            System.out.println("Department: " + dept);
            for (Asset asset : departmentAssets.get(dept))
            {
                System.out.println("  " + asset);
            }
        }
    }
}


