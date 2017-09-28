/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FilterListPhoneNumbersRegions;
import io.swagger.client.model.GroupByListPhoneNumbersRegions;
import io.swagger.client.model.PhoneNumbersRegionsFull;
import io.swagger.client.model.SortListPhoneNumbersRegions;

/**
 * ListPhoneNumbersRegionsFull
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-31T14:54:48.237Z")
public class ListPhoneNumbersRegionsFull {
  @SerializedName("group_by")
  private GroupByListPhoneNumbersRegions groupBy = null;

  @SerializedName("filters")
  private FilterListPhoneNumbersRegions filters = null;

  @SerializedName("sort")
  private SortListPhoneNumbersRegions sort = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("items")
  private PhoneNumbersRegionsFull items = null;

  public ListPhoneNumbersRegionsFull groupBy(GroupByListPhoneNumbersRegions groupBy) {
    this.groupBy = groupBy;
    return this;
  }

   /**
   * Get groupBy
   * @return groupBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public GroupByListPhoneNumbersRegions getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(GroupByListPhoneNumbersRegions groupBy) {
    this.groupBy = groupBy;
  }

  public ListPhoneNumbersRegionsFull filters(FilterListPhoneNumbersRegions filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(example = "null", value = "")
  public FilterListPhoneNumbersRegions getFilters() {
    return filters;
  }

  public void setFilters(FilterListPhoneNumbersRegions filters) {
    this.filters = filters;
  }

  public ListPhoneNumbersRegionsFull sort(SortListPhoneNumbersRegions sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "")
  public SortListPhoneNumbersRegions getSort() {
    return sort;
  }

  public void setSort(SortListPhoneNumbersRegions sort) {
    this.sort = sort;
  }

  public ListPhoneNumbersRegionsFull total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ListPhoneNumbersRegionsFull offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ListPhoneNumbersRegionsFull limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListPhoneNumbersRegionsFull items(PhoneNumbersRegionsFull items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public PhoneNumbersRegionsFull getItems() {
    return items;
  }

  public void setItems(PhoneNumbersRegionsFull items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPhoneNumbersRegionsFull listPhoneNumbersRegionsFull = (ListPhoneNumbersRegionsFull) o;
    return Objects.equals(this.groupBy, listPhoneNumbersRegionsFull.groupBy) &&
        Objects.equals(this.filters, listPhoneNumbersRegionsFull.filters) &&
        Objects.equals(this.sort, listPhoneNumbersRegionsFull.sort) &&
        Objects.equals(this.total, listPhoneNumbersRegionsFull.total) &&
        Objects.equals(this.offset, listPhoneNumbersRegionsFull.offset) &&
        Objects.equals(this.limit, listPhoneNumbersRegionsFull.limit) &&
        Objects.equals(this.items, listPhoneNumbersRegionsFull.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBy, filters, sort, total, offset, limit, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPhoneNumbersRegionsFull {\n");
    
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

