package lab01;

public class Product {
    private String name;
    private String description;
    private String ID;
    private double cost;

    public Product(String name, String description, String ID, double cost) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getID() { return ID; }
    public double getCost() { return cost; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setCost(double cost) { this.cost = cost; }

    // toString
    @Override
    public String toString() {
        return name + " (" + ID + ") - $" + cost;
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            Product other = (Product) obj;
            return this.ID.equals(other.ID);
        }
        return false;
    }

    // CSV, JSON, XML
    public String toCSV() {
        return name + "," + description + "," + ID + "," + cost;
    }

    public String toJSON() {
        return "{ \"name\":\"" + name + "\", \"description\":\"" + description + "\", \"ID\":\"" + ID + "\", \"cost\":" + cost + " }";
    }

    public String toXML() {
        return "<Product><name>" + name + "</name><description>" + description + "</description><ID>" + ID + "</ID><cost>" + cost + "</cost></Product>";
    }
}