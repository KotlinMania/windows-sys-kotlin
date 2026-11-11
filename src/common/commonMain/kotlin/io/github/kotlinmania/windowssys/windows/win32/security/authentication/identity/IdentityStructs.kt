@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.QuotaLimits
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityImpersonationLevel
import io.github.kotlinmania.windowssys.windows.win32.security.SidNameUse
import io.github.kotlinmania.windowssys.windows.win32.security.TokenDefaultDacl
import io.github.kotlinmania.windowssys.windows.win32.security.TokenDeviceClaims
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenOwner
import io.github.kotlinmania.windowssys.windows.win32.security.TokenPrimaryGroup
import io.github.kotlinmania.windowssys.windows.win32.security.TokenPrivileges
import io.github.kotlinmania.windowssys.windows.win32.security.TokenUser
import io.github.kotlinmania.windowssys.windows.win32.security.TokenUserClaims
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.Credentialw
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.SecHandle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.LmOwfPassword
import io.github.kotlinmania.windowssys.windows.win32.system.rpc.SecWinntAuthIdentityA
import io.github.kotlinmania.windowssys.windows.win32.system.rpc.SecWinntAuthIdentityW

public data class AuditPolicyInformation(
    public var auditSubCategoryGuid: Guid = Guid(),
    public var auditingInformation: UInt = 0u,
    public var auditCategoryGuid: Guid = Guid(),
)

public data class CentralAccessPolicy(
    public var capid: Psid = null,
    public var name: LsaUnicodeString = LsaUnicodeString(),
    public var description: LsaUnicodeString = LsaUnicodeString(),
    public var changeId: LsaUnicodeString = LsaUnicodeString(),
    public var flags: UInt = 0u,
    public var cAPECount: UInt = 0u,
    public var cAPEs: COpaquePointer? = null,
)

public data class CentralAccessPolicyEntry(
    public var name: LsaUnicodeString = LsaUnicodeString(),
    public var description: LsaUnicodeString = LsaUnicodeString(),
    public var changeId: LsaUnicodeString = LsaUnicodeString(),
    public var lengthAppliesTo: UInt = 0u,
    public var appliesTo: COpaquePointer? = null,
    public var lengthSD: UInt = 0u,
    public var sd: PsecurityDescriptor = null,
    public var lengthStagedSD: UInt = 0u,
    public var stagedSD: PsecurityDescriptor = null,
    public var flags: UInt = 0u,
)

public data class ClearBlock(
    public var data: ByteArray = ByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClearBlock) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()
}

public data class CryptoSettings(
    public var eAlgorithmUsage: ETlsAlgorithmUsage = 0,
    public var strCngAlgId: LsaUnicodeString = LsaUnicodeString(),
    public var cChainingModes: UInt = 0u,
    public var rgstrChainingModes: LsaUnicodeString? = null,
    public var dwMinBitLength: UInt = 0u,
    public var dwMaxBitLength: UInt = 0u,
)

public data class DomainPasswordInformation(
    public var minPasswordLength: UShort = 0u,
    public var passwordHistoryLength: UShort = 0u,
    public var passwordProperties: DomainPasswordProperties = 0u,
    public var maxPasswordAge: Long = 0L,
    public var minPasswordAge: Long = 0L,
)

public data class EncryptedCredentialw(
    public var cred: Credentialw = Credentialw(),
    public var clearCredentialBlobSize: UInt = 0u,
)

public data class KdcProxyCacheEntryData(
    public var sinceLastUsed: ULong = 0uL,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var proxyServerName: LsaUnicodeString = LsaUnicodeString(),
    public var proxyServerVdir: LsaUnicodeString = LsaUnicodeString(),
    public var proxyServerPort: UShort = 0u,
    public var logonId: Luid = Luid(),
    public var credUserName: LsaUnicodeString = LsaUnicodeString(),
    public var credDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var globalCache: Boolean = false,
)

public data class KerbAddBindingCacheEntryExRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var realmName: LsaUnicodeString = LsaUnicodeString(),
    public var kdcAddress: LsaUnicodeString = LsaUnicodeString(),
    public var addressType: KerbAddressType = 0u,
    public var dcFlags: UInt = 0u,
)

public data class KerbAddBindingCacheEntryRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var realmName: LsaUnicodeString = LsaUnicodeString(),
    public var kdcAddress: LsaUnicodeString = LsaUnicodeString(),
    public var addressType: KerbAddressType = 0u,
)

public data class KerbAddCredentialsRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
    public var logonId: Luid = Luid(),
    public var flags: KerbRequestFlags = 0u,
)

public data class KerbAddCredentialsRequestEx(
    public var credentials: KerbAddCredentialsRequest = KerbAddCredentialsRequest(),
    public var principalNameCount: UInt = 0u,
    public var principalNames: List<LsaUnicodeString> = List(1) { LsaUnicodeString() },
)

public data class KerbAuthData(
    public var type: UInt = 0u,
    public var length: UInt = 0u,
    public var data: COpaquePointer? = null,
)

public data class KerbBindingCacheEntryData(
    public var discoveryTime: ULong = 0uL,
    public var realmName: LsaUnicodeString = LsaUnicodeString(),
    public var kdcAddress: LsaUnicodeString = LsaUnicodeString(),
    public var addressType: KerbAddressType = 0u,
    public var flags: UInt = 0u,
    public var dcFlags: UInt = 0u,
    public var cacheFlags: UInt = 0u,
    public var kdcName: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbCertificateHashinfo(
    public var storeNameLength: UShort = 0u,
    public var hashLength: UShort = 0u,
)

public data class KerbCertificateInfo(
    public var certInfoSize: UInt = 0u,
    public var infoType: UInt = 0u,
)

public data class KerbCertificateLogon(
    public var messageType: KerbLogonSubmitType = 0,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var pin: LsaUnicodeString = LsaUnicodeString(),
    public var flags: UInt = 0u,
    public var cspDataLength: UInt = 0u,
    public var cspData: COpaquePointer? = null,
)

public data class KerbCertificateS4uLogon(
    public var messageType: KerbLogonSubmitType = 0,
    public var flags: UInt = 0u,
    public var userPrincipalName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var certificateLength: UInt = 0u,
    public var certificate: COpaquePointer? = null,
)

public data class KerbCertificateUnlockLogon(
    public var logon: KerbCertificateLogon = KerbCertificateLogon(),
    public var logonId: Luid = Luid(),
)

public data class KerbChangepasswordRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var accountName: LsaUnicodeString = LsaUnicodeString(),
    public var oldPassword: LsaUnicodeString = LsaUnicodeString(),
    public var newPassword: LsaUnicodeString = LsaUnicodeString(),
    public var impersonating: Boolean = false,
)

public data class KerbCleanupMachinePkinitCredsRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
)

public data class KerbCloudKerberosDebugData(
    public var bitfield: UInt = 0u,
)

public data class KerbCloudKerberosDebugDataV0(
    public var bitfield: UInt = 0u,
)

public data class KerbCloudKerberosDebugRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
)

public data class KerbCloudKerberosDebugResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbCloudKerberosDebugResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class KerbCryptoKey(
    public var keyType: KerbCryptoKeyType = 0,
    public var length: UInt = 0u,
    public var value: COpaquePointer? = null,
)

public data class KerbCryptoKey32(
    public var keyType: Int = 0,
    public var length: UInt = 0u,
    public var offset: UInt = 0u,
)

public data class KerbDecryptRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var flags: UInt = 0u,
    public var cryptoType: Int = 0,
    public var keyUsage: Int = 0,
    public var key: KerbCryptoKey = KerbCryptoKey(),
    public var encryptedDataSize: UInt = 0u,
    public var initialVectorSize: UInt = 0u,
    public var initialVector: COpaquePointer? = null,
    public var encryptedData: COpaquePointer? = null,
)

public data class KerbDecryptResponse(
    public var decryptedData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbDecryptResponse) return false
        if (!this.decryptedData.contentEquals(other.decryptedData)) return false
        return true
    }

    override fun hashCode(): Int = this.decryptedData.contentHashCode()
}

public data class KerbExternalName(
    public var nameType: Short = 0,
    public var nameCount: UShort = 0u,
    public var names: List<LsaUnicodeString> = List(1) { LsaUnicodeString() },
)

public data class KerbExternalTicket(
    public var serviceName: KerbExternalName? = null,
    public var targetName: KerbExternalName? = null,
    public var clientName: KerbExternalName? = null,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var targetDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var altTargetDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var sessionKey: KerbCryptoKey = KerbCryptoKey(),
    public var ticketFlags: KerbTicketFlags = 0u,
    public var flags: UInt = 0u,
    public var keyExpirationTime: Long = 0L,
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var renewUntil: Long = 0L,
    public var timeSkew: Long = 0L,
    public var encodedTicketSize: UInt = 0u,
    public var encodedTicket: COpaquePointer? = null,
)

public data class KerbInteractiveLogon(
    public var messageType: KerbLogonSubmitType = 0,
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbInteractiveProfile(
    public var messageType: KerbProfileBufferType = 0,
    public var logonCount: UShort = 0u,
    public var badPasswordCount: UShort = 0u,
    public var logonTime: Long = 0L,
    public var logoffTime: Long = 0L,
    public var kickOffTime: Long = 0L,
    public var passwordLastSet: Long = 0L,
    public var passwordCanChange: Long = 0L,
    public var passwordMustChange: Long = 0L,
    public var logonScript: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectory: LsaUnicodeString = LsaUnicodeString(),
    public var fullName: LsaUnicodeString = LsaUnicodeString(),
    public var profilePath: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectoryDrive: LsaUnicodeString = LsaUnicodeString(),
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var userFlags: UInt = 0u,
)

public data class KerbInteractiveUnlockLogon(
    public var logon: KerbInteractiveLogon = KerbInteractiveLogon(),
    public var logonId: Luid = Luid(),
)

public data class KerbNetAddress(
    public var family: UInt = 0u,
    public var length: UInt = 0u,
    public var address: Pstr = null,
)

public data class KerbNetAddresses(
    public var number: UInt = 0u,
    public var addresses: List<KerbNetAddress> = List(1) { KerbNetAddress() },
)

public data class KerbPurgeBindingCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
)

public data class KerbPurgeKdcProxyCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var logonId: Luid = Luid(),
)

public data class KerbPurgeKdcProxyCacheResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfPurged: UInt = 0u,
)

public data class KerbPurgeTktCacheExRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var flags: UInt = 0u,
    public var ticketTemplate: KerbTicketCacheInfoEx = KerbTicketCacheInfoEx(),
)

public data class KerbPurgeTktCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var realmName: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbQueryBindingCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
)

public data class KerbQueryBindingCacheResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfEntries: UInt = 0u,
    public var entries: KerbBindingCacheEntryData? = null,
)

public data class KerbQueryDomainExtendedPoliciesRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbQueryDomainExtendedPoliciesResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var extendedPolicies: UInt = 0u,
    public var dsFlags: UInt = 0u,
)

public data class KerbQueryKdcProxyCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var logonId: Luid = Luid(),
)

public data class KerbQueryKdcProxyCacheResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfEntries: UInt = 0u,
    public var entries: KdcProxyCacheEntryData? = null,
)

public data class KerbQueryS4u2proxyCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var logonId: Luid = Luid(),
)

public data class KerbQueryS4u2proxyCacheResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfCreds: UInt = 0u,
    public var creds: KerbS4u2proxyCred? = null,
)

public data class KerbQueryTktCacheEx2Response(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfTickets: UInt = 0u,
    public var tickets: List<KerbTicketCacheInfoEx2> = List(1) { KerbTicketCacheInfoEx2() },
)

public data class KerbQueryTktCacheEx3Response(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfTickets: UInt = 0u,
    public var tickets: List<KerbTicketCacheInfoEx3> = List(1) { KerbTicketCacheInfoEx3() },
)

public data class KerbQueryTktCacheExResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfTickets: UInt = 0u,
    public var tickets: List<KerbTicketCacheInfoEx> = List(1) { KerbTicketCacheInfoEx() },
)

public data class KerbQueryTktCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
)

public data class KerbQueryTktCacheResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfTickets: UInt = 0u,
    public var tickets: List<KerbTicketCacheInfo> = List(1) { KerbTicketCacheInfo() },
)

public data class KerbRefreshPolicyRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
)

public data class KerbRefreshPolicyResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
)

public data class KerbRefreshSccredRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var credentialBlob: LsaUnicodeString = LsaUnicodeString(),
    public var logonId: Luid = Luid(),
    public var flags: UInt = 0u,
)

public data class KerbRetrieveKeyTabRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbRetrieveKeyTabResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var keyTabLength: UInt = 0u,
    public var keyTab: COpaquePointer? = null,
)

public data class KerbRetrieveTktRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var targetName: LsaUnicodeString = LsaUnicodeString(),
    public var ticketFlags: UInt = 0u,
    public var cacheOptions: UInt = 0u,
    public var encryptionType: KerbCryptoKeyType = 0,
    public var credentialsHandle: SecHandle = SecHandle(),
)

public data class KerbRetrieveTktResponse(
    public var ticket: KerbExternalTicket = KerbExternalTicket(),
)

public data class KerbS4u2proxyCacheEntryInfo(
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var flags: UInt = 0u,
    public var lastStatus: Ntstatus = 0,
    public var expiry: Long = 0L,
)

public data class KerbS4u2proxyCred(
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var flags: UInt = 0u,
    public var lastStatus: Ntstatus = 0,
    public var expiry: Long = 0L,
    public var countOfEntries: UInt = 0u,
    public var entries: KerbS4u2proxyCacheEntryInfo? = null,
)

public data class KerbS4uLogon(
    public var messageType: KerbLogonSubmitType = 0,
    public var flags: UInt = 0u,
    public var clientUpn: LsaUnicodeString = LsaUnicodeString(),
    public var clientRealm: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbSetpasswordExRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var credentialsHandle: SecHandle = SecHandle(),
    public var flags: UInt = 0u,
    public var accountRealm: LsaUnicodeString = LsaUnicodeString(),
    public var accountName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
    public var clientRealm: LsaUnicodeString = LsaUnicodeString(),
    public var clientName: LsaUnicodeString = LsaUnicodeString(),
    public var impersonating: Boolean = false,
    public var kdcAddress: LsaUnicodeString = LsaUnicodeString(),
    public var kdcAddressType: UInt = 0u,
)

public data class KerbSetpasswordRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var credentialsHandle: SecHandle = SecHandle(),
    public var flags: UInt = 0u,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var accountName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbSmartCardLogon(
    public var messageType: KerbLogonSubmitType = 0,
    public var pin: LsaUnicodeString = LsaUnicodeString(),
    public var cspDataLength: UInt = 0u,
    public var cspData: COpaquePointer? = null,
)

public data class KerbSmartCardProfile(
    public var profile: KerbInteractiveProfile = KerbInteractiveProfile(),
    public var certificateSize: UInt = 0u,
    public var certificateData: COpaquePointer? = null,
)

public data class KerbSmartCardUnlockLogon(
    public var logon: KerbSmartCardLogon = KerbSmartCardLogon(),
    public var logonId: Luid = Luid(),
)

public data class KerbSubmitTktRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var flags: UInt = 0u,
    public var key: KerbCryptoKey32 = KerbCryptoKey32(),
    public var kerbCredSize: UInt = 0u,
    public var kerbCredOffset: UInt = 0u,
)

public data class KerbTicketCacheInfo(
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var realmName: LsaUnicodeString = LsaUnicodeString(),
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var renewTime: Long = 0L,
    public var encryptionType: Int = 0,
    public var ticketFlags: KerbTicketFlags = 0u,
)

public data class KerbTicketCacheInfoEx(
    public var clientName: LsaUnicodeString = LsaUnicodeString(),
    public var clientRealm: LsaUnicodeString = LsaUnicodeString(),
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var serverRealm: LsaUnicodeString = LsaUnicodeString(),
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var renewTime: Long = 0L,
    public var encryptionType: Int = 0,
    public var ticketFlags: UInt = 0u,
)

public data class KerbTicketCacheInfoEx2(
    public var clientName: LsaUnicodeString = LsaUnicodeString(),
    public var clientRealm: LsaUnicodeString = LsaUnicodeString(),
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var serverRealm: LsaUnicodeString = LsaUnicodeString(),
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var renewTime: Long = 0L,
    public var encryptionType: Int = 0,
    public var ticketFlags: UInt = 0u,
    public var sessionKeyType: UInt = 0u,
    public var branchId: UInt = 0u,
)

public data class KerbTicketCacheInfoEx3(
    public var clientName: LsaUnicodeString = LsaUnicodeString(),
    public var clientRealm: LsaUnicodeString = LsaUnicodeString(),
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var serverRealm: LsaUnicodeString = LsaUnicodeString(),
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var renewTime: Long = 0L,
    public var encryptionType: Int = 0,
    public var ticketFlags: UInt = 0u,
    public var sessionKeyType: UInt = 0u,
    public var branchId: UInt = 0u,
    public var cacheFlags: UInt = 0u,
    public var kdcCalled: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbTicketLogon(
    public var messageType: KerbLogonSubmitType = 0,
    public var flags: UInt = 0u,
    public var serviceTicketLength: UInt = 0u,
    public var ticketGrantingTicketLength: UInt = 0u,
    public var serviceTicket: COpaquePointer? = null,
    public var ticketGrantingTicket: COpaquePointer? = null,
)

public data class KerbTicketProfile(
    public var profile: KerbInteractiveProfile = KerbInteractiveProfile(),
    public var sessionKey: KerbCryptoKey = KerbCryptoKey(),
)

public data class KerbTicketUnlockLogon(
    public var logon: KerbTicketLogon = KerbTicketLogon(),
    public var logonId: Luid = Luid(),
)

public data class KerbTransferCredRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var originLogonId: Luid = Luid(),
    public var destinationLogonId: Luid = Luid(),
    public var flags: UInt = 0u,
)

public data class KsecListEntry(
    public var list: ListEntry = ListEntry(),
    public var refCount: Int = 0,
    public var signature: UInt = 0u,
    public var owningList: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class LogonHours(
    public var unitsPerWeek: UShort = 0u,
    public var logonHours: COpaquePointer? = null,
)

public data class LsaAuthInformation(
    public var lastUpdateTime: Long = 0L,
    public var authType: LsaAuthInformationAuthType = 0u,
    public var authInfoLength: UInt = 0u,
    public var authInfo: COpaquePointer? = null,
)

public data class LsaDispatchTable(
    public var createLogonSession: PlsaCreateLogonSession = null,
    public var deleteLogonSession: PlsaDeleteLogonSession = null,
    public var addCredential: PlsaAddCredential = null,
    public var getCredentials: PlsaGetCredentials = null,
    public var deleteCredential: PlsaDeleteCredential = null,
    public var allocateLsaHeap: PlsaAllocateLsaHeap = null,
    public var freeLsaHeap: PlsaFreeLsaHeap = null,
    public var allocateClientBuffer: PlsaAllocateClientBuffer = null,
    public var freeClientBuffer: PlsaFreeClientBuffer = null,
    public var copyToClientBuffer: PlsaCopyToClientBuffer = null,
    public var copyFromClientBuffer: PlsaCopyFromClientBuffer = null,
)

public data class LsaEnumerationInformation(
    public var sid: Psid = null,
)

public data class LsaForestTrustBinaryData(
    public var length: UInt = 0u,
    public var buffer: COpaquePointer? = null,
)

public data class LsaForestTrustCollisionInformation(
    public var recordCount: UInt = 0u,
    public var entries: COpaquePointer? = null,
)

public data class LsaForestTrustCollisionRecord(
    public var index: UInt = 0u,
    public var type: LsaForestTrustCollisionRecordType = 0,
    public var flags: UInt = 0u,
    public var name: LsaUnicodeString = LsaUnicodeString(),
)

public data class LsaForestTrustDomainInfo(
    public var sid: Psid = null,
    public var dnsName: LsaUnicodeString = LsaUnicodeString(),
    public var netbiosName: LsaUnicodeString = LsaUnicodeString(),
)

public data class LsaForestTrustInformation(
    public var recordCount: UInt = 0u,
    public var entries: COpaquePointer? = null,
)

public data class LsaForestTrustInformation2(
    public var recordCount: UInt = 0u,
    public var entries: COpaquePointer? = null,
)

public data class LsaForestTrustRecord(
    public var flags: UInt = 0u,
    public var forestTrustType: LsaForestTrustRecordType = 0,
    public var time: Long = 0L,
    public var forestTrustData: LsaForestTrustRecord0 = LsaForestTrustRecord0(),
)

public data class LsaForestTrustRecord0(
    public var topLevelName: LsaUnicodeString = LsaUnicodeString(),
    public var domainInfo: LsaForestTrustDomainInfo = LsaForestTrustDomainInfo(),
    public var data: LsaForestTrustBinaryData = LsaForestTrustBinaryData(),
)

public data class LsaForestTrustRecord2(
    public var flags: UInt = 0u,
    public var forestTrustType: LsaForestTrustRecordType = 0,
    public var time: Long = 0L,
    public var forestTrustData: LsaForestTrustRecord20 = LsaForestTrustRecord20(),
)

public data class LsaForestTrustRecord20(
    public var topLevelName: LsaUnicodeString = LsaUnicodeString(),
    public var domainInfo: LsaForestTrustDomainInfo = LsaForestTrustDomainInfo(),
    public var binaryData: LsaForestTrustBinaryData = LsaForestTrustBinaryData(),
    public var scannerInfo: LsaForestTrustScannerInfo = LsaForestTrustScannerInfo(),
)

public data class LsaForestTrustScannerInfo(
    public var domainSid: Psid = null,
    public var dnsName: LsaUnicodeString = LsaUnicodeString(),
    public var netbiosName: LsaUnicodeString = LsaUnicodeString(),
)

public data class LsaLastInterLogonInfo(
    public var lastSuccessfulLogon: Long = 0L,
    public var lastFailedLogon: Long = 0L,
    public var failedAttemptCountSinceLastSuccessfulLogon: UInt = 0u,
)

public data class LsaObjectAttributes(
    public var length: UInt = 0u,
    public var rootDirectory: Handle = null,
    public var objectName: LsaUnicodeString? = null,
    public var attributes: UInt = 0u,
    public var securityDescriptor: COpaquePointer? = null,
    public var securityQualityOfService: COpaquePointer? = null,
)

public data class LsaReferencedDomainList(
    public var entries: UInt = 0u,
    public var domains: LsaTrustInformation? = null,
)

public class LsaSecpkgFunctionTable(
    public var createLogonSession: PlsaCreateLogonSession = null,
    public var deleteLogonSession: PlsaDeleteLogonSession = null,
    public var addCredential: PlsaAddCredential = null,
    public var getCredentials: PlsaGetCredentials = null,
    public var deleteCredential: PlsaDeleteCredential = null,
    public var allocateLsaHeap: PlsaAllocateLsaHeap = null,
    public var freeLsaHeap: PlsaFreeLsaHeap = null,
    public var allocateClientBuffer: PlsaAllocateClientBuffer = null,
    public var freeClientBuffer: PlsaFreeClientBuffer = null,
    public var copyToClientBuffer: PlsaCopyToClientBuffer = null,
    public var copyFromClientBuffer: PlsaCopyFromClientBuffer = null,
    public var impersonateClient: PlsaImpersonateClient = null,
    public var unloadPackage: PlsaUnloadPackage = null,
    public var duplicateHandle: PlsaDuplicateHandle = null,
    public var saveSupplementalCredentials: PlsaSaveSupplementalCredentials = null,
    public var createThread: PlsaCreateThread = null,
    public var getClientInfo: PlsaGetClientInfo = null,
    public var registerNotification: PlsaRegisterNotification = null,
    public var cancelNotification: PlsaCancelNotification = null,
    public var mapBuffer: PlsaMapBuffer = null,
    public var createToken: PlsaCreateToken = null,
    public var auditLogon: PlsaAuditLogon = null,
    public var callPackage: PlsaCallPackage = null,
    public var freeReturnBuffer: PlsaFreeLsaHeap = null,
    public var getCallInfo: PlsaGetCallInfo = null,
    public var callPackageEx: PlsaCallPackageex = null,
    public var createSharedMemory: PlsaCreateSharedMemory = null,
    public var allocateSharedMemory: PlsaAllocateSharedMemory = null,
    public var freeSharedMemory: PlsaFreeSharedMemory = null,
    public var deleteSharedMemory: PlsaDeleteSharedMemory = null,
    public var openSamUser: PlsaOpenSamUser = null,
    public var getUserCredentials: PlsaGetUserCredentials = null,
    public var getUserAuthData: PlsaGetUserAuthData = null,
    public var closeSamUser: PlsaCloseSamUser = null,
    public var convertAuthDataToToken: PlsaConvertAuthDataToToken = null,
    public var clientCallback: PlsaClientCallback = null,
    public var updateCredentials: PlsaUpdatePrimaryCredentials = null,
    public var getAuthDataForUser: PlsaGetAuthDataForUser = null,
    public var crackSingleName: PlsaCrackSingleName = null,
    public var auditAccountLogon: PlsaAuditAccountLogon = null,
    public var callPackagePassthrough: PlsaCallPackagePassthrough = null,
    public var crediRead: CredReadFn = null,
    public var crediReadDomainCredentials: CredReadDomainCredentialsFn = null,
    public var crediFreeCredentials: CredFreeCredentialsFn = null,
    public var lsaProtectMemory: PlsaProtectMemory = null,
    public var lsaUnprotectMemory: PlsaProtectMemory = null,
    public var openTokenByLogonId: PlsaOpenTokenByLogonId = null,
    public var expandAuthDataForDomain: PlsaExpandAuthDataForDomain = null,
    public var allocatePrivateHeap: PlsaAllocatePrivateHeap = null,
    public var freePrivateHeap: PlsaFreePrivateHeap = null,
    public var createTokenEx: PlsaCreateTokenEx = null,
    public var crediWrite: CredWriteFn = null,
    public var crediUnmarshalandDecodeString: CrediUnmarshalandDecodeStringFn = null,
    public var dummyFunction6: PlsaProtectMemory = null,
    public var getExtendedCallFlags: PlsaGetExtendedCallFlags = null,
    public var duplicateTokenHandle: PlsaDuplicateHandle = null,
    public var getServiceAccountPassword: PlsaGetServiceAccountPassword = null,
    public var dummyFunction7: PlsaProtectMemory = null,
    public var auditLogonEx: PlsaAuditLogonEx = null,
    public var checkProtectedUserByToken: PlsaCheckProtectedUserByToken = null,
    public var queryClientRequest: PlsaQueryClientRequest = null,
    public var getAppModeInfo: PlsaGetAppModeInfo = null,
    public var setAppModeInfo: PlsaSetAppModeInfo = null,
    public var getClientInfoEx: PlsaGetClientInfoEx = null,
)

public data class LsaString(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: Pstr = null,
)

public data class LsaTokenInformationNull(
    public var expirationTime: Long = 0L,
    public var groups: TokenGroups? = null,
)

public data class LsaTokenInformationV1(
    public var expirationTime: Long = 0L,
    public var user: TokenUser = TokenUser(),
    public var groups: TokenGroups? = null,
    public var primaryGroup: TokenPrimaryGroup = TokenPrimaryGroup(),
    public var privileges: TokenPrivileges? = null,
    public var owner: TokenOwner = TokenOwner(),
    public var defaultDacl: TokenDefaultDacl = TokenDefaultDacl(),
)

public data class LsaTokenInformationV3(
    public var expirationTime: Long = 0L,
    public var user: TokenUser = TokenUser(),
    public var groups: TokenGroups? = null,
    public var primaryGroup: TokenPrimaryGroup = TokenPrimaryGroup(),
    public var privileges: TokenPrivileges? = null,
    public var owner: TokenOwner = TokenOwner(),
    public var defaultDacl: TokenDefaultDacl = TokenDefaultDacl(),
    public var userClaims: TokenUserClaims = TokenUserClaims(),
    public var deviceClaims: TokenDeviceClaims = TokenDeviceClaims(),
    public var deviceGroups: TokenGroups? = null,
)

public data class LsaTranslatedName(
    public var use: SidNameUse = 0,
    public var name: LsaUnicodeString = LsaUnicodeString(),
    public var domainIndex: Int = 0,
)

public data class LsaTranslatedSid(
    public var use: SidNameUse = 0,
    public var relativeId: UInt = 0u,
    public var domainIndex: Int = 0,
)

public data class LsaTranslatedSid2(
    public var use: SidNameUse = 0,
    public var sid: Psid = null,
    public var domainIndex: Int = 0,
    public var flags: UInt = 0u,
)

public data class LsaTrustInformation(
    public var name: LsaUnicodeString = LsaUnicodeString(),
    public var sid: Psid = null,
)

public data class LsaUnicodeString(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: Pwstr = null,
)

public data class Msv10AvPair(
    public var avId: UShort = 0u,
    public var avLen: UShort = 0u,
)

public data class Msv10ChangepasswordRequest(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var accountName: LsaUnicodeString = LsaUnicodeString(),
    public var oldPassword: LsaUnicodeString = LsaUnicodeString(),
    public var newPassword: LsaUnicodeString = LsaUnicodeString(),
    public var impersonating: Boolean = false,
)

public data class Msv10ChangepasswordResponse(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var passwordInfoValid: Boolean = false,
    public var domainPasswordInfo: DomainPasswordInformation = DomainPasswordInformation(),
)

public data class Msv10CredentialKey(
    public var data: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10CredentialKey) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()
}

public data class Msv10InteractiveLogon(
    public var messageType: Msv10LogonSubmitType = 0,
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
)

public data class Msv10InteractiveProfile(
    public var messageType: Msv10ProfileBufferType = 0,
    public var logonCount: UShort = 0u,
    public var badPasswordCount: UShort = 0u,
    public var logonTime: Long = 0L,
    public var logoffTime: Long = 0L,
    public var kickOffTime: Long = 0L,
    public var passwordLastSet: Long = 0L,
    public var passwordCanChange: Long = 0L,
    public var passwordMustChange: Long = 0L,
    public var logonScript: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectory: LsaUnicodeString = LsaUnicodeString(),
    public var fullName: LsaUnicodeString = LsaUnicodeString(),
    public var profilePath: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectoryDrive: LsaUnicodeString = LsaUnicodeString(),
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var userFlags: UInt = 0u,
)

public data class Msv10IumSupplementalCredential(
    public var version: UInt = 0u,
    public var encryptedCredsSize: UInt = 0u,
    public var encryptedCreds: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10IumSupplementalCredential) return false
        if (this.version != other.version) return false
        if (this.encryptedCredsSize != other.encryptedCredsSize) return false
        if (!this.encryptedCreds.contentEquals(other.encryptedCreds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.encryptedCredsSize.hashCode()
        result = 31 * result + this.encryptedCreds.contentHashCode()
        return result
    }
}

public data class Msv10Lm20Logon(
    public var messageType: Msv10LogonSubmitType = 0,
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var workstation: LsaUnicodeString = LsaUnicodeString(),
    public var challengeToClient: UByteArray = UByteArray(8),
    public var caseSensitiveChallengeResponse: LsaString = LsaString(),
    public var caseInsensitiveChallengeResponse: LsaString = LsaString(),
    public var parameterControl: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10Lm20Logon) return false
        if (this.messageType != other.messageType) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (this.userName != other.userName) return false
        if (this.workstation != other.workstation) return false
        if (!this.challengeToClient.contentEquals(other.challengeToClient)) return false
        if (this.caseSensitiveChallengeResponse != other.caseSensitiveChallengeResponse) return false
        if (this.caseInsensitiveChallengeResponse != other.caseInsensitiveChallengeResponse) return false
        if (this.parameterControl != other.parameterControl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.workstation.hashCode()
        result = 31 * result + this.challengeToClient.contentHashCode()
        result = 31 * result + this.caseSensitiveChallengeResponse.hashCode()
        result = 31 * result + this.caseInsensitiveChallengeResponse.hashCode()
        result = 31 * result + this.parameterControl.hashCode()
        return result
    }
}

public data class Msv10Lm20LogonProfile(
    public var messageType: Msv10ProfileBufferType = 0,
    public var kickOffTime: Long = 0L,
    public var logoffTime: Long = 0L,
    public var userFlags: MsvSubAuthenticationFilter = 0u,
    public var userSessionKey: UByteArray = UByteArray(16),
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var lanmanSessionKey: UByteArray = UByteArray(8),
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var userParameters: LsaUnicodeString = LsaUnicodeString(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10Lm20LogonProfile) return false
        if (this.messageType != other.messageType) return false
        if (this.kickOffTime != other.kickOffTime) return false
        if (this.logoffTime != other.logoffTime) return false
        if (this.userFlags != other.userFlags) return false
        if (!this.userSessionKey.contentEquals(other.userSessionKey)) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (!this.lanmanSessionKey.contentEquals(other.lanmanSessionKey)) return false
        if (this.logonServer != other.logonServer) return false
        if (this.userParameters != other.userParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.kickOffTime.hashCode()
        result = 31 * result + this.logoffTime.hashCode()
        result = 31 * result + this.userFlags.hashCode()
        result = 31 * result + this.userSessionKey.contentHashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.lanmanSessionKey.contentHashCode()
        result = 31 * result + this.logonServer.hashCode()
        result = 31 * result + this.userParameters.hashCode()
        return result
    }
}

public data class Msv10Ntlm3Response(
    public var response: UByteArray = UByteArray(16),
    public var respType: UByte = 0u,
    public var hiRespType: UByte = 0u,
    public var flags: UShort = 0u,
    public var msgWord: UInt = 0u,
    public var timeStamp: ULong = 0uL,
    public var challengeFromClient: UByteArray = UByteArray(8),
    public var avPairsOff: UInt = 0u,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10Ntlm3Response) return false
        if (!this.response.contentEquals(other.response)) return false
        if (this.respType != other.respType) return false
        if (this.hiRespType != other.hiRespType) return false
        if (this.flags != other.flags) return false
        if (this.msgWord != other.msgWord) return false
        if (this.timeStamp != other.timeStamp) return false
        if (!this.challengeFromClient.contentEquals(other.challengeFromClient)) return false
        if (this.avPairsOff != other.avPairsOff) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.response.contentHashCode()
        result = 31 * result + this.respType.hashCode()
        result = 31 * result + this.hiRespType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.msgWord.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.challengeFromClient.contentHashCode()
        result = 31 * result + this.avPairsOff.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class Msv10PassthroughRequest(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var packageName: LsaUnicodeString = LsaUnicodeString(),
    public var dataLength: UInt = 0u,
    public var logonData: COpaquePointer? = null,
    public var pad: UInt = 0u,
)

public data class Msv10PassthroughResponse(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var pad: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var validationData: COpaquePointer? = null,
)

public data class Msv10RemoteSupplementalCredential(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var credentialKey: Msv10CredentialKey = Msv10CredentialKey(),
    public var credentialKeyType: Msv10CredentialKeyType = 0,
    public var encryptedCredsSize: UInt = 0u,
    public var encryptedCreds: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10RemoteSupplementalCredential) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.credentialKey != other.credentialKey) return false
        if (this.credentialKeyType != other.credentialKeyType) return false
        if (this.encryptedCredsSize != other.encryptedCredsSize) return false
        if (!this.encryptedCreds.contentEquals(other.encryptedCreds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.credentialKey.hashCode()
        result = 31 * result + this.credentialKeyType.hashCode()
        result = 31 * result + this.encryptedCredsSize.hashCode()
        result = 31 * result + this.encryptedCreds.contentHashCode()
        return result
    }
}

public data class Msv10S4uLogon(
    public var messageType: Msv10LogonSubmitType = 0,
    public var flags: UInt = 0u,
    public var userPrincipalName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
)

public data class Msv10SubauthLogon(
    public var messageType: Msv10LogonSubmitType = 0,
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var workstation: LsaUnicodeString = LsaUnicodeString(),
    public var challengeToClient: UByteArray = UByteArray(8),
    public var authenticationInfo1: LsaString = LsaString(),
    public var authenticationInfo2: LsaString = LsaString(),
    public var parameterControl: MsvSubauthLogonParameterControl = 0u,
    public var subAuthPackageId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10SubauthLogon) return false
        if (this.messageType != other.messageType) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (this.userName != other.userName) return false
        if (this.workstation != other.workstation) return false
        if (!this.challengeToClient.contentEquals(other.challengeToClient)) return false
        if (this.authenticationInfo1 != other.authenticationInfo1) return false
        if (this.authenticationInfo2 != other.authenticationInfo2) return false
        if (this.parameterControl != other.parameterControl) return false
        if (this.subAuthPackageId != other.subAuthPackageId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.workstation.hashCode()
        result = 31 * result + this.challengeToClient.contentHashCode()
        result = 31 * result + this.authenticationInfo1.hashCode()
        result = 31 * result + this.authenticationInfo2.hashCode()
        result = 31 * result + this.parameterControl.hashCode()
        result = 31 * result + this.subAuthPackageId.hashCode()
        return result
    }
}

public data class Msv10SubauthRequest(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var subAuthPackageId: UInt = 0u,
    public var subAuthInfoLength: UInt = 0u,
    public var subAuthSubmitBuffer: COpaquePointer? = null,
)

public data class Msv10SubauthResponse(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var subAuthInfoLength: UInt = 0u,
    public var subAuthReturnBuffer: COpaquePointer? = null,
)

public data class Msv10SupplementalCredential(
    public var version: UInt = 0u,
    public var flags: MsvSupplementalCredentialFlags = 0u,
    public var lmPassword: UByteArray = UByteArray(16),
    public var ntPassword: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10SupplementalCredential) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (!this.lmPassword.contentEquals(other.lmPassword)) return false
        if (!this.ntPassword.contentEquals(other.ntPassword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lmPassword.contentHashCode()
        result = 31 * result + this.ntPassword.contentHashCode()
        return result
    }
}

public data class Msv10SupplementalCredentialV2(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var ntPassword: UByteArray = UByteArray(16),
    public var credentialKey: Msv10CredentialKey = Msv10CredentialKey(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10SupplementalCredentialV2) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (!this.ntPassword.contentEquals(other.ntPassword)) return false
        if (this.credentialKey != other.credentialKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ntPassword.contentHashCode()
        result = 31 * result + this.credentialKey.hashCode()
        return result
    }
}

public data class Msv10SupplementalCredentialV3(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var credentialKeyType: Msv10CredentialKeyType = 0,
    public var ntPassword: UByteArray = UByteArray(16),
    public var credentialKey: Msv10CredentialKey = Msv10CredentialKey(),
    public var shaPassword: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10SupplementalCredentialV3) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.credentialKeyType != other.credentialKeyType) return false
        if (!this.ntPassword.contentEquals(other.ntPassword)) return false
        if (this.credentialKey != other.credentialKey) return false
        if (!this.shaPassword.contentEquals(other.shaPassword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.credentialKeyType.hashCode()
        result = 31 * result + this.ntPassword.contentHashCode()
        result = 31 * result + this.credentialKey.hashCode()
        result = 31 * result + this.shaPassword.contentHashCode()
        return result
    }
}

public data class Msv10ValidationInfo(
    public var logoffTime: Long = 0L,
    public var kickoffTime: Long = 0L,
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var sessionKey: UserSessionKey = UserSessionKey(),
    public var authoritative: Boolean = false,
    public var userFlags: UInt = 0u,
    public var whichFields: UInt = 0u,
    public var userId: UInt = 0u,
)

public data class NegotiateCallerNameRequest(
    public var messageType: UInt = 0u,
    public var logonId: Luid = Luid(),
)

public data class NegotiateCallerNameResponse(
    public var messageType: UInt = 0u,
    public var callerName: Pwstr = null,
)

public data class NegotiatePackagePrefix(
    public var packageId: Int = 0,
    public var packageDataA: COpaquePointer? = null,
    public var packageDataW: COpaquePointer? = null,
    public var prefixLen: Int = 0,
    public var prefix: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NegotiatePackagePrefix) return false
        if (this.packageId != other.packageId) return false
        if (this.packageDataA != other.packageDataA) return false
        if (this.packageDataW != other.packageDataW) return false
        if (this.prefixLen != other.prefixLen) return false
        if (!this.prefix.contentEquals(other.prefix)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.packageId.hashCode()
        result = 31 * result + this.packageDataA.hashCode()
        result = 31 * result + this.packageDataW.hashCode()
        result = 31 * result + this.prefixLen.hashCode()
        result = 31 * result + this.prefix.contentHashCode()
        return result
    }
}

public data class NegotiatePackagePrefixes(
    public var messageType: UInt = 0u,
    public var prefixCount: UInt = 0u,
    public var offset: UInt = 0u,
    public var pad: UInt = 0u,
)

public data class NetlogonGenericInfo(
    public var identity: NetlogonLogonIdentityInfo = NetlogonLogonIdentityInfo(),
    public var packageName: LsaUnicodeString = LsaUnicodeString(),
    public var dataLength: UInt = 0u,
    public var logonData: COpaquePointer? = null,
)

public data class NetlogonInteractiveInfo(
    public var identity: NetlogonLogonIdentityInfo = NetlogonLogonIdentityInfo(),
    public var lmOwfPassword: LmOwfPassword = LmOwfPassword(),
    public var ntOwfPassword: LmOwfPassword = LmOwfPassword(),
)

public data class NetlogonLogonIdentityInfo(
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var parameterControl: UInt = 0u,
    public var logonId: Long = 0L,
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var workstation: LsaUnicodeString = LsaUnicodeString(),
)

public data class NetlogonNetworkInfo(
    public var identity: NetlogonLogonIdentityInfo = NetlogonLogonIdentityInfo(),
    public var lmChallenge: ClearBlock = ClearBlock(),
    public var ntChallengeResponse: LsaString = LsaString(),
    public var lmChallengeResponse: LsaString = LsaString(),
)

public data class NetlogonServiceInfo(
    public var identity: NetlogonLogonIdentityInfo = NetlogonLogonIdentityInfo(),
    public var lmOwfPassword: LmOwfPassword = LmOwfPassword(),
    public var ntOwfPassword: LmOwfPassword = LmOwfPassword(),
)

public data class Pku2uCertificateS4uLogon(
    public var messageType: Pku2uLogonSubmitType = 0,
    public var flags: UInt = 0u,
    public var userPrincipalName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var certificateLength: UInt = 0u,
    public var certificate: COpaquePointer? = null,
)

public data class Pku2uCertBlob(
    public var certOffset: UInt = 0u,
    public var certLength: UShort = 0u,
)

public data class Pku2uCreduiContext(
    public var version: ULong = 0uL,
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UInt = 0u,
    public var certArrayCount: UShort = 0u,
    public var certArrayOffset: UInt = 0u,
)

public data class PolicyAccountDomainInfo(
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var domainSid: Psid = null,
)

public data class PolicyAuditCategoriesInfo(
    public var maximumCategoryCount: UInt = 0u,
    public var subCategoriesInfo: PolicyAuditSubcategoriesInfo? = null,
)

public data class PolicyAuditEventsInfo(
    public var auditingMode: Boolean = false,
    public var eventAuditingOptions: UInt? = null,
    public var maximumAuditEventCount: UInt = 0u,
)

public data class PolicyAuditFullQueryInfo(
    public var shutDownOnFull: Boolean = false,
    public var logIsFull: Boolean = false,
)

public data class PolicyAuditFullSetInfo(
    public var shutDownOnFull: Boolean = false,
)

public data class PolicyAuditLogInfo(
    public var auditLogPercentFull: UInt = 0u,
    public var maximumLogSize: UInt = 0u,
    public var auditRetentionPeriod: Long = 0L,
    public var auditLogFullShutdownInProgress: Boolean = false,
    public var timeToShutdown: Long = 0L,
    public var nextAuditRecordId: UInt = 0u,
)

public data class PolicyAuditSidArray(
    public var usersCount: UInt = 0u,
    public var userSidArray: Psid = null,
)

public data class PolicyAuditSubcategoriesInfo(
    public var maximumSubCategoryCount: UInt = 0u,
    public var eventAuditingOptions: UInt? = null,
)

public data class PolicyDefaultQuotaInfo(
    public var quotaLimits: QuotaLimits = QuotaLimits(),
)

public data class PolicyDnsDomainInfo(
    public var name: LsaUnicodeString = LsaUnicodeString(),
    public var dnsDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var dnsForestName: LsaUnicodeString = LsaUnicodeString(),
    public var domainGuid: Guid = Guid(),
    public var sid: Psid = null,
)

public data class PolicyDomainEfsInfo(
    public var infoLength: UInt = 0u,
    public var efsBlob: COpaquePointer? = null,
)

public data class PolicyDomainKerberosTicketInfo(
    public var authenticationOptions: UInt = 0u,
    public var maxServiceTicketAge: Long = 0L,
    public var maxTicketAge: Long = 0L,
    public var maxRenewAge: Long = 0L,
    public var maxClockSkew: Long = 0L,
    public var reserved: Long = 0L,
)

public data class PolicyLsaServerRoleInfo(
    public var lsaServerRole: PolicyLsaServerRole = 0,
)

public data class PolicyMachineAcctInfo(
    public var rid: UInt = 0u,
    public var sid: Psid = null,
)

public data class PolicyMachineAcctInfo2(
    public var rid: UInt = 0u,
    public var sid: Psid = null,
    public var objectGuid: Guid = Guid(),
)

public data class PolicyModificationInfo(
    public var modifiedId: Long = 0L,
    public var databaseCreationTime: Long = 0L,
)

public data class PolicyPdAccountInfo(
    public var name: LsaUnicodeString = LsaUnicodeString(),
)

public data class PolicyPrimaryDomainInfo(
    public var name: LsaUnicodeString = LsaUnicodeString(),
    public var sid: Psid = null,
)

public data class PolicyReplicaSourceInfo(
    public var replicaSource: LsaUnicodeString = LsaUnicodeString(),
    public var replicaAccountName: LsaUnicodeString = LsaUnicodeString(),
)

public data class PctPublicKey(
    public var type: UInt = 0u,
    public var cbKey: UInt = 0u,
    public var pKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PctPublicKey) return false
        if (this.type != other.type) return false
        if (this.cbKey != other.cbKey) return false
        if (!this.pKey.contentEquals(other.pKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.pKey.contentHashCode()
        return result
    }
}

public data class SamRegisterMappingElement(
    public var original: Pstr = null,
    public var mapped: Pstr = null,
    public var continuable: Boolean = false,
)

public data class SamRegisterMappingList(
    public var count: UInt = 0u,
    public var elements: SamRegisterMappingElement? = null,
)

public data class SamRegisterMappingTable(
    public var count: UInt = 0u,
    public var lists: SamRegisterMappingList? = null,
)

public data class SchannelAlertToken(
    public var dwTokenType: UInt = 0u,
    public var dwAlertType: SchannelAlertTokenAlertType = 0u,
    public var dwAlertNumber: UInt = 0u,
)

public data class SchannelCertHash(
    public var dwLength: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hProv: Int = 0,
    public var shaHash: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchannelCertHash) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hProv != other.hProv) return false
        if (!this.shaHash.contentEquals(other.shaHash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hProv.hashCode()
        result = 31 * result + this.shaHash.contentHashCode()
        return result
    }
}

public data class SchannelCertHashStore(
    public var dwLength: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hProv: Int = 0,
    public var shaHash: UByteArray = UByteArray(20),
    public var pwszStoreName: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchannelCertHashStore) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hProv != other.hProv) return false
        if (!this.shaHash.contentEquals(other.shaHash)) return false
        if (!this.pwszStoreName.contentEquals(other.pwszStoreName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hProv.hashCode()
        result = 31 * result + this.shaHash.contentHashCode()
        result = 31 * result + this.pwszStoreName.contentHashCode()
        return result
    }
}

public data class SchannelClientSignature(
    public var cbLength: UInt = 0u,
    public var aiHash: AlgId = 0u,
    public var cbHash: UInt = 0u,
    public var hashValue: UByteArray = UByteArray(36),
    public var certThumbprint: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchannelClientSignature) return false
        if (this.cbLength != other.cbLength) return false
        if (this.aiHash != other.aiHash) return false
        if (this.cbHash != other.cbHash) return false
        if (!this.hashValue.contentEquals(other.hashValue)) return false
        if (!this.certThumbprint.contentEquals(other.certThumbprint)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLength.hashCode()
        result = 31 * result + this.aiHash.hashCode()
        result = 31 * result + this.cbHash.hashCode()
        result = 31 * result + this.hashValue.contentHashCode()
        result = 31 * result + this.certThumbprint.contentHashCode()
        return result
    }
}

public data class SchannelCred(
    public var dwVersion: UInt = 0u,
    public var cCreds: UInt = 0u,
    public var paCred: COpaquePointer? = null,
    public var hRootStore: Hcertstore = null,
    public var cMappers: UInt = 0u,
    public var aphMappers: COpaquePointer? = null,
    public var cSupportedAlgs: UInt = 0u,
    public var palgSupportedAlgs: AlgId? = null,
    public var grbitEnabledProtocols: UInt = 0u,
    public var dwMinimumCipherStrength: UInt = 0u,
    public var dwMaximumCipherStrength: UInt = 0u,
    public var dwSessionLifespan: UInt = 0u,
    public var dwFlags: SchannelCredFlags = 0u,
    public var dwCredFormat: UInt = 0u,
)

public data class SchannelSessionToken(
    public var dwTokenType: UInt = 0u,
    public var dwFlags: SchannelSessionTokenFlags = 0u,
)

public data class SchCred(
    public var dwVersion: UInt = 0u,
    public var cCreds: UInt = 0u,
    public var paSecret: COpaquePointer? = null,
    public var paPublic: COpaquePointer? = null,
    public var cMappers: UInt = 0u,
    public var aphMappers: COpaquePointer? = null,
)

public data class SchCredentials(
    public var dwVersion: UInt = 0u,
    public var dwCredFormat: UInt = 0u,
    public var cCreds: UInt = 0u,
    public var paCred: COpaquePointer? = null,
    public var hRootStore: Hcertstore = null,
    public var cMappers: UInt = 0u,
    public var aphMappers: COpaquePointer? = null,
    public var dwSessionLifespan: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cTlsParameters: UInt = 0u,
    public var pTlsParameters: TlsParameters? = null,
)

public data class SchCredPublicCertchain(
    public var dwType: UInt = 0u,
    public var cbCertChain: UInt = 0u,
    public var pCertChain: COpaquePointer? = null,
)

public data class SchCredSecretCapi(
    public var dwType: UInt = 0u,
    public var hProv: Int = 0,
)

public data class SchCredSecretPrivkey(
    public var dwType: UInt = 0u,
    public var pPrivateKey: COpaquePointer? = null,
    public var cbPrivateKey: UInt = 0u,
    public var pszPassword: Pstr = null,
)

public data class SchExtensionData(
    public var extensionType: UShort = 0u,
    public var pExtData: COpaquePointer? = null,
    public var cbExtData: UInt = 0u,
)

public data class SecpkgAppModeInfo(
    public var userFunction: UInt = 0u,
    public var argument1: Int = 0,
    public var argument2: Int = 0,
    public var userData: SecBuffer = SecBuffer(),
    public var returnToLsa: Boolean = false,
)

public data class SecpkgByteVector(
    public var byteArrayOffset: UInt = 0u,
    public var byteArrayLength: UShort = 0u,
)

public data class SecpkgCallInfo(
    public var processId: UInt = 0u,
    public var threadId: UInt = 0u,
    public var attributes: UInt = 0u,
    public var callCount: UInt = 0u,
    public var mechOid: COpaquePointer? = null,
)

public data class SecpkgCallPackagePinDcRequest(
    public var messageType: UInt = 0u,
    public var flags: UInt = 0u,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var dcName: LsaUnicodeString = LsaUnicodeString(),
    public var dcFlags: UInt = 0u,
)

public data class SecpkgCallPackageTransferCredRequest(
    public var messageType: UInt = 0u,
    public var originLogonId: Luid = Luid(),
    public var destinationLogonId: Luid = Luid(),
    public var flags: UInt = 0u,
)

public data class SecpkgCallPackageUnpinAllDcsRequest(
    public var messageType: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class SecpkgClientInfo(
    public var logonId: Luid = Luid(),
    public var processID: UInt = 0u,
    public var threadID: UInt = 0u,
    public var hasTcbPrivilege: Boolean = false,
    public var impersonating: Boolean = false,
    public var restricted: Boolean = false,
    public var clientFlags: UByte = 0u,
    public var impersonationLevel: SecurityImpersonationLevel = 0,
    public var clientToken: Handle = null,
)

public data class SecpkgClientInfoEx(
    public var logonId: Luid = Luid(),
    public var processID: UInt = 0u,
    public var threadID: UInt = 0u,
    public var hasTcbPrivilege: Boolean = false,
    public var impersonating: Boolean = false,
    public var restricted: Boolean = false,
    public var clientFlags: UByte = 0u,
    public var impersonationLevel: SecurityImpersonationLevel = 0,
    public var clientToken: Handle = null,
    public var identificationLogonId: Luid = Luid(),
    public var identificationToken: Handle = null,
)

public data class SecpkgContextThunks(
    public var infoLevelCount: UInt = 0u,
    public var levels: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgContextThunks) return false
        if (this.infoLevelCount != other.infoLevelCount) return false
        if (!this.levels.contentEquals(other.levels)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.infoLevelCount.hashCode()
        result = 31 * result + this.levels.contentHashCode()
        return result
    }
}

public data class SecpkgCredential(
    public var version: ULong = 0uL,
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UInt = 0u,
    public var clientProcess: UInt = 0u,
    public var clientThread: UInt = 0u,
    public var logonId: Luid = Luid(),
    public var clientToken: Handle = null,
    public var sessionId: UInt = 0u,
    public var modifiedId: Luid = Luid(),
    public var fCredentials: UInt = 0u,
    public var flags: UInt = 0u,
    public var principalName: SecpkgByteVector = SecpkgByteVector(),
    public var packageList: SecpkgByteVector = SecpkgByteVector(),
    public var marshaledSuppliedCreds: SecpkgByteVector = SecpkgByteVector(),
)

public data class SecpkgDllFunctions(
    public var allocateHeap: PlsaAllocateLsaHeap = null,
    public var freeHeap: PlsaFreeLsaHeap = null,
    public var registerCallback: PlsaRegisterCallback = null,
    public var locatePackageById: PlsaLocatePkgById = null,
)

public data class SecpkgEventNotify(
    public var eventClass: UInt = 0u,
    public var reserved: UInt = 0u,
    public var eventDataSize: UInt = 0u,
    public var eventData: COpaquePointer? = null,
    public var packageParameter: COpaquePointer? = null,
)

public data class SecpkgEventPackageChange(
    public var changeType: SecpkgPackageChangeType = 0u,
    public var packageId: Int = 0,
    public var packageName: SecurityString = SecurityString(),
)

public data class SecpkgEventRoleChange(
    public var previousRole: UInt = 0u,
    public var newRole: UInt = 0u,
)

public data class SecpkgExtendedInformation(
    public var cls: SecpkgExtendedInformationClass = 0,
    public var info: SecpkgExtendedInformation0 = SecpkgExtendedInformation0(),
)

public data class SecpkgExtendedInformation0(
    public var gssInfo: SecpkgGssInfo = SecpkgGssInfo(),
    public var contextThunks: SecpkgContextThunks = SecpkgContextThunks(),
    public var mutualAuthLevel: SecpkgMutualAuthLevel = SecpkgMutualAuthLevel(),
    public var wowClientDll: SecpkgWowClientDll = SecpkgWowClientDll(),
    public var extraOids: SecpkgExtraOids = SecpkgExtraOids(),
    public var nego2Info: SecpkgNego2Info = SecpkgNego2Info(),
)

public data class SecpkgExtraOids(
    public var oidCount: UInt = 0u,
    public var oids: List<SecpkgSerializedOid> = List(1) { SecpkgSerializedOid() },
)

public class SecpkgFunctionTable(
    public var initializePackage: PlsaApInitializePackage = null,
    public var logonUserA: PlsaApLogonUser = null,
    public var callPackage: PlsaApCallPackage = null,
    public var logonTerminated: PlsaApLogonTerminated = null,
    public var callPackageUntrusted: PlsaApCallPackage = null,
    public var callPackagePassthrough: PlsaApCallPackagePassthrough = null,
    public var logonUserExA: PlsaApLogonUserEx = null,
    public var logonUserEx2: PlsaApLogonUserEx2 = null,
    public var initialize: SpInitializeFn = null,
    public var shutdown: SpShutdownFn = null,
    public var getInfo: SpGetInfoFn = null,
    public var acceptCredentials: SpAcceptCredentialsFn = null,
    public var acquireCredentialsHandleA: SpAcquireCredentialsHandleFn = null,
    public var queryCredentialsAttributesA: SpQueryCredentialsAttributesFn = null,
    public var freeCredentialsHandle: SpFreeCredentialsHandleFn = null,
    public var saveCredentials: SpSaveCredentialsFn = null,
    public var getCredentials: SpGetCredentialsFn = null,
    public var deleteCredentials: SpDeleteCredentialsFn = null,
    public var initLsaModeContext: SpInitLsaModeContextFn = null,
    public var acceptLsaModeContext: SpAcceptLsaModeContextFn = null,
    public var deleteContext: SpDeleteContextFn = null,
    public var applyControlToken: SpApplyControlTokenFn = null,
    public var getUserInfo: SpGetUserInfoFn = null,
    public var getExtendedInformation: SpGetExtendedInformationFn = null,
    public var queryContextAttributesA: SpQueryContextAttributesFn = null,
    public var addCredentialsA: SpAddCredentialsFn = null,
    public var setExtendedInformation: SpSetExtendedInformationFn = null,
    public var setContextAttributesA: SpSetContextAttributesFn = null,
    public var setCredentialsAttributesA: SpSetCredentialsAttributesFn = null,
    public var changeAccountPasswordA: SpChangeAccountPasswordFn = null,
    public var queryMetaData: SpQueryMetaDataFn = null,
    public var exchangeMetaData: SpExchangeMetaDataFn = null,
    public var getCredUIContext: SpGetCredUIContextFn = null,
    public var updateCredentials: SpUpdateCredentialsFn = null,
    public var validateTargetInfo: SpValidateTargetInfoFn = null,
    public var postLogonUser: LsaApPostLogonUser = null,
    public var getRemoteCredGuardLogonBuffer: SpGetRemoteCredGuardLogonBufferFn = null,
    public var getRemoteCredGuardSupplementalCreds: SpGetRemoteCredGuardSupplementalCredsFn = null,
    public var getTbalSupplementalCreds: SpGetTbalSupplementalCredsFn = null,
    public var logonUserEx3: PlsaApLogonUserEx3 = null,
    public var preLogonUserSurrogate: PlsaApPreLogonUserSurrogate = null,
    public var postLogonUserSurrogate: PlsaApPostLogonUserSurrogate = null,
    public var extractTargetInfo: SpExtractTargetInfoFn = null,
)

public data class SecpkgGssInfo(
    public var encodedIdLength: UInt = 0u,
    public var encodedId: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgGssInfo) return false
        if (this.encodedIdLength != other.encodedIdLength) return false
        if (!this.encodedId.contentEquals(other.encodedId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.encodedIdLength.hashCode()
        result = 31 * result + this.encodedId.contentHashCode()
        return result
    }
}

public data class SecpkgKernelFunctions(
    public var allocateHeap: PlsaAllocateLsaHeap = null,
    public var freeHeap: PlsaFreeLsaHeap = null,
    public var createContextList: PksecCreateContextList = null,
    public var insertListEntry: PksecInsertListEntry = null,
    public var referenceListEntry: PksecReferenceListEntry = null,
    public var dereferenceListEntry: PksecDereferenceListEntry = null,
    public var serializeWinntAuthData: PksecSerializeWinntAuthData = null,
    public var serializeSchannelAuthData: PksecSerializeSchannelAuthData = null,
    public var locatePackageById: PksecLocatePkgById = null,
)

public data class SecpkgKernelFunctionTable(
    public var initialize: KspInitPackageFn = null,
    public var deleteContext: KspDeleteContextFn = null,
    public var initContext: KspInitContextFn = null,
    public var mapHandle: KspMapHandleFn = null,
    public var sign: KspMakeSignatureFn = null,
    public var verify: KspVerifySignatureFn = null,
    public var seal: KspSealMessageFn = null,
    public var unseal: KspUnsealMessageFn = null,
    public var getToken: KspGetTokenFn = null,
    public var queryAttributes: KspQueryAttributesFn = null,
    public var completeToken: KspCompleteTokenFn = null,
    public var exportContext: SpExportSecurityContextFn = null,
    public var importContext: SpImportSecurityContextFn = null,
    public var setPackagePagingMode: KspSetPagingModeFn = null,
    public var serializeAuthData: KspSerializeAuthDataFn = null,
)

public data class SecpkgMutualAuthLevel(
    public var mutualAuthLevel: UInt = 0u,
)

public data class SecpkgNego2Info(
    public var authScheme: UByteArray = UByteArray(16),
    public var packageFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgNego2Info) return false
        if (!this.authScheme.contentEquals(other.authScheme)) return false
        if (this.packageFlags != other.packageFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.authScheme.contentHashCode()
        result = 31 * result + this.packageFlags.hashCode()
        return result
    }
}

public data class SecpkgNtlmTargetinfo(
    public var flags: UInt = 0u,
    public var msvAvNbComputerName: Pwstr = null,
    public var msvAvNbDomainName: Pwstr = null,
    public var msvAvDnsComputerName: Pwstr = null,
    public var msvAvDnsDomainName: Pwstr = null,
    public var msvAvDnsTreeName: Pwstr = null,
    public var msvAvFlags: UInt = 0u,
    public var msvAvTimestamp: Filetime = Filetime(),
    public var msvAvTargetName: Pwstr = null,
)

public data class SecpkgParameters(
    public var version: UInt = 0u,
    public var machineState: UInt = 0u,
    public var setupMode: UInt = 0u,
    public var domainSid: Psid = null,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var dnsDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var domainGuid: Guid = Guid(),
)

public data class SecpkgPostLogonUserInfo(
    public var flags: UInt = 0u,
    public var logonId: Luid = Luid(),
    public var linkedLogonId: Luid = Luid(),
)

public data class SecpkgPrimaryCred(
    public var logonId: Luid = Luid(),
    public var downlevelName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
    public var oldPassword: LsaUnicodeString = LsaUnicodeString(),
    public var userSid: Psid = null,
    public var flags: UInt = 0u,
    public var dnsDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var upn: LsaUnicodeString = LsaUnicodeString(),
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var spare1: LsaUnicodeString = LsaUnicodeString(),
    public var spare2: LsaUnicodeString = LsaUnicodeString(),
    public var spare3: LsaUnicodeString = LsaUnicodeString(),
    public var spare4: LsaUnicodeString = LsaUnicodeString(),
)

public class SecpkgPrimaryCredEx(
    public var logonId: Luid = Luid(),
    public var downlevelName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
    public var oldPassword: LsaUnicodeString = LsaUnicodeString(),
    public var userSid: Psid = null,
    public var flags: UInt = 0u,
    public var dnsDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var upn: LsaUnicodeString = LsaUnicodeString(),
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var spare1: LsaUnicodeString = LsaUnicodeString(),
    public var spare2: LsaUnicodeString = LsaUnicodeString(),
    public var spare3: LsaUnicodeString = LsaUnicodeString(),
    public var spare4: LsaUnicodeString = LsaUnicodeString(),
    public var packageId: Int = 0,
    public var prevLogonId: Luid = Luid(),
    public var flagsEx: UInt = 0u,
)

public data class SecpkgRedirectedLogonBuffer(
    public var redirectedLogonGuid: Guid = Guid(),
    public var redirectedLogonHandle: Handle = null,
    public var init: PlsaRedirectedLogonInit = null,
    public var callback: PlsaRedirectedLogonCallback = null,
    public var cleanupCallback: PlsaRedirectedLogonCleanupCallback = null,
    public var getLogonCreds: PlsaRedirectedLogonGetLogonCreds = null,
    public var getSupplementalCreds: PlsaRedirectedLogonGetSuppCreds = null,
    public var getRedirectedLogonSid: PlsaRedirectedLogonGetSid = null,
)

public data class SecpkgSerializedOid(
    public var oidLength: UInt = 0u,
    public var oidAttributes: UInt = 0u,
    public var oidValue: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgSerializedOid) return false
        if (this.oidLength != other.oidLength) return false
        if (this.oidAttributes != other.oidAttributes) return false
        if (!this.oidValue.contentEquals(other.oidValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oidLength.hashCode()
        result = 31 * result + this.oidAttributes.hashCode()
        result = 31 * result + this.oidValue.contentHashCode()
        return result
    }
}

public data class SecpkgShortVector(
    public var shortArrayOffset: UInt = 0u,
    public var shortArrayCount: UShort = 0u,
)

public data class SecpkgSupplementalCred(
    public var packageName: LsaUnicodeString = LsaUnicodeString(),
    public var credentialSize: UInt = 0u,
    public var credentials: COpaquePointer? = null,
)

public data class SecpkgSupplementalCredArray(
    public var credentialCount: UInt = 0u,
    public var credentials: List<SecpkgSupplementalCred> = List(1) { SecpkgSupplementalCred() },
)

public data class SecpkgSuppliedCredential(
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UShort = 0u,
    public var userName: SecpkgShortVector = SecpkgShortVector(),
    public var domainName: SecpkgShortVector = SecpkgShortVector(),
    public var packedCredentials: SecpkgByteVector = SecpkgByteVector(),
    public var credFlags: UInt = 0u,
)

public data class SecpkgSurrogateLogon(
    public var version: UInt = 0u,
    public var surrogateLogonID: Luid = Luid(),
    public var entryCount: UInt = 0u,
    public var entries: SecpkgSurrogateLogonEntry? = null,
)

public data class SecpkgSurrogateLogonEntry(
    public var type: Guid = Guid(),
    public var data: COpaquePointer? = null,
)

public data class SecpkgTargetinfo(
    public var domainSid: Psid = null,
    public var computerName: Pcwstr = null,
)

public data class SecpkgUserFunctionTable(
    public var instanceInit: SpInstanceInitFn = null,
    public var initUserModeContext: SpInitUserModeContextFn = null,
    public var makeSignature: SpMakeSignatureFn = null,
    public var verifySignature: SpVerifySignatureFn = null,
    public var sealMessage: SpSealMessageFn = null,
    public var unsealMessage: SpUnsealMessageFn = null,
    public var getContextToken: SpGetContextTokenFn = null,
    public var queryContextAttributesA: SpQueryContextAttributesFn = null,
    public var completeAuthToken: SpCompleteAuthTokenFn = null,
    public var deleteUserModeContext: SpDeleteContextFn = null,
    public var formatCredentials: SpFormatCredentialsFn = null,
    public var marshallSupplementalCreds: SpMarshallSupplementalCredsFn = null,
    public var exportContext: SpExportSecurityContextFn = null,
    public var importContext: SpImportSecurityContextFn = null,
    public var marshalAttributeData: SpMarshalAttributeDataFn = null,
)

public data class SecpkgWowClientDll(
    public var wowClientDllPath: SecurityString = SecurityString(),
)

public class SecurityLogonSessionData(
    public var size: UInt = 0u,
    public var logonId: Luid = Luid(),
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var logonDomain: LsaUnicodeString = LsaUnicodeString(),
    public var authenticationPackage: LsaUnicodeString = LsaUnicodeString(),
    public var logonType: UInt = 0u,
    public var session: UInt = 0u,
    public var sid: Psid = null,
    public var logonTime: Long = 0L,
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var dnsDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var upn: LsaUnicodeString = LsaUnicodeString(),
    public var userFlags: UInt = 0u,
    public var lastLogonInfo: LsaLastInterLogonInfo = LsaLastInterLogonInfo(),
    public var logonScript: LsaUnicodeString = LsaUnicodeString(),
    public var profilePath: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectory: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectoryDrive: LsaUnicodeString = LsaUnicodeString(),
    public var logoffTime: Long = 0L,
    public var kickOffTime: Long = 0L,
    public var passwordLastSet: Long = 0L,
    public var passwordCanChange: Long = 0L,
    public var passwordMustChange: Long = 0L,
)

public data class SecurityLogonType(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public val UNDEFINED_LOGON_TYPE: SecurityLogonType = SecurityLogonType(0)

        public val INTERACTIVE: SecurityLogonType = SecurityLogonType(2)

        public val NETWORK: SecurityLogonType = SecurityLogonType(3)

        public val BATCH: SecurityLogonType = SecurityLogonType(4)

        public val SERVICE: SecurityLogonType = SecurityLogonType(5)

        public val PROXY: SecurityLogonType = SecurityLogonType(6)

        public val UNLOCK: SecurityLogonType = SecurityLogonType(7)

        public val NETWORK_CLEARTEXT: SecurityLogonType = SecurityLogonType(8)

        public val NEW_CREDENTIALS: SecurityLogonType = SecurityLogonType(9)

        public val REMOTE_INTERACTIVE: SecurityLogonType = SecurityLogonType(10)

        public val CACHED_INTERACTIVE: SecurityLogonType = SecurityLogonType(11)

        public val CACHED_REMOTE_INTERACTIVE: SecurityLogonType = SecurityLogonType(12)

        public val CACHED_UNLOCK: SecurityLogonType = SecurityLogonType(13)
    }
}

public data class SecurityPackageOptions(
    public var size: UInt = 0u,
    public var type: SecurityPackageOptionsType = 0u,
    public var flags: UInt = 0u,
    public var signatureSize: UInt = 0u,
    public var signature: COpaquePointer? = null,
)

public data class SecurityString(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: COpaquePointer? = null,
)

public data class SecurityUserData(
    public var userName: SecurityString = SecurityString(),
    public var logonDomainName: SecurityString = SecurityString(),
    public var logonServer: SecurityString = SecurityString(),
    public var pSid: Psid = null,
)

public data class SecApplicationProtocols(
    public var protocolListsSize: UInt = 0u,
    public var protocolLists: List<SecApplicationProtocolList> = List(1) { SecApplicationProtocolList() },
)

public data class SecApplicationProtocolList(
    public var protoNegoExt: SecApplicationProtocolNegotiationExt = 0,
    public var protocolListSize: UShort = 0u,
    public var protocolList: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecApplicationProtocolList) return false
        if (this.protoNegoExt != other.protoNegoExt) return false
        if (this.protocolListSize != other.protocolListSize) return false
        if (!this.protocolList.contentEquals(other.protocolList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protoNegoExt.hashCode()
        result = 31 * result + this.protocolListSize.hashCode()
        result = 31 * result + this.protocolList.contentHashCode()
        return result
    }
}

public data class SecCertificateRequestContext(
    public var cbCertificateRequestContext: UByte = 0u,
    public var rgCertificateRequestContext: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecCertificateRequestContext) return false
        if (this.cbCertificateRequestContext != other.cbCertificateRequestContext) return false
        if (!this.rgCertificateRequestContext.contentEquals(other.rgCertificateRequestContext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbCertificateRequestContext.hashCode()
        result = 31 * result + this.rgCertificateRequestContext.contentHashCode()
        return result
    }
}

public data class SecChannelBindings(
    public var dwInitiatorAddrType: UInt = 0u,
    public var cbInitiatorLength: UInt = 0u,
    public var dwInitiatorOffset: UInt = 0u,
    public var dwAcceptorAddrType: UInt = 0u,
    public var cbAcceptorLength: UInt = 0u,
    public var dwAcceptorOffset: UInt = 0u,
    public var cbApplicationDataLength: UInt = 0u,
    public var dwApplicationDataOffset: UInt = 0u,
)

public data class SecChannelBindingsEx(
    public var magicNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var cbHeaderLength: UInt = 0u,
    public var cbStructureLength: UInt = 0u,
    public var dwInitiatorAddrType: UInt = 0u,
    public var cbInitiatorLength: UInt = 0u,
    public var dwInitiatorOffset: UInt = 0u,
    public var dwAcceptorAddrType: UInt = 0u,
    public var cbAcceptorLength: UInt = 0u,
    public var dwAcceptorOffset: UInt = 0u,
    public var cbApplicationDataLength: UInt = 0u,
    public var dwApplicationDataOffset: UInt = 0u,
)

public data class SecChannelBindingsResult(
    public var flags: UInt = 0u,
)

public data class SecDtlsMtu(
    public var pathMTU: UShort = 0u,
)

public data class SecFlags(
    public var flags: ULong = 0uL,
)

public data class SecNegotiationInfo(
    public var size: UInt = 0u,
    public var nameLength: UInt = 0u,
    public var name: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class SecPresharedkey(
    public var keySize: UShort = 0u,
    public var key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPresharedkey) return false
        if (this.keySize != other.keySize) return false
        if (!this.key.contentEquals(other.key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keySize.hashCode()
        result = 31 * result + this.key.contentHashCode()
        return result
    }
}

public data class SecPresharedkeyIdentity(
    public var keyIdentitySize: UShort = 0u,
    public var keyIdentity: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPresharedkeyIdentity) return false
        if (this.keyIdentitySize != other.keyIdentitySize) return false
        if (!this.keyIdentity.contentEquals(other.keyIdentity)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyIdentitySize.hashCode()
        result = 31 * result + this.keyIdentity.contentHashCode()
        return result
    }
}

public data class SecSrtpMasterKeyIdentifier(
    public var masterKeyIdentifierSize: UByte = 0u,
    public var masterKeyIdentifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecSrtpMasterKeyIdentifier) return false
        if (this.masterKeyIdentifierSize != other.masterKeyIdentifierSize) return false
        if (!this.masterKeyIdentifier.contentEquals(other.masterKeyIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.masterKeyIdentifierSize.hashCode()
        result = 31 * result + this.masterKeyIdentifier.contentHashCode()
        return result
    }
}

public data class SecSrtpProtectionProfiles(
    public var profilesSize: UShort = 0u,
    public var profilesList: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecSrtpProtectionProfiles) return false
        if (this.profilesSize != other.profilesSize) return false
        if (!this.profilesList.contentEquals(other.profilesList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.profilesSize.hashCode()
        result = 31 * result + this.profilesList.contentHashCode()
        return result
    }
}

public data class SecTokenBinding(
    public var majorVersion: UByte = 0u,
    public var minorVersion: UByte = 0u,
    public var keyParametersSize: UShort = 0u,
    public var keyParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecTokenBinding) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.keyParametersSize != other.keyParametersSize) return false
        if (!this.keyParameters.contentEquals(other.keyParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.keyParametersSize.hashCode()
        result = 31 * result + this.keyParameters.contentHashCode()
        return result
    }
}

public data class SecTrafficSecrets(
    public var symmetricAlgId: UShortArray = UShortArray(64),
    public var chainingMode: UShortArray = UShortArray(64),
    public var hashAlgId: UShortArray = UShortArray(64),
    public var keySize: UShort = 0u,
    public var ivSize: UShort = 0u,
    public var msgSequenceStart: UShort = 0u,
    public var msgSequenceEnd: UShort = 0u,
    public var trafficSecretType: SecTrafficSecretType = 0,
    public var trafficSecretSize: UShort = 0u,
    public var trafficSecret: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecTrafficSecrets) return false
        if (!this.symmetricAlgId.contentEquals(other.symmetricAlgId)) return false
        if (!this.chainingMode.contentEquals(other.chainingMode)) return false
        if (!this.hashAlgId.contentEquals(other.hashAlgId)) return false
        if (this.keySize != other.keySize) return false
        if (this.ivSize != other.ivSize) return false
        if (this.msgSequenceStart != other.msgSequenceStart) return false
        if (this.msgSequenceEnd != other.msgSequenceEnd) return false
        if (this.trafficSecretType != other.trafficSecretType) return false
        if (this.trafficSecretSize != other.trafficSecretSize) return false
        if (!this.trafficSecret.contentEquals(other.trafficSecret)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.symmetricAlgId.contentHashCode()
        result = 31 * result + this.chainingMode.contentHashCode()
        result = 31 * result + this.hashAlgId.contentHashCode()
        result = 31 * result + this.keySize.hashCode()
        result = 31 * result + this.ivSize.hashCode()
        result = 31 * result + this.msgSequenceStart.hashCode()
        result = 31 * result + this.msgSequenceEnd.hashCode()
        result = 31 * result + this.trafficSecretType.hashCode()
        result = 31 * result + this.trafficSecretSize.hashCode()
        result = 31 * result + this.trafficSecret.contentHashCode()
        return result
    }
}

public data class SecWinntAuthIdentity32(
    public var user: UInt = 0u,
    public var userLength: UInt = 0u,
    public var domain: UInt = 0u,
    public var domainLength: UInt = 0u,
    public var password: UInt = 0u,
    public var passwordLength: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class SecWinntAuthIdentityEx2(
    public var version: UInt = 0u,
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UInt = 0u,
    public var userOffset: UInt = 0u,
    public var userLength: UShort = 0u,
    public var domainOffset: UInt = 0u,
    public var domainLength: UShort = 0u,
    public var packedCredentialsOffset: UInt = 0u,
    public var packedCredentialsLength: UShort = 0u,
    public var flags: UInt = 0u,
    public var packageListOffset: UInt = 0u,
    public var packageListLength: UShort = 0u,
)

public data class SecWinntAuthIdentityEx32(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var user: UInt = 0u,
    public var userLength: UInt = 0u,
    public var domain: UInt = 0u,
    public var domainLength: UInt = 0u,
    public var password: UInt = 0u,
    public var passwordLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var packageList: UInt = 0u,
    public var packageListLength: UInt = 0u,
)

public data class SecWinntAuthIdentityExa(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var user: COpaquePointer? = null,
    public var userLength: UInt = 0u,
    public var domain: COpaquePointer? = null,
    public var domainLength: UInt = 0u,
    public var password: COpaquePointer? = null,
    public var passwordLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var packageList: COpaquePointer? = null,
    public var packageListLength: UInt = 0u,
)

public data class SecWinntAuthIdentityExw(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var user: COpaquePointer? = null,
    public var userLength: UInt = 0u,
    public var domain: COpaquePointer? = null,
    public var domainLength: UInt = 0u,
    public var password: COpaquePointer? = null,
    public var passwordLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var packageList: COpaquePointer? = null,
    public var packageListLength: UInt = 0u,
)

public data class SecWinntAuthIdentityInfo(
    public var authIdExw: SecWinntAuthIdentityExw = SecWinntAuthIdentityExw(),
    public var authIdExa: SecWinntAuthIdentityExa = SecWinntAuthIdentityExa(),
    public var authIdA: SecWinntAuthIdentityA = SecWinntAuthIdentityA(),
    public var authIdW: SecWinntAuthIdentityW = SecWinntAuthIdentityW(),
    public var authIdEx2: SecWinntAuthIdentityEx2 = SecWinntAuthIdentityEx2(),
)

public data class SendGenericTlsExtension(
    public var extensionType: UShort = 0u,
    public var handshakeType: UShort = 0u,
    public var flags: UInt = 0u,
    public var bufferSize: UShort = 0u,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SendGenericTlsExtension) return false
        if (this.extensionType != other.extensionType) return false
        if (this.handshakeType != other.handshakeType) return false
        if (this.flags != other.flags) return false
        if (this.bufferSize != other.bufferSize) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extensionType.hashCode()
        result = 31 * result + this.handshakeType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class SeAdtAccessReason(
    public var accessMask: UInt = 0u,
    public var accessReasons: UIntArray = UIntArray(32),
    public var objectTypeIndex: UInt = 0u,
    public var accessGranted: UInt = 0u,
    public var securityDescriptor: PsecurityDescriptor = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeAdtAccessReason) return false
        if (this.accessMask != other.accessMask) return false
        if (!this.accessReasons.contentEquals(other.accessReasons)) return false
        if (this.objectTypeIndex != other.objectTypeIndex) return false
        if (this.accessGranted != other.accessGranted) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.accessMask.hashCode()
        result = 31 * result + this.accessReasons.contentHashCode()
        result = 31 * result + this.objectTypeIndex.hashCode()
        result = 31 * result + this.accessGranted.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        return result
    }
}

public data class SeAdtClaims(
    public var length: UInt = 0u,
    public var claims: COpaquePointer? = null,
)

public data class SeAdtObjectType(
    public var objectType: Guid = Guid(),
    public var flags: UShort = 0u,
    public var level: UShort = 0u,
    public var accessMask: UInt = 0u,
)

public data class SeAdtParameterArray(
    public var categoryId: UInt = 0u,
    public var auditId: UInt = 0u,
    public var parameterCount: UInt = 0u,
    public var length: UInt = 0u,
    public var flatSubCategoryId: UShort = 0u,
    public var type: UShort = 0u,
    public var flags: UInt = 0u,
    public var parameters: List<SeAdtParameterArrayEntry> = List(32) { SeAdtParameterArrayEntry() },
)

public data class SeAdtParameterArrayEntry(
    public var type: SeAdtParameterType = 0,
    public var length: UInt = 0u,
    public var data: IntArray = IntArray(2),
    public var address: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeAdtParameterArrayEntry) return false
        if (this.type != other.type) return false
        if (this.length != other.length) return false
        if (!this.data.contentEquals(other.data)) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }
}

public data class SeAdtParameterArrayEx(
    public var categoryId: UInt = 0u,
    public var auditId: UInt = 0u,
    public var version: UInt = 0u,
    public var parameterCount: UInt = 0u,
    public var length: UInt = 0u,
    public var flatSubCategoryId: UShort = 0u,
    public var type: UShort = 0u,
    public var flags: UInt = 0u,
    public var parameters: List<SeAdtParameterArrayEntry> = List(32) { SeAdtParameterArrayEntry() },
)

public data class SlActivationInfoHeader(
    public var cbSize: UInt = 0u,
    public var type: SlActivationType = 0,
)

public data class SlAdActivationInfo(
    public var header: SlActivationInfoHeader = SlActivationInfoHeader(),
    public var pwszProductKey: Pcwstr = null,
    public var pwszActivationObjectName: Pcwstr = null,
)

public data class SlLicensingStatus(
    public var skuId: Guid = Guid(),
    public var eStatus: Sllicensingstatus = 0,
    public var dwGraceTime: UInt = 0u,
    public var dwTotalGraceDays: UInt = 0u,
    public var hrReason: Hresult = 0,
    public var qwValidityExpiration: ULong = 0uL,
)
