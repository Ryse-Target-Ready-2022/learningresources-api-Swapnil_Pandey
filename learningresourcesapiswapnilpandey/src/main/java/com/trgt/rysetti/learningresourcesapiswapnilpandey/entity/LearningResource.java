package com.trgt.rysetti.learningresourcesapiswapnilpandey.entity;
import java.time.LocalDate;

public class LearningResource {
    private Integer learningResourceID;
    private String resourceName;
    private Double costPrice;
    private Double sellingPrice;
    private LearningResourceStatus learningResourceStatus;
    private LocalDate createDate;
    private LocalDate publishDate;
    private LocalDate retireDate;

    public Integer getLearningResourceID() {
        return learningResourceID;
    }

    public void setLearningResourceID(Integer learningResourceID) {
        this.learningResourceID = learningResourceID;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public LearningResourceStatus getLearningResourceStatus() {
        return learningResourceStatus;
    }

    public void setLearningResourceStatus(LearningResourceStatus learningResourceStatus) {
        this.learningResourceStatus = learningResourceStatus;
    }

    public LocalDate getcreateDate() {
        return createDate;
    }

    public void setcreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getpublishDate() {
        return publishDate;
    }

    public void setpublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public LocalDate getretireDate() {
        return retireDate;
    }

    public void setretireDate(LocalDate retireDate) {
        this.retireDate = retireDate;
    }




    public LearningResource(Integer learningResourceID, String resourceName, Double costPrice, Double sellingPrice, LearningResourceStatus learningResourceStatus, LocalDate createDate, LocalDate publishDate, LocalDate retireDate) {
        this.learningResourceID = learningResourceID;
        this.resourceName = resourceName;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.learningResourceStatus = learningResourceStatus;
        this.createDate = createDate;
        this.publishDate = publishDate;
        this.retireDate = retireDate;
    }
    public LearningResource() {
    }


}


