package de.ait;

public class Membership {
    private String id;
    private String membershipType;
    private int validUntil;

    public Membership(String id, String membershipType, int validUntil) {
        this.id = id;
        this.membershipType = membershipType;
        this.validUntil = validUntil;
    }

    public String getId() {
        return id;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public int getValidUntil() {
        return validUntil;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "id='" + id + '\'' +
                ", membershipType='" + membershipType + '\'' +
                ", validUntil=" + validUntil +
                '}';
    }
}
