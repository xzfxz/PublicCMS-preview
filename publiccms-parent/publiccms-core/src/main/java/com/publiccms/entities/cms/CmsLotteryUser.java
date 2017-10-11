package com.publiccms.entities.cms;

import static com.publiccms.common.database.CmsUpgrader.IDENTIFIER_GENERATOR;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * CmsLotteryUser generated by hbm2java
 */
@Entity
@Table(name = "cms_lottery_user")
public class CmsLotteryUser implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "抽奖", condition = true)
    private long lotteryId;
    @GeneratorColumn(title = "用户", condition = true)
    private long userId;
    @GeneratorColumn(title = "是否中奖", condition = true)
    private boolean winning;
    @GeneratorColumn(title = "是否确认", condition = true)
    private boolean confirmed;
    @GeneratorColumn(title = "确认日期", condition = true)
    private Date confirmDate;
    @GeneratorColumn(title = "IP")
    private String ip;
    @GeneratorColumn(title = "抽奖时间", condition = true, order = true)
    private Date createDate;

    public CmsLotteryUser() {
    }

    public CmsLotteryUser(long lotteryId, long userId, boolean winning, boolean confirmed, String ip, Date createDate) {
        this.lotteryId = lotteryId;
        this.userId = userId;
        this.winning = winning;
        this.confirmed = confirmed;
        this.ip = ip;
        this.createDate = createDate;
    }

    public CmsLotteryUser(long lotteryId, long userId, boolean winning, boolean confirmed, Date confirmDate, String ip,
            Date createDate) {
        this.lotteryId = lotteryId;
        this.userId = userId;
        this.winning = winning;
        this.confirmed = confirmed;
        this.confirmDate = confirmDate;
        this.ip = ip;
        this.createDate = createDate;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = IDENTIFIER_GENERATOR)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "lottery_id", nullable = false)
    public long getLotteryId() {
        return this.lotteryId;
    }

    public void setLotteryId(long lotteryId) {
        this.lotteryId = lotteryId;
    }

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "winning", nullable = false)
    public boolean isWinning() {
        return this.winning;
    }

    public void setWinning(boolean winning) {
        this.winning = winning;
    }

    @Column(name = "confirmed", nullable = false)
    public boolean isConfirmed() {
        return this.confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "confirm_date", length = 19)
    public Date getConfirmDate() {
        return this.confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    @Column(name = "ip", nullable = false, length = 64)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}