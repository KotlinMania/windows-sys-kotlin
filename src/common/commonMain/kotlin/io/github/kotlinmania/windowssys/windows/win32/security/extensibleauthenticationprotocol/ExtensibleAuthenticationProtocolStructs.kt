@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public data class EAPHOST_AUTH_INFO(
    public var status: EAPHOST_AUTH_STATUS = 0,
    public var dwErrorCode: UInt = 0u,
    public var dwReasonCode: UInt = 0u,
)

public data class EAPHOST_IDENTITY_UI_PARAMS(
    public var eapMethodType: EAP_METHOD_TYPE = EAP_METHOD_TYPE(),
    public var dwFlags: UInt = 0u,
    public var dwSizeofConnectionData: UInt = 0u,
    public var pConnectionData: Long = 0L,
    public var dwSizeofUserData: UInt = 0u,
    public var pUserData: Long = 0L,
    public var dwSizeofUserDataOut: UInt = 0u,
    public var pUserDataOut: Long = 0L,
    public var pwszIdentity: PWSTR = 0L,
    public var dwError: UInt = 0u,
    public var pEapError: Long = 0L,
)

public data class EAPHOST_INTERACTIVE_UI_PARAMS(
    public var dwSizeofContextData: UInt = 0u,
    public var pContextData: Long = 0L,
    public var dwSizeofInteractiveUIData: UInt = 0u,
    public var pInteractiveUIData: Long = 0L,
    public var dwError: UInt = 0u,
    public var pEapError: Long = 0L,
)

public data class EAP_ATTRIBUTE(
    public var eaType: EAP_ATTRIBUTE_TYPE = 0,
    public var dwLength: UInt = 0u,
    public var pValue: Long = 0L,
)

public data class EAP_ATTRIBUTES(public var dwNumberOfAttributes: UInt = 0u, public var pAttribs: Long = 0L)

public data class EAP_AUTHENTICATOR_METHOD_ROUTINES(
    public var dwSizeInBytes: UInt = 0u,
    public var pEapType: Long = 0L,
    public var EapMethodAuthenticatorInitialize: Long = 0L,
    public var EapMethodAuthenticatorBeginSession: Long = 0L,
    public var EapMethodAuthenticatorUpdateInnerMethodParams: Long = 0L,
    public var EapMethodAuthenticatorReceivePacket: Long = 0L,
    public var EapMethodAuthenticatorSendPacket: Long = 0L,
    public var EapMethodAuthenticatorGetAttributes: Long = 0L,
    public var EapMethodAuthenticatorSetAttributes: Long = 0L,
    public var EapMethodAuthenticatorGetResult: Long = 0L,
    public var EapMethodAuthenticatorEndSession: Long = 0L,
    public var EapMethodAuthenticatorShutdown: Long = 0L,
)

public data class EAP_CONFIG_INPUT_FIELD_ARRAY(
    public var dwVersion: UInt = 0u,
    public var dwNumberOfFields: UInt = 0u,
    public var pFields: Long = 0L,
)

public data class EAP_CONFIG_INPUT_FIELD_DATA(
    public var dwSize: UInt = 0u,
    public var Type: EAP_CONFIG_INPUT_FIELD_TYPE = 0,
    public var dwFlagProps: UInt = 0u,
    public var pwszLabel: PWSTR = 0L,
    public var pwszData: PWSTR = 0L,
    public var dwMinDataLength: UInt = 0u,
    public var dwMaxDataLength: UInt = 0u,
)

public data class EAP_CRED_EXPIRY_REQ(public var curCreds: EAP_CONFIG_INPUT_FIELD_ARRAY = EAP_CONFIG_INPUT_FIELD_ARRAY(), public var newCreds: EAP_CONFIG_INPUT_FIELD_ARRAY = EAP_CONFIG_INPUT_FIELD_ARRAY())

public data class EAP_ERROR(
    public var dwWinError: UInt = 0u,
    public var type: EAP_METHOD_TYPE = EAP_METHOD_TYPE(),
    public var dwReasonCode: UInt = 0u,
    public var rootCauseGuid: GUID = GUID(),
    public var repairGuid: GUID = GUID(),
    public var helpLinkGuid: GUID = GUID(),
    public var pRootCauseString: PWSTR = 0L,
    public var pRepairString: PWSTR = 0L,
)

public data class EAP_INTERACTIVE_UI_DATA(
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var dwDataType: EAP_INTERACTIVE_UI_DATA_TYPE = 0,
    public var cbUiData: UInt = 0u,
    public var pbUiData: EAP_UI_DATA_FORMAT = EAP_UI_DATA_FORMAT(),
)

public data class EAP_METHOD_AUTHENTICATOR_RESULT(
    public var fIsSuccess: BOOL = 0,
    public var dwFailureReason: UInt = 0u,
    public var pAuthAttribs: Long = 0L,
)

public data class EAP_METHOD_INFO(
    public var eaptype: EAP_METHOD_TYPE = EAP_METHOD_TYPE(),
    public var pwszAuthorName: PWSTR = 0L,
    public var pwszFriendlyName: PWSTR = 0L,
    public var eapProperties: UInt = 0u,
    public var pInnerMethodInfo: Long = 0L,
)

public data class EAP_METHOD_INFO_ARRAY(public var dwNumberOfMethods: UInt = 0u, public var pEapMethods: Long = 0L)

public data class EAP_METHOD_INFO_ARRAY_EX(public var dwNumberOfMethods: UInt = 0u, public var pEapMethods: Long = 0L)

public data class EAP_METHOD_INFO_EX(
    public var eaptype: EAP_METHOD_TYPE = EAP_METHOD_TYPE(),
    public var pwszAuthorName: PWSTR = 0L,
    public var pwszFriendlyName: PWSTR = 0L,
    public var eapProperties: UInt = 0u,
    public var pInnerMethodInfoArray: Long = 0L,
)

public data class EAP_METHOD_PROPERTY(
    public var eapMethodPropertyType: EAP_METHOD_PROPERTY_TYPE = 0,
    public var eapMethodPropertyValueType: EAP_METHOD_PROPERTY_VALUE_TYPE = 0,
    public var eapMethodPropertyValue: EAP_METHOD_PROPERTY_VALUE = EAP_METHOD_PROPERTY_VALUE(),
)

public data class EAP_METHOD_PROPERTY_ARRAY(public var dwNumberOfProperties: UInt = 0u, public var pMethodProperty: Long = 0L)

public data class EAP_METHOD_PROPERTY_VALUE(
    public var empvBool: EAP_METHOD_PROPERTY_VALUE_BOOL = EAP_METHOD_PROPERTY_VALUE_BOOL(),
    public var empvDword: EAP_METHOD_PROPERTY_VALUE_DWORD = EAP_METHOD_PROPERTY_VALUE_DWORD(),
    public var empvString: EAP_METHOD_PROPERTY_VALUE_STRING = EAP_METHOD_PROPERTY_VALUE_STRING(),
)

public data class EAP_METHOD_PROPERTY_VALUE_BOOL(public var length: UInt = 0u, public var value: BOOL = 0)

public data class EAP_METHOD_PROPERTY_VALUE_DWORD(public var length: UInt = 0u, public var value: UInt = 0u)

public data class EAP_METHOD_PROPERTY_VALUE_STRING(public var length: UInt = 0u, public var value: Long = 0L)

public data class EAP_METHOD_TYPE(public var eapType: EAP_TYPE = EAP_TYPE(), public var dwAuthorId: UInt = 0u)

public data class EAP_PEER_METHOD_ROUTINES(
    public var dwVersion: UInt = 0u,
    public var pEapType: Long = 0L,
    public var EapPeerInitialize: Long = 0L,
    public var EapPeerGetIdentity: Long = 0L,
    public var EapPeerBeginSession: Long = 0L,
    public var EapPeerSetCredentials: Long = 0L,
    public var EapPeerProcessRequestPacket: Long = 0L,
    public var EapPeerGetResponsePacket: Long = 0L,
    public var EapPeerGetResult: Long = 0L,
    public var EapPeerGetUIContext: Long = 0L,
    public var EapPeerSetUIContext: Long = 0L,
    public var EapPeerGetResponseAttributes: Long = 0L,
    public var EapPeerSetResponseAttributes: Long = 0L,
    public var EapPeerEndSession: Long = 0L,
    public var EapPeerShutdown: Long = 0L,
)

public data class EAP_TYPE(
    public var type: UByte = 0u,
    public var dwVendorId: UInt = 0u,
    public var dwVendorType: UInt = 0u,
)

public data class EAP_UI_DATA_FORMAT(
    public var credData: Long = 0L,
    public var credExpiryData: Long = 0L,
    public var credLogonData: Long = 0L,
)

public data class EapCertificateCredential(public var certHash: UByteArray = UByteArray(20), public var password: PWSTR = 0L) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapCertificateCredential) return false
        if (!this.certHash.contentEquals(other.certHash)) return false
        if (this.password != other.password) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.certHash.contentHashCode()
        result = 31 * result + this.password.hashCode()
        return result
    }
}

public data class EapCredential(public var credType: EapCredentialType = 0, public var credData: EapCredentialTypeData = EapCredentialTypeData())

public data class EapCredentialTypeData(
    public var username_password: EapUsernamePasswordCredential = EapUsernamePasswordCredential(),
    public var certificate: EapCertificateCredential = EapCertificateCredential(),
    public var sim: EapSimCredential = EapSimCredential(),
)

public data class EapHostPeerMethodResult(
    public var fIsSuccess: BOOL = 0,
    public var dwFailureReasonCode: UInt = 0u,
    public var fSaveConnectionData: BOOL = 0,
    public var dwSizeofConnectionData: UInt = 0u,
    public var pConnectionData: Long = 0L,
    public var fSaveUserData: BOOL = 0,
    public var dwSizeofUserData: UInt = 0u,
    public var pUserData: Long = 0L,
    public var pAttribArray: Long = 0L,
    public var isolationState: ISOLATION_STATE = 0,
    public var pEapMethodInfo: Long = 0L,
    public var pEapError: Long = 0L,
)

public data class EapPacket(
    public var Code: UByte = 0u,
    public var Id: UByte = 0u,
    public var Length: UByteArray = UByteArray(2),
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapPacket) return false
        if (this.Code != other.Code) return false
        if (this.Id != other.Id) return false
        if (!this.Length.contentEquals(other.Length)) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Code.hashCode()
        result = 31 * result + this.Id.hashCode()
        result = 31 * result + this.Length.contentHashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class EapPeerMethodOutput(public var action: EapPeerMethodResponseAction = 0, public var fAllowNotifications: BOOL = 0)

public data class EapPeerMethodResult(
    public var fIsSuccess: BOOL = 0,
    public var dwFailureReasonCode: UInt = 0u,
    public var fSaveConnectionData: BOOL = 0,
    public var dwSizeofConnectionData: UInt = 0u,
    public var pConnectionData: Long = 0L,
    public var fSaveUserData: BOOL = 0,
    public var dwSizeofUserData: UInt = 0u,
    public var pUserData: Long = 0L,
    public var pAttribArray: Long = 0L,
    public var pEapError: Long = 0L,
    public var pNgcKerbTicket: Long = 0L,
    public var fSaveToCredMan: BOOL = 0,
)

public data class EapSimCredential(public var iccID: PWSTR = 0L)

public data class EapUsernamePasswordCredential(public var username: PWSTR = 0L, public var password: PWSTR = 0L)

public data class LEGACY_IDENTITY_UI_PARAMS(
    public var eapType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSizeofConnectionData: UInt = 0u,
    public var pConnectionData: Long = 0L,
    public var dwSizeofUserData: UInt = 0u,
    public var pUserData: Long = 0L,
    public var dwSizeofUserDataOut: UInt = 0u,
    public var pUserDataOut: Long = 0L,
    public var pwszIdentity: PWSTR = 0L,
    public var dwError: UInt = 0u,
)

public data class LEGACY_INTERACTIVE_UI_PARAMS(
    public var eapType: UInt = 0u,
    public var dwSizeofContextData: UInt = 0u,
    public var pContextData: Long = 0L,
    public var dwSizeofInteractiveUIData: UInt = 0u,
    public var pInteractiveUIData: Long = 0L,
    public var dwError: UInt = 0u,
)

public data class NgcTicketContext(
    public var wszTicket: UShortArray = UShortArray(45),
    public var hKey: Cryptography.NCRYPT_KEY_HANDLE = Cryptography.NCRYPT_KEY_HANDLE(),
    public var hImpersonateToken: Foundation.HANDLE = Foundation.HANDLE(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NgcTicketContext) return false
        if (!this.wszTicket.contentEquals(other.wszTicket)) return false
        if (this.hKey != other.hKey) return false
        if (this.hImpersonateToken != other.hImpersonateToken) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszTicket.contentHashCode()
        result = 31 * result + this.hKey.hashCode()
        result = 31 * result + this.hImpersonateToken.hashCode()
        return result
    }
}

public data class PPP_EAP_INFO(
    public var dwSizeInBytes: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var RasEapInitialize: Long = 0L,
    public var RasEapBegin: Long = 0L,
    public var RasEapEnd: Long = 0L,
    public var RasEapMakeMessage: Long = 0L,
)

public class PPP_EAP_INPUT(
    public var dwSizeInBytes: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var fAuthenticator: BOOL = 0,
    public var pwszIdentity: PWSTR = 0L,
    public var pwszPassword: PWSTR = 0L,
    public var bInitialId: UByte = 0u,
    public var pUserAttributes: Long = 0L,
    public var fAuthenticationComplete: BOOL = 0,
    public var dwAuthResultCode: UInt = 0u,
    public var hTokenImpersonateUser: Foundation.HANDLE = Foundation.HANDLE(),
    public var fSuccessPacketReceived: BOOL = 0,
    public var fDataReceivedFromInteractiveUI: BOOL = 0,
    public var pDataFromInteractiveUI: Long = 0L,
    public var dwSizeOfDataFromInteractiveUI: UInt = 0u,
    public var pConnectionData: Long = 0L,
    public var dwSizeOfConnectionData: UInt = 0u,
    public var pUserData: Long = 0L,
    public var dwSizeOfUserData: UInt = 0u,
    public var hReserved: Foundation.HANDLE = Foundation.HANDLE(),
    public var guidConnectionId: GUID = GUID(),
    public var isVpn: BOOL = 0,
)

public data class PPP_EAP_OUTPUT(
    public var dwSizeInBytes: UInt = 0u,
    public var Action: PPP_EAP_ACTION = 0,
    public var dwAuthResultCode: UInt = 0u,
    public var pUserAttributes: Long = 0L,
    public var fInvokeInteractiveUI: BOOL = 0,
    public var pUIContextData: Long = 0L,
    public var dwSizeOfUIContextData: UInt = 0u,
    public var fSaveConnectionData: BOOL = 0,
    public var pConnectionData: Long = 0L,
    public var dwSizeOfConnectionData: UInt = 0u,
    public var fSaveUserData: BOOL = 0,
    public var pUserData: Long = 0L,
    public var dwSizeOfUserData: UInt = 0u,
    public var pNgcKerbTicket: Long = 0L,
    public var fSaveToCredMan: BOOL = 0,
)

public data class PPP_EAP_PACKET(
    public var Code: UByte = 0u,
    public var Id: UByte = 0u,
    public var Length: UByteArray = UByteArray(2),
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PPP_EAP_PACKET) return false
        if (this.Code != other.Code) return false
        if (this.Id != other.Id) return false
        if (!this.Length.contentEquals(other.Length)) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Code.hashCode()
        result = 31 * result + this.Id.hashCode()
        result = 31 * result + this.Length.contentHashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class RAS_AUTH_ATTRIBUTE(
    public var raaType: RAS_AUTH_ATTRIBUTE_TYPE = 0,
    public var dwLength: UInt = 0u,
    public var Value: Long = 0L,
)
