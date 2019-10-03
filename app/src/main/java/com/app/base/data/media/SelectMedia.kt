package com.app.base.data.media

import android.os.Parcel
import android.os.Parcelable

class SelectMedia(val imgUrl: String?,
                  val isPrivate: String?,
                  var isSelected: Boolean?,
                  var mediaId: String,
                  var uniqueAnimationId: Long
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readValue(Boolean::class.java.classLoader) as? Boolean,
            parcel.readString(),
            parcel.readLong()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(imgUrl)
        parcel.writeString(isPrivate)
        parcel.writeValue(isSelected)
        parcel.writeString(mediaId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SelectMedia> {
        override fun createFromParcel(parcel: Parcel): SelectMedia {
            return SelectMedia(parcel)
        }

        override fun newArray(size: Int): Array<SelectMedia?> {
            return arrayOfNulls(size)
        }
    }
}