@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.FLOWSPEC
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.IN_ADDR
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NETWORK_ADDRESS_LIST

public data class ADDRESS_LIST_DESCRIPTOR(public var MediaType: UInt = 0u, public var AddressList: NETWORK_ADDRESS_LIST = NETWORK_ADDRESS_LIST())

public data class ADSPEC(public var adspec_header: RsvpObjHdr = RsvpObjHdr(), public var adspec_body: IS_ADSPEC_BODY = IS_ADSPEC_BODY())

public data class AD_GENERAL_PARAMS(
    public var IntServAwareHopCount: UInt = 0u,
    public var PathBandwidthEstimate: UInt = 0u,
    public var MinimumLatency: UInt = 0u,
    public var PathMTU: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class AD_GUARANTEED(
    public var CTotal: UInt = 0u,
    public var DTotal: UInt = 0u,
    public var CSum: UInt = 0u,
    public var DSum: UInt = 0u,
)

public data class CONTROL_SERVICE(
    public var Length: UInt = 0u,
    public var Service: UInt = 0u,
    public var Overrides: AD_GENERAL_PARAMS = AD_GENERAL_PARAMS(),
    public var Anonymous: CONTROL_SERVICE_0 = CONTROL_SERVICE_0(),
)

public data class CONTROL_SERVICE_0(public var Guaranteed: AD_GUARANTEED = AD_GUARANTEED(), public var ParamBuffer: List<PARAM_BUFFER> = List(1) { PARAM_BUFFER() })

public data class CtrlLoadFlowspec(
    public var CL_spec_serv_hdr: IntServServiceHdr = IntServServiceHdr(),
    public var CL_spec_parm_hdr: IntServParmHdr = IntServParmHdr(),
    public var CL_spec_parms: GenTspecParms = GenTspecParms(),
)

public data class ENUMERATION_BUFFER(
    public var Length: UInt = 0u,
    public var OwnerProcessId: UInt = 0u,
    public var FlowNameLength: UShort = 0u,
    public var FlowName: UShortArray = UShortArray(256),
    public var pFlow: Long = 0L,
    public var NumberOfFilters: UInt = 0u,
    public var GenericFilter: List<TC_GEN_FILTER> = List(1) { TC_GEN_FILTER() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENUMERATION_BUFFER) return false
        if (this.Length != other.Length) return false
        if (this.OwnerProcessId != other.OwnerProcessId) return false
        if (this.FlowNameLength != other.FlowNameLength) return false
        if (!this.FlowName.contentEquals(other.FlowName)) return false
        if (this.pFlow != other.pFlow) return false
        if (this.NumberOfFilters != other.NumberOfFilters) return false
        if (this.GenericFilter != other.GenericFilter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.OwnerProcessId.hashCode()
        result = 31 * result + this.FlowNameLength.hashCode()
        result = 31 * result + this.FlowName.contentHashCode()
        result = 31 * result + this.pFlow.hashCode()
        result = 31 * result + this.NumberOfFilters.hashCode()
        result = 31 * result + this.GenericFilter.hashCode()
        return result
    }
}

public data class ERROR_SPEC(public var errs_header: RsvpObjHdr = RsvpObjHdr(), public var errs_u: ERROR_SPEC_0 = ERROR_SPEC_0())

public data class ERROR_SPEC_0(public var errs_ipv4: Error_Spec_IPv4 = Error_Spec_IPv4())

public data class Error_Spec_IPv4(
    public var errs_errnode: IN_ADDR = IN_ADDR(),
    public var errs_flags: UByte = 0u,
    public var errs_code: UByte = 0u,
    public var errs_value: UShort = 0u,
)

public data class FILTER_SPEC(public var filt_header: RsvpObjHdr = RsvpObjHdr(), public var filt_u: FILTER_SPEC_0 = FILTER_SPEC_0())

public data class FILTER_SPEC_0(public var filt_ipv4: Filter_Spec_IPv4 = Filter_Spec_IPv4(), public var filt_ipv4gpi: Filter_Spec_IPv4GPI = Filter_Spec_IPv4GPI())

public data class FLOWDESCRIPTOR(
    public var FlowSpec: FLOWSPEC = FLOWSPEC(),
    public var NumFilters: UInt = 0u,
    public var FilterList: Long = 0L,
)

public data class FLOW_DESC(public var u1: FLOW_DESC_0 = FLOW_DESC_0(), public var u2: FLOW_DESC_1 = FLOW_DESC_1())

public data class FLOW_DESC_0(public var stspec: Long = 0L, public var isflow: Long = 0L)

public data class FLOW_DESC_1(public var stemp: Long = 0L, public var fspec: Long = 0L)

public data class Filter_Spec_IPv4(
    public var filt_ipaddr: IN_ADDR = IN_ADDR(),
    public var filt_unused: UShort = 0u,
    public var filt_port: UShort = 0u,
)

public data class Filter_Spec_IPv4GPI(public var filt_ipaddr: IN_ADDR = IN_ADDR(), public var filt_gpi: UInt = 0u)

public data class Gads_parms_t(
    public var Gads_serv_hdr: IntServServiceHdr = IntServServiceHdr(),
    public var Gads_Ctot_hdr: IntServParmHdr = IntServParmHdr(),
    public var Gads_Ctot: UInt = 0u,
    public var Gads_Dtot_hdr: IntServParmHdr = IntServParmHdr(),
    public var Gads_Dtot: UInt = 0u,
    public var Gads_Csum_hdr: IntServParmHdr = IntServParmHdr(),
    public var Gads_Csum: UInt = 0u,
    public var Gads_Dsum_hdr: IntServParmHdr = IntServParmHdr(),
    public var Gads_Dsum: UInt = 0u,
)

public data class GenAdspecParams(
    public var gen_parm_hdr: IntServServiceHdr = IntServServiceHdr(),
    public var gen_parm_hopcnt_hdr: IntServParmHdr = IntServParmHdr(),
    public var gen_parm_hopcnt: UInt = 0u,
    public var gen_parm_pathbw_hdr: IntServParmHdr = IntServParmHdr(),
    public var gen_parm_path_bw: Float = 0.0f,
    public var gen_parm_minlat_hdr: IntServParmHdr = IntServParmHdr(),
    public var gen_parm_min_latency: UInt = 0u,
    public var gen_parm_compmtu_hdr: IntServParmHdr = IntServParmHdr(),
    public var gen_parm_composed_MTU: UInt = 0u,
)

public data class GenTspec(
    public var gen_Tspec_serv_hdr: IntServServiceHdr = IntServServiceHdr(),
    public var gen_Tspec_parm_hdr: IntServParmHdr = IntServParmHdr(),
    public var gen_Tspec_parms: GenTspecParms = GenTspecParms(),
)

public data class GenTspecParms(
    public var TB_Tspec_r: Float = 0.0f,
    public var TB_Tspec_b: Float = 0.0f,
    public var TB_Tspec_p: Float = 0.0f,
    public var TB_Tspec_m: UInt = 0u,
    public var TB_Tspec_M: UInt = 0u,
)

public data class GuarFlowSpec(
    public var Guar_serv_hdr: IntServServiceHdr = IntServServiceHdr(),
    public var Guar_Tspec_hdr: IntServParmHdr = IntServParmHdr(),
    public var Guar_Tspec_parms: GenTspecParms = GenTspecParms(),
    public var Guar_Rspec_hdr: IntServParmHdr = IntServParmHdr(),
    public var Guar_Rspec: GuarRspec = GuarRspec(),
)

public data class GuarRspec(public var Guar_R: Float = 0.0f, public var Guar_S: UInt = 0u)

public data class HSP_UPGRADE_IMAGEDATA(
    public var hashAlgID: UShort = 0u,
    public var digestSize: UShort = 0u,
    public var digest: UByteArray = UByteArray(64),
    public var fileName: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HSP_UPGRADE_IMAGEDATA) return false
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

public data class IDPE_ATTR(
    public var PeAttribLength: UShort = 0u,
    public var PeAttribType: UByte = 0u,
    public var PeAttribSubType: UByte = 0u,
    public var PeAttribValue: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IDPE_ATTR) return false
        if (this.PeAttribLength != other.PeAttribLength) return false
        if (this.PeAttribType != other.PeAttribType) return false
        if (this.PeAttribSubType != other.PeAttribSubType) return false
        if (!this.PeAttribValue.contentEquals(other.PeAttribValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PeAttribLength.hashCode()
        result = 31 * result + this.PeAttribType.hashCode()
        result = 31 * result + this.PeAttribSubType.hashCode()
        result = 31 * result + this.PeAttribValue.contentHashCode()
        return result
    }
}

public data class ID_ERROR_OBJECT(
    public var usIdErrLength: UShort = 0u,
    public var ucAType: UByte = 0u,
    public var ucSubType: UByte = 0u,
    public var usReserved: UShort = 0u,
    public var usIdErrorValue: UShort = 0u,
    public var ucIdErrData: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ID_ERROR_OBJECT) return false
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

public data class IN_ADDR_IPV4(public var Addr: UInt = 0u, public var AddrBytes: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IN_ADDR_IPV4) return false
        if (this.Addr != other.Addr) return false
        if (!this.AddrBytes.contentEquals(other.AddrBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Addr.hashCode()
        result = 31 * result + this.AddrBytes.contentHashCode()
        return result
    }
}

public data class IN_ADDR_IPV6(public var Addr: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IN_ADDR_IPV6) return false
        if (!this.Addr.contentEquals(other.Addr)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Addr.contentHashCode()
    }
}

public data class IPX_PATTERN(public var Src: IPX_PATTERN_0 = IPX_PATTERN_0(), public var Dest: IPX_PATTERN_0 = IPX_PATTERN_0())

public data class IPX_PATTERN_0(
    public var NetworkAddress: UInt = 0u,
    public var NodeAddress: UByteArray = UByteArray(6),
    public var Socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPX_PATTERN_0) return false
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

public data class IP_PATTERN(
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var SrcAddr: UInt = 0u,
    public var DstAddr: UInt = 0u,
    public var S_un: IP_PATTERN_0 = IP_PATTERN_0(),
    public var ProtocolId: UByte = 0u,
    public var Reserved3: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IP_PATTERN) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.SrcAddr != other.SrcAddr) return false
        if (this.DstAddr != other.DstAddr) return false
        if (this.S_un != other.S_un) return false
        if (this.ProtocolId != other.ProtocolId) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.SrcAddr.hashCode()
        result = 31 * result + this.DstAddr.hashCode()
        result = 31 * result + this.S_un.hashCode()
        result = 31 * result + this.ProtocolId.hashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        return result
    }
}

public data class IP_PATTERN_0(
    public var S_un_ports: IP_PATTERN_0_0 = IP_PATTERN_0_0(),
    public var S_un_icmp: IP_PATTERN_0_1 = IP_PATTERN_0_1(),
    public var S_Spi: UInt = 0u,
)

public data class IP_PATTERN_0_1(
    public var s_type: UByte = 0u,
    public var s_code: UByte = 0u,
    public var filler: UShort = 0u,
)

public data class IP_PATTERN_0_0(public var s_srcport: UShort = 0u, public var s_dstport: UShort = 0u)

public data class IS_ADSPEC_BODY(public var adspec_mh: IntServMainHdr = IntServMainHdr(), public var adspec_genparms: GenAdspecParams = GenAdspecParams())

public data class IS_FLOWSPEC(public var flow_header: RsvpObjHdr = RsvpObjHdr(), public var flow_body: IntServFlowSpec = IntServFlowSpec())

public data class IntServFlowSpec(public var spec_mh: IntServMainHdr = IntServMainHdr(), public var spec_u: IntServFlowSpec_0 = IntServFlowSpec_0())

public data class IntServFlowSpec_0(
    public var CL_spec: CtrlLoadFlowspec = CtrlLoadFlowspec(),
    public var G_spec: GuarFlowSpec = GuarFlowSpec(),
    public var Q_spec: QualAppFlowSpec = QualAppFlowSpec(),
)

public data class IntServMainHdr(
    public var ismh_version: UByte = 0u,
    public var ismh_unused: UByte = 0u,
    public var ismh_len32b: UShort = 0u,
)

public data class IntServParmHdr(
    public var isph_parm_num: UByte = 0u,
    public var isph_flags: UByte = 0u,
    public var isph_len32b: UShort = 0u,
)

public data class IntServServiceHdr(
    public var issh_service: UByte = 0u,
    public var issh_flags: UByte = 0u,
    public var issh_len32b: UShort = 0u,
)

public data class IntServTspecBody(public var st_mh: IntServMainHdr = IntServMainHdr(), public var tspec_u: IntServTspecBody_0 = IntServTspecBody_0())

public data class IntServTspecBody_0(public var gen_stspec: GenTspec = GenTspec(), public var qual_stspec: QualTspec = QualTspec())

public data class LPMIPTABLE(
    public var ulIfIndex: UInt = 0u,
    public var MediaType: UInt = 0u,
    public var IfIpAddr: IN_ADDR = IN_ADDR(),
    public var IfNetMask: IN_ADDR = IN_ADDR(),
)

public data class LPM_INIT_INFO(
    public var PcmVersionNumber: UInt = 0u,
    public var ResultTimeLimit: UInt = 0u,
    public var ConfiguredLpmCount: Int = 0,
    public var AllocMemory: PALLOCMEM = null,
    public var FreeMemory: PFREEMEM = null,
    public var PcmAdmitResultCallback: CBADMITRESULT = null,
    public var GetRsvpObjectsCallback: CBGETRSVPOBJECTS = null,
)

public data class PARAM_BUFFER(
    public var ParameterId: UInt = 0u,
    public var Length: UInt = 0u,
    public var Buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PARAM_BUFFER) return false
        if (this.ParameterId != other.ParameterId) return false
        if (this.Length != other.Length) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ParameterId.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class POLICY_DATA(
    public var PolicyObjHdr: RsvpObjHdr = RsvpObjHdr(),
    public var usPeOffset: UShort = 0u,
    public var usReserved: UShort = 0u,
)

public data class POLICY_DECISION(
    public var lpvResult: UInt = 0u,
    public var wPolicyErrCode: UShort = 0u,
    public var wPolicyErrValue: UShort = 0u,
)

public data class POLICY_ELEMENT(
    public var usPeLength: UShort = 0u,
    public var usPeType: UShort = 0u,
    public var ucPeData: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is POLICY_ELEMENT) return false
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

public data class QOS_DESTADDR(
    public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(),
    public var SocketAddress: Long = 0L,
    public var SocketAddressLength: UInt = 0u,
)

public data class QOS_DIFFSERV(
    public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(),
    public var DSFieldCount: UInt = 0u,
    public var DiffservRule: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QOS_DIFFSERV) return false
        if (this.ObjectHdr != other.ObjectHdr) return false
        if (this.DSFieldCount != other.DSFieldCount) return false
        if (!this.DiffservRule.contentEquals(other.DiffservRule)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ObjectHdr.hashCode()
        result = 31 * result + this.DSFieldCount.hashCode()
        result = 31 * result + this.DiffservRule.contentHashCode()
        return result
    }
}

public data class QOS_DIFFSERV_RULE(
    public var InboundDSField: UByte = 0u,
    public var ConformingOutboundDSField: UByte = 0u,
    public var NonConformingOutboundDSField: UByte = 0u,
    public var ConformingUserPriority: UByte = 0u,
    public var NonConformingUserPriority: UByte = 0u,
)

public data class QOS_DS_CLASS(public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(), public var DSField: UInt = 0u)

public data class QOS_FLOWRATE_OUTGOING(
    public var Bandwidth: ULong = 0uL,
    public var ShapingBehavior: QOS_SHAPING = 0,
    public var Reason: QOS_FLOWRATE_REASON = 0,
)

public data class QOS_FLOW_FUNDAMENTALS(
    public var BottleneckBandwidthSet: BOOL = 0,
    public var BottleneckBandwidth: ULong = 0uL,
    public var AvailableBandwidthSet: BOOL = 0,
    public var AvailableBandwidth: ULong = 0uL,
    public var RTTSet: BOOL = 0,
    public var RTT: UInt = 0u,
)

public data class QOS_FRIENDLY_NAME(public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(), public var FriendlyName: UShortArray = UShortArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QOS_FRIENDLY_NAME) return false
        if (this.ObjectHdr != other.ObjectHdr) return false
        if (!this.FriendlyName.contentEquals(other.FriendlyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ObjectHdr.hashCode()
        result = 31 * result + this.FriendlyName.contentHashCode()
        return result
    }
}

public data class QOS_OBJECT_HDR(public var ObjectType: UInt = 0u, public var ObjectLength: UInt = 0u)

public data class QOS_PACKET_PRIORITY(
    public var ConformantDSCPValue: UInt = 0u,
    public var NonConformantDSCPValue: UInt = 0u,
    public var ConformantL2Value: UInt = 0u,
    public var NonConformantL2Value: UInt = 0u,
)

public data class QOS_SD_MODE(public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(), public var ShapeDiscardMode: UInt = 0u)

public data class QOS_SHAPING_RATE(public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(), public var ShapingRate: UInt = 0u)

public data class QOS_TCP_TRAFFIC(public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR())

public data class QOS_TRAFFIC_CLASS(public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(), public var TrafficClass: UInt = 0u)

public data class QOS_VERSION(public var MajorVersion: UShort = 0u, public var MinorVersion: UShort = 0u)

public data class QualAppFlowSpec(
    public var Q_spec_serv_hdr: IntServServiceHdr = IntServServiceHdr(),
    public var Q_spec_parm_hdr: IntServParmHdr = IntServParmHdr(),
    public var Q_spec_parms: QualTspecParms = QualTspecParms(),
)

public data class QualTspec(
    public var qual_Tspec_serv_hdr: IntServServiceHdr = IntServServiceHdr(),
    public var qual_Tspec_parm_hdr: IntServParmHdr = IntServParmHdr(),
    public var qual_Tspec_parms: QualTspecParms = QualTspecParms(),
)

public data class QualTspecParms(public var TB_Tspec_M: UInt = 0u)

public data class RESV_STYLE(public var style_header: RsvpObjHdr = RsvpObjHdr(), public var style_word: UInt = 0u)

public data class RSVP_ADSPEC(
    public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(),
    public var GeneralParams: AD_GENERAL_PARAMS = AD_GENERAL_PARAMS(),
    public var NumberOfServices: UInt = 0u,
    public var Services: List<CONTROL_SERVICE> = List(1) { CONTROL_SERVICE() },
)

public data class RSVP_FILTERSPEC(public var Type: FilterType = 0, public var Anonymous: RSVP_FILTERSPEC_0 = RSVP_FILTERSPEC_0())

public data class RSVP_FILTERSPEC_0(
    public var FilterSpecV4: RSVP_FILTERSPEC_V4 = RSVP_FILTERSPEC_V4(),
    public var FilterSpecV6: RSVP_FILTERSPEC_V6 = RSVP_FILTERSPEC_V6(),
    public var FilterSpecV6Flow: RSVP_FILTERSPEC_V6_FLOW = RSVP_FILTERSPEC_V6_FLOW(),
    public var FilterSpecV4Gpi: RSVP_FILTERSPEC_V4_GPI = RSVP_FILTERSPEC_V4_GPI(),
    public var FilterSpecV6Gpi: RSVP_FILTERSPEC_V6_GPI = RSVP_FILTERSPEC_V6_GPI(),
)

public data class RSVP_FILTERSPEC_V4(
    public var Address: IN_ADDR_IPV4 = IN_ADDR_IPV4(),
    public var Unused: UShort = 0u,
    public var Port: UShort = 0u,
)

public data class RSVP_FILTERSPEC_V4_GPI(public var Address: IN_ADDR_IPV4 = IN_ADDR_IPV4(), public var GeneralPortId: UInt = 0u)

public data class RSVP_FILTERSPEC_V6(
    public var Address: IN_ADDR_IPV6 = IN_ADDR_IPV6(),
    public var UnUsed: UShort = 0u,
    public var Port: UShort = 0u,
)

public data class RSVP_FILTERSPEC_V6_FLOW(
    public var Address: IN_ADDR_IPV6 = IN_ADDR_IPV6(),
    public var UnUsed: UByte = 0u,
    public var FlowLabel: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RSVP_FILTERSPEC_V6_FLOW) return false
        if (this.Address != other.Address) return false
        if (this.UnUsed != other.UnUsed) return false
        if (!this.FlowLabel.contentEquals(other.FlowLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Address.hashCode()
        result = 31 * result + this.UnUsed.hashCode()
        result = 31 * result + this.FlowLabel.contentHashCode()
        return result
    }
}

public data class RSVP_FILTERSPEC_V6_GPI(public var Address: IN_ADDR_IPV6 = IN_ADDR_IPV6(), public var GeneralPortId: UInt = 0u)

public data class RSVP_HOP(public var hop_header: RsvpObjHdr = RsvpObjHdr(), public var hop_u: RSVP_HOP_0 = RSVP_HOP_0())

public data class RSVP_HOP_0(public var hop_ipv4: Rsvp_Hop_IPv4 = Rsvp_Hop_IPv4())

public data class RSVP_MSG_OBJS(
    public var RsvpMsgType: Int = 0,
    public var pRsvpSession: Long = 0L,
    public var pRsvpFromHop: Long = 0L,
    public var pRsvpToHop: Long = 0L,
    public var pResvStyle: Long = 0L,
    public var pRsvpScope: Long = 0L,
    public var FlowDescCount: Int = 0,
    public var pFlowDescs: Long = 0L,
    public var PdObjectCount: Int = 0,
    public var ppPdObjects: Long = 0L,
    public var pErrorSpec: Long = 0L,
    public var pAdspec: Long = 0L,
)

public data class RSVP_POLICY(
    public var Len: UShort = 0u,
    public var Type: UShort = 0u,
    public var Info: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RSVP_POLICY) return false
        if (this.Len != other.Len) return false
        if (this.Type != other.Type) return false
        if (!this.Info.contentEquals(other.Info)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Len.hashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.Info.contentHashCode()
        return result
    }
}

public data class RSVP_POLICY_INFO(
    public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(),
    public var NumPolicyElement: UInt = 0u,
    public var PolicyElement: List<RSVP_POLICY> = List(1) { RSVP_POLICY() },
)

public data class RSVP_RESERVE_INFO(
    public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(),
    public var Style: UInt = 0u,
    public var ConfirmRequest: UInt = 0u,
    public var PolicyElementList: Long = 0L,
    public var NumFlowDesc: UInt = 0u,
    public var FlowDescList: Long = 0L,
)

public data class RSVP_SCOPE(public var scopl_header: RsvpObjHdr = RsvpObjHdr(), public var scope_u: RSVP_SCOPE_0 = RSVP_SCOPE_0())

public data class RSVP_SCOPE_0(public var scopl_ipv4: Scope_list_ipv4 = Scope_list_ipv4())

public data class RSVP_SESSION(public var sess_header: RsvpObjHdr = RsvpObjHdr(), public var sess_u: RSVP_SESSION_0 = RSVP_SESSION_0())

public data class RSVP_SESSION_0(public var sess_ipv4: Session_IPv4 = Session_IPv4())

public data class RSVP_STATUS_INFO(
    public var ObjectHdr: QOS_OBJECT_HDR = QOS_OBJECT_HDR(),
    public var StatusCode: UInt = 0u,
    public var ExtendedStatus1: UInt = 0u,
    public var ExtendedStatus2: UInt = 0u,
)

public data class RsvpObjHdr(
    public var obj_length: UShort = 0u,
    public var obj_class: UByte = 0u,
    public var obj_ctype: UByte = 0u,
)

public data class Rsvp_Hop_IPv4(public var hop_ipaddr: IN_ADDR = IN_ADDR(), public var hop_LIH: UInt = 0u)

public data class SENDER_TSPEC(public var stspec_header: RsvpObjHdr = RsvpObjHdr(), public var stspec_body: IntServTspecBody = IntServTspecBody())

public data class SIPAEVENT_KSR_SIGNATURE_PAYLOAD(
    public var SignAlgID: UInt = 0u,
    public var SignatureLength: UInt = 0u,
    public var Signature: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SIPAEVENT_KSR_SIGNATURE_PAYLOAD) return false
        if (this.SignAlgID != other.SignAlgID) return false
        if (this.SignatureLength != other.SignatureLength) return false
        if (!this.Signature.contentEquals(other.Signature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SignAlgID.hashCode()
        result = 31 * result + this.SignatureLength.hashCode()
        result = 31 * result + this.Signature.contentHashCode()
        return result
    }
}

public data class SIPAEVENT_REVOCATION_LIST_PAYLOAD(
    public var CreationTime: Long = 0L,
    public var DigestLength: UInt = 0u,
    public var HashAlgID: UShort = 0u,
    public var Digest: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SIPAEVENT_REVOCATION_LIST_PAYLOAD) return false
        if (this.CreationTime != other.CreationTime) return false
        if (this.DigestLength != other.DigestLength) return false
        if (this.HashAlgID != other.HashAlgID) return false
        if (!this.Digest.contentEquals(other.Digest)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CreationTime.hashCode()
        result = 31 * result + this.DigestLength.hashCode()
        result = 31 * result + this.HashAlgID.hashCode()
        result = 31 * result + this.Digest.contentHashCode()
        return result
    }
}

public data class SIPAEVENT_SBCP_INFO_PAYLOAD_V1(
    public var PayloadVersion: UInt = 0u,
    public var VarDataOffset: UInt = 0u,
    public var HashAlgID: UShort = 0u,
    public var DigestLength: UShort = 0u,
    public var Options: UInt = 0u,
    public var SignersCount: UInt = 0u,
    public var VarData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SIPAEVENT_SBCP_INFO_PAYLOAD_V1) return false
        if (this.PayloadVersion != other.PayloadVersion) return false
        if (this.VarDataOffset != other.VarDataOffset) return false
        if (this.HashAlgID != other.HashAlgID) return false
        if (this.DigestLength != other.DigestLength) return false
        if (this.Options != other.Options) return false
        if (this.SignersCount != other.SignersCount) return false
        if (!this.VarData.contentEquals(other.VarData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PayloadVersion.hashCode()
        result = 31 * result + this.VarDataOffset.hashCode()
        result = 31 * result + this.HashAlgID.hashCode()
        result = 31 * result + this.DigestLength.hashCode()
        result = 31 * result + this.Options.hashCode()
        result = 31 * result + this.SignersCount.hashCode()
        result = 31 * result + this.VarData.contentHashCode()
        return result
    }
}

public data class SIPAEVENT_SI_POLICY_PAYLOAD(
    public var PolicyVersion: ULong = 0uL,
    public var PolicyNameLength: UShort = 0u,
    public var HashAlgID: UShort = 0u,
    public var DigestLength: UInt = 0u,
    public var VarLengthData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SIPAEVENT_SI_POLICY_PAYLOAD) return false
        if (this.PolicyVersion != other.PolicyVersion) return false
        if (this.PolicyNameLength != other.PolicyNameLength) return false
        if (this.HashAlgID != other.HashAlgID) return false
        if (this.DigestLength != other.DigestLength) return false
        if (!this.VarLengthData.contentEquals(other.VarLengthData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PolicyVersion.hashCode()
        result = 31 * result + this.PolicyNameLength.hashCode()
        result = 31 * result + this.HashAlgID.hashCode()
        result = 31 * result + this.DigestLength.hashCode()
        result = 31 * result + this.VarLengthData.contentHashCode()
        return result
    }
}

public data class SIPAEVENT_VSM_IDK_INFO_PAYLOAD(public var KeyAlgID: UInt = 0u, public var Anonymous: SIPAEVENT_VSM_IDK_INFO_PAYLOAD_0 = SIPAEVENT_VSM_IDK_INFO_PAYLOAD_0())

public data class SIPAEVENT_VSM_IDK_INFO_PAYLOAD_0(public var RsaKeyInfo: SIPAEVENT_VSM_IDK_RSA_INFO = SIPAEVENT_VSM_IDK_RSA_INFO())

public data class SIPAEVENT_VSM_IDK_RSA_INFO(
    public var KeyBitLength: UInt = 0u,
    public var PublicExpLengthBytes: UInt = 0u,
    public var ModulusSizeBytes: UInt = 0u,
    public var PublicKeyData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SIPAEVENT_VSM_IDK_RSA_INFO) return false
        if (this.KeyBitLength != other.KeyBitLength) return false
        if (this.PublicExpLengthBytes != other.PublicExpLengthBytes) return false
        if (this.ModulusSizeBytes != other.ModulusSizeBytes) return false
        if (!this.PublicKeyData.contentEquals(other.PublicKeyData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.KeyBitLength.hashCode()
        result = 31 * result + this.PublicExpLengthBytes.hashCode()
        result = 31 * result + this.ModulusSizeBytes.hashCode()
        result = 31 * result + this.PublicKeyData.contentHashCode()
        return result
    }
}

public data class Scope_list_ipv4(public var scopl_ipaddr: List<IN_ADDR> = List(1) { IN_ADDR() })

public data class Session_IPv4(
    public var sess_destaddr: IN_ADDR = IN_ADDR(),
    public var sess_protid: UByte = 0u,
    public var sess_flags: UByte = 0u,
    public var sess_destport: UShort = 0u,
)

public data class TCG_PCClientPCREventStruct(
    public var pcrIndex: UInt = 0u,
    public var eventType: UInt = 0u,
    public var digest: UByteArray = UByteArray(20),
    public var eventDataSize: UInt = 0u,
    public var event: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TCG_PCClientPCREventStruct) return false
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

public data class TCG_PCClientTaggedEventStruct(
    public var EventID: UInt = 0u,
    public var EventDataSize: UInt = 0u,
    public var EventData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TCG_PCClientTaggedEventStruct) return false
        if (this.EventID != other.EventID) return false
        if (this.EventDataSize != other.EventDataSize) return false
        if (!this.EventData.contentEquals(other.EventData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EventID.hashCode()
        result = 31 * result + this.EventDataSize.hashCode()
        result = 31 * result + this.EventData.contentHashCode()
        return result
    }
}

public data class TCI_CLIENT_FUNC_LIST(
    public var ClNotifyHandler: TCI_NOTIFY_HANDLER = null,
    public var ClAddFlowCompleteHandler: TCI_ADD_FLOW_COMPLETE_HANDLER = null,
    public var ClModifyFlowCompleteHandler: TCI_MOD_FLOW_COMPLETE_HANDLER = null,
    public var ClDeleteFlowCompleteHandler: TCI_DEL_FLOW_COMPLETE_HANDLER = null,
)

public data class TC_GEN_FILTER(
    public var AddressType: UShort = 0u,
    public var PatternSize: UInt = 0u,
    public var Pattern: Long = 0L,
    public var Mask: Long = 0L,
)

public data class TC_GEN_FLOW(
    public var SendingFlowspec: FLOWSPEC = FLOWSPEC(),
    public var ReceivingFlowspec: FLOWSPEC = FLOWSPEC(),
    public var TcObjectsLength: UInt = 0u,
    public var TcObjects: List<QOS_OBJECT_HDR> = List(1) { QOS_OBJECT_HDR() },
)

public data class TC_IFC_DESCRIPTOR(
    public var Length: UInt = 0u,
    public var pInterfaceName: PWSTR = 0L,
    public var pInterfaceID: PWSTR = 0L,
    public var AddressListDesc: ADDRESS_LIST_DESCRIPTOR = ADDRESS_LIST_DESCRIPTOR(),
)

public data class TC_SUPPORTED_INFO_BUFFER(
    public var InstanceIDLength: UShort = 0u,
    public var InstanceID: UShortArray = UShortArray(256),
    public var InterfaceLuid: ULong = 0uL,
    public var AddrListDesc: ADDRESS_LIST_DESCRIPTOR = ADDRESS_LIST_DESCRIPTOR(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TC_SUPPORTED_INFO_BUFFER) return false
        if (this.InstanceIDLength != other.InstanceIDLength) return false
        if (!this.InstanceID.contentEquals(other.InstanceID)) return false
        if (this.InterfaceLuid != other.InterfaceLuid) return false
        if (this.AddrListDesc != other.AddrListDesc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InstanceIDLength.hashCode()
        result = 31 * result + this.InstanceID.contentHashCode()
        result = 31 * result + this.InterfaceLuid.hashCode()
        result = 31 * result + this.AddrListDesc.hashCode()
        return result
    }
}

public data class WBCL_Iterator(
    public var firstElementPtr: Long = 0L,
    public var logSize: UInt = 0u,
    public var currentElementPtr: Long = 0L,
    public var currentElementSize: UInt = 0u,
    public var digestSize: UShort = 0u,
    public var logFormat: UShort = 0u,
    public var numberOfDigests: UInt = 0u,
    public var digestSizes: Long = 0L,
    public var supportedAlgorithms: UInt = 0u,
    public var hashAlgorithm: UShort = 0u,
)

public data class WBCL_LogHdr(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var entries: UInt = 0u,
    public var length: UInt = 0u,
)
