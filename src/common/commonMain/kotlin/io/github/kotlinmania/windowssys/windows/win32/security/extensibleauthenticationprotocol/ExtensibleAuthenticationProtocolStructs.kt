@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.NcryptKeyHandle

public data class EaphostAuthInfo(
    public var status: EaphostAuthStatus = 0,
    public var dwErrorCode: UInt = 0u,
    public var dwReasonCode: UInt = 0u,
)

public data class EaphostIdentityUiParams(
    public var eapMethodType: EapMethodType = EapMethodType(),
    public var dwFlags: UInt = 0u,
    public var dwSizeofConnectionData: UInt = 0u,
    public var pConnectionData: COpaquePointer? = null,
    public var dwSizeofUserData: UInt = 0u,
    public var pUserData: COpaquePointer? = null,
    public var dwSizeofUserDataOut: UInt = 0u,
    public var pUserDataOut: COpaquePointer? = null,
    public var pwszIdentity: Pwstr = null,
    public var dwError: UInt = 0u,
    public var pEapError: EapError? = null,
)

public data class EaphostInteractiveUiParams(
    public var dwSizeofContextData: UInt = 0u,
    public var pContextData: COpaquePointer? = null,
    public var dwSizeofInteractiveUIData: UInt = 0u,
    public var pInteractiveUIData: COpaquePointer? = null,
    public var dwError: UInt = 0u,
    public var pEapError: EapError? = null,
)

public data class EapAttribute(
    public var eaType: EapAttributeType = 0,
    public var dwLength: UInt = 0u,
    public var pValue: COpaquePointer? = null,
)

public data class EapAttributes(public var dwNumberOfAttributes: UInt = 0u, public var pAttribs: EapAttribute? = null)

public data class EapAuthenticatorMethodRoutines(
    public var dwSizeInBytes: UInt = 0u,
    public var pEapType: EapMethodType? = null,
    public var eapMethodAuthenticatorInitialize: Int = 0,
    public var eapMethodAuthenticatorBeginSession: Int = 0,
    public var eapMethodAuthenticatorUpdateInnerMethodParams: Int = 0,
    public var eapMethodAuthenticatorReceivePacket: Int = 0,
    public var eapMethodAuthenticatorSendPacket: Int = 0,
    public var eapMethodAuthenticatorGetAttributes: Int = 0,
    public var eapMethodAuthenticatorSetAttributes: Int = 0,
    public var eapMethodAuthenticatorGetResult: Int = 0,
    public var eapMethodAuthenticatorEndSession: Int = 0,
    public var eapMethodAuthenticatorShutdown: Int = 0,
)

public data class EapConfigInputFieldArray(
    public var dwVersion: UInt = 0u,
    public var dwNumberOfFields: UInt = 0u,
    public var pFields: EapConfigInputFieldData? = null,
)

public data class EapConfigInputFieldData(
    public var dwSize: UInt = 0u,
    public var type: EapConfigInputFieldType = 0,
    public var dwFlagProps: UInt = 0u,
    public var pwszLabel: Pwstr = null,
    public var pwszData: Pwstr = null,
    public var dwMinDataLength: UInt = 0u,
    public var dwMaxDataLength: UInt = 0u,
)

public data class EapCredExpiryReq(public var curCreds: EapConfigInputFieldArray = EapConfigInputFieldArray(), public var newCreds: EapConfigInputFieldArray = EapConfigInputFieldArray())

public data class EapError(
    public var dwWinError: UInt = 0u,
    public var type: EapMethodType = EapMethodType(),
    public var dwReasonCode: UInt = 0u,
    public var rootCauseGuid: Guid = Guid(),
    public var repairGuid: Guid = Guid(),
    public var helpLinkGuid: Guid = Guid(),
    public var pRootCauseString: Pwstr = null,
    public var pRepairString: Pwstr = null,
)

public data class EapInteractiveUiData(
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var dwDataType: EapInteractiveUiDataType = 0,
    public var cbUiData: UInt = 0u,
    public var pbUiData: EapUiDataFormat = EapUiDataFormat(),
)

public data class EapMethodAuthenticatorResult(
    public var fIsSuccess: Bool = 0,
    public var dwFailureReason: UInt = 0u,
    public var pAuthAttribs: EapAttributes? = null,
)

public data class EapMethodInfo(
    public var eaptype: EapMethodType = EapMethodType(),
    public var pwszAuthorName: Pwstr = null,
    public var pwszFriendlyName: Pwstr = null,
    public var eapProperties: UInt = 0u,
    public var pInnerMethodInfo: EapMethodInfo? = null,
)

public data class EapMethodInfoArray(public var dwNumberOfMethods: UInt = 0u, public var pEapMethods: EapMethodInfo? = null)

public data class EapMethodInfoArrayEx(public var dwNumberOfMethods: UInt = 0u, public var pEapMethods: EapMethodInfoEx? = null)

public data class EapMethodInfoEx(
    public var eaptype: EapMethodType = EapMethodType(),
    public var pwszAuthorName: Pwstr = null,
    public var pwszFriendlyName: Pwstr = null,
    public var eapProperties: UInt = 0u,
    public var pInnerMethodInfoArray: EapMethodInfoArrayEx? = null,
)

public data class EapMethodProperty(
    public var eapMethodPropertyType: EapMethodPropertyType = 0,
    public var eapMethodPropertyValueType: EapMethodPropertyValueType = 0,
    public var eapMethodPropertyValue: EapMethodPropertyValue = EapMethodPropertyValue(),
)

public data class EapMethodPropertyArray(public var dwNumberOfProperties: UInt = 0u, public var pMethodProperty: EapMethodProperty? = null)

public data class EapMethodPropertyValue(
    public var empvBool: EapMethodPropertyValueBool = EapMethodPropertyValueBool(),
    public var empvDword: EapMethodPropertyValueDword = EapMethodPropertyValueDword(),
    public var empvString: EapMethodPropertyValueString = EapMethodPropertyValueString(),
)

public data class EapMethodPropertyValueBool(public var length: UInt = 0u, public var value: Bool = 0)

public data class EapMethodPropertyValueDword(public var length: UInt = 0u, public var value: UInt = 0u)

public data class EapMethodPropertyValueString(public var length: UInt = 0u, public var value: COpaquePointer? = null)

public data class EapMethodType(public var eapType: EapType = EapType(), public var dwAuthorId: UInt = 0u)

public data class EapPeerMethodRoutines(
    public var dwVersion: UInt = 0u,
    public var pEapType: EapType? = null,
    public var eapPeerInitialize: Int = 0,
    public var eapPeerGetIdentity: Int = 0,
    public var eapPeerBeginSession: Int = 0,
    public var eapPeerSetCredentials: Int = 0,
    public var eapPeerProcessRequestPacket: Int = 0,
    public var eapPeerGetResponsePacket: Int = 0,
    public var eapPeerGetResult: Int = 0,
    public var eapPeerGetUIContext: Int = 0,
    public var eapPeerSetUIContext: Int = 0,
    public var eapPeerGetResponseAttributes: Int = 0,
    public var eapPeerSetResponseAttributes: Int = 0,
    public var eapPeerEndSession: Int = 0,
    public var eapPeerShutdown: Int = 0,
)

public data class EapType(
    public var type: UByte = 0u,
    public var dwVendorId: UInt = 0u,
    public var dwVendorType: UInt = 0u,
)

public data class EapUiDataFormat(
    public var credData: EapConfigInputFieldArray? = null,
    public var credExpiryData: EapCredExpiryReq? = null,
    public var credLogonData: EapConfigInputFieldArray? = null,
)

public data class EapCertificateCredential(public var certHash: UByteArray = UByteArray(20), public var password: Pwstr = null) {
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
    public var usernamePassword: EapUsernamePasswordCredential = EapUsernamePasswordCredential(),
    public var certificate: EapCertificateCredential = EapCertificateCredential(),
    public var sim: EapSimCredential = EapSimCredential(),
)

public data class EapHostPeerMethodResult(
    public var fIsSuccess: Bool = 0,
    public var dwFailureReasonCode: UInt = 0u,
    public var fSaveConnectionData: Bool = 0,
    public var dwSizeofConnectionData: UInt = 0u,
    public var pConnectionData: COpaquePointer? = null,
    public var fSaveUserData: Bool = 0,
    public var dwSizeofUserData: UInt = 0u,
    public var pUserData: COpaquePointer? = null,
    public var pAttribArray: EapAttributes? = null,
    public var isolationState: IsolationState = 0,
    public var pEapMethodInfo: EapMethodInfo? = null,
    public var pEapError: EapError? = null,
)

public data class EapPacket(
    public var code: UByte = 0u,
    public var id: UByte = 0u,
    public var length: UByteArray = UByteArray(2),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapPacket) return false
        if (this.code != other.code) return false
        if (this.id != other.id) return false
        if (!this.length.contentEquals(other.length)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.code.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.length.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class EapPeerMethodOutput(public var action: EapPeerMethodResponseAction = 0, public var fAllowNotifications: Bool = 0)

public data class EapPeerMethodResult(
    public var fIsSuccess: Bool = 0,
    public var dwFailureReasonCode: UInt = 0u,
    public var fSaveConnectionData: Bool = 0,
    public var dwSizeofConnectionData: UInt = 0u,
    public var pConnectionData: COpaquePointer? = null,
    public var fSaveUserData: Bool = 0,
    public var dwSizeofUserData: UInt = 0u,
    public var pUserData: COpaquePointer? = null,
    public var pAttribArray: EapAttributes? = null,
    public var pEapError: EapError? = null,
    public var pNgcKerbTicket: NgcTicketContext? = null,
    public var fSaveToCredMan: Bool = 0,
)

public data class EapSimCredential(public var iccID: Pwstr = null)

public data class EapUsernamePasswordCredential(public var username: Pwstr = null, public var password: Pwstr = null)

public data class LegacyIdentityUiParams(
    public var eapType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSizeofConnectionData: UInt = 0u,
    public var pConnectionData: COpaquePointer? = null,
    public var dwSizeofUserData: UInt = 0u,
    public var pUserData: COpaquePointer? = null,
    public var dwSizeofUserDataOut: UInt = 0u,
    public var pUserDataOut: COpaquePointer? = null,
    public var pwszIdentity: Pwstr = null,
    public var dwError: UInt = 0u,
)

public data class LegacyInteractiveUiParams(
    public var eapType: UInt = 0u,
    public var dwSizeofContextData: UInt = 0u,
    public var pContextData: COpaquePointer? = null,
    public var dwSizeofInteractiveUIData: UInt = 0u,
    public var pInteractiveUIData: COpaquePointer? = null,
    public var dwError: UInt = 0u,
)

public data class NgcTicketContext(
    public var wszTicket: UShortArray = UShortArray(45),
    public var hKey: NcryptKeyHandle = 0uL,
    public var hImpersonateToken: Handle = null,
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

public data class PppEapInfo(
    public var dwSizeInBytes: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var rasEapInitialize: Int = 0,
    public var rasEapBegin: Int = 0,
    public var rasEapEnd: Int = 0,
    public var rasEapMakeMessage: Int = 0,
)

public class PppEapInput(
    public var dwSizeInBytes: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var fAuthenticator: Bool = 0,
    public var pwszIdentity: Pwstr = null,
    public var pwszPassword: Pwstr = null,
    public var bInitialId: UByte = 0u,
    public var pUserAttributes: RasAuthAttribute? = null,
    public var fAuthenticationComplete: Bool = 0,
    public var dwAuthResultCode: UInt = 0u,
    public var hTokenImpersonateUser: Handle = null,
    public var fSuccessPacketReceived: Bool = 0,
    public var fDataReceivedFromInteractiveUI: Bool = 0,
    public var pDataFromInteractiveUI: COpaquePointer? = null,
    public var dwSizeOfDataFromInteractiveUI: UInt = 0u,
    public var pConnectionData: COpaquePointer? = null,
    public var dwSizeOfConnectionData: UInt = 0u,
    public var pUserData: COpaquePointer? = null,
    public var dwSizeOfUserData: UInt = 0u,
    public var hReserved: Handle = null,
    public var guidConnectionId: Guid = Guid(),
    public var isVpn: Bool = 0,
)

public data class PppEapOutput(
    public var dwSizeInBytes: UInt = 0u,
    public var action: PppEapAction = 0,
    public var dwAuthResultCode: UInt = 0u,
    public var pUserAttributes: RasAuthAttribute? = null,
    public var fInvokeInteractiveUI: Bool = 0,
    public var pUIContextData: COpaquePointer? = null,
    public var dwSizeOfUIContextData: UInt = 0u,
    public var fSaveConnectionData: Bool = 0,
    public var pConnectionData: COpaquePointer? = null,
    public var dwSizeOfConnectionData: UInt = 0u,
    public var fSaveUserData: Bool = 0,
    public var pUserData: COpaquePointer? = null,
    public var dwSizeOfUserData: UInt = 0u,
    public var pNgcKerbTicket: NgcTicketContext? = null,
    public var fSaveToCredMan: Bool = 0,
)

public data class PppEapPacket(
    public var code: UByte = 0u,
    public var id: UByte = 0u,
    public var length: UByteArray = UByteArray(2),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppEapPacket) return false
        if (this.code != other.code) return false
        if (this.id != other.id) return false
        if (!this.length.contentEquals(other.length)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.code.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.length.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class RasAuthAttribute(
    public var raaType: RasAuthAttributeType = 0,
    public var dwLength: UInt = 0u,
    public var value: COpaquePointer? = null,
)
