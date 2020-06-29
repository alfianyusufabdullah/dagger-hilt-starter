package alfianyusufabdullah.hilt.data.entity

import com.google.gson.annotations.SerializedName

data class QuoteResponse(

	@field:SerializedName("author")
	val author: String? = null,

	@field:SerializedName("en")
	val quote: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)
