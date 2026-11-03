@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.nfc

import io.github.kotlinmania.windowssys.core.GUID

public data class NFCRM_RADIO_STATE(public var MediaRadioOn: Boolean = false)

public data class NFCRM_SET_RADIO_STATE(public var SystemStateUpdate: Boolean = false, public var MediaRadioOn: Boolean = false)

public data class NFC_DATA_BUFFER(public var cbBuffer: UShort = 0u, public var pbBuffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NFC_DATA_BUFFER) return false
        if (this.cbBuffer != other.cbBuffer) return false
        if (!this.pbBuffer.contentEquals(other.pbBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbBuffer.hashCode()
        result = 31 * result + this.pbBuffer.contentHashCode()
        return result
    }
}

public data class NFC_LLCP_CONFIG(
    public var uMIU: UShort = 0u,
    public var uWKS: UShort = 0u,
    public var bLTO: UByte = 0u,
    public var bOptions: UByte = 0u,
    public var fAutoActivate: Boolean = false,
)

public data class NFC_LLCP_SERVICE_DISCOVER_REQUEST(
    public var hRemoteDev: Long = 0L,
    public var NumberOfEntries: UInt = 0u,
    public var ServiceNameEntries: List<NFC_LLCP_SERVICE_NAME_ENTRY> = List(1) { NFC_LLCP_SERVICE_NAME_ENTRY() },
)

public data class NFC_LLCP_SERVICE_DISCOVER_SAP(public var NumberOfEntries: UInt = 0u, public var SAPEntries: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NFC_LLCP_SERVICE_DISCOVER_SAP) return false
        if (this.NumberOfEntries != other.NumberOfEntries) return false
        if (!this.SAPEntries.contentEquals(other.SAPEntries)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumberOfEntries.hashCode()
        result = 31 * result + this.SAPEntries.contentHashCode()
        return result
    }
}

public data class NFC_LLCP_SERVICE_NAME_ENTRY(public var cbServiceName: UInt = 0u, public var pbServiceName: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NFC_LLCP_SERVICE_NAME_ENTRY) return false
        if (this.cbServiceName != other.cbServiceName) return false
        if (!this.pbServiceName.contentEquals(other.pbServiceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbServiceName.hashCode()
        result = 31 * result + this.pbServiceName.contentHashCode()
        return result
    }
}

public data class NFC_LLCP_SOCKET_ACCEPT_INFO(public var hSocket: Long = 0L, public var sSocketOption: NFC_LLCP_SOCKET_OPTION = NFC_LLCP_SOCKET_OPTION())

public data class NFC_LLCP_SOCKET_CL_PAYLOAD(
    public var hSocket: Long = 0L,
    public var bSAP: UByte = 0u,
    public var sPayload: NFC_DATA_BUFFER = NFC_DATA_BUFFER(),
)

public data class NFC_LLCP_SOCKET_CONNECT_INFO(
    public var hRemoteDev: Long = 0L,
    public var hSocket: Long = 0L,
    public var eConnectType: NFC_LLCP_SOCKET_CONNECT_TYPE = 0,
    public var Anonymous: NFC_LLCP_SOCKET_CONNECT_INFO_0 = NFC_LLCP_SOCKET_CONNECT_INFO_0(),
)

public data class NFC_LLCP_SOCKET_CONNECT_INFO_0(public var bSAP: UByte = 0u, public var sServiceName: NFC_LLCP_SERVICE_NAME_ENTRY = NFC_LLCP_SERVICE_NAME_ENTRY())

public data class NFC_LLCP_SOCKET_ERROR_INFO(public var hSocket: Long = 0L, public var eSocketError: NFC_LLCP_SOCKET_ERROR = 0)

public data class NFC_LLCP_SOCKET_INFO(public var eSocketType: NFC_LLCP_SOCKET_TYPE = 0, public var sSocketOption: NFC_LLCP_SOCKET_OPTION = NFC_LLCP_SOCKET_OPTION())

public data class NFC_LLCP_SOCKET_OPTION(public var uMIUX: UShort = 0u, public var bRW: UByte = 0u)

public data class NFC_LLCP_SOCKET_PAYLOAD(
    public var hSocket: Long = 0L,
    public var bSAP: UByte = 0u,
    public var sPayload: NFC_DATA_BUFFER = NFC_DATA_BUFFER(),
)

public data class NFC_LLCP_SOCKET_SERVICE_INFO(
    public var hSocket: Long = 0L,
    public var bSAP: UByte = 0u,
    public var sServiceName: NFC_LLCP_SERVICE_NAME_ENTRY = NFC_LLCP_SERVICE_NAME_ENTRY(),
)

public data class NFC_NDEF_INFO(
    public var fIsNdefFormatted: Boolean = false,
    public var fIsReadOnly: Boolean = false,
    public var dwActualMessageLength: UInt = 0u,
    public var dwMaxMessageLength: UInt = 0u,
)

public data class NFC_P2P_PARAM_CONFIG(
    public var eP2pMode: NFC_P2P_MODE = 0,
    public var cbGeneralBytes: UByte = 0u,
    public var pbGeneralBytes: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NFC_P2P_PARAM_CONFIG) return false
        if (this.eP2pMode != other.eP2pMode) return false
        if (this.cbGeneralBytes != other.cbGeneralBytes) return false
        if (!this.pbGeneralBytes.contentEquals(other.pbGeneralBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eP2pMode.hashCode()
        result = 31 * result + this.cbGeneralBytes.hashCode()
        result = 31 * result + this.pbGeneralBytes.contentHashCode()
        return result
    }
}

public data class NFC_REMOTE_DEVICE_DISCONNET(public var hRemoteDev: Long = 0L, public var eReleaseType: NFC_RELEASE_TYPE = 0)

public data class NFC_REMOTE_DEV_INFO(
    public var hRemoteDev: Long = 0L,
    public var eType: NFC_DEVICE_TYPE = 0,
    public var eRFTech: UByte = 0u,
    public var eProtocol: UByte = 0u,
    public var cbUid: UByte = 0u,
    public var pbUid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NFC_REMOTE_DEV_INFO) return false
        if (this.hRemoteDev != other.hRemoteDev) return false
        if (this.eType != other.eType) return false
        if (this.eRFTech != other.eRFTech) return false
        if (this.eProtocol != other.eProtocol) return false
        if (this.cbUid != other.cbUid) return false
        if (!this.pbUid.contentEquals(other.pbUid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hRemoteDev.hashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eRFTech.hashCode()
        result = 31 * result + this.eProtocol.hashCode()
        result = 31 * result + this.cbUid.hashCode()
        result = 31 * result + this.pbUid.contentHashCode()
        return result
    }
}

public data class NFC_REMOTE_DEV_RECV_INFO(public var hRemoteDev: Long = 0L, public var sRecvBuffer: NFC_DATA_BUFFER = NFC_DATA_BUFFER())

public data class NFC_REMOTE_DEV_SEND_INFO(
    public var hRemoteDev: Long = 0L,
    public var usTimeOut: UShort = 0u,
    public var sSendBuffer: NFC_DATA_BUFFER = NFC_DATA_BUFFER(),
)

public data class NFC_RF_DISCOVERY_CONFIG(
    public var usTotalDuration: UShort = 0u,
    public var ulPollConfig: UInt = 0u,
    public var fDisableCardEmulation: Boolean = false,
    public var ucNfcIPMode: UByte = 0u,
    public var fNfcIPTgtModeDisable: Boolean = false,
    public var ucNfcIPTgtMode: UByte = 0u,
    public var ucNfcCEMode: UByte = 0u,
    public var ucBailoutConfig: UByte = 0u,
    public var ucSystemCode: UByteArray = UByteArray(2),
    public var ucRequestCode: UByte = 0u,
    public var ucTimeSlotNumber: UByte = 0u,
    public var eRfDiscoveryMode: NFC_RF_DISCOVERY_MODE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NFC_RF_DISCOVERY_CONFIG) return false
        if (this.usTotalDuration != other.usTotalDuration) return false
        if (this.ulPollConfig != other.ulPollConfig) return false
        if (this.fDisableCardEmulation != other.fDisableCardEmulation) return false
        if (this.ucNfcIPMode != other.ucNfcIPMode) return false
        if (this.fNfcIPTgtModeDisable != other.fNfcIPTgtModeDisable) return false
        if (this.ucNfcIPTgtMode != other.ucNfcIPTgtMode) return false
        if (this.ucNfcCEMode != other.ucNfcCEMode) return false
        if (this.ucBailoutConfig != other.ucBailoutConfig) return false
        if (!this.ucSystemCode.contentEquals(other.ucSystemCode)) return false
        if (this.ucRequestCode != other.ucRequestCode) return false
        if (this.ucTimeSlotNumber != other.ucTimeSlotNumber) return false
        if (this.eRfDiscoveryMode != other.eRfDiscoveryMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usTotalDuration.hashCode()
        result = 31 * result + this.ulPollConfig.hashCode()
        result = 31 * result + this.fDisableCardEmulation.hashCode()
        result = 31 * result + this.ucNfcIPMode.hashCode()
        result = 31 * result + this.fNfcIPTgtModeDisable.hashCode()
        result = 31 * result + this.ucNfcIPTgtMode.hashCode()
        result = 31 * result + this.ucNfcCEMode.hashCode()
        result = 31 * result + this.ucBailoutConfig.hashCode()
        result = 31 * result + this.ucSystemCode.contentHashCode()
        result = 31 * result + this.ucRequestCode.hashCode()
        result = 31 * result + this.ucTimeSlotNumber.hashCode()
        result = 31 * result + this.eRfDiscoveryMode.hashCode()
        return result
    }
}

public data class NFC_SE_AID_ROUTING_INFO(
    public var hSecureElement: Long = 0L,
    public var bPowerState: UByte = 0u,
    public var cbAid: UInt = 0u,
    public var pbAid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NFC_SE_AID_ROUTING_INFO) return false
        if (this.hSecureElement != other.hSecureElement) return false
        if (this.bPowerState != other.bPowerState) return false
        if (this.cbAid != other.cbAid) return false
        if (!this.pbAid.contentEquals(other.pbAid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSecureElement.hashCode()
        result = 31 * result + this.bPowerState.hashCode()
        result = 31 * result + this.cbAid.hashCode()
        result = 31 * result + this.pbAid.contentHashCode()
        return result
    }
}

public data class NFC_SE_EMULATION_MODE_INFO(public var hSecureElement: Long = 0L, public var eMode: NFC_SE_EMULATION_MODE = 0)

public data class NFC_SE_EVENT_INFO(
    public var hSecureElement: Long = 0L,
    public var eEventType: SECURE_ELEMENT_EVENT_TYPE = 0,
    public var cbEventData: UInt = 0u,
    public var pbEventData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NFC_SE_EVENT_INFO) return false
        if (this.hSecureElement != other.hSecureElement) return false
        if (this.eEventType != other.eEventType) return false
        if (this.cbEventData != other.cbEventData) return false
        if (!this.pbEventData.contentEquals(other.pbEventData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSecureElement.hashCode()
        result = 31 * result + this.eEventType.hashCode()
        result = 31 * result + this.cbEventData.hashCode()
        result = 31 * result + this.pbEventData.contentHashCode()
        return result
    }
}

public data class NFC_SE_INFO(public var hSecureElement: Long = 0L, public var eSecureElementType: SECURE_ELEMENT_TYPE = 0)

public data class NFC_SE_LIST(public var NumberOfEndpoints: UInt = 0u, public var EndpointList: List<NFC_SE_INFO> = List(1) { NFC_SE_INFO() })

public data class NFC_SE_PROTO_ROUTING_INFO(
    public var hSecureElement: Long = 0L,
    public var bPowerState: UByte = 0u,
    public var eRfProtocolType: UByte = 0u,
)

public data class NFC_SE_ROUTING_TABLE(public var NumberOfEntries: UInt = 0u, public var TableEntries: List<NFC_SE_ROUTING_TABLE_ENTRY> = List(1) { NFC_SE_ROUTING_TABLE_ENTRY() })

public data class NFC_SE_ROUTING_TABLE_ENTRY(public var eRoutingType: SECURE_ELEMENT_ROUTING_TYPE = 0, public var Anonymous: NFC_SE_ROUTING_TABLE_ENTRY_0 = NFC_SE_ROUTING_TABLE_ENTRY_0())

public data class NFC_SE_ROUTING_TABLE_ENTRY_0(
    public var TechRoutingInfo: NFC_SE_TECH_ROUTING_INFO = NFC_SE_TECH_ROUTING_INFO(),
    public var ProtoRoutingInfo: NFC_SE_PROTO_ROUTING_INFO = NFC_SE_PROTO_ROUTING_INFO(),
    public var AidRoutingInfo: NFC_SE_AID_ROUTING_INFO = NFC_SE_AID_ROUTING_INFO(),
)

public data class NFC_SE_TECH_ROUTING_INFO(
    public var hSecureElement: Long = 0L,
    public var bPowerState: UByte = 0u,
    public var eRfTechType: UByte = 0u,
)

public data class NFC_SNEP_CLIENT_GET_INFO(public var hSnepClient: Long = 0L, public var sGetPayload: NFC_DATA_BUFFER = NFC_DATA_BUFFER())

public data class NFC_SNEP_CLIENT_INFO(
    public var hRemoteDev: Long = 0L,
    public var eServerType: NFC_SNEP_SERVER_TYPE = 0,
    public var sSocketOption: NFC_LLCP_SOCKET_OPTION = NFC_LLCP_SOCKET_OPTION(),
    public var sService: NFC_LLCP_SERVICE_NAME_ENTRY = NFC_LLCP_SERVICE_NAME_ENTRY(),
)

public data class NFC_SNEP_CLIENT_PUT_INFO(public var hSnepClient: Long = 0L, public var sPutPayload: NFC_DATA_BUFFER = NFC_DATA_BUFFER())

public data class NFC_SNEP_SERVER_ACCEPT_INFO(
    public var hSnepServer: Long = 0L,
    public var hConnection: Long = 0L,
    public var sSocketOption: NFC_LLCP_SOCKET_OPTION = NFC_LLCP_SOCKET_OPTION(),
)

public data class NFC_SNEP_SERVER_INFO(
    public var eServerType: NFC_SNEP_SERVER_TYPE = 0,
    public var sSocketOption: NFC_LLCP_SOCKET_OPTION = NFC_LLCP_SOCKET_OPTION(),
    public var usInboxSize: UShort = 0u,
    public var bSAP: UByte = 0u,
    public var sService: NFC_LLCP_SERVICE_NAME_ENTRY = NFC_LLCP_SERVICE_NAME_ENTRY(),
)

public data class NFC_SNEP_SERVER_REQUEST(
    public var hSnepServer: Long = 0L,
    public var hConnection: Long = 0L,
    public var eRequestType: NFC_SNEP_REQUEST_TYPE = 0,
    public var sRequestPayload: NFC_DATA_BUFFER = NFC_DATA_BUFFER(),
)

public data class NFC_SNEP_SERVER_RESPONSE_INFO(
    public var hSnepServer: Long = 0L,
    public var hConnection: Long = 0L,
    public var dwResponseStatus: UInt = 0u,
    public var sResponsePayload: NFC_DATA_BUFFER = NFC_DATA_BUFFER(),
)

public data class SECURE_ELEMENT_AID_ROUTING_INFO(
    public var guidSecureElementId: GUID = GUID(),
    public var cbAid: UInt = 0u,
    public var pbAid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SECURE_ELEMENT_AID_ROUTING_INFO) return false
        if (this.guidSecureElementId != other.guidSecureElementId) return false
        if (this.cbAid != other.cbAid) return false
        if (!this.pbAid.contentEquals(other.pbAid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidSecureElementId.hashCode()
        result = 31 * result + this.cbAid.hashCode()
        result = 31 * result + this.pbAid.contentHashCode()
        return result
    }
}

public data class SECURE_ELEMENT_ENDPOINT_INFO(public var guidSecureElementId: GUID = GUID(), public var eSecureElementType: SECURE_ELEMENT_TYPE = 0)

public data class SECURE_ELEMENT_ENDPOINT_LIST(public var NumberOfEndpoints: UInt = 0u, public var EndpointList: List<SECURE_ELEMENT_ENDPOINT_INFO> = List(1) { SECURE_ELEMENT_ENDPOINT_INFO() })

public data class SECURE_ELEMENT_EVENT_INFO(
    public var guidSecureElementId: GUID = GUID(),
    public var eEventType: SECURE_ELEMENT_EVENT_TYPE = 0,
    public var cbEventData: UInt = 0u,
    public var pbEventData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SECURE_ELEMENT_EVENT_INFO) return false
        if (this.guidSecureElementId != other.guidSecureElementId) return false
        if (this.eEventType != other.eEventType) return false
        if (this.cbEventData != other.cbEventData) return false
        if (!this.pbEventData.contentEquals(other.pbEventData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidSecureElementId.hashCode()
        result = 31 * result + this.eEventType.hashCode()
        result = 31 * result + this.cbEventData.hashCode()
        result = 31 * result + this.pbEventData.contentHashCode()
        return result
    }
}

public data class SECURE_ELEMENT_EVENT_SUBSCRIPTION_INFO(public var guidSecureElementId: GUID = GUID(), public var eEventType: SECURE_ELEMENT_EVENT_TYPE = 0)

public data class SECURE_ELEMENT_HCE_ACTIVATION_PAYLOAD(
    public var bConnectionId: UShort = 0u,
    public var eRfTechType: UByte = 0u,
    public var eRfProtocolType: UByte = 0u,
)

public data class SECURE_ELEMENT_HCE_DATA_PACKET(
    public var bConnectionId: UShort = 0u,
    public var cbPayload: UShort = 0u,
    public var pbPayload: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SECURE_ELEMENT_HCE_DATA_PACKET) return false
        if (this.bConnectionId != other.bConnectionId) return false
        if (this.cbPayload != other.cbPayload) return false
        if (!this.pbPayload.contentEquals(other.pbPayload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bConnectionId.hashCode()
        result = 31 * result + this.cbPayload.hashCode()
        result = 31 * result + this.pbPayload.contentHashCode()
        return result
    }
}

public data class SECURE_ELEMENT_NFCC_CAPABILITIES(
    public var cbMaxRoutingTableSize: UShort = 0u,
    public var IsAidRoutingSupported: Boolean = false,
    public var IsProtocolRoutingSupported: Boolean = false,
    public var IsTechRoutingSupported: Boolean = false,
)

public data class SECURE_ELEMENT_PROTO_ROUTING_INFO(public var guidSecureElementId: GUID = GUID(), public var eRfProtocolType: UByte = 0u)

public data class SECURE_ELEMENT_ROUTING_TABLE(public var NumberOfEntries: UInt = 0u, public var TableEntries: List<SECURE_ELEMENT_ROUTING_TABLE_ENTRY> = List(1) { SECURE_ELEMENT_ROUTING_TABLE_ENTRY() })

public data class SECURE_ELEMENT_ROUTING_TABLE_ENTRY(public var eRoutingType: SECURE_ELEMENT_ROUTING_TYPE = 0, public var Anonymous: SECURE_ELEMENT_ROUTING_TABLE_ENTRY_0 = SECURE_ELEMENT_ROUTING_TABLE_ENTRY_0())

public data class SECURE_ELEMENT_ROUTING_TABLE_ENTRY_0(
    public var TechRoutingInfo: SECURE_ELEMENT_TECH_ROUTING_INFO = SECURE_ELEMENT_TECH_ROUTING_INFO(),
    public var ProtoRoutingInfo: SECURE_ELEMENT_PROTO_ROUTING_INFO = SECURE_ELEMENT_PROTO_ROUTING_INFO(),
    public var AidRoutingInfo: SECURE_ELEMENT_AID_ROUTING_INFO = SECURE_ELEMENT_AID_ROUTING_INFO(),
)

public data class SECURE_ELEMENT_SET_CARD_EMULATION_MODE_INFO(public var guidSecureElementId: GUID = GUID(), public var eMode: SECURE_ELEMENT_CARD_EMULATION_MODE = 0)

public data class SECURE_ELEMENT_SET_POWER_MODE_INFO(public var guidSecureElementId: GUID = GUID(), public var powerMode: SECURE_ELEMENT_POWER_MODE = 0)

public data class SECURE_ELEMENT_TECH_ROUTING_INFO(public var guidSecureElementId: GUID = GUID(), public var eRfTechType: UByte = 0u)
