@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwBuffer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.SystemPowerState
import io.github.kotlinmania.windowssys.windows.win32.system.threading.ProcessBasicInformation
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ClientId

public data class PciExpressErrorSourceId0(
    public var bitfield1: UShort = 0u,
    public var bitfield2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressErrorSourceId0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressErrorSourceId0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressErrorSourceId0 =
                    PciExpressErrorSourceId0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: PciExpressErrorSourceId0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.bitfield2)
                }
            }
    }
}

public data class PciExpressEventCollectorEndpointAssociationCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var associationBitmap: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressEventCollectorEndpointAssociationCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressEventCollectorEndpointAssociationCapability> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PciExpressEventCollectorEndpointAssociationCapability =
                    PciExpressEventCollectorEndpointAssociationCapability(
                        (PciExpressEnhancedCapabilityHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PciExpressEventCollectorEndpointAssociationCapability) {
                    (PciExpressEnhancedCapabilityHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.associationBitmap)
                }
            }
    }
}

public data class PciExpressL1PmSsCapabilitiesRegister(
    public var anonymous: PciExpressL1PmSsCapabilitiesRegister0 = PciExpressL1PmSsCapabilitiesRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressL1PmSsCapabilitiesRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressL1PmSsCapabilitiesRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressL1PmSsCapabilitiesRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressL1PmSsCapabilitiesRegister0 =
                    PciExpressL1PmSsCapabilitiesRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressL1PmSsCapabilitiesRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressL1PmSsCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var l1PmSsCapabilities: PciExpressL1PmSsCapabilitiesRegister = PciExpressL1PmSsCapabilitiesRegister(),
    public var l1PmSsControl1: PciExpressL1PmSsControl1Register = PciExpressL1PmSsControl1Register(),
    public var l1PmSsControl2: PciExpressL1PmSsControl2Register = PciExpressL1PmSsControl2Register(),
)

public data class PciExpressL1PmSsControl1Register(
    public var anonymous: PciExpressL1PmSsControl1Register0 = PciExpressL1PmSsControl1Register0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressL1PmSsControl1Register0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressL1PmSsControl1Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressL1PmSsControl1Register0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressL1PmSsControl1Register0 =
                    PciExpressL1PmSsControl1Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressL1PmSsControl1Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressL1PmSsControl2Register(
    public var anonymous: PciExpressL1PmSsControl2Register0 = PciExpressL1PmSsControl2Register0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressL1PmSsControl2Register0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressL1PmSsControl2Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressL1PmSsControl2Register0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressL1PmSsControl2Register0 =
                    PciExpressL1PmSsControl2Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressL1PmSsControl2Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressLaneErrorStatus(
    public var laneBitmap: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLaneErrorStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLaneErrorStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressLaneErrorStatus =
                    PciExpressLaneErrorStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressLaneErrorStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.laneBitmap)
                }
            }
    }
}

public data class PciExpressLinkCapabilities2Register(
    public var anonymous: PciExpressLinkCapabilities2Register0 = PciExpressLinkCapabilities2Register0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressLinkCapabilities2Register0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkCapabilities2Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkCapabilities2Register0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressLinkCapabilities2Register0 =
                    PciExpressLinkCapabilities2Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressLinkCapabilities2Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressLinkCapabilitiesRegister(
    public var anonymous: PciExpressLinkCapabilitiesRegister0 = PciExpressLinkCapabilitiesRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressLinkCapabilitiesRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkCapabilitiesRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkCapabilitiesRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressLinkCapabilitiesRegister0 =
                    PciExpressLinkCapabilitiesRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressLinkCapabilitiesRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressLinkControl3(
    public var anonymous: PciExpressLinkControl30 = PciExpressLinkControl30(),
)

public data class PciExpressLinkControl30(
    public var anonymous: PciExpressLinkControl300 = PciExpressLinkControl300(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressLinkControl300(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkControl300> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkControl300> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressLinkControl300 =
                    PciExpressLinkControl300(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressLinkControl300) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressLinkControl2Register(
    public var anonymous: PciExpressLinkControl2Register0 = PciExpressLinkControl2Register0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressLinkControl2Register0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkControl2Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkControl2Register0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressLinkControl2Register0 =
                    PciExpressLinkControl2Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressLinkControl2Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressLinkControlRegister(
    public var anonymous: PciExpressLinkControlRegister0 = PciExpressLinkControlRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressLinkControlRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkControlRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressLinkControlRegister0 =
                    PciExpressLinkControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressLinkControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PciExpressLinkQuiescentInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var pciExpressEnterLinkQuiescentMode: PpciExpressEnterLinkQuiescentMode,
    public var pciExpressExitLinkQuiescentMode: PpciExpressExitLinkQuiescentMode,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        pciExpressEnterLinkQuiescentMode = null,
        pciExpressExitLinkQuiescentMode = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PpciExpressEnterLinkQuiescentMode = this.pciExpressEnterLinkQuiescentMode

    public operator fun component7(): PpciExpressExitLinkQuiescentMode = this.pciExpressExitLinkQuiescentMode

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, pciExpressEnterLinkQuiescentMode: PpciExpressEnterLinkQuiescentMode = this.pciExpressEnterLinkQuiescentMode, pciExpressExitLinkQuiescentMode: PpciExpressExitLinkQuiescentMode = this.pciExpressExitLinkQuiescentMode): PciExpressLinkQuiescentInterface = PciExpressLinkQuiescentInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, pciExpressEnterLinkQuiescentMode = pciExpressEnterLinkQuiescentMode, pciExpressExitLinkQuiescentMode = pciExpressExitLinkQuiescentMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressLinkQuiescentInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.pciExpressEnterLinkQuiescentMode != other.pciExpressEnterLinkQuiescentMode) return false
        if (this.pciExpressExitLinkQuiescentMode != other.pciExpressExitLinkQuiescentMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.pciExpressEnterLinkQuiescentMode.hashCode()
        result = 31 * result + this.pciExpressExitLinkQuiescentMode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            pciExpressEnterLinkQuiescentMode: PpciExpressEnterLinkQuiescentMode = null,
            pciExpressExitLinkQuiescentMode: PpciExpressExitLinkQuiescentMode = null,
        ): PciExpressLinkQuiescentInterface =
            PciExpressLinkQuiescentInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                pciExpressEnterLinkQuiescentMode = pciExpressEnterLinkQuiescentMode,
                pciExpressExitLinkQuiescentMode = pciExpressExitLinkQuiescentMode,
            )
    }
}

public data class PciExpressLinkStatus2Register(
    public var anonymous: PciExpressLinkStatus2Register0 = PciExpressLinkStatus2Register0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressLinkStatus2Register0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkStatus2Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkStatus2Register0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressLinkStatus2Register0 =
                    PciExpressLinkStatus2Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressLinkStatus2Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressLinkStatusRegister(
    public var anonymous: PciExpressLinkStatusRegister0 = PciExpressLinkStatusRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressLinkStatusRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkStatusRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLinkStatusRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressLinkStatusRegister0 =
                    PciExpressLinkStatusRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressLinkStatusRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressLtrCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var latency: PciExpressLtrMaxLatencyRegister = PciExpressLtrMaxLatencyRegister(),
)

public data class PciExpressLtrMaxLatencyRegister(
    public var anonymous: PciExpressLtrMaxLatencyRegister0 = PciExpressLtrMaxLatencyRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressLtrMaxLatencyRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLtrMaxLatencyRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressLtrMaxLatencyRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressLtrMaxLatencyRegister0 =
                    PciExpressLtrMaxLatencyRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressLtrMaxLatencyRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressNpemCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capability: PciExpressNpemCapabilityRegister = PciExpressNpemCapabilityRegister(),
    public var control: PciExpressNpemControlRegister = PciExpressNpemControlRegister(),
    public var status: PciExpressNpemStatusRegister = PciExpressNpemStatusRegister(),
)

public data class PciExpressNpemCapabilityRegister(
    public var anonymous: PciExpressNpemCapabilityRegister0 = PciExpressNpemCapabilityRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressNpemCapabilityRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressNpemCapabilityRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressNpemCapabilityRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressNpemCapabilityRegister0 =
                    PciExpressNpemCapabilityRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressNpemCapabilityRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressNpemControlRegister(
    public var anonymous: PciExpressNpemControlRegister0 = PciExpressNpemControlRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressNpemControlRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressNpemControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressNpemControlRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressNpemControlRegister0 =
                    PciExpressNpemControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressNpemControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressNpemStatusRegister(
    public var anonymous: PciExpressNpemStatusRegister0 = PciExpressNpemStatusRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressNpemStatusRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressNpemStatusRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressNpemStatusRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressNpemStatusRegister0 =
                    PciExpressNpemStatusRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressNpemStatusRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressPasidCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capability: PciExpressPasidCapabilityRegister = PciExpressPasidCapabilityRegister(),
    public var control: PciExpressPasidControlRegister = PciExpressPasidControlRegister(),
)

public data class PciExpressPasidCapabilityRegister(
    public var anonymous: PciExpressPasidCapabilityRegister0 = PciExpressPasidCapabilityRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressPasidCapabilityRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPasidCapabilityRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPasidCapabilityRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressPasidCapabilityRegister0 =
                    PciExpressPasidCapabilityRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressPasidCapabilityRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressPasidControlRegister(
    public var anonymous: PciExpressPasidControlRegister0 = PciExpressPasidControlRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressPasidControlRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPasidControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPasidControlRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressPasidControlRegister0 =
                    PciExpressPasidControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressPasidControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressPmeRequestorId(
    public var anonymous: PciExpressPmeRequestorId0 = PciExpressPmeRequestorId0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressPmeRequestorId0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPmeRequestorId0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPmeRequestorId0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressPmeRequestorId0 =
                    PciExpressPmeRequestorId0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressPmeRequestorId0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressPriCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var control: PciExpressPriControlRegister = PciExpressPriControlRegister(),
    public var status: PciExpressPriStatusRegister = PciExpressPriStatusRegister(),
    public var pRCapacity: UInt = 0u,
    public var pRAllocation: UInt = 0u,
)

public data class PciExpressPriControlRegister(
    public var anonymous: PciExpressPriControlRegister0 = PciExpressPriControlRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressPriControlRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPriControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPriControlRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressPriControlRegister0 =
                    PciExpressPriControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressPriControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressPriStatusRegister(
    public var anonymous: PciExpressPriStatusRegister0 = PciExpressPriStatusRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressPriStatusRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPriStatusRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPriStatusRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressPriStatusRegister0 =
                    PciExpressPriStatusRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressPriStatusRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressPtmCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var ptmCapability: PciExpressPtmCapabilityRegister = PciExpressPtmCapabilityRegister(),
    public var ptmControl: PciExpressPtmControlRegister = PciExpressPtmControlRegister(),
)

public data class PciExpressPtmCapabilityRegister(
    public var anonymous: PciExpressPtmCapabilityRegister0 = PciExpressPtmCapabilityRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressPtmCapabilityRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPtmCapabilityRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPtmCapabilityRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressPtmCapabilityRegister0 =
                    PciExpressPtmCapabilityRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressPtmCapabilityRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressPtmControlRegister(
    public var anonymous: PciExpressPtmControlRegister0 = PciExpressPtmControlRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressPtmControlRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPtmControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressPtmControlRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressPtmControlRegister0 =
                    PciExpressPtmControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressPtmControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressResizableBarCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var entry: List<PciExpressResizableBarEntry> = List(6) { PciExpressResizableBarEntry() },
)

public data class PciExpressResizableBarCapabilityRegister(
    public var anonymous: PciExpressResizableBarCapabilityRegister0 = PciExpressResizableBarCapabilityRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressResizableBarCapabilityRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressResizableBarCapabilityRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressResizableBarCapabilityRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressResizableBarCapabilityRegister0 =
                    PciExpressResizableBarCapabilityRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressResizableBarCapabilityRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressResizableBarControlRegister(
    public var anonymous: PciExpressResizableBarControlRegister0 = PciExpressResizableBarControlRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressResizableBarControlRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressResizableBarControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressResizableBarControlRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressResizableBarControlRegister0 =
                    PciExpressResizableBarControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressResizableBarControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressResizableBarEntry(
    public var capability: PciExpressResizableBarCapabilityRegister = PciExpressResizableBarCapabilityRegister(),
    public var control: PciExpressResizableBarControlRegister = PciExpressResizableBarControlRegister(),
)

public data class PciExpressRootportAerCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var uncorrectableErrorStatus: PciExpressUncorrectableErrorStatus = PciExpressUncorrectableErrorStatus(),
    public var uncorrectableErrorMask: PciExpressUncorrectableErrorMask = PciExpressUncorrectableErrorMask(),
    public var uncorrectableErrorSeverity: PciExpressUncorrectableErrorSeverity = PciExpressUncorrectableErrorSeverity(),
    public var correctableErrorStatus: PciExpressCorrectableErrorStatus = PciExpressCorrectableErrorStatus(),
    public var correctableErrorMask: PciExpressCorrectableErrorMask = PciExpressCorrectableErrorMask(),
    public var capabilitiesAndControl: PciExpressAerCapabilities = PciExpressAerCapabilities(),
    public var headerLog: UIntArray = UIntArray(4),
    public var rootErrorCommand: PciExpressRootErrorCommand = PciExpressRootErrorCommand(),
    public var rootErrorStatus: PciExpressRootErrorStatus = PciExpressRootErrorStatus(),
    public var errorSourceId: PciExpressErrorSourceId = PciExpressErrorSourceId(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressRootportAerCapability) return false
        if (this.header != other.header) return false
        if (this.uncorrectableErrorStatus != other.uncorrectableErrorStatus) return false
        if (this.uncorrectableErrorMask != other.uncorrectableErrorMask) return false
        if (this.uncorrectableErrorSeverity != other.uncorrectableErrorSeverity) return false
        if (this.correctableErrorStatus != other.correctableErrorStatus) return false
        if (this.correctableErrorMask != other.correctableErrorMask) return false
        if (this.capabilitiesAndControl != other.capabilitiesAndControl) return false
        if (!this.headerLog.contentEquals(other.headerLog)) return false
        if (this.rootErrorCommand != other.rootErrorCommand) return false
        if (this.rootErrorStatus != other.rootErrorStatus) return false
        if (this.errorSourceId != other.errorSourceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uncorrectableErrorStatus.hashCode()
        result = 31 * result + this.uncorrectableErrorMask.hashCode()
        result = 31 * result + this.uncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.correctableErrorStatus.hashCode()
        result = 31 * result + this.correctableErrorMask.hashCode()
        result = 31 * result + this.capabilitiesAndControl.hashCode()
        result = 31 * result + this.headerLog.contentHashCode()
        result = 31 * result + this.rootErrorCommand.hashCode()
        result = 31 * result + this.rootErrorStatus.hashCode()
        result = 31 * result + this.errorSourceId.hashCode()
        return result
    }
}

public data class PciExpressRootCapabilitiesRegister(
    public var anonymous: PciExpressRootCapabilitiesRegister0 = PciExpressRootCapabilitiesRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressRootCapabilitiesRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressRootCapabilitiesRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressRootCapabilitiesRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressRootCapabilitiesRegister0 =
                    PciExpressRootCapabilitiesRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressRootCapabilitiesRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressRootControlRegister(
    public var anonymous: PciExpressRootControlRegister0 = PciExpressRootControlRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressRootControlRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressRootControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressRootControlRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressRootControlRegister0 =
                    PciExpressRootControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressRootControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressRootErrorCommand(
    public var anonymous: PciExpressRootErrorCommand0 = PciExpressRootErrorCommand0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressRootErrorCommand0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressRootErrorCommand0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressRootErrorCommand0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressRootErrorCommand0 =
                    PciExpressRootErrorCommand0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressRootErrorCommand0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressRootErrorStatus(
    public var anonymous: PciExpressRootErrorStatus0 = PciExpressRootErrorStatus0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressRootErrorStatus0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressRootErrorStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressRootErrorStatus0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressRootErrorStatus0 =
                    PciExpressRootErrorStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressRootErrorStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PciExpressRootPortInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var readConfigSpace: PpciExpressRootPortReadConfigSpace,
    public var writeConfigSpace: PpciExpressRootPortWriteConfigSpace,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        readConfigSpace = null,
        writeConfigSpace = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PpciExpressRootPortReadConfigSpace = this.readConfigSpace

    public operator fun component7(): PpciExpressRootPortWriteConfigSpace = this.writeConfigSpace

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, readConfigSpace: PpciExpressRootPortReadConfigSpace = this.readConfigSpace, writeConfigSpace: PpciExpressRootPortWriteConfigSpace = this.writeConfigSpace): PciExpressRootPortInterface = PciExpressRootPortInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, readConfigSpace = readConfigSpace, writeConfigSpace = writeConfigSpace)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressRootPortInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.readConfigSpace != other.readConfigSpace) return false
        if (this.writeConfigSpace != other.writeConfigSpace) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.readConfigSpace.hashCode()
        result = 31 * result + this.writeConfigSpace.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            readConfigSpace: PpciExpressRootPortReadConfigSpace = null,
            writeConfigSpace: PpciExpressRootPortWriteConfigSpace = null,
        ): PciExpressRootPortInterface =
            PciExpressRootPortInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                readConfigSpace = readConfigSpace,
                writeConfigSpace = writeConfigSpace,
            )
    }
}

public data class PciExpressRootStatusRegister(
    public var anonymous: PciExpressRootStatusRegister0 = PciExpressRootStatusRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressRootStatusRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressRootStatusRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressRootStatusRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressRootStatusRegister0 =
                    PciExpressRootStatusRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressRootStatusRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressSecondaryCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var linkControl3: PciExpressLinkControl3 = PciExpressLinkControl3(),
    public var laneErrorStatus: PciExpressLaneErrorStatus = PciExpressLaneErrorStatus(),
)

public data class PciExpressSecAerCapabilities(
    public var anonymous: PciExpressSecAerCapabilities0 = PciExpressSecAerCapabilities0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressSecAerCapabilities0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSecAerCapabilities0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSecAerCapabilities0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressSecAerCapabilities0 =
                    PciExpressSecAerCapabilities0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSecAerCapabilities0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressSecUncorrectableErrorMask(
    public var anonymous: PciExpressSecUncorrectableErrorMask0 = PciExpressSecUncorrectableErrorMask0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressSecUncorrectableErrorMask0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSecUncorrectableErrorMask0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSecUncorrectableErrorMask0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressSecUncorrectableErrorMask0 =
                    PciExpressSecUncorrectableErrorMask0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSecUncorrectableErrorMask0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressSecUncorrectableErrorSeverity(
    public var anonymous: PciExpressSecUncorrectableErrorSeverity0 = PciExpressSecUncorrectableErrorSeverity0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressSecUncorrectableErrorSeverity0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSecUncorrectableErrorSeverity0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSecUncorrectableErrorSeverity0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressSecUncorrectableErrorSeverity0 =
                    PciExpressSecUncorrectableErrorSeverity0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSecUncorrectableErrorSeverity0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressSecUncorrectableErrorStatus(
    public var anonymous: PciExpressSecUncorrectableErrorStatus0 = PciExpressSecUncorrectableErrorStatus0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressSecUncorrectableErrorStatus0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSecUncorrectableErrorStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSecUncorrectableErrorStatus0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressSecUncorrectableErrorStatus0 =
                    PciExpressSecUncorrectableErrorStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSecUncorrectableErrorStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressSerialNumberCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var lowSerialNumber: UInt = 0u,
    public var highSerialNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSerialNumberCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSerialNumberCapability> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PciExpressSerialNumberCapability =
                    PciExpressSerialNumberCapability(
                        (PciExpressEnhancedCapabilityHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PciExpressSerialNumberCapability) {
                    (PciExpressEnhancedCapabilityHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lowSerialNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.highSerialNumber)
                }
            }
    }
}

public data class PciExpressSlotCapabilitiesRegister(
    public var anonymous: PciExpressSlotCapabilitiesRegister0 = PciExpressSlotCapabilitiesRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressSlotCapabilitiesRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSlotCapabilitiesRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSlotCapabilitiesRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressSlotCapabilitiesRegister0 =
                    PciExpressSlotCapabilitiesRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSlotCapabilitiesRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressSlotControlRegister(
    public var anonymous: PciExpressSlotControlRegister0 = PciExpressSlotControlRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressSlotControlRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSlotControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSlotControlRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressSlotControlRegister0 =
                    PciExpressSlotControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSlotControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressSlotStatusRegister(
    public var anonymous: PciExpressSlotStatusRegister0 = PciExpressSlotStatusRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressSlotStatusRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSlotStatusRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSlotStatusRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressSlotStatusRegister0 =
                    PciExpressSlotStatusRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSlotStatusRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PciExpressSriovCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var sRIOVCapabilities: PciExpressSriovCaps = PciExpressSriovCaps(),
    public var sRIOVControl: PciExpressSriovControl = PciExpressSriovControl(),
    public var sRIOVStatus: PciExpressSriovStatus = PciExpressSriovStatus(),
    public var initialVFs: UShort = 0u,
    public var totalVFs: UShort = 0u,
    public var numVFs: UShort = 0u,
    public var functionDependencyLink: UByte = 0u,
    public var rsvdP1: UByte = 0u,
    public var firstVFOffset: UShort = 0u,
    public var vFStride: UShort = 0u,
    public var rsvdP2: UShort = 0u,
    public var vFDeviceId: UShort = 0u,
    public var supportedPageSizes: UInt = 0u,
    public var systemPageSize: UInt = 0u,
    public var baseAddresses: UIntArray = UIntArray(6),
    public var vFMigrationStateArrayOffset: PciExpressSriovMigrationStateArray = PciExpressSriovMigrationStateArray(),
)

public data class PciExpressSriovCaps(
    public var anonymous: PciExpressSriovCaps0 = PciExpressSriovCaps0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressSriovCaps0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSriovCaps0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSriovCaps0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressSriovCaps0 =
                    PciExpressSriovCaps0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSriovCaps0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressSriovControl(
    public var anonymous: PciExpressSriovControl0 = PciExpressSriovControl0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressSriovControl0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSriovControl0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSriovControl0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressSriovControl0 =
                    PciExpressSriovControl0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSriovControl0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressSriovMigrationStateArray(
    public var anonymous: PciExpressSriovMigrationStateArray0 = PciExpressSriovMigrationStateArray0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressSriovMigrationStateArray0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSriovMigrationStateArray0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSriovMigrationStateArray0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressSriovMigrationStateArray0 =
                    PciExpressSriovMigrationStateArray0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSriovMigrationStateArray0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressSriovStatus(
    public var anonymous: PciExpressSriovStatus0 = PciExpressSriovStatus0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressSriovStatus0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSriovStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressSriovStatus0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressSriovStatus0 =
                    PciExpressSriovStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressSriovStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressTphRequesterCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var requesterCapability: PciExpressTphRequesterCapabilityRegister = PciExpressTphRequesterCapabilityRegister(),
    public var requesterControl: PciExpressTphRequesterControlRegister = PciExpressTphRequesterControlRegister(),
)

public data class PciExpressTphRequesterCapabilityRegister(
    public var anonymous: PciExpressTphRequesterCapabilityRegister0 = PciExpressTphRequesterCapabilityRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressTphRequesterCapabilityRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressTphRequesterCapabilityRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressTphRequesterCapabilityRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressTphRequesterCapabilityRegister0 =
                    PciExpressTphRequesterCapabilityRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressTphRequesterCapabilityRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressTphRequesterControlRegister(
    public var anonymous: PciExpressTphRequesterControlRegister0 = PciExpressTphRequesterControlRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressTphRequesterControlRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressTphRequesterControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressTphRequesterControlRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressTphRequesterControlRegister0 =
                    PciExpressTphRequesterControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressTphRequesterControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressTphStTableEntry(
    public var anonymous: PciExpressTphStTableEntry0 = PciExpressTphStTableEntry0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressTphStTableEntry0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressTphStTableEntry0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressTphStTableEntry0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressTphStTableEntry0 =
                    PciExpressTphStTableEntry0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressTphStTableEntry0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressUncorrectableErrorMask(
    public var anonymous: PciExpressUncorrectableErrorMask0 = PciExpressUncorrectableErrorMask0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressUncorrectableErrorMask0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressUncorrectableErrorMask0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressUncorrectableErrorMask0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressUncorrectableErrorMask0 =
                    PciExpressUncorrectableErrorMask0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressUncorrectableErrorMask0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressUncorrectableErrorSeverity(
    public var anonymous: PciExpressUncorrectableErrorSeverity0 = PciExpressUncorrectableErrorSeverity0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressUncorrectableErrorSeverity0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressUncorrectableErrorSeverity0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressUncorrectableErrorSeverity0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressUncorrectableErrorSeverity0 =
                    PciExpressUncorrectableErrorSeverity0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressUncorrectableErrorSeverity0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressUncorrectableErrorStatus(
    public var anonymous: PciExpressUncorrectableErrorStatus0 = PciExpressUncorrectableErrorStatus0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressUncorrectableErrorStatus0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressUncorrectableErrorStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressUncorrectableErrorStatus0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressUncorrectableErrorStatus0 =
                    PciExpressUncorrectableErrorStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressUncorrectableErrorStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressVendorSpecificCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var vsecId: UShort = 0u,
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressVendorSpecificCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressVendorSpecificCapability> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PciExpressVendorSpecificCapability =
                    PciExpressVendorSpecificCapability(
                        (PciExpressEnhancedCapabilityHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: PciExpressVendorSpecificCapability) {
                    (PciExpressEnhancedCapabilityHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.vsecId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.bitfield)
                }
            }
    }
}

public data class PciExpressVirtualChannelCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capabilities1: VirtualChannelCapabilities1 = VirtualChannelCapabilities1(),
    public var capabilities2: VirtualChannelCapabilities2 = VirtualChannelCapabilities2(),
    public var control: VirtualChannelControl = VirtualChannelControl(),
    public var status: VirtualChannelStatus = VirtualChannelStatus(),
    public var resource: List<VirtualResource> = List(8) { VirtualResource() },
)

public data class PciFirmwareBusCaps(
    public var type: UShort = 0u,
    public var length: UShort = 0u,
    public var anonymous: PciFirmwareBusCaps0 = PciFirmwareBusCaps0(),
    public var currentSpeedAndMode: UByte = 0u,
    public var supportedSpeedsAndModesLowByte: UByte = 0u,
    public var supportedSpeedsAndModesHighByte: UByte = 0u,
    public var voltage: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciFirmwareBusCaps) return false
        if (this.type != other.type) return false
        if (this.length != other.length) return false
        if (this.anonymous != other.anonymous) return false
        if (this.currentSpeedAndMode != other.currentSpeedAndMode) return false
        if (this.supportedSpeedsAndModesLowByte != other.supportedSpeedsAndModesLowByte) return false
        if (this.supportedSpeedsAndModesHighByte != other.supportedSpeedsAndModesHighByte) return false
        if (this.voltage != other.voltage) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.currentSpeedAndMode.hashCode()
        result = 31 * result + this.supportedSpeedsAndModesLowByte.hashCode()
        result = 31 * result + this.supportedSpeedsAndModesHighByte.hashCode()
        result = 31 * result + this.voltage.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFirmwareBusCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFirmwareBusCaps> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PciFirmwareBusCaps =
                    PciFirmwareBusCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (PciFirmwareBusCaps0.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PciFirmwareBusCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.length)
                    (PciFirmwareBusCaps0.typeLayout()).writeNative(addr + 4L, value.anonymous)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.currentSpeedAndMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.supportedSpeedsAndModesLowByte)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.supportedSpeedsAndModesHighByte)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.voltage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                    ).writeNative(addr + 9L, value.reserved2.toList())
                }
            }
    }
}

public data class PciFirmwareBusCaps0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFirmwareBusCaps0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFirmwareBusCaps0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PciFirmwareBusCaps0 =
                    PciFirmwareBusCaps0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciFirmwareBusCaps0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciFirmwareBusCapsReturnBuffer(
    public var version: UShort = 0u,
    public var status: UShort = 0u,
    public var length: UInt = 0u,
    public var caps: PciFirmwareBusCaps = PciFirmwareBusCaps(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFirmwareBusCapsReturnBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFirmwareBusCapsReturnBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PciFirmwareBusCapsReturnBuffer =
                    PciFirmwareBusCapsReturnBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (PciFirmwareBusCaps.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PciFirmwareBusCapsReturnBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (PciFirmwareBusCaps.typeLayout()).writeNative(addr + 8L, value.caps)
                }
            }
    }
}

public data class PciFpbCapabilitiesRegister(
    public var anonymous: PciFpbCapabilitiesRegister0 = PciFpbCapabilitiesRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciFpbCapabilitiesRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbCapabilitiesRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbCapabilitiesRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciFpbCapabilitiesRegister0 =
                    PciFpbCapabilitiesRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciFpbCapabilitiesRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciFpbCapability(
    public var header: PciFpbCapabilityHeader = PciFpbCapabilityHeader(),
    public var capabilitiesRegister: PciFpbCapabilitiesRegister = PciFpbCapabilitiesRegister(),
    public var ridVectorControl1Register: PciFpbRidVectorControl1Register = PciFpbRidVectorControl1Register(),
    public var ridVectorControl2Register: PciFpbRidVectorControl2Register = PciFpbRidVectorControl2Register(),
    public var memLowVectorControlRegister: PciFpbMemLowVectorControlRegister = PciFpbMemLowVectorControlRegister(),
    public var memHighVectorControl1Register: PciFpbMemHighVectorControl1Register = PciFpbMemHighVectorControl1Register(),
    public var memHighVectorControl2Register: PciFpbMemHighVectorControl2Register = PciFpbMemHighVectorControl2Register(),
    public var vectorAccessControlRegister: PciFpbVectorAccessControlRegister = PciFpbVectorAccessControlRegister(),
    public var vectorAccessDataRegister: PciFpbVectorAccessDataRegister = PciFpbVectorAccessDataRegister(),
)

public data class PciFpbCapabilityHeader(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbCapabilityHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbCapabilityHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciFpbCapabilityHeader =
                    PciFpbCapabilityHeader(
                        (PciCapabilitiesHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: PciFpbCapabilityHeader) {
                    (PciCapabilitiesHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                }
            }
    }
}

public data class PciFpbMemHighVectorControl1Register(
    public var anonymous: PciFpbMemHighVectorControl1Register0 = PciFpbMemHighVectorControl1Register0(),
    public var asULONG: UInt = 0u,
)

public data class PciFpbMemHighVectorControl1Register0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbMemHighVectorControl1Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbMemHighVectorControl1Register0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciFpbMemHighVectorControl1Register0 =
                    PciFpbMemHighVectorControl1Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciFpbMemHighVectorControl1Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciFpbMemHighVectorControl2Register(
    public var memHighVectorStartUpper: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbMemHighVectorControl2Register> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbMemHighVectorControl2Register> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciFpbMemHighVectorControl2Register =
                    PciFpbMemHighVectorControl2Register(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciFpbMemHighVectorControl2Register) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.memHighVectorStartUpper)
                }
            }
    }
}

public data class PciFpbMemLowVectorControlRegister(
    public var anonymous: PciFpbMemLowVectorControlRegister0 = PciFpbMemLowVectorControlRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciFpbMemLowVectorControlRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbMemLowVectorControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbMemLowVectorControlRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciFpbMemLowVectorControlRegister0 =
                    PciFpbMemLowVectorControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciFpbMemLowVectorControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciFpbRidVectorControl1Register(
    public var anonymous: PciFpbRidVectorControl1Register0 = PciFpbRidVectorControl1Register0(),
    public var asULONG: UInt = 0u,
)

public data class PciFpbRidVectorControl1Register0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbRidVectorControl1Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbRidVectorControl1Register0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciFpbRidVectorControl1Register0 =
                    PciFpbRidVectorControl1Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciFpbRidVectorControl1Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciFpbRidVectorControl2Register(
    public var anonymous: PciFpbRidVectorControl2Register0 = PciFpbRidVectorControl2Register0(),
    public var asULONG: UInt = 0u,
)

public data class PciFpbRidVectorControl2Register0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbRidVectorControl2Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbRidVectorControl2Register0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciFpbRidVectorControl2Register0 =
                    PciFpbRidVectorControl2Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciFpbRidVectorControl2Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciFpbVectorAccessControlRegister(
    public var anonymous: PciFpbVectorAccessControlRegister0 = PciFpbVectorAccessControlRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciFpbVectorAccessControlRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbVectorAccessControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbVectorAccessControlRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciFpbVectorAccessControlRegister0 =
                    PciFpbVectorAccessControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciFpbVectorAccessControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciFpbVectorAccessDataRegister(
    public var vectorAccessData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbVectorAccessDataRegister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciFpbVectorAccessDataRegister> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciFpbVectorAccessDataRegister =
                    PciFpbVectorAccessDataRegister(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciFpbVectorAccessDataRegister) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vectorAccessData)
                }
            }
    }
}

public class PciMsixTableConfigInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var setTableEntry: PpciMsixSetEntry,
    public var maskTableEntry: PpciMsixMaskunmaskEntry,
    public var unmaskTableEntry: PpciMsixMaskunmaskEntry,
    public var getTableEntry: PpciMsixGetEntry,
    public var getTableSize: PpciMsixGetTableSize,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        setTableEntry = null,
        maskTableEntry = null,
        unmaskTableEntry = null,
        getTableEntry = null,
        getTableSize = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PpciMsixSetEntry = this.setTableEntry

    public operator fun component7(): PpciMsixMaskunmaskEntry = this.maskTableEntry

    public operator fun component8(): PpciMsixMaskunmaskEntry = this.unmaskTableEntry

    public operator fun component9(): PpciMsixGetEntry = this.getTableEntry

    public operator fun component10(): PpciMsixGetTableSize = this.getTableSize

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, setTableEntry: PpciMsixSetEntry = this.setTableEntry, maskTableEntry: PpciMsixMaskunmaskEntry = this.maskTableEntry, unmaskTableEntry: PpciMsixMaskunmaskEntry = this.unmaskTableEntry, getTableEntry: PpciMsixGetEntry = this.getTableEntry, getTableSize: PpciMsixGetTableSize = this.getTableSize): PciMsixTableConfigInterface = PciMsixTableConfigInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, setTableEntry = setTableEntry, maskTableEntry = maskTableEntry, unmaskTableEntry = unmaskTableEntry, getTableEntry = getTableEntry, getTableSize = getTableSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciMsixTableConfigInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.setTableEntry != other.setTableEntry) return false
        if (this.maskTableEntry != other.maskTableEntry) return false
        if (this.unmaskTableEntry != other.unmaskTableEntry) return false
        if (this.getTableEntry != other.getTableEntry) return false
        if (this.getTableSize != other.getTableSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.setTableEntry.hashCode()
        result = 31 * result + this.maskTableEntry.hashCode()
        result = 31 * result + this.unmaskTableEntry.hashCode()
        result = 31 * result + this.getTableEntry.hashCode()
        result = 31 * result + this.getTableSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            setTableEntry: PpciMsixSetEntry = null,
            maskTableEntry: PpciMsixMaskunmaskEntry = null,
            unmaskTableEntry: PpciMsixMaskunmaskEntry = null,
            getTableEntry: PpciMsixGetEntry = null,
            getTableSize: PpciMsixGetTableSize = null,
        ): PciMsixTableConfigInterface =
            PciMsixTableConfigInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                setTableEntry = setTableEntry,
                maskTableEntry = maskTableEntry,
                unmaskTableEntry = unmaskTableEntry,
                getTableEntry = getTableEntry,
                getTableSize = getTableSize,
            )
    }
}

public data class PciPmc(
    public var bitfield: UByte = 0u,
    public var support: PciPmc0 = PciPmc0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciPmc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciPmc> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciPmc =
                    PciPmc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (PciPmc0.typeLayout()).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: PciPmc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (PciPmc0.typeLayout()).writeNative(addr + 1L, value.support)
                }
            }
    }
}

public data class PciPmc0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciPmc0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciPmc0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PciPmc0 =
                    PciPmc0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciPmc0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciPmcsr(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciPmcsr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciPmcsr> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciPmcsr =
                    PciPmcsr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciPmcsr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciPmcsrBse(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciPmcsrBse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciPmcsrBse> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PciPmcsrBse =
                    PciPmcsrBse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciPmcsrBse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciPmCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var pmc: PciPmCapability0 = PciPmCapability0(),
    public var pmcsr: PciPmCapability1 = PciPmCapability1(),
    public var pmcsrBse: PciPmCapability2 = PciPmCapability2(),
    public var data: UByte = 0u,
)

public data class PciPmCapability2(
    public var bridgeSupport: PciPmcsrBse = PciPmcsrBse(),
    public var asUCHAR: UByte = 0u,
)

public data class PciPmCapability1(
    public var controlStatus: PciPmcsr = PciPmcsr(),
    public var asUSHORT: UShort = 0u,
)

public data class PciPmCapability0(
    public var capabilities: PciPmc = PciPmc(),
    public var asUSHORT: UShort = 0u,
)

public data class PciRootBusHardwareCapability(
    public var secondaryInterface: PciHardwareInterface = 0,
    public var anonymous: PciRootBusHardwareCapability0 = PciRootBusHardwareCapability0(),
    public var oscFeatureSupport: PciRootBusOscSupportField = PciRootBusOscSupportField(),
    public var oscControlRequest: PciRootBusOscControlField = PciRootBusOscControlField(),
    public var oscControlGranted: PciRootBusOscControlField = PciRootBusOscControlField(),
)

public data class PciRootBusHardwareCapability0(
    public var busCapabilitiesFound: Boolean = false,
    public var currentSpeedAndMode: UInt = 0u,
    public var supportedSpeedsAndModes: UInt = 0u,
    public var deviceIDMessagingCapable: Boolean = false,
    public var secondaryBusWidth: PciBusWidth = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciRootBusHardwareCapability0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciRootBusHardwareCapability0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): PciRootBusHardwareCapability0 =
                    PciRootBusHardwareCapability0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PciRootBusHardwareCapability0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.busCapabilitiesFound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.currentSpeedAndMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.supportedSpeedsAndModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.deviceIDMessagingCapable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.secondaryBusWidth)
                }
            }
    }
}

public data class PciRootBusOscControlField(
    public var u: PciRootBusOscControlField0 = PciRootBusOscControlField0(),
)

public data class PciRootBusOscControlField0(
    public var anonymous: PciRootBusOscControlField00 = PciRootBusOscControlField00(),
    public var asULONG: UInt = 0u,
)

public data class PciRootBusOscControlField00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciRootBusOscControlField00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciRootBusOscControlField00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciRootBusOscControlField00 =
                    PciRootBusOscControlField00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciRootBusOscControlField00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciRootBusOscSupportField(
    public var u: PciRootBusOscSupportField0 = PciRootBusOscSupportField0(),
)

public data class PciRootBusOscSupportField0(
    public var anonymous: PciRootBusOscSupportField00 = PciRootBusOscSupportField00(),
    public var asULONG: UInt = 0u,
)

public data class PciRootBusOscSupportField00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciRootBusOscSupportField00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciRootBusOscSupportField00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciRootBusOscSupportField00 =
                    PciRootBusOscSupportField00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciRootBusOscSupportField00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PciSecurityInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var setAccessControlServices: PpciSetAcs,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        setAccessControlServices = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PpciSetAcs = this.setAccessControlServices

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, setAccessControlServices: PpciSetAcs = this.setAccessControlServices): PciSecurityInterface = PciSecurityInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, setAccessControlServices = setAccessControlServices)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciSecurityInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.setAccessControlServices != other.setAccessControlServices) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.setAccessControlServices.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            setAccessControlServices: PpciSetAcs = null,
        ): PciSecurityInterface =
            PciSecurityInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                setAccessControlServices = setAccessControlServices,
            )
    }
}

public class PciSecurityInterface2 internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var flags: UInt,
    public var supportedScenarios: UInt,
    public var setAccessControlServices: PpciSetAcs2,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        flags = 0u,
        supportedScenarios = 0u,
        setAccessControlServices = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): UInt = this.flags

    public operator fun component7(): UInt = this.supportedScenarios

    public operator fun component8(): PpciSetAcs2 = this.setAccessControlServices

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, flags: UInt = this.flags, supportedScenarios: UInt = this.supportedScenarios, setAccessControlServices: PpciSetAcs2 = this.setAccessControlServices): PciSecurityInterface2 = PciSecurityInterface2(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, flags = flags, supportedScenarios = supportedScenarios, setAccessControlServices = setAccessControlServices)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciSecurityInterface2) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.flags != other.flags) return false
        if (this.supportedScenarios != other.supportedScenarios) return false
        if (this.setAccessControlServices != other.setAccessControlServices) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.supportedScenarios.hashCode()
        result = 31 * result + this.setAccessControlServices.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            flags: UInt = 0u,
            supportedScenarios: UInt = 0u,
            setAccessControlServices: PpciSetAcs2 = null,
        ): PciSecurityInterface2 =
            PciSecurityInterface2(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                flags = flags,
                supportedScenarios = supportedScenarios,
                setAccessControlServices = setAccessControlServices,
            )
    }
}

public data class PciSegmentBusNumber(
    public var u: PciSegmentBusNumber0 = PciSegmentBusNumber0(),
)

public data class PciSegmentBusNumber0(
    public var bits: PciSegmentBusNumber00 = PciSegmentBusNumber00(),
    public var asULONG: UInt = 0u,
)

public data class PciSegmentBusNumber00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciSegmentBusNumber00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciSegmentBusNumber00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciSegmentBusNumber00 =
                    PciSegmentBusNumber00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciSegmentBusNumber00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciSlotNumber(
    public var u: PciSlotNumber0 = PciSlotNumber0(),
)

public data class PciSlotNumber0(
    public var bits: PciSlotNumber00 = PciSlotNumber00(),
    public var asULONG: UInt = 0u,
)

public data class PciSlotNumber00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciSlotNumber00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciSlotNumber00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciSlotNumber00 =
                    PciSlotNumber00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciSlotNumber00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciSubsystemIdsCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var reserved: UShort = 0u,
    public var subVendorID: UShort = 0u,
    public var subSystemID: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciSubsystemIdsCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciSubsystemIdsCapability> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PciSubsystemIdsCapability =
                    PciSubsystemIdsCapability(
                        (PciCapabilitiesHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: PciSubsystemIdsCapability) {
                    (PciCapabilitiesHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.subVendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.subSystemID)
                }
            }
    }
}

public data class PciVendorSpecificCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var vscLength: UByte = 0u,
    public var vendorSpecific: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciVendorSpecificCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciVendorSpecificCapability> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciVendorSpecificCapability =
                    PciVendorSpecificCapability(
                        (PciCapabilitiesHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: PciVendorSpecificCapability) {
                    (PciCapabilitiesHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.vscLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.vendorSpecific)
                }
            }
    }
}

public class PciVirtualizationInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var setVirtualFunctionData: PsetVirtualDeviceData,
    public var getVirtualFunctionData: PgetVirtualDeviceData,
    public var getLocation: PgetVirtualDeviceLocation,
    public var getResources: PgetVirtualDeviceResources,
    public var enableVirtualization: PenableVirtualization,
    public var getVirtualFunctionProbedBars: PgetVirtualFunctionProbedBars,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        setVirtualFunctionData = null,
        getVirtualFunctionData = null,
        getLocation = null,
        getResources = null,
        enableVirtualization = null,
        getVirtualFunctionProbedBars = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PsetVirtualDeviceData = this.setVirtualFunctionData

    public operator fun component7(): PgetVirtualDeviceData = this.getVirtualFunctionData

    public operator fun component8(): PgetVirtualDeviceLocation = this.getLocation

    public operator fun component9(): PgetVirtualDeviceResources = this.getResources

    public operator fun component10(): PenableVirtualization = this.enableVirtualization

    public operator fun component11(): PgetVirtualFunctionProbedBars = this.getVirtualFunctionProbedBars

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, setVirtualFunctionData: PsetVirtualDeviceData = this.setVirtualFunctionData, getVirtualFunctionData: PgetVirtualDeviceData = this.getVirtualFunctionData, getLocation: PgetVirtualDeviceLocation = this.getLocation, getResources: PgetVirtualDeviceResources = this.getResources, enableVirtualization: PenableVirtualization = this.enableVirtualization, getVirtualFunctionProbedBars: PgetVirtualFunctionProbedBars = this.getVirtualFunctionProbedBars): PciVirtualizationInterface = PciVirtualizationInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, setVirtualFunctionData = setVirtualFunctionData, getVirtualFunctionData = getVirtualFunctionData, getLocation = getLocation, getResources = getResources, enableVirtualization = enableVirtualization, getVirtualFunctionProbedBars = getVirtualFunctionProbedBars)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciVirtualizationInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.setVirtualFunctionData != other.setVirtualFunctionData) return false
        if (this.getVirtualFunctionData != other.getVirtualFunctionData) return false
        if (this.getLocation != other.getLocation) return false
        if (this.getResources != other.getResources) return false
        if (this.enableVirtualization != other.enableVirtualization) return false
        if (this.getVirtualFunctionProbedBars != other.getVirtualFunctionProbedBars) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.setVirtualFunctionData.hashCode()
        result = 31 * result + this.getVirtualFunctionData.hashCode()
        result = 31 * result + this.getLocation.hashCode()
        result = 31 * result + this.getResources.hashCode()
        result = 31 * result + this.enableVirtualization.hashCode()
        result = 31 * result + this.getVirtualFunctionProbedBars.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            setVirtualFunctionData: PsetVirtualDeviceData = null,
            getVirtualFunctionData: PgetVirtualDeviceData = null,
            getLocation: PgetVirtualDeviceLocation = null,
            getResources: PgetVirtualDeviceResources = null,
            enableVirtualization: PenableVirtualization = null,
            getVirtualFunctionProbedBars: PgetVirtualFunctionProbedBars = null,
        ): PciVirtualizationInterface =
            PciVirtualizationInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                setVirtualFunctionData = setVirtualFunctionData,
                getVirtualFunctionData = getVirtualFunctionData,
                getLocation = getLocation,
                getResources = getResources,
                enableVirtualization = enableVirtualization,
                getVirtualFunctionProbedBars = getVirtualFunctionProbedBars,
            )
    }
}

public data class PciXCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var command: PciXCapability0 = PciXCapability0(),
    public var status: PciXCapability1 = PciXCapability1(),
)

public data class PciXCapability0(
    public var bits: PciXCapability00 = PciXCapability00(),
    public var asUSHORT: UShort = 0u,
)

public data class PciXCapability00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciXCapability00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciXCapability00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciXCapability00 =
                    PciXCapability00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciXCapability00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciXCapability1(
    public var bits: PciXCapability10 = PciXCapability10(),
    public var asULONG: UInt = 0u,
)

public data class PciXCapability10(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciXCapability10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciXCapability10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciXCapability10 =
                    PciXCapability10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciXCapability10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PcwCallbackInformation(
    public var addCounter: PcwCounterInformation = PcwCounterInformation(),
    public var removeCounter: PcwCounterInformation = PcwCounterInformation(),
    public var enumerateInstances: PcwMaskInformation = PcwMaskInformation(),
    public var collectData: PcwMaskInformation = PcwMaskInformation(),
)

public data class PcwCounterDescriptor(
    public var id: UShort = 0u,
    public var structIndex: UShort = 0u,
    public var offset: UShort = 0u,
    public var size: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcwCounterDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcwCounterDescriptor> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PcwCounterDescriptor =
                    PcwCounterDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: PcwCounterDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.structIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.size)
                }
            }
    }
}

public class PcwCounterInformation internal constructor(
    public var counterMask: ULong,
    instanceMaskCtorArg: MutPtr,
) {
    public var instanceMask: MutPtr = instanceMaskCtorArg
        internal set

    public constructor() : this(
        counterMask = 0uL,
        instanceMaskCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.counterMask

    public operator fun component2(): MutPtr = this.instanceMask

    public fun copy(counterMask: ULong = this.counterMask, instanceMask: MutPtr = this.instanceMask): PcwCounterInformation = PcwCounterInformation(counterMask = counterMask, instanceMaskCtorArg = instanceMask)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PcwCounterInformation) return false
        if (this.counterMask != other.counterMask) return false
        if (this.instanceMask != other.instanceMask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.counterMask.hashCode()
        result = 31 * result + this.instanceMask.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcwCounterInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcwCounterInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PcwCounterInformation =
                    PcwCounterInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PcwCounterInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.counterMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.instanceMask)
                }
            }

        public operator fun invoke(
            counterMask: ULong = 0uL,
            instanceMask: MutPtr = MutPtr(0L),
        ): PcwCounterInformation =
            PcwCounterInformation(
                counterMask = counterMask,
                instanceMaskCtorArg = instanceMask,
            )
    }
}

public class PcwData internal constructor(
    dataCtorArg: ConstPtr,
    public var size: UInt,
) {
    public var data: ConstPtr = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr = this.data, size: UInt = this.size): PcwData = PcwData(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PcwData) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcwData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcwData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PcwData =
                    PcwData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PcwData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr = ConstPtr(0L),
            size: UInt = 0u,
        ): PcwData =
            PcwData(
                dataCtorArg = data,
                size = size,
            )
    }
}

public class PcwMaskInformation internal constructor(
    public var counterMask: ULong,
    instanceMaskCtorArg: MutPtr,
    public var instanceId: UInt,
    public var collectMultiple: Boolean,
    public var buffer: PpcwBuffer,
    cancelEventCtorArg: MutPtr,
) {
    public var instanceMask: MutPtr = instanceMaskCtorArg
        internal set

    public var cancelEvent: MutPtr = cancelEventCtorArg
        internal set

    public constructor() : this(
        counterMask = 0uL,
        instanceMaskCtorArg = MutPtr(0L),
        instanceId = 0u,
        collectMultiple = false,
        buffer = 0L,
        cancelEventCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.counterMask

    public operator fun component2(): MutPtr = this.instanceMask

    public operator fun component3(): UInt = this.instanceId

    public operator fun component4(): Boolean = this.collectMultiple

    public operator fun component5(): PpcwBuffer = this.buffer

    public operator fun component6(): MutPtr = this.cancelEvent

    public fun copy(counterMask: ULong = this.counterMask, instanceMask: MutPtr = this.instanceMask, instanceId: UInt = this.instanceId, collectMultiple: Boolean = this.collectMultiple, buffer: PpcwBuffer = this.buffer, cancelEvent: MutPtr = this.cancelEvent): PcwMaskInformation = PcwMaskInformation(counterMask = counterMask, instanceMaskCtorArg = instanceMask, instanceId = instanceId, collectMultiple = collectMultiple, buffer = buffer, cancelEventCtorArg = cancelEvent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PcwMaskInformation) return false
        if (this.counterMask != other.counterMask) return false
        if (this.instanceMask != other.instanceMask) return false
        if (this.instanceId != other.instanceId) return false
        if (this.collectMultiple != other.collectMultiple) return false
        if (this.buffer != other.buffer) return false
        if (this.cancelEvent != other.cancelEvent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.counterMask.hashCode()
        result = 31 * result + this.instanceMask.hashCode()
        result = 31 * result + this.instanceId.hashCode()
        result = 31 * result + this.collectMultiple.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.cancelEvent.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcwMaskInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcwMaskInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): PcwMaskInformation =
                    PcwMaskInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: PcwMaskInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.counterMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.instanceMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.instanceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.collectMultiple)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.buffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.cancelEvent)
                }
            }

        public operator fun invoke(
            counterMask: ULong = 0uL,
            instanceMask: MutPtr = MutPtr(0L),
            instanceId: UInt = 0u,
            collectMultiple: Boolean = false,
            buffer: PpcwBuffer = 0L,
            cancelEvent: MutPtr = MutPtr(0L),
        ): PcwMaskInformation =
            PcwMaskInformation(
                counterMask = counterMask,
                instanceMaskCtorArg = instanceMask,
                instanceId = instanceId,
                collectMultiple = collectMultiple,
                buffer = buffer,
                cancelEventCtorArg = cancelEvent,
            )
    }
}

public class PcwRegistrationInformation internal constructor(
    public var version: UInt,
    nameCtorArg: MutPtr,
    public var counterCount: UInt,
    countersCtorArg: MutPtr,
    public var callback: PpcwCallback,
    callbackContextCtorArg: MutPtr,
    public var flags: PcwRegistrationFlags,
) {
    public var name: MutPtr = nameCtorArg
        internal set

    public var counters: MutPtr = countersCtorArg
        internal set

    public var callbackContext: MutPtr = callbackContextCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        nameCtorArg = MutPtr(0L),
        counterCount = 0u,
        countersCtorArg = MutPtr(0L),
        callback = null,
        callbackContextCtorArg = MutPtr(0L),
        flags = 0,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr = this.name

    public operator fun component3(): UInt = this.counterCount

    public operator fun component4(): MutPtr = this.counters

    public operator fun component5(): PpcwCallback = this.callback

    public operator fun component6(): MutPtr = this.callbackContext

    public operator fun component7(): PcwRegistrationFlags = this.flags

    public fun copy(version: UInt = this.version, name: MutPtr = this.name, counterCount: UInt = this.counterCount, counters: MutPtr = this.counters, callback: PpcwCallback = this.callback, callbackContext: MutPtr = this.callbackContext, flags: PcwRegistrationFlags = this.flags): PcwRegistrationInformation = PcwRegistrationInformation(version = version, nameCtorArg = name, counterCount = counterCount, countersCtorArg = counters, callback = callback, callbackContextCtorArg = callbackContext, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PcwRegistrationInformation) return false
        if (this.version != other.version) return false
        if (this.name != other.name) return false
        if (this.counterCount != other.counterCount) return false
        if (this.counters != other.counters) return false
        if (this.callback != other.callback) return false
        if (this.callbackContext != other.callbackContext) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.counterCount.hashCode()
        result = 31 * result + this.counters.hashCode()
        result = 31 * result + this.callback.hashCode()
        result = 31 * result + this.callbackContext.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            name: MutPtr = MutPtr(0L),
            counterCount: UInt = 0u,
            counters: MutPtr = MutPtr(0L),
            callback: PpcwCallback = null,
            callbackContext: MutPtr = MutPtr(0L),
            flags: PcwRegistrationFlags = 0,
        ): PcwRegistrationInformation =
            PcwRegistrationInformation(
                version = version,
                nameCtorArg = name,
                counterCount = counterCount,
                countersCtorArg = counters,
                callback = callback,
                callbackContextCtorArg = callbackContext,
                flags = flags,
            )
    }
}

public data class PhysicalCounterEventBufferConfiguration(
    public var overflowHandler: PphysicalCounterEventBufferOverflowHandler = null,
    public var customEventBufferEntrySize: UInt = 0u,
    public var eventThreshold: UInt = 0u,
)

public data class PhysicalCounterResourceDescriptor(
    public var type: PhysicalCounterResourceDescriptorType = 0,
    public var flags: UInt = 0u,
    public var u: PhysicalCounterResourceDescriptor0 = PhysicalCounterResourceDescriptor0(),
)

public data class PhysicalCounterResourceDescriptor0(
    public var counterIndex: UInt = 0u,
    public var range: PhysicalCounterResourceDescriptor00 = PhysicalCounterResourceDescriptor00(),
    public var overflowHandler: PphysicalCounterOverflowHandler = null,
    public var eventBufferConfiguration: PhysicalCounterEventBufferConfiguration = PhysicalCounterEventBufferConfiguration(),
    public var identificationTag: UInt = 0u,
)

public data class PhysicalCounterResourceDescriptor00(
    public var begin: UInt = 0u,
    public var end: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalCounterResourceDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalCounterResourceDescriptor00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PhysicalCounterResourceDescriptor00 =
                    PhysicalCounterResourceDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PhysicalCounterResourceDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.begin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.end)
                }
            }
    }
}

public data class PhysicalCounterResourceList(
    public var count: UInt = 0u,
    public var descriptors: List<PhysicalCounterResourceDescriptor> = List(1) { PhysicalCounterResourceDescriptor() },
)

public data class PhysicalMemoryRange(
    public var baseAddress: Long = 0L,
    public var numberOfBytes: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PhysicalMemoryRange =
                    PhysicalMemoryRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PhysicalMemoryRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.numberOfBytes)
                }
            }
    }
}

public data class PlugplayNotificationHeader(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var event: Guid = Guid(),
)

public class PmDispatchTable internal constructor(
    public var signature: UInt,
    public var version: UInt,
    functionCtorArg: List<MutPtr>,
) {
    public var function: List<MutPtr> = functionCtorArg
        internal set

    public constructor() : this(
        signature = 0u,
        version = 0u,
        functionCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.signature

    public operator fun component2(): UInt = this.version

    public operator fun component3(): List<MutPtr> = this.function

    public fun copy(signature: UInt = this.signature, version: UInt = this.version, function: List<MutPtr> = this.function): PmDispatchTable = PmDispatchTable(signature = signature, version = version, functionCtorArg = function)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmDispatchTable) return false
        if (this.signature != other.signature) return false
        if (this.version != other.version) return false
        if (this.function != other.function) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.function.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PmDispatchTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PmDispatchTable> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PmDispatchTable =
                    PmDispatchTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout(64),
                                    (1).toInt(),
                                )
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PmDispatchTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout(64),
                                (1).toInt(),
                            )
                    ).writeNative(addr + 8L, value.function)
                }
            }

        public operator fun invoke(
            signature: UInt = 0u,
            version: UInt = 0u,
            function: List<MutPtr> = List(1) { MutPtr(0L) },
        ): PmDispatchTable =
            PmDispatchTable(
                signature = signature,
                version = version,
                functionCtorArg = function,
            )
    }
}

public data class PnpBusInformation(
    public var busTypeGuid: Guid = Guid(),
    public var legacyBusType: InterfaceType = 0,
    public var busNumber: UInt = 0u,
)

public class PnpExtendedAddressInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var queryExtendedAddress: Pqueryextendedaddress,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        queryExtendedAddress = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): Pqueryextendedaddress = this.queryExtendedAddress

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, queryExtendedAddress: Pqueryextendedaddress = this.queryExtendedAddress): PnpExtendedAddressInterface = PnpExtendedAddressInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, queryExtendedAddress = queryExtendedAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PnpExtendedAddressInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.queryExtendedAddress != other.queryExtendedAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.queryExtendedAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            queryExtendedAddress: Pqueryextendedaddress = null,
        ): PnpExtendedAddressInterface =
            PnpExtendedAddressInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                queryExtendedAddress = queryExtendedAddress,
            )
    }
}

public class PnpLocationInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var getLocationString: PgetLocationString,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        getLocationString = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PgetLocationString = this.getLocationString

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, getLocationString: PgetLocationString = this.getLocationString): PnpLocationInterface = PnpLocationInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, getLocationString = getLocationString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PnpLocationInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.getLocationString != other.getLocationString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.getLocationString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            getLocationString: PgetLocationString = null,
        ): PnpLocationInterface =
            PnpLocationInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                getLocationString = getLocationString,
            )
    }
}

public data class PnpReplaceDriverInterface(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var unload: PreplaceUnload = null,
    public var beginReplace: PreplaceBegin = null,
    public var endReplace: PreplaceEnd = null,
    public var mirrorPhysicalMemory: PreplaceMirrorPhysicalMemory = null,
    public var setProcessorId: PreplaceSetProcessorId = null,
    public var swap: PreplaceSwap = null,
    public var initiateHardwareMirror: PreplaceInitiateHardwareMirror = null,
    public var mirrorPlatformMemory: PreplaceMirrorPlatformMemory = null,
    public var getMemoryDestination: PreplaceGetMemoryDestination = null,
    public var enableDisableHardwareQuiesce: PreplaceEnableDisableHardwareQuiesce = null,
)

public data class PnpReplaceMemoryList(
    public var allocatedCount: UInt = 0u,
    public var count: UInt = 0u,
    public var totalLength: ULong = 0uL,
    public var ranges: List<PnpReplaceMemoryList0> = List(1) { PnpReplaceMemoryList0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PnpReplaceMemoryList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PnpReplaceMemoryList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PnpReplaceMemoryList =
                    PnpReplaceMemoryList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PnpReplaceMemoryList0.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PnpReplaceMemoryList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.allocatedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.totalLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PnpReplaceMemoryList0.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.ranges)
                }
            }
    }
}

public data class PnpReplaceMemoryList0(
    public var address: Long = 0L,
    public var length: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PnpReplaceMemoryList0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PnpReplaceMemoryList0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PnpReplaceMemoryList0 =
                    PnpReplaceMemoryList0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PnpReplaceMemoryList0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public class PnpReplaceParameters internal constructor(
    public var size: UInt,
    public var version: UInt,
    public var target: ULong,
    public var spare: ULong,
    targetProcessorsCtorArg: MutPtr,
    spareProcessorsCtorArg: MutPtr,
    targetMemoryCtorArg: MutPtr,
    spareMemoryCtorArg: MutPtr,
    public var mapMemory: PreplaceMapMemory,
) {
    public var targetProcessors: MutPtr = targetProcessorsCtorArg
        internal set

    public var spareProcessors: MutPtr = spareProcessorsCtorArg
        internal set

    public var targetMemory: MutPtr = targetMemoryCtorArg
        internal set

    public var spareMemory: MutPtr = spareMemoryCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        target = 0uL,
        spare = 0uL,
        targetProcessorsCtorArg = MutPtr(0L),
        spareProcessorsCtorArg = MutPtr(0L),
        targetMemoryCtorArg = MutPtr(0L),
        spareMemoryCtorArg = MutPtr(0L),
        mapMemory = null,
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.version

    public operator fun component3(): ULong = this.target

    public operator fun component4(): ULong = this.spare

    public operator fun component5(): MutPtr = this.targetProcessors

    public operator fun component6(): MutPtr = this.spareProcessors

    public operator fun component7(): MutPtr = this.targetMemory

    public operator fun component8(): MutPtr = this.spareMemory

    public operator fun component9(): PreplaceMapMemory = this.mapMemory

    public fun copy(size: UInt = this.size, version: UInt = this.version, target: ULong = this.target, spare: ULong = this.spare, targetProcessors: MutPtr = this.targetProcessors, spareProcessors: MutPtr = this.spareProcessors, targetMemory: MutPtr = this.targetMemory, spareMemory: MutPtr = this.spareMemory, mapMemory: PreplaceMapMemory = this.mapMemory): PnpReplaceParameters = PnpReplaceParameters(size = size, version = version, target = target, spare = spare, targetProcessorsCtorArg = targetProcessors, spareProcessorsCtorArg = spareProcessors, targetMemoryCtorArg = targetMemory, spareMemoryCtorArg = spareMemory, mapMemory = mapMemory)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PnpReplaceParameters) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.target != other.target) return false
        if (this.spare != other.spare) return false
        if (this.targetProcessors != other.targetProcessors) return false
        if (this.spareProcessors != other.spareProcessors) return false
        if (this.targetMemory != other.targetMemory) return false
        if (this.spareMemory != other.spareMemory) return false
        if (this.mapMemory != other.mapMemory) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.target.hashCode()
        result = 31 * result + this.spare.hashCode()
        result = 31 * result + this.targetProcessors.hashCode()
        result = 31 * result + this.spareProcessors.hashCode()
        result = 31 * result + this.targetMemory.hashCode()
        result = 31 * result + this.spareMemory.hashCode()
        result = 31 * result + this.mapMemory.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            version: UInt = 0u,
            target: ULong = 0uL,
            spare: ULong = 0uL,
            targetProcessors: MutPtr = MutPtr(0L),
            spareProcessors: MutPtr = MutPtr(0L),
            targetMemory: MutPtr = MutPtr(0L),
            spareMemory: MutPtr = MutPtr(0L),
            mapMemory: PreplaceMapMemory = null,
        ): PnpReplaceParameters =
            PnpReplaceParameters(
                size = size,
                version = version,
                target = target,
                spare = spare,
                targetProcessorsCtorArg = targetProcessors,
                spareProcessorsCtorArg = spareProcessors,
                targetMemoryCtorArg = targetMemory,
                spareMemoryCtorArg = spareMemory,
                mapMemory = mapMemory,
            )
    }
}

public class PnpReplaceProcessorList internal constructor(
    affinityCtorArg: MutPtr,
    public var groupCount: UInt,
    public var allocatedCount: UInt,
    public var count: UInt,
    public var apicIds: UIntArray,
) {
    public var affinity: MutPtr = affinityCtorArg
        internal set

    public constructor() : this(
        affinityCtorArg = MutPtr(0L),
        groupCount = 0u,
        allocatedCount = 0u,
        count = 0u,
        apicIds = UIntArray(1),
    )

    public operator fun component1(): MutPtr = this.affinity

    public operator fun component2(): UInt = this.groupCount

    public operator fun component3(): UInt = this.allocatedCount

    public operator fun component4(): UInt = this.count

    public operator fun component5(): UIntArray = this.apicIds

    public fun copy(affinity: MutPtr = this.affinity, groupCount: UInt = this.groupCount, allocatedCount: UInt = this.allocatedCount, count: UInt = this.count, apicIds: UIntArray = this.apicIds): PnpReplaceProcessorList = PnpReplaceProcessorList(affinityCtorArg = affinity, groupCount = groupCount, allocatedCount = allocatedCount, count = count, apicIds = apicIds)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PnpReplaceProcessorList) return false
        if (this.affinity != other.affinity) return false
        if (this.groupCount != other.groupCount) return false
        if (this.allocatedCount != other.allocatedCount) return false
        if (this.count != other.count) return false
        if (!this.apicIds.contentEquals(other.apicIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.affinity.hashCode()
        result = 31 * result + this.groupCount.hashCode()
        result = 31 * result + this.allocatedCount.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.apicIds.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PnpReplaceProcessorList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PnpReplaceProcessorList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PnpReplaceProcessorList =
                    PnpReplaceProcessorList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 20L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PnpReplaceProcessorList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.affinity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.groupCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.allocatedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 20L, value.apicIds.toList())
                }
            }

        public operator fun invoke(
            affinity: MutPtr = MutPtr(0L),
            groupCount: UInt = 0u,
            allocatedCount: UInt = 0u,
            count: UInt = 0u,
            apicIds: UIntArray = UIntArray(1),
        ): PnpReplaceProcessorList =
            PnpReplaceProcessorList(
                affinityCtorArg = affinity,
                groupCount = groupCount,
                allocatedCount = allocatedCount,
                count = count,
                apicIds = apicIds,
            )
    }
}

public data class PnpReplaceProcessorListV1(
    public var affinityMask: Int = 0,
    public var allocatedCount: UInt = 0u,
    public var count: UInt = 0u,
    public var apicIds: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PnpReplaceProcessorListV1) return false
        if (this.affinityMask != other.affinityMask) return false
        if (this.allocatedCount != other.allocatedCount) return false
        if (this.count != other.count) return false
        if (!this.apicIds.contentEquals(other.apicIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.affinityMask.hashCode()
        result = 31 * result + this.allocatedCount.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.apicIds.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PnpReplaceProcessorListV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PnpReplaceProcessorListV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PnpReplaceProcessorListV1 =
                    PnpReplaceProcessorListV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PnpReplaceProcessorListV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.affinityMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.allocatedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 16L, value.apicIds.toList())
                }
            }
    }
}

public data class PooledUsageAndLimits(
    public var peakPagedPoolUsage: Int = 0,
    public var pagedPoolUsage: Int = 0,
    public var pagedPoolLimit: Int = 0,
    public var peakNonPagedPoolUsage: Int = 0,
    public var nonPagedPoolUsage: Int = 0,
    public var nonPagedPoolLimit: Int = 0,
    public var peakPagefileUsage: Int = 0,
    public var pagefileUsage: Int = 0,
    public var pagefileLimit: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PooledUsageAndLimits> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PooledUsageAndLimits> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): PooledUsageAndLimits =
                    PooledUsageAndLimits(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: PooledUsageAndLimits) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.peakPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.pagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.pagedPoolLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.peakNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.nonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.nonPagedPoolLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.peakPagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.pagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.pagefileLimit)
                }
            }
    }
}

public data class PoolCreateExtendedParams(
    public var version: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoolCreateExtendedParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoolCreateExtendedParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PoolCreateExtendedParams =
                    PoolCreateExtendedParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PoolCreateExtendedParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                }
            }
    }
}

public data class PoolExtendedParameter(
    public var anonymous1: PoolExtendedParameter0 = PoolExtendedParameter0(),
    public var anonymous2: PoolExtendedParameter1 = PoolExtendedParameter1(),
)

public data class PoolExtendedParameter0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoolExtendedParameter0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoolExtendedParameter0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PoolExtendedParameter0 =
                    PoolExtendedParameter0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PoolExtendedParameter0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PoolExtendedParameter1 internal constructor(
    public var reserved2: ULong,
    reserved3CtorArg: MutPtr,
    public var priority: ExPoolPriority,
    securePoolParamsCtorArg: MutPtr,
    public var preferredNode: UInt,
) {
    public var reserved3: MutPtr = reserved3CtorArg
        internal set

    public var securePoolParams: MutPtr = securePoolParamsCtorArg
        internal set

    public constructor() : this(
        reserved2 = 0uL,
        reserved3CtorArg = MutPtr(0L),
        priority = 0,
        securePoolParamsCtorArg = MutPtr(0L),
        preferredNode = 0u,
    )

    public operator fun component1(): ULong = this.reserved2

    public operator fun component2(): MutPtr = this.reserved3

    public operator fun component3(): ExPoolPriority = this.priority

    public operator fun component4(): MutPtr = this.securePoolParams

    public operator fun component5(): UInt = this.preferredNode

    public fun copy(reserved2: ULong = this.reserved2, reserved3: MutPtr = this.reserved3, priority: ExPoolPriority = this.priority, securePoolParams: MutPtr = this.securePoolParams, preferredNode: UInt = this.preferredNode): PoolExtendedParameter1 = PoolExtendedParameter1(reserved2 = reserved2, reserved3CtorArg = reserved3, priority = priority, securePoolParamsCtorArg = securePoolParams, preferredNode = preferredNode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PoolExtendedParameter1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.priority != other.priority) return false
        if (this.securePoolParams != other.securePoolParams) return false
        if (this.preferredNode != other.preferredNode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved2.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.securePoolParams.hashCode()
        result = 31 * result + this.preferredNode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            reserved2: ULong = 0uL,
            reserved3: MutPtr = MutPtr(0L),
            priority: ExPoolPriority = 0,
            securePoolParams: MutPtr = MutPtr(0L),
            preferredNode: UInt = 0u,
        ): PoolExtendedParameter1 =
            PoolExtendedParameter1(
                reserved2 = reserved2,
                reserved3CtorArg = reserved3,
                priority = priority,
                securePoolParamsCtorArg = securePoolParams,
                preferredNode = preferredNode,
            )
    }
}

public class PoolExtendedParamsSecurePool internal constructor(
    securePoolHandleCtorArg: Handle,
    bufferCtorArg: MutPtr,
    public var cookie: Int,
    public var securePoolFlags: UInt,
) {
    public var securePoolHandle: Handle = securePoolHandleCtorArg
        internal set

    public var buffer: MutPtr = bufferCtorArg
        internal set

    public constructor() : this(
        securePoolHandleCtorArg = MutPtr(0L),
        bufferCtorArg = MutPtr(0L),
        cookie = 0,
        securePoolFlags = 0u,
    )

    public operator fun component1(): Handle = this.securePoolHandle

    public operator fun component2(): MutPtr = this.buffer

    public operator fun component3(): Int = this.cookie

    public operator fun component4(): UInt = this.securePoolFlags

    public fun copy(securePoolHandle: Handle = this.securePoolHandle, buffer: MutPtr = this.buffer, cookie: Int = this.cookie, securePoolFlags: UInt = this.securePoolFlags): PoolExtendedParamsSecurePool = PoolExtendedParamsSecurePool(securePoolHandleCtorArg = securePoolHandle, bufferCtorArg = buffer, cookie = cookie, securePoolFlags = securePoolFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PoolExtendedParamsSecurePool) return false
        if (this.securePoolHandle != other.securePoolHandle) return false
        if (this.buffer != other.buffer) return false
        if (this.cookie != other.cookie) return false
        if (this.securePoolFlags != other.securePoolFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securePoolHandle.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.cookie.hashCode()
        result = 31 * result + this.securePoolFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            securePoolHandle: Handle = MutPtr(0L),
            buffer: MutPtr = MutPtr(0L),
            cookie: Int = 0,
            securePoolFlags: UInt = 0u,
        ): PoolExtendedParamsSecurePool =
            PoolExtendedParamsSecurePool(
                securePoolHandleCtorArg = securePoolHandle,
                bufferCtorArg = buffer,
                cookie = cookie,
                securePoolFlags = securePoolFlags,
            )
    }
}

public data class PowerMonitorInvocation(
    public var console: Boolean = false,
    public var requestReason: PowerMonitorRequestReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerMonitorInvocation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerMonitorInvocation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PowerMonitorInvocation =
                    PowerMonitorInvocation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PowerMonitorInvocation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.console)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.requestReason)
                }
            }
    }
}

public data class PowerPlatformInformation(
    public var aoAc: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerPlatformInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerPlatformInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PowerPlatformInformation =
                    PowerPlatformInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PowerPlatformInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.aoAc)
                }
            }
    }
}

public data class PowerSequence(
    public var sequenceD1: UInt = 0u,
    public var sequenceD2: UInt = 0u,
    public var sequenceD3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSequence> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSequence> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PowerSequence =
                    PowerSequence(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PowerSequence) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sequenceD1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sequenceD2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sequenceD3)
                }
            }
    }
}

public data class PowerSessionConnect(
    public var connected: Boolean = false,
    public var console: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionConnect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionConnect> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PowerSessionConnect =
                    PowerSessionConnect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: PowerSessionConnect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.connected)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.console)
                }
            }
    }
}

public data class PowerSessionRitState(
    public var active: Boolean = false,
    public var lastInputTime: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionRitState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionRitState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PowerSessionRitState =
                    PowerSessionRitState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PowerSessionRitState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.active)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lastInputTime)
                }
            }
    }
}

public data class PowerSessionTimeouts(
    public var inputTimeout: UInt = 0u,
    public var displayTimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionTimeouts> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionTimeouts> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PowerSessionTimeouts =
                    PowerSessionTimeouts(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PowerSessionTimeouts) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inputTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.displayTimeout)
                }
            }
    }
}

public data class PowerSessionWinlogon(
    public var sessionId: UInt = 0u,
    public var console: Boolean = false,
    public var locked: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionWinlogon> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionWinlogon> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PowerSessionWinlogon =
                    PowerSessionWinlogon(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: PowerSessionWinlogon) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.console)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.locked)
                }
            }
    }
}

public data class PowerState(
    public var systemState: SystemPowerState = 0,
    public var deviceState: DevicePowerState = 0,
)

public data class PowerThrottlingProcessState(
    public var version: UInt = 0u,
    public var controlMask: UInt = 0u,
    public var stateMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerThrottlingProcessState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerThrottlingProcessState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PowerThrottlingProcessState =
                    PowerThrottlingProcessState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PowerThrottlingProcessState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.controlMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stateMask)
                }
            }
    }
}

public data class PowerThrottlingThreadState(
    public var version: UInt = 0u,
    public var controlMask: UInt = 0u,
    public var stateMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerThrottlingThreadState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerThrottlingThreadState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PowerThrottlingThreadState =
                    PowerThrottlingThreadState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PowerThrottlingThreadState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.controlMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stateMask)
                }
            }
    }
}

public data class PoFxComponentIdleState(
    public var transitionLatency: ULong = 0uL,
    public var residencyRequirement: ULong = 0uL,
    public var nominalPower: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoFxComponentIdleState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoFxComponentIdleState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PoFxComponentIdleState =
                    PoFxComponentIdleState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PoFxComponentIdleState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.transitionLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.residencyRequirement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nominalPower)
                }
            }
    }
}

public data class PoFxComponentPerfInfo(
    public var perfStateSetsCount: UInt = 0u,
    public var perfStateSets: List<PoFxComponentPerfSet> = List(1) { PoFxComponentPerfSet() },
)

public data class PoFxComponentPerfSet(
    public var name: UnicodeString = UnicodeString(),
    public var flags: ULong = 0uL,
    public var unit: PoFxPerfStateUnit = 0,
    public var type: PoFxPerfStateType = 0,
    public var anonymous: PoFxComponentPerfSet0 = PoFxComponentPerfSet0(),
)

public data class PoFxComponentPerfSet0(
    public var discrete: PoFxComponentPerfSet00 = PoFxComponentPerfSet00(),
    public var range: PoFxComponentPerfSet01 = PoFxComponentPerfSet01(),
)

public class PoFxComponentPerfSet00 internal constructor(
    public var count: UInt,
    statesCtorArg: MutPtr,
) {
    public var states: MutPtr = statesCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        statesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): MutPtr = this.states

    public fun copy(count: UInt = this.count, states: MutPtr = this.states): PoFxComponentPerfSet00 = PoFxComponentPerfSet00(count = count, statesCtorArg = states)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PoFxComponentPerfSet00) return false
        if (this.count != other.count) return false
        if (this.states != other.states) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.states.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoFxComponentPerfSet00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoFxComponentPerfSet00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PoFxComponentPerfSet00 =
                    PoFxComponentPerfSet00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PoFxComponentPerfSet00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.states)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            states: MutPtr = MutPtr(0L),
        ): PoFxComponentPerfSet00 =
            PoFxComponentPerfSet00(
                count = count,
                statesCtorArg = states,
            )
    }
}

public data class PoFxComponentPerfSet01(
    public var minimum: ULong = 0uL,
    public var maximum: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoFxComponentPerfSet01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoFxComponentPerfSet01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PoFxComponentPerfSet01 =
                    PoFxComponentPerfSet01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PoFxComponentPerfSet01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.minimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maximum)
                }
            }
    }
}

public class PoFxComponentV1 internal constructor(
    public var id: Guid,
    public var idleStateCount: UInt,
    public var deepestWakeableIdleState: UInt,
    idleStatesCtorArg: MutPtr,
) {
    public var idleStates: MutPtr = idleStatesCtorArg
        internal set

    public constructor() : this(
        id = Guid(),
        idleStateCount = 0u,
        deepestWakeableIdleState = 0u,
        idleStatesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.id

    public operator fun component2(): UInt = this.idleStateCount

    public operator fun component3(): UInt = this.deepestWakeableIdleState

    public operator fun component4(): MutPtr = this.idleStates

    public fun copy(id: Guid = this.id, idleStateCount: UInt = this.idleStateCount, deepestWakeableIdleState: UInt = this.deepestWakeableIdleState, idleStates: MutPtr = this.idleStates): PoFxComponentV1 = PoFxComponentV1(id = id, idleStateCount = idleStateCount, deepestWakeableIdleState = deepestWakeableIdleState, idleStatesCtorArg = idleStates)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PoFxComponentV1) return false
        if (this.id != other.id) return false
        if (this.idleStateCount != other.idleStateCount) return false
        if (this.deepestWakeableIdleState != other.deepestWakeableIdleState) return false
        if (this.idleStates != other.idleStates) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.idleStateCount.hashCode()
        result = 31 * result + this.deepestWakeableIdleState.hashCode()
        result = 31 * result + this.idleStates.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            id: Guid = Guid(),
            idleStateCount: UInt = 0u,
            deepestWakeableIdleState: UInt = 0u,
            idleStates: MutPtr = MutPtr(0L),
        ): PoFxComponentV1 =
            PoFxComponentV1(
                id = id,
                idleStateCount = idleStateCount,
                deepestWakeableIdleState = deepestWakeableIdleState,
                idleStatesCtorArg = idleStates,
            )
    }
}

public class PoFxComponentV2 internal constructor(
    public var id: Guid,
    public var flags: ULong,
    public var deepestWakeableIdleState: UInt,
    public var idleStateCount: UInt,
    idleStatesCtorArg: MutPtr,
    public var providerCount: UInt,
    providersCtorArg: MutPtr,
) {
    public var idleStates: MutPtr = idleStatesCtorArg
        internal set

    public var providers: MutPtr = providersCtorArg
        internal set

    public constructor() : this(
        id = Guid(),
        flags = 0uL,
        deepestWakeableIdleState = 0u,
        idleStateCount = 0u,
        idleStatesCtorArg = MutPtr(0L),
        providerCount = 0u,
        providersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.id

    public operator fun component2(): ULong = this.flags

    public operator fun component3(): UInt = this.deepestWakeableIdleState

    public operator fun component4(): UInt = this.idleStateCount

    public operator fun component5(): MutPtr = this.idleStates

    public operator fun component6(): UInt = this.providerCount

    public operator fun component7(): MutPtr = this.providers

    public fun copy(id: Guid = this.id, flags: ULong = this.flags, deepestWakeableIdleState: UInt = this.deepestWakeableIdleState, idleStateCount: UInt = this.idleStateCount, idleStates: MutPtr = this.idleStates, providerCount: UInt = this.providerCount, providers: MutPtr = this.providers): PoFxComponentV2 = PoFxComponentV2(id = id, flags = flags, deepestWakeableIdleState = deepestWakeableIdleState, idleStateCount = idleStateCount, idleStatesCtorArg = idleStates, providerCount = providerCount, providersCtorArg = providers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PoFxComponentV2) return false
        if (this.id != other.id) return false
        if (this.flags != other.flags) return false
        if (this.deepestWakeableIdleState != other.deepestWakeableIdleState) return false
        if (this.idleStateCount != other.idleStateCount) return false
        if (this.idleStates != other.idleStates) return false
        if (this.providerCount != other.providerCount) return false
        if (this.providers != other.providers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.deepestWakeableIdleState.hashCode()
        result = 31 * result + this.idleStateCount.hashCode()
        result = 31 * result + this.idleStates.hashCode()
        result = 31 * result + this.providerCount.hashCode()
        result = 31 * result + this.providers.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            id: Guid = Guid(),
            flags: ULong = 0uL,
            deepestWakeableIdleState: UInt = 0u,
            idleStateCount: UInt = 0u,
            idleStates: MutPtr = MutPtr(0L),
            providerCount: UInt = 0u,
            providers: MutPtr = MutPtr(0L),
        ): PoFxComponentV2 =
            PoFxComponentV2(
                id = id,
                flags = flags,
                deepestWakeableIdleState = deepestWakeableIdleState,
                idleStateCount = idleStateCount,
                idleStatesCtorArg = idleStates,
                providerCount = providerCount,
                providersCtorArg = providers,
            )
    }
}

public class PoFxDeviceV1 internal constructor(
    public var version: UInt,
    public var componentCount: UInt,
    public var componentActiveConditionCallback: PpoFxComponentActiveConditionCallback,
    public var componentIdleConditionCallback: PpoFxComponentIdleConditionCallback,
    public var componentIdleStateCallback: PpoFxComponentIdleStateCallback,
    public var devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback,
    public var devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback,
    public var powerControlCallback: PpoFxPowerControlCallback,
    deviceContextCtorArg: MutPtr,
    public var components: List<PoFxComponentV1>,
) {
    public var deviceContext: MutPtr = deviceContextCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        componentCount = 0u,
        componentActiveConditionCallback = null,
        componentIdleConditionCallback = null,
        componentIdleStateCallback = null,
        devicePowerRequiredCallback = null,
        devicePowerNotRequiredCallback = null,
        powerControlCallback = null,
        deviceContextCtorArg = MutPtr(0L),
        components = List(1) { PoFxComponentV1() },
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.componentCount

    public operator fun component3(): PpoFxComponentActiveConditionCallback = this.componentActiveConditionCallback

    public operator fun component4(): PpoFxComponentIdleConditionCallback = this.componentIdleConditionCallback

    public operator fun component5(): PpoFxComponentIdleStateCallback = this.componentIdleStateCallback

    public operator fun component6(): PpoFxDevicePowerRequiredCallback = this.devicePowerRequiredCallback

    public operator fun component7(): PpoFxDevicePowerNotRequiredCallback = this.devicePowerNotRequiredCallback

    public operator fun component8(): PpoFxPowerControlCallback = this.powerControlCallback

    public operator fun component9(): MutPtr = this.deviceContext

    public operator fun component10(): List<PoFxComponentV1> = this.components

    public fun copy(version: UInt = this.version, componentCount: UInt = this.componentCount, componentActiveConditionCallback: PpoFxComponentActiveConditionCallback = this.componentActiveConditionCallback, componentIdleConditionCallback: PpoFxComponentIdleConditionCallback = this.componentIdleConditionCallback, componentIdleStateCallback: PpoFxComponentIdleStateCallback = this.componentIdleStateCallback, devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback = this.devicePowerRequiredCallback, devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback = this.devicePowerNotRequiredCallback, powerControlCallback: PpoFxPowerControlCallback = this.powerControlCallback, deviceContext: MutPtr = this.deviceContext, components: List<PoFxComponentV1> = this.components): PoFxDeviceV1 = PoFxDeviceV1(version = version, componentCount = componentCount, componentActiveConditionCallback = componentActiveConditionCallback, componentIdleConditionCallback = componentIdleConditionCallback, componentIdleStateCallback = componentIdleStateCallback, devicePowerRequiredCallback = devicePowerRequiredCallback, devicePowerNotRequiredCallback = devicePowerNotRequiredCallback, powerControlCallback = powerControlCallback, deviceContextCtorArg = deviceContext, components = components)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PoFxDeviceV1) return false
        if (this.version != other.version) return false
        if (this.componentCount != other.componentCount) return false
        if (this.componentActiveConditionCallback != other.componentActiveConditionCallback) return false
        if (this.componentIdleConditionCallback != other.componentIdleConditionCallback) return false
        if (this.componentIdleStateCallback != other.componentIdleStateCallback) return false
        if (this.devicePowerRequiredCallback != other.devicePowerRequiredCallback) return false
        if (this.devicePowerNotRequiredCallback != other.devicePowerNotRequiredCallback) return false
        if (this.powerControlCallback != other.powerControlCallback) return false
        if (this.deviceContext != other.deviceContext) return false
        if (this.components != other.components) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.componentCount.hashCode()
        result = 31 * result + this.componentActiveConditionCallback.hashCode()
        result = 31 * result + this.componentIdleConditionCallback.hashCode()
        result = 31 * result + this.componentIdleStateCallback.hashCode()
        result = 31 * result + this.devicePowerRequiredCallback.hashCode()
        result = 31 * result + this.devicePowerNotRequiredCallback.hashCode()
        result = 31 * result + this.powerControlCallback.hashCode()
        result = 31 * result + this.deviceContext.hashCode()
        result = 31 * result + this.components.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            componentCount: UInt = 0u,
            componentActiveConditionCallback: PpoFxComponentActiveConditionCallback = null,
            componentIdleConditionCallback: PpoFxComponentIdleConditionCallback = null,
            componentIdleStateCallback: PpoFxComponentIdleStateCallback = null,
            devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback = null,
            devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback = null,
            powerControlCallback: PpoFxPowerControlCallback = null,
            deviceContext: MutPtr = MutPtr(0L),
            components: List<PoFxComponentV1> = List(1) { PoFxComponentV1() },
        ): PoFxDeviceV1 =
            PoFxDeviceV1(
                version = version,
                componentCount = componentCount,
                componentActiveConditionCallback = componentActiveConditionCallback,
                componentIdleConditionCallback = componentIdleConditionCallback,
                componentIdleStateCallback = componentIdleStateCallback,
                devicePowerRequiredCallback = devicePowerRequiredCallback,
                devicePowerNotRequiredCallback = devicePowerNotRequiredCallback,
                powerControlCallback = powerControlCallback,
                deviceContextCtorArg = deviceContext,
                components = components,
            )
    }
}

public class PoFxDeviceV2 internal constructor(
    public var version: UInt,
    public var flags: ULong,
    public var componentActiveConditionCallback: PpoFxComponentActiveConditionCallback,
    public var componentIdleConditionCallback: PpoFxComponentIdleConditionCallback,
    public var componentIdleStateCallback: PpoFxComponentIdleStateCallback,
    public var devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback,
    public var devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback,
    public var powerControlCallback: PpoFxPowerControlCallback,
    deviceContextCtorArg: MutPtr,
    public var componentCount: UInt,
    public var components: List<PoFxComponentV2>,
) {
    public var deviceContext: MutPtr = deviceContextCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0uL,
        componentActiveConditionCallback = null,
        componentIdleConditionCallback = null,
        componentIdleStateCallback = null,
        devicePowerRequiredCallback = null,
        devicePowerNotRequiredCallback = null,
        powerControlCallback = null,
        deviceContextCtorArg = MutPtr(0L),
        componentCount = 0u,
        components = List(1) { PoFxComponentV2() },
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): ULong = this.flags

    public operator fun component3(): PpoFxComponentActiveConditionCallback = this.componentActiveConditionCallback

    public operator fun component4(): PpoFxComponentIdleConditionCallback = this.componentIdleConditionCallback

    public operator fun component5(): PpoFxComponentIdleStateCallback = this.componentIdleStateCallback

    public operator fun component6(): PpoFxDevicePowerRequiredCallback = this.devicePowerRequiredCallback

    public operator fun component7(): PpoFxDevicePowerNotRequiredCallback = this.devicePowerNotRequiredCallback

    public operator fun component8(): PpoFxPowerControlCallback = this.powerControlCallback

    public operator fun component9(): MutPtr = this.deviceContext

    public operator fun component10(): UInt = this.componentCount

    public operator fun component11(): List<PoFxComponentV2> = this.components

    public fun copy(version: UInt = this.version, flags: ULong = this.flags, componentActiveConditionCallback: PpoFxComponentActiveConditionCallback = this.componentActiveConditionCallback, componentIdleConditionCallback: PpoFxComponentIdleConditionCallback = this.componentIdleConditionCallback, componentIdleStateCallback: PpoFxComponentIdleStateCallback = this.componentIdleStateCallback, devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback = this.devicePowerRequiredCallback, devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback = this.devicePowerNotRequiredCallback, powerControlCallback: PpoFxPowerControlCallback = this.powerControlCallback, deviceContext: MutPtr = this.deviceContext, componentCount: UInt = this.componentCount, components: List<PoFxComponentV2> = this.components): PoFxDeviceV2 = PoFxDeviceV2(version = version, flags = flags, componentActiveConditionCallback = componentActiveConditionCallback, componentIdleConditionCallback = componentIdleConditionCallback, componentIdleStateCallback = componentIdleStateCallback, devicePowerRequiredCallback = devicePowerRequiredCallback, devicePowerNotRequiredCallback = devicePowerNotRequiredCallback, powerControlCallback = powerControlCallback, deviceContextCtorArg = deviceContext, componentCount = componentCount, components = components)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PoFxDeviceV2) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.componentActiveConditionCallback != other.componentActiveConditionCallback) return false
        if (this.componentIdleConditionCallback != other.componentIdleConditionCallback) return false
        if (this.componentIdleStateCallback != other.componentIdleStateCallback) return false
        if (this.devicePowerRequiredCallback != other.devicePowerRequiredCallback) return false
        if (this.devicePowerNotRequiredCallback != other.devicePowerNotRequiredCallback) return false
        if (this.powerControlCallback != other.powerControlCallback) return false
        if (this.deviceContext != other.deviceContext) return false
        if (this.componentCount != other.componentCount) return false
        if (this.components != other.components) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.componentActiveConditionCallback.hashCode()
        result = 31 * result + this.componentIdleConditionCallback.hashCode()
        result = 31 * result + this.componentIdleStateCallback.hashCode()
        result = 31 * result + this.devicePowerRequiredCallback.hashCode()
        result = 31 * result + this.devicePowerNotRequiredCallback.hashCode()
        result = 31 * result + this.powerControlCallback.hashCode()
        result = 31 * result + this.deviceContext.hashCode()
        result = 31 * result + this.componentCount.hashCode()
        result = 31 * result + this.components.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: ULong = 0uL,
            componentActiveConditionCallback: PpoFxComponentActiveConditionCallback = null,
            componentIdleConditionCallback: PpoFxComponentIdleConditionCallback = null,
            componentIdleStateCallback: PpoFxComponentIdleStateCallback = null,
            devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback = null,
            devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback = null,
            powerControlCallback: PpoFxPowerControlCallback = null,
            deviceContext: MutPtr = MutPtr(0L),
            componentCount: UInt = 0u,
            components: List<PoFxComponentV2> = List(1) { PoFxComponentV2() },
        ): PoFxDeviceV2 =
            PoFxDeviceV2(
                version = version,
                flags = flags,
                componentActiveConditionCallback = componentActiveConditionCallback,
                componentIdleConditionCallback = componentIdleConditionCallback,
                componentIdleStateCallback = componentIdleStateCallback,
                devicePowerRequiredCallback = devicePowerRequiredCallback,
                devicePowerNotRequiredCallback = devicePowerNotRequiredCallback,
                powerControlCallback = powerControlCallback,
                deviceContextCtorArg = deviceContext,
                componentCount = componentCount,
                components = components,
            )
    }
}

public class PoFxDeviceV3 internal constructor(
    public var version: UInt,
    public var flags: ULong,
    public var componentActiveConditionCallback: PpoFxComponentActiveConditionCallback,
    public var componentIdleConditionCallback: PpoFxComponentIdleConditionCallback,
    public var componentIdleStateCallback: PpoFxComponentIdleStateCallback,
    public var devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback,
    public var devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback,
    public var powerControlCallback: PpoFxPowerControlCallback,
    public var directedPowerUpCallback: PpoFxDirectedPowerUpCallback,
    public var directedPowerDownCallback: PpoFxDirectedPowerDownCallback,
    public var directedFxTimeoutInSeconds: UInt,
    deviceContextCtorArg: MutPtr,
    public var componentCount: UInt,
    public var components: List<PoFxComponentV2>,
) {
    public var deviceContext: MutPtr = deviceContextCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0uL,
        componentActiveConditionCallback = null,
        componentIdleConditionCallback = null,
        componentIdleStateCallback = null,
        devicePowerRequiredCallback = null,
        devicePowerNotRequiredCallback = null,
        powerControlCallback = null,
        directedPowerUpCallback = null,
        directedPowerDownCallback = null,
        directedFxTimeoutInSeconds = 0u,
        deviceContextCtorArg = MutPtr(0L),
        componentCount = 0u,
        components = List(1) { PoFxComponentV2() },
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): ULong = this.flags

    public operator fun component3(): PpoFxComponentActiveConditionCallback = this.componentActiveConditionCallback

    public operator fun component4(): PpoFxComponentIdleConditionCallback = this.componentIdleConditionCallback

    public operator fun component5(): PpoFxComponentIdleStateCallback = this.componentIdleStateCallback

    public operator fun component6(): PpoFxDevicePowerRequiredCallback = this.devicePowerRequiredCallback

    public operator fun component7(): PpoFxDevicePowerNotRequiredCallback = this.devicePowerNotRequiredCallback

    public operator fun component8(): PpoFxPowerControlCallback = this.powerControlCallback

    public operator fun component9(): PpoFxDirectedPowerUpCallback = this.directedPowerUpCallback

    public operator fun component10(): PpoFxDirectedPowerDownCallback = this.directedPowerDownCallback

    public operator fun component11(): UInt = this.directedFxTimeoutInSeconds

    public operator fun component12(): MutPtr = this.deviceContext

    public operator fun component13(): UInt = this.componentCount

    public operator fun component14(): List<PoFxComponentV2> = this.components

    public fun copy(version: UInt = this.version, flags: ULong = this.flags, componentActiveConditionCallback: PpoFxComponentActiveConditionCallback = this.componentActiveConditionCallback, componentIdleConditionCallback: PpoFxComponentIdleConditionCallback = this.componentIdleConditionCallback, componentIdleStateCallback: PpoFxComponentIdleStateCallback = this.componentIdleStateCallback, devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback = this.devicePowerRequiredCallback, devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback = this.devicePowerNotRequiredCallback, powerControlCallback: PpoFxPowerControlCallback = this.powerControlCallback, directedPowerUpCallback: PpoFxDirectedPowerUpCallback = this.directedPowerUpCallback, directedPowerDownCallback: PpoFxDirectedPowerDownCallback = this.directedPowerDownCallback, directedFxTimeoutInSeconds: UInt = this.directedFxTimeoutInSeconds, deviceContext: MutPtr = this.deviceContext, componentCount: UInt = this.componentCount, components: List<PoFxComponentV2> = this.components): PoFxDeviceV3 = PoFxDeviceV3(version = version, flags = flags, componentActiveConditionCallback = componentActiveConditionCallback, componentIdleConditionCallback = componentIdleConditionCallback, componentIdleStateCallback = componentIdleStateCallback, devicePowerRequiredCallback = devicePowerRequiredCallback, devicePowerNotRequiredCallback = devicePowerNotRequiredCallback, powerControlCallback = powerControlCallback, directedPowerUpCallback = directedPowerUpCallback, directedPowerDownCallback = directedPowerDownCallback, directedFxTimeoutInSeconds = directedFxTimeoutInSeconds, deviceContextCtorArg = deviceContext, componentCount = componentCount, components = components)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PoFxDeviceV3) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.componentActiveConditionCallback != other.componentActiveConditionCallback) return false
        if (this.componentIdleConditionCallback != other.componentIdleConditionCallback) return false
        if (this.componentIdleStateCallback != other.componentIdleStateCallback) return false
        if (this.devicePowerRequiredCallback != other.devicePowerRequiredCallback) return false
        if (this.devicePowerNotRequiredCallback != other.devicePowerNotRequiredCallback) return false
        if (this.powerControlCallback != other.powerControlCallback) return false
        if (this.directedPowerUpCallback != other.directedPowerUpCallback) return false
        if (this.directedPowerDownCallback != other.directedPowerDownCallback) return false
        if (this.directedFxTimeoutInSeconds != other.directedFxTimeoutInSeconds) return false
        if (this.deviceContext != other.deviceContext) return false
        if (this.componentCount != other.componentCount) return false
        if (this.components != other.components) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.componentActiveConditionCallback.hashCode()
        result = 31 * result + this.componentIdleConditionCallback.hashCode()
        result = 31 * result + this.componentIdleStateCallback.hashCode()
        result = 31 * result + this.devicePowerRequiredCallback.hashCode()
        result = 31 * result + this.devicePowerNotRequiredCallback.hashCode()
        result = 31 * result + this.powerControlCallback.hashCode()
        result = 31 * result + this.directedPowerUpCallback.hashCode()
        result = 31 * result + this.directedPowerDownCallback.hashCode()
        result = 31 * result + this.directedFxTimeoutInSeconds.hashCode()
        result = 31 * result + this.deviceContext.hashCode()
        result = 31 * result + this.componentCount.hashCode()
        result = 31 * result + this.components.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: ULong = 0uL,
            componentActiveConditionCallback: PpoFxComponentActiveConditionCallback = null,
            componentIdleConditionCallback: PpoFxComponentIdleConditionCallback = null,
            componentIdleStateCallback: PpoFxComponentIdleStateCallback = null,
            devicePowerRequiredCallback: PpoFxDevicePowerRequiredCallback = null,
            devicePowerNotRequiredCallback: PpoFxDevicePowerNotRequiredCallback = null,
            powerControlCallback: PpoFxPowerControlCallback = null,
            directedPowerUpCallback: PpoFxDirectedPowerUpCallback = null,
            directedPowerDownCallback: PpoFxDirectedPowerDownCallback = null,
            directedFxTimeoutInSeconds: UInt = 0u,
            deviceContext: MutPtr = MutPtr(0L),
            componentCount: UInt = 0u,
            components: List<PoFxComponentV2> = List(1) { PoFxComponentV2() },
        ): PoFxDeviceV3 =
            PoFxDeviceV3(
                version = version,
                flags = flags,
                componentActiveConditionCallback = componentActiveConditionCallback,
                componentIdleConditionCallback = componentIdleConditionCallback,
                componentIdleStateCallback = componentIdleStateCallback,
                devicePowerRequiredCallback = devicePowerRequiredCallback,
                devicePowerNotRequiredCallback = devicePowerNotRequiredCallback,
                powerControlCallback = powerControlCallback,
                directedPowerUpCallback = directedPowerUpCallback,
                directedPowerDownCallback = directedPowerDownCallback,
                directedFxTimeoutInSeconds = directedFxTimeoutInSeconds,
                deviceContextCtorArg = deviceContext,
                componentCount = componentCount,
                components = components,
            )
    }
}

public class PoFxPerfState internal constructor(
    public var value: ULong,
    contextCtorArg: MutPtr,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        value = 0uL,
        contextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.value

    public operator fun component2(): MutPtr = this.context

    public fun copy(value: ULong = this.value, context: MutPtr = this.context): PoFxPerfState = PoFxPerfState(value = value, contextCtorArg = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PoFxPerfState) return false
        if (this.value != other.value) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoFxPerfState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PoFxPerfState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PoFxPerfState =
                    PoFxPerfState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PoFxPerfState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.value)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.context)
                }
            }

        public operator fun invoke(
            value: ULong = 0uL,
            context: MutPtr = MutPtr(0L),
        ): PoFxPerfState =
            PoFxPerfState(
                value = value,
                contextCtorArg = context,
            )
    }
}

public data class PoFxPerfStateChange(
    public var set: UInt = 0u,
    public var anonymous: PoFxPerfStateChange0 = PoFxPerfStateChange0(),
)

public data class PoFxPerfStateChange0(
    public var stateIndex: UInt = 0u,
    public var stateValue: ULong = 0uL,
)

public class ProcessAccessToken internal constructor(
    tokenCtorArg: Handle,
    threadCtorArg: Handle,
) {
    public var token: Handle = tokenCtorArg
        internal set

    public var thread: Handle = threadCtorArg
        internal set

    public constructor() : this(
        tokenCtorArg = MutPtr(0L),
        threadCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.token

    public operator fun component2(): Handle = this.thread

    public fun copy(token: Handle = this.token, thread: Handle = this.thread): ProcessAccessToken = ProcessAccessToken(tokenCtorArg = token, threadCtorArg = thread)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessAccessToken) return false
        if (this.token != other.token) return false
        if (this.thread != other.thread) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.token.hashCode()
        result = 31 * result + this.thread.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            token: Handle = MutPtr(0L),
            thread: Handle = MutPtr(0L),
        ): ProcessAccessToken =
            ProcessAccessToken(
                tokenCtorArg = token,
                threadCtorArg = thread,
            )
    }
}

public data class ProcessDevicemapInformation(
    public var anonymous: ProcessDevicemapInformation0 = ProcessDevicemapInformation0(),
)

public data class ProcessDevicemapInformation0(
    public var set: ProcessDevicemapInformation00 = ProcessDevicemapInformation00(),
    public var query: ProcessDevicemapInformation01 = ProcessDevicemapInformation01(),
)

public data class ProcessDevicemapInformation01(
    public var driveMap: UInt = 0u,
    public var driveType: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessDevicemapInformation01) return false
        if (this.driveMap != other.driveMap) return false
        if (!this.driveType.contentEquals(other.driveType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.driveMap.hashCode()
        result = 31 * result + this.driveType.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDevicemapInformation01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDevicemapInformation01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): ProcessDevicemapInformation01 =
                    ProcessDevicemapInformation01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ProcessDevicemapInformation01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.driveMap)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 4L, value.driveType.toList())
                }
            }
    }
}

public class ProcessDevicemapInformation00 internal constructor(
    directoryHandleCtorArg: Handle,
) {
    public var directoryHandle: Handle = directoryHandleCtorArg
        internal set

    public constructor() : this(
        directoryHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.directoryHandle

    public fun copy(directoryHandle: Handle = this.directoryHandle): ProcessDevicemapInformation00 = ProcessDevicemapInformation00(directoryHandleCtorArg = directoryHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessDevicemapInformation00) return false
        if (this.directoryHandle != other.directoryHandle) return false
        return true
    }

    override fun hashCode(): Int = this.directoryHandle.hashCode()

    public companion object {
        public operator fun invoke(
            directoryHandle: Handle = MutPtr(0L),
        ): ProcessDevicemapInformation00 =
            ProcessDevicemapInformation00(
                directoryHandleCtorArg = directoryHandle,
            )
    }
}

public data class ProcessDevicemapInformationEx(
    public var anonymous: ProcessDevicemapInformationEx0 = ProcessDevicemapInformationEx0(),
    public var flags: UInt = 0u,
)

public data class ProcessDevicemapInformationEx0(
    public var set: ProcessDevicemapInformationEx00 = ProcessDevicemapInformationEx00(),
    public var query: ProcessDevicemapInformationEx01 = ProcessDevicemapInformationEx01(),
)

public data class ProcessDevicemapInformationEx01(
    public var driveMap: UInt = 0u,
    public var driveType: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessDevicemapInformationEx01) return false
        if (this.driveMap != other.driveMap) return false
        if (!this.driveType.contentEquals(other.driveType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.driveMap.hashCode()
        result = 31 * result + this.driveType.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDevicemapInformationEx01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessDevicemapInformationEx01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): ProcessDevicemapInformationEx01 =
                    ProcessDevicemapInformationEx01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ProcessDevicemapInformationEx01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.driveMap)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 4L, value.driveType.toList())
                }
            }
    }
}

public class ProcessDevicemapInformationEx00 internal constructor(
    directoryHandleCtorArg: Handle,
) {
    public var directoryHandle: Handle = directoryHandleCtorArg
        internal set

    public constructor() : this(
        directoryHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.directoryHandle

    public fun copy(directoryHandle: Handle = this.directoryHandle): ProcessDevicemapInformationEx00 = ProcessDevicemapInformationEx00(directoryHandleCtorArg = directoryHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessDevicemapInformationEx00) return false
        if (this.directoryHandle != other.directoryHandle) return false
        return true
    }

    override fun hashCode(): Int = this.directoryHandle.hashCode()

    public companion object {
        public operator fun invoke(
            directoryHandle: Handle = MutPtr(0L),
        ): ProcessDevicemapInformationEx00 =
            ProcessDevicemapInformationEx00(
                directoryHandleCtorArg = directoryHandle,
            )
    }
}

public class ProcessExceptionPort internal constructor(
    exceptionPortHandleCtorArg: Handle,
    public var stateFlags: UInt,
) {
    public var exceptionPortHandle: Handle = exceptionPortHandleCtorArg
        internal set

    public constructor() : this(
        exceptionPortHandleCtorArg = MutPtr(0L),
        stateFlags = 0u,
    )

    public operator fun component1(): Handle = this.exceptionPortHandle

    public operator fun component2(): UInt = this.stateFlags

    public fun copy(exceptionPortHandle: Handle = this.exceptionPortHandle, stateFlags: UInt = this.stateFlags): ProcessExceptionPort = ProcessExceptionPort(exceptionPortHandleCtorArg = exceptionPortHandle, stateFlags = stateFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessExceptionPort) return false
        if (this.exceptionPortHandle != other.exceptionPortHandle) return false
        if (this.stateFlags != other.stateFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionPortHandle.hashCode()
        result = 31 * result + this.stateFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            exceptionPortHandle: Handle = MutPtr(0L),
            stateFlags: UInt = 0u,
        ): ProcessExceptionPort =
            ProcessExceptionPort(
                exceptionPortHandleCtorArg = exceptionPortHandle,
                stateFlags = stateFlags,
            )
    }
}

public data class ProcessExtendedBasicInformation(
    public var size: Int = 0,
    public var basicInfo: ProcessBasicInformation = ProcessBasicInformation(),
    public var anonymous: ProcessExtendedBasicInformation0 = ProcessExtendedBasicInformation0(),
)

public data class ProcessExtendedBasicInformation0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessExtendedBasicInformation00 = ProcessExtendedBasicInformation00(),
)

public data class ProcessExtendedBasicInformation00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessExtendedBasicInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessExtendedBasicInformation00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessExtendedBasicInformation00 =
                    ProcessExtendedBasicInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessExtendedBasicInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessHandleTracingEnable(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessHandleTracingEnable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessHandleTracingEnable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessHandleTracingEnable =
                    ProcessHandleTracingEnable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessHandleTracingEnable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class ProcessHandleTracingEnableEx(
    public var flags: UInt = 0u,
    public var totalSlots: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessHandleTracingEnableEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessHandleTracingEnableEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ProcessHandleTracingEnableEx =
                    ProcessHandleTracingEnableEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ProcessHandleTracingEnableEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalSlots)
                }
            }
    }
}

public class ProcessHandleTracingEntry internal constructor(
    handleCtorArg: Handle,
    public var clientId: ClientId,
    public var type: UInt,
    stacksCtorArg: List<MutPtr>,
) {
    public var handle: Handle = handleCtorArg
        internal set

    public var stacks: List<MutPtr> = stacksCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
        clientId = ClientId(),
        type = 0u,
        stacksCtorArg = List(16) { MutPtr(0L) },
    )

    public operator fun component1(): Handle = this.handle

    public operator fun component2(): ClientId = this.clientId

    public operator fun component3(): UInt = this.type

    public operator fun component4(): List<MutPtr> = this.stacks

    public fun copy(handle: Handle = this.handle, clientId: ClientId = this.clientId, type: UInt = this.type, stacks: List<MutPtr> = this.stacks): ProcessHandleTracingEntry = ProcessHandleTracingEntry(handleCtorArg = handle, clientId = clientId, type = type, stacksCtorArg = stacks)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessHandleTracingEntry) return false
        if (this.handle != other.handle) return false
        if (this.clientId != other.clientId) return false
        if (this.type != other.type) return false
        if (this.stacks != other.stacks) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.handle.hashCode()
        result = 31 * result + this.clientId.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.stacks.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            handle: Handle = MutPtr(0L),
            clientId: ClientId = ClientId(),
            type: UInt = 0u,
            stacks: List<MutPtr> = List(16) { MutPtr(0L) },
        ): ProcessHandleTracingEntry =
            ProcessHandleTracingEntry(
                handleCtorArg = handle,
                clientId = clientId,
                type = type,
                stacksCtorArg = stacks,
            )
    }
}

public class ProcessHandleTracingQuery internal constructor(
    handleCtorArg: Handle,
    public var totalTraces: UInt,
    public var handleTrace: List<ProcessHandleTracingEntry>,
) {
    public var handle: Handle = handleCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
        totalTraces = 0u,
        handleTrace = List(1) { ProcessHandleTracingEntry() },
    )

    public operator fun component1(): Handle = this.handle

    public operator fun component2(): UInt = this.totalTraces

    public operator fun component3(): List<ProcessHandleTracingEntry> = this.handleTrace

    public fun copy(handle: Handle = this.handle, totalTraces: UInt = this.totalTraces, handleTrace: List<ProcessHandleTracingEntry> = this.handleTrace): ProcessHandleTracingQuery = ProcessHandleTracingQuery(handleCtorArg = handle, totalTraces = totalTraces, handleTrace = handleTrace)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessHandleTracingQuery) return false
        if (this.handle != other.handle) return false
        if (this.totalTraces != other.totalTraces) return false
        if (this.handleTrace != other.handleTrace) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.handle.hashCode()
        result = 31 * result + this.totalTraces.hashCode()
        result = 31 * result + this.handleTrace.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            handle: Handle = MutPtr(0L),
            totalTraces: UInt = 0u,
            handleTrace: List<ProcessHandleTracingEntry> = List(1) { ProcessHandleTracingEntry() },
        ): ProcessHandleTracingQuery =
            ProcessHandleTracingQuery(
                handleCtorArg = handle,
                totalTraces = totalTraces,
                handleTrace = handleTrace,
            )
    }
}

public data class ProcessKeepaliveCountInformation(
    public var wakeCount: UInt = 0u,
    public var noWakeCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessKeepaliveCountInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessKeepaliveCountInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ProcessKeepaliveCountInformation =
                    ProcessKeepaliveCountInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ProcessKeepaliveCountInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wakeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.noWakeCount)
                }
            }
    }
}

public data class ProcessMembershipInformation(
    public var serverSiloId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMembershipInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMembershipInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMembershipInformation =
                    ProcessMembershipInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMembershipInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.serverSiloId)
                }
            }
    }
}

public data class ProcessRevokeFileHandlesInformation(
    public var targetDevicePath: UnicodeString = UnicodeString(),
)

public data class ProcessSessionInformation(
    public var sessionId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessSessionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessSessionInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessSessionInformation =
                    ProcessSessionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessSessionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionId)
                }
            }
    }
}

public data class ProcessSyscallProviderInformation(
    public var providerId: Guid = Guid(),
    public var level: UByte = 0u,
)

public class ProcessWsWatchInformation internal constructor(
    faultingPcCtorArg: MutPtr,
    faultingVaCtorArg: MutPtr,
) {
    public var faultingPc: MutPtr = faultingPcCtorArg
        internal set

    public var faultingVa: MutPtr = faultingVaCtorArg
        internal set

    public constructor() : this(
        faultingPcCtorArg = MutPtr(0L),
        faultingVaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.faultingPc

    public operator fun component2(): MutPtr = this.faultingVa

    public fun copy(faultingPc: MutPtr = this.faultingPc, faultingVa: MutPtr = this.faultingVa): ProcessWsWatchInformation = ProcessWsWatchInformation(faultingPcCtorArg = faultingPc, faultingVaCtorArg = faultingVa)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessWsWatchInformation) return false
        if (this.faultingPc != other.faultingPc) return false
        if (this.faultingVa != other.faultingVa) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.faultingPc.hashCode()
        result = 31 * result + this.faultingVa.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessWsWatchInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessWsWatchInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ProcessWsWatchInformation =
                    ProcessWsWatchInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ProcessWsWatchInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.faultingPc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.faultingVa)
                }
            }

        public operator fun invoke(
            faultingPc: MutPtr = MutPtr(0L),
            faultingVa: MutPtr = MutPtr(0L),
        ): ProcessWsWatchInformation =
            ProcessWsWatchInformation(
                faultingPcCtorArg = faultingPc,
                faultingVaCtorArg = faultingVa,
            )
    }
}

public class PsCreateNotifyInfo internal constructor(
    public var size: Int,
    public var anonymous: PsCreateNotifyInfo0,
    parentProcessIdCtorArg: Handle,
    public var creatingThreadId: ClientId,
    fileObjectCtorArg: MutPtr,
    imageFileNameCtorArg: MutPtr,
    commandLineCtorArg: MutPtr,
    public var creationStatus: Ntstatus,
) {
    public var parentProcessId: Handle = parentProcessIdCtorArg
        internal set

    public var fileObject: MutPtr = fileObjectCtorArg
        internal set

    public var imageFileName: MutPtr = imageFileNameCtorArg
        internal set

    public var commandLine: MutPtr = commandLineCtorArg
        internal set

    public constructor() : this(
        size = 0,
        anonymous = PsCreateNotifyInfo0(),
        parentProcessIdCtorArg = MutPtr(0L),
        creatingThreadId = ClientId(),
        fileObjectCtorArg = MutPtr(0L),
        imageFileNameCtorArg = MutPtr(0L),
        commandLineCtorArg = MutPtr(0L),
        creationStatus = 0,
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): PsCreateNotifyInfo0 = this.anonymous

    public operator fun component3(): Handle = this.parentProcessId

    public operator fun component4(): ClientId = this.creatingThreadId

    public operator fun component5(): MutPtr = this.fileObject

    public operator fun component6(): MutPtr = this.imageFileName

    public operator fun component7(): MutPtr = this.commandLine

    public operator fun component8(): Ntstatus = this.creationStatus

    public fun copy(size: Int = this.size, anonymous: PsCreateNotifyInfo0 = this.anonymous, parentProcessId: Handle = this.parentProcessId, creatingThreadId: ClientId = this.creatingThreadId, fileObject: MutPtr = this.fileObject, imageFileName: MutPtr = this.imageFileName, commandLine: MutPtr = this.commandLine, creationStatus: Ntstatus = this.creationStatus): PsCreateNotifyInfo = PsCreateNotifyInfo(size = size, anonymous = anonymous, parentProcessIdCtorArg = parentProcessId, creatingThreadId = creatingThreadId, fileObjectCtorArg = fileObject, imageFileNameCtorArg = imageFileName, commandLineCtorArg = commandLine, creationStatus = creationStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PsCreateNotifyInfo) return false
        if (this.size != other.size) return false
        if (this.anonymous != other.anonymous) return false
        if (this.parentProcessId != other.parentProcessId) return false
        if (this.creatingThreadId != other.creatingThreadId) return false
        if (this.fileObject != other.fileObject) return false
        if (this.imageFileName != other.imageFileName) return false
        if (this.commandLine != other.commandLine) return false
        if (this.creationStatus != other.creationStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.parentProcessId.hashCode()
        result = 31 * result + this.creatingThreadId.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        result = 31 * result + this.imageFileName.hashCode()
        result = 31 * result + this.commandLine.hashCode()
        result = 31 * result + this.creationStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            anonymous: PsCreateNotifyInfo0 = PsCreateNotifyInfo0(),
            parentProcessId: Handle = MutPtr(0L),
            creatingThreadId: ClientId = ClientId(),
            fileObject: MutPtr = MutPtr(0L),
            imageFileName: MutPtr = MutPtr(0L),
            commandLine: MutPtr = MutPtr(0L),
            creationStatus: Ntstatus = 0,
        ): PsCreateNotifyInfo =
            PsCreateNotifyInfo(
                size = size,
                anonymous = anonymous,
                parentProcessIdCtorArg = parentProcessId,
                creatingThreadId = creatingThreadId,
                fileObjectCtorArg = fileObject,
                imageFileNameCtorArg = imageFileName,
                commandLineCtorArg = commandLine,
                creationStatus = creationStatus,
            )
    }
}

public data class PsCreateNotifyInfo0(
    public var flags: UInt = 0u,
    public var anonymous: PsCreateNotifyInfo00 = PsCreateNotifyInfo00(),
)

public data class PsCreateNotifyInfo00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsCreateNotifyInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsCreateNotifyInfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PsCreateNotifyInfo00 =
                    PsCreateNotifyInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PsCreateNotifyInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PtmControlInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var queryGranularity: PptmDeviceQueryGranularity,
    public var queryTimeSource: PptmDeviceQueryTimeSource,
    public var enable: PptmDeviceEnable,
    public var disable: PptmDeviceDisable,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        queryGranularity = null,
        queryTimeSource = null,
        enable = null,
        disable = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PptmDeviceQueryGranularity = this.queryGranularity

    public operator fun component7(): PptmDeviceQueryTimeSource = this.queryTimeSource

    public operator fun component8(): PptmDeviceEnable = this.enable

    public operator fun component9(): PptmDeviceDisable = this.disable

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, queryGranularity: PptmDeviceQueryGranularity = this.queryGranularity, queryTimeSource: PptmDeviceQueryTimeSource = this.queryTimeSource, enable: PptmDeviceEnable = this.enable, disable: PptmDeviceDisable = this.disable): PtmControlInterface = PtmControlInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, queryGranularity = queryGranularity, queryTimeSource = queryTimeSource, enable = enable, disable = disable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtmControlInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.queryGranularity != other.queryGranularity) return false
        if (this.queryTimeSource != other.queryTimeSource) return false
        if (this.enable != other.enable) return false
        if (this.disable != other.disable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.queryGranularity.hashCode()
        result = 31 * result + this.queryTimeSource.hashCode()
        result = 31 * result + this.enable.hashCode()
        result = 31 * result + this.disable.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            queryGranularity: PptmDeviceQueryGranularity = null,
            queryTimeSource: PptmDeviceQueryTimeSource = null,
            enable: PptmDeviceEnable = null,
            disable: PptmDeviceDisable = null,
        ): PtmControlInterface =
            PtmControlInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                queryGranularity = queryGranularity,
                queryTimeSource = queryTimeSource,
                enable = enable,
                disable = disable,
            )
    }
}

public class ReenumerateSelfInterfaceStandard internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var surpriseRemoveAndReenumerateSelf: PreenumerateSelf,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        surpriseRemoveAndReenumerateSelf = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PreenumerateSelf = this.surpriseRemoveAndReenumerateSelf

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, surpriseRemoveAndReenumerateSelf: PreenumerateSelf = this.surpriseRemoveAndReenumerateSelf): ReenumerateSelfInterfaceStandard = ReenumerateSelfInterfaceStandard(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, surpriseRemoveAndReenumerateSelf = surpriseRemoveAndReenumerateSelf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReenumerateSelfInterfaceStandard) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.surpriseRemoveAndReenumerateSelf != other.surpriseRemoveAndReenumerateSelf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.surpriseRemoveAndReenumerateSelf.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            surpriseRemoveAndReenumerateSelf: PreenumerateSelf = null,
        ): ReenumerateSelfInterfaceStandard =
            ReenumerateSelfInterfaceStandard(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                surpriseRemoveAndReenumerateSelf = surpriseRemoveAndReenumerateSelf,
            )
    }
}

public class RegCallbackContextCleanupInformation internal constructor(
    objCtorArg: MutPtr,
    objectContextCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var objectContext: MutPtr = objectContextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.obj

    public operator fun component2(): MutPtr = this.objectContext

    public operator fun component3(): MutPtr = this.reserved

    public fun copy(obj: MutPtr = this.obj, objectContext: MutPtr = this.objectContext, reserved: MutPtr = this.reserved): RegCallbackContextCleanupInformation = RegCallbackContextCleanupInformation(objCtorArg = obj, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegCallbackContextCleanupInformation) return false
        if (this.obj != other.obj) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegCallbackContextCleanupInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegCallbackContextCleanupInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RegCallbackContextCleanupInformation =
                    RegCallbackContextCleanupInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RegCallbackContextCleanupInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr = MutPtr(0L),
            objectContext: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegCallbackContextCleanupInformation =
            RegCallbackContextCleanupInformation(
                objCtorArg = obj,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegCreateKeyInformation internal constructor(
    completeNameCtorArg: MutPtr,
    rootObjectCtorArg: MutPtr,
    objectTypeCtorArg: MutPtr,
    public var createOptions: UInt,
    clsCtorArg: MutPtr,
    securityDescriptorCtorArg: MutPtr,
    securityQualityOfServiceCtorArg: MutPtr,
    public var desiredAccess: UInt,
    public var grantedAccess: UInt,
    dispositionCtorArg: MutPtr,
    resultObjectCtorArg: MutPtr,
    callContextCtorArg: MutPtr,
    rootObjectContextCtorArg: MutPtr,
    transactionCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var completeName: MutPtr = completeNameCtorArg
        internal set

    public var rootObject: MutPtr = rootObjectCtorArg
        internal set

    public var objectType: MutPtr = objectTypeCtorArg
        internal set

    public var cls: MutPtr = clsCtorArg
        internal set

    public var securityDescriptor: MutPtr = securityDescriptorCtorArg
        internal set

    public var securityQualityOfService: MutPtr = securityQualityOfServiceCtorArg
        internal set

    public var disposition: MutPtr = dispositionCtorArg
        internal set

    public var resultObject: MutPtr = resultObjectCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var rootObjectContext: MutPtr = rootObjectContextCtorArg
        internal set

    public var transaction: MutPtr = transactionCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        completeNameCtorArg = MutPtr(0L),
        rootObjectCtorArg = MutPtr(0L),
        objectTypeCtorArg = MutPtr(0L),
        createOptions = 0u,
        clsCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = MutPtr(0L),
        securityQualityOfServiceCtorArg = MutPtr(0L),
        desiredAccess = 0u,
        grantedAccess = 0u,
        dispositionCtorArg = MutPtr(0L),
        resultObjectCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        rootObjectContextCtorArg = MutPtr(0L),
        transactionCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.completeName

    public operator fun component2(): MutPtr = this.rootObject

    public operator fun component3(): MutPtr = this.objectType

    public operator fun component4(): UInt = this.createOptions

    public operator fun component5(): MutPtr = this.cls

    public operator fun component6(): MutPtr = this.securityDescriptor

    public operator fun component7(): MutPtr = this.securityQualityOfService

    public operator fun component8(): UInt = this.desiredAccess

    public operator fun component9(): UInt = this.grantedAccess

    public operator fun component10(): MutPtr = this.disposition

    public operator fun component11(): MutPtr = this.resultObject

    public operator fun component12(): MutPtr = this.callContext

    public operator fun component13(): MutPtr = this.rootObjectContext

    public operator fun component14(): MutPtr = this.transaction

    public operator fun component15(): MutPtr = this.reserved

    public fun copy(completeName: MutPtr = this.completeName, rootObject: MutPtr = this.rootObject, objectType: MutPtr = this.objectType, createOptions: UInt = this.createOptions, cls: MutPtr = this.cls, securityDescriptor: MutPtr = this.securityDescriptor, securityQualityOfService: MutPtr = this.securityQualityOfService, desiredAccess: UInt = this.desiredAccess, grantedAccess: UInt = this.grantedAccess, disposition: MutPtr = this.disposition, resultObject: MutPtr = this.resultObject, callContext: MutPtr = this.callContext, rootObjectContext: MutPtr = this.rootObjectContext, transaction: MutPtr = this.transaction, reserved: MutPtr = this.reserved): RegCreateKeyInformation = RegCreateKeyInformation(completeNameCtorArg = completeName, rootObjectCtorArg = rootObject, objectTypeCtorArg = objectType, createOptions = createOptions, clsCtorArg = cls, securityDescriptorCtorArg = securityDescriptor, securityQualityOfServiceCtorArg = securityQualityOfService, desiredAccess = desiredAccess, grantedAccess = grantedAccess, dispositionCtorArg = disposition, resultObjectCtorArg = resultObject, callContextCtorArg = callContext, rootObjectContextCtorArg = rootObjectContext, transactionCtorArg = transaction, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegCreateKeyInformation) return false
        if (this.completeName != other.completeName) return false
        if (this.rootObject != other.rootObject) return false
        if (this.objectType != other.objectType) return false
        if (this.createOptions != other.createOptions) return false
        if (this.cls != other.cls) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.securityQualityOfService != other.securityQualityOfService) return false
        if (this.desiredAccess != other.desiredAccess) return false
        if (this.grantedAccess != other.grantedAccess) return false
        if (this.disposition != other.disposition) return false
        if (this.resultObject != other.resultObject) return false
        if (this.callContext != other.callContext) return false
        if (this.rootObjectContext != other.rootObjectContext) return false
        if (this.transaction != other.transaction) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.completeName.hashCode()
        result = 31 * result + this.rootObject.hashCode()
        result = 31 * result + this.objectType.hashCode()
        result = 31 * result + this.createOptions.hashCode()
        result = 31 * result + this.cls.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.securityQualityOfService.hashCode()
        result = 31 * result + this.desiredAccess.hashCode()
        result = 31 * result + this.grantedAccess.hashCode()
        result = 31 * result + this.disposition.hashCode()
        result = 31 * result + this.resultObject.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.rootObjectContext.hashCode()
        result = 31 * result + this.transaction.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegCreateKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegCreateKeyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): RegCreateKeyInformation =
                    RegCreateKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: RegCreateKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.completeName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rootObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.objectType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.createOptions)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.cls)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.securityDescriptor)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.securityQualityOfService)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.desiredAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.grantedAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 64L, value.disposition)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 72L, value.resultObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 80L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 88L, value.rootObjectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 96L, value.transaction)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 104L, value.reserved)
                }
            }

        public operator fun invoke(
            completeName: MutPtr = MutPtr(0L),
            rootObject: MutPtr = MutPtr(0L),
            objectType: MutPtr = MutPtr(0L),
            createOptions: UInt = 0u,
            cls: MutPtr = MutPtr(0L),
            securityDescriptor: MutPtr = MutPtr(0L),
            securityQualityOfService: MutPtr = MutPtr(0L),
            desiredAccess: UInt = 0u,
            grantedAccess: UInt = 0u,
            disposition: MutPtr = MutPtr(0L),
            resultObject: MutPtr = MutPtr(0L),
            callContext: MutPtr = MutPtr(0L),
            rootObjectContext: MutPtr = MutPtr(0L),
            transaction: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegCreateKeyInformation =
            RegCreateKeyInformation(
                completeNameCtorArg = completeName,
                rootObjectCtorArg = rootObject,
                objectTypeCtorArg = objectType,
                createOptions = createOptions,
                clsCtorArg = cls,
                securityDescriptorCtorArg = securityDescriptor,
                securityQualityOfServiceCtorArg = securityQualityOfService,
                desiredAccess = desiredAccess,
                grantedAccess = grantedAccess,
                dispositionCtorArg = disposition,
                resultObjectCtorArg = resultObject,
                callContextCtorArg = callContext,
                rootObjectContextCtorArg = rootObjectContext,
                transactionCtorArg = transaction,
                reservedCtorArg = reserved,
            )
    }
}

public class RegCreateKeyInformationV1 internal constructor(
    completeNameCtorArg: MutPtr,
    rootObjectCtorArg: MutPtr,
    objectTypeCtorArg: MutPtr,
    public var options: UInt,
    clsCtorArg: MutPtr,
    securityDescriptorCtorArg: MutPtr,
    securityQualityOfServiceCtorArg: MutPtr,
    public var desiredAccess: UInt,
    public var grantedAccess: UInt,
    dispositionCtorArg: MutPtr,
    resultObjectCtorArg: MutPtr,
    callContextCtorArg: MutPtr,
    rootObjectContextCtorArg: MutPtr,
    transactionCtorArg: MutPtr,
    public var version: Int,
    remainingNameCtorArg: MutPtr,
    public var wow64Flags: UInt,
    public var attributes: UInt,
    public var checkAccessMode: Byte,
) {
    public var completeName: MutPtr = completeNameCtorArg
        internal set

    public var rootObject: MutPtr = rootObjectCtorArg
        internal set

    public var objectType: MutPtr = objectTypeCtorArg
        internal set

    public var cls: MutPtr = clsCtorArg
        internal set

    public var securityDescriptor: MutPtr = securityDescriptorCtorArg
        internal set

    public var securityQualityOfService: MutPtr = securityQualityOfServiceCtorArg
        internal set

    public var disposition: MutPtr = dispositionCtorArg
        internal set

    public var resultObject: MutPtr = resultObjectCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var rootObjectContext: MutPtr = rootObjectContextCtorArg
        internal set

    public var transaction: MutPtr = transactionCtorArg
        internal set

    public var remainingName: MutPtr = remainingNameCtorArg
        internal set

    public constructor() : this(
        completeNameCtorArg = MutPtr(0L),
        rootObjectCtorArg = MutPtr(0L),
        objectTypeCtorArg = MutPtr(0L),
        options = 0u,
        clsCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = MutPtr(0L),
        securityQualityOfServiceCtorArg = MutPtr(0L),
        desiredAccess = 0u,
        grantedAccess = 0u,
        dispositionCtorArg = MutPtr(0L),
        resultObjectCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        rootObjectContextCtorArg = MutPtr(0L),
        transactionCtorArg = MutPtr(0L),
        version = 0,
        remainingNameCtorArg = MutPtr(0L),
        wow64Flags = 0u,
        attributes = 0u,
        checkAccessMode = 0,
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegCreateKeyInformationV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegCreateKeyInformationV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): RegCreateKeyInformationV1 =
                    RegCreateKeyInformationV1(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: RegCreateKeyInformationV1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.completeName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rootObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.objectType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.options)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.cls)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.securityDescriptor)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.securityQualityOfService)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.desiredAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.grantedAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 64L, value.disposition)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 72L, value.resultObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 80L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 88L, value.rootObjectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 96L, value.transaction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 104L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 112L, value.remainingName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.wow64Flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 128L, value.checkAccessMode)
                }
            }

        public operator fun invoke(
            completeName: MutPtr = MutPtr(0L),
            rootObject: MutPtr = MutPtr(0L),
            objectType: MutPtr = MutPtr(0L),
            options: UInt = 0u,
            cls: MutPtr = MutPtr(0L),
            securityDescriptor: MutPtr = MutPtr(0L),
            securityQualityOfService: MutPtr = MutPtr(0L),
            desiredAccess: UInt = 0u,
            grantedAccess: UInt = 0u,
            disposition: MutPtr = MutPtr(0L),
            resultObject: MutPtr = MutPtr(0L),
            callContext: MutPtr = MutPtr(0L),
            rootObjectContext: MutPtr = MutPtr(0L),
            transaction: MutPtr = MutPtr(0L),
            version: Int = 0,
            remainingName: MutPtr = MutPtr(0L),
            wow64Flags: UInt = 0u,
            attributes: UInt = 0u,
            checkAccessMode: Byte = 0,
        ): RegCreateKeyInformationV1 =
            RegCreateKeyInformationV1(
                completeNameCtorArg = completeName,
                rootObjectCtorArg = rootObject,
                objectTypeCtorArg = objectType,
                options = options,
                clsCtorArg = cls,
                securityDescriptorCtorArg = securityDescriptor,
                securityQualityOfServiceCtorArg = securityQualityOfService,
                desiredAccess = desiredAccess,
                grantedAccess = grantedAccess,
                dispositionCtorArg = disposition,
                resultObjectCtorArg = resultObject,
                callContextCtorArg = callContext,
                rootObjectContextCtorArg = rootObjectContext,
                transactionCtorArg = transaction,
                version = version,
                remainingNameCtorArg = remainingName,
                wow64Flags = wow64Flags,
                attributes = attributes,
                checkAccessMode = checkAccessMode,
            )
    }
}

public class RegDeleteKeyInformation internal constructor(
    objCtorArg: MutPtr,
    callContextCtorArg: MutPtr,
    objectContextCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var objectContext: MutPtr = objectContextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.obj

    public operator fun component2(): MutPtr = this.callContext

    public operator fun component3(): MutPtr = this.objectContext

    public operator fun component4(): MutPtr = this.reserved

    public fun copy(obj: MutPtr = this.obj, callContext: MutPtr = this.callContext, objectContext: MutPtr = this.objectContext, reserved: MutPtr = this.reserved): RegDeleteKeyInformation = RegDeleteKeyInformation(objCtorArg = obj, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegDeleteKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegDeleteKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegDeleteKeyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): RegDeleteKeyInformation =
                    RegDeleteKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: RegDeleteKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr = MutPtr(0L),
            callContext: MutPtr = MutPtr(0L),
            objectContext: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegDeleteKeyInformation =
            RegDeleteKeyInformation(
                objCtorArg = obj,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegDeleteValueKeyInformation internal constructor(
    objCtorArg: MutPtr,
    valueNameCtorArg: MutPtr,
    callContextCtorArg: MutPtr,
    objectContextCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var valueName: MutPtr = valueNameCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var objectContext: MutPtr = objectContextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        valueNameCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.obj

    public operator fun component2(): MutPtr = this.valueName

    public operator fun component3(): MutPtr = this.callContext

    public operator fun component4(): MutPtr = this.objectContext

    public operator fun component5(): MutPtr = this.reserved

    public fun copy(obj: MutPtr = this.obj, valueName: MutPtr = this.valueName, callContext: MutPtr = this.callContext, objectContext: MutPtr = this.objectContext, reserved: MutPtr = this.reserved): RegDeleteValueKeyInformation = RegDeleteValueKeyInformation(objCtorArg = obj, valueNameCtorArg = valueName, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegDeleteValueKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.valueName != other.valueName) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.valueName.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegDeleteValueKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegDeleteValueKeyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): RegDeleteValueKeyInformation =
                    RegDeleteValueKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RegDeleteValueKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.valueName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr = MutPtr(0L),
            valueName: MutPtr = MutPtr(0L),
            callContext: MutPtr = MutPtr(0L),
            objectContext: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegDeleteValueKeyInformation =
            RegDeleteValueKeyInformation(
                objCtorArg = obj,
                valueNameCtorArg = valueName,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegKeyHandleCloseInformation internal constructor(
    objCtorArg: MutPtr,
    callContextCtorArg: MutPtr,
    objectContextCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var objectContext: MutPtr = objectContextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.obj

    public operator fun component2(): MutPtr = this.callContext

    public operator fun component3(): MutPtr = this.objectContext

    public operator fun component4(): MutPtr = this.reserved

    public fun copy(obj: MutPtr = this.obj, callContext: MutPtr = this.callContext, objectContext: MutPtr = this.objectContext, reserved: MutPtr = this.reserved): RegKeyHandleCloseInformation = RegKeyHandleCloseInformation(objCtorArg = obj, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegKeyHandleCloseInformation) return false
        if (this.obj != other.obj) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegKeyHandleCloseInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegKeyHandleCloseInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): RegKeyHandleCloseInformation =
                    RegKeyHandleCloseInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: RegKeyHandleCloseInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr = MutPtr(0L),
            callContext: MutPtr = MutPtr(0L),
            objectContext: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegKeyHandleCloseInformation =
            RegKeyHandleCloseInformation(
                objCtorArg = obj,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}
