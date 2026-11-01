package com.maqraah.imamaljazari.data

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.realtime.Realtime
import io.github.jan.supabase.storage.Storage

object SupabaseClientProvider {
    val client: SupabaseClient? = try {
        createSupabaseClient(
            supabaseUrl = "https://orxrsylppnlxeyqyhnzt.supabase.co",
            supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXAiLCJyZWYiOiJvcnhyc3lscHBubHhleXF5aG56dCIsInJvbGUiOiJhbm9uIiwiaWF0IjoxNzkzNDY4MzM0LCJleHAiOjIxMDkwNDQzMzR9.bN7Q7EXfPkvWr8v7iziGrzFFwuuyq3Xk6f4daxioIVM"
        ) {
            install(Auth)
            install(Postgrest)
            install(Realtime)
            install(Storage)
        }
    } catch (e: Exception) {
        null
    }
}
