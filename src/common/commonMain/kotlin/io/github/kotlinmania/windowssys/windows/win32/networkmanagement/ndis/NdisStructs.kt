@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis

import io.github.kotlinmania.windowssys.core.GUID

public data class BSSID_INFO(public var BSSID: UByteArray = UByteArray(6), public var PMKID: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BSSID_INFO) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        if (!this.PMKID.contentEquals(other.PMKID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BSSID.contentHashCode()
        result = 31 * result + this.PMKID.contentHashCode()
        return result
    }
}

public data class GEN_GET_NETCARD_TIME(public var ReadTime: ULong = 0uL)

public data class GEN_GET_TIME_CAPS(public var Flags: UInt = 0u, public var ClockPrecision: UInt = 0u)

public data class IF_COUNTED_STRING_LH(public var Length: UShort = 0u, public var String: UShortArray = UShortArray(257)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IF_COUNTED_STRING_LH) return false
        if (this.Length != other.Length) return false
        if (!this.String.contentEquals(other.String)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.String.contentHashCode()
        return result
    }
}

public data class IF_PHYSICAL_ADDRESS_LH(public var Length: UShort = 0u, public var Address: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IF_PHYSICAL_ADDRESS_LH) return false
        if (this.Length != other.Length) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        return result
    }
}

public data class NDIS_802_11_AI_REQFI(
    public var Capabilities: UShort = 0u,
    public var ListenInterval: UShort = 0u,
    public var CurrentAPAddress: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_802_11_AI_REQFI) return false
        if (this.Capabilities != other.Capabilities) return false
        if (this.ListenInterval != other.ListenInterval) return false
        if (!this.CurrentAPAddress.contentEquals(other.CurrentAPAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Capabilities.hashCode()
        result = 31 * result + this.ListenInterval.hashCode()
        result = 31 * result + this.CurrentAPAddress.contentHashCode()
        return result
    }
}

public data class NDIS_802_11_AI_RESFI(
    public var Capabilities: UShort = 0u,
    public var StatusCode: UShort = 0u,
    public var AssociationId: UShort = 0u,
)

public data class NDIS_802_11_ASSOCIATION_INFORMATION(
    public var Length: UInt = 0u,
    public var AvailableRequestFixedIEs: UShort = 0u,
    public var RequestFixedIEs: NDIS_802_11_AI_REQFI = NDIS_802_11_AI_REQFI(),
    public var RequestIELength: UInt = 0u,
    public var OffsetRequestIEs: UInt = 0u,
    public var AvailableResponseFixedIEs: UShort = 0u,
    public var ResponseFixedIEs: NDIS_802_11_AI_RESFI = NDIS_802_11_AI_RESFI(),
    public var ResponseIELength: UInt = 0u,
    public var OffsetResponseIEs: UInt = 0u,
)

public data class NDIS_802_11_AUTHENTICATION_ENCRYPTION(public var AuthModeSupported: NDIS_802_11_AUTHENTICATION_MODE = 0, public var EncryptStatusSupported: NDIS_802_11_WEP_STATUS = 0)

public data class NDIS_802_11_AUTHENTICATION_EVENT(public var Status: NDIS_802_11_STATUS_INDICATION = NDIS_802_11_STATUS_INDICATION(), public var Request: List<NDIS_802_11_AUTHENTICATION_REQUEST> = List(1) { NDIS_802_11_AUTHENTICATION_REQUEST() })

public data class NDIS_802_11_AUTHENTICATION_REQUEST(
    public var Length: UInt = 0u,
    public var Bssid: UByteArray = UByteArray(6),
    public var Flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_802_11_AUTHENTICATION_REQUEST) return false
        if (this.Length != other.Length) return false
        if (!this.Bssid.contentEquals(other.Bssid)) return false
        if (this.Flags != other.Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.Bssid.contentHashCode()
        result = 31 * result + this.Flags.hashCode()
        return result
    }
}

public data class NDIS_802_11_BSSID_LIST(public var NumberOfItems: UInt = 0u, public var Bssid: List<NDIS_WLAN_BSSID> = List(1) { NDIS_WLAN_BSSID() })

public data class NDIS_802_11_BSSID_LIST_EX(public var NumberOfItems: UInt = 0u, public var Bssid: List<NDIS_WLAN_BSSID_EX> = List(1) { NDIS_WLAN_BSSID_EX() })

public data class NDIS_802_11_CAPABILITY(
    public var Length: UInt = 0u,
    public var Version: UInt = 0u,
    public var NoOfPMKIDs: UInt = 0u,
    public var NoOfAuthEncryptPairsSupported: UInt = 0u,
    public var AuthenticationEncryptionSupported: List<NDIS_802_11_AUTHENTICATION_ENCRYPTION> = List(1) { NDIS_802_11_AUTHENTICATION_ENCRYPTION() },
)

public data class NDIS_802_11_CONFIGURATION(
    public var Length: UInt = 0u,
    public var BeaconPeriod: UInt = 0u,
    public var ATIMWindow: UInt = 0u,
    public var DSConfig: UInt = 0u,
    public var FHConfig: NDIS_802_11_CONFIGURATION_FH = NDIS_802_11_CONFIGURATION_FH(),
)

public data class NDIS_802_11_CONFIGURATION_FH(
    public var Length: UInt = 0u,
    public var HopPattern: UInt = 0u,
    public var HopSet: UInt = 0u,
    public var DwellTime: UInt = 0u,
)

public data class NDIS_802_11_FIXED_IEs(
    public var Timestamp: UByteArray = UByteArray(8),
    public var BeaconInterval: UShort = 0u,
    public var Capabilities: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_802_11_FIXED_IEs) return false
        if (!this.Timestamp.contentEquals(other.Timestamp)) return false
        if (this.BeaconInterval != other.BeaconInterval) return false
        if (this.Capabilities != other.Capabilities) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Timestamp.contentHashCode()
        result = 31 * result + this.BeaconInterval.hashCode()
        result = 31 * result + this.Capabilities.hashCode()
        return result
    }
}

public data class NDIS_802_11_KEY(
    public var Length: UInt = 0u,
    public var KeyIndex: UInt = 0u,
    public var KeyLength: UInt = 0u,
    public var BSSID: UByteArray = UByteArray(6),
    public var KeyRSC: ULong = 0uL,
    public var KeyMaterial: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_802_11_KEY) return false
        if (this.Length != other.Length) return false
        if (this.KeyIndex != other.KeyIndex) return false
        if (this.KeyLength != other.KeyLength) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        if (this.KeyRSC != other.KeyRSC) return false
        if (!this.KeyMaterial.contentEquals(other.KeyMaterial)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.KeyIndex.hashCode()
        result = 31 * result + this.KeyLength.hashCode()
        result = 31 * result + this.BSSID.contentHashCode()
        result = 31 * result + this.KeyRSC.hashCode()
        result = 31 * result + this.KeyMaterial.contentHashCode()
        return result
    }
}

public data class NDIS_802_11_NETWORK_TYPE_LIST(public var NumberOfItems: UInt = 0u, public var NetworkType: IntArray = IntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_802_11_NETWORK_TYPE_LIST) return false
        if (this.NumberOfItems != other.NumberOfItems) return false
        if (!this.NetworkType.contentEquals(other.NetworkType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumberOfItems.hashCode()
        result = 31 * result + this.NetworkType.contentHashCode()
        return result
    }
}

public data class NDIS_802_11_NON_BCAST_SSID_LIST(public var NumberOfItems: UInt = 0u, public var Non_Bcast_Ssid: List<NDIS_802_11_SSID> = List(1) { NDIS_802_11_SSID() })

public data class NDIS_802_11_PMKID(
    public var Length: UInt = 0u,
    public var BSSIDInfoCount: UInt = 0u,
    public var BSSIDInfo: List<BSSID_INFO> = List(1) { BSSID_INFO() },
)

public data class NDIS_802_11_PMKID_CANDIDATE_LIST(
    public var Version: UInt = 0u,
    public var NumCandidates: UInt = 0u,
    public var CandidateList: List<PMKID_CANDIDATE> = List(1) { PMKID_CANDIDATE() },
)

public data class NDIS_802_11_REMOVE_KEY(
    public var Length: UInt = 0u,
    public var KeyIndex: UInt = 0u,
    public var BSSID: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_802_11_REMOVE_KEY) return false
        if (this.Length != other.Length) return false
        if (this.KeyIndex != other.KeyIndex) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.KeyIndex.hashCode()
        result = 31 * result + this.BSSID.contentHashCode()
        return result
    }
}

public data class NDIS_802_11_SSID(public var SsidLength: UInt = 0u, public var Ssid: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_802_11_SSID) return false
        if (this.SsidLength != other.SsidLength) return false
        if (!this.Ssid.contentEquals(other.Ssid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SsidLength.hashCode()
        result = 31 * result + this.Ssid.contentHashCode()
        return result
    }
}

public class NDIS_802_11_STATISTICS(
    public var Length: UInt = 0u,
    public var TransmittedFragmentCount: Long = 0L,
    public var MulticastTransmittedFrameCount: Long = 0L,
    public var FailedCount: Long = 0L,
    public var RetryCount: Long = 0L,
    public var MultipleRetryCount: Long = 0L,
    public var RTSSuccessCount: Long = 0L,
    public var RTSFailureCount: Long = 0L,
    public var ACKFailureCount: Long = 0L,
    public var FrameDuplicateCount: Long = 0L,
    public var ReceivedFragmentCount: Long = 0L,
    public var MulticastReceivedFrameCount: Long = 0L,
    public var FCSErrorCount: Long = 0L,
    public var TKIPLocalMICFailures: Long = 0L,
    public var TKIPICVErrorCount: Long = 0L,
    public var TKIPCounterMeasuresInvoked: Long = 0L,
    public var TKIPReplays: Long = 0L,
    public var CCMPFormatErrors: Long = 0L,
    public var CCMPReplays: Long = 0L,
    public var CCMPDecryptErrors: Long = 0L,
    public var FourWayHandshakeFailures: Long = 0L,
    public var WEPUndecryptableCount: Long = 0L,
    public var WEPICVErrorCount: Long = 0L,
    public var DecryptSuccessCount: Long = 0L,
    public var DecryptFailureCount: Long = 0L,
)

public data class NDIS_802_11_STATUS_INDICATION(public var StatusType: NDIS_802_11_STATUS_TYPE = 0)

public data class NDIS_802_11_TEST(
    public var Length: UInt = 0u,
    public var Type: UInt = 0u,
    public var Anonymous: NDIS_802_11_TEST_0 = NDIS_802_11_TEST_0(),
)

public data class NDIS_802_11_TEST_0(public var AuthenticationEvent: NDIS_802_11_AUTHENTICATION_EVENT = NDIS_802_11_AUTHENTICATION_EVENT(), public var RssiTrigger: Int = 0)

public data class NDIS_802_11_VARIABLE_IEs(
    public var ElementID: UByte = 0u,
    public var Length: UByte = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_802_11_VARIABLE_IEs) return false
        if (this.ElementID != other.ElementID) return false
        if (this.Length != other.Length) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ElementID.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class NDIS_802_11_WEP(
    public var Length: UInt = 0u,
    public var KeyIndex: UInt = 0u,
    public var KeyLength: UInt = 0u,
    public var KeyMaterial: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_802_11_WEP) return false
        if (this.Length != other.Length) return false
        if (this.KeyIndex != other.KeyIndex) return false
        if (this.KeyLength != other.KeyLength) return false
        if (!this.KeyMaterial.contentEquals(other.KeyMaterial)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.KeyIndex.hashCode()
        result = 31 * result + this.KeyLength.hashCode()
        result = 31 * result + this.KeyMaterial.contentHashCode()
        return result
    }
}

public class NDIS_CO_DEVICE_PROFILE(
    public var DeviceDescription: NDIS_VAR_DATA_DESC = NDIS_VAR_DATA_DESC(),
    public var DevSpecificInfo: NDIS_VAR_DATA_DESC = NDIS_VAR_DATA_DESC(),
    public var ulTAPISupplementaryPassThru: UInt = 0u,
    public var ulAddressModes: UInt = 0u,
    public var ulNumAddresses: UInt = 0u,
    public var ulBearerModes: UInt = 0u,
    public var ulMaxTxRate: UInt = 0u,
    public var ulMinTxRate: UInt = 0u,
    public var ulMaxRxRate: UInt = 0u,
    public var ulMinRxRate: UInt = 0u,
    public var ulMediaModes: UInt = 0u,
    public var ulGenerateToneModes: UInt = 0u,
    public var ulGenerateToneMaxNumFreq: UInt = 0u,
    public var ulGenerateDigitModes: UInt = 0u,
    public var ulMonitorToneMaxNumFreq: UInt = 0u,
    public var ulMonitorToneMaxNumEntries: UInt = 0u,
    public var ulMonitorDigitModes: UInt = 0u,
    public var ulGatherDigitsMinTimeout: UInt = 0u,
    public var ulGatherDigitsMaxTimeout: UInt = 0u,
    public var ulDevCapFlags: UInt = 0u,
    public var ulMaxNumActiveCalls: UInt = 0u,
    public var ulAnswerMode: UInt = 0u,
    public var ulUUIAcceptSize: UInt = 0u,
    public var ulUUIAnswerSize: UInt = 0u,
    public var ulUUIMakeCallSize: UInt = 0u,
    public var ulUUIDropSize: UInt = 0u,
    public var ulUUISendUserUserInfoSize: UInt = 0u,
    public var ulUUICallInfoSize: UInt = 0u,
)

public data class NDIS_CO_LINK_SPEED(public var Outbound: UInt = 0u, public var Inbound: UInt = 0u)

public data class NDIS_GUID(
    public var Guid: GUID = GUID(),
    public var Anonymous: NDIS_GUID_0 = NDIS_GUID_0(),
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class NDIS_GUID_0(public var Oid: UInt = 0u, public var Status: Int = 0)

public data class NDIS_HARDWARE_CROSSTIMESTAMP(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Flags: UInt = 0u,
    public var SystemTimestamp1: ULong = 0uL,
    public var HardwareClockTimestamp: ULong = 0uL,
    public var SystemTimestamp2: ULong = 0uL,
)

public class NDIS_INTERFACE_INFORMATION(
    public var ifOperStatus: NET_IF_OPER_STATUS = 0,
    public var ifOperStatusFlags: UInt = 0u,
    public var MediaConnectState: NET_IF_MEDIA_CONNECT_STATE = 0,
    public var MediaDuplexState: NET_IF_MEDIA_DUPLEX_STATE = 0,
    public var ifMtu: UInt = 0u,
    public var ifPromiscuousMode: Boolean = false,
    public var ifDeviceWakeUpEnable: Boolean = false,
    public var XmitLinkSpeed: ULong = 0uL,
    public var RcvLinkSpeed: ULong = 0uL,
    public var ifLastChange: ULong = 0uL,
    public var ifCounterDiscontinuityTime: ULong = 0uL,
    public var ifInUnknownProtos: ULong = 0uL,
    public var ifInDiscards: ULong = 0uL,
    public var ifInErrors: ULong = 0uL,
    public var ifHCInOctets: ULong = 0uL,
    public var ifHCInUcastPkts: ULong = 0uL,
    public var ifHCInMulticastPkts: ULong = 0uL,
    public var ifHCInBroadcastPkts: ULong = 0uL,
    public var ifHCOutOctets: ULong = 0uL,
    public var ifHCOutUcastPkts: ULong = 0uL,
    public var ifHCOutMulticastPkts: ULong = 0uL,
    public var ifHCOutBroadcastPkts: ULong = 0uL,
    public var ifOutErrors: ULong = 0uL,
    public var ifOutDiscards: ULong = 0uL,
    public var ifHCInUcastOctets: ULong = 0uL,
    public var ifHCInMulticastOctets: ULong = 0uL,
    public var ifHCInBroadcastOctets: ULong = 0uL,
    public var ifHCOutUcastOctets: ULong = 0uL,
    public var ifHCOutMulticastOctets: ULong = 0uL,
    public var ifHCOutBroadcastOctets: ULong = 0uL,
    public var CompartmentId: NET_IF_COMPARTMENT_ID = 0u,
    public var SupportedStatistics: UInt = 0u,
)

public data class NDIS_INTERRUPT_MODERATION_PARAMETERS(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Flags: UInt = 0u,
    public var InterruptModeration: NDIS_INTERRUPT_MODERATION = 0,
)

public data class NDIS_IPSEC_OFFLOAD_V1(
    public var Supported: NDIS_IPSEC_OFFLOAD_V1_0 = NDIS_IPSEC_OFFLOAD_V1_0(),
    public var IPv4AH: NDIS_IPSEC_OFFLOAD_V1_1 = NDIS_IPSEC_OFFLOAD_V1_1(),
    public var IPv4ESP: NDIS_IPSEC_OFFLOAD_V1_2 = NDIS_IPSEC_OFFLOAD_V1_2(),
)

public data class NDIS_IPSEC_OFFLOAD_V1_1(public var _bitfield: UInt = 0u)

public data class NDIS_IPSEC_OFFLOAD_V1_2(public var _bitfield: UInt = 0u)

public data class NDIS_IPSEC_OFFLOAD_V1_0(
    public var Encapsulation: UInt = 0u,
    public var AhEspCombined: UInt = 0u,
    public var TransportTunnelCombined: UInt = 0u,
    public var IPv4Options: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class NDIS_IP_OPER_STATE(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Flags: UInt = 0u,
    public var IpOperationalStatus: NDIS_IP_OPER_STATUS = NDIS_IP_OPER_STATUS(),
)

public data class NDIS_IP_OPER_STATUS(
    public var AddressFamily: UInt = 0u,
    public var OperationalStatus: NET_IF_OPER_STATUS = 0,
    public var OperationalStatusFlags: UInt = 0u,
)

public data class NDIS_IP_OPER_STATUS_INFO(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Flags: UInt = 0u,
    public var NumberofAddressFamiliesReturned: UInt = 0u,
    public var IpOperationalStatus: List<NDIS_IP_OPER_STATUS> = List(32) { NDIS_IP_OPER_STATUS() },
)

public data class NDIS_IRDA_PACKET_INFO(public var ExtraBOFs: UInt = 0u, public var MinTurnAroundTime: UInt = 0u)

public data class NDIS_LINK_PARAMETERS(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var MediaDuplexState: NET_IF_MEDIA_DUPLEX_STATE = 0,
    public var XmitLinkSpeed: ULong = 0uL,
    public var RcvLinkSpeed: ULong = 0uL,
    public var PauseFunctions: NDIS_SUPPORTED_PAUSE_FUNCTIONS = 0,
    public var AutoNegotiationFlags: UInt = 0u,
)

public data class NDIS_LINK_SPEED(public var XmitLinkSpeed: ULong = 0uL, public var RcvLinkSpeed: ULong = 0uL)

public data class NDIS_LINK_STATE(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var MediaConnectState: NET_IF_MEDIA_CONNECT_STATE = 0,
    public var MediaDuplexState: NET_IF_MEDIA_DUPLEX_STATE = 0,
    public var XmitLinkSpeed: ULong = 0uL,
    public var RcvLinkSpeed: ULong = 0uL,
    public var PauseFunctions: NDIS_SUPPORTED_PAUSE_FUNCTIONS = 0,
    public var AutoNegotiationFlags: UInt = 0u,
)

public data class NDIS_OBJECT_HEADER(
    public var Type: UByte = 0u,
    public var Revision: UByte = 0u,
    public var Size: UShort = 0u,
)

public data class NDIS_OFFLOAD(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Checksum: NDIS_TCP_IP_CHECKSUM_OFFLOAD = NDIS_TCP_IP_CHECKSUM_OFFLOAD(),
    public var LsoV1: NDIS_TCP_LARGE_SEND_OFFLOAD_V1 = NDIS_TCP_LARGE_SEND_OFFLOAD_V1(),
    public var IPsecV1: NDIS_IPSEC_OFFLOAD_V1 = NDIS_IPSEC_OFFLOAD_V1(),
    public var LsoV2: NDIS_TCP_LARGE_SEND_OFFLOAD_V2 = NDIS_TCP_LARGE_SEND_OFFLOAD_V2(),
    public var Flags: UInt = 0u,
)

public data class NDIS_OFFLOAD_PARAMETERS(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var IPv4Checksum: UByte = 0u,
    public var TCPIPv4Checksum: UByte = 0u,
    public var UDPIPv4Checksum: UByte = 0u,
    public var TCPIPv6Checksum: UByte = 0u,
    public var UDPIPv6Checksum: UByte = 0u,
    public var LsoV1: UByte = 0u,
    public var IPsecV1: UByte = 0u,
    public var LsoV2IPv4: UByte = 0u,
    public var LsoV2IPv6: UByte = 0u,
    public var TcpConnectionIPv4: UByte = 0u,
    public var TcpConnectionIPv6: UByte = 0u,
    public var Flags: UInt = 0u,
)

public data class NDIS_OPER_STATE(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var OperationalStatus: NET_IF_OPER_STATUS = 0,
    public var OperationalStatusFlags: UInt = 0u,
)

public data class NDIS_PCI_DEVICE_CUSTOM_PROPERTIES(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var DeviceType: UInt = 0u,
    public var CurrentSpeedAndMode: UInt = 0u,
    public var CurrentPayloadSize: UInt = 0u,
    public var MaxPayloadSize: UInt = 0u,
    public var MaxReadRequestSize: UInt = 0u,
    public var CurrentLinkSpeed: UInt = 0u,
    public var CurrentLinkWidth: UInt = 0u,
    public var MaxLinkSpeed: UInt = 0u,
    public var MaxLinkWidth: UInt = 0u,
    public var PciExpressVersion: UInt = 0u,
    public var InterruptType: UInt = 0u,
    public var MaxInterruptMessages: UInt = 0u,
)

public data class NDIS_PM_PACKET_PATTERN(
    public var Priority: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var MaskSize: UInt = 0u,
    public var PatternOffset: UInt = 0u,
    public var PatternSize: UInt = 0u,
    public var PatternFlags: UInt = 0u,
)

public data class NDIS_PM_WAKE_UP_CAPABILITIES(
    public var MinMagicPacketWakeUp: NDIS_DEVICE_POWER_STATE = 0,
    public var MinPatternWakeUp: NDIS_DEVICE_POWER_STATE = 0,
    public var MinLinkChangeWakeUp: NDIS_DEVICE_POWER_STATE = 0,
)

public data class NDIS_PNP_CAPABILITIES(public var Flags: UInt = 0u, public var WakeUpCapabilities: NDIS_PM_WAKE_UP_CAPABILITIES = NDIS_PM_WAKE_UP_CAPABILITIES())

public data class NDIS_PORT(
    public var Next: Long = 0L,
    public var NdisReserved: Long = 0L,
    public var MiniportReserved: Long = 0L,
    public var ProtocolReserved: Long = 0L,
    public var PortCharacteristics: NDIS_PORT_CHARACTERISTICS = NDIS_PORT_CHARACTERISTICS(),
)

public data class NDIS_PORT_ARRAY(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var NumberOfPorts: UInt = 0u,
    public var OffsetFirstPort: UInt = 0u,
    public var ElementSize: UInt = 0u,
    public var Ports: List<NDIS_PORT_CHARACTERISTICS> = List(1) { NDIS_PORT_CHARACTERISTICS() },
)

public data class NDIS_PORT_AUTHENTICATION_PARAMETERS(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var SendControlState: NDIS_PORT_CONTROL_STATE = 0,
    public var RcvControlState: NDIS_PORT_CONTROL_STATE = 0,
    public var SendAuthorizationState: NDIS_PORT_AUTHORIZATION_STATE = 0,
    public var RcvAuthorizationState: NDIS_PORT_AUTHORIZATION_STATE = 0,
)

public data class NDIS_PORT_CHARACTERISTICS(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var PortNumber: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Type: NDIS_PORT_TYPE = 0,
    public var MediaConnectState: NET_IF_MEDIA_CONNECT_STATE = 0,
    public var XmitLinkSpeed: ULong = 0uL,
    public var RcvLinkSpeed: ULong = 0uL,
    public var Direction: NET_IF_DIRECTION_TYPE = 0,
    public var SendControlState: NDIS_PORT_CONTROL_STATE = 0,
    public var RcvControlState: NDIS_PORT_CONTROL_STATE = 0,
    public var SendAuthorizationState: NDIS_PORT_AUTHORIZATION_STATE = 0,
    public var RcvAuthorizationState: NDIS_PORT_AUTHORIZATION_STATE = 0,
)

public data class NDIS_PORT_STATE(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var MediaConnectState: NET_IF_MEDIA_CONNECT_STATE = 0,
    public var XmitLinkSpeed: ULong = 0uL,
    public var RcvLinkSpeed: ULong = 0uL,
    public var Direction: NET_IF_DIRECTION_TYPE = 0,
    public var SendControlState: NDIS_PORT_CONTROL_STATE = 0,
    public var RcvControlState: NDIS_PORT_CONTROL_STATE = 0,
    public var SendAuthorizationState: NDIS_PORT_AUTHORIZATION_STATE = 0,
    public var RcvAuthorizationState: NDIS_PORT_AUTHORIZATION_STATE = 0,
    public var Flags: UInt = 0u,
)

public data class NDIS_RECEIVE_HASH_PARAMETERS(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Flags: UInt = 0u,
    public var HashInformation: UInt = 0u,
    public var HashSecretKeySize: UShort = 0u,
    public var HashSecretKeyOffset: UInt = 0u,
)

public data class NDIS_RECEIVE_SCALE_CAPABILITIES(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var CapabilitiesFlags: UInt = 0u,
    public var NumberOfInterruptMessages: UInt = 0u,
    public var NumberOfReceiveQueues: UInt = 0u,
)

public data class NDIS_RECEIVE_SCALE_PARAMETERS(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Flags: UShort = 0u,
    public var BaseCpuNumber: UShort = 0u,
    public var HashInformation: UInt = 0u,
    public var IndirectionTableSize: UShort = 0u,
    public var IndirectionTableOffset: UInt = 0u,
    public var HashSecretKeySize: UShort = 0u,
    public var HashSecretKeyOffset: UInt = 0u,
)

public class NDIS_STATISTICS_INFO(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var SupportedStatistics: UInt = 0u,
    public var ifInDiscards: ULong = 0uL,
    public var ifInErrors: ULong = 0uL,
    public var ifHCInOctets: ULong = 0uL,
    public var ifHCInUcastPkts: ULong = 0uL,
    public var ifHCInMulticastPkts: ULong = 0uL,
    public var ifHCInBroadcastPkts: ULong = 0uL,
    public var ifHCOutOctets: ULong = 0uL,
    public var ifHCOutUcastPkts: ULong = 0uL,
    public var ifHCOutMulticastPkts: ULong = 0uL,
    public var ifHCOutBroadcastPkts: ULong = 0uL,
    public var ifOutErrors: ULong = 0uL,
    public var ifOutDiscards: ULong = 0uL,
    public var ifHCInUcastOctets: ULong = 0uL,
    public var ifHCInMulticastOctets: ULong = 0uL,
    public var ifHCInBroadcastOctets: ULong = 0uL,
    public var ifHCOutUcastOctets: ULong = 0uL,
    public var ifHCOutMulticastOctets: ULong = 0uL,
    public var ifHCOutBroadcastOctets: ULong = 0uL,
)

public data class NDIS_STATISTICS_VALUE(
    public var Oid: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_STATISTICS_VALUE) return false
        if (this.Oid != other.Oid) return false
        if (this.DataLength != other.DataLength) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Oid.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class NDIS_STATISTICS_VALUE_EX(
    public var Oid: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var Length: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_STATISTICS_VALUE_EX) return false
        if (this.Oid != other.Oid) return false
        if (this.DataLength != other.DataLength) return false
        if (this.Length != other.Length) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Oid.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class NDIS_TCP_CONNECTION_OFFLOAD(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Encapsulation: UInt = 0u,
    public var _bitfield: UInt = 0u,
    public var TcpConnectionOffloadCapacity: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class NDIS_TCP_IP_CHECKSUM_OFFLOAD(
    public var IPv4Transmit: NDIS_TCP_IP_CHECKSUM_OFFLOAD_0 = NDIS_TCP_IP_CHECKSUM_OFFLOAD_0(),
    public var IPv4Receive: NDIS_TCP_IP_CHECKSUM_OFFLOAD_1 = NDIS_TCP_IP_CHECKSUM_OFFLOAD_1(),
    public var IPv6Transmit: NDIS_TCP_IP_CHECKSUM_OFFLOAD_2 = NDIS_TCP_IP_CHECKSUM_OFFLOAD_2(),
    public var IPv6Receive: NDIS_TCP_IP_CHECKSUM_OFFLOAD_3 = NDIS_TCP_IP_CHECKSUM_OFFLOAD_3(),
)

public data class NDIS_TCP_IP_CHECKSUM_OFFLOAD_1(public var Encapsulation: UInt = 0u, public var _bitfield: UInt = 0u)

public data class NDIS_TCP_IP_CHECKSUM_OFFLOAD_0(public var Encapsulation: UInt = 0u, public var _bitfield: UInt = 0u)

public data class NDIS_TCP_IP_CHECKSUM_OFFLOAD_3(public var Encapsulation: UInt = 0u, public var _bitfield: UInt = 0u)

public data class NDIS_TCP_IP_CHECKSUM_OFFLOAD_2(public var Encapsulation: UInt = 0u, public var _bitfield: UInt = 0u)

public data class NDIS_TCP_LARGE_SEND_OFFLOAD_V1(public var IPv4: NDIS_TCP_LARGE_SEND_OFFLOAD_V1_0 = NDIS_TCP_LARGE_SEND_OFFLOAD_V1_0())

public data class NDIS_TCP_LARGE_SEND_OFFLOAD_V1_0(
    public var Encapsulation: UInt = 0u,
    public var MaxOffLoadSize: UInt = 0u,
    public var MinSegmentCount: UInt = 0u,
    public var _bitfield: UInt = 0u,
)

public data class NDIS_TCP_LARGE_SEND_OFFLOAD_V2(public var IPv4: NDIS_TCP_LARGE_SEND_OFFLOAD_V2_0 = NDIS_TCP_LARGE_SEND_OFFLOAD_V2_0(), public var IPv6: NDIS_TCP_LARGE_SEND_OFFLOAD_V2_1 = NDIS_TCP_LARGE_SEND_OFFLOAD_V2_1())

public data class NDIS_TCP_LARGE_SEND_OFFLOAD_V2_0(
    public var Encapsulation: UInt = 0u,
    public var MaxOffLoadSize: UInt = 0u,
    public var MinSegmentCount: UInt = 0u,
)

public data class NDIS_TCP_LARGE_SEND_OFFLOAD_V2_1(
    public var Encapsulation: UInt = 0u,
    public var MaxOffLoadSize: UInt = 0u,
    public var MinSegmentCount: UInt = 0u,
    public var _bitfield: UInt = 0u,
)

public data class NDIS_TIMEOUT_DPC_REQUEST_CAPABILITIES(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Flags: UInt = 0u,
    public var TimeoutArrayLength: UInt = 0u,
    public var TimeoutArray: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_TIMEOUT_DPC_REQUEST_CAPABILITIES) return false
        if (this.Header != other.Header) return false
        if (this.Flags != other.Flags) return false
        if (this.TimeoutArrayLength != other.TimeoutArrayLength) return false
        if (!this.TimeoutArray.contentEquals(other.TimeoutArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.TimeoutArrayLength.hashCode()
        result = 31 * result + this.TimeoutArray.contentHashCode()
        return result
    }
}

public data class NDIS_TIMESTAMP_CAPABILITIES(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var HardwareClockFrequencyHz: ULong = 0uL,
    public var CrossTimestamp: Boolean = false,
    public var Reserved1: ULong = 0uL,
    public var Reserved2: ULong = 0uL,
    public var TimestampFlags: NDIS_TIMESTAMP_CAPABILITY_FLAGS = NDIS_TIMESTAMP_CAPABILITY_FLAGS(),
)

public data class NDIS_TIMESTAMP_CAPABILITY_FLAGS(
    public var PtpV2OverUdpIPv4EventMsgReceiveHw: Boolean = false,
    public var PtpV2OverUdpIPv4AllMsgReceiveHw: Boolean = false,
    public var PtpV2OverUdpIPv4EventMsgTransmitHw: Boolean = false,
    public var PtpV2OverUdpIPv4AllMsgTransmitHw: Boolean = false,
    public var PtpV2OverUdpIPv6EventMsgReceiveHw: Boolean = false,
    public var PtpV2OverUdpIPv6AllMsgReceiveHw: Boolean = false,
    public var PtpV2OverUdpIPv6EventMsgTransmitHw: Boolean = false,
    public var PtpV2OverUdpIPv6AllMsgTransmitHw: Boolean = false,
    public var AllReceiveHw: Boolean = false,
    public var AllTransmitHw: Boolean = false,
    public var TaggedTransmitHw: Boolean = false,
    public var AllReceiveSw: Boolean = false,
    public var AllTransmitSw: Boolean = false,
    public var TaggedTransmitSw: Boolean = false,
)

public data class NDIS_VAR_DATA_DESC(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Offset: ULong = 0uL,
)

public data class NDIS_WAN_PROTOCOL_CAPS(public var Flags: UInt = 0u, public var Reserved: UInt = 0u)

public data class NDIS_WLAN_BSSID(
    public var Length: UInt = 0u,
    public var MacAddress: UByteArray = UByteArray(6),
    public var Reserved: UByteArray = UByteArray(2),
    public var Ssid: NDIS_802_11_SSID = NDIS_802_11_SSID(),
    public var Privacy: UInt = 0u,
    public var Rssi: Int = 0,
    public var NetworkTypeInUse: NDIS_802_11_NETWORK_TYPE = 0,
    public var Configuration: NDIS_802_11_CONFIGURATION = NDIS_802_11_CONFIGURATION(),
    public var InfrastructureMode: NDIS_802_11_NETWORK_INFRASTRUCTURE = 0,
    public var SupportedRates: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_WLAN_BSSID) return false
        if (this.Length != other.Length) return false
        if (!this.MacAddress.contentEquals(other.MacAddress)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Ssid != other.Ssid) return false
        if (this.Privacy != other.Privacy) return false
        if (this.Rssi != other.Rssi) return false
        if (this.NetworkTypeInUse != other.NetworkTypeInUse) return false
        if (this.Configuration != other.Configuration) return false
        if (this.InfrastructureMode != other.InfrastructureMode) return false
        if (!this.SupportedRates.contentEquals(other.SupportedRates)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.MacAddress.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Ssid.hashCode()
        result = 31 * result + this.Privacy.hashCode()
        result = 31 * result + this.Rssi.hashCode()
        result = 31 * result + this.NetworkTypeInUse.hashCode()
        result = 31 * result + this.Configuration.hashCode()
        result = 31 * result + this.InfrastructureMode.hashCode()
        result = 31 * result + this.SupportedRates.contentHashCode()
        return result
    }
}

public data class NDIS_WLAN_BSSID_EX(
    public var Length: UInt = 0u,
    public var MacAddress: UByteArray = UByteArray(6),
    public var Reserved: UByteArray = UByteArray(2),
    public var Ssid: NDIS_802_11_SSID = NDIS_802_11_SSID(),
    public var Privacy: UInt = 0u,
    public var Rssi: Int = 0,
    public var NetworkTypeInUse: NDIS_802_11_NETWORK_TYPE = 0,
    public var Configuration: NDIS_802_11_CONFIGURATION = NDIS_802_11_CONFIGURATION(),
    public var InfrastructureMode: NDIS_802_11_NETWORK_INFRASTRUCTURE = 0,
    public var SupportedRates: UByteArray = UByteArray(16),
    public var IELength: UInt = 0u,
    public var IEs: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_WLAN_BSSID_EX) return false
        if (this.Length != other.Length) return false
        if (!this.MacAddress.contentEquals(other.MacAddress)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Ssid != other.Ssid) return false
        if (this.Privacy != other.Privacy) return false
        if (this.Rssi != other.Rssi) return false
        if (this.NetworkTypeInUse != other.NetworkTypeInUse) return false
        if (this.Configuration != other.Configuration) return false
        if (this.InfrastructureMode != other.InfrastructureMode) return false
        if (!this.SupportedRates.contentEquals(other.SupportedRates)) return false
        if (this.IELength != other.IELength) return false
        if (!this.IEs.contentEquals(other.IEs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.MacAddress.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Ssid.hashCode()
        result = 31 * result + this.Privacy.hashCode()
        result = 31 * result + this.Rssi.hashCode()
        result = 31 * result + this.NetworkTypeInUse.hashCode()
        result = 31 * result + this.Configuration.hashCode()
        result = 31 * result + this.InfrastructureMode.hashCode()
        result = 31 * result + this.SupportedRates.contentHashCode()
        result = 31 * result + this.IELength.hashCode()
        result = 31 * result + this.IEs.contentHashCode()
        return result
    }
}

public data class NDIS_WMI_ENUM_ADAPTER(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var IfIndex: UInt = 0u,
    public var NetLuid: NET_LUID_LH = NET_LUID_LH(),
    public var DeviceNameLength: UShort = 0u,
    public var DeviceName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_WMI_ENUM_ADAPTER) return false
        if (this.Header != other.Header) return false
        if (this.IfIndex != other.IfIndex) return false
        if (this.NetLuid != other.NetLuid) return false
        if (this.DeviceNameLength != other.DeviceNameLength) return false
        if (!this.DeviceName.contentEquals(other.DeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.IfIndex.hashCode()
        result = 31 * result + this.NetLuid.hashCode()
        result = 31 * result + this.DeviceNameLength.hashCode()
        result = 31 * result + this.DeviceName.contentHashCode()
        return result
    }
}

public data class NDIS_WMI_EVENT_HEADER(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var IfIndex: UInt = 0u,
    public var NetLuid: NET_LUID_LH = NET_LUID_LH(),
    public var RequestId: ULong = 0uL,
    public var PortNumber: UInt = 0u,
    public var DeviceNameLength: UInt = 0u,
    public var DeviceNameOffset: UInt = 0u,
    public var Padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_WMI_EVENT_HEADER) return false
        if (this.Header != other.Header) return false
        if (this.IfIndex != other.IfIndex) return false
        if (this.NetLuid != other.NetLuid) return false
        if (this.RequestId != other.RequestId) return false
        if (this.PortNumber != other.PortNumber) return false
        if (this.DeviceNameLength != other.DeviceNameLength) return false
        if (this.DeviceNameOffset != other.DeviceNameOffset) return false
        if (!this.Padding.contentEquals(other.Padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.IfIndex.hashCode()
        result = 31 * result + this.NetLuid.hashCode()
        result = 31 * result + this.RequestId.hashCode()
        result = 31 * result + this.PortNumber.hashCode()
        result = 31 * result + this.DeviceNameLength.hashCode()
        result = 31 * result + this.DeviceNameOffset.hashCode()
        result = 31 * result + this.Padding.contentHashCode()
        return result
    }
}

public data class NDIS_WMI_IPSEC_OFFLOAD_V1(
    public var Supported: NDIS_WMI_IPSEC_OFFLOAD_V1_0 = NDIS_WMI_IPSEC_OFFLOAD_V1_0(),
    public var IPv4AH: NDIS_WMI_IPSEC_OFFLOAD_V1_1 = NDIS_WMI_IPSEC_OFFLOAD_V1_1(),
    public var IPv4ESP: NDIS_WMI_IPSEC_OFFLOAD_V1_2 = NDIS_WMI_IPSEC_OFFLOAD_V1_2(),
)

public data class NDIS_WMI_IPSEC_OFFLOAD_V1_1(
    public var Md5: UInt = 0u,
    public var Sha_1: UInt = 0u,
    public var Transport: UInt = 0u,
    public var Tunnel: UInt = 0u,
    public var Send: UInt = 0u,
    public var Receive: UInt = 0u,
)

public data class NDIS_WMI_IPSEC_OFFLOAD_V1_2(
    public var Des: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var TripleDes: UInt = 0u,
    public var NullEsp: UInt = 0u,
    public var Transport: UInt = 0u,
    public var Tunnel: UInt = 0u,
    public var Send: UInt = 0u,
    public var Receive: UInt = 0u,
)

public data class NDIS_WMI_IPSEC_OFFLOAD_V1_0(
    public var Encapsulation: UInt = 0u,
    public var AhEspCombined: UInt = 0u,
    public var TransportTunnelCombined: UInt = 0u,
    public var IPv4Options: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class NDIS_WMI_METHOD_HEADER(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var PortNumber: UInt = 0u,
    public var NetLuid: NET_LUID_LH = NET_LUID_LH(),
    public var RequestId: ULong = 0uL,
    public var Timeout: UInt = 0u,
    public var Padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_WMI_METHOD_HEADER) return false
        if (this.Header != other.Header) return false
        if (this.PortNumber != other.PortNumber) return false
        if (this.NetLuid != other.NetLuid) return false
        if (this.RequestId != other.RequestId) return false
        if (this.Timeout != other.Timeout) return false
        if (!this.Padding.contentEquals(other.Padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PortNumber.hashCode()
        result = 31 * result + this.NetLuid.hashCode()
        result = 31 * result + this.RequestId.hashCode()
        result = 31 * result + this.Timeout.hashCode()
        result = 31 * result + this.Padding.contentHashCode()
        return result
    }
}

public data class NDIS_WMI_OFFLOAD(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Checksum: NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD = NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD(),
    public var LsoV1: NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1 = NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1(),
    public var IPsecV1: NDIS_WMI_IPSEC_OFFLOAD_V1 = NDIS_WMI_IPSEC_OFFLOAD_V1(),
    public var LsoV2: NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2 = NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2(),
    public var Flags: UInt = 0u,
)

public data class NDIS_WMI_OUTPUT_INFO(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Flags: UInt = 0u,
    public var SupportedRevision: UByte = 0u,
    public var DataOffset: UInt = 0u,
)

public data class NDIS_WMI_SET_HEADER(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var PortNumber: UInt = 0u,
    public var NetLuid: NET_LUID_LH = NET_LUID_LH(),
    public var RequestId: ULong = 0uL,
    public var Timeout: UInt = 0u,
    public var Padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NDIS_WMI_SET_HEADER) return false
        if (this.Header != other.Header) return false
        if (this.PortNumber != other.PortNumber) return false
        if (this.NetLuid != other.NetLuid) return false
        if (this.RequestId != other.RequestId) return false
        if (this.Timeout != other.Timeout) return false
        if (!this.Padding.contentEquals(other.Padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.PortNumber.hashCode()
        result = 31 * result + this.NetLuid.hashCode()
        result = 31 * result + this.RequestId.hashCode()
        result = 31 * result + this.Timeout.hashCode()
        result = 31 * result + this.Padding.contentHashCode()
        return result
    }
}

public data class NDIS_WMI_TCP_CONNECTION_OFFLOAD(
    public var Header: NDIS_OBJECT_HEADER = NDIS_OBJECT_HEADER(),
    public var Encapsulation: UInt = 0u,
    public var SupportIPv4: UInt = 0u,
    public var SupportIPv6: UInt = 0u,
    public var SupportIPv6ExtensionHeaders: UInt = 0u,
    public var SupportSack: UInt = 0u,
    public var TcpConnectionOffloadCapacity: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD(
    public var IPv4Transmit: NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_0 = NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_0(),
    public var IPv4Receive: NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_1 = NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_1(),
    public var IPv6Transmit: NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_2 = NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_2(),
    public var IPv6Receive: NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_3 = NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_3(),
)

public data class NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_1(
    public var Encapsulation: UInt = 0u,
    public var IpOptionsSupported: UInt = 0u,
    public var TcpOptionsSupported: UInt = 0u,
    public var TcpChecksum: UInt = 0u,
    public var UdpChecksum: UInt = 0u,
    public var IpChecksum: UInt = 0u,
)

public data class NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_0(
    public var Encapsulation: UInt = 0u,
    public var IpOptionsSupported: UInt = 0u,
    public var TcpOptionsSupported: UInt = 0u,
    public var TcpChecksum: UInt = 0u,
    public var UdpChecksum: UInt = 0u,
    public var IpChecksum: UInt = 0u,
)

public data class NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_3(
    public var Encapsulation: UInt = 0u,
    public var IpExtensionHeadersSupported: UInt = 0u,
    public var TcpOptionsSupported: UInt = 0u,
    public var TcpChecksum: UInt = 0u,
    public var UdpChecksum: UInt = 0u,
)

public data class NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_2(
    public var Encapsulation: UInt = 0u,
    public var IpExtensionHeadersSupported: UInt = 0u,
    public var TcpOptionsSupported: UInt = 0u,
    public var TcpChecksum: UInt = 0u,
    public var UdpChecksum: UInt = 0u,
)

public data class NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1(public var IPv4: NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1_0 = NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1_0())

public data class NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1_0(
    public var Encapsulation: UInt = 0u,
    public var MaxOffLoadSize: UInt = 0u,
    public var MinSegmentCount: UInt = 0u,
    public var TcpOptions: UInt = 0u,
    public var IpOptions: UInt = 0u,
)

public data class NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2(public var IPv4: NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_0 = NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_0(), public var IPv6: NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_1 = NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_1())

public data class NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_0(
    public var Encapsulation: UInt = 0u,
    public var MaxOffLoadSize: UInt = 0u,
    public var MinSegmentCount: UInt = 0u,
)

public data class NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_1(
    public var Encapsulation: UInt = 0u,
    public var MaxOffLoadSize: UInt = 0u,
    public var MinSegmentCount: UInt = 0u,
    public var IpExtensionHeadersSupported: UInt = 0u,
    public var TcpOptionsSupported: UInt = 0u,
)

public class NDK_ADAPTER_INFO(
    public var Version: NDK_VERSION = NDK_VERSION(),
    public var VendorId: UInt = 0u,
    public var DeviceId: UInt = 0u,
    public var MaxRegistrationSize: ULong = 0uL,
    public var MaxWindowSize: ULong = 0uL,
    public var FRMRPageCount: UInt = 0u,
    public var MaxInitiatorRequestSge: UInt = 0u,
    public var MaxReceiveRequestSge: UInt = 0u,
    public var MaxReadRequestSge: UInt = 0u,
    public var MaxTransferLength: UInt = 0u,
    public var MaxInlineDataSize: UInt = 0u,
    public var MaxInboundReadLimit: UInt = 0u,
    public var MaxOutboundReadLimit: UInt = 0u,
    public var MaxReceiveQueueDepth: UInt = 0u,
    public var MaxInitiatorQueueDepth: UInt = 0u,
    public var MaxSrqDepth: UInt = 0u,
    public var MaxCqDepth: UInt = 0u,
    public var LargeRequestThreshold: UInt = 0u,
    public var MaxCallerData: UInt = 0u,
    public var MaxCalleeData: UInt = 0u,
    public var AdapterFlags: UInt = 0u,
    public var RdmaTechnology: NDK_RDMA_TECHNOLOGY = 0,
)

public data class NDK_VERSION(public var Major: UShort = 0u, public var Minor: UShort = 0u)

public data class NETWORK_ADDRESS(
    public var AddressLength: UShort = 0u,
    public var AddressType: UShort = 0u,
    public var Address: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NETWORK_ADDRESS) return false
        if (this.AddressLength != other.AddressLength) return false
        if (this.AddressType != other.AddressType) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AddressLength.hashCode()
        result = 31 * result + this.AddressType.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        return result
    }
}

public data class NETWORK_ADDRESS_IP(
    public var sin_port: UShort = 0u,
    public var IN_ADDR: UInt = 0u,
    public var sin_zero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NETWORK_ADDRESS_IP) return false
        if (this.sin_port != other.sin_port) return false
        if (this.IN_ADDR != other.IN_ADDR) return false
        if (!this.sin_zero.contentEquals(other.sin_zero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin_port.hashCode()
        result = 31 * result + this.IN_ADDR.hashCode()
        result = 31 * result + this.sin_zero.contentHashCode()
        return result
    }
}

public data class NETWORK_ADDRESS_IP6(
    public var sin6_port: UShort = 0u,
    public var sin6_flowinfo: UInt = 0u,
    public var sin6_addr: UShortArray = UShortArray(8),
    public var sin6_scope_id: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NETWORK_ADDRESS_IP6) return false
        if (this.sin6_port != other.sin6_port) return false
        if (this.sin6_flowinfo != other.sin6_flowinfo) return false
        if (!this.sin6_addr.contentEquals(other.sin6_addr)) return false
        if (this.sin6_scope_id != other.sin6_scope_id) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin6_port.hashCode()
        result = 31 * result + this.sin6_flowinfo.hashCode()
        result = 31 * result + this.sin6_addr.contentHashCode()
        result = 31 * result + this.sin6_scope_id.hashCode()
        return result
    }
}

public data class NETWORK_ADDRESS_IPX(
    public var NetworkAddress: UInt = 0u,
    public var NodeAddress: UByteArray = UByteArray(6),
    public var Socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NETWORK_ADDRESS_IPX) return false
        if (this.NetworkAddress != other.NetworkAddress) return false
        if (!this.NodeAddress.contentEquals(other.NodeAddress)) return false
        if (this.Socket != other.Socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NetworkAddress.hashCode()
        result = 31 * result + this.NodeAddress.contentHashCode()
        result = 31 * result + this.Socket.hashCode()
        return result
    }
}

public data class NETWORK_ADDRESS_LIST(
    public var AddressCount: Int = 0,
    public var AddressType: UShort = 0u,
    public var Address: List<NETWORK_ADDRESS> = List(1) { NETWORK_ADDRESS() },
)

public data class NET_IF_ALIAS_LH(public var ifAliasLength: UShort = 0u, public var ifAliasOffset: UShort = 0u)

public data class NET_IF_RCV_ADDRESS_LH(
    public var ifRcvAddressType: NET_IF_RCV_ADDRESS_TYPE = 0,
    public var ifRcvAddressLength: UShort = 0u,
    public var ifRcvAddressOffset: UShort = 0u,
)

public data class NET_LUID_LH(public var Value: ULong = 0uL, public var Info: NET_LUID_LH_0 = NET_LUID_LH_0())

public data class NET_LUID_LH_0(public var _bitfield: ULong = 0uL)

public data class NET_PHYSICAL_LOCATION_LH(
    public var BusNumber: UInt = 0u,
    public var SlotNumber: UInt = 0u,
    public var FunctionNumber: UInt = 0u,
)

public data class OFFLOAD_ALGO_INFO(
    public var algoIdentifier: UInt = 0u,
    public var algoKeylen: UInt = 0u,
    public var algoRounds: UInt = 0u,
)

public data class OFFLOAD_IPSEC_ADD_SA(
    public var SrcAddr: UInt = 0u,
    public var SrcMask: UInt = 0u,
    public var DestAddr: UInt = 0u,
    public var DestMask: UInt = 0u,
    public var Protocol: UInt = 0u,
    public var SrcPort: UShort = 0u,
    public var DestPort: UShort = 0u,
    public var SrcTunnelAddr: UInt = 0u,
    public var DestTunnelAddr: UInt = 0u,
    public var Flags: UShort = 0u,
    public var NumSAs: Short = 0,
    public var SecAssoc: List<OFFLOAD_SECURITY_ASSOCIATION> = List(3) { OFFLOAD_SECURITY_ASSOCIATION() },
    public var OffloadHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var KeyLen: UInt = 0u,
    public var KeyMat: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OFFLOAD_IPSEC_ADD_SA) return false
        if (this.SrcAddr != other.SrcAddr) return false
        if (this.SrcMask != other.SrcMask) return false
        if (this.DestAddr != other.DestAddr) return false
        if (this.DestMask != other.DestMask) return false
        if (this.Protocol != other.Protocol) return false
        if (this.SrcPort != other.SrcPort) return false
        if (this.DestPort != other.DestPort) return false
        if (this.SrcTunnelAddr != other.SrcTunnelAddr) return false
        if (this.DestTunnelAddr != other.DestTunnelAddr) return false
        if (this.Flags != other.Flags) return false
        if (this.NumSAs != other.NumSAs) return false
        if (this.SecAssoc != other.SecAssoc) return false
        if (this.OffloadHandle != other.OffloadHandle) return false
        if (this.KeyLen != other.KeyLen) return false
        if (!this.KeyMat.contentEquals(other.KeyMat)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SrcAddr.hashCode()
        result = 31 * result + this.SrcMask.hashCode()
        result = 31 * result + this.DestAddr.hashCode()
        result = 31 * result + this.DestMask.hashCode()
        result = 31 * result + this.Protocol.hashCode()
        result = 31 * result + this.SrcPort.hashCode()
        result = 31 * result + this.DestPort.hashCode()
        result = 31 * result + this.SrcTunnelAddr.hashCode()
        result = 31 * result + this.DestTunnelAddr.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.NumSAs.hashCode()
        result = 31 * result + this.SecAssoc.hashCode()
        result = 31 * result + this.OffloadHandle.hashCode()
        result = 31 * result + this.KeyLen.hashCode()
        result = 31 * result + this.KeyMat.contentHashCode()
        return result
    }
}

public class OFFLOAD_IPSEC_ADD_UDPESP_SA(
    public var SrcAddr: UInt = 0u,
    public var SrcMask: UInt = 0u,
    public var DstAddr: UInt = 0u,
    public var DstMask: UInt = 0u,
    public var Protocol: UInt = 0u,
    public var SrcPort: UShort = 0u,
    public var DstPort: UShort = 0u,
    public var SrcTunnelAddr: UInt = 0u,
    public var DstTunnelAddr: UInt = 0u,
    public var Flags: UShort = 0u,
    public var NumSAs: Short = 0,
    public var SecAssoc: List<OFFLOAD_SECURITY_ASSOCIATION> = List(3) { OFFLOAD_SECURITY_ASSOCIATION() },
    public var OffloadHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var EncapTypeEntry: OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_ENTRY = OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_ENTRY(),
    public var EncapTypeEntryOffldHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var KeyLen: UInt = 0u,
    public var KeyMat: UByteArray = UByteArray(1),
)

public data class OFFLOAD_IPSEC_DELETE_SA(public var OffloadHandle: Foundation.HANDLE = Foundation.HANDLE())

public data class OFFLOAD_IPSEC_DELETE_UDPESP_SA(public var OffloadHandle: Foundation.HANDLE = Foundation.HANDLE(), public var EncapTypeEntryOffldHandle: Foundation.HANDLE = Foundation.HANDLE())

public data class OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_ENTRY(public var UdpEncapType: UDP_ENCAP_TYPE = 0, public var DstEncapPort: UShort = 0u)

public data class OFFLOAD_SECURITY_ASSOCIATION(
    public var Operation: OFFLOAD_OPERATION_E = 0,
    public var SPI: UInt = 0u,
    public var IntegrityAlgo: OFFLOAD_ALGO_INFO = OFFLOAD_ALGO_INFO(),
    public var ConfAlgo: OFFLOAD_ALGO_INFO = OFFLOAD_ALGO_INFO(),
    public var Reserved: OFFLOAD_ALGO_INFO = OFFLOAD_ALGO_INFO(),
)

public data class PMKID_CANDIDATE(public var BSSID: UByteArray = UByteArray(6), public var Flags: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PMKID_CANDIDATE) return false
        if (!this.BSSID.contentEquals(other.BSSID)) return false
        if (this.Flags != other.Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BSSID.contentHashCode()
        result = 31 * result + this.Flags.hashCode()
        return result
    }
}

public data class TRANSPORT_HEADER_OFFSET(public var ProtocolType: UShort = 0u, public var HeaderOffset: UShort = 0u)
