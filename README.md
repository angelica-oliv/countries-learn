# [WIP] countries-learn

Sample **Kotlin Multiplatform** application. 
The application shows just shows the return of [Rest Countries API](https://github.com/apilayer/restcountries) in a list.


# Architecture

This project uses an architecture defined by layers, where two layers has Kotlin code, shared between **iOS** and **Android** applications.
The shared modules are:

 - **shareddata**: where the representation models used by **Android** and **iOS** are. And also, in this module there is the Repository implementation, where applications can call for data, and this class can choose by which source of data should be used. The repository uses [kotlinx.coroutines](https://github.com/Kotlin/kotlinx.coroutines) to make async calls.
 - **sharednetwork**: where API calls are made, this module uses [ktor http-client](https://ktor.io/clients/http-client/multiplatform.html) to access API service calls.
 
## Useful links
[Kotlin and the rise of Multiplatform](https://medium.com/pink-room-club/kotlin-and-the-rise-of-multiplatform-6a3e985a2e6f)

[Codelab kotlinlang](https://kotlinlang.org/docs/tutorials/native/mpp-ios-android.html)

[Ktor http-client for apps Multiplatform](https://proandroiddev.com/kotlin-multiplatform-very-beginners-guide-part-2-api-d54f7326dc57)
