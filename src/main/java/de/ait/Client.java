package de.ait;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger log = LoggerFactory.getLogger(Client.class);
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

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Id is null or empty");
            log.warn("Id is null or empty");
        } else {
            this.id = id;
        }
    }




    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name is null or empty");
            log.warn("Name is null or empty");
        } else {
            this.name = name;
        }
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setMembershipType(String membershipType) {
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
