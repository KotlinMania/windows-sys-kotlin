@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public data class FWPM_ACTION0(public var type: FWP_ACTION_TYPE = 0u, public var Anonymous: FWPM_ACTION0_0 = FWPM_ACTION0_0())

public data class FWPM_ACTION0_0(public var filterType: GUID = GUID(), public var calloutKey: GUID = GUID())

public data class FWPM_CALLOUT0(
    public var calloutKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: UInt = 0u,
    public var providerKey: Long = 0L,
    public var providerData: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var applicableLayer: GUID = GUID(),
    public var calloutId: UInt = 0u,
)

public data class FWPM_CALLOUT_CHANGE0(
    public var changeType: FWPM_CHANGE_TYPE = 0,
    public var calloutKey: GUID = GUID(),
    public var calloutId: UInt = 0u,
)

public data class FWPM_CALLOUT_ENUM_TEMPLATE0(public var providerKey: Long = 0L, public var layerKey: GUID = GUID())

public data class FWPM_CALLOUT_SUBSCRIPTION0(
    public var enumTemplate: Long = 0L,
    public var flags: UInt = 0u,
    public var sessionKey: GUID = GUID(),
)

public data class FWPM_CLASSIFY_OPTION0(public var type: FWP_CLASSIFY_OPTION_TYPE = 0, public var value: FWP_VALUE0 = FWP_VALUE0())

public data class FWPM_CLASSIFY_OPTIONS0(public var numOptions: UInt = 0u, public var options: Long = 0L)

public data class FWPM_CONNECTION0(
    public var connectionId: ULong = 0uL,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous1: FWPM_CONNECTION0_0 = FWPM_CONNECTION0_0(),
    public var Anonymous2: FWPM_CONNECTION0_1 = FWPM_CONNECTION0_1(),
    public var providerKey: Long = 0L,
    public var ipsecTrafficModeType: IPSEC_TRAFFIC_TYPE = 0,
    public var keyModuleType: IKEEXT_KEY_MODULE_TYPE = 0,
    public var mmCrypto: IKEEXT_PROPOSAL0 = IKEEXT_PROPOSAL0(),
    public var mmPeer: IKEEXT_CREDENTIAL2 = IKEEXT_CREDENTIAL2(),
    public var emPeer: IKEEXT_CREDENTIAL2 = IKEEXT_CREDENTIAL2(),
    public var bytesTransferredIn: ULong = 0uL,
    public var bytesTransferredOut: ULong = 0uL,
    public var bytesTransferredTotal: ULong = 0uL,
    public var startSysTime: Foundation.FILETIME = Foundation.FILETIME(),
)

public data class FWPM_CONNECTION0_0(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWPM_CONNECTION0_0) return false
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

public data class FWPM_CONNECTION0_1(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWPM_CONNECTION0_1) return false
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

public data class FWPM_CONNECTION_ENUM_TEMPLATE0(public var connectionId: ULong = 0uL, public var flags: UInt = 0u)

public data class FWPM_CONNECTION_SUBSCRIPTION0(
    public var enumTemplate: Long = 0L,
    public var flags: UInt = 0u,
    public var sessionKey: GUID = GUID(),
)

public data class FWPM_DISPLAY_DATA0(public var name: PWSTR = 0L, public var description: PWSTR = 0L)

public data class FWPM_FIELD0(
    public var fieldKey: Long = 0L,
    public var type: FWPM_FIELD_TYPE = 0,
    public var dataType: FWP_DATA_TYPE = 0,
)

public data class FWPM_FILTER0(
    public var filterKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: FWPM_FILTER_FLAGS = 0u,
    public var providerKey: Long = 0L,
    public var providerData: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var layerKey: GUID = GUID(),
    public var subLayerKey: GUID = GUID(),
    public var weight: FWP_VALUE0 = FWP_VALUE0(),
    public var numFilterConditions: UInt = 0u,
    public var filterCondition: Long = 0L,
    public var action: FWPM_ACTION0 = FWPM_ACTION0(),
    public var Anonymous: FWPM_FILTER0_0 = FWPM_FILTER0_0(),
    public var reserved: Long = 0L,
    public var filterId: ULong = 0uL,
    public var effectiveWeight: FWP_VALUE0 = FWP_VALUE0(),
)

public data class FWPM_FILTER0_0(public var rawContext: ULong = 0uL, public var providerContextKey: GUID = GUID())

public data class FWPM_FILTER_CHANGE0(
    public var changeType: FWPM_CHANGE_TYPE = 0,
    public var filterKey: GUID = GUID(),
    public var filterId: ULong = 0uL,
)

public data class FWPM_FILTER_CONDITION0(
    public var fieldKey: GUID = GUID(),
    public var matchType: FWP_MATCH_TYPE = 0,
    public var conditionValue: FWP_CONDITION_VALUE0 = FWP_CONDITION_VALUE0(),
)

public data class FWPM_FILTER_ENUM_TEMPLATE0(
    public var providerKey: Long = 0L,
    public var layerKey: GUID = GUID(),
    public var enumType: FWP_FILTER_ENUM_TYPE = 0,
    public var flags: UInt = 0u,
    public var providerContextTemplate: Long = 0L,
    public var numFilterConditions: UInt = 0u,
    public var filterCondition: Long = 0L,
    public var actionMask: UInt = 0u,
    public var calloutKey: Long = 0L,
)

public data class FWPM_FILTER_SUBSCRIPTION0(
    public var enumTemplate: Long = 0L,
    public var flags: UInt = 0u,
    public var sessionKey: GUID = GUID(),
)

public data class FWPM_LAYER0(
    public var layerKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: UInt = 0u,
    public var numFields: UInt = 0u,
    public var field: Long = 0L,
    public var defaultSubLayerKey: GUID = GUID(),
    public var layerId: UShort = 0u,
)

public data class FWPM_LAYER_ENUM_TEMPLATE0(public var reserved: ULong = 0uL)

public data class FWPM_LAYER_STATISTICS0(
    public var layerId: GUID = GUID(),
    public var classifyPermitCount: UInt = 0u,
    public var classifyBlockCount: UInt = 0u,
    public var classifyVetoCount: UInt = 0u,
    public var numCacheEntries: UInt = 0u,
)

public data class FWPM_NETWORK_CONNECTION_POLICY_SETTING0(public var type: FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE = 0, public var value: FWP_VALUE0 = FWP_VALUE0())

public data class FWPM_NETWORK_CONNECTION_POLICY_SETTINGS0(public var numSettings: UInt = 0u, public var settings: Long = 0L)

public data class FWPM_NET_EVENT0(
    public var header: FWPM_NET_EVENT_HEADER0 = FWPM_NET_EVENT_HEADER0(),
    public var type: FWPM_NET_EVENT_TYPE = 0,
    public var Anonymous: FWPM_NET_EVENT0_0 = FWPM_NET_EVENT0_0(),
)

public data class FWPM_NET_EVENT0_0(
    public var ikeMmFailure: Long = 0L,
    public var ikeQmFailure: Long = 0L,
    public var ikeEmFailure: Long = 0L,
    public var classifyDrop: Long = 0L,
    public var ipsecDrop: Long = 0L,
    public var idpDrop: Long = 0L,
)

public data class FWPM_NET_EVENT1(
    public var header: FWPM_NET_EVENT_HEADER1 = FWPM_NET_EVENT_HEADER1(),
    public var type: FWPM_NET_EVENT_TYPE = 0,
    public var Anonymous: FWPM_NET_EVENT1_0 = FWPM_NET_EVENT1_0(),
)

public data class FWPM_NET_EVENT1_0(
    public var ikeMmFailure: Long = 0L,
    public var ikeQmFailure: Long = 0L,
    public var ikeEmFailure: Long = 0L,
    public var classifyDrop: Long = 0L,
    public var ipsecDrop: Long = 0L,
    public var idpDrop: Long = 0L,
)

public data class FWPM_NET_EVENT2(
    public var header: FWPM_NET_EVENT_HEADER2 = FWPM_NET_EVENT_HEADER2(),
    public var type: FWPM_NET_EVENT_TYPE = 0,
    public var Anonymous: FWPM_NET_EVENT2_0 = FWPM_NET_EVENT2_0(),
)

public data class FWPM_NET_EVENT2_0(
    public var ikeMmFailure: Long = 0L,
    public var ikeQmFailure: Long = 0L,
    public var ikeEmFailure: Long = 0L,
    public var classifyDrop: Long = 0L,
    public var ipsecDrop: Long = 0L,
    public var idpDrop: Long = 0L,
    public var classifyAllow: Long = 0L,
    public var capabilityDrop: Long = 0L,
    public var capabilityAllow: Long = 0L,
    public var classifyDropMac: Long = 0L,
)

public data class FWPM_NET_EVENT3(
    public var header: FWPM_NET_EVENT_HEADER3 = FWPM_NET_EVENT_HEADER3(),
    public var type: FWPM_NET_EVENT_TYPE = 0,
    public var Anonymous: FWPM_NET_EVENT3_0 = FWPM_NET_EVENT3_0(),
)

public data class FWPM_NET_EVENT3_0(
    public var ikeMmFailure: Long = 0L,
    public var ikeQmFailure: Long = 0L,
    public var ikeEmFailure: Long = 0L,
    public var classifyDrop: Long = 0L,
    public var ipsecDrop: Long = 0L,
    public var idpDrop: Long = 0L,
    public var classifyAllow: Long = 0L,
    public var capabilityDrop: Long = 0L,
    public var capabilityAllow: Long = 0L,
    public var classifyDropMac: Long = 0L,
)

public data class FWPM_NET_EVENT4(
    public var header: FWPM_NET_EVENT_HEADER3 = FWPM_NET_EVENT_HEADER3(),
    public var type: FWPM_NET_EVENT_TYPE = 0,
    public var Anonymous: FWPM_NET_EVENT4_0 = FWPM_NET_EVENT4_0(),
)

public data class FWPM_NET_EVENT4_0(
    public var ikeMmFailure: Long = 0L,
    public var ikeQmFailure: Long = 0L,
    public var ikeEmFailure: Long = 0L,
    public var classifyDrop: Long = 0L,
    public var ipsecDrop: Long = 0L,
    public var idpDrop: Long = 0L,
    public var classifyAllow: Long = 0L,
    public var capabilityDrop: Long = 0L,
    public var capabilityAllow: Long = 0L,
    public var classifyDropMac: Long = 0L,
)

public data class FWPM_NET_EVENT5(
    public var header: FWPM_NET_EVENT_HEADER3 = FWPM_NET_EVENT_HEADER3(),
    public var type: FWPM_NET_EVENT_TYPE = 0,
    public var Anonymous: FWPM_NET_EVENT5_0 = FWPM_NET_EVENT5_0(),
)

public data class FWPM_NET_EVENT5_0(
    public var ikeMmFailure: Long = 0L,
    public var ikeQmFailure: Long = 0L,
    public var ikeEmFailure: Long = 0L,
    public var classifyDrop: Long = 0L,
    public var ipsecDrop: Long = 0L,
    public var idpDrop: Long = 0L,
    public var classifyAllow: Long = 0L,
    public var capabilityDrop: Long = 0L,
    public var capabilityAllow: Long = 0L,
    public var classifyDropMac: Long = 0L,
    public var lpmPacketArrival: Long = 0L,
)

public data class FWPM_NET_EVENT_CAPABILITY_ALLOW0(
    public var networkCapabilityId: FWPM_APPC_NETWORK_CAPABILITY_TYPE = 0,
    public var filterId: ULong = 0uL,
    public var isLoopback: BOOL = 0,
)

public data class FWPM_NET_EVENT_CAPABILITY_DROP0(
    public var networkCapabilityId: FWPM_APPC_NETWORK_CAPABILITY_TYPE = 0,
    public var filterId: ULong = 0uL,
    public var isLoopback: BOOL = 0,
)

public data class FWPM_NET_EVENT_CLASSIFY_ALLOW0(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: BOOL = 0,
)

public data class FWPM_NET_EVENT_CLASSIFY_DROP0(public var filterId: ULong = 0uL, public var layerId: UShort = 0u)

public data class FWPM_NET_EVENT_CLASSIFY_DROP1(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: BOOL = 0,
)

public data class FWPM_NET_EVENT_CLASSIFY_DROP2(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: BOOL = 0,
    public var vSwitchId: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var vSwitchSourcePort: UInt = 0u,
    public var vSwitchDestinationPort: UInt = 0u,
)

public class FWPM_NET_EVENT_CLASSIFY_DROP_MAC0(
    public var localMacAddr: FWP_BYTE_ARRAY6 = FWP_BYTE_ARRAY6(),
    public var remoteMacAddr: FWP_BYTE_ARRAY6 = FWP_BYTE_ARRAY6(),
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
    public var isLoopback: BOOL = 0,
    public var vSwitchId: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var vSwitchSourcePort: UInt = 0u,
    public var vSwitchDestinationPort: UInt = 0u,
)

public data class FWPM_NET_EVENT_ENUM_TEMPLATE0(
    public var startTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var endTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var numFilterConditions: UInt = 0u,
    public var filterCondition: Long = 0L,
)

public data class FWPM_NET_EVENT_HEADER0(
    public var timeStamp: Foundation.FILETIME = Foundation.FILETIME(),
    public var flags: UInt = 0u,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var ipProtocol: UByte = 0u,
    public var Anonymous1: FWPM_NET_EVENT_HEADER0_0 = FWPM_NET_EVENT_HEADER0_0(),
    public var Anonymous2: FWPM_NET_EVENT_HEADER0_1 = FWPM_NET_EVENT_HEADER0_1(),
    public var localPort: UShort = 0u,
    public var remotePort: UShort = 0u,
    public var scopeId: UInt = 0u,
    public var appId: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var userId: Long = 0L,
)

public data class FWPM_NET_EVENT_HEADER0_0(public var localAddrV4: UInt = 0u, public var localAddrV6: FWP_BYTE_ARRAY16 = FWP_BYTE_ARRAY16())

public data class FWPM_NET_EVENT_HEADER0_1(public var remoteAddrV4: UInt = 0u, public var remoteAddrV6: FWP_BYTE_ARRAY16 = FWP_BYTE_ARRAY16())

public data class FWPM_NET_EVENT_HEADER1(
    public var timeStamp: Foundation.FILETIME = Foundation.FILETIME(),
    public var flags: UInt = 0u,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var ipProtocol: UByte = 0u,
    public var Anonymous1: FWPM_NET_EVENT_HEADER1_0 = FWPM_NET_EVENT_HEADER1_0(),
    public var Anonymous2: FWPM_NET_EVENT_HEADER1_1 = FWPM_NET_EVENT_HEADER1_1(),
    public var localPort: UShort = 0u,
    public var remotePort: UShort = 0u,
    public var scopeId: UInt = 0u,
    public var appId: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var userId: Long = 0L,
    public var Anonymous3: FWPM_NET_EVENT_HEADER1_2 = FWPM_NET_EVENT_HEADER1_2(),
)

public data class FWPM_NET_EVENT_HEADER1_0(public var localAddrV4: UInt = 0u, public var localAddrV6: FWP_BYTE_ARRAY16 = FWP_BYTE_ARRAY16())

public data class FWPM_NET_EVENT_HEADER1_1(public var remoteAddrV4: UInt = 0u, public var remoteAddrV6: FWP_BYTE_ARRAY16 = FWP_BYTE_ARRAY16())

public data class FWPM_NET_EVENT_HEADER1_2(public var Anonymous: FWPM_NET_EVENT_HEADER1_2_0 = FWPM_NET_EVENT_HEADER1_2_0())

public data class FWPM_NET_EVENT_HEADER1_2_0(public var reserved1: FWP_AF = 0, public var Anonymous: FWPM_NET_EVENT_HEADER1_2_0_0 = FWPM_NET_EVENT_HEADER1_2_0_0())

public data class FWPM_NET_EVENT_HEADER1_2_0_0(public var Anonymous: FWPM_NET_EVENT_HEADER1_2_0_0_0 = FWPM_NET_EVENT_HEADER1_2_0_0_0())

public data class FWPM_NET_EVENT_HEADER1_2_0_0_0(
    public var reserved2: FWP_BYTE_ARRAY6 = FWP_BYTE_ARRAY6(),
    public var reserved3: FWP_BYTE_ARRAY6 = FWP_BYTE_ARRAY6(),
    public var reserved4: UInt = 0u,
    public var reserved5: UInt = 0u,
    public var reserved6: UShort = 0u,
    public var reserved7: UInt = 0u,
    public var reserved8: UInt = 0u,
    public var reserved9: UShort = 0u,
    public var reserved10: ULong = 0uL,
)

public data class FWPM_NET_EVENT_HEADER2(
    public var timeStamp: Foundation.FILETIME = Foundation.FILETIME(),
    public var flags: UInt = 0u,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var ipProtocol: UByte = 0u,
    public var Anonymous1: FWPM_NET_EVENT_HEADER2_0 = FWPM_NET_EVENT_HEADER2_0(),
    public var Anonymous2: FWPM_NET_EVENT_HEADER2_1 = FWPM_NET_EVENT_HEADER2_1(),
    public var localPort: UShort = 0u,
    public var remotePort: UShort = 0u,
    public var scopeId: UInt = 0u,
    public var appId: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var userId: Long = 0L,
    public var addressFamily: FWP_AF = 0,
    public var packageSid: Long = 0L,
)

public data class FWPM_NET_EVENT_HEADER2_0(public var localAddrV4: UInt = 0u, public var localAddrV6: FWP_BYTE_ARRAY16 = FWP_BYTE_ARRAY16())

public data class FWPM_NET_EVENT_HEADER2_1(public var remoteAddrV4: UInt = 0u, public var remoteAddrV6: FWP_BYTE_ARRAY16 = FWP_BYTE_ARRAY16())

public data class FWPM_NET_EVENT_HEADER3(
    public var timeStamp: Foundation.FILETIME = Foundation.FILETIME(),
    public var flags: UInt = 0u,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var ipProtocol: UByte = 0u,
    public var Anonymous1: FWPM_NET_EVENT_HEADER3_0 = FWPM_NET_EVENT_HEADER3_0(),
    public var Anonymous2: FWPM_NET_EVENT_HEADER3_1 = FWPM_NET_EVENT_HEADER3_1(),
    public var localPort: UShort = 0u,
    public var remotePort: UShort = 0u,
    public var scopeId: UInt = 0u,
    public var appId: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var userId: Long = 0L,
    public var addressFamily: FWP_AF = 0,
    public var packageSid: Long = 0L,
    public var enterpriseId: PWSTR = 0L,
    public var policyFlags: ULong = 0uL,
    public var effectiveName: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
)

public data class FWPM_NET_EVENT_HEADER3_0(public var localAddrV4: UInt = 0u, public var localAddrV6: FWP_BYTE_ARRAY16 = FWP_BYTE_ARRAY16())

public data class FWPM_NET_EVENT_HEADER3_1(public var remoteAddrV4: UInt = 0u, public var remoteAddrV6: FWP_BYTE_ARRAY16 = FWP_BYTE_ARRAY16())

public data class FWPM_NET_EVENT_IKEEXT_EM_FAILURE0(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IPSEC_FAILURE_POINT = 0,
    public var flags: UInt = 0u,
    public var emState: IKEEXT_EM_SA_STATE = 0,
    public var saRole: IKEEXT_SA_ROLE = 0,
    public var emAuthMethod: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var qmFilterId: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWPM_NET_EVENT_IKEEXT_EM_FAILURE0) return false
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

public data class FWPM_NET_EVENT_IKEEXT_EM_FAILURE1(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IPSEC_FAILURE_POINT = 0,
    public var flags: UInt = 0u,
    public var emState: IKEEXT_EM_SA_STATE = 0,
    public var saRole: IKEEXT_SA_ROLE = 0,
    public var emAuthMethod: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var qmFilterId: ULong = 0uL,
    public var localPrincipalNameForAuth: PWSTR = 0L,
    public var remotePrincipalNameForAuth: PWSTR = 0L,
    public var numLocalPrincipalGroupSids: UInt = 0u,
    public var localPrincipalGroupSids: Long = 0L,
    public var numRemotePrincipalGroupSids: UInt = 0u,
    public var remotePrincipalGroupSids: Long = 0L,
    public var saTrafficType: IPSEC_TRAFFIC_TYPE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWPM_NET_EVENT_IKEEXT_EM_FAILURE1) return false
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

public data class FWPM_NET_EVENT_IKEEXT_MM_FAILURE0(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IPSEC_FAILURE_POINT = 0,
    public var flags: UInt = 0u,
    public var keyingModuleType: IKEEXT_KEY_MODULE_TYPE = 0,
    public var mmState: IKEEXT_MM_SA_STATE = 0,
    public var saRole: IKEEXT_SA_ROLE = 0,
    public var mmAuthMethod: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var mmFilterId: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWPM_NET_EVENT_IKEEXT_MM_FAILURE0) return false
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

public data class FWPM_NET_EVENT_IKEEXT_MM_FAILURE1(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IPSEC_FAILURE_POINT = 0,
    public var flags: UInt = 0u,
    public var keyingModuleType: IKEEXT_KEY_MODULE_TYPE = 0,
    public var mmState: IKEEXT_MM_SA_STATE = 0,
    public var saRole: IKEEXT_SA_ROLE = 0,
    public var mmAuthMethod: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var mmFilterId: ULong = 0uL,
    public var localPrincipalNameForAuth: PWSTR = 0L,
    public var remotePrincipalNameForAuth: PWSTR = 0L,
    public var numLocalPrincipalGroupSids: UInt = 0u,
    public var localPrincipalGroupSids: Long = 0L,
    public var numRemotePrincipalGroupSids: UInt = 0u,
    public var remotePrincipalGroupSids: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWPM_NET_EVENT_IKEEXT_MM_FAILURE1) return false
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

public class FWPM_NET_EVENT_IKEEXT_MM_FAILURE2(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IPSEC_FAILURE_POINT = 0,
    public var flags: UInt = 0u,
    public var keyingModuleType: IKEEXT_KEY_MODULE_TYPE = 0,
    public var mmState: IKEEXT_MM_SA_STATE = 0,
    public var saRole: IKEEXT_SA_ROLE = 0,
    public var mmAuthMethod: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var mmFilterId: ULong = 0uL,
    public var localPrincipalNameForAuth: PWSTR = 0L,
    public var remotePrincipalNameForAuth: PWSTR = 0L,
    public var numLocalPrincipalGroupSids: UInt = 0u,
    public var localPrincipalGroupSids: Long = 0L,
    public var numRemotePrincipalGroupSids: UInt = 0u,
    public var remotePrincipalGroupSids: Long = 0L,
    public var providerContextKey: Long = 0L,
)

public data class FWPM_NET_EVENT_IKEEXT_QM_FAILURE0(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IPSEC_FAILURE_POINT = 0,
    public var keyingModuleType: IKEEXT_KEY_MODULE_TYPE = 0,
    public var qmState: IKEEXT_QM_SA_STATE = 0,
    public var saRole: IKEEXT_SA_ROLE = 0,
    public var saTrafficType: IPSEC_TRAFFIC_TYPE = 0,
    public var Anonymous1: FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_0 = FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_0(),
    public var Anonymous2: FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_1 = FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_1(),
    public var qmFilterId: ULong = 0uL,
)

public data class FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_0(public var localSubNet: FWP_CONDITION_VALUE0 = FWP_CONDITION_VALUE0())

public data class FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_1(public var remoteSubNet: FWP_CONDITION_VALUE0 = FWP_CONDITION_VALUE0())

public data class FWPM_NET_EVENT_IKEEXT_QM_FAILURE1(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IPSEC_FAILURE_POINT = 0,
    public var keyingModuleType: IKEEXT_KEY_MODULE_TYPE = 0,
    public var qmState: IKEEXT_QM_SA_STATE = 0,
    public var saRole: IKEEXT_SA_ROLE = 0,
    public var saTrafficType: IPSEC_TRAFFIC_TYPE = 0,
    public var Anonymous1: FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_0 = FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_0(),
    public var Anonymous2: FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_1 = FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_1(),
    public var qmFilterId: ULong = 0uL,
    public var mmSaLuid: ULong = 0uL,
    public var mmProviderContextKey: GUID = GUID(),
)

public data class FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_0(public var localSubNet: FWP_CONDITION_VALUE0 = FWP_CONDITION_VALUE0())

public data class FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_1(public var remoteSubNet: FWP_CONDITION_VALUE0 = FWP_CONDITION_VALUE0())

public data class FWPM_NET_EVENT_IPSEC_DOSP_DROP0(
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous1: FWPM_NET_EVENT_IPSEC_DOSP_DROP0_0 = FWPM_NET_EVENT_IPSEC_DOSP_DROP0_0(),
    public var Anonymous2: FWPM_NET_EVENT_IPSEC_DOSP_DROP0_1 = FWPM_NET_EVENT_IPSEC_DOSP_DROP0_1(),
    public var failureStatus: Int = 0,
    public var direction: FWP_DIRECTION = 0,
)

public data class FWPM_NET_EVENT_IPSEC_DOSP_DROP0_0(public var publicHostV4Addr: UInt = 0u, public var publicHostV6Addr: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWPM_NET_EVENT_IPSEC_DOSP_DROP0_0) return false
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

public data class FWPM_NET_EVENT_IPSEC_DOSP_DROP0_1(public var internalHostV4Addr: UInt = 0u, public var internalHostV6Addr: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWPM_NET_EVENT_IPSEC_DOSP_DROP0_1) return false
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

public data class FWPM_NET_EVENT_IPSEC_KERNEL_DROP0(
    public var failureStatus: Int = 0,
    public var direction: FWP_DIRECTION = 0,
    public var spi: UInt = 0u,
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
)

public data class FWPM_NET_EVENT_LPM_PACKET_ARRIVAL0(public var spi: UInt = 0u)

public data class FWPM_NET_EVENT_SUBSCRIPTION0(
    public var enumTemplate: Long = 0L,
    public var flags: UInt = 0u,
    public var sessionKey: GUID = GUID(),
)

public data class FWPM_PROVIDER0(
    public var providerKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: UInt = 0u,
    public var providerData: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var serviceName: PWSTR = 0L,
)

public data class FWPM_PROVIDER_CHANGE0(public var changeType: FWPM_CHANGE_TYPE = 0, public var providerKey: GUID = GUID())

public data class FWPM_PROVIDER_CONTEXT0(
    public var providerContextKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: UInt = 0u,
    public var providerKey: Long = 0L,
    public var providerData: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var type: FWPM_PROVIDER_CONTEXT_TYPE = 0,
    public var Anonymous: FWPM_PROVIDER_CONTEXT0_0 = FWPM_PROVIDER_CONTEXT0_0(),
    public var providerContextId: ULong = 0uL,
)

public data class FWPM_PROVIDER_CONTEXT0_0(
    public var keyingPolicy: Long = 0L,
    public var ikeQmTransportPolicy: Long = 0L,
    public var ikeQmTunnelPolicy: Long = 0L,
    public var authipQmTransportPolicy: Long = 0L,
    public var authipQmTunnelPolicy: Long = 0L,
    public var ikeMmPolicy: Long = 0L,
    public var authIpMmPolicy: Long = 0L,
    public var dataBuffer: Long = 0L,
    public var classifyOptions: Long = 0L,
)

public data class FWPM_PROVIDER_CONTEXT1(
    public var providerContextKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: UInt = 0u,
    public var providerKey: Long = 0L,
    public var providerData: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var type: FWPM_PROVIDER_CONTEXT_TYPE = 0,
    public var Anonymous: FWPM_PROVIDER_CONTEXT1_0 = FWPM_PROVIDER_CONTEXT1_0(),
    public var providerContextId: ULong = 0uL,
)

public data class FWPM_PROVIDER_CONTEXT1_0(
    public var keyingPolicy: Long = 0L,
    public var ikeQmTransportPolicy: Long = 0L,
    public var ikeQmTunnelPolicy: Long = 0L,
    public var authipQmTransportPolicy: Long = 0L,
    public var authipQmTunnelPolicy: Long = 0L,
    public var ikeMmPolicy: Long = 0L,
    public var authIpMmPolicy: Long = 0L,
    public var dataBuffer: Long = 0L,
    public var classifyOptions: Long = 0L,
    public var ikeV2QmTunnelPolicy: Long = 0L,
    public var ikeV2MmPolicy: Long = 0L,
    public var idpOptions: Long = 0L,
)

public data class FWPM_PROVIDER_CONTEXT2(
    public var providerContextKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: UInt = 0u,
    public var providerKey: Long = 0L,
    public var providerData: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var type: FWPM_PROVIDER_CONTEXT_TYPE = 0,
    public var Anonymous: FWPM_PROVIDER_CONTEXT2_0 = FWPM_PROVIDER_CONTEXT2_0(),
    public var providerContextId: ULong = 0uL,
)

public data class FWPM_PROVIDER_CONTEXT2_0(
    public var keyingPolicy: Long = 0L,
    public var ikeQmTransportPolicy: Long = 0L,
    public var ikeQmTunnelPolicy: Long = 0L,
    public var authipQmTransportPolicy: Long = 0L,
    public var authipQmTunnelPolicy: Long = 0L,
    public var ikeMmPolicy: Long = 0L,
    public var authIpMmPolicy: Long = 0L,
    public var dataBuffer: Long = 0L,
    public var classifyOptions: Long = 0L,
    public var ikeV2QmTunnelPolicy: Long = 0L,
    public var ikeV2QmTransportPolicy: Long = 0L,
    public var ikeV2MmPolicy: Long = 0L,
    public var idpOptions: Long = 0L,
)

public data class FWPM_PROVIDER_CONTEXT3(
    public var providerContextKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: UInt = 0u,
    public var providerKey: Long = 0L,
    public var providerData: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var type: FWPM_PROVIDER_CONTEXT_TYPE = 0,
    public var Anonymous: FWPM_PROVIDER_CONTEXT3_0 = FWPM_PROVIDER_CONTEXT3_0(),
    public var providerContextId: ULong = 0uL,
)

public data class FWPM_PROVIDER_CONTEXT3_0(
    public var keyingPolicy: Long = 0L,
    public var ikeQmTransportPolicy: Long = 0L,
    public var ikeQmTunnelPolicy: Long = 0L,
    public var authipQmTransportPolicy: Long = 0L,
    public var authipQmTunnelPolicy: Long = 0L,
    public var ikeMmPolicy: Long = 0L,
    public var authIpMmPolicy: Long = 0L,
    public var dataBuffer: Long = 0L,
    public var classifyOptions: Long = 0L,
    public var ikeV2QmTunnelPolicy: Long = 0L,
    public var ikeV2QmTransportPolicy: Long = 0L,
    public var ikeV2MmPolicy: Long = 0L,
    public var idpOptions: Long = 0L,
    public var networkConnectionPolicy: Long = 0L,
)

public data class FWPM_PROVIDER_CONTEXT_CHANGE0(
    public var changeType: FWPM_CHANGE_TYPE = 0,
    public var providerContextKey: GUID = GUID(),
    public var providerContextId: ULong = 0uL,
)

public data class FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0(public var providerKey: Long = 0L, public var providerContextType: FWPM_PROVIDER_CONTEXT_TYPE = 0)

public data class FWPM_PROVIDER_CONTEXT_SUBSCRIPTION0(
    public var enumTemplate: Long = 0L,
    public var flags: FWPM_SUBSCRIPTION_FLAGS = 0u,
    public var sessionKey: GUID = GUID(),
)

public data class FWPM_PROVIDER_ENUM_TEMPLATE0(public var reserved: ULong = 0uL)

public data class FWPM_PROVIDER_SUBSCRIPTION0(
    public var enumTemplate: Long = 0L,
    public var flags: UInt = 0u,
    public var sessionKey: GUID = GUID(),
)

public data class FWPM_SESSION0(
    public var sessionKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: UInt = 0u,
    public var txnWaitTimeoutInMSec: UInt = 0u,
    public var processId: UInt = 0u,
    public var sid: Long = 0L,
    public var username: PWSTR = 0L,
    public var kernelMode: BOOL = 0,
)

public data class FWPM_SESSION_ENUM_TEMPLATE0(public var reserved: ULong = 0uL)

public class FWPM_STATISTICS0(
    public var numLayerStatistics: UInt = 0u,
    public var layerStatistics: Long = 0L,
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

public data class FWPM_SUBLAYER0(
    public var subLayerKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: UInt = 0u,
    public var providerKey: Long = 0L,
    public var providerData: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var weight: UShort = 0u,
)

public data class FWPM_SUBLAYER_CHANGE0(public var changeType: FWPM_CHANGE_TYPE = 0, public var subLayerKey: GUID = GUID())

public data class FWPM_SUBLAYER_ENUM_TEMPLATE0(public var providerKey: Long = 0L)

public data class FWPM_SUBLAYER_SUBSCRIPTION0(
    public var enumTemplate: Long = 0L,
    public var flags: FWPM_SUBSCRIPTION_FLAGS = 0u,
    public var sessionKey: GUID = GUID(),
)

public data class FWPM_SYSTEM_PORTS0(public var numTypes: UInt = 0u, public var types: Long = 0L)

public data class FWPM_SYSTEM_PORTS_BY_TYPE0(
    public var type: FWPM_SYSTEM_PORT_TYPE = 0,
    public var numPorts: UInt = 0u,
    public var ports: Long = 0L,
)

public data class FWPM_VSWITCH_EVENT0(
    public var eventType: FWPM_VSWITCH_EVENT_TYPE = 0,
    public var vSwitchId: PWSTR = 0L,
    public var Anonymous: FWPM_VSWITCH_EVENT0_0 = FWPM_VSWITCH_EVENT0_0(),
)

public data class FWPM_VSWITCH_EVENT0_0(public var positionInfo: FWPM_VSWITCH_EVENT0_0_0 = FWPM_VSWITCH_EVENT0_0_0(), public var reorderInfo: FWPM_VSWITCH_EVENT0_0_1 = FWPM_VSWITCH_EVENT0_0_1())

public data class FWPM_VSWITCH_EVENT0_0_0(public var numvSwitchFilterExtensions: UInt = 0u, public var vSwitchFilterExtensions: Long = 0L)

public data class FWPM_VSWITCH_EVENT0_0_1(
    public var inRequiredPosition: BOOL = 0,
    public var numvSwitchFilterExtensions: UInt = 0u,
    public var vSwitchFilterExtensions: Long = 0L,
)

public data class FWPM_VSWITCH_EVENT_SUBSCRIPTION0(public var flags: UInt = 0u, public var sessionKey: GUID = GUID())

public data class FWP_BYTE_ARRAY16(public var byteArray16: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWP_BYTE_ARRAY16) return false
        if (!this.byteArray16.contentEquals(other.byteArray16)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.byteArray16.contentHashCode()
    }
}

public data class FWP_BYTE_ARRAY6(public var byteArray6: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWP_BYTE_ARRAY6) return false
        if (!this.byteArray6.contentEquals(other.byteArray6)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.byteArray6.contentHashCode()
    }
}

public data class FWP_BYTE_BLOB(public var size: UInt = 0u, public var data: Long = 0L)

public data class FWP_CONDITION_VALUE0(public var type: FWP_DATA_TYPE = 0, public var Anonymous: FWP_CONDITION_VALUE0_0 = FWP_CONDITION_VALUE0_0())

public class FWP_CONDITION_VALUE0_0(
    public var uint8: UByte = 0u,
    public var uint16: UShort = 0u,
    public var uint32: UInt = 0u,
    public var uint64: Long = 0L,
    public var int8: Byte = 0,
    public var int16: Short = 0,
    public var int32: Int = 0,
    public var int64: Long = 0L,
    public var float32: Float = 0.0f,
    public var double64: Long = 0L,
    public var byteArray16: Long = 0L,
    public var byteBlob: Long = 0L,
    public var sid: Long = 0L,
    public var sd: Long = 0L,
    public var tokenInformation: Long = 0L,
    public var tokenAccessInformation: Long = 0L,
    public var unicodeString: PWSTR = 0L,
    public var byteArray6: Long = 0L,
    public var v4AddrMask: Long = 0L,
    public var v6AddrMask: Long = 0L,
    public var rangeValue: Long = 0L,
)

public data class FWP_RANGE0(public var valueLow: FWP_VALUE0 = FWP_VALUE0(), public var valueHigh: FWP_VALUE0 = FWP_VALUE0())

public data class FWP_TOKEN_INFORMATION(
    public var sidCount: UInt = 0u,
    public var sids: Long = 0L,
    public var restrictedSidCount: UInt = 0u,
    public var restrictedSids: Long = 0L,
)

public data class FWP_V4_ADDR_AND_MASK(public var addr: UInt = 0u, public var mask: UInt = 0u)

public data class FWP_V6_ADDR_AND_MASK(public var addr: UByteArray = UByteArray(16), public var prefixLength: UByte = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FWP_V6_ADDR_AND_MASK) return false
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

public data class FWP_VALUE0(public var type: FWP_DATA_TYPE = 0, public var Anonymous: FWP_VALUE0_0 = FWP_VALUE0_0())

public class FWP_VALUE0_0(
    public var uint8: UByte = 0u,
    public var uint16: UShort = 0u,
    public var uint32: UInt = 0u,
    public var uint64: Long = 0L,
    public var int8: Byte = 0,
    public var int16: Short = 0,
    public var int32: Int = 0,
    public var int64: Long = 0L,
    public var float32: Float = 0.0f,
    public var double64: Long = 0L,
    public var byteArray16: Long = 0L,
    public var byteBlob: Long = 0L,
    public var sid: Long = 0L,
    public var sd: Long = 0L,
    public var tokenInformation: Long = 0L,
    public var tokenAccessInformation: Long = 0L,
    public var unicodeString: PWSTR = 0L,
    public var byteArray6: Long = 0L,
)

public data class IKEEXT_AUTHENTICATION_METHOD0(public var authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0, public var Anonymous: IKEEXT_AUTHENTICATION_METHOD0_0 = IKEEXT_AUTHENTICATION_METHOD0_0())

public data class IKEEXT_AUTHENTICATION_METHOD0_0(
    public var presharedKeyAuthentication: IKEEXT_PRESHARED_KEY_AUTHENTICATION0 = IKEEXT_PRESHARED_KEY_AUTHENTICATION0(),
    public var certificateAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION0 = IKEEXT_CERTIFICATE_AUTHENTICATION0(),
    public var kerberosAuthentication: IKEEXT_KERBEROS_AUTHENTICATION0 = IKEEXT_KERBEROS_AUTHENTICATION0(),
    public var ntlmV2Authentication: IKEEXT_NTLM_V2_AUTHENTICATION0 = IKEEXT_NTLM_V2_AUTHENTICATION0(),
    public var sslAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION0 = IKEEXT_CERTIFICATE_AUTHENTICATION0(),
    public var cgaAuthentication: IKEEXT_IPV6_CGA_AUTHENTICATION0 = IKEEXT_IPV6_CGA_AUTHENTICATION0(),
)

public data class IKEEXT_AUTHENTICATION_METHOD1(public var authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0, public var Anonymous: IKEEXT_AUTHENTICATION_METHOD1_0 = IKEEXT_AUTHENTICATION_METHOD1_0())

public data class IKEEXT_AUTHENTICATION_METHOD1_0(
    public var presharedKeyAuthentication: IKEEXT_PRESHARED_KEY_AUTHENTICATION1 = IKEEXT_PRESHARED_KEY_AUTHENTICATION1(),
    public var certificateAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION1 = IKEEXT_CERTIFICATE_AUTHENTICATION1(),
    public var kerberosAuthentication: IKEEXT_KERBEROS_AUTHENTICATION0 = IKEEXT_KERBEROS_AUTHENTICATION0(),
    public var ntlmV2Authentication: IKEEXT_NTLM_V2_AUTHENTICATION0 = IKEEXT_NTLM_V2_AUTHENTICATION0(),
    public var sslAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION1 = IKEEXT_CERTIFICATE_AUTHENTICATION1(),
    public var cgaAuthentication: IKEEXT_IPV6_CGA_AUTHENTICATION0 = IKEEXT_IPV6_CGA_AUTHENTICATION0(),
    public var eapAuthentication: IKEEXT_EAP_AUTHENTICATION0 = IKEEXT_EAP_AUTHENTICATION0(),
)

public data class IKEEXT_AUTHENTICATION_METHOD2(public var authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0, public var Anonymous: IKEEXT_AUTHENTICATION_METHOD2_0 = IKEEXT_AUTHENTICATION_METHOD2_0())

public data class IKEEXT_AUTHENTICATION_METHOD2_0(
    public var presharedKeyAuthentication: IKEEXT_PRESHARED_KEY_AUTHENTICATION1 = IKEEXT_PRESHARED_KEY_AUTHENTICATION1(),
    public var certificateAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION2 = IKEEXT_CERTIFICATE_AUTHENTICATION2(),
    public var kerberosAuthentication: IKEEXT_KERBEROS_AUTHENTICATION1 = IKEEXT_KERBEROS_AUTHENTICATION1(),
    public var reservedAuthentication: IKEEXT_RESERVED_AUTHENTICATION0 = IKEEXT_RESERVED_AUTHENTICATION0(),
    public var ntlmV2Authentication: IKEEXT_NTLM_V2_AUTHENTICATION0 = IKEEXT_NTLM_V2_AUTHENTICATION0(),
    public var sslAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION2 = IKEEXT_CERTIFICATE_AUTHENTICATION2(),
    public var cgaAuthentication: IKEEXT_IPV6_CGA_AUTHENTICATION0 = IKEEXT_IPV6_CGA_AUTHENTICATION0(),
    public var eapAuthentication: IKEEXT_EAP_AUTHENTICATION0 = IKEEXT_EAP_AUTHENTICATION0(),
)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION0(
    public var inboundConfigType: IKEEXT_CERT_CONFIG_TYPE = 0,
    public var Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION0_0 = IKEEXT_CERTIFICATE_AUTHENTICATION0_0(),
    public var outboundConfigType: IKEEXT_CERT_CONFIG_TYPE = 0,
    public var Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION0_1 = IKEEXT_CERTIFICATE_AUTHENTICATION0_1(),
    public var flags: IKEEXT_CERT_AUTH = 0u,
)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION0_0(
    public var Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION0_0_0 = IKEEXT_CERTIFICATE_AUTHENTICATION0_0_0(),
    public var inboundEnterpriseStoreConfig: Long = 0L,
    public var inboundTrustedRootStoreConfig: Long = 0L,
)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION0_0_0(public var inboundRootArraySize: UInt = 0u, public var inboundRootArray: Long = 0L)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION0_1(
    public var Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION0_1_0 = IKEEXT_CERTIFICATE_AUTHENTICATION0_1_0(),
    public var outboundEnterpriseStoreConfig: Long = 0L,
    public var outboundTrustedRootStoreConfig: Long = 0L,
)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION0_1_0(public var outboundRootArraySize: UInt = 0u, public var outboundRootArray: Long = 0L)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION1(
    public var inboundConfigType: IKEEXT_CERT_CONFIG_TYPE = 0,
    public var Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION1_0 = IKEEXT_CERTIFICATE_AUTHENTICATION1_0(),
    public var outboundConfigType: IKEEXT_CERT_CONFIG_TYPE = 0,
    public var Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION1_1 = IKEEXT_CERTIFICATE_AUTHENTICATION1_1(),
    public var flags: IKEEXT_CERT_AUTH = 0u,
    public var localCertLocationUrl: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION1_0(
    public var Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION1_0_0 = IKEEXT_CERTIFICATE_AUTHENTICATION1_0_0(),
    public var inboundEnterpriseStoreConfig: Long = 0L,
    public var inboundTrustedRootStoreConfig: Long = 0L,
)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION1_0_0(public var inboundRootArraySize: UInt = 0u, public var inboundRootArray: Long = 0L)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION1_1(
    public var Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION1_1_0 = IKEEXT_CERTIFICATE_AUTHENTICATION1_1_0(),
    public var outboundEnterpriseStoreConfig: Long = 0L,
    public var outboundTrustedRootStoreConfig: Long = 0L,
)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION1_1_0(public var outboundRootArraySize: UInt = 0u, public var outboundRootArray: Long = 0L)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION2(
    public var inboundConfigType: IKEEXT_CERT_CONFIG_TYPE = 0,
    public var Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION2_0 = IKEEXT_CERTIFICATE_AUTHENTICATION2_0(),
    public var outboundConfigType: IKEEXT_CERT_CONFIG_TYPE = 0,
    public var Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION2_1 = IKEEXT_CERTIFICATE_AUTHENTICATION2_1(),
    public var flags: IKEEXT_CERT_AUTH = 0u,
    public var localCertLocationUrl: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION2_0(
    public var Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION2_0_0 = IKEEXT_CERTIFICATE_AUTHENTICATION2_0_0(),
    public var Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION2_0_1 = IKEEXT_CERTIFICATE_AUTHENTICATION2_0_1(),
    public var Anonymous3: IKEEXT_CERTIFICATE_AUTHENTICATION2_0_2 = IKEEXT_CERTIFICATE_AUTHENTICATION2_0_2(),
)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION2_0_0(public var inboundRootArraySize: UInt = 0u, public var inboundRootCriteria: Long = 0L)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION2_0_1(public var inboundEnterpriseStoreArraySize: UInt = 0u, public var inboundEnterpriseStoreCriteria: Long = 0L)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION2_0_2(public var inboundRootStoreArraySize: UInt = 0u, public var inboundTrustedRootStoreCriteria: Long = 0L)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION2_1(
    public var Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION2_1_0 = IKEEXT_CERTIFICATE_AUTHENTICATION2_1_0(),
    public var Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION2_1_1 = IKEEXT_CERTIFICATE_AUTHENTICATION2_1_1(),
    public var Anonymous3: IKEEXT_CERTIFICATE_AUTHENTICATION2_1_2 = IKEEXT_CERTIFICATE_AUTHENTICATION2_1_2(),
)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION2_1_0(public var outboundRootArraySize: UInt = 0u, public var outboundRootCriteria: Long = 0L)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION2_1_1(public var outboundEnterpriseStoreArraySize: UInt = 0u, public var outboundEnterpriseStoreCriteria: Long = 0L)

public data class IKEEXT_CERTIFICATE_AUTHENTICATION2_1_2(public var outboundRootStoreArraySize: UInt = 0u, public var outboundTrustedRootStoreCriteria: Long = 0L)

public data class IKEEXT_CERTIFICATE_CREDENTIAL0(
    public var subjectName: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var certHash: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var flags: UInt = 0u,
)

public data class IKEEXT_CERTIFICATE_CREDENTIAL1(
    public var subjectName: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var certHash: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var flags: UInt = 0u,
    public var certificate: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
)

public data class IKEEXT_CERTIFICATE_CRITERIA0(
    public var certData: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var certHash: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
    public var eku: Long = 0L,
    public var name: Long = 0L,
    public var flags: UInt = 0u,
)

public data class IKEEXT_CERT_EKUS0(public var numEku: UInt = 0u, public var eku: Long = 0L)

public data class IKEEXT_CERT_NAME0(public var nameType: IKEEXT_CERT_CRITERIA_NAME_TYPE = 0, public var certName: PWSTR = 0L)

public data class IKEEXT_CERT_ROOT_CONFIG0(public var certData: FWP_BYTE_BLOB = FWP_BYTE_BLOB(), public var flags: IKEEXT_CERT_FLAGS = 0u)

public data class IKEEXT_CIPHER_ALGORITHM0(
    public var algoIdentifier: IKEEXT_CIPHER_TYPE = 0,
    public var keyLen: UInt = 0u,
    public var rounds: UInt = 0u,
)

public data class IKEEXT_COMMON_STATISTICS0(
    public var v4Statistics: IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0 = IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0(),
    public var v6Statistics: IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0 = IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0(),
    public var totalPacketsReceived: UInt = 0u,
    public var totalInvalidPacketsReceived: UInt = 0u,
    public var currentQueuedWorkitems: UInt = 0u,
)

public data class IKEEXT_COMMON_STATISTICS1(
    public var v4Statistics: IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1 = IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1(),
    public var v6Statistics: IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1 = IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1(),
    public var totalPacketsReceived: UInt = 0u,
    public var totalInvalidPacketsReceived: UInt = 0u,
    public var currentQueuedWorkitems: UInt = 0u,
)

public data class IKEEXT_COOKIE_PAIR0(public var initiator: ULong = 0uL, public var responder: ULong = 0uL)

public data class IKEEXT_CREDENTIAL0(
    public var authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0,
    public var impersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE = 0,
    public var Anonymous: IKEEXT_CREDENTIAL0_0 = IKEEXT_CREDENTIAL0_0(),
)

public data class IKEEXT_CREDENTIAL0_0(
    public var presharedKey: Long = 0L,
    public var certificate: Long = 0L,
    public var name: Long = 0L,
)

public data class IKEEXT_CREDENTIAL1(
    public var authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0,
    public var impersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE = 0,
    public var Anonymous: IKEEXT_CREDENTIAL1_0 = IKEEXT_CREDENTIAL1_0(),
)

public data class IKEEXT_CREDENTIAL1_0(
    public var presharedKey: Long = 0L,
    public var certificate: Long = 0L,
    public var name: Long = 0L,
)

public data class IKEEXT_CREDENTIAL2(
    public var authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE = 0,
    public var impersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE = 0,
    public var Anonymous: IKEEXT_CREDENTIAL2_0 = IKEEXT_CREDENTIAL2_0(),
)

public data class IKEEXT_CREDENTIAL2_0(
    public var presharedKey: Long = 0L,
    public var certificate: Long = 0L,
    public var name: Long = 0L,
)

public data class IKEEXT_CREDENTIALS0(public var numCredentials: UInt = 0u, public var credentials: Long = 0L)

public data class IKEEXT_CREDENTIALS1(public var numCredentials: UInt = 0u, public var credentials: Long = 0L)

public data class IKEEXT_CREDENTIALS2(public var numCredentials: UInt = 0u, public var credentials: Long = 0L)

public data class IKEEXT_CREDENTIAL_PAIR0(public var localCredentials: IKEEXT_CREDENTIAL0 = IKEEXT_CREDENTIAL0(), public var peerCredentials: IKEEXT_CREDENTIAL0 = IKEEXT_CREDENTIAL0())

public data class IKEEXT_CREDENTIAL_PAIR1(public var localCredentials: IKEEXT_CREDENTIAL1 = IKEEXT_CREDENTIAL1(), public var peerCredentials: IKEEXT_CREDENTIAL1 = IKEEXT_CREDENTIAL1())

public data class IKEEXT_CREDENTIAL_PAIR2(public var localCredentials: IKEEXT_CREDENTIAL2 = IKEEXT_CREDENTIAL2(), public var peerCredentials: IKEEXT_CREDENTIAL2 = IKEEXT_CREDENTIAL2())

public data class IKEEXT_EAP_AUTHENTICATION0(public var flags: IKEEXT_EAP_AUTHENTICATION_FLAGS = 0u)

public data class IKEEXT_EM_POLICY0(
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: Long = 0L,
    public var initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE = 0,
)

public data class IKEEXT_EM_POLICY1(
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: Long = 0L,
    public var initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE = 0,
)

public data class IKEEXT_EM_POLICY2(
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: Long = 0L,
    public var initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE = 0,
)

public data class IKEEXT_INTEGRITY_ALGORITHM0(public var algoIdentifier: IKEEXT_INTEGRITY_TYPE = 0)

public data class IKEEXT_IPV6_CGA_AUTHENTICATION0(
    public var keyContainerName: PWSTR = 0L,
    public var cspName: PWSTR = 0L,
    public var cspType: UInt = 0u,
    public var cgaModifier: FWP_BYTE_ARRAY16 = FWP_BYTE_ARRAY16(),
    public var cgaCollisionCount: UByte = 0u,
)

public data class IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0(public var totalSocketReceiveFailures: UInt = 0u, public var totalSocketSendFailures: UInt = 0u)

public data class IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1(public var totalSocketReceiveFailures: UInt = 0u, public var totalSocketSendFailures: UInt = 0u)

public class IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0(
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

public class IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1(
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

public data class IKEEXT_KERBEROS_AUTHENTICATION0(public var flags: IKEEXT_KERBEROS_AUTHENTICATION_FLAGS = 0u)

public data class IKEEXT_KERBEROS_AUTHENTICATION1(public var flags: IKEEXT_KERBEROS_AUTHENTICATION_FLAGS = 0u, public var proxyServer: PWSTR = 0L)

public data class IKEEXT_KEYMODULE_STATISTICS0(
    public var v4Statistics: IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0 = IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0(),
    public var v6Statistics: IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0 = IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0(),
    public var errorFrequencyTable: UIntArray = UIntArray(97),
    public var mainModeNegotiationTime: UInt = 0u,
    public var quickModeNegotiationTime: UInt = 0u,
    public var extendedModeNegotiationTime: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IKEEXT_KEYMODULE_STATISTICS0) return false
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

public data class IKEEXT_KEYMODULE_STATISTICS1(
    public var v4Statistics: IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1 = IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1(),
    public var v6Statistics: IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1 = IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1(),
    public var errorFrequencyTable: UIntArray = UIntArray(97),
    public var mainModeNegotiationTime: UInt = 0u,
    public var quickModeNegotiationTime: UInt = 0u,
    public var extendedModeNegotiationTime: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IKEEXT_KEYMODULE_STATISTICS1) return false
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

public data class IKEEXT_NAME_CREDENTIAL0(public var principalName: PWSTR = 0L)

public data class IKEEXT_NTLM_V2_AUTHENTICATION0(public var flags: UInt = 0u)

public data class IKEEXT_POLICY0(
    public var softExpirationTime: UInt = 0u,
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: Long = 0L,
    public var initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE = 0,
    public var numIkeProposals: UInt = 0u,
    public var ikeProposals: Long = 0L,
    public var flags: IKEEXT_POLICY_FLAG = 0u,
    public var maxDynamicFilters: UInt = 0u,
)

public data class IKEEXT_POLICY1(
    public var softExpirationTime: UInt = 0u,
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: Long = 0L,
    public var initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE = 0,
    public var numIkeProposals: UInt = 0u,
    public var ikeProposals: Long = 0L,
    public var flags: IKEEXT_POLICY_FLAG = 0u,
    public var maxDynamicFilters: UInt = 0u,
    public var retransmitDurationSecs: UInt = 0u,
)

public data class IKEEXT_POLICY2(
    public var softExpirationTime: UInt = 0u,
    public var numAuthenticationMethods: UInt = 0u,
    public var authenticationMethods: Long = 0L,
    public var initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE = 0,
    public var numIkeProposals: UInt = 0u,
    public var ikeProposals: Long = 0L,
    public var flags: IKEEXT_POLICY_FLAG = 0u,
    public var maxDynamicFilters: UInt = 0u,
    public var retransmitDurationSecs: UInt = 0u,
)

public data class IKEEXT_PRESHARED_KEY_AUTHENTICATION0(public var presharedKey: FWP_BYTE_BLOB = FWP_BYTE_BLOB())

public data class IKEEXT_PRESHARED_KEY_AUTHENTICATION1(public var presharedKey: FWP_BYTE_BLOB = FWP_BYTE_BLOB(), public var flags: IKEEXT_PRESHARED_KEY_AUTHENTICATION_FLAGS = 0u)

public data class IKEEXT_PROPOSAL0(
    public var cipherAlgorithm: IKEEXT_CIPHER_ALGORITHM0 = IKEEXT_CIPHER_ALGORITHM0(),
    public var integrityAlgorithm: IKEEXT_INTEGRITY_ALGORITHM0 = IKEEXT_INTEGRITY_ALGORITHM0(),
    public var maxLifetimeSeconds: UInt = 0u,
    public var dhGroup: IKEEXT_DH_GROUP = 0,
    public var quickModeLimit: UInt = 0u,
)

public data class IKEEXT_RESERVED_AUTHENTICATION0(public var flags: IKEEXT_RESERVED_AUTHENTICATION_FLAGS = 0u)

public data class IKEEXT_SA_DETAILS0(
    public var saId: ULong = 0uL,
    public var keyModuleType: IKEEXT_KEY_MODULE_TYPE = 0,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous: IKEEXT_SA_DETAILS0_0 = IKEEXT_SA_DETAILS0_0(),
    public var ikeTraffic: IKEEXT_TRAFFIC0 = IKEEXT_TRAFFIC0(),
    public var ikeProposal: IKEEXT_PROPOSAL0 = IKEEXT_PROPOSAL0(),
    public var cookiePair: IKEEXT_COOKIE_PAIR0 = IKEEXT_COOKIE_PAIR0(),
    public var ikeCredentials: IKEEXT_CREDENTIALS0 = IKEEXT_CREDENTIALS0(),
    public var ikePolicyKey: GUID = GUID(),
    public var virtualIfTunnelId: ULong = 0uL,
)

public data class IKEEXT_SA_DETAILS0_0(public var v4UdpEncapsulation: Long = 0L)

public data class IKEEXT_SA_DETAILS1(
    public var saId: ULong = 0uL,
    public var keyModuleType: IKEEXT_KEY_MODULE_TYPE = 0,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous: IKEEXT_SA_DETAILS1_0 = IKEEXT_SA_DETAILS1_0(),
    public var ikeTraffic: IKEEXT_TRAFFIC0 = IKEEXT_TRAFFIC0(),
    public var ikeProposal: IKEEXT_PROPOSAL0 = IKEEXT_PROPOSAL0(),
    public var cookiePair: IKEEXT_COOKIE_PAIR0 = IKEEXT_COOKIE_PAIR0(),
    public var ikeCredentials: IKEEXT_CREDENTIALS1 = IKEEXT_CREDENTIALS1(),
    public var ikePolicyKey: GUID = GUID(),
    public var virtualIfTunnelId: ULong = 0uL,
    public var correlationKey: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
)

public data class IKEEXT_SA_DETAILS1_0(public var v4UdpEncapsulation: Long = 0L)

public data class IKEEXT_SA_DETAILS2(
    public var saId: ULong = 0uL,
    public var keyModuleType: IKEEXT_KEY_MODULE_TYPE = 0,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous: IKEEXT_SA_DETAILS2_0 = IKEEXT_SA_DETAILS2_0(),
    public var ikeTraffic: IKEEXT_TRAFFIC0 = IKEEXT_TRAFFIC0(),
    public var ikeProposal: IKEEXT_PROPOSAL0 = IKEEXT_PROPOSAL0(),
    public var cookiePair: IKEEXT_COOKIE_PAIR0 = IKEEXT_COOKIE_PAIR0(),
    public var ikeCredentials: IKEEXT_CREDENTIALS2 = IKEEXT_CREDENTIALS2(),
    public var ikePolicyKey: GUID = GUID(),
    public var virtualIfTunnelId: ULong = 0uL,
    public var correlationKey: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
)

public data class IKEEXT_SA_DETAILS2_0(public var v4UdpEncapsulation: Long = 0L)

public data class IKEEXT_SA_ENUM_TEMPLATE0(
    public var localSubNet: FWP_CONDITION_VALUE0 = FWP_CONDITION_VALUE0(),
    public var remoteSubNet: FWP_CONDITION_VALUE0 = FWP_CONDITION_VALUE0(),
    public var localMainModeCertHash: FWP_BYTE_BLOB = FWP_BYTE_BLOB(),
)

public data class IKEEXT_STATISTICS0(
    public var ikeStatistics: IKEEXT_KEYMODULE_STATISTICS0 = IKEEXT_KEYMODULE_STATISTICS0(),
    public var authipStatistics: IKEEXT_KEYMODULE_STATISTICS0 = IKEEXT_KEYMODULE_STATISTICS0(),
    public var commonStatistics: IKEEXT_COMMON_STATISTICS0 = IKEEXT_COMMON_STATISTICS0(),
)

public data class IKEEXT_STATISTICS1(
    public var ikeStatistics: IKEEXT_KEYMODULE_STATISTICS1 = IKEEXT_KEYMODULE_STATISTICS1(),
    public var authipStatistics: IKEEXT_KEYMODULE_STATISTICS1 = IKEEXT_KEYMODULE_STATISTICS1(),
    public var ikeV2Statistics: IKEEXT_KEYMODULE_STATISTICS1 = IKEEXT_KEYMODULE_STATISTICS1(),
    public var commonStatistics: IKEEXT_COMMON_STATISTICS1 = IKEEXT_COMMON_STATISTICS1(),
)

public data class IKEEXT_TRAFFIC0(
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous1: IKEEXT_TRAFFIC0_0 = IKEEXT_TRAFFIC0_0(),
    public var Anonymous2: IKEEXT_TRAFFIC0_1 = IKEEXT_TRAFFIC0_1(),
    public var authIpFilterId: ULong = 0uL,
)

public data class IKEEXT_TRAFFIC0_0(public var localV4Address: UInt = 0u, public var localV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IKEEXT_TRAFFIC0_0) return false
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

public data class IKEEXT_TRAFFIC0_1(public var remoteV4Address: UInt = 0u, public var remoteV6Address: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IKEEXT_TRAFFIC0_1) return false
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

public data class IPSEC_ADDRESS_INFO0(
    public var numV4Addresses: UInt = 0u,
    public var v4Addresses: Long = 0L,
    public var numV6Addresses: UInt = 0u,
    public var v6Addresses: Long = 0L,
)

public data class IPSEC_AGGREGATE_DROP_PACKET_STATISTICS0(
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

public data class IPSEC_AGGREGATE_DROP_PACKET_STATISTICS1(
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

public data class IPSEC_AGGREGATE_SA_STATISTICS0(
    public var activeSas: UInt = 0u,
    public var pendingSaNegotiations: UInt = 0u,
    public var totalSasAdded: UInt = 0u,
    public var totalSasDeleted: UInt = 0u,
    public var successfulRekeys: UInt = 0u,
    public var activeTunnels: UInt = 0u,
    public var offloadedSas: UInt = 0u,
)

public data class IPSEC_AH_DROP_PACKET_STATISTICS0(
    public var invalidSpisOnInbound: UInt = 0u,
    public var authenticationFailuresOnInbound: UInt = 0u,
    public var replayCheckFailuresOnInbound: UInt = 0u,
    public var saNotInitializedOnInbound: UInt = 0u,
)

public data class IPSEC_AUTH_AND_CIPHER_TRANSFORM0(public var authTransform: IPSEC_AUTH_TRANSFORM0 = IPSEC_AUTH_TRANSFORM0(), public var cipherTransform: IPSEC_CIPHER_TRANSFORM0 = IPSEC_CIPHER_TRANSFORM0())

public data class IPSEC_AUTH_TRANSFORM0(public var authTransformId: IPSEC_AUTH_TRANSFORM_ID0 = IPSEC_AUTH_TRANSFORM_ID0(), public var cryptoModuleId: Long = 0L)

public data class IPSEC_AUTH_TRANSFORM_ID0(public var authType: IPSEC_AUTH_TYPE = 0, public var authConfig: UByte = 0u)

public data class IPSEC_CIPHER_TRANSFORM0(public var cipherTransformId: IPSEC_CIPHER_TRANSFORM_ID0 = IPSEC_CIPHER_TRANSFORM_ID0(), public var cryptoModuleId: Long = 0L)

public data class IPSEC_CIPHER_TRANSFORM_ID0(public var cipherType: IPSEC_CIPHER_TYPE = 0, public var cipherConfig: UByte = 0u)

public class IPSEC_DOSP_OPTIONS0(
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
    public var flags: IPSEC_DOSP_FLAGS = 0u,
    public var numPublicIFLuids: UInt = 0u,
    public var publicIFLuids: Long = 0L,
    public var numInternalIFLuids: UInt = 0u,
    public var internalIFLuids: Long = 0L,
    public var publicV6AddrMask: FWP_V6_ADDR_AND_MASK = FWP_V6_ADDR_AND_MASK(),
    public var internalV6AddrMask: FWP_V6_ADDR_AND_MASK = FWP_V6_ADDR_AND_MASK(),
)

public data class IPSEC_DOSP_STATE0(
    public var publicHostV6Addr: UByteArray = UByteArray(16),
    public var internalHostV6Addr: UByteArray = UByteArray(16),
    public var totalInboundIPv6IPsecAuthPackets: ULong = 0uL,
    public var totalOutboundIPv6IPsecAuthPackets: ULong = 0uL,
    public var durationSecs: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPSEC_DOSP_STATE0) return false
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

public data class IPSEC_DOSP_STATE_ENUM_TEMPLATE0(public var publicV6AddrMask: FWP_V6_ADDR_AND_MASK = FWP_V6_ADDR_AND_MASK(), public var internalV6AddrMask: FWP_V6_ADDR_AND_MASK = FWP_V6_ADDR_AND_MASK())

public class IPSEC_DOSP_STATISTICS0(
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

public data class IPSEC_ESP_DROP_PACKET_STATISTICS0(
    public var invalidSpisOnInbound: UInt = 0u,
    public var decryptionFailuresOnInbound: UInt = 0u,
    public var authenticationFailuresOnInbound: UInt = 0u,
    public var replayCheckFailuresOnInbound: UInt = 0u,
    public var saNotInitializedOnInbound: UInt = 0u,
)

public data class IPSEC_GETSPI0(
    public var inboundIpsecTraffic: IPSEC_TRAFFIC0 = IPSEC_TRAFFIC0(),
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous: IPSEC_GETSPI0_0 = IPSEC_GETSPI0_0(),
    public var rngCryptoModuleID: Long = 0L,
)

public data class IPSEC_GETSPI0_0(public var inboundUdpEncapsulation: Long = 0L)

public data class IPSEC_GETSPI1(
    public var inboundIpsecTraffic: IPSEC_TRAFFIC1 = IPSEC_TRAFFIC1(),
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous: IPSEC_GETSPI1_0 = IPSEC_GETSPI1_0(),
    public var rngCryptoModuleID: Long = 0L,
)

public data class IPSEC_GETSPI1_0(public var inboundUdpEncapsulation: Long = 0L)

public data class IPSEC_ID0(
    public var mmTargetName: PWSTR = 0L,
    public var emTargetName: PWSTR = 0L,
    public var numTokens: UInt = 0u,
    public var tokens: Long = 0L,
    public var explicitCredentials: ULong = 0uL,
    public var logonId: ULong = 0uL,
)

public data class IPSEC_KEYING_POLICY0(public var numKeyMods: UInt = 0u, public var keyModKeys: Long = 0L)

public data class IPSEC_KEYING_POLICY1(
    public var numKeyMods: UInt = 0u,
    public var keyModKeys: Long = 0L,
    public var flags: UInt = 0u,
)

public data class IPSEC_KEYMODULE_STATE0(public var keyModuleKey: GUID = GUID(), public var stateBlob: FWP_BYTE_BLOB = FWP_BYTE_BLOB())

public data class IPSEC_KEY_MANAGER0(
    public var keyManagerKey: GUID = GUID(),
    public var displayData: FWPM_DISPLAY_DATA0 = FWPM_DISPLAY_DATA0(),
    public var flags: UInt = 0u,
    public var keyDictationTimeoutHint: UByte = 0u,
)

public data class IPSEC_KEY_MANAGER_CALLBACKS0(
    public var reserved: GUID = GUID(),
    public var flags: UInt = 0u,
    public var keyDictationCheck: IPSEC_KEY_MANAGER_KEY_DICTATION_CHECK0 = null,
    public var keyDictation: IPSEC_KEY_MANAGER_DICTATE_KEY0 = null,
    public var keyNotify: IPSEC_KEY_MANAGER_NOTIFY_KEY0 = null,
)

public data class IPSEC_PROPOSAL0(
    public var lifetime: IPSEC_SA_LIFETIME0 = IPSEC_SA_LIFETIME0(),
    public var numSaTransforms: UInt = 0u,
    public var saTransforms: Long = 0L,
    public var pfsGroup: IPSEC_PFS_GROUP = 0,
)

public data class IPSEC_SA0(
    public var spi: UInt = 0u,
    public var saTransformType: IPSEC_TRANSFORM_TYPE = 0,
    public var Anonymous: IPSEC_SA0_0 = IPSEC_SA0_0(),
)

public data class IPSEC_SA0_0(
    public var ahInformation: Long = 0L,
    public var espAuthInformation: Long = 0L,
    public var espCipherInformation: Long = 0L,
    public var espAuthAndCipherInformation: Long = 0L,
    public var espAuthFwInformation: Long = 0L,
)

public data class IPSEC_SA_AUTH_AND_CIPHER_INFORMATION0(public var saCipherInformation: IPSEC_SA_CIPHER_INFORMATION0 = IPSEC_SA_CIPHER_INFORMATION0(), public var saAuthInformation: IPSEC_SA_AUTH_INFORMATION0 = IPSEC_SA_AUTH_INFORMATION0())

public data class IPSEC_SA_AUTH_INFORMATION0(public var authTransform: IPSEC_AUTH_TRANSFORM0 = IPSEC_AUTH_TRANSFORM0(), public var authKey: FWP_BYTE_BLOB = FWP_BYTE_BLOB())

public data class IPSEC_SA_BUNDLE0(
    public var flags: IPSEC_SA_BUNDLE_FLAGS = 0u,
    public var lifetime: IPSEC_SA_LIFETIME0 = IPSEC_SA_LIFETIME0(),
    public var idleTimeoutSeconds: UInt = 0u,
    public var ndAllowClearTimeoutSeconds: UInt = 0u,
    public var ipsecId: Long = 0L,
    public var napContext: UInt = 0u,
    public var qmSaId: UInt = 0u,
    public var numSAs: UInt = 0u,
    public var saList: Long = 0L,
    public var keyModuleState: Long = 0L,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous: IPSEC_SA_BUNDLE0_0 = IPSEC_SA_BUNDLE0_0(),
    public var mmSaId: ULong = 0uL,
    public var pfsGroup: IPSEC_PFS_GROUP = 0,
)

public data class IPSEC_SA_BUNDLE0_0(public var peerV4PrivateAddress: UInt = 0u)

public data class IPSEC_SA_BUNDLE1(
    public var flags: IPSEC_SA_BUNDLE_FLAGS = 0u,
    public var lifetime: IPSEC_SA_LIFETIME0 = IPSEC_SA_LIFETIME0(),
    public var idleTimeoutSeconds: UInt = 0u,
    public var ndAllowClearTimeoutSeconds: UInt = 0u,
    public var ipsecId: Long = 0L,
    public var napContext: UInt = 0u,
    public var qmSaId: UInt = 0u,
    public var numSAs: UInt = 0u,
    public var saList: Long = 0L,
    public var keyModuleState: Long = 0L,
    public var ipVersion: FWP_IP_VERSION = 0,
    public var Anonymous: IPSEC_SA_BUNDLE1_0 = IPSEC_SA_BUNDLE1_0(),
    public var mmSaId: ULong = 0uL,
    public var pfsGroup: IPSEC_PFS_GROUP = 0,
    public var saLookupContext: GUID = GUID(),
    public var qmFilterId: ULong = 0uL,
)

public data class IPSEC_SA_BUNDLE1_0(public var peerV4PrivateAddress: UInt = 0u)

public data class IPSEC_SA_CIPHER_INFORMATION0(public var cipherTransform: IPSEC_CIPHER_TRANSFORM0 = IPSEC_CIPHER_TRANSFORM0(), public var cipherKey: FWP_BYTE_BLOB = FWP_BYTE_BLOB())

public data class IPSEC_SA_CONTEXT0(
    public var saContextId: ULong = 0uL,
    public var inboundSa: Long = 0L,
    public var outboundSa: Long = 0L,
)

public data class IPSEC_SA_CONTEXT1(
    public var saContextId: ULong = 0uL,
    public var inboundSa: Long = 0L,
    public var outboundSa: Long = 0L,
)

public data class IPSEC_SA_CONTEXT_CHANGE0(public var changeType: IPSEC_SA_CONTEXT_EVENT_TYPE0 = 0, public var saContextId: ULong = 0uL)

public data class IPSEC_SA_CONTEXT_ENUM_TEMPLATE0(public var localSubNet: FWP_CONDITION_VALUE0 = FWP_CONDITION_VALUE0(), public var remoteSubNet: FWP_CONDITION_VALUE0 = FWP_CONDITION_VALUE0())

public data class IPSEC_SA_CONTEXT_SUBSCRIPTION0(
    public var enumTemplate: Long = 0L,
    public var flags: UInt = 0u,
    public var sessionKey: GUID = GUID(),
)

public data class IPSEC_SA_DETAILS0(
    public var ipVersion: FWP_IP_VERSION = 0,
    public var saDirection: FWP_DIRECTION = 0,
    public var traffic: IPSEC_TRAFFIC0 = IPSEC_TRAFFIC0(),
    public var saBundle: IPSEC_SA_BUNDLE0 = IPSEC_SA_BUNDLE0(),
    public var Anonymous: IPSEC_SA_DETAILS0_0 = IPSEC_SA_DETAILS0_0(),
    public var transportFilter: Long = 0L,
)

public data class IPSEC_SA_DETAILS0_0(public var udpEncapsulation: Long = 0L)

public data class IPSEC_SA_DETAILS1(
    public var ipVersion: FWP_IP_VERSION = 0,
    public var saDirection: FWP_DIRECTION = 0,
    public var traffic: IPSEC_TRAFFIC1 = IPSEC_TRAFFIC1(),
    public var saBundle: IPSEC_SA_BUNDLE1 = IPSEC_SA_BUNDLE1(),
    public var Anonymous: IPSEC_SA_DETAILS1_0 = IPSEC_SA_DETAILS1_0(),
    public var transportFilter: Long = 0L,
    public var virtualIfTunnelInfo: IPSEC_VIRTUAL_IF_TUNNEL_INFO0 = IPSEC_VIRTUAL_IF_TUNNEL_INFO0(),
)

public data class IPSEC_SA_DETAILS1_0(public var udpEncapsulation: Long = 0L)

public data class IPSEC_SA_ENUM_TEMPLATE0(public var saDirection: FWP_DIRECTION = 0)

public data class IPSEC_SA_IDLE_TIMEOUT0(public var idleTimeoutSeconds: UInt = 0u, public var idleTimeoutSecondsFailOver: UInt = 0u)

public data class IPSEC_SA_LIFETIME0(
    public var lifetimeSeconds: UInt = 0u,
    public var lifetimeKilobytes: UInt = 0u,
    public var lifetimePackets: UInt = 0u,
)

public data class IPSEC_SA_TRANSFORM0(public var ipsecTransformType: IPSEC_TRANSFORM_TYPE = 0, public var Anonymous: IPSEC_SA_TRANSFORM0_0 = IPSEC_SA_TRANSFORM0_0())

public data class IPSEC_SA_TRANSFORM0_0(
    public var ahTransform: Long = 0L,
    public var espAuthTransform: Long = 0L,
    public var espCipherTransform: Long = 0L,
    public var espAuthAndCipherTransform: Long = 0L,
    public var espAuthFwTransform: Long = 0L,
)
