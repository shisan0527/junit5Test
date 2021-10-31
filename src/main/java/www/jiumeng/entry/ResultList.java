package www.jiumeng.entry;

import lombok.Data;

import java.util.List;


/**
 *
 * @author GaoYue
 * @create 2021-10-25 23:39
 */
@Data
public class ResultList {
    private List<CaseResult> resultList;

    public List<CaseResult> getResultList() {
        return resultList;
    }

    public void setResultList(final List<CaseResult> resultList) {
        this.resultList = resultList;
    }
}
