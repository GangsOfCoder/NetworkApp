package com.app.base.data.media

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class MediaResponsePojo : Serializable {
    @SerializedName("status")
    @Expose
    val status: Int? = null


    @SerializedName("value")
    @Expose
    val value: List<Value>? = null


    @SerializedName("event_owner")
    @Expose
    val event_owner: Int? = null


    @SerializedName("package_selection")
    @Expose
    val package_selection: String? = null


    @SerializedName("pending_videos")
    @Expose
    val pending_videos: String? = null


    @SerializedName("username")
    @Expose
    val username: String? = null


    @SerializedName("expire")
    @Expose
    var expire: String? = null


}