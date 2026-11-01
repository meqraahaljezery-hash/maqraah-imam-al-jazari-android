package com.maqraah.imamaljazari.viewmodel

import androidx.lifecycle.ViewModel
import com.maqraah.imamaljazari.data.AdminPermission
import com.maqraah.imamaljazari.data.AuditLog
import com.maqraah.imamaljazari.data.ChatMessage
import com.maqraah.imamaljazari.data.GroupChat
import com.maqraah.imamaljazari.data.NotificationItem
import com.maqraah.imamaljazari.data.PaymentRequest
import com.maqraah.imamaljazari.data.Program
import com.maqraah.imamaljazari.data.RegistrationRequest
import com.maqraah.imamaljazari.data.SupportContact
import com.maqraah.imamaljazari.data.UserProfile
import com.maqraah.imamaljazari.data.UserRole
import com.maqraah.imamaljazari.data.WalletTransaction
import com.maqraah.imamaljazari.repository.AppRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AppViewModel : ViewModel() {
    private val repository = AppRepository()

    private val _programs = MutableStateFlow(repository.getPrograms())
    val programs: StateFlow<List<Program>> = _programs.asStateFlow()

    private val _profile = MutableStateFlow(repository.getProfile())
    val profile: StateFlow<UserProfile> = _profile.asStateFlow()

    private val _walletBalance = MutableStateFlow(_profile.value.currentBalanceMinutes)
    val walletBalance: StateFlow<Int> = _walletBalance.asStateFlow()

    private val _transactions = MutableStateFlow(repository.getWalletTransactions())
    val transactions: StateFlow<List<WalletTransaction>> = _transactions.asStateFlow()

    private val _groups = MutableStateFlow(repository.getGroups())
    val groups: StateFlow<List<GroupChat>> = _groups.asStateFlow()

    private val _messages = MutableStateFlow(repository.getMessages("group_001"))
    val messages: StateFlow<List<ChatMessage>> = _messages.asStateFlow()

    private val _notifications = MutableStateFlow(repository.getNotifications())
    val notifications: StateFlow<List<NotificationItem>> = _notifications.asStateFlow()

    private val _auditLogs = MutableStateFlow(repository.getAuditLogs())
    val auditLogs: StateFlow<List<AuditLog>> = _auditLogs.asStateFlow()

    private val _supportContact = MutableStateFlow(repository.getSupportContact())
    val supportContact: StateFlow<SupportContact> = _supportContact.asStateFlow()

    private val _roles = MutableStateFlow(repository.getRoles())
    val roles: StateFlow<List<UserRole>> = _roles.asStateFlow()

    private val _permissions = MutableStateFlow(repository.getPermissions())
    val permissions: StateFlow<List<AdminPermission>> = _permissions.asStateFlow()

    fun submitRegistration(request: RegistrationRequest): Result<String> = repository.submitRegistration(request)

    fun submitPayment(request: PaymentRequest): Result<String> = repository.submitPaymentRequest(request)

    fun addWalletMinutes(minutes: Int) {
        val delta = _walletBalance.value + minutes
        _walletBalance.value = delta
        _profile.value = _profile.value.copy(currentBalanceMinutes = delta)
    }

    fun setCurrentGroup(groupId: String) {
        _messages.value = repository.getMessages(groupId)
    }
}
