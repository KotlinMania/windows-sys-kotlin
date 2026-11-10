@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr

public data class WlanConnectionAttributes(
    public var isState: WlanInterfaceState = 0,
    public var wlanConnectionMode: WlanConnectionMode = 0,
    public var strProfileName: UShortArray = UShortArray(256),
    public var wlanAssociationAttributes: WlanAssociationAttributes = WlanAssociationAttributes(),
    public var wlanSecurityAttributes: WlanSecurityAttributes = WlanSecurityAttributes(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanConnectionAttributes) return false
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

public data class WlanConnectionNotificationData(
    public var wlanConnectionMode: WlanConnectionMode = 0,
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
    public var bSecurityEnabled: Bool = 0,
    public var wlanReasonCode: UInt = 0u,
    public var dwFlags: WlanConnectionNotificationFlags = 0u,
    public var strProfileXml: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanConnectionNotificationData) return false
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

public data class WlanConnectionParameters(
    public var wlanConnectionMode: WlanConnectionMode = 0,
    public var strProfile: Pcwstr = null,
    public var pDot11Ssid: Dot11Ssid? = null,
    public var pDesiredBssidList: Dot11BssidList? = null,
    public var dot11BssType: Dot11BssType = 0,
    public var dwFlags: UInt = 0u,
)

public data class WlanConnectionParametersV2(
    public var wlanConnectionMode: WlanConnectionMode = 0,
    public var strProfile: Pcwstr = null,
    public var pDot11Ssid: Dot11Ssid? = null,
    public var pDot11Hessid: COpaquePointer? = null,
    public var pDesiredBssidList: Dot11BssidList? = null,
    public var dot11BssType: Dot11BssType = 0,
    public var dwFlags: UInt = 0u,
    public var pDot11AccessNetworkOptions: Dot11Accessnetworkoptions? = null,
)

public data class WlanCountryOrRegionStringList(
    public var dwNumberOfItems: UInt = 0u,
    public var pCountryOrRegionStringList: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanCountryOrRegionStringList) return false
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

public data class WlanDeviceServiceGuidList(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var deviceService: List<Guid> = List(1) { Guid() },
)

public data class WlanDeviceServiceNotificationData(
    public var deviceService: Guid = Guid(),
    public var dwOpCode: UInt = 0u,
    public var dwDataSize: UInt = 0u,
    public var dataBlob: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanDeviceServiceNotificationData) return false
        if (this.deviceService != other.deviceService) return false
        if (this.dwOpCode != other.dwOpCode) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (!this.dataBlob.contentEquals(other.dataBlob)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceService.hashCode()
        result = 31 * result + this.dwOpCode.hashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.dataBlob.contentHashCode()
        return result
    }
}

public data class WlanHostedNetworkConnectionSettings(
    public var hostedNetworkSSID: Dot11Ssid = Dot11Ssid(),
    public var dwMaxNumberOfPeers: UInt = 0u,
)

public data class WlanHostedNetworkDataPeerStateChange(
    public var oldState: WlanHostedNetworkPeerState = WlanHostedNetworkPeerState(),
    public var newState: WlanHostedNetworkPeerState = WlanHostedNetworkPeerState(),
    public var peerStateChangeReason: WlanHostedNetworkReason = 0,
)

public data class WlanHostedNetworkPeerState(
    public var peerMacAddress: UByteArray = UByteArray(6),
    public var peerAuthState: WlanHostedNetworkPeerAuthState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanHostedNetworkPeerState) return false
        if (!this.peerMacAddress.contentEquals(other.peerMacAddress)) return false
        if (this.peerAuthState != other.peerAuthState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMacAddress.contentHashCode()
        result = 31 * result + this.peerAuthState.hashCode()
        return result
    }
}

public data class WlanHostedNetworkRadioState(
    public var dot11SoftwareRadioState: Dot11RadioState = 0,
    public var dot11HardwareRadioState: Dot11RadioState = 0,
)

public data class WlanHostedNetworkSecuritySettings(
    public var dot11AuthAlgo: Dot11AuthAlgorithm = 0,
    public var dot11CipherAlgo: Dot11CipherAlgorithm = 0,
)

public data class WlanHostedNetworkStateChange(
    public var oldState: WlanHostedNetworkState = 0,
    public var newState: WlanHostedNetworkState = 0,
    public var stateChangeReason: WlanHostedNetworkReason = 0,
)

public data class WlanHostedNetworkStatus(
    public var hostedNetworkState: WlanHostedNetworkState = 0,
    public var iPDeviceID: Guid = Guid(),
    public var wlanHostedNetworkBSSID: UByteArray = UByteArray(6),
    public var dot11PhyType: Dot11PhyType = 0,
    public var ulChannelFrequency: UInt = 0u,
    public var dwNumberOfPeers: UInt = 0u,
    public var peerList: List<WlanHostedNetworkPeerState> = List(1) { WlanHostedNetworkPeerState() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanHostedNetworkStatus) return false
        if (this.hostedNetworkState != other.hostedNetworkState) return false
        if (this.iPDeviceID != other.iPDeviceID) return false
        if (!this.wlanHostedNetworkBSSID.contentEquals(other.wlanHostedNetworkBSSID)) return false
        if (this.dot11PhyType != other.dot11PhyType) return false
        if (this.ulChannelFrequency != other.ulChannelFrequency) return false
        if (this.dwNumberOfPeers != other.dwNumberOfPeers) return false
        if (this.peerList != other.peerList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hostedNetworkState.hashCode()
        result = 31 * result + this.iPDeviceID.hashCode()
        result = 31 * result + this.wlanHostedNetworkBSSID.contentHashCode()
        result = 31 * result + this.dot11PhyType.hashCode()
        result = 31 * result + this.ulChannelFrequency.hashCode()
        result = 31 * result + this.dwNumberOfPeers.hashCode()
        result = 31 * result + this.peerList.hashCode()
        return result
    }
}

public data class WlanInterfaceCapability(
    public var interfaceType: WlanInterfaceType = 0,
    public var bDot11DSupported: Bool = 0,
    public var dwMaxDesiredSsidListSize: UInt = 0u,
    public var dwMaxDesiredBssidListSize: UInt = 0u,
    public var dwNumberOfSupportedPhys: UInt = 0u,
    public var dot11PhyTypes: IntArray = IntArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanInterfaceCapability) return false
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

public data class WlanInterfaceInfo(
    public var interfaceGuid: Guid = Guid(),
    public var strInterfaceDescription: UShortArray = UShortArray(256),
    public var isState: WlanInterfaceState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanInterfaceInfo) return false
        if (this.interfaceGuid != other.interfaceGuid) return false
        if (!this.strInterfaceDescription.contentEquals(other.strInterfaceDescription)) return false
        if (this.isState != other.isState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.interfaceGuid.hashCode()
        result = 31 * result + this.strInterfaceDescription.contentHashCode()
        result = 31 * result + this.isState.hashCode()
        return result
    }
}

public data class WlanInterfaceInfoList(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var interfaceInfo: List<WlanInterfaceInfo> = List(1) { WlanInterfaceInfo() },
)

public data class WlanMacFrameStatistics(
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

public data class WlanMsmNotificationData(
    public var wlanConnectionMode: WlanConnectionMode = 0,
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
    public var dot11MacAddr: UByteArray = UByteArray(6),
    public var bSecurityEnabled: Bool = 0,
    public var bFirstPeer: Bool = 0,
    public var bLastPeer: Bool = 0,
    public var wlanReasonCode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanMsmNotificationData) return false
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

public class WlanPhyFrameStatistics(
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

public data class WlanPhyRadioState(
    public var dwPhyIndex: UInt = 0u,
    public var dot11SoftwareRadioState: Dot11RadioState = 0,
    public var dot11HardwareRadioState: Dot11RadioState = 0,
)

public data class WlanProfileInfo(
    public var strProfileName: UShortArray = UShortArray(256),
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanProfileInfo) return false
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

public data class WlanProfileInfoList(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var profileInfo: List<WlanProfileInfo> = List(1) { WlanProfileInfo() },
)

public data class WlanRadioState(
    public var dwNumberOfPhys: UInt = 0u,
    public var phyRadioState: List<WlanPhyRadioState> = List(64) { WlanPhyRadioState() },
)

public data class WlanRateSet(
    public var uRateSetLength: UInt = 0u,
    public var usRateSet: UShortArray = UShortArray(126),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanRateSet) return false
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

public data class WlanRawData(
    public var dwDataSize: UInt = 0u,
    public var dataBlob: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanRawData) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (!this.dataBlob.contentEquals(other.dataBlob)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDataSize.hashCode()
        result = 31 * result + this.dataBlob.contentHashCode()
        return result
    }
}

public data class WlanRawDataList(
    public var dwTotalSize: UInt = 0u,
    public var dwNumberOfItems: UInt = 0u,
    public var dataList: List<WlanRawDataList0> = List(1) { WlanRawDataList0() },
)

public data class WlanRawDataList0(
    public var dwDataOffset: UInt = 0u,
    public var dwDataSize: UInt = 0u,
)

public data class WlanSecurityAttributes(
    public var bSecurityEnabled: Bool = 0,
    public var bOneXEnabled: Bool = 0,
    public var dot11AuthAlgorithm: Dot11AuthAlgorithm = 0,
    public var dot11CipherAlgorithm: Dot11CipherAlgorithm = 0,
)

public data class WlanStatistics(
    public var ullFourWayHandshakeFailures: ULong = 0uL,
    public var ullTKIPCounterMeasuresInvoked: ULong = 0uL,
    public var ullReserved: ULong = 0uL,
    public var macUcastCounters: WlanMacFrameStatistics = WlanMacFrameStatistics(),
    public var macMcastCounters: WlanMacFrameStatistics = WlanMacFrameStatistics(),
    public var dwNumberOfPhys: UInt = 0u,
    public var phyCounters: List<WlanPhyFrameStatistics> = List(1) { WlanPhyFrameStatistics() },
)
