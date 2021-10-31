package www.jiumeng.entry;

import lombok.Data;

/**
 *
 * @author GaoYue
 * @create 2021-10-25 22:54
 */
@Data
public class CaseResult {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(final String pwd) {
        this.pwd = pwd;
    }

    private String pwd;
}
