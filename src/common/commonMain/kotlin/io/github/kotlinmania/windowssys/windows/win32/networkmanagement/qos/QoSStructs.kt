@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Flowspec
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.InAddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Sockaddr
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetworkAddressList

public data class AddressListDescriptor(public var mediaType: UInt = 0u, public var addressList: NetworkAddressList = NetworkAddressList())

public data class Adspec(public var adspecHeader: RsvpObjHdr = RsvpObjHdr(), public var adspecBody: IsAdspecBody = IsAdspecBody())

public data class AdGeneralParams(
    public var intServAwareHopCount: UInt = 0u,
    public var pathBandwidthEstimate: UInt = 0u,
    public var minimumLatency: UInt = 0u,
    public var pathMTU: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class AdGuaranteed(
    public var cTotal: UInt = 0u,
    public var dTotal: UInt = 0u,
    public var cSum: UInt = 0u,
    public var dSum: UInt = 0u,
)

public data class ControlService(
    public var length: UInt = 0u,
    public var service: UInt = 0u,
    public var overrides: AdGeneralParams = AdGeneralParams(),
    public var anonymous: ControlService0 = ControlService0(),
)

public data class ControlService0(public var guaranteed: AdGuaranteed = AdGuaranteed(), public var paramBuffer: List<ParamBuffer> = List(1) { ParamBuffer() })

public data class CtrlLoadFlowspec(
    public var clSpecServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var clSpecParmHdr: IntServParmHdr = IntServParmHdr(),
    public var clSpecParms: GenTspecParms = GenTspecParms(),
)

public data class EnumerationBuffer(
    public var length: UInt = 0u,
    public var ownerProcessId: UInt = 0u,
    public var flowNameLength: UShort = 0u,
    public var flowName: UShortArray = UShortArray(256),
    public var pFlow: TcGenFlow? = null,
    public var numberOfFilters: UInt = 0u,
    public var genericFilter: List<TcGenFilter> = List(1) { TcGenFilter() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnumerationBuffer) return false
        if (this.length != other.length) return false
        if (this.ownerProcessId != other.ownerProcessId) return false
        if (this.flowNameLength != other.flowNameLength) return false
        if (!this.flowName.contentEquals(other.flowName)) return false
        if (this.pFlow != other.pFlow) return false
        if (this.numberOfFilters != other.numberOfFilters) return false
        if (this.genericFilter != other.genericFilter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.ownerProcessId.hashCode()
        result = 31 * result + this.flowNameLength.hashCode()
        result = 31 * result + this.flowName.contentHashCode()
        result = 31 * result + this.pFlow.hashCode()
        result = 31 * result + this.numberOfFilters.hashCode()
        result = 31 * result + this.genericFilter.hashCode()
        return result
    }
}

public data class ErrorSpec(public var errsHeader: RsvpObjHdr = RsvpObjHdr(), public var errsU: ErrorSpec0 = ErrorSpec0())

public data class ErrorSpec0(public var errsIpv4: ErrorSpecIpv4 = ErrorSpecIpv4())

public data class ErrorSpecIpv4(
    public var errsErrnode: InAddr = InAddr(),
    public var errsFlags: UByte = 0u,
    public var errsCode: UByte = 0u,
    public var errsValue: UShort = 0u,
)

public data class FilterSpec(public var filtHeader: RsvpObjHdr = RsvpObjHdr(), public var filtU: FilterSpec0 = FilterSpec0())

public data class FilterSpec0(public var filtIpv4: FilterSpecIpv4 = FilterSpecIpv4(), public var filtIpv4gpi: FilterSpecIpv4Gpi = FilterSpecIpv4Gpi())

public data class Flowdescriptor(
    public var flowSpec: Flowspec = Flowspec(),
    public var numFilters: UInt = 0u,
    public var filterList: RsvpFilterspec? = null,
)

public data class FlowDesc(public var u1: FlowDesc0 = FlowDesc0(), public var u2: FlowDesc1 = FlowDesc1())

public data class FlowDesc0(public var stspec: SenderTspec? = null, public var isflow: IsFlowspec? = null)

public data class FlowDesc1(public var stemp: FilterSpec? = null, public var fspec: FilterSpec? = null)

public data class FilterSpecIpv4(
    public var filtIpaddr: InAddr = InAddr(),
    public var filtUnused: UShort = 0u,
    public var filtPort: UShort = 0u,
)

public data class FilterSpecIpv4Gpi(public var filtIpaddr: InAddr = InAddr(), public var filtGpi: UInt = 0u)

public data class GadsParmsT(
    public var gadsServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var gadsCtotHdr: IntServParmHdr = IntServParmHdr(),
    public var gadsCtot: UInt = 0u,
    public var gadsDtotHdr: IntServParmHdr = IntServParmHdr(),
    public var gadsDtot: UInt = 0u,
    public var gadsCsumHdr: IntServParmHdr = IntServParmHdr(),
    public var gadsCsum: UInt = 0u,
    public var gadsDsumHdr: IntServParmHdr = IntServParmHdr(),
    public var gadsDsum: UInt = 0u,
)

public data class GenAdspecParams(
    public var genParmHdr: IntServServiceHdr = IntServServiceHdr(),
    public var genParmHopcntHdr: IntServParmHdr = IntServParmHdr(),
    public var genParmHopcnt: UInt = 0u,
    public var genParmPathbwHdr: IntServParmHdr = IntServParmHdr(),
    public var genParmPathBw: Float = 0.0f,
    public var genParmMinlatHdr: IntServParmHdr = IntServParmHdr(),
    public var genParmMinLatency: UInt = 0u,
    public var genParmCompmtuHdr: IntServParmHdr = IntServParmHdr(),
    public var genParmComposedMtu: UInt = 0u,
)

public data class GenTspec(
    public var genTspecServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var genTspecParmHdr: IntServParmHdr = IntServParmHdr(),
    public var genTspecParms: GenTspecParms = GenTspecParms(),
)

public data class GenTspecParms(
    public var tbTspecR: Float = 0.0f,
    public var tbTspecB: Float = 0.0f,
    public var tbTspecP: Float = 0.0f,
    public var tbTspecM: UInt = 0u,
)

public data class GuarFlowSpec(
    public var guarServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var guarTspecHdr: IntServParmHdr = IntServParmHdr(),
    public var guarTspecParms: GenTspecParms = GenTspecParms(),
    public var guarRspecHdr: IntServParmHdr = IntServParmHdr(),
    public var guarRspec: GuarRspec = GuarRspec(),
)

public data class GuarRspec(public var guarR: Float = 0.0f, public var guarS: UInt = 0u)

public data class HspUpgradeImagedata(
    public var hashAlgID: UShort = 0u,
    public var digestSize: UShort = 0u,
    public var digest: UByteArray = UByteArray(64),
    public var fileName: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HspUpgradeImagedata) return false
        if (this.hashAlgID != other.hashAlgID) return false
        if (this.digestSize != other.digestSize) return false
        if (!this.digest.contentEquals(other.digest)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hashAlgID.hashCode()
        result = 31 * result + this.digestSize.hashCode()
        result = 31 * result + this.digest.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class IdpeAttr(
    public var peAttribLength: UShort = 0u,
    public var peAttribType: UByte = 0u,
    public var peAttribSubType: UByte = 0u,
    public var peAttribValue: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IdpeAttr) return false
        if (this.peAttribLength != other.peAttribLength) return false
        if (this.peAttribType != other.peAttribType) return false
        if (this.peAttribSubType != other.peAttribSubType) return false
        if (!this.peAttribValue.contentEquals(other.peAttribValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peAttribLength.hashCode()
        result = 31 * result + this.peAttribType.hashCode()
        result = 31 * result + this.peAttribSubType.hashCode()
        result = 31 * result + this.peAttribValue.contentHashCode()
        return result
    }
}

public data class IdErrorObject(
    public var usIdErrLength: UShort = 0u,
    public var ucAType: UByte = 0u,
    public var ucSubType: UByte = 0u,
    public var usReserved: UShort = 0u,
    public var usIdErrorValue: UShort = 0u,
    public var ucIdErrData: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IdErrorObject) return false
        if (this.usIdErrLength != other.usIdErrLength) return false
        if (this.ucAType != other.ucAType) return false
        if (this.ucSubType != other.ucSubType) return false
        if (this.usReserved != other.usReserved) return false
        if (this.usIdErrorValue != other.usIdErrorValue) return false
        if (!this.ucIdErrData.contentEquals(other.ucIdErrData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usIdErrLength.hashCode()
        result = 31 * result + this.ucAType.hashCode()
        result = 31 * result + this.ucSubType.hashCode()
        result = 31 * result + this.usReserved.hashCode()
        result = 31 * result + this.usIdErrorValue.hashCode()
        result = 31 * result + this.ucIdErrData.contentHashCode()
        return result
    }
}

public data class InAddrIpv4(public var addr: UInt = 0u, public var addrBytes: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InAddrIpv4) return false
        if (this.addr != other.addr) return false
        if (!this.addrBytes.contentEquals(other.addrBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addr.hashCode()
        result = 31 * result + this.addrBytes.contentHashCode()
        return result
    }
}

public data class InAddrIpv6(public var addr: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InAddrIpv6) return false
        if (!this.addr.contentEquals(other.addr)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.addr.contentHashCode()
    }
}

public data class IpxPattern(public var src: IpxPattern0 = IpxPattern0(), public var dest: IpxPattern0 = IpxPattern0())

public data class IpxPattern0(
    public var networkAddress: UInt = 0u,
    public var nodeAddress: UByteArray = UByteArray(6),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpxPattern0) return false
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

public data class IpPattern(
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var srcAddr: UInt = 0u,
    public var dstAddr: UInt = 0u,
    public var sUn: IpPattern0 = IpPattern0(),
    public var protocolId: UByte = 0u,
    public var reserved3: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpPattern) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.srcAddr != other.srcAddr) return false
        if (this.dstAddr != other.dstAddr) return false
        if (this.sUn != other.sUn) return false
        if (this.protocolId != other.protocolId) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.srcAddr.hashCode()
        result = 31 * result + this.dstAddr.hashCode()
        result = 31 * result + this.sUn.hashCode()
        result = 31 * result + this.protocolId.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        return result
    }
}

public data class IpPattern0(
    public var sUnPorts: IpPattern00 = IpPattern00(),
    public var sUnIcmp: IpPattern01 = IpPattern01(),
    public var sSpi: UInt = 0u,
)

public data class IpPattern01(
    public var sType: UByte = 0u,
    public var sCode: UByte = 0u,
    public var filler: UShort = 0u,
)

public data class IpPattern00(public var sSrcport: UShort = 0u, public var sDstport: UShort = 0u)

public data class IsAdspecBody(public var adspecMh: IntServMainHdr = IntServMainHdr(), public var adspecGenparms: GenAdspecParams = GenAdspecParams())

public data class IsFlowspec(public var flowHeader: RsvpObjHdr = RsvpObjHdr(), public var flowBody: IntServFlowSpec = IntServFlowSpec())

public data class IntServFlowSpec(public var specMh: IntServMainHdr = IntServMainHdr(), public var specU: IntServFlowSpec0 = IntServFlowSpec0())

public data class IntServFlowSpec0(
    public var clSpec: CtrlLoadFlowspec = CtrlLoadFlowspec(),
    public var gSpec: GuarFlowSpec = GuarFlowSpec(),
    public var qSpec: QualAppFlowSpec = QualAppFlowSpec(),
)

public data class IntServMainHdr(
    public var ismhVersion: UByte = 0u,
    public var ismhUnused: UByte = 0u,
    public var ismhLen32b: UShort = 0u,
)

public data class IntServParmHdr(
    public var isphParmNum: UByte = 0u,
    public var isphFlags: UByte = 0u,
    public var isphLen32b: UShort = 0u,
)

public data class IntServServiceHdr(
    public var isshService: UByte = 0u,
    public var isshFlags: UByte = 0u,
    public var isshLen32b: UShort = 0u,
)

public data class IntServTspecBody(public var stMh: IntServMainHdr = IntServMainHdr(), public var tspecU: IntServTspecBody0 = IntServTspecBody0())

public data class IntServTspecBody0(public var genStspec: GenTspec = GenTspec(), public var qualStspec: QualTspec = QualTspec())

public data class Lpmiptable(
    public var ulIfIndex: UInt = 0u,
    public var mediaType: UInt = 0u,
    public var ifIpAddr: InAddr = InAddr(),
    public var ifNetMask: InAddr = InAddr(),
)

public data class LpmInitInfo(
    public var pcmVersionNumber: UInt = 0u,
    public var resultTimeLimit: UInt = 0u,
    public var configuredLpmCount: Int = 0,
    public var allocMemory: Pallocmem = null,
    public var freeMemory: Pfreemem = null,
    public var pcmAdmitResultCallback: Cbadmitresult = null,
    public var getRsvpObjectsCallback: Cbgetrsvpobjects = null,
)

public data class ParamBuffer(
    public var parameterId: UInt = 0u,
    public var length: UInt = 0u,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ParamBuffer) return false
        if (this.parameterId != other.parameterId) return false
        if (this.length != other.length) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parameterId.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class PolicyData(
    public var policyObjHdr: RsvpObjHdr = RsvpObjHdr(),
    public var usPeOffset: UShort = 0u,
    public var usReserved: UShort = 0u,
)

public data class PolicyDecision(
    public var lpvResult: UInt = 0u,
    public var wPolicyErrCode: UShort = 0u,
    public var wPolicyErrValue: UShort = 0u,
)

public data class PolicyElement(
    public var usPeLength: UShort = 0u,
    public var usPeType: UShort = 0u,
    public var ucPeData: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyElement) return false
        if (this.usPeLength != other.usPeLength) return false
        if (this.usPeType != other.usPeType) return false
        if (!this.ucPeData.contentEquals(other.ucPeData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usPeLength.hashCode()
        result = 31 * result + this.usPeType.hashCode()
        result = 31 * result + this.ucPeData.contentHashCode()
        return result
    }
}

public data class QosDestaddr(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var socketAddress: Sockaddr? = null,
    public var socketAddressLength: UInt = 0u,
)

public data class QosDiffserv(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var dSFieldCount: UInt = 0u,
    public var diffservRule: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QosDiffserv) return false
        if (this.objectHdr != other.objectHdr) return false
        if (this.dSFieldCount != other.dSFieldCount) return false
        if (!this.diffservRule.contentEquals(other.diffservRule)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectHdr.hashCode()
        result = 31 * result + this.dSFieldCount.hashCode()
        result = 31 * result + this.diffservRule.contentHashCode()
        return result
    }
}

public data class QosDiffservRule(
    public var inboundDSField: UByte = 0u,
    public var conformingOutboundDSField: UByte = 0u,
    public var nonConformingOutboundDSField: UByte = 0u,
    public var conformingUserPriority: UByte = 0u,
    public var nonConformingUserPriority: UByte = 0u,
)

public data class QosDsClass(public var objectHdr: QosObjectHdr = QosObjectHdr(), public var dSField: UInt = 0u)

public data class QosFlowrateOutgoing(
    public var bandwidth: ULong = 0uL,
    public var shapingBehavior: QosShaping = 0,
    public var reason: QosFlowrateReason = 0,
)

public data class QosFlowFundamentals(
    public var bottleneckBandwidthSet: Bool = 0,
    public var bottleneckBandwidth: ULong = 0uL,
    public var availableBandwidthSet: Bool = 0,
    public var availableBandwidth: ULong = 0uL,
    public var rTTSet: Bool = 0,
    public var rtt: UInt = 0u,
)

public data class QosFriendlyName(public var objectHdr: QosObjectHdr = QosObjectHdr(), public var friendlyName: UShortArray = UShortArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QosFriendlyName) return false
        if (this.objectHdr != other.objectHdr) return false
        if (!this.friendlyName.contentEquals(other.friendlyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectHdr.hashCode()
        result = 31 * result + this.friendlyName.contentHashCode()
        return result
    }
}

public data class QosObjectHdr(public var objectType: UInt = 0u, public var objectLength: UInt = 0u)

public data class QosPacketPriority(
    public var conformantDSCPValue: UInt = 0u,
    public var nonConformantDSCPValue: UInt = 0u,
    public var conformantL2Value: UInt = 0u,
    public var nonConformantL2Value: UInt = 0u,
)

public data class QosSdMode(public var objectHdr: QosObjectHdr = QosObjectHdr(), public var shapeDiscardMode: UInt = 0u)

public data class QosShapingRate(public var objectHdr: QosObjectHdr = QosObjectHdr(), public var shapingRate: UInt = 0u)

public data class QosTcpTraffic(public var objectHdr: QosObjectHdr = QosObjectHdr())

public data class QosTrafficClass(public var objectHdr: QosObjectHdr = QosObjectHdr(), public var trafficClass: UInt = 0u)

public data class QosVersion(public var majorVersion: UShort = 0u, public var minorVersion: UShort = 0u)

public data class QualAppFlowSpec(
    public var qSpecServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var qSpecParmHdr: IntServParmHdr = IntServParmHdr(),
    public var qSpecParms: QualTspecParms = QualTspecParms(),
)

public data class QualTspec(
    public var qualTspecServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var qualTspecParmHdr: IntServParmHdr = IntServParmHdr(),
    public var qualTspecParms: QualTspecParms = QualTspecParms(),
)

public data class QualTspecParms(public var tbTspecM: UInt = 0u)

public data class ResvStyle(public var styleHeader: RsvpObjHdr = RsvpObjHdr(), public var styleWord: UInt = 0u)

public data class RsvpAdspec(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var generalParams: AdGeneralParams = AdGeneralParams(),
    public var numberOfServices: UInt = 0u,
    public var services: List<ControlService> = List(1) { ControlService() },
)

public data class RsvpFilterspec(public var type: FilterType = 0, public var anonymous: RsvpFilterspec0 = RsvpFilterspec0())

public data class RsvpFilterspec0(
    public var filterSpecV4: RsvpFilterspecV4 = RsvpFilterspecV4(),
    public var filterSpecV6: RsvpFilterspecV6 = RsvpFilterspecV6(),
    public var filterSpecV6Flow: RsvpFilterspecV6Flow = RsvpFilterspecV6Flow(),
    public var filterSpecV4Gpi: RsvpFilterspecV4Gpi = RsvpFilterspecV4Gpi(),
    public var filterSpecV6Gpi: RsvpFilterspecV6Gpi = RsvpFilterspecV6Gpi(),
)

public data class RsvpFilterspecV4(
    public var address: InAddrIpv4 = InAddrIpv4(),
    public var unused: UShort = 0u,
    public var port: UShort = 0u,
)

public data class RsvpFilterspecV4Gpi(public var address: InAddrIpv4 = InAddrIpv4(), public var generalPortId: UInt = 0u)

public data class RsvpFilterspecV6(
    public var address: InAddrIpv6 = InAddrIpv6(),
    public var unUsed: UShort = 0u,
    public var port: UShort = 0u,
)

public data class RsvpFilterspecV6Flow(
    public var address: InAddrIpv6 = InAddrIpv6(),
    public var unUsed: UByte = 0u,
    public var flowLabel: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RsvpFilterspecV6Flow) return false
        if (this.address != other.address) return false
        if (this.unUsed != other.unUsed) return false
        if (!this.flowLabel.contentEquals(other.flowLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.unUsed.hashCode()
        result = 31 * result + this.flowLabel.contentHashCode()
        return result
    }
}

public data class RsvpFilterspecV6Gpi(public var address: InAddrIpv6 = InAddrIpv6(), public var generalPortId: UInt = 0u)

public data class RsvpHop(public var hopHeader: RsvpObjHdr = RsvpObjHdr(), public var hopU: RsvpHop0 = RsvpHop0())

public data class RsvpHop0(public var hopIpv4: RsvpHopIpv4 = RsvpHopIpv4())

public data class RsvpMsgObjs(
    public var rsvpMsgType: Int = 0,
    public var pRsvpSession: RsvpSession? = null,
    public var pRsvpFromHop: RsvpHop? = null,
    public var pRsvpToHop: RsvpHop? = null,
    public var pResvStyle: ResvStyle? = null,
    public var pRsvpScope: RsvpScope? = null,
    public var flowDescCount: Int = 0,
    public var pFlowDescs: FlowDesc? = null,
    public var pdObjectCount: Int = 0,
    public var ppPdObjects: COpaquePointer? = null,
    public var pErrorSpec: ErrorSpec? = null,
    public var pAdspec: Adspec? = null,
)

public data class RsvpPolicy(
    public var len: UShort = 0u,
    public var type: UShort = 0u,
    public var info: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RsvpPolicy) return false
        if (this.len != other.len) return false
        if (this.type != other.type) return false
        if (!this.info.contentEquals(other.info)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.info.contentHashCode()
        return result
    }
}

public data class RsvpPolicyInfo(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var numPolicyElement: UInt = 0u,
    public var policyElement: List<RsvpPolicy> = List(1) { RsvpPolicy() },
)

public data class RsvpReserveInfo(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var style: UInt = 0u,
    public var confirmRequest: UInt = 0u,
    public var policyElementList: RsvpPolicyInfo? = null,
    public var numFlowDesc: UInt = 0u,
    public var flowDescList: Flowdescriptor? = null,
)

public data class RsvpScope(public var scoplHeader: RsvpObjHdr = RsvpObjHdr(), public var scopeU: RsvpScope0 = RsvpScope0())

public data class RsvpScope0(public var scoplIpv4: ScopeListIpv4 = ScopeListIpv4())

public data class RsvpSession(public var sessHeader: RsvpObjHdr = RsvpObjHdr(), public var sessU: RsvpSession0 = RsvpSession0())

public data class RsvpSession0(public var sessIpv4: SessionIpv4 = SessionIpv4())

public data class RsvpStatusInfo(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var statusCode: UInt = 0u,
    public var extendedStatus1: UInt = 0u,
    public var extendedStatus2: UInt = 0u,
)

public data class RsvpObjHdr(
    public var objLength: UShort = 0u,
    public var objClass: UByte = 0u,
    public var objCtype: UByte = 0u,
)

public data class RsvpHopIpv4(public var hopIpaddr: InAddr = InAddr(), public var hopLih: UInt = 0u)

public data class SenderTspec(public var stspecHeader: RsvpObjHdr = RsvpObjHdr(), public var stspecBody: IntServTspecBody = IntServTspecBody())

public data class SipaeventKsrSignaturePayload(
    public var signAlgID: UInt = 0u,
    public var signatureLength: UInt = 0u,
    public var signature: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SipaeventKsrSignaturePayload) return false
        if (this.signAlgID != other.signAlgID) return false
        if (this.signatureLength != other.signatureLength) return false
        if (!this.signature.contentEquals(other.signature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signAlgID.hashCode()
        result = 31 * result + this.signatureLength.hashCode()
        result = 31 * result + this.signature.contentHashCode()
        return result
    }
}

public data class SipaeventRevocationListPayload(
    public var creationTime: Long = 0L,
    public var digestLength: UInt = 0u,
    public var hashAlgID: UShort = 0u,
    public var digest: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SipaeventRevocationListPayload) return false
        if (this.creationTime != other.creationTime) return false
        if (this.digestLength != other.digestLength) return false
        if (this.hashAlgID != other.hashAlgID) return false
        if (!this.digest.contentEquals(other.digest)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.creationTime.hashCode()
        result = 31 * result + this.digestLength.hashCode()
        result = 31 * result + this.hashAlgID.hashCode()
        result = 31 * result + this.digest.contentHashCode()
        return result
    }
}

public data class SipaeventSbcpInfoPayloadV1(
    public var payloadVersion: UInt = 0u,
    public var varDataOffset: UInt = 0u,
    public var hashAlgID: UShort = 0u,
    public var digestLength: UShort = 0u,
    public var options: UInt = 0u,
    public var signersCount: UInt = 0u,
    public var varData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SipaeventSbcpInfoPayloadV1) return false
        if (this.payloadVersion != other.payloadVersion) return false
        if (this.varDataOffset != other.varDataOffset) return false
        if (this.hashAlgID != other.hashAlgID) return false
        if (this.digestLength != other.digestLength) return false
        if (this.options != other.options) return false
        if (this.signersCount != other.signersCount) return false
        if (!this.varData.contentEquals(other.varData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.payloadVersion.hashCode()
        result = 31 * result + this.varDataOffset.hashCode()
        result = 31 * result + this.hashAlgID.hashCode()
        result = 31 * result + this.digestLength.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.signersCount.hashCode()
        result = 31 * result + this.varData.contentHashCode()
        return result
    }
}

public data class SipaeventSiPolicyPayload(
    public var policyVersion: ULong = 0uL,
    public var policyNameLength: UShort = 0u,
    public var hashAlgID: UShort = 0u,
    public var digestLength: UInt = 0u,
    public var varLengthData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SipaeventSiPolicyPayload) return false
        if (this.policyVersion != other.policyVersion) return false
        if (this.policyNameLength != other.policyNameLength) return false
        if (this.hashAlgID != other.hashAlgID) return false
        if (this.digestLength != other.digestLength) return false
        if (!this.varLengthData.contentEquals(other.varLengthData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.policyVersion.hashCode()
        result = 31 * result + this.policyNameLength.hashCode()
        result = 31 * result + this.hashAlgID.hashCode()
        result = 31 * result + this.digestLength.hashCode()
        result = 31 * result + this.varLengthData.contentHashCode()
        return result
    }
}

public data class SipaeventVsmIdkInfoPayload(public var keyAlgID: UInt = 0u, public var anonymous: SipaeventVsmIdkInfoPayload0 = SipaeventVsmIdkInfoPayload0())

public data class SipaeventVsmIdkInfoPayload0(public var rsaKeyInfo: SipaeventVsmIdkRsaInfo = SipaeventVsmIdkRsaInfo())

public data class SipaeventVsmIdkRsaInfo(
    public var keyBitLength: UInt = 0u,
    public var publicExpLengthBytes: UInt = 0u,
    public var modulusSizeBytes: UInt = 0u,
    public var publicKeyData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SipaeventVsmIdkRsaInfo) return false
        if (this.keyBitLength != other.keyBitLength) return false
        if (this.publicExpLengthBytes != other.publicExpLengthBytes) return false
        if (this.modulusSizeBytes != other.modulusSizeBytes) return false
        if (!this.publicKeyData.contentEquals(other.publicKeyData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyBitLength.hashCode()
        result = 31 * result + this.publicExpLengthBytes.hashCode()
        result = 31 * result + this.modulusSizeBytes.hashCode()
        result = 31 * result + this.publicKeyData.contentHashCode()
        return result
    }
}

public data class ScopeListIpv4(public var scoplIpaddr: List<InAddr> = List(1) { InAddr() })

public data class SessionIpv4(
    public var sessDestaddr: InAddr = InAddr(),
    public var sessProtid: UByte = 0u,
    public var sessFlags: UByte = 0u,
    public var sessDestport: UShort = 0u,
)

public data class TcgPcclientPcreventStruct(
    public var pcrIndex: UInt = 0u,
    public var eventType: UInt = 0u,
    public var digest: UByteArray = UByteArray(20),
    public var eventDataSize: UInt = 0u,
    public var event: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcgPcclientPcreventStruct) return false
        if (this.pcrIndex != other.pcrIndex) return false
        if (this.eventType != other.eventType) return false
        if (!this.digest.contentEquals(other.digest)) return false
        if (this.eventDataSize != other.eventDataSize) return false
        if (!this.event.contentEquals(other.event)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pcrIndex.hashCode()
        result = 31 * result + this.eventType.hashCode()
        result = 31 * result + this.digest.contentHashCode()
        result = 31 * result + this.eventDataSize.hashCode()
        result = 31 * result + this.event.contentHashCode()
        return result
    }
}

public data class TcgPcclientTaggedEventStruct(
    public var eventID: UInt = 0u,
    public var eventDataSize: UInt = 0u,
    public var eventData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcgPcclientTaggedEventStruct) return false
        if (this.eventID != other.eventID) return false
        if (this.eventDataSize != other.eventDataSize) return false
        if (!this.eventData.contentEquals(other.eventData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventID.hashCode()
        result = 31 * result + this.eventDataSize.hashCode()
        result = 31 * result + this.eventData.contentHashCode()
        return result
    }
}

public data class TciClientFuncList(
    public var clNotifyHandler: TciNotifyHandler = null,
    public var clAddFlowCompleteHandler: TciAddFlowCompleteHandler = null,
    public var clModifyFlowCompleteHandler: TciModFlowCompleteHandler = null,
    public var clDeleteFlowCompleteHandler: TciDelFlowCompleteHandler = null,
)

public data class TcGenFilter(
    public var addressType: UShort = 0u,
    public var patternSize: UInt = 0u,
    public var pattern: COpaquePointer? = null,
    public var mask: COpaquePointer? = null,
)

public data class TcGenFlow(
    public var sendingFlowspec: Flowspec = Flowspec(),
    public var receivingFlowspec: Flowspec = Flowspec(),
    public var tcObjectsLength: UInt = 0u,
    public var tcObjects: List<QosObjectHdr> = List(1) { QosObjectHdr() },
)

public data class TcIfcDescriptor(
    public var length: UInt = 0u,
    public var pInterfaceName: Pwstr = null,
    public var pInterfaceID: Pwstr = null,
    public var addressListDesc: AddressListDescriptor = AddressListDescriptor(),
)

public data class TcSupportedInfoBuffer(
    public var instanceIDLength: UShort = 0u,
    public var instanceID: UShortArray = UShortArray(256),
    public var interfaceLuid: ULong = 0uL,
    public var addrListDesc: AddressListDescriptor = AddressListDescriptor(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcSupportedInfoBuffer) return false
        if (this.instanceIDLength != other.instanceIDLength) return false
        if (!this.instanceID.contentEquals(other.instanceID)) return false
        if (this.interfaceLuid != other.interfaceLuid) return false
        if (this.addrListDesc != other.addrListDesc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instanceIDLength.hashCode()
        result = 31 * result + this.instanceID.contentHashCode()
        result = 31 * result + this.interfaceLuid.hashCode()
        result = 31 * result + this.addrListDesc.hashCode()
        return result
    }
}

public data class WbclIterator(
    public var firstElementPtr: COpaquePointer? = null,
    public var logSize: UInt = 0u,
    public var currentElementPtr: COpaquePointer? = null,
    public var currentElementSize: UInt = 0u,
    public var digestSize: UShort = 0u,
    public var logFormat: UShort = 0u,
    public var numberOfDigests: UInt = 0u,
    public var digestSizes: COpaquePointer? = null,
    public var supportedAlgorithms: UInt = 0u,
    public var hashAlgorithm: UShort = 0u,
)

public data class WbclLogHdr(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var entries: UInt = 0u,
    public var length: UInt = 0u,
)
