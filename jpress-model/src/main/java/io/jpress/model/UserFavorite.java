package io.jpress.model;

import io.jboot.db.annotation.Table;
import io.jpress.model.base.BaseUserFavorite;

import java.util.Date;

/**
 * Generated by JPress.
 */
@Table(tableName = "user_favorite", primaryKey = "id")
public class UserFavorite extends BaseUserFavorite<UserFavorite> {
    public static final String FAV_TYPE_PRODUCT = "product";
    public static final String FAV_TYPE_ARTICLE = "article";
    public static final String FAV_TYPE_ARTICLE_TEXT = "文章";
    public static final String FAV_TYPE_PRODUCT_TEXT = "商品";
    private static final long serialVersionUID = 1L;

    private Long read;
    private Long comment;
    private Date startTime;

    public Long getRead() {
        return read;
    }

    public void setRead(Long read) {
        this.read = read;
    }

    public Long getComment() {
        return comment;
    }

    public void setComment(Long comment) {
        this.comment = comment;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}