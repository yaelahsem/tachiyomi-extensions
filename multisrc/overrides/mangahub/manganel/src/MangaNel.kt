package eu.kanade.tachiyomi.extension.en.manganel

import eu.kanade.tachiyomi.lib.ratelimit.RateLimitInterceptor
import eu.kanade.tachiyomi.multisrc.mangahub.MangaHub
import okhttp3.OkHttpClient
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.concurrent.TimeUnit

class MangaNel : MangaHub(
    "MangaNel",
    "https://manganel.me",
    "en"
) {
    override val client: OkHttpClient = super.client.newBuilder()
        .addInterceptor(RateLimitInterceptor(1, 2, TimeUnit.SECONDS))
        .build()

    override val serverId = "mn05"
}