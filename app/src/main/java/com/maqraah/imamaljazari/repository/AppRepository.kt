package com.maqraah.imamaljazari.repository

import com.maqraah.imamaljazari.data.Program
import com.maqraah.imamaljazari.data.RegistrationRequest
import com.maqraah.imamaljazari.data.SampleData
import com.maqraah.imamaljazari.data.WalletTransaction

class AppRepository {
    fun getPrograms(): List<Program> = SampleData.programs

    fun getWalletTransactions(): List<WalletTransaction> = SampleData.walletTransactions

    fun submitRegistration(request: RegistrationRequest): Result<String> {
        return if (request.fullName.isBlank() || request.phone.isBlank()) {
            Result.failure(IllegalArgumentException("يجب إدخال الاسم ورقم الهاتف."))
        } else {
            Result.success("تم إرسال طلب التسجيل بنجاح، وسيتم مراجعته من الإدارة.")
        }
    }
}
