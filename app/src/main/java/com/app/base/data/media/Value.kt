package com.app.base.data.media

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Value : Serializable
{
    @SerializedName("media_id")
    @Expose
    val mediaId: String? = null

    @SerializedName("user_id")
    @Expose
    val userId: String? = null

    @SerializedName("video_url")
    @Expose
     val videoUrl: String? = null
    @SerializedName("img_url")
    @Expose
     val imgUrl: String? = null
    @SerializedName("media_type")
    @Expose
     val mediaType: String? = null
    @SerializedName("is_private")
    @Expose
     val isPrivate: String? = null
    @SerializedName("is_admin")
    @Expose
     val isAdmin: Int? = null
    @SerializedName("like_count")
    @Expose
     val likeCount: Int? = null
    @SerializedName("is_user_like")
    @Expose
     val isUserLike: Int? = null
}