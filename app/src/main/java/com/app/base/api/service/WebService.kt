package com.app.base.api.service

import com.app.base.bean.login.LoginResponse
import com.app.base.data.register.RegisterResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*


interface WebService {


/*
    @POST(Constants.ADD_MEDIA)
    @Multipart
    fun addMedia(@PartMap data: Map<String, @JvmSuppressWildcards RequestBody>,
                 @Part file: MultipartBody.Part?): Call<AddMediaPojo>
*/

//    //    @Headers("Accept: " + "application/json")
//    @POST("login")
//    @FormUrlEncoded
//    fun loginUser(@Field("code") code: String): Call<com.hmu.kotlin.data.pinLogin.LoginResponse>
//
//
//    @POST(Constants.UPDATE_INFO)
//    fun updateInformation(@Body request: ResetPasswordRequest): Call<UpdateInfoPojo>


//
//    @Headers("Accept: " + "application/json")
//    @POST("forgot_password")
//    fun resetPassword(@Body request: ResetPasswordRequest): Call<Status>
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("signup")
//    fun register(@Body request: RegisterationRequest): Call<Status>


//
//    @Headers("Accept: " + "application/json")
//    @POST("mr-register")
//    fun registeration(@Body request: RegisterationRequest): Call<RegisterationResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("change-password")
//    fun changePassword(@Body request: ChangePasswordRequest): Call<ChangePasswordResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("contact-us")
//    fun contactUs(@Body request: ContactUsRequest): Call<ContactUsResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @GET("master-data/products-list?name=Sa")
//    fun productsPromotedList(@Query("name") value: String,
//                             @Query("start") start: Int,
//                             @Query("length") length: Int): Call<ProductListResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @GET("master-data/register-fields")
//    fun getIndusteryList(): Call<RegisterFeildResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @GET("view-doctor")
//    fun doctorDetails(@Query("id") doctorId:Int): Call<ViewDoctorDetailsResponse>
//
//    @Headers("Accept: " + "application/json")
//    @GET("contact")
//    fun unverifiedDoctorDetails(@Query("id") doctorId:Int): Call<UnverifiedDoctorResponse>
//    fun doctorDetails(@Header("Authorization") token: String?, @Query("id") doctorId: Int?): Call<ViewDoctorDetailsResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @GET("master-data/specialty-list")
//    fun getSpecializationList(): Call<SpecializationListResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("search-doctor")
//    fun searchDoctor(@Body request: SearchDoctorRequeest): Call<SearchDoctorResponse>
//
//    @Headers("Accept: " + "application/json")
//    @POST("appointment")
//    fun bookSlot(@Body request: BookingRequest): Call<BookingResponse>
//
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("appointment")
//    fun bookSlotUnverifiedDoctor(@Body request: UnverifiedDoctorBookingRequest): Call<BookingResponse>
//
//    @Headers("Accept: " + "application/json")
//    @GET("doctor-schedule")
//    fun getDoctorSchedule(@Query("id") value: Int?,
//                          @Query("address_id") addressId: Int?,
//                          @Query("date") date: String?): Call<DoctorScheduleReponse>
//
//    @Headers("Accept: " + "application/json")
//    @GET("contact-schedule")
//    fun getUnverifiedDoctorSchedule(@Query("id") value: Int?,
//
//                          @Query("date") date: String?): Call<DoctorScheduleReponse>
//
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("last-visits")
//    fun appointmentsList(@Body request: ViewAnalyticsRequest): Call<ViewAnalyticsResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("appointments-list")
//    fun viewScheduleList(@Body request: ViewScheduleRequest): Call<ViewScheduleResponse>
//
//    @Headers("Accept: " + "application/json")
//    @POST("contact")
//    fun createContacts( @Body request: ContactRequest): Call<ContactResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("send-invitation")
//    fun sendInvitation(@Body request: InviteDoctorRequest): Call<InviteDoctorResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @HTTP(method = "DELETE", path = "contact", hasBody = true)
//    fun deleteContact( @Body request: DeleteUnverifiedDoctorRequest ): Call<DeleteUnverifiedDoctorResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @GET("contact-sugesstion")
//    fun getViewSuggestionList(@Query("id") id: Int?
//                              ,@Query("start") start: Int?
//                              ,@Query("length") length: Int?): Call<SuggestionResponse>
//
//
//
//    @Headers("Accept: " + "application/json")
//    @GET("notifications")
//    fun getNotificationList(@Query("page") page: Int?
//                              ): Call<NotificationResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @GET("contact-sugesstion?id=1465")
//    fun getViewSuggestionList(@Header("Authorization") token: String?): Call<ViewSuggestionResponse>
//
//    @Headers("Accept: " + "application/json")
//    @GET("view-contact")
//    fun getUserDetails(@Query("id") id: Int?): Call<GetUserDetailResponse>
//
//    @Headers("Accept: " + "application/json")
//    @POST("todo")
//    fun getTodoList(@Body request: TodoRequest): Call<TodoResponse>
//
//    @Headers("Accept: " + "application/json")
//    @POST("confirm-sugesstion")
//    fun addToContact(@Body request: AddToContactRequest): Call<AddToContactResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("confirm-doctor")
//    fun addToContactWithPriority(@Body request: AddToPriorityContactRequest): Call<AddToContactResponse>
//
//
//
//
//    @Headers("Accept: " + "application/json")
//    @PUT("contact")
//    fun updateToContact(@Body request: ContactRequest): Call<ContactResponse>
//
//    @Headers("Accept: " + "application/json")
//    @PUT("profile")
//    fun updateProfile(@Body request: RegisterationRequest): Call<UpdateProfileSignUpResponse>
//
//    @Headers("Accept: " + "application/json")
//    @HTTP(method = "DELETE", path = "appointment", hasBody = true)
//    fun deleteAppointment( @Body request: DeleteAppointmentRequest ): Call<DeleteAppointmentResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @HTTP(method = "DELETE", path = "todo/{id}")
//    fun deleteTodo(@Path("id")  id: String): Call<DeleteAppointmentResponse>
//
//
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("push-notification")
//    fun pushNotification(@Body request: PushNotificationRequest): Call<PushNotificationResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @DELETE("delete-account")
//    fun deleteAccount(): Call<DeleteAccountResponse>
//
//
//
//    @Headers("Accept: " + "application/json")
//    @GET("sample-requests")
//    fun getSampleList(@Query("page") page: Int? ): Call<SampleRequestResponse>
//
//
//
//    @Headers("Accept: " + "application/json")
//    @PUT("sample-request")
//    fun acceptRejectSampleCall(@Body request: SampleAcceptRejectRequest): Call<SampleAcceptRejectResponse>
//
//
//
//    @Headers("Accept: " + "application/json")
//    @POST("appointment-sugesstions")
//    fun suggestionList(@Body request: SuggestionRequest): Call<ViewScheduleResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @PUT("token")
//    fun updateFirebaseDeviceToken(@Body request: UpdateTokenRequest): Call<UpdateTokenResponse>
//
//    @Headers("Accept: " + "application/json")
//    @HTTP(method = "DELETE", path = "sample-request", hasBody = true)
//    fun deleteSample( @Body request: DeleteSampleRequest ): Call<DeleteSampleResponse>
//
//
//    @Headers("Accept: " + "application/json")
//    @HTTP(method = "DELETE", path = "notification", hasBody = true)
//    fun deleteNotification( @Body request: NotificationRequest): Call<NotificationOperationResponse>
//
//    @Headers("Accept: " + "application/json")
//    @PUT("notification")
//    fun updateNotificationStatus(@Body request: NotificationRequest): Call<NotificationOperationResponse>
//
//    @Headers("Accept: " + "application/json")
//    @GET("notification-count")
//    fun getNotificationCount(): Call<NotificationCountResponse>

    @Headers("Accept: " + "application/json")
    @Multipart
    @POST("Network_api/")
    fun register(request: RequestBody, email: RequestBody, password: RequestBody, register: RequestBody): Call<RegisterResponse>

    @Headers("Accept: " + "application/json")
    @FormUrlEncoded
    @POST("Network_api/")
    fun login(@FieldMap request: HashMap<String, String>): Call<LoginResponse>


}