@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.nfc

import io.github.kotlinmania.windowssys.core.Guid

public data class NfcrmRadioState(public var mediaRadioOn: Boolean = false)

public data class NfcrmSetRadioState(public var systemStateUpdate: Boolean = false, public var mediaRadioOn: Boolean = false)

public data class NfcDataBuffer(public var cbBuffer: UShort = 0u, public var pbBuffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcDataBuffer) return false
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

public data class NfcLlcpConfig(
    public var uMIU: UShort = 0u,
    public var uWKS: UShort = 0u,
    public var bLTO: UByte = 0u,
    public var bOptions: UByte = 0u,
    public var fAutoActivate: Boolean = false,
)

public data class NfcLlcpServiceDiscoverRequest(
    public var hRemoteDev: Int = 0,
    public var numberOfEntries: UInt = 0u,
    public var serviceNameEntries: List<NfcLlcpServiceNameEntry> = List(1) { NfcLlcpServiceNameEntry() },
)

public data class NfcLlcpServiceDiscoverSap(public var numberOfEntries: UInt = 0u, public var sAPEntries: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcLlcpServiceDiscoverSap) return false
        if (this.numberOfEntries != other.numberOfEntries) return false
        if (!this.sAPEntries.contentEquals(other.sAPEntries)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfEntries.hashCode()
        result = 31 * result + this.sAPEntries.contentHashCode()
        return result
    }
}

public data class NfcLlcpServiceNameEntry(public var cbServiceName: UInt = 0u, public var pbServiceName: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcLlcpServiceNameEntry) return false
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

public data class NfcLlcpSocketAcceptInfo(public var hSocket: Int = 0, public var sSocketOption: NfcLlcpSocketOption = NfcLlcpSocketOption())

public data class NfcLlcpSocketClPayload(
    public var hSocket: Int = 0,
    public var bSAP: UByte = 0u,
    public var sPayload: NfcDataBuffer = NfcDataBuffer(),
)

public data class NfcLlcpSocketConnectInfo(
    public var hRemoteDev: Int = 0,
    public var hSocket: Int = 0,
    public var eConnectType: NfcLlcpSocketConnectType = 0,
    public var anonymous: NfcLlcpSocketConnectInfo0 = NfcLlcpSocketConnectInfo0(),
)

public data class NfcLlcpSocketConnectInfo0(public var bSAP: UByte = 0u, public var sServiceName: NfcLlcpServiceNameEntry = NfcLlcpServiceNameEntry())

public data class NfcLlcpSocketErrorInfo(public var hSocket: Int = 0, public var eSocketError: NfcLlcpSocketError = 0)

public data class NfcLlcpSocketInfo(public var eSocketType: NfcLlcpSocketType = 0, public var sSocketOption: NfcLlcpSocketOption = NfcLlcpSocketOption())

public data class NfcLlcpSocketOption(public var uMIUX: UShort = 0u, public var bRW: UByte = 0u)

public data class NfcLlcpSocketPayload(
    public var hSocket: Int = 0,
    public var bSAP: UByte = 0u,
    public var sPayload: NfcDataBuffer = NfcDataBuffer(),
)

public data class NfcLlcpSocketServiceInfo(
    public var hSocket: Int = 0,
    public var bSAP: UByte = 0u,
    public var sServiceName: NfcLlcpServiceNameEntry = NfcLlcpServiceNameEntry(),
)

public data class NfcNdefInfo(
    public var fIsNdefFormatted: Boolean = false,
    public var fIsReadOnly: Boolean = false,
    public var dwActualMessageLength: UInt = 0u,
    public var dwMaxMessageLength: UInt = 0u,
)

public data class NfcP2pParamConfig(
    public var eP2pMode: NfcP2pMode = 0,
    public var cbGeneralBytes: UByte = 0u,
    public var pbGeneralBytes: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcP2pParamConfig) return false
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

public data class NfcRemoteDeviceDisconnet(public var hRemoteDev: Int = 0, public var eReleaseType: NfcReleaseType = 0)

public data class NfcRemoteDevInfo(
    public var hRemoteDev: Int = 0,
    public var eType: NfcDeviceType = 0,
    public var eRFTech: UByte = 0u,
    public var eProtocol: UByte = 0u,
    public var cbUid: UByte = 0u,
    public var pbUid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcRemoteDevInfo) return false
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

public data class NfcRemoteDevRecvInfo(public var hRemoteDev: Int = 0, public var sRecvBuffer: NfcDataBuffer = NfcDataBuffer())

public data class NfcRemoteDevSendInfo(
    public var hRemoteDev: Int = 0,
    public var usTimeOut: UShort = 0u,
    public var sSendBuffer: NfcDataBuffer = NfcDataBuffer(),
)

public data class NfcRfDiscoveryConfig(
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
    public var eRfDiscoveryMode: NfcRfDiscoveryMode = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcRfDiscoveryConfig) return false
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

public data class NfcSeAidRoutingInfo(
    public var hSecureElement: Int = 0,
    public var bPowerState: UByte = 0u,
    public var cbAid: UInt = 0u,
    public var pbAid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcSeAidRoutingInfo) return false
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

public data class NfcSeEmulationModeInfo(public var hSecureElement: Int = 0, public var eMode: NfcSeEmulationMode = 0)

public data class NfcSeEventInfo(
    public var hSecureElement: Int = 0,
    public var eEventType: SecureElementEventType = 0,
    public var cbEventData: UInt = 0u,
    public var pbEventData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfcSeEventInfo) return false
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

public data class NfcSeInfo(public var hSecureElement: Int = 0, public var eSecureElementType: SecureElementType = 0)

public data class NfcSeList(public var numberOfEndpoints: UInt = 0u, public var endpointList: List<NfcSeInfo> = List(1) { NfcSeInfo() })

public data class NfcSeProtoRoutingInfo(
    public var hSecureElement: Int = 0,
    public var bPowerState: UByte = 0u,
    public var eRfProtocolType: UByte = 0u,
)

public data class NfcSeRoutingTable(public var numberOfEntries: UInt = 0u, public var tableEntries: List<NfcSeRoutingTableEntry> = List(1) { NfcSeRoutingTableEntry() })

public data class NfcSeRoutingTableEntry(public var eRoutingType: SecureElementRoutingType = 0, public var anonymous: NfcSeRoutingTableEntry0 = NfcSeRoutingTableEntry0())

public data class NfcSeRoutingTableEntry0(
    public var techRoutingInfo: NfcSeTechRoutingInfo = NfcSeTechRoutingInfo(),
    public var protoRoutingInfo: NfcSeProtoRoutingInfo = NfcSeProtoRoutingInfo(),
    public var aidRoutingInfo: NfcSeAidRoutingInfo = NfcSeAidRoutingInfo(),
)

public data class NfcSeTechRoutingInfo(
    public var hSecureElement: Int = 0,
    public var bPowerState: UByte = 0u,
    public var eRfTechType: UByte = 0u,
)

public data class NfcSnepClientGetInfo(public var hSnepClient: Int = 0, public var sGetPayload: NfcDataBuffer = NfcDataBuffer())

public data class NfcSnepClientInfo(
    public var hRemoteDev: Int = 0,
    public var eServerType: NfcSnepServerType = 0,
    public var sSocketOption: NfcLlcpSocketOption = NfcLlcpSocketOption(),
    public var sService: NfcLlcpServiceNameEntry = NfcLlcpServiceNameEntry(),
)

public data class NfcSnepClientPutInfo(public var hSnepClient: Int = 0, public var sPutPayload: NfcDataBuffer = NfcDataBuffer())

public data class NfcSnepServerAcceptInfo(
    public var hSnepServer: Int = 0,
    public var hConnection: Int = 0,
    public var sSocketOption: NfcLlcpSocketOption = NfcLlcpSocketOption(),
)

public data class NfcSnepServerInfo(
    public var eServerType: NfcSnepServerType = 0,
    public var sSocketOption: NfcLlcpSocketOption = NfcLlcpSocketOption(),
    public var usInboxSize: UShort = 0u,
    public var bSAP: UByte = 0u,
    public var sService: NfcLlcpServiceNameEntry = NfcLlcpServiceNameEntry(),
)

public data class NfcSnepServerRequest(
    public var hSnepServer: Int = 0,
    public var hConnection: Int = 0,
    public var eRequestType: NfcSnepRequestType = 0,
    public var sRequestPayload: NfcDataBuffer = NfcDataBuffer(),
)

public data class NfcSnepServerResponseInfo(
    public var hSnepServer: Int = 0,
    public var hConnection: Int = 0,
    public var dwResponseStatus: UInt = 0u,
    public var sResponsePayload: NfcDataBuffer = NfcDataBuffer(),
)

public data class SecureElementAidRoutingInfo(
    public var guidSecureElementId: Guid = Guid(),
    public var cbAid: UInt = 0u,
    public var pbAid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecureElementAidRoutingInfo) return false
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

public data class SecureElementEndpointInfo(public var guidSecureElementId: Guid = Guid(), public var eSecureElementType: SecureElementType = 0)

public data class SecureElementEndpointList(public var numberOfEndpoints: UInt = 0u, public var endpointList: List<SecureElementEndpointInfo> = List(1) { SecureElementEndpointInfo() })

public data class SecureElementEventInfo(
    public var guidSecureElementId: Guid = Guid(),
    public var eEventType: SecureElementEventType = 0,
    public var cbEventData: UInt = 0u,
    public var pbEventData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecureElementEventInfo) return false
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

public data class SecureElementEventSubscriptionInfo(public var guidSecureElementId: Guid = Guid(), public var eEventType: SecureElementEventType = 0)

public data class SecureElementHceActivationPayload(
    public var bConnectionId: UShort = 0u,
    public var eRfTechType: UByte = 0u,
    public var eRfProtocolType: UByte = 0u,
)

public data class SecureElementHceDataPacket(
    public var bConnectionId: UShort = 0u,
    public var cbPayload: UShort = 0u,
    public var pbPayload: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecureElementHceDataPacket) return false
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

public data class SecureElementNfccCapabilities(
    public var cbMaxRoutingTableSize: UShort = 0u,
    public var isAidRoutingSupported: Boolean = false,
    public var isProtocolRoutingSupported: Boolean = false,
    public var isTechRoutingSupported: Boolean = false,
)

public data class SecureElementProtoRoutingInfo(public var guidSecureElementId: Guid = Guid(), public var eRfProtocolType: UByte = 0u)

public data class SecureElementRoutingTable(public var numberOfEntries: UInt = 0u, public var tableEntries: List<SecureElementRoutingTableEntry> = List(1) { SecureElementRoutingTableEntry() })

public data class SecureElementRoutingTableEntry(public var eRoutingType: SecureElementRoutingType = 0, public var anonymous: SecureElementRoutingTableEntry0 = SecureElementRoutingTableEntry0())

public data class SecureElementRoutingTableEntry0(
    public var techRoutingInfo: SecureElementTechRoutingInfo = SecureElementTechRoutingInfo(),
    public var protoRoutingInfo: SecureElementProtoRoutingInfo = SecureElementProtoRoutingInfo(),
    public var aidRoutingInfo: SecureElementAidRoutingInfo = SecureElementAidRoutingInfo(),
)

public data class SecureElementSetCardEmulationModeInfo(public var guidSecureElementId: Guid = Guid(), public var eMode: SecureElementCardEmulationMode = 0)

public data class SecureElementSetPowerModeInfo(public var guidSecureElementId: Guid = Guid(), public var powerMode: SecureElementPowerMode = 0)

public data class SecureElementTechRoutingInfo(public var guidSecureElementId: Guid = Guid(), public var eRfTechType: UByte = 0u)
