@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Flowspec
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.InAddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Sockaddr
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetworkAddressList

public data class AddressListDescriptor(
    public var mediaType: UInt = 0u,
    public var addressList: NetworkAddressList = NetworkAddressList(),
)

public data class Adspec(
    public var adspecHeader: RsvpObjHdr = RsvpObjHdr(),
    public var adspecBody: IsAdspecBody = IsAdspecBody(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adspec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adspec> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Adspec =
                    Adspec(
                        (RsvpObjHdr.typeLayout()).readNative(addr),
                        (IsAdspecBody.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Adspec) {
                    (RsvpObjHdr.typeLayout()).writeNative(addr, value.adspecHeader)
                    (IsAdspecBody.typeLayout()).writeNative(addr + 4L, value.adspecBody)
                }
            }
    }
}

public data class AdGeneralParams(
    public var intServAwareHopCount: UInt = 0u,
    public var pathBandwidthEstimate: UInt = 0u,
    public var minimumLatency: UInt = 0u,
    public var pathMTU: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdGeneralParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdGeneralParams> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AdGeneralParams =
                    AdGeneralParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AdGeneralParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.intServAwareHopCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pathBandwidthEstimate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minimumLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pathMTU)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class AdGuaranteed(
    public var cTotal: UInt = 0u,
    public var dTotal: UInt = 0u,
    public var cSum: UInt = 0u,
    public var dSum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdGuaranteed> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdGuaranteed> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AdGuaranteed =
                    AdGuaranteed(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: AdGuaranteed) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dSum)
                }
            }
    }
}

public data class ControlService(
    public var length: UInt = 0u,
    public var service: UInt = 0u,
    public var overrides: AdGeneralParams = AdGeneralParams(),
    public var anonymous: ControlService0 = ControlService0(),
)

public data class ControlService0(
    public var guaranteed: AdGuaranteed = AdGuaranteed(),
    public var paramBuffer: List<ParamBuffer> = List(1) { ParamBuffer() },
)

public data class CtrlLoadFlowspec(
    public var clSpecServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var clSpecParmHdr: IntServParmHdr = IntServParmHdr(),
    public var clSpecParms: GenTspecParms = GenTspecParms(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtrlLoadFlowspec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtrlLoadFlowspec> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CtrlLoadFlowspec =
                    CtrlLoadFlowspec(
                        (IntServServiceHdr.typeLayout()).readNative(addr),
                        (IntServParmHdr.typeLayout()).readNative(addr + 4L),
                        (GenTspecParms.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CtrlLoadFlowspec) {
                    (IntServServiceHdr.typeLayout()).writeNative(addr, value.clSpecServHdr)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 4L, value.clSpecParmHdr)
                    (GenTspecParms.typeLayout()).writeNative(addr + 8L, value.clSpecParms)
                }
            }
    }
}

public class EnumerationBuffer internal constructor(
    public var length: UInt,
    public var ownerProcessId: UInt,
    public var flowNameLength: UShort,
    public var flowName: UShortArray,
    pFlowCtorArg: MutPtr<TcGenFlow>,
    public var numberOfFilters: UInt,
    public var genericFilter: List<TcGenFilter>,
) {
    public var pFlow: MutPtr<TcGenFlow> = pFlowCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        ownerProcessId = 0u,
        flowNameLength = 0u,
        flowName = UShortArray(256),
        pFlowCtorArg = MutPtr(0L),
        numberOfFilters = 0u,
        genericFilter = List(1) { TcGenFilter() },
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): UInt = this.ownerProcessId

    public operator fun component3(): UShort = this.flowNameLength

    public operator fun component4(): UShortArray = this.flowName

    public operator fun component5(): MutPtr<TcGenFlow> = this.pFlow

    public operator fun component6(): UInt = this.numberOfFilters

    public operator fun component7(): List<TcGenFilter> = this.genericFilter

    public fun copy(length: UInt = this.length, ownerProcessId: UInt = this.ownerProcessId, flowNameLength: UShort = this.flowNameLength, flowName: UShortArray = this.flowName, pFlow: MutPtr<TcGenFlow> = this.pFlow, numberOfFilters: UInt = this.numberOfFilters, genericFilter: List<TcGenFilter> = this.genericFilter): EnumerationBuffer = EnumerationBuffer(length = length, ownerProcessId = ownerProcessId, flowNameLength = flowNameLength, flowName = flowName, pFlowCtorArg = pFlow, numberOfFilters = numberOfFilters, genericFilter = genericFilter)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EnumerationBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EnumerationBuffer> {
                override val sizeBytes: Long = 568L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EnumerationBuffer =
                    EnumerationBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<TcGenFlow>(64)
                        ).readNative(addr + 528L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 536L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(TcGenFilter.typeLayout(), (1).toInt())
                        ).readNative(addr + 544L),
                    )
                override fun writeNative(addr: Long, value: EnumerationBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ownerProcessId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.flowNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 10L, value.flowName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<TcGenFlow>(64)
                    ).writeNative(addr + 528L, value.pFlow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 536L, value.numberOfFilters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(TcGenFilter.typeLayout(), (1).toInt())
                    ).writeNative(addr + 544L, value.genericFilter)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            ownerProcessId: UInt = 0u,
            flowNameLength: UShort = 0u,
            flowName: UShortArray = UShortArray(256),
            pFlow: MutPtr<TcGenFlow> = MutPtr(0L),
            numberOfFilters: UInt = 0u,
            genericFilter: List<TcGenFilter> = List(1) { TcGenFilter() },
        ): EnumerationBuffer =
            EnumerationBuffer(
                length = length,
                ownerProcessId = ownerProcessId,
                flowNameLength = flowNameLength,
                flowName = flowName,
                pFlowCtorArg = pFlow,
                numberOfFilters = numberOfFilters,
                genericFilter = genericFilter,
            )
    }
}

public data class ErrorSpec(
    public var errsHeader: RsvpObjHdr = RsvpObjHdr(),
    public var errsU: ErrorSpec0 = ErrorSpec0(),
)

public data class ErrorSpec0(
    public var errsIpv4: ErrorSpecIpv4 = ErrorSpecIpv4(),
)

public data class ErrorSpecIpv4(
    public var errsErrnode: InAddr = InAddr(),
    public var errsFlags: UByte = 0u,
    public var errsCode: UByte = 0u,
    public var errsValue: UShort = 0u,
)

public data class FilterSpec(
    public var filtHeader: RsvpObjHdr = RsvpObjHdr(),
    public var filtU: FilterSpec0 = FilterSpec0(),
)

public data class FilterSpec0(
    public var filtIpv4: FilterSpecIpv4 = FilterSpecIpv4(),
    public var filtIpv4gpi: FilterSpecIpv4Gpi = FilterSpecIpv4Gpi(),
)

public class Flowdescriptor internal constructor(
    public var flowSpec: Flowspec,
    public var numFilters: UInt,
    filterListCtorArg: MutPtr<RsvpFilterspec>,
) {
    public var filterList: MutPtr<RsvpFilterspec> = filterListCtorArg
        internal set

    public constructor() : this(
        flowSpec = Flowspec(),
        numFilters = 0u,
        filterListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Flowspec = this.flowSpec

    public operator fun component2(): UInt = this.numFilters

    public operator fun component3(): MutPtr<RsvpFilterspec> = this.filterList

    public fun copy(flowSpec: Flowspec = this.flowSpec, numFilters: UInt = this.numFilters, filterList: MutPtr<RsvpFilterspec> = this.filterList): Flowdescriptor = Flowdescriptor(flowSpec = flowSpec, numFilters = numFilters, filterListCtorArg = filterList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Flowdescriptor) return false
        if (this.flowSpec != other.flowSpec) return false
        if (this.numFilters != other.numFilters) return false
        if (this.filterList != other.filterList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flowSpec.hashCode()
        result = 31 * result + this.numFilters.hashCode()
        result = 31 * result + this.filterList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flowSpec: Flowspec = Flowspec(),
            numFilters: UInt = 0u,
            filterList: MutPtr<RsvpFilterspec> = MutPtr(0L),
        ): Flowdescriptor =
            Flowdescriptor(
                flowSpec = flowSpec,
                numFilters = numFilters,
                filterListCtorArg = filterList,
            )
    }
}

public data class FlowDesc(
    public var u1: FlowDesc0 = FlowDesc0(),
    public var u2: FlowDesc1 = FlowDesc1(),
)

public class FlowDesc0 internal constructor(
    stspecCtorArg: MutPtr<SenderTspec>,
    isflowCtorArg: MutPtr<IsFlowspec>,
) {
    public var stspec: MutPtr<SenderTspec> = stspecCtorArg
        internal set

    public var isflow: MutPtr<IsFlowspec> = isflowCtorArg
        internal set

    public constructor() : this(
        stspecCtorArg = MutPtr(0L),
        isflowCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<SenderTspec> = this.stspec

    public operator fun component2(): MutPtr<IsFlowspec> = this.isflow

    public fun copy(stspec: MutPtr<SenderTspec> = this.stspec, isflow: MutPtr<IsFlowspec> = this.isflow): FlowDesc0 = FlowDesc0(stspecCtorArg = stspec, isflowCtorArg = isflow)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlowDesc0) return false
        if (this.stspec != other.stspec) return false
        if (this.isflow != other.isflow) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stspec.hashCode()
        result = 31 * result + this.isflow.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            stspec: MutPtr<SenderTspec> = MutPtr(0L),
            isflow: MutPtr<IsFlowspec> = MutPtr(0L),
        ): FlowDesc0 =
            FlowDesc0(
                stspecCtorArg = stspec,
                isflowCtorArg = isflow,
            )
    }
}

public class FlowDesc1 internal constructor(
    stempCtorArg: MutPtr<FilterSpec>,
    fspecCtorArg: MutPtr<FilterSpec>,
) {
    public var stemp: MutPtr<FilterSpec> = stempCtorArg
        internal set

    public var fspec: MutPtr<FilterSpec> = fspecCtorArg
        internal set

    public constructor() : this(
        stempCtorArg = MutPtr(0L),
        fspecCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<FilterSpec> = this.stemp

    public operator fun component2(): MutPtr<FilterSpec> = this.fspec

    public fun copy(stemp: MutPtr<FilterSpec> = this.stemp, fspec: MutPtr<FilterSpec> = this.fspec): FlowDesc1 = FlowDesc1(stempCtorArg = stemp, fspecCtorArg = fspec)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlowDesc1) return false
        if (this.stemp != other.stemp) return false
        if (this.fspec != other.fspec) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stemp.hashCode()
        result = 31 * result + this.fspec.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            stemp: MutPtr<FilterSpec> = MutPtr(0L),
            fspec: MutPtr<FilterSpec> = MutPtr(0L),
        ): FlowDesc1 =
            FlowDesc1(
                stempCtorArg = stemp,
                fspecCtorArg = fspec,
            )
    }
}

public data class FilterSpecIpv4(
    public var filtIpaddr: InAddr = InAddr(),
    public var filtUnused: UShort = 0u,
    public var filtPort: UShort = 0u,
)

public data class FilterSpecIpv4Gpi(
    public var filtIpaddr: InAddr = InAddr(),
    public var filtGpi: UInt = 0u,
)

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GadsParmsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GadsParmsT> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GadsParmsT =
                    GadsParmsT(
                        (IntServServiceHdr.typeLayout()).readNative(addr),
                        (IntServParmHdr.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (IntServParmHdr.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (IntServParmHdr.typeLayout()).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (IntServParmHdr.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: GadsParmsT) {
                    (IntServServiceHdr.typeLayout()).writeNative(addr, value.gadsServHdr)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 4L, value.gadsCtotHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.gadsCtot)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 12L, value.gadsDtotHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.gadsDtot)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 20L, value.gadsCsumHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.gadsCsum)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 28L, value.gadsDsumHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.gadsDsum)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenAdspecParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenAdspecParams> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GenAdspecParams =
                    GenAdspecParams(
                        (IntServServiceHdr.typeLayout()).readNative(addr),
                        (IntServParmHdr.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (IntServParmHdr.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                        (IntServParmHdr.typeLayout()).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (IntServParmHdr.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: GenAdspecParams) {
                    (IntServServiceHdr.typeLayout()).writeNative(addr, value.genParmHdr)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 4L, value.genParmHopcntHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.genParmHopcnt)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 12L, value.genParmPathbwHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 16L, value.genParmPathBw)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 20L, value.genParmMinlatHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.genParmMinLatency)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 28L, value.genParmCompmtuHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.genParmComposedMtu)
                }
            }
    }
}

public data class GenTspec(
    public var genTspecServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var genTspecParmHdr: IntServParmHdr = IntServParmHdr(),
    public var genTspecParms: GenTspecParms = GenTspecParms(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenTspec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenTspec> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GenTspec =
                    GenTspec(
                        (IntServServiceHdr.typeLayout()).readNative(addr),
                        (IntServParmHdr.typeLayout()).readNative(addr + 4L),
                        (GenTspecParms.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GenTspec) {
                    (IntServServiceHdr.typeLayout()).writeNative(addr, value.genTspecServHdr)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 4L, value.genTspecParmHdr)
                    (GenTspecParms.typeLayout()).writeNative(addr + 8L, value.genTspecParms)
                }
            }
    }
}

public data class GenTspecParms(
    public var tbTspecR: Float = 0.0f,
    public var tbTspecB: Float = 0.0f,
    public var tbTspecP: Float = 0.0f,
    public var tbTspecM: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenTspecParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenTspecParms> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GenTspecParms =
                    GenTspecParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: GenTspecParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.tbTspecR)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.tbTspecB)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.tbTspecP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tbTspecM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.tbTspecM)
                }
            }
    }
}

public data class GuarFlowSpec(
    public var guarServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var guarTspecHdr: IntServParmHdr = IntServParmHdr(),
    public var guarTspecParms: GenTspecParms = GenTspecParms(),
    public var guarRspecHdr: IntServParmHdr = IntServParmHdr(),
    public var guarRspec: GuarRspec = GuarRspec(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GuarFlowSpec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GuarFlowSpec> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GuarFlowSpec =
                    GuarFlowSpec(
                        (IntServServiceHdr.typeLayout()).readNative(addr),
                        (IntServParmHdr.typeLayout()).readNative(addr + 4L),
                        (GenTspecParms.typeLayout()).readNative(addr + 8L),
                        (IntServParmHdr.typeLayout()).readNative(addr + 28L),
                        (GuarRspec.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: GuarFlowSpec) {
                    (IntServServiceHdr.typeLayout()).writeNative(addr, value.guarServHdr)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 4L, value.guarTspecHdr)
                    (GenTspecParms.typeLayout()).writeNative(addr + 8L, value.guarTspecParms)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 28L, value.guarRspecHdr)
                    (GuarRspec.typeLayout()).writeNative(addr + 32L, value.guarRspec)
                }
            }
    }
}

public data class GuarRspec(
    public var guarR: Float = 0.0f,
    public var guarS: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GuarRspec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GuarRspec> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GuarRspec =
                    GuarRspec(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: GuarRspec) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.guarR)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.guarS)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HspUpgradeImagedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HspUpgradeImagedata> {
                override val sizeBytes: Long = 196L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): HspUpgradeImagedata =
                    HspUpgradeImagedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: HspUpgradeImagedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.hashAlgID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.digestSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 4L, value.digest)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 68L, value.fileName)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IdpeAttr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IdpeAttr> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): IdpeAttr =
                    IdpeAttr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IdpeAttr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.peAttribLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.peAttribType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.peAttribSubType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.peAttribValue)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IdErrorObject> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IdErrorObject> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): IdErrorObject =
                    IdErrorObject(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IdErrorObject) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usIdErrLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ucAType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ucSubType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.usReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.usIdErrorValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 8L, value.ucIdErrData)
                }
            }
    }
}

public data class InAddrIpv4(
    public var addr: UInt = 0u,
    public var addrBytes: UByteArray = UByteArray(4),
) {
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

public data class InAddrIpv6(
    public var addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InAddrIpv6) return false
        if (!this.addr.contentEquals(other.addr)) return false
        return true
    }

    override fun hashCode(): Int = this.addr.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddrIpv6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddrIpv6> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): InAddrIpv6 =
                    InAddrIpv6(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: InAddrIpv6) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.addr)
                }
            }
    }
}

public data class IpxPattern(
    public var src: IpxPattern0 = IpxPattern0(),
    public var dest: IpxPattern0 = IpxPattern0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpxPattern> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpxPattern> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpxPattern =
                    IpxPattern(
                        (IpxPattern0.typeLayout()).readNative(addr),
                        (IpxPattern0.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: IpxPattern) {
                    (IpxPattern0.typeLayout()).writeNative(addr, value.src)
                    (IpxPattern0.typeLayout()).writeNative(addr + 12L, value.dest)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpxPattern0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpxPattern0> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpxPattern0 =
                    IpxPattern0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: IpxPattern0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.networkAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.nodeAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.socket)
                }
            }
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpPattern01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpPattern01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): IpPattern01 =
                    IpPattern01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: IpPattern01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.filler)
                }
            }
    }
}

public data class IpPattern00(
    public var sSrcport: UShort = 0u,
    public var sDstport: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpPattern00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpPattern00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): IpPattern00 =
                    IpPattern00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: IpPattern00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sSrcport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sDstport)
                }
            }
    }
}

public data class IsAdspecBody(
    public var adspecMh: IntServMainHdr = IntServMainHdr(),
    public var adspecGenparms: GenAdspecParams = GenAdspecParams(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IsAdspecBody> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IsAdspecBody> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IsAdspecBody =
                    IsAdspecBody(
                        (IntServMainHdr.typeLayout()).readNative(addr),
                        (GenAdspecParams.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IsAdspecBody) {
                    (IntServMainHdr.typeLayout()).writeNative(addr, value.adspecMh)
                    (GenAdspecParams.typeLayout()).writeNative(addr + 4L, value.adspecGenparms)
                }
            }
    }
}

public data class IsFlowspec(
    public var flowHeader: RsvpObjHdr = RsvpObjHdr(),
    public var flowBody: IntServFlowSpec = IntServFlowSpec(),
)

public data class IntServFlowSpec(
    public var specMh: IntServMainHdr = IntServMainHdr(),
    public var specU: IntServFlowSpec0 = IntServFlowSpec0(),
)

public data class IntServFlowSpec0(
    public var clSpec: CtrlLoadFlowspec = CtrlLoadFlowspec(),
    public var gSpec: GuarFlowSpec = GuarFlowSpec(),
    public var qSpec: QualAppFlowSpec = QualAppFlowSpec(),
)

public data class IntServMainHdr(
    public var ismhVersion: UByte = 0u,
    public var ismhUnused: UByte = 0u,
    public var ismhLen32b: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntServMainHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntServMainHdr> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): IntServMainHdr =
                    IntServMainHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: IntServMainHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ismhVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ismhUnused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ismhLen32b)
                }
            }
    }
}

public data class IntServParmHdr(
    public var isphParmNum: UByte = 0u,
    public var isphFlags: UByte = 0u,
    public var isphLen32b: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntServParmHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntServParmHdr> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): IntServParmHdr =
                    IntServParmHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: IntServParmHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.isphParmNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.isphFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.isphLen32b)
                }
            }
    }
}

public data class IntServServiceHdr(
    public var isshService: UByte = 0u,
    public var isshFlags: UByte = 0u,
    public var isshLen32b: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntServServiceHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntServServiceHdr> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): IntServServiceHdr =
                    IntServServiceHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: IntServServiceHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.isshService)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.isshFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.isshLen32b)
                }
            }
    }
}

public data class IntServTspecBody(
    public var stMh: IntServMainHdr = IntServMainHdr(),
    public var tspecU: IntServTspecBody0 = IntServTspecBody0(),
)

public data class IntServTspecBody0(
    public var genStspec: GenTspec = GenTspec(),
    public var qualStspec: QualTspec = QualTspec(),
)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ParamBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ParamBuffer> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ParamBuffer =
                    ParamBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ParamBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.parameterId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.buffer)
                }
            }
    }
}

public data class PolicyData(
    public var policyObjHdr: RsvpObjHdr = RsvpObjHdr(),
    public var usPeOffset: UShort = 0u,
    public var usReserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyData> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): PolicyData =
                    PolicyData(
                        (RsvpObjHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: PolicyData) {
                    (RsvpObjHdr.typeLayout()).writeNative(addr, value.policyObjHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.usPeOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.usReserved)
                }
            }
    }
}

public data class PolicyDecision(
    public var lpvResult: UInt = 0u,
    public var wPolicyErrCode: UShort = 0u,
    public var wPolicyErrValue: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyDecision> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyDecision> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PolicyDecision =
                    PolicyDecision(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: PolicyDecision) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lpvResult)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wPolicyErrCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wPolicyErrValue)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyElement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyElement> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): PolicyElement =
                    PolicyElement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PolicyElement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usPeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usPeType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.ucPeData)
                }
            }
    }
}

public class QosDestaddr internal constructor(
    public var objectHdr: QosObjectHdr,
    socketAddressCtorArg: ConstPtr<Sockaddr>,
    public var socketAddressLength: UInt,
) {
    public var socketAddress: ConstPtr<Sockaddr> = socketAddressCtorArg
        internal set

    public constructor() : this(
        objectHdr = QosObjectHdr(),
        socketAddressCtorArg = ConstPtr(0L),
        socketAddressLength = 0u,
    )

    public operator fun component1(): QosObjectHdr = this.objectHdr

    public operator fun component2(): ConstPtr<Sockaddr> = this.socketAddress

    public operator fun component3(): UInt = this.socketAddressLength

    public fun copy(objectHdr: QosObjectHdr = this.objectHdr, socketAddress: ConstPtr<Sockaddr> = this.socketAddress, socketAddressLength: UInt = this.socketAddressLength): QosDestaddr = QosDestaddr(objectHdr = objectHdr, socketAddressCtorArg = socketAddress, socketAddressLength = socketAddressLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QosDestaddr) return false
        if (this.objectHdr != other.objectHdr) return false
        if (this.socketAddress != other.socketAddress) return false
        if (this.socketAddressLength != other.socketAddressLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectHdr.hashCode()
        result = 31 * result + this.socketAddress.hashCode()
        result = 31 * result + this.socketAddressLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosDestaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosDestaddr> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): QosDestaddr =
                    QosDestaddr(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: QosDestaddr) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 8L, value.socketAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.socketAddressLength)
                }
            }

        public operator fun invoke(
            objectHdr: QosObjectHdr = QosObjectHdr(),
            socketAddress: ConstPtr<Sockaddr> = ConstPtr(0L),
            socketAddressLength: UInt = 0u,
        ): QosDestaddr =
            QosDestaddr(
                objectHdr = objectHdr,
                socketAddressCtorArg = socketAddress,
                socketAddressLength = socketAddressLength,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosDiffserv> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosDiffserv> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QosDiffserv =
                    QosDiffserv(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: QosDiffserv) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dSFieldCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.diffservRule)
                }
            }
    }
}

public data class QosDiffservRule(
    public var inboundDSField: UByte = 0u,
    public var conformingOutboundDSField: UByte = 0u,
    public var nonConformingOutboundDSField: UByte = 0u,
    public var conformingUserPriority: UByte = 0u,
    public var nonConformingUserPriority: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosDiffservRule> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosDiffservRule> {
                override val sizeBytes: Long = 5L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): QosDiffservRule =
                    QosDiffservRule(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: QosDiffservRule) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.inboundDSField)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.conformingOutboundDSField)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.nonConformingOutboundDSField)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.conformingUserPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.nonConformingUserPriority)
                }
            }
    }
}

public data class QosDsClass(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var dSField: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosDsClass> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosDsClass> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QosDsClass =
                    QosDsClass(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QosDsClass) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dSField)
                }
            }
    }
}

public data class QosFlowrateOutgoing(
    public var bandwidth: ULong = 0uL,
    public var shapingBehavior: QosShaping = 0,
    public var reason: QosFlowrateReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosFlowrateOutgoing> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosFlowrateOutgoing> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): QosFlowrateOutgoing =
                    QosFlowrateOutgoing(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: QosFlowrateOutgoing) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.shapingBehavior)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.reason)
                }
            }
    }
}

public data class QosFlowFundamentals(
    public var bottleneckBandwidthSet: Bool = 0,
    public var bottleneckBandwidth: ULong = 0uL,
    public var availableBandwidthSet: Bool = 0,
    public var availableBandwidth: ULong = 0uL,
    public var rTTSet: Bool = 0,
    public var rtt: UInt = 0u,
)

public data class QosFriendlyName(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var friendlyName: UShortArray = UShortArray(256),
) {
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosFriendlyName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosFriendlyName> {
                override val sizeBytes: Long = 520L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QosFriendlyName =
                    QosFriendlyName(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QosFriendlyName) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 8L, value.friendlyName)
                }
            }
    }
}

public data class QosObjectHdr(
    public var objectType: UInt = 0u,
    public var objectLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosObjectHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosObjectHdr> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QosObjectHdr =
                    QosObjectHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: QosObjectHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.objectType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.objectLength)
                }
            }
    }
}

public data class QosPacketPriority(
    public var conformantDSCPValue: UInt = 0u,
    public var nonConformantDSCPValue: UInt = 0u,
    public var conformantL2Value: UInt = 0u,
    public var nonConformantL2Value: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosPacketPriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosPacketPriority> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QosPacketPriority =
                    QosPacketPriority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: QosPacketPriority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.conformantDSCPValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nonConformantDSCPValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.conformantL2Value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nonConformantL2Value)
                }
            }
    }
}

public data class QosSdMode(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var shapeDiscardMode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosSdMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosSdMode> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QosSdMode =
                    QosSdMode(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QosSdMode) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.shapeDiscardMode)
                }
            }
    }
}

public data class QosShapingRate(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var shapingRate: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosShapingRate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosShapingRate> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QosShapingRate =
                    QosShapingRate(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QosShapingRate) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.shapingRate)
                }
            }
    }
}

public data class QosTcpTraffic(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosTcpTraffic> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosTcpTraffic> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QosTcpTraffic =
                    QosTcpTraffic(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: QosTcpTraffic) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                }
            }
    }
}

public data class QosTrafficClass(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var trafficClass: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosTrafficClass> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosTrafficClass> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QosTrafficClass =
                    QosTrafficClass(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QosTrafficClass) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.trafficClass)
                }
            }
    }
}

public data class QosVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QosVersion> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): QosVersion =
                    QosVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: QosVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minorVersion)
                }
            }
    }
}

public data class QualAppFlowSpec(
    public var qSpecServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var qSpecParmHdr: IntServParmHdr = IntServParmHdr(),
    public var qSpecParms: QualTspecParms = QualTspecParms(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QualAppFlowSpec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QualAppFlowSpec> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QualAppFlowSpec =
                    QualAppFlowSpec(
                        (IntServServiceHdr.typeLayout()).readNative(addr),
                        (IntServParmHdr.typeLayout()).readNative(addr + 4L),
                        (QualTspecParms.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QualAppFlowSpec) {
                    (IntServServiceHdr.typeLayout()).writeNative(addr, value.qSpecServHdr)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 4L, value.qSpecParmHdr)
                    (QualTspecParms.typeLayout()).writeNative(addr + 8L, value.qSpecParms)
                }
            }
    }
}

public data class QualTspec(
    public var qualTspecServHdr: IntServServiceHdr = IntServServiceHdr(),
    public var qualTspecParmHdr: IntServParmHdr = IntServParmHdr(),
    public var qualTspecParms: QualTspecParms = QualTspecParms(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QualTspec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QualTspec> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QualTspec =
                    QualTspec(
                        (IntServServiceHdr.typeLayout()).readNative(addr),
                        (IntServParmHdr.typeLayout()).readNative(addr + 4L),
                        (QualTspecParms.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QualTspec) {
                    (IntServServiceHdr.typeLayout()).writeNative(addr, value.qualTspecServHdr)
                    (IntServParmHdr.typeLayout()).writeNative(addr + 4L, value.qualTspecParmHdr)
                    (QualTspecParms.typeLayout()).writeNative(addr + 8L, value.qualTspecParms)
                }
            }
    }
}

public data class QualTspecParms(
    public var tbTspecM: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QualTspecParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QualTspecParms> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QualTspecParms =
                    QualTspecParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: QualTspecParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tbTspecM)
                }
            }
    }
}

public data class ResvStyle(
    public var styleHeader: RsvpObjHdr = RsvpObjHdr(),
    public var styleWord: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResvStyle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResvStyle> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ResvStyle =
                    ResvStyle(
                        (RsvpObjHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ResvStyle) {
                    (RsvpObjHdr.typeLayout()).writeNative(addr, value.styleHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.styleWord)
                }
            }
    }
}

public data class RsvpAdspec(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var generalParams: AdGeneralParams = AdGeneralParams(),
    public var numberOfServices: UInt = 0u,
    public var services: List<ControlService> = List(1) { ControlService() },
)

public data class RsvpFilterspec(
    public var type: FilterType = 0,
    public var anonymous: RsvpFilterspec0 = RsvpFilterspec0(),
)

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

public data class RsvpFilterspecV4Gpi(
    public var address: InAddrIpv4 = InAddrIpv4(),
    public var generalPortId: UInt = 0u,
)

public data class RsvpFilterspecV6(
    public var address: InAddrIpv6 = InAddrIpv6(),
    public var unUsed: UShort = 0u,
    public var port: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpFilterspecV6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpFilterspecV6> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): RsvpFilterspecV6 =
                    RsvpFilterspecV6(
                        (InAddrIpv6.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: RsvpFilterspecV6) {
                    (InAddrIpv6.typeLayout()).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.unUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.port)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpFilterspecV6Flow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpFilterspecV6Flow> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): RsvpFilterspecV6Flow =
                    RsvpFilterspecV6Flow(
                        (InAddrIpv6.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: RsvpFilterspecV6Flow) {
                    (InAddrIpv6.typeLayout()).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.unUsed)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 17L, value.flowLabel)
                }
            }
    }
}

public data class RsvpFilterspecV6Gpi(
    public var address: InAddrIpv6 = InAddrIpv6(),
    public var generalPortId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpFilterspecV6Gpi> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpFilterspecV6Gpi> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RsvpFilterspecV6Gpi =
                    RsvpFilterspecV6Gpi(
                        (InAddrIpv6.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RsvpFilterspecV6Gpi) {
                    (InAddrIpv6.typeLayout()).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.generalPortId)
                }
            }
    }
}

public data class RsvpHop(
    public var hopHeader: RsvpObjHdr = RsvpObjHdr(),
    public var hopU: RsvpHop0 = RsvpHop0(),
)

public data class RsvpHop0(
    public var hopIpv4: RsvpHopIpv4 = RsvpHopIpv4(),
)

public class RsvpMsgObjs internal constructor(
    public var rsvpMsgType: Int,
    pRsvpSessionCtorArg: MutPtr<RsvpSession>,
    pRsvpFromHopCtorArg: MutPtr<RsvpHop>,
    pRsvpToHopCtorArg: MutPtr<RsvpHop>,
    pResvStyleCtorArg: MutPtr<ResvStyle>,
    pRsvpScopeCtorArg: MutPtr<RsvpScope>,
    public var flowDescCount: Int,
    pFlowDescsCtorArg: MutPtr<FlowDesc>,
    public var pdObjectCount: Int,
    ppPdObjectsCtorArg: MutPtr<MutPtr<PolicyData>>,
    pErrorSpecCtorArg: MutPtr<ErrorSpec>,
    pAdspecCtorArg: MutPtr<Adspec>,
) {
    public var pRsvpSession: MutPtr<RsvpSession> = pRsvpSessionCtorArg
        internal set

    public var pRsvpFromHop: MutPtr<RsvpHop> = pRsvpFromHopCtorArg
        internal set

    public var pRsvpToHop: MutPtr<RsvpHop> = pRsvpToHopCtorArg
        internal set

    public var pResvStyle: MutPtr<ResvStyle> = pResvStyleCtorArg
        internal set

    public var pRsvpScope: MutPtr<RsvpScope> = pRsvpScopeCtorArg
        internal set

    public var pFlowDescs: MutPtr<FlowDesc> = pFlowDescsCtorArg
        internal set

    public var ppPdObjects: MutPtr<MutPtr<PolicyData>> = ppPdObjectsCtorArg
        internal set

    public var pErrorSpec: MutPtr<ErrorSpec> = pErrorSpecCtorArg
        internal set

    public var pAdspec: MutPtr<Adspec> = pAdspecCtorArg
        internal set

    public constructor() : this(
        rsvpMsgType = 0,
        pRsvpSessionCtorArg = MutPtr(0L),
        pRsvpFromHopCtorArg = MutPtr(0L),
        pRsvpToHopCtorArg = MutPtr(0L),
        pResvStyleCtorArg = MutPtr(0L),
        pRsvpScopeCtorArg = MutPtr(0L),
        flowDescCount = 0,
        pFlowDescsCtorArg = MutPtr(0L),
        pdObjectCount = 0,
        ppPdObjectsCtorArg = MutPtr(0L),
        pErrorSpecCtorArg = MutPtr(0L),
        pAdspecCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.rsvpMsgType

    public operator fun component2(): MutPtr<RsvpSession> = this.pRsvpSession

    public operator fun component3(): MutPtr<RsvpHop> = this.pRsvpFromHop

    public operator fun component4(): MutPtr<RsvpHop> = this.pRsvpToHop

    public operator fun component5(): MutPtr<ResvStyle> = this.pResvStyle

    public operator fun component6(): MutPtr<RsvpScope> = this.pRsvpScope

    public operator fun component7(): Int = this.flowDescCount

    public operator fun component8(): MutPtr<FlowDesc> = this.pFlowDescs

    public operator fun component9(): Int = this.pdObjectCount

    public operator fun component10(): MutPtr<MutPtr<PolicyData>> = this.ppPdObjects

    public operator fun component11(): MutPtr<ErrorSpec> = this.pErrorSpec

    public operator fun component12(): MutPtr<Adspec> = this.pAdspec

    public fun copy(rsvpMsgType: Int = this.rsvpMsgType, pRsvpSession: MutPtr<RsvpSession> = this.pRsvpSession, pRsvpFromHop: MutPtr<RsvpHop> = this.pRsvpFromHop, pRsvpToHop: MutPtr<RsvpHop> = this.pRsvpToHop, pResvStyle: MutPtr<ResvStyle> = this.pResvStyle, pRsvpScope: MutPtr<RsvpScope> = this.pRsvpScope, flowDescCount: Int = this.flowDescCount, pFlowDescs: MutPtr<FlowDesc> = this.pFlowDescs, pdObjectCount: Int = this.pdObjectCount, ppPdObjects: MutPtr<MutPtr<PolicyData>> = this.ppPdObjects, pErrorSpec: MutPtr<ErrorSpec> = this.pErrorSpec, pAdspec: MutPtr<Adspec> = this.pAdspec): RsvpMsgObjs = RsvpMsgObjs(rsvpMsgType = rsvpMsgType, pRsvpSessionCtorArg = pRsvpSession, pRsvpFromHopCtorArg = pRsvpFromHop, pRsvpToHopCtorArg = pRsvpToHop, pResvStyleCtorArg = pResvStyle, pRsvpScopeCtorArg = pRsvpScope, flowDescCount = flowDescCount, pFlowDescsCtorArg = pFlowDescs, pdObjectCount = pdObjectCount, ppPdObjectsCtorArg = ppPdObjects, pErrorSpecCtorArg = pErrorSpec, pAdspecCtorArg = pAdspec)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RsvpMsgObjs) return false
        if (this.rsvpMsgType != other.rsvpMsgType) return false
        if (this.pRsvpSession != other.pRsvpSession) return false
        if (this.pRsvpFromHop != other.pRsvpFromHop) return false
        if (this.pRsvpToHop != other.pRsvpToHop) return false
        if (this.pResvStyle != other.pResvStyle) return false
        if (this.pRsvpScope != other.pRsvpScope) return false
        if (this.flowDescCount != other.flowDescCount) return false
        if (this.pFlowDescs != other.pFlowDescs) return false
        if (this.pdObjectCount != other.pdObjectCount) return false
        if (this.ppPdObjects != other.ppPdObjects) return false
        if (this.pErrorSpec != other.pErrorSpec) return false
        if (this.pAdspec != other.pAdspec) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rsvpMsgType.hashCode()
        result = 31 * result + this.pRsvpSession.hashCode()
        result = 31 * result + this.pRsvpFromHop.hashCode()
        result = 31 * result + this.pRsvpToHop.hashCode()
        result = 31 * result + this.pResvStyle.hashCode()
        result = 31 * result + this.pRsvpScope.hashCode()
        result = 31 * result + this.flowDescCount.hashCode()
        result = 31 * result + this.pFlowDescs.hashCode()
        result = 31 * result + this.pdObjectCount.hashCode()
        result = 31 * result + this.ppPdObjects.hashCode()
        result = 31 * result + this.pErrorSpec.hashCode()
        result = 31 * result + this.pAdspec.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpMsgObjs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpMsgObjs> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RsvpMsgObjs =
                    RsvpMsgObjs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RsvpSession>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RsvpHop>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RsvpHop>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ResvStyle>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RsvpScope>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FlowDesc>(64)
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<PolicyData>>(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ErrorSpec>(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Adspec>(64)
                        ).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: RsvpMsgObjs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.rsvpMsgType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RsvpSession>(64)
                    ).writeNative(addr + 8L, value.pRsvpSession)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RsvpHop>(64)
                    ).writeNative(addr + 16L, value.pRsvpFromHop)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RsvpHop>(64)
                    ).writeNative(addr + 24L, value.pRsvpToHop)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ResvStyle>(64)
                    ).writeNative(addr + 32L, value.pResvStyle)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RsvpScope>(64)
                    ).writeNative(addr + 40L, value.pRsvpScope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.flowDescCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FlowDesc>(64)
                    ).writeNative(addr + 56L, value.pFlowDescs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.pdObjectCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<PolicyData>>(64)
                    ).writeNative(addr + 72L, value.ppPdObjects)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ErrorSpec>(64)
                    ).writeNative(addr + 80L, value.pErrorSpec)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Adspec>(64)
                    ).writeNative(addr + 88L, value.pAdspec)
                }
            }

        public operator fun invoke(
            rsvpMsgType: Int = 0,
            pRsvpSession: MutPtr<RsvpSession> = MutPtr(0L),
            pRsvpFromHop: MutPtr<RsvpHop> = MutPtr(0L),
            pRsvpToHop: MutPtr<RsvpHop> = MutPtr(0L),
            pResvStyle: MutPtr<ResvStyle> = MutPtr(0L),
            pRsvpScope: MutPtr<RsvpScope> = MutPtr(0L),
            flowDescCount: Int = 0,
            pFlowDescs: MutPtr<FlowDesc> = MutPtr(0L),
            pdObjectCount: Int = 0,
            ppPdObjects: MutPtr<MutPtr<PolicyData>> = MutPtr(0L),
            pErrorSpec: MutPtr<ErrorSpec> = MutPtr(0L),
            pAdspec: MutPtr<Adspec> = MutPtr(0L),
        ): RsvpMsgObjs =
            RsvpMsgObjs(
                rsvpMsgType = rsvpMsgType,
                pRsvpSessionCtorArg = pRsvpSession,
                pRsvpFromHopCtorArg = pRsvpFromHop,
                pRsvpToHopCtorArg = pRsvpToHop,
                pResvStyleCtorArg = pResvStyle,
                pRsvpScopeCtorArg = pRsvpScope,
                flowDescCount = flowDescCount,
                pFlowDescsCtorArg = pFlowDescs,
                pdObjectCount = pdObjectCount,
                ppPdObjectsCtorArg = ppPdObjects,
                pErrorSpecCtorArg = pErrorSpec,
                pAdspecCtorArg = pAdspec,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpPolicy> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): RsvpPolicy =
                    RsvpPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RsvpPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.info)
                }
            }
    }
}

public data class RsvpPolicyInfo(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var numPolicyElement: UInt = 0u,
    public var policyElement: List<RsvpPolicy> = List(1) { RsvpPolicy() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpPolicyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpPolicyInfo> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RsvpPolicyInfo =
                    RsvpPolicyInfo(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(RsvpPolicy.typeLayout(), (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RsvpPolicyInfo) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numPolicyElement)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(RsvpPolicy.typeLayout(), (1).toInt())
                    ).writeNative(addr + 12L, value.policyElement)
                }
            }
    }
}

public class RsvpReserveInfo internal constructor(
    public var objectHdr: QosObjectHdr,
    public var style: UInt,
    public var confirmRequest: UInt,
    policyElementListCtorArg: MutPtr<RsvpPolicyInfo>,
    public var numFlowDesc: UInt,
    flowDescListCtorArg: MutPtr<Flowdescriptor>,
) {
    public var policyElementList: MutPtr<RsvpPolicyInfo> = policyElementListCtorArg
        internal set

    public var flowDescList: MutPtr<Flowdescriptor> = flowDescListCtorArg
        internal set

    public constructor() : this(
        objectHdr = QosObjectHdr(),
        style = 0u,
        confirmRequest = 0u,
        policyElementListCtorArg = MutPtr(0L),
        numFlowDesc = 0u,
        flowDescListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): QosObjectHdr = this.objectHdr

    public operator fun component2(): UInt = this.style

    public operator fun component3(): UInt = this.confirmRequest

    public operator fun component4(): MutPtr<RsvpPolicyInfo> = this.policyElementList

    public operator fun component5(): UInt = this.numFlowDesc

    public operator fun component6(): MutPtr<Flowdescriptor> = this.flowDescList

    public fun copy(objectHdr: QosObjectHdr = this.objectHdr, style: UInt = this.style, confirmRequest: UInt = this.confirmRequest, policyElementList: MutPtr<RsvpPolicyInfo> = this.policyElementList, numFlowDesc: UInt = this.numFlowDesc, flowDescList: MutPtr<Flowdescriptor> = this.flowDescList): RsvpReserveInfo = RsvpReserveInfo(objectHdr = objectHdr, style = style, confirmRequest = confirmRequest, policyElementListCtorArg = policyElementList, numFlowDesc = numFlowDesc, flowDescListCtorArg = flowDescList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RsvpReserveInfo) return false
        if (this.objectHdr != other.objectHdr) return false
        if (this.style != other.style) return false
        if (this.confirmRequest != other.confirmRequest) return false
        if (this.policyElementList != other.policyElementList) return false
        if (this.numFlowDesc != other.numFlowDesc) return false
        if (this.flowDescList != other.flowDescList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectHdr.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.confirmRequest.hashCode()
        result = 31 * result + this.policyElementList.hashCode()
        result = 31 * result + this.numFlowDesc.hashCode()
        result = 31 * result + this.flowDescList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpReserveInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpReserveInfo> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RsvpReserveInfo =
                    RsvpReserveInfo(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RsvpPolicyInfo>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Flowdescriptor>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RsvpReserveInfo) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.style)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.confirmRequest)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RsvpPolicyInfo>(64)
                    ).writeNative(addr + 16L, value.policyElementList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numFlowDesc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Flowdescriptor>(64)
                    ).writeNative(addr + 32L, value.flowDescList)
                }
            }

        public operator fun invoke(
            objectHdr: QosObjectHdr = QosObjectHdr(),
            style: UInt = 0u,
            confirmRequest: UInt = 0u,
            policyElementList: MutPtr<RsvpPolicyInfo> = MutPtr(0L),
            numFlowDesc: UInt = 0u,
            flowDescList: MutPtr<Flowdescriptor> = MutPtr(0L),
        ): RsvpReserveInfo =
            RsvpReserveInfo(
                objectHdr = objectHdr,
                style = style,
                confirmRequest = confirmRequest,
                policyElementListCtorArg = policyElementList,
                numFlowDesc = numFlowDesc,
                flowDescListCtorArg = flowDescList,
            )
    }
}

public data class RsvpScope(
    public var scoplHeader: RsvpObjHdr = RsvpObjHdr(),
    public var scopeU: RsvpScope0 = RsvpScope0(),
)

public data class RsvpScope0(
    public var scoplIpv4: ScopeListIpv4 = ScopeListIpv4(),
)

public data class RsvpSession(
    public var sessHeader: RsvpObjHdr = RsvpObjHdr(),
    public var sessU: RsvpSession0 = RsvpSession0(),
)

public data class RsvpSession0(
    public var sessIpv4: SessionIpv4 = SessionIpv4(),
)

public data class RsvpStatusInfo(
    public var objectHdr: QosObjectHdr = QosObjectHdr(),
    public var statusCode: UInt = 0u,
    public var extendedStatus1: UInt = 0u,
    public var extendedStatus2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpStatusInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpStatusInfo> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RsvpStatusInfo =
                    RsvpStatusInfo(
                        (QosObjectHdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RsvpStatusInfo) {
                    (QosObjectHdr.typeLayout()).writeNative(addr, value.objectHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.statusCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.extendedStatus1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.extendedStatus2)
                }
            }
    }
}

public data class RsvpObjHdr(
    public var objLength: UShort = 0u,
    public var objClass: UByte = 0u,
    public var objCtype: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpObjHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RsvpObjHdr> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): RsvpObjHdr =
                    RsvpObjHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: RsvpObjHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.objLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.objClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.objCtype)
                }
            }
    }
}

public data class RsvpHopIpv4(
    public var hopIpaddr: InAddr = InAddr(),
    public var hopLih: UInt = 0u,
)

public data class SenderTspec(
    public var stspecHeader: RsvpObjHdr = RsvpObjHdr(),
    public var stspecBody: IntServTspecBody = IntServTspecBody(),
)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipaeventKsrSignaturePayload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipaeventKsrSignaturePayload> {
                override val sizeBytes: Long = 9L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SipaeventKsrSignaturePayload =
                    SipaeventKsrSignaturePayload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SipaeventKsrSignaturePayload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signAlgID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.signatureLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.signature)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipaeventRevocationListPayload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipaeventRevocationListPayload> {
                override val sizeBytes: Long = 15L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SipaeventRevocationListPayload =
                    SipaeventRevocationListPayload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: SipaeventRevocationListPayload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.digestLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.hashAlgID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 14L, value.digest)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipaeventSbcpInfoPayloadV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipaeventSbcpInfoPayloadV1> {
                override val sizeBytes: Long = 21L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SipaeventSbcpInfoPayloadV1 =
                    SipaeventSbcpInfoPayloadV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: SipaeventSbcpInfoPayloadV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.payloadVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.varDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.hashAlgID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.digestLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.signersCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.varData)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipaeventSiPolicyPayload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipaeventSiPolicyPayload> {
                override val sizeBytes: Long = 17L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SipaeventSiPolicyPayload =
                    SipaeventSiPolicyPayload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SipaeventSiPolicyPayload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.policyVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.policyNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.hashAlgID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.digestLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.varLengthData)
                }
            }
    }
}

public data class SipaeventVsmIdkInfoPayload(
    public var keyAlgID: UInt = 0u,
    public var anonymous: SipaeventVsmIdkInfoPayload0 = SipaeventVsmIdkInfoPayload0(),
)

public data class SipaeventVsmIdkInfoPayload0(
    public var rsaKeyInfo: SipaeventVsmIdkRsaInfo = SipaeventVsmIdkRsaInfo(),
)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipaeventVsmIdkRsaInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipaeventVsmIdkRsaInfo> {
                override val sizeBytes: Long = 13L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SipaeventVsmIdkRsaInfo =
                    SipaeventVsmIdkRsaInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SipaeventVsmIdkRsaInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.keyBitLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.publicExpLengthBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.modulusSizeBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.publicKeyData)
                }
            }
    }
}

public data class ScopeListIpv4(
    public var scoplIpaddr: List<InAddr> = List(1) { InAddr() },
)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgPcclientPcreventStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgPcclientPcreventStruct> {
                override val sizeBytes: Long = 33L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcgPcclientPcreventStruct =
                    TcgPcclientPcreventStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: TcgPcclientPcreventStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pcrIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.eventType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 8L, value.digest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.eventDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 32L, value.event)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgPcclientTaggedEventStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgPcclientTaggedEventStruct> {
                override val sizeBytes: Long = 9L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcgPcclientTaggedEventStruct =
                    TcgPcclientTaggedEventStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TcgPcclientTaggedEventStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eventID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.eventDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.eventData)
                }
            }
    }
}

public data class TciClientFuncList(
    public var clNotifyHandler: TciNotifyHandler = null,
    public var clAddFlowCompleteHandler: TciAddFlowCompleteHandler = null,
    public var clModifyFlowCompleteHandler: TciModFlowCompleteHandler = null,
    public var clDeleteFlowCompleteHandler: TciDelFlowCompleteHandler = null,
)

public class TcGenFilter internal constructor(
    public var addressType: UShort,
    public var patternSize: UInt,
    patternCtorArg: MutPtr<CVoid>,
    maskCtorArg: MutPtr<CVoid>,
) {
    public var pattern: MutPtr<CVoid> = patternCtorArg
        internal set

    public var mask: MutPtr<CVoid> = maskCtorArg
        internal set

    public constructor() : this(
        addressType = 0u,
        patternSize = 0u,
        patternCtorArg = MutPtr(0L),
        maskCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.addressType

    public operator fun component2(): UInt = this.patternSize

    public operator fun component3(): MutPtr<CVoid> = this.pattern

    public operator fun component4(): MutPtr<CVoid> = this.mask

    public fun copy(addressType: UShort = this.addressType, patternSize: UInt = this.patternSize, pattern: MutPtr<CVoid> = this.pattern, mask: MutPtr<CVoid> = this.mask): TcGenFilter = TcGenFilter(addressType = addressType, patternSize = patternSize, patternCtorArg = pattern, maskCtorArg = mask)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcGenFilter) return false
        if (this.addressType != other.addressType) return false
        if (this.patternSize != other.patternSize) return false
        if (this.pattern != other.pattern) return false
        if (this.mask != other.mask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressType.hashCode()
        result = 31 * result + this.patternSize.hashCode()
        result = 31 * result + this.pattern.hashCode()
        result = 31 * result + this.mask.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcGenFilter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcGenFilter> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TcGenFilter =
                    TcGenFilter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: TcGenFilter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.addressType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.patternSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pattern)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.mask)
                }
            }

        public operator fun invoke(
            addressType: UShort = 0u,
            patternSize: UInt = 0u,
            pattern: MutPtr<CVoid> = MutPtr(0L),
            mask: MutPtr<CVoid> = MutPtr(0L),
        ): TcGenFilter =
            TcGenFilter(
                addressType = addressType,
                patternSize = patternSize,
                patternCtorArg = pattern,
                maskCtorArg = mask,
            )
    }
}

public data class TcGenFlow(
    public var sendingFlowspec: Flowspec = Flowspec(),
    public var receivingFlowspec: Flowspec = Flowspec(),
    public var tcObjectsLength: UInt = 0u,
    public var tcObjects: List<QosObjectHdr> = List(1) { QosObjectHdr() },
)

public class TcIfcDescriptor internal constructor(
    public var length: UInt,
    pInterfaceNameCtorArg: Pwstr,
    pInterfaceIDCtorArg: Pwstr,
    public var addressListDesc: AddressListDescriptor,
) {
    public var pInterfaceName: Pwstr = pInterfaceNameCtorArg
        internal set

    public var pInterfaceID: Pwstr = pInterfaceIDCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        pInterfaceNameCtorArg = MutPtr(0L),
        pInterfaceIDCtorArg = MutPtr(0L),
        addressListDesc = AddressListDescriptor(),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): Pwstr = this.pInterfaceName

    public operator fun component3(): Pwstr = this.pInterfaceID

    public operator fun component4(): AddressListDescriptor = this.addressListDesc

    public fun copy(length: UInt = this.length, pInterfaceName: Pwstr = this.pInterfaceName, pInterfaceID: Pwstr = this.pInterfaceID, addressListDesc: AddressListDescriptor = this.addressListDesc): TcIfcDescriptor = TcIfcDescriptor(length = length, pInterfaceNameCtorArg = pInterfaceName, pInterfaceIDCtorArg = pInterfaceID, addressListDesc = addressListDesc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcIfcDescriptor) return false
        if (this.length != other.length) return false
        if (this.pInterfaceName != other.pInterfaceName) return false
        if (this.pInterfaceID != other.pInterfaceID) return false
        if (this.addressListDesc != other.addressListDesc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.pInterfaceName.hashCode()
        result = 31 * result + this.pInterfaceID.hashCode()
        result = 31 * result + this.addressListDesc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            pInterfaceName: Pwstr = MutPtr(0L),
            pInterfaceID: Pwstr = MutPtr(0L),
            addressListDesc: AddressListDescriptor = AddressListDescriptor(),
        ): TcIfcDescriptor =
            TcIfcDescriptor(
                length = length,
                pInterfaceNameCtorArg = pInterfaceName,
                pInterfaceIDCtorArg = pInterfaceID,
                addressListDesc = addressListDesc,
            )
    }
}

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

public class WbclIterator internal constructor(
    firstElementPtrCtorArg: MutPtr<CVoid>,
    public var logSize: UInt,
    currentElementPtrCtorArg: MutPtr<CVoid>,
    public var currentElementSize: UInt,
    public var digestSize: UShort,
    public var logFormat: UShort,
    public var numberOfDigests: UInt,
    digestSizesCtorArg: MutPtr<CVoid>,
    public var supportedAlgorithms: UInt,
    public var hashAlgorithm: UShort,
) {
    public var firstElementPtr: MutPtr<CVoid> = firstElementPtrCtorArg
        internal set

    public var currentElementPtr: MutPtr<CVoid> = currentElementPtrCtorArg
        internal set

    public var digestSizes: MutPtr<CVoid> = digestSizesCtorArg
        internal set

    public constructor() : this(
        firstElementPtrCtorArg = MutPtr(0L),
        logSize = 0u,
        currentElementPtrCtorArg = MutPtr(0L),
        currentElementSize = 0u,
        digestSize = 0u,
        logFormat = 0u,
        numberOfDigests = 0u,
        digestSizesCtorArg = MutPtr(0L),
        supportedAlgorithms = 0u,
        hashAlgorithm = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.firstElementPtr

    public operator fun component2(): UInt = this.logSize

    public operator fun component3(): MutPtr<CVoid> = this.currentElementPtr

    public operator fun component4(): UInt = this.currentElementSize

    public operator fun component5(): UShort = this.digestSize

    public operator fun component6(): UShort = this.logFormat

    public operator fun component7(): UInt = this.numberOfDigests

    public operator fun component8(): MutPtr<CVoid> = this.digestSizes

    public operator fun component9(): UInt = this.supportedAlgorithms

    public operator fun component10(): UShort = this.hashAlgorithm

    public fun copy(firstElementPtr: MutPtr<CVoid> = this.firstElementPtr, logSize: UInt = this.logSize, currentElementPtr: MutPtr<CVoid> = this.currentElementPtr, currentElementSize: UInt = this.currentElementSize, digestSize: UShort = this.digestSize, logFormat: UShort = this.logFormat, numberOfDigests: UInt = this.numberOfDigests, digestSizes: MutPtr<CVoid> = this.digestSizes, supportedAlgorithms: UInt = this.supportedAlgorithms, hashAlgorithm: UShort = this.hashAlgorithm): WbclIterator = WbclIterator(firstElementPtrCtorArg = firstElementPtr, logSize = logSize, currentElementPtrCtorArg = currentElementPtr, currentElementSize = currentElementSize, digestSize = digestSize, logFormat = logFormat, numberOfDigests = numberOfDigests, digestSizesCtorArg = digestSizes, supportedAlgorithms = supportedAlgorithms, hashAlgorithm = hashAlgorithm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WbclIterator) return false
        if (this.firstElementPtr != other.firstElementPtr) return false
        if (this.logSize != other.logSize) return false
        if (this.currentElementPtr != other.currentElementPtr) return false
        if (this.currentElementSize != other.currentElementSize) return false
        if (this.digestSize != other.digestSize) return false
        if (this.logFormat != other.logFormat) return false
        if (this.numberOfDigests != other.numberOfDigests) return false
        if (this.digestSizes != other.digestSizes) return false
        if (this.supportedAlgorithms != other.supportedAlgorithms) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.firstElementPtr.hashCode()
        result = 31 * result + this.logSize.hashCode()
        result = 31 * result + this.currentElementPtr.hashCode()
        result = 31 * result + this.currentElementSize.hashCode()
        result = 31 * result + this.digestSize.hashCode()
        result = 31 * result + this.logFormat.hashCode()
        result = 31 * result + this.numberOfDigests.hashCode()
        result = 31 * result + this.digestSizes.hashCode()
        result = 31 * result + this.supportedAlgorithms.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WbclIterator> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WbclIterator> {
                override val sizeBytes: Long = 46L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WbclIterator =
                    WbclIterator(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: WbclIterator) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.firstElementPtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.logSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 12L, value.currentElementPtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.currentElementSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.digestSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.logFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.numberOfDigests)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.digestSizes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.supportedAlgorithms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.hashAlgorithm)
                }
            }

        public operator fun invoke(
            firstElementPtr: MutPtr<CVoid> = MutPtr(0L),
            logSize: UInt = 0u,
            currentElementPtr: MutPtr<CVoid> = MutPtr(0L),
            currentElementSize: UInt = 0u,
            digestSize: UShort = 0u,
            logFormat: UShort = 0u,
            numberOfDigests: UInt = 0u,
            digestSizes: MutPtr<CVoid> = MutPtr(0L),
            supportedAlgorithms: UInt = 0u,
            hashAlgorithm: UShort = 0u,
        ): WbclIterator =
            WbclIterator(
                firstElementPtrCtorArg = firstElementPtr,
                logSize = logSize,
                currentElementPtrCtorArg = currentElementPtr,
                currentElementSize = currentElementSize,
                digestSize = digestSize,
                logFormat = logFormat,
                numberOfDigests = numberOfDigests,
                digestSizesCtorArg = digestSizes,
                supportedAlgorithms = supportedAlgorithms,
                hashAlgorithm = hashAlgorithm,
            )
    }
}

public data class WbclLogHdr(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var entries: UInt = 0u,
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WbclLogHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WbclLogHdr> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WbclLogHdr =
                    WbclLogHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WbclLogHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.entries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.length)
                }
            }
    }
}
