package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

public data class UseInfo3(
    public var ui3Ui2: UseInfo2 = UseInfo2(),
    public var ui3Flags: UInt = 0u,
)

public class UseInfo4 internal constructor(
    public var ui4Ui3: UseInfo3,
    public var ui4AuthIdentityLength: UInt,
    ui4AuthIdentityCtorArg: MutPtr,
) {
    public var ui4AuthIdentity: MutPtr = ui4AuthIdentityCtorArg
        internal set

    public constructor() : this(
        ui4Ui3 = UseInfo3(),
        ui4AuthIdentityLength = 0u,
        ui4AuthIdentityCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UseInfo3 = this.ui4Ui3

    public operator fun component2(): UInt = this.ui4AuthIdentityLength

    public operator fun component3(): MutPtr = this.ui4AuthIdentity

    public fun copy(ui4Ui3: UseInfo3 = this.ui4Ui3, ui4AuthIdentityLength: UInt = this.ui4AuthIdentityLength, ui4AuthIdentity: MutPtr = this.ui4AuthIdentity): UseInfo4 = UseInfo4(ui4Ui3 = ui4Ui3, ui4AuthIdentityLength = ui4AuthIdentityLength, ui4AuthIdentityCtorArg = ui4AuthIdentity)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UseInfo4) return false
        if (this.ui4Ui3 != other.ui4Ui3) return false
        if (this.ui4AuthIdentityLength != other.ui4AuthIdentityLength) return false
        if (this.ui4AuthIdentity != other.ui4AuthIdentity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ui4Ui3.hashCode()
        result = 31 * result + this.ui4AuthIdentityLength.hashCode()
        result = 31 * result + this.ui4AuthIdentity.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ui4Ui3: UseInfo3 = UseInfo3(),
            ui4AuthIdentityLength: UInt = 0u,
            ui4AuthIdentity: MutPtr = MutPtr(0L),
        ): UseInfo4 =
            UseInfo4(
                ui4Ui3 = ui4Ui3,
                ui4AuthIdentityLength = ui4AuthIdentityLength,
                ui4AuthIdentityCtorArg = ui4AuthIdentity,
            )
    }
}

public class UseInfo5 internal constructor(
    public var ui4Ui3: UseInfo3,
    public var ui4AuthIdentityLength: UInt,
    ui4AuthIdentityCtorArg: MutPtr,
    public var ui5SecurityDescriptorLength: UInt,
    ui5SecurityDescriptorCtorArg: MutPtr,
    public var ui5UseOptionsLength: UInt,
    ui5UseOptionsCtorArg: MutPtr,
) {
    public var ui4AuthIdentity: MutPtr = ui4AuthIdentityCtorArg
        internal set

    public var ui5SecurityDescriptor: MutPtr = ui5SecurityDescriptorCtorArg
        internal set

    public var ui5UseOptions: MutPtr = ui5UseOptionsCtorArg
        internal set

    public constructor() : this(
        ui4Ui3 = UseInfo3(),
        ui4AuthIdentityLength = 0u,
        ui4AuthIdentityCtorArg = MutPtr(0L),
        ui5SecurityDescriptorLength = 0u,
        ui5SecurityDescriptorCtorArg = MutPtr(0L),
        ui5UseOptionsLength = 0u,
        ui5UseOptionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UseInfo3 = this.ui4Ui3

    public operator fun component2(): UInt = this.ui4AuthIdentityLength

    public operator fun component3(): MutPtr = this.ui4AuthIdentity

    public operator fun component4(): UInt = this.ui5SecurityDescriptorLength

    public operator fun component5(): MutPtr = this.ui5SecurityDescriptor

    public operator fun component6(): UInt = this.ui5UseOptionsLength

    public operator fun component7(): MutPtr = this.ui5UseOptions

    public fun copy(ui4Ui3: UseInfo3 = this.ui4Ui3, ui4AuthIdentityLength: UInt = this.ui4AuthIdentityLength, ui4AuthIdentity: MutPtr = this.ui4AuthIdentity, ui5SecurityDescriptorLength: UInt = this.ui5SecurityDescriptorLength, ui5SecurityDescriptor: MutPtr = this.ui5SecurityDescriptor, ui5UseOptionsLength: UInt = this.ui5UseOptionsLength, ui5UseOptions: MutPtr = this.ui5UseOptions): UseInfo5 = UseInfo5(ui4Ui3 = ui4Ui3, ui4AuthIdentityLength = ui4AuthIdentityLength, ui4AuthIdentityCtorArg = ui4AuthIdentity, ui5SecurityDescriptorLength = ui5SecurityDescriptorLength, ui5SecurityDescriptorCtorArg = ui5SecurityDescriptor, ui5UseOptionsLength = ui5UseOptionsLength, ui5UseOptionsCtorArg = ui5UseOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UseInfo5) return false
        if (this.ui4Ui3 != other.ui4Ui3) return false
        if (this.ui4AuthIdentityLength != other.ui4AuthIdentityLength) return false
        if (this.ui4AuthIdentity != other.ui4AuthIdentity) return false
        if (this.ui5SecurityDescriptorLength != other.ui5SecurityDescriptorLength) return false
        if (this.ui5SecurityDescriptor != other.ui5SecurityDescriptor) return false
        if (this.ui5UseOptionsLength != other.ui5UseOptionsLength) return false
        if (this.ui5UseOptions != other.ui5UseOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ui4Ui3.hashCode()
        result = 31 * result + this.ui4AuthIdentityLength.hashCode()
        result = 31 * result + this.ui4AuthIdentity.hashCode()
        result = 31 * result + this.ui5SecurityDescriptorLength.hashCode()
        result = 31 * result + this.ui5SecurityDescriptor.hashCode()
        result = 31 * result + this.ui5UseOptionsLength.hashCode()
        result = 31 * result + this.ui5UseOptions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ui4Ui3: UseInfo3 = UseInfo3(),
            ui4AuthIdentityLength: UInt = 0u,
            ui4AuthIdentity: MutPtr = MutPtr(0L),
            ui5SecurityDescriptorLength: UInt = 0u,
            ui5SecurityDescriptor: MutPtr = MutPtr(0L),
            ui5UseOptionsLength: UInt = 0u,
            ui5UseOptions: MutPtr = MutPtr(0L),
        ): UseInfo5 =
            UseInfo5(
                ui4Ui3 = ui4Ui3,
                ui4AuthIdentityLength = ui4AuthIdentityLength,
                ui4AuthIdentityCtorArg = ui4AuthIdentity,
                ui5SecurityDescriptorLength = ui5SecurityDescriptorLength,
                ui5SecurityDescriptorCtorArg = ui5SecurityDescriptor,
                ui5UseOptionsLength = ui5UseOptionsLength,
                ui5UseOptionsCtorArg = ui5UseOptions,
            )
    }
}

public data class UseOptionDeferredConnectionParameters(
    public var tag: UInt = 0u,
    public var length: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UseOptionDeferredConnectionParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UseOptionDeferredConnectionParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UseOptionDeferredConnectionParameters =
                    UseOptionDeferredConnectionParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: UseOptionDeferredConnectionParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}

public data class UseOptionGeneric(
    public var tag: UInt = 0u,
    public var length: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UseOptionGeneric> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UseOptionGeneric> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UseOptionGeneric =
                    UseOptionGeneric(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: UseOptionGeneric) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}

public class UseOptionProperties internal constructor(
    public var tag: UInt,
    pInfoCtorArg: MutPtr,
    public var length: Int,
) {
    public var pInfo: MutPtr = pInfoCtorArg
        internal set

    public constructor() : this(
        tag = 0u,
        pInfoCtorArg = MutPtr(0L),
        length = 0,
    )

    public operator fun component1(): UInt = this.tag

    public operator fun component2(): MutPtr = this.pInfo

    public operator fun component3(): Int = this.length

    public fun copy(tag: UInt = this.tag, pInfo: MutPtr = this.pInfo, length: Int = this.length): UseOptionProperties = UseOptionProperties(tag = tag, pInfoCtorArg = pInfo, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UseOptionProperties) return false
        if (this.tag != other.tag) return false
        if (this.pInfo != other.pInfo) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tag.hashCode()
        result = 31 * result + this.pInfo.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UseOptionProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UseOptionProperties> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UseOptionProperties =
                    UseOptionProperties(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UseOptionProperties) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tag)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.length)
                }
            }

        public operator fun invoke(
            tag: UInt = 0u,
            pInfo: MutPtr = MutPtr(0L),
            length: Int = 0,
        ): UseOptionProperties =
            UseOptionProperties(
                tag = tag,
                pInfoCtorArg = pInfo,
                length = length,
            )
    }
}

public data class UseOptionTransportParameters(
    public var tag: UInt = 0u,
    public var length: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UseOptionTransportParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UseOptionTransportParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UseOptionTransportParameters =
                    UseOptionTransportParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: UseOptionTransportParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}

public class WkstaInfo100 internal constructor(
    public var wki100PlatformId: UInt,
    wki100ComputernameCtorArg: Pwstr,
    wki100LangroupCtorArg: Pwstr,
    public var wki100VerMajor: UInt,
    public var wki100VerMinor: UInt,
) {
    public var wki100Computername: Pwstr = wki100ComputernameCtorArg
        internal set

    public var wki100Langroup: Pwstr = wki100LangroupCtorArg
        internal set

    public constructor() : this(
        wki100PlatformId = 0u,
        wki100ComputernameCtorArg = MutPtr(0L),
        wki100LangroupCtorArg = MutPtr(0L),
        wki100VerMajor = 0u,
        wki100VerMinor = 0u,
    )

    public operator fun component1(): UInt = this.wki100PlatformId

    public operator fun component2(): Pwstr = this.wki100Computername

    public operator fun component3(): Pwstr = this.wki100Langroup

    public operator fun component4(): UInt = this.wki100VerMajor

    public operator fun component5(): UInt = this.wki100VerMinor

    public fun copy(wki100PlatformId: UInt = this.wki100PlatformId, wki100Computername: Pwstr = this.wki100Computername, wki100Langroup: Pwstr = this.wki100Langroup, wki100VerMajor: UInt = this.wki100VerMajor, wki100VerMinor: UInt = this.wki100VerMinor): WkstaInfo100 = WkstaInfo100(wki100PlatformId = wki100PlatformId, wki100ComputernameCtorArg = wki100Computername, wki100LangroupCtorArg = wki100Langroup, wki100VerMajor = wki100VerMajor, wki100VerMinor = wki100VerMinor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WkstaInfo100) return false
        if (this.wki100PlatformId != other.wki100PlatformId) return false
        if (this.wki100Computername != other.wki100Computername) return false
        if (this.wki100Langroup != other.wki100Langroup) return false
        if (this.wki100VerMajor != other.wki100VerMajor) return false
        if (this.wki100VerMinor != other.wki100VerMinor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wki100PlatformId.hashCode()
        result = 31 * result + this.wki100Computername.hashCode()
        result = 31 * result + this.wki100Langroup.hashCode()
        result = 31 * result + this.wki100VerMajor.hashCode()
        result = 31 * result + this.wki100VerMinor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wki100PlatformId: UInt = 0u,
            wki100Computername: Pwstr = MutPtr(0L),
            wki100Langroup: Pwstr = MutPtr(0L),
            wki100VerMajor: UInt = 0u,
            wki100VerMinor: UInt = 0u,
        ): WkstaInfo100 =
            WkstaInfo100(
                wki100PlatformId = wki100PlatformId,
                wki100ComputernameCtorArg = wki100Computername,
                wki100LangroupCtorArg = wki100Langroup,
                wki100VerMajor = wki100VerMajor,
                wki100VerMinor = wki100VerMinor,
            )
    }
}

public class WkstaInfo101 internal constructor(
    public var wki101PlatformId: UInt,
    wki101ComputernameCtorArg: Pwstr,
    wki101LangroupCtorArg: Pwstr,
    public var wki101VerMajor: UInt,
    public var wki101VerMinor: UInt,
    wki101LanrootCtorArg: Pwstr,
) {
    public var wki101Computername: Pwstr = wki101ComputernameCtorArg
        internal set

    public var wki101Langroup: Pwstr = wki101LangroupCtorArg
        internal set

    public var wki101Lanroot: Pwstr = wki101LanrootCtorArg
        internal set

    public constructor() : this(
        wki101PlatformId = 0u,
        wki101ComputernameCtorArg = MutPtr(0L),
        wki101LangroupCtorArg = MutPtr(0L),
        wki101VerMajor = 0u,
        wki101VerMinor = 0u,
        wki101LanrootCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.wki101PlatformId

    public operator fun component2(): Pwstr = this.wki101Computername

    public operator fun component3(): Pwstr = this.wki101Langroup

    public operator fun component4(): UInt = this.wki101VerMajor

    public operator fun component5(): UInt = this.wki101VerMinor

    public operator fun component6(): Pwstr = this.wki101Lanroot

    public fun copy(wki101PlatformId: UInt = this.wki101PlatformId, wki101Computername: Pwstr = this.wki101Computername, wki101Langroup: Pwstr = this.wki101Langroup, wki101VerMajor: UInt = this.wki101VerMajor, wki101VerMinor: UInt = this.wki101VerMinor, wki101Lanroot: Pwstr = this.wki101Lanroot): WkstaInfo101 = WkstaInfo101(wki101PlatformId = wki101PlatformId, wki101ComputernameCtorArg = wki101Computername, wki101LangroupCtorArg = wki101Langroup, wki101VerMajor = wki101VerMajor, wki101VerMinor = wki101VerMinor, wki101LanrootCtorArg = wki101Lanroot)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WkstaInfo101) return false
        if (this.wki101PlatformId != other.wki101PlatformId) return false
        if (this.wki101Computername != other.wki101Computername) return false
        if (this.wki101Langroup != other.wki101Langroup) return false
        if (this.wki101VerMajor != other.wki101VerMajor) return false
        if (this.wki101VerMinor != other.wki101VerMinor) return false
        if (this.wki101Lanroot != other.wki101Lanroot) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wki101PlatformId.hashCode()
        result = 31 * result + this.wki101Computername.hashCode()
        result = 31 * result + this.wki101Langroup.hashCode()
        result = 31 * result + this.wki101VerMajor.hashCode()
        result = 31 * result + this.wki101VerMinor.hashCode()
        result = 31 * result + this.wki101Lanroot.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wki101PlatformId: UInt = 0u,
            wki101Computername: Pwstr = MutPtr(0L),
            wki101Langroup: Pwstr = MutPtr(0L),
            wki101VerMajor: UInt = 0u,
            wki101VerMinor: UInt = 0u,
            wki101Lanroot: Pwstr = MutPtr(0L),
        ): WkstaInfo101 =
            WkstaInfo101(
                wki101PlatformId = wki101PlatformId,
                wki101ComputernameCtorArg = wki101Computername,
                wki101LangroupCtorArg = wki101Langroup,
                wki101VerMajor = wki101VerMajor,
                wki101VerMinor = wki101VerMinor,
                wki101LanrootCtorArg = wki101Lanroot,
            )
    }
}

public data class WkstaInfo1010(
    public var wki1010CharWait: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1010> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1010 =
                    WkstaInfo1010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1010CharWait)
                }
            }
    }
}

public data class WkstaInfo1011(
    public var wki1011CollectionTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1011> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1011> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1011 =
                    WkstaInfo1011(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1011) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1011CollectionTime)
                }
            }
    }
}

public data class WkstaInfo1012(
    public var wki1012MaximumCollectionCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1012> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1012> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1012 =
                    WkstaInfo1012(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1012) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1012MaximumCollectionCount)
                }
            }
    }
}

public data class WkstaInfo1013(
    public var wki1013KeepConn: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1013> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1013> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1013 =
                    WkstaInfo1013(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1013) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1013KeepConn)
                }
            }
    }
}

public data class WkstaInfo1018(
    public var wki1018SessTimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1018> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1018> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1018 =
                    WkstaInfo1018(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1018) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1018SessTimeout)
                }
            }
    }
}

public class WkstaInfo102 internal constructor(
    public var wki102PlatformId: UInt,
    wki102ComputernameCtorArg: Pwstr,
    wki102LangroupCtorArg: Pwstr,
    public var wki102VerMajor: UInt,
    public var wki102VerMinor: UInt,
    wki102LanrootCtorArg: Pwstr,
    public var wki102LoggedOnUsers: UInt,
) {
    public var wki102Computername: Pwstr = wki102ComputernameCtorArg
        internal set

    public var wki102Langroup: Pwstr = wki102LangroupCtorArg
        internal set

    public var wki102Lanroot: Pwstr = wki102LanrootCtorArg
        internal set

    public constructor() : this(
        wki102PlatformId = 0u,
        wki102ComputernameCtorArg = MutPtr(0L),
        wki102LangroupCtorArg = MutPtr(0L),
        wki102VerMajor = 0u,
        wki102VerMinor = 0u,
        wki102LanrootCtorArg = MutPtr(0L),
        wki102LoggedOnUsers = 0u,
    )

    public operator fun component1(): UInt = this.wki102PlatformId

    public operator fun component2(): Pwstr = this.wki102Computername

    public operator fun component3(): Pwstr = this.wki102Langroup

    public operator fun component4(): UInt = this.wki102VerMajor

    public operator fun component5(): UInt = this.wki102VerMinor

    public operator fun component6(): Pwstr = this.wki102Lanroot

    public operator fun component7(): UInt = this.wki102LoggedOnUsers

    public fun copy(wki102PlatformId: UInt = this.wki102PlatformId, wki102Computername: Pwstr = this.wki102Computername, wki102Langroup: Pwstr = this.wki102Langroup, wki102VerMajor: UInt = this.wki102VerMajor, wki102VerMinor: UInt = this.wki102VerMinor, wki102Lanroot: Pwstr = this.wki102Lanroot, wki102LoggedOnUsers: UInt = this.wki102LoggedOnUsers): WkstaInfo102 = WkstaInfo102(wki102PlatformId = wki102PlatformId, wki102ComputernameCtorArg = wki102Computername, wki102LangroupCtorArg = wki102Langroup, wki102VerMajor = wki102VerMajor, wki102VerMinor = wki102VerMinor, wki102LanrootCtorArg = wki102Lanroot, wki102LoggedOnUsers = wki102LoggedOnUsers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WkstaInfo102) return false
        if (this.wki102PlatformId != other.wki102PlatformId) return false
        if (this.wki102Computername != other.wki102Computername) return false
        if (this.wki102Langroup != other.wki102Langroup) return false
        if (this.wki102VerMajor != other.wki102VerMajor) return false
        if (this.wki102VerMinor != other.wki102VerMinor) return false
        if (this.wki102Lanroot != other.wki102Lanroot) return false
        if (this.wki102LoggedOnUsers != other.wki102LoggedOnUsers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wki102PlatformId.hashCode()
        result = 31 * result + this.wki102Computername.hashCode()
        result = 31 * result + this.wki102Langroup.hashCode()
        result = 31 * result + this.wki102VerMajor.hashCode()
        result = 31 * result + this.wki102VerMinor.hashCode()
        result = 31 * result + this.wki102Lanroot.hashCode()
        result = 31 * result + this.wki102LoggedOnUsers.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wki102PlatformId: UInt = 0u,
            wki102Computername: Pwstr = MutPtr(0L),
            wki102Langroup: Pwstr = MutPtr(0L),
            wki102VerMajor: UInt = 0u,
            wki102VerMinor: UInt = 0u,
            wki102Lanroot: Pwstr = MutPtr(0L),
            wki102LoggedOnUsers: UInt = 0u,
        ): WkstaInfo102 =
            WkstaInfo102(
                wki102PlatformId = wki102PlatformId,
                wki102ComputernameCtorArg = wki102Computername,
                wki102LangroupCtorArg = wki102Langroup,
                wki102VerMajor = wki102VerMajor,
                wki102VerMinor = wki102VerMinor,
                wki102LanrootCtorArg = wki102Lanroot,
                wki102LoggedOnUsers = wki102LoggedOnUsers,
            )
    }
}

public data class WkstaInfo1023(
    public var wki1023SizCharBuf: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1023> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1023> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1023 =
                    WkstaInfo1023(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1023) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1023SizCharBuf)
                }
            }
    }
}

public data class WkstaInfo1027(
    public var wki1027ErrlogSz: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1027> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1027> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1027 =
                    WkstaInfo1027(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1027) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1027ErrlogSz)
                }
            }
    }
}

public data class WkstaInfo1028(
    public var wki1028PrintBufTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1028> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1028> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1028 =
                    WkstaInfo1028(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1028) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1028PrintBufTime)
                }
            }
    }
}

public data class WkstaInfo1032(
    public var wki1032WrkHeuristics: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1032> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1032> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1032 =
                    WkstaInfo1032(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1032) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1032WrkHeuristics)
                }
            }
    }
}

public data class WkstaInfo1033(
    public var wki1033MaxThreads: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1033> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1033> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1033 =
                    WkstaInfo1033(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1033) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1033MaxThreads)
                }
            }
    }
}

public data class WkstaInfo1041(
    public var wki1041LockQuota: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1041> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1041> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1041 =
                    WkstaInfo1041(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1041) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1041LockQuota)
                }
            }
    }
}

public data class WkstaInfo1042(
    public var wki1042LockIncrement: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1042> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1042> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1042 =
                    WkstaInfo1042(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1042) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1042LockIncrement)
                }
            }
    }
}

public data class WkstaInfo1043(
    public var wki1043LockMaximum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1043> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1043> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1043 =
                    WkstaInfo1043(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1043) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1043LockMaximum)
                }
            }
    }
}

public data class WkstaInfo1044(
    public var wki1044PipeIncrement: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1044> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1044> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1044 =
                    WkstaInfo1044(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1044) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1044PipeIncrement)
                }
            }
    }
}

public data class WkstaInfo1045(
    public var wki1045PipeMaximum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1045> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1045> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1045 =
                    WkstaInfo1045(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1045) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1045PipeMaximum)
                }
            }
    }
}

public data class WkstaInfo1046(
    public var wki1046DormantFileLimit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1046> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1046> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1046 =
                    WkstaInfo1046(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1046) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1046DormantFileLimit)
                }
            }
    }
}

public data class WkstaInfo1047(
    public var wki1047CacheFileTimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1047> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1047> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1047 =
                    WkstaInfo1047(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1047) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1047CacheFileTimeout)
                }
            }
    }
}

public data class WkstaInfo1048(
    public var wki1048UseOpportunisticLocking: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1048> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1048> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1048 =
                    WkstaInfo1048(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1048) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1048UseOpportunisticLocking)
                }
            }
    }
}

public data class WkstaInfo1049(
    public var wki1049UseUnlockBehind: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1049> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1049> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1049 =
                    WkstaInfo1049(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1049) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1049UseUnlockBehind)
                }
            }
    }
}

public data class WkstaInfo1050(
    public var wki1050UseCloseBehind: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1050> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1050> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1050 =
                    WkstaInfo1050(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1050) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1050UseCloseBehind)
                }
            }
    }
}

public data class WkstaInfo1051(
    public var wki1051BufNamedPipes: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1051> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1051> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1051 =
                    WkstaInfo1051(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1051) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1051BufNamedPipes)
                }
            }
    }
}

public data class WkstaInfo1052(
    public var wki1052UseLockReadUnlock: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1052> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1052> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1052 =
                    WkstaInfo1052(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1052) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1052UseLockReadUnlock)
                }
            }
    }
}

public data class WkstaInfo1053(
    public var wki1053UtilizeNtCaching: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1053> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1053> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1053 =
                    WkstaInfo1053(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1053) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1053UtilizeNtCaching)
                }
            }
    }
}

public data class WkstaInfo1054(
    public var wki1054UseRawRead: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1054> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1054> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1054 =
                    WkstaInfo1054(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1054) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1054UseRawRead)
                }
            }
    }
}

public data class WkstaInfo1055(
    public var wki1055UseRawWrite: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1055> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1055> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1055 =
                    WkstaInfo1055(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1055) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1055UseRawWrite)
                }
            }
    }
}

public data class WkstaInfo1056(
    public var wki1056UseWriteRawData: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1056> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1056> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1056 =
                    WkstaInfo1056(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1056) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1056UseWriteRawData)
                }
            }
    }
}

public data class WkstaInfo1057(
    public var wki1057UseEncryption: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1057> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1057> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1057 =
                    WkstaInfo1057(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1057) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1057UseEncryption)
                }
            }
    }
}

public data class WkstaInfo1058(
    public var wki1058BufFilesDenyWrite: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1058> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1058> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1058 =
                    WkstaInfo1058(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1058) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1058BufFilesDenyWrite)
                }
            }
    }
}

public data class WkstaInfo1059(
    public var wki1059BufReadOnlyFiles: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1059> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1059> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1059 =
                    WkstaInfo1059(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1059) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1059BufReadOnlyFiles)
                }
            }
    }
}

public data class WkstaInfo1060(
    public var wki1060ForceCoreCreateMode: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1060> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1060> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1060 =
                    WkstaInfo1060(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1060) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1060ForceCoreCreateMode)
                }
            }
    }
}

public data class WkstaInfo1061(
    public var wki1061Use512ByteMaxTransfer: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1061> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1061> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1061 =
                    WkstaInfo1061(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1061) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wki1061Use512ByteMaxTransfer)
                }
            }
    }
}

public data class WkstaInfo1062(
    public var wki1062ReadAheadThroughput: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1062> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo1062> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WkstaInfo1062 =
                    WkstaInfo1062(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo1062) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki1062ReadAheadThroughput)
                }
            }
    }
}

public class WkstaInfo302 internal constructor(
    public var wki302CharWait: UInt,
    public var wki302CollectionTime: UInt,
    public var wki302MaximumCollectionCount: UInt,
    public var wki302KeepConn: UInt,
    public var wki302KeepSearch: UInt,
    public var wki302MaxCmds: UInt,
    public var wki302NumWorkBuf: UInt,
    public var wki302SizWorkBuf: UInt,
    public var wki302MaxWrkCache: UInt,
    public var wki302SessTimeout: UInt,
    public var wki302SizError: UInt,
    public var wki302NumAlerts: UInt,
    public var wki302NumServices: UInt,
    public var wki302ErrlogSz: UInt,
    public var wki302PrintBufTime: UInt,
    public var wki302NumCharBuf: UInt,
    public var wki302SizCharBuf: UInt,
    wki302WrkHeuristicsCtorArg: Pwstr,
    public var wki302Mailslots: UInt,
    public var wki302NumDgramBuf: UInt,
) {
    public var wki302WrkHeuristics: Pwstr = wki302WrkHeuristicsCtorArg
        internal set

    public constructor() : this(
        wki302CharWait = 0u,
        wki302CollectionTime = 0u,
        wki302MaximumCollectionCount = 0u,
        wki302KeepConn = 0u,
        wki302KeepSearch = 0u,
        wki302MaxCmds = 0u,
        wki302NumWorkBuf = 0u,
        wki302SizWorkBuf = 0u,
        wki302MaxWrkCache = 0u,
        wki302SessTimeout = 0u,
        wki302SizError = 0u,
        wki302NumAlerts = 0u,
        wki302NumServices = 0u,
        wki302ErrlogSz = 0u,
        wki302PrintBufTime = 0u,
        wki302NumCharBuf = 0u,
        wki302SizCharBuf = 0u,
        wki302WrkHeuristicsCtorArg = MutPtr(0L),
        wki302Mailslots = 0u,
        wki302NumDgramBuf = 0u,
    )

    public companion object {
        public operator fun invoke(
            wki302CharWait: UInt = 0u,
            wki302CollectionTime: UInt = 0u,
            wki302MaximumCollectionCount: UInt = 0u,
            wki302KeepConn: UInt = 0u,
            wki302KeepSearch: UInt = 0u,
            wki302MaxCmds: UInt = 0u,
            wki302NumWorkBuf: UInt = 0u,
            wki302SizWorkBuf: UInt = 0u,
            wki302MaxWrkCache: UInt = 0u,
            wki302SessTimeout: UInt = 0u,
            wki302SizError: UInt = 0u,
            wki302NumAlerts: UInt = 0u,
            wki302NumServices: UInt = 0u,
            wki302ErrlogSz: UInt = 0u,
            wki302PrintBufTime: UInt = 0u,
            wki302NumCharBuf: UInt = 0u,
            wki302SizCharBuf: UInt = 0u,
            wki302WrkHeuristics: Pwstr = MutPtr(0L),
            wki302Mailslots: UInt = 0u,
            wki302NumDgramBuf: UInt = 0u,
        ): WkstaInfo302 =
            WkstaInfo302(
                wki302CharWait = wki302CharWait,
                wki302CollectionTime = wki302CollectionTime,
                wki302MaximumCollectionCount = wki302MaximumCollectionCount,
                wki302KeepConn = wki302KeepConn,
                wki302KeepSearch = wki302KeepSearch,
                wki302MaxCmds = wki302MaxCmds,
                wki302NumWorkBuf = wki302NumWorkBuf,
                wki302SizWorkBuf = wki302SizWorkBuf,
                wki302MaxWrkCache = wki302MaxWrkCache,
                wki302SessTimeout = wki302SessTimeout,
                wki302SizError = wki302SizError,
                wki302NumAlerts = wki302NumAlerts,
                wki302NumServices = wki302NumServices,
                wki302ErrlogSz = wki302ErrlogSz,
                wki302PrintBufTime = wki302PrintBufTime,
                wki302NumCharBuf = wki302NumCharBuf,
                wki302SizCharBuf = wki302SizCharBuf,
                wki302WrkHeuristicsCtorArg = wki302WrkHeuristics,
                wki302Mailslots = wki302Mailslots,
                wki302NumDgramBuf = wki302NumDgramBuf,
            )
    }
}

public class WkstaInfo402 internal constructor(
    public var wki402CharWait: UInt,
    public var wki402CollectionTime: UInt,
    public var wki402MaximumCollectionCount: UInt,
    public var wki402KeepConn: UInt,
    public var wki402KeepSearch: UInt,
    public var wki402MaxCmds: UInt,
    public var wki402NumWorkBuf: UInt,
    public var wki402SizWorkBuf: UInt,
    public var wki402MaxWrkCache: UInt,
    public var wki402SessTimeout: UInt,
    public var wki402SizError: UInt,
    public var wki402NumAlerts: UInt,
    public var wki402NumServices: UInt,
    public var wki402ErrlogSz: UInt,
    public var wki402PrintBufTime: UInt,
    public var wki402NumCharBuf: UInt,
    public var wki402SizCharBuf: UInt,
    wki402WrkHeuristicsCtorArg: Pwstr,
    public var wki402Mailslots: UInt,
    public var wki402NumDgramBuf: UInt,
    public var wki402MaxThreads: UInt,
) {
    public var wki402WrkHeuristics: Pwstr = wki402WrkHeuristicsCtorArg
        internal set

    public constructor() : this(
        wki402CharWait = 0u,
        wki402CollectionTime = 0u,
        wki402MaximumCollectionCount = 0u,
        wki402KeepConn = 0u,
        wki402KeepSearch = 0u,
        wki402MaxCmds = 0u,
        wki402NumWorkBuf = 0u,
        wki402SizWorkBuf = 0u,
        wki402MaxWrkCache = 0u,
        wki402SessTimeout = 0u,
        wki402SizError = 0u,
        wki402NumAlerts = 0u,
        wki402NumServices = 0u,
        wki402ErrlogSz = 0u,
        wki402PrintBufTime = 0u,
        wki402NumCharBuf = 0u,
        wki402SizCharBuf = 0u,
        wki402WrkHeuristicsCtorArg = MutPtr(0L),
        wki402Mailslots = 0u,
        wki402NumDgramBuf = 0u,
        wki402MaxThreads = 0u,
    )

    public companion object {
        public operator fun invoke(
            wki402CharWait: UInt = 0u,
            wki402CollectionTime: UInt = 0u,
            wki402MaximumCollectionCount: UInt = 0u,
            wki402KeepConn: UInt = 0u,
            wki402KeepSearch: UInt = 0u,
            wki402MaxCmds: UInt = 0u,
            wki402NumWorkBuf: UInt = 0u,
            wki402SizWorkBuf: UInt = 0u,
            wki402MaxWrkCache: UInt = 0u,
            wki402SessTimeout: UInt = 0u,
            wki402SizError: UInt = 0u,
            wki402NumAlerts: UInt = 0u,
            wki402NumServices: UInt = 0u,
            wki402ErrlogSz: UInt = 0u,
            wki402PrintBufTime: UInt = 0u,
            wki402NumCharBuf: UInt = 0u,
            wki402SizCharBuf: UInt = 0u,
            wki402WrkHeuristics: Pwstr = MutPtr(0L),
            wki402Mailslots: UInt = 0u,
            wki402NumDgramBuf: UInt = 0u,
            wki402MaxThreads: UInt = 0u,
        ): WkstaInfo402 =
            WkstaInfo402(
                wki402CharWait = wki402CharWait,
                wki402CollectionTime = wki402CollectionTime,
                wki402MaximumCollectionCount = wki402MaximumCollectionCount,
                wki402KeepConn = wki402KeepConn,
                wki402KeepSearch = wki402KeepSearch,
                wki402MaxCmds = wki402MaxCmds,
                wki402NumWorkBuf = wki402NumWorkBuf,
                wki402SizWorkBuf = wki402SizWorkBuf,
                wki402MaxWrkCache = wki402MaxWrkCache,
                wki402SessTimeout = wki402SessTimeout,
                wki402SizError = wki402SizError,
                wki402NumAlerts = wki402NumAlerts,
                wki402NumServices = wki402NumServices,
                wki402ErrlogSz = wki402ErrlogSz,
                wki402PrintBufTime = wki402PrintBufTime,
                wki402NumCharBuf = wki402NumCharBuf,
                wki402SizCharBuf = wki402SizCharBuf,
                wki402WrkHeuristicsCtorArg = wki402WrkHeuristics,
                wki402Mailslots = wki402Mailslots,
                wki402NumDgramBuf = wki402NumDgramBuf,
                wki402MaxThreads = wki402MaxThreads,
            )
    }
}

public class WkstaInfo502(
    public var wki502CharWait: UInt = 0u,
    public var wki502CollectionTime: UInt = 0u,
    public var wki502MaximumCollectionCount: UInt = 0u,
    public var wki502KeepConn: UInt = 0u,
    public var wki502MaxCmds: UInt = 0u,
    public var wki502SessTimeout: UInt = 0u,
    public var wki502SizCharBuf: UInt = 0u,
    public var wki502MaxThreads: UInt = 0u,
    public var wki502LockQuota: UInt = 0u,
    public var wki502LockIncrement: UInt = 0u,
    public var wki502LockMaximum: UInt = 0u,
    public var wki502PipeIncrement: UInt = 0u,
    public var wki502PipeMaximum: UInt = 0u,
    public var wki502CacheFileTimeout: UInt = 0u,
    public var wki502DormantFileLimit: UInt = 0u,
    public var wki502ReadAheadThroughput: UInt = 0u,
    public var wki502NumMailslotBuffers: UInt = 0u,
    public var wki502NumSrvAnnounceBuffers: UInt = 0u,
    public var wki502MaxIllegalDatagramEvents: UInt = 0u,
    public var wki502IllegalDatagramEventResetFrequency: UInt = 0u,
    public var wki502LogElectionPackets: Bool = 0,
    public var wki502UseOpportunisticLocking: Bool = 0,
    public var wki502UseUnlockBehind: Bool = 0,
    public var wki502UseCloseBehind: Bool = 0,
    public var wki502BufNamedPipes: Bool = 0,
    public var wki502UseLockReadUnlock: Bool = 0,
    public var wki502UtilizeNtCaching: Bool = 0,
    public var wki502UseRawRead: Bool = 0,
    public var wki502UseRawWrite: Bool = 0,
    public var wki502UseWriteRawData: Bool = 0,
    public var wki502UseEncryption: Bool = 0,
    public var wki502BufFilesDenyWrite: Bool = 0,
    public var wki502BufReadOnlyFiles: Bool = 0,
    public var wki502ForceCoreCreateMode: Bool = 0,
    public var wki502Use512ByteMaxTransfer: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo502> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WkstaInfo502> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 140L
                override fun readNative(addr: Long): WkstaInfo502 =
                    WkstaInfo502(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: WkstaInfo502) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wki502CharWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.wki502CollectionTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.wki502MaximumCollectionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.wki502KeepConn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.wki502MaxCmds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.wki502SessTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.wki502SizCharBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.wki502MaxThreads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.wki502LockQuota)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.wki502LockIncrement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.wki502LockMaximum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.wki502PipeIncrement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.wki502PipeMaximum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.wki502CacheFileTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.wki502DormantFileLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.wki502ReadAheadThroughput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.wki502NumMailslotBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.wki502NumSrvAnnounceBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.wki502MaxIllegalDatagramEvents)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.wki502IllegalDatagramEventResetFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 80L, value.wki502LogElectionPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 84L, value.wki502UseOpportunisticLocking)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.wki502UseUnlockBehind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 92L, value.wki502UseCloseBehind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.wki502BufNamedPipes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 100L, value.wki502UseLockReadUnlock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 104L, value.wki502UtilizeNtCaching)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 108L, value.wki502UseRawRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 112L, value.wki502UseRawWrite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 116L, value.wki502UseWriteRawData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.wki502UseEncryption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 124L, value.wki502BufFilesDenyWrite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 128L, value.wki502BufReadOnlyFiles)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 132L, value.wki502ForceCoreCreateMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 136L, value.wki502Use512ByteMaxTransfer)
                }
            }
    }
}

public class WkstaTransportInfo0 internal constructor(
    public var wkti0QualityOfService: UInt,
    public var wkti0NumberOfVcs: UInt,
    wkti0TransportNameCtorArg: Pwstr,
    wkti0TransportAddressCtorArg: Pwstr,
    public var wkti0WanIsh: Bool,
) {
    public var wkti0TransportName: Pwstr = wkti0TransportNameCtorArg
        internal set

    public var wkti0TransportAddress: Pwstr = wkti0TransportAddressCtorArg
        internal set

    public constructor() : this(
        wkti0QualityOfService = 0u,
        wkti0NumberOfVcs = 0u,
        wkti0TransportNameCtorArg = MutPtr(0L),
        wkti0TransportAddressCtorArg = MutPtr(0L),
        wkti0WanIsh = 0,
    )

    public operator fun component1(): UInt = this.wkti0QualityOfService

    public operator fun component2(): UInt = this.wkti0NumberOfVcs

    public operator fun component3(): Pwstr = this.wkti0TransportName

    public operator fun component4(): Pwstr = this.wkti0TransportAddress

    public operator fun component5(): Bool = this.wkti0WanIsh

    public fun copy(wkti0QualityOfService: UInt = this.wkti0QualityOfService, wkti0NumberOfVcs: UInt = this.wkti0NumberOfVcs, wkti0TransportName: Pwstr = this.wkti0TransportName, wkti0TransportAddress: Pwstr = this.wkti0TransportAddress, wkti0WanIsh: Bool = this.wkti0WanIsh): WkstaTransportInfo0 = WkstaTransportInfo0(wkti0QualityOfService = wkti0QualityOfService, wkti0NumberOfVcs = wkti0NumberOfVcs, wkti0TransportNameCtorArg = wkti0TransportName, wkti0TransportAddressCtorArg = wkti0TransportAddress, wkti0WanIsh = wkti0WanIsh)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WkstaTransportInfo0) return false
        if (this.wkti0QualityOfService != other.wkti0QualityOfService) return false
        if (this.wkti0NumberOfVcs != other.wkti0NumberOfVcs) return false
        if (this.wkti0TransportName != other.wkti0TransportName) return false
        if (this.wkti0TransportAddress != other.wkti0TransportAddress) return false
        if (this.wkti0WanIsh != other.wkti0WanIsh) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wkti0QualityOfService.hashCode()
        result = 31 * result + this.wkti0NumberOfVcs.hashCode()
        result = 31 * result + this.wkti0TransportName.hashCode()
        result = 31 * result + this.wkti0TransportAddress.hashCode()
        result = 31 * result + this.wkti0WanIsh.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wkti0QualityOfService: UInt = 0u,
            wkti0NumberOfVcs: UInt = 0u,
            wkti0TransportName: Pwstr = MutPtr(0L),
            wkti0TransportAddress: Pwstr = MutPtr(0L),
            wkti0WanIsh: Bool = 0,
        ): WkstaTransportInfo0 =
            WkstaTransportInfo0(
                wkti0QualityOfService = wkti0QualityOfService,
                wkti0NumberOfVcs = wkti0NumberOfVcs,
                wkti0TransportNameCtorArg = wkti0TransportName,
                wkti0TransportAddressCtorArg = wkti0TransportAddress,
                wkti0WanIsh = wkti0WanIsh,
            )
    }
}

public class WkstaUserInfo0 internal constructor(
    wkui0UsernameCtorArg: Pwstr,
) {
    public var wkui0Username: Pwstr = wkui0UsernameCtorArg
        internal set

    public constructor() : this(
        wkui0UsernameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.wkui0Username

    public fun copy(wkui0Username: Pwstr = this.wkui0Username): WkstaUserInfo0 = WkstaUserInfo0(wkui0UsernameCtorArg = wkui0Username)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WkstaUserInfo0) return false
        if (this.wkui0Username != other.wkui0Username) return false
        return true
    }

    override fun hashCode(): Int = this.wkui0Username.hashCode()

    public companion object {
        public operator fun invoke(
            wkui0Username: Pwstr = MutPtr(0L),
        ): WkstaUserInfo0 =
            WkstaUserInfo0(
                wkui0UsernameCtorArg = wkui0Username,
            )
    }
}

public class WkstaUserInfo1 internal constructor(
    wkui1UsernameCtorArg: Pwstr,
    wkui1LogonDomainCtorArg: Pwstr,
    wkui1OthDomainsCtorArg: Pwstr,
    wkui1LogonServerCtorArg: Pwstr,
) {
    public var wkui1Username: Pwstr = wkui1UsernameCtorArg
        internal set

    public var wkui1LogonDomain: Pwstr = wkui1LogonDomainCtorArg
        internal set

    public var wkui1OthDomains: Pwstr = wkui1OthDomainsCtorArg
        internal set

    public var wkui1LogonServer: Pwstr = wkui1LogonServerCtorArg
        internal set

    public constructor() : this(
        wkui1UsernameCtorArg = MutPtr(0L),
        wkui1LogonDomainCtorArg = MutPtr(0L),
        wkui1OthDomainsCtorArg = MutPtr(0L),
        wkui1LogonServerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.wkui1Username

    public operator fun component2(): Pwstr = this.wkui1LogonDomain

    public operator fun component3(): Pwstr = this.wkui1OthDomains

    public operator fun component4(): Pwstr = this.wkui1LogonServer

    public fun copy(wkui1Username: Pwstr = this.wkui1Username, wkui1LogonDomain: Pwstr = this.wkui1LogonDomain, wkui1OthDomains: Pwstr = this.wkui1OthDomains, wkui1LogonServer: Pwstr = this.wkui1LogonServer): WkstaUserInfo1 = WkstaUserInfo1(wkui1UsernameCtorArg = wkui1Username, wkui1LogonDomainCtorArg = wkui1LogonDomain, wkui1OthDomainsCtorArg = wkui1OthDomains, wkui1LogonServerCtorArg = wkui1LogonServer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WkstaUserInfo1) return false
        if (this.wkui1Username != other.wkui1Username) return false
        if (this.wkui1LogonDomain != other.wkui1LogonDomain) return false
        if (this.wkui1OthDomains != other.wkui1OthDomains) return false
        if (this.wkui1LogonServer != other.wkui1LogonServer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wkui1Username.hashCode()
        result = 31 * result + this.wkui1LogonDomain.hashCode()
        result = 31 * result + this.wkui1OthDomains.hashCode()
        result = 31 * result + this.wkui1LogonServer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wkui1Username: Pwstr = MutPtr(0L),
            wkui1LogonDomain: Pwstr = MutPtr(0L),
            wkui1OthDomains: Pwstr = MutPtr(0L),
            wkui1LogonServer: Pwstr = MutPtr(0L),
        ): WkstaUserInfo1 =
            WkstaUserInfo1(
                wkui1UsernameCtorArg = wkui1Username,
                wkui1LogonDomainCtorArg = wkui1LogonDomain,
                wkui1OthDomainsCtorArg = wkui1OthDomains,
                wkui1LogonServerCtorArg = wkui1LogonServer,
            )
    }
}

public class WkstaUserInfo1101 internal constructor(
    wkui1101OthDomainsCtorArg: Pwstr,
) {
    public var wkui1101OthDomains: Pwstr = wkui1101OthDomainsCtorArg
        internal set

    public constructor() : this(
        wkui1101OthDomainsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.wkui1101OthDomains

    public fun copy(wkui1101OthDomains: Pwstr = this.wkui1101OthDomains): WkstaUserInfo1101 = WkstaUserInfo1101(wkui1101OthDomainsCtorArg = wkui1101OthDomains)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WkstaUserInfo1101) return false
        if (this.wkui1101OthDomains != other.wkui1101OthDomains) return false
        return true
    }

    override fun hashCode(): Int = this.wkui1101OthDomains.hashCode()

    public companion object {
        public operator fun invoke(
            wkui1101OthDomains: Pwstr = MutPtr(0L),
        ): WkstaUserInfo1101 =
            WkstaUserInfo1101(
                wkui1101OthDomainsCtorArg = wkui1101OthDomains,
            )
    }
}
