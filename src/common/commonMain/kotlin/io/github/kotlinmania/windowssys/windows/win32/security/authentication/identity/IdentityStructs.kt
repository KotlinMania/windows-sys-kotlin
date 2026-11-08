@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.QUOTA_LIMITS
import io.github.kotlinmania.windowssys.windows.win32.security.SECURITY_IMPERSONATION_LEVEL
import io.github.kotlinmania.windowssys.windows.win32.security.SID_NAME_USE
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_DEFAULT_DACL
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_DEVICE_CLAIMS
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_OWNER
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_PRIMARY_GROUP
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_USER
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_USER_CLAIMS
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.CREDENTIALW
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.SecHandle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ALG_ID
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.HCERTSTORE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.LIST_ENTRY
import io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.LM_OWF_PASSWORD
import io.github.kotlinmania.windowssys.windows.win32.system.rpc.SEC_WINNT_AUTH_IDENTITY_A
import io.github.kotlinmania.windowssys.windows.win32.system.rpc.SEC_WINNT_AUTH_IDENTITY_W

public data class AUDIT_POLICY_INFORMATION(
    public var AuditSubCategoryGuid: GUID = GUID(),
    public var AuditingInformation: UInt = 0u,
    public var AuditCategoryGuid: GUID = GUID(),
)

public data class CENTRAL_ACCESS_POLICY(
    public var CAPID: PSID = 0L,
    public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Description: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ChangeId: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Flags: UInt = 0u,
    public var CAPECount: UInt = 0u,
    public var CAPEs: Long = 0L,
)

public data class CENTRAL_ACCESS_POLICY_ENTRY(
    public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Description: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ChangeId: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LengthAppliesTo: UInt = 0u,
    public var AppliesTo: Long = 0L,
    public var LengthSD: UInt = 0u,
    public var SD: PSECURITY_DESCRIPTOR = 0L,
    public var LengthStagedSD: UInt = 0u,
    public var StagedSD: PSECURITY_DESCRIPTOR = 0L,
    public var Flags: UInt = 0u,
)

public data class CLEAR_BLOCK(public var data: ByteArray = ByteArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLEAR_BLOCK) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.data.contentHashCode()
    }
}

public data class CRYPTO_SETTINGS(
    public var eAlgorithmUsage: eTlsAlgorithmUsage = 0,
    public var strCngAlgId: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var cChainingModes: UInt = 0u,
    public var rgstrChainingModes: Long = 0L,
    public var dwMinBitLength: UInt = 0u,
    public var dwMaxBitLength: UInt = 0u,
)

public data class DOMAIN_PASSWORD_INFORMATION(
    public var MinPasswordLength: UShort = 0u,
    public var PasswordHistoryLength: UShort = 0u,
    public var PasswordProperties: DOMAIN_PASSWORD_PROPERTIES = 0u,
    public var MaxPasswordAge: Long = 0L,
    public var MinPasswordAge: Long = 0L,
)

public data class ENCRYPTED_CREDENTIALW(public var Cred: CREDENTIALW = CREDENTIALW(), public var ClearCredentialBlobSize: UInt = 0u)

public data class KDC_PROXY_CACHE_ENTRY_DATA(
    public var SinceLastUsed: ULong = 0uL,
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ProxyServerName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ProxyServerVdir: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ProxyServerPort: UShort = 0u,
    public var LogonId: LUID = LUID(),
    public var CredUserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var CredDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var GlobalCache: Boolean = false,
)

public data class KERB_ADD_BINDING_CACHE_ENTRY_EX_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var RealmName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var KdcAddress: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var AddressType: KERB_ADDRESS_TYPE = 0u,
    public var DcFlags: UInt = 0u,
)

public data class KERB_ADD_BINDING_CACHE_ENTRY_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var RealmName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var KdcAddress: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var AddressType: KERB_ADDRESS_TYPE = 0u,
)

public data class KERB_ADD_CREDENTIALS_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Password: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LogonId: LUID = LUID(),
    public var Flags: KERB_REQUEST_FLAGS = 0u,
)

public data class KERB_ADD_CREDENTIALS_REQUEST_EX(
    public var Credentials: KERB_ADD_CREDENTIALS_REQUEST = KERB_ADD_CREDENTIALS_REQUEST(),
    public var PrincipalNameCount: UInt = 0u,
    public var PrincipalNames: List<LSA_UNICODE_STRING> = List(1) { LSA_UNICODE_STRING() },
)

public data class KERB_AUTH_DATA(
    public var Type: UInt = 0u,
    public var Length: UInt = 0u,
    public var Data: Long = 0L,
)

public data class KERB_BINDING_CACHE_ENTRY_DATA(
    public var DiscoveryTime: ULong = 0uL,
    public var RealmName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var KdcAddress: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var AddressType: KERB_ADDRESS_TYPE = 0u,
    public var Flags: UInt = 0u,
    public var DcFlags: UInt = 0u,
    public var CacheFlags: UInt = 0u,
    public var KdcName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class KERB_CERTIFICATE_HASHINFO(public var StoreNameLength: UShort = 0u, public var HashLength: UShort = 0u)

public data class KERB_CERTIFICATE_INFO(public var CertInfoSize: UInt = 0u, public var InfoType: UInt = 0u)

public data class KERB_CERTIFICATE_LOGON(
    public var MessageType: KERB_LOGON_SUBMIT_TYPE = 0,
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Pin: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Flags: UInt = 0u,
    public var CspDataLength: UInt = 0u,
    public var CspData: Long = 0L,
)

public data class KERB_CERTIFICATE_S4U_LOGON(
    public var MessageType: KERB_LOGON_SUBMIT_TYPE = 0,
    public var Flags: UInt = 0u,
    public var UserPrincipalName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var CertificateLength: UInt = 0u,
    public var Certificate: Long = 0L,
)

public data class KERB_CERTIFICATE_UNLOCK_LOGON(public var Logon: KERB_CERTIFICATE_LOGON = KERB_CERTIFICATE_LOGON(), public var LogonId: LUID = LUID())

public data class KERB_CHANGEPASSWORD_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var AccountName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var OldPassword: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var NewPassword: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Impersonating: Boolean = false,
)

public data class KERB_CLEANUP_MACHINE_PKINIT_CREDS_REQUEST(public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0, public var LogonId: LUID = LUID())

public data class KERB_CLOUD_KERBEROS_DEBUG_DATA(public var _bitfield: UInt = 0u)

public data class KERB_CLOUD_KERBEROS_DEBUG_DATA_V0(public var _bitfield: UInt = 0u)

public data class KERB_CLOUD_KERBEROS_DEBUG_REQUEST(public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0, public var LogonId: LUID = LUID())

public data class KERB_CLOUD_KERBEROS_DEBUG_RESPONSE(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var Data: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KERB_CLOUD_KERBEROS_DEBUG_RESPONSE) return false
        if (this.MessageType != other.MessageType) return false
        if (this.Version != other.Version) return false
        if (this.Length != other.Length) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageType.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class KERB_CRYPTO_KEY(
    public var KeyType: KERB_CRYPTO_KEY_TYPE = 0,
    public var Length: UInt = 0u,
    public var Value: Long = 0L,
)

public data class KERB_CRYPTO_KEY32(
    public var KeyType: Int = 0,
    public var Length: UInt = 0u,
    public var Offset: UInt = 0u,
)

public data class KERB_DECRYPT_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var LogonId: LUID = LUID(),
    public var Flags: UInt = 0u,
    public var CryptoType: Int = 0,
    public var KeyUsage: Int = 0,
    public var Key: KERB_CRYPTO_KEY = KERB_CRYPTO_KEY(),
    public var EncryptedDataSize: UInt = 0u,
    public var InitialVectorSize: UInt = 0u,
    public var InitialVector: Long = 0L,
    public var EncryptedData: Long = 0L,
)

public data class KERB_DECRYPT_RESPONSE(public var DecryptedData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KERB_DECRYPT_RESPONSE) return false
        if (!this.DecryptedData.contentEquals(other.DecryptedData)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DecryptedData.contentHashCode()
    }
}

public data class KERB_EXTERNAL_NAME(
    public var NameType: Short = 0,
    public var NameCount: UShort = 0u,
    public var Names: List<LSA_UNICODE_STRING> = List(1) { LSA_UNICODE_STRING() },
)

public data class KERB_EXTERNAL_TICKET(
    public var ServiceName: Long = 0L,
    public var TargetName: Long = 0L,
    public var ClientName: Long = 0L,
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var TargetDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var AltTargetDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var SessionKey: KERB_CRYPTO_KEY = KERB_CRYPTO_KEY(),
    public var TicketFlags: KERB_TICKET_FLAGS = 0u,
    public var Flags: UInt = 0u,
    public var KeyExpirationTime: Long = 0L,
    public var StartTime: Long = 0L,
    public var EndTime: Long = 0L,
    public var RenewUntil: Long = 0L,
    public var TimeSkew: Long = 0L,
    public var EncodedTicketSize: UInt = 0u,
    public var EncodedTicket: Long = 0L,
)

public data class KERB_INTERACTIVE_LOGON(
    public var MessageType: KERB_LOGON_SUBMIT_TYPE = 0,
    public var LogonDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Password: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class KERB_INTERACTIVE_PROFILE(
    public var MessageType: KERB_PROFILE_BUFFER_TYPE = 0,
    public var LogonCount: UShort = 0u,
    public var BadPasswordCount: UShort = 0u,
    public var LogonTime: Long = 0L,
    public var LogoffTime: Long = 0L,
    public var KickOffTime: Long = 0L,
    public var PasswordLastSet: Long = 0L,
    public var PasswordCanChange: Long = 0L,
    public var PasswordMustChange: Long = 0L,
    public var LogonScript: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var HomeDirectory: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var FullName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ProfilePath: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var HomeDirectoryDrive: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LogonServer: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserFlags: UInt = 0u,
)

public data class KERB_INTERACTIVE_UNLOCK_LOGON(public var Logon: KERB_INTERACTIVE_LOGON = KERB_INTERACTIVE_LOGON(), public var LogonId: LUID = LUID())

public data class KERB_NET_ADDRESS(
    public var Family: UInt = 0u,
    public var Length: UInt = 0u,
    public var Address: PSTR = 0L,
)

public data class KERB_NET_ADDRESSES(public var Number: UInt = 0u, public var Addresses: List<KERB_NET_ADDRESS> = List(1) { KERB_NET_ADDRESS() })

public data class KERB_PURGE_BINDING_CACHE_REQUEST(public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0)

public data class KERB_PURGE_KDC_PROXY_CACHE_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var Flags: UInt = 0u,
    public var LogonId: LUID = LUID(),
)

public data class KERB_PURGE_KDC_PROXY_CACHE_RESPONSE(public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0, public var CountOfPurged: UInt = 0u)

public data class KERB_PURGE_TKT_CACHE_EX_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var LogonId: LUID = LUID(),
    public var Flags: UInt = 0u,
    public var TicketTemplate: KERB_TICKET_CACHE_INFO_EX = KERB_TICKET_CACHE_INFO_EX(),
)

public data class KERB_PURGE_TKT_CACHE_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var LogonId: LUID = LUID(),
    public var ServerName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var RealmName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class KERB_QUERY_BINDING_CACHE_REQUEST(public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0)

public data class KERB_QUERY_BINDING_CACHE_RESPONSE(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var CountOfEntries: UInt = 0u,
    public var Entries: Long = 0L,
)

public data class KERB_QUERY_DOMAIN_EXTENDED_POLICIES_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var Flags: UInt = 0u,
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class KERB_QUERY_DOMAIN_EXTENDED_POLICIES_RESPONSE(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var Flags: UInt = 0u,
    public var ExtendedPolicies: UInt = 0u,
    public var DsFlags: UInt = 0u,
)

public data class KERB_QUERY_KDC_PROXY_CACHE_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var Flags: UInt = 0u,
    public var LogonId: LUID = LUID(),
)

public data class KERB_QUERY_KDC_PROXY_CACHE_RESPONSE(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var CountOfEntries: UInt = 0u,
    public var Entries: Long = 0L,
)

public data class KERB_QUERY_S4U2PROXY_CACHE_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var Flags: UInt = 0u,
    public var LogonId: LUID = LUID(),
)

public data class KERB_QUERY_S4U2PROXY_CACHE_RESPONSE(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var CountOfCreds: UInt = 0u,
    public var Creds: Long = 0L,
)

public data class KERB_QUERY_TKT_CACHE_EX2_RESPONSE(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var CountOfTickets: UInt = 0u,
    public var Tickets: List<KERB_TICKET_CACHE_INFO_EX2> = List(1) { KERB_TICKET_CACHE_INFO_EX2() },
)

public data class KERB_QUERY_TKT_CACHE_EX3_RESPONSE(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var CountOfTickets: UInt = 0u,
    public var Tickets: List<KERB_TICKET_CACHE_INFO_EX3> = List(1) { KERB_TICKET_CACHE_INFO_EX3() },
)

public data class KERB_QUERY_TKT_CACHE_EX_RESPONSE(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var CountOfTickets: UInt = 0u,
    public var Tickets: List<KERB_TICKET_CACHE_INFO_EX> = List(1) { KERB_TICKET_CACHE_INFO_EX() },
)

public data class KERB_QUERY_TKT_CACHE_REQUEST(public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0, public var LogonId: LUID = LUID())

public data class KERB_QUERY_TKT_CACHE_RESPONSE(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var CountOfTickets: UInt = 0u,
    public var Tickets: List<KERB_TICKET_CACHE_INFO> = List(1) { KERB_TICKET_CACHE_INFO() },
)

public data class KERB_REFRESH_POLICY_REQUEST(public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0, public var Flags: UInt = 0u)

public data class KERB_REFRESH_POLICY_RESPONSE(public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0, public var Flags: UInt = 0u)

public data class KERB_REFRESH_SCCRED_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var CredentialBlob: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LogonId: LUID = LUID(),
    public var Flags: UInt = 0u,
)

public data class KERB_RETRIEVE_KEY_TAB_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var Flags: UInt = 0u,
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Password: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class KERB_RETRIEVE_KEY_TAB_RESPONSE(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var KeyTabLength: UInt = 0u,
    public var KeyTab: Long = 0L,
)

public data class KERB_RETRIEVE_TKT_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var LogonId: LUID = LUID(),
    public var TargetName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var TicketFlags: UInt = 0u,
    public var CacheOptions: UInt = 0u,
    public var EncryptionType: KERB_CRYPTO_KEY_TYPE = 0,
    public var CredentialsHandle: SecHandle = SecHandle(),
)

public data class KERB_RETRIEVE_TKT_RESPONSE(public var Ticket: KERB_EXTERNAL_TICKET = KERB_EXTERNAL_TICKET())

public data class KERB_S4U2PROXY_CACHE_ENTRY_INFO(
    public var ServerName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Flags: UInt = 0u,
    public var LastStatus: NTSTATUS = 0,
    public var Expiry: Long = 0L,
)

public data class KERB_S4U2PROXY_CRED(
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Flags: UInt = 0u,
    public var LastStatus: NTSTATUS = 0,
    public var Expiry: Long = 0L,
    public var CountOfEntries: UInt = 0u,
    public var Entries: Long = 0L,
)

public data class KERB_S4U_LOGON(
    public var MessageType: KERB_LOGON_SUBMIT_TYPE = 0,
    public var Flags: UInt = 0u,
    public var ClientUpn: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ClientRealm: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class KERB_SETPASSWORD_EX_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var LogonId: LUID = LUID(),
    public var CredentialsHandle: SecHandle = SecHandle(),
    public var Flags: UInt = 0u,
    public var AccountRealm: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var AccountName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Password: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ClientRealm: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ClientName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Impersonating: Boolean = false,
    public var KdcAddress: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var KdcAddressType: UInt = 0u,
)

public data class KERB_SETPASSWORD_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var LogonId: LUID = LUID(),
    public var CredentialsHandle: SecHandle = SecHandle(),
    public var Flags: UInt = 0u,
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var AccountName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Password: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class KERB_SMART_CARD_LOGON(
    public var MessageType: KERB_LOGON_SUBMIT_TYPE = 0,
    public var Pin: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var CspDataLength: UInt = 0u,
    public var CspData: Long = 0L,
)

public data class KERB_SMART_CARD_PROFILE(
    public var Profile: KERB_INTERACTIVE_PROFILE = KERB_INTERACTIVE_PROFILE(),
    public var CertificateSize: UInt = 0u,
    public var CertificateData: Long = 0L,
)

public data class KERB_SMART_CARD_UNLOCK_LOGON(public var Logon: KERB_SMART_CARD_LOGON = KERB_SMART_CARD_LOGON(), public var LogonId: LUID = LUID())

public data class KERB_SUBMIT_TKT_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var LogonId: LUID = LUID(),
    public var Flags: UInt = 0u,
    public var Key: KERB_CRYPTO_KEY32 = KERB_CRYPTO_KEY32(),
    public var KerbCredSize: UInt = 0u,
    public var KerbCredOffset: UInt = 0u,
)

public data class KERB_TICKET_CACHE_INFO(
    public var ServerName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var RealmName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var StartTime: Long = 0L,
    public var EndTime: Long = 0L,
    public var RenewTime: Long = 0L,
    public var EncryptionType: Int = 0,
    public var TicketFlags: KERB_TICKET_FLAGS = 0u,
)

public data class KERB_TICKET_CACHE_INFO_EX(
    public var ClientName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ClientRealm: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ServerName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ServerRealm: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var StartTime: Long = 0L,
    public var EndTime: Long = 0L,
    public var RenewTime: Long = 0L,
    public var EncryptionType: Int = 0,
    public var TicketFlags: UInt = 0u,
)

public data class KERB_TICKET_CACHE_INFO_EX2(
    public var ClientName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ClientRealm: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ServerName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ServerRealm: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var StartTime: Long = 0L,
    public var EndTime: Long = 0L,
    public var RenewTime: Long = 0L,
    public var EncryptionType: Int = 0,
    public var TicketFlags: UInt = 0u,
    public var SessionKeyType: UInt = 0u,
    public var BranchId: UInt = 0u,
)

public data class KERB_TICKET_CACHE_INFO_EX3(
    public var ClientName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ClientRealm: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ServerName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ServerRealm: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var StartTime: Long = 0L,
    public var EndTime: Long = 0L,
    public var RenewTime: Long = 0L,
    public var EncryptionType: Int = 0,
    public var TicketFlags: UInt = 0u,
    public var SessionKeyType: UInt = 0u,
    public var BranchId: UInt = 0u,
    public var CacheFlags: UInt = 0u,
    public var KdcCalled: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class KERB_TICKET_LOGON(
    public var MessageType: KERB_LOGON_SUBMIT_TYPE = 0,
    public var Flags: UInt = 0u,
    public var ServiceTicketLength: UInt = 0u,
    public var TicketGrantingTicketLength: UInt = 0u,
    public var ServiceTicket: Long = 0L,
    public var TicketGrantingTicket: Long = 0L,
)

public data class KERB_TICKET_PROFILE(public var Profile: KERB_INTERACTIVE_PROFILE = KERB_INTERACTIVE_PROFILE(), public var SessionKey: KERB_CRYPTO_KEY = KERB_CRYPTO_KEY())

public data class KERB_TICKET_UNLOCK_LOGON(public var Logon: KERB_TICKET_LOGON = KERB_TICKET_LOGON(), public var LogonId: LUID = LUID())

public data class KERB_TRANSFER_CRED_REQUEST(
    public var MessageType: KERB_PROTOCOL_MESSAGE_TYPE = 0,
    public var OriginLogonId: LUID = LUID(),
    public var DestinationLogonId: LUID = LUID(),
    public var Flags: UInt = 0u,
)

public data class KSEC_LIST_ENTRY(
    public var List: LIST_ENTRY = LIST_ENTRY(),
    public var RefCount: Int = 0,
    public var Signature: UInt = 0u,
    public var OwningList: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class LOGON_HOURS(public var UnitsPerWeek: UShort = 0u, public var LogonHours: Long = 0L)

public data class LSA_AUTH_INFORMATION(
    public var LastUpdateTime: Long = 0L,
    public var AuthType: LSA_AUTH_INFORMATION_AUTH_TYPE = 0u,
    public var AuthInfoLength: UInt = 0u,
    public var AuthInfo: Long = 0L,
)

public data class LSA_DISPATCH_TABLE(
    public var CreateLogonSession: PLSA_CREATE_LOGON_SESSION = null,
    public var DeleteLogonSession: PLSA_DELETE_LOGON_SESSION = null,
    public var AddCredential: PLSA_ADD_CREDENTIAL = null,
    public var GetCredentials: PLSA_GET_CREDENTIALS = null,
    public var DeleteCredential: PLSA_DELETE_CREDENTIAL = null,
    public var AllocateLsaHeap: PLSA_ALLOCATE_LSA_HEAP = null,
    public var FreeLsaHeap: PLSA_FREE_LSA_HEAP = null,
    public var AllocateClientBuffer: PLSA_ALLOCATE_CLIENT_BUFFER = null,
    public var FreeClientBuffer: PLSA_FREE_CLIENT_BUFFER = null,
    public var CopyToClientBuffer: PLSA_COPY_TO_CLIENT_BUFFER = null,
    public var CopyFromClientBuffer: PLSA_COPY_FROM_CLIENT_BUFFER = null,
)

public data class LSA_ENUMERATION_INFORMATION(public var Sid: PSID = 0L)

public data class LSA_FOREST_TRUST_BINARY_DATA(public var Length: UInt = 0u, public var Buffer: Long = 0L)

public data class LSA_FOREST_TRUST_COLLISION_INFORMATION(public var RecordCount: UInt = 0u, public var Entries: Long = 0L)

public data class LSA_FOREST_TRUST_COLLISION_RECORD(
    public var Index: UInt = 0u,
    public var Type: LSA_FOREST_TRUST_COLLISION_RECORD_TYPE = 0,
    public var Flags: UInt = 0u,
    public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class LSA_FOREST_TRUST_DOMAIN_INFO(
    public var Sid: PSID = 0L,
    public var DnsName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var NetbiosName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class LSA_FOREST_TRUST_INFORMATION(public var RecordCount: UInt = 0u, public var Entries: Long = 0L)

public data class LSA_FOREST_TRUST_INFORMATION2(public var RecordCount: UInt = 0u, public var Entries: Long = 0L)

public data class LSA_FOREST_TRUST_RECORD(
    public var Flags: UInt = 0u,
    public var ForestTrustType: LSA_FOREST_TRUST_RECORD_TYPE = 0,
    public var Time: Long = 0L,
    public var ForestTrustData: LSA_FOREST_TRUST_RECORD_0 = LSA_FOREST_TRUST_RECORD_0(),
)

public data class LSA_FOREST_TRUST_RECORD_0(
    public var TopLevelName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainInfo: LSA_FOREST_TRUST_DOMAIN_INFO = LSA_FOREST_TRUST_DOMAIN_INFO(),
    public var Data: LSA_FOREST_TRUST_BINARY_DATA = LSA_FOREST_TRUST_BINARY_DATA(),
)

public data class LSA_FOREST_TRUST_RECORD2(
    public var Flags: UInt = 0u,
    public var ForestTrustType: LSA_FOREST_TRUST_RECORD_TYPE = 0,
    public var Time: Long = 0L,
    public var ForestTrustData: LSA_FOREST_TRUST_RECORD2_0 = LSA_FOREST_TRUST_RECORD2_0(),
)

public data class LSA_FOREST_TRUST_RECORD2_0(
    public var TopLevelName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainInfo: LSA_FOREST_TRUST_DOMAIN_INFO = LSA_FOREST_TRUST_DOMAIN_INFO(),
    public var BinaryData: LSA_FOREST_TRUST_BINARY_DATA = LSA_FOREST_TRUST_BINARY_DATA(),
    public var ScannerInfo: LSA_FOREST_TRUST_SCANNER_INFO = LSA_FOREST_TRUST_SCANNER_INFO(),
)

public data class LSA_FOREST_TRUST_SCANNER_INFO(
    public var DomainSid: PSID = 0L,
    public var DnsName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var NetbiosName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class LSA_LAST_INTER_LOGON_INFO(
    public var LastSuccessfulLogon: Long = 0L,
    public var LastFailedLogon: Long = 0L,
    public var FailedAttemptCountSinceLastSuccessfulLogon: UInt = 0u,
)

public data class LSA_OBJECT_ATTRIBUTES(
    public var Length: UInt = 0u,
    public var RootDirectory: HANDLE = 0L,
    public var ObjectName: Long = 0L,
    public var Attributes: UInt = 0u,
    public var SecurityDescriptor: Long = 0L,
    public var SecurityQualityOfService: Long = 0L,
)

public data class LSA_REFERENCED_DOMAIN_LIST(public var Entries: UInt = 0u, public var Domains: Long = 0L)

public class LSA_SECPKG_FUNCTION_TABLE(
    public var CreateLogonSession: PLSA_CREATE_LOGON_SESSION = null,
    public var DeleteLogonSession: PLSA_DELETE_LOGON_SESSION = null,
    public var AddCredential: PLSA_ADD_CREDENTIAL = null,
    public var GetCredentials: PLSA_GET_CREDENTIALS = null,
    public var DeleteCredential: PLSA_DELETE_CREDENTIAL = null,
    public var AllocateLsaHeap: PLSA_ALLOCATE_LSA_HEAP = null,
    public var FreeLsaHeap: PLSA_FREE_LSA_HEAP = null,
    public var AllocateClientBuffer: PLSA_ALLOCATE_CLIENT_BUFFER = null,
    public var FreeClientBuffer: PLSA_FREE_CLIENT_BUFFER = null,
    public var CopyToClientBuffer: PLSA_COPY_TO_CLIENT_BUFFER = null,
    public var CopyFromClientBuffer: PLSA_COPY_FROM_CLIENT_BUFFER = null,
    public var ImpersonateClient: PLSA_IMPERSONATE_CLIENT = null,
    public var UnloadPackage: PLSA_UNLOAD_PACKAGE = null,
    public var DuplicateHandle: PLSA_DUPLICATE_HANDLE = null,
    public var SaveSupplementalCredentials: PLSA_SAVE_SUPPLEMENTAL_CREDENTIALS = null,
    public var CreateThread: PLSA_CREATE_THREAD = null,
    public var GetClientInfo: PLSA_GET_CLIENT_INFO = null,
    public var RegisterNotification: PLSA_REGISTER_NOTIFICATION = null,
    public var CancelNotification: PLSA_CANCEL_NOTIFICATION = null,
    public var MapBuffer: PLSA_MAP_BUFFER = null,
    public var CreateToken: PLSA_CREATE_TOKEN = null,
    public var AuditLogon: PLSA_AUDIT_LOGON = null,
    public var CallPackage: PLSA_CALL_PACKAGE = null,
    public var FreeReturnBuffer: PLSA_FREE_LSA_HEAP = null,
    public var GetCallInfo: PLSA_GET_CALL_INFO = null,
    public var CallPackageEx: PLSA_CALL_PACKAGEEX = null,
    public var CreateSharedMemory: PLSA_CREATE_SHARED_MEMORY = null,
    public var AllocateSharedMemory: PLSA_ALLOCATE_SHARED_MEMORY = null,
    public var FreeSharedMemory: PLSA_FREE_SHARED_MEMORY = null,
    public var DeleteSharedMemory: PLSA_DELETE_SHARED_MEMORY = null,
    public var OpenSamUser: PLSA_OPEN_SAM_USER = null,
    public var GetUserCredentials: PLSA_GET_USER_CREDENTIALS = null,
    public var GetUserAuthData: PLSA_GET_USER_AUTH_DATA = null,
    public var CloseSamUser: PLSA_CLOSE_SAM_USER = null,
    public var ConvertAuthDataToToken: PLSA_CONVERT_AUTH_DATA_TO_TOKEN = null,
    public var ClientCallback: PLSA_CLIENT_CALLBACK = null,
    public var UpdateCredentials: PLSA_UPDATE_PRIMARY_CREDENTIALS = null,
    public var GetAuthDataForUser: PLSA_GET_AUTH_DATA_FOR_USER = null,
    public var CrackSingleName: PLSA_CRACK_SINGLE_NAME = null,
    public var AuditAccountLogon: PLSA_AUDIT_ACCOUNT_LOGON = null,
    public var CallPackagePassthrough: PLSA_CALL_PACKAGE_PASSTHROUGH = null,
    public var CrediRead: CredReadFn = null,
    public var CrediReadDomainCredentials: CredReadDomainCredentialsFn = null,
    public var CrediFreeCredentials: CredFreeCredentialsFn = null,
    public var LsaProtectMemory: PLSA_PROTECT_MEMORY = null,
    public var LsaUnprotectMemory: PLSA_PROTECT_MEMORY = null,
    public var OpenTokenByLogonId: PLSA_OPEN_TOKEN_BY_LOGON_ID = null,
    public var ExpandAuthDataForDomain: PLSA_EXPAND_AUTH_DATA_FOR_DOMAIN = null,
    public var AllocatePrivateHeap: PLSA_ALLOCATE_PRIVATE_HEAP = null,
    public var FreePrivateHeap: PLSA_FREE_PRIVATE_HEAP = null,
    public var CreateTokenEx: PLSA_CREATE_TOKEN_EX = null,
    public var CrediWrite: CredWriteFn = null,
    public var CrediUnmarshalandDecodeString: CrediUnmarshalandDecodeStringFn = null,
    public var DummyFunction6: PLSA_PROTECT_MEMORY = null,
    public var GetExtendedCallFlags: PLSA_GET_EXTENDED_CALL_FLAGS = null,
    public var DuplicateTokenHandle: PLSA_DUPLICATE_HANDLE = null,
    public var GetServiceAccountPassword: PLSA_GET_SERVICE_ACCOUNT_PASSWORD = null,
    public var DummyFunction7: PLSA_PROTECT_MEMORY = null,
    public var AuditLogonEx: PLSA_AUDIT_LOGON_EX = null,
    public var CheckProtectedUserByToken: PLSA_CHECK_PROTECTED_USER_BY_TOKEN = null,
    public var QueryClientRequest: PLSA_QUERY_CLIENT_REQUEST = null,
    public var GetAppModeInfo: PLSA_GET_APP_MODE_INFO = null,
    public var SetAppModeInfo: PLSA_SET_APP_MODE_INFO = null,
    public var GetClientInfoEx: PLSA_GET_CLIENT_INFO_EX = null,
)

public data class LSA_STRING(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Buffer: PSTR = 0L,
)

public data class LSA_TOKEN_INFORMATION_NULL(public var ExpirationTime: Long = 0L, public var Groups: Long = 0L)

public data class LSA_TOKEN_INFORMATION_V1(
    public var ExpirationTime: Long = 0L,
    public var User: TOKEN_USER = TOKEN_USER(),
    public var Groups: Long = 0L,
    public var PrimaryGroup: TOKEN_PRIMARY_GROUP = TOKEN_PRIMARY_GROUP(),
    public var Privileges: Long = 0L,
    public var Owner: TOKEN_OWNER = TOKEN_OWNER(),
    public var DefaultDacl: TOKEN_DEFAULT_DACL = TOKEN_DEFAULT_DACL(),
)

public data class LSA_TOKEN_INFORMATION_V3(
    public var ExpirationTime: Long = 0L,
    public var User: TOKEN_USER = TOKEN_USER(),
    public var Groups: Long = 0L,
    public var PrimaryGroup: TOKEN_PRIMARY_GROUP = TOKEN_PRIMARY_GROUP(),
    public var Privileges: Long = 0L,
    public var Owner: TOKEN_OWNER = TOKEN_OWNER(),
    public var DefaultDacl: TOKEN_DEFAULT_DACL = TOKEN_DEFAULT_DACL(),
    public var UserClaims: TOKEN_USER_CLAIMS = TOKEN_USER_CLAIMS(),
    public var DeviceClaims: TOKEN_DEVICE_CLAIMS = TOKEN_DEVICE_CLAIMS(),
    public var DeviceGroups: Long = 0L,
)

public data class LSA_TRANSLATED_NAME(
    public var Use: SID_NAME_USE = 0,
    public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainIndex: Int = 0,
)

public data class LSA_TRANSLATED_SID(
    public var Use: SID_NAME_USE = 0,
    public var RelativeId: UInt = 0u,
    public var DomainIndex: Int = 0,
)

public data class LSA_TRANSLATED_SID2(
    public var Use: SID_NAME_USE = 0,
    public var Sid: PSID = 0L,
    public var DomainIndex: Int = 0,
    public var Flags: UInt = 0u,
)

public data class LSA_TRUST_INFORMATION(public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING(), public var Sid: PSID = 0L)

public data class LSA_UNICODE_STRING(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Buffer: PWSTR = 0L,
)

public data class MSV1_0_AV_PAIR(public var AvId: UShort = 0u, public var AvLen: UShort = 0u)

public data class MSV1_0_CHANGEPASSWORD_REQUEST(
    public var MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE = 0,
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var AccountName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var OldPassword: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var NewPassword: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Impersonating: Boolean = false,
)

public data class MSV1_0_CHANGEPASSWORD_RESPONSE(
    public var MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE = 0,
    public var PasswordInfoValid: Boolean = false,
    public var DomainPasswordInfo: DOMAIN_PASSWORD_INFORMATION = DOMAIN_PASSWORD_INFORMATION(),
)

public data class MSV1_0_CREDENTIAL_KEY(public var Data: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_CREDENTIAL_KEY) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Data.contentHashCode()
    }
}

public data class MSV1_0_INTERACTIVE_LOGON(
    public var MessageType: MSV1_0_LOGON_SUBMIT_TYPE = 0,
    public var LogonDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Password: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class MSV1_0_INTERACTIVE_PROFILE(
    public var MessageType: MSV1_0_PROFILE_BUFFER_TYPE = 0,
    public var LogonCount: UShort = 0u,
    public var BadPasswordCount: UShort = 0u,
    public var LogonTime: Long = 0L,
    public var LogoffTime: Long = 0L,
    public var KickOffTime: Long = 0L,
    public var PasswordLastSet: Long = 0L,
    public var PasswordCanChange: Long = 0L,
    public var PasswordMustChange: Long = 0L,
    public var LogonScript: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var HomeDirectory: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var FullName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ProfilePath: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var HomeDirectoryDrive: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LogonServer: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserFlags: UInt = 0u,
)

public data class MSV1_0_IUM_SUPPLEMENTAL_CREDENTIAL(
    public var Version: UInt = 0u,
    public var EncryptedCredsSize: UInt = 0u,
    public var EncryptedCreds: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_IUM_SUPPLEMENTAL_CREDENTIAL) return false
        if (this.Version != other.Version) return false
        if (this.EncryptedCredsSize != other.EncryptedCredsSize) return false
        if (!this.EncryptedCreds.contentEquals(other.EncryptedCreds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.EncryptedCredsSize.hashCode()
        result = 31 * result + this.EncryptedCreds.contentHashCode()
        return result
    }
}

public data class MSV1_0_LM20_LOGON(
    public var MessageType: MSV1_0_LOGON_SUBMIT_TYPE = 0,
    public var LogonDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Workstation: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ChallengeToClient: UByteArray = UByteArray(8),
    public var CaseSensitiveChallengeResponse: LSA_STRING = LSA_STRING(),
    public var CaseInsensitiveChallengeResponse: LSA_STRING = LSA_STRING(),
    public var ParameterControl: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_LM20_LOGON) return false
        if (this.MessageType != other.MessageType) return false
        if (this.LogonDomainName != other.LogonDomainName) return false
        if (this.UserName != other.UserName) return false
        if (this.Workstation != other.Workstation) return false
        if (!this.ChallengeToClient.contentEquals(other.ChallengeToClient)) return false
        if (this.CaseSensitiveChallengeResponse != other.CaseSensitiveChallengeResponse) return false
        if (this.CaseInsensitiveChallengeResponse != other.CaseInsensitiveChallengeResponse) return false
        if (this.ParameterControl != other.ParameterControl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageType.hashCode()
        result = 31 * result + this.LogonDomainName.hashCode()
        result = 31 * result + this.UserName.hashCode()
        result = 31 * result + this.Workstation.hashCode()
        result = 31 * result + this.ChallengeToClient.contentHashCode()
        result = 31 * result + this.CaseSensitiveChallengeResponse.hashCode()
        result = 31 * result + this.CaseInsensitiveChallengeResponse.hashCode()
        result = 31 * result + this.ParameterControl.hashCode()
        return result
    }
}

public data class MSV1_0_LM20_LOGON_PROFILE(
    public var MessageType: MSV1_0_PROFILE_BUFFER_TYPE = 0,
    public var KickOffTime: Long = 0L,
    public var LogoffTime: Long = 0L,
    public var UserFlags: MSV_SUB_AUTHENTICATION_FILTER = 0u,
    public var UserSessionKey: UByteArray = UByteArray(16),
    public var LogonDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LanmanSessionKey: UByteArray = UByteArray(8),
    public var LogonServer: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserParameters: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_LM20_LOGON_PROFILE) return false
        if (this.MessageType != other.MessageType) return false
        if (this.KickOffTime != other.KickOffTime) return false
        if (this.LogoffTime != other.LogoffTime) return false
        if (this.UserFlags != other.UserFlags) return false
        if (!this.UserSessionKey.contentEquals(other.UserSessionKey)) return false
        if (this.LogonDomainName != other.LogonDomainName) return false
        if (!this.LanmanSessionKey.contentEquals(other.LanmanSessionKey)) return false
        if (this.LogonServer != other.LogonServer) return false
        if (this.UserParameters != other.UserParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageType.hashCode()
        result = 31 * result + this.KickOffTime.hashCode()
        result = 31 * result + this.LogoffTime.hashCode()
        result = 31 * result + this.UserFlags.hashCode()
        result = 31 * result + this.UserSessionKey.contentHashCode()
        result = 31 * result + this.LogonDomainName.hashCode()
        result = 31 * result + this.LanmanSessionKey.contentHashCode()
        result = 31 * result + this.LogonServer.hashCode()
        result = 31 * result + this.UserParameters.hashCode()
        return result
    }
}

public data class MSV1_0_NTLM3_RESPONSE(
    public var Response: UByteArray = UByteArray(16),
    public var RespType: UByte = 0u,
    public var HiRespType: UByte = 0u,
    public var Flags: UShort = 0u,
    public var MsgWord: UInt = 0u,
    public var TimeStamp: ULong = 0uL,
    public var ChallengeFromClient: UByteArray = UByteArray(8),
    public var AvPairsOff: UInt = 0u,
    public var Buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_NTLM3_RESPONSE) return false
        if (!this.Response.contentEquals(other.Response)) return false
        if (this.RespType != other.RespType) return false
        if (this.HiRespType != other.HiRespType) return false
        if (this.Flags != other.Flags) return false
        if (this.MsgWord != other.MsgWord) return false
        if (this.TimeStamp != other.TimeStamp) return false
        if (!this.ChallengeFromClient.contentEquals(other.ChallengeFromClient)) return false
        if (this.AvPairsOff != other.AvPairsOff) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Response.contentHashCode()
        result = 31 * result + this.RespType.hashCode()
        result = 31 * result + this.HiRespType.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.MsgWord.hashCode()
        result = 31 * result + this.TimeStamp.hashCode()
        result = 31 * result + this.ChallengeFromClient.contentHashCode()
        result = 31 * result + this.AvPairsOff.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class MSV1_0_PASSTHROUGH_REQUEST(
    public var MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE = 0,
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var PackageName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DataLength: UInt = 0u,
    public var LogonData: Long = 0L,
    public var Pad: UInt = 0u,
)

public data class MSV1_0_PASSTHROUGH_RESPONSE(
    public var MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE = 0,
    public var Pad: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var ValidationData: Long = 0L,
)

public data class MSV1_0_REMOTE_SUPPLEMENTAL_CREDENTIAL(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var CredentialKey: MSV1_0_CREDENTIAL_KEY = MSV1_0_CREDENTIAL_KEY(),
    public var CredentialKeyType: MSV1_0_CREDENTIAL_KEY_TYPE = 0,
    public var EncryptedCredsSize: UInt = 0u,
    public var EncryptedCreds: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_REMOTE_SUPPLEMENTAL_CREDENTIAL) return false
        if (this.Version != other.Version) return false
        if (this.Flags != other.Flags) return false
        if (this.CredentialKey != other.CredentialKey) return false
        if (this.CredentialKeyType != other.CredentialKeyType) return false
        if (this.EncryptedCredsSize != other.EncryptedCredsSize) return false
        if (!this.EncryptedCreds.contentEquals(other.EncryptedCreds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.CredentialKey.hashCode()
        result = 31 * result + this.CredentialKeyType.hashCode()
        result = 31 * result + this.EncryptedCredsSize.hashCode()
        result = 31 * result + this.EncryptedCreds.contentHashCode()
        return result
    }
}

public data class MSV1_0_S4U_LOGON(
    public var MessageType: MSV1_0_LOGON_SUBMIT_TYPE = 0,
    public var Flags: UInt = 0u,
    public var UserPrincipalName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class MSV1_0_SUBAUTH_LOGON(
    public var MessageType: MSV1_0_LOGON_SUBMIT_TYPE = 0,
    public var LogonDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Workstation: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ChallengeToClient: UByteArray = UByteArray(8),
    public var AuthenticationInfo1: LSA_STRING = LSA_STRING(),
    public var AuthenticationInfo2: LSA_STRING = LSA_STRING(),
    public var ParameterControl: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 0u,
    public var SubAuthPackageId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_SUBAUTH_LOGON) return false
        if (this.MessageType != other.MessageType) return false
        if (this.LogonDomainName != other.LogonDomainName) return false
        if (this.UserName != other.UserName) return false
        if (this.Workstation != other.Workstation) return false
        if (!this.ChallengeToClient.contentEquals(other.ChallengeToClient)) return false
        if (this.AuthenticationInfo1 != other.AuthenticationInfo1) return false
        if (this.AuthenticationInfo2 != other.AuthenticationInfo2) return false
        if (this.ParameterControl != other.ParameterControl) return false
        if (this.SubAuthPackageId != other.SubAuthPackageId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageType.hashCode()
        result = 31 * result + this.LogonDomainName.hashCode()
        result = 31 * result + this.UserName.hashCode()
        result = 31 * result + this.Workstation.hashCode()
        result = 31 * result + this.ChallengeToClient.contentHashCode()
        result = 31 * result + this.AuthenticationInfo1.hashCode()
        result = 31 * result + this.AuthenticationInfo2.hashCode()
        result = 31 * result + this.ParameterControl.hashCode()
        result = 31 * result + this.SubAuthPackageId.hashCode()
        return result
    }
}

public data class MSV1_0_SUBAUTH_REQUEST(
    public var MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE = 0,
    public var SubAuthPackageId: UInt = 0u,
    public var SubAuthInfoLength: UInt = 0u,
    public var SubAuthSubmitBuffer: Long = 0L,
)

public data class MSV1_0_SUBAUTH_RESPONSE(
    public var MessageType: MSV1_0_PROTOCOL_MESSAGE_TYPE = 0,
    public var SubAuthInfoLength: UInt = 0u,
    public var SubAuthReturnBuffer: Long = 0L,
)

public data class MSV1_0_SUPPLEMENTAL_CREDENTIAL(
    public var Version: UInt = 0u,
    public var Flags: MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS = 0u,
    public var LmPassword: UByteArray = UByteArray(16),
    public var NtPassword: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_SUPPLEMENTAL_CREDENTIAL) return false
        if (this.Version != other.Version) return false
        if (this.Flags != other.Flags) return false
        if (!this.LmPassword.contentEquals(other.LmPassword)) return false
        if (!this.NtPassword.contentEquals(other.NtPassword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.LmPassword.contentHashCode()
        result = 31 * result + this.NtPassword.contentHashCode()
        return result
    }
}

public data class MSV1_0_SUPPLEMENTAL_CREDENTIAL_V2(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var NtPassword: UByteArray = UByteArray(16),
    public var CredentialKey: MSV1_0_CREDENTIAL_KEY = MSV1_0_CREDENTIAL_KEY(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_SUPPLEMENTAL_CREDENTIAL_V2) return false
        if (this.Version != other.Version) return false
        if (this.Flags != other.Flags) return false
        if (!this.NtPassword.contentEquals(other.NtPassword)) return false
        if (this.CredentialKey != other.CredentialKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.NtPassword.contentHashCode()
        result = 31 * result + this.CredentialKey.hashCode()
        return result
    }
}

public data class MSV1_0_SUPPLEMENTAL_CREDENTIAL_V3(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var CredentialKeyType: MSV1_0_CREDENTIAL_KEY_TYPE = 0,
    public var NtPassword: UByteArray = UByteArray(16),
    public var CredentialKey: MSV1_0_CREDENTIAL_KEY = MSV1_0_CREDENTIAL_KEY(),
    public var ShaPassword: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSV1_0_SUPPLEMENTAL_CREDENTIAL_V3) return false
        if (this.Version != other.Version) return false
        if (this.Flags != other.Flags) return false
        if (this.CredentialKeyType != other.CredentialKeyType) return false
        if (!this.NtPassword.contentEquals(other.NtPassword)) return false
        if (this.CredentialKey != other.CredentialKey) return false
        if (!this.ShaPassword.contentEquals(other.ShaPassword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.CredentialKeyType.hashCode()
        result = 31 * result + this.NtPassword.contentHashCode()
        result = 31 * result + this.CredentialKey.hashCode()
        result = 31 * result + this.ShaPassword.contentHashCode()
        return result
    }
}

public data class MSV1_0_VALIDATION_INFO(
    public var LogoffTime: Long = 0L,
    public var KickoffTime: Long = 0L,
    public var LogonServer: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LogonDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var SessionKey: USER_SESSION_KEY = USER_SESSION_KEY(),
    public var Authoritative: Boolean = false,
    public var UserFlags: UInt = 0u,
    public var WhichFields: UInt = 0u,
    public var UserId: UInt = 0u,
)

public data class NEGOTIATE_CALLER_NAME_REQUEST(public var MessageType: UInt = 0u, public var LogonId: LUID = LUID())

public data class NEGOTIATE_CALLER_NAME_RESPONSE(public var MessageType: UInt = 0u, public var CallerName: PWSTR = 0L)

public data class NEGOTIATE_PACKAGE_PREFIX(
    public var PackageId: ULong = 0uL,
    public var PackageDataA: Long = 0L,
    public var PackageDataW: Long = 0L,
    public var PrefixLen: ULong = 0uL,
    public var Prefix: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NEGOTIATE_PACKAGE_PREFIX) return false
        if (this.PackageId != other.PackageId) return false
        if (this.PackageDataA != other.PackageDataA) return false
        if (this.PackageDataW != other.PackageDataW) return false
        if (this.PrefixLen != other.PrefixLen) return false
        if (!this.Prefix.contentEquals(other.Prefix)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PackageId.hashCode()
        result = 31 * result + this.PackageDataA.hashCode()
        result = 31 * result + this.PackageDataW.hashCode()
        result = 31 * result + this.PrefixLen.hashCode()
        result = 31 * result + this.Prefix.contentHashCode()
        return result
    }
}

public data class NEGOTIATE_PACKAGE_PREFIXES(
    public var MessageType: UInt = 0u,
    public var PrefixCount: UInt = 0u,
    public var Offset: UInt = 0u,
    public var Pad: UInt = 0u,
)

public data class NETLOGON_GENERIC_INFO(
    public var Identity: NETLOGON_LOGON_IDENTITY_INFO = NETLOGON_LOGON_IDENTITY_INFO(),
    public var PackageName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DataLength: UInt = 0u,
    public var LogonData: Long = 0L,
)

public data class NETLOGON_INTERACTIVE_INFO(
    public var Identity: NETLOGON_LOGON_IDENTITY_INFO = NETLOGON_LOGON_IDENTITY_INFO(),
    public var LmOwfPassword: LM_OWF_PASSWORD = LM_OWF_PASSWORD(),
    public var NtOwfPassword: LM_OWF_PASSWORD = LM_OWF_PASSWORD(),
)

public data class NETLOGON_LOGON_IDENTITY_INFO(
    public var LogonDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ParameterControl: UInt = 0u,
    public var LogonId: Long = 0L,
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Workstation: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public data class NETLOGON_NETWORK_INFO(
    public var Identity: NETLOGON_LOGON_IDENTITY_INFO = NETLOGON_LOGON_IDENTITY_INFO(),
    public var LmChallenge: CLEAR_BLOCK = CLEAR_BLOCK(),
    public var NtChallengeResponse: LSA_STRING = LSA_STRING(),
    public var LmChallengeResponse: LSA_STRING = LSA_STRING(),
)

public data class NETLOGON_SERVICE_INFO(
    public var Identity: NETLOGON_LOGON_IDENTITY_INFO = NETLOGON_LOGON_IDENTITY_INFO(),
    public var LmOwfPassword: LM_OWF_PASSWORD = LM_OWF_PASSWORD(),
    public var NtOwfPassword: LM_OWF_PASSWORD = LM_OWF_PASSWORD(),
)

public data class PKU2U_CERTIFICATE_S4U_LOGON(
    public var MessageType: PKU2U_LOGON_SUBMIT_TYPE = 0,
    public var Flags: UInt = 0u,
    public var UserPrincipalName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var CertificateLength: UInt = 0u,
    public var Certificate: Long = 0L,
)

public data class PKU2U_CERT_BLOB(public var CertOffset: UInt = 0u, public var CertLength: UShort = 0u)

public data class PKU2U_CREDUI_CONTEXT(
    public var Version: ULong = 0uL,
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UInt = 0u,
    public var CertArrayCount: UShort = 0u,
    public var CertArrayOffset: UInt = 0u,
)

public data class POLICY_ACCOUNT_DOMAIN_INFO(public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(), public var DomainSid: PSID = 0L)

public data class POLICY_AUDIT_CATEGORIES_INFO(public var MaximumCategoryCount: UInt = 0u, public var SubCategoriesInfo: Long = 0L)

public data class POLICY_AUDIT_EVENTS_INFO(
    public var AuditingMode: Boolean = false,
    public var EventAuditingOptions: Long = 0L,
    public var MaximumAuditEventCount: UInt = 0u,
)

public data class POLICY_AUDIT_FULL_QUERY_INFO(public var ShutDownOnFull: Boolean = false, public var LogIsFull: Boolean = false)

public data class POLICY_AUDIT_FULL_SET_INFO(public var ShutDownOnFull: Boolean = false)

public data class POLICY_AUDIT_LOG_INFO(
    public var AuditLogPercentFull: UInt = 0u,
    public var MaximumLogSize: UInt = 0u,
    public var AuditRetentionPeriod: Long = 0L,
    public var AuditLogFullShutdownInProgress: Boolean = false,
    public var TimeToShutdown: Long = 0L,
    public var NextAuditRecordId: UInt = 0u,
)

public data class POLICY_AUDIT_SID_ARRAY(public var UsersCount: UInt = 0u, public var UserSidArray: Long = 0L)

public data class POLICY_AUDIT_SUBCATEGORIES_INFO(public var MaximumSubCategoryCount: UInt = 0u, public var EventAuditingOptions: Long = 0L)

public data class POLICY_DEFAULT_QUOTA_INFO(public var QuotaLimits: QUOTA_LIMITS = QUOTA_LIMITS())

public data class POLICY_DNS_DOMAIN_INFO(
    public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DnsDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DnsForestName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainGuid: GUID = GUID(),
    public var Sid: PSID = 0L,
)

public data class POLICY_DOMAIN_EFS_INFO(public var InfoLength: UInt = 0u, public var EfsBlob: Long = 0L)

public data class POLICY_DOMAIN_KERBEROS_TICKET_INFO(
    public var AuthenticationOptions: UInt = 0u,
    public var MaxServiceTicketAge: Long = 0L,
    public var MaxTicketAge: Long = 0L,
    public var MaxRenewAge: Long = 0L,
    public var MaxClockSkew: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class POLICY_LSA_SERVER_ROLE_INFO(public var LsaServerRole: POLICY_LSA_SERVER_ROLE = 0)

public data class POLICY_MACHINE_ACCT_INFO(public var Rid: UInt = 0u, public var Sid: PSID = 0L)

public data class POLICY_MACHINE_ACCT_INFO2(
    public var Rid: UInt = 0u,
    public var Sid: PSID = 0L,
    public var ObjectGuid: GUID = GUID(),
)

public data class POLICY_MODIFICATION_INFO(public var ModifiedId: Long = 0L, public var DatabaseCreationTime: Long = 0L)

public data class POLICY_PD_ACCOUNT_INFO(public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING())

public data class POLICY_PRIMARY_DOMAIN_INFO(public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING(), public var Sid: PSID = 0L)

public data class POLICY_REPLICA_SOURCE_INFO(public var ReplicaSource: LSA_UNICODE_STRING = LSA_UNICODE_STRING(), public var ReplicaAccountName: LSA_UNICODE_STRING = LSA_UNICODE_STRING())

public data class PctPublicKey(
    public var Type: UInt = 0u,
    public var cbKey: UInt = 0u,
    public var pKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PctPublicKey) return false
        if (this.Type != other.Type) return false
        if (this.cbKey != other.cbKey) return false
        if (!this.pKey.contentEquals(other.pKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.pKey.contentHashCode()
        return result
    }
}

public data class SAM_REGISTER_MAPPING_ELEMENT(
    public var Original: PSTR = 0L,
    public var Mapped: PSTR = 0L,
    public var Continuable: Boolean = false,
)

public data class SAM_REGISTER_MAPPING_LIST(public var Count: UInt = 0u, public var Elements: Long = 0L)

public data class SAM_REGISTER_MAPPING_TABLE(public var Count: UInt = 0u, public var Lists: Long = 0L)

public data class SCHANNEL_ALERT_TOKEN(
    public var dwTokenType: UInt = 0u,
    public var dwAlertType: SCHANNEL_ALERT_TOKEN_ALERT_TYPE = 0u,
    public var dwAlertNumber: UInt = 0u,
)

public data class SCHANNEL_CERT_HASH(
    public var dwLength: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hProv: ULong = 0uL,
    public var ShaHash: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCHANNEL_CERT_HASH) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hProv != other.hProv) return false
        if (!this.ShaHash.contentEquals(other.ShaHash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hProv.hashCode()
        result = 31 * result + this.ShaHash.contentHashCode()
        return result
    }
}

public data class SCHANNEL_CERT_HASH_STORE(
    public var dwLength: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hProv: ULong = 0uL,
    public var ShaHash: UByteArray = UByteArray(20),
    public var pwszStoreName: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCHANNEL_CERT_HASH_STORE) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hProv != other.hProv) return false
        if (!this.ShaHash.contentEquals(other.ShaHash)) return false
        if (!this.pwszStoreName.contentEquals(other.pwszStoreName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hProv.hashCode()
        result = 31 * result + this.ShaHash.contentHashCode()
        result = 31 * result + this.pwszStoreName.contentHashCode()
        return result
    }
}

public data class SCHANNEL_CLIENT_SIGNATURE(
    public var cbLength: UInt = 0u,
    public var aiHash: ALG_ID = 0u,
    public var cbHash: UInt = 0u,
    public var HashValue: UByteArray = UByteArray(36),
    public var CertThumbprint: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCHANNEL_CLIENT_SIGNATURE) return false
        if (this.cbLength != other.cbLength) return false
        if (this.aiHash != other.aiHash) return false
        if (this.cbHash != other.cbHash) return false
        if (!this.HashValue.contentEquals(other.HashValue)) return false
        if (!this.CertThumbprint.contentEquals(other.CertThumbprint)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLength.hashCode()
        result = 31 * result + this.aiHash.hashCode()
        result = 31 * result + this.cbHash.hashCode()
        result = 31 * result + this.HashValue.contentHashCode()
        result = 31 * result + this.CertThumbprint.contentHashCode()
        return result
    }
}

public data class SCHANNEL_CRED(
    public var dwVersion: UInt = 0u,
    public var cCreds: UInt = 0u,
    public var paCred: Long = 0L,
    public var hRootStore: HCERTSTORE = 0L,
    public var cMappers: UInt = 0u,
    public var aphMappers: Long = 0L,
    public var cSupportedAlgs: UInt = 0u,
    public var palgSupportedAlgs: Long = 0L,
    public var grbitEnabledProtocols: UInt = 0u,
    public var dwMinimumCipherStrength: UInt = 0u,
    public var dwMaximumCipherStrength: UInt = 0u,
    public var dwSessionLifespan: UInt = 0u,
    public var dwFlags: SCHANNEL_CRED_FLAGS = 0u,
    public var dwCredFormat: UInt = 0u,
)

public data class SCHANNEL_SESSION_TOKEN(public var dwTokenType: UInt = 0u, public var dwFlags: SCHANNEL_SESSION_TOKEN_FLAGS = 0u)

public data class SCH_CRED(
    public var dwVersion: UInt = 0u,
    public var cCreds: UInt = 0u,
    public var paSecret: Long = 0L,
    public var paPublic: Long = 0L,
    public var cMappers: UInt = 0u,
    public var aphMappers: Long = 0L,
)

public data class SCH_CREDENTIALS(
    public var dwVersion: UInt = 0u,
    public var dwCredFormat: UInt = 0u,
    public var cCreds: UInt = 0u,
    public var paCred: Long = 0L,
    public var hRootStore: HCERTSTORE = 0L,
    public var cMappers: UInt = 0u,
    public var aphMappers: Long = 0L,
    public var dwSessionLifespan: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cTlsParameters: UInt = 0u,
    public var pTlsParameters: Long = 0L,
)

public data class SCH_CRED_PUBLIC_CERTCHAIN(
    public var dwType: UInt = 0u,
    public var cbCertChain: UInt = 0u,
    public var pCertChain: Long = 0L,
)

public data class SCH_CRED_SECRET_CAPI(public var dwType: UInt = 0u, public var hProv: ULong = 0uL)

public data class SCH_CRED_SECRET_PRIVKEY(
    public var dwType: UInt = 0u,
    public var pPrivateKey: Long = 0L,
    public var cbPrivateKey: UInt = 0u,
    public var pszPassword: PSTR = 0L,
)

public data class SCH_EXTENSION_DATA(
    public var ExtensionType: UShort = 0u,
    public var pExtData: Long = 0L,
    public var cbExtData: UInt = 0u,
)

public data class SECPKG_APP_MODE_INFO(
    public var UserFunction: UInt = 0u,
    public var Argument1: ULong = 0uL,
    public var Argument2: ULong = 0uL,
    public var UserData: SecBuffer = SecBuffer(),
    public var ReturnToLsa: Boolean = false,
)

public data class SECPKG_BYTE_VECTOR(public var ByteArrayOffset: UInt = 0u, public var ByteArrayLength: UShort = 0u)

public data class SECPKG_CALL_INFO(
    public var ProcessId: UInt = 0u,
    public var ThreadId: UInt = 0u,
    public var Attributes: UInt = 0u,
    public var CallCount: UInt = 0u,
    public var MechOid: Long = 0L,
)

public data class SECPKG_CALL_PACKAGE_PIN_DC_REQUEST(
    public var MessageType: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DcName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DcFlags: UInt = 0u,
)

public data class SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST(
    public var MessageType: UInt = 0u,
    public var OriginLogonId: LUID = LUID(),
    public var DestinationLogonId: LUID = LUID(),
    public var Flags: UInt = 0u,
)

public data class SECPKG_CALL_PACKAGE_UNPIN_ALL_DCS_REQUEST(public var MessageType: UInt = 0u, public var Flags: UInt = 0u)

public data class SECPKG_CLIENT_INFO(
    public var LogonId: LUID = LUID(),
    public var ProcessID: UInt = 0u,
    public var ThreadID: UInt = 0u,
    public var HasTcbPrivilege: Boolean = false,
    public var Impersonating: Boolean = false,
    public var Restricted: Boolean = false,
    public var ClientFlags: UByte = 0u,
    public var ImpersonationLevel: SECURITY_IMPERSONATION_LEVEL = 0,
    public var ClientToken: HANDLE = 0L,
)

public data class SECPKG_CLIENT_INFO_EX(
    public var LogonId: LUID = LUID(),
    public var ProcessID: UInt = 0u,
    public var ThreadID: UInt = 0u,
    public var HasTcbPrivilege: Boolean = false,
    public var Impersonating: Boolean = false,
    public var Restricted: Boolean = false,
    public var ClientFlags: UByte = 0u,
    public var ImpersonationLevel: SECURITY_IMPERSONATION_LEVEL = 0,
    public var ClientToken: HANDLE = 0L,
    public var IdentificationLogonId: LUID = LUID(),
    public var IdentificationToken: HANDLE = 0L,
)

public data class SECPKG_CONTEXT_THUNKS(public var InfoLevelCount: UInt = 0u, public var Levels: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SECPKG_CONTEXT_THUNKS) return false
        if (this.InfoLevelCount != other.InfoLevelCount) return false
        if (!this.Levels.contentEquals(other.Levels)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InfoLevelCount.hashCode()
        result = 31 * result + this.Levels.contentHashCode()
        return result
    }
}

public data class SECPKG_CREDENTIAL(
    public var Version: ULong = 0uL,
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UInt = 0u,
    public var ClientProcess: UInt = 0u,
    public var ClientThread: UInt = 0u,
    public var LogonId: LUID = LUID(),
    public var ClientToken: HANDLE = 0L,
    public var SessionId: UInt = 0u,
    public var ModifiedId: LUID = LUID(),
    public var fCredentials: UInt = 0u,
    public var Flags: UInt = 0u,
    public var PrincipalName: SECPKG_BYTE_VECTOR = SECPKG_BYTE_VECTOR(),
    public var PackageList: SECPKG_BYTE_VECTOR = SECPKG_BYTE_VECTOR(),
    public var MarshaledSuppliedCreds: SECPKG_BYTE_VECTOR = SECPKG_BYTE_VECTOR(),
)

public data class SECPKG_DLL_FUNCTIONS(
    public var AllocateHeap: PLSA_ALLOCATE_LSA_HEAP = null,
    public var FreeHeap: PLSA_FREE_LSA_HEAP = null,
    public var RegisterCallback: PLSA_REGISTER_CALLBACK = null,
    public var LocatePackageById: PLSA_LOCATE_PKG_BY_ID = null,
)

public data class SECPKG_EVENT_NOTIFY(
    public var EventClass: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var EventDataSize: UInt = 0u,
    public var EventData: Long = 0L,
    public var PackageParameter: Long = 0L,
)

public data class SECPKG_EVENT_PACKAGE_CHANGE(
    public var ChangeType: SECPKG_PACKAGE_CHANGE_TYPE = 0u,
    public var PackageId: ULong = 0uL,
    public var PackageName: SECURITY_STRING = SECURITY_STRING(),
)

public data class SECPKG_EVENT_ROLE_CHANGE(public var PreviousRole: UInt = 0u, public var NewRole: UInt = 0u)

public data class SECPKG_EXTENDED_INFORMATION(public var Class: SECPKG_EXTENDED_INFORMATION_CLASS = 0, public var Info: SECPKG_EXTENDED_INFORMATION_0 = SECPKG_EXTENDED_INFORMATION_0())

public data class SECPKG_EXTENDED_INFORMATION_0(
    public var GssInfo: SECPKG_GSS_INFO = SECPKG_GSS_INFO(),
    public var ContextThunks: SECPKG_CONTEXT_THUNKS = SECPKG_CONTEXT_THUNKS(),
    public var MutualAuthLevel: SECPKG_MUTUAL_AUTH_LEVEL = SECPKG_MUTUAL_AUTH_LEVEL(),
    public var WowClientDll: SECPKG_WOW_CLIENT_DLL = SECPKG_WOW_CLIENT_DLL(),
    public var ExtraOids: SECPKG_EXTRA_OIDS = SECPKG_EXTRA_OIDS(),
    public var Nego2Info: SECPKG_NEGO2_INFO = SECPKG_NEGO2_INFO(),
)

public data class SECPKG_EXTRA_OIDS(public var OidCount: UInt = 0u, public var Oids: List<SECPKG_SERIALIZED_OID> = List(1) { SECPKG_SERIALIZED_OID() })

public class SECPKG_FUNCTION_TABLE(
    public var InitializePackage: PLSA_AP_INITIALIZE_PACKAGE = null,
    public var LogonUserA: PLSA_AP_LOGON_USER = null,
    public var CallPackage: PLSA_AP_CALL_PACKAGE = null,
    public var LogonTerminated: PLSA_AP_LOGON_TERMINATED = null,
    public var CallPackageUntrusted: PLSA_AP_CALL_PACKAGE = null,
    public var CallPackagePassthrough: PLSA_AP_CALL_PACKAGE_PASSTHROUGH = null,
    public var LogonUserExA: PLSA_AP_LOGON_USER_EX = null,
    public var LogonUserEx2: PLSA_AP_LOGON_USER_EX2 = null,
    public var Initialize: SpInitializeFn = null,
    public var Shutdown: SpShutdownFn = null,
    public var GetInfo: SpGetInfoFn = null,
    public var AcceptCredentials: SpAcceptCredentialsFn = null,
    public var AcquireCredentialsHandleA: SpAcquireCredentialsHandleFn = null,
    public var QueryCredentialsAttributesA: SpQueryCredentialsAttributesFn = null,
    public var FreeCredentialsHandle: SpFreeCredentialsHandleFn = null,
    public var SaveCredentials: SpSaveCredentialsFn = null,
    public var GetCredentials: SpGetCredentialsFn = null,
    public var DeleteCredentials: SpDeleteCredentialsFn = null,
    public var InitLsaModeContext: SpInitLsaModeContextFn = null,
    public var AcceptLsaModeContext: SpAcceptLsaModeContextFn = null,
    public var DeleteContext: SpDeleteContextFn = null,
    public var ApplyControlToken: SpApplyControlTokenFn = null,
    public var GetUserInfo: SpGetUserInfoFn = null,
    public var GetExtendedInformation: SpGetExtendedInformationFn = null,
    public var QueryContextAttributesA: SpQueryContextAttributesFn = null,
    public var AddCredentialsA: SpAddCredentialsFn = null,
    public var SetExtendedInformation: SpSetExtendedInformationFn = null,
    public var SetContextAttributesA: SpSetContextAttributesFn = null,
    public var SetCredentialsAttributesA: SpSetCredentialsAttributesFn = null,
    public var ChangeAccountPasswordA: SpChangeAccountPasswordFn = null,
    public var QueryMetaData: SpQueryMetaDataFn = null,
    public var ExchangeMetaData: SpExchangeMetaDataFn = null,
    public var GetCredUIContext: SpGetCredUIContextFn = null,
    public var UpdateCredentials: SpUpdateCredentialsFn = null,
    public var ValidateTargetInfo: SpValidateTargetInfoFn = null,
    public var PostLogonUser: LSA_AP_POST_LOGON_USER = null,
    public var GetRemoteCredGuardLogonBuffer: SpGetRemoteCredGuardLogonBufferFn = null,
    public var GetRemoteCredGuardSupplementalCreds: SpGetRemoteCredGuardSupplementalCredsFn = null,
    public var GetTbalSupplementalCreds: SpGetTbalSupplementalCredsFn = null,
    public var LogonUserEx3: PLSA_AP_LOGON_USER_EX3 = null,
    public var PreLogonUserSurrogate: PLSA_AP_PRE_LOGON_USER_SURROGATE = null,
    public var PostLogonUserSurrogate: PLSA_AP_POST_LOGON_USER_SURROGATE = null,
    public var ExtractTargetInfo: SpExtractTargetInfoFn = null,
)

public data class SECPKG_GSS_INFO(public var EncodedIdLength: UInt = 0u, public var EncodedId: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SECPKG_GSS_INFO) return false
        if (this.EncodedIdLength != other.EncodedIdLength) return false
        if (!this.EncodedId.contentEquals(other.EncodedId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EncodedIdLength.hashCode()
        result = 31 * result + this.EncodedId.contentHashCode()
        return result
    }
}

public data class SECPKG_KERNEL_FUNCTIONS(
    public var AllocateHeap: PLSA_ALLOCATE_LSA_HEAP = null,
    public var FreeHeap: PLSA_FREE_LSA_HEAP = null,
    public var CreateContextList: PKSEC_CREATE_CONTEXT_LIST = null,
    public var InsertListEntry: PKSEC_INSERT_LIST_ENTRY = null,
    public var ReferenceListEntry: PKSEC_REFERENCE_LIST_ENTRY = null,
    public var DereferenceListEntry: PKSEC_DEREFERENCE_LIST_ENTRY = null,
    public var SerializeWinntAuthData: PKSEC_SERIALIZE_WINNT_AUTH_DATA = null,
    public var SerializeSchannelAuthData: PKSEC_SERIALIZE_SCHANNEL_AUTH_DATA = null,
    public var LocatePackageById: PKSEC_LOCATE_PKG_BY_ID = null,
)

public data class SECPKG_KERNEL_FUNCTION_TABLE(
    public var Initialize: KspInitPackageFn = null,
    public var DeleteContext: KspDeleteContextFn = null,
    public var InitContext: KspInitContextFn = null,
    public var MapHandle: KspMapHandleFn = null,
    public var Sign: KspMakeSignatureFn = null,
    public var Verify: KspVerifySignatureFn = null,
    public var Seal: KspSealMessageFn = null,
    public var Unseal: KspUnsealMessageFn = null,
    public var GetToken: KspGetTokenFn = null,
    public var QueryAttributes: KspQueryAttributesFn = null,
    public var CompleteToken: KspCompleteTokenFn = null,
    public var ExportContext: SpExportSecurityContextFn = null,
    public var ImportContext: SpImportSecurityContextFn = null,
    public var SetPackagePagingMode: KspSetPagingModeFn = null,
    public var SerializeAuthData: KspSerializeAuthDataFn = null,
)

public data class SECPKG_MUTUAL_AUTH_LEVEL(public var MutualAuthLevel: UInt = 0u)

public data class SECPKG_NEGO2_INFO(public var AuthScheme: UByteArray = UByteArray(16), public var PackageFlags: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SECPKG_NEGO2_INFO) return false
        if (!this.AuthScheme.contentEquals(other.AuthScheme)) return false
        if (this.PackageFlags != other.PackageFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AuthScheme.contentHashCode()
        result = 31 * result + this.PackageFlags.hashCode()
        return result
    }
}

public data class SECPKG_NTLM_TARGETINFO(
    public var Flags: UInt = 0u,
    public var MsvAvNbComputerName: PWSTR = 0L,
    public var MsvAvNbDomainName: PWSTR = 0L,
    public var MsvAvDnsComputerName: PWSTR = 0L,
    public var MsvAvDnsDomainName: PWSTR = 0L,
    public var MsvAvDnsTreeName: PWSTR = 0L,
    public var MsvAvFlags: UInt = 0u,
    public var MsvAvTimestamp: FILETIME = FILETIME(),
    public var MsvAvTargetName: PWSTR = 0L,
)

public data class SECPKG_PARAMETERS(
    public var Version: UInt = 0u,
    public var MachineState: UInt = 0u,
    public var SetupMode: UInt = 0u,
    public var DomainSid: PSID = 0L,
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DnsDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainGuid: GUID = GUID(),
)

public data class SECPKG_POST_LOGON_USER_INFO(
    public var Flags: UInt = 0u,
    public var LogonId: LUID = LUID(),
    public var LinkedLogonId: LUID = LUID(),
)

public data class SECPKG_PRIMARY_CRED(
    public var LogonId: LUID = LUID(),
    public var DownlevelName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Password: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var OldPassword: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserSid: PSID = 0L,
    public var Flags: UInt = 0u,
    public var DnsDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Upn: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LogonServer: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Spare1: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Spare2: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Spare3: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Spare4: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
)

public class SECPKG_PRIMARY_CRED_EX(
    public var LogonId: LUID = LUID(),
    public var DownlevelName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Password: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var OldPassword: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserSid: PSID = 0L,
    public var Flags: UInt = 0u,
    public var DnsDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Upn: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LogonServer: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Spare1: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Spare2: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Spare3: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Spare4: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var PackageId: ULong = 0uL,
    public var PrevLogonId: LUID = LUID(),
    public var FlagsEx: UInt = 0u,
)

public data class SECPKG_REDIRECTED_LOGON_BUFFER(
    public var RedirectedLogonGuid: GUID = GUID(),
    public var RedirectedLogonHandle: HANDLE = 0L,
    public var Init: PLSA_REDIRECTED_LOGON_INIT = null,
    public var Callback: PLSA_REDIRECTED_LOGON_CALLBACK = null,
    public var CleanupCallback: PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACK = null,
    public var GetLogonCreds: PLSA_REDIRECTED_LOGON_GET_LOGON_CREDS = null,
    public var GetSupplementalCreds: PLSA_REDIRECTED_LOGON_GET_SUPP_CREDS = null,
    public var GetRedirectedLogonSid: PLSA_REDIRECTED_LOGON_GET_SID = null,
)

public data class SECPKG_SERIALIZED_OID(
    public var OidLength: UInt = 0u,
    public var OidAttributes: UInt = 0u,
    public var OidValue: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SECPKG_SERIALIZED_OID) return false
        if (this.OidLength != other.OidLength) return false
        if (this.OidAttributes != other.OidAttributes) return false
        if (!this.OidValue.contentEquals(other.OidValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OidLength.hashCode()
        result = 31 * result + this.OidAttributes.hashCode()
        result = 31 * result + this.OidValue.contentHashCode()
        return result
    }
}

public data class SECPKG_SHORT_VECTOR(public var ShortArrayOffset: UInt = 0u, public var ShortArrayCount: UShort = 0u)

public data class SECPKG_SUPPLEMENTAL_CRED(
    public var PackageName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var CredentialSize: UInt = 0u,
    public var Credentials: Long = 0L,
)

public data class SECPKG_SUPPLEMENTAL_CRED_ARRAY(public var CredentialCount: UInt = 0u, public var Credentials: List<SECPKG_SUPPLEMENTAL_CRED> = List(1) { SECPKG_SUPPLEMENTAL_CRED() })

public data class SECPKG_SUPPLIED_CREDENTIAL(
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UShort = 0u,
    public var UserName: SECPKG_SHORT_VECTOR = SECPKG_SHORT_VECTOR(),
    public var DomainName: SECPKG_SHORT_VECTOR = SECPKG_SHORT_VECTOR(),
    public var PackedCredentials: SECPKG_BYTE_VECTOR = SECPKG_BYTE_VECTOR(),
    public var CredFlags: UInt = 0u,
)

public data class SECPKG_SURROGATE_LOGON(
    public var Version: UInt = 0u,
    public var SurrogateLogonID: LUID = LUID(),
    public var EntryCount: UInt = 0u,
    public var Entries: Long = 0L,
)

public data class SECPKG_SURROGATE_LOGON_ENTRY(public var Type: GUID = GUID(), public var Data: Long = 0L)

public data class SECPKG_TARGETINFO(public var DomainSid: PSID = 0L, public var ComputerName: PCWSTR = 0L)

public data class SECPKG_USER_FUNCTION_TABLE(
    public var InstanceInit: SpInstanceInitFn = null,
    public var InitUserModeContext: SpInitUserModeContextFn = null,
    public var MakeSignature: SpMakeSignatureFn = null,
    public var VerifySignature: SpVerifySignatureFn = null,
    public var SealMessage: SpSealMessageFn = null,
    public var UnsealMessage: SpUnsealMessageFn = null,
    public var GetContextToken: SpGetContextTokenFn = null,
    public var QueryContextAttributesA: SpQueryContextAttributesFn = null,
    public var CompleteAuthToken: SpCompleteAuthTokenFn = null,
    public var DeleteUserModeContext: SpDeleteContextFn = null,
    public var FormatCredentials: SpFormatCredentialsFn = null,
    public var MarshallSupplementalCreds: SpMarshallSupplementalCredsFn = null,
    public var ExportContext: SpExportSecurityContextFn = null,
    public var ImportContext: SpImportSecurityContextFn = null,
    public var MarshalAttributeData: SpMarshalAttributeDataFn = null,
)

public data class SECPKG_WOW_CLIENT_DLL(public var WowClientDllPath: SECURITY_STRING = SECURITY_STRING())

public class SECURITY_LOGON_SESSION_DATA(
    public var Size: UInt = 0u,
    public var LogonId: LUID = LUID(),
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LogonDomain: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var AuthenticationPackage: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LogonType: UInt = 0u,
    public var Session: UInt = 0u,
    public var Sid: PSID = 0L,
    public var LogonTime: Long = 0L,
    public var LogonServer: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var DnsDomainName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Upn: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserFlags: UInt = 0u,
    public var LastLogonInfo: LSA_LAST_INTER_LOGON_INFO = LSA_LAST_INTER_LOGON_INFO(),
    public var LogonScript: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ProfilePath: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var HomeDirectory: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var HomeDirectoryDrive: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LogoffTime: Long = 0L,
    public var KickOffTime: Long = 0L,
    public var PasswordLastSet: Long = 0L,
    public var PasswordCanChange: Long = 0L,
    public var PasswordMustChange: Long = 0L,
)

public data class SECURITY_LOGON_TYPE(public var value: Int = 0) {
    public var field0: Int
        get() = value
        set(v) { value = v }

    public companion object {
        public val UndefinedLogonType: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(0)

        public val Interactive: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(2)

        public val Network: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(3)

        public val Batch: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(4)

        public val Service: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(5)

        public val Proxy: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(6)

        public val Unlock: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(7)

        public val NetworkCleartext: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(8)

        public val NewCredentials: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(9)

        public val RemoteInteractive: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(10)

        public val CachedInteractive: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(11)

        public val CachedRemoteInteractive: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(12)

        public val CachedUnlock: SECURITY_LOGON_TYPE = SECURITY_LOGON_TYPE(13)
    }
}

public data class SECURITY_PACKAGE_OPTIONS(
    public var Size: UInt = 0u,
    public var Type: SECURITY_PACKAGE_OPTIONS_TYPE = 0u,
    public var Flags: UInt = 0u,
    public var SignatureSize: UInt = 0u,
    public var Signature: Long = 0L,
)

public data class SECURITY_STRING(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Buffer: Long = 0L,
)

public data class SECURITY_USER_DATA(
    public var UserName: SECURITY_STRING = SECURITY_STRING(),
    public var LogonDomainName: SECURITY_STRING = SECURITY_STRING(),
    public var LogonServer: SECURITY_STRING = SECURITY_STRING(),
    public var pSid: PSID = 0L,
)

public data class SEC_APPLICATION_PROTOCOLS(public var ProtocolListsSize: UInt = 0u, public var ProtocolLists: List<SEC_APPLICATION_PROTOCOL_LIST> = List(1) { SEC_APPLICATION_PROTOCOL_LIST() })

public data class SEC_APPLICATION_PROTOCOL_LIST(
    public var ProtoNegoExt: SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT = 0,
    public var ProtocolListSize: UShort = 0u,
    public var ProtocolList: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEC_APPLICATION_PROTOCOL_LIST) return false
        if (this.ProtoNegoExt != other.ProtoNegoExt) return false
        if (this.ProtocolListSize != other.ProtocolListSize) return false
        if (!this.ProtocolList.contentEquals(other.ProtocolList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProtoNegoExt.hashCode()
        result = 31 * result + this.ProtocolListSize.hashCode()
        result = 31 * result + this.ProtocolList.contentHashCode()
        return result
    }
}

public data class SEC_CERTIFICATE_REQUEST_CONTEXT(public var cbCertificateRequestContext: UByte = 0u, public var rgCertificateRequestContext: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEC_CERTIFICATE_REQUEST_CONTEXT) return false
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

public data class SEC_CHANNEL_BINDINGS(
    public var dwInitiatorAddrType: UInt = 0u,
    public var cbInitiatorLength: UInt = 0u,
    public var dwInitiatorOffset: UInt = 0u,
    public var dwAcceptorAddrType: UInt = 0u,
    public var cbAcceptorLength: UInt = 0u,
    public var dwAcceptorOffset: UInt = 0u,
    public var cbApplicationDataLength: UInt = 0u,
    public var dwApplicationDataOffset: UInt = 0u,
)

public data class SEC_CHANNEL_BINDINGS_EX(
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

public data class SEC_CHANNEL_BINDINGS_RESULT(public var flags: UInt = 0u)

public data class SEC_DTLS_MTU(public var PathMTU: UShort = 0u)

public data class SEC_FLAGS(public var Flags: ULong = 0uL)

public data class SEC_NEGOTIATION_INFO(
    public var Size: UInt = 0u,
    public var NameLength: UInt = 0u,
    public var Name: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class SEC_PRESHAREDKEY(public var KeySize: UShort = 0u, public var Key: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEC_PRESHAREDKEY) return false
        if (this.KeySize != other.KeySize) return false
        if (!this.Key.contentEquals(other.Key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.KeySize.hashCode()
        result = 31 * result + this.Key.contentHashCode()
        return result
    }
}

public data class SEC_PRESHAREDKEY_IDENTITY(public var KeyIdentitySize: UShort = 0u, public var KeyIdentity: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEC_PRESHAREDKEY_IDENTITY) return false
        if (this.KeyIdentitySize != other.KeyIdentitySize) return false
        if (!this.KeyIdentity.contentEquals(other.KeyIdentity)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.KeyIdentitySize.hashCode()
        result = 31 * result + this.KeyIdentity.contentHashCode()
        return result
    }
}

public data class SEC_SRTP_MASTER_KEY_IDENTIFIER(public var MasterKeyIdentifierSize: UByte = 0u, public var MasterKeyIdentifier: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEC_SRTP_MASTER_KEY_IDENTIFIER) return false
        if (this.MasterKeyIdentifierSize != other.MasterKeyIdentifierSize) return false
        if (!this.MasterKeyIdentifier.contentEquals(other.MasterKeyIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MasterKeyIdentifierSize.hashCode()
        result = 31 * result + this.MasterKeyIdentifier.contentHashCode()
        return result
    }
}

public data class SEC_SRTP_PROTECTION_PROFILES(public var ProfilesSize: UShort = 0u, public var ProfilesList: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEC_SRTP_PROTECTION_PROFILES) return false
        if (this.ProfilesSize != other.ProfilesSize) return false
        if (!this.ProfilesList.contentEquals(other.ProfilesList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProfilesSize.hashCode()
        result = 31 * result + this.ProfilesList.contentHashCode()
        return result
    }
}

public data class SEC_TOKEN_BINDING(
    public var MajorVersion: UByte = 0u,
    public var MinorVersion: UByte = 0u,
    public var KeyParametersSize: UShort = 0u,
    public var KeyParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEC_TOKEN_BINDING) return false
        if (this.MajorVersion != other.MajorVersion) return false
        if (this.MinorVersion != other.MinorVersion) return false
        if (this.KeyParametersSize != other.KeyParametersSize) return false
        if (!this.KeyParameters.contentEquals(other.KeyParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MajorVersion.hashCode()
        result = 31 * result + this.MinorVersion.hashCode()
        result = 31 * result + this.KeyParametersSize.hashCode()
        result = 31 * result + this.KeyParameters.contentHashCode()
        return result
    }
}

public data class SEC_TRAFFIC_SECRETS(
    public var SymmetricAlgId: UShortArray = UShortArray(64),
    public var ChainingMode: UShortArray = UShortArray(64),
    public var HashAlgId: UShortArray = UShortArray(64),
    public var KeySize: UShort = 0u,
    public var IvSize: UShort = 0u,
    public var MsgSequenceStart: UShort = 0u,
    public var MsgSequenceEnd: UShort = 0u,
    public var TrafficSecretType: SEC_TRAFFIC_SECRET_TYPE = 0,
    public var TrafficSecretSize: UShort = 0u,
    public var TrafficSecret: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEC_TRAFFIC_SECRETS) return false
        if (!this.SymmetricAlgId.contentEquals(other.SymmetricAlgId)) return false
        if (!this.ChainingMode.contentEquals(other.ChainingMode)) return false
        if (!this.HashAlgId.contentEquals(other.HashAlgId)) return false
        if (this.KeySize != other.KeySize) return false
        if (this.IvSize != other.IvSize) return false
        if (this.MsgSequenceStart != other.MsgSequenceStart) return false
        if (this.MsgSequenceEnd != other.MsgSequenceEnd) return false
        if (this.TrafficSecretType != other.TrafficSecretType) return false
        if (this.TrafficSecretSize != other.TrafficSecretSize) return false
        if (!this.TrafficSecret.contentEquals(other.TrafficSecret)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SymmetricAlgId.contentHashCode()
        result = 31 * result + this.ChainingMode.contentHashCode()
        result = 31 * result + this.HashAlgId.contentHashCode()
        result = 31 * result + this.KeySize.hashCode()
        result = 31 * result + this.IvSize.hashCode()
        result = 31 * result + this.MsgSequenceStart.hashCode()
        result = 31 * result + this.MsgSequenceEnd.hashCode()
        result = 31 * result + this.TrafficSecretType.hashCode()
        result = 31 * result + this.TrafficSecretSize.hashCode()
        result = 31 * result + this.TrafficSecret.contentHashCode()
        return result
    }
}

public data class SEC_WINNT_AUTH_IDENTITY32(
    public var User: UInt = 0u,
    public var UserLength: UInt = 0u,
    public var Domain: UInt = 0u,
    public var DomainLength: UInt = 0u,
    public var Password: UInt = 0u,
    public var PasswordLength: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class SEC_WINNT_AUTH_IDENTITY_EX2(
    public var Version: UInt = 0u,
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UInt = 0u,
    public var UserOffset: UInt = 0u,
    public var UserLength: UShort = 0u,
    public var DomainOffset: UInt = 0u,
    public var DomainLength: UShort = 0u,
    public var PackedCredentialsOffset: UInt = 0u,
    public var PackedCredentialsLength: UShort = 0u,
    public var Flags: UInt = 0u,
    public var PackageListOffset: UInt = 0u,
    public var PackageListLength: UShort = 0u,
)

public data class SEC_WINNT_AUTH_IDENTITY_EX32(
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var User: UInt = 0u,
    public var UserLength: UInt = 0u,
    public var Domain: UInt = 0u,
    public var DomainLength: UInt = 0u,
    public var Password: UInt = 0u,
    public var PasswordLength: UInt = 0u,
    public var Flags: UInt = 0u,
    public var PackageList: UInt = 0u,
    public var PackageListLength: UInt = 0u,
)

public data class SEC_WINNT_AUTH_IDENTITY_EXA(
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var User: Long = 0L,
    public var UserLength: UInt = 0u,
    public var Domain: Long = 0L,
    public var DomainLength: UInt = 0u,
    public var Password: Long = 0L,
    public var PasswordLength: UInt = 0u,
    public var Flags: UInt = 0u,
    public var PackageList: Long = 0L,
    public var PackageListLength: UInt = 0u,
)

public data class SEC_WINNT_AUTH_IDENTITY_EXW(
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var User: Long = 0L,
    public var UserLength: UInt = 0u,
    public var Domain: Long = 0L,
    public var DomainLength: UInt = 0u,
    public var Password: Long = 0L,
    public var PasswordLength: UInt = 0u,
    public var Flags: UInt = 0u,
    public var PackageList: Long = 0L,
    public var PackageListLength: UInt = 0u,
)

public data class SEC_WINNT_AUTH_IDENTITY_INFO(
    public var AuthIdExw: SEC_WINNT_AUTH_IDENTITY_EXW = SEC_WINNT_AUTH_IDENTITY_EXW(),
    public var AuthIdExa: SEC_WINNT_AUTH_IDENTITY_EXA = SEC_WINNT_AUTH_IDENTITY_EXA(),
    public var AuthId_a: SEC_WINNT_AUTH_IDENTITY_A = SEC_WINNT_AUTH_IDENTITY_A(),
    public var AuthId_w: SEC_WINNT_AUTH_IDENTITY_W = SEC_WINNT_AUTH_IDENTITY_W(),
    public var AuthIdEx2: SEC_WINNT_AUTH_IDENTITY_EX2 = SEC_WINNT_AUTH_IDENTITY_EX2(),
)

public data class SEND_GENERIC_TLS_EXTENSION(
    public var ExtensionType: UShort = 0u,
    public var HandshakeType: UShort = 0u,
    public var Flags: UInt = 0u,
    public var BufferSize: UShort = 0u,
    public var Buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEND_GENERIC_TLS_EXTENSION) return false
        if (this.ExtensionType != other.ExtensionType) return false
        if (this.HandshakeType != other.HandshakeType) return false
        if (this.Flags != other.Flags) return false
        if (this.BufferSize != other.BufferSize) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ExtensionType.hashCode()
        result = 31 * result + this.HandshakeType.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.BufferSize.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class SE_ADT_ACCESS_REASON(
    public var AccessMask: UInt = 0u,
    public var AccessReasons: UIntArray = UIntArray(32),
    public var ObjectTypeIndex: UInt = 0u,
    public var AccessGranted: UInt = 0u,
    public var SecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SE_ADT_ACCESS_REASON) return false
        if (this.AccessMask != other.AccessMask) return false
        if (!this.AccessReasons.contentEquals(other.AccessReasons)) return false
        if (this.ObjectTypeIndex != other.ObjectTypeIndex) return false
        if (this.AccessGranted != other.AccessGranted) return false
        if (this.SecurityDescriptor != other.SecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AccessMask.hashCode()
        result = 31 * result + this.AccessReasons.contentHashCode()
        result = 31 * result + this.ObjectTypeIndex.hashCode()
        result = 31 * result + this.AccessGranted.hashCode()
        result = 31 * result + this.SecurityDescriptor.hashCode()
        return result
    }
}

public data class SE_ADT_CLAIMS(public var Length: UInt = 0u, public var Claims: Long = 0L)

public data class SE_ADT_OBJECT_TYPE(
    public var ObjectType: GUID = GUID(),
    public var Flags: UShort = 0u,
    public var Level: UShort = 0u,
    public var AccessMask: UInt = 0u,
)

public data class SE_ADT_PARAMETER_ARRAY(
    public var CategoryId: UInt = 0u,
    public var AuditId: UInt = 0u,
    public var ParameterCount: UInt = 0u,
    public var Length: UInt = 0u,
    public var FlatSubCategoryId: UShort = 0u,
    public var Type: UShort = 0u,
    public var Flags: UInt = 0u,
    public var Parameters: List<SE_ADT_PARAMETER_ARRAY_ENTRY> = List(32) { SE_ADT_PARAMETER_ARRAY_ENTRY() },
)

public data class SE_ADT_PARAMETER_ARRAY_ENTRY(
    public var Type: SE_ADT_PARAMETER_TYPE = 0,
    public var Length: UInt = 0u,
    public var Data: ULongArray = ULongArray(2),
    public var Address: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SE_ADT_PARAMETER_ARRAY_ENTRY) return false
        if (this.Type != other.Type) return false
        if (this.Length != other.Length) return false
        if (!this.Data.contentEquals(other.Data)) return false
        if (this.Address != other.Address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        result = 31 * result + this.Address.hashCode()
        return result
    }
}

public data class SE_ADT_PARAMETER_ARRAY_EX(
    public var CategoryId: UInt = 0u,
    public var AuditId: UInt = 0u,
    public var Version: UInt = 0u,
    public var ParameterCount: UInt = 0u,
    public var Length: UInt = 0u,
    public var FlatSubCategoryId: UShort = 0u,
    public var Type: UShort = 0u,
    public var Flags: UInt = 0u,
    public var Parameters: List<SE_ADT_PARAMETER_ARRAY_ENTRY> = List(32) { SE_ADT_PARAMETER_ARRAY_ENTRY() },
)

public data class SL_ACTIVATION_INFO_HEADER(public var cbSize: UInt = 0u, public var type: SL_ACTIVATION_TYPE = 0)

public data class SL_AD_ACTIVATION_INFO(
    public var header: SL_ACTIVATION_INFO_HEADER = SL_ACTIVATION_INFO_HEADER(),
    public var pwszProductKey: PCWSTR = 0L,
    public var pwszActivationObjectName: PCWSTR = 0L,
)

public data class SL_LICENSING_STATUS(
    public var SkuId: GUID = GUID(),
    public var eStatus: SLLICENSINGSTATUS = 0,
    public var dwGraceTime: UInt = 0u,
    public var dwTotalGraceDays: UInt = 0u,
    public var hrReason: HRESULT = 0,
    public var qwValidityExpiration: ULong = 0uL,
)
