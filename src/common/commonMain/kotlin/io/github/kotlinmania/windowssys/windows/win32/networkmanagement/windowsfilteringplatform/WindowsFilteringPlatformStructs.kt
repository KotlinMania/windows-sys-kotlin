@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes

public data class FwpmAction0(
    public var type: FwpActionType = 0u,
    public var anonymous: FwpmAction00 = FwpmAction00(),
)

public data class FwpmAction00(
    public var filterType: Guid = Guid(),
    public var calloutKey: Guid = Guid(),
)

public data class FwpmCallout0(
    public var calloutKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var providerKey: Guid? = null,
    public var providerData: FwpByteBlob = FwpByteBlob(),
    public var applicableLayer: Guid = Guid(),
    public var calloutId: UInt = 0u,
)

public data class FwpmCalloutChange0(
    public var changeType: FwpmChangeType = 0,
    public var calloutKey: Guid = Guid(),
    public var calloutId: UInt = 0u,
)

public data class FwpmCalloutEnumTemplate0(
    public var providerKey: Guid? = null,
    public var layerKey: Guid = Guid(),
)

public data class FwpmCalloutSubscription0(
    public var enumTemplate: FwpmCalloutEnumTemplate0? = null,
    public var flags: UInt = 0u,
    public var sessionKey: Guid = Guid(),
)

public data class FwpmClassifyOption0(
    public var type: FwpClassifyOptionType = 0,
    public var value: FwpValue0 = FwpValue0(),
)

public data class FwpmClassifyOptions0(
    public var numOptions: UInt = 0u,
    public var options: FwpmClassifyOption0? = null,
)

public data class FwpmConnection0(
    public var connectionId: ULong = 0uL,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: FwpmConnection00 = FwpmConnection00(),
    public var anonymous2: FwpmConnection01 = FwpmConnection01(),
    public var providerKey: Guid? = null,
    public var ipsecTrafficModeType: IpsecTrafficType = 0,
    public var keyModuleType: IkeextKeyModuleType = 0,
    public var mmCrypto: IkeextProposal0 = IkeextProposal0(),
    public var mmPeer: IkeextCredential2 = IkeextCredential2(),
    public var emPeer: IkeextCredential2 = IkeextCredential2(),
    public var bytesTransferredIn: ULong = 0uL,
    public var bytesTransferredOut: ULong = 0uL,
    public var bytesTransferredTotal: ULong = 0uL,
    public var startSysTime: Filetime = Filetime(),
)

public data class FwpmConnection00(
    public var localV4Address: UInt = 0u,
    public var localV6Address: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmConnection00) return false
        if (this.localV4Address != other.localV4Address) return false
        if (!this.localV6Address.contentEquals(other.localV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localV4Address.hashCode()
        result = 31 * result + this.localV6Address.contentHashCode()
        return result
    }
}

public data class FwpmConnection01(
    public var remoteV4Address: UInt = 0u,
    public var remoteV6Address: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmConnection01) return false
        if (this.remoteV4Address != other.remoteV4Address) return false
        if (!this.remoteV6Address.contentEquals(other.remoteV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteV4Address.hashCode()
        result = 31 * result + this.remoteV6Address.contentHashCode()
        return result
    }
}

public data class FwpmConnectionEnumTemplate0(
    public var connectionId: ULong = 0uL,
    public var flags: UInt = 0u,
)

public data class FwpmConnectionSubscription0(
    public var enumTemplate: FwpmConnectionEnumTemplate0? = null,
    public var flags: UInt = 0u,
    public var sessionKey: Guid = Guid(),
)

public data class FwpmDisplayData0(
    public var name: Pwstr = null,
    public var description: Pwstr = null,
)

public data class FwpmField0(
    public var fieldKey: Guid? = null,
    public var type: FwpmFieldType = 0,
    public var dataType: FwpDataType = 0,
)

public data class FwpmFilter0(
    public var filterKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: FwpmFilterFlags = 0u,
    public var providerKey: Guid? = null,
    public var providerData: FwpByteBlob = FwpByteBlob(),
    public var layerKey: Guid = Guid(),
    public var subLayerKey: Guid = Guid(),
    public var weight: FwpValue0 = FwpValue0(),
    public var numFilterConditions: UInt = 0u,
    public var filterCondition: FwpmFilterCondition0? = null,
    public var action: FwpmAction0 = FwpmAction0(),
    public var anonymous: FwpmFilter00 = FwpmFilter00(),
    public var reserved: Guid? = null,
    public var filterId: ULong = 0uL,
    public var effectiveWeight: FwpValue0 = FwpValue0(),
)

public data class FwpmFilter00(
    public var rawContext: ULong = 0uL,
    public var providerContextKey: Guid = Guid(),
)

public data class FwpmFilterChange0(
    public var changeType: FwpmChangeType = 0,
    public var filterKey: Guid = Guid(),
    public var filterId: ULong = 0uL,
)

public data class FwpmFilterCondition0(
    public var fieldKey: Guid = Guid(),
    public var matchType: FwpMatchType = 0,
    public var conditionValue: FwpConditionValue0 = FwpConditionValue0(),
)

public data class FwpmFilterEnumTemplate0(
    public var providerKey: Guid? = null,
    public var layerKey: Guid = Guid(),
    public var enumType: FwpFilterEnumType = 0,
    public var flags: UInt = 0u,
    public var providerContextTemplate: FwpmProviderContextEnumTemplate0? = null,
    public var numFilterConditions: UInt = 0u,
    public var filterCondition: FwpmFilterCondition0? = null,
    public var actionMask: UInt = 0u,
    public var calloutKey: Guid? = null,
)

public data class FwpmFilterSubscription0(
    public var enumTemplate: FwpmFilterEnumTemplate0? = null,
    public var flags: UInt = 0u,
    public var sessionKey: Guid = Guid(),
)

public data class FwpmLayer0(
    public var layerKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var numFields: UInt = 0u,
    public var field: FwpmField0? = null,
    public var defaultSubLayerKey: Guid = Guid(),
    public var layerId: UShort = 0u,
)

public data class FwpmLayerEnumTemplate0(
    public var reserved: ULong = 0uL,
)

public data class FwpmLayerStatistics0(
    public var layerId: Guid = Guid(),
    public var classifyPermitCount: UInt = 0u,
    public var classifyBlockCount: UInt = 0u,
    public var classifyVetoCount: UInt = 0u,
    public var numCacheEntries: UInt = 0u,
)

public data class FwpmNetworkConnectionPolicySetting0(
    public var type: FwpNetworkConnectionPolicySettingType = 0,
    public var value: FwpValue0 = FwpValue0(),
)

public data class FwpmNetworkConnectionPolicySettings0(
    public var numSettings: UInt = 0u,
    public var settings: FwpmNetworkConnectionPolicySetting0? = null,
)

public data class FwpmNetEvent0(
    public var header: FwpmNetEventHeader0 = FwpmNetEventHeader0(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent00 = FwpmNetEvent00(),
)

public data class FwpmNetEvent00(
    public var ikeMmFailure: FwpmNetEventIkeextMmFailure0? = null,
    public var ikeQmFailure: FwpmNetEventIkeextQmFailure0? = null,
    public var ikeEmFailure: FwpmNetEventIkeextEmFailure0? = null,
    public var classifyDrop: FwpmNetEventClassifyDrop0? = null,
    public var ipsecDrop: FwpmNetEventIpsecKernelDrop0? = null,
    public var idpDrop: FwpmNetEventIpsecDospDrop0? = null,
)

public data class FwpmNetEvent1(
    public var header: FwpmNetEventHeader1 = FwpmNetEventHeader1(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent10 = FwpmNetEvent10(),
)

public data class FwpmNetEvent10(
    public var ikeMmFailure: FwpmNetEventIkeextMmFailure1? = null,
    public var ikeQmFailure: FwpmNetEventIkeextQmFailure0? = null,
    public var ikeEmFailure: FwpmNetEventIkeextEmFailure1? = null,
    public var classifyDrop: FwpmNetEventClassifyDrop1? = null,
    public var ipsecDrop: FwpmNetEventIpsecKernelDrop0? = null,
    public var idpDrop: FwpmNetEventIpsecDospDrop0? = null,
)

public data class FwpmNetEvent2(
    public var header: FwpmNetEventHeader2 = FwpmNetEventHeader2(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent20 = FwpmNetEvent20(),
)

public data class FwpmNetEvent20(
    public var ikeMmFailure: FwpmNetEventIkeextMmFailure1? = null,
    public var ikeQmFailure: FwpmNetEventIkeextQmFailure0? = null,
    public var ikeEmFailure: FwpmNetEventIkeextEmFailure1? = null,
    public var classifyDrop: FwpmNetEventClassifyDrop2? = null,
    public var ipsecDrop: FwpmNetEventIpsecKernelDrop0? = null,
    public var idpDrop: FwpmNetEventIpsecDospDrop0? = null,
    public var classifyAllow: FwpmNetEventClassifyAllow0? = null,
    public var capabilityDrop: FwpmNetEventCapabilityDrop0? = null,
    public var capabilityAllow: FwpmNetEventCapabilityAllow0? = null,
    public var classifyDropMac: FwpmNetEventClassifyDropMac0? = null,
)

public data class FwpmNetEvent3(
    public var header: FwpmNetEventHeader3 = FwpmNetEventHeader3(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent30 = FwpmNetEvent30(),
)

public data class FwpmNetEvent30(
    public var ikeMmFailure: FwpmNetEventIkeextMmFailure1? = null,
    public var ikeQmFailure: FwpmNetEventIkeextQmFailure0? = null,
    public var ikeEmFailure: FwpmNetEventIkeextEmFailure1? = null,
    public var classifyDrop: FwpmNetEventClassifyDrop2? = null,
    public var ipsecDrop: FwpmNetEventIpsecKernelDrop0? = null,
    public var idpDrop: FwpmNetEventIpsecDospDrop0? = null,
    public var classifyAllow: FwpmNetEventClassifyAllow0? = null,
    public var capabilityDrop: FwpmNetEventCapabilityDrop0? = null,
    public var capabilityAllow: FwpmNetEventCapabilityAllow0? = null,
    public var classifyDropMac: FwpmNetEventClassifyDropMac0? = null,
)

public data class FwpmNetEvent4(
    public var header: FwpmNetEventHeader3 = FwpmNetEventHeader3(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent40 = FwpmNetEvent40(),
)

public data class FwpmNetEvent40(
    public var ikeMmFailure: FwpmNetEventIkeextMmFailure2? = null,
    public var ikeQmFailure: FwpmNetEventIkeextQmFailure1? = null,
    public var ikeEmFailure: FwpmNetEventIkeextEmFailure1? = null,
    public var classifyDrop: FwpmNetEventClassifyDrop2? = null,
    public var ipsecDrop: FwpmNetEventIpsecKernelDrop0? = null,
    public var idpDrop: FwpmNetEventIpsecDospDrop0? = null,
    public var classifyAllow: FwpmNetEventClassifyAllow0? = null,
    public var capabilityDrop: FwpmNetEventCapabilityDrop0? = null,
    public var capabilityAllow: FwpmNetEventCapabilityAllow0? = null,
    public var classifyDropMac: FwpmNetEventClassifyDropMac0? = null,
)

public data class FwpmNetEvent5(
    public var header: FwpmNetEventHeader3 = FwpmNetEventHeader3(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent50 = FwpmNetEvent50(),
)

public data class FwpmNetEvent50(
    public var ikeMmFailure: FwpmNetEventIkeextMmFailure2? = null,
    public var ikeQmFailure: FwpmNetEventIkeextQmFailure1? = null,
    public var ikeEmFailure: FwpmNetEventIkeextEmFailure1? = null,
    public var classifyDrop: FwpmNetEventClassifyDrop2? = null,
    public var ipsecDrop: FwpmNetEventIpsecKernelDrop0? = null,
    public var idpDrop: FwpmNetEventIpsecDospDrop0? = null,
    public var classifyAllow: FwpmNetEventClassifyAllow0? = null,
    public var capabilityDrop: FwpmNetEventCapabilityDrop0? = null,
    public var capabilityAllow: FwpmNetEventCapabilityAllow0? = null,
    public var classifyDropMac: FwpmNetEventClassifyDropMac0? = null,
    public var lpmPacketArrival: FwpmNetEventLpmPacketArrival0? = null,
)

public data class FwpmNetEventCapabilityAllow0(
    public var networkCapabilityId: FwpmAppcNetworkCapabilityType = 0,
    public var filterId: ULong = 0uL,
    public var isLoopback: Bool = 0,
)

public data class FwpmNetEventCapabilityDrop0(
    public var networkCapabilityId: FwpmAppcNetworkCapabilityType = 0,
    public var filterId: ULong = 0uL,
    public var isLoopback: Bool = 0,
)

public data class FwpmNetEventClassifyAllow0(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: Bool = 0,
)

public data class FwpmNetEventClassifyDrop0(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
)

public data class FwpmNetEventClassifyDrop1(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: Bool = 0,
)

public data class FwpmNetEventClassifyDrop2(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: Bool = 0,
    public var vSwitchId: FwpByteBlob = FwpByteBlob(),
    public var vSwitchSourcePort: UInt = 0u,
    public var vSwitchDestinationPort: UInt = 0u,
)

public class FwpmNetEventClassifyDropMac0(
    public var localMacAddr: FwpByteArray6 = FwpByteArray6(),
    public var remoteMacAddr: FwpByteArray6 = FwpByteArray6(),
    public var mediaType: UInt = 0u,
    public var ifType: UInt = 0u,
    public var etherType: UShort = 0u,
    public var ndisPortNumber: UInt = 0u,
    public var reserved: UInt = 0u,
    public var vlanTag: UShort = 0u,
    public var ifLuid: ULong = 0uL,
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: Bool = 0,
    public var vSwitchId: FwpByteBlob = FwpByteBlob(),
    public var vSwitchSourcePort: UInt = 0u,
    public var vSwitchDestinationPort: UInt = 0u,
)

public data class FwpmNetEventEnumTemplate0(
    public var startTime: Filetime = Filetime(),
    public var endTime: Filetime = Filetime(),
    public var numFilterConditions: UInt = 0u,
    public var filterCondition: FwpmFilterCondition0? = null,
)

public data class FwpmNetEventHeader0(
    public var timeStamp: Filetime = Filetime(),
    public var flags: UInt = 0u,
    public var ipVersion: FwpIpVersion = 0,
    public var ipProtocol: UByte = 0u,
    public var anonymous1: FwpmNetEventHeader00 = FwpmNetEventHeader00(),
    public var anonymous2: FwpmNetEventHeader01 = FwpmNetEventHeader01(),
    public var localPort: UShort = 0u,
    public var remotePort: UShort = 0u,
    public var scopeId: UInt = 0u,
    public var appId: FwpByteBlob = FwpByteBlob(),
    public var userId: Sid? = null,
)

public data class FwpmNetEventHeader00(
    public var localAddrV4: UInt = 0u,
    public var localAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader01(
    public var remoteAddrV4: UInt = 0u,
    public var remoteAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader1(
    public var timeStamp: Filetime = Filetime(),
    public var flags: UInt = 0u,
    public var ipVersion: FwpIpVersion = 0,
    public var ipProtocol: UByte = 0u,
    public var anonymous1: FwpmNetEventHeader10 = FwpmNetEventHeader10(),
    public var anonymous2: FwpmNetEventHeader11 = FwpmNetEventHeader11(),
    public var localPort: UShort = 0u,
    public var remotePort: UShort = 0u,
    public var scopeId: UInt = 0u,
    public var appId: FwpByteBlob = FwpByteBlob(),
    public var userId: Sid? = null,
    public var anonymous3: FwpmNetEventHeader12 = FwpmNetEventHeader12(),
)

public data class FwpmNetEventHeader10(
    public var localAddrV4: UInt = 0u,
    public var localAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader11(
    public var remoteAddrV4: UInt = 0u,
    public var remoteAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader12(
    public var anonymous: FwpmNetEventHeader120 = FwpmNetEventHeader120(),
)

public data class FwpmNetEventHeader120(
    public var reserved1: FwpAf = 0,
    public var anonymous: FwpmNetEventHeader1200 = FwpmNetEventHeader1200(),
)

public data class FwpmNetEventHeader1200(
    public var anonymous: FwpmNetEventHeader12000 = FwpmNetEventHeader12000(),
)

public data class FwpmNetEventHeader12000(
    public var reserved2: FwpByteArray6 = FwpByteArray6(),
    public var reserved3: FwpByteArray6 = FwpByteArray6(),
    public var reserved4: UInt = 0u,
    public var reserved5: UInt = 0u,
    public var reserved6: UShort = 0u,
    public var reserved7: UInt = 0u,
    public var reserved8: UInt = 0u,
    public var reserved9: UShort = 0u,
    public var reserved10: ULong = 0uL,
)

public data class FwpmNetEventHeader2(
    public var timeStamp: Filetime = Filetime(),
    public var flags: UInt = 0u,
    public var ipVersion: FwpIpVersion = 0,
    public var ipProtocol: UByte = 0u,
    public var anonymous1: FwpmNetEventHeader20 = FwpmNetEventHeader20(),
    public var anonymous2: FwpmNetEventHeader21 = FwpmNetEventHeader21(),
    public var localPort: UShort = 0u,
    public var remotePort: UShort = 0u,
    public var scopeId: UInt = 0u,
    public var appId: FwpByteBlob = FwpByteBlob(),
    public var userId: Sid? = null,
    public var addressFamily: FwpAf = 0,
    public var packageSid: Sid? = null,
)

public data class FwpmNetEventHeader20(
    public var localAddrV4: UInt = 0u,
    public var localAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader21(
    public var remoteAddrV4: UInt = 0u,
    public var remoteAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader3(
    public var timeStamp: Filetime = Filetime(),
    public var flags: UInt = 0u,
    public var ipVersion: FwpIpVersion = 0,
    public var ipProtocol: UByte = 0u,
    public var anonymous1: FwpmNetEventHeader30 = FwpmNetEventHeader30(),
    public var anonymous2: FwpmNetEventHeader31 = FwpmNetEventHeader31(),
    public var localPort: UShort = 0u,
    public var remotePort: UShort = 0u,
    public var scopeId: UInt = 0u,
    public var appId: FwpByteBlob = FwpByteBlob(),
    public var userId: Sid? = null,
    public var addressFamily: FwpAf = 0,
    public var packageSid: Sid? = null,
    public var enterpriseId: Pwstr = null,
    public var policyFlags: ULong = 0uL,
    public var effectiveName: FwpByteBlob = FwpByteBlob(),
)

public data class FwpmNetEventHeader30(
    public var localAddrV4: UInt = 0u,
    public var localAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader31(
    public var remoteAddrV4: UInt = 0u,
    public var remoteAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventIkeextEmFailure0(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var flags: UInt = 0u,
    public var emState: IkeextEmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var emAuthMethod: IkeextAuthenticationMethodType = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var qmFilterId: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIkeextEmFailure0) return false
        if (this.failureErrorCode != other.failureErrorCode) return false
        if (this.failurePoint != other.failurePoint) return false
        if (this.flags != other.flags) return false
        if (this.emState != other.emState) return false
        if (this.saRole != other.saRole) return false
        if (this.emAuthMethod != other.emAuthMethod) return false
        if (!this.endCertHash.contentEquals(other.endCertHash)) return false
        if (this.mmId != other.mmId) return false
        if (this.qmFilterId != other.qmFilterId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.failureErrorCode.hashCode()
        result = 31 * result + this.failurePoint.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.emState.hashCode()
        result = 31 * result + this.saRole.hashCode()
        result = 31 * result + this.emAuthMethod.hashCode()
        result = 31 * result + this.endCertHash.contentHashCode()
        result = 31 * result + this.mmId.hashCode()
        result = 31 * result + this.qmFilterId.hashCode()
        return result
    }
}

public data class FwpmNetEventIkeextEmFailure1(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var flags: UInt = 0u,
    public var emState: IkeextEmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var emAuthMethod: IkeextAuthenticationMethodType = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var qmFilterId: ULong = 0uL,
    public var localPrincipalNameForAuth: Pwstr = null,
    public var remotePrincipalNameForAuth: Pwstr = null,
    public var numLocalPrincipalGroupSids: UInt = 0u,
    public var localPrincipalGroupSids: Pwstr? = null,
    public var numRemotePrincipalGroupSids: UInt = 0u,
    public var remotePrincipalGroupSids: Pwstr? = null,
    public var saTrafficType: IpsecTrafficType = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIkeextEmFailure1) return false
        if (this.failureErrorCode != other.failureErrorCode) return false
        if (this.failurePoint != other.failurePoint) return false
        if (this.flags != other.flags) return false
        if (this.emState != other.emState) return false
        if (this.saRole != other.saRole) return false
        if (this.emAuthMethod != other.emAuthMethod) return false
        if (!this.endCertHash.contentEquals(other.endCertHash)) return false
        if (this.mmId != other.mmId) return false
        if (this.qmFilterId != other.qmFilterId) return false
        if (this.localPrincipalNameForAuth != other.localPrincipalNameForAuth) return false
        if (this.remotePrincipalNameForAuth != other.remotePrincipalNameForAuth) return false
        if (this.numLocalPrincipalGroupSids != other.numLocalPrincipalGroupSids) return false
        if (this.localPrincipalGroupSids != other.localPrincipalGroupSids) return false
        if (this.numRemotePrincipalGroupSids != other.numRemotePrincipalGroupSids) return false
        if (this.remotePrincipalGroupSids != other.remotePrincipalGroupSids) return false
        if (this.saTrafficType != other.saTrafficType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.failureErrorCode.hashCode()
        result = 31 * result + this.failurePoint.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.emState.hashCode()
        result = 31 * result + this.saRole.hashCode()
        result = 31 * result + this.emAuthMethod.hashCode()
        result = 31 * result + this.endCertHash.contentHashCode()
        result = 31 * result + this.mmId.hashCode()
        result = 31 * result + this.qmFilterId.hashCode()
        result = 31 * result + this.localPrincipalNameForAuth.hashCode()
        result = 31 * result + this.remotePrincipalNameForAuth.hashCode()
        result = 31 * result + this.numLocalPrincipalGroupSids.hashCode()
        result = 31 * result + this.localPrincipalGroupSids.hashCode()
        result = 31 * result + this.numRemotePrincipalGroupSids.hashCode()
        result = 31 * result + this.remotePrincipalGroupSids.hashCode()
        result = 31 * result + this.saTrafficType.hashCode()
        return result
    }
}

public data class FwpmNetEventIkeextMmFailure0(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var flags: UInt = 0u,
    public var keyingModuleType: IkeextKeyModuleType = 0,
    public var mmState: IkeextMmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var mmAuthMethod: IkeextAuthenticationMethodType = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var mmFilterId: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIkeextMmFailure0) return false
        if (this.failureErrorCode != other.failureErrorCode) return false
        if (this.failurePoint != other.failurePoint) return false
        if (this.flags != other.flags) return false
        if (this.keyingModuleType != other.keyingModuleType) return false
        if (this.mmState != other.mmState) return false
        if (this.saRole != other.saRole) return false
        if (this.mmAuthMethod != other.mmAuthMethod) return false
        if (!this.endCertHash.contentEquals(other.endCertHash)) return false
        if (this.mmId != other.mmId) return false
        if (this.mmFilterId != other.mmFilterId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.failureErrorCode.hashCode()
        result = 31 * result + this.failurePoint.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.keyingModuleType.hashCode()
        result = 31 * result + this.mmState.hashCode()
        result = 31 * result + this.saRole.hashCode()
        result = 31 * result + this.mmAuthMethod.hashCode()
        result = 31 * result + this.endCertHash.contentHashCode()
        result = 31 * result + this.mmId.hashCode()
        result = 31 * result + this.mmFilterId.hashCode()
        return result
    }
}

public data class FwpmNetEventIkeextMmFailure1(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var flags: UInt = 0u,
    public var keyingModuleType: IkeextKeyModuleType = 0,
    public var mmState: IkeextMmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var mmAuthMethod: IkeextAuthenticationMethodType = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var mmFilterId: ULong = 0uL,
    public var localPrincipalNameForAuth: Pwstr = null,
    public var remotePrincipalNameForAuth: Pwstr = null,
    public var numLocalPrincipalGroupSids: UInt = 0u,
    public var localPrincipalGroupSids: Pwstr? = null,
    public var numRemotePrincipalGroupSids: UInt = 0u,
    public var remotePrincipalGroupSids: Pwstr? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIkeextMmFailure1) return false
        if (this.failureErrorCode != other.failureErrorCode) return false
        if (this.failurePoint != other.failurePoint) return false
        if (this.flags != other.flags) return false
        if (this.keyingModuleType != other.keyingModuleType) return false
        if (this.mmState != other.mmState) return false
        if (this.saRole != other.saRole) return false
        if (this.mmAuthMethod != other.mmAuthMethod) return false
        if (!this.endCertHash.contentEquals(other.endCertHash)) return false
        if (this.mmId != other.mmId) return false
        if (this.mmFilterId != other.mmFilterId) return false
        if (this.localPrincipalNameForAuth != other.localPrincipalNameForAuth) return false
        if (this.remotePrincipalNameForAuth != other.remotePrincipalNameForAuth) return false
        if (this.numLocalPrincipalGroupSids != other.numLocalPrincipalGroupSids) return false
        if (this.localPrincipalGroupSids != other.localPrincipalGroupSids) return false
        if (this.numRemotePrincipalGroupSids != other.numRemotePrincipalGroupSids) return false
        if (this.remotePrincipalGroupSids != other.remotePrincipalGroupSids) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.failureErrorCode.hashCode()
        result = 31 * result + this.failurePoint.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.keyingModuleType.hashCode()
        result = 31 * result + this.mmState.hashCode()
        result = 31 * result + this.saRole.hashCode()
        result = 31 * result + this.mmAuthMethod.hashCode()
        result = 31 * result + this.endCertHash.contentHashCode()
        result = 31 * result + this.mmId.hashCode()
        result = 31 * result + this.mmFilterId.hashCode()
        result = 31 * result + this.localPrincipalNameForAuth.hashCode()
        result = 31 * result + this.remotePrincipalNameForAuth.hashCode()
        result = 31 * result + this.numLocalPrincipalGroupSids.hashCode()
        result = 31 * result + this.localPrincipalGroupSids.hashCode()
        result = 31 * result + this.numRemotePrincipalGroupSids.hashCode()
        result = 31 * result + this.remotePrincipalGroupSids.hashCode()
        return result
    }
}

public class FwpmNetEventIkeextMmFailure2(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var flags: UInt = 0u,
    public var keyingModuleType: IkeextKeyModuleType = 0,
    public var mmState: IkeextMmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var mmAuthMethod: IkeextAuthenticationMethodType = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var mmFilterId: ULong = 0uL,
    public var localPrincipalNameForAuth: Pwstr = null,
    public var remotePrincipalNameForAuth: Pwstr = null,
    public var numLocalPrincipalGroupSids: UInt = 0u,
    public var localPrincipalGroupSids: Pwstr? = null,
    public var numRemotePrincipalGroupSids: UInt = 0u,
    public var remotePrincipalGroupSids: Pwstr? = null,
    public var providerContextKey: Guid? = null,
)

public data class FwpmNetEventIkeextQmFailure0(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var keyingModuleType: IkeextKeyModuleType = 0,
    public var qmState: IkeextQmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var saTrafficType: IpsecTrafficType = 0,
    public var anonymous1: FwpmNetEventIkeextQmFailure00 = FwpmNetEventIkeextQmFailure00(),
    public var anonymous2: FwpmNetEventIkeextQmFailure01 = FwpmNetEventIkeextQmFailure01(),
    public var qmFilterId: ULong = 0uL,
)

public data class FwpmNetEventIkeextQmFailure00(
    public var localSubNet: FwpConditionValue0 = FwpConditionValue0(),
)

public data class FwpmNetEventIkeextQmFailure01(
    public var remoteSubNet: FwpConditionValue0 = FwpConditionValue0(),
)

public data class FwpmNetEventIkeextQmFailure1(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var keyingModuleType: IkeextKeyModuleType = 0,
    public var qmState: IkeextQmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var saTrafficType: IpsecTrafficType = 0,
    public var anonymous1: FwpmNetEventIkeextQmFailure10 = FwpmNetEventIkeextQmFailure10(),
    public var anonymous2: FwpmNetEventIkeextQmFailure11 = FwpmNetEventIkeextQmFailure11(),
    public var qmFilterId: ULong = 0uL,
    public var mmSaLuid: ULong = 0uL,
    public var mmProviderContextKey: Guid = Guid(),
)

public data class FwpmNetEventIkeextQmFailure10(
    public var localSubNet: FwpConditionValue0 = FwpConditionValue0(),
)

public data class FwpmNetEventIkeextQmFailure11(
    public var remoteSubNet: FwpConditionValue0 = FwpConditionValue0(),
)

public data class FwpmNetEventIpsecDospDrop0(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: FwpmNetEventIpsecDospDrop00 = FwpmNetEventIpsecDospDrop00(),
    public var anonymous2: FwpmNetEventIpsecDospDrop01 = FwpmNetEventIpsecDospDrop01(),
    public var failureStatus: Int = 0,
    public var direction: FwpDirection = 0,
)

public data class FwpmNetEventIpsecDospDrop00(
    public var publicHostV4Addr: UInt = 0u,
    public var publicHostV6Addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIpsecDospDrop00) return false
        if (this.publicHostV4Addr != other.publicHostV4Addr) return false
        if (!this.publicHostV6Addr.contentEquals(other.publicHostV6Addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.publicHostV4Addr.hashCode()
        result = 31 * result + this.publicHostV6Addr.contentHashCode()
        return result
    }
}

public data class FwpmNetEventIpsecDospDrop01(
    public var internalHostV4Addr: UInt = 0u,
    public var internalHostV6Addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIpsecDospDrop01) return false
        if (this.internalHostV4Addr != other.internalHostV4Addr) return false
        if (!this.internalHostV6Addr.contentEquals(other.internalHostV6Addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.internalHostV4Addr.hashCode()
        result = 31 * result + this.internalHostV6Addr.contentHashCode()
        return result
    }
}

public data class FwpmNetEventIpsecKernelDrop0(
    public var failureStatus: Int = 0,
    public var direction: FwpDirection = 0,
    public var spi: UInt = 0u,
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
)

public data class FwpmNetEventLpmPacketArrival0(
    public var spi: UInt = 0u,
)

public data class FwpmNetEventSubscription0(
    public var enumTemplate: FwpmNetEventEnumTemplate0? = null,
    public var flags: UInt = 0u,
    public var sessionKey: Guid = Guid(),
)

public data class FwpmProvider0(
    public var providerKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var providerData: FwpByteBlob = FwpByteBlob(),
    public var serviceName: Pwstr = null,
)

public data class FwpmProviderChange0(
    public var changeType: FwpmChangeType = 0,
    public var providerKey: Guid = Guid(),
)

public data class FwpmProviderContext0(
    public var providerContextKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var providerKey: Guid? = null,
    public var providerData: FwpByteBlob = FwpByteBlob(),
    public var type: FwpmProviderContextType = 0,
    public var anonymous: FwpmProviderContext00 = FwpmProviderContext00(),
    public var providerContextId: ULong = 0uL,
)

public data class FwpmProviderContext00(
    public var keyingPolicy: IpsecKeyingPolicy0? = null,
    public var ikeQmTransportPolicy: IpsecTransportPolicy0? = null,
    public var ikeQmTunnelPolicy: IpsecTunnelPolicy0? = null,
    public var authipQmTransportPolicy: IpsecTransportPolicy0? = null,
    public var authipQmTunnelPolicy: IpsecTunnelPolicy0? = null,
    public var ikeMmPolicy: IkeextPolicy0? = null,
    public var authIpMmPolicy: IkeextPolicy0? = null,
    public var dataBuffer: FwpByteBlob? = null,
    public var classifyOptions: FwpmClassifyOptions0? = null,
)

public data class FwpmProviderContext1(
    public var providerContextKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var providerKey: Guid? = null,
    public var providerData: FwpByteBlob = FwpByteBlob(),
    public var type: FwpmProviderContextType = 0,
    public var anonymous: FwpmProviderContext10 = FwpmProviderContext10(),
    public var providerContextId: ULong = 0uL,
)

public data class FwpmProviderContext10(
    public var keyingPolicy: IpsecKeyingPolicy0? = null,
    public var ikeQmTransportPolicy: IpsecTransportPolicy1? = null,
    public var ikeQmTunnelPolicy: IpsecTunnelPolicy1? = null,
    public var authipQmTransportPolicy: IpsecTransportPolicy1? = null,
    public var authipQmTunnelPolicy: IpsecTunnelPolicy1? = null,
    public var ikeMmPolicy: IkeextPolicy1? = null,
    public var authIpMmPolicy: IkeextPolicy1? = null,
    public var dataBuffer: FwpByteBlob? = null,
    public var classifyOptions: FwpmClassifyOptions0? = null,
    public var ikeV2QmTunnelPolicy: IpsecTunnelPolicy1? = null,
    public var ikeV2MmPolicy: IkeextPolicy1? = null,
    public var idpOptions: IpsecDospOptions0? = null,
)

public data class FwpmProviderContext2(
    public var providerContextKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var providerKey: Guid? = null,
    public var providerData: FwpByteBlob = FwpByteBlob(),
    public var type: FwpmProviderContextType = 0,
    public var anonymous: FwpmProviderContext20 = FwpmProviderContext20(),
    public var providerContextId: ULong = 0uL,
)

public data class FwpmProviderContext20(
    public var keyingPolicy: IpsecKeyingPolicy1? = null,
    public var ikeQmTransportPolicy: IpsecTransportPolicy2? = null,
    public var ikeQmTunnelPolicy: IpsecTunnelPolicy2? = null,
    public var authipQmTransportPolicy: IpsecTransportPolicy2? = null,
    public var authipQmTunnelPolicy: IpsecTunnelPolicy2? = null,
    public var ikeMmPolicy: IkeextPolicy2? = null,
    public var authIpMmPolicy: IkeextPolicy2? = null,
    public var dataBuffer: FwpByteBlob? = null,
    public var classifyOptions: FwpmClassifyOptions0? = null,
    public var ikeV2QmTunnelPolicy: IpsecTunnelPolicy2? = null,
    public var ikeV2QmTransportPolicy: IpsecTransportPolicy2? = null,
    public var ikeV2MmPolicy: IkeextPolicy2? = null,
    public var idpOptions: IpsecDospOptions0? = null,
)

public data class FwpmProviderContext3(
    public var providerContextKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var providerKey: Guid? = null,
    public var providerData: FwpByteBlob = FwpByteBlob(),
    public var type: FwpmProviderContextType = 0,
    public var anonymous: FwpmProviderContext30 = FwpmProviderContext30(),
    public var providerContextId: ULong = 0uL,
)

public data class FwpmProviderContext30(
    public var keyingPolicy: IpsecKeyingPolicy1? = null,
    public var ikeQmTransportPolicy: IpsecTransportPolicy2? = null,
    public var ikeQmTunnelPolicy: IpsecTunnelPolicy3? = null,
    public var authipQmTransportPolicy: IpsecTransportPolicy2? = null,
    public var authipQmTunnelPolicy: IpsecTunnelPolicy3? = null,
    public var ikeMmPolicy: IkeextPolicy2? = null,
    public var authIpMmPolicy: IkeextPolicy2? = null,
    public var dataBuffer: FwpByteBlob? = null,
    public var classifyOptions: FwpmClassifyOptions0? = null,
    public var ikeV2QmTunnelPolicy: IpsecTunnelPolicy3? = null,
    public var ikeV2QmTransportPolicy: IpsecTransportPolicy2? = null,
    public var ikeV2MmPolicy: IkeextPolicy2? = null,
    public var idpOptions: IpsecDospOptions0? = null,
    public var networkConnectionPolicy: FwpmNetworkConnectionPolicySettings0? = null,
)

public data class FwpmProviderContextChange0(
    public var changeType: FwpmChangeType = 0,
    public var providerContextKey: Guid = Guid(),
    public var providerContextId: ULong = 0uL,
)

public data class FwpmProviderContextEnumTemplate0(
    public var providerKey: Guid? = null,
    public var providerContextType: FwpmProviderContextType = 0,
)

public data class FwpmProviderContextSubscription0(
    public var enumTemplate: FwpmProviderContextEnumTemplate0? = null,
    public var flags: FwpmSubscriptionFlags = 0u,
    public var sessionKey: Guid = Guid(),
)

public data class FwpmProviderEnumTemplate0(
    public var reserved: ULong = 0uL,
)

public data class FwpmProviderSubscription0(
    public var enumTemplate: FwpmProviderEnumTemplate0? = null,
    public var flags: UInt = 0u,
    public var sessionKey: Guid = Guid(),
)

public data class FwpmSession0(
    public var sessionKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var txnWaitTimeoutInMSec: UInt = 0u,
    public var processId: UInt = 0u,
    public var sid: Sid? = null,
    public var username: Pwstr = null,
    public var kernelMode: Bool = 0,
)

public data class FwpmSessionEnumTemplate0(
    public var reserved: ULong = 0uL,
)

public class FwpmStatistics0(
    public var numLayerStatistics: UInt = 0u,
    public var layerStatistics: FwpmLayerStatistics0? = null,
    public var inboundAllowedConnectionsV4: UInt = 0u,
    public var inboundBlockedConnectionsV4: UInt = 0u,
    public var outboundAllowedConnectionsV4: UInt = 0u,
    public var outboundBlockedConnectionsV4: UInt = 0u,
    public var inboundAllowedConnectionsV6: UInt = 0u,
    public var inboundBlockedConnectionsV6: UInt = 0u,
    public var outboundAllowedConnectionsV6: UInt = 0u,
    public var outboundBlockedConnectionsV6: UInt = 0u,
    public var inboundActiveConnectionsV4: UInt = 0u,
    public var outboundActiveConnectionsV4: UInt = 0u,
    public var inboundActiveConnectionsV6: UInt = 0u,
    public var outboundActiveConnectionsV6: UInt = 0u,
    public var reauthDirInbound: ULong = 0uL,
    public var reauthDirOutbound: ULong = 0uL,
    public var reauthFamilyV4: ULong = 0uL,
    public var reauthFamilyV6: ULong = 0uL,
    public var reauthProtoOther: ULong = 0uL,
    public var reauthProtoIPv4: ULong = 0uL,
    public var reauthProtoIPv6: ULong = 0uL,
    public var reauthProtoICMP: ULong = 0uL,
    public var reauthProtoICMP6: ULong = 0uL,
    public var reauthProtoUDP: ULong = 0uL,
    public var reauthProtoTCP: ULong = 0uL,
    public var reauthReasonPolicyChange: ULong = 0uL,
    public var reauthReasonNewArrivalInterface: ULong = 0uL,
    public var reauthReasonNewNextHopInterface: ULong = 0uL,
    public var reauthReasonProfileCrossing: ULong = 0uL,
    public var reauthReasonClassifyCompletion: ULong = 0uL,
    public var reauthReasonIPSecPropertiesChanged: ULong = 0uL,
    public var reauthReasonMidStreamInspection: ULong = 0uL,
    public var reauthReasonSocketPropertyChanged: ULong = 0uL,
    public var reauthReasonNewInboundMCastBCastPacket: ULong = 0uL,
    public var reauthReasonEDPPolicyChanged: ULong = 0uL,
    public var reauthReasonProxyHandleChanged: ULong = 0uL,
)

public data class FwpmSublayer0(
    public var subLayerKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var providerKey: Guid? = null,
    public var providerData: FwpByteBlob = FwpByteBlob(),
    public var weight: UShort = 0u,
)

public data class FwpmSublayerChange0(
    public var changeType: FwpmChangeType = 0,
    public var subLayerKey: Guid = Guid(),
)

public data class FwpmSublayerEnumTemplate0(
    public var providerKey: Guid? = null,
)

public data class FwpmSublayerSubscription0(
    public var enumTemplate: FwpmSublayerEnumTemplate0? = null,
    public var flags: FwpmSubscriptionFlags = 0u,
    public var sessionKey: Guid = Guid(),
)

public data class FwpmSystemPorts0(
    public var numTypes: UInt = 0u,
    public var types: FwpmSystemPortsByType0? = null,
)

public data class FwpmSystemPortsByType0(
    public var type: FwpmSystemPortType = 0,
    public var numPorts: UInt = 0u,
    public var ports: UShort? = null,
)

public data class FwpmVswitchEvent0(
    public var eventType: FwpmVswitchEventType = 0,
    public var vSwitchId: Pwstr = null,
    public var anonymous: FwpmVswitchEvent00 = FwpmVswitchEvent00(),
)

public data class FwpmVswitchEvent00(
    public var positionInfo: FwpmVswitchEvent000 = FwpmVswitchEvent000(),
    public var reorderInfo: FwpmVswitchEvent001 = FwpmVswitchEvent001(),
)

public data class FwpmVswitchEvent000(
    public var numvSwitchFilterExtensions: UInt = 0u,
    public var vSwitchFilterExtensions: Pwstr? = null,
)

public data class FwpmVswitchEvent001(
    public var inRequiredPosition: Bool = 0,
    public var numvSwitchFilterExtensions: UInt = 0u,
    public var vSwitchFilterExtensions: Pwstr? = null,
)

public data class FwpmVswitchEventSubscription0(
    public var flags: UInt = 0u,
    public var sessionKey: Guid = Guid(),
)

public data class FwpByteArray16(
    public var byteArray16: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpByteArray16) return false
        if (!this.byteArray16.contentEquals(other.byteArray16)) return false
        return true
    }

    override fun hashCode(): Int = this.byteArray16.contentHashCode()
}

public data class FwpByteArray6(
    public var byteArray6: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpByteArray6) return false
        if (!this.byteArray6.contentEquals(other.byteArray6)) return false
        return true
    }

    override fun hashCode(): Int = this.byteArray6.contentHashCode()
}

public data class FwpByteBlob(
    public var size: UInt = 0u,
    public var data: COpaquePointer? = null,
)

public data class FwpConditionValue0(
    public var type: FwpDataType = 0,
    public var anonymous: FwpConditionValue00 = FwpConditionValue00(),
)

public class FwpConditionValue00(
    public var uint8: UByte = 0u,
    public var uint16: UShort = 0u,
    public var uint32: UInt = 0u,
    public var uint64: ULong? = null,
    public var int8: Byte = 0,
    public var int16: Short = 0,
    public var int32: Int = 0,
    public var int64: Long? = null,
    public var float32: Float = 0.0f,
    public var double64: Double? = null,
    public var byteArray16: FwpByteArray16? = null,
    public var byteBlob: FwpByteBlob? = null,
    public var sid: Sid? = null,
    public var sd: FwpByteBlob? = null,
    public var tokenInformation: FwpTokenInformation? = null,
    public var tokenAccessInformation: FwpByteBlob? = null,
    public var unicodeString: Pwstr = null,
    public var byteArray6: FwpByteArray6? = null,
    public var v4AddrMask: FwpV4AddrAndMask? = null,
    public var v6AddrMask: FwpV6AddrAndMask? = null,
    public var rangeValue: FwpRange0? = null,
)

public data class FwpRange0(
    public var valueLow: FwpValue0 = FwpValue0(),
    public var valueHigh: FwpValue0 = FwpValue0(),
)

public data class FwpTokenInformation(
    public var sidCount: UInt = 0u,
    public var sids: SidAndAttributes? = null,
    public var restrictedSidCount: UInt = 0u,
    public var restrictedSids: SidAndAttributes? = null,
)

public data class FwpV4AddrAndMask(
    public var addr: UInt = 0u,
    public var mask: UInt = 0u,
)

public data class FwpV6AddrAndMask(
    public var addr: UByteArray = UByteArray(16),
    public var prefixLength: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpV6AddrAndMask) return false
        if (!this.addr.contentEquals(other.addr)) return false
        if (this.prefixLength != other.prefixLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addr.contentHashCode()
        result = 31 * result + this.prefixLength.hashCode()
        return result
    }
}

public data class FwpValue0(
    public var type: FwpDataType = 0,
    public var anonymous: FwpValue00 = FwpValue00(),
)

public class FwpValue00(
    public var uint8: UByte = 0u,
    public var uint16: UShort = 0u,
    public var uint32: UInt = 0u,
    public var uint64: ULong? = null,
    public var int8: Byte = 0,
    public var int16: Short = 0,
    public var int32: Int = 0,
    public var int64: Long? = null,
    public var float32: Float = 0.0f,
    public var double64: Double? = null,
    public var byteArray16: FwpByteArray16? = null,
    public var byteBlob: FwpByteBlob? = null,
    public var sid: Sid? = null,
    public var sd: FwpByteBlob? = null,
    public var tokenInformation: FwpTokenInformation? = null,
    public var tokenAccessInformation: FwpByteBlob? = null,
    public var unicodeString: Pwstr = null,
    public var byteArray6: FwpByteArray6? = null,
)

public data class IkeextAuthenticationMethod0(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var anonymous: IkeextAuthenticationMethod00 = IkeextAuthenticationMethod00(),
)

public data class IkeextAuthenticationMethod00(
    public var presharedKeyAuthentication: IkeextPresharedKeyAuthentication0 = IkeextPresharedKeyAuthentication0(),
    public var certificateAuthentication: IkeextCertificateAuthentication0 = IkeextCertificateAuthentication0(),
    public var kerberosAuthentication: IkeextKerberosAuthentication0 = IkeextKerberosAuthentication0(),
    public var ntlmV2Authentication: IkeextNtlmV2Authentication0 = IkeextNtlmV2Authentication0(),
    public var sslAuthentication: IkeextCertificateAuthentication0 = IkeextCertificateAuthentication0(),
    public var cgaAuthentication: IkeextIpv6CgaAuthentication0 = IkeextIpv6CgaAuthentication0(),
)

public data class IkeextAuthenticationMethod1(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var anonymous: IkeextAuthenticationMethod10 = IkeextAuthenticationMethod10(),
)

public data class IkeextAuthenticationMethod10(
    public var presharedKeyAuthentication: IkeextPresharedKeyAuthentication1 = IkeextPresharedKeyAuthentication1(),
    public var certificateAuthentication: IkeextCertificateAuthentication1 = IkeextCertificateAuthentication1(),
    public var kerberosAuthentication: IkeextKerberosAuthentication0 = IkeextKerberosAuthentication0(),
    public var ntlmV2Authentication: IkeextNtlmV2Authentication0 = IkeextNtlmV2Authentication0(),
    public var sslAuthentication: IkeextCertificateAuthentication1 = IkeextCertificateAuthentication1(),
    public var cgaAuthentication: IkeextIpv6CgaAuthentication0 = IkeextIpv6CgaAuthentication0(),
    public var eapAuthentication: IkeextEapAuthentication0 = IkeextEapAuthentication0(),
)

public data class IkeextAuthenticationMethod2(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var anonymous: IkeextAuthenticationMethod20 = IkeextAuthenticationMethod20(),
)

public data class IkeextAuthenticationMethod20(
    public var presharedKeyAuthentication: IkeextPresharedKeyAuthentication1 = IkeextPresharedKeyAuthentication1(),
    public var certificateAuthentication: IkeextCertificateAuthentication2 = IkeextCertificateAuthentication2(),
    public var kerberosAuthentication: IkeextKerberosAuthentication1 = IkeextKerberosAuthentication1(),
    public var reservedAuthentication: IkeextReservedAuthentication0 = IkeextReservedAuthentication0(),
    public var ntlmV2Authentication: IkeextNtlmV2Authentication0 = IkeextNtlmV2Authentication0(),
    public var sslAuthentication: IkeextCertificateAuthentication2 = IkeextCertificateAuthentication2(),
    public var cgaAuthentication: IkeextIpv6CgaAuthentication0 = IkeextIpv6CgaAuthentication0(),
    public var eapAuthentication: IkeextEapAuthentication0 = IkeextEapAuthentication0(),
)

public data class IkeextCertificateAuthentication0(
    public var inboundConfigType: IkeextCertConfigType = 0,
    public var anonymous1: IkeextCertificateAuthentication00 = IkeextCertificateAuthentication00(),
    public var outboundConfigType: IkeextCertConfigType = 0,
    public var anonymous2: IkeextCertificateAuthentication01 = IkeextCertificateAuthentication01(),
    public var flags: IkeextCertAuth = 0u,
)

public data class IkeextCertificateAuthentication00(
    public var anonymous: IkeextCertificateAuthentication000 = IkeextCertificateAuthentication000(),
    public var inboundEnterpriseStoreConfig: IkeextCertRootConfig0? = null,
    public var inboundTrustedRootStoreConfig: IkeextCertRootConfig0? = null,
)

public data class IkeextCertificateAuthentication000(
    public var inboundRootArraySize: UInt = 0u,
    public var inboundRootArray: IkeextCertRootConfig0? = null,
)

public data class IkeextCertificateAuthentication01(
    public var anonymous: IkeextCertificateAuthentication010 = IkeextCertificateAuthentication010(),
    public var outboundEnterpriseStoreConfig: IkeextCertRootConfig0? = null,
    public var outboundTrustedRootStoreConfig: IkeextCertRootConfig0? = null,
)

public data class IkeextCertificateAuthentication010(
    public var outboundRootArraySize: UInt = 0u,
    public var outboundRootArray: IkeextCertRootConfig0? = null,
)

public data class IkeextCertificateAuthentication1(
    public var inboundConfigType: IkeextCertConfigType = 0,
    public var anonymous1: IkeextCertificateAuthentication10 = IkeextCertificateAuthentication10(),
    public var outboundConfigType: IkeextCertConfigType = 0,
    public var anonymous2: IkeextCertificateAuthentication11 = IkeextCertificateAuthentication11(),
    public var flags: IkeextCertAuth = 0u,
    public var localCertLocationUrl: FwpByteBlob = FwpByteBlob(),
)

public data class IkeextCertificateAuthentication10(
    public var anonymous: IkeextCertificateAuthentication100 = IkeextCertificateAuthentication100(),
    public var inboundEnterpriseStoreConfig: IkeextCertRootConfig0? = null,
    public var inboundTrustedRootStoreConfig: IkeextCertRootConfig0? = null,
)

public data class IkeextCertificateAuthentication100(
    public var inboundRootArraySize: UInt = 0u,
    public var inboundRootArray: IkeextCertRootConfig0? = null,
)

public data class IkeextCertificateAuthentication11(
    public var anonymous: IkeextCertificateAuthentication110 = IkeextCertificateAuthentication110(),
    public var outboundEnterpriseStoreConfig: IkeextCertRootConfig0? = null,
    public var outboundTrustedRootStoreConfig: IkeextCertRootConfig0? = null,
)

public data class IkeextCertificateAuthentication110(
    public var outboundRootArraySize: UInt = 0u,
    public var outboundRootArray: IkeextCertRootConfig0? = null,
)

public data class IkeextCertificateAuthentication2(
    public var inboundConfigType: IkeextCertConfigType = 0,
    public var anonymous1: IkeextCertificateAuthentication20 = IkeextCertificateAuthentication20(),
    public var outboundConfigType: IkeextCertConfigType = 0,
    public var anonymous2: IkeextCertificateAuthentication21 = IkeextCertificateAuthentication21(),
    public var flags: IkeextCertAuth = 0u,
    public var localCertLocationUrl: FwpByteBlob = FwpByteBlob(),
)

public data class IkeextCertificateAuthentication20(
    public var anonymous1: IkeextCertificateAuthentication200 = IkeextCertificateAuthentication200(),
    public var anonymous2: IkeextCertificateAuthentication201 = IkeextCertificateAuthentication201(),
    public var anonymous3: IkeextCertificateAuthentication202 = IkeextCertificateAuthentication202(),
)

public data class IkeextCertificateAuthentication200(
    public var inboundRootArraySize: UInt = 0u,
    public var inboundRootCriteria: IkeextCertificateCriteria0? = null,
)

public data class IkeextCertificateAuthentication201(
    public var inboundEnterpriseStoreArraySize: UInt = 0u,
    public var inboundEnterpriseStoreCriteria: IkeextCertificateCriteria0? = null,
)

public data class IkeextCertificateAuthentication202(
    public var inboundRootStoreArraySize: UInt = 0u,
    public var inboundTrustedRootStoreCriteria: IkeextCertificateCriteria0? = null,
)

public data class IkeextCertificateAuthentication21(
    public var anonymous1: IkeextCertificateAuthentication210 = IkeextCertificateAuthentication210(),
    public var anonymous2: IkeextCertificateAuthentication211 = IkeextCertificateAuthentication211(),
    public var anonymous3: IkeextCertificateAuthentication212 = IkeextCertificateAuthentication212(),
)

public data class IkeextCertificateAuthentication210(
    public var outboundRootArraySize: UInt = 0u,
    public var outboundRootCriteria: IkeextCertificateCriteria0? = null,
)

public data class IkeextCertificateAuthentication211(
    public var outboundEnterpriseStoreArraySize: UInt = 0u,
    public var outboundEnterpriseStoreCriteria: IkeextCertificateCriteria0? = null,
)

public data class IkeextCertificateAuthentication212(
    public var outboundRootStoreArraySize: UInt = 0u,
    public var outboundTrustedRootStoreCriteria: IkeextCertificateCriteria0? = null,
)

public data class IkeextCertificateCredential0(
    public var subjectName: FwpByteBlob = FwpByteBlob(),
    public var certHash: FwpByteBlob = FwpByteBlob(),
    public var flags: UInt = 0u,
)

public data class IkeextCertificateCredential1(
    public var subjectName: FwpByteBlob = FwpByteBlob(),
    public var certHash: FwpByteBlob = FwpByteBlob(),
    public var flags: UInt = 0u,
    public var certificate: FwpByteBlob = FwpByteBlob(),
)

public data class IkeextCertificateCriteria0(
    public var certData: FwpByteBlob = FwpByteBlob(),
    public var certHash: FwpByteBlob = FwpByteBlob(),
    public var eku: IkeextCertEkus0? = null,
    public var name: IkeextCertName0? = null,
    public var flags: UInt = 0u,
)

public data class IkeextCertEkus0(
    public var numEku: UInt = 0u,
    public var eku: Pstr? = null,
)

public data class IkeextCertName0(
    public var nameType: IkeextCertCriteriaNameType = 0,
    public var certName: Pwstr = null,
)

public data class IkeextCertRootConfig0(
    public var certData: FwpByteBlob = FwpByteBlob(),
    public var flags: IkeextCertFlags = 0u,
)

public data class IkeextCipherAlgorithm0(
    public var algoIdentifier: IkeextCipherType = 0,
    public var keyLen: UInt = 0u,
    public var rounds: UInt = 0u,
)

public data class IkeextCommonStatistics0(
    public var v4Statistics: IkeextIpVersionSpecificCommonStatistics0 = IkeextIpVersionSpecificCommonStatistics0(),
    public var v6Statistics: IkeextIpVersionSpecificCommonStatistics0 = IkeextIpVersionSpecificCommonStatistics0(),
    public var totalPacketsReceived: UInt = 0u,
    public var totalInvalidPacketsReceived: UInt = 0u,
    public var currentQueuedWorkitems: UInt = 0u,
)

public data class IkeextCommonStatistics1(
    public var v4Statistics: IkeextIpVersionSpecificCommonStatistics1 = IkeextIpVersionSpecificCommonStatistics1(),
    public var v6Statistics: IkeextIpVersionSpecificCommonStatistics1 = IkeextIpVersionSpecificCommonStatistics1(),
    public var totalPacketsReceived: UInt = 0u,
    public var totalInvalidPacketsReceived: UInt = 0u,
    public var currentQueuedWorkitems: UInt = 0u,
)

public data class IkeextCookiePair0(
    public var initiator: ULong = 0uL,
    public var responder: ULong = 0uL,
)

public data class IkeextCredential0(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var impersonationType: IkeextAuthenticationImpersonationType = 0,
    public var anonymous: IkeextCredential00 = IkeextCredential00(),
)

public data class IkeextCredential00(
    public var presharedKey: IkeextPresharedKeyAuthentication0? = null,
    public var certificate: IkeextCertificateCredential0? = null,
    public var name: IkeextNameCredential0? = null,
)

public data class IkeextCredential1(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var impersonationType: IkeextAuthenticationImpersonationType = 0,
    public var anonymous: IkeextCredential10 = IkeextCredential10(),
)

public data class IkeextCredential10(
    public var presharedKey: IkeextPresharedKeyAuthentication1? = null,
    public var certificate: IkeextCertificateCredential1? = null,
    public var name: IkeextNameCredential0? = null,
)

public data class IkeextCredential2(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var impersonationType: IkeextAuthenticationImpersonationType = 0,
    public var anonymous: IkeextCredential20 = IkeextCredential20(),
)

public data class IkeextCredential20(
    public var presharedKey: IkeextPresharedKeyAuthentication1? = null,
    public var certificate: IkeextCertificateCredential1? = null,
    public var name: IkeextNameCredential0? = null,
)

public data class IkeextCredentials0(
    public var numCredentials: UInt = 0u,
    public var credentials: IkeextCredentialPair0? = null,
)

public data class IkeextCredentials1(
    public var numCredentials: UInt = 0u,
    public var credentials: IkeextCredentialPair1? = null,
)

public data class IkeextCredentials2(
    public var numCredentials: UInt = 0u,
    public var credentials: IkeextCredentialPair2? = null,
)

public data class IkeextCredentialPair0(
    public var localCredentials: IkeextCredential0 = IkeextCredential0(),
    public var peerCredentials: IkeextCredential0 = IkeextCredential0(),
)

public data class IkeextCredentialPair1(
    public var localCredentials: IkeextCredential1 = IkeextCredential1(),
    public var peerCredentials: IkeextCredential1 = IkeextCredential1(),
)

public data class IkeextCredentialPair2(
    public var localCredentials: IkeextCredential2 = IkeextCredential2(),
    public var peerCredentials: IkeextCredential2 = IkeextCredential2(),
)

public data class IkeextEapAuthentication0(
    public var flags: IkeextEapAuthenticationFlags = 0u,
)

public data class IkeextEmPolicy0(
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: IkeextAuthenticationMethod0? = null,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
)

public data class IkeextEmPolicy1(
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: IkeextAuthenticationMethod1? = null,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
)

public data class IkeextEmPolicy2(
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: IkeextAuthenticationMethod2? = null,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
)

public data class IkeextIntegrityAlgorithm0(
    public var algoIdentifier: IkeextIntegrityType = 0,
)

public data class IkeextIpv6CgaAuthentication0(
    public var keyContainerName: Pwstr = null,
    public var cspName: Pwstr = null,
    public var cspType: UInt = 0u,
    public var cgaModifier: FwpByteArray16 = FwpByteArray16(),
    public var cgaCollisionCount: UByte = 0u,
)

public data class IkeextIpVersionSpecificCommonStatistics0(
    public var totalSocketReceiveFailures: UInt = 0u,
    public var totalSocketSendFailures: UInt = 0u,
)

public data class IkeextIpVersionSpecificCommonStatistics1(
    public var totalSocketReceiveFailures: UInt = 0u,
    public var totalSocketSendFailures: UInt = 0u,
)

public class IkeextIpVersionSpecificKeymoduleStatistics0(
    public var currentActiveMainModes: UInt = 0u,
    public var totalMainModesStarted: UInt = 0u,
    public var totalSuccessfulMainModes: UInt = 0u,
    public var totalFailedMainModes: UInt = 0u,
    public var totalResponderMainModes: UInt = 0u,
    public var currentNewResponderMainModes: UInt = 0u,
    public var currentActiveQuickModes: UInt = 0u,
    public var totalQuickModesStarted: UInt = 0u,
    public var totalSuccessfulQuickModes: UInt = 0u,
    public var totalFailedQuickModes: UInt = 0u,
    public var totalAcquires: UInt = 0u,
    public var totalReinitAcquires: UInt = 0u,
    public var currentActiveExtendedModes: UInt = 0u,
    public var totalExtendedModesStarted: UInt = 0u,
    public var totalSuccessfulExtendedModes: UInt = 0u,
    public var totalFailedExtendedModes: UInt = 0u,
    public var totalImpersonationExtendedModes: UInt = 0u,
    public var totalImpersonationMainModes: UInt = 0u,
)

public class IkeextIpVersionSpecificKeymoduleStatistics1(
    public var currentActiveMainModes: UInt = 0u,
    public var totalMainModesStarted: UInt = 0u,
    public var totalSuccessfulMainModes: UInt = 0u,
    public var totalFailedMainModes: UInt = 0u,
    public var totalResponderMainModes: UInt = 0u,
    public var currentNewResponderMainModes: UInt = 0u,
    public var currentActiveQuickModes: UInt = 0u,
    public var totalQuickModesStarted: UInt = 0u,
    public var totalSuccessfulQuickModes: UInt = 0u,
    public var totalFailedQuickModes: UInt = 0u,
    public var totalAcquires: UInt = 0u,
    public var totalReinitAcquires: UInt = 0u,
    public var currentActiveExtendedModes: UInt = 0u,
    public var totalExtendedModesStarted: UInt = 0u,
    public var totalSuccessfulExtendedModes: UInt = 0u,
    public var totalFailedExtendedModes: UInt = 0u,
    public var totalImpersonationExtendedModes: UInt = 0u,
    public var totalImpersonationMainModes: UInt = 0u,
)

public data class IkeextKerberosAuthentication0(
    public var flags: IkeextKerberosAuthenticationFlags = 0u,
)

public data class IkeextKerberosAuthentication1(
    public var flags: IkeextKerberosAuthenticationFlags = 0u,
    public var proxyServer: Pwstr = null,
)

public data class IkeextKeymoduleStatistics0(
    public var v4Statistics: IkeextIpVersionSpecificKeymoduleStatistics0 = IkeextIpVersionSpecificKeymoduleStatistics0(),
    public var v6Statistics: IkeextIpVersionSpecificKeymoduleStatistics0 = IkeextIpVersionSpecificKeymoduleStatistics0(),
    public var errorFrequencyTable: UIntArray = UIntArray(97),
    public var mainModeNegotiationTime: UInt = 0u,
    public var quickModeNegotiationTime: UInt = 0u,
    public var extendedModeNegotiationTime: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextKeymoduleStatistics0) return false
        if (this.v4Statistics != other.v4Statistics) return false
        if (this.v6Statistics != other.v6Statistics) return false
        if (!this.errorFrequencyTable.contentEquals(other.errorFrequencyTable)) return false
        if (this.mainModeNegotiationTime != other.mainModeNegotiationTime) return false
        if (this.quickModeNegotiationTime != other.quickModeNegotiationTime) return false
        if (this.extendedModeNegotiationTime != other.extendedModeNegotiationTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.v4Statistics.hashCode()
        result = 31 * result + this.v6Statistics.hashCode()
        result = 31 * result + this.errorFrequencyTable.contentHashCode()
        result = 31 * result + this.mainModeNegotiationTime.hashCode()
        result = 31 * result + this.quickModeNegotiationTime.hashCode()
        result = 31 * result + this.extendedModeNegotiationTime.hashCode()
        return result
    }
}

public data class IkeextKeymoduleStatistics1(
    public var v4Statistics: IkeextIpVersionSpecificKeymoduleStatistics1 = IkeextIpVersionSpecificKeymoduleStatistics1(),
    public var v6Statistics: IkeextIpVersionSpecificKeymoduleStatistics1 = IkeextIpVersionSpecificKeymoduleStatistics1(),
    public var errorFrequencyTable: UIntArray = UIntArray(97),
    public var mainModeNegotiationTime: UInt = 0u,
    public var quickModeNegotiationTime: UInt = 0u,
    public var extendedModeNegotiationTime: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextKeymoduleStatistics1) return false
        if (this.v4Statistics != other.v4Statistics) return false
        if (this.v6Statistics != other.v6Statistics) return false
        if (!this.errorFrequencyTable.contentEquals(other.errorFrequencyTable)) return false
        if (this.mainModeNegotiationTime != other.mainModeNegotiationTime) return false
        if (this.quickModeNegotiationTime != other.quickModeNegotiationTime) return false
        if (this.extendedModeNegotiationTime != other.extendedModeNegotiationTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.v4Statistics.hashCode()
        result = 31 * result + this.v6Statistics.hashCode()
        result = 31 * result + this.errorFrequencyTable.contentHashCode()
        result = 31 * result + this.mainModeNegotiationTime.hashCode()
        result = 31 * result + this.quickModeNegotiationTime.hashCode()
        result = 31 * result + this.extendedModeNegotiationTime.hashCode()
        return result
    }
}

public data class IkeextNameCredential0(
    public var principalName: Pwstr = null,
)

public data class IkeextNtlmV2Authentication0(
    public var flags: UInt = 0u,
)

public data class IkeextPolicy0(
    public var softExpirationTime: UInt = 0u,
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: IkeextAuthenticationMethod0? = null,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
    public var numIkeProposals: UInt = 0u,
    public var ikeProposals: IkeextProposal0? = null,
    public var flags: IkeextPolicyFlag = 0u,
    public var maxDynamicFilters: UInt = 0u,
)

public data class IkeextPolicy1(
    public var softExpirationTime: UInt = 0u,
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: IkeextAuthenticationMethod1? = null,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
    public var numIkeProposals: UInt = 0u,
    public var ikeProposals: IkeextProposal0? = null,
    public var flags: IkeextPolicyFlag = 0u,
    public var maxDynamicFilters: UInt = 0u,
    public var retransmitDurationSecs: UInt = 0u,
)

public data class IkeextPolicy2(
    public var softExpirationTime: UInt = 0u,
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: IkeextAuthenticationMethod2? = null,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
    public var numIkeProposals: UInt = 0u,
    public var ikeProposals: IkeextProposal0? = null,
    public var flags: IkeextPolicyFlag = 0u,
    public var maxDynamicFilters: UInt = 0u,
    public var retransmitDurationSecs: UInt = 0u,
)

public data class IkeextPresharedKeyAuthentication0(
    public var presharedKey: FwpByteBlob = FwpByteBlob(),
)

public data class IkeextPresharedKeyAuthentication1(
    public var presharedKey: FwpByteBlob = FwpByteBlob(),
    public var flags: IkeextPresharedKeyAuthenticationFlags = 0u,
)

public data class IkeextProposal0(
    public var cipherAlgorithm: IkeextCipherAlgorithm0 = IkeextCipherAlgorithm0(),
    public var integrityAlgorithm: IkeextIntegrityAlgorithm0 = IkeextIntegrityAlgorithm0(),
    public var maxLifetimeSeconds: UInt = 0u,
    public var dhGroup: IkeextDhGroup = 0,
    public var quickModeLimit: UInt = 0u,
)

public data class IkeextReservedAuthentication0(
    public var flags: IkeextReservedAuthenticationFlags = 0u,
)

public data class IkeextSaDetails0(
    public var saId: ULong = 0uL,
    public var keyModuleType: IkeextKeyModuleType = 0,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IkeextSaDetails00 = IkeextSaDetails00(),
    public var ikeTraffic: IkeextTraffic0 = IkeextTraffic0(),
    public var ikeProposal: IkeextProposal0 = IkeextProposal0(),
    public var cookiePair: IkeextCookiePair0 = IkeextCookiePair0(),
    public var ikeCredentials: IkeextCredentials0 = IkeextCredentials0(),
    public var ikePolicyKey: Guid = Guid(),
    public var virtualIfTunnelId: ULong = 0uL,
)

public data class IkeextSaDetails00(
    public var v4UdpEncapsulation: IpsecV4UdpEncapsulation0? = null,
)

public data class IkeextSaDetails1(
    public var saId: ULong = 0uL,
    public var keyModuleType: IkeextKeyModuleType = 0,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IkeextSaDetails10 = IkeextSaDetails10(),
    public var ikeTraffic: IkeextTraffic0 = IkeextTraffic0(),
    public var ikeProposal: IkeextProposal0 = IkeextProposal0(),
    public var cookiePair: IkeextCookiePair0 = IkeextCookiePair0(),
    public var ikeCredentials: IkeextCredentials1 = IkeextCredentials1(),
    public var ikePolicyKey: Guid = Guid(),
    public var virtualIfTunnelId: ULong = 0uL,
    public var correlationKey: FwpByteBlob = FwpByteBlob(),
)

public data class IkeextSaDetails10(
    public var v4UdpEncapsulation: IpsecV4UdpEncapsulation0? = null,
)

public data class IkeextSaDetails2(
    public var saId: ULong = 0uL,
    public var keyModuleType: IkeextKeyModuleType = 0,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IkeextSaDetails20 = IkeextSaDetails20(),
    public var ikeTraffic: IkeextTraffic0 = IkeextTraffic0(),
    public var ikeProposal: IkeextProposal0 = IkeextProposal0(),
    public var cookiePair: IkeextCookiePair0 = IkeextCookiePair0(),
    public var ikeCredentials: IkeextCredentials2 = IkeextCredentials2(),
    public var ikePolicyKey: Guid = Guid(),
    public var virtualIfTunnelId: ULong = 0uL,
    public var correlationKey: FwpByteBlob = FwpByteBlob(),
)

public data class IkeextSaDetails20(
    public var v4UdpEncapsulation: IpsecV4UdpEncapsulation0? = null,
)

public data class IkeextSaEnumTemplate0(
    public var localSubNet: FwpConditionValue0 = FwpConditionValue0(),
    public var remoteSubNet: FwpConditionValue0 = FwpConditionValue0(),
    public var localMainModeCertHash: FwpByteBlob = FwpByteBlob(),
)

public data class IkeextStatistics0(
    public var ikeStatistics: IkeextKeymoduleStatistics0 = IkeextKeymoduleStatistics0(),
    public var authipStatistics: IkeextKeymoduleStatistics0 = IkeextKeymoduleStatistics0(),
    public var commonStatistics: IkeextCommonStatistics0 = IkeextCommonStatistics0(),
)

public data class IkeextStatistics1(
    public var ikeStatistics: IkeextKeymoduleStatistics1 = IkeextKeymoduleStatistics1(),
    public var authipStatistics: IkeextKeymoduleStatistics1 = IkeextKeymoduleStatistics1(),
    public var ikeV2Statistics: IkeextKeymoduleStatistics1 = IkeextKeymoduleStatistics1(),
    public var commonStatistics: IkeextCommonStatistics1 = IkeextCommonStatistics1(),
)

public data class IkeextTraffic0(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: IkeextTraffic00 = IkeextTraffic00(),
    public var anonymous2: IkeextTraffic01 = IkeextTraffic01(),
    public var authIpFilterId: ULong = 0uL,
)

public data class IkeextTraffic00(
    public var localV4Address: UInt = 0u,
    public var localV6Address: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextTraffic00) return false
        if (this.localV4Address != other.localV4Address) return false
        if (!this.localV6Address.contentEquals(other.localV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localV4Address.hashCode()
        result = 31 * result + this.localV6Address.contentHashCode()
        return result
    }
}

public data class IkeextTraffic01(
    public var remoteV4Address: UInt = 0u,
    public var remoteV6Address: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextTraffic01) return false
        if (this.remoteV4Address != other.remoteV4Address) return false
        if (!this.remoteV6Address.contentEquals(other.remoteV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteV4Address.hashCode()
        result = 31 * result + this.remoteV6Address.contentHashCode()
        return result
    }
}

public data class IpsecAddressInfo0(
    public var numV4Addresses: UInt = 0u,
    public var v4Addresses: UInt? = null,
    public var numV6Addresses: UInt = 0u,
    public var v6Addresses: FwpByteArray16? = null,
)

public data class IpsecAggregateDropPacketStatistics0(
    public var invalidSpisOnInbound: UInt = 0u,
    public var decryptionFailuresOnInbound: UInt = 0u,
    public var authenticationFailuresOnInbound: UInt = 0u,
    public var udpEspValidationFailuresOnInbound: UInt = 0u,
    public var replayCheckFailuresOnInbound: UInt = 0u,
    public var invalidClearTextInbound: UInt = 0u,
    public var saNotInitializedOnInbound: UInt = 0u,
    public var receiveOverIncorrectSaInbound: UInt = 0u,
    public var secureReceivesNotMatchingFilters: UInt = 0u,
)

public data class IpsecAggregateDropPacketStatistics1(
    public var invalidSpisOnInbound: UInt = 0u,
    public var decryptionFailuresOnInbound: UInt = 0u,
    public var authenticationFailuresOnInbound: UInt = 0u,
    public var udpEspValidationFailuresOnInbound: UInt = 0u,
    public var replayCheckFailuresOnInbound: UInt = 0u,
    public var invalidClearTextInbound: UInt = 0u,
    public var saNotInitializedOnInbound: UInt = 0u,
    public var receiveOverIncorrectSaInbound: UInt = 0u,
    public var secureReceivesNotMatchingFilters: UInt = 0u,
    public var totalDropPacketsInbound: UInt = 0u,
)

public data class IpsecAggregateSaStatistics0(
    public var activeSas: UInt = 0u,
    public var pendingSaNegotiations: UInt = 0u,
    public var totalSasAdded: UInt = 0u,
    public var totalSasDeleted: UInt = 0u,
    public var successfulRekeys: UInt = 0u,
    public var activeTunnels: UInt = 0u,
    public var offloadedSas: UInt = 0u,
)

public data class IpsecAhDropPacketStatistics0(
    public var invalidSpisOnInbound: UInt = 0u,
    public var authenticationFailuresOnInbound: UInt = 0u,
    public var replayCheckFailuresOnInbound: UInt = 0u,
    public var saNotInitializedOnInbound: UInt = 0u,
)

public data class IpsecAuthAndCipherTransform0(
    public var authTransform: IpsecAuthTransform0 = IpsecAuthTransform0(),
    public var cipherTransform: IpsecCipherTransform0 = IpsecCipherTransform0(),
)

public data class IpsecAuthTransform0(
    public var authTransformId: IpsecAuthTransformId0 = IpsecAuthTransformId0(),
    public var cryptoModuleId: Guid? = null,
)

public data class IpsecAuthTransformId0(
    public var authType: IpsecAuthType = 0,
    public var authConfig: UByte = 0u,
)

public data class IpsecCipherTransform0(
    public var cipherTransformId: IpsecCipherTransformId0 = IpsecCipherTransformId0(),
    public var cryptoModuleId: Guid? = null,
)

public data class IpsecCipherTransformId0(
    public var cipherType: IpsecCipherType = 0,
    public var cipherConfig: UByte = 0u,
)

public class IpsecDospOptions0(
    public var stateIdleTimeoutSeconds: UInt = 0u,
    public var perIPRateLimitQueueIdleTimeoutSeconds: UInt = 0u,
    public var ipV6IPsecUnauthDscp: UByte = 0u,
    public var ipV6IPsecUnauthRateLimitBytesPerSec: UInt = 0u,
    public var ipV6IPsecUnauthPerIPRateLimitBytesPerSec: UInt = 0u,
    public var ipV6IPsecAuthDscp: UByte = 0u,
    public var ipV6IPsecAuthRateLimitBytesPerSec: UInt = 0u,
    public var icmpV6Dscp: UByte = 0u,
    public var icmpV6RateLimitBytesPerSec: UInt = 0u,
    public var ipV6FilterExemptDscp: UByte = 0u,
    public var ipV6FilterExemptRateLimitBytesPerSec: UInt = 0u,
    public var defBlockExemptDscp: UByte = 0u,
    public var defBlockExemptRateLimitBytesPerSec: UInt = 0u,
    public var maxStateEntries: UInt = 0u,
    public var maxPerIPRateLimitQueues: UInt = 0u,
    public var flags: IpsecDospFlags = 0u,
    public var numPublicIFLuids: UInt = 0u,
    public var publicIFLuids: ULong? = null,
    public var numInternalIFLuids: UInt = 0u,
    public var internalIFLuids: ULong? = null,
    public var publicV6AddrMask: FwpV6AddrAndMask = FwpV6AddrAndMask(),
    public var internalV6AddrMask: FwpV6AddrAndMask = FwpV6AddrAndMask(),
)

public data class IpsecDospState0(
    public var publicHostV6Addr: UByteArray = UByteArray(16),
    public var internalHostV6Addr: UByteArray = UByteArray(16),
    public var totalInboundIPv6IPsecAuthPackets: ULong = 0uL,
    public var totalOutboundIPv6IPsecAuthPackets: ULong = 0uL,
    public var durationSecs: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecDospState0) return false
        if (!this.publicHostV6Addr.contentEquals(other.publicHostV6Addr)) return false
        if (!this.internalHostV6Addr.contentEquals(other.internalHostV6Addr)) return false
        if (this.totalInboundIPv6IPsecAuthPackets != other.totalInboundIPv6IPsecAuthPackets) return false
        if (this.totalOutboundIPv6IPsecAuthPackets != other.totalOutboundIPv6IPsecAuthPackets) return false
        if (this.durationSecs != other.durationSecs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.publicHostV6Addr.contentHashCode()
        result = 31 * result + this.internalHostV6Addr.contentHashCode()
        result = 31 * result + this.totalInboundIPv6IPsecAuthPackets.hashCode()
        result = 31 * result + this.totalOutboundIPv6IPsecAuthPackets.hashCode()
        result = 31 * result + this.durationSecs.hashCode()
        return result
    }
}

public data class IpsecDospStateEnumTemplate0(
    public var publicV6AddrMask: FwpV6AddrAndMask = FwpV6AddrAndMask(),
    public var internalV6AddrMask: FwpV6AddrAndMask = FwpV6AddrAndMask(),
)

public class IpsecDospStatistics0(
    public var totalStateEntriesCreated: ULong = 0uL,
    public var currentStateEntries: ULong = 0uL,
    public var totalInboundAllowedIPv6IPsecUnauthPkts: ULong = 0uL,
    public var totalInboundRatelimitDiscardedIPv6IPsecUnauthPkts: ULong = 0uL,
    public var totalInboundPerIPRatelimitDiscardedIPv6IPsecUnauthPkts: ULong = 0uL,
    public var totalInboundOtherDiscardedIPv6IPsecUnauthPkts: ULong = 0uL,
    public var totalInboundAllowedIPv6IPsecAuthPkts: ULong = 0uL,
    public var totalInboundRatelimitDiscardedIPv6IPsecAuthPkts: ULong = 0uL,
    public var totalInboundOtherDiscardedIPv6IPsecAuthPkts: ULong = 0uL,
    public var totalInboundAllowedICMPv6Pkts: ULong = 0uL,
    public var totalInboundRatelimitDiscardedICMPv6Pkts: ULong = 0uL,
    public var totalInboundAllowedIPv6FilterExemptPkts: ULong = 0uL,
    public var totalInboundRatelimitDiscardedIPv6FilterExemptPkts: ULong = 0uL,
    public var totalInboundDiscardedIPv6FilterBlockPkts: ULong = 0uL,
    public var totalInboundAllowedDefBlockExemptPkts: ULong = 0uL,
    public var totalInboundRatelimitDiscardedDefBlockExemptPkts: ULong = 0uL,
    public var totalInboundDiscardedDefBlockPkts: ULong = 0uL,
    public var currentInboundIPv6IPsecUnauthPerIPRateLimitQueues: ULong = 0uL,
)

public data class IpsecEspDropPacketStatistics0(
    public var invalidSpisOnInbound: UInt = 0u,
    public var decryptionFailuresOnInbound: UInt = 0u,
    public var authenticationFailuresOnInbound: UInt = 0u,
    public var replayCheckFailuresOnInbound: UInt = 0u,
    public var saNotInitializedOnInbound: UInt = 0u,
)

public data class IpsecGetspi0(
    public var inboundIpsecTraffic: IpsecTraffic0 = IpsecTraffic0(),
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IpsecGetspi00 = IpsecGetspi00(),
    public var rngCryptoModuleID: Guid? = null,
)

public data class IpsecGetspi00(
    public var inboundUdpEncapsulation: IpsecV4UdpEncapsulation0? = null,
)

public data class IpsecGetspi1(
    public var inboundIpsecTraffic: IpsecTraffic1 = IpsecTraffic1(),
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IpsecGetspi10 = IpsecGetspi10(),
    public var rngCryptoModuleID: Guid? = null,
)

public data class IpsecGetspi10(
    public var inboundUdpEncapsulation: IpsecV4UdpEncapsulation0? = null,
)

public data class IpsecId0(
    public var mmTargetName: Pwstr = null,
    public var emTargetName: Pwstr = null,
    public var numTokens: UInt = 0u,
    public var tokens: IpsecToken0? = null,
    public var explicitCredentials: ULong = 0uL,
    public var logonId: ULong = 0uL,
)

public data class IpsecKeyingPolicy0(
    public var numKeyMods: UInt = 0u,
    public var keyModKeys: Guid? = null,
)

public data class IpsecKeyingPolicy1(
    public var numKeyMods: UInt = 0u,
    public var keyModKeys: Guid? = null,
    public var flags: UInt = 0u,
)

public data class IpsecKeymoduleState0(
    public var keyModuleKey: Guid = Guid(),
    public var stateBlob: FwpByteBlob = FwpByteBlob(),
)

public data class IpsecKeyManager0(
    public var keyManagerKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var keyDictationTimeoutHint: UByte = 0u,
)

public data class IpsecKeyManagerCallbacks0(
    public var reserved: Guid = Guid(),
    public var flags: UInt = 0u,
    public var keyDictationCheck: IpsecKeyManagerKeyDictationCheck0 = null,
    public var keyDictation: IpsecKeyManagerDictateKey0 = null,
    public var keyNotify: IpsecKeyManagerNotifyKey0 = null,
)

public data class IpsecProposal0(
    public var lifetime: IpsecSaLifetime0 = IpsecSaLifetime0(),
    public var numSaTransforms: UInt = 0u,
    public var saTransforms: IpsecSaTransform0? = null,
    public var pfsGroup: IpsecPfsGroup = 0,
)

public data class IpsecSa0(
    public var spi: UInt = 0u,
    public var saTransformType: IpsecTransformType = 0,
    public var anonymous: IpsecSa00 = IpsecSa00(),
)

public data class IpsecSa00(
    public var ahInformation: IpsecSaAuthInformation0? = null,
    public var espAuthInformation: IpsecSaAuthInformation0? = null,
    public var espCipherInformation: IpsecSaCipherInformation0? = null,
    public var espAuthAndCipherInformation: IpsecSaAuthAndCipherInformation0? = null,
    public var espAuthFwInformation: IpsecSaAuthInformation0? = null,
)

public data class IpsecSaAuthAndCipherInformation0(
    public var saCipherInformation: IpsecSaCipherInformation0 = IpsecSaCipherInformation0(),
    public var saAuthInformation: IpsecSaAuthInformation0 = IpsecSaAuthInformation0(),
)

public data class IpsecSaAuthInformation0(
    public var authTransform: IpsecAuthTransform0 = IpsecAuthTransform0(),
    public var authKey: FwpByteBlob = FwpByteBlob(),
)

public data class IpsecSaBundle0(
    public var flags: IpsecSaBundleFlags = 0u,
    public var lifetime: IpsecSaLifetime0 = IpsecSaLifetime0(),
    public var idleTimeoutSeconds: UInt = 0u,
    public var ndAllowClearTimeoutSeconds: UInt = 0u,
    public var ipsecId: IpsecId0? = null,
    public var napContext: UInt = 0u,
    public var qmSaId: UInt = 0u,
    public var numSAs: UInt = 0u,
    public var saList: IpsecSa0? = null,
    public var keyModuleState: IpsecKeymoduleState0? = null,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IpsecSaBundle00 = IpsecSaBundle00(),
    public var mmSaId: ULong = 0uL,
    public var pfsGroup: IpsecPfsGroup = 0,
)

public data class IpsecSaBundle00(
    public var peerV4PrivateAddress: UInt = 0u,
)

public data class IpsecSaBundle1(
    public var flags: IpsecSaBundleFlags = 0u,
    public var lifetime: IpsecSaLifetime0 = IpsecSaLifetime0(),
    public var idleTimeoutSeconds: UInt = 0u,
    public var ndAllowClearTimeoutSeconds: UInt = 0u,
    public var ipsecId: IpsecId0? = null,
    public var napContext: UInt = 0u,
    public var qmSaId: UInt = 0u,
    public var numSAs: UInt = 0u,
    public var saList: IpsecSa0? = null,
    public var keyModuleState: IpsecKeymoduleState0? = null,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IpsecSaBundle10 = IpsecSaBundle10(),
    public var mmSaId: ULong = 0uL,
    public var pfsGroup: IpsecPfsGroup = 0,
    public var saLookupContext: Guid = Guid(),
    public var qmFilterId: ULong = 0uL,
)

public data class IpsecSaBundle10(
    public var peerV4PrivateAddress: UInt = 0u,
)

public data class IpsecSaCipherInformation0(
    public var cipherTransform: IpsecCipherTransform0 = IpsecCipherTransform0(),
    public var cipherKey: FwpByteBlob = FwpByteBlob(),
)

public data class IpsecSaContext0(
    public var saContextId: ULong = 0uL,
    public var inboundSa: IpsecSaDetails0? = null,
    public var outboundSa: IpsecSaDetails0? = null,
)

public data class IpsecSaContext1(
    public var saContextId: ULong = 0uL,
    public var inboundSa: IpsecSaDetails1? = null,
    public var outboundSa: IpsecSaDetails1? = null,
)

public data class IpsecSaContextChange0(
    public var changeType: IpsecSaContextEventType0 = 0,
    public var saContextId: ULong = 0uL,
)

public data class IpsecSaContextEnumTemplate0(
    public var localSubNet: FwpConditionValue0 = FwpConditionValue0(),
    public var remoteSubNet: FwpConditionValue0 = FwpConditionValue0(),
)

public data class IpsecSaContextSubscription0(
    public var enumTemplate: IpsecSaContextEnumTemplate0? = null,
    public var flags: UInt = 0u,
    public var sessionKey: Guid = Guid(),
)

public data class IpsecSaDetails0(
    public var ipVersion: FwpIpVersion = 0,
    public var saDirection: FwpDirection = 0,
    public var traffic: IpsecTraffic0 = IpsecTraffic0(),
    public var saBundle: IpsecSaBundle0 = IpsecSaBundle0(),
    public var anonymous: IpsecSaDetails00 = IpsecSaDetails00(),
    public var transportFilter: FwpmFilter0? = null,
)

public data class IpsecSaDetails00(
    public var udpEncapsulation: IpsecV4UdpEncapsulation0? = null,
)

public data class IpsecSaDetails1(
    public var ipVersion: FwpIpVersion = 0,
    public var saDirection: FwpDirection = 0,
    public var traffic: IpsecTraffic1 = IpsecTraffic1(),
    public var saBundle: IpsecSaBundle1 = IpsecSaBundle1(),
    public var anonymous: IpsecSaDetails10 = IpsecSaDetails10(),
    public var transportFilter: FwpmFilter0? = null,
    public var virtualIfTunnelInfo: IpsecVirtualIfTunnelInfo0 = IpsecVirtualIfTunnelInfo0(),
)

public data class IpsecSaDetails10(
    public var udpEncapsulation: IpsecV4UdpEncapsulation0? = null,
)

public data class IpsecSaEnumTemplate0(
    public var saDirection: FwpDirection = 0,
)

public data class IpsecSaIdleTimeout0(
    public var idleTimeoutSeconds: UInt = 0u,
    public var idleTimeoutSecondsFailOver: UInt = 0u,
)

public data class IpsecSaLifetime0(
    public var lifetimeSeconds: UInt = 0u,
    public var lifetimeKilobytes: UInt = 0u,
    public var lifetimePackets: UInt = 0u,
)

public data class IpsecSaTransform0(
    public var ipsecTransformType: IpsecTransformType = 0,
    public var anonymous: IpsecSaTransform00 = IpsecSaTransform00(),
)

public data class IpsecSaTransform00(
    public var ahTransform: IpsecAuthTransform0? = null,
    public var espAuthTransform: IpsecAuthTransform0? = null,
    public var espCipherTransform: IpsecCipherTransform0? = null,
    public var espAuthAndCipherTransform: IpsecAuthAndCipherTransform0? = null,
    public var espAuthFwTransform: IpsecAuthTransform0? = null,
)
