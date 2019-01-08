package io.github.droidkaigi.confsched2019.session.ui.bindingadapter

import android.text.util.Linkify
import androidx.databinding.BindingAdapter
import androidx.emoji.widget.EmojiTextView

@BindingAdapter(value = ["app:textLinkify"])
fun EmojiTextView.setTextLinkify(
    isLinkify: Boolean
) {
    if (isLinkify) {
        Linkify.addLinks(this, Linkify.WEB_URLS)
    }
}
