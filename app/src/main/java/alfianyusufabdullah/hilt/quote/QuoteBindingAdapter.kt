package alfianyusufabdullah.hilt.quote

import alfianyusufabdullah.hilt.R
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("textWithAuthor")
fun textWithAuthor(textView: TextView, author: String?) {
    textView.text = textView.context.getString(R.string.author, author ?: "~")
}