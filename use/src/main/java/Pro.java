/**
 * @className Pro 
 * @description  
 * @author c.w
 * @date 2024/01/16 15:02
 * @version 
**/
public class Pro {
    private String pro;
    private String city;
    private String school;

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Pro(String pro, String city, String school){
        this.pro = pro;
        this.city = city;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Pro{" +
                "pro='" + pro + '\'' +
                ", city='" + city + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}


