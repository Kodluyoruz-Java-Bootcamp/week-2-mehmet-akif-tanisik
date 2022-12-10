package week2.question7.emlakcepte.model;

public class Search {
    private String province;
    private String district;

    public Search(){}

    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String toString(){
        return "Province: " + province + " District: " + district;
    }
}
