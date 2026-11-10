@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NdisObjectHeader
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

public class Dot11extApis(
    public var dot11ExtAllocateBuffer: Dot11extAllocateBuffer = null,
    public var dot11ExtFreeBuffer: Dot11extFreeBuffer = null,
    public var dot11ExtSetProfileCustomUserData: Dot11extSetProfileCustomUserData = null,
    public var dot11ExtGetProfileCustomUserData: Dot11extGetProfileCustomUserData = null,
    public var dot11ExtSetCurrentProfile: Dot11extSetCurrentProfile = null,
    public var dot11ExtSendUIRequest: Dot11extSendUiRequest = null,
    public var dot11ExtPreAssociateCompletion: Dot11extPreAssociateCompletion = null,
    public var dot11ExtPostAssociateCompletion: Dot11extPostAssociateCompletion = null,
    public var dot11ExtSendNotification: Dot11extSendNotification = null,
    public var dot11ExtSendPacket: Dot11extSendPacket = null,
    public var dot11ExtSetEtherTypeHandling: Dot11extSetEthertypeHandling = null,
    public var dot11ExtSetAuthAlgorithm: Dot11extSetAuthAlgorithm = null,
    public var dot11ExtSetUnicastCipherAlgorithm: Dot11extSetUnicastCipherAlgorithm = null,
    public var dot11ExtSetMulticastCipherAlgorithm: Dot11extSetMulticastCipherAlgorithm = null,
    public var dot11ExtSetDefaultKey: Dot11extSetDefaultKey = null,
    public var dot11ExtSetKeyMappingKey: Dot11extSetKeyMappingKey = null,
    public var dot11ExtSetDefaultKeyId: Dot11extSetDefaultKeyId = null,
    public var dot11ExtNicSpecificExtension: Dot11extNicSpecificExtension = null,
    public var dot11ExtSetExcludeUnencrypted: Dot11extSetExcludeUnencrypted = null,
    public var dot11ExtStartOneX: Dot11extOnexStart = null,
    public var dot11ExtStopOneX: Dot11extOnexStop = null,
    public var dot11ExtProcessSecurityPacket: Dot11extProcessOnexPacket = null,
)

public data class Dot11extIhvConnectivityProfile(public var pszXmlFragmentIhvConnectivity: Pwstr = null)

public data class Dot11extIhvDiscoveryProfile(public var ihvConnectivityProfile: Dot11extIhvConnectivityProfile = Dot11extIhvConnectivityProfile(), public var ihvSecurityProfile: Dot11extIhvSecurityProfile = Dot11extIhvSecurityProfile())

public data class Dot11extIhvDiscoveryProfileList(public var dwCount: UInt = 0u, public var pIhvDiscoveryProfiles: Dot11extIhvDiscoveryProfile? = null)

public class Dot11extIhvHandlers(
    public var dot11ExtIhvDeinitService: Dot11extihvDeinitService = null,
    public var dot11ExtIhvInitAdapter: Dot11extihvInitAdapter = null,
    public var dot11ExtIhvDeinitAdapter: Dot11extihvDeinitAdapter = null,
    public var dot11ExtIhvPerformPreAssociate: Dot11extihvPerformPreAssociate = null,
    public var dot11ExtIhvAdapterReset: Dot11extihvAdapterReset = null,
    public var dot11ExtIhvPerformPostAssociate: Dot11extihvPerformPostAssociate = null,
    public var dot11ExtIhvStopPostAssociate: Dot11extihvStopPostAssociate = null,
    public var dot11ExtIhvValidateProfile: Dot11extihvValidateProfile = null,
    public var dot11ExtIhvPerformCapabilityMatch: Dot11extihvPerformCapabilityMatch = null,
    public var dot11ExtIhvCreateDiscoveryProfiles: Dot11extihvCreateDiscoveryProfiles = null,
    public var dot11ExtIhvProcessSessionChange: Dot11extihvProcessSessionChange = null,
    public var dot11ExtIhvReceiveIndication: Dot11extihvReceiveIndication = null,
    public var dot11ExtIhvReceivePacket: Dot11extihvReceivePacket = null,
    public var dot11ExtIhvSendPacketCompletion: Dot11extihvSendPacketCompletion = null,
    public var dot11ExtIhvIsUIRequestPending: Dot11extihvIsUiRequestPending = null,
    public var dot11ExtIhvProcessUIResponse: Dot11extihvProcessUiResponse = null,
    public var dot11ExtIhvQueryUIRequest: Dot11extihvQueryUiRequest = null,
    public var dot11ExtIhvOnexIndicateResult: Dot11extihvOnexIndicateResult = null,
    public var dot11ExtIhvControl: Dot11extihvControl = null,
)

public data class Dot11extIhvParams(
    public var dot11ExtIhvProfileParams: Dot11extIhvProfileParams = Dot11extIhvProfileParams(),
    public var wstrProfileName: UShortArray = UShortArray(256),
    public var dwProfileTypeFlags: UInt = 0u,
    public var interfaceGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11extIhvParams) return false
        if (this.dot11ExtIhvProfileParams != other.dot11ExtIhvProfileParams) return false
        if (!this.wstrProfileName.contentEquals(other.wstrProfileName)) return false
        if (this.dwProfileTypeFlags != other.dwProfileTypeFlags) return false
        if (this.interfaceGuid != other.interfaceGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11ExtIhvProfileParams.hashCode()
        result = 31 * result + this.wstrProfileName.contentHashCode()
        result = 31 * result + this.dwProfileTypeFlags.hashCode()
        result = 31 * result + this.interfaceGuid.hashCode()
        return result
    }
}

public data class Dot11extIhvProfileParams(
    public var pSsidList: Dot11extIhvSsidList? = null,
    public var bssType: Dot11BssType = 0,
    public var pMSSecuritySettings: Dot11MssecuritySettings? = null,
)

public data class Dot11extIhvSecurityProfile(public var pszXmlFragmentIhvSecurity: Pwstr = null, public var bUseMSOnex: Bool = 0)

public data class Dot11extIhvSsidList(public var ulCount: UInt = 0u, public var sSIDs: List<Dot11Ssid> = List(1) { Dot11Ssid() })

public data class Dot11extIhvUiRequest(
    public var dwSessionId: UInt = 0u,
    public var guidUIRequest: Guid = Guid(),
    public var uIPageClsid: Guid = Guid(),
    public var dwByteCount: UInt = 0u,
    public var pvUIRequest: COpaquePointer? = null,
)

public data class Dot11extVirtualStationApis(
    public var dot11ExtRequestVirtualStation: Dot11extRequestVirtualStation = null,
    public var dot11ExtReleaseVirtualStation: Dot11extReleaseVirtualStation = null,
    public var dot11ExtQueryVirtualStationProperties: Dot11extQueryVirtualStationProperties = null,
    public var dot11ExtSetVirtualStationAPProperties: Dot11extSetVirtualStationApProperties = null,
)

public data class Dot11extVirtualStationApProperty(
    public var dot11SSID: Dot11Ssid = Dot11Ssid(),
    public var dot11AuthAlgo: Dot11AuthAlgorithm = 0,
    public var dot11CipherAlgo: Dot11CipherAlgorithm = 0,
    public var bIsPassPhrase: Bool = 0,
    public var dwKeyLength: UInt = 0u,
    public var ucKeyData: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11extVirtualStationApProperty) return false
        if (this.dot11SSID != other.dot11SSID) return false
        if (this.dot11AuthAlgo != other.dot11AuthAlgo) return false
        if (this.dot11CipherAlgo != other.dot11CipherAlgo) return false
        if (this.bIsPassPhrase != other.bIsPassPhrase) return false
        if (this.dwKeyLength != other.dwKeyLength) return false
        if (!this.ucKeyData.contentEquals(other.ucKeyData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11SSID.hashCode()
        result = 31 * result + this.dot11AuthAlgo.hashCode()
        result = 31 * result + this.dot11CipherAlgo.hashCode()
        result = 31 * result + this.bIsPassPhrase.hashCode()
        result = 31 * result + this.dwKeyLength.hashCode()
        result = 31 * result + this.ucKeyData.contentHashCode()
        return result
    }
}

public data class Dot11Accessnetworkoptions(
    public var accessNetworkType: UByte = 0u,
    public var internet: UByte = 0u,
    public var asra: UByte = 0u,
    public var esr: UByte = 0u,
    public var uesa: UByte = 0u,
)

public data class Dot11Adapter(
    public var gAdapterId: Guid = Guid(),
    public var pszDescription: Pwstr = null,
    public var dot11CurrentOpMode: Dot11CurrentOperationMode = Dot11CurrentOperationMode(),
)

public data class Dot11AdditionalIe(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uBeaconIEsOffset: UInt = 0u,
    public var uBeaconIEsLength: UInt = 0u,
    public var uResponseIEsOffset: UInt = 0u,
    public var uResponseIEsLength: UInt = 0u,
)

public data class Dot11AnqpQueryCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var status: Dot11AnqpQueryResult = 0,
    public var hContext: Handle = null,
    public var uResponseLength: UInt = 0u,
)

public data class Dot11ApJoinRequest(
    public var uJoinFailureTimeout: UInt = 0u,
    public var operationalRateSet: Dot11RateSet = Dot11RateSet(),
    public var uChCenterFrequency: UInt = 0u,
    public var dot11BSSDescription: Dot11BssDescription = Dot11BssDescription(),
)

public class Dot11AssociationCompletionParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var macAddr: UByteArray = UByteArray(6),
    public var uStatus: UInt = 0u,
    public var bReAssocReq: Boolean = false,
    public var bReAssocResp: Boolean = false,
    public var uAssocReqOffset: UInt = 0u,
    public var uAssocReqSize: UInt = 0u,
    public var uAssocRespOffset: UInt = 0u,
    public var uAssocRespSize: UInt = 0u,
    public var uBeaconOffset: UInt = 0u,
    public var uBeaconSize: UInt = 0u,
    public var uIHVDataOffset: UInt = 0u,
    public var uIHVDataSize: UInt = 0u,
    public var authAlgo: Dot11AuthAlgorithm = 0,
    public var unicastCipher: Dot11CipherAlgorithm = 0,
    public var multicastCipher: Dot11CipherAlgorithm = 0,
    public var uActivePhyListOffset: UInt = 0u,
    public var uActivePhyListSize: UInt = 0u,
    public var bFourAddressSupported: Boolean = false,
    public var bPortAuthorized: Boolean = false,
    public var ucActiveQoSProtocol: UByte = 0u,
    public var dSInfo: Dot11DsInfo = 0,
    public var uEncapTableOffset: UInt = 0u,
    public var uEncapTableSize: UInt = 0u,
    public var multicastMgmtCipher: Dot11CipherAlgorithm = 0,
    public var uAssocComebackTime: UInt = 0u,
)

public data class Dot11AssociationInfoEx(
    public var peerMacAddress: UByteArray = UByteArray(6),
    public var bssid: UByteArray = UByteArray(6),
    public var usCapabilityInformation: UShort = 0u,
    public var usListenInterval: UShort = 0u,
    public var ucPeerSupportedRates: UByteArray = UByteArray(255),
    public var usAssociationID: UShort = 0u,
    public var dot11AssociationState: Dot11AssociationState = 0,
    public var dot11PowerMode: Dot11PowerMode = 0,
    public var liAssociationUpTime: Long = 0L,
    public var ullNumOfTxPacketSuccesses: ULong = 0uL,
    public var ullNumOfTxPacketFailures: ULong = 0uL,
    public var ullNumOfRxPacketSuccesses: ULong = 0uL,
    public var ullNumOfRxPacketFailures: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AssociationInfoEx) return false
        if (!this.peerMacAddress.contentEquals(other.peerMacAddress)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.usListenInterval != other.usListenInterval) return false
        if (!this.ucPeerSupportedRates.contentEquals(other.ucPeerSupportedRates)) return false
        if (this.usAssociationID != other.usAssociationID) return false
        if (this.dot11AssociationState != other.dot11AssociationState) return false
        if (this.dot11PowerMode != other.dot11PowerMode) return false
        if (this.liAssociationUpTime != other.liAssociationUpTime) return false
        if (this.ullNumOfTxPacketSuccesses != other.ullNumOfTxPacketSuccesses) return false
        if (this.ullNumOfTxPacketFailures != other.ullNumOfTxPacketFailures) return false
        if (this.ullNumOfRxPacketSuccesses != other.ullNumOfRxPacketSuccesses) return false
        if (this.ullNumOfRxPacketFailures != other.ullNumOfRxPacketFailures) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMacAddress.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.usListenInterval.hashCode()
        result = 31 * result + this.ucPeerSupportedRates.contentHashCode()
        result = 31 * result + this.usAssociationID.hashCode()
        result = 31 * result + this.dot11AssociationState.hashCode()
        result = 31 * result + this.dot11PowerMode.hashCode()
        result = 31 * result + this.liAssociationUpTime.hashCode()
        result = 31 * result + this.ullNumOfTxPacketSuccesses.hashCode()
        result = 31 * result + this.ullNumOfTxPacketFailures.hashCode()
        result = 31 * result + this.ullNumOfRxPacketSuccesses.hashCode()
        result = 31 * result + this.ullNumOfRxPacketFailures.hashCode()
        return result
    }
}

public data class Dot11AssociationInfoList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11AssocInfo: List<Dot11AssociationInfoEx> = List(1) { Dot11AssociationInfoEx() },
)

public data class Dot11AssociationParams(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bssid: UByteArray = UByteArray(6),
    public var uAssocRequestIEsOffset: UInt = 0u,
    public var uAssocRequestIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AssociationParams) return false
        if (this.header != other.header) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.uAssocRequestIEsOffset != other.uAssocRequestIEsOffset) return false
        if (this.uAssocRequestIEsLength != other.uAssocRequestIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.uAssocRequestIEsOffset.hashCode()
        result = 31 * result + this.uAssocRequestIEsLength.hashCode()
        return result
    }
}

public data class Dot11AssociationStartParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var macAddr: UByteArray = UByteArray(6),
    public var ssid: Dot11Ssid = Dot11Ssid(),
    public var uIHVDataOffset: UInt = 0u,
    public var uIHVDataSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AssociationStartParameters) return false
        if (this.header != other.header) return false
        if (!this.macAddr.contentEquals(other.macAddr)) return false
        if (this.ssid != other.ssid) return false
        if (this.uIHVDataOffset != other.uIHVDataOffset) return false
        if (this.uIHVDataSize != other.uIHVDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.macAddr.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        result = 31 * result + this.uIHVDataOffset.hashCode()
        result = 31 * result + this.uIHVDataSize.hashCode()
        return result
    }
}

public data class Dot11AuthAlgorithmList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var algorithmIds: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AuthAlgorithmList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.algorithmIds.contentEquals(other.algorithmIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.algorithmIds.contentHashCode()
        return result
    }
}

public data class Dot11AuthCipherPair(public var authAlgoId: Dot11AuthAlgorithm = 0, public var cipherAlgoId: Dot11CipherAlgorithm = 0)

public data class Dot11AuthCipherPairList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var authCipherPairs: List<Dot11AuthCipherPair> = List(1) { Dot11AuthCipherPair() },
)

public data class Dot11AvailableChannelList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var uChannelNumber: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AvailableChannelList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.uChannelNumber.contentEquals(other.uChannelNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.uChannelNumber.contentHashCode()
        return result
    }
}

public data class Dot11AvailableFrequencyList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var uFrequencyValue: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AvailableFrequencyList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.uFrequencyValue.contentEquals(other.uFrequencyValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.uFrequencyValue.contentHashCode()
        return result
    }
}

public data class Dot11BssidCandidate(public var bssid: UByteArray = UByteArray(6), public var uFlags: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11BssidCandidate) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.uFlags != other.uFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bssid.contentHashCode()
        result = 31 * result + this.uFlags.hashCode()
        return result
    }
}

public data class Dot11BssidList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var bSSIDs: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11BssidList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.bSSIDs.contentEquals(other.bSSIDs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.bSSIDs.contentHashCode()
        return result
    }
}

public data class Dot11BssDescription(
    public var uReserved: UInt = 0u,
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11BSSType: Dot11BssType = 0,
    public var usBeaconPeriod: UShort = 0u,
    public var ullTimestamp: ULong = 0uL,
    public var usCapabilityInformation: UShort = 0u,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11BssDescription) return false
        if (this.uReserved != other.uReserved) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (this.usBeaconPeriod != other.usBeaconPeriod) return false
        if (this.ullTimestamp != other.ullTimestamp) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11BSSType.hashCode()
        result = 31 * result + this.usBeaconPeriod.hashCode()
        result = 31 * result + this.ullTimestamp.hashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11BssEntry(
    public var uPhyId: UInt = 0u,
    public var phySpecificInfo: Dot11BssEntryPhySpecificInfo = Dot11BssEntryPhySpecificInfo(),
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11BSSType: Dot11BssType = 0,
    public var lRSSI: Int = 0,
    public var uLinkQuality: UInt = 0u,
    public var bInRegDomain: Boolean = false,
    public var usBeaconPeriod: UShort = 0u,
    public var ullTimestamp: ULong = 0uL,
    public var ullHostTimestamp: ULong = 0uL,
    public var usCapabilityInformation: UShort = 0u,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11BssEntry) return false
        if (this.uPhyId != other.uPhyId) return false
        if (this.phySpecificInfo != other.phySpecificInfo) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (this.lRSSI != other.lRSSI) return false
        if (this.uLinkQuality != other.uLinkQuality) return false
        if (this.bInRegDomain != other.bInRegDomain) return false
        if (this.usBeaconPeriod != other.usBeaconPeriod) return false
        if (this.ullTimestamp != other.ullTimestamp) return false
        if (this.ullHostTimestamp != other.ullHostTimestamp) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uPhyId.hashCode()
        result = 31 * result + this.phySpecificInfo.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11BSSType.hashCode()
        result = 31 * result + this.lRSSI.hashCode()
        result = 31 * result + this.uLinkQuality.hashCode()
        result = 31 * result + this.bInRegDomain.hashCode()
        result = 31 * result + this.usBeaconPeriod.hashCode()
        result = 31 * result + this.ullTimestamp.hashCode()
        result = 31 * result + this.ullHostTimestamp.hashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11BssEntryPhySpecificInfo(public var uChCenterFrequency: UInt = 0u, public var fhss: Dot11BssEntryPhySpecificInfo0 = Dot11BssEntryPhySpecificInfo0())

public data class Dot11BssEntryPhySpecificInfo0(
    public var uHopPattern: UInt = 0u,
    public var uHopSet: UInt = 0u,
    public var uDwellTime: UInt = 0u,
)

public data class Dot11BssList(public var uNumOfBytes: UInt = 0u, public var pucBuffer: COpaquePointer? = null)

public data class Dot11ByteArray(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfBytes: UInt = 0u,
    public var uTotalNumOfBytes: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ByteArray) return false
        if (this.header != other.header) return false
        if (this.uNumOfBytes != other.uNumOfBytes) return false
        if (this.uTotalNumOfBytes != other.uTotalNumOfBytes) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfBytes.hashCode()
        result = 31 * result + this.uTotalNumOfBytes.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11CanSustainApParameters(public var header: NdisObjectHeader = NdisObjectHeader(), public var ulReason: UInt = 0u)

public data class Dot11ChannelHint(public var dot11PhyType: Dot11PhyType = 0, public var uChannelNumber: UInt = 0u)

public data class Dot11CipherAlgorithmList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var algorithmIds: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11CipherAlgorithmList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.algorithmIds.contentEquals(other.algorithmIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.algorithmIds.contentHashCode()
        return result
    }
}

public data class Dot11CipherDefaultKeyValue(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uKeyIndex: UInt = 0u,
    public var algorithmId: Dot11CipherAlgorithm = 0,
    public var macAddr: UByteArray = UByteArray(6),
    public var bDelete: Boolean = false,
    public var bStatic: Boolean = false,
    public var usKeyLength: UShort = 0u,
    public var ucKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11CipherDefaultKeyValue) return false
        if (this.header != other.header) return false
        if (this.uKeyIndex != other.uKeyIndex) return false
        if (this.algorithmId != other.algorithmId) return false
        if (!this.macAddr.contentEquals(other.macAddr)) return false
        if (this.bDelete != other.bDelete) return false
        if (this.bStatic != other.bStatic) return false
        if (this.usKeyLength != other.usKeyLength) return false
        if (!this.ucKey.contentEquals(other.ucKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uKeyIndex.hashCode()
        result = 31 * result + this.algorithmId.hashCode()
        result = 31 * result + this.macAddr.contentHashCode()
        result = 31 * result + this.bDelete.hashCode()
        result = 31 * result + this.bStatic.hashCode()
        result = 31 * result + this.usKeyLength.hashCode()
        result = 31 * result + this.ucKey.contentHashCode()
        return result
    }
}

public data class Dot11CipherKeyMappingKeyValue(
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var algorithmId: Dot11CipherAlgorithm = 0,
    public var direction: Dot11Direction = 0,
    public var bDelete: Boolean = false,
    public var bStatic: Boolean = false,
    public var usKeyLength: UShort = 0u,
    public var ucKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11CipherKeyMappingKeyValue) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.algorithmId != other.algorithmId) return false
        if (this.direction != other.direction) return false
        if (this.bDelete != other.bDelete) return false
        if (this.bStatic != other.bStatic) return false
        if (this.usKeyLength != other.usKeyLength) return false
        if (!this.ucKey.contentEquals(other.ucKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMacAddr.contentHashCode()
        result = 31 * result + this.algorithmId.hashCode()
        result = 31 * result + this.direction.hashCode()
        result = 31 * result + this.bDelete.hashCode()
        result = 31 * result + this.bStatic.hashCode()
        result = 31 * result + this.usKeyLength.hashCode()
        result = 31 * result + this.ucKey.contentHashCode()
        return result
    }
}

public data class Dot11ConnectionCompletionParameters(public var header: NdisObjectHeader = NdisObjectHeader(), public var uStatus: UInt = 0u)

public data class Dot11ConnectionStartParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bSSType: Dot11BssType = 0,
    public var adhocBSSID: UByteArray = UByteArray(6),
    public var adhocSSID: Dot11Ssid = Dot11Ssid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ConnectionStartParameters) return false
        if (this.header != other.header) return false
        if (this.bSSType != other.bSSType) return false
        if (!this.adhocBSSID.contentEquals(other.adhocBSSID)) return false
        if (this.adhocSSID != other.adhocSSID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.bSSType.hashCode()
        result = 31 * result + this.adhocBSSID.contentHashCode()
        result = 31 * result + this.adhocSSID.hashCode()
        return result
    }
}

public data class Dot11CountersEntry(
    public var uTransmittedFragmentCount: UInt = 0u,
    public var uMulticastTransmittedFrameCount: UInt = 0u,
    public var uFailedCount: UInt = 0u,
    public var uRetryCount: UInt = 0u,
    public var uMultipleRetryCount: UInt = 0u,
    public var uFrameDuplicateCount: UInt = 0u,
    public var uRTSSuccessCount: UInt = 0u,
    public var uRTSFailureCount: UInt = 0u,
    public var uACKFailureCount: UInt = 0u,
    public var uReceivedFragmentCount: UInt = 0u,
    public var uMulticastReceivedFrameCount: UInt = 0u,
    public var uFCSErrorCount: UInt = 0u,
    public var uTransmittedFrameCount: UInt = 0u,
)

public data class Dot11CountryOrRegionStringList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var countryOrRegionStrings: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11CountryOrRegionStringList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.countryOrRegionStrings.contentEquals(other.countryOrRegionStrings)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.countryOrRegionStrings.contentHashCode()
        return result
    }
}

public data class Dot11CurrentOffloadCapability(public var uReserved: UInt = 0u, public var uFlags: UInt = 0u)

public data class Dot11CurrentOperationMode(public var uReserved: UInt = 0u, public var uCurrentOpMode: UInt = 0u)

public data class Dot11CurrentOptionalCapability(
    public var uReserved: UInt = 0u,
    public var bDot11CFPollable: Boolean = false,
    public var bDot11PCF: Boolean = false,
    public var bDot11PCFMPDUTransferToPC: Boolean = false,
    public var bStrictlyOrderedServiceClass: Boolean = false,
)

public data class Dot11DataRateMappingEntry(
    public var ucDataRateIndex: UByte = 0u,
    public var ucDataRateFlag: UByte = 0u,
    public var usDataRateValue: UShort = 0u,
)

public data class Dot11DataRateMappingTable(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uDataRateMappingLength: UInt = 0u,
    public var dataRateMappingEntries: List<Dot11DataRateMappingEntry> = List(126) { Dot11DataRateMappingEntry() },
)

public data class Dot11DefaultWepOffload(
    public var uReserved: UInt = 0u,
    public var hOffloadContext: Handle = null,
    public var hOffload: Handle = null,
    public var dwIndex: UInt = 0u,
    public var dot11OffloadType: Dot11OffloadType = 0,
    public var dwAlgorithm: UInt = 0u,
    public var uFlags: UInt = 0u,
    public var dot11KeyDirection: Dot11KeyDirection = 0,
    public var ucMacAddress: UByteArray = UByteArray(6),
    public var uNumOfRWsOnMe: UInt = 0u,
    public var dot11IV48Counters: List<Dot11Iv48Counter> = List(16) { Dot11Iv48Counter() },
    public var usDot11RWBitMaps: UShortArray = UShortArray(16),
    public var usKeyLength: UShort = 0u,
    public var ucKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11DefaultWepOffload) return false
        if (this.uReserved != other.uReserved) return false
        if (this.hOffloadContext != other.hOffloadContext) return false
        if (this.hOffload != other.hOffload) return false
        if (this.dwIndex != other.dwIndex) return false
        if (this.dot11OffloadType != other.dot11OffloadType) return false
        if (this.dwAlgorithm != other.dwAlgorithm) return false
        if (this.uFlags != other.uFlags) return false
        if (this.dot11KeyDirection != other.dot11KeyDirection) return false
        if (!this.ucMacAddress.contentEquals(other.ucMacAddress)) return false
        if (this.uNumOfRWsOnMe != other.uNumOfRWsOnMe) return false
        if (this.dot11IV48Counters != other.dot11IV48Counters) return false
        if (!this.usDot11RWBitMaps.contentEquals(other.usDot11RWBitMaps)) return false
        if (this.usKeyLength != other.usKeyLength) return false
        if (!this.ucKey.contentEquals(other.ucKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.hOffloadContext.hashCode()
        result = 31 * result + this.hOffload.hashCode()
        result = 31 * result + this.dwIndex.hashCode()
        result = 31 * result + this.dot11OffloadType.hashCode()
        result = 31 * result + this.dwAlgorithm.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.dot11KeyDirection.hashCode()
        result = 31 * result + this.ucMacAddress.contentHashCode()
        result = 31 * result + this.uNumOfRWsOnMe.hashCode()
        result = 31 * result + this.dot11IV48Counters.hashCode()
        result = 31 * result + this.usDot11RWBitMaps.contentHashCode()
        result = 31 * result + this.usKeyLength.hashCode()
        result = 31 * result + this.ucKey.contentHashCode()
        return result
    }
}

public data class Dot11DefaultWepUpload(
    public var uReserved: UInt = 0u,
    public var dot11OffloadType: Dot11OffloadType = 0,
    public var hOffload: Handle = null,
    public var uNumOfRWsUsed: UInt = 0u,
    public var dot11IV48Counters: List<Dot11Iv48Counter> = List(16) { Dot11Iv48Counter() },
    public var usDot11RWBitMaps: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11DefaultWepUpload) return false
        if (this.uReserved != other.uReserved) return false
        if (this.dot11OffloadType != other.dot11OffloadType) return false
        if (this.hOffload != other.hOffload) return false
        if (this.uNumOfRWsUsed != other.uNumOfRWsUsed) return false
        if (this.dot11IV48Counters != other.dot11IV48Counters) return false
        if (!this.usDot11RWBitMaps.contentEquals(other.usDot11RWBitMaps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.dot11OffloadType.hashCode()
        result = 31 * result + this.hOffload.hashCode()
        result = 31 * result + this.uNumOfRWsUsed.hashCode()
        result = 31 * result + this.dot11IV48Counters.hashCode()
        result = 31 * result + this.usDot11RWBitMaps.contentHashCode()
        return result
    }
}

public data class Dot11DisassociatePeerRequest(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var usReason: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11DisassociatePeerRequest) return false
        if (this.header != other.header) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.usReason != other.usReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMacAddr.contentHashCode()
        result = 31 * result + this.usReason.hashCode()
        return result
    }
}

public data class Dot11DisassociationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var macAddr: UByteArray = UByteArray(6),
    public var uReason: UInt = 0u,
    public var uIHVDataOffset: UInt = 0u,
    public var uIHVDataSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11DisassociationParameters) return false
        if (this.header != other.header) return false
        if (!this.macAddr.contentEquals(other.macAddr)) return false
        if (this.uReason != other.uReason) return false
        if (this.uIHVDataOffset != other.uIHVDataOffset) return false
        if (this.uIHVDataSize != other.uIHVDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.macAddr.contentHashCode()
        result = 31 * result + this.uReason.hashCode()
        result = 31 * result + this.uIHVDataOffset.hashCode()
        result = 31 * result + this.uIHVDataSize.hashCode()
        return result
    }
}

public data class Dot11DiversitySelectionRx(public var uAntennaListIndex: UInt = 0u, public var bDiversitySelectionRX: Boolean = false)

public data class Dot11DiversitySelectionRxList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11DiversitySelectionRx: List<Dot11DiversitySelectionRx> = List(1) { Dot11DiversitySelectionRx() },
)

public data class Dot11EapResult(public var dwFailureReasonCode: UInt = 0u, public var pAttribArray: EapAttributes? = null)

public data class Dot11EncapEntry(public var usEtherType: UShort = 0u, public var usEncapType: UShort = 0u)

public data class Dot11ErpPhyAttributes(
    public var hRDSSSAttributes: Dot11HrdsssPhyAttributes = Dot11HrdsssPhyAttributes(),
    public var bERPPBCCOptionImplemented: Boolean = false,
    public var bDSSSOFDMOptionImplemented: Boolean = false,
    public var bShortSlotTimeOptionImplemented: Boolean = false,
)

public data class Dot11ExtapAttributes(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uScanSSIDListSize: UInt = 0u,
    public var uDesiredSSIDListSize: UInt = 0u,
    public var uPrivacyExemptionListSize: UInt = 0u,
    public var uAssociationTableSize: UInt = 0u,
    public var uDefaultKeyTableSize: UInt = 0u,
    public var uWEPKeyValueMaxLength: UInt = 0u,
    public var bStrictlyOrderedServiceClassImplemented: Boolean = false,
    public var uNumSupportedCountryOrRegionStrings: UInt = 0u,
    public var pSupportedCountryOrRegionStrings: COpaquePointer? = null,
    public var uInfraNumSupportedUcastAlgoPairs: UInt = 0u,
    public var pInfraSupportedUcastAlgoPairs: Dot11AuthCipherPair? = null,
    public var uInfraNumSupportedMcastAlgoPairs: UInt = 0u,
    public var pInfraSupportedMcastAlgoPairs: Dot11AuthCipherPair? = null,
)

public class Dot11ExtstaAttributes(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uScanSSIDListSize: UInt = 0u,
    public var uDesiredBSSIDListSize: UInt = 0u,
    public var uDesiredSSIDListSize: UInt = 0u,
    public var uExcludedMacAddressListSize: UInt = 0u,
    public var uPrivacyExemptionListSize: UInt = 0u,
    public var uKeyMappingTableSize: UInt = 0u,
    public var uDefaultKeyTableSize: UInt = 0u,
    public var uWEPKeyValueMaxLength: UInt = 0u,
    public var uPMKIDCacheSize: UInt = 0u,
    public var uMaxNumPerSTADefaultKeyTables: UInt = 0u,
    public var bStrictlyOrderedServiceClassImplemented: Boolean = false,
    public var ucSupportedQoSProtocolFlags: UByte = 0u,
    public var bSafeModeImplemented: Boolean = false,
    public var uNumSupportedCountryOrRegionStrings: UInt = 0u,
    public var pSupportedCountryOrRegionStrings: COpaquePointer? = null,
    public var uInfraNumSupportedUcastAlgoPairs: UInt = 0u,
    public var pInfraSupportedUcastAlgoPairs: Dot11AuthCipherPair? = null,
    public var uInfraNumSupportedMcastAlgoPairs: UInt = 0u,
    public var pInfraSupportedMcastAlgoPairs: Dot11AuthCipherPair? = null,
    public var uAdhocNumSupportedUcastAlgoPairs: UInt = 0u,
    public var pAdhocSupportedUcastAlgoPairs: Dot11AuthCipherPair? = null,
    public var uAdhocNumSupportedMcastAlgoPairs: UInt = 0u,
    public var pAdhocSupportedMcastAlgoPairs: Dot11AuthCipherPair? = null,
    public var bAutoPowerSaveMode: Boolean = false,
    public var uMaxNetworkOffloadListSize: UInt = 0u,
    public var bMFPCapable: Boolean = false,
    public var uInfraNumSupportedMcastMgmtAlgoPairs: UInt = 0u,
    public var pInfraSupportedMcastMgmtAlgoPairs: Dot11AuthCipherPair? = null,
    public var bNeighborReportSupported: Boolean = false,
    public var bAPChannelReportSupported: Boolean = false,
    public var bActionFramesSupported: Boolean = false,
    public var bANQPQueryOffloadSupported: Boolean = false,
    public var bHESSIDConnectionSupported: Boolean = false,
)

public data class Dot11ExtstaCapability(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uScanSSIDListSize: UInt = 0u,
    public var uDesiredBSSIDListSize: UInt = 0u,
    public var uDesiredSSIDListSize: UInt = 0u,
    public var uExcludedMacAddressListSize: UInt = 0u,
    public var uPrivacyExemptionListSize: UInt = 0u,
    public var uKeyMappingTableSize: UInt = 0u,
    public var uDefaultKeyTableSize: UInt = 0u,
    public var uWEPKeyValueMaxLength: UInt = 0u,
    public var uPMKIDCacheSize: UInt = 0u,
    public var uMaxNumPerSTADefaultKeyTables: UInt = 0u,
)

public data class Dot11ExtstaRecvContext(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uReceiveFlags: UInt = 0u,
    public var uPhyId: UInt = 0u,
    public var uChCenterFrequency: UInt = 0u,
    public var usNumberOfMPDUsReceived: UShort = 0u,
    public var lRSSI: Int = 0,
    public var ucDataRate: UByte = 0u,
    public var uSizeMediaSpecificInfo: UInt = 0u,
    public var pvMediaSpecificInfo: COpaquePointer? = null,
    public var ullTimestamp: ULong = 0uL,
)

public data class Dot11ExtstaSendContext(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var usExemptionActionType: UShort = 0u,
    public var uPhyId: UInt = 0u,
    public var uDelayedSleepValue: UInt = 0u,
    public var pvMediaSpecificInfo: COpaquePointer? = null,
    public var uSendFlags: UInt = 0u,
)

public data class Dot11FragmentDescriptor(public var uOffset: UInt = 0u, public var uLength: UInt = 0u)

public data class Dot11GoNegotiationConfirmationSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11GoNegotiationConfirmationSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11GoNegotiationRequestSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11GoNegotiationRequestSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11GoNegotiationResponseSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11GoNegotiationResponseSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11HoppingPatternEntry(public var uHoppingPatternIndex: UInt = 0u, public var uRandomTableFieldNumber: UInt = 0u)

public data class Dot11HoppingPatternEntryList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11HoppingPatternEntry: List<Dot11HoppingPatternEntry> = List(1) { Dot11HoppingPatternEntry() },
)

public data class Dot11HrdsssPhyAttributes(
    public var bShortPreambleOptionImplemented: Boolean = false,
    public var bPBCCOptionImplemented: Boolean = false,
    public var bChannelAgilityPresent: Boolean = false,
    public var uHRCCAModeSupported: UInt = 0u,
)

public data class Dot11IbssParams(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bJoinOnly: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
)

public data class Dot11IhvVersionInfo(public var dwVerMin: UInt = 0u, public var dwVerMax: UInt = 0u)

public class Dot11IncomingAssocCompletionParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var uStatus: UInt = 0u,
    public var ucErrorSource: UByte = 0u,
    public var bReAssocReq: Boolean = false,
    public var bReAssocResp: Boolean = false,
    public var uAssocReqOffset: UInt = 0u,
    public var uAssocReqSize: UInt = 0u,
    public var uAssocRespOffset: UInt = 0u,
    public var uAssocRespSize: UInt = 0u,
    public var authAlgo: Dot11AuthAlgorithm = 0,
    public var unicastCipher: Dot11CipherAlgorithm = 0,
    public var multicastCipher: Dot11CipherAlgorithm = 0,
    public var uActivePhyListOffset: UInt = 0u,
    public var uActivePhyListSize: UInt = 0u,
    public var uBeaconOffset: UInt = 0u,
    public var uBeaconSize: UInt = 0u,
)

public data class Dot11IncomingAssocDecision(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var bAccept: Boolean = false,
    public var usReasonCode: UShort = 0u,
    public var uAssocResponseIEsOffset: UInt = 0u,
    public var uAssocResponseIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11IncomingAssocDecision) return false
        if (this.header != other.header) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.bAccept != other.bAccept) return false
        if (this.usReasonCode != other.usReasonCode) return false
        if (this.uAssocResponseIEsOffset != other.uAssocResponseIEsOffset) return false
        if (this.uAssocResponseIEsLength != other.uAssocResponseIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMacAddr.contentHashCode()
        result = 31 * result + this.bAccept.hashCode()
        result = 31 * result + this.usReasonCode.hashCode()
        result = 31 * result + this.uAssocResponseIEsOffset.hashCode()
        result = 31 * result + this.uAssocResponseIEsLength.hashCode()
        return result
    }
}

public data class Dot11IncomingAssocDecisionV2(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var bAccept: Boolean = false,
    public var usReasonCode: UShort = 0u,
    public var uAssocResponseIEsOffset: UInt = 0u,
    public var uAssocResponseIEsLength: UInt = 0u,
    public var wFDStatus: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11IncomingAssocDecisionV2) return false
        if (this.header != other.header) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.bAccept != other.bAccept) return false
        if (this.usReasonCode != other.usReasonCode) return false
        if (this.uAssocResponseIEsOffset != other.uAssocResponseIEsOffset) return false
        if (this.uAssocResponseIEsLength != other.uAssocResponseIEsLength) return false
        if (this.wFDStatus != other.wFDStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMacAddr.contentHashCode()
        result = 31 * result + this.bAccept.hashCode()
        result = 31 * result + this.usReasonCode.hashCode()
        result = 31 * result + this.uAssocResponseIEsOffset.hashCode()
        result = 31 * result + this.uAssocResponseIEsLength.hashCode()
        result = 31 * result + this.wFDStatus.hashCode()
        return result
    }
}

public data class Dot11IncomingAssocRequestReceivedParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var bReAssocReq: Boolean = false,
    public var uAssocReqOffset: UInt = 0u,
    public var uAssocReqSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11IncomingAssocRequestReceivedParameters) return false
        if (this.header != other.header) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.bReAssocReq != other.bReAssocReq) return false
        if (this.uAssocReqOffset != other.uAssocReqOffset) return false
        if (this.uAssocReqSize != other.uAssocReqSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMacAddr.contentHashCode()
        result = 31 * result + this.bReAssocReq.hashCode()
        result = 31 * result + this.uAssocReqOffset.hashCode()
        result = 31 * result + this.uAssocReqSize.hashCode()
        return result
    }
}

public data class Dot11IncomingAssocStartedParameters(public var header: NdisObjectHeader = NdisObjectHeader(), public var peerMacAddr: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11IncomingAssocStartedParameters) return false
        if (this.header != other.header) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMacAddr.contentHashCode()
        return result
    }
}

public data class Dot11InvitationRequestSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var receiverAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11InvitationRequestSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (!this.receiverAddress.contentEquals(other.receiverAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.receiverAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11InvitationResponseSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var receiverDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11InvitationResponseSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.receiverDeviceAddress.contentEquals(other.receiverDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.receiverDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11Iv48Counter(public var uIV32Counter: UInt = 0u, public var usIV16Counter: UShort = 0u)

public data class Dot11JoinRequest(
    public var uJoinFailureTimeout: UInt = 0u,
    public var operationalRateSet: Dot11RateSet = Dot11RateSet(),
    public var uChCenterFrequency: UInt = 0u,
    public var dot11BSSDescription: Dot11BssDescription = Dot11BssDescription(),
)

public data class Dot11KeyAlgoBip(
    public var ucIPN: UByteArray = UByteArray(6),
    public var ulBIPKeyLength: UInt = 0u,
    public var ucBIPKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoBip) return false
        if (!this.ucIPN.contentEquals(other.ucIPN)) return false
        if (this.ulBIPKeyLength != other.ulBIPKeyLength) return false
        if (!this.ucBIPKey.contentEquals(other.ucBIPKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIPN.contentHashCode()
        result = 31 * result + this.ulBIPKeyLength.hashCode()
        result = 31 * result + this.ucBIPKey.contentHashCode()
        return result
    }
}

public data class Dot11KeyAlgoBipGmac256(
    public var ucIPN: UByteArray = UByteArray(6),
    public var ulBIPGmac256KeyLength: UInt = 0u,
    public var ucBIPGmac256Key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoBipGmac256) return false
        if (!this.ucIPN.contentEquals(other.ucIPN)) return false
        if (this.ulBIPGmac256KeyLength != other.ulBIPGmac256KeyLength) return false
        if (!this.ucBIPGmac256Key.contentEquals(other.ucBIPGmac256Key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIPN.contentHashCode()
        result = 31 * result + this.ulBIPGmac256KeyLength.hashCode()
        result = 31 * result + this.ucBIPGmac256Key.contentHashCode()
        return result
    }
}

public data class Dot11KeyAlgoCcmp(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulCCMPKeyLength: UInt = 0u,
    public var ucCCMPKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoCcmp) return false
        if (!this.ucIV48Counter.contentEquals(other.ucIV48Counter)) return false
        if (this.ulCCMPKeyLength != other.ulCCMPKeyLength) return false
        if (!this.ucCCMPKey.contentEquals(other.ucCCMPKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIV48Counter.contentHashCode()
        result = 31 * result + this.ulCCMPKeyLength.hashCode()
        result = 31 * result + this.ucCCMPKey.contentHashCode()
        return result
    }
}

public data class Dot11KeyAlgoGcmp(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulGCMPKeyLength: UInt = 0u,
    public var ucGCMPKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoGcmp) return false
        if (!this.ucIV48Counter.contentEquals(other.ucIV48Counter)) return false
        if (this.ulGCMPKeyLength != other.ulGCMPKeyLength) return false
        if (!this.ucGCMPKey.contentEquals(other.ucGCMPKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIV48Counter.contentHashCode()
        result = 31 * result + this.ulGCMPKeyLength.hashCode()
        result = 31 * result + this.ucGCMPKey.contentHashCode()
        return result
    }
}

public data class Dot11KeyAlgoGcmp256(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulGCMP256KeyLength: UInt = 0u,
    public var ucGCMP256Key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoGcmp256) return false
        if (!this.ucIV48Counter.contentEquals(other.ucIV48Counter)) return false
        if (this.ulGCMP256KeyLength != other.ulGCMP256KeyLength) return false
        if (!this.ucGCMP256Key.contentEquals(other.ucGCMP256Key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIV48Counter.contentHashCode()
        result = 31 * result + this.ulGCMP256KeyLength.hashCode()
        result = 31 * result + this.ucGCMP256Key.contentHashCode()
        return result
    }
}

public data class Dot11KeyAlgoTkipMic(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulTKIPKeyLength: UInt = 0u,
    public var ulMICKeyLength: UInt = 0u,
    public var ucTKIPMICKeys: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoTkipMic) return false
        if (!this.ucIV48Counter.contentEquals(other.ucIV48Counter)) return false
        if (this.ulTKIPKeyLength != other.ulTKIPKeyLength) return false
        if (this.ulMICKeyLength != other.ulMICKeyLength) return false
        if (!this.ucTKIPMICKeys.contentEquals(other.ucTKIPMICKeys)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIV48Counter.contentHashCode()
        result = 31 * result + this.ulTKIPKeyLength.hashCode()
        result = 31 * result + this.ulMICKeyLength.hashCode()
        result = 31 * result + this.ucTKIPMICKeys.contentHashCode()
        return result
    }
}

public data class Dot11LinkQualityEntry(public var peerMacAddr: UByteArray = UByteArray(6), public var ucLinkQuality: UByte = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11LinkQualityEntry) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.ucLinkQuality != other.ucLinkQuality) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMacAddr.contentHashCode()
        result = 31 * result + this.ucLinkQuality.hashCode()
        return result
    }
}

public data class Dot11LinkQualityParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uLinkQualityListSize: UInt = 0u,
    public var uLinkQualityListOffset: UInt = 0u,
)

public data class Dot11MacAddressList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var macAddrs: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11MacAddressList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.macAddrs.contentEquals(other.macAddrs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.macAddrs.contentHashCode()
        return result
    }
}

public data class Dot11MacFrameStatistics(
    public var ullTransmittedFrameCount: ULong = 0uL,
    public var ullReceivedFrameCount: ULong = 0uL,
    public var ullTransmittedFailureFrameCount: ULong = 0uL,
    public var ullReceivedFailureFrameCount: ULong = 0uL,
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

public data class Dot11MacInfo(
    public var uReserved: UInt = 0u,
    public var uNdisPortNumber: UInt = 0u,
    public var macAddr: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11MacInfo) return false
        if (this.uReserved != other.uReserved) return false
        if (this.uNdisPortNumber != other.uNdisPortNumber) return false
        if (!this.macAddr.contentEquals(other.macAddr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.uNdisPortNumber.hashCode()
        result = 31 * result + this.macAddr.contentHashCode()
        return result
    }
}

public data class Dot11MacParameters(public var header: NdisObjectHeader = NdisObjectHeader(), public var uOpmodeMask: UInt = 0u)

public data class Dot11ManufacturingCallbackParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var dot11ManufacturingCallbackType: Dot11ManufacturingCallbackType = 0,
    public var uStatus: UInt = 0u,
    public var pvContext: COpaquePointer? = null,
)

public data class Dot11ManufacturingFunctionalTestQueryAdc(
    public var dot11Band: Dot11Band = 0,
    public var uChannel: UInt = 0u,
    public var aDCPowerLevel: Int = 0,
)

public data class Dot11ManufacturingFunctionalTestRx(
    public var bEnabled: Boolean = false,
    public var dot11Band: Dot11Band = 0,
    public var uChannel: UInt = 0u,
    public var powerLevel: Int = 0,
)

public data class Dot11ManufacturingFunctionalTestTx(
    public var bEnable: Boolean = false,
    public var bOpenLoop: Boolean = false,
    public var dot11Band: Dot11Band = 0,
    public var uChannel: UInt = 0u,
    public var uSetPowerLevel: UInt = 0u,
    public var aDCPowerLevel: Int = 0,
)

public data class Dot11ManufacturingSelfTestQueryResults(
    public var selfTestType: Dot11ManufacturingSelfTestType = 0,
    public var uTestID: UInt = 0u,
    public var bResult: Boolean = false,
    public var uPinFailedBitMask: UInt = 0u,
    public var pvContext: COpaquePointer? = null,
    public var uBytesWrittenOut: UInt = 0u,
    public var ucBufferOut: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingSelfTestQueryResults) return false
        if (this.selfTestType != other.selfTestType) return false
        if (this.uTestID != other.uTestID) return false
        if (this.bResult != other.bResult) return false
        if (this.uPinFailedBitMask != other.uPinFailedBitMask) return false
        if (this.pvContext != other.pvContext) return false
        if (this.uBytesWrittenOut != other.uBytesWrittenOut) return false
        if (!this.ucBufferOut.contentEquals(other.ucBufferOut)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.selfTestType.hashCode()
        result = 31 * result + this.uTestID.hashCode()
        result = 31 * result + this.bResult.hashCode()
        result = 31 * result + this.uPinFailedBitMask.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        result = 31 * result + this.uBytesWrittenOut.hashCode()
        result = 31 * result + this.ucBufferOut.contentHashCode()
        return result
    }
}

public data class Dot11ManufacturingSelfTestSetParams(
    public var selfTestType: Dot11ManufacturingSelfTestType = 0,
    public var uTestID: UInt = 0u,
    public var uPinBitMask: UInt = 0u,
    public var pvContext: COpaquePointer? = null,
    public var uBufferLength: UInt = 0u,
    public var ucBufferIn: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingSelfTestSetParams) return false
        if (this.selfTestType != other.selfTestType) return false
        if (this.uTestID != other.uTestID) return false
        if (this.uPinBitMask != other.uPinBitMask) return false
        if (this.pvContext != other.pvContext) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBufferIn.contentEquals(other.ucBufferIn)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.selfTestType.hashCode()
        result = 31 * result + this.uTestID.hashCode()
        result = 31 * result + this.uPinBitMask.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBufferIn.contentHashCode()
        return result
    }
}

public data class Dot11ManufacturingTest(
    public var dot11ManufacturingTestType: Dot11ManufacturingTestType = 0,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingTest) return false
        if (this.dot11ManufacturingTestType != other.dot11ManufacturingTestType) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11ManufacturingTestType.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11ManufacturingTestQueryData(
    public var uKey: UInt = 0u,
    public var uOffset: UInt = 0u,
    public var uBufferLength: UInt = 0u,
    public var uBytesRead: UInt = 0u,
    public var ucBufferOut: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingTestQueryData) return false
        if (this.uKey != other.uKey) return false
        if (this.uOffset != other.uOffset) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (this.uBytesRead != other.uBytesRead) return false
        if (!this.ucBufferOut.contentEquals(other.ucBufferOut)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uKey.hashCode()
        result = 31 * result + this.uOffset.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.uBytesRead.hashCode()
        result = 31 * result + this.ucBufferOut.contentHashCode()
        return result
    }
}

public data class Dot11ManufacturingTestSetData(
    public var uKey: UInt = 0u,
    public var uOffset: UInt = 0u,
    public var uBufferLength: UInt = 0u,
    public var ucBufferIn: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingTestSetData) return false
        if (this.uKey != other.uKey) return false
        if (this.uOffset != other.uOffset) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBufferIn.contentEquals(other.ucBufferIn)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uKey.hashCode()
        result = 31 * result + this.uOffset.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBufferIn.contentHashCode()
        return result
    }
}

public data class Dot11ManufacturingTestSleep(public var uSleepTime: UInt = 0u, public var pvContext: COpaquePointer? = null)

public data class Dot11MdCapabilityEntryList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11MDCapabilityEntry: List<Dot11MultiDomainCapabilityEntry> = List(1) { Dot11MultiDomainCapabilityEntry() },
)

public data class Dot11MpduMaxLengthIndication(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uPhyId: UInt = 0u,
    public var uMPDUMaxLength: UInt = 0u,
)

public data class Dot11MsonexResultParams(
    public var dot11OnexAuthStatus: OnexAuthStatus = 0,
    public var dot11OneXReasonCode: OnexReasonCode = 0,
    public var pbMPPESendKey: COpaquePointer? = null,
    public var dwMPPESendKeyLen: UInt = 0u,
    public var pbMPPERecvKey: COpaquePointer? = null,
    public var dwMPPERecvKeyLen: UInt = 0u,
    public var pDot11EapResult: Dot11EapResult? = null,
)

public data class Dot11MssecuritySettings(
    public var dot11AuthAlgorithm: Dot11AuthAlgorithm = 0,
    public var dot11CipherAlgorithm: Dot11CipherAlgorithm = 0,
    public var fOneXEnabled: Bool = 0,
    public var eapMethodType: EapMethodType = EapMethodType(),
    public var dwEapConnectionDataLen: UInt = 0u,
    public var pEapConnectionData: COpaquePointer? = null,
)

public data class Dot11MultiDomainCapabilityEntry(
    public var uMultiDomainCapabilityIndex: UInt = 0u,
    public var uFirstChannelNumber: UInt = 0u,
    public var uNumberOfChannels: UInt = 0u,
    public var lMaximumTransmitPowerLevel: Int = 0,
)

public data class Dot11Network(public var dot11Ssid: Dot11Ssid = Dot11Ssid(), public var dot11BssType: Dot11BssType = 0)

public data class Dot11NetworkList(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var network: List<Dot11Network> = List(1) { Dot11Network() },
)

public data class Dot11NicSpecificExtension(
    public var uBufferLength: UInt = 0u,
    public var uTotalBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11NicSpecificExtension) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (this.uTotalBufferLength != other.uTotalBufferLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uBufferLength.hashCode()
        result = 31 * result + this.uTotalBufferLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11OfdmPhyAttributes(public var uFrequencyBandsSupported: UInt = 0u)

public data class Dot11OffloadCapability(
    public var uReserved: UInt = 0u,
    public var uFlags: UInt = 0u,
    public var uSupportedWEPAlgorithms: UInt = 0u,
    public var uNumOfReplayWindows: UInt = 0u,
    public var uMaxWEPKeyMappingLength: UInt = 0u,
    public var uSupportedAuthAlgorithms: UInt = 0u,
    public var uMaxAuthKeyMappingLength: UInt = 0u,
)

public data class Dot11OffloadNetwork(
    public var ssid: Dot11Ssid = Dot11Ssid(),
    public var unicastCipher: Dot11CipherAlgorithm = 0,
    public var authAlgo: Dot11AuthAlgorithm = 0,
    public var dot11ChannelHints: List<Dot11ChannelHint> = List(4) { Dot11ChannelHint() },
)

public data class Dot11OffloadNetworkListInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ulFlags: UInt = 0u,
    public var fastScanPeriod: UInt = 0u,
    public var fastScanIterations: UInt = 0u,
    public var slowScanPeriod: UInt = 0u,
    public var uNumOfEntries: UInt = 0u,
    public var offloadNetworkList: List<Dot11OffloadNetwork> = List(1) { Dot11OffloadNetwork() },
)

public data class Dot11OffloadNetworkStatusParameters(public var header: NdisObjectHeader = NdisObjectHeader(), public var status: Int = 0)

public data class Dot11Oi(public var oILength: UShort = 0u, public var oi: UByteArray = UByteArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11Oi) return false
        if (this.oILength != other.oILength) return false
        if (!this.oi.contentEquals(other.oi)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oILength.hashCode()
        result = 31 * result + this.oi.contentHashCode()
        return result
    }
}

public data class Dot11OperationModeCapability(
    public var uReserved: UInt = 0u,
    public var uMajorVersion: UInt = 0u,
    public var uMinorVersion: UInt = 0u,
    public var uNumOfTXBuffers: UInt = 0u,
    public var uNumOfRXBuffers: UInt = 0u,
    public var uOpModeCapability: UInt = 0u,
)

public data class Dot11OptionalCapability(
    public var uReserved: UInt = 0u,
    public var bDot11PCF: Boolean = false,
    public var bDot11PCFMPDUTransferToPC: Boolean = false,
    public var bStrictlyOrderedServiceClass: Boolean = false,
)

public data class Dot11PeerInfo(
    public var macAddress: UByteArray = UByteArray(6),
    public var usCapabilityInformation: UShort = 0u,
    public var authAlgo: Dot11AuthAlgorithm = 0,
    public var unicastCipherAlgo: Dot11CipherAlgorithm = 0,
    public var multicastCipherAlgo: Dot11CipherAlgorithm = 0,
    public var bWpsEnabled: Boolean = false,
    public var usListenInterval: UShort = 0u,
    public var ucSupportedRates: UByteArray = UByteArray(255),
    public var usAssociationID: UShort = 0u,
    public var associationState: Dot11AssociationState = 0,
    public var powerMode: Dot11PowerMode = 0,
    public var liAssociationUpTime: Long = 0L,
    public var statistics: Dot11PeerStatistics = Dot11PeerStatistics(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PeerInfo) return false
        if (!this.macAddress.contentEquals(other.macAddress)) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.authAlgo != other.authAlgo) return false
        if (this.unicastCipherAlgo != other.unicastCipherAlgo) return false
        if (this.multicastCipherAlgo != other.multicastCipherAlgo) return false
        if (this.bWpsEnabled != other.bWpsEnabled) return false
        if (this.usListenInterval != other.usListenInterval) return false
        if (!this.ucSupportedRates.contentEquals(other.ucSupportedRates)) return false
        if (this.usAssociationID != other.usAssociationID) return false
        if (this.associationState != other.associationState) return false
        if (this.powerMode != other.powerMode) return false
        if (this.liAssociationUpTime != other.liAssociationUpTime) return false
        if (this.statistics != other.statistics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.macAddress.contentHashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.authAlgo.hashCode()
        result = 31 * result + this.unicastCipherAlgo.hashCode()
        result = 31 * result + this.multicastCipherAlgo.hashCode()
        result = 31 * result + this.bWpsEnabled.hashCode()
        result = 31 * result + this.usListenInterval.hashCode()
        result = 31 * result + this.ucSupportedRates.contentHashCode()
        result = 31 * result + this.usAssociationID.hashCode()
        result = 31 * result + this.associationState.hashCode()
        result = 31 * result + this.powerMode.hashCode()
        result = 31 * result + this.liAssociationUpTime.hashCode()
        result = 31 * result + this.statistics.hashCode()
        return result
    }
}

public data class Dot11PeerInfoList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var peerInfo: List<Dot11PeerInfo> = List(1) { Dot11PeerInfo() },
)

public data class Dot11PeerStatistics(
    public var ullDecryptSuccessCount: ULong = 0uL,
    public var ullDecryptFailureCount: ULong = 0uL,
    public var ullTxPacketSuccessCount: ULong = 0uL,
    public var ullTxPacketFailureCount: ULong = 0uL,
    public var ullRxPacketSuccessCount: ULong = 0uL,
    public var ullRxPacketFailureCount: ULong = 0uL,
)

public data class Dot11PerMsduCounters(
    public var uTransmittedFragmentCount: UInt = 0u,
    public var uRetryCount: UInt = 0u,
    public var uRTSSuccessCount: UInt = 0u,
    public var uRTSFailureCount: UInt = 0u,
    public var uACKFailureCount: UInt = 0u,
)

public data class Dot11PhyAttributes(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var phyType: Dot11PhyType = 0,
    public var bHardwarePhyState: Boolean = false,
    public var bSoftwarePhyState: Boolean = false,
    public var bCFPollable: Boolean = false,
    public var uMPDUMaxLength: UInt = 0u,
    public var tempType: Dot11TempType = 0,
    public var diversitySupport: Dot11DiversitySupport = 0,
    public var phySpecificAttributes: Dot11PhyAttributes0 = Dot11PhyAttributes0(),
    public var uNumberSupportedPowerLevels: UInt = 0u,
    public var txPowerLevels: UIntArray = UIntArray(8),
    public var uNumDataRateMappingEntries: UInt = 0u,
    public var dataRateMappingEntries: List<Dot11DataRateMappingEntry> = List(126) { Dot11DataRateMappingEntry() },
    public var supportedDataRatesValue: Dot11SupportedDataRatesValueV2 = Dot11SupportedDataRatesValueV2(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PhyAttributes) return false
        if (this.header != other.header) return false
        if (this.phyType != other.phyType) return false
        if (this.bHardwarePhyState != other.bHardwarePhyState) return false
        if (this.bSoftwarePhyState != other.bSoftwarePhyState) return false
        if (this.bCFPollable != other.bCFPollable) return false
        if (this.uMPDUMaxLength != other.uMPDUMaxLength) return false
        if (this.tempType != other.tempType) return false
        if (this.diversitySupport != other.diversitySupport) return false
        if (this.phySpecificAttributes != other.phySpecificAttributes) return false
        if (this.uNumberSupportedPowerLevels != other.uNumberSupportedPowerLevels) return false
        if (!this.txPowerLevels.contentEquals(other.txPowerLevels)) return false
        if (this.uNumDataRateMappingEntries != other.uNumDataRateMappingEntries) return false
        if (this.dataRateMappingEntries != other.dataRateMappingEntries) return false
        if (this.supportedDataRatesValue != other.supportedDataRatesValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.phyType.hashCode()
        result = 31 * result + this.bHardwarePhyState.hashCode()
        result = 31 * result + this.bSoftwarePhyState.hashCode()
        result = 31 * result + this.bCFPollable.hashCode()
        result = 31 * result + this.uMPDUMaxLength.hashCode()
        result = 31 * result + this.tempType.hashCode()
        result = 31 * result + this.diversitySupport.hashCode()
        result = 31 * result + this.phySpecificAttributes.hashCode()
        result = 31 * result + this.uNumberSupportedPowerLevels.hashCode()
        result = 31 * result + this.txPowerLevels.contentHashCode()
        result = 31 * result + this.uNumDataRateMappingEntries.hashCode()
        result = 31 * result + this.dataRateMappingEntries.hashCode()
        result = 31 * result + this.supportedDataRatesValue.hashCode()
        return result
    }
}

public data class Dot11PhyAttributes0(
    public var hRDSSSAttributes: Dot11HrdsssPhyAttributes = Dot11HrdsssPhyAttributes(),
    public var oFDMAttributes: Dot11OfdmPhyAttributes = Dot11OfdmPhyAttributes(),
    public var eRPAttributes: Dot11ErpPhyAttributes = Dot11ErpPhyAttributes(),
)

public class Dot11PhyFrameStatistics(
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

public data class Dot11PhyFrequencyAdoptedParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ulPhyId: UInt = 0u,
    public var anonymous: Dot11PhyFrequencyAdoptedParameters0 = Dot11PhyFrequencyAdoptedParameters0(),
)

public data class Dot11PhyFrequencyAdoptedParameters0(public var ulChannel: UInt = 0u, public var ulFrequency: UInt = 0u)

public data class Dot11PhyIdList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11PhyId: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PhyIdList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.dot11PhyId.contentEquals(other.dot11PhyId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.dot11PhyId.contentHashCode()
        return result
    }
}

public data class Dot11PhyStateParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uPhyId: UInt = 0u,
    public var bHardwarePhyState: Boolean = false,
    public var bSoftwarePhyState: Boolean = false,
)

public data class Dot11PhyTypeInfo(
    public var dot11PhyType: Dot11PhyType = 0,
    public var bUseParameters: Boolean = false,
    public var uProbeDelay: UInt = 0u,
    public var uMinChannelTime: UInt = 0u,
    public var uMaxChannelTime: UInt = 0u,
    public var chDescriptionType: ChDescriptionType = 0,
    public var uChannelListSize: UInt = 0u,
    public var ucChannelListBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PhyTypeInfo) return false
        if (this.dot11PhyType != other.dot11PhyType) return false
        if (this.bUseParameters != other.bUseParameters) return false
        if (this.uProbeDelay != other.uProbeDelay) return false
        if (this.uMinChannelTime != other.uMinChannelTime) return false
        if (this.uMaxChannelTime != other.uMaxChannelTime) return false
        if (this.chDescriptionType != other.chDescriptionType) return false
        if (this.uChannelListSize != other.uChannelListSize) return false
        if (!this.ucChannelListBuffer.contentEquals(other.ucChannelListBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11PhyType.hashCode()
        result = 31 * result + this.bUseParameters.hashCode()
        result = 31 * result + this.uProbeDelay.hashCode()
        result = 31 * result + this.uMinChannelTime.hashCode()
        result = 31 * result + this.uMaxChannelTime.hashCode()
        result = 31 * result + this.chDescriptionType.hashCode()
        result = 31 * result + this.uChannelListSize.hashCode()
        result = 31 * result + this.ucChannelListBuffer.contentHashCode()
        return result
    }
}

public data class Dot11PhyTypeList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11PhyType: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PhyTypeList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.dot11PhyType.contentEquals(other.dot11PhyType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.dot11PhyType.contentHashCode()
        return result
    }
}

public data class Dot11PmkidCandidateListParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uCandidateListSize: UInt = 0u,
    public var uCandidateListOffset: UInt = 0u,
)

public data class Dot11PmkidEntry(
    public var bssid: UByteArray = UByteArray(6),
    public var pmkid: UByteArray = UByteArray(16),
    public var uFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PmkidEntry) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (!this.pmkid.contentEquals(other.pmkid)) return false
        if (this.uFlags != other.uFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bssid.contentHashCode()
        result = 31 * result + this.pmkid.contentHashCode()
        result = 31 * result + this.uFlags.hashCode()
        return result
    }
}

public data class Dot11PmkidList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var pMKIDs: List<Dot11PmkidEntry> = List(1) { Dot11PmkidEntry() },
)

public data class Dot11PortState(
    public var peerMacAddress: UByteArray = UByteArray(6),
    public var uSessionId: UInt = 0u,
    public var bPortControlled: Bool = 0,
    public var bPortAuthorized: Bool = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PortState) return false
        if (!this.peerMacAddress.contentEquals(other.peerMacAddress)) return false
        if (this.uSessionId != other.uSessionId) return false
        if (this.bPortControlled != other.bPortControlled) return false
        if (this.bPortAuthorized != other.bPortAuthorized) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMacAddress.contentHashCode()
        result = 31 * result + this.uSessionId.hashCode()
        result = 31 * result + this.bPortControlled.hashCode()
        result = 31 * result + this.bPortAuthorized.hashCode()
        return result
    }
}

public data class Dot11PortStateNotification(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMac: UByteArray = UByteArray(6),
    public var bOpen: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PortStateNotification) return false
        if (this.header != other.header) return false
        if (!this.peerMac.contentEquals(other.peerMac)) return false
        if (this.bOpen != other.bOpen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMac.contentHashCode()
        result = 31 * result + this.bOpen.hashCode()
        return result
    }
}

public data class Dot11PowerMgmtAutoModeEnabledInfo(public var header: NdisObjectHeader = NdisObjectHeader(), public var bEnabled: Boolean = false)

public data class Dot11PowerMgmtMode(
    public var dot11PowerMode: Dot11PowerMode = 0,
    public var uPowerSaveLevel: UInt = 0u,
    public var usListenInterval: UShort = 0u,
    public var usAID: UShort = 0u,
    public var bReceiveDTIMs: Boolean = false,
)

public data class Dot11PowerMgmtModeStatusInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var powerSaveMode: Dot11PowerMode = 0,
    public var uPowerSaveLevel: UInt = 0u,
    public var reason: Dot11PowerModeReason = 0,
)

public data class Dot11PrivacyExemption(
    public var usEtherType: UShort = 0u,
    public var usExemptionActionType: UShort = 0u,
    public var usExemptionPacketType: UShort = 0u,
)

public data class Dot11PrivacyExemptionList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var privacyExemptionEntries: List<Dot11PrivacyExemption> = List(1) { Dot11PrivacyExemption() },
)

public data class Dot11ProvisionDiscoveryRequestSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var receiverAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ProvisionDiscoveryRequestSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (!this.receiverAddress.contentEquals(other.receiverAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.receiverAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11ProvisionDiscoveryResponseSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var receiverDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ProvisionDiscoveryResponseSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.receiverDeviceAddress.contentEquals(other.receiverDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.receiverDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11QosParams(public var header: NdisObjectHeader = NdisObjectHeader(), public var ucEnabledQoSProtocolFlags: UByte = 0u)

public data class Dot11QosTxDuration(
    public var uNominalMSDUSize: UInt = 0u,
    public var uMinPHYRate: UInt = 0u,
    public var uDuration: UInt = 0u,
)

public data class Dot11QosTxMediumTime(
    public var dot11PeerAddress: UByteArray = UByteArray(6),
    public var ucQoSPriority: UByte = 0u,
    public var uMediumTimeAdmited: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11QosTxMediumTime) return false
        if (!this.dot11PeerAddress.contentEquals(other.dot11PeerAddress)) return false
        if (this.ucQoSPriority != other.ucQoSPriority) return false
        if (this.uMediumTimeAdmited != other.uMediumTimeAdmited) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11PeerAddress.contentHashCode()
        result = 31 * result + this.ucQoSPriority.hashCode()
        result = 31 * result + this.uMediumTimeAdmited.hashCode()
        return result
    }
}

public data class Dot11RateSet(public var uRateSetLength: UInt = 0u, public var ucRateSet: UByteArray = UByteArray(126)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11RateSet) return false
        if (this.uRateSetLength != other.uRateSetLength) return false
        if (!this.ucRateSet.contentEquals(other.ucRateSet)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uRateSetLength.hashCode()
        result = 31 * result + this.ucRateSet.contentHashCode()
        return result
    }
}

public data class Dot11ReceivedGoNegotiationConfirmationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedGoNegotiationConfirmationParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11ReceivedGoNegotiationRequestParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var requestContext: COpaquePointer? = null,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedGoNegotiationRequestParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11ReceivedGoNegotiationResponseParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var responseContext: COpaquePointer? = null,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedGoNegotiationResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.responseContext != other.responseContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.responseContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11ReceivedInvitationRequestParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var transmitterDeviceAddress: UByteArray = UByteArray(6),
    public var bssid: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var requestContext: COpaquePointer? = null,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedInvitationRequestParameters) return false
        if (this.header != other.header) return false
        if (!this.transmitterDeviceAddress.contentEquals(other.transmitterDeviceAddress)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.transmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11ReceivedInvitationResponseParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var transmitterDeviceAddress: UByteArray = UByteArray(6),
    public var bssid: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedInvitationResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.transmitterDeviceAddress.contentEquals(other.transmitterDeviceAddress)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.transmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11ReceivedProvisionDiscoveryRequestParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var transmitterDeviceAddress: UByteArray = UByteArray(6),
    public var bssid: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var requestContext: COpaquePointer? = null,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedProvisionDiscoveryRequestParameters) return false
        if (this.header != other.header) return false
        if (!this.transmitterDeviceAddress.contentEquals(other.transmitterDeviceAddress)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.transmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11ReceivedProvisionDiscoveryResponseParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var transmitterDeviceAddress: UByteArray = UByteArray(6),
    public var bssid: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedProvisionDiscoveryResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.transmitterDeviceAddress.contentEquals(other.transmitterDeviceAddress)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.transmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public class Dot11RecvExtensionInfo(
    public var uVersion: UInt = 0u,
    public var pvReserved: COpaquePointer? = null,
    public var dot11PhyType: Dot11PhyType = 0,
    public var uChCenterFrequency: UInt = 0u,
    public var lRSSI: Int = 0,
    public var lRSSIMin: Int = 0,
    public var lRSSIMax: Int = 0,
    public var uRSSI: UInt = 0u,
    public var ucPriority: UByte = 0u,
    public var ucDataRate: UByte = 0u,
    public var ucPeerMacAddress: UByteArray = UByteArray(6),
    public var dwExtendedStatus: UInt = 0u,
    public var hWEPOffloadContext: Handle = null,
    public var hAuthOffloadContext: Handle = null,
    public var usWEPAppliedMask: UShort = 0u,
    public var usWPAMSDUPriority: UShort = 0u,
    public var dot11LowestIV48Counter: Dot11Iv48Counter = Dot11Iv48Counter(),
    public var usDot11LeftRWBitMap: UShort = 0u,
    public var dot11HighestIV48Counter: Dot11Iv48Counter = Dot11Iv48Counter(),
    public var usDot11RightRWBitMap: UShort = 0u,
    public var usNumberOfMPDUsReceived: UShort = 0u,
    public var usNumberOfFragments: UShort = 0u,
    public var pNdisPackets: List<COpaquePointer> = List(1) { COpaquePointer(0L) },
)

public class Dot11RecvExtensionInfoV2(
    public var uVersion: UInt = 0u,
    public var pvReserved: COpaquePointer? = null,
    public var dot11PhyType: Dot11PhyType = 0,
    public var uChCenterFrequency: UInt = 0u,
    public var lRSSI: Int = 0,
    public var uRSSI: UInt = 0u,
    public var ucPriority: UByte = 0u,
    public var ucDataRate: UByte = 0u,
    public var ucPeerMacAddress: UByteArray = UByteArray(6),
    public var dwExtendedStatus: UInt = 0u,
    public var hWEPOffloadContext: Handle = null,
    public var hAuthOffloadContext: Handle = null,
    public var usWEPAppliedMask: UShort = 0u,
    public var usWPAMSDUPriority: UShort = 0u,
    public var dot11LowestIV48Counter: Dot11Iv48Counter = Dot11Iv48Counter(),
    public var usDot11LeftRWBitMap: UShort = 0u,
    public var dot11HighestIV48Counter: Dot11Iv48Counter = Dot11Iv48Counter(),
    public var usDot11RightRWBitMap: UShort = 0u,
    public var usNumberOfMPDUsReceived: UShort = 0u,
    public var usNumberOfFragments: UShort = 0u,
    public var pNdisPackets: List<COpaquePointer> = List(1) { COpaquePointer(0L) },
)

public data class Dot11RecvSensitivity(
    public var ucDataRate: UByte = 0u,
    public var lRSSIMin: Int = 0,
    public var lRSSIMax: Int = 0,
)

public data class Dot11RecvSensitivityList(
    public var anonymous: Dot11RecvSensitivityList0 = Dot11RecvSensitivityList0(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11RecvSensitivity: List<Dot11RecvSensitivity> = List(1) { Dot11RecvSensitivity() },
)

public data class Dot11RecvSensitivityList0(public var dot11PhyType: Dot11PhyType = 0, public var uPhyId: UInt = 0u)

public data class Dot11RegDomainsSupportValue(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11RegDomainValue: List<Dot11RegDomainValue> = List(1) { Dot11RegDomainValue() },
)

public data class Dot11RegDomainValue(public var uRegDomainsSupportIndex: UInt = 0u, public var uRegDomainsSupportValue: UInt = 0u)

public data class Dot11ResetRequest(
    public var dot11ResetType: Dot11ResetType = 0,
    public var dot11MacAddress: UByteArray = UByteArray(6),
    public var bSetDefaultMIB: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ResetRequest) return false
        if (this.dot11ResetType != other.dot11ResetType) return false
        if (!this.dot11MacAddress.contentEquals(other.dot11MacAddress)) return false
        if (this.bSetDefaultMIB != other.bSetDefaultMIB) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11ResetType.hashCode()
        result = 31 * result + this.dot11MacAddress.contentHashCode()
        result = 31 * result + this.bSetDefaultMIB.hashCode()
        return result
    }
}

public data class Dot11RoamingCompletionParameters(public var header: NdisObjectHeader = NdisObjectHeader(), public var uStatus: UInt = 0u)

public data class Dot11RoamingStartParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var adhocBSSID: UByteArray = UByteArray(6),
    public var adhocSSID: Dot11Ssid = Dot11Ssid(),
    public var uRoamingReason: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11RoamingStartParameters) return false
        if (this.header != other.header) return false
        if (!this.adhocBSSID.contentEquals(other.adhocBSSID)) return false
        if (this.adhocSSID != other.adhocSSID) return false
        if (this.uRoamingReason != other.uRoamingReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.adhocBSSID.contentHashCode()
        result = 31 * result + this.adhocSSID.hashCode()
        result = 31 * result + this.uRoamingReason.hashCode()
        return result
    }
}

public data class Dot11RssiRange(
    public var dot11PhyType: Dot11PhyType = 0,
    public var uRSSIMin: UInt = 0u,
    public var uRSSIMax: UInt = 0u,
)

public data class Dot11ScanRequest(
    public var dot11BSSType: Dot11BssType = 0,
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11SSID: Dot11Ssid = Dot11Ssid(),
    public var dot11ScanType: Dot11ScanType = 0,
    public var bRestrictedScan: Boolean = false,
    public var bUseRequestIE: Boolean = false,
    public var uRequestIDsOffset: UInt = 0u,
    public var uNumOfRequestIDs: UInt = 0u,
    public var uPhyTypesOffset: UInt = 0u,
    public var uNumOfPhyTypes: UInt = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ScanRequest) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11SSID != other.dot11SSID) return false
        if (this.dot11ScanType != other.dot11ScanType) return false
        if (this.bRestrictedScan != other.bRestrictedScan) return false
        if (this.bUseRequestIE != other.bUseRequestIE) return false
        if (this.uRequestIDsOffset != other.uRequestIDsOffset) return false
        if (this.uNumOfRequestIDs != other.uNumOfRequestIDs) return false
        if (this.uPhyTypesOffset != other.uPhyTypesOffset) return false
        if (this.uNumOfPhyTypes != other.uNumOfPhyTypes) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11BSSType.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11SSID.hashCode()
        result = 31 * result + this.dot11ScanType.hashCode()
        result = 31 * result + this.bRestrictedScan.hashCode()
        result = 31 * result + this.bUseRequestIE.hashCode()
        result = 31 * result + this.uRequestIDsOffset.hashCode()
        result = 31 * result + this.uNumOfRequestIDs.hashCode()
        result = 31 * result + this.uPhyTypesOffset.hashCode()
        result = 31 * result + this.uNumOfPhyTypes.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11ScanRequestV2(
    public var dot11BSSType: Dot11BssType = 0,
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11ScanType: Dot11ScanType = 0,
    public var bRestrictedScan: Boolean = false,
    public var udot11SSIDsOffset: UInt = 0u,
    public var uNumOfdot11SSIDs: UInt = 0u,
    public var bUseRequestIE: Boolean = false,
    public var uRequestIDsOffset: UInt = 0u,
    public var uNumOfRequestIDs: UInt = 0u,
    public var uPhyTypeInfosOffset: UInt = 0u,
    public var uNumOfPhyTypeInfos: UInt = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ScanRequestV2) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11ScanType != other.dot11ScanType) return false
        if (this.bRestrictedScan != other.bRestrictedScan) return false
        if (this.udot11SSIDsOffset != other.udot11SSIDsOffset) return false
        if (this.uNumOfdot11SSIDs != other.uNumOfdot11SSIDs) return false
        if (this.bUseRequestIE != other.bUseRequestIE) return false
        if (this.uRequestIDsOffset != other.uRequestIDsOffset) return false
        if (this.uNumOfRequestIDs != other.uNumOfRequestIDs) return false
        if (this.uPhyTypeInfosOffset != other.uPhyTypeInfosOffset) return false
        if (this.uNumOfPhyTypeInfos != other.uNumOfPhyTypeInfos) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11BSSType.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11ScanType.hashCode()
        result = 31 * result + this.bRestrictedScan.hashCode()
        result = 31 * result + this.udot11SSIDsOffset.hashCode()
        result = 31 * result + this.uNumOfdot11SSIDs.hashCode()
        result = 31 * result + this.bUseRequestIE.hashCode()
        result = 31 * result + this.uRequestIDsOffset.hashCode()
        result = 31 * result + this.uNumOfRequestIDs.hashCode()
        result = 31 * result + this.uPhyTypeInfosOffset.hashCode()
        result = 31 * result + this.uNumOfPhyTypeInfos.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11SecurityPacketHeader(
    public var peerMac: UByteArray = UByteArray(6),
    public var usEtherType: UShort = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SecurityPacketHeader) return false
        if (!this.peerMac.contentEquals(other.peerMac)) return false
        if (this.usEtherType != other.usEtherType) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMac.contentHashCode()
        result = 31 * result + this.usEtherType.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class Dot11SendGoNegotiationConfirmationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var responseContext: COpaquePointer? = null,
    public var uSendTimeout: UInt = 0u,
    public var status: UByte = 0u,
    public var groupCapability: UByte = 0u,
    public var groupID: Dot11WfdGroupId = Dot11WfdGroupId(),
    public var bUseGroupID: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendGoNegotiationConfirmationParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.responseContext != other.responseContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.status != other.status) return false
        if (this.groupCapability != other.groupCapability) return false
        if (this.groupID != other.groupID) return false
        if (this.bUseGroupID != other.bUseGroupID) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.responseContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.groupCapability.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.bUseGroupID.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11SendGoNegotiationRequestParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var uSendTimeout: UInt = 0u,
    public var groupOwnerIntent: Dot11WfdGoIntent = Dot11WfdGoIntent(),
    public var minimumConfigTimeout: Dot11WfdConfigurationTimeout = Dot11WfdConfigurationTimeout(),
    public var intendedInterfaceAddress: UByteArray = UByteArray(6),
    public var groupCapability: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendGoNegotiationRequestParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.groupOwnerIntent != other.groupOwnerIntent) return false
        if (this.minimumConfigTimeout != other.minimumConfigTimeout) return false
        if (!this.intendedInterfaceAddress.contentEquals(other.intendedInterfaceAddress)) return false
        if (this.groupCapability != other.groupCapability) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.groupOwnerIntent.hashCode()
        result = 31 * result + this.minimumConfigTimeout.hashCode()
        result = 31 * result + this.intendedInterfaceAddress.contentHashCode()
        result = 31 * result + this.groupCapability.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11SendGoNegotiationResponseParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var requestContext: COpaquePointer? = null,
    public var uSendTimeout: UInt = 0u,
    public var status: UByte = 0u,
    public var groupOwnerIntent: Dot11WfdGoIntent = Dot11WfdGoIntent(),
    public var minimumConfigTimeout: Dot11WfdConfigurationTimeout = Dot11WfdConfigurationTimeout(),
    public var intendedInterfaceAddress: UByteArray = UByteArray(6),
    public var groupCapability: UByte = 0u,
    public var groupID: Dot11WfdGroupId = Dot11WfdGroupId(),
    public var bUseGroupID: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendGoNegotiationResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.status != other.status) return false
        if (this.groupOwnerIntent != other.groupOwnerIntent) return false
        if (this.minimumConfigTimeout != other.minimumConfigTimeout) return false
        if (!this.intendedInterfaceAddress.contentEquals(other.intendedInterfaceAddress)) return false
        if (this.groupCapability != other.groupCapability) return false
        if (this.groupID != other.groupID) return false
        if (this.bUseGroupID != other.bUseGroupID) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.groupOwnerIntent.hashCode()
        result = 31 * result + this.minimumConfigTimeout.hashCode()
        result = 31 * result + this.intendedInterfaceAddress.contentHashCode()
        result = 31 * result + this.groupCapability.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.bUseGroupID.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11SendInvitationRequestParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var dialogToken: UByte = 0u,
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var uSendTimeout: UInt = 0u,
    public var minimumConfigTimeout: Dot11WfdConfigurationTimeout = Dot11WfdConfigurationTimeout(),
    public var invitationFlags: Dot11WfdInvitationFlags = Dot11WfdInvitationFlags(),
    public var groupBSSID: UByteArray = UByteArray(6),
    public var bUseGroupBSSID: Boolean = false,
    public var operatingChannel: Dot11WfdChannel = Dot11WfdChannel(),
    public var bUseSpecifiedOperatingChannel: Boolean = false,
    public var groupID: Dot11WfdGroupId = Dot11WfdGroupId(),
    public var bLocalGO: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendInvitationRequestParameters) return false
        if (this.header != other.header) return false
        if (this.dialogToken != other.dialogToken) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.minimumConfigTimeout != other.minimumConfigTimeout) return false
        if (this.invitationFlags != other.invitationFlags) return false
        if (!this.groupBSSID.contentEquals(other.groupBSSID)) return false
        if (this.bUseGroupBSSID != other.bUseGroupBSSID) return false
        if (this.operatingChannel != other.operatingChannel) return false
        if (this.bUseSpecifiedOperatingChannel != other.bUseSpecifiedOperatingChannel) return false
        if (this.groupID != other.groupID) return false
        if (this.bLocalGO != other.bLocalGO) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.minimumConfigTimeout.hashCode()
        result = 31 * result + this.invitationFlags.hashCode()
        result = 31 * result + this.groupBSSID.contentHashCode()
        result = 31 * result + this.bUseGroupBSSID.hashCode()
        result = 31 * result + this.operatingChannel.hashCode()
        result = 31 * result + this.bUseSpecifiedOperatingChannel.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.bLocalGO.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11SendInvitationResponseParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var receiverDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var requestContext: COpaquePointer? = null,
    public var uSendTimeout: UInt = 0u,
    public var status: UByte = 0u,
    public var minimumConfigTimeout: Dot11WfdConfigurationTimeout = Dot11WfdConfigurationTimeout(),
    public var groupBSSID: UByteArray = UByteArray(6),
    public var bUseGroupBSSID: Boolean = false,
    public var operatingChannel: Dot11WfdChannel = Dot11WfdChannel(),
    public var bUseSpecifiedOperatingChannel: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendInvitationResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.receiverDeviceAddress.contentEquals(other.receiverDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.status != other.status) return false
        if (this.minimumConfigTimeout != other.minimumConfigTimeout) return false
        if (!this.groupBSSID.contentEquals(other.groupBSSID)) return false
        if (this.bUseGroupBSSID != other.bUseGroupBSSID) return false
        if (this.operatingChannel != other.operatingChannel) return false
        if (this.bUseSpecifiedOperatingChannel != other.bUseSpecifiedOperatingChannel) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.receiverDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.minimumConfigTimeout.hashCode()
        result = 31 * result + this.groupBSSID.contentHashCode()
        result = 31 * result + this.bUseGroupBSSID.hashCode()
        result = 31 * result + this.operatingChannel.hashCode()
        result = 31 * result + this.bUseSpecifiedOperatingChannel.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11SendProvisionDiscoveryRequestParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var dialogToken: UByte = 0u,
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var uSendTimeout: UInt = 0u,
    public var groupCapability: UByte = 0u,
    public var groupID: Dot11WfdGroupId = Dot11WfdGroupId(),
    public var bUseGroupID: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendProvisionDiscoveryRequestParameters) return false
        if (this.header != other.header) return false
        if (this.dialogToken != other.dialogToken) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.groupCapability != other.groupCapability) return false
        if (this.groupID != other.groupID) return false
        if (this.bUseGroupID != other.bUseGroupID) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.groupCapability.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.bUseGroupID.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11SendProvisionDiscoveryResponseParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var receiverDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var requestContext: COpaquePointer? = null,
    public var uSendTimeout: UInt = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendProvisionDiscoveryResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.receiverDeviceAddress.contentEquals(other.receiverDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.receiverDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11Ssid(public var uSSIDLength: UInt = 0u, public var ucSSID: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11Ssid) return false
        if (this.uSSIDLength != other.uSSIDLength) return false
        if (!this.ucSSID.contentEquals(other.ucSSID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uSSIDLength.hashCode()
        result = 31 * result + this.ucSSID.contentHashCode()
        return result
    }
}

public data class Dot11SsidList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var sSIDs: List<Dot11Ssid> = List(1) { Dot11Ssid() },
)

public data class Dot11StartRequest(
    public var uStartFailureTimeout: UInt = 0u,
    public var operationalRateSet: Dot11RateSet = Dot11RateSet(),
    public var uChCenterFrequency: UInt = 0u,
    public var dot11BSSDescription: Dot11BssDescription = Dot11BssDescription(),
)

public data class Dot11Statistics(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ullFourWayHandshakeFailures: ULong = 0uL,
    public var ullTKIPCounterMeasuresInvoked: ULong = 0uL,
    public var ullReserved: ULong = 0uL,
    public var macUcastCounters: Dot11MacFrameStatistics = Dot11MacFrameStatistics(),
    public var macMcastCounters: Dot11MacFrameStatistics = Dot11MacFrameStatistics(),
    public var phyCounters: List<Dot11PhyFrameStatistics> = List(1) { Dot11PhyFrameStatistics() },
)

public data class Dot11StatusIndication(public var uStatusType: UInt = 0u, public var ndisStatus: Int = 0)

public data class Dot11StopApParameters(public var header: NdisObjectHeader = NdisObjectHeader(), public var ulReason: UInt = 0u)

public data class Dot11SupportedAntenna(public var uAntennaListIndex: UInt = 0u, public var bSupportedAntenna: Boolean = false)

public data class Dot11SupportedAntennaList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11SupportedAntenna: List<Dot11SupportedAntenna> = List(1) { Dot11SupportedAntenna() },
)

public data class Dot11SupportedDataRatesValue(public var ucSupportedTxDataRatesValue: UByteArray = UByteArray(8), public var ucSupportedRxDataRatesValue: UByteArray = UByteArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SupportedDataRatesValue) return false
        if (!this.ucSupportedTxDataRatesValue.contentEquals(other.ucSupportedTxDataRatesValue)) return false
        if (!this.ucSupportedRxDataRatesValue.contentEquals(other.ucSupportedRxDataRatesValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucSupportedTxDataRatesValue.contentHashCode()
        result = 31 * result + this.ucSupportedRxDataRatesValue.contentHashCode()
        return result
    }
}

public data class Dot11SupportedDataRatesValueV2(public var ucSupportedTxDataRatesValue: UByteArray = UByteArray(255), public var ucSupportedRxDataRatesValue: UByteArray = UByteArray(255)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SupportedDataRatesValueV2) return false
        if (!this.ucSupportedTxDataRatesValue.contentEquals(other.ucSupportedTxDataRatesValue)) return false
        if (!this.ucSupportedRxDataRatesValue.contentEquals(other.ucSupportedRxDataRatesValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucSupportedTxDataRatesValue.contentHashCode()
        result = 31 * result + this.ucSupportedRxDataRatesValue.contentHashCode()
        return result
    }
}

public data class Dot11SupportedDsssChannel(public var uChannel: UInt = 0u)

public data class Dot11SupportedDsssChannelList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11SupportedDSSSChannel: List<Dot11SupportedDsssChannel> = List(1) { Dot11SupportedDsssChannel() },
)

public data class Dot11SupportedOfdmFrequency(public var uCenterFrequency: UInt = 0u)

public data class Dot11SupportedOfdmFrequencyList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11SupportedOFDMFrequency: List<Dot11SupportedOfdmFrequency> = List(1) { Dot11SupportedOfdmFrequency() },
)

public data class Dot11SupportedPhyTypes(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11PHYType: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SupportedPhyTypes) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.dot11PHYType.contentEquals(other.dot11PHYType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.dot11PHYType.contentHashCode()
        return result
    }
}

public data class Dot11SupportedPowerLevels(public var uNumOfSupportedPowerLevels: UInt = 0u, public var uTxPowerLevelValues: UIntArray = UIntArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SupportedPowerLevels) return false
        if (this.uNumOfSupportedPowerLevels != other.uNumOfSupportedPowerLevels) return false
        if (!this.uTxPowerLevelValues.contentEquals(other.uTxPowerLevelValues)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uNumOfSupportedPowerLevels.hashCode()
        result = 31 * result + this.uTxPowerLevelValues.contentHashCode()
        return result
    }
}

public data class Dot11TkipmicFailureParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bDefaultKeyFailure: Boolean = false,
    public var uKeyIndex: UInt = 0u,
    public var peerMac: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11TkipmicFailureParameters) return false
        if (this.header != other.header) return false
        if (this.bDefaultKeyFailure != other.bDefaultKeyFailure) return false
        if (this.uKeyIndex != other.uKeyIndex) return false
        if (!this.peerMac.contentEquals(other.peerMac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.bDefaultKeyFailure.hashCode()
        result = 31 * result + this.uKeyIndex.hashCode()
        result = 31 * result + this.peerMac.contentHashCode()
        return result
    }
}

public data class Dot11UpdateIe(
    public var dot11UpdateIEOp: Dot11UpdateIeOp = 0,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11UpdateIe) return false
        if (this.dot11UpdateIEOp != other.dot11UpdateIEOp) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11UpdateIEOp.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11Venueinfo(public var venueGroup: UByte = 0u, public var venueType: UByte = 0u)

public data class Dot11VwifiAttributes(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uTotalNumOfEntries: UInt = 0u,
    public var combinations: List<Dot11VwifiCombination> = List(1) { Dot11VwifiCombination() },
)

public data class Dot11VwifiCombination(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumInfrastructure: UInt = 0u,
    public var uNumAdhoc: UInt = 0u,
    public var uNumSoftAP: UInt = 0u,
)

public data class Dot11VwifiCombinationV2(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumInfrastructure: UInt = 0u,
    public var uNumAdhoc: UInt = 0u,
    public var uNumSoftAP: UInt = 0u,
    public var uNumVirtualStation: UInt = 0u,
)

public data class Dot11VwifiCombinationV3(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumInfrastructure: UInt = 0u,
    public var uNumAdhoc: UInt = 0u,
    public var uNumSoftAP: UInt = 0u,
    public var uNumVirtualStation: UInt = 0u,
    public var uNumWFDGroup: UInt = 0u,
)

public data class Dot11WepOffload(
    public var uReserved: UInt = 0u,
    public var hOffloadContext: Handle = null,
    public var hOffload: Handle = null,
    public var dot11OffloadType: Dot11OffloadType = 0,
    public var dwAlgorithm: UInt = 0u,
    public var bRowIsOutbound: Boolean = false,
    public var bUseDefault: Boolean = false,
    public var uFlags: UInt = 0u,
    public var ucMacAddress: UByteArray = UByteArray(6),
    public var uNumOfRWsOnPeer: UInt = 0u,
    public var uNumOfRWsOnMe: UInt = 0u,
    public var dot11IV48Counters: List<Dot11Iv48Counter> = List(16) { Dot11Iv48Counter() },
    public var usDot11RWBitMaps: UShortArray = UShortArray(16),
    public var usKeyLength: UShort = 0u,
    public var ucKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WepOffload) return false
        if (this.uReserved != other.uReserved) return false
        if (this.hOffloadContext != other.hOffloadContext) return false
        if (this.hOffload != other.hOffload) return false
        if (this.dot11OffloadType != other.dot11OffloadType) return false
        if (this.dwAlgorithm != other.dwAlgorithm) return false
        if (this.bRowIsOutbound != other.bRowIsOutbound) return false
        if (this.bUseDefault != other.bUseDefault) return false
        if (this.uFlags != other.uFlags) return false
        if (!this.ucMacAddress.contentEquals(other.ucMacAddress)) return false
        if (this.uNumOfRWsOnPeer != other.uNumOfRWsOnPeer) return false
        if (this.uNumOfRWsOnMe != other.uNumOfRWsOnMe) return false
        if (this.dot11IV48Counters != other.dot11IV48Counters) return false
        if (!this.usDot11RWBitMaps.contentEquals(other.usDot11RWBitMaps)) return false
        if (this.usKeyLength != other.usKeyLength) return false
        if (!this.ucKey.contentEquals(other.ucKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.hOffloadContext.hashCode()
        result = 31 * result + this.hOffload.hashCode()
        result = 31 * result + this.dot11OffloadType.hashCode()
        result = 31 * result + this.dwAlgorithm.hashCode()
        result = 31 * result + this.bRowIsOutbound.hashCode()
        result = 31 * result + this.bUseDefault.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.ucMacAddress.contentHashCode()
        result = 31 * result + this.uNumOfRWsOnPeer.hashCode()
        result = 31 * result + this.uNumOfRWsOnMe.hashCode()
        result = 31 * result + this.dot11IV48Counters.hashCode()
        result = 31 * result + this.usDot11RWBitMaps.contentHashCode()
        result = 31 * result + this.usKeyLength.hashCode()
        result = 31 * result + this.ucKey.contentHashCode()
        return result
    }
}

public data class Dot11WepUpload(
    public var uReserved: UInt = 0u,
    public var dot11OffloadType: Dot11OffloadType = 0,
    public var hOffload: Handle = null,
    public var uNumOfRWsUsed: UInt = 0u,
    public var dot11IV48Counters: List<Dot11Iv48Counter> = List(16) { Dot11Iv48Counter() },
    public var usDot11RWBitMaps: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WepUpload) return false
        if (this.uReserved != other.uReserved) return false
        if (this.dot11OffloadType != other.dot11OffloadType) return false
        if (this.hOffload != other.hOffload) return false
        if (this.uNumOfRWsUsed != other.uNumOfRWsUsed) return false
        if (this.dot11IV48Counters != other.dot11IV48Counters) return false
        if (!this.usDot11RWBitMaps.contentEquals(other.usDot11RWBitMaps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.dot11OffloadType.hashCode()
        result = 31 * result + this.hOffload.hashCode()
        result = 31 * result + this.uNumOfRWsUsed.hashCode()
        result = 31 * result + this.dot11IV48Counters.hashCode()
        result = 31 * result + this.usDot11RWBitMaps.contentHashCode()
        return result
    }
}

public data class Dot11WfdAdditionalIe(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uBeaconIEsOffset: UInt = 0u,
    public var uBeaconIEsLength: UInt = 0u,
    public var uProbeResponseIEsOffset: UInt = 0u,
    public var uProbeResponseIEsLength: UInt = 0u,
    public var uDefaultRequestIEsOffset: UInt = 0u,
    public var uDefaultRequestIEsLength: UInt = 0u,
)

public data class Dot11WfdAdvertisedServiceDescriptor(
    public var advertisementID: UInt = 0u,
    public var configMethods: UShort = 0u,
    public var serviceNameLength: UByte = 0u,
    public var serviceName: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdAdvertisedServiceDescriptor) return false
        if (this.advertisementID != other.advertisementID) return false
        if (this.configMethods != other.configMethods) return false
        if (this.serviceNameLength != other.serviceNameLength) return false
        if (!this.serviceName.contentEquals(other.serviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.advertisementID.hashCode()
        result = 31 * result + this.configMethods.hashCode()
        result = 31 * result + this.serviceNameLength.hashCode()
        result = 31 * result + this.serviceName.contentHashCode()
        return result
    }
}

public data class Dot11WfdAdvertisedServiceList(public var serviceCount: UShort = 0u, public var advertisedService: List<Dot11WfdAdvertisedServiceDescriptor> = List(1) { Dot11WfdAdvertisedServiceDescriptor() })

public data class Dot11WfdAdvertisementId(public var advertisementID: UInt = 0u, public var serviceAddress: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdAdvertisementId) return false
        if (this.advertisementID != other.advertisementID) return false
        if (!this.serviceAddress.contentEquals(other.serviceAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.advertisementID.hashCode()
        result = 31 * result + this.serviceAddress.contentHashCode()
        return result
    }
}

public data class Dot11WfdAttributes(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumConcurrentGORole: UInt = 0u,
    public var uNumConcurrentClientRole: UInt = 0u,
    public var wPSVersionsSupported: UInt = 0u,
    public var bServiceDiscoverySupported: Boolean = false,
    public var bClientDiscoverabilitySupported: Boolean = false,
    public var bInfrastructureManagementSupported: Boolean = false,
    public var uMaxSecondaryDeviceTypeListSize: UInt = 0u,
    public var deviceAddress: UByteArray = UByteArray(6),
    public var uInterfaceAddressListCount: UInt = 0u,
    public var pInterfaceAddressList: COpaquePointer? = null,
    public var uNumSupportedCountryOrRegionStrings: UInt = 0u,
    public var pSupportedCountryOrRegionStrings: COpaquePointer? = null,
    public var uDiscoveryFilterListSize: UInt = 0u,
    public var uGORoleClientTableSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdAttributes) return false
        if (this.header != other.header) return false
        if (this.uNumConcurrentGORole != other.uNumConcurrentGORole) return false
        if (this.uNumConcurrentClientRole != other.uNumConcurrentClientRole) return false
        if (this.wPSVersionsSupported != other.wPSVersionsSupported) return false
        if (this.bServiceDiscoverySupported != other.bServiceDiscoverySupported) return false
        if (this.bClientDiscoverabilitySupported != other.bClientDiscoverabilitySupported) return false
        if (this.bInfrastructureManagementSupported != other.bInfrastructureManagementSupported) return false
        if (this.uMaxSecondaryDeviceTypeListSize != other.uMaxSecondaryDeviceTypeListSize) return false
        if (!this.deviceAddress.contentEquals(other.deviceAddress)) return false
        if (this.uInterfaceAddressListCount != other.uInterfaceAddressListCount) return false
        if (this.pInterfaceAddressList != other.pInterfaceAddressList) return false
        if (this.uNumSupportedCountryOrRegionStrings != other.uNumSupportedCountryOrRegionStrings) return false
        if (this.pSupportedCountryOrRegionStrings != other.pSupportedCountryOrRegionStrings) return false
        if (this.uDiscoveryFilterListSize != other.uDiscoveryFilterListSize) return false
        if (this.uGORoleClientTableSize != other.uGORoleClientTableSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumConcurrentGORole.hashCode()
        result = 31 * result + this.uNumConcurrentClientRole.hashCode()
        result = 31 * result + this.wPSVersionsSupported.hashCode()
        result = 31 * result + this.bServiceDiscoverySupported.hashCode()
        result = 31 * result + this.bClientDiscoverabilitySupported.hashCode()
        result = 31 * result + this.bInfrastructureManagementSupported.hashCode()
        result = 31 * result + this.uMaxSecondaryDeviceTypeListSize.hashCode()
        result = 31 * result + this.deviceAddress.contentHashCode()
        result = 31 * result + this.uInterfaceAddressListCount.hashCode()
        result = 31 * result + this.pInterfaceAddressList.hashCode()
        result = 31 * result + this.uNumSupportedCountryOrRegionStrings.hashCode()
        result = 31 * result + this.pSupportedCountryOrRegionStrings.hashCode()
        result = 31 * result + this.uDiscoveryFilterListSize.hashCode()
        result = 31 * result + this.uGORoleClientTableSize.hashCode()
        return result
    }
}

public data class Dot11WfdChannel(
    public var countryRegionString: UByteArray = UByteArray(3),
    public var operatingClass: UByte = 0u,
    public var channelNumber: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdChannel) return false
        if (!this.countryRegionString.contentEquals(other.countryRegionString)) return false
        if (this.operatingClass != other.operatingClass) return false
        if (this.channelNumber != other.channelNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.countryRegionString.contentHashCode()
        result = 31 * result + this.operatingClass.hashCode()
        result = 31 * result + this.channelNumber.hashCode()
        return result
    }
}

public data class Dot11WfdConfigurationTimeout(public var gOTimeout: UByte = 0u, public var clientTimeout: UByte = 0u)

public data class Dot11WfdDeviceCapabilityConfig(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bServiceDiscoveryEnabled: Boolean = false,
    public var bClientDiscoverabilityEnabled: Boolean = false,
    public var bConcurrentOperationSupported: Boolean = false,
    public var bInfrastructureManagementEnabled: Boolean = false,
    public var bDeviceLimitReached: Boolean = false,
    public var bInvitationProcedureEnabled: Boolean = false,
    public var wPSVersionsEnabled: UInt = 0u,
)

public data class Dot11WfdDeviceEntry(
    public var uPhyId: UInt = 0u,
    public var phySpecificInfo: Dot11BssEntryPhySpecificInfo = Dot11BssEntryPhySpecificInfo(),
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11BSSType: Dot11BssType = 0,
    public var transmitterAddress: UByteArray = UByteArray(6),
    public var lRSSI: Int = 0,
    public var uLinkQuality: UInt = 0u,
    public var usBeaconPeriod: UShort = 0u,
    public var ullTimestamp: ULong = 0uL,
    public var ullBeaconHostTimestamp: ULong = 0uL,
    public var ullProbeResponseHostTimestamp: ULong = 0uL,
    public var usCapabilityInformation: UShort = 0u,
    public var uBeaconIEsOffset: UInt = 0u,
    public var uBeaconIEsLength: UInt = 0u,
    public var uProbeResponseIEsOffset: UInt = 0u,
    public var uProbeResponseIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdDeviceEntry) return false
        if (this.uPhyId != other.uPhyId) return false
        if (this.phySpecificInfo != other.phySpecificInfo) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (!this.transmitterAddress.contentEquals(other.transmitterAddress)) return false
        if (this.lRSSI != other.lRSSI) return false
        if (this.uLinkQuality != other.uLinkQuality) return false
        if (this.usBeaconPeriod != other.usBeaconPeriod) return false
        if (this.ullTimestamp != other.ullTimestamp) return false
        if (this.ullBeaconHostTimestamp != other.ullBeaconHostTimestamp) return false
        if (this.ullProbeResponseHostTimestamp != other.ullProbeResponseHostTimestamp) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.uBeaconIEsOffset != other.uBeaconIEsOffset) return false
        if (this.uBeaconIEsLength != other.uBeaconIEsLength) return false
        if (this.uProbeResponseIEsOffset != other.uProbeResponseIEsOffset) return false
        if (this.uProbeResponseIEsLength != other.uProbeResponseIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uPhyId.hashCode()
        result = 31 * result + this.phySpecificInfo.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11BSSType.hashCode()
        result = 31 * result + this.transmitterAddress.contentHashCode()
        result = 31 * result + this.lRSSI.hashCode()
        result = 31 * result + this.uLinkQuality.hashCode()
        result = 31 * result + this.usBeaconPeriod.hashCode()
        result = 31 * result + this.ullTimestamp.hashCode()
        result = 31 * result + this.ullBeaconHostTimestamp.hashCode()
        result = 31 * result + this.ullProbeResponseHostTimestamp.hashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.uBeaconIEsOffset.hashCode()
        result = 31 * result + this.uBeaconIEsLength.hashCode()
        result = 31 * result + this.uProbeResponseIEsOffset.hashCode()
        result = 31 * result + this.uProbeResponseIEsLength.hashCode()
        return result
    }
}

public data class Dot11WfdDeviceInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var deviceAddress: UByteArray = UByteArray(6),
    public var configMethods: UShort = 0u,
    public var primaryDeviceType: Dot11WfdDeviceType = Dot11WfdDeviceType(),
    public var deviceName: Dot11WpsDeviceName = Dot11WpsDeviceName(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdDeviceInfo) return false
        if (this.header != other.header) return false
        if (!this.deviceAddress.contentEquals(other.deviceAddress)) return false
        if (this.configMethods != other.configMethods) return false
        if (this.primaryDeviceType != other.primaryDeviceType) return false
        if (this.deviceName != other.deviceName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.deviceAddress.contentHashCode()
        result = 31 * result + this.configMethods.hashCode()
        result = 31 * result + this.primaryDeviceType.hashCode()
        result = 31 * result + this.deviceName.hashCode()
        return result
    }
}

public data class Dot11WfdDeviceListenChannel(public var header: NdisObjectHeader = NdisObjectHeader(), public var channelNumber: UByte = 0u)

public data class Dot11WfdDeviceType(
    public var categoryID: UShort = 0u,
    public var subCategoryID: UShort = 0u,
    public var oui: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdDeviceType) return false
        if (this.categoryID != other.categoryID) return false
        if (this.subCategoryID != other.subCategoryID) return false
        if (!this.oui.contentEquals(other.oui)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.categoryID.hashCode()
        result = 31 * result + this.subCategoryID.hashCode()
        result = 31 * result + this.oui.contentHashCode()
        return result
    }
}

public data class Dot11WfdDiscoverCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var status: Int = 0,
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var uListOffset: UInt = 0u,
    public var uListLength: UInt = 0u,
)

public data class Dot11WfdDiscoverDeviceFilter(
    public var deviceID: UByteArray = UByteArray(6),
    public var ucBitmask: UByte = 0u,
    public var groupSSID: Dot11Ssid = Dot11Ssid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdDiscoverDeviceFilter) return false
        if (!this.deviceID.contentEquals(other.deviceID)) return false
        if (this.ucBitmask != other.ucBitmask) return false
        if (this.groupSSID != other.groupSSID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceID.contentHashCode()
        result = 31 * result + this.ucBitmask.hashCode()
        result = 31 * result + this.groupSSID.hashCode()
        return result
    }
}

public data class Dot11WfdDiscoverRequest(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var discoverType: Dot11WfdDiscoverType = 0,
    public var scanType: Dot11WfdScanType = 0,
    public var uDiscoverTimeout: UInt = 0u,
    public var uDeviceFilterListOffset: UInt = 0u,
    public var uNumDeviceFilters: UInt = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
    public var bForceScanLegacyNetworks: Boolean = false,
)

public data class Dot11WfdGoIntent(public var bitfield: UByte = 0u)

public data class Dot11WfdGroupId(public var deviceAddress: UByteArray = UByteArray(6), public var ssid: Dot11Ssid = Dot11Ssid()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdGroupId) return false
        if (!this.deviceAddress.contentEquals(other.deviceAddress)) return false
        if (this.ssid != other.ssid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceAddress.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        return result
    }
}

public data class Dot11WfdGroupJoinParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var gOOperatingChannel: Dot11WfdChannel = Dot11WfdChannel(),
    public var gOConfigTime: UInt = 0u,
    public var bInGroupFormation: Boolean = false,
    public var bWaitForWPSReady: Boolean = false,
)

public data class Dot11WfdGroupOwnerCapabilityConfig(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bPersistentGroupEnabled: Boolean = false,
    public var bIntraBSSDistributionSupported: Boolean = false,
    public var bCrossConnectionSupported: Boolean = false,
    public var bPersistentReconnectSupported: Boolean = false,
    public var bGroupFormationEnabled: Boolean = false,
    public var uMaximumGroupLimit: UInt = 0u,
)

public data class Dot11WfdGroupOwnerCapabilityConfigV2(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bPersistentGroupEnabled: Boolean = false,
    public var bIntraBSSDistributionSupported: Boolean = false,
    public var bCrossConnectionSupported: Boolean = false,
    public var bPersistentReconnectSupported: Boolean = false,
    public var bGroupFormationEnabled: Boolean = false,
    public var uMaximumGroupLimit: UInt = 0u,
    public var bEapolKeyIpAddressAllocationSupported: Boolean = false,
)

public data class Dot11WfdGroupStartParameters(public var header: NdisObjectHeader = NdisObjectHeader(), public var advertisedOperatingChannel: Dot11WfdChannel = Dot11WfdChannel())

public data class Dot11WfdInvitationFlags(public var bitfield: UByte = 0u)

public data class Dot11WfdSecondaryDeviceTypeList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var secondaryDeviceTypes: List<Dot11WfdDeviceType> = List(1) { Dot11WfdDeviceType() },
)

public data class Dot11WfdServiceHashList(public var serviceHashCount: UShort = 0u, public var serviceHash: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdServiceHashList) return false
        if (this.serviceHashCount != other.serviceHashCount) return false
        if (!this.serviceHash.contentEquals(other.serviceHash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serviceHashCount.hashCode()
        result = 31 * result + this.serviceHash.contentHashCode()
        return result
    }
}

public data class Dot11WfdSessionId(public var sessionID: UInt = 0u, public var sessionAddress: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdSessionId) return false
        if (this.sessionID != other.sessionID) return false
        if (!this.sessionAddress.contentEquals(other.sessionAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionID.hashCode()
        result = 31 * result + this.sessionAddress.contentHashCode()
        return result
    }
}

public data class Dot11WfdSessionInfo(public var uSessionInfoLength: UShort = 0u, public var ucSessionInfo: UByteArray = UByteArray(144)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdSessionInfo) return false
        if (this.uSessionInfoLength != other.uSessionInfoLength) return false
        if (!this.ucSessionInfo.contentEquals(other.ucSessionInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uSessionInfoLength.hashCode()
        result = 31 * result + this.ucSessionInfo.contentHashCode()
        return result
    }
}

public data class Dot11WmeAcParameters(
    public var ucAccessCategoryIndex: UByte = 0u,
    public var ucAIFSN: UByte = 0u,
    public var ucECWmin: UByte = 0u,
    public var ucECWmax: UByte = 0u,
    public var usTXOPLimit: UShort = 0u,
)

public data class Dot11WmeAcParametersList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11WMEACParameters: List<Dot11WmeAcParameters> = List(1) { Dot11WmeAcParameters() },
)

public data class Dot11WmeUpdateIe(
    public var uParamElemMinBeaconIntervals: UInt = 0u,
    public var uWMEInfoElemOffset: UInt = 0u,
    public var uWMEInfoElemLength: UInt = 0u,
    public var uWMEParamElemOffset: UInt = 0u,
    public var uWMEParamElemLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WmeUpdateIe) return false
        if (this.uParamElemMinBeaconIntervals != other.uParamElemMinBeaconIntervals) return false
        if (this.uWMEInfoElemOffset != other.uWMEInfoElemOffset) return false
        if (this.uWMEInfoElemLength != other.uWMEInfoElemLength) return false
        if (this.uWMEParamElemOffset != other.uWMEParamElemOffset) return false
        if (this.uWMEParamElemLength != other.uWMEParamElemLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uParamElemMinBeaconIntervals.hashCode()
        result = 31 * result + this.uWMEInfoElemOffset.hashCode()
        result = 31 * result + this.uWMEInfoElemLength.hashCode()
        result = 31 * result + this.uWMEParamElemOffset.hashCode()
        result = 31 * result + this.uWMEParamElemLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11WpaTsc(
    public var uReserved: UInt = 0u,
    public var dot11OffloadType: Dot11OffloadType = 0,
    public var hOffload: Handle = null,
    public var dot11IV48Counter: Dot11Iv48Counter = Dot11Iv48Counter(),
)

public data class Dot11WpsDeviceName(public var uDeviceNameLength: UInt = 0u, public var ucDeviceName: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WpsDeviceName) return false
        if (this.uDeviceNameLength != other.uDeviceNameLength) return false
        if (!this.ucDeviceName.contentEquals(other.ucDeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uDeviceNameLength.hashCode()
        result = 31 * result + this.ucDeviceName.contentHashCode()
        return result
    }
}

public data class L2NotificationData(
    public var notificationSource: WlanNotificationSources = 0u,
    public var notificationCode: UInt = 0u,
    public var interfaceGuid: Guid = Guid(),
    public var dwDataSize: UInt = 0u,
    public var pData: COpaquePointer? = null,
)

public data class OnexAuthParams(
    public var fUpdatePending: Bool = 0,
    public var oneXConnProfile: OnexVariableBlob = OnexVariableBlob(),
    public var authIdentity: OnexAuthIdentity = 0,
    public var dwQuarantineState: UInt = 0u,
    public var bitfield: UInt = 0u,
    public var dwSessionId: UInt = 0u,
    public var hUserToken: Handle = null,
    public var oneXUserProfile: OnexVariableBlob = OnexVariableBlob(),
    public var identity: OnexVariableBlob = OnexVariableBlob(),
    public var userName: OnexVariableBlob = OnexVariableBlob(),
    public var domain: OnexVariableBlob = OnexVariableBlob(),
)

public data class OnexEapError(
    public var dwWinError: UInt = 0u,
    public var type: EapMethodType = EapMethodType(),
    public var dwReasonCode: UInt = 0u,
    public var rootCauseGuid: Guid = Guid(),
    public var repairGuid: Guid = Guid(),
    public var helpLinkGuid: Guid = Guid(),
    public var bitfield: UInt = 0u,
    public var rootCauseString: OnexVariableBlob = OnexVariableBlob(),
    public var repairString: OnexVariableBlob = OnexVariableBlob(),
)

public data class OnexResultUpdateData(
    public var oneXStatus: OnexStatus = OnexStatus(),
    public var backendSupport: OnexEapMethodBackendSupport = 0,
    public var fBackendEngaged: Bool = 0,
    public var bitfield: UInt = 0u,
    public var authParams: OnexVariableBlob = OnexVariableBlob(),
    public var eapError: OnexVariableBlob = OnexVariableBlob(),
)

public data class OnexStatus(
    public var authStatus: OnexAuthStatus = 0,
    public var dwReason: UInt = 0u,
    public var dwError: UInt = 0u,
)

public data class OnexUserInfo(
    public var authIdentity: OnexAuthIdentity = 0,
    public var bitfield: UInt = 0u,
    public var userName: OnexVariableBlob = OnexVariableBlob(),
    public var domainName: OnexVariableBlob = OnexVariableBlob(),
)

public data class OnexVariableBlob(public var dwSize: UInt = 0u, public var dwOffset: UInt = 0u)

public data class WdiagIhvWlanId(
    public var strProfileName: UShortArray = UShortArray(256),
    public var ssid: Dot11Ssid = Dot11Ssid(),
    public var bssType: Dot11BssType = 0,
    public var dwFlags: UInt = 0u,
    public var dwReasonCode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WdiagIhvWlanId) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.ssid != other.ssid) return false
        if (this.bssType != other.bssType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwReasonCode != other.dwReasonCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strProfileName.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        result = 31 * result + this.bssType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReasonCode.hashCode()
        return result
    }
}

public data class WfdsvcConnectionCapability(
    public var bNew: Boolean = false,
    public var bClient: Boolean = false,
    public var bGO: Boolean = false,
)

public data class WfdGroupId(public var deviceAddress: UByteArray = UByteArray(6), public var groupSSID: Dot11Ssid = Dot11Ssid()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WfdGroupId) return false
        if (!this.deviceAddress.contentEquals(other.deviceAddress)) return false
        if (this.groupSSID != other.groupSSID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceAddress.contentHashCode()
        result = 31 * result + this.groupSSID.hashCode()
        return result
    }
}

public data class WlanAssociationAttributes(
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
    public var dot11Bssid: UByteArray = UByteArray(6),
    public var dot11PhyType: Dot11PhyType = 0,
    public var uDot11PhyIndex: UInt = 0u,
    public var wlanSignalQuality: UInt = 0u,
    public var ulRxRate: UInt = 0u,
    public var ulTxRate: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanAssociationAttributes) return false
        if (this.dot11Ssid != other.dot11Ssid) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (!this.dot11Bssid.contentEquals(other.dot11Bssid)) return false
        if (this.dot11PhyType != other.dot11PhyType) return false
        if (this.uDot11PhyIndex != other.uDot11PhyIndex) return false
        if (this.wlanSignalQuality != other.wlanSignalQuality) return false
        if (this.ulRxRate != other.ulRxRate) return false
        if (this.ulTxRate != other.ulTxRate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11Ssid.hashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.dot11Bssid.contentHashCode()
        result = 31 * result + this.dot11PhyType.hashCode()
        result = 31 * result + this.uDot11PhyIndex.hashCode()
        result = 31 * result + this.wlanSignalQuality.hashCode()
        result = 31 * result + this.ulRxRate.hashCode()
        result = 31 * result + this.ulTxRate.hashCode()
        return result
    }
}

public data class WlanAuthCipherPairList(public var dwNumberOfItems: UInt = 0u, public var pAuthCipherPairList: List<Dot11AuthCipherPair> = List(1) { Dot11AuthCipherPair() })

public data class WlanAvailableNetwork(
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
    public var uNumberOfBssids: UInt = 0u,
    public var bNetworkConnectable: Bool = 0,
    public var wlanNotConnectableReason: UInt = 0u,
    public var uNumberOfPhyTypes: UInt = 0u,
    public var dot11PhyTypes: IntArray = IntArray(8),
    public var bMorePhyTypes: Bool = 0,
    public var wlanSignalQuality: UInt = 0u,
    public var bSecurityEnabled: Bool = 0,
    public var dot11DefaultAuthAlgorithm: Dot11AuthAlgorithm = 0,
    public var dot11DefaultCipherAlgorithm: Dot11CipherAlgorithm = 0,
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanAvailableNetwork) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.dot11Ssid != other.dot11Ssid) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (this.uNumberOfBssids != other.uNumberOfBssids) return false
        if (this.bNetworkConnectable != other.bNetworkConnectable) return false
        if (this.wlanNotConnectableReason != other.wlanNotConnectableReason) return false
        if (this.uNumberOfPhyTypes != other.uNumberOfPhyTypes) return false
        if (!this.dot11PhyTypes.contentEquals(other.dot11PhyTypes)) return false
        if (this.bMorePhyTypes != other.bMorePhyTypes) return false
        if (this.wlanSignalQuality != other.wlanSignalQuality) return false
        if (this.bSecurityEnabled != other.bSecurityEnabled) return false
        if (this.dot11DefaultAuthAlgorithm != other.dot11DefaultAuthAlgorithm) return false
        if (this.dot11DefaultCipherAlgorithm != other.dot11DefaultCipherAlgorithm) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strProfileName.contentHashCode()
        result = 31 * result + this.dot11Ssid.hashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.uNumberOfBssids.hashCode()
        result = 31 * result + this.bNetworkConnectable.hashCode()
        result = 31 * result + this.wlanNotConnectableReason.hashCode()
        result = 31 * result + this.uNumberOfPhyTypes.hashCode()
        result = 31 * result + this.dot11PhyTypes.contentHashCode()
        result = 31 * result + this.bMorePhyTypes.hashCode()
        result = 31 * result + this.wlanSignalQuality.hashCode()
        result = 31 * result + this.bSecurityEnabled.hashCode()
        result = 31 * result + this.dot11DefaultAuthAlgorithm.hashCode()
        result = 31 * result + this.dot11DefaultCipherAlgorithm.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }
}

public data class WlanAvailableNetworkList(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var network: List<WlanAvailableNetwork> = List(1) { WlanAvailableNetwork() },
)

public data class WlanAvailableNetworkListV2(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var network: List<WlanAvailableNetworkV2> = List(1) { WlanAvailableNetworkV2() },
)

public class WlanAvailableNetworkV2(
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
    public var uNumberOfBssids: UInt = 0u,
    public var bNetworkConnectable: Bool = 0,
    public var wlanNotConnectableReason: UInt = 0u,
    public var uNumberOfPhyTypes: UInt = 0u,
    public var dot11PhyTypes: IntArray = IntArray(8),
    public var bMorePhyTypes: Bool = 0,
    public var wlanSignalQuality: UInt = 0u,
    public var bSecurityEnabled: Bool = 0,
    public var dot11DefaultAuthAlgorithm: Dot11AuthAlgorithm = 0,
    public var dot11DefaultCipherAlgorithm: Dot11CipherAlgorithm = 0,
    public var dwFlags: UInt = 0u,
    public var accessNetworkOptions: Dot11Accessnetworkoptions = Dot11Accessnetworkoptions(),
    public var dot11HESSID: UByteArray = UByteArray(6),
    public var venueInfo: Dot11Venueinfo = Dot11Venueinfo(),
    public var dwReserved: UInt = 0u,
)

public data class WlanBssEntry(
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var uPhyId: UInt = 0u,
    public var dot11Bssid: UByteArray = UByteArray(6),
    public var dot11BssType: Dot11BssType = 0,
    public var dot11BssPhyType: Dot11PhyType = 0,
    public var lRssi: Int = 0,
    public var uLinkQuality: UInt = 0u,
    public var bInRegDomain: Boolean = false,
    public var usBeaconPeriod: UShort = 0u,
    public var ullTimestamp: ULong = 0uL,
    public var ullHostTimestamp: ULong = 0uL,
    public var usCapabilityInformation: UShort = 0u,
    public var ulChCenterFrequency: UInt = 0u,
    public var wlanRateSet: WlanRateSet = WlanRateSet(),
    public var ulIeOffset: UInt = 0u,
    public var ulIeSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanBssEntry) return false
        if (this.dot11Ssid != other.dot11Ssid) return false
        if (this.uPhyId != other.uPhyId) return false
        if (!this.dot11Bssid.contentEquals(other.dot11Bssid)) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (this.dot11BssPhyType != other.dot11BssPhyType) return false
        if (this.lRssi != other.lRssi) return false
        if (this.uLinkQuality != other.uLinkQuality) return false
        if (this.bInRegDomain != other.bInRegDomain) return false
        if (this.usBeaconPeriod != other.usBeaconPeriod) return false
        if (this.ullTimestamp != other.ullTimestamp) return false
        if (this.ullHostTimestamp != other.ullHostTimestamp) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.ulChCenterFrequency != other.ulChCenterFrequency) return false
        if (this.wlanRateSet != other.wlanRateSet) return false
        if (this.ulIeOffset != other.ulIeOffset) return false
        if (this.ulIeSize != other.ulIeSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11Ssid.hashCode()
        result = 31 * result + this.uPhyId.hashCode()
        result = 31 * result + this.dot11Bssid.contentHashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.dot11BssPhyType.hashCode()
        result = 31 * result + this.lRssi.hashCode()
        result = 31 * result + this.uLinkQuality.hashCode()
        result = 31 * result + this.bInRegDomain.hashCode()
        result = 31 * result + this.usBeaconPeriod.hashCode()
        result = 31 * result + this.ullTimestamp.hashCode()
        result = 31 * result + this.ullHostTimestamp.hashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.ulChCenterFrequency.hashCode()
        result = 31 * result + this.wlanRateSet.hashCode()
        result = 31 * result + this.ulIeOffset.hashCode()
        result = 31 * result + this.ulIeSize.hashCode()
        return result
    }
}

public data class WlanBssList(
    public var dwTotalSize: UInt = 0u,
    public var dwNumberOfItems: UInt = 0u,
    public var wlanBssEntries: List<WlanBssEntry> = List(1) { WlanBssEntry() },
)
