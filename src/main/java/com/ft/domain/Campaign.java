package com.ft.domain;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A Campaign.
 */
@Document(collection = "campaign")
public class Campaign implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    /**
     * The name of the campaign
     */
    @NotNull
    @ApiModelProperty(value = "The name of the campaign", required = true)
    @Field("name")
    private String name;

    @Field("description")
    private String description;

    /**
     * The code used to identify this campaign on report or CDR
     */
    @NotNull
    @Size(max = 80)
    @ApiModelProperty(value = "The code used to identify this campaign on report or CDR", required = true)
    @Field("code")
    private String code;

    /**
     * External ID on other remote system
     */
    @ApiModelProperty(value = "External ID on other remote system")
    @Field("external_id")
    private String externalId;

    /**
     * The Channel to use for broadcasting, SMS / USSD
     */
    @NotNull
    @ApiModelProperty(value = "The Channel to use for broadcasting, SMS / USSD", required = true)
    @Field("channel")
    private String channel;

    /**
     * state code, 0 = Pending for Approval, 1 = Approved, 9 = Success, -9 = Expired
     */
    @ApiModelProperty(value = "state code, 0 = Pending for Approval, 1 = Approved, 9 = Success, -9 = Expired")
    @Field("state")
    private Integer state;

    /**
     * The USSD shortcode used to send out messages
     */
    @NotNull
    @Size(max = 40)
    @ApiModelProperty(value = "The USSD shortcode used to send out messages", required = true)
    @Field("short_code")
    private String shortCode;

    /**
     * Callback URL for VXML under USSD Network Browser
     */
    @ApiModelProperty(value = "Callback URL for VXML under USSD Network Browser")
    @Field("callback_url")
    private String callbackUrl;

    /**
     * Refer to User account which create this campaign
     */
    @ApiModelProperty(value = "Refer to User account which create this campaign")
    @Field("created_by")
    private String createdBy;

    @Field("created_at")
    private ZonedDateTime createdAt;

    /**
     * Refer to User account Who approve this campaign
     */
    @ApiModelProperty(value = "Refer to User account Who approve this campaign")
    @Field("approved_by")
    private String approvedBy;

    @Field("approved_at")
    private ZonedDateTime approvedAt;

    /**
     * First SMS or USSD messages to send to customers
     */
    @ApiModelProperty(value = "First SMS or USSD messages to send to customers")
    @Field("short_msg")
    private String shortMsg;

    /**
     * List of MSISDN to be send
     */
    @ApiModelProperty(value = "List of MSISDN to be send")
    @Field("msisdn_list")
    private byte[] msisdnList;

    @Field("msisdn_list_content_type")
    private String msisdnListContentType;

    /**
     * Sending time window
     */
    @ApiModelProperty(value = "Sending time window")
    @Field("start_at")
    private ZonedDateTime startAt;

    @Field("expired_at")
    private ZonedDateTime expiredAt;

    @Field("working_hours")
    private String workingHours;

    @Field("working_weekdays")
    private String workingWeekdays;

    @Field("working_days")
    private String workingDays;

    /**
     * Target Services to be broadcast related info, should be logged into CDR
     */
    @ApiModelProperty(value = "Target Services to be broadcast related info, should be logged into CDR")
    @Field("sp_svc")
    private String spSvc;

    @Field("sp_id")
    private String spId;

    @Field("cp_id")
    private String cpId;

    /**
     * Total messages allow to broadcast
     */
    @ApiModelProperty(value = "Total messages allow to broadcast")
    @Field("msg_quota")
    private Integer msgQuota;

    /**
     * Total messages per subscriber allow to broadcast
     */
    @ApiModelProperty(value = "Total messages per subscriber allow to broadcast")
    @Field("sub_quota")
    private Integer subQuota;

    /**
     * SMS or USSD message broadcast per second
     */
    @ApiModelProperty(value = "SMS or USSD message broadcast per second")
    @Field("rate_limit")
    private Double rateLimit;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Campaign name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public Campaign description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public Campaign code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExternalId() {
        return externalId;
    }

    public Campaign externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getChannel() {
        return channel;
    }

    public Campaign channel(String channel) {
        this.channel = channel;
        return this;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getState() {
        return state;
    }

    public Campaign state(Integer state) {
        this.state = state;
        return this;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getShortCode() {
        return shortCode;
    }

    public Campaign shortCode(String shortCode) {
        this.shortCode = shortCode;
        return this;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public Campaign callbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Campaign createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public Campaign createdAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public Campaign approvedBy(String approvedBy) {
        this.approvedBy = approvedBy;
        return this;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public ZonedDateTime getApprovedAt() {
        return approvedAt;
    }

    public Campaign approvedAt(ZonedDateTime approvedAt) {
        this.approvedAt = approvedAt;
        return this;
    }

    public void setApprovedAt(ZonedDateTime approvedAt) {
        this.approvedAt = approvedAt;
    }

    public String getShortMsg() {
        return shortMsg;
    }

    public Campaign shortMsg(String shortMsg) {
        this.shortMsg = shortMsg;
        return this;
    }

    public void setShortMsg(String shortMsg) {
        this.shortMsg = shortMsg;
    }

    public byte[] getMsisdnList() {
        return msisdnList;
    }

    public Campaign msisdnList(byte[] msisdnList) {
        this.msisdnList = msisdnList;
        return this;
    }

    public void setMsisdnList(byte[] msisdnList) {
        this.msisdnList = msisdnList;
    }

    public String getMsisdnListContentType() {
        return msisdnListContentType;
    }

    public Campaign msisdnListContentType(String msisdnListContentType) {
        this.msisdnListContentType = msisdnListContentType;
        return this;
    }

    public void setMsisdnListContentType(String msisdnListContentType) {
        this.msisdnListContentType = msisdnListContentType;
    }

    public ZonedDateTime getStartAt() {
        return startAt;
    }

    public Campaign startAt(ZonedDateTime startAt) {
        this.startAt = startAt;
        return this;
    }

    public void setStartAt(ZonedDateTime startAt) {
        this.startAt = startAt;
    }

    public ZonedDateTime getExpiredAt() {
        return expiredAt;
    }

    public Campaign expiredAt(ZonedDateTime expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    public void setExpiredAt(ZonedDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public Campaign workingHours(String workingHours) {
        this.workingHours = workingHours;
        return this;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getWorkingWeekdays() {
        return workingWeekdays;
    }

    public Campaign workingWeekdays(String workingWeekdays) {
        this.workingWeekdays = workingWeekdays;
        return this;
    }

    public void setWorkingWeekdays(String workingWeekdays) {
        this.workingWeekdays = workingWeekdays;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public Campaign workingDays(String workingDays) {
        this.workingDays = workingDays;
        return this;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public String getSpSvc() {
        return spSvc;
    }

    public Campaign spSvc(String spSvc) {
        this.spSvc = spSvc;
        return this;
    }

    public void setSpSvc(String spSvc) {
        this.spSvc = spSvc;
    }

    public String getSpId() {
        return spId;
    }

    public Campaign spId(String spId) {
        this.spId = spId;
        return this;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public String getCpId() {
        return cpId;
    }

    public Campaign cpId(String cpId) {
        this.cpId = cpId;
        return this;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    public Integer getMsgQuota() {
        return msgQuota;
    }

    public Campaign msgQuota(Integer msgQuota) {
        this.msgQuota = msgQuota;
        return this;
    }

    public void setMsgQuota(Integer msgQuota) {
        this.msgQuota = msgQuota;
    }

    public Integer getSubQuota() {
        return subQuota;
    }

    public Campaign subQuota(Integer subQuota) {
        this.subQuota = subQuota;
        return this;
    }

    public void setSubQuota(Integer subQuota) {
        this.subQuota = subQuota;
    }

    public Double getRateLimit() {
        return rateLimit;
    }

    public Campaign rateLimit(Double rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    public void setRateLimit(Double rateLimit) {
        this.rateLimit = rateLimit;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Campaign campaign = (Campaign) o;
        if (campaign.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), campaign.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Campaign{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", code='" + getCode() + "'" +
            ", externalId='" + getExternalId() + "'" +
            ", channel='" + getChannel() + "'" +
            ", state=" + getState() +
            ", shortCode='" + getShortCode() + "'" +
            ", callbackUrl='" + getCallbackUrl() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", approvedBy='" + getApprovedBy() + "'" +
            ", approvedAt='" + getApprovedAt() + "'" +
            ", shortMsg='" + getShortMsg() + "'" +
            ", msisdnList='" + getMsisdnList() + "'" +
            ", msisdnListContentType='" + getMsisdnListContentType() + "'" +
            ", startAt='" + getStartAt() + "'" +
            ", expiredAt='" + getExpiredAt() + "'" +
            ", workingHours='" + getWorkingHours() + "'" +
            ", workingWeekdays='" + getWorkingWeekdays() + "'" +
            ", workingDays='" + getWorkingDays() + "'" +
            ", spSvc='" + getSpSvc() + "'" +
            ", spId='" + getSpId() + "'" +
            ", cpId='" + getCpId() + "'" +
            ", msgQuota=" + getMsgQuota() +
            ", subQuota=" + getSubQuota() +
            ", rateLimit=" + getRateLimit() +
            "}";
    }
}