@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR

public data class WLAN_CONNECTION_ATTRIBUTES(
    public var isState: WLAN_INTERFACE_STATE = 0,
    public var wlanConnectionMode: WLAN_CONNECTION_MODE = 0,
    public var strProfileName: UShortArray = UShortArray(256),
    public var wlanAssociationAttributes: WLAN_ASSOCIATION_ATTRIBUTES = WLAN_ASSOCIATION_ATTRIBUTES(),
    public var wlanSecurityAttributes: WLAN_SECURITY_ATTRIBUTES = WLAN_SECURITY_ATTRIBUTES(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_CONNECTION_ATTRIBUTES) return false
        if (this.isState != other.isState) return false
        if (this.wlanConnectionMode != other.wlanConnectionMode) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.wlanAssociationAttributes != other.wlanAssociationAttributes) return false
        if (this.wlanSecurityAttributes != other.wlanSecurityAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.isState.hashCode()
        result = 31 * result + this.wlanConnectionMode.hashCode()
        result = 31 * result + this.strProfileName.contentHashCode()
        result = 31 * result + this.wlanAssociationAttributes.hashCode()
        result = 31 * result + this.wlanSecurityAttributes.hashCode()
        return result
    }
}

public data class WLAN_CONNECTION_NOTIFICATION_DATA(
    public var wlanConnectionMode: WLAN_CONNECTION_MODE = 0,
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: DOT11_SSID = DOT11_SSID(),
    public var dot11BssType: DOT11_BSS_TYPE = 0,
    public var bSecurityEnabled: BOOL = 0,
    public var wlanReasonCode: UInt = 0u,
    public var dwFlags: WLAN_CONNECTION_NOTIFICATION_FLAGS = 0u,
    public var strProfileXml: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_CONNECTION_NOTIFICATION_DATA) return false
        if (this.wlanConnectionMode != other.wlanConnectionMode) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.dot11Ssid != other.dot11Ssid) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (this.bSecurityEnabled != other.bSecurityEnabled) return false
        if (this.wlanReasonCode != other.wlanReasonCode) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.strProfileXml.contentEquals(other.strProfileXml)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wlanConnectionMode.hashCode()
        result = 31 * result + this.strProfileName.contentHashCode()
        result = 31 * result + this.dot11Ssid.hashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.bSecurityEnabled.hashCode()
        result = 31 * result + this.wlanReasonCode.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.strProfileXml.contentHashCode()
        return result
    }
}

public data class WLAN_CONNECTION_PARAMETERS(
    public var wlanConnectionMode: WLAN_CONNECTION_MODE = 0,
    public var strProfile: PCWSTR = 0L,
    public var pDot11Ssid: Long = 0L,
    public var pDesiredBssidList: Long = 0L,
    public var dot11BssType: DOT11_BSS_TYPE = 0,
    public var dwFlags: UInt = 0u,
)

public data class WLAN_CONNECTION_PARAMETERS_V2(
    public var wlanConnectionMode: WLAN_CONNECTION_MODE = 0,
    public var strProfile: PCWSTR = 0L,
    public var pDot11Ssid: Long = 0L,
    public var pDot11Hessid: Long = 0L,
    public var pDesiredBssidList: Long = 0L,
    public var dot11BssType: DOT11_BSS_TYPE = 0,
    public var dwFlags: UInt = 0u,
    public var pDot11AccessNetworkOptions: Long = 0L,
)

public data class WLAN_COUNTRY_OR_REGION_STRING_LIST(public var dwNumberOfItems: UInt = 0u, public var pCountryOrRegionStringList: UByteArray = UByteArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_COUNTRY_OR_REGION_STRING_LIST) return false
        if (this.dwNumberOfItems != other.dwNumberOfItems) return false
        if (!this.pCountryOrRegionStringList.contentEquals(other.pCountryOrRegionStringList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNumberOfItems.hashCode()
        result = 31 * result + this.pCountryOrRegionStringList.contentHashCode()
        return result
    }
}

public data class WLAN_DEVICE_SERVICE_GUID_LIST(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var DeviceService: List<GUID> = List(1) { GUID() },
)

public data class WLAN_DEVICE_SERVICE_NOTIFICATION_DATA(
    public var DeviceService: GUID = GUID(),
    public var dwOpCode: UInt = 0u,
    public var dwDataSize: UInt = 0u,
    public var DataBlob: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_DEVICE_SERVICE_NOTIFICATION_DATA) return false
        if (this.DeviceService != other.DeviceService) return false
        if (this.dwOpCode != other.dwOpCode) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (!this.DataBlob.contentEquals(other.DataBlob)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceService.hashCode()
        result = 31 * result + this.dwOpCode.hashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.DataBlob.contentHashCode()
        return result
    }
}

public data class WLAN_HOSTED_NETWORK_CONNECTION_SETTINGS(public var hostedNetworkSSID: DOT11_SSID = DOT11_SSID(), public var dwMaxNumberOfPeers: UInt = 0u)

public data class WLAN_HOSTED_NETWORK_DATA_PEER_STATE_CHANGE(
    public var OldState: WLAN_HOSTED_NETWORK_PEER_STATE = WLAN_HOSTED_NETWORK_PEER_STATE(),
    public var NewState: WLAN_HOSTED_NETWORK_PEER_STATE = WLAN_HOSTED_NETWORK_PEER_STATE(),
    public var PeerStateChangeReason: WLAN_HOSTED_NETWORK_REASON = 0,
)

public data class WLAN_HOSTED_NETWORK_PEER_STATE(public var PeerMacAddress: UByteArray = UByteArray(6), public var PeerAuthState: WLAN_HOSTED_NETWORK_PEER_AUTH_STATE = 0) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_HOSTED_NETWORK_PEER_STATE) return false
        if (!this.PeerMacAddress.contentEquals(other.PeerMacAddress)) return false
        if (this.PeerAuthState != other.PeerAuthState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PeerMacAddress.contentHashCode()
        result = 31 * result + this.PeerAuthState.hashCode()
        return result
    }
}

public data class WLAN_HOSTED_NETWORK_RADIO_STATE(public var dot11SoftwareRadioState: DOT11_RADIO_STATE = 0, public var dot11HardwareRadioState: DOT11_RADIO_STATE = 0)

public data class WLAN_HOSTED_NETWORK_SECURITY_SETTINGS(public var dot11AuthAlgo: DOT11_AUTH_ALGORITHM = 0, public var dot11CipherAlgo: DOT11_CIPHER_ALGORITHM = 0)

public data class WLAN_HOSTED_NETWORK_STATE_CHANGE(
    public var OldState: WLAN_HOSTED_NETWORK_STATE = 0,
    public var NewState: WLAN_HOSTED_NETWORK_STATE = 0,
    public var StateChangeReason: WLAN_HOSTED_NETWORK_REASON = 0,
)

public data class WLAN_HOSTED_NETWORK_STATUS(
    public var HostedNetworkState: WLAN_HOSTED_NETWORK_STATE = 0,
    public var IPDeviceID: GUID = GUID(),
    public var wlanHostedNetworkBSSID: UByteArray = UByteArray(6),
    public var dot11PhyType: DOT11_PHY_TYPE = 0,
    public var ulChannelFrequency: UInt = 0u,
    public var dwNumberOfPeers: UInt = 0u,
    public var PeerList: List<WLAN_HOSTED_NETWORK_PEER_STATE> = List(1) { WLAN_HOSTED_NETWORK_PEER_STATE() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_HOSTED_NETWORK_STATUS) return false
        if (this.HostedNetworkState != other.HostedNetworkState) return false
        if (this.IPDeviceID != other.IPDeviceID) return false
        if (!this.wlanHostedNetworkBSSID.contentEquals(other.wlanHostedNetworkBSSID)) return false
        if (this.dot11PhyType != other.dot11PhyType) return false
        if (this.ulChannelFrequency != other.ulChannelFrequency) return false
        if (this.dwNumberOfPeers != other.dwNumberOfPeers) return false
        if (this.PeerList != other.PeerList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HostedNetworkState.hashCode()
        result = 31 * result + this.IPDeviceID.hashCode()
        result = 31 * result + this.wlanHostedNetworkBSSID.contentHashCode()
        result = 31 * result + this.dot11PhyType.hashCode()
        result = 31 * result + this.ulChannelFrequency.hashCode()
        result = 31 * result + this.dwNumberOfPeers.hashCode()
        result = 31 * result + this.PeerList.hashCode()
        return result
    }
}

public data class WLAN_INTERFACE_CAPABILITY(
    public var interfaceType: WLAN_INTERFACE_TYPE = 0,
    public var bDot11DSupported: BOOL = 0,
    public var dwMaxDesiredSsidListSize: UInt = 0u,
    public var dwMaxDesiredBssidListSize: UInt = 0u,
    public var dwNumberOfSupportedPhys: UInt = 0u,
    public var dot11PhyTypes: IntArray = IntArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_INTERFACE_CAPABILITY) return false
        if (this.interfaceType != other.interfaceType) return false
        if (this.bDot11DSupported != other.bDot11DSupported) return false
        if (this.dwMaxDesiredSsidListSize != other.dwMaxDesiredSsidListSize) return false
        if (this.dwMaxDesiredBssidListSize != other.dwMaxDesiredBssidListSize) return false
        if (this.dwNumberOfSupportedPhys != other.dwNumberOfSupportedPhys) return false
        if (!this.dot11PhyTypes.contentEquals(other.dot11PhyTypes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.interfaceType.hashCode()
        result = 31 * result + this.bDot11DSupported.hashCode()
        result = 31 * result + this.dwMaxDesiredSsidListSize.hashCode()
        result = 31 * result + this.dwMaxDesiredBssidListSize.hashCode()
        result = 31 * result + this.dwNumberOfSupportedPhys.hashCode()
        result = 31 * result + this.dot11PhyTypes.contentHashCode()
        return result
    }
}

public data class WLAN_INTERFACE_INFO(
    public var InterfaceGuid: GUID = GUID(),
    public var strInterfaceDescription: UShortArray = UShortArray(256),
    public var isState: WLAN_INTERFACE_STATE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_INTERFACE_INFO) return false
        if (this.InterfaceGuid != other.InterfaceGuid) return false
        if (!this.strInterfaceDescription.contentEquals(other.strInterfaceDescription)) return false
        if (this.isState != other.isState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InterfaceGuid.hashCode()
        result = 31 * result + this.strInterfaceDescription.contentHashCode()
        result = 31 * result + this.isState.hashCode()
        return result
    }
}

public data class WLAN_INTERFACE_INFO_LIST(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var InterfaceInfo: List<WLAN_INTERFACE_INFO> = List(1) { WLAN_INTERFACE_INFO() },
)

public data class WLAN_MAC_FRAME_STATISTICS(
    public var ullTransmittedFrameCount: ULong = 0uL,
    public var ullReceivedFrameCount: ULong = 0uL,
    public var ullWEPExcludedCount: ULong = 0uL,
    public var ullTKIPLocalMICFailures: ULong = 0uL,
    public var ullTKIPReplays: ULong = 0uL,
    public var ullTKIPICVErrorCount: ULong = 0uL,
    public var ullCCMPReplays: ULong = 0uL,
    public var ullCCMPDecryptErrors: ULong = 0uL,
    public var ullWEPUndecryptableCount: ULong = 0uL,
    public var ullWEPICVErrorCount: ULong = 0uL,
    public var ullDecryptSuccessCount: ULong = 0uL,
    public var ullDecryptFailureCount: ULong = 0uL,
)

public data class WLAN_MSM_NOTIFICATION_DATA(
    public var wlanConnectionMode: WLAN_CONNECTION_MODE = 0,
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: DOT11_SSID = DOT11_SSID(),
    public var dot11BssType: DOT11_BSS_TYPE = 0,
    public var dot11MacAddr: UByteArray = UByteArray(6),
    public var bSecurityEnabled: BOOL = 0,
    public var bFirstPeer: BOOL = 0,
    public var bLastPeer: BOOL = 0,
    public var wlanReasonCode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_MSM_NOTIFICATION_DATA) return false
        if (this.wlanConnectionMode != other.wlanConnectionMode) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.dot11Ssid != other.dot11Ssid) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (!this.dot11MacAddr.contentEquals(other.dot11MacAddr)) return false
        if (this.bSecurityEnabled != other.bSecurityEnabled) return false
        if (this.bFirstPeer != other.bFirstPeer) return false
        if (this.bLastPeer != other.bLastPeer) return false
        if (this.wlanReasonCode != other.wlanReasonCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wlanConnectionMode.hashCode()
        result = 31 * result + this.strProfileName.contentHashCode()
        result = 31 * result + this.dot11Ssid.hashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.dot11MacAddr.contentHashCode()
        result = 31 * result + this.bSecurityEnabled.hashCode()
        result = 31 * result + this.bFirstPeer.hashCode()
        result = 31 * result + this.bLastPeer.hashCode()
        result = 31 * result + this.wlanReasonCode.hashCode()
        return result
    }
}

public class WLAN_PHY_FRAME_STATISTICS(
    public var ullTransmittedFrameCount: ULong = 0uL,
    public var ullMulticastTransmittedFrameCount: ULong = 0uL,
    public var ullFailedCount: ULong = 0uL,
    public var ullRetryCount: ULong = 0uL,
    public var ullMultipleRetryCount: ULong = 0uL,
    public var ullMaxTXLifetimeExceededCount: ULong = 0uL,
    public var ullTransmittedFragmentCount: ULong = 0uL,
    public var ullRTSSuccessCount: ULong = 0uL,
    public var ullRTSFailureCount: ULong = 0uL,
    public var ullACKFailureCount: ULong = 0uL,
    public var ullReceivedFrameCount: ULong = 0uL,
    public var ullMulticastReceivedFrameCount: ULong = 0uL,
    public var ullPromiscuousReceivedFrameCount: ULong = 0uL,
    public var ullMaxRXLifetimeExceededCount: ULong = 0uL,
    public var ullFrameDuplicateCount: ULong = 0uL,
    public var ullReceivedFragmentCount: ULong = 0uL,
    public var ullPromiscuousReceivedFragmentCount: ULong = 0uL,
    public var ullFCSErrorCount: ULong = 0uL,
)

public data class WLAN_PHY_RADIO_STATE(
    public var dwPhyIndex: UInt = 0u,
    public var dot11SoftwareRadioState: DOT11_RADIO_STATE = 0,
    public var dot11HardwareRadioState: DOT11_RADIO_STATE = 0,
)

public data class WLAN_PROFILE_INFO(public var strProfileName: UShortArray = UShortArray(256), public var dwFlags: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_PROFILE_INFO) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strProfileName.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }
}

public data class WLAN_PROFILE_INFO_LIST(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var ProfileInfo: List<WLAN_PROFILE_INFO> = List(1) { WLAN_PROFILE_INFO() },
)

public data class WLAN_RADIO_STATE(public var dwNumberOfPhys: UInt = 0u, public var PhyRadioState: List<WLAN_PHY_RADIO_STATE> = List(64) { WLAN_PHY_RADIO_STATE() })

public data class WLAN_RATE_SET(public var uRateSetLength: UInt = 0u, public var usRateSet: UShortArray = UShortArray(126)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_RATE_SET) return false
        if (this.uRateSetLength != other.uRateSetLength) return false
        if (!this.usRateSet.contentEquals(other.usRateSet)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uRateSetLength.hashCode()
        result = 31 * result + this.usRateSet.contentHashCode()
        return result
    }
}

public data class WLAN_RAW_DATA(public var dwDataSize: UInt = 0u, public var DataBlob: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_RAW_DATA) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (!this.DataBlob.contentEquals(other.DataBlob)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDataSize.hashCode()
        result = 31 * result + this.DataBlob.contentHashCode()
        return result
    }
}

public data class WLAN_RAW_DATA_LIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNumberOfItems: UInt = 0u,
    public var DataList: List<WLAN_RAW_DATA_LIST_0> = List(1) { WLAN_RAW_DATA_LIST_0() },
)

public data class WLAN_RAW_DATA_LIST_0(public var dwDataOffset: UInt = 0u, public var dwDataSize: UInt = 0u)

public data class WLAN_SECURITY_ATTRIBUTES(
    public var bSecurityEnabled: BOOL = 0,
    public var bOneXEnabled: BOOL = 0,
    public var dot11AuthAlgorithm: DOT11_AUTH_ALGORITHM = 0,
    public var dot11CipherAlgorithm: DOT11_CIPHER_ALGORITHM = 0,
)

public data class WLAN_STATISTICS(
    public var ullFourWayHandshakeFailures: ULong = 0uL,
    public var ullTKIPCounterMeasuresInvoked: ULong = 0uL,
    public var ullReserved: ULong = 0uL,
    public var MacUcastCounters: WLAN_MAC_FRAME_STATISTICS = WLAN_MAC_FRAME_STATISTICS(),
    public var MacMcastCounters: WLAN_MAC_FRAME_STATISTICS = WLAN_MAC_FRAME_STATISTICS(),
    public var dwNumberOfPhys: UInt = 0u,
    public var PhyCounters: List<WLAN_PHY_FRAME_STATISTICS> = List(1) { WLAN_PHY_FRAME_STATISTICS() },
)
