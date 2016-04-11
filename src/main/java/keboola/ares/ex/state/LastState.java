/*
 */
package keboola.ares.ex.state;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
public class LastState {

    @JsonProperty("lastRunDate")
    private Date lastRunDate;

    @JsonProperty("rqCount")
    private int rqCount;

    public LastState(Date lastRunDate, int rqCount) {
        this.lastRunDate = lastRunDate;
        this.rqCount = rqCount;
    }

    public Date getLastRunDate() {
        return lastRunDate;
    }

    public void setLastRunDate(Date lastRunDate) {
        this.lastRunDate = lastRunDate;
    }

    public int getRqCount() {
        return rqCount;
    }

    public void setRqCount(int rqCount) {
        this.rqCount = rqCount;
    }

    public LastState() {
    }

}
