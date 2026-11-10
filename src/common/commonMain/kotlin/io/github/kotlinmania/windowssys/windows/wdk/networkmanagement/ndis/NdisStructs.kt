@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kdpc
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DmaSpeed
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DmaWidth
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.Ktimer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Flowspec
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfDirectionType
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfMediaConnectState
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfMediaDuplexState
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfOperStatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetLuidLh

public data class BinaryData(
    public var length: UShort = 0u,
    public var buffer: COpaquePointer? = null,
)

public data class BssidInfo(
    public var bssid: UByteArray = UByteArray(6),
    public var pmkid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BssidInfo) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (!this.pmkid.contentEquals(other.pmkid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bssid.contentHashCode()
        result = 31 * result + this.pmkid.contentHashCode()
        return result
    }
}

public data class CoAddress(
    public var addressSize: UInt = 0u,
    public var address: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CoAddress) return false
        if (this.addressSize != other.addressSize) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressSize.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }
}

public data class CoAddressFamily(
    public var addressFamily: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
)

public data class CoAddressList(
    public var numberOfAddressesAvailable: UInt = 0u,
    public var numberOfAddresses: UInt = 0u,
    public var addressList: CoAddress = CoAddress(),
)

public data class CoCallManagerParameters(
    public var transmit: Flowspec = Flowspec(),
    public var receive: Flowspec = Flowspec(),
    public var callMgrSpecific: CoSpecificParameters = CoSpecificParameters(),
)

public data class CoPvc(
    public var ndisAfHandle: COpaquePointer? = null,
    public var pvcParameters: CoSpecificParameters = CoSpecificParameters(),
)

public data class CoSap(
    public var sapType: UInt = 0u,
    public var sapLength: UInt = 0u,
    public var sap: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CoSap) return false
        if (this.sapType != other.sapType) return false
        if (this.sapLength != other.sapLength) return false
        if (!this.sap.contentEquals(other.sap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sapType.hashCode()
        result = 31 * result + this.sapLength.hashCode()
        result = 31 * result + this.sap.contentHashCode()
        return result
    }
}

public data class CoSpecificParameters(
    public var paramType: UInt = 0u,
    public var length: UInt = 0u,
    public var parameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CoSpecificParameters) return false
        if (this.paramType != other.paramType) return false
        if (this.length != other.length) return false
        if (!this.parameters.contentEquals(other.parameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.paramType.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.parameters.contentHashCode()
        return result
    }
}

public data class Filterdbs(
    public var anonymous: Filterdbs0 = Filterdbs0(),
    public var trDB: Int? = null,
    public var yyydb: COpaquePointer? = null,
    public var xxxdb: COpaquePointer? = null,
)

public data class Filterdbs0(
    public var ethDB: Int? = null,
    public var nullDB: Int? = null,
)

public data class GenGetNetcardTime(
    public var readTime: ULong = 0uL,
)

public data class GenGetTimeCaps(
    public var flags: UInt = 0u,
    public var clockPrecision: UInt = 0u,
)

public data class LockState(
    public var lockState: UShort = 0u,
    public var oldIrql: UByte = 0u,
)

public data class MediaSpecificInformation(
    public var nextEntryOffset: UInt = 0u,
    public var classId: NdisClassId = 0,
    public var size: UInt = 0u,
    public var classInformation: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MediaSpecificInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.classId != other.classId) return false
        if (this.size != other.size) return false
        if (!this.classInformation.contentEquals(other.classInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.classId.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.classInformation.contentHashCode()
        return result
    }
}

public data class Ndis80211AiReqfi(
    public var capabilities: UShort = 0u,
    public var listenInterval: UShort = 0u,
    public var currentAPAddress: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211AiReqfi) return false
        if (this.capabilities != other.capabilities) return false
        if (this.listenInterval != other.listenInterval) return false
        if (!this.currentAPAddress.contentEquals(other.currentAPAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capabilities.hashCode()
        result = 31 * result + this.listenInterval.hashCode()
        result = 31 * result + this.currentAPAddress.contentHashCode()
        return result
    }
}

public data class Ndis80211AiResfi(
    public var capabilities: UShort = 0u,
    public var statusCode: UShort = 0u,
    public var associationId: UShort = 0u,
)

public data class Ndis80211AssociationInformation(
    public var length: UInt = 0u,
    public var availableRequestFixedIEs: UShort = 0u,
    public var requestFixedIEs: Ndis80211AiReqfi = Ndis80211AiReqfi(),
    public var requestIELength: UInt = 0u,
    public var offsetRequestIEs: UInt = 0u,
    public var availableResponseFixedIEs: UShort = 0u,
    public var responseFixedIEs: Ndis80211AiResfi = Ndis80211AiResfi(),
    public var responseIELength: UInt = 0u,
    public var offsetResponseIEs: UInt = 0u,
)

public data class Ndis80211AuthenticationEncryption(
    public var authModeSupported: Ndis80211AuthenticationMode = 0,
    public var encryptStatusSupported: Ndis80211WepStatus = 0,
)

public data class Ndis80211AuthenticationEvent(
    public var status: Ndis80211StatusIndication = Ndis80211StatusIndication(),
    public var request: List<Ndis80211AuthenticationRequest> = List(1) { Ndis80211AuthenticationRequest() },
)

public data class Ndis80211AuthenticationRequest(
    public var length: UInt = 0u,
    public var bssid: UByteArray = UByteArray(6),
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211AuthenticationRequest) return false
        if (this.length != other.length) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class Ndis80211BssidList(
    public var numberOfItems: UInt = 0u,
    public var bssid: List<NdisWlanBssid> = List(1) { NdisWlanBssid() },
)

public data class Ndis80211BssidListEx(
    public var numberOfItems: UInt = 0u,
    public var bssid: List<NdisWlanBssidEx> = List(1) { NdisWlanBssidEx() },
)

public data class Ndis80211Capability(
    public var length: UInt = 0u,
    public var version: UInt = 0u,
    public var noOfPMKIDs: UInt = 0u,
    public var noOfAuthEncryptPairsSupported: UInt = 0u,
    public var authenticationEncryptionSupported: List<Ndis80211AuthenticationEncryption> = List(1) { Ndis80211AuthenticationEncryption() },
)

public data class Ndis80211Configuration(
    public var length: UInt = 0u,
    public var beaconPeriod: UInt = 0u,
    public var aTIMWindow: UInt = 0u,
    public var dSConfig: UInt = 0u,
    public var fHConfig: Ndis80211ConfigurationFh = Ndis80211ConfigurationFh(),
)

public data class Ndis80211ConfigurationFh(
    public var length: UInt = 0u,
    public var hopPattern: UInt = 0u,
    public var hopSet: UInt = 0u,
    public var dwellTime: UInt = 0u,
)

public data class Ndis80211FixedIes(
    public var timestamp: UByteArray = UByteArray(8),
    public var beaconInterval: UShort = 0u,
    public var capabilities: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211FixedIes) return false
        if (!this.timestamp.contentEquals(other.timestamp)) return false
        if (this.beaconInterval != other.beaconInterval) return false
        if (this.capabilities != other.capabilities) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timestamp.contentHashCode()
        result = 31 * result + this.beaconInterval.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        return result
    }
}

public data class Ndis80211Key(
    public var length: UInt = 0u,
    public var keyIndex: UInt = 0u,
    public var keyLength: UInt = 0u,
    public var bssid: UByteArray = UByteArray(6),
    public var keyRSC: ULong = 0uL,
    public var keyMaterial: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211Key) return false
        if (this.length != other.length) return false
        if (this.keyIndex != other.keyIndex) return false
        if (this.keyLength != other.keyLength) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.keyRSC != other.keyRSC) return false
        if (!this.keyMaterial.contentEquals(other.keyMaterial)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.keyIndex.hashCode()
        result = 31 * result + this.keyLength.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.keyRSC.hashCode()
        result = 31 * result + this.keyMaterial.contentHashCode()
        return result
    }
}

public data class Ndis80211NetworkTypeList(
    public var numberOfItems: UInt = 0u,
    public var networkType: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211NetworkTypeList) return false
        if (this.numberOfItems != other.numberOfItems) return false
        if (!this.networkType.contentEquals(other.networkType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfItems.hashCode()
        result = 31 * result + this.networkType.contentHashCode()
        return result
    }
}

public data class Ndis80211NonBcastSsidList(
    public var numberOfItems: UInt = 0u,
    public var nonBcastSsid: List<Ndis80211Ssid> = List(1) { Ndis80211Ssid() },
)

public data class Ndis80211Pmkid(
    public var length: UInt = 0u,
    public var bSSIDInfoCount: UInt = 0u,
    public var bSSIDInfo: List<BssidInfo> = List(1) { BssidInfo() },
)

public data class Ndis80211PmkidCandidateList(
    public var version: UInt = 0u,
    public var numCandidates: UInt = 0u,
    public var candidateList: List<PmkidCandidate> = List(1) { PmkidCandidate() },
)

public data class Ndis80211RemoveKey(
    public var length: UInt = 0u,
    public var keyIndex: UInt = 0u,
    public var bssid: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211RemoveKey) return false
        if (this.length != other.length) return false
        if (this.keyIndex != other.keyIndex) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.keyIndex.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        return result
    }
}

public data class Ndis80211Ssid(
    public var ssidLength: UInt = 0u,
    public var ssid: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211Ssid) return false
        if (this.ssidLength != other.ssidLength) return false
        if (!this.ssid.contentEquals(other.ssid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssidLength.hashCode()
        result = 31 * result + this.ssid.contentHashCode()
        return result
    }
}

public class Ndis80211Statistics(
    public var length: UInt = 0u,
    public var transmittedFragmentCount: Long = 0L,
    public var multicastTransmittedFrameCount: Long = 0L,
    public var failedCount: Long = 0L,
    public var retryCount: Long = 0L,
    public var multipleRetryCount: Long = 0L,
    public var rTSSuccessCount: Long = 0L,
    public var rTSFailureCount: Long = 0L,
    public var aCKFailureCount: Long = 0L,
    public var frameDuplicateCount: Long = 0L,
    public var receivedFragmentCount: Long = 0L,
    public var multicastReceivedFrameCount: Long = 0L,
    public var fCSErrorCount: Long = 0L,
    public var tKIPLocalMICFailures: Long = 0L,
    public var tKIPICVErrorCount: Long = 0L,
    public var tKIPCounterMeasuresInvoked: Long = 0L,
    public var tKIPReplays: Long = 0L,
    public var cCMPFormatErrors: Long = 0L,
    public var cCMPReplays: Long = 0L,
    public var cCMPDecryptErrors: Long = 0L,
    public var fourWayHandshakeFailures: Long = 0L,
    public var wEPUndecryptableCount: Long = 0L,
    public var wEPICVErrorCount: Long = 0L,
    public var decryptSuccessCount: Long = 0L,
    public var decryptFailureCount: Long = 0L,
)

public data class Ndis80211StatusIndication(
    public var statusType: Ndis80211StatusType = 0,
)

public data class Ndis80211Test(
    public var length: UInt = 0u,
    public var type: UInt = 0u,
    public var anonymous: Ndis80211Test0 = Ndis80211Test0(),
)

public data class Ndis80211Test0(
    public var authenticationEvent: Ndis80211AuthenticationEvent = Ndis80211AuthenticationEvent(),
    public var rssiTrigger: Int = 0,
)

public data class Ndis80211VariableIes(
    public var elementID: UByte = 0u,
    public var length: UByte = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211VariableIes) return false
        if (this.elementID != other.elementID) return false
        if (this.length != other.length) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elementID.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class Ndis80211Wep(
    public var length: UInt = 0u,
    public var keyIndex: UInt = 0u,
    public var keyLength: UInt = 0u,
    public var keyMaterial: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211Wep) return false
        if (this.length != other.length) return false
        if (this.keyIndex != other.keyIndex) return false
        if (this.keyLength != other.keyLength) return false
        if (!this.keyMaterial.contentEquals(other.keyMaterial)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.keyIndex.hashCode()
        result = 31 * result + this.keyLength.hashCode()
        result = 31 * result + this.keyMaterial.contentHashCode()
        return result
    }
}

public data class NdisConfigurationParameter(
    public var parameterType: NdisParameterType = 0,
    public var parameterData: NdisConfigurationParameter0 = NdisConfigurationParameter0(),
)

public data class NdisConfigurationParameter0(
    public var integerData: UInt = 0u,
    public var stringData: UnicodeString = UnicodeString(),
    public var binaryData: BinaryData = BinaryData(),
)

public class NdisCoDeviceProfile(
    public var deviceDescription: NdisVarDataDesc = NdisVarDataDesc(),
    public var devSpecificInfo: NdisVarDataDesc = NdisVarDataDesc(),
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

public data class NdisCoLinkSpeed(
    public var outbound: UInt = 0u,
    public var inbound: UInt = 0u,
)

public data class NdisDmaBlock(
    public var mapRegisterBase: COpaquePointer? = null,
    public var allocationEvent: Kevent = Kevent(),
    public var systemAdapterObject: COpaquePointer? = null,
    public var miniport: COpaquePointer? = null,
    public var inProgress: Boolean = false,
)

public data class NdisDmaDescription(
    public var demandMode: Boolean = false,
    public var autoInitialize: Boolean = false,
    public var dmaChannelSpecified: Boolean = false,
    public var dmaWidth: DmaWidth = 0,
    public var dmaSpeed: DmaSpeed = 0,
    public var dmaPort: UInt = 0u,
    public var dmaChannel: UInt = 0u,
)

public data class NdisEvent(
    public var event: Kevent = Kevent(),
)

public data class NdisGuid(
    public var guid: Guid = Guid(),
    public var anonymous: NdisGuid0 = NdisGuid0(),
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class NdisGuid0(
    public var oid: UInt = 0u,
    public var status: Int = 0,
)

public data class NdisHardwareCrosstimestamp(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var systemTimestamp1: ULong = 0uL,
    public var hardwareClockTimestamp: ULong = 0uL,
    public var systemTimestamp2: ULong = 0uL,
)

public data class NdisInterruptModerationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var interruptModeration: NdisInterruptModeration = 0,
)

public data class NdisIpsecOffloadV1(
    public var supported: NdisIpsecOffloadV10 = NdisIpsecOffloadV10(),
    public var iPv4AH: NdisIpsecOffloadV11 = NdisIpsecOffloadV11(),
    public var iPv4ESP: NdisIpsecOffloadV12 = NdisIpsecOffloadV12(),
)

public data class NdisIpsecOffloadV11(
    public var bitfield: UInt = 0u,
)

public data class NdisIpsecOffloadV12(
    public var bitfield: UInt = 0u,
)

public data class NdisIpsecOffloadV10(
    public var encapsulation: UInt = 0u,
    public var ahEspCombined: UInt = 0u,
    public var transportTunnelCombined: UInt = 0u,
    public var iPv4Options: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class NdisIpOperState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var ipOperationalStatus: NdisIpOperStatus = NdisIpOperStatus(),
)

public data class NdisIpOperStatus(
    public var addressFamily: UInt = 0u,
    public var operationalStatus: NetIfOperStatus = 0,
    public var operationalStatusFlags: UInt = 0u,
)

public data class NdisIpOperStatusInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var numberofAddressFamiliesReturned: UInt = 0u,
    public var ipOperationalStatus: List<NdisIpOperStatus> = List(32) { NdisIpOperStatus() },
)

public data class NdisIrdaPacketInfo(
    public var extraBOFs: UInt = 0u,
    public var minTurnAroundTime: UInt = 0u,
)

public data class NdisLinkParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var mediaDuplexState: NetIfMediaDuplexState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var pauseFunctions: NdisSupportedPauseFunctions = 0,
    public var autoNegotiationFlags: UInt = 0u,
)

public data class NdisLinkSpeed(
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
)

public data class NdisLinkState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var mediaDuplexState: NetIfMediaDuplexState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var pauseFunctions: NdisSupportedPauseFunctions = 0,
    public var autoNegotiationFlags: UInt = 0u,
)

public data class NdisMiniportTimer(
    public var timer: Ktimer = Ktimer(),
    public var dpc: Kdpc = Kdpc(),
    public var miniportTimerFunction: PndisTimerFunction = null,
    public var miniportTimerContext: COpaquePointer? = null,
    public var miniport: Int? = null,
    public var nextTimer: NdisMiniportTimer? = null,
)

public data class NdisObjectHeader(
    public var type: UByte = 0u,
    public var revision: UByte = 0u,
    public var size: UShort = 0u,
)

public data class NdisOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var checksum: NdisTcpIpChecksumOffload = NdisTcpIpChecksumOffload(),
    public var lsoV1: NdisTcpLargeSendOffloadV1 = NdisTcpLargeSendOffloadV1(),
    public var iPsecV1: NdisIpsecOffloadV1 = NdisIpsecOffloadV1(),
    public var lsoV2: NdisTcpLargeSendOffloadV2 = NdisTcpLargeSendOffloadV2(),
    public var flags: UInt = 0u,
)

public data class NdisOffloadParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var iPv4Checksum: UByte = 0u,
    public var tCPIPv4Checksum: UByte = 0u,
    public var uDPIPv4Checksum: UByte = 0u,
    public var tCPIPv6Checksum: UByte = 0u,
    public var uDPIPv6Checksum: UByte = 0u,
    public var lsoV1: UByte = 0u,
    public var iPsecV1: UByte = 0u,
    public var lsoV2IPv4: UByte = 0u,
    public var lsoV2IPv6: UByte = 0u,
    public var tcpConnectionIPv4: UByte = 0u,
    public var tcpConnectionIPv6: UByte = 0u,
    public var flags: UInt = 0u,
)

public data class NdisOperState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var operationalStatus: NetIfOperStatus = 0,
    public var operationalStatusFlags: UInt = 0u,
)

public data class NdisPacket8021qInfo(
    public var anonymous: NdisPacket8021qInfo0 = NdisPacket8021qInfo0(),
)

public data class NdisPacket8021qInfo0(
    public var tagHeader: NdisPacket8021qInfo00 = NdisPacket8021qInfo00(),
    public var value: COpaquePointer? = null,
)

public data class NdisPacket8021qInfo00(
    public var bitfield: UInt = 0u,
)

public data class NdisPciDeviceCustomProperties(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var deviceType: UInt = 0u,
    public var currentSpeedAndMode: UInt = 0u,
    public var currentPayloadSize: UInt = 0u,
    public var maxPayloadSize: UInt = 0u,
    public var maxReadRequestSize: UInt = 0u,
    public var currentLinkSpeed: UInt = 0u,
    public var currentLinkWidth: UInt = 0u,
    public var maxLinkSpeed: UInt = 0u,
    public var maxLinkWidth: UInt = 0u,
    public var pciExpressVersion: UInt = 0u,
    public var interruptType: UInt = 0u,
    public var maxInterruptMessages: UInt = 0u,
)

public data class NdisPhysicalAddressUnit(
    public var physicalAddress: Long = 0L,
    public var length: UInt = 0u,
)

public data class NdisPmPacketPattern(
    public var priority: UInt = 0u,
    public var reserved: UInt = 0u,
    public var maskSize: UInt = 0u,
    public var patternOffset: UInt = 0u,
    public var patternSize: UInt = 0u,
    public var patternFlags: UInt = 0u,
)

public data class NdisPmWakeUpCapabilities(
    public var minMagicPacketWakeUp: NdisDevicePowerState = 0,
    public var minPatternWakeUp: NdisDevicePowerState = 0,
    public var minLinkChangeWakeUp: NdisDevicePowerState = 0,
)

public data class NdisPnpCapabilities(
    public var flags: UInt = 0u,
    public var wakeUpCapabilities: NdisPmWakeUpCapabilities = NdisPmWakeUpCapabilities(),
)

public data class NdisPort(
    public var next: NdisPort? = null,
    public var ndisReserved: COpaquePointer? = null,
    public var miniportReserved: COpaquePointer? = null,
    public var protocolReserved: COpaquePointer? = null,
    public var portCharacteristics: NdisPortCharacteristics = NdisPortCharacteristics(),
)

public data class NdisPortArray(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var numberOfPorts: UInt = 0u,
    public var offsetFirstPort: UInt = 0u,
    public var elementSize: UInt = 0u,
    public var ports: List<NdisPortCharacteristics> = List(1) { NdisPortCharacteristics() },
)

public data class NdisPortAuthenticationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var sendControlState: NdisPortControlState = 0,
    public var rcvControlState: NdisPortControlState = 0,
    public var sendAuthorizationState: NdisPortAuthorizationState = 0,
    public var rcvAuthorizationState: NdisPortAuthorizationState = 0,
)

public data class NdisPortCharacteristics(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var portNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var type: NdisPortType = 0,
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var direction: NetIfDirectionType = 0,
    public var sendControlState: NdisPortControlState = 0,
    public var rcvControlState: NdisPortControlState = 0,
    public var sendAuthorizationState: NdisPortAuthorizationState = 0,
    public var rcvAuthorizationState: NdisPortAuthorizationState = 0,
)

public data class NdisPortState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var direction: NetIfDirectionType = 0,
    public var sendControlState: NdisPortControlState = 0,
    public var rcvControlState: NdisPortControlState = 0,
    public var sendAuthorizationState: NdisPortAuthorizationState = 0,
    public var rcvAuthorizationState: NdisPortAuthorizationState = 0,
    public var flags: UInt = 0u,
)

public data class NdisReceiveHashParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var hashInformation: UInt = 0u,
    public var hashSecretKeySize: UShort = 0u,
    public var hashSecretKeyOffset: UInt = 0u,
)

public data class NdisReceiveScaleCapabilities(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var capabilitiesFlags: UInt = 0u,
    public var numberOfInterruptMessages: UInt = 0u,
    public var numberOfReceiveQueues: UInt = 0u,
)

public data class NdisReceiveScaleParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UShort = 0u,
    public var baseCpuNumber: UShort = 0u,
    public var hashInformation: UInt = 0u,
    public var indirectionTableSize: UShort = 0u,
    public var indirectionTableOffset: UInt = 0u,
    public var hashSecretKeySize: UShort = 0u,
    public var hashSecretKeyOffset: UInt = 0u,
)

public data class NdisRwLock(
    public var anonymous1: NdisRwLock0 = NdisRwLock0(),
    public var anonymous2: NdisRwLock1 = NdisRwLock1(),
)

public data class NdisRwLock0(
    public var anonymous: NdisRwLock00 = NdisRwLock00(),
    public var reserved: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisRwLock0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class NdisRwLock00(
    public var spinLock: Int = 0,
    public var context: COpaquePointer? = null,
)

public data class NdisRwLock1(
    public var refCount: List<NdisRwLockRefcount> = List(32) { NdisRwLockRefcount() },
    public var refCountEx: UIntArray = UIntArray(128),
    public var anonymous: NdisRwLock10 = NdisRwLock10(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisRwLock1) return false
        if (this.refCount != other.refCount) return false
        if (!this.refCountEx.contentEquals(other.refCountEx)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.refCount.hashCode()
        result = 31 * result + this.refCountEx.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class NdisRwLock10(
    public var refCountLock: Int = 0,
    public var sharedRefCount: UInt = 0u,
    public var writerWaiting: Boolean = false,
)

public data class NdisRwLockRefcount(
    public var refCount: UInt = 0u,
    public var cacheLine: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisRwLockRefcount) return false
        if (this.refCount != other.refCount) return false
        if (!this.cacheLine.contentEquals(other.cacheLine)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.refCount.hashCode()
        result = 31 * result + this.cacheLine.contentHashCode()
        return result
    }
}

public data class NdisSpinLock(
    public var spinLock: Int = 0,
    public var oldIrql: UByte = 0u,
)

public class NdisStatisticsInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var supportedStatistics: UInt = 0u,
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

public data class NdisStatisticsValue(
    public var oid: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisStatisticsValue) return false
        if (this.oid != other.oid) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oid.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class NdisStatisticsValueEx(
    public var oid: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisStatisticsValueEx) return false
        if (this.oid != other.oid) return false
        if (this.dataLength != other.dataLength) return false
        if (this.length != other.length) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oid.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class NdisTcpConnectionOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
    public var tcpConnectionOffloadCapacity: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class NdisTcpIpChecksumOffload(
    public var iPv4Transmit: NdisTcpIpChecksumOffload0 = NdisTcpIpChecksumOffload0(),
    public var iPv4Receive: NdisTcpIpChecksumOffload1 = NdisTcpIpChecksumOffload1(),
    public var iPv6Transmit: NdisTcpIpChecksumOffload2 = NdisTcpIpChecksumOffload2(),
    public var iPv6Receive: NdisTcpIpChecksumOffload3 = NdisTcpIpChecksumOffload3(),
)

public data class NdisTcpIpChecksumOffload1(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class NdisTcpIpChecksumOffload0(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class NdisTcpIpChecksumOffload3(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class NdisTcpIpChecksumOffload2(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class NdisTcpIpChecksumPacketInfo(
    public var anonymous: NdisTcpIpChecksumPacketInfo0 = NdisTcpIpChecksumPacketInfo0(),
)

public data class NdisTcpIpChecksumPacketInfo0(
    public var transmit: NdisTcpIpChecksumPacketInfo00 = NdisTcpIpChecksumPacketInfo00(),
    public var receive: NdisTcpIpChecksumPacketInfo01 = NdisTcpIpChecksumPacketInfo01(),
    public var value: UInt = 0u,
)

public data class NdisTcpIpChecksumPacketInfo01(
    public var bitfield: UInt = 0u,
)

public data class NdisTcpIpChecksumPacketInfo00(
    public var bitfield: UInt = 0u,
)

public data class NdisTcpLargeSendOffloadV1(
    public var iPv4: NdisTcpLargeSendOffloadV10 = NdisTcpLargeSendOffloadV10(),
)

public data class NdisTcpLargeSendOffloadV10(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class NdisTcpLargeSendOffloadV2(
    public var iPv4: NdisTcpLargeSendOffloadV20 = NdisTcpLargeSendOffloadV20(),
    public var iPv6: NdisTcpLargeSendOffloadV21 = NdisTcpLargeSendOffloadV21(),
)

public data class NdisTcpLargeSendOffloadV20(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
)

public data class NdisTcpLargeSendOffloadV21(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class NdisTimeoutDpcRequestCapabilities(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var timeoutArrayLength: UInt = 0u,
    public var timeoutArray: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisTimeoutDpcRequestCapabilities) return false
        if (this.header != other.header) return false
        if (this.flags != other.flags) return false
        if (this.timeoutArrayLength != other.timeoutArrayLength) return false
        if (!this.timeoutArray.contentEquals(other.timeoutArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.timeoutArrayLength.hashCode()
        result = 31 * result + this.timeoutArray.contentHashCode()
        return result
    }
}

public data class NdisTimer(
    public var timer: Ktimer = Ktimer(),
    public var dpc: Kdpc = Kdpc(),
)

public data class NdisTimestampCapabilities(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var hardwareClockFrequencyHz: ULong = 0uL,
    public var crossTimestamp: Boolean = false,
    public var reserved1: ULong = 0uL,
    public var reserved2: ULong = 0uL,
    public var timestampFlags: NdisTimestampCapabilityFlags = NdisTimestampCapabilityFlags(),
)

public data class NdisTimestampCapabilityFlags(
    public var ptpV2OverUdpIPv4EventMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv4AllMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv4EventMsgTransmitHw: Boolean = false,
    public var ptpV2OverUdpIPv4AllMsgTransmitHw: Boolean = false,
    public var ptpV2OverUdpIPv6EventMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv6AllMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv6EventMsgTransmitHw: Boolean = false,
    public var ptpV2OverUdpIPv6AllMsgTransmitHw: Boolean = false,
    public var allReceiveHw: Boolean = false,
    public var allTransmitHw: Boolean = false,
    public var taggedTransmitHw: Boolean = false,
    public var allReceiveSw: Boolean = false,
    public var allTransmitSw: Boolean = false,
    public var taggedTransmitSw: Boolean = false,
)

public data class NdisVarDataDesc(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var offset: Int = 0,
)

public data class NdisWanFragment(
    public var remoteAddress: UByteArray = UByteArray(6),
    public var localAddress: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWanFragment) return false
        if (!this.remoteAddress.contentEquals(other.remoteAddress)) return false
        if (!this.localAddress.contentEquals(other.localAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteAddress.contentHashCode()
        result = 31 * result + this.localAddress.contentHashCode()
        return result
    }
}

public data class NdisWanGetStats(
    public var localAddress: UByteArray = UByteArray(6),
    public var bytesSent: UInt = 0u,
    public var bytesRcvd: UInt = 0u,
    public var framesSent: UInt = 0u,
    public var framesRcvd: UInt = 0u,
    public var cRCErrors: UInt = 0u,
    public var timeoutErrors: UInt = 0u,
    public var alignmentErrors: UInt = 0u,
    public var serialOverrunErrors: UInt = 0u,
    public var framingErrors: UInt = 0u,
    public var bufferOverrunErrors: UInt = 0u,
    public var bytesTransmittedUncompressed: UInt = 0u,
    public var bytesReceivedUncompressed: UInt = 0u,
    public var bytesTransmittedCompressed: UInt = 0u,
    public var bytesReceivedCompressed: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWanGetStats) return false
        if (!this.localAddress.contentEquals(other.localAddress)) return false
        if (this.bytesSent != other.bytesSent) return false
        if (this.bytesRcvd != other.bytesRcvd) return false
        if (this.framesSent != other.framesSent) return false
        if (this.framesRcvd != other.framesRcvd) return false
        if (this.cRCErrors != other.cRCErrors) return false
        if (this.timeoutErrors != other.timeoutErrors) return false
        if (this.alignmentErrors != other.alignmentErrors) return false
        if (this.serialOverrunErrors != other.serialOverrunErrors) return false
        if (this.framingErrors != other.framingErrors) return false
        if (this.bufferOverrunErrors != other.bufferOverrunErrors) return false
        if (this.bytesTransmittedUncompressed != other.bytesTransmittedUncompressed) return false
        if (this.bytesReceivedUncompressed != other.bytesReceivedUncompressed) return false
        if (this.bytesTransmittedCompressed != other.bytesTransmittedCompressed) return false
        if (this.bytesReceivedCompressed != other.bytesReceivedCompressed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localAddress.contentHashCode()
        result = 31 * result + this.bytesSent.hashCode()
        result = 31 * result + this.bytesRcvd.hashCode()
        result = 31 * result + this.framesSent.hashCode()
        result = 31 * result + this.framesRcvd.hashCode()
        result = 31 * result + this.cRCErrors.hashCode()
        result = 31 * result + this.timeoutErrors.hashCode()
        result = 31 * result + this.alignmentErrors.hashCode()
        result = 31 * result + this.serialOverrunErrors.hashCode()
        result = 31 * result + this.framingErrors.hashCode()
        result = 31 * result + this.bufferOverrunErrors.hashCode()
        result = 31 * result + this.bytesTransmittedUncompressed.hashCode()
        result = 31 * result + this.bytesReceivedUncompressed.hashCode()
        result = 31 * result + this.bytesTransmittedCompressed.hashCode()
        result = 31 * result + this.bytesReceivedCompressed.hashCode()
        return result
    }
}

public data class NdisWanLineDown(
    public var remoteAddress: UByteArray = UByteArray(6),
    public var localAddress: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWanLineDown) return false
        if (!this.remoteAddress.contentEquals(other.remoteAddress)) return false
        if (!this.localAddress.contentEquals(other.localAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteAddress.contentHashCode()
        result = 31 * result + this.localAddress.contentHashCode()
        return result
    }
}

public data class NdisWanLineUp(
    public var linkSpeed: UInt = 0u,
    public var maximumTotalSize: UInt = 0u,
    public var quality: NdisWanQuality = 0,
    public var sendWindow: UShort = 0u,
    public var remoteAddress: UByteArray = UByteArray(6),
    public var localAddress: UByteArray = UByteArray(6),
    public var protocolBufferLength: UInt = 0u,
    public var protocolBuffer: COpaquePointer? = null,
    public var protocolType: UShort = 0u,
    public var deviceName: UnicodeString = UnicodeString(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWanLineUp) return false
        if (this.linkSpeed != other.linkSpeed) return false
        if (this.maximumTotalSize != other.maximumTotalSize) return false
        if (this.quality != other.quality) return false
        if (this.sendWindow != other.sendWindow) return false
        if (!this.remoteAddress.contentEquals(other.remoteAddress)) return false
        if (!this.localAddress.contentEquals(other.localAddress)) return false
        if (this.protocolBufferLength != other.protocolBufferLength) return false
        if (this.protocolBuffer != other.protocolBuffer) return false
        if (this.protocolType != other.protocolType) return false
        if (this.deviceName != other.deviceName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.linkSpeed.hashCode()
        result = 31 * result + this.maximumTotalSize.hashCode()
        result = 31 * result + this.quality.hashCode()
        result = 31 * result + this.sendWindow.hashCode()
        result = 31 * result + this.remoteAddress.contentHashCode()
        result = 31 * result + this.localAddress.contentHashCode()
        result = 31 * result + this.protocolBufferLength.hashCode()
        result = 31 * result + this.protocolBuffer.hashCode()
        result = 31 * result + this.protocolType.hashCode()
        result = 31 * result + this.deviceName.hashCode()
        return result
    }
}

public data class NdisWanProtocolCaps(
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class NdisWlanBssid(
    public var length: UInt = 0u,
    public var macAddress: UByteArray = UByteArray(6),
    public var reserved: UByteArray = UByteArray(2),
    public var ssid: Ndis80211Ssid = Ndis80211Ssid(),
    public var privacy: UInt = 0u,
    public var rssi: Int = 0,
    public var networkTypeInUse: Ndis80211NetworkType = 0,
    public var configuration: Ndis80211Configuration = Ndis80211Configuration(),
    public var infrastructureMode: Ndis80211NetworkInfrastructure = 0,
    public var supportedRates: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWlanBssid) return false
        if (this.length != other.length) return false
        if (!this.macAddress.contentEquals(other.macAddress)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.ssid != other.ssid) return false
        if (this.privacy != other.privacy) return false
        if (this.rssi != other.rssi) return false
        if (this.networkTypeInUse != other.networkTypeInUse) return false
        if (this.configuration != other.configuration) return false
        if (this.infrastructureMode != other.infrastructureMode) return false
        if (!this.supportedRates.contentEquals(other.supportedRates)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.macAddress.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        result = 31 * result + this.privacy.hashCode()
        result = 31 * result + this.rssi.hashCode()
        result = 31 * result + this.networkTypeInUse.hashCode()
        result = 31 * result + this.configuration.hashCode()
        result = 31 * result + this.infrastructureMode.hashCode()
        result = 31 * result + this.supportedRates.contentHashCode()
        return result
    }
}

public data class NdisWlanBssidEx(
    public var length: UInt = 0u,
    public var macAddress: UByteArray = UByteArray(6),
    public var reserved: UByteArray = UByteArray(2),
    public var ssid: Ndis80211Ssid = Ndis80211Ssid(),
    public var privacy: UInt = 0u,
    public var rssi: Int = 0,
    public var networkTypeInUse: Ndis80211NetworkType = 0,
    public var configuration: Ndis80211Configuration = Ndis80211Configuration(),
    public var infrastructureMode: Ndis80211NetworkInfrastructure = 0,
    public var supportedRates: UByteArray = UByteArray(16),
    public var iELength: UInt = 0u,
    public var iEs: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWlanBssidEx) return false
        if (this.length != other.length) return false
        if (!this.macAddress.contentEquals(other.macAddress)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.ssid != other.ssid) return false
        if (this.privacy != other.privacy) return false
        if (this.rssi != other.rssi) return false
        if (this.networkTypeInUse != other.networkTypeInUse) return false
        if (this.configuration != other.configuration) return false
        if (this.infrastructureMode != other.infrastructureMode) return false
        if (!this.supportedRates.contentEquals(other.supportedRates)) return false
        if (this.iELength != other.iELength) return false
        if (!this.iEs.contentEquals(other.iEs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.macAddress.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        result = 31 * result + this.privacy.hashCode()
        result = 31 * result + this.rssi.hashCode()
        result = 31 * result + this.networkTypeInUse.hashCode()
        result = 31 * result + this.configuration.hashCode()
        result = 31 * result + this.infrastructureMode.hashCode()
        result = 31 * result + this.supportedRates.contentHashCode()
        result = 31 * result + this.iELength.hashCode()
        result = 31 * result + this.iEs.contentHashCode()
        return result
    }
}

public data class NdisWmiEnumAdapter(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ifIndex: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var deviceNameLength: UShort = 0u,
    public var deviceName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiEnumAdapter) return false
        if (this.header != other.header) return false
        if (this.ifIndex != other.ifIndex) return false
        if (this.netLuid != other.netLuid) return false
        if (this.deviceNameLength != other.deviceNameLength) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.ifIndex.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.deviceNameLength.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        return result
    }
}

public data class NdisWmiEventHeader(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ifIndex: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var requestId: ULong = 0uL,
    public var portNumber: UInt = 0u,
    public var deviceNameLength: UInt = 0u,
    public var deviceNameOffset: UInt = 0u,
    public var padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiEventHeader) return false
        if (this.header != other.header) return false
        if (this.ifIndex != other.ifIndex) return false
        if (this.netLuid != other.netLuid) return false
        if (this.requestId != other.requestId) return false
        if (this.portNumber != other.portNumber) return false
        if (this.deviceNameLength != other.deviceNameLength) return false
        if (this.deviceNameOffset != other.deviceNameOffset) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.ifIndex.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.requestId.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.deviceNameLength.hashCode()
        result = 31 * result + this.deviceNameOffset.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class NdisWmiIpsecOffloadV1(
    public var supported: NdisWmiIpsecOffloadV10 = NdisWmiIpsecOffloadV10(),
    public var iPv4AH: NdisWmiIpsecOffloadV11 = NdisWmiIpsecOffloadV11(),
    public var iPv4ESP: NdisWmiIpsecOffloadV12 = NdisWmiIpsecOffloadV12(),
)

public data class NdisWmiIpsecOffloadV11(
    public var md5: UInt = 0u,
    public var sha1: UInt = 0u,
    public var transport: UInt = 0u,
    public var tunnel: UInt = 0u,
    public var send: UInt = 0u,
    public var receive: UInt = 0u,
)

public data class NdisWmiIpsecOffloadV12(
    public var des: UInt = 0u,
    public var reserved: UInt = 0u,
    public var tripleDes: UInt = 0u,
    public var nullEsp: UInt = 0u,
    public var transport: UInt = 0u,
    public var tunnel: UInt = 0u,
    public var send: UInt = 0u,
    public var receive: UInt = 0u,
)

public data class NdisWmiIpsecOffloadV10(
    public var encapsulation: UInt = 0u,
    public var ahEspCombined: UInt = 0u,
    public var transportTunnelCombined: UInt = 0u,
    public var iPv4Options: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class NdisWmiMethodHeader(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var portNumber: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var requestId: ULong = 0uL,
    public var timeout: UInt = 0u,
    public var padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiMethodHeader) return false
        if (this.header != other.header) return false
        if (this.portNumber != other.portNumber) return false
        if (this.netLuid != other.netLuid) return false
        if (this.requestId != other.requestId) return false
        if (this.timeout != other.timeout) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.requestId.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class NdisWmiOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var checksum: NdisWmiTcpIpChecksumOffload = NdisWmiTcpIpChecksumOffload(),
    public var lsoV1: NdisWmiTcpLargeSendOffloadV1 = NdisWmiTcpLargeSendOffloadV1(),
    public var iPsecV1: NdisWmiIpsecOffloadV1 = NdisWmiIpsecOffloadV1(),
    public var lsoV2: NdisWmiTcpLargeSendOffloadV2 = NdisWmiTcpLargeSendOffloadV2(),
    public var flags: UInt = 0u,
)

public data class NdisWmiOutputInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var supportedRevision: UByte = 0u,
    public var dataOffset: UInt = 0u,
)

public data class NdisWmiSetHeader(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var portNumber: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var requestId: ULong = 0uL,
    public var timeout: UInt = 0u,
    public var padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiSetHeader) return false
        if (this.header != other.header) return false
        if (this.portNumber != other.portNumber) return false
        if (this.netLuid != other.netLuid) return false
        if (this.requestId != other.requestId) return false
        if (this.timeout != other.timeout) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.requestId.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class NdisWmiTcpConnectionOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var encapsulation: UInt = 0u,
    public var supportIPv4: UInt = 0u,
    public var supportIPv6: UInt = 0u,
    public var supportIPv6ExtensionHeaders: UInt = 0u,
    public var supportSack: UInt = 0u,
    public var tcpConnectionOffloadCapacity: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class NdisWmiTcpIpChecksumOffload(
    public var iPv4Transmit: NdisWmiTcpIpChecksumOffload0 = NdisWmiTcpIpChecksumOffload0(),
    public var iPv4Receive: NdisWmiTcpIpChecksumOffload1 = NdisWmiTcpIpChecksumOffload1(),
    public var iPv6Transmit: NdisWmiTcpIpChecksumOffload2 = NdisWmiTcpIpChecksumOffload2(),
    public var iPv6Receive: NdisWmiTcpIpChecksumOffload3 = NdisWmiTcpIpChecksumOffload3(),
)

public data class NdisWmiTcpIpChecksumOffload1(
    public var encapsulation: UInt = 0u,
    public var ipOptionsSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
    public var ipChecksum: UInt = 0u,
)

public data class NdisWmiTcpIpChecksumOffload0(
    public var encapsulation: UInt = 0u,
    public var ipOptionsSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
    public var ipChecksum: UInt = 0u,
)

public data class NdisWmiTcpIpChecksumOffload3(
    public var encapsulation: UInt = 0u,
    public var ipExtensionHeadersSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
)

public data class NdisWmiTcpIpChecksumOffload2(
    public var encapsulation: UInt = 0u,
    public var ipExtensionHeadersSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
)

public data class NdisWmiTcpLargeSendOffloadV1(
    public var iPv4: NdisWmiTcpLargeSendOffloadV10 = NdisWmiTcpLargeSendOffloadV10(),
)

public data class NdisWmiTcpLargeSendOffloadV10(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var tcpOptions: UInt = 0u,
    public var ipOptions: UInt = 0u,
)

public data class NdisWmiTcpLargeSendOffloadV2(
    public var iPv4: NdisWmiTcpLargeSendOffloadV20 = NdisWmiTcpLargeSendOffloadV20(),
    public var iPv6: NdisWmiTcpLargeSendOffloadV21 = NdisWmiTcpLargeSendOffloadV21(),
)

public data class NdisWmiTcpLargeSendOffloadV20(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
)

public data class NdisWmiTcpLargeSendOffloadV21(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var ipExtensionHeadersSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
)

public data class NdisWorkItem(
    public var context: COpaquePointer? = null,
    public var routine: NdisProc = null,
    public var wrapperReserved: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWorkItem) return false
        if (this.context != other.context) return false
        if (this.routine != other.routine) return false
        if (!this.wrapperReserved.contentEquals(other.wrapperReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.routine.hashCode()
        result = 31 * result + this.wrapperReserved.contentHashCode()
        return result
    }
}

public data class NetworkAddress(
    public var addressLength: UShort = 0u,
    public var addressType: UShort = 0u,
    public var address: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddress) return false
        if (this.addressLength != other.addressLength) return false
        if (this.addressType != other.addressType) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressLength.hashCode()
        result = 31 * result + this.addressType.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }
}

public data class NetworkAddressIp(
    public var sinPort: UShort = 0u,
    public var inAddr: UInt = 0u,
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddressIp) return false
        if (this.sinPort != other.sinPort) return false
        if (this.inAddr != other.inAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinPort.hashCode()
        result = 31 * result + this.inAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class NetworkAddressIp6(
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: UShortArray = UShortArray(8),
    public var sin6ScopeId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddressIp6) return false
        if (this.sin6Port != other.sin6Port) return false
        if (this.sin6Flowinfo != other.sin6Flowinfo) return false
        if (!this.sin6Addr.contentEquals(other.sin6Addr)) return false
        if (this.sin6ScopeId != other.sin6ScopeId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin6Port.hashCode()
        result = 31 * result + this.sin6Flowinfo.hashCode()
        result = 31 * result + this.sin6Addr.contentHashCode()
        result = 31 * result + this.sin6ScopeId.hashCode()
        return result
    }
}

public data class NetworkAddressIpx(
    public var networkAddress: UInt = 0u,
    public var nodeAddress: UByteArray = UByteArray(6),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddressIpx) return false
        if (this.networkAddress != other.networkAddress) return false
        if (!this.nodeAddress.contentEquals(other.nodeAddress)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.networkAddress.hashCode()
        result = 31 * result + this.nodeAddress.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }
}

public data class NetworkAddressList(
    public var addressCount: Int = 0,
    public var addressType: UShort = 0u,
    public var address: List<NetworkAddress> = List(1) { NetworkAddress() },
)

public data class OffloadAlgoInfo(
    public var algoIdentifier: UInt = 0u,
    public var algoKeylen: UInt = 0u,
    public var algoRounds: UInt = 0u,
)

public data class OffloadIpsecAddSa(
    public var srcAddr: UInt = 0u,
    public var srcMask: UInt = 0u,
    public var destAddr: UInt = 0u,
    public var destMask: UInt = 0u,
    public var protocol: UInt = 0u,
    public var srcPort: UShort = 0u,
    public var destPort: UShort = 0u,
    public var srcTunnelAddr: UInt = 0u,
    public var destTunnelAddr: UInt = 0u,
    public var flags: UShort = 0u,
    public var numSAs: Short = 0,
    public var secAssoc: List<OffloadSecurityAssociation> = List(3) { OffloadSecurityAssociation() },
    public var offloadHandle: Handle = null,
    public var keyLen: UInt = 0u,
    public var keyMat: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OffloadIpsecAddSa) return false
        if (this.srcAddr != other.srcAddr) return false
        if (this.srcMask != other.srcMask) return false
        if (this.destAddr != other.destAddr) return false
        if (this.destMask != other.destMask) return false
        if (this.protocol != other.protocol) return false
        if (this.srcPort != other.srcPort) return false
        if (this.destPort != other.destPort) return false
        if (this.srcTunnelAddr != other.srcTunnelAddr) return false
        if (this.destTunnelAddr != other.destTunnelAddr) return false
        if (this.flags != other.flags) return false
        if (this.numSAs != other.numSAs) return false
        if (this.secAssoc != other.secAssoc) return false
        if (this.offloadHandle != other.offloadHandle) return false
        if (this.keyLen != other.keyLen) return false
        if (!this.keyMat.contentEquals(other.keyMat)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.srcAddr.hashCode()
        result = 31 * result + this.srcMask.hashCode()
        result = 31 * result + this.destAddr.hashCode()
        result = 31 * result + this.destMask.hashCode()
        result = 31 * result + this.protocol.hashCode()
        result = 31 * result + this.srcPort.hashCode()
        result = 31 * result + this.destPort.hashCode()
        result = 31 * result + this.srcTunnelAddr.hashCode()
        result = 31 * result + this.destTunnelAddr.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.numSAs.hashCode()
        result = 31 * result + this.secAssoc.hashCode()
        result = 31 * result + this.offloadHandle.hashCode()
        result = 31 * result + this.keyLen.hashCode()
        result = 31 * result + this.keyMat.contentHashCode()
        return result
    }
}

public class OffloadIpsecAddUdpespSa(
    public var srcAddr: UInt = 0u,
    public var srcMask: UInt = 0u,
    public var dstAddr: UInt = 0u,
    public var dstMask: UInt = 0u,
    public var protocol: UInt = 0u,
    public var srcPort: UShort = 0u,
    public var dstPort: UShort = 0u,
    public var srcTunnelAddr: UInt = 0u,
    public var dstTunnelAddr: UInt = 0u,
    public var flags: UShort = 0u,
    public var numSAs: Short = 0,
    public var secAssoc: List<OffloadSecurityAssociation> = List(3) { OffloadSecurityAssociation() },
    public var offloadHandle: Handle = null,
    public var encapTypeEntry: OffloadIpsecUdpespEncaptypeEntry = OffloadIpsecUdpespEncaptypeEntry(),
    public var encapTypeEntryOffldHandle: Handle = null,
    public var keyLen: UInt = 0u,
    public var keyMat: UByteArray = UByteArray(1),
)

public data class OffloadIpsecDeleteSa(
    public var offloadHandle: Handle = null,
)

public data class OffloadIpsecDeleteUdpespSa(
    public var offloadHandle: Handle = null,
    public var encapTypeEntryOffldHandle: Handle = null,
)

public data class OffloadIpsecUdpespEncaptypeEntry(
    public var udpEncapType: UdpEncapType = 0,
    public var dstEncapPort: UShort = 0u,
)

public data class OffloadSecurityAssociation(
    public var operation: OffloadOperationE = 0,
    public var spi: UInt = 0u,
    public var integrityAlgo: OffloadAlgoInfo = OffloadAlgoInfo(),
    public var confAlgo: OffloadAlgoInfo = OffloadAlgoInfo(),
    public var reserved: OffloadAlgoInfo = OffloadAlgoInfo(),
)

public data class PmkidCandidate(
    public var bssid: UByteArray = UByteArray(6),
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmkidCandidate) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bssid.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class Reference(
    public var spinLock: Int = 0,
    public var referenceCount: UShort = 0u,
    public var closing: Boolean = false,
)

public data class TransportHeaderOffset(
    public var protocolType: UShort = 0u,
    public var headerOffset: UShort = 0u,
)

public data class VarString(
    public var ulTotalSize: UInt = 0u,
    public var ulNeededSize: UInt = 0u,
    public var ulUsedSize: UInt = 0u,
    public var ulStringFormat: UInt = 0u,
    public var ulStringSize: UInt = 0u,
    public var ulStringOffset: UInt = 0u,
)
