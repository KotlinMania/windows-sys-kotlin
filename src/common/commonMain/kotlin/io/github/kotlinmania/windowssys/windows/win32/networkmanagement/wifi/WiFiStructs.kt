@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public class DOT11EXT_APIS(
    public var Dot11ExtAllocateBuffer: DOT11EXT_ALLOCATE_BUFFER = null,
    public var Dot11ExtFreeBuffer: DOT11EXT_FREE_BUFFER = null,
    public var Dot11ExtSetProfileCustomUserData: DOT11EXT_SET_PROFILE_CUSTOM_USER_DATA = null,
    public var Dot11ExtGetProfileCustomUserData: DOT11EXT_GET_PROFILE_CUSTOM_USER_DATA = null,
    public var Dot11ExtSetCurrentProfile: DOT11EXT_SET_CURRENT_PROFILE = null,
    public var Dot11ExtSendUIRequest: DOT11EXT_SEND_UI_REQUEST = null,
    public var Dot11ExtPreAssociateCompletion: DOT11EXT_PRE_ASSOCIATE_COMPLETION = null,
    public var Dot11ExtPostAssociateCompletion: DOT11EXT_POST_ASSOCIATE_COMPLETION = null,
    public var Dot11ExtSendNotification: DOT11EXT_SEND_NOTIFICATION = null,
    public var Dot11ExtSendPacket: DOT11EXT_SEND_PACKET = null,
    public var Dot11ExtSetEtherTypeHandling: DOT11EXT_SET_ETHERTYPE_HANDLING = null,
    public var Dot11ExtSetAuthAlgorithm: DOT11EXT_SET_AUTH_ALGORITHM = null,
    public var Dot11ExtSetUnicastCipherAlgorithm: DOT11EXT_SET_UNICAST_CIPHER_ALGORITHM = null,
    public var Dot11ExtSetMulticastCipherAlgorithm: DOT11EXT_SET_MULTICAST_CIPHER_ALGORITHM = null,
    public var Dot11ExtSetDefaultKey: DOT11EXT_SET_DEFAULT_KEY = null,
    public var Dot11ExtSetKeyMappingKey: DOT11EXT_SET_KEY_MAPPING_KEY = null,
    public var Dot11ExtSetDefaultKeyId: DOT11EXT_SET_DEFAULT_KEY_ID = null,
    public var Dot11ExtNicSpecificExtension: DOT11EXT_NIC_SPECIFIC_EXTENSION = null,
    public var Dot11ExtSetExcludeUnencrypted: DOT11EXT_SET_EXCLUDE_UNENCRYPTED = null,
    public var Dot11ExtStartOneX: DOT11EXT_ONEX_START = null,
    public var Dot11ExtStopOneX: DOT11EXT_ONEX_STOP = null,
    public var Dot11ExtProcessSecurityPacket: DOT11EXT_PROCESS_ONEX_PACKET = null,
)

public data class DOT11EXT_IHV_CONNECTIVITY_PROFILE(public var pszXmlFragmentIhvConnectivity: PWSTR = 0L)

public data class DOT11EXT_IHV_DISCOVERY_PROFILE(public var IhvConnectivityProfile: DOT11EXT_IHV_CONNECTIVITY_PROFILE = DOT11EXT_IHV_CONNECTIVITY_PROFILE(), public var IhvSecurityProfile: DOT11EXT_IHV_SECURITY_PROFILE = DOT11EXT_IHV_SECURITY_PROFILE())

public data class DOT11EXT_IHV_DISCOVERY_PROFILE_LIST(public var dwCount: UInt = 0u, public var pIhvDiscoveryProfiles: Long = 0L)

public class DOT11EXT_IHV_HANDLERS(
    public var Dot11ExtIhvDeinitService: DOT11EXTIHV_DEINIT_SERVICE = null,
    public var Dot11ExtIhvInitAdapter: DOT11EXTIHV_INIT_ADAPTER = null,
    public var Dot11ExtIhvDeinitAdapter: DOT11EXTIHV_DEINIT_ADAPTER = null,
    public var Dot11ExtIhvPerformPreAssociate: DOT11EXTIHV_PERFORM_PRE_ASSOCIATE = null,
    public var Dot11ExtIhvAdapterReset: DOT11EXTIHV_ADAPTER_RESET = null,
    public var Dot11ExtIhvPerformPostAssociate: DOT11EXTIHV_PERFORM_POST_ASSOCIATE = null,
    public var Dot11ExtIhvStopPostAssociate: DOT11EXTIHV_STOP_POST_ASSOCIATE = null,
    public var Dot11ExtIhvValidateProfile: DOT11EXTIHV_VALIDATE_PROFILE = null,
    public var Dot11ExtIhvPerformCapabilityMatch: DOT11EXTIHV_PERFORM_CAPABILITY_MATCH = null,
    public var Dot11ExtIhvCreateDiscoveryProfiles: DOT11EXTIHV_CREATE_DISCOVERY_PROFILES = null,
    public var Dot11ExtIhvProcessSessionChange: DOT11EXTIHV_PROCESS_SESSION_CHANGE = null,
    public var Dot11ExtIhvReceiveIndication: DOT11EXTIHV_RECEIVE_INDICATION = null,
    public var Dot11ExtIhvReceivePacket: DOT11EXTIHV_RECEIVE_PACKET = null,
    public var Dot11ExtIhvSendPacketCompletion: DOT11EXTIHV_SEND_PACKET_COMPLETION = null,
    public var Dot11ExtIhvIsUIRequestPending: DOT11EXTIHV_IS_UI_REQUEST_PENDING = null,
    public var Dot11ExtIhvProcessUIResponse: DOT11EXTIHV_PROCESS_UI_RESPONSE = null,
    public var Dot11ExtIhvQueryUIRequest: DOT11EXTIHV_QUERY_UI_REQUEST = null,
    public var Dot11ExtIhvOnexIndicateResult: DOT11EXTIHV_ONEX_INDICATE_RESULT = null,
    public var Dot11ExtIhvControl: DOT11EXTIHV_CONTROL = null,
)

public data class DOT11EXT_IHV_PARAMS(
    public var dot11ExtIhvProfileParams: DOT11EXT_IHV_PROFILE_PARAMS = DOT11EXT_IHV_PROFILE_PARAMS(),
    public var wstrProfileName: UShortArray = UShortArray(256),
    public var dwProfileTypeFlags: UInt = 0u,
    public var interfaceGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11EXT_IHV_PARAMS) return false
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

public data class DOT11EXT_IHV_PROFILE_PARAMS(
    public var pSsidList: Long = 0L,
    public var BssType: DOT11_BSS_TYPE = 0,
    public var pMSSecuritySettings: Long = 0L,
)

public data class DOT11EXT_IHV_SECURITY_PROFILE(public var pszXmlFragmentIhvSecurity: PWSTR = 0L, public var bUseMSOnex: BOOL = 0)

public data class DOT11EXT_IHV_SSID_LIST(public var ulCount: UInt = 0u, public var SSIDs: List<DOT11_SSID> = List(1) { DOT11_SSID() })

public data class DOT11EXT_IHV_UI_REQUEST(
    public var dwSessionId: UInt = 0u,
    public var guidUIRequest: GUID = GUID(),
    public var UIPageClsid: GUID = GUID(),
    public var dwByteCount: UInt = 0u,
    public var pvUIRequest: Long = 0L,
)

public data class DOT11EXT_VIRTUAL_STATION_APIS(
    public var Dot11ExtRequestVirtualStation: DOT11EXT_REQUEST_VIRTUAL_STATION = null,
    public var Dot11ExtReleaseVirtualStation: DOT11EXT_RELEASE_VIRTUAL_STATION = null,
    public var Dot11ExtQueryVirtualStationProperties: DOT11EXT_QUERY_VIRTUAL_STATION_PROPERTIES = null,
    public var Dot11ExtSetVirtualStationAPProperties: DOT11EXT_SET_VIRTUAL_STATION_AP_PROPERTIES = null,
)

public data class DOT11EXT_VIRTUAL_STATION_AP_PROPERTY(
    public var dot11SSID: DOT11_SSID = DOT11_SSID(),
    public var dot11AuthAlgo: DOT11_AUTH_ALGORITHM = 0,
    public var dot11CipherAlgo: DOT11_CIPHER_ALGORITHM = 0,
    public var bIsPassPhrase: BOOL = 0,
    public var dwKeyLength: UInt = 0u,
    public var ucKeyData: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11EXT_VIRTUAL_STATION_AP_PROPERTY) return false
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

public data class DOT11_ACCESSNETWORKOPTIONS(
    public var AccessNetworkType: UByte = 0u,
    public var Internet: UByte = 0u,
    public var ASRA: UByte = 0u,
    public var ESR: UByte = 0u,
    public var UESA: UByte = 0u,
)

public data class DOT11_ADAPTER(
    public var gAdapterId: GUID = GUID(),
    public var pszDescription: PWSTR = 0L,
    public var Dot11CurrentOpMode: DOT11_CURRENT_OPERATION_MODE = DOT11_CURRENT_OPERATION_MODE(),
)

public data class DOT11_ADDITIONAL_IE(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uBeaconIEsOffset: UInt = 0u,
    public var uBeaconIEsLength: UInt = 0u,
    public var uResponseIEsOffset: UInt = 0u,
    public var uResponseIEsLength: UInt = 0u,
)

public data class DOT11_ANQP_QUERY_COMPLETE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var Status: DOT11_ANQP_QUERY_RESULT = 0,
    public var hContext: Foundation.HANDLE = Foundation.HANDLE(),
    public var uResponseLength: UInt = 0u,
)

public data class DOT11_AP_JOIN_REQUEST(
    public var uJoinFailureTimeout: UInt = 0u,
    public var OperationalRateSet: DOT11_RATE_SET = DOT11_RATE_SET(),
    public var uChCenterFrequency: UInt = 0u,
    public var dot11BSSDescription: DOT11_BSS_DESCRIPTION = DOT11_BSS_DESCRIPTION(),
)

public class DOT11_ASSOCIATION_COMPLETION_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var MacAddr: UByteArray = UByteArray(6),
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
    public var AuthAlgo: DOT11_AUTH_ALGORITHM = 0,
    public var UnicastCipher: DOT11_CIPHER_ALGORITHM = 0,
    public var MulticastCipher: DOT11_CIPHER_ALGORITHM = 0,
    public var uActivePhyListOffset: UInt = 0u,
    public var uActivePhyListSize: UInt = 0u,
    public var bFourAddressSupported: Boolean = false,
    public var bPortAuthorized: Boolean = false,
    public var ucActiveQoSProtocol: UByte = 0u,
    public var DSInfo: DOT11_DS_INFO = 0,
    public var uEncapTableOffset: UInt = 0u,
    public var uEncapTableSize: UInt = 0u,
    public var MulticastMgmtCipher: DOT11_CIPHER_ALGORITHM = 0,
    public var uAssocComebackTime: UInt = 0u,
)

public data class DOT11_ASSOCIATION_INFO_EX(
    public var PeerMacAddress: UByteArray = UByteArray(6),
    public var BSSID: UByteArray = UByteArray(6),
    public var usCapabilityInformation: UShort = 0u,
    public var usListenInterval: UShort = 0u,
    public var ucPeerSupportedRates: UByteArray = UByteArray(255),
    public var usAssociationID: UShort = 0u,
    public var dot11AssociationState: DOT11_ASSOCIATION_STATE = 0,
    public var dot11PowerMode: DOT11_POWER_MODE = 0,
    public var liAssociationUpTime: Long = 0L,
    public var ullNumOfTxPacketSuccesses: ULong = 0uL,
    public var ullNumOfTxPacketFailures: ULong = 0uL,
    public var ullNumOfRxPacketSuccesses: ULong = 0uL,
    public var ullNumOfRxPacketFailures: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_ASSOCIATION_INFO_EX) return false
        if (!this.PeerMacAddress.contentEquals(other.PeerMacAddress)) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
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
        var result = this.PeerMacAddress.contentHashCode()
        result = 31 * result + this.BSSID.contentHashCode()
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

public data class DOT11_ASSOCIATION_INFO_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11AssocInfo: List<DOT11_ASSOCIATION_INFO_EX> = List(1) { DOT11_ASSOCIATION_INFO_EX() },
)

public data class DOT11_ASSOCIATION_PARAMS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var BSSID: UByteArray = UByteArray(6),
    public var uAssocRequestIEsOffset: UInt = 0u,
    public var uAssocRequestIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_ASSOCIATION_PARAMS) return false
        if (this.Header != other.Header) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        if (this.uAssocRequestIEsOffset != other.uAssocRequestIEsOffset) return false
        if (this.uAssocRequestIEsLength != other.uAssocRequestIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.BSSID.contentHashCode()
        result = 31 * result + this.uAssocRequestIEsOffset.hashCode()
        result = 31 * result + this.uAssocRequestIEsLength.hashCode()
        return result
    }
}

public data class DOT11_ASSOCIATION_START_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var MacAddr: UByteArray = UByteArray(6),
    public var SSID: DOT11_SSID = DOT11_SSID(),
    public var uIHVDataOffset: UInt = 0u,
    public var uIHVDataSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_ASSOCIATION_START_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.MacAddr.contentEquals(other.MacAddr)) return false
        if (this.SSID != other.SSID) return false
        if (this.uIHVDataOffset != other.uIHVDataOffset) return false
        if (this.uIHVDataSize != other.uIHVDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.MacAddr.contentHashCode()
        result = 31 * result + this.SSID.hashCode()
        result = 31 * result + this.uIHVDataOffset.hashCode()
        result = 31 * result + this.uIHVDataSize.hashCode()
        return result
    }
}

public data class DOT11_AUTH_ALGORITHM_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var AlgorithmIds: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_AUTH_ALGORITHM_LIST) return false
        if (this.Header != other.Header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.AlgorithmIds.contentEquals(other.AlgorithmIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.AlgorithmIds.contentHashCode()
        return result
    }
}

public data class DOT11_AUTH_CIPHER_PAIR(public var AuthAlgoId: DOT11_AUTH_ALGORITHM = 0, public var CipherAlgoId: DOT11_CIPHER_ALGORITHM = 0)

public data class DOT11_AUTH_CIPHER_PAIR_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var AuthCipherPairs: List<DOT11_AUTH_CIPHER_PAIR> = List(1) { DOT11_AUTH_CIPHER_PAIR() },
)

public data class DOT11_AVAILABLE_CHANNEL_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var uChannelNumber: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_AVAILABLE_CHANNEL_LIST) return false
        if (this.Header != other.Header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.uChannelNumber.contentEquals(other.uChannelNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.uChannelNumber.contentHashCode()
        return result
    }
}

public data class DOT11_AVAILABLE_FREQUENCY_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var uFrequencyValue: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_AVAILABLE_FREQUENCY_LIST) return false
        if (this.Header != other.Header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.uFrequencyValue.contentEquals(other.uFrequencyValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.uFrequencyValue.contentHashCode()
        return result
    }
}

public data class DOT11_BSSID_CANDIDATE(public var BSSID: UByteArray = UByteArray(6), public var uFlags: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_BSSID_CANDIDATE) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        if (this.uFlags != other.uFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BSSID.contentHashCode()
        result = 31 * result + this.uFlags.hashCode()
        return result
    }
}

public data class DOT11_BSSID_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var BSSIDs: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_BSSID_LIST) return false
        if (this.Header != other.Header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.BSSIDs.contentEquals(other.BSSIDs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.BSSIDs.contentHashCode()
        return result
    }
}

public data class DOT11_BSS_DESCRIPTION(
    public var uReserved: UInt = 0u,
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11BSSType: DOT11_BSS_TYPE = 0,
    public var usBeaconPeriod: UShort = 0u,
    public var ullTimestamp: ULong = 0uL,
    public var usCapabilityInformation: UShort = 0u,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_BSS_DESCRIPTION) return false
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

public data class DOT11_BSS_ENTRY(
    public var uPhyId: UInt = 0u,
    public var PhySpecificInfo: DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO = DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO(),
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11BSSType: DOT11_BSS_TYPE = 0,
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
        if (other !is DOT11_BSS_ENTRY) return false
        if (this.uPhyId != other.uPhyId) return false
        if (this.PhySpecificInfo != other.PhySpecificInfo) return false
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
        result = 31 * result + this.PhySpecificInfo.hashCode()
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

public data class DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO(public var uChCenterFrequency: UInt = 0u, public var FHSS: DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO_0 = DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO_0())

public data class DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO_0(
    public var uHopPattern: UInt = 0u,
    public var uHopSet: UInt = 0u,
    public var uDwellTime: UInt = 0u,
)

public data class DOT11_BSS_LIST(public var uNumOfBytes: UInt = 0u, public var pucBuffer: Long = 0L)

public data class DOT11_BYTE_ARRAY(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfBytes: UInt = 0u,
    public var uTotalNumOfBytes: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_BYTE_ARRAY) return false
        if (this.Header != other.Header) return false
        if (this.uNumOfBytes != other.uNumOfBytes) return false
        if (this.uTotalNumOfBytes != other.uTotalNumOfBytes) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumOfBytes.hashCode()
        result = 31 * result + this.uTotalNumOfBytes.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class DOT11_CAN_SUSTAIN_AP_PARAMETERS(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var ulReason: UInt = 0u)

public data class DOT11_CHANNEL_HINT(public var Dot11PhyType: DOT11_PHY_TYPE = 0, public var uChannelNumber: UInt = 0u)

public data class DOT11_CIPHER_ALGORITHM_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var AlgorithmIds: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_CIPHER_ALGORITHM_LIST) return false
        if (this.Header != other.Header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.AlgorithmIds.contentEquals(other.AlgorithmIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.AlgorithmIds.contentHashCode()
        return result
    }
}

public data class DOT11_CIPHER_DEFAULT_KEY_VALUE(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uKeyIndex: UInt = 0u,
    public var AlgorithmId: DOT11_CIPHER_ALGORITHM = 0,
    public var MacAddr: UByteArray = UByteArray(6),
    public var bDelete: Boolean = false,
    public var bStatic: Boolean = false,
    public var usKeyLength: UShort = 0u,
    public var ucKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_CIPHER_DEFAULT_KEY_VALUE) return false
        if (this.Header != other.Header) return false
        if (this.uKeyIndex != other.uKeyIndex) return false
        if (this.AlgorithmId != other.AlgorithmId) return false
        if (!this.MacAddr.contentEquals(other.MacAddr)) return false
        if (this.bDelete != other.bDelete) return false
        if (this.bStatic != other.bStatic) return false
        if (this.usKeyLength != other.usKeyLength) return false
        if (!this.ucKey.contentEquals(other.ucKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uKeyIndex.hashCode()
        result = 31 * result + this.AlgorithmId.hashCode()
        result = 31 * result + this.MacAddr.contentHashCode()
        result = 31 * result + this.bDelete.hashCode()
        result = 31 * result + this.bStatic.hashCode()
        result = 31 * result + this.usKeyLength.hashCode()
        result = 31 * result + this.ucKey.contentHashCode()
        return result
    }
}

public data class DOT11_CIPHER_KEY_MAPPING_KEY_VALUE(
    public var PeerMacAddr: UByteArray = UByteArray(6),
    public var AlgorithmId: DOT11_CIPHER_ALGORITHM = 0,
    public var Direction: DOT11_DIRECTION = 0,
    public var bDelete: Boolean = false,
    public var bStatic: Boolean = false,
    public var usKeyLength: UShort = 0u,
    public var ucKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_CIPHER_KEY_MAPPING_KEY_VALUE) return false
        if (!this.PeerMacAddr.contentEquals(other.PeerMacAddr)) return false
        if (this.AlgorithmId != other.AlgorithmId) return false
        if (this.Direction != other.Direction) return false
        if (this.bDelete != other.bDelete) return false
        if (this.bStatic != other.bStatic) return false
        if (this.usKeyLength != other.usKeyLength) return false
        if (!this.ucKey.contentEquals(other.ucKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PeerMacAddr.contentHashCode()
        result = 31 * result + this.AlgorithmId.hashCode()
        result = 31 * result + this.Direction.hashCode()
        result = 31 * result + this.bDelete.hashCode()
        result = 31 * result + this.bStatic.hashCode()
        result = 31 * result + this.usKeyLength.hashCode()
        result = 31 * result + this.ucKey.contentHashCode()
        return result
    }
}

public data class DOT11_CONNECTION_COMPLETION_PARAMETERS(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var uStatus: UInt = 0u)

public data class DOT11_CONNECTION_START_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var BSSType: DOT11_BSS_TYPE = 0,
    public var AdhocBSSID: UByteArray = UByteArray(6),
    public var AdhocSSID: DOT11_SSID = DOT11_SSID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_CONNECTION_START_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (this.BSSType != other.BSSType) return false
        if (!this.AdhocBSSID.contentEquals(other.AdhocBSSID)) return false
        if (this.AdhocSSID != other.AdhocSSID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.BSSType.hashCode()
        result = 31 * result + this.AdhocBSSID.contentHashCode()
        result = 31 * result + this.AdhocSSID.hashCode()
        return result
    }
}

public data class DOT11_COUNTERS_ENTRY(
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

public data class DOT11_COUNTRY_OR_REGION_STRING_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var CountryOrRegionStrings: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_COUNTRY_OR_REGION_STRING_LIST) return false
        if (this.Header != other.Header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.CountryOrRegionStrings.contentEquals(other.CountryOrRegionStrings)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.CountryOrRegionStrings.contentHashCode()
        return result
    }
}

public data class DOT11_CURRENT_OFFLOAD_CAPABILITY(public var uReserved: UInt = 0u, public var uFlags: UInt = 0u)

public data class DOT11_CURRENT_OPERATION_MODE(public var uReserved: UInt = 0u, public var uCurrentOpMode: UInt = 0u)

public data class DOT11_CURRENT_OPTIONAL_CAPABILITY(
    public var uReserved: UInt = 0u,
    public var bDot11CFPollable: Boolean = false,
    public var bDot11PCF: Boolean = false,
    public var bDot11PCFMPDUTransferToPC: Boolean = false,
    public var bStrictlyOrderedServiceClass: Boolean = false,
)

public data class DOT11_DATA_RATE_MAPPING_ENTRY(
    public var ucDataRateIndex: UByte = 0u,
    public var ucDataRateFlag: UByte = 0u,
    public var usDataRateValue: UShort = 0u,
)

public data class DOT11_DATA_RATE_MAPPING_TABLE(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uDataRateMappingLength: UInt = 0u,
    public var DataRateMappingEntries: List<DOT11_DATA_RATE_MAPPING_ENTRY> = List(126) { DOT11_DATA_RATE_MAPPING_ENTRY() },
)

public data class DOT11_DEFAULT_WEP_OFFLOAD(
    public var uReserved: UInt = 0u,
    public var hOffloadContext: Foundation.HANDLE = Foundation.HANDLE(),
    public var hOffload: Foundation.HANDLE = Foundation.HANDLE(),
    public var dwIndex: UInt = 0u,
    public var dot11OffloadType: DOT11_OFFLOAD_TYPE = 0,
    public var dwAlgorithm: UInt = 0u,
    public var uFlags: UInt = 0u,
    public var dot11KeyDirection: DOT11_KEY_DIRECTION = 0,
    public var ucMacAddress: UByteArray = UByteArray(6),
    public var uNumOfRWsOnMe: UInt = 0u,
    public var dot11IV48Counters: List<DOT11_IV48_COUNTER> = List(16) { DOT11_IV48_COUNTER() },
    public var usDot11RWBitMaps: UShortArray = UShortArray(16),
    public var usKeyLength: UShort = 0u,
    public var ucKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_DEFAULT_WEP_OFFLOAD) return false
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

public data class DOT11_DEFAULT_WEP_UPLOAD(
    public var uReserved: UInt = 0u,
    public var dot11OffloadType: DOT11_OFFLOAD_TYPE = 0,
    public var hOffload: Foundation.HANDLE = Foundation.HANDLE(),
    public var uNumOfRWsUsed: UInt = 0u,
    public var dot11IV48Counters: List<DOT11_IV48_COUNTER> = List(16) { DOT11_IV48_COUNTER() },
    public var usDot11RWBitMaps: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_DEFAULT_WEP_UPLOAD) return false
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

public data class DOT11_DISASSOCIATE_PEER_REQUEST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerMacAddr: UByteArray = UByteArray(6),
    public var usReason: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_DISASSOCIATE_PEER_REQUEST) return false
        if (this.Header != other.Header) return false
        if (!this.PeerMacAddr.contentEquals(other.PeerMacAddr)) return false
        if (this.usReason != other.usReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerMacAddr.contentHashCode()
        result = 31 * result + this.usReason.hashCode()
        return result
    }
}

public data class DOT11_DISASSOCIATION_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var MacAddr: UByteArray = UByteArray(6),
    public var uReason: UInt = 0u,
    public var uIHVDataOffset: UInt = 0u,
    public var uIHVDataSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_DISASSOCIATION_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.MacAddr.contentEquals(other.MacAddr)) return false
        if (this.uReason != other.uReason) return false
        if (this.uIHVDataOffset != other.uIHVDataOffset) return false
        if (this.uIHVDataSize != other.uIHVDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.MacAddr.contentHashCode()
        result = 31 * result + this.uReason.hashCode()
        result = 31 * result + this.uIHVDataOffset.hashCode()
        result = 31 * result + this.uIHVDataSize.hashCode()
        return result
    }
}

public data class DOT11_DIVERSITY_SELECTION_RX(public var uAntennaListIndex: UInt = 0u, public var bDiversitySelectionRX: Boolean = false)

public data class DOT11_DIVERSITY_SELECTION_RX_LIST(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11DiversitySelectionRx: List<DOT11_DIVERSITY_SELECTION_RX> = List(1) { DOT11_DIVERSITY_SELECTION_RX() },
)

public data class DOT11_EAP_RESULT(public var dwFailureReasonCode: UInt = 0u, public var pAttribArray: Long = 0L)

public data class DOT11_ENCAP_ENTRY(public var usEtherType: UShort = 0u, public var usEncapType: UShort = 0u)

public data class DOT11_ERP_PHY_ATTRIBUTES(
    public var HRDSSSAttributes: DOT11_HRDSSS_PHY_ATTRIBUTES = DOT11_HRDSSS_PHY_ATTRIBUTES(),
    public var bERPPBCCOptionImplemented: Boolean = false,
    public var bDSSSOFDMOptionImplemented: Boolean = false,
    public var bShortSlotTimeOptionImplemented: Boolean = false,
)

public data class DOT11_EXTAP_ATTRIBUTES(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uScanSSIDListSize: UInt = 0u,
    public var uDesiredSSIDListSize: UInt = 0u,
    public var uPrivacyExemptionListSize: UInt = 0u,
    public var uAssociationTableSize: UInt = 0u,
    public var uDefaultKeyTableSize: UInt = 0u,
    public var uWEPKeyValueMaxLength: UInt = 0u,
    public var bStrictlyOrderedServiceClassImplemented: Boolean = false,
    public var uNumSupportedCountryOrRegionStrings: UInt = 0u,
    public var pSupportedCountryOrRegionStrings: Long = 0L,
    public var uInfraNumSupportedUcastAlgoPairs: UInt = 0u,
    public var pInfraSupportedUcastAlgoPairs: Long = 0L,
    public var uInfraNumSupportedMcastAlgoPairs: UInt = 0u,
    public var pInfraSupportedMcastAlgoPairs: Long = 0L,
)

public class DOT11_EXTSTA_ATTRIBUTES(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
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
    public var pSupportedCountryOrRegionStrings: Long = 0L,
    public var uInfraNumSupportedUcastAlgoPairs: UInt = 0u,
    public var pInfraSupportedUcastAlgoPairs: Long = 0L,
    public var uInfraNumSupportedMcastAlgoPairs: UInt = 0u,
    public var pInfraSupportedMcastAlgoPairs: Long = 0L,
    public var uAdhocNumSupportedUcastAlgoPairs: UInt = 0u,
    public var pAdhocSupportedUcastAlgoPairs: Long = 0L,
    public var uAdhocNumSupportedMcastAlgoPairs: UInt = 0u,
    public var pAdhocSupportedMcastAlgoPairs: Long = 0L,
    public var bAutoPowerSaveMode: Boolean = false,
    public var uMaxNetworkOffloadListSize: UInt = 0u,
    public var bMFPCapable: Boolean = false,
    public var uInfraNumSupportedMcastMgmtAlgoPairs: UInt = 0u,
    public var pInfraSupportedMcastMgmtAlgoPairs: Long = 0L,
    public var bNeighborReportSupported: Boolean = false,
    public var bAPChannelReportSupported: Boolean = false,
    public var bActionFramesSupported: Boolean = false,
    public var bANQPQueryOffloadSupported: Boolean = false,
    public var bHESSIDConnectionSupported: Boolean = false,
)

public data class DOT11_EXTSTA_CAPABILITY(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
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

public data class DOT11_EXTSTA_RECV_CONTEXT(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uReceiveFlags: UInt = 0u,
    public var uPhyId: UInt = 0u,
    public var uChCenterFrequency: UInt = 0u,
    public var usNumberOfMPDUsReceived: UShort = 0u,
    public var lRSSI: Int = 0,
    public var ucDataRate: UByte = 0u,
    public var uSizeMediaSpecificInfo: UInt = 0u,
    public var pvMediaSpecificInfo: Long = 0L,
    public var ullTimestamp: ULong = 0uL,
)

public data class DOT11_EXTSTA_SEND_CONTEXT(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var usExemptionActionType: UShort = 0u,
    public var uPhyId: UInt = 0u,
    public var uDelayedSleepValue: UInt = 0u,
    public var pvMediaSpecificInfo: Long = 0L,
    public var uSendFlags: UInt = 0u,
)

public data class DOT11_FRAGMENT_DESCRIPTOR(public var uOffset: UInt = 0u, public var uLength: UInt = 0u)

public data class DOT11_GO_NEGOTIATION_CONFIRMATION_SEND_COMPLETE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var Status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_GO_NEGOTIATION_CONFIRMATION_SEND_COMPLETE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.Status != other.Status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_GO_NEGOTIATION_REQUEST_SEND_COMPLETE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var Status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_GO_NEGOTIATION_REQUEST_SEND_COMPLETE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.Status != other.Status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_GO_NEGOTIATION_RESPONSE_SEND_COMPLETE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var Status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_GO_NEGOTIATION_RESPONSE_SEND_COMPLETE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.Status != other.Status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_HOPPING_PATTERN_ENTRY(public var uHoppingPatternIndex: UInt = 0u, public var uRandomTableFieldNumber: UInt = 0u)

public data class DOT11_HOPPING_PATTERN_ENTRY_LIST(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11HoppingPatternEntry: List<DOT11_HOPPING_PATTERN_ENTRY> = List(1) { DOT11_HOPPING_PATTERN_ENTRY() },
)

public data class DOT11_HRDSSS_PHY_ATTRIBUTES(
    public var bShortPreambleOptionImplemented: Boolean = false,
    public var bPBCCOptionImplemented: Boolean = false,
    public var bChannelAgilityPresent: Boolean = false,
    public var uHRCCAModeSupported: UInt = 0u,
)

public data class DOT11_IBSS_PARAMS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var bJoinOnly: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
)

public data class DOT11_IHV_VERSION_INFO(public var dwVerMin: UInt = 0u, public var dwVerMax: UInt = 0u)

public class DOT11_INCOMING_ASSOC_COMPLETION_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerMacAddr: UByteArray = UByteArray(6),
    public var uStatus: UInt = 0u,
    public var ucErrorSource: UByte = 0u,
    public var bReAssocReq: Boolean = false,
    public var bReAssocResp: Boolean = false,
    public var uAssocReqOffset: UInt = 0u,
    public var uAssocReqSize: UInt = 0u,
    public var uAssocRespOffset: UInt = 0u,
    public var uAssocRespSize: UInt = 0u,
    public var AuthAlgo: DOT11_AUTH_ALGORITHM = 0,
    public var UnicastCipher: DOT11_CIPHER_ALGORITHM = 0,
    public var MulticastCipher: DOT11_CIPHER_ALGORITHM = 0,
    public var uActivePhyListOffset: UInt = 0u,
    public var uActivePhyListSize: UInt = 0u,
    public var uBeaconOffset: UInt = 0u,
    public var uBeaconSize: UInt = 0u,
)

public data class DOT11_INCOMING_ASSOC_DECISION(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerMacAddr: UByteArray = UByteArray(6),
    public var bAccept: Boolean = false,
    public var usReasonCode: UShort = 0u,
    public var uAssocResponseIEsOffset: UInt = 0u,
    public var uAssocResponseIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_INCOMING_ASSOC_DECISION) return false
        if (this.Header != other.Header) return false
        if (!this.PeerMacAddr.contentEquals(other.PeerMacAddr)) return false
        if (this.bAccept != other.bAccept) return false
        if (this.usReasonCode != other.usReasonCode) return false
        if (this.uAssocResponseIEsOffset != other.uAssocResponseIEsOffset) return false
        if (this.uAssocResponseIEsLength != other.uAssocResponseIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerMacAddr.contentHashCode()
        result = 31 * result + this.bAccept.hashCode()
        result = 31 * result + this.usReasonCode.hashCode()
        result = 31 * result + this.uAssocResponseIEsOffset.hashCode()
        result = 31 * result + this.uAssocResponseIEsLength.hashCode()
        return result
    }
}

public data class DOT11_INCOMING_ASSOC_DECISION_V2(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerMacAddr: UByteArray = UByteArray(6),
    public var bAccept: Boolean = false,
    public var usReasonCode: UShort = 0u,
    public var uAssocResponseIEsOffset: UInt = 0u,
    public var uAssocResponseIEsLength: UInt = 0u,
    public var WFDStatus: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_INCOMING_ASSOC_DECISION_V2) return false
        if (this.Header != other.Header) return false
        if (!this.PeerMacAddr.contentEquals(other.PeerMacAddr)) return false
        if (this.bAccept != other.bAccept) return false
        if (this.usReasonCode != other.usReasonCode) return false
        if (this.uAssocResponseIEsOffset != other.uAssocResponseIEsOffset) return false
        if (this.uAssocResponseIEsLength != other.uAssocResponseIEsLength) return false
        if (this.WFDStatus != other.WFDStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerMacAddr.contentHashCode()
        result = 31 * result + this.bAccept.hashCode()
        result = 31 * result + this.usReasonCode.hashCode()
        result = 31 * result + this.uAssocResponseIEsOffset.hashCode()
        result = 31 * result + this.uAssocResponseIEsLength.hashCode()
        result = 31 * result + this.WFDStatus.hashCode()
        return result
    }
}

public data class DOT11_INCOMING_ASSOC_REQUEST_RECEIVED_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerMacAddr: UByteArray = UByteArray(6),
    public var bReAssocReq: Boolean = false,
    public var uAssocReqOffset: UInt = 0u,
    public var uAssocReqSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_INCOMING_ASSOC_REQUEST_RECEIVED_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerMacAddr.contentEquals(other.PeerMacAddr)) return false
        if (this.bReAssocReq != other.bReAssocReq) return false
        if (this.uAssocReqOffset != other.uAssocReqOffset) return false
        if (this.uAssocReqSize != other.uAssocReqSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerMacAddr.contentHashCode()
        result = 31 * result + this.bReAssocReq.hashCode()
        result = 31 * result + this.uAssocReqOffset.hashCode()
        result = 31 * result + this.uAssocReqSize.hashCode()
        return result
    }
}

public data class DOT11_INCOMING_ASSOC_STARTED_PARAMETERS(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var PeerMacAddr: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_INCOMING_ASSOC_STARTED_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerMacAddr.contentEquals(other.PeerMacAddr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerMacAddr.contentHashCode()
        return result
    }
}

public data class DOT11_INVITATION_REQUEST_SEND_COMPLETE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var ReceiverAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var Status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_INVITATION_REQUEST_SEND_COMPLETE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (!this.ReceiverAddress.contentEquals(other.ReceiverAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.Status != other.Status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.ReceiverAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_INVITATION_RESPONSE_SEND_COMPLETE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var ReceiverDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var Status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_INVITATION_RESPONSE_SEND_COMPLETE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.ReceiverDeviceAddress.contentEquals(other.ReceiverDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.Status != other.Status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.ReceiverDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_IV48_COUNTER(public var uIV32Counter: UInt = 0u, public var usIV16Counter: UShort = 0u)

public data class DOT11_JOIN_REQUEST(
    public var uJoinFailureTimeout: UInt = 0u,
    public var OperationalRateSet: DOT11_RATE_SET = DOT11_RATE_SET(),
    public var uChCenterFrequency: UInt = 0u,
    public var dot11BSSDescription: DOT11_BSS_DESCRIPTION = DOT11_BSS_DESCRIPTION(),
)

public data class DOT11_KEY_ALGO_BIP(
    public var ucIPN: UByteArray = UByteArray(6),
    public var ulBIPKeyLength: UInt = 0u,
    public var ucBIPKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_KEY_ALGO_BIP) return false
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

public data class DOT11_KEY_ALGO_BIP_GMAC_256(
    public var ucIPN: UByteArray = UByteArray(6),
    public var ulBIPGmac256KeyLength: UInt = 0u,
    public var ucBIPGmac256Key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_KEY_ALGO_BIP_GMAC_256) return false
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

public data class DOT11_KEY_ALGO_CCMP(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulCCMPKeyLength: UInt = 0u,
    public var ucCCMPKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_KEY_ALGO_CCMP) return false
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

public data class DOT11_KEY_ALGO_GCMP(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulGCMPKeyLength: UInt = 0u,
    public var ucGCMPKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_KEY_ALGO_GCMP) return false
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

public data class DOT11_KEY_ALGO_GCMP_256(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulGCMP256KeyLength: UInt = 0u,
    public var ucGCMP256Key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_KEY_ALGO_GCMP_256) return false
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

public data class DOT11_KEY_ALGO_TKIP_MIC(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulTKIPKeyLength: UInt = 0u,
    public var ulMICKeyLength: UInt = 0u,
    public var ucTKIPMICKeys: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_KEY_ALGO_TKIP_MIC) return false
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

public data class DOT11_LINK_QUALITY_ENTRY(public var PeerMacAddr: UByteArray = UByteArray(6), public var ucLinkQuality: UByte = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_LINK_QUALITY_ENTRY) return false
        if (!this.PeerMacAddr.contentEquals(other.PeerMacAddr)) return false
        if (this.ucLinkQuality != other.ucLinkQuality) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PeerMacAddr.contentHashCode()
        result = 31 * result + this.ucLinkQuality.hashCode()
        return result
    }
}

public data class DOT11_LINK_QUALITY_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uLinkQualityListSize: UInt = 0u,
    public var uLinkQualityListOffset: UInt = 0u,
)

public data class DOT11_MAC_ADDRESS_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var MacAddrs: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_MAC_ADDRESS_LIST) return false
        if (this.Header != other.Header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.MacAddrs.contentEquals(other.MacAddrs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.MacAddrs.contentHashCode()
        return result
    }
}

public data class DOT11_MAC_FRAME_STATISTICS(
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

public data class DOT11_MAC_INFO(
    public var uReserved: UInt = 0u,
    public var uNdisPortNumber: UInt = 0u,
    public var MacAddr: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_MAC_INFO) return false
        if (this.uReserved != other.uReserved) return false
        if (this.uNdisPortNumber != other.uNdisPortNumber) return false
        if (!this.MacAddr.contentEquals(other.MacAddr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.uNdisPortNumber.hashCode()
        result = 31 * result + this.MacAddr.contentHashCode()
        return result
    }
}

public data class DOT11_MAC_PARAMETERS(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var uOpmodeMask: UInt = 0u)

public data class DOT11_MANUFACTURING_CALLBACK_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var dot11ManufacturingCallbackType: DOT11_MANUFACTURING_CALLBACK_TYPE = 0,
    public var uStatus: UInt = 0u,
    public var pvContext: Long = 0L,
)

public data class DOT11_MANUFACTURING_FUNCTIONAL_TEST_QUERY_ADC(
    public var Dot11Band: DOT11_BAND = 0,
    public var uChannel: UInt = 0u,
    public var ADCPowerLevel: Int = 0,
)

public data class DOT11_MANUFACTURING_FUNCTIONAL_TEST_RX(
    public var bEnabled: Boolean = false,
    public var Dot11Band: DOT11_BAND = 0,
    public var uChannel: UInt = 0u,
    public var PowerLevel: Int = 0,
)

public data class DOT11_MANUFACTURING_FUNCTIONAL_TEST_TX(
    public var bEnable: Boolean = false,
    public var bOpenLoop: Boolean = false,
    public var Dot11Band: DOT11_BAND = 0,
    public var uChannel: UInt = 0u,
    public var uSetPowerLevel: UInt = 0u,
    public var ADCPowerLevel: Int = 0,
)

public data class DOT11_MANUFACTURING_SELF_TEST_QUERY_RESULTS(
    public var SelfTestType: DOT11_MANUFACTURING_SELF_TEST_TYPE = 0,
    public var uTestID: UInt = 0u,
    public var bResult: Boolean = false,
    public var uPinFailedBitMask: UInt = 0u,
    public var pvContext: Long = 0L,
    public var uBytesWrittenOut: UInt = 0u,
    public var ucBufferOut: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_MANUFACTURING_SELF_TEST_QUERY_RESULTS) return false
        if (this.SelfTestType != other.SelfTestType) return false
        if (this.uTestID != other.uTestID) return false
        if (this.bResult != other.bResult) return false
        if (this.uPinFailedBitMask != other.uPinFailedBitMask) return false
        if (this.pvContext != other.pvContext) return false
        if (this.uBytesWrittenOut != other.uBytesWrittenOut) return false
        if (!this.ucBufferOut.contentEquals(other.ucBufferOut)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SelfTestType.hashCode()
        result = 31 * result + this.uTestID.hashCode()
        result = 31 * result + this.bResult.hashCode()
        result = 31 * result + this.uPinFailedBitMask.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        result = 31 * result + this.uBytesWrittenOut.hashCode()
        result = 31 * result + this.ucBufferOut.contentHashCode()
        return result
    }
}

public data class DOT11_MANUFACTURING_SELF_TEST_SET_PARAMS(
    public var SelfTestType: DOT11_MANUFACTURING_SELF_TEST_TYPE = 0,
    public var uTestID: UInt = 0u,
    public var uPinBitMask: UInt = 0u,
    public var pvContext: Long = 0L,
    public var uBufferLength: UInt = 0u,
    public var ucBufferIn: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_MANUFACTURING_SELF_TEST_SET_PARAMS) return false
        if (this.SelfTestType != other.SelfTestType) return false
        if (this.uTestID != other.uTestID) return false
        if (this.uPinBitMask != other.uPinBitMask) return false
        if (this.pvContext != other.pvContext) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBufferIn.contentEquals(other.ucBufferIn)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SelfTestType.hashCode()
        result = 31 * result + this.uTestID.hashCode()
        result = 31 * result + this.uPinBitMask.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBufferIn.contentHashCode()
        return result
    }
}

public data class DOT11_MANUFACTURING_TEST(
    public var dot11ManufacturingTestType: DOT11_MANUFACTURING_TEST_TYPE = 0,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_MANUFACTURING_TEST) return false
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

public data class DOT11_MANUFACTURING_TEST_QUERY_DATA(
    public var uKey: UInt = 0u,
    public var uOffset: UInt = 0u,
    public var uBufferLength: UInt = 0u,
    public var uBytesRead: UInt = 0u,
    public var ucBufferOut: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_MANUFACTURING_TEST_QUERY_DATA) return false
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

public data class DOT11_MANUFACTURING_TEST_SET_DATA(
    public var uKey: UInt = 0u,
    public var uOffset: UInt = 0u,
    public var uBufferLength: UInt = 0u,
    public var ucBufferIn: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_MANUFACTURING_TEST_SET_DATA) return false
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

public data class DOT11_MANUFACTURING_TEST_SLEEP(public var uSleepTime: UInt = 0u, public var pvContext: Long = 0L)

public data class DOT11_MD_CAPABILITY_ENTRY_LIST(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11MDCapabilityEntry: List<DOT11_MULTI_DOMAIN_CAPABILITY_ENTRY> = List(1) { DOT11_MULTI_DOMAIN_CAPABILITY_ENTRY() },
)

public data class DOT11_MPDU_MAX_LENGTH_INDICATION(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uPhyId: UInt = 0u,
    public var uMPDUMaxLength: UInt = 0u,
)

public data class DOT11_MSONEX_RESULT_PARAMS(
    public var Dot11OnexAuthStatus: ONEX_AUTH_STATUS = 0,
    public var Dot11OneXReasonCode: ONEX_REASON_CODE = 0,
    public var pbMPPESendKey: Long = 0L,
    public var dwMPPESendKeyLen: UInt = 0u,
    public var pbMPPERecvKey: Long = 0L,
    public var dwMPPERecvKeyLen: UInt = 0u,
    public var pDot11EapResult: Long = 0L,
)

public data class DOT11_MSSECURITY_SETTINGS(
    public var dot11AuthAlgorithm: DOT11_AUTH_ALGORITHM = 0,
    public var dot11CipherAlgorithm: DOT11_CIPHER_ALGORITHM = 0,
    public var fOneXEnabled: BOOL = 0,
    public var eapMethodType: Security.ExtensibleAuthenticationProtocol.EAP_METHOD_TYPE = Security.ExtensibleAuthenticationProtocol.EAP_METHOD_TYPE(),
    public var dwEapConnectionDataLen: UInt = 0u,
    public var pEapConnectionData: Long = 0L,
)

public data class DOT11_MULTI_DOMAIN_CAPABILITY_ENTRY(
    public var uMultiDomainCapabilityIndex: UInt = 0u,
    public var uFirstChannelNumber: UInt = 0u,
    public var uNumberOfChannels: UInt = 0u,
    public var lMaximumTransmitPowerLevel: Int = 0,
)

public data class DOT11_NETWORK(public var dot11Ssid: DOT11_SSID = DOT11_SSID(), public var dot11BssType: DOT11_BSS_TYPE = 0)

public data class DOT11_NETWORK_LIST(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var Network: List<DOT11_NETWORK> = List(1) { DOT11_NETWORK() },
)

public data class DOT11_NIC_SPECIFIC_EXTENSION(
    public var uBufferLength: UInt = 0u,
    public var uTotalBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_NIC_SPECIFIC_EXTENSION) return false
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

public data class DOT11_OFDM_PHY_ATTRIBUTES(public var uFrequencyBandsSupported: UInt = 0u)

public data class DOT11_OFFLOAD_CAPABILITY(
    public var uReserved: UInt = 0u,
    public var uFlags: UInt = 0u,
    public var uSupportedWEPAlgorithms: UInt = 0u,
    public var uNumOfReplayWindows: UInt = 0u,
    public var uMaxWEPKeyMappingLength: UInt = 0u,
    public var uSupportedAuthAlgorithms: UInt = 0u,
    public var uMaxAuthKeyMappingLength: UInt = 0u,
)

public data class DOT11_OFFLOAD_NETWORK(
    public var Ssid: DOT11_SSID = DOT11_SSID(),
    public var UnicastCipher: DOT11_CIPHER_ALGORITHM = 0,
    public var AuthAlgo: DOT11_AUTH_ALGORITHM = 0,
    public var Dot11ChannelHints: List<DOT11_CHANNEL_HINT> = List(4) { DOT11_CHANNEL_HINT() },
)

public data class DOT11_OFFLOAD_NETWORK_LIST_INFO(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var ulFlags: UInt = 0u,
    public var FastScanPeriod: UInt = 0u,
    public var FastScanIterations: UInt = 0u,
    public var SlowScanPeriod: UInt = 0u,
    public var uNumOfEntries: UInt = 0u,
    public var offloadNetworkList: List<DOT11_OFFLOAD_NETWORK> = List(1) { DOT11_OFFLOAD_NETWORK() },
)

public data class DOT11_OFFLOAD_NETWORK_STATUS_PARAMETERS(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var Status: Int = 0)

public data class DOT11_OI(public var OILength: UShort = 0u, public var OI: UByteArray = UByteArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_OI) return false
        if (this.OILength != other.OILength) return false
        if (!this.OI.contentEquals(other.OI)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OILength.hashCode()
        result = 31 * result + this.OI.contentHashCode()
        return result
    }
}

public data class DOT11_OPERATION_MODE_CAPABILITY(
    public var uReserved: UInt = 0u,
    public var uMajorVersion: UInt = 0u,
    public var uMinorVersion: UInt = 0u,
    public var uNumOfTXBuffers: UInt = 0u,
    public var uNumOfRXBuffers: UInt = 0u,
    public var uOpModeCapability: UInt = 0u,
)

public data class DOT11_OPTIONAL_CAPABILITY(
    public var uReserved: UInt = 0u,
    public var bDot11PCF: Boolean = false,
    public var bDot11PCFMPDUTransferToPC: Boolean = false,
    public var bStrictlyOrderedServiceClass: Boolean = false,
)

public data class DOT11_PEER_INFO(
    public var MacAddress: UByteArray = UByteArray(6),
    public var usCapabilityInformation: UShort = 0u,
    public var AuthAlgo: DOT11_AUTH_ALGORITHM = 0,
    public var UnicastCipherAlgo: DOT11_CIPHER_ALGORITHM = 0,
    public var MulticastCipherAlgo: DOT11_CIPHER_ALGORITHM = 0,
    public var bWpsEnabled: Boolean = false,
    public var usListenInterval: UShort = 0u,
    public var ucSupportedRates: UByteArray = UByteArray(255),
    public var usAssociationID: UShort = 0u,
    public var AssociationState: DOT11_ASSOCIATION_STATE = 0,
    public var PowerMode: DOT11_POWER_MODE = 0,
    public var liAssociationUpTime: Long = 0L,
    public var Statistics: DOT11_PEER_STATISTICS = DOT11_PEER_STATISTICS(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_PEER_INFO) return false
        if (!this.MacAddress.contentEquals(other.MacAddress)) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.AuthAlgo != other.AuthAlgo) return false
        if (this.UnicastCipherAlgo != other.UnicastCipherAlgo) return false
        if (this.MulticastCipherAlgo != other.MulticastCipherAlgo) return false
        if (this.bWpsEnabled != other.bWpsEnabled) return false
        if (this.usListenInterval != other.usListenInterval) return false
        if (!this.ucSupportedRates.contentEquals(other.ucSupportedRates)) return false
        if (this.usAssociationID != other.usAssociationID) return false
        if (this.AssociationState != other.AssociationState) return false
        if (this.PowerMode != other.PowerMode) return false
        if (this.liAssociationUpTime != other.liAssociationUpTime) return false
        if (this.Statistics != other.Statistics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MacAddress.contentHashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.AuthAlgo.hashCode()
        result = 31 * result + this.UnicastCipherAlgo.hashCode()
        result = 31 * result + this.MulticastCipherAlgo.hashCode()
        result = 31 * result + this.bWpsEnabled.hashCode()
        result = 31 * result + this.usListenInterval.hashCode()
        result = 31 * result + this.ucSupportedRates.contentHashCode()
        result = 31 * result + this.usAssociationID.hashCode()
        result = 31 * result + this.AssociationState.hashCode()
        result = 31 * result + this.PowerMode.hashCode()
        result = 31 * result + this.liAssociationUpTime.hashCode()
        result = 31 * result + this.Statistics.hashCode()
        return result
    }
}

public data class DOT11_PEER_INFO_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var PeerInfo: List<DOT11_PEER_INFO> = List(1) { DOT11_PEER_INFO() },
)

public data class DOT11_PEER_STATISTICS(
    public var ullDecryptSuccessCount: ULong = 0uL,
    public var ullDecryptFailureCount: ULong = 0uL,
    public var ullTxPacketSuccessCount: ULong = 0uL,
    public var ullTxPacketFailureCount: ULong = 0uL,
    public var ullRxPacketSuccessCount: ULong = 0uL,
    public var ullRxPacketFailureCount: ULong = 0uL,
)

public data class DOT11_PER_MSDU_COUNTERS(
    public var uTransmittedFragmentCount: UInt = 0u,
    public var uRetryCount: UInt = 0u,
    public var uRTSSuccessCount: UInt = 0u,
    public var uRTSFailureCount: UInt = 0u,
    public var uACKFailureCount: UInt = 0u,
)

public data class DOT11_PHY_ATTRIBUTES(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PhyType: DOT11_PHY_TYPE = 0,
    public var bHardwarePhyState: Boolean = false,
    public var bSoftwarePhyState: Boolean = false,
    public var bCFPollable: Boolean = false,
    public var uMPDUMaxLength: UInt = 0u,
    public var TempType: DOT11_TEMP_TYPE = 0,
    public var DiversitySupport: DOT11_DIVERSITY_SUPPORT = 0,
    public var PhySpecificAttributes: DOT11_PHY_ATTRIBUTES_0 = DOT11_PHY_ATTRIBUTES_0(),
    public var uNumberSupportedPowerLevels: UInt = 0u,
    public var TxPowerLevels: UIntArray = UIntArray(8),
    public var uNumDataRateMappingEntries: UInt = 0u,
    public var DataRateMappingEntries: List<DOT11_DATA_RATE_MAPPING_ENTRY> = List(126) { DOT11_DATA_RATE_MAPPING_ENTRY() },
    public var SupportedDataRatesValue: DOT11_SUPPORTED_DATA_RATES_VALUE_V2 = DOT11_SUPPORTED_DATA_RATES_VALUE_V2(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_PHY_ATTRIBUTES) return false
        if (this.Header != other.Header) return false
        if (this.PhyType != other.PhyType) return false
        if (this.bHardwarePhyState != other.bHardwarePhyState) return false
        if (this.bSoftwarePhyState != other.bSoftwarePhyState) return false
        if (this.bCFPollable != other.bCFPollable) return false
        if (this.uMPDUMaxLength != other.uMPDUMaxLength) return false
        if (this.TempType != other.TempType) return false
        if (this.DiversitySupport != other.DiversitySupport) return false
        if (this.PhySpecificAttributes != other.PhySpecificAttributes) return false
        if (this.uNumberSupportedPowerLevels != other.uNumberSupportedPowerLevels) return false
        if (!this.TxPowerLevels.contentEquals(other.TxPowerLevels)) return false
        if (this.uNumDataRateMappingEntries != other.uNumDataRateMappingEntries) return false
        if (this.DataRateMappingEntries != other.DataRateMappingEntries) return false
        if (this.SupportedDataRatesValue != other.SupportedDataRatesValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PhyType.hashCode()
        result = 31 * result + this.bHardwarePhyState.hashCode()
        result = 31 * result + this.bSoftwarePhyState.hashCode()
        result = 31 * result + this.bCFPollable.hashCode()
        result = 31 * result + this.uMPDUMaxLength.hashCode()
        result = 31 * result + this.TempType.hashCode()
        result = 31 * result + this.DiversitySupport.hashCode()
        result = 31 * result + this.PhySpecificAttributes.hashCode()
        result = 31 * result + this.uNumberSupportedPowerLevels.hashCode()
        result = 31 * result + this.TxPowerLevels.contentHashCode()
        result = 31 * result + this.uNumDataRateMappingEntries.hashCode()
        result = 31 * result + this.DataRateMappingEntries.hashCode()
        result = 31 * result + this.SupportedDataRatesValue.hashCode()
        return result
    }
}

public data class DOT11_PHY_ATTRIBUTES_0(
    public var HRDSSSAttributes: DOT11_HRDSSS_PHY_ATTRIBUTES = DOT11_HRDSSS_PHY_ATTRIBUTES(),
    public var OFDMAttributes: DOT11_OFDM_PHY_ATTRIBUTES = DOT11_OFDM_PHY_ATTRIBUTES(),
    public var ERPAttributes: DOT11_ERP_PHY_ATTRIBUTES = DOT11_ERP_PHY_ATTRIBUTES(),
)

public class DOT11_PHY_FRAME_STATISTICS(
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

public data class DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var ulPhyId: UInt = 0u,
    public var Anonymous: DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_0 = DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_0(),
)

public data class DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_0(public var ulChannel: UInt = 0u, public var ulFrequency: UInt = 0u)

public data class DOT11_PHY_ID_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11PhyId: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_PHY_ID_LIST) return false
        if (this.Header != other.Header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.dot11PhyId.contentEquals(other.dot11PhyId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.dot11PhyId.contentHashCode()
        return result
    }
}

public data class DOT11_PHY_STATE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uPhyId: UInt = 0u,
    public var bHardwarePhyState: Boolean = false,
    public var bSoftwarePhyState: Boolean = false,
)

public data class DOT11_PHY_TYPE_INFO(
    public var dot11PhyType: DOT11_PHY_TYPE = 0,
    public var bUseParameters: Boolean = false,
    public var uProbeDelay: UInt = 0u,
    public var uMinChannelTime: UInt = 0u,
    public var uMaxChannelTime: UInt = 0u,
    public var ChDescriptionType: CH_DESCRIPTION_TYPE = 0,
    public var uChannelListSize: UInt = 0u,
    public var ucChannelListBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_PHY_TYPE_INFO) return false
        if (this.dot11PhyType != other.dot11PhyType) return false
        if (this.bUseParameters != other.bUseParameters) return false
        if (this.uProbeDelay != other.uProbeDelay) return false
        if (this.uMinChannelTime != other.uMinChannelTime) return false
        if (this.uMaxChannelTime != other.uMaxChannelTime) return false
        if (this.ChDescriptionType != other.ChDescriptionType) return false
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
        result = 31 * result + this.ChDescriptionType.hashCode()
        result = 31 * result + this.uChannelListSize.hashCode()
        result = 31 * result + this.ucChannelListBuffer.contentHashCode()
        return result
    }
}

public data class DOT11_PHY_TYPE_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11PhyType: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_PHY_TYPE_LIST) return false
        if (this.Header != other.Header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.dot11PhyType.contentEquals(other.dot11PhyType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.dot11PhyType.contentHashCode()
        return result
    }
}

public data class DOT11_PMKID_CANDIDATE_LIST_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uCandidateListSize: UInt = 0u,
    public var uCandidateListOffset: UInt = 0u,
)

public data class DOT11_PMKID_ENTRY(
    public var BSSID: UByteArray = UByteArray(6),
    public var PMKID: UByteArray = UByteArray(16),
    public var uFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_PMKID_ENTRY) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        if (!this.PMKID.contentEquals(other.PMKID)) return false
        if (this.uFlags != other.uFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BSSID.contentHashCode()
        result = 31 * result + this.PMKID.contentHashCode()
        result = 31 * result + this.uFlags.hashCode()
        return result
    }
}

public data class DOT11_PMKID_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var PMKIDs: List<DOT11_PMKID_ENTRY> = List(1) { DOT11_PMKID_ENTRY() },
)

public data class DOT11_PORT_STATE(
    public var PeerMacAddress: UByteArray = UByteArray(6),
    public var uSessionId: UInt = 0u,
    public var bPortControlled: BOOL = 0,
    public var bPortAuthorized: BOOL = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_PORT_STATE) return false
        if (!this.PeerMacAddress.contentEquals(other.PeerMacAddress)) return false
        if (this.uSessionId != other.uSessionId) return false
        if (this.bPortControlled != other.bPortControlled) return false
        if (this.bPortAuthorized != other.bPortAuthorized) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PeerMacAddress.contentHashCode()
        result = 31 * result + this.uSessionId.hashCode()
        result = 31 * result + this.bPortControlled.hashCode()
        result = 31 * result + this.bPortAuthorized.hashCode()
        return result
    }
}

public data class DOT11_PORT_STATE_NOTIFICATION(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerMac: UByteArray = UByteArray(6),
    public var bOpen: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_PORT_STATE_NOTIFICATION) return false
        if (this.Header != other.Header) return false
        if (!this.PeerMac.contentEquals(other.PeerMac)) return false
        if (this.bOpen != other.bOpen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerMac.contentHashCode()
        result = 31 * result + this.bOpen.hashCode()
        return result
    }
}

public data class DOT11_POWER_MGMT_AUTO_MODE_ENABLED_INFO(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var bEnabled: Boolean = false)

public data class DOT11_POWER_MGMT_MODE(
    public var dot11PowerMode: DOT11_POWER_MODE = 0,
    public var uPowerSaveLevel: UInt = 0u,
    public var usListenInterval: UShort = 0u,
    public var usAID: UShort = 0u,
    public var bReceiveDTIMs: Boolean = false,
)

public data class DOT11_POWER_MGMT_MODE_STATUS_INFO(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PowerSaveMode: DOT11_POWER_MODE = 0,
    public var uPowerSaveLevel: UInt = 0u,
    public var Reason: DOT11_POWER_MODE_REASON = 0,
)

public data class DOT11_PRIVACY_EXEMPTION(
    public var usEtherType: UShort = 0u,
    public var usExemptionActionType: UShort = 0u,
    public var usExemptionPacketType: UShort = 0u,
)

public data class DOT11_PRIVACY_EXEMPTION_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var PrivacyExemptionEntries: List<DOT11_PRIVACY_EXEMPTION> = List(1) { DOT11_PRIVACY_EXEMPTION() },
)

public data class DOT11_PROVISION_DISCOVERY_REQUEST_SEND_COMPLETE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var ReceiverAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var Status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_PROVISION_DISCOVERY_REQUEST_SEND_COMPLETE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (!this.ReceiverAddress.contentEquals(other.ReceiverAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.Status != other.Status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.ReceiverAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_PROVISION_DISCOVERY_RESPONSE_SEND_COMPLETE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var ReceiverDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var Status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_PROVISION_DISCOVERY_RESPONSE_SEND_COMPLETE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.ReceiverDeviceAddress.contentEquals(other.ReceiverDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.Status != other.Status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.ReceiverDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_QOS_PARAMS(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var ucEnabledQoSProtocolFlags: UByte = 0u)

public data class DOT11_QOS_TX_DURATION(
    public var uNominalMSDUSize: UInt = 0u,
    public var uMinPHYRate: UInt = 0u,
    public var uDuration: UInt = 0u,
)

public data class DOT11_QOS_TX_MEDIUM_TIME(
    public var dot11PeerAddress: UByteArray = UByteArray(6),
    public var ucQoSPriority: UByte = 0u,
    public var uMediumTimeAdmited: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_QOS_TX_MEDIUM_TIME) return false
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

public data class DOT11_RATE_SET(public var uRateSetLength: UInt = 0u, public var ucRateSet: UByteArray = UByteArray(126)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_RATE_SET) return false
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

public data class DOT11_RECEIVED_GO_NEGOTIATION_CONFIRMATION_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_RECEIVED_GO_NEGOTIATION_CONFIRMATION_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_RECEIVED_GO_NEGOTIATION_REQUEST_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var RequestContext: Long = 0L,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_RECEIVED_GO_NEGOTIATION_REQUEST_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.RequestContext != other.RequestContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.RequestContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_RECEIVED_GO_NEGOTIATION_RESPONSE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var ResponseContext: Long = 0L,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_RECEIVED_GO_NEGOTIATION_RESPONSE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.ResponseContext != other.ResponseContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.ResponseContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_RECEIVED_INVITATION_REQUEST_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var TransmitterDeviceAddress: UByteArray = UByteArray(6),
    public var BSSID: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var RequestContext: Long = 0L,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_RECEIVED_INVITATION_REQUEST_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.TransmitterDeviceAddress.contentEquals(other.TransmitterDeviceAddress)) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.RequestContext != other.RequestContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.TransmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.BSSID.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.RequestContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_RECEIVED_INVITATION_RESPONSE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var TransmitterDeviceAddress: UByteArray = UByteArray(6),
    public var BSSID: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_RECEIVED_INVITATION_RESPONSE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.TransmitterDeviceAddress.contentEquals(other.TransmitterDeviceAddress)) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.TransmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.BSSID.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_RECEIVED_PROVISION_DISCOVERY_REQUEST_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var TransmitterDeviceAddress: UByteArray = UByteArray(6),
    public var BSSID: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var RequestContext: Long = 0L,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_RECEIVED_PROVISION_DISCOVERY_REQUEST_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.TransmitterDeviceAddress.contentEquals(other.TransmitterDeviceAddress)) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.RequestContext != other.RequestContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.TransmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.BSSID.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.RequestContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_RECEIVED_PROVISION_DISCOVERY_RESPONSE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var TransmitterDeviceAddress: UByteArray = UByteArray(6),
    public var BSSID: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_RECEIVED_PROVISION_DISCOVERY_RESPONSE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.TransmitterDeviceAddress.contentEquals(other.TransmitterDeviceAddress)) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.TransmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.BSSID.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public class DOT11_RECV_EXTENSION_INFO(
    public var uVersion: UInt = 0u,
    public var pvReserved: Long = 0L,
    public var dot11PhyType: DOT11_PHY_TYPE = 0,
    public var uChCenterFrequency: UInt = 0u,
    public var lRSSI: Int = 0,
    public var lRSSIMin: Int = 0,
    public var lRSSIMax: Int = 0,
    public var uRSSI: UInt = 0u,
    public var ucPriority: UByte = 0u,
    public var ucDataRate: UByte = 0u,
    public var ucPeerMacAddress: UByteArray = UByteArray(6),
    public var dwExtendedStatus: UInt = 0u,
    public var hWEPOffloadContext: Foundation.HANDLE = Foundation.HANDLE(),
    public var hAuthOffloadContext: Foundation.HANDLE = Foundation.HANDLE(),
    public var usWEPAppliedMask: UShort = 0u,
    public var usWPAMSDUPriority: UShort = 0u,
    public var dot11LowestIV48Counter: DOT11_IV48_COUNTER = DOT11_IV48_COUNTER(),
    public var usDot11LeftRWBitMap: UShort = 0u,
    public var dot11HighestIV48Counter: DOT11_IV48_COUNTER = DOT11_IV48_COUNTER(),
    public var usDot11RightRWBitMap: UShort = 0u,
    public var usNumberOfMPDUsReceived: UShort = 0u,
    public var usNumberOfFragments: UShort = 0u,
    public var pNdisPackets: LongArray = LongArray(1),
)

public class DOT11_RECV_EXTENSION_INFO_V2(
    public var uVersion: UInt = 0u,
    public var pvReserved: Long = 0L,
    public var dot11PhyType: DOT11_PHY_TYPE = 0,
    public var uChCenterFrequency: UInt = 0u,
    public var lRSSI: Int = 0,
    public var uRSSI: UInt = 0u,
    public var ucPriority: UByte = 0u,
    public var ucDataRate: UByte = 0u,
    public var ucPeerMacAddress: UByteArray = UByteArray(6),
    public var dwExtendedStatus: UInt = 0u,
    public var hWEPOffloadContext: Foundation.HANDLE = Foundation.HANDLE(),
    public var hAuthOffloadContext: Foundation.HANDLE = Foundation.HANDLE(),
    public var usWEPAppliedMask: UShort = 0u,
    public var usWPAMSDUPriority: UShort = 0u,
    public var dot11LowestIV48Counter: DOT11_IV48_COUNTER = DOT11_IV48_COUNTER(),
    public var usDot11LeftRWBitMap: UShort = 0u,
    public var dot11HighestIV48Counter: DOT11_IV48_COUNTER = DOT11_IV48_COUNTER(),
    public var usDot11RightRWBitMap: UShort = 0u,
    public var usNumberOfMPDUsReceived: UShort = 0u,
    public var usNumberOfFragments: UShort = 0u,
    public var pNdisPackets: LongArray = LongArray(1),
)

public data class DOT11_RECV_SENSITIVITY(
    public var ucDataRate: UByte = 0u,
    public var lRSSIMin: Int = 0,
    public var lRSSIMax: Int = 0,
)

public data class DOT11_RECV_SENSITIVITY_LIST(
    public var Anonymous: DOT11_RECV_SENSITIVITY_LIST_0 = DOT11_RECV_SENSITIVITY_LIST_0(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11RecvSensitivity: List<DOT11_RECV_SENSITIVITY> = List(1) { DOT11_RECV_SENSITIVITY() },
)

public data class DOT11_RECV_SENSITIVITY_LIST_0(public var dot11PhyType: DOT11_PHY_TYPE = 0, public var uPhyId: UInt = 0u)

public data class DOT11_REG_DOMAINS_SUPPORT_VALUE(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11RegDomainValue: List<DOT11_REG_DOMAIN_VALUE> = List(1) { DOT11_REG_DOMAIN_VALUE() },
)

public data class DOT11_REG_DOMAIN_VALUE(public var uRegDomainsSupportIndex: UInt = 0u, public var uRegDomainsSupportValue: UInt = 0u)

public data class DOT11_RESET_REQUEST(
    public var dot11ResetType: DOT11_RESET_TYPE = 0,
    public var dot11MacAddress: UByteArray = UByteArray(6),
    public var bSetDefaultMIB: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_RESET_REQUEST) return false
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

public data class DOT11_ROAMING_COMPLETION_PARAMETERS(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var uStatus: UInt = 0u)

public data class DOT11_ROAMING_START_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var AdhocBSSID: UByteArray = UByteArray(6),
    public var AdhocSSID: DOT11_SSID = DOT11_SSID(),
    public var uRoamingReason: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_ROAMING_START_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.AdhocBSSID.contentEquals(other.AdhocBSSID)) return false
        if (this.AdhocSSID != other.AdhocSSID) return false
        if (this.uRoamingReason != other.uRoamingReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.AdhocBSSID.contentHashCode()
        result = 31 * result + this.AdhocSSID.hashCode()
        result = 31 * result + this.uRoamingReason.hashCode()
        return result
    }
}

public data class DOT11_RSSI_RANGE(
    public var dot11PhyType: DOT11_PHY_TYPE = 0,
    public var uRSSIMin: UInt = 0u,
    public var uRSSIMax: UInt = 0u,
)

public data class DOT11_SCAN_REQUEST(
    public var dot11BSSType: DOT11_BSS_TYPE = 0,
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11SSID: DOT11_SSID = DOT11_SSID(),
    public var dot11ScanType: DOT11_SCAN_TYPE = 0,
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
        if (other !is DOT11_SCAN_REQUEST) return false
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

public data class DOT11_SCAN_REQUEST_V2(
    public var dot11BSSType: DOT11_BSS_TYPE = 0,
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11ScanType: DOT11_SCAN_TYPE = 0,
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
        if (other !is DOT11_SCAN_REQUEST_V2) return false
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

public data class DOT11_SECURITY_PACKET_HEADER(
    public var PeerMac: UByteArray = UByteArray(6),
    public var usEtherType: UShort = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SECURITY_PACKET_HEADER) return false
        if (!this.PeerMac.contentEquals(other.PeerMac)) return false
        if (this.usEtherType != other.usEtherType) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PeerMac.contentHashCode()
        result = 31 * result + this.usEtherType.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class DOT11_SEND_GO_NEGOTIATION_CONFIRMATION_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var ResponseContext: Long = 0L,
    public var uSendTimeout: UInt = 0u,
    public var Status: UByte = 0u,
    public var GroupCapability: UByte = 0u,
    public var GroupID: DOT11_WFD_GROUP_ID = DOT11_WFD_GROUP_ID(),
    public var bUseGroupID: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SEND_GO_NEGOTIATION_CONFIRMATION_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.ResponseContext != other.ResponseContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.Status != other.Status) return false
        if (this.GroupCapability != other.GroupCapability) return false
        if (this.GroupID != other.GroupID) return false
        if (this.bUseGroupID != other.bUseGroupID) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.ResponseContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.GroupCapability.hashCode()
        result = 31 * result + this.GroupID.hashCode()
        result = 31 * result + this.bUseGroupID.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_SEND_GO_NEGOTIATION_REQUEST_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var uSendTimeout: UInt = 0u,
    public var GroupOwnerIntent: DOT11_WFD_GO_INTENT = DOT11_WFD_GO_INTENT(),
    public var MinimumConfigTimeout: DOT11_WFD_CONFIGURATION_TIMEOUT = DOT11_WFD_CONFIGURATION_TIMEOUT(),
    public var IntendedInterfaceAddress: UByteArray = UByteArray(6),
    public var GroupCapability: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SEND_GO_NEGOTIATION_REQUEST_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.GroupOwnerIntent != other.GroupOwnerIntent) return false
        if (this.MinimumConfigTimeout != other.MinimumConfigTimeout) return false
        if (!this.IntendedInterfaceAddress.contentEquals(other.IntendedInterfaceAddress)) return false
        if (this.GroupCapability != other.GroupCapability) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.GroupOwnerIntent.hashCode()
        result = 31 * result + this.MinimumConfigTimeout.hashCode()
        result = 31 * result + this.IntendedInterfaceAddress.contentHashCode()
        result = 31 * result + this.GroupCapability.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_SEND_GO_NEGOTIATION_RESPONSE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var RequestContext: Long = 0L,
    public var uSendTimeout: UInt = 0u,
    public var Status: UByte = 0u,
    public var GroupOwnerIntent: DOT11_WFD_GO_INTENT = DOT11_WFD_GO_INTENT(),
    public var MinimumConfigTimeout: DOT11_WFD_CONFIGURATION_TIMEOUT = DOT11_WFD_CONFIGURATION_TIMEOUT(),
    public var IntendedInterfaceAddress: UByteArray = UByteArray(6),
    public var GroupCapability: UByte = 0u,
    public var GroupID: DOT11_WFD_GROUP_ID = DOT11_WFD_GROUP_ID(),
    public var bUseGroupID: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SEND_GO_NEGOTIATION_RESPONSE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.RequestContext != other.RequestContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.Status != other.Status) return false
        if (this.GroupOwnerIntent != other.GroupOwnerIntent) return false
        if (this.MinimumConfigTimeout != other.MinimumConfigTimeout) return false
        if (!this.IntendedInterfaceAddress.contentEquals(other.IntendedInterfaceAddress)) return false
        if (this.GroupCapability != other.GroupCapability) return false
        if (this.GroupID != other.GroupID) return false
        if (this.bUseGroupID != other.bUseGroupID) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.RequestContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.GroupOwnerIntent.hashCode()
        result = 31 * result + this.MinimumConfigTimeout.hashCode()
        result = 31 * result + this.IntendedInterfaceAddress.contentHashCode()
        result = 31 * result + this.GroupCapability.hashCode()
        result = 31 * result + this.GroupID.hashCode()
        result = 31 * result + this.bUseGroupID.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_SEND_INVITATION_REQUEST_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var DialogToken: UByte = 0u,
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var uSendTimeout: UInt = 0u,
    public var MinimumConfigTimeout: DOT11_WFD_CONFIGURATION_TIMEOUT = DOT11_WFD_CONFIGURATION_TIMEOUT(),
    public var InvitationFlags: DOT11_WFD_INVITATION_FLAGS = DOT11_WFD_INVITATION_FLAGS(),
    public var GroupBSSID: UByteArray = UByteArray(6),
    public var bUseGroupBSSID: Boolean = false,
    public var OperatingChannel: DOT11_WFD_CHANNEL = DOT11_WFD_CHANNEL(),
    public var bUseSpecifiedOperatingChannel: Boolean = false,
    public var GroupID: DOT11_WFD_GROUP_ID = DOT11_WFD_GROUP_ID(),
    public var bLocalGO: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SEND_INVITATION_REQUEST_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (this.DialogToken != other.DialogToken) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.MinimumConfigTimeout != other.MinimumConfigTimeout) return false
        if (this.InvitationFlags != other.InvitationFlags) return false
        if (!this.GroupBSSID.contentEquals(other.GroupBSSID)) return false
        if (this.bUseGroupBSSID != other.bUseGroupBSSID) return false
        if (this.OperatingChannel != other.OperatingChannel) return false
        if (this.bUseSpecifiedOperatingChannel != other.bUseSpecifiedOperatingChannel) return false
        if (this.GroupID != other.GroupID) return false
        if (this.bLocalGO != other.bLocalGO) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.MinimumConfigTimeout.hashCode()
        result = 31 * result + this.InvitationFlags.hashCode()
        result = 31 * result + this.GroupBSSID.contentHashCode()
        result = 31 * result + this.bUseGroupBSSID.hashCode()
        result = 31 * result + this.OperatingChannel.hashCode()
        result = 31 * result + this.bUseSpecifiedOperatingChannel.hashCode()
        result = 31 * result + this.GroupID.hashCode()
        result = 31 * result + this.bLocalGO.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_SEND_INVITATION_RESPONSE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var ReceiverDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var RequestContext: Long = 0L,
    public var uSendTimeout: UInt = 0u,
    public var Status: UByte = 0u,
    public var MinimumConfigTimeout: DOT11_WFD_CONFIGURATION_TIMEOUT = DOT11_WFD_CONFIGURATION_TIMEOUT(),
    public var GroupBSSID: UByteArray = UByteArray(6),
    public var bUseGroupBSSID: Boolean = false,
    public var OperatingChannel: DOT11_WFD_CHANNEL = DOT11_WFD_CHANNEL(),
    public var bUseSpecifiedOperatingChannel: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SEND_INVITATION_RESPONSE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.ReceiverDeviceAddress.contentEquals(other.ReceiverDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.RequestContext != other.RequestContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.Status != other.Status) return false
        if (this.MinimumConfigTimeout != other.MinimumConfigTimeout) return false
        if (!this.GroupBSSID.contentEquals(other.GroupBSSID)) return false
        if (this.bUseGroupBSSID != other.bUseGroupBSSID) return false
        if (this.OperatingChannel != other.OperatingChannel) return false
        if (this.bUseSpecifiedOperatingChannel != other.bUseSpecifiedOperatingChannel) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.ReceiverDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.RequestContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.MinimumConfigTimeout.hashCode()
        result = 31 * result + this.GroupBSSID.contentHashCode()
        result = 31 * result + this.bUseGroupBSSID.hashCode()
        result = 31 * result + this.OperatingChannel.hashCode()
        result = 31 * result + this.bUseSpecifiedOperatingChannel.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_SEND_PROVISION_DISCOVERY_REQUEST_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var DialogToken: UByte = 0u,
    public var PeerDeviceAddress: UByteArray = UByteArray(6),
    public var uSendTimeout: UInt = 0u,
    public var GroupCapability: UByte = 0u,
    public var GroupID: DOT11_WFD_GROUP_ID = DOT11_WFD_GROUP_ID(),
    public var bUseGroupID: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SEND_PROVISION_DISCOVERY_REQUEST_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (this.DialogToken != other.DialogToken) return false
        if (!this.PeerDeviceAddress.contentEquals(other.PeerDeviceAddress)) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.GroupCapability != other.GroupCapability) return false
        if (this.GroupID != other.GroupID) return false
        if (this.bUseGroupID != other.bUseGroupID) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.PeerDeviceAddress.contentHashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.GroupCapability.hashCode()
        result = 31 * result + this.GroupID.hashCode()
        result = 31 * result + this.bUseGroupID.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_SEND_PROVISION_DISCOVERY_RESPONSE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var ReceiverDeviceAddress: UByteArray = UByteArray(6),
    public var DialogToken: UByte = 0u,
    public var RequestContext: Long = 0L,
    public var uSendTimeout: UInt = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SEND_PROVISION_DISCOVERY_RESPONSE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (!this.ReceiverDeviceAddress.contentEquals(other.ReceiverDeviceAddress)) return false
        if (this.DialogToken != other.DialogToken) return false
        if (this.RequestContext != other.RequestContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.ReceiverDeviceAddress.contentHashCode()
        result = 31 * result + this.DialogToken.hashCode()
        result = 31 * result + this.RequestContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class DOT11_SSID(public var uSSIDLength: UInt = 0u, public var ucSSID: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SSID) return false
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

public data class DOT11_SSID_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var SSIDs: List<DOT11_SSID> = List(1) { DOT11_SSID() },
)

public data class DOT11_START_REQUEST(
    public var uStartFailureTimeout: UInt = 0u,
    public var OperationalRateSet: DOT11_RATE_SET = DOT11_RATE_SET(),
    public var uChCenterFrequency: UInt = 0u,
    public var dot11BSSDescription: DOT11_BSS_DESCRIPTION = DOT11_BSS_DESCRIPTION(),
)

public data class DOT11_STATISTICS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var ullFourWayHandshakeFailures: ULong = 0uL,
    public var ullTKIPCounterMeasuresInvoked: ULong = 0uL,
    public var ullReserved: ULong = 0uL,
    public var MacUcastCounters: DOT11_MAC_FRAME_STATISTICS = DOT11_MAC_FRAME_STATISTICS(),
    public var MacMcastCounters: DOT11_MAC_FRAME_STATISTICS = DOT11_MAC_FRAME_STATISTICS(),
    public var PhyCounters: List<DOT11_PHY_FRAME_STATISTICS> = List(1) { DOT11_PHY_FRAME_STATISTICS() },
)

public data class DOT11_STATUS_INDICATION(public var uStatusType: UInt = 0u, public var ndisStatus: Int = 0)

public data class DOT11_STOP_AP_PARAMETERS(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var ulReason: UInt = 0u)

public data class DOT11_SUPPORTED_ANTENNA(public var uAntennaListIndex: UInt = 0u, public var bSupportedAntenna: Boolean = false)

public data class DOT11_SUPPORTED_ANTENNA_LIST(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11SupportedAntenna: List<DOT11_SUPPORTED_ANTENNA> = List(1) { DOT11_SUPPORTED_ANTENNA() },
)

public data class DOT11_SUPPORTED_DATA_RATES_VALUE(public var ucSupportedTxDataRatesValue: UByteArray = UByteArray(8), public var ucSupportedRxDataRatesValue: UByteArray = UByteArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SUPPORTED_DATA_RATES_VALUE) return false
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

public data class DOT11_SUPPORTED_DATA_RATES_VALUE_V2(public var ucSupportedTxDataRatesValue: UByteArray = UByteArray(255), public var ucSupportedRxDataRatesValue: UByteArray = UByteArray(255)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SUPPORTED_DATA_RATES_VALUE_V2) return false
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

public data class DOT11_SUPPORTED_DSSS_CHANNEL(public var uChannel: UInt = 0u)

public data class DOT11_SUPPORTED_DSSS_CHANNEL_LIST(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11SupportedDSSSChannel: List<DOT11_SUPPORTED_DSSS_CHANNEL> = List(1) { DOT11_SUPPORTED_DSSS_CHANNEL() },
)

public data class DOT11_SUPPORTED_OFDM_FREQUENCY(public var uCenterFrequency: UInt = 0u)

public data class DOT11_SUPPORTED_OFDM_FREQUENCY_LIST(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11SupportedOFDMFrequency: List<DOT11_SUPPORTED_OFDM_FREQUENCY> = List(1) { DOT11_SUPPORTED_OFDM_FREQUENCY() },
)

public data class DOT11_SUPPORTED_PHY_TYPES(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11PHYType: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SUPPORTED_PHY_TYPES) return false
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

public data class DOT11_SUPPORTED_POWER_LEVELS(public var uNumOfSupportedPowerLevels: UInt = 0u, public var uTxPowerLevelValues: UIntArray = UIntArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_SUPPORTED_POWER_LEVELS) return false
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

public data class DOT11_TKIPMIC_FAILURE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var bDefaultKeyFailure: Boolean = false,
    public var uKeyIndex: UInt = 0u,
    public var PeerMac: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_TKIPMIC_FAILURE_PARAMETERS) return false
        if (this.Header != other.Header) return false
        if (this.bDefaultKeyFailure != other.bDefaultKeyFailure) return false
        if (this.uKeyIndex != other.uKeyIndex) return false
        if (!this.PeerMac.contentEquals(other.PeerMac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.bDefaultKeyFailure.hashCode()
        result = 31 * result + this.uKeyIndex.hashCode()
        result = 31 * result + this.PeerMac.contentHashCode()
        return result
    }
}

public data class DOT11_UPDATE_IE(
    public var dot11UpdateIEOp: DOT11_UPDATE_IE_OP = 0,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_UPDATE_IE) return false
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

public data class DOT11_VENUEINFO(public var VenueGroup: UByte = 0u, public var VenueType: UByte = 0u)

public data class DOT11_VWIFI_ATTRIBUTES(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uTotalNumOfEntries: UInt = 0u,
    public var Combinations: List<DOT11_VWIFI_COMBINATION> = List(1) { DOT11_VWIFI_COMBINATION() },
)

public data class DOT11_VWIFI_COMBINATION(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumInfrastructure: UInt = 0u,
    public var uNumAdhoc: UInt = 0u,
    public var uNumSoftAP: UInt = 0u,
)

public data class DOT11_VWIFI_COMBINATION_V2(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumInfrastructure: UInt = 0u,
    public var uNumAdhoc: UInt = 0u,
    public var uNumSoftAP: UInt = 0u,
    public var uNumVirtualStation: UInt = 0u,
)

public data class DOT11_VWIFI_COMBINATION_V3(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumInfrastructure: UInt = 0u,
    public var uNumAdhoc: UInt = 0u,
    public var uNumSoftAP: UInt = 0u,
    public var uNumVirtualStation: UInt = 0u,
    public var uNumWFDGroup: UInt = 0u,
)

public data class DOT11_WEP_OFFLOAD(
    public var uReserved: UInt = 0u,
    public var hOffloadContext: Foundation.HANDLE = Foundation.HANDLE(),
    public var hOffload: Foundation.HANDLE = Foundation.HANDLE(),
    public var dot11OffloadType: DOT11_OFFLOAD_TYPE = 0,
    public var dwAlgorithm: UInt = 0u,
    public var bRowIsOutbound: Boolean = false,
    public var bUseDefault: Boolean = false,
    public var uFlags: UInt = 0u,
    public var ucMacAddress: UByteArray = UByteArray(6),
    public var uNumOfRWsOnPeer: UInt = 0u,
    public var uNumOfRWsOnMe: UInt = 0u,
    public var dot11IV48Counters: List<DOT11_IV48_COUNTER> = List(16) { DOT11_IV48_COUNTER() },
    public var usDot11RWBitMaps: UShortArray = UShortArray(16),
    public var usKeyLength: UShort = 0u,
    public var ucKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WEP_OFFLOAD) return false
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

public data class DOT11_WEP_UPLOAD(
    public var uReserved: UInt = 0u,
    public var dot11OffloadType: DOT11_OFFLOAD_TYPE = 0,
    public var hOffload: Foundation.HANDLE = Foundation.HANDLE(),
    public var uNumOfRWsUsed: UInt = 0u,
    public var dot11IV48Counters: List<DOT11_IV48_COUNTER> = List(16) { DOT11_IV48_COUNTER() },
    public var usDot11RWBitMaps: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WEP_UPLOAD) return false
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

public data class DOT11_WFD_ADDITIONAL_IE(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uBeaconIEsOffset: UInt = 0u,
    public var uBeaconIEsLength: UInt = 0u,
    public var uProbeResponseIEsOffset: UInt = 0u,
    public var uProbeResponseIEsLength: UInt = 0u,
    public var uDefaultRequestIEsOffset: UInt = 0u,
    public var uDefaultRequestIEsLength: UInt = 0u,
)

public data class DOT11_WFD_ADVERTISED_SERVICE_DESCRIPTOR(
    public var AdvertisementID: UInt = 0u,
    public var ConfigMethods: UShort = 0u,
    public var ServiceNameLength: UByte = 0u,
    public var ServiceName: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_ADVERTISED_SERVICE_DESCRIPTOR) return false
        if (this.AdvertisementID != other.AdvertisementID) return false
        if (this.ConfigMethods != other.ConfigMethods) return false
        if (this.ServiceNameLength != other.ServiceNameLength) return false
        if (!this.ServiceName.contentEquals(other.ServiceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AdvertisementID.hashCode()
        result = 31 * result + this.ConfigMethods.hashCode()
        result = 31 * result + this.ServiceNameLength.hashCode()
        result = 31 * result + this.ServiceName.contentHashCode()
        return result
    }
}

public data class DOT11_WFD_ADVERTISED_SERVICE_LIST(public var ServiceCount: UShort = 0u, public var AdvertisedService: List<DOT11_WFD_ADVERTISED_SERVICE_DESCRIPTOR> = List(1) { DOT11_WFD_ADVERTISED_SERVICE_DESCRIPTOR() })

public data class DOT11_WFD_ADVERTISEMENT_ID(public var AdvertisementID: UInt = 0u, public var ServiceAddress: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_ADVERTISEMENT_ID) return false
        if (this.AdvertisementID != other.AdvertisementID) return false
        if (!this.ServiceAddress.contentEquals(other.ServiceAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AdvertisementID.hashCode()
        result = 31 * result + this.ServiceAddress.contentHashCode()
        return result
    }
}

public data class DOT11_WFD_ATTRIBUTES(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumConcurrentGORole: UInt = 0u,
    public var uNumConcurrentClientRole: UInt = 0u,
    public var WPSVersionsSupported: UInt = 0u,
    public var bServiceDiscoverySupported: Boolean = false,
    public var bClientDiscoverabilitySupported: Boolean = false,
    public var bInfrastructureManagementSupported: Boolean = false,
    public var uMaxSecondaryDeviceTypeListSize: UInt = 0u,
    public var DeviceAddress: UByteArray = UByteArray(6),
    public var uInterfaceAddressListCount: UInt = 0u,
    public var pInterfaceAddressList: Long = 0L,
    public var uNumSupportedCountryOrRegionStrings: UInt = 0u,
    public var pSupportedCountryOrRegionStrings: Long = 0L,
    public var uDiscoveryFilterListSize: UInt = 0u,
    public var uGORoleClientTableSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_ATTRIBUTES) return false
        if (this.Header != other.Header) return false
        if (this.uNumConcurrentGORole != other.uNumConcurrentGORole) return false
        if (this.uNumConcurrentClientRole != other.uNumConcurrentClientRole) return false
        if (this.WPSVersionsSupported != other.WPSVersionsSupported) return false
        if (this.bServiceDiscoverySupported != other.bServiceDiscoverySupported) return false
        if (this.bClientDiscoverabilitySupported != other.bClientDiscoverabilitySupported) return false
        if (this.bInfrastructureManagementSupported != other.bInfrastructureManagementSupported) return false
        if (this.uMaxSecondaryDeviceTypeListSize != other.uMaxSecondaryDeviceTypeListSize) return false
        if (!this.DeviceAddress.contentEquals(other.DeviceAddress)) return false
        if (this.uInterfaceAddressListCount != other.uInterfaceAddressListCount) return false
        if (this.pInterfaceAddressList != other.pInterfaceAddressList) return false
        if (this.uNumSupportedCountryOrRegionStrings != other.uNumSupportedCountryOrRegionStrings) return false
        if (this.pSupportedCountryOrRegionStrings != other.pSupportedCountryOrRegionStrings) return false
        if (this.uDiscoveryFilterListSize != other.uDiscoveryFilterListSize) return false
        if (this.uGORoleClientTableSize != other.uGORoleClientTableSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.uNumConcurrentGORole.hashCode()
        result = 31 * result + this.uNumConcurrentClientRole.hashCode()
        result = 31 * result + this.WPSVersionsSupported.hashCode()
        result = 31 * result + this.bServiceDiscoverySupported.hashCode()
        result = 31 * result + this.bClientDiscoverabilitySupported.hashCode()
        result = 31 * result + this.bInfrastructureManagementSupported.hashCode()
        result = 31 * result + this.uMaxSecondaryDeviceTypeListSize.hashCode()
        result = 31 * result + this.DeviceAddress.contentHashCode()
        result = 31 * result + this.uInterfaceAddressListCount.hashCode()
        result = 31 * result + this.pInterfaceAddressList.hashCode()
        result = 31 * result + this.uNumSupportedCountryOrRegionStrings.hashCode()
        result = 31 * result + this.pSupportedCountryOrRegionStrings.hashCode()
        result = 31 * result + this.uDiscoveryFilterListSize.hashCode()
        result = 31 * result + this.uGORoleClientTableSize.hashCode()
        return result
    }
}

public data class DOT11_WFD_CHANNEL(
    public var CountryRegionString: UByteArray = UByteArray(3),
    public var OperatingClass: UByte = 0u,
    public var ChannelNumber: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_CHANNEL) return false
        if (!this.CountryRegionString.contentEquals(other.CountryRegionString)) return false
        if (this.OperatingClass != other.OperatingClass) return false
        if (this.ChannelNumber != other.ChannelNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CountryRegionString.contentHashCode()
        result = 31 * result + this.OperatingClass.hashCode()
        result = 31 * result + this.ChannelNumber.hashCode()
        return result
    }
}

public data class DOT11_WFD_CONFIGURATION_TIMEOUT(public var GOTimeout: UByte = 0u, public var ClientTimeout: UByte = 0u)

public data class DOT11_WFD_DEVICE_CAPABILITY_CONFIG(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var bServiceDiscoveryEnabled: Boolean = false,
    public var bClientDiscoverabilityEnabled: Boolean = false,
    public var bConcurrentOperationSupported: Boolean = false,
    public var bInfrastructureManagementEnabled: Boolean = false,
    public var bDeviceLimitReached: Boolean = false,
    public var bInvitationProcedureEnabled: Boolean = false,
    public var WPSVersionsEnabled: UInt = 0u,
)

public data class DOT11_WFD_DEVICE_ENTRY(
    public var uPhyId: UInt = 0u,
    public var PhySpecificInfo: DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO = DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO(),
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11BSSType: DOT11_BSS_TYPE = 0,
    public var TransmitterAddress: UByteArray = UByteArray(6),
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
        if (other !is DOT11_WFD_DEVICE_ENTRY) return false
        if (this.uPhyId != other.uPhyId) return false
        if (this.PhySpecificInfo != other.PhySpecificInfo) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (!this.TransmitterAddress.contentEquals(other.TransmitterAddress)) return false
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
        result = 31 * result + this.PhySpecificInfo.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11BSSType.hashCode()
        result = 31 * result + this.TransmitterAddress.contentHashCode()
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

public data class DOT11_WFD_DEVICE_INFO(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var DeviceAddress: UByteArray = UByteArray(6),
    public var ConfigMethods: UShort = 0u,
    public var PrimaryDeviceType: DOT11_WFD_DEVICE_TYPE = DOT11_WFD_DEVICE_TYPE(),
    public var DeviceName: DOT11_WPS_DEVICE_NAME = DOT11_WPS_DEVICE_NAME(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_DEVICE_INFO) return false
        if (this.Header != other.Header) return false
        if (!this.DeviceAddress.contentEquals(other.DeviceAddress)) return false
        if (this.ConfigMethods != other.ConfigMethods) return false
        if (this.PrimaryDeviceType != other.PrimaryDeviceType) return false
        if (this.DeviceName != other.DeviceName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.DeviceAddress.contentHashCode()
        result = 31 * result + this.ConfigMethods.hashCode()
        result = 31 * result + this.PrimaryDeviceType.hashCode()
        result = 31 * result + this.DeviceName.hashCode()
        return result
    }
}

public data class DOT11_WFD_DEVICE_LISTEN_CHANNEL(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var ChannelNumber: UByte = 0u)

public data class DOT11_WFD_DEVICE_TYPE(
    public var CategoryID: UShort = 0u,
    public var SubCategoryID: UShort = 0u,
    public var OUI: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_DEVICE_TYPE) return false
        if (this.CategoryID != other.CategoryID) return false
        if (this.SubCategoryID != other.SubCategoryID) return false
        if (!this.OUI.contentEquals(other.OUI)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CategoryID.hashCode()
        result = 31 * result + this.SubCategoryID.hashCode()
        result = 31 * result + this.OUI.contentHashCode()
        return result
    }
}

public data class DOT11_WFD_DISCOVER_COMPLETE_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var Status: Int = 0,
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var uListOffset: UInt = 0u,
    public var uListLength: UInt = 0u,
)

public data class DOT11_WFD_DISCOVER_DEVICE_FILTER(
    public var DeviceID: UByteArray = UByteArray(6),
    public var ucBitmask: UByte = 0u,
    public var GroupSSID: DOT11_SSID = DOT11_SSID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_DISCOVER_DEVICE_FILTER) return false
        if (!this.DeviceID.contentEquals(other.DeviceID)) return false
        if (this.ucBitmask != other.ucBitmask) return false
        if (this.GroupSSID != other.GroupSSID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceID.contentHashCode()
        result = 31 * result + this.ucBitmask.hashCode()
        result = 31 * result + this.GroupSSID.hashCode()
        return result
    }
}

public data class DOT11_WFD_DISCOVER_REQUEST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var DiscoverType: DOT11_WFD_DISCOVER_TYPE = 0,
    public var ScanType: DOT11_WFD_SCAN_TYPE = 0,
    public var uDiscoverTimeout: UInt = 0u,
    public var uDeviceFilterListOffset: UInt = 0u,
    public var uNumDeviceFilters: UInt = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
    public var bForceScanLegacyNetworks: Boolean = false,
)

public data class DOT11_WFD_GO_INTENT(public var _bitfield: UByte = 0u)

public data class DOT11_WFD_GROUP_ID(public var DeviceAddress: UByteArray = UByteArray(6), public var SSID: DOT11_SSID = DOT11_SSID()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_GROUP_ID) return false
        if (!this.DeviceAddress.contentEquals(other.DeviceAddress)) return false
        if (this.SSID != other.SSID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceAddress.contentHashCode()
        result = 31 * result + this.SSID.hashCode()
        return result
    }
}

public data class DOT11_WFD_GROUP_JOIN_PARAMETERS(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var GOOperatingChannel: DOT11_WFD_CHANNEL = DOT11_WFD_CHANNEL(),
    public var GOConfigTime: UInt = 0u,
    public var bInGroupFormation: Boolean = false,
    public var bWaitForWPSReady: Boolean = false,
)

public data class DOT11_WFD_GROUP_OWNER_CAPABILITY_CONFIG(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var bPersistentGroupEnabled: Boolean = false,
    public var bIntraBSSDistributionSupported: Boolean = false,
    public var bCrossConnectionSupported: Boolean = false,
    public var bPersistentReconnectSupported: Boolean = false,
    public var bGroupFormationEnabled: Boolean = false,
    public var uMaximumGroupLimit: UInt = 0u,
)

public data class DOT11_WFD_GROUP_OWNER_CAPABILITY_CONFIG_V2(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var bPersistentGroupEnabled: Boolean = false,
    public var bIntraBSSDistributionSupported: Boolean = false,
    public var bCrossConnectionSupported: Boolean = false,
    public var bPersistentReconnectSupported: Boolean = false,
    public var bGroupFormationEnabled: Boolean = false,
    public var uMaximumGroupLimit: UInt = 0u,
    public var bEapolKeyIpAddressAllocationSupported: Boolean = false,
)

public data class DOT11_WFD_GROUP_START_PARAMETERS(public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(), public var AdvertisedOperatingChannel: DOT11_WFD_CHANNEL = DOT11_WFD_CHANNEL())

public data class DOT11_WFD_INVITATION_FLAGS(public var _bitfield: UByte = 0u)

public data class DOT11_WFD_SECONDARY_DEVICE_TYPE_LIST(
    public var Header: Ndis.NDIS_OBJECT_HEADER = Ndis.NDIS_OBJECT_HEADER(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var SecondaryDeviceTypes: List<DOT11_WFD_DEVICE_TYPE> = List(1) { DOT11_WFD_DEVICE_TYPE() },
)

public data class DOT11_WFD_SERVICE_HASH_LIST(public var ServiceHashCount: UShort = 0u, public var ServiceHash: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_SERVICE_HASH_LIST) return false
        if (this.ServiceHashCount != other.ServiceHashCount) return false
        if (!this.ServiceHash.contentEquals(other.ServiceHash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ServiceHashCount.hashCode()
        result = 31 * result + this.ServiceHash.contentHashCode()
        return result
    }
}

public data class DOT11_WFD_SESSION_ID(public var SessionID: UInt = 0u, public var SessionAddress: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_SESSION_ID) return false
        if (this.SessionID != other.SessionID) return false
        if (!this.SessionAddress.contentEquals(other.SessionAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SessionID.hashCode()
        result = 31 * result + this.SessionAddress.contentHashCode()
        return result
    }
}

public data class DOT11_WFD_SESSION_INFO(public var uSessionInfoLength: UShort = 0u, public var ucSessionInfo: UByteArray = UByteArray(144)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WFD_SESSION_INFO) return false
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

public data class DOT11_WME_AC_PARAMETERS(
    public var ucAccessCategoryIndex: UByte = 0u,
    public var ucAIFSN: UByte = 0u,
    public var ucECWmin: UByte = 0u,
    public var ucECWmax: UByte = 0u,
    public var usTXOPLimit: UShort = 0u,
)

public data class DOT11_WME_AC_PARAMETERS_LIST(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11WMEACParameters: List<DOT11_WME_AC_PARAMETERS> = List(1) { DOT11_WME_AC_PARAMETERS() },
)

public data class DOT11_WME_UPDATE_IE(
    public var uParamElemMinBeaconIntervals: UInt = 0u,
    public var uWMEInfoElemOffset: UInt = 0u,
    public var uWMEInfoElemLength: UInt = 0u,
    public var uWMEParamElemOffset: UInt = 0u,
    public var uWMEParamElemLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WME_UPDATE_IE) return false
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

public data class DOT11_WPA_TSC(
    public var uReserved: UInt = 0u,
    public var dot11OffloadType: DOT11_OFFLOAD_TYPE = 0,
    public var hOffload: Foundation.HANDLE = Foundation.HANDLE(),
    public var dot11IV48Counter: DOT11_IV48_COUNTER = DOT11_IV48_COUNTER(),
)

public data class DOT11_WPS_DEVICE_NAME(public var uDeviceNameLength: UInt = 0u, public var ucDeviceName: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DOT11_WPS_DEVICE_NAME) return false
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

public data class L2_NOTIFICATION_DATA(
    public var NotificationSource: WLAN_NOTIFICATION_SOURCES = 0u,
    public var NotificationCode: UInt = 0u,
    public var InterfaceGuid: GUID = GUID(),
    public var dwDataSize: UInt = 0u,
    public var pData: Long = 0L,
)

public data class ONEX_AUTH_PARAMS(
    public var fUpdatePending: BOOL = 0,
    public var oneXConnProfile: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
    public var authIdentity: ONEX_AUTH_IDENTITY = 0,
    public var dwQuarantineState: UInt = 0u,
    public var _bitfield: UInt = 0u,
    public var dwSessionId: UInt = 0u,
    public var hUserToken: Foundation.HANDLE = Foundation.HANDLE(),
    public var OneXUserProfile: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
    public var Identity: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
    public var UserName: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
    public var Domain: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
)

public data class ONEX_EAP_ERROR(
    public var dwWinError: UInt = 0u,
    public var type: Security.ExtensibleAuthenticationProtocol.EAP_METHOD_TYPE = Security.ExtensibleAuthenticationProtocol.EAP_METHOD_TYPE(),
    public var dwReasonCode: UInt = 0u,
    public var rootCauseGuid: GUID = GUID(),
    public var repairGuid: GUID = GUID(),
    public var helpLinkGuid: GUID = GUID(),
    public var _bitfield: UInt = 0u,
    public var RootCauseString: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
    public var RepairString: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
)

public data class ONEX_RESULT_UPDATE_DATA(
    public var oneXStatus: ONEX_STATUS = ONEX_STATUS(),
    public var BackendSupport: ONEX_EAP_METHOD_BACKEND_SUPPORT = 0,
    public var fBackendEngaged: BOOL = 0,
    public var _bitfield: UInt = 0u,
    public var authParams: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
    public var eapError: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
)

public data class ONEX_STATUS(
    public var authStatus: ONEX_AUTH_STATUS = 0,
    public var dwReason: UInt = 0u,
    public var dwError: UInt = 0u,
)

public data class ONEX_USER_INFO(
    public var authIdentity: ONEX_AUTH_IDENTITY = 0,
    public var _bitfield: UInt = 0u,
    public var UserName: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
    public var DomainName: ONEX_VARIABLE_BLOB = ONEX_VARIABLE_BLOB(),
)

public data class ONEX_VARIABLE_BLOB(public var dwSize: UInt = 0u, public var dwOffset: UInt = 0u)

public data class WDIAG_IHV_WLAN_ID(
    public var strProfileName: UShortArray = UShortArray(256),
    public var Ssid: DOT11_SSID = DOT11_SSID(),
    public var BssType: DOT11_BSS_TYPE = 0,
    public var dwFlags: UInt = 0u,
    public var dwReasonCode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WDIAG_IHV_WLAN_ID) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.Ssid != other.Ssid) return false
        if (this.BssType != other.BssType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwReasonCode != other.dwReasonCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strProfileName.contentHashCode()
        result = 31 * result + this.Ssid.hashCode()
        result = 31 * result + this.BssType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReasonCode.hashCode()
        return result
    }
}

public data class WFDSVC_CONNECTION_CAPABILITY(
    public var bNew: Boolean = false,
    public var bClient: Boolean = false,
    public var bGO: Boolean = false,
)

public data class WFD_GROUP_ID(public var DeviceAddress: UByteArray = UByteArray(6), public var GroupSSID: DOT11_SSID = DOT11_SSID()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WFD_GROUP_ID) return false
        if (!this.DeviceAddress.contentEquals(other.DeviceAddress)) return false
        if (this.GroupSSID != other.GroupSSID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceAddress.contentHashCode()
        result = 31 * result + this.GroupSSID.hashCode()
        return result
    }
}

public data class WLAN_ASSOCIATION_ATTRIBUTES(
    public var dot11Ssid: DOT11_SSID = DOT11_SSID(),
    public var dot11BssType: DOT11_BSS_TYPE = 0,
    public var dot11Bssid: UByteArray = UByteArray(6),
    public var dot11PhyType: DOT11_PHY_TYPE = 0,
    public var uDot11PhyIndex: UInt = 0u,
    public var wlanSignalQuality: UInt = 0u,
    public var ulRxRate: UInt = 0u,
    public var ulTxRate: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_ASSOCIATION_ATTRIBUTES) return false
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

public data class WLAN_AUTH_CIPHER_PAIR_LIST(public var dwNumberOfItems: UInt = 0u, public var pAuthCipherPairList: List<DOT11_AUTH_CIPHER_PAIR> = List(1) { DOT11_AUTH_CIPHER_PAIR() })

public data class WLAN_AVAILABLE_NETWORK(
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: DOT11_SSID = DOT11_SSID(),
    public var dot11BssType: DOT11_BSS_TYPE = 0,
    public var uNumberOfBssids: UInt = 0u,
    public var bNetworkConnectable: BOOL = 0,
    public var wlanNotConnectableReason: UInt = 0u,
    public var uNumberOfPhyTypes: UInt = 0u,
    public var dot11PhyTypes: IntArray = IntArray(8),
    public var bMorePhyTypes: BOOL = 0,
    public var wlanSignalQuality: UInt = 0u,
    public var bSecurityEnabled: BOOL = 0,
    public var dot11DefaultAuthAlgorithm: DOT11_AUTH_ALGORITHM = 0,
    public var dot11DefaultCipherAlgorithm: DOT11_CIPHER_ALGORITHM = 0,
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_AVAILABLE_NETWORK) return false
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

public data class WLAN_AVAILABLE_NETWORK_LIST(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var Network: List<WLAN_AVAILABLE_NETWORK> = List(1) { WLAN_AVAILABLE_NETWORK() },
)

public data class WLAN_AVAILABLE_NETWORK_LIST_V2(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var Network: List<WLAN_AVAILABLE_NETWORK_V2> = List(1) { WLAN_AVAILABLE_NETWORK_V2() },
)

public class WLAN_AVAILABLE_NETWORK_V2(
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: DOT11_SSID = DOT11_SSID(),
    public var dot11BssType: DOT11_BSS_TYPE = 0,
    public var uNumberOfBssids: UInt = 0u,
    public var bNetworkConnectable: BOOL = 0,
    public var wlanNotConnectableReason: UInt = 0u,
    public var uNumberOfPhyTypes: UInt = 0u,
    public var dot11PhyTypes: IntArray = IntArray(8),
    public var bMorePhyTypes: BOOL = 0,
    public var wlanSignalQuality: UInt = 0u,
    public var bSecurityEnabled: BOOL = 0,
    public var dot11DefaultAuthAlgorithm: DOT11_AUTH_ALGORITHM = 0,
    public var dot11DefaultCipherAlgorithm: DOT11_CIPHER_ALGORITHM = 0,
    public var dwFlags: UInt = 0u,
    public var AccessNetworkOptions: DOT11_ACCESSNETWORKOPTIONS = DOT11_ACCESSNETWORKOPTIONS(),
    public var dot11HESSID: UByteArray = UByteArray(6),
    public var VenueInfo: DOT11_VENUEINFO = DOT11_VENUEINFO(),
    public var dwReserved: UInt = 0u,
)

public data class WLAN_BSS_ENTRY(
    public var dot11Ssid: DOT11_SSID = DOT11_SSID(),
    public var uPhyId: UInt = 0u,
    public var dot11Bssid: UByteArray = UByteArray(6),
    public var dot11BssType: DOT11_BSS_TYPE = 0,
    public var dot11BssPhyType: DOT11_PHY_TYPE = 0,
    public var lRssi: Int = 0,
    public var uLinkQuality: UInt = 0u,
    public var bInRegDomain: Boolean = false,
    public var usBeaconPeriod: UShort = 0u,
    public var ullTimestamp: ULong = 0uL,
    public var ullHostTimestamp: ULong = 0uL,
    public var usCapabilityInformation: UShort = 0u,
    public var ulChCenterFrequency: UInt = 0u,
    public var wlanRateSet: WLAN_RATE_SET = WLAN_RATE_SET(),
    public var ulIeOffset: UInt = 0u,
    public var ulIeSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLAN_BSS_ENTRY) return false
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

public data class WLAN_BSS_LIST(
    public var dwTotalSize: UInt = 0u,
    public var dwNumberOfItems: UInt = 0u,
    public var wlanBssEntries: List<WLAN_BSS_ENTRY> = List(1) { WLAN_BSS_ENTRY() },
)
