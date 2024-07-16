/**
 * Author: Dreamer-1
 * Date: 2019-03-01
 * Time: 11:33
 * Description: 读取Excel时，封装读取的每一行的数据
 */
public class ExcelDataVO {

   private String id;
   private String type;
   private String title;
   private String createTime;
   private String status;
   private String origin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "ExcelDataVO{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", createTime='" + createTime + '\'' +
                ", status='" + status + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}

