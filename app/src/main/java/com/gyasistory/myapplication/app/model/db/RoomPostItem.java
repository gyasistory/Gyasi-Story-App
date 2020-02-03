package com.gyasistory.myapplication.app.model.db;

import com.gyasistory.myapplication.app.model.PostsItem;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "post_item")
public class RoomPostItem {
    public RoomPostItem() {
    }

    private String date;

    private int commentCount = 0;

    private boolean parent = false;

    //private  metadata: List<MetadataItem>?,

    private int menuOrder = 0;

    private boolean pingsOpen = false;

    private String title = "";

    ////@SerializedName("type")
    private String type = "";

    //@SerializedName("URL")
    private String url = "";

    //@SerializedName("content")
    private String content = "";

    //@SerializedName("geo")
    private boolean geo = false;

    //@SerializedName("password")
    private String password;

    //@SerializedName("current_user_can")
    //private  currentUserCan: CurrentUserCan,

    //@SerializedName("is_reblogged")
    private boolean isReblogged = false;

    //@SerializedName("modified")
    private String modified;

    @PrimaryKey
    private int id;

    //private  categories: Categories,

    private String slug;
    //@SerializedName("comments_open")
    private boolean commentsOpen = false;

    //@SerializedName("like_count")
    private int likeCount;

    //@SerializedName("capabilities")
    //private  capabilities: Capabilities,

    //@SerializedName("author")
    private int authorId;

    //@SerializedName("global_ID")
    private String globalID;

    //@SerializedName("format")
    private String format;

    //@SerializedName("featured_image")
    private String featuredImage;

    //@SerializedName("likes_enabled")
    private boolean likesEnabled = false;

    //@SerializedName("short_URL")
    private String shortURL;

    //@SerializedName("sharing_enabled")
//    private boolean sharingEnabled = false;

    //@SerializedName("meta")
    //private  meta: Meta,

    //@SerializedName("i_like")
//    private boolean iLike = false;

    //@SerializedName("site_ID")
    private int siteID;

    //@SerializedName("sticky")
    private boolean sticky = false;

    //@SerializedName("guid")
    private String guid;

    //@SerializedName("excerpt")
    private String excerpt;

    //@SerializedName("is_following")
    private boolean isFollowing = false;

    //@SerializedName("status")
    private String status;

    public RoomPostItem(PostsItem item) {
        setAuthorId(item.getAuthor().getId());
        setCommentCount(item.getCommentCount());
        setCommentsOpen(item.getCommentsOpen());
        setContent(item.getContent());
        setDate(item.getDate());
        setExcerpt(item.getExcerpt());
        setFeaturedImage(item.getFeaturedImage());
        setFollowing(item.isFollowing());
        setFormat(item.getFormat());
        setGeo(item.getGeo());
        setGlobalID(item.getGlobalID());
        setGuid(item.getGuid());
        setId(item.getId());
//        setiLike(item.getILike());
        setLikeCount(item.getLikeCount());
        setLikesEnabled(item.getLikesEnabled());
        setMenuOrder(item.getMenuOrder());
        setModified(item.getModified());
        setParent(item.getParent());
        setPassword(item.getPassword());
        setPingsOpen(item.getPingsOpen());
        setReblogged(item.isReblogged());
//        setSharingEnabled(item.getSharingEnabled());
        setShortURL(item.getShortURL());
        setSiteID(item.getSiteID());
        setSlug(item.getSlug());
        setStatus(item.getStatus());
        setSticky(item.getSticky());
        setTitle(item.getTitle());
        setType(item.getType());
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public boolean isParent() {
        return parent;
    }

    public void setParent(boolean parent) {
        this.parent = parent;
    }

    public int getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }

    public boolean isPingsOpen() {
        return pingsOpen;
    }

    public void setPingsOpen(boolean pingsOpen) {
        this.pingsOpen = pingsOpen;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isGeo() {
        return geo;
    }

    public void setGeo(boolean geo) {
        this.geo = geo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isReblogged() {
        return isReblogged;
    }

    public void setReblogged(boolean reblogged) {
        isReblogged = reblogged;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean isCommentsOpen() {
        return commentsOpen;
    }

    public void setCommentsOpen(boolean commentsOpen) {
        this.commentsOpen = commentsOpen;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getGlobalID() {
        return globalID;
    }

    public void setGlobalID(String globalID) {
        this.globalID = globalID;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public boolean isLikesEnabled() {
        return likesEnabled;
    }

    public void setLikesEnabled(boolean likesEnabled) {
        this.likesEnabled = likesEnabled;
    }

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }

//    public boolean isSharingEnabled() {
//        return sharingEnabled;
//    }
//
//    public void setSharingEnabled(boolean sharingEnabled) {
//        this.sharingEnabled = sharingEnabled;
//    }
//
//    public boolean getiLike() {
//        return iLike;
//    }
//
//    public void setiLike(boolean iLike) {
//        this.iLike = iLike;
//    }

    public int getSiteID() {
        return siteID;
    }

    public void setSiteID(int siteID) {
        this.siteID = siteID;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public boolean isFollowing() {
        return isFollowing;
    }

    public void setFollowing(boolean following) {
        isFollowing = following;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
