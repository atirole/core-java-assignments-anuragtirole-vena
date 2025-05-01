package task_11_company_asset_tracker;

public class Asset
{
    private String id;
    private String name;
    private double value;

    public Asset(String id, String name, double value)
    {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public String getId()
    {
        return id;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (!(obj instanceof Asset)) return false;
        Asset other = (Asset) obj;
        return this.id.equals(other.id);
    }

    @Override
    public int hashCode()
    {
        return id.hashCode();
    }

    @Override
    public String toString()
    {
        return "Asset ID: " + id + ", Name: " + name + ", Value: $" + value;
    }
}
