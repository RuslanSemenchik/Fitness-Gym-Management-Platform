package de.ait;

public class Client {
    private String id;
    private String name;
    private String contactInfo;
    private String membershipType;

    public Client(String id, String name, String contactInfo, String membershipType) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.membershipType = membershipType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getMembershipType() {
        return membershipType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", membershipType='" + membershipType + '\'' +
                '}';
    }
}
