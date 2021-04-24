package helpers

import android.annotation.SuppressLint
import android.text.Html
import android.widget.TextView
import androidx.databinding.BindingAdapter

@SuppressLint("SetTextI18n")
@BindingAdapter("customQuestion")
fun TextView.setCustomQuestin(question: String) {
    text = Html.fromHtml(question);
}
