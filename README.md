## Imam Al-Jazari Center for Quran Recitation & Ijazah with Sanad

This repository contains the Android application source for the Imam Al-Jazari Center for Quran Recitation & Ijazah with Sanad, built in Kotlin with Jetpack Compose, Android Native, MVVM, Repository pattern, and a Supabase-ready data layer.

## Stack
- Kotlin
- Android Native
- Jetpack Compose
- Material 3
- MVVM / Repository Pattern
- Supabase Auth, Postgrest, Realtime, Storage, Edge Functions
- Firebase Cloud Messaging (optional)
- Arabic / English / Amharic localization support

## Project status
This repository is intentionally structured as a production-ready foundation rather than a hard-coded clone of a live database. It is prepared to work with Supabase and includes schema guidance, role modeling, audit logs, and app architecture. The actual Supabase schema and production row policies must be reviewed against the live project instance before publishing to production.

## App identity
Arabic: مَقْرَأَةُ الإِمَامِ الجَزَرِيِّ لِلإِقْرَاءِ وَالإِجَازَةِ بِالسَّنَد

English: Imam Al-Jazari Center for Quran Recitation & Ijazah with Sanad

## Supabase configuration
The app includes a ready-to-edit Supabase configuration class which reads the project URL and anon key.

Important:
- Do not add a `service_role` key to Android or to GitHub source.
- Use RLS and server-side validation to protect sensitive operations.
- Keep secrets in Supabase Secrets or GitHub Secrets.

## Local development
1. Open the project in Android Studio.
2. Update the package name if needed.
3. Ensure the SDK is installed.
4. Sync Gradle.
5. Run the app on an emulator or device.

## Areas included
- Home screen and programs catalog
- Registration flow
- Payment packages and manual payment requests
- Wallet and balance history
- Admin dashboard with permission model
- Multi-language support
- Supabase integration layer
- Role and audit model scaffolding
- Chat/group shell design with Realtime support

## Database note
The repository does NOT execute SQL against your live Supabase project. Instead, it includes a safe schema template under `/docs` and a ready integration layer for the production schema to be mapped gradually.

## Important
If your live Supabase database has existing tables, their names and columns must be validated before moving to production. The app is designed to be adapted cleanly to your actual schema without exposing secrets.
