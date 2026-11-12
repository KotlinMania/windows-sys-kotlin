@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.display.FdKerningpair
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodea
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodew
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Panose
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Dlgproc
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public class AddjobInfo1a internal constructor(
    pathCtorArg: Pstr,
    public var jobId: UInt,
) {
    public var path: Pstr = pathCtorArg
        internal set

    public constructor() : this(
        pathCtorArg = MutPtr(0L),
        jobId = 0u,
    )

    public operator fun component1(): Pstr = this.path

    public operator fun component2(): UInt = this.jobId

    public fun copy(path: Pstr = this.path, jobId: UInt = this.jobId): AddjobInfo1a = AddjobInfo1a(pathCtorArg = path, jobId = jobId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AddjobInfo1a) return false
        if (this.path != other.path) return false
        if (this.jobId != other.jobId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.path.hashCode()
        result = 31 * result + this.jobId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            path: Pstr = MutPtr(0L),
            jobId: UInt = 0u,
        ): AddjobInfo1a =
            AddjobInfo1a(
                pathCtorArg = path,
                jobId = jobId,
            )
    }
}

public class AddjobInfo1w internal constructor(
    pathCtorArg: Pwstr,
    public var jobId: UInt,
) {
    public var path: Pwstr = pathCtorArg
        internal set

    public constructor() : this(
        pathCtorArg = MutPtr(0L),
        jobId = 0u,
    )

    public operator fun component1(): Pwstr = this.path

    public operator fun component2(): UInt = this.jobId

    public fun copy(path: Pwstr = this.path, jobId: UInt = this.jobId): AddjobInfo1w = AddjobInfo1w(pathCtorArg = path, jobId = jobId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AddjobInfo1w) return false
        if (this.path != other.path) return false
        if (this.jobId != other.jobId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.path.hashCode()
        result = 31 * result + this.jobId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            path: Pwstr = MutPtr(0L),
            jobId: UInt = 0u,
        ): AddjobInfo1w =
            AddjobInfo1w(
                pathCtorArg = path,
                jobId = jobId,
            )
    }
}

public data class AttributeInfo1(
    public var dwJobNumberOfPagesPerSide: UInt = 0u,
    public var dwDrvNumberOfPagesPerSide: UInt = 0u,
    public var dwNupBorderFlags: UInt = 0u,
    public var dwJobPageOrderFlags: UInt = 0u,
    public var dwDrvPageOrderFlags: UInt = 0u,
    public var dwJobNumberOfCopies: UInt = 0u,
    public var dwDrvNumberOfCopies: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttributeInfo1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttributeInfo1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): AttributeInfo1 =
                    AttributeInfo1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: AttributeInfo1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwJobNumberOfPagesPerSide)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDrvNumberOfPagesPerSide)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNupBorderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwJobPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDrvPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwJobNumberOfCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwDrvNumberOfCopies)
                }
            }
    }
}

public data class AttributeInfo2(
    public var dwJobNumberOfPagesPerSide: UInt = 0u,
    public var dwDrvNumberOfPagesPerSide: UInt = 0u,
    public var dwNupBorderFlags: UInt = 0u,
    public var dwJobPageOrderFlags: UInt = 0u,
    public var dwDrvPageOrderFlags: UInt = 0u,
    public var dwJobNumberOfCopies: UInt = 0u,
    public var dwDrvNumberOfCopies: UInt = 0u,
    public var dwColorOptimization: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttributeInfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttributeInfo2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): AttributeInfo2 =
                    AttributeInfo2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: AttributeInfo2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwJobNumberOfPagesPerSide)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDrvNumberOfPagesPerSide)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNupBorderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwJobPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDrvPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwJobNumberOfCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwDrvNumberOfCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwColorOptimization)
                }
            }
    }
}

public data class AttributeInfo3(
    public var dwJobNumberOfPagesPerSide: UInt = 0u,
    public var dwDrvNumberOfPagesPerSide: UInt = 0u,
    public var dwNupBorderFlags: UInt = 0u,
    public var dwJobPageOrderFlags: UInt = 0u,
    public var dwDrvPageOrderFlags: UInt = 0u,
    public var dwJobNumberOfCopies: UInt = 0u,
    public var dwDrvNumberOfCopies: UInt = 0u,
    public var dwColorOptimization: UInt = 0u,
    public var dmPrintQuality: Short = 0,
    public var dmYResolution: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttributeInfo3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttributeInfo3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): AttributeInfo3 =
                    AttributeInfo3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 34L),
                    )
                override fun writeNative(addr: Long, value: AttributeInfo3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwJobNumberOfPagesPerSide)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDrvNumberOfPagesPerSide)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNupBorderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwJobPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDrvPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwJobNumberOfCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwDrvNumberOfCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwColorOptimization)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 32L, value.dmPrintQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 34L, value.dmYResolution)
                }
            }
    }
}

public data class AttributeInfo4(
    public var dwJobNumberOfPagesPerSide: UInt = 0u,
    public var dwDrvNumberOfPagesPerSide: UInt = 0u,
    public var dwNupBorderFlags: UInt = 0u,
    public var dwJobPageOrderFlags: UInt = 0u,
    public var dwDrvPageOrderFlags: UInt = 0u,
    public var dwJobNumberOfCopies: UInt = 0u,
    public var dwDrvNumberOfCopies: UInt = 0u,
    public var dwColorOptimization: UInt = 0u,
    public var dmPrintQuality: Short = 0,
    public var dmYResolution: Short = 0,
    public var dwDuplexFlags: UInt = 0u,
    public var dwNupDirection: UInt = 0u,
    public var dwBookletFlags: UInt = 0u,
    public var dwScalingPercentX: UInt = 0u,
    public var dwScalingPercentY: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttributeInfo4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttributeInfo4> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): AttributeInfo4 =
                    AttributeInfo4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: AttributeInfo4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwJobNumberOfPagesPerSide)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDrvNumberOfPagesPerSide)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNupBorderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwJobPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDrvPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwJobNumberOfCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwDrvNumberOfCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwColorOptimization)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 32L, value.dmPrintQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 34L, value.dmYResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwDuplexFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwNupDirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwBookletFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwScalingPercentX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwScalingPercentY)
                }
            }
    }
}

public data class BidiData(
    public var dwBidiType: UInt = 0u,
    public var u: BidiData0 = BidiData0(),
)

public class BidiData0 internal constructor(
    public var bData: Bool,
    public var iData: Int,
    sDataCtorArg: Pwstr,
    public var fData: Float,
    public var biData: BinaryContainer,
) {
    public var sData: Pwstr = sDataCtorArg
        internal set

    public constructor() : this(
        bData = 0,
        iData = 0,
        sDataCtorArg = MutPtr(0L),
        fData = 0.0f,
        biData = BinaryContainer(),
    )

    public operator fun component1(): Bool = this.bData

    public operator fun component2(): Int = this.iData

    public operator fun component3(): Pwstr = this.sData

    public operator fun component4(): Float = this.fData

    public operator fun component5(): BinaryContainer = this.biData

    public fun copy(bData: Bool = this.bData, iData: Int = this.iData, sData: Pwstr = this.sData, fData: Float = this.fData, biData: BinaryContainer = this.biData): BidiData0 = BidiData0(bData = bData, iData = iData, sDataCtorArg = sData, fData = fData, biData = biData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BidiData0) return false
        if (this.bData != other.bData) return false
        if (this.iData != other.iData) return false
        if (this.sData != other.sData) return false
        if (this.fData != other.fData) return false
        if (this.biData != other.biData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bData.hashCode()
        result = 31 * result + this.iData.hashCode()
        result = 31 * result + this.sData.hashCode()
        result = 31 * result + this.fData.hashCode()
        result = 31 * result + this.biData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            bData: Bool = 0,
            iData: Int = 0,
            sData: Pwstr = MutPtr(0L),
            fData: Float = 0.0f,
            biData: BinaryContainer = BinaryContainer(),
        ): BidiData0 =
            BidiData0(
                bData = bData,
                iData = iData,
                sDataCtorArg = sData,
                fData = fData,
                biData = biData,
            )
    }
}

public data class BidiRequestContainer(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var count: UInt = 0u,
    public var aData: List<BidiRequestData> = List(1) { BidiRequestData() },
)

public class BidiRequestData internal constructor(
    public var dwReqNumber: UInt,
    pSchemaCtorArg: Pwstr,
    public var data: BidiData,
) {
    public var pSchema: Pwstr = pSchemaCtorArg
        internal set

    public constructor() : this(
        dwReqNumber = 0u,
        pSchemaCtorArg = MutPtr(0L),
        data = BidiData(),
    )

    public operator fun component1(): UInt = this.dwReqNumber

    public operator fun component2(): Pwstr = this.pSchema

    public operator fun component3(): BidiData = this.data

    public fun copy(dwReqNumber: UInt = this.dwReqNumber, pSchema: Pwstr = this.pSchema, data: BidiData = this.data): BidiRequestData = BidiRequestData(dwReqNumber = dwReqNumber, pSchemaCtorArg = pSchema, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BidiRequestData) return false
        if (this.dwReqNumber != other.dwReqNumber) return false
        if (this.pSchema != other.pSchema) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwReqNumber.hashCode()
        result = 31 * result + this.pSchema.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwReqNumber: UInt = 0u,
            pSchema: Pwstr = MutPtr(0L),
            data: BidiData = BidiData(),
        ): BidiRequestData =
            BidiRequestData(
                dwReqNumber = dwReqNumber,
                pSchemaCtorArg = pSchema,
                data = data,
            )
    }
}

public data class BidiResponseContainer(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var count: UInt = 0u,
    public var aData: List<BidiResponseData> = List(1) { BidiResponseData() },
)

public class BidiResponseData internal constructor(
    public var dwResult: UInt,
    public var dwReqNumber: UInt,
    pSchemaCtorArg: Pwstr,
    public var data: BidiData,
) {
    public var pSchema: Pwstr = pSchemaCtorArg
        internal set

    public constructor() : this(
        dwResult = 0u,
        dwReqNumber = 0u,
        pSchemaCtorArg = MutPtr(0L),
        data = BidiData(),
    )

    public operator fun component1(): UInt = this.dwResult

    public operator fun component2(): UInt = this.dwReqNumber

    public operator fun component3(): Pwstr = this.pSchema

    public operator fun component4(): BidiData = this.data

    public fun copy(dwResult: UInt = this.dwResult, dwReqNumber: UInt = this.dwReqNumber, pSchema: Pwstr = this.pSchema, data: BidiData = this.data): BidiResponseData = BidiResponseData(dwResult = dwResult, dwReqNumber = dwReqNumber, pSchemaCtorArg = pSchema, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BidiResponseData) return false
        if (this.dwResult != other.dwResult) return false
        if (this.dwReqNumber != other.dwReqNumber) return false
        if (this.pSchema != other.pSchema) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwResult.hashCode()
        result = 31 * result + this.dwReqNumber.hashCode()
        result = 31 * result + this.pSchema.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwResult: UInt = 0u,
            dwReqNumber: UInt = 0u,
            pSchema: Pwstr = MutPtr(0L),
            data: BidiData = BidiData(),
        ): BidiResponseData =
            BidiResponseData(
                dwResult = dwResult,
                dwReqNumber = dwReqNumber,
                pSchemaCtorArg = pSchema,
                data = data,
            )
    }
}

public class BinaryContainer internal constructor(
    public var cbBuf: UInt,
    pDataCtorArg: MutPtr<UByte>,
) {
    public var pData: MutPtr<UByte> = pDataCtorArg
        internal set

    public constructor() : this(
        cbBuf = 0u,
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbBuf

    public operator fun component2(): MutPtr<UByte> = this.pData

    public fun copy(cbBuf: UInt = this.cbBuf, pData: MutPtr<UByte> = this.pData): BinaryContainer = BinaryContainer(cbBuf = cbBuf, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BinaryContainer) return false
        if (this.cbBuf != other.cbBuf) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbBuf.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinaryContainer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinaryContainer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BinaryContainer =
                    BinaryContainer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BinaryContainer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbBuf)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pData)
                }
            }

        public operator fun invoke(
            cbBuf: UInt = 0u,
            pData: MutPtr<UByte> = MutPtr(0L),
        ): BinaryContainer =
            BinaryContainer(
                cbBuf = cbBuf,
                pDataCtorArg = pData,
            )
    }
}

public data class BranchOfficeJobData(
    public var eEventType: EBranchOfficeJobEventType = 0,
    public var jobId: UInt = 0u,
    public var jobInfo: BranchOfficeJobData0 = BranchOfficeJobData0(),
)

public data class BranchOfficeJobData0(
    public var logJobPrinted: BranchOfficeJobDataPrinted = BranchOfficeJobDataPrinted(),
    public var logJobRendered: BranchOfficeJobDataRendered = BranchOfficeJobDataRendered(),
    public var logJobError: BranchOfficeJobDataError = BranchOfficeJobDataError(),
    public var logPipelineFailed: BranchOfficeJobDataPipelineFailed = BranchOfficeJobDataPipelineFailed(),
    public var logOfflineFileFull: BranchOfficeLogOfflineFileFull = BranchOfficeLogOfflineFileFull(),
)

public data class BranchOfficeJobDataContainer(
    public var cJobDataEntries: UInt = 0u,
    public var jobData: List<BranchOfficeJobData> = List(1) { BranchOfficeJobData() },
)

public class BranchOfficeJobDataError internal constructor(
    public var lastError: UInt,
    pDocumentNameCtorArg: Pwstr,
    pUserNameCtorArg: Pwstr,
    pPrinterNameCtorArg: Pwstr,
    pDataTypeCtorArg: Pwstr,
    public var totalSize: Long,
    public var printedSize: Long,
    public var totalPages: UInt,
    public var printedPages: UInt,
    pMachineNameCtorArg: Pwstr,
    pJobErrorCtorArg: Pwstr,
    pErrorDescriptionCtorArg: Pwstr,
) {
    public var pDocumentName: Pwstr = pDocumentNameCtorArg
        internal set

    public var pUserName: Pwstr = pUserNameCtorArg
        internal set

    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var pDataType: Pwstr = pDataTypeCtorArg
        internal set

    public var pMachineName: Pwstr = pMachineNameCtorArg
        internal set

    public var pJobError: Pwstr = pJobErrorCtorArg
        internal set

    public var pErrorDescription: Pwstr = pErrorDescriptionCtorArg
        internal set

    public constructor() : this(
        lastError = 0u,
        pDocumentNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pPrinterNameCtorArg = MutPtr(0L),
        pDataTypeCtorArg = MutPtr(0L),
        totalSize = 0L,
        printedSize = 0L,
        totalPages = 0u,
        printedPages = 0u,
        pMachineNameCtorArg = MutPtr(0L),
        pJobErrorCtorArg = MutPtr(0L),
        pErrorDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.lastError

    public operator fun component2(): Pwstr = this.pDocumentName

    public operator fun component3(): Pwstr = this.pUserName

    public operator fun component4(): Pwstr = this.pPrinterName

    public operator fun component5(): Pwstr = this.pDataType

    public operator fun component6(): Long = this.totalSize

    public operator fun component7(): Long = this.printedSize

    public operator fun component8(): UInt = this.totalPages

    public operator fun component9(): UInt = this.printedPages

    public operator fun component10(): Pwstr = this.pMachineName

    public operator fun component11(): Pwstr = this.pJobError

    public operator fun component12(): Pwstr = this.pErrorDescription

    public fun copy(lastError: UInt = this.lastError, pDocumentName: Pwstr = this.pDocumentName, pUserName: Pwstr = this.pUserName, pPrinterName: Pwstr = this.pPrinterName, pDataType: Pwstr = this.pDataType, totalSize: Long = this.totalSize, printedSize: Long = this.printedSize, totalPages: UInt = this.totalPages, printedPages: UInt = this.printedPages, pMachineName: Pwstr = this.pMachineName, pJobError: Pwstr = this.pJobError, pErrorDescription: Pwstr = this.pErrorDescription): BranchOfficeJobDataError = BranchOfficeJobDataError(lastError = lastError, pDocumentNameCtorArg = pDocumentName, pUserNameCtorArg = pUserName, pPrinterNameCtorArg = pPrinterName, pDataTypeCtorArg = pDataType, totalSize = totalSize, printedSize = printedSize, totalPages = totalPages, printedPages = printedPages, pMachineNameCtorArg = pMachineName, pJobErrorCtorArg = pJobError, pErrorDescriptionCtorArg = pErrorDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BranchOfficeJobDataError) return false
        if (this.lastError != other.lastError) return false
        if (this.pDocumentName != other.pDocumentName) return false
        if (this.pUserName != other.pUserName) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pDataType != other.pDataType) return false
        if (this.totalSize != other.totalSize) return false
        if (this.printedSize != other.printedSize) return false
        if (this.totalPages != other.totalPages) return false
        if (this.printedPages != other.printedPages) return false
        if (this.pMachineName != other.pMachineName) return false
        if (this.pJobError != other.pJobError) return false
        if (this.pErrorDescription != other.pErrorDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastError.hashCode()
        result = 31 * result + this.pDocumentName.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.pPrinterName.hashCode()
        result = 31 * result + this.pDataType.hashCode()
        result = 31 * result + this.totalSize.hashCode()
        result = 31 * result + this.printedSize.hashCode()
        result = 31 * result + this.totalPages.hashCode()
        result = 31 * result + this.printedPages.hashCode()
        result = 31 * result + this.pMachineName.hashCode()
        result = 31 * result + this.pJobError.hashCode()
        result = 31 * result + this.pErrorDescription.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lastError: UInt = 0u,
            pDocumentName: Pwstr = MutPtr(0L),
            pUserName: Pwstr = MutPtr(0L),
            pPrinterName: Pwstr = MutPtr(0L),
            pDataType: Pwstr = MutPtr(0L),
            totalSize: Long = 0L,
            printedSize: Long = 0L,
            totalPages: UInt = 0u,
            printedPages: UInt = 0u,
            pMachineName: Pwstr = MutPtr(0L),
            pJobError: Pwstr = MutPtr(0L),
            pErrorDescription: Pwstr = MutPtr(0L),
        ): BranchOfficeJobDataError =
            BranchOfficeJobDataError(
                lastError = lastError,
                pDocumentNameCtorArg = pDocumentName,
                pUserNameCtorArg = pUserName,
                pPrinterNameCtorArg = pPrinterName,
                pDataTypeCtorArg = pDataType,
                totalSize = totalSize,
                printedSize = printedSize,
                totalPages = totalPages,
                printedPages = printedPages,
                pMachineNameCtorArg = pMachineName,
                pJobErrorCtorArg = pJobError,
                pErrorDescriptionCtorArg = pErrorDescription,
            )
    }
}

public class BranchOfficeJobDataPipelineFailed internal constructor(
    pDocumentNameCtorArg: Pwstr,
    pPrinterNameCtorArg: Pwstr,
    pExtraErrorInfoCtorArg: Pwstr,
) {
    public var pDocumentName: Pwstr = pDocumentNameCtorArg
        internal set

    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var pExtraErrorInfo: Pwstr = pExtraErrorInfoCtorArg
        internal set

    public constructor() : this(
        pDocumentNameCtorArg = MutPtr(0L),
        pPrinterNameCtorArg = MutPtr(0L),
        pExtraErrorInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pDocumentName

    public operator fun component2(): Pwstr = this.pPrinterName

    public operator fun component3(): Pwstr = this.pExtraErrorInfo

    public fun copy(pDocumentName: Pwstr = this.pDocumentName, pPrinterName: Pwstr = this.pPrinterName, pExtraErrorInfo: Pwstr = this.pExtraErrorInfo): BranchOfficeJobDataPipelineFailed = BranchOfficeJobDataPipelineFailed(pDocumentNameCtorArg = pDocumentName, pPrinterNameCtorArg = pPrinterName, pExtraErrorInfoCtorArg = pExtraErrorInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BranchOfficeJobDataPipelineFailed) return false
        if (this.pDocumentName != other.pDocumentName) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pExtraErrorInfo != other.pExtraErrorInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDocumentName.hashCode()
        result = 31 * result + this.pPrinterName.hashCode()
        result = 31 * result + this.pExtraErrorInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDocumentName: Pwstr = MutPtr(0L),
            pPrinterName: Pwstr = MutPtr(0L),
            pExtraErrorInfo: Pwstr = MutPtr(0L),
        ): BranchOfficeJobDataPipelineFailed =
            BranchOfficeJobDataPipelineFailed(
                pDocumentNameCtorArg = pDocumentName,
                pPrinterNameCtorArg = pPrinterName,
                pExtraErrorInfoCtorArg = pExtraErrorInfo,
            )
    }
}

public class BranchOfficeJobDataPrinted internal constructor(
    public var status: UInt,
    pDocumentNameCtorArg: Pwstr,
    pUserNameCtorArg: Pwstr,
    pMachineNameCtorArg: Pwstr,
    pPrinterNameCtorArg: Pwstr,
    pPortNameCtorArg: Pwstr,
    public var size: Long,
    public var totalPages: UInt,
) {
    public var pDocumentName: Pwstr = pDocumentNameCtorArg
        internal set

    public var pUserName: Pwstr = pUserNameCtorArg
        internal set

    public var pMachineName: Pwstr = pMachineNameCtorArg
        internal set

    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var pPortName: Pwstr = pPortNameCtorArg
        internal set

    public constructor() : this(
        status = 0u,
        pDocumentNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pMachineNameCtorArg = MutPtr(0L),
        pPrinterNameCtorArg = MutPtr(0L),
        pPortNameCtorArg = MutPtr(0L),
        size = 0L,
        totalPages = 0u,
    )

    public operator fun component1(): UInt = this.status

    public operator fun component2(): Pwstr = this.pDocumentName

    public operator fun component3(): Pwstr = this.pUserName

    public operator fun component4(): Pwstr = this.pMachineName

    public operator fun component5(): Pwstr = this.pPrinterName

    public operator fun component6(): Pwstr = this.pPortName

    public operator fun component7(): Long = this.size

    public operator fun component8(): UInt = this.totalPages

    public fun copy(status: UInt = this.status, pDocumentName: Pwstr = this.pDocumentName, pUserName: Pwstr = this.pUserName, pMachineName: Pwstr = this.pMachineName, pPrinterName: Pwstr = this.pPrinterName, pPortName: Pwstr = this.pPortName, size: Long = this.size, totalPages: UInt = this.totalPages): BranchOfficeJobDataPrinted = BranchOfficeJobDataPrinted(status = status, pDocumentNameCtorArg = pDocumentName, pUserNameCtorArg = pUserName, pMachineNameCtorArg = pMachineName, pPrinterNameCtorArg = pPrinterName, pPortNameCtorArg = pPortName, size = size, totalPages = totalPages)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BranchOfficeJobDataPrinted) return false
        if (this.status != other.status) return false
        if (this.pDocumentName != other.pDocumentName) return false
        if (this.pUserName != other.pUserName) return false
        if (this.pMachineName != other.pMachineName) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pPortName != other.pPortName) return false
        if (this.size != other.size) return false
        if (this.totalPages != other.totalPages) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.pDocumentName.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.pMachineName.hashCode()
        result = 31 * result + this.pPrinterName.hashCode()
        result = 31 * result + this.pPortName.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.totalPages.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            status: UInt = 0u,
            pDocumentName: Pwstr = MutPtr(0L),
            pUserName: Pwstr = MutPtr(0L),
            pMachineName: Pwstr = MutPtr(0L),
            pPrinterName: Pwstr = MutPtr(0L),
            pPortName: Pwstr = MutPtr(0L),
            size: Long = 0L,
            totalPages: UInt = 0u,
        ): BranchOfficeJobDataPrinted =
            BranchOfficeJobDataPrinted(
                status = status,
                pDocumentNameCtorArg = pDocumentName,
                pUserNameCtorArg = pUserName,
                pMachineNameCtorArg = pMachineName,
                pPrinterNameCtorArg = pPrinterName,
                pPortNameCtorArg = pPortName,
                size = size,
                totalPages = totalPages,
            )
    }
}

public data class BranchOfficeJobDataRendered(
    public var size: Long = 0L,
    public var iCMMethod: UInt = 0u,
    public var color: Short = 0,
    public var printQuality: Short = 0,
    public var yResolution: Short = 0,
    public var copies: Short = 0,
    public var tTOption: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BranchOfficeJobDataRendered> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BranchOfficeJobDataRendered> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): BranchOfficeJobDataRendered =
                    BranchOfficeJobDataRendered(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: BranchOfficeJobDataRendered) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.iCMMethod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.color)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 14L, value.printQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.yResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 18L, value.copies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 20L, value.tTOption)
                }
            }
    }
}

public class BranchOfficeLogOfflineFileFull internal constructor(
    pMachineNameCtorArg: Pwstr,
) {
    public var pMachineName: Pwstr = pMachineNameCtorArg
        internal set

    public constructor() : this(
        pMachineNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pMachineName

    public fun copy(pMachineName: Pwstr = this.pMachineName): BranchOfficeLogOfflineFileFull = BranchOfficeLogOfflineFileFull(pMachineNameCtorArg = pMachineName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BranchOfficeLogOfflineFileFull) return false
        if (this.pMachineName != other.pMachineName) return false
        return true
    }

    override fun hashCode(): Int = this.pMachineName.hashCode()

    public companion object {
        public operator fun invoke(
            pMachineName: Pwstr = MutPtr(0L),
        ): BranchOfficeLogOfflineFileFull =
            BranchOfficeLogOfflineFileFull(
                pMachineNameCtorArg = pMachineName,
            )
    }
}

public class Compropsheetui internal constructor(
    public var cbSize: UShort,
    public var flags: UShort,
    hInstCallerCtorArg: Hinstance,
    pCallerNameCtorArg: MutPtr<Byte>,
    public var userData: Int,
    pHelpFileCtorArg: MutPtr<Byte>,
    public var pfnCallBack: Cpsuicallback,
    pOptItemCtorArg: MutPtr<Optitem>,
    pDlgPageCtorArg: MutPtr<Dlgpage>,
    public var cOptItem: UShort,
    public var cDlgPage: UShort,
    public var iconID: Int,
    pOptItemNameCtorArg: MutPtr<Byte>,
    public var callerVersion: UShort,
    public var optItemVersion: UShort,
    public var dwReserved: IntArray,
) {
    public var hInstCaller: Hinstance = hInstCallerCtorArg
        internal set

    public var pCallerName: MutPtr<Byte> = pCallerNameCtorArg
        internal set

    public var pHelpFile: MutPtr<Byte> = pHelpFileCtorArg
        internal set

    public var pOptItem: MutPtr<Optitem> = pOptItemCtorArg
        internal set

    public var pDlgPage: MutPtr<Dlgpage> = pDlgPageCtorArg
        internal set

    public var pOptItemName: MutPtr<Byte> = pOptItemNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        hInstCallerCtorArg = MutPtr(0L),
        pCallerNameCtorArg = MutPtr(0L),
        userData = 0,
        pHelpFileCtorArg = MutPtr(0L),
        pfnCallBack = null,
        pOptItemCtorArg = MutPtr(0L),
        pDlgPageCtorArg = MutPtr(0L),
        cOptItem = 0u,
        cDlgPage = 0u,
        iconID = 0,
        pOptItemNameCtorArg = MutPtr(0L),
        callerVersion = 0u,
        optItemVersion = 0u,
        dwReserved = IntArray(4),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): Hinstance = this.hInstCaller

    public operator fun component4(): MutPtr<Byte> = this.pCallerName

    public operator fun component5(): Int = this.userData

    public operator fun component6(): MutPtr<Byte> = this.pHelpFile

    public operator fun component7(): Cpsuicallback = this.pfnCallBack

    public operator fun component8(): MutPtr<Optitem> = this.pOptItem

    public operator fun component9(): MutPtr<Dlgpage> = this.pDlgPage

    public operator fun component10(): UShort = this.cOptItem

    public operator fun component11(): UShort = this.cDlgPage

    public operator fun component12(): Int = this.iconID

    public operator fun component13(): MutPtr<Byte> = this.pOptItemName

    public operator fun component14(): UShort = this.callerVersion

    public operator fun component15(): UShort = this.optItemVersion

    public operator fun component16(): IntArray = this.dwReserved

    public fun copy(cbSize: UShort = this.cbSize, flags: UShort = this.flags, hInstCaller: Hinstance = this.hInstCaller, pCallerName: MutPtr<Byte> = this.pCallerName, userData: Int = this.userData, pHelpFile: MutPtr<Byte> = this.pHelpFile, pfnCallBack: Cpsuicallback = this.pfnCallBack, pOptItem: MutPtr<Optitem> = this.pOptItem, pDlgPage: MutPtr<Dlgpage> = this.pDlgPage, cOptItem: UShort = this.cOptItem, cDlgPage: UShort = this.cDlgPage, iconID: Int = this.iconID, pOptItemName: MutPtr<Byte> = this.pOptItemName, callerVersion: UShort = this.callerVersion, optItemVersion: UShort = this.optItemVersion, dwReserved: IntArray = this.dwReserved): Compropsheetui = Compropsheetui(cbSize = cbSize, flags = flags, hInstCallerCtorArg = hInstCaller, pCallerNameCtorArg = pCallerName, userData = userData, pHelpFileCtorArg = pHelpFile, pfnCallBack = pfnCallBack, pOptItemCtorArg = pOptItem, pDlgPageCtorArg = pDlgPage, cOptItem = cOptItem, cDlgPage = cDlgPage, iconID = iconID, pOptItemNameCtorArg = pOptItemName, callerVersion = callerVersion, optItemVersion = optItemVersion, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Compropsheetui) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.hInstCaller != other.hInstCaller) return false
        if (this.pCallerName != other.pCallerName) return false
        if (this.userData != other.userData) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (this.pfnCallBack != other.pfnCallBack) return false
        if (this.pOptItem != other.pOptItem) return false
        if (this.pDlgPage != other.pDlgPage) return false
        if (this.cOptItem != other.cOptItem) return false
        if (this.cDlgPage != other.cDlgPage) return false
        if (this.iconID != other.iconID) return false
        if (this.pOptItemName != other.pOptItemName) return false
        if (this.callerVersion != other.callerVersion) return false
        if (this.optItemVersion != other.optItemVersion) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hInstCaller.hashCode()
        result = 31 * result + this.pCallerName.hashCode()
        result = 31 * result + this.userData.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.pfnCallBack.hashCode()
        result = 31 * result + this.pOptItem.hashCode()
        result = 31 * result + this.pDlgPage.hashCode()
        result = 31 * result + this.cOptItem.hashCode()
        result = 31 * result + this.cDlgPage.hashCode()
        result = 31 * result + this.iconID.hashCode()
        result = 31 * result + this.pOptItemName.hashCode()
        result = 31 * result + this.callerVersion.hashCode()
        result = 31 * result + this.optItemVersion.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            flags: UShort = 0u,
            hInstCaller: Hinstance = MutPtr(0L),
            pCallerName: MutPtr<Byte> = MutPtr(0L),
            userData: Int = 0,
            pHelpFile: MutPtr<Byte> = MutPtr(0L),
            pfnCallBack: Cpsuicallback = null,
            pOptItem: MutPtr<Optitem> = MutPtr(0L),
            pDlgPage: MutPtr<Dlgpage> = MutPtr(0L),
            cOptItem: UShort = 0u,
            cDlgPage: UShort = 0u,
            iconID: Int = 0,
            pOptItemName: MutPtr<Byte> = MutPtr(0L),
            callerVersion: UShort = 0u,
            optItemVersion: UShort = 0u,
            dwReserved: IntArray = IntArray(4),
        ): Compropsheetui =
            Compropsheetui(
                cbSize = cbSize,
                flags = flags,
                hInstCallerCtorArg = hInstCaller,
                pCallerNameCtorArg = pCallerName,
                userData = userData,
                pHelpFileCtorArg = pHelpFile,
                pfnCallBack = pfnCallBack,
                pOptItemCtorArg = pOptItem,
                pDlgPageCtorArg = pDlgPage,
                cOptItem = cOptItem,
                cDlgPage = cDlgPage,
                iconID = iconID,
                pOptItemNameCtorArg = pOptItemName,
                callerVersion = callerVersion,
                optItemVersion = optItemVersion,
                dwReserved = dwReserved,
            )
    }
}

public data class ConfigInfoData1(
    public var reserved: UByteArray = UByteArray(128),
    public var dwVersion: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConfigInfoData1) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.dwVersion != other.dwVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.contentHashCode()
        result = 31 * result + this.dwVersion.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConfigInfoData1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConfigInfoData1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 132L
                override fun readNative(addr: Long): ConfigInfoData1 =
                    ConfigInfoData1(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: ConfigInfoData1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.dwVersion)
                }
            }
    }
}

public data class CorePrinterDrivera(
    public var coreDriverGUID: Guid = Guid(),
    public var ftDriverDate: Filetime = Filetime(),
    public var dwlDriverVersion: ULong = 0uL,
    public var szPackageID: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CorePrinterDrivera) return false
        if (this.coreDriverGUID != other.coreDriverGUID) return false
        if (this.ftDriverDate != other.ftDriverDate) return false
        if (this.dwlDriverVersion != other.dwlDriverVersion) return false
        if (!this.szPackageID.contentEquals(other.szPackageID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.coreDriverGUID.hashCode()
        result = 31 * result + this.ftDriverDate.hashCode()
        result = 31 * result + this.dwlDriverVersion.hashCode()
        result = 31 * result + this.szPackageID.contentHashCode()
        return result
    }
}

public data class CorePrinterDriverw(
    public var coreDriverGUID: Guid = Guid(),
    public var ftDriverDate: Filetime = Filetime(),
    public var dwlDriverVersion: ULong = 0uL,
    public var szPackageID: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CorePrinterDriverw) return false
        if (this.coreDriverGUID != other.coreDriverGUID) return false
        if (this.ftDriverDate != other.ftDriverDate) return false
        if (this.dwlDriverVersion != other.dwlDriverVersion) return false
        if (!this.szPackageID.contentEquals(other.szPackageID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.coreDriverGUID.hashCode()
        result = 31 * result + this.ftDriverDate.hashCode()
        result = 31 * result + this.dwlDriverVersion.hashCode()
        result = 31 * result + this.szPackageID.contentHashCode()
        return result
    }
}

public class Cpsuicbparam internal constructor(
    public var cbSize: UShort,
    public var reason: UShort,
    hDlgCtorArg: Hwnd,
    pOptItemCtorArg: MutPtr<Optitem>,
    public var cOptItem: UShort,
    public var flags: UShort,
    pCurItemCtorArg: MutPtr<Optitem>,
    public var anonymous: Cpsuicbparam0,
    public var userData: Int,
    public var result: Int,
) {
    public var hDlg: Hwnd = hDlgCtorArg
        internal set

    public var pOptItem: MutPtr<Optitem> = pOptItemCtorArg
        internal set

    public var pCurItem: MutPtr<Optitem> = pCurItemCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        reason = 0u,
        hDlgCtorArg = MutPtr(0L),
        pOptItemCtorArg = MutPtr(0L),
        cOptItem = 0u,
        flags = 0u,
        pCurItemCtorArg = MutPtr(0L),
        anonymous = Cpsuicbparam0(),
        userData = 0,
        result = 0,
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.reason

    public operator fun component3(): Hwnd = this.hDlg

    public operator fun component4(): MutPtr<Optitem> = this.pOptItem

    public operator fun component5(): UShort = this.cOptItem

    public operator fun component6(): UShort = this.flags

    public operator fun component7(): MutPtr<Optitem> = this.pCurItem

    public operator fun component8(): Cpsuicbparam0 = this.anonymous

    public operator fun component9(): Int = this.userData

    public operator fun component10(): Int = this.result

    public fun copy(cbSize: UShort = this.cbSize, reason: UShort = this.reason, hDlg: Hwnd = this.hDlg, pOptItem: MutPtr<Optitem> = this.pOptItem, cOptItem: UShort = this.cOptItem, flags: UShort = this.flags, pCurItem: MutPtr<Optitem> = this.pCurItem, anonymous: Cpsuicbparam0 = this.anonymous, userData: Int = this.userData, result: Int = this.result): Cpsuicbparam = Cpsuicbparam(cbSize = cbSize, reason = reason, hDlgCtorArg = hDlg, pOptItemCtorArg = pOptItem, cOptItem = cOptItem, flags = flags, pCurItemCtorArg = pCurItem, anonymous = anonymous, userData = userData, result = result)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cpsuicbparam) return false
        if (this.cbSize != other.cbSize) return false
        if (this.reason != other.reason) return false
        if (this.hDlg != other.hDlg) return false
        if (this.pOptItem != other.pOptItem) return false
        if (this.cOptItem != other.cOptItem) return false
        if (this.flags != other.flags) return false
        if (this.pCurItem != other.pCurItem) return false
        if (this.anonymous != other.anonymous) return false
        if (this.userData != other.userData) return false
        if (this.result != other.result) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.hDlg.hashCode()
        result = 31 * result + this.pOptItem.hashCode()
        result = 31 * result + this.cOptItem.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pCurItem.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.userData.hashCode()
        result = 31 * result + this.result.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            reason: UShort = 0u,
            hDlg: Hwnd = MutPtr(0L),
            pOptItem: MutPtr<Optitem> = MutPtr(0L),
            cOptItem: UShort = 0u,
            flags: UShort = 0u,
            pCurItem: MutPtr<Optitem> = MutPtr(0L),
            anonymous: Cpsuicbparam0 = Cpsuicbparam0(),
            userData: Int = 0,
            result: Int = 0,
        ): Cpsuicbparam =
            Cpsuicbparam(
                cbSize = cbSize,
                reason = reason,
                hDlgCtorArg = hDlg,
                pOptItemCtorArg = pOptItem,
                cOptItem = cOptItem,
                flags = flags,
                pCurItemCtorArg = pCurItem,
                anonymous = anonymous,
                userData = userData,
                result = result,
            )
    }
}

public class Cpsuicbparam0 internal constructor(
    public var oldSel: Int,
    pOldSelCtorArg: MutPtr<Byte>,
) {
    public var pOldSel: MutPtr<Byte> = pOldSelCtorArg
        internal set

    public constructor() : this(
        oldSel = 0,
        pOldSelCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.oldSel

    public operator fun component2(): MutPtr<Byte> = this.pOldSel

    public fun copy(oldSel: Int = this.oldSel, pOldSel: MutPtr<Byte> = this.pOldSel): Cpsuicbparam0 = Cpsuicbparam0(oldSel = oldSel, pOldSelCtorArg = pOldSel)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cpsuicbparam0) return false
        if (this.oldSel != other.oldSel) return false
        if (this.pOldSel != other.pOldSel) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oldSel.hashCode()
        result = 31 * result + this.pOldSel.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            oldSel: Int = 0,
            pOldSel: MutPtr<Byte> = MutPtr(0L),
        ): Cpsuicbparam0 =
            Cpsuicbparam0(
                oldSel = oldSel,
                pOldSelCtorArg = pOldSel,
            )
    }
}

public class Cpsuidatablock internal constructor(
    public var cbData: UInt,
    pbDataCtorArg: MutPtr<UByte>,
) {
    public var pbData: MutPtr<UByte> = pbDataCtorArg
        internal set

    public constructor() : this(
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbData

    public operator fun component2(): MutPtr<UByte> = this.pbData

    public fun copy(cbData: UInt = this.cbData, pbData: MutPtr<UByte> = this.pbData): Cpsuidatablock = Cpsuidatablock(cbData = cbData, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cpsuidatablock) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cpsuidatablock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cpsuidatablock> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cpsuidatablock =
                    Cpsuidatablock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cpsuidatablock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbData)
                }
            }

        public operator fun invoke(
            cbData: UInt = 0u,
            pbData: MutPtr<UByte> = MutPtr(0L),
        ): Cpsuidatablock =
            Cpsuidatablock(
                cbData = cbData,
                pbDataCtorArg = pbData,
            )
    }
}

public data class Customsizeparam(
    public var dwOrder: Int = 0,
    public var lMinVal: Int = 0,
    public var lMaxVal: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Customsizeparam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Customsizeparam> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Customsizeparam =
                    Customsizeparam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Customsizeparam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dwOrder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lMinVal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lMaxVal)
                }
            }
    }
}

public class DatatypesInfo1a internal constructor(
    pNameCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pName

    public fun copy(pName: Pstr = this.pName): DatatypesInfo1a = DatatypesInfo1a(pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DatatypesInfo1a) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int = this.pName.hashCode()

    public companion object {
        public operator fun invoke(
            pName: Pstr = MutPtr(0L),
        ): DatatypesInfo1a =
            DatatypesInfo1a(
                pNameCtorArg = pName,
            )
    }
}

public class DatatypesInfo1w internal constructor(
    pNameCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pName

    public fun copy(pName: Pwstr = this.pName): DatatypesInfo1w = DatatypesInfo1w(pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DatatypesInfo1w) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int = this.pName.hashCode()

    public companion object {
        public operator fun invoke(
            pName: Pwstr = MutPtr(0L),
        ): DatatypesInfo1w =
            DatatypesInfo1w(
                pNameCtorArg = pName,
            )
    }
}

public data class DataHeader(
    public var dwSignature: UInt = 0u,
    public var wSize: UShort = 0u,
    public var wDataID: UShort = 0u,
    public var dwDataSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DataHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DataHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DataHeader =
                    DataHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DataHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wDataID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwReserved)
                }
            }
    }
}

public data class DeletePortData1(
    public var psztPortName: UShortArray = UShortArray(64),
    public var reserved: UByteArray = UByteArray(98),
    public var dwVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeletePortData1) return false
        if (!this.psztPortName.contentEquals(other.psztPortName)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.psztPortName.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeletePortData1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeletePortData1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 236L
                override fun readNative(addr: Long): DeletePortData1 =
                    DeletePortData1(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (98).toInt())
                        ).readNative(addr + 128L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 228L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 232L),
                    )
                override fun writeNative(addr: Long, value: DeletePortData1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr, value.psztPortName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (98).toInt())
                    ).writeNative(addr + 128L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 228L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 232L, value.dwReserved)
                }
            }
    }
}

public class Devicepropertyheader internal constructor(
    public var cbSize: UShort,
    public var flags: UShort,
    hPrinterCtorArg: Handle,
    pszPrinterNameCtorArg: MutPtr<Byte>,
) {
    public var hPrinter: Handle = hPrinterCtorArg
        internal set

    public var pszPrinterName: MutPtr<Byte> = pszPrinterNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        hPrinterCtorArg = MutPtr(0L),
        pszPrinterNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): Handle = this.hPrinter

    public operator fun component4(): MutPtr<Byte> = this.pszPrinterName

    public fun copy(cbSize: UShort = this.cbSize, flags: UShort = this.flags, hPrinter: Handle = this.hPrinter, pszPrinterName: MutPtr<Byte> = this.pszPrinterName): Devicepropertyheader = Devicepropertyheader(cbSize = cbSize, flags = flags, hPrinterCtorArg = hPrinter, pszPrinterNameCtorArg = pszPrinterName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Devicepropertyheader) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.hPrinter != other.hPrinter) return false
        if (this.pszPrinterName != other.pszPrinterName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hPrinter.hashCode()
        result = 31 * result + this.pszPrinterName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            flags: UShort = 0u,
            hPrinter: Handle = MutPtr(0L),
            pszPrinterName: MutPtr<Byte> = MutPtr(0L),
        ): Devicepropertyheader =
            Devicepropertyheader(
                cbSize = cbSize,
                flags = flags,
                hPrinterCtorArg = hPrinter,
                pszPrinterNameCtorArg = pszPrinterName,
            )
    }
}

public class DevqueryprintInfo internal constructor(
    public var cbSize: UShort,
    public var level: UShort,
    hPrinterCtorArg: Handle,
    pDevModeCtorArg: MutPtr<Devmodea>,
    pszErrorStrCtorArg: Pwstr,
    public var cchErrorStr: UInt,
    public var cchNeeded: UInt,
) {
    public var hPrinter: Handle = hPrinterCtorArg
        internal set

    public var pDevMode: MutPtr<Devmodea> = pDevModeCtorArg
        internal set

    public var pszErrorStr: Pwstr = pszErrorStrCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        level = 0u,
        hPrinterCtorArg = MutPtr(0L),
        pDevModeCtorArg = MutPtr(0L),
        pszErrorStrCtorArg = MutPtr(0L),
        cchErrorStr = 0u,
        cchNeeded = 0u,
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.level

    public operator fun component3(): Handle = this.hPrinter

    public operator fun component4(): MutPtr<Devmodea> = this.pDevMode

    public operator fun component5(): Pwstr = this.pszErrorStr

    public operator fun component6(): UInt = this.cchErrorStr

    public operator fun component7(): UInt = this.cchNeeded

    public fun copy(cbSize: UShort = this.cbSize, level: UShort = this.level, hPrinter: Handle = this.hPrinter, pDevMode: MutPtr<Devmodea> = this.pDevMode, pszErrorStr: Pwstr = this.pszErrorStr, cchErrorStr: UInt = this.cchErrorStr, cchNeeded: UInt = this.cchNeeded): DevqueryprintInfo = DevqueryprintInfo(cbSize = cbSize, level = level, hPrinterCtorArg = hPrinter, pDevModeCtorArg = pDevMode, pszErrorStrCtorArg = pszErrorStr, cchErrorStr = cchErrorStr, cchNeeded = cchNeeded)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevqueryprintInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.level != other.level) return false
        if (this.hPrinter != other.hPrinter) return false
        if (this.pDevMode != other.pDevMode) return false
        if (this.pszErrorStr != other.pszErrorStr) return false
        if (this.cchErrorStr != other.cchErrorStr) return false
        if (this.cchNeeded != other.cchNeeded) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.hPrinter.hashCode()
        result = 31 * result + this.pDevMode.hashCode()
        result = 31 * result + this.pszErrorStr.hashCode()
        result = 31 * result + this.cchErrorStr.hashCode()
        result = 31 * result + this.cchNeeded.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            level: UShort = 0u,
            hPrinter: Handle = MutPtr(0L),
            pDevMode: MutPtr<Devmodea> = MutPtr(0L),
            pszErrorStr: Pwstr = MutPtr(0L),
            cchErrorStr: UInt = 0u,
            cchNeeded: UInt = 0u,
        ): DevqueryprintInfo =
            DevqueryprintInfo(
                cbSize = cbSize,
                level = level,
                hPrinterCtorArg = hPrinter,
                pDevModeCtorArg = pDevMode,
                pszErrorStrCtorArg = pszErrorStr,
                cchErrorStr = cchErrorStr,
                cchNeeded = cchNeeded,
            )
    }
}

public class Dlgpage internal constructor(
    public var cbSize: UShort,
    public var flags: UShort,
    public var dlgProc: Dlgproc,
    pTabNameCtorArg: MutPtr<Byte>,
    public var iconID: Int,
    public var anonymous: Dlgpage0,
) {
    public var pTabName: MutPtr<Byte> = pTabNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        dlgProc = null,
        pTabNameCtorArg = MutPtr(0L),
        iconID = 0,
        anonymous = Dlgpage0(),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): Dlgproc = this.dlgProc

    public operator fun component4(): MutPtr<Byte> = this.pTabName

    public operator fun component5(): Int = this.iconID

    public operator fun component6(): Dlgpage0 = this.anonymous

    public fun copy(cbSize: UShort = this.cbSize, flags: UShort = this.flags, dlgProc: Dlgproc = this.dlgProc, pTabName: MutPtr<Byte> = this.pTabName, iconID: Int = this.iconID, anonymous: Dlgpage0 = this.anonymous): Dlgpage = Dlgpage(cbSize = cbSize, flags = flags, dlgProc = dlgProc, pTabNameCtorArg = pTabName, iconID = iconID, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dlgpage) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.dlgProc != other.dlgProc) return false
        if (this.pTabName != other.pTabName) return false
        if (this.iconID != other.iconID) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dlgProc.hashCode()
        result = 31 * result + this.pTabName.hashCode()
        result = 31 * result + this.iconID.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            flags: UShort = 0u,
            dlgProc: Dlgproc = null,
            pTabName: MutPtr<Byte> = MutPtr(0L),
            iconID: Int = 0,
            anonymous: Dlgpage0 = Dlgpage0(),
        ): Dlgpage =
            Dlgpage(
                cbSize = cbSize,
                flags = flags,
                dlgProc = dlgProc,
                pTabNameCtorArg = pTabName,
                iconID = iconID,
                anonymous = anonymous,
            )
    }
}

public class Dlgpage0 internal constructor(
    public var dlgTemplateID: UShort,
    hDlgTemplateCtorArg: Handle,
) {
    public var hDlgTemplate: Handle = hDlgTemplateCtorArg
        internal set

    public constructor() : this(
        dlgTemplateID = 0u,
        hDlgTemplateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.dlgTemplateID

    public operator fun component2(): Handle = this.hDlgTemplate

    public fun copy(dlgTemplateID: UShort = this.dlgTemplateID, hDlgTemplate: Handle = this.hDlgTemplate): Dlgpage0 = Dlgpage0(dlgTemplateID = dlgTemplateID, hDlgTemplateCtorArg = hDlgTemplate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dlgpage0) return false
        if (this.dlgTemplateID != other.dlgTemplateID) return false
        if (this.hDlgTemplate != other.hDlgTemplate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dlgTemplateID.hashCode()
        result = 31 * result + this.hDlgTemplate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dlgTemplateID: UShort = 0u,
            hDlgTemplate: Handle = MutPtr(0L),
        ): Dlgpage0 =
            Dlgpage0(
                dlgTemplateID = dlgTemplateID,
                hDlgTemplateCtorArg = hDlgTemplate,
            )
    }
}

public class DoceventCreatedcpre internal constructor(
    pszDriverCtorArg: Pwstr,
    pszDeviceCtorArg: Pwstr,
    pdmCtorArg: MutPtr<Devmodew>,
    public var bIC: Bool,
) {
    public var pszDriver: Pwstr = pszDriverCtorArg
        internal set

    public var pszDevice: Pwstr = pszDeviceCtorArg
        internal set

    public var pdm: MutPtr<Devmodew> = pdmCtorArg
        internal set

    public constructor() : this(
        pszDriverCtorArg = MutPtr(0L),
        pszDeviceCtorArg = MutPtr(0L),
        pdmCtorArg = MutPtr(0L),
        bIC = 0,
    )

    public operator fun component1(): Pwstr = this.pszDriver

    public operator fun component2(): Pwstr = this.pszDevice

    public operator fun component3(): MutPtr<Devmodew> = this.pdm

    public operator fun component4(): Bool = this.bIC

    public fun copy(pszDriver: Pwstr = this.pszDriver, pszDevice: Pwstr = this.pszDevice, pdm: MutPtr<Devmodew> = this.pdm, bIC: Bool = this.bIC): DoceventCreatedcpre = DoceventCreatedcpre(pszDriverCtorArg = pszDriver, pszDeviceCtorArg = pszDevice, pdmCtorArg = pdm, bIC = bIC)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DoceventCreatedcpre) return false
        if (this.pszDriver != other.pszDriver) return false
        if (this.pszDevice != other.pszDevice) return false
        if (this.pdm != other.pdm) return false
        if (this.bIC != other.bIC) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszDriver.hashCode()
        result = 31 * result + this.pszDevice.hashCode()
        result = 31 * result + this.pdm.hashCode()
        result = 31 * result + this.bIC.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszDriver: Pwstr = MutPtr(0L),
            pszDevice: Pwstr = MutPtr(0L),
            pdm: MutPtr<Devmodew> = MutPtr(0L),
            bIC: Bool = 0,
        ): DoceventCreatedcpre =
            DoceventCreatedcpre(
                pszDriverCtorArg = pszDriver,
                pszDeviceCtorArg = pszDevice,
                pdmCtorArg = pdm,
                bIC = bIC,
            )
    }
}

public class DoceventEscape internal constructor(
    public var iEscape: Int,
    public var cjInput: Int,
    pvInDataCtorArg: MutPtr<CVoid>,
) {
    public var pvInData: MutPtr<CVoid> = pvInDataCtorArg
        internal set

    public constructor() : this(
        iEscape = 0,
        cjInput = 0,
        pvInDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.iEscape

    public operator fun component2(): Int = this.cjInput

    public operator fun component3(): MutPtr<CVoid> = this.pvInData

    public fun copy(iEscape: Int = this.iEscape, cjInput: Int = this.cjInput, pvInData: MutPtr<CVoid> = this.pvInData): DoceventEscape = DoceventEscape(iEscape = iEscape, cjInput = cjInput, pvInDataCtorArg = pvInData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DoceventEscape) return false
        if (this.iEscape != other.iEscape) return false
        if (this.cjInput != other.cjInput) return false
        if (this.pvInData != other.pvInData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iEscape.hashCode()
        result = 31 * result + this.cjInput.hashCode()
        result = 31 * result + this.pvInData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DoceventEscape> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DoceventEscape> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DoceventEscape =
                    DoceventEscape(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DoceventEscape) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iEscape)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cjInput)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pvInData)
                }
            }

        public operator fun invoke(
            iEscape: Int = 0,
            cjInput: Int = 0,
            pvInData: MutPtr<CVoid> = MutPtr(0L),
        ): DoceventEscape =
            DoceventEscape(
                iEscape = iEscape,
                cjInput = cjInput,
                pvInDataCtorArg = pvInData,
            )
    }
}

public data class DoceventFilter(
    public var cbSize: UInt = 0u,
    public var cElementsAllocated: UInt = 0u,
    public var cElementsNeeded: UInt = 0u,
    public var cElementsReturned: UInt = 0u,
    public var aDocEventCall: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DoceventFilter) return false
        if (this.cbSize != other.cbSize) return false
        if (this.cElementsAllocated != other.cElementsAllocated) return false
        if (this.cElementsNeeded != other.cElementsNeeded) return false
        if (this.cElementsReturned != other.cElementsReturned) return false
        if (!this.aDocEventCall.contentEquals(other.aDocEventCall)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.cElementsAllocated.hashCode()
        result = 31 * result + this.cElementsNeeded.hashCode()
        result = 31 * result + this.cElementsReturned.hashCode()
        result = 31 * result + this.aDocEventCall.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DoceventFilter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DoceventFilter> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DoceventFilter =
                    DoceventFilter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: DoceventFilter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cElementsAllocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cElementsNeeded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cElementsReturned)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 16L, value.aDocEventCall.toList())
                }
            }
    }
}

public class Documentpropertyheader internal constructor(
    public var cbSize: UShort,
    public var reserved: UShort,
    hPrinterCtorArg: Handle,
    pszPrinterNameCtorArg: MutPtr<Byte>,
    pdmInCtorArg: MutPtr<Devmodea>,
    pdmOutCtorArg: MutPtr<Devmodea>,
    public var cbOut: UInt,
    public var fMode: UInt,
) {
    public var hPrinter: Handle = hPrinterCtorArg
        internal set

    public var pszPrinterName: MutPtr<Byte> = pszPrinterNameCtorArg
        internal set

    public var pdmIn: MutPtr<Devmodea> = pdmInCtorArg
        internal set

    public var pdmOut: MutPtr<Devmodea> = pdmOutCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        reserved = 0u,
        hPrinterCtorArg = MutPtr(0L),
        pszPrinterNameCtorArg = MutPtr(0L),
        pdmInCtorArg = MutPtr(0L),
        pdmOutCtorArg = MutPtr(0L),
        cbOut = 0u,
        fMode = 0u,
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.reserved

    public operator fun component3(): Handle = this.hPrinter

    public operator fun component4(): MutPtr<Byte> = this.pszPrinterName

    public operator fun component5(): MutPtr<Devmodea> = this.pdmIn

    public operator fun component6(): MutPtr<Devmodea> = this.pdmOut

    public operator fun component7(): UInt = this.cbOut

    public operator fun component8(): UInt = this.fMode

    public fun copy(cbSize: UShort = this.cbSize, reserved: UShort = this.reserved, hPrinter: Handle = this.hPrinter, pszPrinterName: MutPtr<Byte> = this.pszPrinterName, pdmIn: MutPtr<Devmodea> = this.pdmIn, pdmOut: MutPtr<Devmodea> = this.pdmOut, cbOut: UInt = this.cbOut, fMode: UInt = this.fMode): Documentpropertyheader = Documentpropertyheader(cbSize = cbSize, reserved = reserved, hPrinterCtorArg = hPrinter, pszPrinterNameCtorArg = pszPrinterName, pdmInCtorArg = pdmIn, pdmOutCtorArg = pdmOut, cbOut = cbOut, fMode = fMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Documentpropertyheader) return false
        if (this.cbSize != other.cbSize) return false
        if (this.reserved != other.reserved) return false
        if (this.hPrinter != other.hPrinter) return false
        if (this.pszPrinterName != other.pszPrinterName) return false
        if (this.pdmIn != other.pdmIn) return false
        if (this.pdmOut != other.pdmOut) return false
        if (this.cbOut != other.cbOut) return false
        if (this.fMode != other.fMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.hPrinter.hashCode()
        result = 31 * result + this.pszPrinterName.hashCode()
        result = 31 * result + this.pdmIn.hashCode()
        result = 31 * result + this.pdmOut.hashCode()
        result = 31 * result + this.cbOut.hashCode()
        result = 31 * result + this.fMode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            reserved: UShort = 0u,
            hPrinter: Handle = MutPtr(0L),
            pszPrinterName: MutPtr<Byte> = MutPtr(0L),
            pdmIn: MutPtr<Devmodea> = MutPtr(0L),
            pdmOut: MutPtr<Devmodea> = MutPtr(0L),
            cbOut: UInt = 0u,
            fMode: UInt = 0u,
        ): Documentpropertyheader =
            Documentpropertyheader(
                cbSize = cbSize,
                reserved = reserved,
                hPrinterCtorArg = hPrinter,
                pszPrinterNameCtorArg = pszPrinterName,
                pdmInCtorArg = pdmIn,
                pdmOutCtorArg = pdmOut,
                cbOut = cbOut,
                fMode = fMode,
            )
    }
}

public class DocInfo1a internal constructor(
    pDocNameCtorArg: Pstr,
    pOutputFileCtorArg: Pstr,
    pDatatypeCtorArg: Pstr,
) {
    public var pDocName: Pstr = pDocNameCtorArg
        internal set

    public var pOutputFile: Pstr = pOutputFileCtorArg
        internal set

    public var pDatatype: Pstr = pDatatypeCtorArg
        internal set

    public constructor() : this(
        pDocNameCtorArg = MutPtr(0L),
        pOutputFileCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pDocName

    public operator fun component2(): Pstr = this.pOutputFile

    public operator fun component3(): Pstr = this.pDatatype

    public fun copy(pDocName: Pstr = this.pDocName, pOutputFile: Pstr = this.pOutputFile, pDatatype: Pstr = this.pDatatype): DocInfo1a = DocInfo1a(pDocNameCtorArg = pDocName, pOutputFileCtorArg = pOutputFile, pDatatypeCtorArg = pDatatype)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DocInfo1a) return false
        if (this.pDocName != other.pDocName) return false
        if (this.pOutputFile != other.pOutputFile) return false
        if (this.pDatatype != other.pDatatype) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDocName.hashCode()
        result = 31 * result + this.pOutputFile.hashCode()
        result = 31 * result + this.pDatatype.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDocName: Pstr = MutPtr(0L),
            pOutputFile: Pstr = MutPtr(0L),
            pDatatype: Pstr = MutPtr(0L),
        ): DocInfo1a =
            DocInfo1a(
                pDocNameCtorArg = pDocName,
                pOutputFileCtorArg = pOutputFile,
                pDatatypeCtorArg = pDatatype,
            )
    }
}

public class DocInfo1w internal constructor(
    pDocNameCtorArg: Pwstr,
    pOutputFileCtorArg: Pwstr,
    pDatatypeCtorArg: Pwstr,
) {
    public var pDocName: Pwstr = pDocNameCtorArg
        internal set

    public var pOutputFile: Pwstr = pOutputFileCtorArg
        internal set

    public var pDatatype: Pwstr = pDatatypeCtorArg
        internal set

    public constructor() : this(
        pDocNameCtorArg = MutPtr(0L),
        pOutputFileCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pDocName

    public operator fun component2(): Pwstr = this.pOutputFile

    public operator fun component3(): Pwstr = this.pDatatype

    public fun copy(pDocName: Pwstr = this.pDocName, pOutputFile: Pwstr = this.pOutputFile, pDatatype: Pwstr = this.pDatatype): DocInfo1w = DocInfo1w(pDocNameCtorArg = pDocName, pOutputFileCtorArg = pOutputFile, pDatatypeCtorArg = pDatatype)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DocInfo1w) return false
        if (this.pDocName != other.pDocName) return false
        if (this.pOutputFile != other.pOutputFile) return false
        if (this.pDatatype != other.pDatatype) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDocName.hashCode()
        result = 31 * result + this.pOutputFile.hashCode()
        result = 31 * result + this.pDatatype.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDocName: Pwstr = MutPtr(0L),
            pOutputFile: Pwstr = MutPtr(0L),
            pDatatype: Pwstr = MutPtr(0L),
        ): DocInfo1w =
            DocInfo1w(
                pDocNameCtorArg = pDocName,
                pOutputFileCtorArg = pOutputFile,
                pDatatypeCtorArg = pDatatype,
            )
    }
}

public class DocInfo2a internal constructor(
    pDocNameCtorArg: Pstr,
    pOutputFileCtorArg: Pstr,
    pDatatypeCtorArg: Pstr,
    public var dwMode: UInt,
    public var jobId: UInt,
) {
    public var pDocName: Pstr = pDocNameCtorArg
        internal set

    public var pOutputFile: Pstr = pOutputFileCtorArg
        internal set

    public var pDatatype: Pstr = pDatatypeCtorArg
        internal set

    public constructor() : this(
        pDocNameCtorArg = MutPtr(0L),
        pOutputFileCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        dwMode = 0u,
        jobId = 0u,
    )

    public operator fun component1(): Pstr = this.pDocName

    public operator fun component2(): Pstr = this.pOutputFile

    public operator fun component3(): Pstr = this.pDatatype

    public operator fun component4(): UInt = this.dwMode

    public operator fun component5(): UInt = this.jobId

    public fun copy(pDocName: Pstr = this.pDocName, pOutputFile: Pstr = this.pOutputFile, pDatatype: Pstr = this.pDatatype, dwMode: UInt = this.dwMode, jobId: UInt = this.jobId): DocInfo2a = DocInfo2a(pDocNameCtorArg = pDocName, pOutputFileCtorArg = pOutputFile, pDatatypeCtorArg = pDatatype, dwMode = dwMode, jobId = jobId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DocInfo2a) return false
        if (this.pDocName != other.pDocName) return false
        if (this.pOutputFile != other.pOutputFile) return false
        if (this.pDatatype != other.pDatatype) return false
        if (this.dwMode != other.dwMode) return false
        if (this.jobId != other.jobId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDocName.hashCode()
        result = 31 * result + this.pOutputFile.hashCode()
        result = 31 * result + this.pDatatype.hashCode()
        result = 31 * result + this.dwMode.hashCode()
        result = 31 * result + this.jobId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDocName: Pstr = MutPtr(0L),
            pOutputFile: Pstr = MutPtr(0L),
            pDatatype: Pstr = MutPtr(0L),
            dwMode: UInt = 0u,
            jobId: UInt = 0u,
        ): DocInfo2a =
            DocInfo2a(
                pDocNameCtorArg = pDocName,
                pOutputFileCtorArg = pOutputFile,
                pDatatypeCtorArg = pDatatype,
                dwMode = dwMode,
                jobId = jobId,
            )
    }
}

public class DocInfo2w internal constructor(
    pDocNameCtorArg: Pwstr,
    pOutputFileCtorArg: Pwstr,
    pDatatypeCtorArg: Pwstr,
    public var dwMode: UInt,
    public var jobId: UInt,
) {
    public var pDocName: Pwstr = pDocNameCtorArg
        internal set

    public var pOutputFile: Pwstr = pOutputFileCtorArg
        internal set

    public var pDatatype: Pwstr = pDatatypeCtorArg
        internal set

    public constructor() : this(
        pDocNameCtorArg = MutPtr(0L),
        pOutputFileCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        dwMode = 0u,
        jobId = 0u,
    )

    public operator fun component1(): Pwstr = this.pDocName

    public operator fun component2(): Pwstr = this.pOutputFile

    public operator fun component3(): Pwstr = this.pDatatype

    public operator fun component4(): UInt = this.dwMode

    public operator fun component5(): UInt = this.jobId

    public fun copy(pDocName: Pwstr = this.pDocName, pOutputFile: Pwstr = this.pOutputFile, pDatatype: Pwstr = this.pDatatype, dwMode: UInt = this.dwMode, jobId: UInt = this.jobId): DocInfo2w = DocInfo2w(pDocNameCtorArg = pDocName, pOutputFileCtorArg = pOutputFile, pDatatypeCtorArg = pDatatype, dwMode = dwMode, jobId = jobId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DocInfo2w) return false
        if (this.pDocName != other.pDocName) return false
        if (this.pOutputFile != other.pOutputFile) return false
        if (this.pDatatype != other.pDatatype) return false
        if (this.dwMode != other.dwMode) return false
        if (this.jobId != other.jobId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDocName.hashCode()
        result = 31 * result + this.pOutputFile.hashCode()
        result = 31 * result + this.pDatatype.hashCode()
        result = 31 * result + this.dwMode.hashCode()
        result = 31 * result + this.jobId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDocName: Pwstr = MutPtr(0L),
            pOutputFile: Pwstr = MutPtr(0L),
            pDatatype: Pwstr = MutPtr(0L),
            dwMode: UInt = 0u,
            jobId: UInt = 0u,
        ): DocInfo2w =
            DocInfo2w(
                pDocNameCtorArg = pDocName,
                pOutputFileCtorArg = pOutputFile,
                pDatatypeCtorArg = pDatatype,
                dwMode = dwMode,
                jobId = jobId,
            )
    }
}

public class DocInfo3a internal constructor(
    pDocNameCtorArg: Pstr,
    pOutputFileCtorArg: Pstr,
    pDatatypeCtorArg: Pstr,
    public var dwFlags: UInt,
) {
    public var pDocName: Pstr = pDocNameCtorArg
        internal set

    public var pOutputFile: Pstr = pOutputFileCtorArg
        internal set

    public var pDatatype: Pstr = pDatatypeCtorArg
        internal set

    public constructor() : this(
        pDocNameCtorArg = MutPtr(0L),
        pOutputFileCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): Pstr = this.pDocName

    public operator fun component2(): Pstr = this.pOutputFile

    public operator fun component3(): Pstr = this.pDatatype

    public operator fun component4(): UInt = this.dwFlags

    public fun copy(pDocName: Pstr = this.pDocName, pOutputFile: Pstr = this.pOutputFile, pDatatype: Pstr = this.pDatatype, dwFlags: UInt = this.dwFlags): DocInfo3a = DocInfo3a(pDocNameCtorArg = pDocName, pOutputFileCtorArg = pOutputFile, pDatatypeCtorArg = pDatatype, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DocInfo3a) return false
        if (this.pDocName != other.pDocName) return false
        if (this.pOutputFile != other.pOutputFile) return false
        if (this.pDatatype != other.pDatatype) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDocName.hashCode()
        result = 31 * result + this.pOutputFile.hashCode()
        result = 31 * result + this.pDatatype.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDocName: Pstr = MutPtr(0L),
            pOutputFile: Pstr = MutPtr(0L),
            pDatatype: Pstr = MutPtr(0L),
            dwFlags: UInt = 0u,
        ): DocInfo3a =
            DocInfo3a(
                pDocNameCtorArg = pDocName,
                pOutputFileCtorArg = pOutputFile,
                pDatatypeCtorArg = pDatatype,
                dwFlags = dwFlags,
            )
    }
}

public class DocInfo3w internal constructor(
    pDocNameCtorArg: Pwstr,
    pOutputFileCtorArg: Pwstr,
    pDatatypeCtorArg: Pwstr,
    public var dwFlags: UInt,
) {
    public var pDocName: Pwstr = pDocNameCtorArg
        internal set

    public var pOutputFile: Pwstr = pOutputFileCtorArg
        internal set

    public var pDatatype: Pwstr = pDatatypeCtorArg
        internal set

    public constructor() : this(
        pDocNameCtorArg = MutPtr(0L),
        pOutputFileCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.pDocName

    public operator fun component2(): Pwstr = this.pOutputFile

    public operator fun component3(): Pwstr = this.pDatatype

    public operator fun component4(): UInt = this.dwFlags

    public fun copy(pDocName: Pwstr = this.pDocName, pOutputFile: Pwstr = this.pOutputFile, pDatatype: Pwstr = this.pDatatype, dwFlags: UInt = this.dwFlags): DocInfo3w = DocInfo3w(pDocNameCtorArg = pDocName, pOutputFileCtorArg = pOutputFile, pDatatypeCtorArg = pDatatype, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DocInfo3w) return false
        if (this.pDocName != other.pDocName) return false
        if (this.pOutputFile != other.pOutputFile) return false
        if (this.pDatatype != other.pDatatype) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDocName.hashCode()
        result = 31 * result + this.pOutputFile.hashCode()
        result = 31 * result + this.pDatatype.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDocName: Pwstr = MutPtr(0L),
            pOutputFile: Pwstr = MutPtr(0L),
            pDatatype: Pwstr = MutPtr(0L),
            dwFlags: UInt = 0u,
        ): DocInfo3w =
            DocInfo3w(
                pDocNameCtorArg = pDocName,
                pOutputFileCtorArg = pOutputFile,
                pDatatypeCtorArg = pDatatype,
                dwFlags = dwFlags,
            )
    }
}

public class DocInfoInternal internal constructor(
    pDocNameCtorArg: MutPtr<Byte>,
    pOutputFileCtorArg: MutPtr<Byte>,
    pDatatypeCtorArg: MutPtr<Byte>,
    public var bLowILJob: Bool,
    hTokenLowILCtorArg: Handle,
) {
    public var pDocName: MutPtr<Byte> = pDocNameCtorArg
        internal set

    public var pOutputFile: MutPtr<Byte> = pOutputFileCtorArg
        internal set

    public var pDatatype: MutPtr<Byte> = pDatatypeCtorArg
        internal set

    public var hTokenLowIL: Handle = hTokenLowILCtorArg
        internal set

    public constructor() : this(
        pDocNameCtorArg = MutPtr(0L),
        pOutputFileCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        bLowILJob = 0,
        hTokenLowILCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.pDocName

    public operator fun component2(): MutPtr<Byte> = this.pOutputFile

    public operator fun component3(): MutPtr<Byte> = this.pDatatype

    public operator fun component4(): Bool = this.bLowILJob

    public operator fun component5(): Handle = this.hTokenLowIL

    public fun copy(pDocName: MutPtr<Byte> = this.pDocName, pOutputFile: MutPtr<Byte> = this.pOutputFile, pDatatype: MutPtr<Byte> = this.pDatatype, bLowILJob: Bool = this.bLowILJob, hTokenLowIL: Handle = this.hTokenLowIL): DocInfoInternal = DocInfoInternal(pDocNameCtorArg = pDocName, pOutputFileCtorArg = pOutputFile, pDatatypeCtorArg = pDatatype, bLowILJob = bLowILJob, hTokenLowILCtorArg = hTokenLowIL)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DocInfoInternal) return false
        if (this.pDocName != other.pDocName) return false
        if (this.pOutputFile != other.pOutputFile) return false
        if (this.pDatatype != other.pDatatype) return false
        if (this.bLowILJob != other.bLowILJob) return false
        if (this.hTokenLowIL != other.hTokenLowIL) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDocName.hashCode()
        result = 31 * result + this.pOutputFile.hashCode()
        result = 31 * result + this.pDatatype.hashCode()
        result = 31 * result + this.bLowILJob.hashCode()
        result = 31 * result + this.hTokenLowIL.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDocName: MutPtr<Byte> = MutPtr(0L),
            pOutputFile: MutPtr<Byte> = MutPtr(0L),
            pDatatype: MutPtr<Byte> = MutPtr(0L),
            bLowILJob: Bool = 0,
            hTokenLowIL: Handle = MutPtr(0L),
        ): DocInfoInternal =
            DocInfoInternal(
                pDocNameCtorArg = pDocName,
                pOutputFileCtorArg = pOutputFile,
                pDatatypeCtorArg = pDatatype,
                bLowILJob = bLowILJob,
                hTokenLowILCtorArg = hTokenLowIL,
            )
    }
}

public class DriverInfo1a internal constructor(
    pNameCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pName

    public fun copy(pName: Pstr = this.pName): DriverInfo1a = DriverInfo1a(pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverInfo1a) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int = this.pName.hashCode()

    public companion object {
        public operator fun invoke(
            pName: Pstr = MutPtr(0L),
        ): DriverInfo1a =
            DriverInfo1a(
                pNameCtorArg = pName,
            )
    }
}

public class DriverInfo1w internal constructor(
    pNameCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pName

    public fun copy(pName: Pwstr = this.pName): DriverInfo1w = DriverInfo1w(pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverInfo1w) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int = this.pName.hashCode()

    public companion object {
        public operator fun invoke(
            pName: Pwstr = MutPtr(0L),
        ): DriverInfo1w =
            DriverInfo1w(
                pNameCtorArg = pName,
            )
    }
}

public class DriverInfo2a internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pstr,
    pEnvironmentCtorArg: Pstr,
    pDriverPathCtorArg: Pstr,
    pDataFileCtorArg: Pstr,
    pConfigFileCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public var pEnvironment: Pstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pstr = pConfigFileCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cVersion

    public operator fun component2(): Pstr = this.pName

    public operator fun component3(): Pstr = this.pEnvironment

    public operator fun component4(): Pstr = this.pDriverPath

    public operator fun component5(): Pstr = this.pDataFile

    public operator fun component6(): Pstr = this.pConfigFile

    public fun copy(cVersion: UInt = this.cVersion, pName: Pstr = this.pName, pEnvironment: Pstr = this.pEnvironment, pDriverPath: Pstr = this.pDriverPath, pDataFile: Pstr = this.pDataFile, pConfigFile: Pstr = this.pConfigFile): DriverInfo2a = DriverInfo2a(cVersion = cVersion, pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDriverPathCtorArg = pDriverPath, pDataFileCtorArg = pDataFile, pConfigFileCtorArg = pConfigFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverInfo2a) return false
        if (this.cVersion != other.cVersion) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDriverPath != other.pDriverPath) return false
        if (this.pDataFile != other.pDataFile) return false
        if (this.pConfigFile != other.pConfigFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cVersion.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDriverPath.hashCode()
        result = 31 * result + this.pDataFile.hashCode()
        result = 31 * result + this.pConfigFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pstr = MutPtr(0L),
            pEnvironment: Pstr = MutPtr(0L),
            pDriverPath: Pstr = MutPtr(0L),
            pDataFile: Pstr = MutPtr(0L),
            pConfigFile: Pstr = MutPtr(0L),
        ): DriverInfo2a =
            DriverInfo2a(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
            )
    }
}

public class DriverInfo2w internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pwstr,
    pEnvironmentCtorArg: Pwstr,
    pDriverPathCtorArg: Pwstr,
    pDataFileCtorArg: Pwstr,
    pConfigFileCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public var pEnvironment: Pwstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pwstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pwstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pwstr = pConfigFileCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cVersion

    public operator fun component2(): Pwstr = this.pName

    public operator fun component3(): Pwstr = this.pEnvironment

    public operator fun component4(): Pwstr = this.pDriverPath

    public operator fun component5(): Pwstr = this.pDataFile

    public operator fun component6(): Pwstr = this.pConfigFile

    public fun copy(cVersion: UInt = this.cVersion, pName: Pwstr = this.pName, pEnvironment: Pwstr = this.pEnvironment, pDriverPath: Pwstr = this.pDriverPath, pDataFile: Pwstr = this.pDataFile, pConfigFile: Pwstr = this.pConfigFile): DriverInfo2w = DriverInfo2w(cVersion = cVersion, pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDriverPathCtorArg = pDriverPath, pDataFileCtorArg = pDataFile, pConfigFileCtorArg = pConfigFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverInfo2w) return false
        if (this.cVersion != other.cVersion) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDriverPath != other.pDriverPath) return false
        if (this.pDataFile != other.pDataFile) return false
        if (this.pConfigFile != other.pConfigFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cVersion.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDriverPath.hashCode()
        result = 31 * result + this.pDataFile.hashCode()
        result = 31 * result + this.pConfigFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pwstr = MutPtr(0L),
            pEnvironment: Pwstr = MutPtr(0L),
            pDriverPath: Pwstr = MutPtr(0L),
            pDataFile: Pwstr = MutPtr(0L),
            pConfigFile: Pwstr = MutPtr(0L),
        ): DriverInfo2w =
            DriverInfo2w(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
            )
    }
}

public class DriverInfo3a internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pstr,
    pEnvironmentCtorArg: Pstr,
    pDriverPathCtorArg: Pstr,
    pDataFileCtorArg: Pstr,
    pConfigFileCtorArg: Pstr,
    pHelpFileCtorArg: Pstr,
    pDependentFilesCtorArg: Pstr,
    pMonitorNameCtorArg: Pstr,
    pDefaultDataTypeCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public var pEnvironment: Pstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pstr = pConfigFileCtorArg
        internal set

    public var pHelpFile: Pstr = pHelpFileCtorArg
        internal set

    public var pDependentFiles: Pstr = pDependentFilesCtorArg
        internal set

    public var pMonitorName: Pstr = pMonitorNameCtorArg
        internal set

    public var pDefaultDataType: Pstr = pDefaultDataTypeCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        pHelpFileCtorArg = MutPtr(0L),
        pDependentFilesCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDefaultDataTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cVersion

    public operator fun component2(): Pstr = this.pName

    public operator fun component3(): Pstr = this.pEnvironment

    public operator fun component4(): Pstr = this.pDriverPath

    public operator fun component5(): Pstr = this.pDataFile

    public operator fun component6(): Pstr = this.pConfigFile

    public operator fun component7(): Pstr = this.pHelpFile

    public operator fun component8(): Pstr = this.pDependentFiles

    public operator fun component9(): Pstr = this.pMonitorName

    public operator fun component10(): Pstr = this.pDefaultDataType

    public fun copy(cVersion: UInt = this.cVersion, pName: Pstr = this.pName, pEnvironment: Pstr = this.pEnvironment, pDriverPath: Pstr = this.pDriverPath, pDataFile: Pstr = this.pDataFile, pConfigFile: Pstr = this.pConfigFile, pHelpFile: Pstr = this.pHelpFile, pDependentFiles: Pstr = this.pDependentFiles, pMonitorName: Pstr = this.pMonitorName, pDefaultDataType: Pstr = this.pDefaultDataType): DriverInfo3a = DriverInfo3a(cVersion = cVersion, pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDriverPathCtorArg = pDriverPath, pDataFileCtorArg = pDataFile, pConfigFileCtorArg = pConfigFile, pHelpFileCtorArg = pHelpFile, pDependentFilesCtorArg = pDependentFiles, pMonitorNameCtorArg = pMonitorName, pDefaultDataTypeCtorArg = pDefaultDataType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverInfo3a) return false
        if (this.cVersion != other.cVersion) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDriverPath != other.pDriverPath) return false
        if (this.pDataFile != other.pDataFile) return false
        if (this.pConfigFile != other.pConfigFile) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (this.pDependentFiles != other.pDependentFiles) return false
        if (this.pMonitorName != other.pMonitorName) return false
        if (this.pDefaultDataType != other.pDefaultDataType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cVersion.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDriverPath.hashCode()
        result = 31 * result + this.pDataFile.hashCode()
        result = 31 * result + this.pConfigFile.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.pDependentFiles.hashCode()
        result = 31 * result + this.pMonitorName.hashCode()
        result = 31 * result + this.pDefaultDataType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pstr = MutPtr(0L),
            pEnvironment: Pstr = MutPtr(0L),
            pDriverPath: Pstr = MutPtr(0L),
            pDataFile: Pstr = MutPtr(0L),
            pConfigFile: Pstr = MutPtr(0L),
            pHelpFile: Pstr = MutPtr(0L),
            pDependentFiles: Pstr = MutPtr(0L),
            pMonitorName: Pstr = MutPtr(0L),
            pDefaultDataType: Pstr = MutPtr(0L),
        ): DriverInfo3a =
            DriverInfo3a(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                pHelpFileCtorArg = pHelpFile,
                pDependentFilesCtorArg = pDependentFiles,
                pMonitorNameCtorArg = pMonitorName,
                pDefaultDataTypeCtorArg = pDefaultDataType,
            )
    }
}

public class DriverInfo3w internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pwstr,
    pEnvironmentCtorArg: Pwstr,
    pDriverPathCtorArg: Pwstr,
    pDataFileCtorArg: Pwstr,
    pConfigFileCtorArg: Pwstr,
    pHelpFileCtorArg: Pwstr,
    pDependentFilesCtorArg: Pwstr,
    pMonitorNameCtorArg: Pwstr,
    pDefaultDataTypeCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public var pEnvironment: Pwstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pwstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pwstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pwstr = pConfigFileCtorArg
        internal set

    public var pHelpFile: Pwstr = pHelpFileCtorArg
        internal set

    public var pDependentFiles: Pwstr = pDependentFilesCtorArg
        internal set

    public var pMonitorName: Pwstr = pMonitorNameCtorArg
        internal set

    public var pDefaultDataType: Pwstr = pDefaultDataTypeCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        pHelpFileCtorArg = MutPtr(0L),
        pDependentFilesCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDefaultDataTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cVersion

    public operator fun component2(): Pwstr = this.pName

    public operator fun component3(): Pwstr = this.pEnvironment

    public operator fun component4(): Pwstr = this.pDriverPath

    public operator fun component5(): Pwstr = this.pDataFile

    public operator fun component6(): Pwstr = this.pConfigFile

    public operator fun component7(): Pwstr = this.pHelpFile

    public operator fun component8(): Pwstr = this.pDependentFiles

    public operator fun component9(): Pwstr = this.pMonitorName

    public operator fun component10(): Pwstr = this.pDefaultDataType

    public fun copy(cVersion: UInt = this.cVersion, pName: Pwstr = this.pName, pEnvironment: Pwstr = this.pEnvironment, pDriverPath: Pwstr = this.pDriverPath, pDataFile: Pwstr = this.pDataFile, pConfigFile: Pwstr = this.pConfigFile, pHelpFile: Pwstr = this.pHelpFile, pDependentFiles: Pwstr = this.pDependentFiles, pMonitorName: Pwstr = this.pMonitorName, pDefaultDataType: Pwstr = this.pDefaultDataType): DriverInfo3w = DriverInfo3w(cVersion = cVersion, pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDriverPathCtorArg = pDriverPath, pDataFileCtorArg = pDataFile, pConfigFileCtorArg = pConfigFile, pHelpFileCtorArg = pHelpFile, pDependentFilesCtorArg = pDependentFiles, pMonitorNameCtorArg = pMonitorName, pDefaultDataTypeCtorArg = pDefaultDataType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverInfo3w) return false
        if (this.cVersion != other.cVersion) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDriverPath != other.pDriverPath) return false
        if (this.pDataFile != other.pDataFile) return false
        if (this.pConfigFile != other.pConfigFile) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (this.pDependentFiles != other.pDependentFiles) return false
        if (this.pMonitorName != other.pMonitorName) return false
        if (this.pDefaultDataType != other.pDefaultDataType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cVersion.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDriverPath.hashCode()
        result = 31 * result + this.pDataFile.hashCode()
        result = 31 * result + this.pConfigFile.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.pDependentFiles.hashCode()
        result = 31 * result + this.pMonitorName.hashCode()
        result = 31 * result + this.pDefaultDataType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pwstr = MutPtr(0L),
            pEnvironment: Pwstr = MutPtr(0L),
            pDriverPath: Pwstr = MutPtr(0L),
            pDataFile: Pwstr = MutPtr(0L),
            pConfigFile: Pwstr = MutPtr(0L),
            pHelpFile: Pwstr = MutPtr(0L),
            pDependentFiles: Pwstr = MutPtr(0L),
            pMonitorName: Pwstr = MutPtr(0L),
            pDefaultDataType: Pwstr = MutPtr(0L),
        ): DriverInfo3w =
            DriverInfo3w(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                pHelpFileCtorArg = pHelpFile,
                pDependentFilesCtorArg = pDependentFiles,
                pMonitorNameCtorArg = pMonitorName,
                pDefaultDataTypeCtorArg = pDefaultDataType,
            )
    }
}

public class DriverInfo4a internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pstr,
    pEnvironmentCtorArg: Pstr,
    pDriverPathCtorArg: Pstr,
    pDataFileCtorArg: Pstr,
    pConfigFileCtorArg: Pstr,
    pHelpFileCtorArg: Pstr,
    pDependentFilesCtorArg: Pstr,
    pMonitorNameCtorArg: Pstr,
    pDefaultDataTypeCtorArg: Pstr,
    pszzPreviousNamesCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public var pEnvironment: Pstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pstr = pConfigFileCtorArg
        internal set

    public var pHelpFile: Pstr = pHelpFileCtorArg
        internal set

    public var pDependentFiles: Pstr = pDependentFilesCtorArg
        internal set

    public var pMonitorName: Pstr = pMonitorNameCtorArg
        internal set

    public var pDefaultDataType: Pstr = pDefaultDataTypeCtorArg
        internal set

    public var pszzPreviousNames: Pstr = pszzPreviousNamesCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        pHelpFileCtorArg = MutPtr(0L),
        pDependentFilesCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDefaultDataTypeCtorArg = MutPtr(0L),
        pszzPreviousNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cVersion

    public operator fun component2(): Pstr = this.pName

    public operator fun component3(): Pstr = this.pEnvironment

    public operator fun component4(): Pstr = this.pDriverPath

    public operator fun component5(): Pstr = this.pDataFile

    public operator fun component6(): Pstr = this.pConfigFile

    public operator fun component7(): Pstr = this.pHelpFile

    public operator fun component8(): Pstr = this.pDependentFiles

    public operator fun component9(): Pstr = this.pMonitorName

    public operator fun component10(): Pstr = this.pDefaultDataType

    public operator fun component11(): Pstr = this.pszzPreviousNames

    public fun copy(cVersion: UInt = this.cVersion, pName: Pstr = this.pName, pEnvironment: Pstr = this.pEnvironment, pDriverPath: Pstr = this.pDriverPath, pDataFile: Pstr = this.pDataFile, pConfigFile: Pstr = this.pConfigFile, pHelpFile: Pstr = this.pHelpFile, pDependentFiles: Pstr = this.pDependentFiles, pMonitorName: Pstr = this.pMonitorName, pDefaultDataType: Pstr = this.pDefaultDataType, pszzPreviousNames: Pstr = this.pszzPreviousNames): DriverInfo4a = DriverInfo4a(cVersion = cVersion, pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDriverPathCtorArg = pDriverPath, pDataFileCtorArg = pDataFile, pConfigFileCtorArg = pConfigFile, pHelpFileCtorArg = pHelpFile, pDependentFilesCtorArg = pDependentFiles, pMonitorNameCtorArg = pMonitorName, pDefaultDataTypeCtorArg = pDefaultDataType, pszzPreviousNamesCtorArg = pszzPreviousNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverInfo4a) return false
        if (this.cVersion != other.cVersion) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDriverPath != other.pDriverPath) return false
        if (this.pDataFile != other.pDataFile) return false
        if (this.pConfigFile != other.pConfigFile) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (this.pDependentFiles != other.pDependentFiles) return false
        if (this.pMonitorName != other.pMonitorName) return false
        if (this.pDefaultDataType != other.pDefaultDataType) return false
        if (this.pszzPreviousNames != other.pszzPreviousNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cVersion.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDriverPath.hashCode()
        result = 31 * result + this.pDataFile.hashCode()
        result = 31 * result + this.pConfigFile.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.pDependentFiles.hashCode()
        result = 31 * result + this.pMonitorName.hashCode()
        result = 31 * result + this.pDefaultDataType.hashCode()
        result = 31 * result + this.pszzPreviousNames.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pstr = MutPtr(0L),
            pEnvironment: Pstr = MutPtr(0L),
            pDriverPath: Pstr = MutPtr(0L),
            pDataFile: Pstr = MutPtr(0L),
            pConfigFile: Pstr = MutPtr(0L),
            pHelpFile: Pstr = MutPtr(0L),
            pDependentFiles: Pstr = MutPtr(0L),
            pMonitorName: Pstr = MutPtr(0L),
            pDefaultDataType: Pstr = MutPtr(0L),
            pszzPreviousNames: Pstr = MutPtr(0L),
        ): DriverInfo4a =
            DriverInfo4a(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                pHelpFileCtorArg = pHelpFile,
                pDependentFilesCtorArg = pDependentFiles,
                pMonitorNameCtorArg = pMonitorName,
                pDefaultDataTypeCtorArg = pDefaultDataType,
                pszzPreviousNamesCtorArg = pszzPreviousNames,
            )
    }
}

public class DriverInfo4w internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pwstr,
    pEnvironmentCtorArg: Pwstr,
    pDriverPathCtorArg: Pwstr,
    pDataFileCtorArg: Pwstr,
    pConfigFileCtorArg: Pwstr,
    pHelpFileCtorArg: Pwstr,
    pDependentFilesCtorArg: Pwstr,
    pMonitorNameCtorArg: Pwstr,
    pDefaultDataTypeCtorArg: Pwstr,
    pszzPreviousNamesCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public var pEnvironment: Pwstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pwstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pwstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pwstr = pConfigFileCtorArg
        internal set

    public var pHelpFile: Pwstr = pHelpFileCtorArg
        internal set

    public var pDependentFiles: Pwstr = pDependentFilesCtorArg
        internal set

    public var pMonitorName: Pwstr = pMonitorNameCtorArg
        internal set

    public var pDefaultDataType: Pwstr = pDefaultDataTypeCtorArg
        internal set

    public var pszzPreviousNames: Pwstr = pszzPreviousNamesCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        pHelpFileCtorArg = MutPtr(0L),
        pDependentFilesCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDefaultDataTypeCtorArg = MutPtr(0L),
        pszzPreviousNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cVersion

    public operator fun component2(): Pwstr = this.pName

    public operator fun component3(): Pwstr = this.pEnvironment

    public operator fun component4(): Pwstr = this.pDriverPath

    public operator fun component5(): Pwstr = this.pDataFile

    public operator fun component6(): Pwstr = this.pConfigFile

    public operator fun component7(): Pwstr = this.pHelpFile

    public operator fun component8(): Pwstr = this.pDependentFiles

    public operator fun component9(): Pwstr = this.pMonitorName

    public operator fun component10(): Pwstr = this.pDefaultDataType

    public operator fun component11(): Pwstr = this.pszzPreviousNames

    public fun copy(cVersion: UInt = this.cVersion, pName: Pwstr = this.pName, pEnvironment: Pwstr = this.pEnvironment, pDriverPath: Pwstr = this.pDriverPath, pDataFile: Pwstr = this.pDataFile, pConfigFile: Pwstr = this.pConfigFile, pHelpFile: Pwstr = this.pHelpFile, pDependentFiles: Pwstr = this.pDependentFiles, pMonitorName: Pwstr = this.pMonitorName, pDefaultDataType: Pwstr = this.pDefaultDataType, pszzPreviousNames: Pwstr = this.pszzPreviousNames): DriverInfo4w = DriverInfo4w(cVersion = cVersion, pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDriverPathCtorArg = pDriverPath, pDataFileCtorArg = pDataFile, pConfigFileCtorArg = pConfigFile, pHelpFileCtorArg = pHelpFile, pDependentFilesCtorArg = pDependentFiles, pMonitorNameCtorArg = pMonitorName, pDefaultDataTypeCtorArg = pDefaultDataType, pszzPreviousNamesCtorArg = pszzPreviousNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverInfo4w) return false
        if (this.cVersion != other.cVersion) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDriverPath != other.pDriverPath) return false
        if (this.pDataFile != other.pDataFile) return false
        if (this.pConfigFile != other.pConfigFile) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (this.pDependentFiles != other.pDependentFiles) return false
        if (this.pMonitorName != other.pMonitorName) return false
        if (this.pDefaultDataType != other.pDefaultDataType) return false
        if (this.pszzPreviousNames != other.pszzPreviousNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cVersion.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDriverPath.hashCode()
        result = 31 * result + this.pDataFile.hashCode()
        result = 31 * result + this.pConfigFile.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.pDependentFiles.hashCode()
        result = 31 * result + this.pMonitorName.hashCode()
        result = 31 * result + this.pDefaultDataType.hashCode()
        result = 31 * result + this.pszzPreviousNames.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pwstr = MutPtr(0L),
            pEnvironment: Pwstr = MutPtr(0L),
            pDriverPath: Pwstr = MutPtr(0L),
            pDataFile: Pwstr = MutPtr(0L),
            pConfigFile: Pwstr = MutPtr(0L),
            pHelpFile: Pwstr = MutPtr(0L),
            pDependentFiles: Pwstr = MutPtr(0L),
            pMonitorName: Pwstr = MutPtr(0L),
            pDefaultDataType: Pwstr = MutPtr(0L),
            pszzPreviousNames: Pwstr = MutPtr(0L),
        ): DriverInfo4w =
            DriverInfo4w(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                pHelpFileCtorArg = pHelpFile,
                pDependentFilesCtorArg = pDependentFiles,
                pMonitorNameCtorArg = pMonitorName,
                pDefaultDataTypeCtorArg = pDefaultDataType,
                pszzPreviousNamesCtorArg = pszzPreviousNames,
            )
    }
}

public class DriverInfo5a internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pstr,
    pEnvironmentCtorArg: Pstr,
    pDriverPathCtorArg: Pstr,
    pDataFileCtorArg: Pstr,
    pConfigFileCtorArg: Pstr,
    public var dwDriverAttributes: UInt,
    public var dwConfigVersion: UInt,
    public var dwDriverVersion: UInt,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public var pEnvironment: Pstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pstr = pConfigFileCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        dwDriverAttributes = 0u,
        dwConfigVersion = 0u,
        dwDriverVersion = 0u,
    )

    public operator fun component1(): UInt = this.cVersion

    public operator fun component2(): Pstr = this.pName

    public operator fun component3(): Pstr = this.pEnvironment

    public operator fun component4(): Pstr = this.pDriverPath

    public operator fun component5(): Pstr = this.pDataFile

    public operator fun component6(): Pstr = this.pConfigFile

    public operator fun component7(): UInt = this.dwDriverAttributes

    public operator fun component8(): UInt = this.dwConfigVersion

    public operator fun component9(): UInt = this.dwDriverVersion

    public fun copy(cVersion: UInt = this.cVersion, pName: Pstr = this.pName, pEnvironment: Pstr = this.pEnvironment, pDriverPath: Pstr = this.pDriverPath, pDataFile: Pstr = this.pDataFile, pConfigFile: Pstr = this.pConfigFile, dwDriverAttributes: UInt = this.dwDriverAttributes, dwConfigVersion: UInt = this.dwConfigVersion, dwDriverVersion: UInt = this.dwDriverVersion): DriverInfo5a = DriverInfo5a(cVersion = cVersion, pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDriverPathCtorArg = pDriverPath, pDataFileCtorArg = pDataFile, pConfigFileCtorArg = pConfigFile, dwDriverAttributes = dwDriverAttributes, dwConfigVersion = dwConfigVersion, dwDriverVersion = dwDriverVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverInfo5a) return false
        if (this.cVersion != other.cVersion) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDriverPath != other.pDriverPath) return false
        if (this.pDataFile != other.pDataFile) return false
        if (this.pConfigFile != other.pConfigFile) return false
        if (this.dwDriverAttributes != other.dwDriverAttributes) return false
        if (this.dwConfigVersion != other.dwConfigVersion) return false
        if (this.dwDriverVersion != other.dwDriverVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cVersion.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDriverPath.hashCode()
        result = 31 * result + this.pDataFile.hashCode()
        result = 31 * result + this.pConfigFile.hashCode()
        result = 31 * result + this.dwDriverAttributes.hashCode()
        result = 31 * result + this.dwConfigVersion.hashCode()
        result = 31 * result + this.dwDriverVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pstr = MutPtr(0L),
            pEnvironment: Pstr = MutPtr(0L),
            pDriverPath: Pstr = MutPtr(0L),
            pDataFile: Pstr = MutPtr(0L),
            pConfigFile: Pstr = MutPtr(0L),
            dwDriverAttributes: UInt = 0u,
            dwConfigVersion: UInt = 0u,
            dwDriverVersion: UInt = 0u,
        ): DriverInfo5a =
            DriverInfo5a(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                dwDriverAttributes = dwDriverAttributes,
                dwConfigVersion = dwConfigVersion,
                dwDriverVersion = dwDriverVersion,
            )
    }
}

public class DriverInfo5w internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pwstr,
    pEnvironmentCtorArg: Pwstr,
    pDriverPathCtorArg: Pwstr,
    pDataFileCtorArg: Pwstr,
    pConfigFileCtorArg: Pwstr,
    public var dwDriverAttributes: UInt,
    public var dwConfigVersion: UInt,
    public var dwDriverVersion: UInt,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public var pEnvironment: Pwstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pwstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pwstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pwstr = pConfigFileCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        dwDriverAttributes = 0u,
        dwConfigVersion = 0u,
        dwDriverVersion = 0u,
    )

    public operator fun component1(): UInt = this.cVersion

    public operator fun component2(): Pwstr = this.pName

    public operator fun component3(): Pwstr = this.pEnvironment

    public operator fun component4(): Pwstr = this.pDriverPath

    public operator fun component5(): Pwstr = this.pDataFile

    public operator fun component6(): Pwstr = this.pConfigFile

    public operator fun component7(): UInt = this.dwDriverAttributes

    public operator fun component8(): UInt = this.dwConfigVersion

    public operator fun component9(): UInt = this.dwDriverVersion

    public fun copy(cVersion: UInt = this.cVersion, pName: Pwstr = this.pName, pEnvironment: Pwstr = this.pEnvironment, pDriverPath: Pwstr = this.pDriverPath, pDataFile: Pwstr = this.pDataFile, pConfigFile: Pwstr = this.pConfigFile, dwDriverAttributes: UInt = this.dwDriverAttributes, dwConfigVersion: UInt = this.dwConfigVersion, dwDriverVersion: UInt = this.dwDriverVersion): DriverInfo5w = DriverInfo5w(cVersion = cVersion, pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDriverPathCtorArg = pDriverPath, pDataFileCtorArg = pDataFile, pConfigFileCtorArg = pConfigFile, dwDriverAttributes = dwDriverAttributes, dwConfigVersion = dwConfigVersion, dwDriverVersion = dwDriverVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverInfo5w) return false
        if (this.cVersion != other.cVersion) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDriverPath != other.pDriverPath) return false
        if (this.pDataFile != other.pDataFile) return false
        if (this.pConfigFile != other.pConfigFile) return false
        if (this.dwDriverAttributes != other.dwDriverAttributes) return false
        if (this.dwConfigVersion != other.dwConfigVersion) return false
        if (this.dwDriverVersion != other.dwDriverVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cVersion.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDriverPath.hashCode()
        result = 31 * result + this.pDataFile.hashCode()
        result = 31 * result + this.pConfigFile.hashCode()
        result = 31 * result + this.dwDriverAttributes.hashCode()
        result = 31 * result + this.dwConfigVersion.hashCode()
        result = 31 * result + this.dwDriverVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pwstr = MutPtr(0L),
            pEnvironment: Pwstr = MutPtr(0L),
            pDriverPath: Pwstr = MutPtr(0L),
            pDataFile: Pwstr = MutPtr(0L),
            pConfigFile: Pwstr = MutPtr(0L),
            dwDriverAttributes: UInt = 0u,
            dwConfigVersion: UInt = 0u,
            dwDriverVersion: UInt = 0u,
        ): DriverInfo5w =
            DriverInfo5w(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                dwDriverAttributes = dwDriverAttributes,
                dwConfigVersion = dwConfigVersion,
                dwDriverVersion = dwDriverVersion,
            )
    }
}

public class DriverInfo6a internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pstr,
    pEnvironmentCtorArg: Pstr,
    pDriverPathCtorArg: Pstr,
    pDataFileCtorArg: Pstr,
    pConfigFileCtorArg: Pstr,
    pHelpFileCtorArg: Pstr,
    pDependentFilesCtorArg: Pstr,
    pMonitorNameCtorArg: Pstr,
    pDefaultDataTypeCtorArg: Pstr,
    pszzPreviousNamesCtorArg: Pstr,
    public var ftDriverDate: Filetime,
    public var dwlDriverVersion: ULong,
    pszMfgNameCtorArg: Pstr,
    pszOEMUrlCtorArg: Pstr,
    pszHardwareIDCtorArg: Pstr,
    pszProviderCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public var pEnvironment: Pstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pstr = pConfigFileCtorArg
        internal set

    public var pHelpFile: Pstr = pHelpFileCtorArg
        internal set

    public var pDependentFiles: Pstr = pDependentFilesCtorArg
        internal set

    public var pMonitorName: Pstr = pMonitorNameCtorArg
        internal set

    public var pDefaultDataType: Pstr = pDefaultDataTypeCtorArg
        internal set

    public var pszzPreviousNames: Pstr = pszzPreviousNamesCtorArg
        internal set

    public var pszMfgName: Pstr = pszMfgNameCtorArg
        internal set

    public var pszOEMUrl: Pstr = pszOEMUrlCtorArg
        internal set

    public var pszHardwareID: Pstr = pszHardwareIDCtorArg
        internal set

    public var pszProvider: Pstr = pszProviderCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        pHelpFileCtorArg = MutPtr(0L),
        pDependentFilesCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDefaultDataTypeCtorArg = MutPtr(0L),
        pszzPreviousNamesCtorArg = MutPtr(0L),
        ftDriverDate = Filetime(),
        dwlDriverVersion = 0uL,
        pszMfgNameCtorArg = MutPtr(0L),
        pszOEMUrlCtorArg = MutPtr(0L),
        pszHardwareIDCtorArg = MutPtr(0L),
        pszProviderCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pstr = MutPtr(0L),
            pEnvironment: Pstr = MutPtr(0L),
            pDriverPath: Pstr = MutPtr(0L),
            pDataFile: Pstr = MutPtr(0L),
            pConfigFile: Pstr = MutPtr(0L),
            pHelpFile: Pstr = MutPtr(0L),
            pDependentFiles: Pstr = MutPtr(0L),
            pMonitorName: Pstr = MutPtr(0L),
            pDefaultDataType: Pstr = MutPtr(0L),
            pszzPreviousNames: Pstr = MutPtr(0L),
            ftDriverDate: Filetime = Filetime(),
            dwlDriverVersion: ULong = 0uL,
            pszMfgName: Pstr = MutPtr(0L),
            pszOEMUrl: Pstr = MutPtr(0L),
            pszHardwareID: Pstr = MutPtr(0L),
            pszProvider: Pstr = MutPtr(0L),
        ): DriverInfo6a =
            DriverInfo6a(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                pHelpFileCtorArg = pHelpFile,
                pDependentFilesCtorArg = pDependentFiles,
                pMonitorNameCtorArg = pMonitorName,
                pDefaultDataTypeCtorArg = pDefaultDataType,
                pszzPreviousNamesCtorArg = pszzPreviousNames,
                ftDriverDate = ftDriverDate,
                dwlDriverVersion = dwlDriverVersion,
                pszMfgNameCtorArg = pszMfgName,
                pszOEMUrlCtorArg = pszOEMUrl,
                pszHardwareIDCtorArg = pszHardwareID,
                pszProviderCtorArg = pszProvider,
            )
    }
}

public class DriverInfo6w internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pwstr,
    pEnvironmentCtorArg: Pwstr,
    pDriverPathCtorArg: Pwstr,
    pDataFileCtorArg: Pwstr,
    pConfigFileCtorArg: Pwstr,
    pHelpFileCtorArg: Pwstr,
    pDependentFilesCtorArg: Pwstr,
    pMonitorNameCtorArg: Pwstr,
    pDefaultDataTypeCtorArg: Pwstr,
    pszzPreviousNamesCtorArg: Pwstr,
    public var ftDriverDate: Filetime,
    public var dwlDriverVersion: ULong,
    pszMfgNameCtorArg: Pwstr,
    pszOEMUrlCtorArg: Pwstr,
    pszHardwareIDCtorArg: Pwstr,
    pszProviderCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public var pEnvironment: Pwstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pwstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pwstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pwstr = pConfigFileCtorArg
        internal set

    public var pHelpFile: Pwstr = pHelpFileCtorArg
        internal set

    public var pDependentFiles: Pwstr = pDependentFilesCtorArg
        internal set

    public var pMonitorName: Pwstr = pMonitorNameCtorArg
        internal set

    public var pDefaultDataType: Pwstr = pDefaultDataTypeCtorArg
        internal set

    public var pszzPreviousNames: Pwstr = pszzPreviousNamesCtorArg
        internal set

    public var pszMfgName: Pwstr = pszMfgNameCtorArg
        internal set

    public var pszOEMUrl: Pwstr = pszOEMUrlCtorArg
        internal set

    public var pszHardwareID: Pwstr = pszHardwareIDCtorArg
        internal set

    public var pszProvider: Pwstr = pszProviderCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        pHelpFileCtorArg = MutPtr(0L),
        pDependentFilesCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDefaultDataTypeCtorArg = MutPtr(0L),
        pszzPreviousNamesCtorArg = MutPtr(0L),
        ftDriverDate = Filetime(),
        dwlDriverVersion = 0uL,
        pszMfgNameCtorArg = MutPtr(0L),
        pszOEMUrlCtorArg = MutPtr(0L),
        pszHardwareIDCtorArg = MutPtr(0L),
        pszProviderCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pwstr = MutPtr(0L),
            pEnvironment: Pwstr = MutPtr(0L),
            pDriverPath: Pwstr = MutPtr(0L),
            pDataFile: Pwstr = MutPtr(0L),
            pConfigFile: Pwstr = MutPtr(0L),
            pHelpFile: Pwstr = MutPtr(0L),
            pDependentFiles: Pwstr = MutPtr(0L),
            pMonitorName: Pwstr = MutPtr(0L),
            pDefaultDataType: Pwstr = MutPtr(0L),
            pszzPreviousNames: Pwstr = MutPtr(0L),
            ftDriverDate: Filetime = Filetime(),
            dwlDriverVersion: ULong = 0uL,
            pszMfgName: Pwstr = MutPtr(0L),
            pszOEMUrl: Pwstr = MutPtr(0L),
            pszHardwareID: Pwstr = MutPtr(0L),
            pszProvider: Pwstr = MutPtr(0L),
        ): DriverInfo6w =
            DriverInfo6w(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                pHelpFileCtorArg = pHelpFile,
                pDependentFilesCtorArg = pDependentFiles,
                pMonitorNameCtorArg = pMonitorName,
                pDefaultDataTypeCtorArg = pDefaultDataType,
                pszzPreviousNamesCtorArg = pszzPreviousNames,
                ftDriverDate = ftDriverDate,
                dwlDriverVersion = dwlDriverVersion,
                pszMfgNameCtorArg = pszMfgName,
                pszOEMUrlCtorArg = pszOEMUrl,
                pszHardwareIDCtorArg = pszHardwareID,
                pszProviderCtorArg = pszProvider,
            )
    }
}

public class DriverInfo8a internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pstr,
    pEnvironmentCtorArg: Pstr,
    pDriverPathCtorArg: Pstr,
    pDataFileCtorArg: Pstr,
    pConfigFileCtorArg: Pstr,
    pHelpFileCtorArg: Pstr,
    pDependentFilesCtorArg: Pstr,
    pMonitorNameCtorArg: Pstr,
    pDefaultDataTypeCtorArg: Pstr,
    pszzPreviousNamesCtorArg: Pstr,
    public var ftDriverDate: Filetime,
    public var dwlDriverVersion: ULong,
    pszMfgNameCtorArg: Pstr,
    pszOEMUrlCtorArg: Pstr,
    pszHardwareIDCtorArg: Pstr,
    pszProviderCtorArg: Pstr,
    pszPrintProcessorCtorArg: Pstr,
    pszVendorSetupCtorArg: Pstr,
    pszzColorProfilesCtorArg: Pstr,
    pszInfPathCtorArg: Pstr,
    public var dwPrinterDriverAttributes: UInt,
    pszzCoreDriverDependenciesCtorArg: Pstr,
    public var ftMinInboxDriverVerDate: Filetime,
    public var dwlMinInboxDriverVerVersion: ULong,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public var pEnvironment: Pstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pstr = pConfigFileCtorArg
        internal set

    public var pHelpFile: Pstr = pHelpFileCtorArg
        internal set

    public var pDependentFiles: Pstr = pDependentFilesCtorArg
        internal set

    public var pMonitorName: Pstr = pMonitorNameCtorArg
        internal set

    public var pDefaultDataType: Pstr = pDefaultDataTypeCtorArg
        internal set

    public var pszzPreviousNames: Pstr = pszzPreviousNamesCtorArg
        internal set

    public var pszMfgName: Pstr = pszMfgNameCtorArg
        internal set

    public var pszOEMUrl: Pstr = pszOEMUrlCtorArg
        internal set

    public var pszHardwareID: Pstr = pszHardwareIDCtorArg
        internal set

    public var pszProvider: Pstr = pszProviderCtorArg
        internal set

    public var pszPrintProcessor: Pstr = pszPrintProcessorCtorArg
        internal set

    public var pszVendorSetup: Pstr = pszVendorSetupCtorArg
        internal set

    public var pszzColorProfiles: Pstr = pszzColorProfilesCtorArg
        internal set

    public var pszInfPath: Pstr = pszInfPathCtorArg
        internal set

    public var pszzCoreDriverDependencies: Pstr = pszzCoreDriverDependenciesCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        pHelpFileCtorArg = MutPtr(0L),
        pDependentFilesCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDefaultDataTypeCtorArg = MutPtr(0L),
        pszzPreviousNamesCtorArg = MutPtr(0L),
        ftDriverDate = Filetime(),
        dwlDriverVersion = 0uL,
        pszMfgNameCtorArg = MutPtr(0L),
        pszOEMUrlCtorArg = MutPtr(0L),
        pszHardwareIDCtorArg = MutPtr(0L),
        pszProviderCtorArg = MutPtr(0L),
        pszPrintProcessorCtorArg = MutPtr(0L),
        pszVendorSetupCtorArg = MutPtr(0L),
        pszzColorProfilesCtorArg = MutPtr(0L),
        pszInfPathCtorArg = MutPtr(0L),
        dwPrinterDriverAttributes = 0u,
        pszzCoreDriverDependenciesCtorArg = MutPtr(0L),
        ftMinInboxDriverVerDate = Filetime(),
        dwlMinInboxDriverVerVersion = 0uL,
    )

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pstr = MutPtr(0L),
            pEnvironment: Pstr = MutPtr(0L),
            pDriverPath: Pstr = MutPtr(0L),
            pDataFile: Pstr = MutPtr(0L),
            pConfigFile: Pstr = MutPtr(0L),
            pHelpFile: Pstr = MutPtr(0L),
            pDependentFiles: Pstr = MutPtr(0L),
            pMonitorName: Pstr = MutPtr(0L),
            pDefaultDataType: Pstr = MutPtr(0L),
            pszzPreviousNames: Pstr = MutPtr(0L),
            ftDriverDate: Filetime = Filetime(),
            dwlDriverVersion: ULong = 0uL,
            pszMfgName: Pstr = MutPtr(0L),
            pszOEMUrl: Pstr = MutPtr(0L),
            pszHardwareID: Pstr = MutPtr(0L),
            pszProvider: Pstr = MutPtr(0L),
            pszPrintProcessor: Pstr = MutPtr(0L),
            pszVendorSetup: Pstr = MutPtr(0L),
            pszzColorProfiles: Pstr = MutPtr(0L),
            pszInfPath: Pstr = MutPtr(0L),
            dwPrinterDriverAttributes: UInt = 0u,
            pszzCoreDriverDependencies: Pstr = MutPtr(0L),
            ftMinInboxDriverVerDate: Filetime = Filetime(),
            dwlMinInboxDriverVerVersion: ULong = 0uL,
        ): DriverInfo8a =
            DriverInfo8a(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                pHelpFileCtorArg = pHelpFile,
                pDependentFilesCtorArg = pDependentFiles,
                pMonitorNameCtorArg = pMonitorName,
                pDefaultDataTypeCtorArg = pDefaultDataType,
                pszzPreviousNamesCtorArg = pszzPreviousNames,
                ftDriverDate = ftDriverDate,
                dwlDriverVersion = dwlDriverVersion,
                pszMfgNameCtorArg = pszMfgName,
                pszOEMUrlCtorArg = pszOEMUrl,
                pszHardwareIDCtorArg = pszHardwareID,
                pszProviderCtorArg = pszProvider,
                pszPrintProcessorCtorArg = pszPrintProcessor,
                pszVendorSetupCtorArg = pszVendorSetup,
                pszzColorProfilesCtorArg = pszzColorProfiles,
                pszInfPathCtorArg = pszInfPath,
                dwPrinterDriverAttributes = dwPrinterDriverAttributes,
                pszzCoreDriverDependenciesCtorArg = pszzCoreDriverDependencies,
                ftMinInboxDriverVerDate = ftMinInboxDriverVerDate,
                dwlMinInboxDriverVerVersion = dwlMinInboxDriverVerVersion,
            )
    }
}

public class DriverInfo8w internal constructor(
    public var cVersion: UInt,
    pNameCtorArg: Pwstr,
    pEnvironmentCtorArg: Pwstr,
    pDriverPathCtorArg: Pwstr,
    pDataFileCtorArg: Pwstr,
    pConfigFileCtorArg: Pwstr,
    pHelpFileCtorArg: Pwstr,
    pDependentFilesCtorArg: Pwstr,
    pMonitorNameCtorArg: Pwstr,
    pDefaultDataTypeCtorArg: Pwstr,
    pszzPreviousNamesCtorArg: Pwstr,
    public var ftDriverDate: Filetime,
    public var dwlDriverVersion: ULong,
    pszMfgNameCtorArg: Pwstr,
    pszOEMUrlCtorArg: Pwstr,
    pszHardwareIDCtorArg: Pwstr,
    pszProviderCtorArg: Pwstr,
    pszPrintProcessorCtorArg: Pwstr,
    pszVendorSetupCtorArg: Pwstr,
    pszzColorProfilesCtorArg: Pwstr,
    pszInfPathCtorArg: Pwstr,
    public var dwPrinterDriverAttributes: UInt,
    pszzCoreDriverDependenciesCtorArg: Pwstr,
    public var ftMinInboxDriverVerDate: Filetime,
    public var dwlMinInboxDriverVerVersion: ULong,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public var pEnvironment: Pwstr = pEnvironmentCtorArg
        internal set

    public var pDriverPath: Pwstr = pDriverPathCtorArg
        internal set

    public var pDataFile: Pwstr = pDataFileCtorArg
        internal set

    public var pConfigFile: Pwstr = pConfigFileCtorArg
        internal set

    public var pHelpFile: Pwstr = pHelpFileCtorArg
        internal set

    public var pDependentFiles: Pwstr = pDependentFilesCtorArg
        internal set

    public var pMonitorName: Pwstr = pMonitorNameCtorArg
        internal set

    public var pDefaultDataType: Pwstr = pDefaultDataTypeCtorArg
        internal set

    public var pszzPreviousNames: Pwstr = pszzPreviousNamesCtorArg
        internal set

    public var pszMfgName: Pwstr = pszMfgNameCtorArg
        internal set

    public var pszOEMUrl: Pwstr = pszOEMUrlCtorArg
        internal set

    public var pszHardwareID: Pwstr = pszHardwareIDCtorArg
        internal set

    public var pszProvider: Pwstr = pszProviderCtorArg
        internal set

    public var pszPrintProcessor: Pwstr = pszPrintProcessorCtorArg
        internal set

    public var pszVendorSetup: Pwstr = pszVendorSetupCtorArg
        internal set

    public var pszzColorProfiles: Pwstr = pszzColorProfilesCtorArg
        internal set

    public var pszInfPath: Pwstr = pszInfPathCtorArg
        internal set

    public var pszzCoreDriverDependencies: Pwstr = pszzCoreDriverDependenciesCtorArg
        internal set

    public constructor() : this(
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        pHelpFileCtorArg = MutPtr(0L),
        pDependentFilesCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDefaultDataTypeCtorArg = MutPtr(0L),
        pszzPreviousNamesCtorArg = MutPtr(0L),
        ftDriverDate = Filetime(),
        dwlDriverVersion = 0uL,
        pszMfgNameCtorArg = MutPtr(0L),
        pszOEMUrlCtorArg = MutPtr(0L),
        pszHardwareIDCtorArg = MutPtr(0L),
        pszProviderCtorArg = MutPtr(0L),
        pszPrintProcessorCtorArg = MutPtr(0L),
        pszVendorSetupCtorArg = MutPtr(0L),
        pszzColorProfilesCtorArg = MutPtr(0L),
        pszInfPathCtorArg = MutPtr(0L),
        dwPrinterDriverAttributes = 0u,
        pszzCoreDriverDependenciesCtorArg = MutPtr(0L),
        ftMinInboxDriverVerDate = Filetime(),
        dwlMinInboxDriverVerVersion = 0uL,
    )

    public companion object {
        public operator fun invoke(
            cVersion: UInt = 0u,
            pName: Pwstr = MutPtr(0L),
            pEnvironment: Pwstr = MutPtr(0L),
            pDriverPath: Pwstr = MutPtr(0L),
            pDataFile: Pwstr = MutPtr(0L),
            pConfigFile: Pwstr = MutPtr(0L),
            pHelpFile: Pwstr = MutPtr(0L),
            pDependentFiles: Pwstr = MutPtr(0L),
            pMonitorName: Pwstr = MutPtr(0L),
            pDefaultDataType: Pwstr = MutPtr(0L),
            pszzPreviousNames: Pwstr = MutPtr(0L),
            ftDriverDate: Filetime = Filetime(),
            dwlDriverVersion: ULong = 0uL,
            pszMfgName: Pwstr = MutPtr(0L),
            pszOEMUrl: Pwstr = MutPtr(0L),
            pszHardwareID: Pwstr = MutPtr(0L),
            pszProvider: Pwstr = MutPtr(0L),
            pszPrintProcessor: Pwstr = MutPtr(0L),
            pszVendorSetup: Pwstr = MutPtr(0L),
            pszzColorProfiles: Pwstr = MutPtr(0L),
            pszInfPath: Pwstr = MutPtr(0L),
            dwPrinterDriverAttributes: UInt = 0u,
            pszzCoreDriverDependencies: Pwstr = MutPtr(0L),
            ftMinInboxDriverVerDate: Filetime = Filetime(),
            dwlMinInboxDriverVerVersion: ULong = 0uL,
        ): DriverInfo8w =
            DriverInfo8w(
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                pHelpFileCtorArg = pHelpFile,
                pDependentFilesCtorArg = pDependentFiles,
                pMonitorNameCtorArg = pMonitorName,
                pDefaultDataTypeCtorArg = pDefaultDataType,
                pszzPreviousNamesCtorArg = pszzPreviousNames,
                ftDriverDate = ftDriverDate,
                dwlDriverVersion = dwlDriverVersion,
                pszMfgNameCtorArg = pszMfgName,
                pszOEMUrlCtorArg = pszOEMUrl,
                pszHardwareIDCtorArg = pszHardwareID,
                pszProviderCtorArg = pszProvider,
                pszPrintProcessorCtorArg = pszPrintProcessor,
                pszVendorSetupCtorArg = pszVendorSetup,
                pszzColorProfilesCtorArg = pszzColorProfiles,
                pszInfPathCtorArg = pszInfPath,
                dwPrinterDriverAttributes = dwPrinterDriverAttributes,
                pszzCoreDriverDependenciesCtorArg = pszzCoreDriverDependencies,
                ftMinInboxDriverVerDate = ftMinInboxDriverVerDate,
                dwlMinInboxDriverVerVersion = dwlMinInboxDriverVerVersion,
            )
    }
}

public class DriverUpgradeInfo1 internal constructor(
    pPrinterNameCtorArg: MutPtr<Byte>,
    pOldDriverDirectoryCtorArg: MutPtr<Byte>,
) {
    public var pPrinterName: MutPtr<Byte> = pPrinterNameCtorArg
        internal set

    public var pOldDriverDirectory: MutPtr<Byte> = pOldDriverDirectoryCtorArg
        internal set

    public constructor() : this(
        pPrinterNameCtorArg = MutPtr(0L),
        pOldDriverDirectoryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.pPrinterName

    public operator fun component2(): MutPtr<Byte> = this.pOldDriverDirectory

    public fun copy(pPrinterName: MutPtr<Byte> = this.pPrinterName, pOldDriverDirectory: MutPtr<Byte> = this.pOldDriverDirectory): DriverUpgradeInfo1 = DriverUpgradeInfo1(pPrinterNameCtorArg = pPrinterName, pOldDriverDirectoryCtorArg = pOldDriverDirectory)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverUpgradeInfo1) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pOldDriverDirectory != other.pOldDriverDirectory) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPrinterName.hashCode()
        result = 31 * result + this.pOldDriverDirectory.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriverUpgradeInfo1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriverUpgradeInfo1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DriverUpgradeInfo1 =
                    DriverUpgradeInfo1(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DriverUpgradeInfo1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.pPrinterName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.pOldDriverDirectory)
                }
            }

        public operator fun invoke(
            pPrinterName: MutPtr<Byte> = MutPtr(0L),
            pOldDriverDirectory: MutPtr<Byte> = MutPtr(0L),
        ): DriverUpgradeInfo1 =
            DriverUpgradeInfo1(
                pPrinterNameCtorArg = pPrinterName,
                pOldDriverDirectoryCtorArg = pOldDriverDirectory,
            )
    }
}

public class DriverUpgradeInfo2 internal constructor(
    pPrinterNameCtorArg: MutPtr<Byte>,
    pOldDriverDirectoryCtorArg: MutPtr<Byte>,
    public var cVersion: UInt,
    pNameCtorArg: MutPtr<Byte>,
    pEnvironmentCtorArg: MutPtr<Byte>,
    pDriverPathCtorArg: MutPtr<Byte>,
    pDataFileCtorArg: MutPtr<Byte>,
    pConfigFileCtorArg: MutPtr<Byte>,
    pHelpFileCtorArg: MutPtr<Byte>,
    pDependentFilesCtorArg: MutPtr<Byte>,
    pMonitorNameCtorArg: MutPtr<Byte>,
    pDefaultDataTypeCtorArg: MutPtr<Byte>,
    pszzPreviousNamesCtorArg: MutPtr<Byte>,
) {
    public var pPrinterName: MutPtr<Byte> = pPrinterNameCtorArg
        internal set

    public var pOldDriverDirectory: MutPtr<Byte> = pOldDriverDirectoryCtorArg
        internal set

    public var pName: MutPtr<Byte> = pNameCtorArg
        internal set

    public var pEnvironment: MutPtr<Byte> = pEnvironmentCtorArg
        internal set

    public var pDriverPath: MutPtr<Byte> = pDriverPathCtorArg
        internal set

    public var pDataFile: MutPtr<Byte> = pDataFileCtorArg
        internal set

    public var pConfigFile: MutPtr<Byte> = pConfigFileCtorArg
        internal set

    public var pHelpFile: MutPtr<Byte> = pHelpFileCtorArg
        internal set

    public var pDependentFiles: MutPtr<Byte> = pDependentFilesCtorArg
        internal set

    public var pMonitorName: MutPtr<Byte> = pMonitorNameCtorArg
        internal set

    public var pDefaultDataType: MutPtr<Byte> = pDefaultDataTypeCtorArg
        internal set

    public var pszzPreviousNames: MutPtr<Byte> = pszzPreviousNamesCtorArg
        internal set

    public constructor() : this(
        pPrinterNameCtorArg = MutPtr(0L),
        pOldDriverDirectoryCtorArg = MutPtr(0L),
        cVersion = 0u,
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDriverPathCtorArg = MutPtr(0L),
        pDataFileCtorArg = MutPtr(0L),
        pConfigFileCtorArg = MutPtr(0L),
        pHelpFileCtorArg = MutPtr(0L),
        pDependentFilesCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDefaultDataTypeCtorArg = MutPtr(0L),
        pszzPreviousNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Byte> = this.pPrinterName

    public operator fun component2(): MutPtr<Byte> = this.pOldDriverDirectory

    public operator fun component3(): UInt = this.cVersion

    public operator fun component4(): MutPtr<Byte> = this.pName

    public operator fun component5(): MutPtr<Byte> = this.pEnvironment

    public operator fun component6(): MutPtr<Byte> = this.pDriverPath

    public operator fun component7(): MutPtr<Byte> = this.pDataFile

    public operator fun component8(): MutPtr<Byte> = this.pConfigFile

    public operator fun component9(): MutPtr<Byte> = this.pHelpFile

    public operator fun component10(): MutPtr<Byte> = this.pDependentFiles

    public operator fun component11(): MutPtr<Byte> = this.pMonitorName

    public operator fun component12(): MutPtr<Byte> = this.pDefaultDataType

    public operator fun component13(): MutPtr<Byte> = this.pszzPreviousNames

    public fun copy(pPrinterName: MutPtr<Byte> = this.pPrinterName, pOldDriverDirectory: MutPtr<Byte> = this.pOldDriverDirectory, cVersion: UInt = this.cVersion, pName: MutPtr<Byte> = this.pName, pEnvironment: MutPtr<Byte> = this.pEnvironment, pDriverPath: MutPtr<Byte> = this.pDriverPath, pDataFile: MutPtr<Byte> = this.pDataFile, pConfigFile: MutPtr<Byte> = this.pConfigFile, pHelpFile: MutPtr<Byte> = this.pHelpFile, pDependentFiles: MutPtr<Byte> = this.pDependentFiles, pMonitorName: MutPtr<Byte> = this.pMonitorName, pDefaultDataType: MutPtr<Byte> = this.pDefaultDataType, pszzPreviousNames: MutPtr<Byte> = this.pszzPreviousNames): DriverUpgradeInfo2 = DriverUpgradeInfo2(pPrinterNameCtorArg = pPrinterName, pOldDriverDirectoryCtorArg = pOldDriverDirectory, cVersion = cVersion, pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDriverPathCtorArg = pDriverPath, pDataFileCtorArg = pDataFile, pConfigFileCtorArg = pConfigFile, pHelpFileCtorArg = pHelpFile, pDependentFilesCtorArg = pDependentFiles, pMonitorNameCtorArg = pMonitorName, pDefaultDataTypeCtorArg = pDefaultDataType, pszzPreviousNamesCtorArg = pszzPreviousNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverUpgradeInfo2) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pOldDriverDirectory != other.pOldDriverDirectory) return false
        if (this.cVersion != other.cVersion) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDriverPath != other.pDriverPath) return false
        if (this.pDataFile != other.pDataFile) return false
        if (this.pConfigFile != other.pConfigFile) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (this.pDependentFiles != other.pDependentFiles) return false
        if (this.pMonitorName != other.pMonitorName) return false
        if (this.pDefaultDataType != other.pDefaultDataType) return false
        if (this.pszzPreviousNames != other.pszzPreviousNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPrinterName.hashCode()
        result = 31 * result + this.pOldDriverDirectory.hashCode()
        result = 31 * result + this.cVersion.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDriverPath.hashCode()
        result = 31 * result + this.pDataFile.hashCode()
        result = 31 * result + this.pConfigFile.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.pDependentFiles.hashCode()
        result = 31 * result + this.pMonitorName.hashCode()
        result = 31 * result + this.pDefaultDataType.hashCode()
        result = 31 * result + this.pszzPreviousNames.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriverUpgradeInfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriverUpgradeInfo2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): DriverUpgradeInfo2 =
                    DriverUpgradeInfo2(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: DriverUpgradeInfo2) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.pPrinterName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.pOldDriverDirectory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 24L, value.pName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 32L, value.pEnvironment)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 40L, value.pDriverPath)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 48L, value.pDataFile)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 56L, value.pConfigFile)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 64L, value.pHelpFile)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 72L, value.pDependentFiles)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 80L, value.pMonitorName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 88L, value.pDefaultDataType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 96L, value.pszzPreviousNames)
                }
            }

        public operator fun invoke(
            pPrinterName: MutPtr<Byte> = MutPtr(0L),
            pOldDriverDirectory: MutPtr<Byte> = MutPtr(0L),
            cVersion: UInt = 0u,
            pName: MutPtr<Byte> = MutPtr(0L),
            pEnvironment: MutPtr<Byte> = MutPtr(0L),
            pDriverPath: MutPtr<Byte> = MutPtr(0L),
            pDataFile: MutPtr<Byte> = MutPtr(0L),
            pConfigFile: MutPtr<Byte> = MutPtr(0L),
            pHelpFile: MutPtr<Byte> = MutPtr(0L),
            pDependentFiles: MutPtr<Byte> = MutPtr(0L),
            pMonitorName: MutPtr<Byte> = MutPtr(0L),
            pDefaultDataType: MutPtr<Byte> = MutPtr(0L),
            pszzPreviousNames: MutPtr<Byte> = MutPtr(0L),
        ): DriverUpgradeInfo2 =
            DriverUpgradeInfo2(
                pPrinterNameCtorArg = pPrinterName,
                pOldDriverDirectoryCtorArg = pOldDriverDirectory,
                cVersion = cVersion,
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDriverPathCtorArg = pDriverPath,
                pDataFileCtorArg = pDataFile,
                pConfigFileCtorArg = pConfigFile,
                pHelpFileCtorArg = pHelpFile,
                pDependentFilesCtorArg = pDependentFiles,
                pMonitorNameCtorArg = pMonitorName,
                pDefaultDataTypeCtorArg = pDefaultDataType,
                pszzPreviousNamesCtorArg = pszzPreviousNames,
            )
    }
}

public class Extchkbox internal constructor(
    public var cbSize: UShort,
    public var flags: UShort,
    pTitleCtorArg: MutPtr<Byte>,
    pSeparatorCtorArg: MutPtr<Byte>,
    pCheckedNameCtorArg: MutPtr<Byte>,
    public var iconID: Int,
    public var wReserved: UShortArray,
    public var dwReserved: IntArray,
) {
    public var pTitle: MutPtr<Byte> = pTitleCtorArg
        internal set

    public var pSeparator: MutPtr<Byte> = pSeparatorCtorArg
        internal set

    public var pCheckedName: MutPtr<Byte> = pCheckedNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        pTitleCtorArg = MutPtr(0L),
        pSeparatorCtorArg = MutPtr(0L),
        pCheckedNameCtorArg = MutPtr(0L),
        iconID = 0,
        wReserved = UShortArray(4),
        dwReserved = IntArray(2),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): MutPtr<Byte> = this.pTitle

    public operator fun component4(): MutPtr<Byte> = this.pSeparator

    public operator fun component5(): MutPtr<Byte> = this.pCheckedName

    public operator fun component6(): Int = this.iconID

    public operator fun component7(): UShortArray = this.wReserved

    public operator fun component8(): IntArray = this.dwReserved

    public fun copy(cbSize: UShort = this.cbSize, flags: UShort = this.flags, pTitle: MutPtr<Byte> = this.pTitle, pSeparator: MutPtr<Byte> = this.pSeparator, pCheckedName: MutPtr<Byte> = this.pCheckedName, iconID: Int = this.iconID, wReserved: UShortArray = this.wReserved, dwReserved: IntArray = this.dwReserved): Extchkbox = Extchkbox(cbSize = cbSize, flags = flags, pTitleCtorArg = pTitle, pSeparatorCtorArg = pSeparator, pCheckedNameCtorArg = pCheckedName, iconID = iconID, wReserved = wReserved, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extchkbox) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.pTitle != other.pTitle) return false
        if (this.pSeparator != other.pSeparator) return false
        if (this.pCheckedName != other.pCheckedName) return false
        if (this.iconID != other.iconID) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pTitle.hashCode()
        result = 31 * result + this.pSeparator.hashCode()
        result = 31 * result + this.pCheckedName.hashCode()
        result = 31 * result + this.iconID.hashCode()
        result = 31 * result + this.wReserved.contentHashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extchkbox> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extchkbox> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Extchkbox =
                    Extchkbox(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr + 40L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                        ).readNative(addr + 48L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Extchkbox) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.pTitle)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 16L, value.pSeparator)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 24L, value.pCheckedName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.iconID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr + 40L, value.wReserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                    ).writeNative(addr + 48L, value.dwReserved.toList())
                }
            }

        public operator fun invoke(
            cbSize: UShort = 0u,
            flags: UShort = 0u,
            pTitle: MutPtr<Byte> = MutPtr(0L),
            pSeparator: MutPtr<Byte> = MutPtr(0L),
            pCheckedName: MutPtr<Byte> = MutPtr(0L),
            iconID: Int = 0,
            wReserved: UShortArray = UShortArray(4),
            dwReserved: IntArray = IntArray(2),
        ): Extchkbox =
            Extchkbox(
                cbSize = cbSize,
                flags = flags,
                pTitleCtorArg = pTitle,
                pSeparatorCtorArg = pSeparator,
                pCheckedNameCtorArg = pCheckedName,
                iconID = iconID,
                wReserved = wReserved,
                dwReserved = dwReserved,
            )
    }
}

public class Extpush internal constructor(
    public var cbSize: UShort,
    public var flags: UShort,
    pTitleCtorArg: MutPtr<Byte>,
    public var anonymous1: Extpush0,
    public var iconID: Int,
    public var anonymous2: Extpush1,
    public var dwReserved: IntArray,
) {
    public var pTitle: MutPtr<Byte> = pTitleCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        pTitleCtorArg = MutPtr(0L),
        anonymous1 = Extpush0(),
        iconID = 0,
        anonymous2 = Extpush1(),
        dwReserved = IntArray(3),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): MutPtr<Byte> = this.pTitle

    public operator fun component4(): Extpush0 = this.anonymous1

    public operator fun component5(): Int = this.iconID

    public operator fun component6(): Extpush1 = this.anonymous2

    public operator fun component7(): IntArray = this.dwReserved

    public fun copy(cbSize: UShort = this.cbSize, flags: UShort = this.flags, pTitle: MutPtr<Byte> = this.pTitle, anonymous1: Extpush0 = this.anonymous1, iconID: Int = this.iconID, anonymous2: Extpush1 = this.anonymous2, dwReserved: IntArray = this.dwReserved): Extpush = Extpush(cbSize = cbSize, flags = flags, pTitleCtorArg = pTitle, anonymous1 = anonymous1, iconID = iconID, anonymous2 = anonymous2, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extpush) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.pTitle != other.pTitle) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.iconID != other.iconID) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pTitle.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.iconID.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            flags: UShort = 0u,
            pTitle: MutPtr<Byte> = MutPtr(0L),
            anonymous1: Extpush0 = Extpush0(),
            iconID: Int = 0,
            anonymous2: Extpush1 = Extpush1(),
            dwReserved: IntArray = IntArray(3),
        ): Extpush =
            Extpush(
                cbSize = cbSize,
                flags = flags,
                pTitleCtorArg = pTitle,
                anonymous1 = anonymous1,
                iconID = iconID,
                anonymous2 = anonymous2,
                dwReserved = dwReserved,
            )
    }
}

public data class Extpush0(
    public var dlgProc: Dlgproc = null,
    public var pfnCallBack: Farproc = null,
)

public class Extpush1 internal constructor(
    public var dlgTemplateID: UShort,
    hDlgTemplateCtorArg: Handle,
) {
    public var hDlgTemplate: Handle = hDlgTemplateCtorArg
        internal set

    public constructor() : this(
        dlgTemplateID = 0u,
        hDlgTemplateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.dlgTemplateID

    public operator fun component2(): Handle = this.hDlgTemplate

    public fun copy(dlgTemplateID: UShort = this.dlgTemplateID, hDlgTemplate: Handle = this.hDlgTemplate): Extpush1 = Extpush1(dlgTemplateID = dlgTemplateID, hDlgTemplateCtorArg = hDlgTemplate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extpush1) return false
        if (this.dlgTemplateID != other.dlgTemplateID) return false
        if (this.hDlgTemplate != other.hDlgTemplate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dlgTemplateID.hashCode()
        result = 31 * result + this.hDlgTemplate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dlgTemplateID: UShort = 0u,
            hDlgTemplate: Handle = MutPtr(0L),
        ): Extpush1 =
            Extpush1(
                dlgTemplateID = dlgTemplateID,
                hDlgTemplateCtorArg = hDlgTemplate,
            )
    }
}

public class Exttextmetric(
    public var emSize: Short = 0,
    public var emPointSize: Short = 0,
    public var emOrientation: Short = 0,
    public var emMasterHeight: Short = 0,
    public var emMinScale: Short = 0,
    public var emMaxScale: Short = 0,
    public var emMasterUnits: Short = 0,
    public var emCapHeight: Short = 0,
    public var emXHeight: Short = 0,
    public var emLowerCaseAscent: Short = 0,
    public var emLowerCaseDescent: Short = 0,
    public var emSlant: Short = 0,
    public var emSuperScript: Short = 0,
    public var emSubScript: Short = 0,
    public var emSuperScriptSize: Short = 0,
    public var emSubScriptSize: Short = 0,
    public var emUnderlineOffset: Short = 0,
    public var emUnderlineWidth: Short = 0,
    public var emDoubleUpperUnderlineOffset: Short = 0,
    public var emDoubleLowerUnderlineOffset: Short = 0,
    public var emDoubleUpperUnderlineWidth: Short = 0,
    public var emDoubleLowerUnderlineWidth: Short = 0,
    public var emStrikeOutOffset: Short = 0,
    public var emStrikeOutWidth: Short = 0,
    public var emKernPairs: UShort = 0u,
    public var emKernTracks: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Exttextmetric> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Exttextmetric> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): Exttextmetric =
                    Exttextmetric(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 38L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                    )
                override fun writeNative(addr: Long, value: Exttextmetric) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.emSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.emPointSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.emOrientation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.emMasterHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.emMinScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.emMaxScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.emMasterUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 14L, value.emCapHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.emXHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 18L, value.emLowerCaseAscent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 20L, value.emLowerCaseDescent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 22L, value.emSlant)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 24L, value.emSuperScript)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 26L, value.emSubScript)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 28L, value.emSuperScriptSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 30L, value.emSubScriptSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 32L, value.emUnderlineOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 34L, value.emUnderlineWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 36L, value.emDoubleUpperUnderlineOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 38L, value.emDoubleLowerUnderlineOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 40L, value.emDoubleUpperUnderlineWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 42L, value.emDoubleLowerUnderlineWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 44L, value.emStrikeOutOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 46L, value.emStrikeOutWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.emKernPairs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.emKernTracks)
                }
            }
    }
}

public class FormInfo1a internal constructor(
    public var flags: UInt,
    pNameCtorArg: Pstr,
    public var size: Size,
    public var imageableArea: Rectl,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        pNameCtorArg = MutPtr(0L),
        size = Size(),
        imageableArea = Rectl(),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Pstr = this.pName

    public operator fun component3(): Size = this.size

    public operator fun component4(): Rectl = this.imageableArea

    public fun copy(flags: UInt = this.flags, pName: Pstr = this.pName, size: Size = this.size, imageableArea: Rectl = this.imageableArea): FormInfo1a = FormInfo1a(flags = flags, pNameCtorArg = pName, size = size, imageableArea = imageableArea)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FormInfo1a) return false
        if (this.flags != other.flags) return false
        if (this.pName != other.pName) return false
        if (this.size != other.size) return false
        if (this.imageableArea != other.imageableArea) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.imageableArea.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            pName: Pstr = MutPtr(0L),
            size: Size = Size(),
            imageableArea: Rectl = Rectl(),
        ): FormInfo1a =
            FormInfo1a(
                flags = flags,
                pNameCtorArg = pName,
                size = size,
                imageableArea = imageableArea,
            )
    }
}

public class FormInfo1w internal constructor(
    public var flags: UInt,
    pNameCtorArg: Pwstr,
    public var size: Size,
    public var imageableArea: Rectl,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        pNameCtorArg = MutPtr(0L),
        size = Size(),
        imageableArea = Rectl(),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Pwstr = this.pName

    public operator fun component3(): Size = this.size

    public operator fun component4(): Rectl = this.imageableArea

    public fun copy(flags: UInt = this.flags, pName: Pwstr = this.pName, size: Size = this.size, imageableArea: Rectl = this.imageableArea): FormInfo1w = FormInfo1w(flags = flags, pNameCtorArg = pName, size = size, imageableArea = imageableArea)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FormInfo1w) return false
        if (this.flags != other.flags) return false
        if (this.pName != other.pName) return false
        if (this.size != other.size) return false
        if (this.imageableArea != other.imageableArea) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.imageableArea.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            pName: Pwstr = MutPtr(0L),
            size: Size = Size(),
            imageableArea: Rectl = Rectl(),
        ): FormInfo1w =
            FormInfo1w(
                flags = flags,
                pNameCtorArg = pName,
                size = size,
                imageableArea = imageableArea,
            )
    }
}

public class FormInfo2a internal constructor(
    public var flags: UInt,
    pNameCtorArg: Pcstr,
    public var size: Size,
    public var imageableArea: Rectl,
    pKeywordCtorArg: Pcstr,
    public var stringType: UInt,
    pMuiDllCtorArg: Pcstr,
    public var dwResourceId: UInt,
    pDisplayNameCtorArg: Pcstr,
    public var wLangId: UShort,
) {
    public var pName: Pcstr = pNameCtorArg
        internal set

    public var pKeyword: Pcstr = pKeywordCtorArg
        internal set

    public var pMuiDll: Pcstr = pMuiDllCtorArg
        internal set

    public var pDisplayName: Pcstr = pDisplayNameCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        pNameCtorArg = ConstPtr(0L),
        size = Size(),
        imageableArea = Rectl(),
        pKeywordCtorArg = ConstPtr(0L),
        stringType = 0u,
        pMuiDllCtorArg = ConstPtr(0L),
        dwResourceId = 0u,
        pDisplayNameCtorArg = ConstPtr(0L),
        wLangId = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Pcstr = this.pName

    public operator fun component3(): Size = this.size

    public operator fun component4(): Rectl = this.imageableArea

    public operator fun component5(): Pcstr = this.pKeyword

    public operator fun component6(): UInt = this.stringType

    public operator fun component7(): Pcstr = this.pMuiDll

    public operator fun component8(): UInt = this.dwResourceId

    public operator fun component9(): Pcstr = this.pDisplayName

    public operator fun component10(): UShort = this.wLangId

    public fun copy(flags: UInt = this.flags, pName: Pcstr = this.pName, size: Size = this.size, imageableArea: Rectl = this.imageableArea, pKeyword: Pcstr = this.pKeyword, stringType: UInt = this.stringType, pMuiDll: Pcstr = this.pMuiDll, dwResourceId: UInt = this.dwResourceId, pDisplayName: Pcstr = this.pDisplayName, wLangId: UShort = this.wLangId): FormInfo2a = FormInfo2a(flags = flags, pNameCtorArg = pName, size = size, imageableArea = imageableArea, pKeywordCtorArg = pKeyword, stringType = stringType, pMuiDllCtorArg = pMuiDll, dwResourceId = dwResourceId, pDisplayNameCtorArg = pDisplayName, wLangId = wLangId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FormInfo2a) return false
        if (this.flags != other.flags) return false
        if (this.pName != other.pName) return false
        if (this.size != other.size) return false
        if (this.imageableArea != other.imageableArea) return false
        if (this.pKeyword != other.pKeyword) return false
        if (this.stringType != other.stringType) return false
        if (this.pMuiDll != other.pMuiDll) return false
        if (this.dwResourceId != other.dwResourceId) return false
        if (this.pDisplayName != other.pDisplayName) return false
        if (this.wLangId != other.wLangId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.imageableArea.hashCode()
        result = 31 * result + this.pKeyword.hashCode()
        result = 31 * result + this.stringType.hashCode()
        result = 31 * result + this.pMuiDll.hashCode()
        result = 31 * result + this.dwResourceId.hashCode()
        result = 31 * result + this.pDisplayName.hashCode()
        result = 31 * result + this.wLangId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            pName: Pcstr = ConstPtr(0L),
            size: Size = Size(),
            imageableArea: Rectl = Rectl(),
            pKeyword: Pcstr = ConstPtr(0L),
            stringType: UInt = 0u,
            pMuiDll: Pcstr = ConstPtr(0L),
            dwResourceId: UInt = 0u,
            pDisplayName: Pcstr = ConstPtr(0L),
            wLangId: UShort = 0u,
        ): FormInfo2a =
            FormInfo2a(
                flags = flags,
                pNameCtorArg = pName,
                size = size,
                imageableArea = imageableArea,
                pKeywordCtorArg = pKeyword,
                stringType = stringType,
                pMuiDllCtorArg = pMuiDll,
                dwResourceId = dwResourceId,
                pDisplayNameCtorArg = pDisplayName,
                wLangId = wLangId,
            )
    }
}

public class FormInfo2w internal constructor(
    public var flags: UInt,
    pNameCtorArg: Pcwstr,
    public var size: Size,
    public var imageableArea: Rectl,
    pKeywordCtorArg: Pcstr,
    public var stringType: UInt,
    pMuiDllCtorArg: Pcwstr,
    public var dwResourceId: UInt,
    pDisplayNameCtorArg: Pcwstr,
    public var wLangId: UShort,
) {
    public var pName: Pcwstr = pNameCtorArg
        internal set

    public var pKeyword: Pcstr = pKeywordCtorArg
        internal set

    public var pMuiDll: Pcwstr = pMuiDllCtorArg
        internal set

    public var pDisplayName: Pcwstr = pDisplayNameCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        pNameCtorArg = ConstPtr(0L),
        size = Size(),
        imageableArea = Rectl(),
        pKeywordCtorArg = ConstPtr(0L),
        stringType = 0u,
        pMuiDllCtorArg = ConstPtr(0L),
        dwResourceId = 0u,
        pDisplayNameCtorArg = ConstPtr(0L),
        wLangId = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Pcwstr = this.pName

    public operator fun component3(): Size = this.size

    public operator fun component4(): Rectl = this.imageableArea

    public operator fun component5(): Pcstr = this.pKeyword

    public operator fun component6(): UInt = this.stringType

    public operator fun component7(): Pcwstr = this.pMuiDll

    public operator fun component8(): UInt = this.dwResourceId

    public operator fun component9(): Pcwstr = this.pDisplayName

    public operator fun component10(): UShort = this.wLangId

    public fun copy(flags: UInt = this.flags, pName: Pcwstr = this.pName, size: Size = this.size, imageableArea: Rectl = this.imageableArea, pKeyword: Pcstr = this.pKeyword, stringType: UInt = this.stringType, pMuiDll: Pcwstr = this.pMuiDll, dwResourceId: UInt = this.dwResourceId, pDisplayName: Pcwstr = this.pDisplayName, wLangId: UShort = this.wLangId): FormInfo2w = FormInfo2w(flags = flags, pNameCtorArg = pName, size = size, imageableArea = imageableArea, pKeywordCtorArg = pKeyword, stringType = stringType, pMuiDllCtorArg = pMuiDll, dwResourceId = dwResourceId, pDisplayNameCtorArg = pDisplayName, wLangId = wLangId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FormInfo2w) return false
        if (this.flags != other.flags) return false
        if (this.pName != other.pName) return false
        if (this.size != other.size) return false
        if (this.imageableArea != other.imageableArea) return false
        if (this.pKeyword != other.pKeyword) return false
        if (this.stringType != other.stringType) return false
        if (this.pMuiDll != other.pMuiDll) return false
        if (this.dwResourceId != other.dwResourceId) return false
        if (this.pDisplayName != other.pDisplayName) return false
        if (this.wLangId != other.wLangId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.imageableArea.hashCode()
        result = 31 * result + this.pKeyword.hashCode()
        result = 31 * result + this.stringType.hashCode()
        result = 31 * result + this.pMuiDll.hashCode()
        result = 31 * result + this.dwResourceId.hashCode()
        result = 31 * result + this.pDisplayName.hashCode()
        result = 31 * result + this.wLangId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            pName: Pcwstr = ConstPtr(0L),
            size: Size = Size(),
            imageableArea: Rectl = Rectl(),
            pKeyword: Pcstr = ConstPtr(0L),
            stringType: UInt = 0u,
            pMuiDll: Pcwstr = ConstPtr(0L),
            dwResourceId: UInt = 0u,
            pDisplayName: Pcwstr = ConstPtr(0L),
            wLangId: UShort = 0u,
        ): FormInfo2w =
            FormInfo2w(
                flags = flags,
                pNameCtorArg = pName,
                size = size,
                imageableArea = imageableArea,
                pKeywordCtorArg = pKeyword,
                stringType = stringType,
                pMuiDllCtorArg = pMuiDll,
                dwResourceId = dwResourceId,
                pDisplayNameCtorArg = pDisplayName,
                wLangId = wLangId,
            )
    }
}

public data class Glyphrun(
    public var wcLow: UShort = 0u,
    public var wGlyphCount: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Glyphrun> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Glyphrun> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Glyphrun =
                    Glyphrun(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Glyphrun) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wcLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wGlyphCount)
                }
            }
    }
}

public data class InsertpsuipageInfo(
    public var cbSize: UShort = 0u,
    public var type: UByte = 0u,
    public var mode: UByte = 0u,
    public var dwData1: Int = 0,
    public var dwData2: Int = 0,
    public var dwData3: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InsertpsuipageInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InsertpsuipageInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): InsertpsuipageInfo =
                    InsertpsuipageInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: InsertpsuipageInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwData1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwData2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.dwData3)
                }
            }
    }
}

public data class Invoc(
    public var dwCount: UInt = 0u,
    public var loOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Invoc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Invoc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Invoc =
                    Invoc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Invoc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.loOffset)
                }
            }
    }
}

public class ImgErrorInfo internal constructor(
    descriptionCtorArg: Bstr,
    public var guid: Guid,
    public var helpContext: UInt,
    helpFileCtorArg: Bstr,
    sourceCtorArg: Bstr,
    devDescriptionCtorArg: Bstr,
    public var errorID: Guid,
    public var cUserParameters: UInt,
    aUserParametersCtorArg: MutPtr<Bstr>,
    userFallbackCtorArg: Bstr,
    public var exceptionID: UInt,
) {
    public var description: Bstr = descriptionCtorArg
        internal set

    public var helpFile: Bstr = helpFileCtorArg
        internal set

    public var source: Bstr = sourceCtorArg
        internal set

    public var devDescription: Bstr = devDescriptionCtorArg
        internal set

    public var aUserParameters: MutPtr<Bstr> = aUserParametersCtorArg
        internal set

    public var userFallback: Bstr = userFallbackCtorArg
        internal set

    public constructor() : this(
        descriptionCtorArg = ConstPtr(0L),
        guid = Guid(),
        helpContext = 0u,
        helpFileCtorArg = ConstPtr(0L),
        sourceCtorArg = ConstPtr(0L),
        devDescriptionCtorArg = ConstPtr(0L),
        errorID = Guid(),
        cUserParameters = 0u,
        aUserParametersCtorArg = MutPtr(0L),
        userFallbackCtorArg = ConstPtr(0L),
        exceptionID = 0u,
    )

    public operator fun component1(): Bstr = this.description

    public operator fun component2(): Guid = this.guid

    public operator fun component3(): UInt = this.helpContext

    public operator fun component4(): Bstr = this.helpFile

    public operator fun component5(): Bstr = this.source

    public operator fun component6(): Bstr = this.devDescription

    public operator fun component7(): Guid = this.errorID

    public operator fun component8(): UInt = this.cUserParameters

    public operator fun component9(): MutPtr<Bstr> = this.aUserParameters

    public operator fun component10(): Bstr = this.userFallback

    public operator fun component11(): UInt = this.exceptionID

    public fun copy(description: Bstr = this.description, guid: Guid = this.guid, helpContext: UInt = this.helpContext, helpFile: Bstr = this.helpFile, source: Bstr = this.source, devDescription: Bstr = this.devDescription, errorID: Guid = this.errorID, cUserParameters: UInt = this.cUserParameters, aUserParameters: MutPtr<Bstr> = this.aUserParameters, userFallback: Bstr = this.userFallback, exceptionID: UInt = this.exceptionID): ImgErrorInfo = ImgErrorInfo(descriptionCtorArg = description, guid = guid, helpContext = helpContext, helpFileCtorArg = helpFile, sourceCtorArg = source, devDescriptionCtorArg = devDescription, errorID = errorID, cUserParameters = cUserParameters, aUserParametersCtorArg = aUserParameters, userFallbackCtorArg = userFallback, exceptionID = exceptionID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImgErrorInfo) return false
        if (this.description != other.description) return false
        if (this.guid != other.guid) return false
        if (this.helpContext != other.helpContext) return false
        if (this.helpFile != other.helpFile) return false
        if (this.source != other.source) return false
        if (this.devDescription != other.devDescription) return false
        if (this.errorID != other.errorID) return false
        if (this.cUserParameters != other.cUserParameters) return false
        if (this.aUserParameters != other.aUserParameters) return false
        if (this.userFallback != other.userFallback) return false
        if (this.exceptionID != other.exceptionID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.description.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.helpContext.hashCode()
        result = 31 * result + this.helpFile.hashCode()
        result = 31 * result + this.source.hashCode()
        result = 31 * result + this.devDescription.hashCode()
        result = 31 * result + this.errorID.hashCode()
        result = 31 * result + this.cUserParameters.hashCode()
        result = 31 * result + this.aUserParameters.hashCode()
        result = 31 * result + this.userFallback.hashCode()
        result = 31 * result + this.exceptionID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            description: Bstr = ConstPtr(0L),
            guid: Guid = Guid(),
            helpContext: UInt = 0u,
            helpFile: Bstr = ConstPtr(0L),
            source: Bstr = ConstPtr(0L),
            devDescription: Bstr = ConstPtr(0L),
            errorID: Guid = Guid(),
            cUserParameters: UInt = 0u,
            aUserParameters: MutPtr<Bstr> = MutPtr(0L),
            userFallback: Bstr = ConstPtr(0L),
            exceptionID: UInt = 0u,
        ): ImgErrorInfo =
            ImgErrorInfo(
                descriptionCtorArg = description,
                guid = guid,
                helpContext = helpContext,
                helpFileCtorArg = helpFile,
                sourceCtorArg = source,
                devDescriptionCtorArg = devDescription,
                errorID = errorID,
                cUserParameters = cUserParameters,
                aUserParametersCtorArg = aUserParameters,
                userFallbackCtorArg = userFallback,
                exceptionID = exceptionID,
            )
    }
}

public class JobInfo1a internal constructor(
    public var jobId: UInt,
    pPrinterNameCtorArg: Pstr,
    pMachineNameCtorArg: Pstr,
    pUserNameCtorArg: Pstr,
    pDocumentCtorArg: Pstr,
    pDatatypeCtorArg: Pstr,
    pStatusCtorArg: Pstr,
    public var status: UInt,
    public var priority: UInt,
    public var position: UInt,
    public var totalPages: UInt,
    public var pagesPrinted: UInt,
    public var submitted: Systemtime,
) {
    public var pPrinterName: Pstr = pPrinterNameCtorArg
        internal set

    public var pMachineName: Pstr = pMachineNameCtorArg
        internal set

    public var pUserName: Pstr = pUserNameCtorArg
        internal set

    public var pDocument: Pstr = pDocumentCtorArg
        internal set

    public var pDatatype: Pstr = pDatatypeCtorArg
        internal set

    public var pStatus: Pstr = pStatusCtorArg
        internal set

    public constructor() : this(
        jobId = 0u,
        pPrinterNameCtorArg = MutPtr(0L),
        pMachineNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pDocumentCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        pStatusCtorArg = MutPtr(0L),
        status = 0u,
        priority = 0u,
        position = 0u,
        totalPages = 0u,
        pagesPrinted = 0u,
        submitted = Systemtime(),
    )

    public operator fun component1(): UInt = this.jobId

    public operator fun component2(): Pstr = this.pPrinterName

    public operator fun component3(): Pstr = this.pMachineName

    public operator fun component4(): Pstr = this.pUserName

    public operator fun component5(): Pstr = this.pDocument

    public operator fun component6(): Pstr = this.pDatatype

    public operator fun component7(): Pstr = this.pStatus

    public operator fun component8(): UInt = this.status

    public operator fun component9(): UInt = this.priority

    public operator fun component10(): UInt = this.position

    public operator fun component11(): UInt = this.totalPages

    public operator fun component12(): UInt = this.pagesPrinted

    public operator fun component13(): Systemtime = this.submitted

    public fun copy(jobId: UInt = this.jobId, pPrinterName: Pstr = this.pPrinterName, pMachineName: Pstr = this.pMachineName, pUserName: Pstr = this.pUserName, pDocument: Pstr = this.pDocument, pDatatype: Pstr = this.pDatatype, pStatus: Pstr = this.pStatus, status: UInt = this.status, priority: UInt = this.priority, position: UInt = this.position, totalPages: UInt = this.totalPages, pagesPrinted: UInt = this.pagesPrinted, submitted: Systemtime = this.submitted): JobInfo1a = JobInfo1a(jobId = jobId, pPrinterNameCtorArg = pPrinterName, pMachineNameCtorArg = pMachineName, pUserNameCtorArg = pUserName, pDocumentCtorArg = pDocument, pDatatypeCtorArg = pDatatype, pStatusCtorArg = pStatus, status = status, priority = priority, position = position, totalPages = totalPages, pagesPrinted = pagesPrinted, submitted = submitted)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JobInfo1a) return false
        if (this.jobId != other.jobId) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pMachineName != other.pMachineName) return false
        if (this.pUserName != other.pUserName) return false
        if (this.pDocument != other.pDocument) return false
        if (this.pDatatype != other.pDatatype) return false
        if (this.pStatus != other.pStatus) return false
        if (this.status != other.status) return false
        if (this.priority != other.priority) return false
        if (this.position != other.position) return false
        if (this.totalPages != other.totalPages) return false
        if (this.pagesPrinted != other.pagesPrinted) return false
        if (this.submitted != other.submitted) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.jobId.hashCode()
        result = 31 * result + this.pPrinterName.hashCode()
        result = 31 * result + this.pMachineName.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.pDocument.hashCode()
        result = 31 * result + this.pDatatype.hashCode()
        result = 31 * result + this.pStatus.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.position.hashCode()
        result = 31 * result + this.totalPages.hashCode()
        result = 31 * result + this.pagesPrinted.hashCode()
        result = 31 * result + this.submitted.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            jobId: UInt = 0u,
            pPrinterName: Pstr = MutPtr(0L),
            pMachineName: Pstr = MutPtr(0L),
            pUserName: Pstr = MutPtr(0L),
            pDocument: Pstr = MutPtr(0L),
            pDatatype: Pstr = MutPtr(0L),
            pStatus: Pstr = MutPtr(0L),
            status: UInt = 0u,
            priority: UInt = 0u,
            position: UInt = 0u,
            totalPages: UInt = 0u,
            pagesPrinted: UInt = 0u,
            submitted: Systemtime = Systemtime(),
        ): JobInfo1a =
            JobInfo1a(
                jobId = jobId,
                pPrinterNameCtorArg = pPrinterName,
                pMachineNameCtorArg = pMachineName,
                pUserNameCtorArg = pUserName,
                pDocumentCtorArg = pDocument,
                pDatatypeCtorArg = pDatatype,
                pStatusCtorArg = pStatus,
                status = status,
                priority = priority,
                position = position,
                totalPages = totalPages,
                pagesPrinted = pagesPrinted,
                submitted = submitted,
            )
    }
}

public class JobInfo1w internal constructor(
    public var jobId: UInt,
    pPrinterNameCtorArg: Pwstr,
    pMachineNameCtorArg: Pwstr,
    pUserNameCtorArg: Pwstr,
    pDocumentCtorArg: Pwstr,
    pDatatypeCtorArg: Pwstr,
    pStatusCtorArg: Pwstr,
    public var status: UInt,
    public var priority: UInt,
    public var position: UInt,
    public var totalPages: UInt,
    public var pagesPrinted: UInt,
    public var submitted: Systemtime,
) {
    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var pMachineName: Pwstr = pMachineNameCtorArg
        internal set

    public var pUserName: Pwstr = pUserNameCtorArg
        internal set

    public var pDocument: Pwstr = pDocumentCtorArg
        internal set

    public var pDatatype: Pwstr = pDatatypeCtorArg
        internal set

    public var pStatus: Pwstr = pStatusCtorArg
        internal set

    public constructor() : this(
        jobId = 0u,
        pPrinterNameCtorArg = MutPtr(0L),
        pMachineNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pDocumentCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        pStatusCtorArg = MutPtr(0L),
        status = 0u,
        priority = 0u,
        position = 0u,
        totalPages = 0u,
        pagesPrinted = 0u,
        submitted = Systemtime(),
    )

    public operator fun component1(): UInt = this.jobId

    public operator fun component2(): Pwstr = this.pPrinterName

    public operator fun component3(): Pwstr = this.pMachineName

    public operator fun component4(): Pwstr = this.pUserName

    public operator fun component5(): Pwstr = this.pDocument

    public operator fun component6(): Pwstr = this.pDatatype

    public operator fun component7(): Pwstr = this.pStatus

    public operator fun component8(): UInt = this.status

    public operator fun component9(): UInt = this.priority

    public operator fun component10(): UInt = this.position

    public operator fun component11(): UInt = this.totalPages

    public operator fun component12(): UInt = this.pagesPrinted

    public operator fun component13(): Systemtime = this.submitted

    public fun copy(jobId: UInt = this.jobId, pPrinterName: Pwstr = this.pPrinterName, pMachineName: Pwstr = this.pMachineName, pUserName: Pwstr = this.pUserName, pDocument: Pwstr = this.pDocument, pDatatype: Pwstr = this.pDatatype, pStatus: Pwstr = this.pStatus, status: UInt = this.status, priority: UInt = this.priority, position: UInt = this.position, totalPages: UInt = this.totalPages, pagesPrinted: UInt = this.pagesPrinted, submitted: Systemtime = this.submitted): JobInfo1w = JobInfo1w(jobId = jobId, pPrinterNameCtorArg = pPrinterName, pMachineNameCtorArg = pMachineName, pUserNameCtorArg = pUserName, pDocumentCtorArg = pDocument, pDatatypeCtorArg = pDatatype, pStatusCtorArg = pStatus, status = status, priority = priority, position = position, totalPages = totalPages, pagesPrinted = pagesPrinted, submitted = submitted)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JobInfo1w) return false
        if (this.jobId != other.jobId) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pMachineName != other.pMachineName) return false
        if (this.pUserName != other.pUserName) return false
        if (this.pDocument != other.pDocument) return false
        if (this.pDatatype != other.pDatatype) return false
        if (this.pStatus != other.pStatus) return false
        if (this.status != other.status) return false
        if (this.priority != other.priority) return false
        if (this.position != other.position) return false
        if (this.totalPages != other.totalPages) return false
        if (this.pagesPrinted != other.pagesPrinted) return false
        if (this.submitted != other.submitted) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.jobId.hashCode()
        result = 31 * result + this.pPrinterName.hashCode()
        result = 31 * result + this.pMachineName.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.pDocument.hashCode()
        result = 31 * result + this.pDatatype.hashCode()
        result = 31 * result + this.pStatus.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.position.hashCode()
        result = 31 * result + this.totalPages.hashCode()
        result = 31 * result + this.pagesPrinted.hashCode()
        result = 31 * result + this.submitted.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            jobId: UInt = 0u,
            pPrinterName: Pwstr = MutPtr(0L),
            pMachineName: Pwstr = MutPtr(0L),
            pUserName: Pwstr = MutPtr(0L),
            pDocument: Pwstr = MutPtr(0L),
            pDatatype: Pwstr = MutPtr(0L),
            pStatus: Pwstr = MutPtr(0L),
            status: UInt = 0u,
            priority: UInt = 0u,
            position: UInt = 0u,
            totalPages: UInt = 0u,
            pagesPrinted: UInt = 0u,
            submitted: Systemtime = Systemtime(),
        ): JobInfo1w =
            JobInfo1w(
                jobId = jobId,
                pPrinterNameCtorArg = pPrinterName,
                pMachineNameCtorArg = pMachineName,
                pUserNameCtorArg = pUserName,
                pDocumentCtorArg = pDocument,
                pDatatypeCtorArg = pDatatype,
                pStatusCtorArg = pStatus,
                status = status,
                priority = priority,
                position = position,
                totalPages = totalPages,
                pagesPrinted = pagesPrinted,
                submitted = submitted,
            )
    }
}

public class JobInfo2a internal constructor(
    public var jobId: UInt,
    pPrinterNameCtorArg: Pstr,
    pMachineNameCtorArg: Pstr,
    pUserNameCtorArg: Pstr,
    pDocumentCtorArg: Pstr,
    pNotifyNameCtorArg: Pstr,
    pDatatypeCtorArg: Pstr,
    pPrintProcessorCtorArg: Pstr,
    pParametersCtorArg: Pstr,
    pDriverNameCtorArg: Pstr,
    pDevModeCtorArg: MutPtr<Devmodea>,
    pStatusCtorArg: Pstr,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
    public var status: UInt,
    public var priority: UInt,
    public var position: UInt,
    public var startTime: UInt,
    public var untilTime: UInt,
    public var totalPages: UInt,
    public var size: UInt,
    public var submitted: Systemtime,
    public var time: UInt,
    public var pagesPrinted: UInt,
) {
    public var pPrinterName: Pstr = pPrinterNameCtorArg
        internal set

    public var pMachineName: Pstr = pMachineNameCtorArg
        internal set

    public var pUserName: Pstr = pUserNameCtorArg
        internal set

    public var pDocument: Pstr = pDocumentCtorArg
        internal set

    public var pNotifyName: Pstr = pNotifyNameCtorArg
        internal set

    public var pDatatype: Pstr = pDatatypeCtorArg
        internal set

    public var pPrintProcessor: Pstr = pPrintProcessorCtorArg
        internal set

    public var pParameters: Pstr = pParametersCtorArg
        internal set

    public var pDriverName: Pstr = pDriverNameCtorArg
        internal set

    public var pDevMode: MutPtr<Devmodea> = pDevModeCtorArg
        internal set

    public var pStatus: Pstr = pStatusCtorArg
        internal set

    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        jobId = 0u,
        pPrinterNameCtorArg = MutPtr(0L),
        pMachineNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pDocumentCtorArg = MutPtr(0L),
        pNotifyNameCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        pPrintProcessorCtorArg = MutPtr(0L),
        pParametersCtorArg = MutPtr(0L),
        pDriverNameCtorArg = MutPtr(0L),
        pDevModeCtorArg = MutPtr(0L),
        pStatusCtorArg = MutPtr(0L),
        pSecurityDescriptorCtorArg = MutPtr(0L),
        status = 0u,
        priority = 0u,
        position = 0u,
        startTime = 0u,
        untilTime = 0u,
        totalPages = 0u,
        size = 0u,
        submitted = Systemtime(),
        time = 0u,
        pagesPrinted = 0u,
    )

    public companion object {
        public operator fun invoke(
            jobId: UInt = 0u,
            pPrinterName: Pstr = MutPtr(0L),
            pMachineName: Pstr = MutPtr(0L),
            pUserName: Pstr = MutPtr(0L),
            pDocument: Pstr = MutPtr(0L),
            pNotifyName: Pstr = MutPtr(0L),
            pDatatype: Pstr = MutPtr(0L),
            pPrintProcessor: Pstr = MutPtr(0L),
            pParameters: Pstr = MutPtr(0L),
            pDriverName: Pstr = MutPtr(0L),
            pDevMode: MutPtr<Devmodea> = MutPtr(0L),
            pStatus: Pstr = MutPtr(0L),
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
            status: UInt = 0u,
            priority: UInt = 0u,
            position: UInt = 0u,
            startTime: UInt = 0u,
            untilTime: UInt = 0u,
            totalPages: UInt = 0u,
            size: UInt = 0u,
            submitted: Systemtime = Systemtime(),
            time: UInt = 0u,
            pagesPrinted: UInt = 0u,
        ): JobInfo2a =
            JobInfo2a(
                jobId = jobId,
                pPrinterNameCtorArg = pPrinterName,
                pMachineNameCtorArg = pMachineName,
                pUserNameCtorArg = pUserName,
                pDocumentCtorArg = pDocument,
                pNotifyNameCtorArg = pNotifyName,
                pDatatypeCtorArg = pDatatype,
                pPrintProcessorCtorArg = pPrintProcessor,
                pParametersCtorArg = pParameters,
                pDriverNameCtorArg = pDriverName,
                pDevModeCtorArg = pDevMode,
                pStatusCtorArg = pStatus,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
                status = status,
                priority = priority,
                position = position,
                startTime = startTime,
                untilTime = untilTime,
                totalPages = totalPages,
                size = size,
                submitted = submitted,
                time = time,
                pagesPrinted = pagesPrinted,
            )
    }
}

public class JobInfo2w internal constructor(
    public var jobId: UInt,
    pPrinterNameCtorArg: Pwstr,
    pMachineNameCtorArg: Pwstr,
    pUserNameCtorArg: Pwstr,
    pDocumentCtorArg: Pwstr,
    pNotifyNameCtorArg: Pwstr,
    pDatatypeCtorArg: Pwstr,
    pPrintProcessorCtorArg: Pwstr,
    pParametersCtorArg: Pwstr,
    pDriverNameCtorArg: Pwstr,
    pDevModeCtorArg: MutPtr<Devmodew>,
    pStatusCtorArg: Pwstr,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
    public var status: UInt,
    public var priority: UInt,
    public var position: UInt,
    public var startTime: UInt,
    public var untilTime: UInt,
    public var totalPages: UInt,
    public var size: UInt,
    public var submitted: Systemtime,
    public var time: UInt,
    public var pagesPrinted: UInt,
) {
    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var pMachineName: Pwstr = pMachineNameCtorArg
        internal set

    public var pUserName: Pwstr = pUserNameCtorArg
        internal set

    public var pDocument: Pwstr = pDocumentCtorArg
        internal set

    public var pNotifyName: Pwstr = pNotifyNameCtorArg
        internal set

    public var pDatatype: Pwstr = pDatatypeCtorArg
        internal set

    public var pPrintProcessor: Pwstr = pPrintProcessorCtorArg
        internal set

    public var pParameters: Pwstr = pParametersCtorArg
        internal set

    public var pDriverName: Pwstr = pDriverNameCtorArg
        internal set

    public var pDevMode: MutPtr<Devmodew> = pDevModeCtorArg
        internal set

    public var pStatus: Pwstr = pStatusCtorArg
        internal set

    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        jobId = 0u,
        pPrinterNameCtorArg = MutPtr(0L),
        pMachineNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pDocumentCtorArg = MutPtr(0L),
        pNotifyNameCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        pPrintProcessorCtorArg = MutPtr(0L),
        pParametersCtorArg = MutPtr(0L),
        pDriverNameCtorArg = MutPtr(0L),
        pDevModeCtorArg = MutPtr(0L),
        pStatusCtorArg = MutPtr(0L),
        pSecurityDescriptorCtorArg = MutPtr(0L),
        status = 0u,
        priority = 0u,
        position = 0u,
        startTime = 0u,
        untilTime = 0u,
        totalPages = 0u,
        size = 0u,
        submitted = Systemtime(),
        time = 0u,
        pagesPrinted = 0u,
    )

    public companion object {
        public operator fun invoke(
            jobId: UInt = 0u,
            pPrinterName: Pwstr = MutPtr(0L),
            pMachineName: Pwstr = MutPtr(0L),
            pUserName: Pwstr = MutPtr(0L),
            pDocument: Pwstr = MutPtr(0L),
            pNotifyName: Pwstr = MutPtr(0L),
            pDatatype: Pwstr = MutPtr(0L),
            pPrintProcessor: Pwstr = MutPtr(0L),
            pParameters: Pwstr = MutPtr(0L),
            pDriverName: Pwstr = MutPtr(0L),
            pDevMode: MutPtr<Devmodew> = MutPtr(0L),
            pStatus: Pwstr = MutPtr(0L),
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
            status: UInt = 0u,
            priority: UInt = 0u,
            position: UInt = 0u,
            startTime: UInt = 0u,
            untilTime: UInt = 0u,
            totalPages: UInt = 0u,
            size: UInt = 0u,
            submitted: Systemtime = Systemtime(),
            time: UInt = 0u,
            pagesPrinted: UInt = 0u,
        ): JobInfo2w =
            JobInfo2w(
                jobId = jobId,
                pPrinterNameCtorArg = pPrinterName,
                pMachineNameCtorArg = pMachineName,
                pUserNameCtorArg = pUserName,
                pDocumentCtorArg = pDocument,
                pNotifyNameCtorArg = pNotifyName,
                pDatatypeCtorArg = pDatatype,
                pPrintProcessorCtorArg = pPrintProcessor,
                pParametersCtorArg = pParameters,
                pDriverNameCtorArg = pDriverName,
                pDevModeCtorArg = pDevMode,
                pStatusCtorArg = pStatus,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
                status = status,
                priority = priority,
                position = position,
                startTime = startTime,
                untilTime = untilTime,
                totalPages = totalPages,
                size = size,
                submitted = submitted,
                time = time,
                pagesPrinted = pagesPrinted,
            )
    }
}

public data class JobInfo3(
    public var jobId: UInt = 0u,
    public var nextJobId: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobInfo3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JobInfo3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): JobInfo3 =
                    JobInfo3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: JobInfo3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.jobId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nextJobId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved)
                }
            }
    }
}

public class JobInfo4a internal constructor(
    public var jobId: UInt,
    pPrinterNameCtorArg: Pstr,
    pMachineNameCtorArg: Pstr,
    pUserNameCtorArg: Pstr,
    pDocumentCtorArg: Pstr,
    pNotifyNameCtorArg: Pstr,
    pDatatypeCtorArg: Pstr,
    pPrintProcessorCtorArg: Pstr,
    pParametersCtorArg: Pstr,
    pDriverNameCtorArg: Pstr,
    pDevModeCtorArg: MutPtr<Devmodea>,
    pStatusCtorArg: Pstr,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
    public var status: UInt,
    public var priority: UInt,
    public var position: UInt,
    public var startTime: UInt,
    public var untilTime: UInt,
    public var totalPages: UInt,
    public var size: UInt,
    public var submitted: Systemtime,
    public var time: UInt,
    public var pagesPrinted: UInt,
    public var sizeHigh: Int,
) {
    public var pPrinterName: Pstr = pPrinterNameCtorArg
        internal set

    public var pMachineName: Pstr = pMachineNameCtorArg
        internal set

    public var pUserName: Pstr = pUserNameCtorArg
        internal set

    public var pDocument: Pstr = pDocumentCtorArg
        internal set

    public var pNotifyName: Pstr = pNotifyNameCtorArg
        internal set

    public var pDatatype: Pstr = pDatatypeCtorArg
        internal set

    public var pPrintProcessor: Pstr = pPrintProcessorCtorArg
        internal set

    public var pParameters: Pstr = pParametersCtorArg
        internal set

    public var pDriverName: Pstr = pDriverNameCtorArg
        internal set

    public var pDevMode: MutPtr<Devmodea> = pDevModeCtorArg
        internal set

    public var pStatus: Pstr = pStatusCtorArg
        internal set

    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        jobId = 0u,
        pPrinterNameCtorArg = MutPtr(0L),
        pMachineNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pDocumentCtorArg = MutPtr(0L),
        pNotifyNameCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        pPrintProcessorCtorArg = MutPtr(0L),
        pParametersCtorArg = MutPtr(0L),
        pDriverNameCtorArg = MutPtr(0L),
        pDevModeCtorArg = MutPtr(0L),
        pStatusCtorArg = MutPtr(0L),
        pSecurityDescriptorCtorArg = MutPtr(0L),
        status = 0u,
        priority = 0u,
        position = 0u,
        startTime = 0u,
        untilTime = 0u,
        totalPages = 0u,
        size = 0u,
        submitted = Systemtime(),
        time = 0u,
        pagesPrinted = 0u,
        sizeHigh = 0,
    )

    public companion object {
        public operator fun invoke(
            jobId: UInt = 0u,
            pPrinterName: Pstr = MutPtr(0L),
            pMachineName: Pstr = MutPtr(0L),
            pUserName: Pstr = MutPtr(0L),
            pDocument: Pstr = MutPtr(0L),
            pNotifyName: Pstr = MutPtr(0L),
            pDatatype: Pstr = MutPtr(0L),
            pPrintProcessor: Pstr = MutPtr(0L),
            pParameters: Pstr = MutPtr(0L),
            pDriverName: Pstr = MutPtr(0L),
            pDevMode: MutPtr<Devmodea> = MutPtr(0L),
            pStatus: Pstr = MutPtr(0L),
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
            status: UInt = 0u,
            priority: UInt = 0u,
            position: UInt = 0u,
            startTime: UInt = 0u,
            untilTime: UInt = 0u,
            totalPages: UInt = 0u,
            size: UInt = 0u,
            submitted: Systemtime = Systemtime(),
            time: UInt = 0u,
            pagesPrinted: UInt = 0u,
            sizeHigh: Int = 0,
        ): JobInfo4a =
            JobInfo4a(
                jobId = jobId,
                pPrinterNameCtorArg = pPrinterName,
                pMachineNameCtorArg = pMachineName,
                pUserNameCtorArg = pUserName,
                pDocumentCtorArg = pDocument,
                pNotifyNameCtorArg = pNotifyName,
                pDatatypeCtorArg = pDatatype,
                pPrintProcessorCtorArg = pPrintProcessor,
                pParametersCtorArg = pParameters,
                pDriverNameCtorArg = pDriverName,
                pDevModeCtorArg = pDevMode,
                pStatusCtorArg = pStatus,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
                status = status,
                priority = priority,
                position = position,
                startTime = startTime,
                untilTime = untilTime,
                totalPages = totalPages,
                size = size,
                submitted = submitted,
                time = time,
                pagesPrinted = pagesPrinted,
                sizeHigh = sizeHigh,
            )
    }
}

public class JobInfo4w internal constructor(
    public var jobId: UInt,
    pPrinterNameCtorArg: Pwstr,
    pMachineNameCtorArg: Pwstr,
    pUserNameCtorArg: Pwstr,
    pDocumentCtorArg: Pwstr,
    pNotifyNameCtorArg: Pwstr,
    pDatatypeCtorArg: Pwstr,
    pPrintProcessorCtorArg: Pwstr,
    pParametersCtorArg: Pwstr,
    pDriverNameCtorArg: Pwstr,
    pDevModeCtorArg: MutPtr<Devmodew>,
    pStatusCtorArg: Pwstr,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
    public var status: UInt,
    public var priority: UInt,
    public var position: UInt,
    public var startTime: UInt,
    public var untilTime: UInt,
    public var totalPages: UInt,
    public var size: UInt,
    public var submitted: Systemtime,
    public var time: UInt,
    public var pagesPrinted: UInt,
    public var sizeHigh: Int,
) {
    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var pMachineName: Pwstr = pMachineNameCtorArg
        internal set

    public var pUserName: Pwstr = pUserNameCtorArg
        internal set

    public var pDocument: Pwstr = pDocumentCtorArg
        internal set

    public var pNotifyName: Pwstr = pNotifyNameCtorArg
        internal set

    public var pDatatype: Pwstr = pDatatypeCtorArg
        internal set

    public var pPrintProcessor: Pwstr = pPrintProcessorCtorArg
        internal set

    public var pParameters: Pwstr = pParametersCtorArg
        internal set

    public var pDriverName: Pwstr = pDriverNameCtorArg
        internal set

    public var pDevMode: MutPtr<Devmodew> = pDevModeCtorArg
        internal set

    public var pStatus: Pwstr = pStatusCtorArg
        internal set

    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        jobId = 0u,
        pPrinterNameCtorArg = MutPtr(0L),
        pMachineNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pDocumentCtorArg = MutPtr(0L),
        pNotifyNameCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        pPrintProcessorCtorArg = MutPtr(0L),
        pParametersCtorArg = MutPtr(0L),
        pDriverNameCtorArg = MutPtr(0L),
        pDevModeCtorArg = MutPtr(0L),
        pStatusCtorArg = MutPtr(0L),
        pSecurityDescriptorCtorArg = MutPtr(0L),
        status = 0u,
        priority = 0u,
        position = 0u,
        startTime = 0u,
        untilTime = 0u,
        totalPages = 0u,
        size = 0u,
        submitted = Systemtime(),
        time = 0u,
        pagesPrinted = 0u,
        sizeHigh = 0,
    )

    public companion object {
        public operator fun invoke(
            jobId: UInt = 0u,
            pPrinterName: Pwstr = MutPtr(0L),
            pMachineName: Pwstr = MutPtr(0L),
            pUserName: Pwstr = MutPtr(0L),
            pDocument: Pwstr = MutPtr(0L),
            pNotifyName: Pwstr = MutPtr(0L),
            pDatatype: Pwstr = MutPtr(0L),
            pPrintProcessor: Pwstr = MutPtr(0L),
            pParameters: Pwstr = MutPtr(0L),
            pDriverName: Pwstr = MutPtr(0L),
            pDevMode: MutPtr<Devmodew> = MutPtr(0L),
            pStatus: Pwstr = MutPtr(0L),
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
            status: UInt = 0u,
            priority: UInt = 0u,
            position: UInt = 0u,
            startTime: UInt = 0u,
            untilTime: UInt = 0u,
            totalPages: UInt = 0u,
            size: UInt = 0u,
            submitted: Systemtime = Systemtime(),
            time: UInt = 0u,
            pagesPrinted: UInt = 0u,
            sizeHigh: Int = 0,
        ): JobInfo4w =
            JobInfo4w(
                jobId = jobId,
                pPrinterNameCtorArg = pPrinterName,
                pMachineNameCtorArg = pMachineName,
                pUserNameCtorArg = pUserName,
                pDocumentCtorArg = pDocument,
                pNotifyNameCtorArg = pNotifyName,
                pDatatypeCtorArg = pDatatype,
                pPrintProcessorCtorArg = pPrintProcessor,
                pParametersCtorArg = pParameters,
                pDriverNameCtorArg = pDriverName,
                pDevModeCtorArg = pDevMode,
                pStatusCtorArg = pStatus,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
                status = status,
                priority = priority,
                position = position,
                startTime = startTime,
                untilTime = untilTime,
                totalPages = totalPages,
                size = size,
                submitted = submitted,
                time = time,
                pagesPrinted = pagesPrinted,
                sizeHigh = sizeHigh,
            )
    }
}

public data class Kerndata(
    public var dwSize: UInt = 0u,
    public var dwKernPairNum: UInt = 0u,
    public var kernPair: List<FdKerningpair> = List(1) { FdKerningpair() },
)

public data class Maptable(
    public var dwSize: UInt = 0u,
    public var dwGlyphNum: UInt = 0u,
    public var trans: List<Transdata> = List(1) { Transdata() },
)

public class MessageboxParams internal constructor(
    public var cbSize: UInt,
    pTitleCtorArg: Pwstr,
    pMessageCtorArg: Pwstr,
    public var style: UInt,
    public var dwTimeout: UInt,
    public var bWait: Bool,
) {
    public var pTitle: Pwstr = pTitleCtorArg
        internal set

    public var pMessage: Pwstr = pMessageCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pTitleCtorArg = MutPtr(0L),
        pMessageCtorArg = MutPtr(0L),
        style = 0u,
        dwTimeout = 0u,
        bWait = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pwstr = this.pTitle

    public operator fun component3(): Pwstr = this.pMessage

    public operator fun component4(): UInt = this.style

    public operator fun component5(): UInt = this.dwTimeout

    public operator fun component6(): Bool = this.bWait

    public fun copy(cbSize: UInt = this.cbSize, pTitle: Pwstr = this.pTitle, pMessage: Pwstr = this.pMessage, style: UInt = this.style, dwTimeout: UInt = this.dwTimeout, bWait: Bool = this.bWait): MessageboxParams = MessageboxParams(cbSize = cbSize, pTitleCtorArg = pTitle, pMessageCtorArg = pMessage, style = style, dwTimeout = dwTimeout, bWait = bWait)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MessageboxParams) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pTitle != other.pTitle) return false
        if (this.pMessage != other.pMessage) return false
        if (this.style != other.style) return false
        if (this.dwTimeout != other.dwTimeout) return false
        if (this.bWait != other.bWait) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pTitle.hashCode()
        result = 31 * result + this.pMessage.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.dwTimeout.hashCode()
        result = 31 * result + this.bWait.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pTitle: Pwstr = MutPtr(0L),
            pMessage: Pwstr = MutPtr(0L),
            style: UInt = 0u,
            dwTimeout: UInt = 0u,
            bWait: Bool = 0,
        ): MessageboxParams =
            MessageboxParams(
                cbSize = cbSize,
                pTitleCtorArg = pTitle,
                pMessageCtorArg = pMessage,
                style = style,
                dwTimeout = dwTimeout,
                bWait = bWait,
            )
    }
}

public class Monitor(
    public var pfnEnumPorts: PfnPrintingEnumports = null,
    public var pfnOpenPort: PfnPrintingOpenport = null,
    public var pfnOpenPortEx: PfnPrintingOpenportex = null,
    public var pfnStartDocPort: PfnPrintingStartdocport = null,
    public var pfnWritePort: PfnPrintingWriteport = null,
    public var pfnReadPort: PfnPrintingReadport = null,
    public var pfnEndDocPort: PfnPrintingEnddocport = null,
    public var pfnClosePort: PfnPrintingCloseport = null,
    public var pfnAddPort: PfnPrintingAddport = null,
    public var pfnAddPortEx: PfnPrintingAddportex = null,
    public var pfnConfigurePort: PfnPrintingConfigureport = null,
    public var pfnDeletePort: PfnPrintingDeleteport = null,
    public var pfnGetPrinterDataFromPort: PfnPrintingGetprinterdatafromport = null,
    public var pfnSetPortTimeOuts: PfnPrintingSetporttimeouts = null,
    public var pfnXcvOpenPort: PfnPrintingXcvopenport = null,
    public var pfnXcvDataPort: PfnPrintingXcvdataport = null,
    public var pfnXcvClosePort: PfnPrintingXcvcloseport = null,
)

public class Monitor2(
    public var cbSize: UInt = 0u,
    public var pfnEnumPorts: PfnPrintingEnumports2 = null,
    public var pfnOpenPort: PfnPrintingOpenport2 = null,
    public var pfnOpenPortEx: PfnPrintingOpenportex2 = null,
    public var pfnStartDocPort: PfnPrintingStartdocport2 = null,
    public var pfnWritePort: PfnPrintingWriteport2 = null,
    public var pfnReadPort: PfnPrintingReadport2 = null,
    public var pfnEndDocPort: PfnPrintingEnddocport2 = null,
    public var pfnClosePort: PfnPrintingCloseport2 = null,
    public var pfnAddPort: PfnPrintingAddport2 = null,
    public var pfnAddPortEx: PfnPrintingAddportex2 = null,
    public var pfnConfigurePort: PfnPrintingConfigureport2 = null,
    public var pfnDeletePort: PfnPrintingDeleteport2 = null,
    public var pfnGetPrinterDataFromPort: PfnPrintingGetprinterdatafromport2 = null,
    public var pfnSetPortTimeOuts: PfnPrintingSetporttimeouts2 = null,
    public var pfnXcvOpenPort: PfnPrintingXcvopenport2 = null,
    public var pfnXcvDataPort: PfnPrintingXcvdataport2 = null,
    public var pfnXcvClosePort: PfnPrintingXcvcloseport2 = null,
    public var pfnShutdown: PfnPrintingShutdown2 = null,
    public var pfnSendRecvBidiDataFromPort: PfnPrintingSendrecvbididatafromport2 = null,
    public var pfnNotifyUsedPorts: PfnPrintingNotifyusedports2 = null,
    public var pfnNotifyUnusedPorts: PfnPrintingNotifyunusedports2 = null,
    public var pfnPowerEvent: PfnPrintingPowerevent2 = null,
)

public data class Monitorex(
    public var dwMonitorSize: UInt = 0u,
    public var monitor: Monitor = Monitor(),
)

public class Monitorinit internal constructor(
    public var cbSize: UInt,
    hSpoolerCtorArg: Handle,
    hckRegistryRootCtorArg: Hkey,
    pMonitorRegCtorArg: MutPtr<Monitorreg>,
    public var bLocal: Bool,
    pszServerNameCtorArg: Pcwstr,
) {
    public var hSpooler: Handle = hSpoolerCtorArg
        internal set

    public var hckRegistryRoot: Hkey = hckRegistryRootCtorArg
        internal set

    public var pMonitorReg: MutPtr<Monitorreg> = pMonitorRegCtorArg
        internal set

    public var pszServerName: Pcwstr = pszServerNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hSpoolerCtorArg = MutPtr(0L),
        hckRegistryRootCtorArg = MutPtr(0L),
        pMonitorRegCtorArg = MutPtr(0L),
        bLocal = 0,
        pszServerNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Handle = this.hSpooler

    public operator fun component3(): Hkey = this.hckRegistryRoot

    public operator fun component4(): MutPtr<Monitorreg> = this.pMonitorReg

    public operator fun component5(): Bool = this.bLocal

    public operator fun component6(): Pcwstr = this.pszServerName

    public fun copy(cbSize: UInt = this.cbSize, hSpooler: Handle = this.hSpooler, hckRegistryRoot: Hkey = this.hckRegistryRoot, pMonitorReg: MutPtr<Monitorreg> = this.pMonitorReg, bLocal: Bool = this.bLocal, pszServerName: Pcwstr = this.pszServerName): Monitorinit = Monitorinit(cbSize = cbSize, hSpoolerCtorArg = hSpooler, hckRegistryRootCtorArg = hckRegistryRoot, pMonitorRegCtorArg = pMonitorReg, bLocal = bLocal, pszServerNameCtorArg = pszServerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monitorinit) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hSpooler != other.hSpooler) return false
        if (this.hckRegistryRoot != other.hckRegistryRoot) return false
        if (this.pMonitorReg != other.pMonitorReg) return false
        if (this.bLocal != other.bLocal) return false
        if (this.pszServerName != other.pszServerName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hSpooler.hashCode()
        result = 31 * result + this.hckRegistryRoot.hashCode()
        result = 31 * result + this.pMonitorReg.hashCode()
        result = 31 * result + this.bLocal.hashCode()
        result = 31 * result + this.pszServerName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hSpooler: Handle = MutPtr(0L),
            hckRegistryRoot: Hkey = MutPtr(0L),
            pMonitorReg: MutPtr<Monitorreg> = MutPtr(0L),
            bLocal: Bool = 0,
            pszServerName: Pcwstr = ConstPtr(0L),
        ): Monitorinit =
            Monitorinit(
                cbSize = cbSize,
                hSpoolerCtorArg = hSpooler,
                hckRegistryRootCtorArg = hckRegistryRoot,
                pMonitorRegCtorArg = pMonitorReg,
                bLocal = bLocal,
                pszServerNameCtorArg = pszServerName,
            )
    }
}

public data class Monitorreg(
    public var cbSize: UInt = 0u,
    public var fpCreateKey: Int = 0,
    public var fpOpenKey: Int = 0,
    public var fpCloseKey: Int = 0,
    public var fpDeleteKey: Int = 0,
    public var fpEnumKey: Int = 0,
    public var fpQueryInfoKey: Int = 0,
    public var fpSetValue: Int = 0,
    public var fpDeleteValue: Int = 0,
    public var fpEnumValue: Int = 0,
    public var fpQueryValue: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Monitorreg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Monitorreg> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): Monitorreg =
                    Monitorreg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: Monitorreg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.fpCreateKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.fpOpenKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.fpCloseKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.fpDeleteKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.fpEnumKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.fpQueryInfoKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.fpSetValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.fpDeleteValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.fpEnumValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.fpQueryValue)
                }
            }
    }
}

public data class Monitorui(
    public var dwMonitorUISize: UInt = 0u,
    public var pfnAddPortUI: Int = 0,
    public var pfnConfigurePortUI: Int = 0,
    public var pfnDeletePortUI: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Monitorui> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Monitorui> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Monitorui =
                    Monitorui(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Monitorui) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMonitorUISize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.pfnAddPortUI)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.pfnConfigurePortUI)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.pfnDeletePortUI)
                }
            }
    }
}

public class MonitorInfo1a internal constructor(
    pNameCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pName

    public fun copy(pName: Pstr = this.pName): MonitorInfo1a = MonitorInfo1a(pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MonitorInfo1a) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int = this.pName.hashCode()

    public companion object {
        public operator fun invoke(
            pName: Pstr = MutPtr(0L),
        ): MonitorInfo1a =
            MonitorInfo1a(
                pNameCtorArg = pName,
            )
    }
}

public class MonitorInfo1w internal constructor(
    pNameCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pName

    public fun copy(pName: Pwstr = this.pName): MonitorInfo1w = MonitorInfo1w(pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MonitorInfo1w) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int = this.pName.hashCode()

    public companion object {
        public operator fun invoke(
            pName: Pwstr = MutPtr(0L),
        ): MonitorInfo1w =
            MonitorInfo1w(
                pNameCtorArg = pName,
            )
    }
}

public class MonitorInfo2a internal constructor(
    pNameCtorArg: Pstr,
    pEnvironmentCtorArg: Pstr,
    pDLLNameCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public var pEnvironment: Pstr = pEnvironmentCtorArg
        internal set

    public var pDLLName: Pstr = pDLLNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDLLNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pName

    public operator fun component2(): Pstr = this.pEnvironment

    public operator fun component3(): Pstr = this.pDLLName

    public fun copy(pName: Pstr = this.pName, pEnvironment: Pstr = this.pEnvironment, pDLLName: Pstr = this.pDLLName): MonitorInfo2a = MonitorInfo2a(pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDLLNameCtorArg = pDLLName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MonitorInfo2a) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDLLName != other.pDLLName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDLLName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pName: Pstr = MutPtr(0L),
            pEnvironment: Pstr = MutPtr(0L),
            pDLLName: Pstr = MutPtr(0L),
        ): MonitorInfo2a =
            MonitorInfo2a(
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDLLNameCtorArg = pDLLName,
            )
    }
}

public class MonitorInfo2w internal constructor(
    pNameCtorArg: Pwstr,
    pEnvironmentCtorArg: Pwstr,
    pDLLNameCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public var pEnvironment: Pwstr = pEnvironmentCtorArg
        internal set

    public var pDLLName: Pwstr = pDLLNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDLLNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pName

    public operator fun component2(): Pwstr = this.pEnvironment

    public operator fun component3(): Pwstr = this.pDLLName

    public fun copy(pName: Pwstr = this.pName, pEnvironment: Pwstr = this.pEnvironment, pDLLName: Pwstr = this.pDLLName): MonitorInfo2w = MonitorInfo2w(pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDLLNameCtorArg = pDLLName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MonitorInfo2w) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDLLName != other.pDLLName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDLLName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pName: Pwstr = MutPtr(0L),
            pEnvironment: Pwstr = MutPtr(0L),
            pDLLName: Pwstr = MutPtr(0L),
        ): MonitorInfo2w =
            MonitorInfo2w(
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDLLNameCtorArg = pDLLName,
            )
    }
}

public data class MxdcEscapeHeaderT(
    public var cbInput: UInt = 0u,
    public var cbOutput: UInt = 0u,
    public var opCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcEscapeHeaderT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcEscapeHeaderT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MxdcEscapeHeaderT =
                    MxdcEscapeHeaderT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MxdcEscapeHeaderT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbInput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbOutput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.opCode)
                }
            }
    }
}

public data class MxdcGetFilenameDataT(
    public var cbOutput: UInt = 0u,
    public var wszData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MxdcGetFilenameDataT) return false
        if (this.cbOutput != other.cbOutput) return false
        if (!this.wszData.contentEquals(other.wszData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbOutput.hashCode()
        result = 31 * result + this.wszData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcGetFilenameDataT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcGetFilenameDataT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): MxdcGetFilenameDataT =
                    MxdcGetFilenameDataT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: MxdcGetFilenameDataT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbOutput)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.wszData.toList())
                }
            }
    }
}

public data class MxdcPrintticketDataT(
    public var dwDataSize: UInt = 0u,
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MxdcPrintticketDataT) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDataSize.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcPrintticketDataT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcPrintticketDataT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 5L
                override fun readNative(addr: Long): MxdcPrintticketDataT =
                    MxdcPrintticketDataT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: MxdcPrintticketDataT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.bData.toList())
                }
            }
    }
}

public data class MxdcPrintticketEscapeT(
    public var mxdcEscape: MxdcEscapeHeaderT = MxdcEscapeHeaderT(),
    public var printTicketData: MxdcPrintticketDataT = MxdcPrintticketDataT(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcPrintticketEscapeT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcPrintticketEscapeT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 17L
                override fun readNative(addr: Long): MxdcPrintticketEscapeT =
                    MxdcPrintticketEscapeT(
                        (MxdcEscapeHeaderT.typeLayout()).readNative(addr),
                        (MxdcPrintticketDataT.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MxdcPrintticketEscapeT) {
                    (MxdcEscapeHeaderT.typeLayout()).writeNative(addr, value.mxdcEscape)
                    (MxdcPrintticketDataT.typeLayout()).writeNative(addr + 12L, value.printTicketData)
                }
            }
    }
}

public data class MxdcS0pageDataT(
    public var dwSize: UInt = 0u,
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MxdcS0pageDataT) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcS0pageDataT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcS0pageDataT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 5L
                override fun readNative(addr: Long): MxdcS0pageDataT =
                    MxdcS0pageDataT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: MxdcS0pageDataT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.bData.toList())
                }
            }
    }
}

public data class MxdcS0pagePassthroughEscapeT(
    public var mxdcEscape: MxdcEscapeHeaderT = MxdcEscapeHeaderT(),
    public var xpsS0PageData: MxdcS0pageDataT = MxdcS0pageDataT(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcS0pagePassthroughEscapeT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcS0pagePassthroughEscapeT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 17L
                override fun readNative(addr: Long): MxdcS0pagePassthroughEscapeT =
                    MxdcS0pagePassthroughEscapeT(
                        (MxdcEscapeHeaderT.typeLayout()).readNative(addr),
                        (MxdcS0pageDataT.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MxdcS0pagePassthroughEscapeT) {
                    (MxdcEscapeHeaderT.typeLayout()).writeNative(addr, value.mxdcEscape)
                    (MxdcS0pageDataT.typeLayout()).writeNative(addr + 12L, value.xpsS0PageData)
                }
            }
    }
}

public data class MxdcS0pageResourceEscapeT(
    public var mxdcEscape: MxdcEscapeHeaderT = MxdcEscapeHeaderT(),
    public var xpsS0PageResourcePassthrough: MxdcXpsS0pageResourceT = MxdcXpsS0pageResourceT(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcS0pageResourceEscapeT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcS0pageResourceEscapeT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 285L
                override fun readNative(addr: Long): MxdcS0pageResourceEscapeT =
                    MxdcS0pageResourceEscapeT(
                        (MxdcEscapeHeaderT.typeLayout()).readNative(addr),
                        (MxdcXpsS0pageResourceT.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MxdcS0pageResourceEscapeT) {
                    (MxdcEscapeHeaderT.typeLayout()).writeNative(addr, value.mxdcEscape)
                    (MxdcXpsS0pageResourceT.typeLayout()).writeNative(addr + 12L, value.xpsS0PageResourcePassthrough)
                }
            }
    }
}

public data class MxdcXpsS0pageResourceT(
    public var dwSize: UInt = 0u,
    public var dwResourceType: UInt = 0u,
    public var szUri: UByteArray = UByteArray(260),
    public var dwDataSize: UInt = 0u,
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MxdcXpsS0pageResourceT) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwResourceType != other.dwResourceType) return false
        if (!this.szUri.contentEquals(other.szUri)) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwResourceType.hashCode()
        result = 31 * result + this.szUri.contentHashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcXpsS0pageResourceT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MxdcXpsS0pageResourceT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 273L
                override fun readNative(addr: Long): MxdcXpsS0pageResourceT =
                    MxdcXpsS0pageResourceT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (260).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 272L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: MxdcXpsS0pageResourceT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwResourceType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (260).toInt())
                    ).writeNative(addr + 8L, value.szUri.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.dwDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 272L, value.bData.toList())
                }
            }
    }
}

public class NotificationConfig1 internal constructor(
    public var cbSize: UInt,
    public var fdwFlags: UInt,
    public var pfnNotifyCallback: RouterNotifyCallback,
    pContextCtorArg: MutPtr<CVoid>,
) {
    public var pContext: MutPtr<CVoid> = pContextCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fdwFlags = 0u,
        pfnNotifyCallback = null,
        pContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.fdwFlags

    public operator fun component3(): RouterNotifyCallback = this.pfnNotifyCallback

    public operator fun component4(): MutPtr<CVoid> = this.pContext

    public fun copy(cbSize: UInt = this.cbSize, fdwFlags: UInt = this.fdwFlags, pfnNotifyCallback: RouterNotifyCallback = this.pfnNotifyCallback, pContext: MutPtr<CVoid> = this.pContext): NotificationConfig1 = NotificationConfig1(cbSize = cbSize, fdwFlags = fdwFlags, pfnNotifyCallback = pfnNotifyCallback, pContextCtorArg = pContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NotificationConfig1) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fdwFlags != other.fdwFlags) return false
        if (this.pfnNotifyCallback != other.pfnNotifyCallback) return false
        if (this.pContext != other.pContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fdwFlags.hashCode()
        result = 31 * result + this.pfnNotifyCallback.hashCode()
        result = 31 * result + this.pContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fdwFlags: UInt = 0u,
            pfnNotifyCallback: RouterNotifyCallback = null,
            pContext: MutPtr<CVoid> = MutPtr(0L),
        ): NotificationConfig1 =
            NotificationConfig1(
                cbSize = cbSize,
                fdwFlags = fdwFlags,
                pfnNotifyCallback = pfnNotifyCallback,
                pContextCtorArg = pContext,
            )
    }
}

public class Oemcuipparam internal constructor(
    public var cbSize: UInt,
    poemuiobjCtorArg: MutPtr<Oemuiobj>,
    hPrinterCtorArg: Handle,
    pPrinterNameCtorArg: Pwstr,
    hModuleCtorArg: Handle,
    hOEMHeapCtorArg: Handle,
    pPublicDMCtorArg: MutPtr<Devmodea>,
    pOEMDMCtorArg: MutPtr<CVoid>,
    public var dwFlags: UInt,
    pDrvOptItemsCtorArg: MutPtr<Optitem>,
    public var cDrvOptItems: UInt,
    pOEMOptItemsCtorArg: MutPtr<Optitem>,
    public var cOEMOptItems: UInt,
    pOEMUserDataCtorArg: MutPtr<CVoid>,
    public var oEMCUIPCallback: Oemcuipcallback,
) {
    public var poemuiobj: MutPtr<Oemuiobj> = poemuiobjCtorArg
        internal set

    public var hPrinter: Handle = hPrinterCtorArg
        internal set

    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var hModule: Handle = hModuleCtorArg
        internal set

    public var hOEMHeap: Handle = hOEMHeapCtorArg
        internal set

    public var pPublicDM: MutPtr<Devmodea> = pPublicDMCtorArg
        internal set

    public var pOEMDM: MutPtr<CVoid> = pOEMDMCtorArg
        internal set

    public var pDrvOptItems: MutPtr<Optitem> = pDrvOptItemsCtorArg
        internal set

    public var pOEMOptItems: MutPtr<Optitem> = pOEMOptItemsCtorArg
        internal set

    public var pOEMUserData: MutPtr<CVoid> = pOEMUserDataCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        poemuiobjCtorArg = MutPtr(0L),
        hPrinterCtorArg = MutPtr(0L),
        pPrinterNameCtorArg = MutPtr(0L),
        hModuleCtorArg = MutPtr(0L),
        hOEMHeapCtorArg = MutPtr(0L),
        pPublicDMCtorArg = MutPtr(0L),
        pOEMDMCtorArg = MutPtr(0L),
        dwFlags = 0u,
        pDrvOptItemsCtorArg = MutPtr(0L),
        cDrvOptItems = 0u,
        pOEMOptItemsCtorArg = MutPtr(0L),
        cOEMOptItems = 0u,
        pOEMUserDataCtorArg = MutPtr(0L),
        oEMCUIPCallback = null,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<Oemuiobj> = this.poemuiobj

    public operator fun component3(): Handle = this.hPrinter

    public operator fun component4(): Pwstr = this.pPrinterName

    public operator fun component5(): Handle = this.hModule

    public operator fun component6(): Handle = this.hOEMHeap

    public operator fun component7(): MutPtr<Devmodea> = this.pPublicDM

    public operator fun component8(): MutPtr<CVoid> = this.pOEMDM

    public operator fun component9(): UInt = this.dwFlags

    public operator fun component10(): MutPtr<Optitem> = this.pDrvOptItems

    public operator fun component11(): UInt = this.cDrvOptItems

    public operator fun component12(): MutPtr<Optitem> = this.pOEMOptItems

    public operator fun component13(): UInt = this.cOEMOptItems

    public operator fun component14(): MutPtr<CVoid> = this.pOEMUserData

    public operator fun component15(): Oemcuipcallback = this.oEMCUIPCallback

    public fun copy(cbSize: UInt = this.cbSize, poemuiobj: MutPtr<Oemuiobj> = this.poemuiobj, hPrinter: Handle = this.hPrinter, pPrinterName: Pwstr = this.pPrinterName, hModule: Handle = this.hModule, hOEMHeap: Handle = this.hOEMHeap, pPublicDM: MutPtr<Devmodea> = this.pPublicDM, pOEMDM: MutPtr<CVoid> = this.pOEMDM, dwFlags: UInt = this.dwFlags, pDrvOptItems: MutPtr<Optitem> = this.pDrvOptItems, cDrvOptItems: UInt = this.cDrvOptItems, pOEMOptItems: MutPtr<Optitem> = this.pOEMOptItems, cOEMOptItems: UInt = this.cOEMOptItems, pOEMUserData: MutPtr<CVoid> = this.pOEMUserData, oEMCUIPCallback: Oemcuipcallback = this.oEMCUIPCallback): Oemcuipparam = Oemcuipparam(cbSize = cbSize, poemuiobjCtorArg = poemuiobj, hPrinterCtorArg = hPrinter, pPrinterNameCtorArg = pPrinterName, hModuleCtorArg = hModule, hOEMHeapCtorArg = hOEMHeap, pPublicDMCtorArg = pPublicDM, pOEMDMCtorArg = pOEMDM, dwFlags = dwFlags, pDrvOptItemsCtorArg = pDrvOptItems, cDrvOptItems = cDrvOptItems, pOEMOptItemsCtorArg = pOEMOptItems, cOEMOptItems = cOEMOptItems, pOEMUserDataCtorArg = pOEMUserData, oEMCUIPCallback = oEMCUIPCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oemcuipparam) return false
        if (this.cbSize != other.cbSize) return false
        if (this.poemuiobj != other.poemuiobj) return false
        if (this.hPrinter != other.hPrinter) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.hModule != other.hModule) return false
        if (this.hOEMHeap != other.hOEMHeap) return false
        if (this.pPublicDM != other.pPublicDM) return false
        if (this.pOEMDM != other.pOEMDM) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pDrvOptItems != other.pDrvOptItems) return false
        if (this.cDrvOptItems != other.cDrvOptItems) return false
        if (this.pOEMOptItems != other.pOEMOptItems) return false
        if (this.cOEMOptItems != other.cOEMOptItems) return false
        if (this.pOEMUserData != other.pOEMUserData) return false
        if (this.oEMCUIPCallback != other.oEMCUIPCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.poemuiobj.hashCode()
        result = 31 * result + this.hPrinter.hashCode()
        result = 31 * result + this.pPrinterName.hashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.hOEMHeap.hashCode()
        result = 31 * result + this.pPublicDM.hashCode()
        result = 31 * result + this.pOEMDM.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pDrvOptItems.hashCode()
        result = 31 * result + this.cDrvOptItems.hashCode()
        result = 31 * result + this.pOEMOptItems.hashCode()
        result = 31 * result + this.cOEMOptItems.hashCode()
        result = 31 * result + this.pOEMUserData.hashCode()
        result = 31 * result + this.oEMCUIPCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            poemuiobj: MutPtr<Oemuiobj> = MutPtr(0L),
            hPrinter: Handle = MutPtr(0L),
            pPrinterName: Pwstr = MutPtr(0L),
            hModule: Handle = MutPtr(0L),
            hOEMHeap: Handle = MutPtr(0L),
            pPublicDM: MutPtr<Devmodea> = MutPtr(0L),
            pOEMDM: MutPtr<CVoid> = MutPtr(0L),
            dwFlags: UInt = 0u,
            pDrvOptItems: MutPtr<Optitem> = MutPtr(0L),
            cDrvOptItems: UInt = 0u,
            pOEMOptItems: MutPtr<Optitem> = MutPtr(0L),
            cOEMOptItems: UInt = 0u,
            pOEMUserData: MutPtr<CVoid> = MutPtr(0L),
            oEMCUIPCallback: Oemcuipcallback = null,
        ): Oemcuipparam =
            Oemcuipparam(
                cbSize = cbSize,
                poemuiobjCtorArg = poemuiobj,
                hPrinterCtorArg = hPrinter,
                pPrinterNameCtorArg = pPrinterName,
                hModuleCtorArg = hModule,
                hOEMHeapCtorArg = hOEMHeap,
                pPublicDMCtorArg = pPublicDM,
                pOEMDMCtorArg = pOEMDM,
                dwFlags = dwFlags,
                pDrvOptItemsCtorArg = pDrvOptItems,
                cDrvOptItems = cDrvOptItems,
                pOEMOptItemsCtorArg = pOEMOptItems,
                cOEMOptItems = cOEMOptItems,
                pOEMUserDataCtorArg = pOEMUserData,
                oEMCUIPCallback = oEMCUIPCallback,
            )
    }
}

public class Oemdmparam internal constructor(
    public var cbSize: UInt,
    pdriverobjCtorArg: MutPtr<CVoid>,
    hPrinterCtorArg: Handle,
    hModuleCtorArg: Handle,
    pPublicDMInCtorArg: MutPtr<Devmodea>,
    pPublicDMOutCtorArg: MutPtr<Devmodea>,
    pOEMDMInCtorArg: MutPtr<CVoid>,
    pOEMDMOutCtorArg: MutPtr<CVoid>,
    public var cbBufSize: UInt,
) {
    public var pdriverobj: MutPtr<CVoid> = pdriverobjCtorArg
        internal set

    public var hPrinter: Handle = hPrinterCtorArg
        internal set

    public var hModule: Handle = hModuleCtorArg
        internal set

    public var pPublicDMIn: MutPtr<Devmodea> = pPublicDMInCtorArg
        internal set

    public var pPublicDMOut: MutPtr<Devmodea> = pPublicDMOutCtorArg
        internal set

    public var pOEMDMIn: MutPtr<CVoid> = pOEMDMInCtorArg
        internal set

    public var pOEMDMOut: MutPtr<CVoid> = pOEMDMOutCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pdriverobjCtorArg = MutPtr(0L),
        hPrinterCtorArg = MutPtr(0L),
        hModuleCtorArg = MutPtr(0L),
        pPublicDMInCtorArg = MutPtr(0L),
        pPublicDMOutCtorArg = MutPtr(0L),
        pOEMDMInCtorArg = MutPtr(0L),
        pOEMDMOutCtorArg = MutPtr(0L),
        cbBufSize = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<CVoid> = this.pdriverobj

    public operator fun component3(): Handle = this.hPrinter

    public operator fun component4(): Handle = this.hModule

    public operator fun component5(): MutPtr<Devmodea> = this.pPublicDMIn

    public operator fun component6(): MutPtr<Devmodea> = this.pPublicDMOut

    public operator fun component7(): MutPtr<CVoid> = this.pOEMDMIn

    public operator fun component8(): MutPtr<CVoid> = this.pOEMDMOut

    public operator fun component9(): UInt = this.cbBufSize

    public fun copy(cbSize: UInt = this.cbSize, pdriverobj: MutPtr<CVoid> = this.pdriverobj, hPrinter: Handle = this.hPrinter, hModule: Handle = this.hModule, pPublicDMIn: MutPtr<Devmodea> = this.pPublicDMIn, pPublicDMOut: MutPtr<Devmodea> = this.pPublicDMOut, pOEMDMIn: MutPtr<CVoid> = this.pOEMDMIn, pOEMDMOut: MutPtr<CVoid> = this.pOEMDMOut, cbBufSize: UInt = this.cbBufSize): Oemdmparam = Oemdmparam(cbSize = cbSize, pdriverobjCtorArg = pdriverobj, hPrinterCtorArg = hPrinter, hModuleCtorArg = hModule, pPublicDMInCtorArg = pPublicDMIn, pPublicDMOutCtorArg = pPublicDMOut, pOEMDMInCtorArg = pOEMDMIn, pOEMDMOutCtorArg = pOEMDMOut, cbBufSize = cbBufSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oemdmparam) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pdriverobj != other.pdriverobj) return false
        if (this.hPrinter != other.hPrinter) return false
        if (this.hModule != other.hModule) return false
        if (this.pPublicDMIn != other.pPublicDMIn) return false
        if (this.pPublicDMOut != other.pPublicDMOut) return false
        if (this.pOEMDMIn != other.pOEMDMIn) return false
        if (this.pOEMDMOut != other.pOEMDMOut) return false
        if (this.cbBufSize != other.cbBufSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pdriverobj.hashCode()
        result = 31 * result + this.hPrinter.hashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.pPublicDMIn.hashCode()
        result = 31 * result + this.pPublicDMOut.hashCode()
        result = 31 * result + this.pOEMDMIn.hashCode()
        result = 31 * result + this.pOEMDMOut.hashCode()
        result = 31 * result + this.cbBufSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pdriverobj: MutPtr<CVoid> = MutPtr(0L),
            hPrinter: Handle = MutPtr(0L),
            hModule: Handle = MutPtr(0L),
            pPublicDMIn: MutPtr<Devmodea> = MutPtr(0L),
            pPublicDMOut: MutPtr<Devmodea> = MutPtr(0L),
            pOEMDMIn: MutPtr<CVoid> = MutPtr(0L),
            pOEMDMOut: MutPtr<CVoid> = MutPtr(0L),
            cbBufSize: UInt = 0u,
        ): Oemdmparam =
            Oemdmparam(
                cbSize = cbSize,
                pdriverobjCtorArg = pdriverobj,
                hPrinterCtorArg = hPrinter,
                hModuleCtorArg = hModule,
                pPublicDMInCtorArg = pPublicDMIn,
                pPublicDMOutCtorArg = pPublicDMOut,
                pOEMDMInCtorArg = pOEMDMIn,
                pOEMDMOutCtorArg = pOEMDMOut,
                cbBufSize = cbBufSize,
            )
    }
}

public class Oemfontinstparam internal constructor(
    public var cbSize: UInt,
    hPrinterCtorArg: Handle,
    hModuleCtorArg: Handle,
    hHeapCtorArg: Handle,
    public var dwFlags: UInt,
    pFontInstallerNameCtorArg: Pwstr,
) {
    public var hPrinter: Handle = hPrinterCtorArg
        internal set

    public var hModule: Handle = hModuleCtorArg
        internal set

    public var hHeap: Handle = hHeapCtorArg
        internal set

    public var pFontInstallerName: Pwstr = pFontInstallerNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hPrinterCtorArg = MutPtr(0L),
        hModuleCtorArg = MutPtr(0L),
        hHeapCtorArg = MutPtr(0L),
        dwFlags = 0u,
        pFontInstallerNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Handle = this.hPrinter

    public operator fun component3(): Handle = this.hModule

    public operator fun component4(): Handle = this.hHeap

    public operator fun component5(): UInt = this.dwFlags

    public operator fun component6(): Pwstr = this.pFontInstallerName

    public fun copy(cbSize: UInt = this.cbSize, hPrinter: Handle = this.hPrinter, hModule: Handle = this.hModule, hHeap: Handle = this.hHeap, dwFlags: UInt = this.dwFlags, pFontInstallerName: Pwstr = this.pFontInstallerName): Oemfontinstparam = Oemfontinstparam(cbSize = cbSize, hPrinterCtorArg = hPrinter, hModuleCtorArg = hModule, hHeapCtorArg = hHeap, dwFlags = dwFlags, pFontInstallerNameCtorArg = pFontInstallerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oemfontinstparam) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hPrinter != other.hPrinter) return false
        if (this.hModule != other.hModule) return false
        if (this.hHeap != other.hHeap) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pFontInstallerName != other.pFontInstallerName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hPrinter.hashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.hHeap.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pFontInstallerName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hPrinter: Handle = MutPtr(0L),
            hModule: Handle = MutPtr(0L),
            hHeap: Handle = MutPtr(0L),
            dwFlags: UInt = 0u,
            pFontInstallerName: Pwstr = MutPtr(0L),
        ): Oemfontinstparam =
            Oemfontinstparam(
                cbSize = cbSize,
                hPrinterCtorArg = hPrinter,
                hModuleCtorArg = hModule,
                hHeapCtorArg = hHeap,
                dwFlags = dwFlags,
                pFontInstallerNameCtorArg = pFontInstallerName,
            )
    }
}

public class Oemuiobj internal constructor(
    public var cbSize: UInt,
    pOemUIProcsCtorArg: MutPtr<Oemuiprocs>,
) {
    public var pOemUIProcs: MutPtr<Oemuiprocs> = pOemUIProcsCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pOemUIProcsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<Oemuiprocs> = this.pOemUIProcs

    public fun copy(cbSize: UInt = this.cbSize, pOemUIProcs: MutPtr<Oemuiprocs> = this.pOemUIProcs): Oemuiobj = Oemuiobj(cbSize = cbSize, pOemUIProcsCtorArg = pOemUIProcs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oemuiobj) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pOemUIProcs != other.pOemUIProcs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pOemUIProcs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Oemuiobj> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Oemuiobj> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Oemuiobj =
                    Oemuiobj(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Oemuiprocs>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Oemuiobj) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Oemuiprocs>(64)
                    ).writeNative(addr + 8L, value.pOemUIProcs)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pOemUIProcs: MutPtr<Oemuiprocs> = MutPtr(0L),
        ): Oemuiobj =
            Oemuiobj(
                cbSize = cbSize,
                pOemUIProcsCtorArg = pOemUIProcs,
            )
    }
}

public data class Oemuiprocs(
    public var drvGetDriverSetting: PfnDrvGetDriverSetting = null,
    public var drvUpdateUISetting: PfnDrvUpdateUisetting = null,
)

public class Oemuipsparam internal constructor(
    public var cbSize: UInt,
    poemuiobjCtorArg: MutPtr<Oemuiobj>,
    hPrinterCtorArg: Handle,
    pPrinterNameCtorArg: Pwstr,
    hModuleCtorArg: Handle,
    hOEMHeapCtorArg: Handle,
    pPublicDMCtorArg: MutPtr<Devmodea>,
    pOEMDMCtorArg: MutPtr<CVoid>,
    pOEMUserDataCtorArg: MutPtr<CVoid>,
    public var dwFlags: UInt,
    pOemEntryCtorArg: MutPtr<CVoid>,
) {
    public var poemuiobj: MutPtr<Oemuiobj> = poemuiobjCtorArg
        internal set

    public var hPrinter: Handle = hPrinterCtorArg
        internal set

    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var hModule: Handle = hModuleCtorArg
        internal set

    public var hOEMHeap: Handle = hOEMHeapCtorArg
        internal set

    public var pPublicDM: MutPtr<Devmodea> = pPublicDMCtorArg
        internal set

    public var pOEMDM: MutPtr<CVoid> = pOEMDMCtorArg
        internal set

    public var pOEMUserData: MutPtr<CVoid> = pOEMUserDataCtorArg
        internal set

    public var pOemEntry: MutPtr<CVoid> = pOemEntryCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        poemuiobjCtorArg = MutPtr(0L),
        hPrinterCtorArg = MutPtr(0L),
        pPrinterNameCtorArg = MutPtr(0L),
        hModuleCtorArg = MutPtr(0L),
        hOEMHeapCtorArg = MutPtr(0L),
        pPublicDMCtorArg = MutPtr(0L),
        pOEMDMCtorArg = MutPtr(0L),
        pOEMUserDataCtorArg = MutPtr(0L),
        dwFlags = 0u,
        pOemEntryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<Oemuiobj> = this.poemuiobj

    public operator fun component3(): Handle = this.hPrinter

    public operator fun component4(): Pwstr = this.pPrinterName

    public operator fun component5(): Handle = this.hModule

    public operator fun component6(): Handle = this.hOEMHeap

    public operator fun component7(): MutPtr<Devmodea> = this.pPublicDM

    public operator fun component8(): MutPtr<CVoid> = this.pOEMDM

    public operator fun component9(): MutPtr<CVoid> = this.pOEMUserData

    public operator fun component10(): UInt = this.dwFlags

    public operator fun component11(): MutPtr<CVoid> = this.pOemEntry

    public fun copy(cbSize: UInt = this.cbSize, poemuiobj: MutPtr<Oemuiobj> = this.poemuiobj, hPrinter: Handle = this.hPrinter, pPrinterName: Pwstr = this.pPrinterName, hModule: Handle = this.hModule, hOEMHeap: Handle = this.hOEMHeap, pPublicDM: MutPtr<Devmodea> = this.pPublicDM, pOEMDM: MutPtr<CVoid> = this.pOEMDM, pOEMUserData: MutPtr<CVoid> = this.pOEMUserData, dwFlags: UInt = this.dwFlags, pOemEntry: MutPtr<CVoid> = this.pOemEntry): Oemuipsparam = Oemuipsparam(cbSize = cbSize, poemuiobjCtorArg = poemuiobj, hPrinterCtorArg = hPrinter, pPrinterNameCtorArg = pPrinterName, hModuleCtorArg = hModule, hOEMHeapCtorArg = hOEMHeap, pPublicDMCtorArg = pPublicDM, pOEMDMCtorArg = pOEMDM, pOEMUserDataCtorArg = pOEMUserData, dwFlags = dwFlags, pOemEntryCtorArg = pOemEntry)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oemuipsparam) return false
        if (this.cbSize != other.cbSize) return false
        if (this.poemuiobj != other.poemuiobj) return false
        if (this.hPrinter != other.hPrinter) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.hModule != other.hModule) return false
        if (this.hOEMHeap != other.hOEMHeap) return false
        if (this.pPublicDM != other.pPublicDM) return false
        if (this.pOEMDM != other.pOEMDM) return false
        if (this.pOEMUserData != other.pOEMUserData) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pOemEntry != other.pOemEntry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.poemuiobj.hashCode()
        result = 31 * result + this.hPrinter.hashCode()
        result = 31 * result + this.pPrinterName.hashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.hOEMHeap.hashCode()
        result = 31 * result + this.pPublicDM.hashCode()
        result = 31 * result + this.pOEMDM.hashCode()
        result = 31 * result + this.pOEMUserData.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pOemEntry.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            poemuiobj: MutPtr<Oemuiobj> = MutPtr(0L),
            hPrinter: Handle = MutPtr(0L),
            pPrinterName: Pwstr = MutPtr(0L),
            hModule: Handle = MutPtr(0L),
            hOEMHeap: Handle = MutPtr(0L),
            pPublicDM: MutPtr<Devmodea> = MutPtr(0L),
            pOEMDM: MutPtr<CVoid> = MutPtr(0L),
            pOEMUserData: MutPtr<CVoid> = MutPtr(0L),
            dwFlags: UInt = 0u,
            pOemEntry: MutPtr<CVoid> = MutPtr(0L),
        ): Oemuipsparam =
            Oemuipsparam(
                cbSize = cbSize,
                poemuiobjCtorArg = poemuiobj,
                hPrinterCtorArg = hPrinter,
                pPrinterNameCtorArg = pPrinterName,
                hModuleCtorArg = hModule,
                hOEMHeapCtorArg = hOEMHeap,
                pPublicDMCtorArg = pPublicDM,
                pOEMDMCtorArg = pOEMDM,
                pOEMUserDataCtorArg = pOEMUserData,
                dwFlags = dwFlags,
                pOemEntryCtorArg = pOemEntry,
            )
    }
}

public data class OemDmextraheader(
    public var dwSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var dwVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OemDmextraheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OemDmextraheader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): OemDmextraheader =
                    OemDmextraheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: OemDmextraheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwVersion)
                }
            }
    }
}

public class Oiext internal constructor(
    public var cbSize: UShort,
    public var flags: UShort,
    hInstCallerCtorArg: Hinstance,
    pHelpFileCtorArg: MutPtr<Byte>,
    public var dwReserved: IntArray,
) {
    public var hInstCaller: Hinstance = hInstCallerCtorArg
        internal set

    public var pHelpFile: MutPtr<Byte> = pHelpFileCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        hInstCallerCtorArg = MutPtr(0L),
        pHelpFileCtorArg = MutPtr(0L),
        dwReserved = IntArray(4),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): Hinstance = this.hInstCaller

    public operator fun component4(): MutPtr<Byte> = this.pHelpFile

    public operator fun component5(): IntArray = this.dwReserved

    public fun copy(cbSize: UShort = this.cbSize, flags: UShort = this.flags, hInstCaller: Hinstance = this.hInstCaller, pHelpFile: MutPtr<Byte> = this.pHelpFile, dwReserved: IntArray = this.dwReserved): Oiext = Oiext(cbSize = cbSize, flags = flags, hInstCallerCtorArg = hInstCaller, pHelpFileCtorArg = pHelpFile, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oiext) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.hInstCaller != other.hInstCaller) return false
        if (this.pHelpFile != other.pHelpFile) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hInstCaller.hashCode()
        result = 31 * result + this.pHelpFile.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            flags: UShort = 0u,
            hInstCaller: Hinstance = MutPtr(0L),
            pHelpFile: MutPtr<Byte> = MutPtr(0L),
            dwReserved: IntArray = IntArray(4),
        ): Oiext =
            Oiext(
                cbSize = cbSize,
                flags = flags,
                hInstCallerCtorArg = hInstCaller,
                pHelpFileCtorArg = pHelpFile,
                dwReserved = dwReserved,
            )
    }
}

public class Optcombo internal constructor(
    public var cbSize: UShort,
    public var flags: UByte,
    public var cListItem: UShort,
    pListItemCtorArg: MutPtr<Optparam>,
    public var sel: Int,
    public var dwReserved: UIntArray,
) {
    public var pListItem: MutPtr<Optparam> = pListItemCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        cListItem = 0u,
        pListItemCtorArg = MutPtr(0L),
        sel = 0,
        dwReserved = UIntArray(3),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UByte = this.flags

    public operator fun component3(): UShort = this.cListItem

    public operator fun component4(): MutPtr<Optparam> = this.pListItem

    public operator fun component5(): Int = this.sel

    public operator fun component6(): UIntArray = this.dwReserved

    public fun copy(cbSize: UShort = this.cbSize, flags: UByte = this.flags, cListItem: UShort = this.cListItem, pListItem: MutPtr<Optparam> = this.pListItem, sel: Int = this.sel, dwReserved: UIntArray = this.dwReserved): Optcombo = Optcombo(cbSize = cbSize, flags = flags, cListItem = cListItem, pListItemCtorArg = pListItem, sel = sel, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Optcombo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.cListItem != other.cListItem) return false
        if (this.pListItem != other.pListItem) return false
        if (this.sel != other.sel) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.cListItem.hashCode()
        result = 31 * result + this.pListItem.hashCode()
        result = 31 * result + this.sel.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Optcombo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Optcombo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Optcombo =
                    Optcombo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Optparam>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 20L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Optcombo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.cListItem)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Optparam>(64)
                    ).writeNative(addr + 8L, value.pListItem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.sel)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 20L, value.dwReserved.toList())
                }
            }

        public operator fun invoke(
            cbSize: UShort = 0u,
            flags: UByte = 0u,
            cListItem: UShort = 0u,
            pListItem: MutPtr<Optparam> = MutPtr(0L),
            sel: Int = 0,
            dwReserved: UIntArray = UIntArray(3),
        ): Optcombo =
            Optcombo(
                cbSize = cbSize,
                flags = flags,
                cListItem = cListItem,
                pListItemCtorArg = pListItem,
                sel = sel,
                dwReserved = dwReserved,
            )
    }
}

public class Optitem internal constructor(
    public var cbSize: UShort,
    public var level: UByte,
    public var dlgPageIdx: UByte,
    public var flags: UInt,
    public var userData: Int,
    pNameCtorArg: MutPtr<Byte>,
    public var anonymous1: Optitem0,
    public var anonymous2: Optitem1,
    pOptTypeCtorArg: MutPtr<Opttype>,
    public var helpIndex: UInt,
    public var dMPubID: UByte,
    public var userItemID: UByte,
    public var wReserved: UShort,
    pOIExtCtorArg: MutPtr<Oiext>,
    public var dwReserved: IntArray,
) {
    public var pName: MutPtr<Byte> = pNameCtorArg
        internal set

    public var pOptType: MutPtr<Opttype> = pOptTypeCtorArg
        internal set

    public var pOIExt: MutPtr<Oiext> = pOIExtCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        level = 0u,
        dlgPageIdx = 0u,
        flags = 0u,
        userData = 0,
        pNameCtorArg = MutPtr(0L),
        anonymous1 = Optitem0(),
        anonymous2 = Optitem1(),
        pOptTypeCtorArg = MutPtr(0L),
        helpIndex = 0u,
        dMPubID = 0u,
        userItemID = 0u,
        wReserved = 0u,
        pOIExtCtorArg = MutPtr(0L),
        dwReserved = IntArray(3),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UByte = this.level

    public operator fun component3(): UByte = this.dlgPageIdx

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): Int = this.userData

    public operator fun component6(): MutPtr<Byte> = this.pName

    public operator fun component7(): Optitem0 = this.anonymous1

    public operator fun component8(): Optitem1 = this.anonymous2

    public operator fun component9(): MutPtr<Opttype> = this.pOptType

    public operator fun component10(): UInt = this.helpIndex

    public operator fun component11(): UByte = this.dMPubID

    public operator fun component12(): UByte = this.userItemID

    public operator fun component13(): UShort = this.wReserved

    public operator fun component14(): MutPtr<Oiext> = this.pOIExt

    public operator fun component15(): IntArray = this.dwReserved

    public fun copy(cbSize: UShort = this.cbSize, level: UByte = this.level, dlgPageIdx: UByte = this.dlgPageIdx, flags: UInt = this.flags, userData: Int = this.userData, pName: MutPtr<Byte> = this.pName, anonymous1: Optitem0 = this.anonymous1, anonymous2: Optitem1 = this.anonymous2, pOptType: MutPtr<Opttype> = this.pOptType, helpIndex: UInt = this.helpIndex, dMPubID: UByte = this.dMPubID, userItemID: UByte = this.userItemID, wReserved: UShort = this.wReserved, pOIExt: MutPtr<Oiext> = this.pOIExt, dwReserved: IntArray = this.dwReserved): Optitem = Optitem(cbSize = cbSize, level = level, dlgPageIdx = dlgPageIdx, flags = flags, userData = userData, pNameCtorArg = pName, anonymous1 = anonymous1, anonymous2 = anonymous2, pOptTypeCtorArg = pOptType, helpIndex = helpIndex, dMPubID = dMPubID, userItemID = userItemID, wReserved = wReserved, pOIExtCtorArg = pOIExt, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Optitem) return false
        if (this.cbSize != other.cbSize) return false
        if (this.level != other.level) return false
        if (this.dlgPageIdx != other.dlgPageIdx) return false
        if (this.flags != other.flags) return false
        if (this.userData != other.userData) return false
        if (this.pName != other.pName) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pOptType != other.pOptType) return false
        if (this.helpIndex != other.helpIndex) return false
        if (this.dMPubID != other.dMPubID) return false
        if (this.userItemID != other.userItemID) return false
        if (this.wReserved != other.wReserved) return false
        if (this.pOIExt != other.pOIExt) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.dlgPageIdx.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.userData.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pOptType.hashCode()
        result = 31 * result + this.helpIndex.hashCode()
        result = 31 * result + this.dMPubID.hashCode()
        result = 31 * result + this.userItemID.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        result = 31 * result + this.pOIExt.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            level: UByte = 0u,
            dlgPageIdx: UByte = 0u,
            flags: UInt = 0u,
            userData: Int = 0,
            pName: MutPtr<Byte> = MutPtr(0L),
            anonymous1: Optitem0 = Optitem0(),
            anonymous2: Optitem1 = Optitem1(),
            pOptType: MutPtr<Opttype> = MutPtr(0L),
            helpIndex: UInt = 0u,
            dMPubID: UByte = 0u,
            userItemID: UByte = 0u,
            wReserved: UShort = 0u,
            pOIExt: MutPtr<Oiext> = MutPtr(0L),
            dwReserved: IntArray = IntArray(3),
        ): Optitem =
            Optitem(
                cbSize = cbSize,
                level = level,
                dlgPageIdx = dlgPageIdx,
                flags = flags,
                userData = userData,
                pNameCtorArg = pName,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                pOptTypeCtorArg = pOptType,
                helpIndex = helpIndex,
                dMPubID = dMPubID,
                userItemID = userItemID,
                wReserved = wReserved,
                pOIExtCtorArg = pOIExt,
                dwReserved = dwReserved,
            )
    }
}

public class Optitem0 internal constructor(
    public var sel: Int,
    pSelCtorArg: MutPtr<Byte>,
) {
    public var pSel: MutPtr<Byte> = pSelCtorArg
        internal set

    public constructor() : this(
        sel = 0,
        pSelCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.sel

    public operator fun component2(): MutPtr<Byte> = this.pSel

    public fun copy(sel: Int = this.sel, pSel: MutPtr<Byte> = this.pSel): Optitem0 = Optitem0(sel = sel, pSelCtorArg = pSel)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Optitem0) return false
        if (this.sel != other.sel) return false
        if (this.pSel != other.pSel) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sel.hashCode()
        result = 31 * result + this.pSel.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sel: Int = 0,
            pSel: MutPtr<Byte> = MutPtr(0L),
        ): Optitem0 =
            Optitem0(
                sel = sel,
                pSelCtorArg = pSel,
            )
    }
}

public class Optitem1 internal constructor(
    pExtChkBoxCtorArg: MutPtr<Extchkbox>,
    pExtPushCtorArg: MutPtr<Extpush>,
) {
    public var pExtChkBox: MutPtr<Extchkbox> = pExtChkBoxCtorArg
        internal set

    public var pExtPush: MutPtr<Extpush> = pExtPushCtorArg
        internal set

    public constructor() : this(
        pExtChkBoxCtorArg = MutPtr(0L),
        pExtPushCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Extchkbox> = this.pExtChkBox

    public operator fun component2(): MutPtr<Extpush> = this.pExtPush

    public fun copy(pExtChkBox: MutPtr<Extchkbox> = this.pExtChkBox, pExtPush: MutPtr<Extpush> = this.pExtPush): Optitem1 = Optitem1(pExtChkBoxCtorArg = pExtChkBox, pExtPushCtorArg = pExtPush)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Optitem1) return false
        if (this.pExtChkBox != other.pExtChkBox) return false
        if (this.pExtPush != other.pExtPush) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pExtChkBox.hashCode()
        result = 31 * result + this.pExtPush.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pExtChkBox: MutPtr<Extchkbox> = MutPtr(0L),
            pExtPush: MutPtr<Extpush> = MutPtr(0L),
        ): Optitem1 =
            Optitem1(
                pExtChkBoxCtorArg = pExtChkBox,
                pExtPushCtorArg = pExtPush,
            )
    }
}

public class Optparam internal constructor(
    public var cbSize: UShort,
    public var flags: UByte,
    public var style: UByte,
    pDataCtorArg: MutPtr<Byte>,
    public var iconID: Int,
    public var lParam: Lparam,
    public var dwReserved: IntArray,
) {
    public var pData: MutPtr<Byte> = pDataCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        style = 0u,
        pDataCtorArg = MutPtr(0L),
        iconID = 0,
        lParam = 0L,
        dwReserved = IntArray(2),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UByte = this.flags

    public operator fun component3(): UByte = this.style

    public operator fun component4(): MutPtr<Byte> = this.pData

    public operator fun component5(): Int = this.iconID

    public operator fun component6(): Lparam = this.lParam

    public operator fun component7(): IntArray = this.dwReserved

    public fun copy(cbSize: UShort = this.cbSize, flags: UByte = this.flags, style: UByte = this.style, pData: MutPtr<Byte> = this.pData, iconID: Int = this.iconID, lParam: Lparam = this.lParam, dwReserved: IntArray = this.dwReserved): Optparam = Optparam(cbSize = cbSize, flags = flags, style = style, pDataCtorArg = pData, iconID = iconID, lParam = lParam, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Optparam) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.style != other.style) return false
        if (this.pData != other.pData) return false
        if (this.iconID != other.iconID) return false
        if (this.lParam != other.lParam) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.iconID.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Optparam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Optparam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Optparam =
                    Optparam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                        ).readNative(addr + 32L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Optparam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.style)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr + 8L, value.pData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.iconID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lParam)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                    ).writeNative(addr + 32L, value.dwReserved.toList())
                }
            }

        public operator fun invoke(
            cbSize: UShort = 0u,
            flags: UByte = 0u,
            style: UByte = 0u,
            pData: MutPtr<Byte> = MutPtr(0L),
            iconID: Int = 0,
            lParam: Lparam = 0L,
            dwReserved: IntArray = IntArray(2),
        ): Optparam =
            Optparam(
                cbSize = cbSize,
                flags = flags,
                style = style,
                pDataCtorArg = pData,
                iconID = iconID,
                lParam = lParam,
                dwReserved = dwReserved,
            )
    }
}

public class Opttype internal constructor(
    public var cbSize: UShort,
    public var type: UByte,
    public var flags: UByte,
    public var count: UShort,
    public var begCtrlID: UShort,
    pOptParamCtorArg: MutPtr<Optparam>,
    public var style: UShort,
    public var wReserved: UShortArray,
    public var dwReserved: IntArray,
) {
    public var pOptParam: MutPtr<Optparam> = pOptParamCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        type = 0u,
        flags = 0u,
        count = 0u,
        begCtrlID = 0u,
        pOptParamCtorArg = MutPtr(0L),
        style = 0u,
        wReserved = UShortArray(3),
        dwReserved = IntArray(3),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UByte = this.type

    public operator fun component3(): UByte = this.flags

    public operator fun component4(): UShort = this.count

    public operator fun component5(): UShort = this.begCtrlID

    public operator fun component6(): MutPtr<Optparam> = this.pOptParam

    public operator fun component7(): UShort = this.style

    public operator fun component8(): UShortArray = this.wReserved

    public operator fun component9(): IntArray = this.dwReserved

    public fun copy(cbSize: UShort = this.cbSize, type: UByte = this.type, flags: UByte = this.flags, count: UShort = this.count, begCtrlID: UShort = this.begCtrlID, pOptParam: MutPtr<Optparam> = this.pOptParam, style: UShort = this.style, wReserved: UShortArray = this.wReserved, dwReserved: IntArray = this.dwReserved): Opttype = Opttype(cbSize = cbSize, type = type, flags = flags, count = count, begCtrlID = begCtrlID, pOptParamCtorArg = pOptParam, style = style, wReserved = wReserved, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Opttype) return false
        if (this.cbSize != other.cbSize) return false
        if (this.type != other.type) return false
        if (this.flags != other.flags) return false
        if (this.count != other.count) return false
        if (this.begCtrlID != other.begCtrlID) return false
        if (this.pOptParam != other.pOptParam) return false
        if (this.style != other.style) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.begCtrlID.hashCode()
        result = 31 * result + this.pOptParam.hashCode()
        result = 31 * result + this.style.hashCode()
        result = 31 * result + this.wReserved.contentHashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Opttype> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Opttype> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Opttype =
                    Opttype(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Optparam>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr + 18L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (3).toInt())
                        ).readNative(addr + 24L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Opttype) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.begCtrlID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Optparam>(64)
                    ).writeNative(addr + 8L, value.pOptParam)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.style)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr + 18L, value.wReserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (3).toInt())
                    ).writeNative(addr + 24L, value.dwReserved.toList())
                }
            }

        public operator fun invoke(
            cbSize: UShort = 0u,
            type: UByte = 0u,
            flags: UByte = 0u,
            count: UShort = 0u,
            begCtrlID: UShort = 0u,
            pOptParam: MutPtr<Optparam> = MutPtr(0L),
            style: UShort = 0u,
            wReserved: UShortArray = UShortArray(3),
            dwReserved: IntArray = IntArray(3),
        ): Opttype =
            Opttype(
                cbSize = cbSize,
                type = type,
                flags = flags,
                count = count,
                begCtrlID = begCtrlID,
                pOptParamCtorArg = pOptParam,
                style = style,
                wReserved = wReserved,
                dwReserved = dwReserved,
            )
    }
}

public data class PortData1(
    public var sztPortName: UShortArray = UShortArray(64),
    public var dwVersion: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var cbSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var sztHostAddress: UShortArray = UShortArray(49),
    public var sztSNMPCommunity: UShortArray = UShortArray(33),
    public var dwDoubleSpool: UInt = 0u,
    public var sztQueue: UShortArray = UShortArray(33),
    public var sztIPAddress: UShortArray = UShortArray(16),
    public var reserved: UByteArray = UByteArray(540),
    public var dwPortNumber: UInt = 0u,
    public var dwSNMPEnabled: UInt = 0u,
    public var dwSNMPDevIndex: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortData1) return false
        if (!this.sztPortName.contentEquals(other.sztPortName)) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwReserved != other.dwReserved) return false
        if (!this.sztHostAddress.contentEquals(other.sztHostAddress)) return false
        if (!this.sztSNMPCommunity.contentEquals(other.sztSNMPCommunity)) return false
        if (this.dwDoubleSpool != other.dwDoubleSpool) return false
        if (!this.sztQueue.contentEquals(other.sztQueue)) return false
        if (!this.sztIPAddress.contentEquals(other.sztIPAddress)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.dwPortNumber != other.dwPortNumber) return false
        if (this.dwSNMPEnabled != other.dwSNMPEnabled) return false
        if (this.dwSNMPDevIndex != other.dwSNMPDevIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sztPortName.contentHashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwProtocol.hashCode()
        result = 31 * result + this.cbSize.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.sztHostAddress.contentHashCode()
        result = 31 * result + this.sztSNMPCommunity.contentHashCode()
        result = 31 * result + this.dwDoubleSpool.hashCode()
        result = 31 * result + this.sztQueue.contentHashCode()
        result = 31 * result + this.sztIPAddress.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.dwPortNumber.hashCode()
        result = 31 * result + this.dwSNMPEnabled.hashCode()
        result = 31 * result + this.dwSNMPDevIndex.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PortData1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PortData1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 964L
                override fun readNative(addr: Long): PortData1 =
                    PortData1(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (49).toInt())
                        ).readNative(addr + 144L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                        ).readNative(addr + 242L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 308L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                        ).readNative(addr + 312L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 378L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (540).toInt())
                        ).readNative(addr + 410L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 952L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 956L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 960L),
                    )
                override fun writeNative(addr: Long, value: PortData1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr, value.sztPortName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.dwProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.dwReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (49).toInt())
                    ).writeNative(addr + 144L, value.sztHostAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                    ).writeNative(addr + 242L, value.sztSNMPCommunity.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 308L, value.dwDoubleSpool)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                    ).writeNative(addr + 312L, value.sztQueue.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 378L, value.sztIPAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (540).toInt())
                    ).writeNative(addr + 410L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 952L, value.dwPortNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 956L, value.dwSNMPEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 960L, value.dwSNMPDevIndex)
                }
            }
    }
}

public data class PortData2(
    public var sztPortName: UShortArray = UShortArray(64),
    public var dwVersion: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var cbSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var sztHostAddress: UShortArray = UShortArray(128),
    public var sztSNMPCommunity: UShortArray = UShortArray(33),
    public var dwDoubleSpool: UInt = 0u,
    public var sztQueue: UShortArray = UShortArray(33),
    public var reserved: UByteArray = UByteArray(514),
    public var dwPortNumber: UInt = 0u,
    public var dwSNMPEnabled: UInt = 0u,
    public var dwSNMPDevIndex: UInt = 0u,
    public var dwPortMonitorMibIndex: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortData2) return false
        if (!this.sztPortName.contentEquals(other.sztPortName)) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwReserved != other.dwReserved) return false
        if (!this.sztHostAddress.contentEquals(other.sztHostAddress)) return false
        if (!this.sztSNMPCommunity.contentEquals(other.sztSNMPCommunity)) return false
        if (this.dwDoubleSpool != other.dwDoubleSpool) return false
        if (!this.sztQueue.contentEquals(other.sztQueue)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.dwPortNumber != other.dwPortNumber) return false
        if (this.dwSNMPEnabled != other.dwSNMPEnabled) return false
        if (this.dwSNMPDevIndex != other.dwSNMPDevIndex) return false
        if (this.dwPortMonitorMibIndex != other.dwPortMonitorMibIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sztPortName.contentHashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwProtocol.hashCode()
        result = 31 * result + this.cbSize.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.sztHostAddress.contentHashCode()
        result = 31 * result + this.sztSNMPCommunity.contentHashCode()
        result = 31 * result + this.dwDoubleSpool.hashCode()
        result = 31 * result + this.sztQueue.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.dwPortNumber.hashCode()
        result = 31 * result + this.dwSNMPEnabled.hashCode()
        result = 31 * result + this.dwSNMPDevIndex.hashCode()
        result = 31 * result + this.dwPortMonitorMibIndex.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PortData2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PortData2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1068L
                override fun readNative(addr: Long): PortData2 =
                    PortData2(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 144L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                        ).readNative(addr + 400L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 468L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                        ).readNative(addr + 472L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (514).toInt())
                        ).readNative(addr + 538L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1052L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1056L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1060L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1064L),
                    )
                override fun writeNative(addr: Long, value: PortData2) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr, value.sztPortName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.dwProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.dwReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 144L, value.sztHostAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                    ).writeNative(addr + 400L, value.sztSNMPCommunity.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 468L, value.dwDoubleSpool)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                    ).writeNative(addr + 472L, value.sztQueue.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (514).toInt())
                    ).writeNative(addr + 538L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1052L, value.dwPortNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1056L, value.dwSNMPEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1060L, value.dwSNMPDevIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1064L, value.dwPortMonitorMibIndex)
                }
            }
    }
}

public data class PortDataList1(
    public var dwVersion: UInt = 0u,
    public var cPortData: UInt = 0u,
    public var pPortData: List<PortData2> = List(1) { PortData2() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PortDataList1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PortDataList1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1076L
                override fun readNative(addr: Long): PortDataList1 =
                    PortDataList1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PortData2.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PortDataList1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cPortData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PortData2.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.pPortData)
                }
            }
    }
}

public class PortInfo1a internal constructor(
    pNameCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pName

    public fun copy(pName: Pstr = this.pName): PortInfo1a = PortInfo1a(pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortInfo1a) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int = this.pName.hashCode()

    public companion object {
        public operator fun invoke(
            pName: Pstr = MutPtr(0L),
        ): PortInfo1a =
            PortInfo1a(
                pNameCtorArg = pName,
            )
    }
}

public class PortInfo1w internal constructor(
    pNameCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pName

    public fun copy(pName: Pwstr = this.pName): PortInfo1w = PortInfo1w(pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortInfo1w) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int = this.pName.hashCode()

    public companion object {
        public operator fun invoke(
            pName: Pwstr = MutPtr(0L),
        ): PortInfo1w =
            PortInfo1w(
                pNameCtorArg = pName,
            )
    }
}

public class PortInfo2a internal constructor(
    pPortNameCtorArg: Pstr,
    pMonitorNameCtorArg: Pstr,
    pDescriptionCtorArg: Pstr,
    public var fPortType: UInt,
    public var reserved: UInt,
) {
    public var pPortName: Pstr = pPortNameCtorArg
        internal set

    public var pMonitorName: Pstr = pMonitorNameCtorArg
        internal set

    public var pDescription: Pstr = pDescriptionCtorArg
        internal set

    public constructor() : this(
        pPortNameCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDescriptionCtorArg = MutPtr(0L),
        fPortType = 0u,
        reserved = 0u,
    )

    public operator fun component1(): Pstr = this.pPortName

    public operator fun component2(): Pstr = this.pMonitorName

    public operator fun component3(): Pstr = this.pDescription

    public operator fun component4(): UInt = this.fPortType

    public operator fun component5(): UInt = this.reserved

    public fun copy(pPortName: Pstr = this.pPortName, pMonitorName: Pstr = this.pMonitorName, pDescription: Pstr = this.pDescription, fPortType: UInt = this.fPortType, reserved: UInt = this.reserved): PortInfo2a = PortInfo2a(pPortNameCtorArg = pPortName, pMonitorNameCtorArg = pMonitorName, pDescriptionCtorArg = pDescription, fPortType = fPortType, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortInfo2a) return false
        if (this.pPortName != other.pPortName) return false
        if (this.pMonitorName != other.pMonitorName) return false
        if (this.pDescription != other.pDescription) return false
        if (this.fPortType != other.fPortType) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPortName.hashCode()
        result = 31 * result + this.pMonitorName.hashCode()
        result = 31 * result + this.pDescription.hashCode()
        result = 31 * result + this.fPortType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pPortName: Pstr = MutPtr(0L),
            pMonitorName: Pstr = MutPtr(0L),
            pDescription: Pstr = MutPtr(0L),
            fPortType: UInt = 0u,
            reserved: UInt = 0u,
        ): PortInfo2a =
            PortInfo2a(
                pPortNameCtorArg = pPortName,
                pMonitorNameCtorArg = pMonitorName,
                pDescriptionCtorArg = pDescription,
                fPortType = fPortType,
                reserved = reserved,
            )
    }
}

public class PortInfo2w internal constructor(
    pPortNameCtorArg: Pwstr,
    pMonitorNameCtorArg: Pwstr,
    pDescriptionCtorArg: Pwstr,
    public var fPortType: UInt,
    public var reserved: UInt,
) {
    public var pPortName: Pwstr = pPortNameCtorArg
        internal set

    public var pMonitorName: Pwstr = pMonitorNameCtorArg
        internal set

    public var pDescription: Pwstr = pDescriptionCtorArg
        internal set

    public constructor() : this(
        pPortNameCtorArg = MutPtr(0L),
        pMonitorNameCtorArg = MutPtr(0L),
        pDescriptionCtorArg = MutPtr(0L),
        fPortType = 0u,
        reserved = 0u,
    )

    public operator fun component1(): Pwstr = this.pPortName

    public operator fun component2(): Pwstr = this.pMonitorName

    public operator fun component3(): Pwstr = this.pDescription

    public operator fun component4(): UInt = this.fPortType

    public operator fun component5(): UInt = this.reserved

    public fun copy(pPortName: Pwstr = this.pPortName, pMonitorName: Pwstr = this.pMonitorName, pDescription: Pwstr = this.pDescription, fPortType: UInt = this.fPortType, reserved: UInt = this.reserved): PortInfo2w = PortInfo2w(pPortNameCtorArg = pPortName, pMonitorNameCtorArg = pMonitorName, pDescriptionCtorArg = pDescription, fPortType = fPortType, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortInfo2w) return false
        if (this.pPortName != other.pPortName) return false
        if (this.pMonitorName != other.pMonitorName) return false
        if (this.pDescription != other.pDescription) return false
        if (this.fPortType != other.fPortType) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPortName.hashCode()
        result = 31 * result + this.pMonitorName.hashCode()
        result = 31 * result + this.pDescription.hashCode()
        result = 31 * result + this.fPortType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pPortName: Pwstr = MutPtr(0L),
            pMonitorName: Pwstr = MutPtr(0L),
            pDescription: Pwstr = MutPtr(0L),
            fPortType: UInt = 0u,
            reserved: UInt = 0u,
        ): PortInfo2w =
            PortInfo2w(
                pPortNameCtorArg = pPortName,
                pMonitorNameCtorArg = pMonitorName,
                pDescriptionCtorArg = pDescription,
                fPortType = fPortType,
                reserved = reserved,
            )
    }
}

public class PortInfo3a internal constructor(
    public var dwStatus: UInt,
    pszStatusCtorArg: Pstr,
    public var dwSeverity: UInt,
) {
    public var pszStatus: Pstr = pszStatusCtorArg
        internal set

    public constructor() : this(
        dwStatus = 0u,
        pszStatusCtorArg = MutPtr(0L),
        dwSeverity = 0u,
    )

    public operator fun component1(): UInt = this.dwStatus

    public operator fun component2(): Pstr = this.pszStatus

    public operator fun component3(): UInt = this.dwSeverity

    public fun copy(dwStatus: UInt = this.dwStatus, pszStatus: Pstr = this.pszStatus, dwSeverity: UInt = this.dwSeverity): PortInfo3a = PortInfo3a(dwStatus = dwStatus, pszStatusCtorArg = pszStatus, dwSeverity = dwSeverity)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortInfo3a) return false
        if (this.dwStatus != other.dwStatus) return false
        if (this.pszStatus != other.pszStatus) return false
        if (this.dwSeverity != other.dwSeverity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStatus.hashCode()
        result = 31 * result + this.pszStatus.hashCode()
        result = 31 * result + this.dwSeverity.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStatus: UInt = 0u,
            pszStatus: Pstr = MutPtr(0L),
            dwSeverity: UInt = 0u,
        ): PortInfo3a =
            PortInfo3a(
                dwStatus = dwStatus,
                pszStatusCtorArg = pszStatus,
                dwSeverity = dwSeverity,
            )
    }
}

public class PortInfo3w internal constructor(
    public var dwStatus: UInt,
    pszStatusCtorArg: Pwstr,
    public var dwSeverity: UInt,
) {
    public var pszStatus: Pwstr = pszStatusCtorArg
        internal set

    public constructor() : this(
        dwStatus = 0u,
        pszStatusCtorArg = MutPtr(0L),
        dwSeverity = 0u,
    )

    public operator fun component1(): UInt = this.dwStatus

    public operator fun component2(): Pwstr = this.pszStatus

    public operator fun component3(): UInt = this.dwSeverity

    public fun copy(dwStatus: UInt = this.dwStatus, pszStatus: Pwstr = this.pszStatus, dwSeverity: UInt = this.dwSeverity): PortInfo3w = PortInfo3w(dwStatus = dwStatus, pszStatusCtorArg = pszStatus, dwSeverity = dwSeverity)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PortInfo3w) return false
        if (this.dwStatus != other.dwStatus) return false
        if (this.pszStatus != other.pszStatus) return false
        if (this.dwSeverity != other.dwSeverity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStatus.hashCode()
        result = 31 * result + this.pszStatus.hashCode()
        result = 31 * result + this.dwSeverity.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStatus: UInt = 0u,
            pszStatus: Pwstr = MutPtr(0L),
            dwSeverity: UInt = 0u,
        ): PortInfo3w =
            PortInfo3w(
                dwStatus = dwStatus,
                pszStatusCtorArg = pszStatus,
                dwSeverity = dwSeverity,
            )
    }
}

public class PrinterConnectionInfo1a internal constructor(
    public var dwFlags: UInt,
    pszDriverNameCtorArg: Pstr,
) {
    public var pszDriverName: Pstr = pszDriverNameCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        pszDriverNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): Pstr = this.pszDriverName

    public fun copy(dwFlags: UInt = this.dwFlags, pszDriverName: Pstr = this.pszDriverName): PrinterConnectionInfo1a = PrinterConnectionInfo1a(dwFlags = dwFlags, pszDriverNameCtorArg = pszDriverName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterConnectionInfo1a) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pszDriverName != other.pszDriverName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.pszDriverName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            pszDriverName: Pstr = MutPtr(0L),
        ): PrinterConnectionInfo1a =
            PrinterConnectionInfo1a(
                dwFlags = dwFlags,
                pszDriverNameCtorArg = pszDriverName,
            )
    }
}

public class PrinterConnectionInfo1w internal constructor(
    public var dwFlags: UInt,
    pszDriverNameCtorArg: Pwstr,
) {
    public var pszDriverName: Pwstr = pszDriverNameCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        pszDriverNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): Pwstr = this.pszDriverName

    public fun copy(dwFlags: UInt = this.dwFlags, pszDriverName: Pwstr = this.pszDriverName): PrinterConnectionInfo1w = PrinterConnectionInfo1w(dwFlags = dwFlags, pszDriverNameCtorArg = pszDriverName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterConnectionInfo1w) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pszDriverName != other.pszDriverName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.pszDriverName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            pszDriverName: Pwstr = MutPtr(0L),
        ): PrinterConnectionInfo1w =
            PrinterConnectionInfo1w(
                dwFlags = dwFlags,
                pszDriverNameCtorArg = pszDriverName,
            )
    }
}

public class PrinterDefaultsa internal constructor(
    pDatatypeCtorArg: Pstr,
    pDevModeCtorArg: MutPtr<Devmodea>,
    public var desiredAccess: PrinterAccessRights,
) {
    public var pDatatype: Pstr = pDatatypeCtorArg
        internal set

    public var pDevMode: MutPtr<Devmodea> = pDevModeCtorArg
        internal set

    public constructor() : this(
        pDatatypeCtorArg = MutPtr(0L),
        pDevModeCtorArg = MutPtr(0L),
        desiredAccess = 0u,
    )

    public operator fun component1(): Pstr = this.pDatatype

    public operator fun component2(): MutPtr<Devmodea> = this.pDevMode

    public operator fun component3(): PrinterAccessRights = this.desiredAccess

    public fun copy(pDatatype: Pstr = this.pDatatype, pDevMode: MutPtr<Devmodea> = this.pDevMode, desiredAccess: PrinterAccessRights = this.desiredAccess): PrinterDefaultsa = PrinterDefaultsa(pDatatypeCtorArg = pDatatype, pDevModeCtorArg = pDevMode, desiredAccess = desiredAccess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterDefaultsa) return false
        if (this.pDatatype != other.pDatatype) return false
        if (this.pDevMode != other.pDevMode) return false
        if (this.desiredAccess != other.desiredAccess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDatatype.hashCode()
        result = 31 * result + this.pDevMode.hashCode()
        result = 31 * result + this.desiredAccess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDatatype: Pstr = MutPtr(0L),
            pDevMode: MutPtr<Devmodea> = MutPtr(0L),
            desiredAccess: PrinterAccessRights = 0u,
        ): PrinterDefaultsa =
            PrinterDefaultsa(
                pDatatypeCtorArg = pDatatype,
                pDevModeCtorArg = pDevMode,
                desiredAccess = desiredAccess,
            )
    }
}

public class PrinterDefaultsw internal constructor(
    pDatatypeCtorArg: Pwstr,
    pDevModeCtorArg: MutPtr<Devmodew>,
    public var desiredAccess: PrinterAccessRights,
) {
    public var pDatatype: Pwstr = pDatatypeCtorArg
        internal set

    public var pDevMode: MutPtr<Devmodew> = pDevModeCtorArg
        internal set

    public constructor() : this(
        pDatatypeCtorArg = MutPtr(0L),
        pDevModeCtorArg = MutPtr(0L),
        desiredAccess = 0u,
    )

    public operator fun component1(): Pwstr = this.pDatatype

    public operator fun component2(): MutPtr<Devmodew> = this.pDevMode

    public operator fun component3(): PrinterAccessRights = this.desiredAccess

    public fun copy(pDatatype: Pwstr = this.pDatatype, pDevMode: MutPtr<Devmodew> = this.pDevMode, desiredAccess: PrinterAccessRights = this.desiredAccess): PrinterDefaultsw = PrinterDefaultsw(pDatatypeCtorArg = pDatatype, pDevModeCtorArg = pDevMode, desiredAccess = desiredAccess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterDefaultsw) return false
        if (this.pDatatype != other.pDatatype) return false
        if (this.pDevMode != other.pDevMode) return false
        if (this.desiredAccess != other.desiredAccess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDatatype.hashCode()
        result = 31 * result + this.pDevMode.hashCode()
        result = 31 * result + this.desiredAccess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDatatype: Pwstr = MutPtr(0L),
            pDevMode: MutPtr<Devmodew> = MutPtr(0L),
            desiredAccess: PrinterAccessRights = 0u,
        ): PrinterDefaultsw =
            PrinterDefaultsw(
                pDatatypeCtorArg = pDatatype,
                pDevModeCtorArg = pDevMode,
                desiredAccess = desiredAccess,
            )
    }
}

public class PrinterEnumValuesa internal constructor(
    pValueNameCtorArg: Pstr,
    public var cbValueName: UInt,
    public var dwType: UInt,
    pDataCtorArg: MutPtr<UByte>,
    public var cbData: UInt,
) {
    public var pValueName: Pstr = pValueNameCtorArg
        internal set

    public var pData: MutPtr<UByte> = pDataCtorArg
        internal set

    public constructor() : this(
        pValueNameCtorArg = MutPtr(0L),
        cbValueName = 0u,
        dwType = 0u,
        pDataCtorArg = MutPtr(0L),
        cbData = 0u,
    )

    public operator fun component1(): Pstr = this.pValueName

    public operator fun component2(): UInt = this.cbValueName

    public operator fun component3(): UInt = this.dwType

    public operator fun component4(): MutPtr<UByte> = this.pData

    public operator fun component5(): UInt = this.cbData

    public fun copy(pValueName: Pstr = this.pValueName, cbValueName: UInt = this.cbValueName, dwType: UInt = this.dwType, pData: MutPtr<UByte> = this.pData, cbData: UInt = this.cbData): PrinterEnumValuesa = PrinterEnumValuesa(pValueNameCtorArg = pValueName, cbValueName = cbValueName, dwType = dwType, pDataCtorArg = pData, cbData = cbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterEnumValuesa) return false
        if (this.pValueName != other.pValueName) return false
        if (this.cbValueName != other.cbValueName) return false
        if (this.dwType != other.dwType) return false
        if (this.pData != other.pData) return false
        if (this.cbData != other.cbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pValueName.hashCode()
        result = 31 * result + this.cbValueName.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pValueName: Pstr = MutPtr(0L),
            cbValueName: UInt = 0u,
            dwType: UInt = 0u,
            pData: MutPtr<UByte> = MutPtr(0L),
            cbData: UInt = 0u,
        ): PrinterEnumValuesa =
            PrinterEnumValuesa(
                pValueNameCtorArg = pValueName,
                cbValueName = cbValueName,
                dwType = dwType,
                pDataCtorArg = pData,
                cbData = cbData,
            )
    }
}

public class PrinterEnumValuesw internal constructor(
    pValueNameCtorArg: Pwstr,
    public var cbValueName: UInt,
    public var dwType: UInt,
    pDataCtorArg: MutPtr<UByte>,
    public var cbData: UInt,
) {
    public var pValueName: Pwstr = pValueNameCtorArg
        internal set

    public var pData: MutPtr<UByte> = pDataCtorArg
        internal set

    public constructor() : this(
        pValueNameCtorArg = MutPtr(0L),
        cbValueName = 0u,
        dwType = 0u,
        pDataCtorArg = MutPtr(0L),
        cbData = 0u,
    )

    public operator fun component1(): Pwstr = this.pValueName

    public operator fun component2(): UInt = this.cbValueName

    public operator fun component3(): UInt = this.dwType

    public operator fun component4(): MutPtr<UByte> = this.pData

    public operator fun component5(): UInt = this.cbData

    public fun copy(pValueName: Pwstr = this.pValueName, cbValueName: UInt = this.cbValueName, dwType: UInt = this.dwType, pData: MutPtr<UByte> = this.pData, cbData: UInt = this.cbData): PrinterEnumValuesw = PrinterEnumValuesw(pValueNameCtorArg = pValueName, cbValueName = cbValueName, dwType = dwType, pDataCtorArg = pData, cbData = cbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterEnumValuesw) return false
        if (this.pValueName != other.pValueName) return false
        if (this.cbValueName != other.cbValueName) return false
        if (this.dwType != other.dwType) return false
        if (this.pData != other.pData) return false
        if (this.cbData != other.cbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pValueName.hashCode()
        result = 31 * result + this.cbValueName.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pValueName: Pwstr = MutPtr(0L),
            cbValueName: UInt = 0u,
            dwType: UInt = 0u,
            pData: MutPtr<UByte> = MutPtr(0L),
            cbData: UInt = 0u,
        ): PrinterEnumValuesw =
            PrinterEnumValuesw(
                pValueNameCtorArg = pValueName,
                cbValueName = cbValueName,
                dwType = dwType,
                pDataCtorArg = pData,
                cbData = cbData,
            )
    }
}

public data class PrinterEventAttributesInfo(
    public var cbSize: UInt = 0u,
    public var dwOldAttributes: UInt = 0u,
    public var dwNewAttributes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterEventAttributesInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterEventAttributesInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PrinterEventAttributesInfo =
                    PrinterEventAttributesInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PrinterEventAttributesInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwOldAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNewAttributes)
                }
            }
    }
}

public class PrinterHandle internal constructor(
    valueCtorArg: MutPtr<CVoid>,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.value

    public fun copy(value: MutPtr<CVoid> = this.value): PrinterHandle = PrinterHandle(valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterHandle) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int = this.value.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterHandle> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrinterHandle =
                    PrinterHandle(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrinterHandle) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.value)
                }
            }

        public operator fun invoke(
            value: MutPtr<CVoid> = MutPtr(0L),
        ): PrinterHandle =
            PrinterHandle(
                valueCtorArg = value,
            )
    }
}

public class PrinterInfo1a internal constructor(
    public var flags: UInt,
    pDescriptionCtorArg: Pstr,
    pNameCtorArg: Pstr,
    pCommentCtorArg: Pstr,
) {
    public var pDescription: Pstr = pDescriptionCtorArg
        internal set

    public var pName: Pstr = pNameCtorArg
        internal set

    public var pComment: Pstr = pCommentCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        pDescriptionCtorArg = MutPtr(0L),
        pNameCtorArg = MutPtr(0L),
        pCommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Pstr = this.pDescription

    public operator fun component3(): Pstr = this.pName

    public operator fun component4(): Pstr = this.pComment

    public fun copy(flags: UInt = this.flags, pDescription: Pstr = this.pDescription, pName: Pstr = this.pName, pComment: Pstr = this.pComment): PrinterInfo1a = PrinterInfo1a(flags = flags, pDescriptionCtorArg = pDescription, pNameCtorArg = pName, pCommentCtorArg = pComment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo1a) return false
        if (this.flags != other.flags) return false
        if (this.pDescription != other.pDescription) return false
        if (this.pName != other.pName) return false
        if (this.pComment != other.pComment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pDescription.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pComment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            pDescription: Pstr = MutPtr(0L),
            pName: Pstr = MutPtr(0L),
            pComment: Pstr = MutPtr(0L),
        ): PrinterInfo1a =
            PrinterInfo1a(
                flags = flags,
                pDescriptionCtorArg = pDescription,
                pNameCtorArg = pName,
                pCommentCtorArg = pComment,
            )
    }
}

public class PrinterInfo1w internal constructor(
    public var flags: UInt,
    pDescriptionCtorArg: Pwstr,
    pNameCtorArg: Pwstr,
    pCommentCtorArg: Pwstr,
) {
    public var pDescription: Pwstr = pDescriptionCtorArg
        internal set

    public var pName: Pwstr = pNameCtorArg
        internal set

    public var pComment: Pwstr = pCommentCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        pDescriptionCtorArg = MutPtr(0L),
        pNameCtorArg = MutPtr(0L),
        pCommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Pwstr = this.pDescription

    public operator fun component3(): Pwstr = this.pName

    public operator fun component4(): Pwstr = this.pComment

    public fun copy(flags: UInt = this.flags, pDescription: Pwstr = this.pDescription, pName: Pwstr = this.pName, pComment: Pwstr = this.pComment): PrinterInfo1w = PrinterInfo1w(flags = flags, pDescriptionCtorArg = pDescription, pNameCtorArg = pName, pCommentCtorArg = pComment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo1w) return false
        if (this.flags != other.flags) return false
        if (this.pDescription != other.pDescription) return false
        if (this.pName != other.pName) return false
        if (this.pComment != other.pComment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pDescription.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.pComment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            pDescription: Pwstr = MutPtr(0L),
            pName: Pwstr = MutPtr(0L),
            pComment: Pwstr = MutPtr(0L),
        ): PrinterInfo1w =
            PrinterInfo1w(
                flags = flags,
                pDescriptionCtorArg = pDescription,
                pNameCtorArg = pName,
                pCommentCtorArg = pComment,
            )
    }
}

public class PrinterInfo2a internal constructor(
    pServerNameCtorArg: Pstr,
    pPrinterNameCtorArg: Pstr,
    pShareNameCtorArg: Pstr,
    pPortNameCtorArg: Pstr,
    pDriverNameCtorArg: Pstr,
    pCommentCtorArg: Pstr,
    pLocationCtorArg: Pstr,
    pDevModeCtorArg: MutPtr<Devmodea>,
    pSepFileCtorArg: Pstr,
    pPrintProcessorCtorArg: Pstr,
    pDatatypeCtorArg: Pstr,
    pParametersCtorArg: Pstr,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
    public var attributes: UInt,
    public var priority: UInt,
    public var defaultPriority: UInt,
    public var startTime: UInt,
    public var untilTime: UInt,
    public var status: UInt,
    public var cJobs: UInt,
    public var averagePPM: UInt,
) {
    public var pServerName: Pstr = pServerNameCtorArg
        internal set

    public var pPrinterName: Pstr = pPrinterNameCtorArg
        internal set

    public var pShareName: Pstr = pShareNameCtorArg
        internal set

    public var pPortName: Pstr = pPortNameCtorArg
        internal set

    public var pDriverName: Pstr = pDriverNameCtorArg
        internal set

    public var pComment: Pstr = pCommentCtorArg
        internal set

    public var pLocation: Pstr = pLocationCtorArg
        internal set

    public var pDevMode: MutPtr<Devmodea> = pDevModeCtorArg
        internal set

    public var pSepFile: Pstr = pSepFileCtorArg
        internal set

    public var pPrintProcessor: Pstr = pPrintProcessorCtorArg
        internal set

    public var pDatatype: Pstr = pDatatypeCtorArg
        internal set

    public var pParameters: Pstr = pParametersCtorArg
        internal set

    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        pServerNameCtorArg = MutPtr(0L),
        pPrinterNameCtorArg = MutPtr(0L),
        pShareNameCtorArg = MutPtr(0L),
        pPortNameCtorArg = MutPtr(0L),
        pDriverNameCtorArg = MutPtr(0L),
        pCommentCtorArg = MutPtr(0L),
        pLocationCtorArg = MutPtr(0L),
        pDevModeCtorArg = MutPtr(0L),
        pSepFileCtorArg = MutPtr(0L),
        pPrintProcessorCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        pParametersCtorArg = MutPtr(0L),
        pSecurityDescriptorCtorArg = MutPtr(0L),
        attributes = 0u,
        priority = 0u,
        defaultPriority = 0u,
        startTime = 0u,
        untilTime = 0u,
        status = 0u,
        cJobs = 0u,
        averagePPM = 0u,
    )

    public companion object {
        public operator fun invoke(
            pServerName: Pstr = MutPtr(0L),
            pPrinterName: Pstr = MutPtr(0L),
            pShareName: Pstr = MutPtr(0L),
            pPortName: Pstr = MutPtr(0L),
            pDriverName: Pstr = MutPtr(0L),
            pComment: Pstr = MutPtr(0L),
            pLocation: Pstr = MutPtr(0L),
            pDevMode: MutPtr<Devmodea> = MutPtr(0L),
            pSepFile: Pstr = MutPtr(0L),
            pPrintProcessor: Pstr = MutPtr(0L),
            pDatatype: Pstr = MutPtr(0L),
            pParameters: Pstr = MutPtr(0L),
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
            attributes: UInt = 0u,
            priority: UInt = 0u,
            defaultPriority: UInt = 0u,
            startTime: UInt = 0u,
            untilTime: UInt = 0u,
            status: UInt = 0u,
            cJobs: UInt = 0u,
            averagePPM: UInt = 0u,
        ): PrinterInfo2a =
            PrinterInfo2a(
                pServerNameCtorArg = pServerName,
                pPrinterNameCtorArg = pPrinterName,
                pShareNameCtorArg = pShareName,
                pPortNameCtorArg = pPortName,
                pDriverNameCtorArg = pDriverName,
                pCommentCtorArg = pComment,
                pLocationCtorArg = pLocation,
                pDevModeCtorArg = pDevMode,
                pSepFileCtorArg = pSepFile,
                pPrintProcessorCtorArg = pPrintProcessor,
                pDatatypeCtorArg = pDatatype,
                pParametersCtorArg = pParameters,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
                attributes = attributes,
                priority = priority,
                defaultPriority = defaultPriority,
                startTime = startTime,
                untilTime = untilTime,
                status = status,
                cJobs = cJobs,
                averagePPM = averagePPM,
            )
    }
}

public class PrinterInfo2w internal constructor(
    pServerNameCtorArg: Pwstr,
    pPrinterNameCtorArg: Pwstr,
    pShareNameCtorArg: Pwstr,
    pPortNameCtorArg: Pwstr,
    pDriverNameCtorArg: Pwstr,
    pCommentCtorArg: Pwstr,
    pLocationCtorArg: Pwstr,
    pDevModeCtorArg: MutPtr<Devmodew>,
    pSepFileCtorArg: Pwstr,
    pPrintProcessorCtorArg: Pwstr,
    pDatatypeCtorArg: Pwstr,
    pParametersCtorArg: Pwstr,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
    public var attributes: UInt,
    public var priority: UInt,
    public var defaultPriority: UInt,
    public var startTime: UInt,
    public var untilTime: UInt,
    public var status: UInt,
    public var cJobs: UInt,
    public var averagePPM: UInt,
) {
    public var pServerName: Pwstr = pServerNameCtorArg
        internal set

    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var pShareName: Pwstr = pShareNameCtorArg
        internal set

    public var pPortName: Pwstr = pPortNameCtorArg
        internal set

    public var pDriverName: Pwstr = pDriverNameCtorArg
        internal set

    public var pComment: Pwstr = pCommentCtorArg
        internal set

    public var pLocation: Pwstr = pLocationCtorArg
        internal set

    public var pDevMode: MutPtr<Devmodew> = pDevModeCtorArg
        internal set

    public var pSepFile: Pwstr = pSepFileCtorArg
        internal set

    public var pPrintProcessor: Pwstr = pPrintProcessorCtorArg
        internal set

    public var pDatatype: Pwstr = pDatatypeCtorArg
        internal set

    public var pParameters: Pwstr = pParametersCtorArg
        internal set

    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        pServerNameCtorArg = MutPtr(0L),
        pPrinterNameCtorArg = MutPtr(0L),
        pShareNameCtorArg = MutPtr(0L),
        pPortNameCtorArg = MutPtr(0L),
        pDriverNameCtorArg = MutPtr(0L),
        pCommentCtorArg = MutPtr(0L),
        pLocationCtorArg = MutPtr(0L),
        pDevModeCtorArg = MutPtr(0L),
        pSepFileCtorArg = MutPtr(0L),
        pPrintProcessorCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        pParametersCtorArg = MutPtr(0L),
        pSecurityDescriptorCtorArg = MutPtr(0L),
        attributes = 0u,
        priority = 0u,
        defaultPriority = 0u,
        startTime = 0u,
        untilTime = 0u,
        status = 0u,
        cJobs = 0u,
        averagePPM = 0u,
    )

    public companion object {
        public operator fun invoke(
            pServerName: Pwstr = MutPtr(0L),
            pPrinterName: Pwstr = MutPtr(0L),
            pShareName: Pwstr = MutPtr(0L),
            pPortName: Pwstr = MutPtr(0L),
            pDriverName: Pwstr = MutPtr(0L),
            pComment: Pwstr = MutPtr(0L),
            pLocation: Pwstr = MutPtr(0L),
            pDevMode: MutPtr<Devmodew> = MutPtr(0L),
            pSepFile: Pwstr = MutPtr(0L),
            pPrintProcessor: Pwstr = MutPtr(0L),
            pDatatype: Pwstr = MutPtr(0L),
            pParameters: Pwstr = MutPtr(0L),
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
            attributes: UInt = 0u,
            priority: UInt = 0u,
            defaultPriority: UInt = 0u,
            startTime: UInt = 0u,
            untilTime: UInt = 0u,
            status: UInt = 0u,
            cJobs: UInt = 0u,
            averagePPM: UInt = 0u,
        ): PrinterInfo2w =
            PrinterInfo2w(
                pServerNameCtorArg = pServerName,
                pPrinterNameCtorArg = pPrinterName,
                pShareNameCtorArg = pShareName,
                pPortNameCtorArg = pPortName,
                pDriverNameCtorArg = pDriverName,
                pCommentCtorArg = pComment,
                pLocationCtorArg = pLocation,
                pDevModeCtorArg = pDevMode,
                pSepFileCtorArg = pSepFile,
                pPrintProcessorCtorArg = pPrintProcessor,
                pDatatypeCtorArg = pDatatype,
                pParametersCtorArg = pParameters,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
                attributes = attributes,
                priority = priority,
                defaultPriority = defaultPriority,
                startTime = startTime,
                untilTime = untilTime,
                status = status,
                cJobs = cJobs,
                averagePPM = averagePPM,
            )
    }
}

public class PrinterInfo3 internal constructor(
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        pSecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PsecurityDescriptor = this.pSecurityDescriptor

    public fun copy(pSecurityDescriptor: PsecurityDescriptor = this.pSecurityDescriptor): PrinterInfo3 = PrinterInfo3(pSecurityDescriptorCtorArg = pSecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo3) return false
        if (this.pSecurityDescriptor != other.pSecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int = this.pSecurityDescriptor.hashCode()

    public companion object {
        public operator fun invoke(
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): PrinterInfo3 =
            PrinterInfo3(
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
            )
    }
}

public class PrinterInfo4a internal constructor(
    pPrinterNameCtorArg: Pstr,
    pServerNameCtorArg: Pstr,
    public var attributes: UInt,
) {
    public var pPrinterName: Pstr = pPrinterNameCtorArg
        internal set

    public var pServerName: Pstr = pServerNameCtorArg
        internal set

    public constructor() : this(
        pPrinterNameCtorArg = MutPtr(0L),
        pServerNameCtorArg = MutPtr(0L),
        attributes = 0u,
    )

    public operator fun component1(): Pstr = this.pPrinterName

    public operator fun component2(): Pstr = this.pServerName

    public operator fun component3(): UInt = this.attributes

    public fun copy(pPrinterName: Pstr = this.pPrinterName, pServerName: Pstr = this.pServerName, attributes: UInt = this.attributes): PrinterInfo4a = PrinterInfo4a(pPrinterNameCtorArg = pPrinterName, pServerNameCtorArg = pServerName, attributes = attributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo4a) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pServerName != other.pServerName) return false
        if (this.attributes != other.attributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPrinterName.hashCode()
        result = 31 * result + this.pServerName.hashCode()
        result = 31 * result + this.attributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pPrinterName: Pstr = MutPtr(0L),
            pServerName: Pstr = MutPtr(0L),
            attributes: UInt = 0u,
        ): PrinterInfo4a =
            PrinterInfo4a(
                pPrinterNameCtorArg = pPrinterName,
                pServerNameCtorArg = pServerName,
                attributes = attributes,
            )
    }
}

public class PrinterInfo4w internal constructor(
    pPrinterNameCtorArg: Pwstr,
    pServerNameCtorArg: Pwstr,
    public var attributes: UInt,
) {
    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var pServerName: Pwstr = pServerNameCtorArg
        internal set

    public constructor() : this(
        pPrinterNameCtorArg = MutPtr(0L),
        pServerNameCtorArg = MutPtr(0L),
        attributes = 0u,
    )

    public operator fun component1(): Pwstr = this.pPrinterName

    public operator fun component2(): Pwstr = this.pServerName

    public operator fun component3(): UInt = this.attributes

    public fun copy(pPrinterName: Pwstr = this.pPrinterName, pServerName: Pwstr = this.pServerName, attributes: UInt = this.attributes): PrinterInfo4w = PrinterInfo4w(pPrinterNameCtorArg = pPrinterName, pServerNameCtorArg = pServerName, attributes = attributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo4w) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pServerName != other.pServerName) return false
        if (this.attributes != other.attributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPrinterName.hashCode()
        result = 31 * result + this.pServerName.hashCode()
        result = 31 * result + this.attributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pPrinterName: Pwstr = MutPtr(0L),
            pServerName: Pwstr = MutPtr(0L),
            attributes: UInt = 0u,
        ): PrinterInfo4w =
            PrinterInfo4w(
                pPrinterNameCtorArg = pPrinterName,
                pServerNameCtorArg = pServerName,
                attributes = attributes,
            )
    }
}

public class PrinterInfo5a internal constructor(
    pPrinterNameCtorArg: Pstr,
    pPortNameCtorArg: Pstr,
    public var attributes: UInt,
    public var deviceNotSelectedTimeout: UInt,
    public var transmissionRetryTimeout: UInt,
) {
    public var pPrinterName: Pstr = pPrinterNameCtorArg
        internal set

    public var pPortName: Pstr = pPortNameCtorArg
        internal set

    public constructor() : this(
        pPrinterNameCtorArg = MutPtr(0L),
        pPortNameCtorArg = MutPtr(0L),
        attributes = 0u,
        deviceNotSelectedTimeout = 0u,
        transmissionRetryTimeout = 0u,
    )

    public operator fun component1(): Pstr = this.pPrinterName

    public operator fun component2(): Pstr = this.pPortName

    public operator fun component3(): UInt = this.attributes

    public operator fun component4(): UInt = this.deviceNotSelectedTimeout

    public operator fun component5(): UInt = this.transmissionRetryTimeout

    public fun copy(pPrinterName: Pstr = this.pPrinterName, pPortName: Pstr = this.pPortName, attributes: UInt = this.attributes, deviceNotSelectedTimeout: UInt = this.deviceNotSelectedTimeout, transmissionRetryTimeout: UInt = this.transmissionRetryTimeout): PrinterInfo5a = PrinterInfo5a(pPrinterNameCtorArg = pPrinterName, pPortNameCtorArg = pPortName, attributes = attributes, deviceNotSelectedTimeout = deviceNotSelectedTimeout, transmissionRetryTimeout = transmissionRetryTimeout)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo5a) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pPortName != other.pPortName) return false
        if (this.attributes != other.attributes) return false
        if (this.deviceNotSelectedTimeout != other.deviceNotSelectedTimeout) return false
        if (this.transmissionRetryTimeout != other.transmissionRetryTimeout) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPrinterName.hashCode()
        result = 31 * result + this.pPortName.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.deviceNotSelectedTimeout.hashCode()
        result = 31 * result + this.transmissionRetryTimeout.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pPrinterName: Pstr = MutPtr(0L),
            pPortName: Pstr = MutPtr(0L),
            attributes: UInt = 0u,
            deviceNotSelectedTimeout: UInt = 0u,
            transmissionRetryTimeout: UInt = 0u,
        ): PrinterInfo5a =
            PrinterInfo5a(
                pPrinterNameCtorArg = pPrinterName,
                pPortNameCtorArg = pPortName,
                attributes = attributes,
                deviceNotSelectedTimeout = deviceNotSelectedTimeout,
                transmissionRetryTimeout = transmissionRetryTimeout,
            )
    }
}

public class PrinterInfo5w internal constructor(
    pPrinterNameCtorArg: Pwstr,
    pPortNameCtorArg: Pwstr,
    public var attributes: UInt,
    public var deviceNotSelectedTimeout: UInt,
    public var transmissionRetryTimeout: UInt,
) {
    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public var pPortName: Pwstr = pPortNameCtorArg
        internal set

    public constructor() : this(
        pPrinterNameCtorArg = MutPtr(0L),
        pPortNameCtorArg = MutPtr(0L),
        attributes = 0u,
        deviceNotSelectedTimeout = 0u,
        transmissionRetryTimeout = 0u,
    )

    public operator fun component1(): Pwstr = this.pPrinterName

    public operator fun component2(): Pwstr = this.pPortName

    public operator fun component3(): UInt = this.attributes

    public operator fun component4(): UInt = this.deviceNotSelectedTimeout

    public operator fun component5(): UInt = this.transmissionRetryTimeout

    public fun copy(pPrinterName: Pwstr = this.pPrinterName, pPortName: Pwstr = this.pPortName, attributes: UInt = this.attributes, deviceNotSelectedTimeout: UInt = this.deviceNotSelectedTimeout, transmissionRetryTimeout: UInt = this.transmissionRetryTimeout): PrinterInfo5w = PrinterInfo5w(pPrinterNameCtorArg = pPrinterName, pPortNameCtorArg = pPortName, attributes = attributes, deviceNotSelectedTimeout = deviceNotSelectedTimeout, transmissionRetryTimeout = transmissionRetryTimeout)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo5w) return false
        if (this.pPrinterName != other.pPrinterName) return false
        if (this.pPortName != other.pPortName) return false
        if (this.attributes != other.attributes) return false
        if (this.deviceNotSelectedTimeout != other.deviceNotSelectedTimeout) return false
        if (this.transmissionRetryTimeout != other.transmissionRetryTimeout) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPrinterName.hashCode()
        result = 31 * result + this.pPortName.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.deviceNotSelectedTimeout.hashCode()
        result = 31 * result + this.transmissionRetryTimeout.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pPrinterName: Pwstr = MutPtr(0L),
            pPortName: Pwstr = MutPtr(0L),
            attributes: UInt = 0u,
            deviceNotSelectedTimeout: UInt = 0u,
            transmissionRetryTimeout: UInt = 0u,
        ): PrinterInfo5w =
            PrinterInfo5w(
                pPrinterNameCtorArg = pPrinterName,
                pPortNameCtorArg = pPortName,
                attributes = attributes,
                deviceNotSelectedTimeout = deviceNotSelectedTimeout,
                transmissionRetryTimeout = transmissionRetryTimeout,
            )
    }
}

public data class PrinterInfo6(
    public var dwStatus: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterInfo6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterInfo6> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PrinterInfo6 =
                    PrinterInfo6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrinterInfo6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStatus)
                }
            }
    }
}

public class PrinterInfo7a internal constructor(
    pszObjectGUIDCtorArg: Pstr,
    public var dwAction: UInt,
) {
    public var pszObjectGUID: Pstr = pszObjectGUIDCtorArg
        internal set

    public constructor() : this(
        pszObjectGUIDCtorArg = MutPtr(0L),
        dwAction = 0u,
    )

    public operator fun component1(): Pstr = this.pszObjectGUID

    public operator fun component2(): UInt = this.dwAction

    public fun copy(pszObjectGUID: Pstr = this.pszObjectGUID, dwAction: UInt = this.dwAction): PrinterInfo7a = PrinterInfo7a(pszObjectGUIDCtorArg = pszObjectGUID, dwAction = dwAction)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo7a) return false
        if (this.pszObjectGUID != other.pszObjectGUID) return false
        if (this.dwAction != other.dwAction) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjectGUID.hashCode()
        result = 31 * result + this.dwAction.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjectGUID: Pstr = MutPtr(0L),
            dwAction: UInt = 0u,
        ): PrinterInfo7a =
            PrinterInfo7a(
                pszObjectGUIDCtorArg = pszObjectGUID,
                dwAction = dwAction,
            )
    }
}

public class PrinterInfo7w internal constructor(
    pszObjectGUIDCtorArg: Pwstr,
    public var dwAction: UInt,
) {
    public var pszObjectGUID: Pwstr = pszObjectGUIDCtorArg
        internal set

    public constructor() : this(
        pszObjectGUIDCtorArg = MutPtr(0L),
        dwAction = 0u,
    )

    public operator fun component1(): Pwstr = this.pszObjectGUID

    public operator fun component2(): UInt = this.dwAction

    public fun copy(pszObjectGUID: Pwstr = this.pszObjectGUID, dwAction: UInt = this.dwAction): PrinterInfo7w = PrinterInfo7w(pszObjectGUIDCtorArg = pszObjectGUID, dwAction = dwAction)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo7w) return false
        if (this.pszObjectGUID != other.pszObjectGUID) return false
        if (this.dwAction != other.dwAction) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjectGUID.hashCode()
        result = 31 * result + this.dwAction.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjectGUID: Pwstr = MutPtr(0L),
            dwAction: UInt = 0u,
        ): PrinterInfo7w =
            PrinterInfo7w(
                pszObjectGUIDCtorArg = pszObjectGUID,
                dwAction = dwAction,
            )
    }
}

public class PrinterInfo8a internal constructor(
    pDevModeCtorArg: MutPtr<Devmodea>,
) {
    public var pDevMode: MutPtr<Devmodea> = pDevModeCtorArg
        internal set

    public constructor() : this(
        pDevModeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Devmodea> = this.pDevMode

    public fun copy(pDevMode: MutPtr<Devmodea> = this.pDevMode): PrinterInfo8a = PrinterInfo8a(pDevModeCtorArg = pDevMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo8a) return false
        if (this.pDevMode != other.pDevMode) return false
        return true
    }

    override fun hashCode(): Int = this.pDevMode.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterInfo8a> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterInfo8a> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrinterInfo8a =
                    PrinterInfo8a(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Devmodea>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrinterInfo8a) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Devmodea>(64)
                    ).writeNative(addr, value.pDevMode)
                }
            }

        public operator fun invoke(
            pDevMode: MutPtr<Devmodea> = MutPtr(0L),
        ): PrinterInfo8a =
            PrinterInfo8a(
                pDevModeCtorArg = pDevMode,
            )
    }
}

public class PrinterInfo8w internal constructor(
    pDevModeCtorArg: MutPtr<Devmodew>,
) {
    public var pDevMode: MutPtr<Devmodew> = pDevModeCtorArg
        internal set

    public constructor() : this(
        pDevModeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Devmodew> = this.pDevMode

    public fun copy(pDevMode: MutPtr<Devmodew> = this.pDevMode): PrinterInfo8w = PrinterInfo8w(pDevModeCtorArg = pDevMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo8w) return false
        if (this.pDevMode != other.pDevMode) return false
        return true
    }

    override fun hashCode(): Int = this.pDevMode.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterInfo8w> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterInfo8w> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrinterInfo8w =
                    PrinterInfo8w(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Devmodew>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrinterInfo8w) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Devmodew>(64)
                    ).writeNative(addr, value.pDevMode)
                }
            }

        public operator fun invoke(
            pDevMode: MutPtr<Devmodew> = MutPtr(0L),
        ): PrinterInfo8w =
            PrinterInfo8w(
                pDevModeCtorArg = pDevMode,
            )
    }
}

public class PrinterInfo9a internal constructor(
    pDevModeCtorArg: MutPtr<Devmodea>,
) {
    public var pDevMode: MutPtr<Devmodea> = pDevModeCtorArg
        internal set

    public constructor() : this(
        pDevModeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Devmodea> = this.pDevMode

    public fun copy(pDevMode: MutPtr<Devmodea> = this.pDevMode): PrinterInfo9a = PrinterInfo9a(pDevModeCtorArg = pDevMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo9a) return false
        if (this.pDevMode != other.pDevMode) return false
        return true
    }

    override fun hashCode(): Int = this.pDevMode.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterInfo9a> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterInfo9a> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrinterInfo9a =
                    PrinterInfo9a(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Devmodea>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrinterInfo9a) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Devmodea>(64)
                    ).writeNative(addr, value.pDevMode)
                }
            }

        public operator fun invoke(
            pDevMode: MutPtr<Devmodea> = MutPtr(0L),
        ): PrinterInfo9a =
            PrinterInfo9a(
                pDevModeCtorArg = pDevMode,
            )
    }
}

public class PrinterInfo9w internal constructor(
    pDevModeCtorArg: MutPtr<Devmodew>,
) {
    public var pDevMode: MutPtr<Devmodew> = pDevModeCtorArg
        internal set

    public constructor() : this(
        pDevModeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Devmodew> = this.pDevMode

    public fun copy(pDevMode: MutPtr<Devmodew> = this.pDevMode): PrinterInfo9w = PrinterInfo9w(pDevModeCtorArg = pDevMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterInfo9w) return false
        if (this.pDevMode != other.pDevMode) return false
        return true
    }

    override fun hashCode(): Int = this.pDevMode.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterInfo9w> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterInfo9w> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrinterInfo9w =
                    PrinterInfo9w(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Devmodew>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrinterInfo9w) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Devmodew>(64)
                    ).writeNative(addr, value.pDevMode)
                }
            }

        public operator fun invoke(
            pDevMode: MutPtr<Devmodew> = MutPtr(0L),
        ): PrinterInfo9w =
            PrinterInfo9w(
                pDevModeCtorArg = pDevMode,
            )
    }
}

public data class PrinterNotifyInfo(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var count: UInt = 0u,
    public var aData: List<PrinterNotifyInfoData> = List(1) { PrinterNotifyInfoData() },
)

public data class PrinterNotifyInfoData(
    public var type: UShort = 0u,
    public var field: UShort = 0u,
    public var reserved: UInt = 0u,
    public var id: UInt = 0u,
    public var notifyData: PrinterNotifyInfoData0 = PrinterNotifyInfoData0(),
)

public data class PrinterNotifyInfoData0(
    public var adwData: UIntArray = UIntArray(2),
    public var data: PrinterNotifyInfoData00 = PrinterNotifyInfoData00(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterNotifyInfoData0) return false
        if (!this.adwData.contentEquals(other.adwData)) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adwData.contentHashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }
}

public class PrinterNotifyInfoData00 internal constructor(
    public var cbBuf: UInt,
    pBufCtorArg: MutPtr<CVoid>,
) {
    public var pBuf: MutPtr<CVoid> = pBufCtorArg
        internal set

    public constructor() : this(
        cbBuf = 0u,
        pBufCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbBuf

    public operator fun component2(): MutPtr<CVoid> = this.pBuf

    public fun copy(cbBuf: UInt = this.cbBuf, pBuf: MutPtr<CVoid> = this.pBuf): PrinterNotifyInfoData00 = PrinterNotifyInfoData00(cbBuf = cbBuf, pBufCtorArg = pBuf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterNotifyInfoData00) return false
        if (this.cbBuf != other.cbBuf) return false
        if (this.pBuf != other.pBuf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbBuf.hashCode()
        result = 31 * result + this.pBuf.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterNotifyInfoData00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterNotifyInfoData00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PrinterNotifyInfoData00 =
                    PrinterNotifyInfoData00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PrinterNotifyInfoData00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbBuf)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pBuf)
                }
            }

        public operator fun invoke(
            cbBuf: UInt = 0u,
            pBuf: MutPtr<CVoid> = MutPtr(0L),
        ): PrinterNotifyInfoData00 =
            PrinterNotifyInfoData00(
                cbBuf = cbBuf,
                pBufCtorArg = pBuf,
            )
    }
}

public data class PrinterNotifyInit(
    public var size: UInt = 0u,
    public var reserved: UInt = 0u,
    public var pollTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterNotifyInit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterNotifyInit> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PrinterNotifyInit =
                    PrinterNotifyInit(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PrinterNotifyInit) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pollTime)
                }
            }
    }
}

public class PrinterNotifyOptions internal constructor(
    public var version: UInt,
    public var flags: UInt,
    public var count: UInt,
    pTypesCtorArg: MutPtr<PrinterNotifyOptionsType>,
) {
    public var pTypes: MutPtr<PrinterNotifyOptionsType> = pTypesCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0u,
        count = 0u,
        pTypesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.count

    public operator fun component4(): MutPtr<PrinterNotifyOptionsType> = this.pTypes

    public fun copy(version: UInt = this.version, flags: UInt = this.flags, count: UInt = this.count, pTypes: MutPtr<PrinterNotifyOptionsType> = this.pTypes): PrinterNotifyOptions = PrinterNotifyOptions(version = version, flags = flags, count = count, pTypesCtorArg = pTypes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterNotifyOptions) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.count != other.count) return false
        if (this.pTypes != other.pTypes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.pTypes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterNotifyOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterNotifyOptions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PrinterNotifyOptions =
                    PrinterNotifyOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PrinterNotifyOptionsType>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PrinterNotifyOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PrinterNotifyOptionsType>(64)
                    ).writeNative(addr + 16L, value.pTypes)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            flags: UInt = 0u,
            count: UInt = 0u,
            pTypes: MutPtr<PrinterNotifyOptionsType> = MutPtr(0L),
        ): PrinterNotifyOptions =
            PrinterNotifyOptions(
                version = version,
                flags = flags,
                count = count,
                pTypesCtorArg = pTypes,
            )
    }
}

public class PrinterNotifyOptionsType internal constructor(
    public var type: UShort,
    public var reserved0: UShort,
    public var reserved1: UInt,
    public var reserved2: UInt,
    public var count: UInt,
    pFieldsCtorArg: MutPtr<UShort>,
) {
    public var pFields: MutPtr<UShort> = pFieldsCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        reserved0 = 0u,
        reserved1 = 0u,
        reserved2 = 0u,
        count = 0u,
        pFieldsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.type

    public operator fun component2(): UShort = this.reserved0

    public operator fun component3(): UInt = this.reserved1

    public operator fun component4(): UInt = this.reserved2

    public operator fun component5(): UInt = this.count

    public operator fun component6(): MutPtr<UShort> = this.pFields

    public fun copy(type: UShort = this.type, reserved0: UShort = this.reserved0, reserved1: UInt = this.reserved1, reserved2: UInt = this.reserved2, count: UInt = this.count, pFields: MutPtr<UShort> = this.pFields): PrinterNotifyOptionsType = PrinterNotifyOptionsType(type = type, reserved0 = reserved0, reserved1 = reserved1, reserved2 = reserved2, count = count, pFieldsCtorArg = pFields)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrinterNotifyOptionsType) return false
        if (this.type != other.type) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.count != other.count) return false
        if (this.pFields != other.pFields) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.pFields.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterNotifyOptionsType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterNotifyOptionsType> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PrinterNotifyOptionsType =
                    PrinterNotifyOptionsType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PrinterNotifyOptionsType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 16L, value.pFields)
                }
            }

        public operator fun invoke(
            type: UShort = 0u,
            reserved0: UShort = 0u,
            reserved1: UInt = 0u,
            reserved2: UInt = 0u,
            count: UInt = 0u,
            pFields: MutPtr<UShort> = MutPtr(0L),
        ): PrinterNotifyOptionsType =
            PrinterNotifyOptionsType(
                type = type,
                reserved0 = reserved0,
                reserved1 = reserved1,
                reserved2 = reserved2,
                count = count,
                pFieldsCtorArg = pFields,
            )
    }
}

public data class PrinterOptionsa(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterOptionsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterOptionsa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrinterOptionsa =
                    PrinterOptionsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PrinterOptionsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public data class PrinterOptionsw(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterOptionsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrinterOptionsw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrinterOptionsw =
                    PrinterOptionsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PrinterOptionsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public class Printifi32(
    public var cjThis: UInt = 0u,
    public var cjIfiExtra: UInt = 0u,
    public var dpwszFamilyName: Int = 0,
    public var dpwszStyleName: Int = 0,
    public var dpwszFaceName: Int = 0,
    public var dpwszUniqueName: Int = 0,
    public var dpFontSim: Int = 0,
    public var lEmbedId: Int = 0,
    public var lItalicAngle: Int = 0,
    public var lCharBias: Int = 0,
    public var dpCharSets: Int = 0,
    public var jWinCharSet: UByte = 0u,
    public var jWinPitchAndFamily: UByte = 0u,
    public var usWinWeight: UShort = 0u,
    public var flInfo: UInt = 0u,
    public var fsSelection: UShort = 0u,
    public var fsType: UShort = 0u,
    public var fwdUnitsPerEm: Short = 0,
    public var fwdLowestPPEm: Short = 0,
    public var fwdWinAscender: Short = 0,
    public var fwdWinDescender: Short = 0,
    public var fwdMacAscender: Short = 0,
    public var fwdMacDescender: Short = 0,
    public var fwdMacLineGap: Short = 0,
    public var fwdTypoAscender: Short = 0,
    public var fwdTypoDescender: Short = 0,
    public var fwdTypoLineGap: Short = 0,
    public var fwdAveCharWidth: Short = 0,
    public var fwdMaxCharInc: Short = 0,
    public var fwdCapHeight: Short = 0,
    public var fwdXHeight: Short = 0,
    public var fwdSubscriptXSize: Short = 0,
    public var fwdSubscriptYSize: Short = 0,
    public var fwdSubscriptXOffset: Short = 0,
    public var fwdSubscriptYOffset: Short = 0,
    public var fwdSuperscriptXSize: Short = 0,
    public var fwdSuperscriptYSize: Short = 0,
    public var fwdSuperscriptXOffset: Short = 0,
    public var fwdSuperscriptYOffset: Short = 0,
    public var fwdUnderscoreSize: Short = 0,
    public var fwdUnderscorePosition: Short = 0,
    public var fwdStrikeoutSize: Short = 0,
    public var fwdStrikeoutPosition: Short = 0,
    public var chFirstChar: UByte = 0u,
    public var chLastChar: UByte = 0u,
    public var chDefaultChar: UByte = 0u,
    public var chBreakChar: UByte = 0u,
    public var wcFirstChar: UShort = 0u,
    public var wcLastChar: UShort = 0u,
    public var wcDefaultChar: UShort = 0u,
    public var wcBreakChar: UShort = 0u,
    public var ptlBaseline: Pointl = Pointl(),
    public var ptlAspect: Pointl = Pointl(),
    public var ptlCaret: Pointl = Pointl(),
    public var rclFontBox: Rectl = Rectl(),
    public var achVendId: UByteArray = UByteArray(4),
    public var cKerningPairs: UInt = 0u,
    public var ulPanoseCulture: UInt = 0u,
    public var panose: Panose = Panose(),
)

public class Printprocessoropendata internal constructor(
    pDevModeCtorArg: MutPtr<Devmodea>,
    pDatatypeCtorArg: Pwstr,
    pParametersCtorArg: Pwstr,
    pDocumentNameCtorArg: Pwstr,
    public var jobId: UInt,
    pOutputFileCtorArg: Pwstr,
    pPrinterNameCtorArg: Pwstr,
) {
    public var pDevMode: MutPtr<Devmodea> = pDevModeCtorArg
        internal set

    public var pDatatype: Pwstr = pDatatypeCtorArg
        internal set

    public var pParameters: Pwstr = pParametersCtorArg
        internal set

    public var pDocumentName: Pwstr = pDocumentNameCtorArg
        internal set

    public var pOutputFile: Pwstr = pOutputFileCtorArg
        internal set

    public var pPrinterName: Pwstr = pPrinterNameCtorArg
        internal set

    public constructor() : this(
        pDevModeCtorArg = MutPtr(0L),
        pDatatypeCtorArg = MutPtr(0L),
        pParametersCtorArg = MutPtr(0L),
        pDocumentNameCtorArg = MutPtr(0L),
        jobId = 0u,
        pOutputFileCtorArg = MutPtr(0L),
        pPrinterNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Devmodea> = this.pDevMode

    public operator fun component2(): Pwstr = this.pDatatype

    public operator fun component3(): Pwstr = this.pParameters

    public operator fun component4(): Pwstr = this.pDocumentName

    public operator fun component5(): UInt = this.jobId

    public operator fun component6(): Pwstr = this.pOutputFile

    public operator fun component7(): Pwstr = this.pPrinterName

    public fun copy(pDevMode: MutPtr<Devmodea> = this.pDevMode, pDatatype: Pwstr = this.pDatatype, pParameters: Pwstr = this.pParameters, pDocumentName: Pwstr = this.pDocumentName, jobId: UInt = this.jobId, pOutputFile: Pwstr = this.pOutputFile, pPrinterName: Pwstr = this.pPrinterName): Printprocessoropendata = Printprocessoropendata(pDevModeCtorArg = pDevMode, pDatatypeCtorArg = pDatatype, pParametersCtorArg = pParameters, pDocumentNameCtorArg = pDocumentName, jobId = jobId, pOutputFileCtorArg = pOutputFile, pPrinterNameCtorArg = pPrinterName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Printprocessoropendata) return false
        if (this.pDevMode != other.pDevMode) return false
        if (this.pDatatype != other.pDatatype) return false
        if (this.pParameters != other.pParameters) return false
        if (this.pDocumentName != other.pDocumentName) return false
        if (this.jobId != other.jobId) return false
        if (this.pOutputFile != other.pOutputFile) return false
        if (this.pPrinterName != other.pPrinterName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDevMode.hashCode()
        result = 31 * result + this.pDatatype.hashCode()
        result = 31 * result + this.pParameters.hashCode()
        result = 31 * result + this.pDocumentName.hashCode()
        result = 31 * result + this.jobId.hashCode()
        result = 31 * result + this.pOutputFile.hashCode()
        result = 31 * result + this.pPrinterName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDevMode: MutPtr<Devmodea> = MutPtr(0L),
            pDatatype: Pwstr = MutPtr(0L),
            pParameters: Pwstr = MutPtr(0L),
            pDocumentName: Pwstr = MutPtr(0L),
            jobId: UInt = 0u,
            pOutputFile: Pwstr = MutPtr(0L),
            pPrinterName: Pwstr = MutPtr(0L),
        ): Printprocessoropendata =
            Printprocessoropendata(
                pDevModeCtorArg = pDevMode,
                pDatatypeCtorArg = pDatatype,
                pParametersCtorArg = pParameters,
                pDocumentNameCtorArg = pDocumentName,
                jobId = jobId,
                pOutputFileCtorArg = pOutputFile,
                pPrinterNameCtorArg = pPrinterName,
            )
    }
}

public data class PrintprocessorCaps1(
    public var dwLevel: UInt = 0u,
    public var dwNupOptions: UInt = 0u,
    public var dwPageOrderFlags: UInt = 0u,
    public var dwNumberOfCopies: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintprocessorCaps1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintprocessorCaps1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PrintprocessorCaps1 =
                    PrintprocessorCaps1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PrintprocessorCaps1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNupOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumberOfCopies)
                }
            }
    }
}

public data class PrintprocessorCaps2(
    public var dwLevel: UInt = 0u,
    public var dwNupOptions: UInt = 0u,
    public var dwPageOrderFlags: UInt = 0u,
    public var dwNumberOfCopies: UInt = 0u,
    public var dwDuplexHandlingCaps: UInt = 0u,
    public var dwNupDirectionCaps: UInt = 0u,
    public var dwNupBorderCaps: UInt = 0u,
    public var dwBookletHandlingCaps: UInt = 0u,
    public var dwScalingCaps: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintprocessorCaps2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintprocessorCaps2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): PrintprocessorCaps2 =
                    PrintprocessorCaps2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: PrintprocessorCaps2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNupOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumberOfCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDuplexHandlingCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwNupDirectionCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwNupBorderCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwBookletHandlingCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwScalingCaps)
                }
            }
    }
}

public class PrintprocessorInfo1a internal constructor(
    pNameCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pName

    public fun copy(pName: Pstr = this.pName): PrintprocessorInfo1a = PrintprocessorInfo1a(pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrintprocessorInfo1a) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int = this.pName.hashCode()

    public companion object {
        public operator fun invoke(
            pName: Pstr = MutPtr(0L),
        ): PrintprocessorInfo1a =
            PrintprocessorInfo1a(
                pNameCtorArg = pName,
            )
    }
}

public class PrintprocessorInfo1w internal constructor(
    pNameCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pName

    public fun copy(pName: Pwstr = this.pName): PrintprocessorInfo1w = PrintprocessorInfo1w(pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrintprocessorInfo1w) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int = this.pName.hashCode()

    public companion object {
        public operator fun invoke(
            pName: Pwstr = MutPtr(0L),
        ): PrintprocessorInfo1w =
            PrintprocessorInfo1w(
                pNameCtorArg = pName,
            )
    }
}

public class Printprovidor {
    public var fpOpenPrinter: Int = 0

    public var fpSetJob: Int = 0

    public var fpGetJob: Int = 0

    public var fpEnumJobs: Int = 0

    public var fpAddPrinter: Int = 0

    public var fpDeletePrinter: Int = 0

    public var fpSetPrinter: Int = 0

    public var fpGetPrinter: Int = 0

    public var fpEnumPrinters: Int = 0

    public var fpAddPrinterDriver: Int = 0

    public var fpEnumPrinterDrivers: Int = 0

    public var fpGetPrinterDriver: Int = 0

    public var fpGetPrinterDriverDirectory: Int = 0

    public var fpDeletePrinterDriver: Int = 0

    public var fpAddPrintProcessor: Int = 0

    public var fpEnumPrintProcessors: Int = 0

    public var fpGetPrintProcessorDirectory: Int = 0

    public var fpDeletePrintProcessor: Int = 0

    public var fpEnumPrintProcessorDatatypes: Int = 0

    public var fpStartDocPrinter: Int = 0

    public var fpStartPagePrinter: Int = 0

    public var fpWritePrinter: Int = 0

    public var fpEndPagePrinter: Int = 0

    public var fpAbortPrinter: Int = 0

    public var fpReadPrinter: Int = 0

    public var fpEndDocPrinter: Int = 0

    public var fpAddJob: Int = 0

    public var fpScheduleJob: Int = 0

    public var fpGetPrinterData: Int = 0

    public var fpSetPrinterData: Int = 0

    public var fpWaitForPrinterChange: Int = 0

    public var fpClosePrinter: Int = 0

    public var fpAddForm: Int = 0

    public var fpDeleteForm: Int = 0

    public var fpGetForm: Int = 0

    public var fpSetForm: Int = 0

    public var fpEnumForms: Int = 0

    public var fpEnumMonitors: Int = 0

    public var fpEnumPorts: Int = 0

    public var fpAddPort: Int = 0

    public var fpConfigurePort: Int = 0

    public var fpDeletePort: Int = 0

    public var fpCreatePrinterIC: Int = 0

    public var fpPlayGdiScriptOnPrinterIC: Int = 0

    public var fpDeletePrinterIC: Int = 0

    public var fpAddPrinterConnection: Int = 0

    public var fpDeletePrinterConnection: Int = 0

    public var fpPrinterMessageBox: Int = 0

    public var fpAddMonitor: Int = 0

    public var fpDeleteMonitor: Int = 0

    public var fpResetPrinter: Int = 0

    public var fpGetPrinterDriverEx: Int = 0

    public var fpFindFirstPrinterChangeNotification: Int = 0

    public var fpFindClosePrinterChangeNotification: Int = 0

    public var fpAddPortEx: Int = 0

    public var fpShutDown: Int = 0

    public var fpRefreshPrinterChangeNotification: Int = 0

    public var fpOpenPrinterEx: Int = 0

    public var fpAddPrinterEx: Int = 0

    public var fpSetPort: Int = 0

    public var fpEnumPrinterData: Int = 0

    public var fpDeletePrinterData: Int = 0

    public var fpClusterSplOpen: Int = 0

    public var fpClusterSplClose: Int = 0

    public var fpClusterSplIsAlive: Int = 0

    public var fpSetPrinterDataEx: Int = 0

    public var fpGetPrinterDataEx: Int = 0

    public var fpEnumPrinterDataEx: Int = 0

    public var fpEnumPrinterKey: Int = 0

    public var fpDeletePrinterDataEx: Int = 0

    public var fpDeletePrinterKey: Int = 0

    public var fpSeekPrinter: Int = 0

    public var fpDeletePrinterDriverEx: Int = 0

    public var fpAddPerMachineConnection: Int = 0

    public var fpDeletePerMachineConnection: Int = 0

    public var fpEnumPerMachineConnections: Int = 0

    public var fpXcvData: Int = 0

    public var fpAddPrinterDriverEx: Int = 0

    public var fpSplReadPrinter: Int = 0

    public var fpDriverUnloadComplete: Int = 0

    public var fpGetSpoolFileInfo: Int = 0

    public var fpCommitSpoolData: Int = 0

    public var fpCloseSpoolFileHandle: Int = 0

    public var fpFlushPrinter: Int = 0

    public var fpSendRecvBidiData: Int = 0

    public var fpAddPrinterConnection2: Int = 0

    public var fpGetPrintClassObject: Int = 0

    public var fpReportJobProcessingProgress: Int = 0

    public var fpEnumAndLogProvidorObjects: Int = 0

    public var fpInternalGetPrinterDriver: Int = 0

    public var fpFindCompatibleDriver: Int = 0

    public var fpInstallPrinterDriverPackageFromConnection: Int = 0

    public var fpGetJobNamedPropertyValue: Int = 0

    public var fpSetJobNamedProperty: Int = 0

    public var fpDeleteJobNamedProperty: Int = 0

    public var fpEnumJobNamedProperties: Int = 0

    public var fpPowerEvent: Int = 0

    public var fpGetUserPropertyBag: Int = 0

    public var fpCanShutdown: Int = 0

    public var fpLogJobInfoForBranchOffice: Int = 0

    public var fpRegeneratePrintDeviceCapabilities: Int = 0

    public var fpPrintSupportOperation: Int = 0

    public var fpIppCreateJobOnPrinter: Int = 0

    public var fpIppGetJobAttributes: Int = 0

    public var fpIppSetJobAttributes: Int = 0

    public var fpIppGetPrinterAttributes: Int = 0

    public var fpIppSetPrinterAttributes: Int = 0

    public var fpIppCreateJobOnPrinterWithAttributes: Int = 0

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Printprovidor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Printprovidor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 864L
                override fun readNative(addr: Long): Printprovidor =
                    Printprovidor().apply {
                        this.fpOpenPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr)
                        this.fpSetJob = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L)
                        this.fpGetJob = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L)
                        this.fpEnumJobs = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L)
                        this.fpAddPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L)
                        this.fpDeletePrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L)
                        this.fpSetPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L)
                        this.fpGetPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L)
                        this.fpEnumPrinters = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L)
                        this.fpAddPrinterDriver = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L)
                        this.fpEnumPrinterDrivers = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L)
                        this.fpGetPrinterDriver = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L)
                        this.fpGetPrinterDriverDirectory = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L)
                        this.fpDeletePrinterDriver = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 104L)
                        this.fpAddPrintProcessor = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 112L)
                        this.fpEnumPrintProcessors = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 120L)
                        this.fpGetPrintProcessorDirectory = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 128L)
                        this.fpDeletePrintProcessor = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 136L)
                        this.fpEnumPrintProcessorDatatypes = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 144L)
                        this.fpStartDocPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 152L)
                        this.fpStartPagePrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 160L)
                        this.fpWritePrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 168L)
                        this.fpEndPagePrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 176L)
                        this.fpAbortPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 184L)
                        this.fpReadPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 192L)
                        this.fpEndDocPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 200L)
                        this.fpAddJob = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 208L)
                        this.fpScheduleJob = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 216L)
                        this.fpGetPrinterData = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 224L)
                        this.fpSetPrinterData = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 232L)
                        this.fpWaitForPrinterChange = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 240L)
                        this.fpClosePrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 248L)
                        this.fpAddForm = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 256L)
                        this.fpDeleteForm = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 264L)
                        this.fpGetForm = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 272L)
                        this.fpSetForm = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 280L)
                        this.fpEnumForms = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 288L)
                        this.fpEnumMonitors = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 296L)
                        this.fpEnumPorts = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 304L)
                        this.fpAddPort = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 312L)
                        this.fpConfigurePort = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 320L)
                        this.fpDeletePort = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 328L)
                        this.fpCreatePrinterIC = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 336L)
                        this.fpPlayGdiScriptOnPrinterIC = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 344L)
                        this.fpDeletePrinterIC = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 352L)
                        this.fpAddPrinterConnection = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 360L)
                        this.fpDeletePrinterConnection = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 368L)
                        this.fpPrinterMessageBox = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 376L)
                        this.fpAddMonitor = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 384L)
                        this.fpDeleteMonitor = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 392L)
                        this.fpResetPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 400L)
                        this.fpGetPrinterDriverEx = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 408L)
                        this.fpFindFirstPrinterChangeNotification = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 416L)
                        this.fpFindClosePrinterChangeNotification = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 424L)
                        this.fpAddPortEx = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 432L)
                        this.fpShutDown = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 440L)
                        this.fpRefreshPrinterChangeNotification = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 448L)
                        this.fpOpenPrinterEx = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 456L)
                        this.fpAddPrinterEx = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 464L)
                        this.fpSetPort = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 472L)
                        this.fpEnumPrinterData = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 480L)
                        this.fpDeletePrinterData = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 488L)
                        this.fpClusterSplOpen = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 496L)
                        this.fpClusterSplClose = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 504L)
                        this.fpClusterSplIsAlive = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 512L)
                        this.fpSetPrinterDataEx = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 520L)
                        this.fpGetPrinterDataEx = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 528L)
                        this.fpEnumPrinterDataEx = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 536L)
                        this.fpEnumPrinterKey = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 544L)
                        this.fpDeletePrinterDataEx = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 552L)
                        this.fpDeletePrinterKey = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 560L)
                        this.fpSeekPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 568L)
                        this.fpDeletePrinterDriverEx = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 576L)
                        this.fpAddPerMachineConnection = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 584L)
                        this.fpDeletePerMachineConnection = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 592L)
                        this.fpEnumPerMachineConnections = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 600L)
                        this.fpXcvData = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 608L)
                        this.fpAddPrinterDriverEx = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 616L)
                        this.fpSplReadPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 624L)
                        this.fpDriverUnloadComplete = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 632L)
                        this.fpGetSpoolFileInfo = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 640L)
                        this.fpCommitSpoolData = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 648L)
                        this.fpCloseSpoolFileHandle = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 656L)
                        this.fpFlushPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 664L)
                        this.fpSendRecvBidiData = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 672L)
                        this.fpAddPrinterConnection2 = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 680L)
                        this.fpGetPrintClassObject = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 688L)
                        this.fpReportJobProcessingProgress = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 696L)
                        this.fpEnumAndLogProvidorObjects = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 704L)
                        this.fpInternalGetPrinterDriver = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 712L)
                        this.fpFindCompatibleDriver = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 720L)
                        this.fpInstallPrinterDriverPackageFromConnection = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 728L)
                        this.fpGetJobNamedPropertyValue = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 736L)
                        this.fpSetJobNamedProperty = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 744L)
                        this.fpDeleteJobNamedProperty = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 752L)
                        this.fpEnumJobNamedProperties = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 760L)
                        this.fpPowerEvent = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 768L)
                        this.fpGetUserPropertyBag = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 776L)
                        this.fpCanShutdown = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 784L)
                        this.fpLogJobInfoForBranchOffice = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 792L)
                        this.fpRegeneratePrintDeviceCapabilities = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 800L)
                        this.fpPrintSupportOperation = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 808L)
                        this.fpIppCreateJobOnPrinter = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 816L)
                        this.fpIppGetJobAttributes = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 824L)
                        this.fpIppSetJobAttributes = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 832L)
                        this.fpIppGetPrinterAttributes = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 840L)
                        this.fpIppSetPrinterAttributes = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 848L)
                        this.fpIppCreateJobOnPrinterWithAttributes = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 856L)
                    }
                override fun writeNative(addr: Long, value: Printprovidor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.fpOpenPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.fpSetJob)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.fpGetJob)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.fpEnumJobs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.fpAddPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.fpDeletePrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.fpSetPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.fpGetPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.fpEnumPrinters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.fpAddPrinterDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.fpEnumPrinterDrivers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.fpGetPrinterDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.fpGetPrinterDriverDirectory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.fpDeletePrinterDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 112L, value.fpAddPrintProcessor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 120L, value.fpEnumPrintProcessors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 128L, value.fpGetPrintProcessorDirectory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 136L, value.fpDeletePrintProcessor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 144L, value.fpEnumPrintProcessorDatatypes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 152L, value.fpStartDocPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 160L, value.fpStartPagePrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 168L, value.fpWritePrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 176L, value.fpEndPagePrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 184L, value.fpAbortPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 192L, value.fpReadPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 200L, value.fpEndDocPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 208L, value.fpAddJob)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 216L, value.fpScheduleJob)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 224L, value.fpGetPrinterData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 232L, value.fpSetPrinterData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 240L, value.fpWaitForPrinterChange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 248L, value.fpClosePrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 256L, value.fpAddForm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 264L, value.fpDeleteForm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 272L, value.fpGetForm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 280L, value.fpSetForm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 288L, value.fpEnumForms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 296L, value.fpEnumMonitors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 304L, value.fpEnumPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 312L, value.fpAddPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 320L, value.fpConfigurePort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 328L, value.fpDeletePort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 336L, value.fpCreatePrinterIC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 344L, value.fpPlayGdiScriptOnPrinterIC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 352L, value.fpDeletePrinterIC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 360L, value.fpAddPrinterConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 368L, value.fpDeletePrinterConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 376L, value.fpPrinterMessageBox)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 384L, value.fpAddMonitor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 392L, value.fpDeleteMonitor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 400L, value.fpResetPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 408L, value.fpGetPrinterDriverEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 416L, value.fpFindFirstPrinterChangeNotification)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 424L, value.fpFindClosePrinterChangeNotification)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 432L, value.fpAddPortEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 440L, value.fpShutDown)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 448L, value.fpRefreshPrinterChangeNotification)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 456L, value.fpOpenPrinterEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 464L, value.fpAddPrinterEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 472L, value.fpSetPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 480L, value.fpEnumPrinterData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 488L, value.fpDeletePrinterData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 496L, value.fpClusterSplOpen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 504L, value.fpClusterSplClose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 512L, value.fpClusterSplIsAlive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 520L, value.fpSetPrinterDataEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 528L, value.fpGetPrinterDataEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 536L, value.fpEnumPrinterDataEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 544L, value.fpEnumPrinterKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 552L, value.fpDeletePrinterDataEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 560L, value.fpDeletePrinterKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 568L, value.fpSeekPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 576L, value.fpDeletePrinterDriverEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 584L, value.fpAddPerMachineConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 592L, value.fpDeletePerMachineConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 600L, value.fpEnumPerMachineConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 608L, value.fpXcvData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 616L, value.fpAddPrinterDriverEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 624L, value.fpSplReadPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 632L, value.fpDriverUnloadComplete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 640L, value.fpGetSpoolFileInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 648L, value.fpCommitSpoolData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 656L, value.fpCloseSpoolFileHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 664L, value.fpFlushPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 672L, value.fpSendRecvBidiData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 680L, value.fpAddPrinterConnection2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 688L, value.fpGetPrintClassObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 696L, value.fpReportJobProcessingProgress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 704L, value.fpEnumAndLogProvidorObjects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 712L, value.fpInternalGetPrinterDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 720L, value.fpFindCompatibleDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 728L, value.fpInstallPrinterDriverPackageFromConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 736L, value.fpGetJobNamedPropertyValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 744L, value.fpSetJobNamedProperty)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 752L, value.fpDeleteJobNamedProperty)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 760L, value.fpEnumJobNamedProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 768L, value.fpPowerEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 776L, value.fpGetUserPropertyBag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 784L, value.fpCanShutdown)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 792L, value.fpLogJobInfoForBranchOffice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 800L, value.fpRegeneratePrintDeviceCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 808L, value.fpPrintSupportOperation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 816L, value.fpIppCreateJobOnPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 824L, value.fpIppGetJobAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 832L, value.fpIppSetJobAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 840L, value.fpIppGetPrinterAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 848L, value.fpIppSetPrinterAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 856L, value.fpIppCreateJobOnPrinterWithAttributes)
                }
            }
    }
}

public data class PrintExecutionData(
    public var context: PrintExecutionContext = 0,
    public var clientAppPID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintExecutionData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintExecutionData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrintExecutionData =
                    PrintExecutionData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PrintExecutionData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.context)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.clientAppPID)
                }
            }
    }
}

public class PrintFeatureOption internal constructor(
    pszFeatureCtorArg: Pcstr,
    pszOptionCtorArg: Pcstr,
) {
    public var pszFeature: Pcstr = pszFeatureCtorArg
        internal set

    public var pszOption: Pcstr = pszOptionCtorArg
        internal set

    public constructor() : this(
        pszFeatureCtorArg = ConstPtr(0L),
        pszOptionCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcstr = this.pszFeature

    public operator fun component2(): Pcstr = this.pszOption

    public fun copy(pszFeature: Pcstr = this.pszFeature, pszOption: Pcstr = this.pszOption): PrintFeatureOption = PrintFeatureOption(pszFeatureCtorArg = pszFeature, pszOptionCtorArg = pszOption)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrintFeatureOption) return false
        if (this.pszFeature != other.pszFeature) return false
        if (this.pszOption != other.pszOption) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszFeature.hashCode()
        result = 31 * result + this.pszOption.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszFeature: Pcstr = ConstPtr(0L),
            pszOption: Pcstr = ConstPtr(0L),
        ): PrintFeatureOption =
            PrintFeatureOption(
                pszFeatureCtorArg = pszFeature,
                pszOptionCtorArg = pszOption,
            )
    }
}

public class PropsheetuiGeticonInfo internal constructor(
    public var cbSize: UShort,
    public var flags: UShort,
    public var cxIcon: UShort,
    public var cyIcon: UShort,
    hIconCtorArg: Hicon,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        cxIcon = 0u,
        cyIcon = 0u,
        hIconCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): UShort = this.cxIcon

    public operator fun component4(): UShort = this.cyIcon

    public operator fun component5(): Hicon = this.hIcon

    public fun copy(cbSize: UShort = this.cbSize, flags: UShort = this.flags, cxIcon: UShort = this.cxIcon, cyIcon: UShort = this.cyIcon, hIcon: Hicon = this.hIcon): PropsheetuiGeticonInfo = PropsheetuiGeticonInfo(cbSize = cbSize, flags = flags, cxIcon = cxIcon, cyIcon = cyIcon, hIconCtorArg = hIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetuiGeticonInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.cxIcon != other.cxIcon) return false
        if (this.cyIcon != other.cyIcon) return false
        if (this.hIcon != other.hIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.cxIcon.hashCode()
        result = 31 * result + this.cyIcon.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            flags: UShort = 0u,
            cxIcon: UShort = 0u,
            cyIcon: UShort = 0u,
            hIcon: Hicon = MutPtr(0L),
        ): PropsheetuiGeticonInfo =
            PropsheetuiGeticonInfo(
                cbSize = cbSize,
                flags = flags,
                cxIcon = cxIcon,
                cyIcon = cyIcon,
                hIconCtorArg = hIcon,
            )
    }
}

public class PropsheetuiInfo internal constructor(
    public var cbSize: UShort,
    public var version: UShort,
    public var flags: UShort,
    public var reason: UShort,
    hComPropSheetCtorArg: Handle,
    public var pfnComPropSheet: Pfncompropsheet,
    public var lParamInit: Lparam,
    public var userData: Int,
    public var result: Int,
) {
    public var hComPropSheet: Handle = hComPropSheetCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        version = 0u,
        flags = 0u,
        reason = 0u,
        hComPropSheetCtorArg = MutPtr(0L),
        pfnComPropSheet = null,
        lParamInit = 0L,
        userData = 0,
        result = 0,
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.version

    public operator fun component3(): UShort = this.flags

    public operator fun component4(): UShort = this.reason

    public operator fun component5(): Handle = this.hComPropSheet

    public operator fun component6(): Pfncompropsheet = this.pfnComPropSheet

    public operator fun component7(): Lparam = this.lParamInit

    public operator fun component8(): Int = this.userData

    public operator fun component9(): Int = this.result

    public fun copy(cbSize: UShort = this.cbSize, version: UShort = this.version, flags: UShort = this.flags, reason: UShort = this.reason, hComPropSheet: Handle = this.hComPropSheet, pfnComPropSheet: Pfncompropsheet = this.pfnComPropSheet, lParamInit: Lparam = this.lParamInit, userData: Int = this.userData, result: Int = this.result): PropsheetuiInfo = PropsheetuiInfo(cbSize = cbSize, version = version, flags = flags, reason = reason, hComPropSheetCtorArg = hComPropSheet, pfnComPropSheet = pfnComPropSheet, lParamInit = lParamInit, userData = userData, result = result)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetuiInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.reason != other.reason) return false
        if (this.hComPropSheet != other.hComPropSheet) return false
        if (this.pfnComPropSheet != other.pfnComPropSheet) return false
        if (this.lParamInit != other.lParamInit) return false
        if (this.userData != other.userData) return false
        if (this.result != other.result) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.hComPropSheet.hashCode()
        result = 31 * result + this.pfnComPropSheet.hashCode()
        result = 31 * result + this.lParamInit.hashCode()
        result = 31 * result + this.userData.hashCode()
        result = 31 * result + this.result.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            version: UShort = 0u,
            flags: UShort = 0u,
            reason: UShort = 0u,
            hComPropSheet: Handle = MutPtr(0L),
            pfnComPropSheet: Pfncompropsheet = null,
            lParamInit: Lparam = 0L,
            userData: Int = 0,
            result: Int = 0,
        ): PropsheetuiInfo =
            PropsheetuiInfo(
                cbSize = cbSize,
                version = version,
                flags = flags,
                reason = reason,
                hComPropSheetCtorArg = hComPropSheet,
                pfnComPropSheet = pfnComPropSheet,
                lParamInit = lParamInit,
                userData = userData,
                result = result,
            )
    }
}

public class PropsheetuiInfoHeader internal constructor(
    public var cbSize: UShort,
    public var flags: UShort,
    pTitleCtorArg: MutPtr<Byte>,
    hWndParentCtorArg: Hwnd,
    hInstCtorArg: Hinstance,
    public var anonymous: PropsheetuiInfoHeader0,
) {
    public var pTitle: MutPtr<Byte> = pTitleCtorArg
        internal set

    public var hWndParent: Hwnd = hWndParentCtorArg
        internal set

    public var hInst: Hinstance = hInstCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        pTitleCtorArg = MutPtr(0L),
        hWndParentCtorArg = MutPtr(0L),
        hInstCtorArg = MutPtr(0L),
        anonymous = PropsheetuiInfoHeader0(),
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): MutPtr<Byte> = this.pTitle

    public operator fun component4(): Hwnd = this.hWndParent

    public operator fun component5(): Hinstance = this.hInst

    public operator fun component6(): PropsheetuiInfoHeader0 = this.anonymous

    public fun copy(cbSize: UShort = this.cbSize, flags: UShort = this.flags, pTitle: MutPtr<Byte> = this.pTitle, hWndParent: Hwnd = this.hWndParent, hInst: Hinstance = this.hInst, anonymous: PropsheetuiInfoHeader0 = this.anonymous): PropsheetuiInfoHeader = PropsheetuiInfoHeader(cbSize = cbSize, flags = flags, pTitleCtorArg = pTitle, hWndParentCtorArg = hWndParent, hInstCtorArg = hInst, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetuiInfoHeader) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.pTitle != other.pTitle) return false
        if (this.hWndParent != other.hWndParent) return false
        if (this.hInst != other.hInst) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pTitle.hashCode()
        result = 31 * result + this.hWndParent.hashCode()
        result = 31 * result + this.hInst.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            flags: UShort = 0u,
            pTitle: MutPtr<Byte> = MutPtr(0L),
            hWndParent: Hwnd = MutPtr(0L),
            hInst: Hinstance = MutPtr(0L),
            anonymous: PropsheetuiInfoHeader0 = PropsheetuiInfoHeader0(),
        ): PropsheetuiInfoHeader =
            PropsheetuiInfoHeader(
                cbSize = cbSize,
                flags = flags,
                pTitleCtorArg = pTitle,
                hWndParentCtorArg = hWndParent,
                hInstCtorArg = hInst,
                anonymous = anonymous,
            )
    }
}

public class PropsheetuiInfoHeader0 internal constructor(
    hIconCtorArg: Hicon,
    public var iconID: Int,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        iconID = 0,
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Int = this.iconID

    public fun copy(hIcon: Hicon = this.hIcon, iconID: Int = this.iconID): PropsheetuiInfoHeader0 = PropsheetuiInfoHeader0(hIconCtorArg = hIcon, iconID = iconID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropsheetuiInfoHeader0) return false
        if (this.hIcon != other.hIcon) return false
        if (this.iconID != other.iconID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.iconID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            iconID: Int = 0,
        ): PropsheetuiInfoHeader0 =
            PropsheetuiInfoHeader0(
                hIconCtorArg = hIcon,
                iconID = iconID,
            )
    }
}

public class ProvidorInfo1a internal constructor(
    pNameCtorArg: Pstr,
    pEnvironmentCtorArg: Pstr,
    pDLLNameCtorArg: Pstr,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public var pEnvironment: Pstr = pEnvironmentCtorArg
        internal set

    public var pDLLName: Pstr = pDLLNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDLLNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pName

    public operator fun component2(): Pstr = this.pEnvironment

    public operator fun component3(): Pstr = this.pDLLName

    public fun copy(pName: Pstr = this.pName, pEnvironment: Pstr = this.pEnvironment, pDLLName: Pstr = this.pDLLName): ProvidorInfo1a = ProvidorInfo1a(pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDLLNameCtorArg = pDLLName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProvidorInfo1a) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDLLName != other.pDLLName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDLLName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pName: Pstr = MutPtr(0L),
            pEnvironment: Pstr = MutPtr(0L),
            pDLLName: Pstr = MutPtr(0L),
        ): ProvidorInfo1a =
            ProvidorInfo1a(
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDLLNameCtorArg = pDLLName,
            )
    }
}

public class ProvidorInfo1w internal constructor(
    pNameCtorArg: Pwstr,
    pEnvironmentCtorArg: Pwstr,
    pDLLNameCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public var pEnvironment: Pwstr = pEnvironmentCtorArg
        internal set

    public var pDLLName: Pwstr = pDLLNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
        pEnvironmentCtorArg = MutPtr(0L),
        pDLLNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pName

    public operator fun component2(): Pwstr = this.pEnvironment

    public operator fun component3(): Pwstr = this.pDLLName

    public fun copy(pName: Pwstr = this.pName, pEnvironment: Pwstr = this.pEnvironment, pDLLName: Pwstr = this.pDLLName): ProvidorInfo1w = ProvidorInfo1w(pNameCtorArg = pName, pEnvironmentCtorArg = pEnvironment, pDLLNameCtorArg = pDLLName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProvidorInfo1w) return false
        if (this.pName != other.pName) return false
        if (this.pEnvironment != other.pEnvironment) return false
        if (this.pDLLName != other.pDLLName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pName.hashCode()
        result = 31 * result + this.pEnvironment.hashCode()
        result = 31 * result + this.pDLLName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pName: Pwstr = MutPtr(0L),
            pEnvironment: Pwstr = MutPtr(0L),
            pDLLName: Pwstr = MutPtr(0L),
        ): ProvidorInfo1w =
            ProvidorInfo1w(
                pNameCtorArg = pName,
                pEnvironmentCtorArg = pEnvironment,
                pDLLNameCtorArg = pDLLName,
            )
    }
}

public class ProvidorInfo2a internal constructor(
    pOrderCtorArg: Pstr,
) {
    public var pOrder: Pstr = pOrderCtorArg
        internal set

    public constructor() : this(
        pOrderCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pOrder

    public fun copy(pOrder: Pstr = this.pOrder): ProvidorInfo2a = ProvidorInfo2a(pOrderCtorArg = pOrder)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProvidorInfo2a) return false
        if (this.pOrder != other.pOrder) return false
        return true
    }

    override fun hashCode(): Int = this.pOrder.hashCode()

    public companion object {
        public operator fun invoke(
            pOrder: Pstr = MutPtr(0L),
        ): ProvidorInfo2a =
            ProvidorInfo2a(
                pOrderCtorArg = pOrder,
            )
    }
}

public class ProvidorInfo2w internal constructor(
    pOrderCtorArg: Pwstr,
) {
    public var pOrder: Pwstr = pOrderCtorArg
        internal set

    public constructor() : this(
        pOrderCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pOrder

    public fun copy(pOrder: Pwstr = this.pOrder): ProvidorInfo2w = ProvidorInfo2w(pOrderCtorArg = pOrder)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProvidorInfo2w) return false
        if (this.pOrder != other.pOrder) return false
        return true
    }

    override fun hashCode(): Int = this.pOrder.hashCode()

    public companion object {
        public operator fun invoke(
            pOrder: Pwstr = MutPtr(0L),
        ): ProvidorInfo2w =
            ProvidorInfo2w(
                pOrderCtorArg = pOrder,
            )
    }
}

public data class Pscript5PrivateDevmode(
    public var wReserved: UShortArray = UShortArray(57),
    public var wSize: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pscript5PrivateDevmode) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        if (this.wSize != other.wSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wReserved.contentHashCode()
        result = 31 * result + this.wSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pscript5PrivateDevmode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pscript5PrivateDevmode> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 116L
                override fun readNative(addr: Long): Pscript5PrivateDevmode =
                    Pscript5PrivateDevmode(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (57).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 114L),
                    )
                override fun writeNative(addr: Long, value: Pscript5PrivateDevmode) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (57).toInt())
                    ).writeNative(addr, value.wReserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 114L, value.wSize)
                }
            }
    }
}

public class Pspinfo internal constructor(
    public var cbSize: UShort,
    public var wReserved: UShort,
    hComPropSheetCtorArg: Handle,
    hCPSUIPageCtorArg: Handle,
    public var pfnComPropSheet: Pfncompropsheet,
) {
    public var hComPropSheet: Handle = hComPropSheetCtorArg
        internal set

    public var hCPSUIPage: Handle = hCPSUIPageCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        wReserved = 0u,
        hComPropSheetCtorArg = MutPtr(0L),
        hCPSUIPageCtorArg = MutPtr(0L),
        pfnComPropSheet = null,
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.wReserved

    public operator fun component3(): Handle = this.hComPropSheet

    public operator fun component4(): Handle = this.hCPSUIPage

    public operator fun component5(): Pfncompropsheet = this.pfnComPropSheet

    public fun copy(cbSize: UShort = this.cbSize, wReserved: UShort = this.wReserved, hComPropSheet: Handle = this.hComPropSheet, hCPSUIPage: Handle = this.hCPSUIPage, pfnComPropSheet: Pfncompropsheet = this.pfnComPropSheet): Pspinfo = Pspinfo(cbSize = cbSize, wReserved = wReserved, hComPropSheetCtorArg = hComPropSheet, hCPSUIPageCtorArg = hCPSUIPage, pfnComPropSheet = pfnComPropSheet)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pspinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.wReserved != other.wReserved) return false
        if (this.hComPropSheet != other.hComPropSheet) return false
        if (this.hCPSUIPage != other.hCPSUIPage) return false
        if (this.pfnComPropSheet != other.pfnComPropSheet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        result = 31 * result + this.hComPropSheet.hashCode()
        result = 31 * result + this.hCPSUIPage.hashCode()
        result = 31 * result + this.pfnComPropSheet.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            wReserved: UShort = 0u,
            hComPropSheet: Handle = MutPtr(0L),
            hCPSUIPage: Handle = MutPtr(0L),
            pfnComPropSheet: Pfncompropsheet = null,
        ): Pspinfo =
            Pspinfo(
                cbSize = cbSize,
                wReserved = wReserved,
                hComPropSheetCtorArg = hComPropSheet,
                hCPSUIPageCtorArg = hCPSUIPage,
                pfnComPropSheet = pfnComPropSheet,
            )
    }
}

public data class Publisherinfo(
    public var dwMode: UInt = 0u,
    public var wMinoutlinePPEM: UShort = 0u,
    public var wMaxbitmapPPEM: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Publisherinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Publisherinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Publisherinfo =
                    Publisherinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Publisherinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wMinoutlinePPEM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wMaxbitmapPPEM)
                }
            }
    }
}

public class PrintNamedProperty internal constructor(
    propertyNameCtorArg: Pwstr,
    public var propertyValue: PrintPropertyValue,
) {
    public var propertyName: Pwstr = propertyNameCtorArg
        internal set

    public constructor() : this(
        propertyNameCtorArg = MutPtr(0L),
        propertyValue = PrintPropertyValue(),
    )

    public operator fun component1(): Pwstr = this.propertyName

    public operator fun component2(): PrintPropertyValue = this.propertyValue

    public fun copy(propertyName: Pwstr = this.propertyName, propertyValue: PrintPropertyValue = this.propertyValue): PrintNamedProperty = PrintNamedProperty(propertyNameCtorArg = propertyName, propertyValue = propertyValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrintNamedProperty) return false
        if (this.propertyName != other.propertyName) return false
        if (this.propertyValue != other.propertyValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyName.hashCode()
        result = 31 * result + this.propertyValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            propertyName: Pwstr = MutPtr(0L),
            propertyValue: PrintPropertyValue = PrintPropertyValue(),
        ): PrintNamedProperty =
            PrintNamedProperty(
                propertyNameCtorArg = propertyName,
                propertyValue = propertyValue,
            )
    }
}

public class PrintPropertiesCollection internal constructor(
    public var numberOfProperties: UInt,
    propertiesCollectionCtorArg: MutPtr<PrintNamedProperty>,
) {
    public var propertiesCollection: MutPtr<PrintNamedProperty> = propertiesCollectionCtorArg
        internal set

    public constructor() : this(
        numberOfProperties = 0u,
        propertiesCollectionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numberOfProperties

    public operator fun component2(): MutPtr<PrintNamedProperty> = this.propertiesCollection

    public fun copy(numberOfProperties: UInt = this.numberOfProperties, propertiesCollection: MutPtr<PrintNamedProperty> = this.propertiesCollection): PrintPropertiesCollection = PrintPropertiesCollection(numberOfProperties = numberOfProperties, propertiesCollectionCtorArg = propertiesCollection)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrintPropertiesCollection) return false
        if (this.numberOfProperties != other.numberOfProperties) return false
        if (this.propertiesCollection != other.propertiesCollection) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfProperties.hashCode()
        result = 31 * result + this.propertiesCollection.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintPropertiesCollection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintPropertiesCollection> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PrintPropertiesCollection =
                    PrintPropertiesCollection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PrintNamedProperty>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PrintPropertiesCollection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PrintNamedProperty>(64)
                    ).writeNative(addr + 8L, value.propertiesCollection)
                }
            }

        public operator fun invoke(
            numberOfProperties: UInt = 0u,
            propertiesCollection: MutPtr<PrintNamedProperty> = MutPtr(0L),
        ): PrintPropertiesCollection =
            PrintPropertiesCollection(
                numberOfProperties = numberOfProperties,
                propertiesCollectionCtorArg = propertiesCollection,
            )
    }
}

public data class PrintPropertyValue(
    public var ePropertyType: EPrintPropertyType = 0,
    public var value: PrintPropertyValue0 = PrintPropertyValue0(),
)

public class PrintPropertyValue0 internal constructor(
    public var propertyByte: UByte,
    propertyStringCtorArg: Pwstr,
    public var propertyInt32: Int,
    public var propertyInt64: Long,
    public var propertyBlob: PrintPropertyValue00,
) {
    public var propertyString: Pwstr = propertyStringCtorArg
        internal set

    public constructor() : this(
        propertyByte = 0u,
        propertyStringCtorArg = MutPtr(0L),
        propertyInt32 = 0,
        propertyInt64 = 0L,
        propertyBlob = PrintPropertyValue00(),
    )

    public operator fun component1(): UByte = this.propertyByte

    public operator fun component2(): Pwstr = this.propertyString

    public operator fun component3(): Int = this.propertyInt32

    public operator fun component4(): Long = this.propertyInt64

    public operator fun component5(): PrintPropertyValue00 = this.propertyBlob

    public fun copy(propertyByte: UByte = this.propertyByte, propertyString: Pwstr = this.propertyString, propertyInt32: Int = this.propertyInt32, propertyInt64: Long = this.propertyInt64, propertyBlob: PrintPropertyValue00 = this.propertyBlob): PrintPropertyValue0 = PrintPropertyValue0(propertyByte = propertyByte, propertyStringCtorArg = propertyString, propertyInt32 = propertyInt32, propertyInt64 = propertyInt64, propertyBlob = propertyBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrintPropertyValue0) return false
        if (this.propertyByte != other.propertyByte) return false
        if (this.propertyString != other.propertyString) return false
        if (this.propertyInt32 != other.propertyInt32) return false
        if (this.propertyInt64 != other.propertyInt64) return false
        if (this.propertyBlob != other.propertyBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyByte.hashCode()
        result = 31 * result + this.propertyString.hashCode()
        result = 31 * result + this.propertyInt32.hashCode()
        result = 31 * result + this.propertyInt64.hashCode()
        result = 31 * result + this.propertyBlob.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            propertyByte: UByte = 0u,
            propertyString: Pwstr = MutPtr(0L),
            propertyInt32: Int = 0,
            propertyInt64: Long = 0L,
            propertyBlob: PrintPropertyValue00 = PrintPropertyValue00(),
        ): PrintPropertyValue0 =
            PrintPropertyValue0(
                propertyByte = propertyByte,
                propertyStringCtorArg = propertyString,
                propertyInt32 = propertyInt32,
                propertyInt64 = propertyInt64,
                propertyBlob = propertyBlob,
            )
    }
}

public class PrintPropertyValue00 internal constructor(
    public var cbBuf: UInt,
    pBufCtorArg: MutPtr<CVoid>,
) {
    public var pBuf: MutPtr<CVoid> = pBufCtorArg
        internal set

    public constructor() : this(
        cbBuf = 0u,
        pBufCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbBuf

    public operator fun component2(): MutPtr<CVoid> = this.pBuf

    public fun copy(cbBuf: UInt = this.cbBuf, pBuf: MutPtr<CVoid> = this.pBuf): PrintPropertyValue00 = PrintPropertyValue00(cbBuf = cbBuf, pBufCtorArg = pBuf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrintPropertyValue00) return false
        if (this.cbBuf != other.cbBuf) return false
        if (this.pBuf != other.pBuf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbBuf.hashCode()
        result = 31 * result + this.pBuf.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintPropertyValue00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrintPropertyValue00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PrintPropertyValue00 =
                    PrintPropertyValue00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PrintPropertyValue00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbBuf)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pBuf)
                }
            }

        public operator fun invoke(
            cbBuf: UInt = 0u,
            pBuf: MutPtr<CVoid> = MutPtr(0L),
        ): PrintPropertyValue00 =
            PrintPropertyValue00(
                cbBuf = cbBuf,
                pBufCtorArg = pBuf,
            )
    }
}

public class SetresultInfo internal constructor(
    public var cbSize: UShort,
    public var wReserved: UShort,
    hSetResultCtorArg: Handle,
    public var result: Lresult,
) {
    public var hSetResult: Handle = hSetResultCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        wReserved = 0u,
        hSetResultCtorArg = MutPtr(0L),
        result = 0L,
    )

    public operator fun component1(): UShort = this.cbSize

    public operator fun component2(): UShort = this.wReserved

    public operator fun component3(): Handle = this.hSetResult

    public operator fun component4(): Lresult = this.result

    public fun copy(cbSize: UShort = this.cbSize, wReserved: UShort = this.wReserved, hSetResult: Handle = this.hSetResult, result: Lresult = this.result): SetresultInfo = SetresultInfo(cbSize = cbSize, wReserved = wReserved, hSetResultCtorArg = hSetResult, result = result)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SetresultInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.wReserved != other.wReserved) return false
        if (this.hSetResult != other.hSetResult) return false
        if (this.result != other.result) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        result = 31 * result + this.hSetResult.hashCode()
        result = 31 * result + this.result.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UShort = 0u,
            wReserved: UShort = 0u,
            hSetResult: Handle = MutPtr(0L),
            result: Lresult = 0L,
        ): SetresultInfo =
            SetresultInfo(
                cbSize = cbSize,
                wReserved = wReserved,
                hSetResultCtorArg = hSetResult,
                result = result,
            )
    }
}

public data class Showuiparams(
    public var uIType: UiType = 0,
    public var messageBoxParams: MessageboxParams = MessageboxParams(),
)

public data class SimulateCaps1(
    public var dwLevel: UInt = 0u,
    public var dwPageOrderFlags: UInt = 0u,
    public var dwNumberOfCopies: UInt = 0u,
    public var dwCollate: UInt = 0u,
    public var dwNupOptions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SimulateCaps1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SimulateCaps1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SimulateCaps1 =
                    SimulateCaps1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SimulateCaps1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPageOrderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNumberOfCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwCollate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNupOptions)
                }
            }
    }
}

public class SplclientInfo1 internal constructor(
    public var dwSize: UInt,
    pMachineNameCtorArg: Pwstr,
    pUserNameCtorArg: Pwstr,
    public var dwBuildNum: UInt,
    public var dwMajorVersion: UInt,
    public var dwMinorVersion: UInt,
    public var wProcessorArchitecture: UShort,
) {
    public var pMachineName: Pwstr = pMachineNameCtorArg
        internal set

    public var pUserName: Pwstr = pUserNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pMachineNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        dwBuildNum = 0u,
        dwMajorVersion = 0u,
        dwMinorVersion = 0u,
        wProcessorArchitecture = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.pMachineName

    public operator fun component3(): Pwstr = this.pUserName

    public operator fun component4(): UInt = this.dwBuildNum

    public operator fun component5(): UInt = this.dwMajorVersion

    public operator fun component6(): UInt = this.dwMinorVersion

    public operator fun component7(): UShort = this.wProcessorArchitecture

    public fun copy(dwSize: UInt = this.dwSize, pMachineName: Pwstr = this.pMachineName, pUserName: Pwstr = this.pUserName, dwBuildNum: UInt = this.dwBuildNum, dwMajorVersion: UInt = this.dwMajorVersion, dwMinorVersion: UInt = this.dwMinorVersion, wProcessorArchitecture: UShort = this.wProcessorArchitecture): SplclientInfo1 = SplclientInfo1(dwSize = dwSize, pMachineNameCtorArg = pMachineName, pUserNameCtorArg = pUserName, dwBuildNum = dwBuildNum, dwMajorVersion = dwMajorVersion, dwMinorVersion = dwMinorVersion, wProcessorArchitecture = wProcessorArchitecture)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SplclientInfo1) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pMachineName != other.pMachineName) return false
        if (this.pUserName != other.pUserName) return false
        if (this.dwBuildNum != other.dwBuildNum) return false
        if (this.dwMajorVersion != other.dwMajorVersion) return false
        if (this.dwMinorVersion != other.dwMinorVersion) return false
        if (this.wProcessorArchitecture != other.wProcessorArchitecture) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pMachineName.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.dwBuildNum.hashCode()
        result = 31 * result + this.dwMajorVersion.hashCode()
        result = 31 * result + this.dwMinorVersion.hashCode()
        result = 31 * result + this.wProcessorArchitecture.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pMachineName: Pwstr = MutPtr(0L),
            pUserName: Pwstr = MutPtr(0L),
            dwBuildNum: UInt = 0u,
            dwMajorVersion: UInt = 0u,
            dwMinorVersion: UInt = 0u,
            wProcessorArchitecture: UShort = 0u,
        ): SplclientInfo1 =
            SplclientInfo1(
                dwSize = dwSize,
                pMachineNameCtorArg = pMachineName,
                pUserNameCtorArg = pUserName,
                dwBuildNum = dwBuildNum,
                dwMajorVersion = dwMajorVersion,
                dwMinorVersion = dwMinorVersion,
                wProcessorArchitecture = wProcessorArchitecture,
            )
    }
}

public data class SplclientInfo2W2k(
    public var hSplPrinter: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SplclientInfo2W2k> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SplclientInfo2W2k> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SplclientInfo2W2k =
                    SplclientInfo2W2k(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SplclientInfo2W2k) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.hSplPrinter)
                }
            }
    }
}

public data class SplclientInfo2Winxp(
    public var hSplPrinter: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SplclientInfo2Winxp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SplclientInfo2Winxp> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SplclientInfo2Winxp =
                    SplclientInfo2Winxp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SplclientInfo2Winxp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.hSplPrinter)
                }
            }
    }
}

public class SplclientInfo3Vista internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    public var dwSize: UInt,
    pMachineNameCtorArg: Pwstr,
    pUserNameCtorArg: Pwstr,
    public var dwBuildNum: UInt,
    public var dwMajorVersion: UInt,
    public var dwMinorVersion: UInt,
    public var wProcessorArchitecture: UShort,
    public var hSplPrinter: ULong,
) {
    public var pMachineName: Pwstr = pMachineNameCtorArg
        internal set

    public var pUserName: Pwstr = pUserNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        dwSize = 0u,
        pMachineNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        dwBuildNum = 0u,
        dwMajorVersion = 0u,
        dwMinorVersion = 0u,
        wProcessorArchitecture = 0u,
        hSplPrinter = 0uL,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwSize

    public operator fun component4(): Pwstr = this.pMachineName

    public operator fun component5(): Pwstr = this.pUserName

    public operator fun component6(): UInt = this.dwBuildNum

    public operator fun component7(): UInt = this.dwMajorVersion

    public operator fun component8(): UInt = this.dwMinorVersion

    public operator fun component9(): UShort = this.wProcessorArchitecture

    public operator fun component10(): ULong = this.hSplPrinter

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, dwSize: UInt = this.dwSize, pMachineName: Pwstr = this.pMachineName, pUserName: Pwstr = this.pUserName, dwBuildNum: UInt = this.dwBuildNum, dwMajorVersion: UInt = this.dwMajorVersion, dwMinorVersion: UInt = this.dwMinorVersion, wProcessorArchitecture: UShort = this.wProcessorArchitecture, hSplPrinter: ULong = this.hSplPrinter): SplclientInfo3Vista = SplclientInfo3Vista(cbSize = cbSize, dwFlags = dwFlags, dwSize = dwSize, pMachineNameCtorArg = pMachineName, pUserNameCtorArg = pUserName, dwBuildNum = dwBuildNum, dwMajorVersion = dwMajorVersion, dwMinorVersion = dwMinorVersion, wProcessorArchitecture = wProcessorArchitecture, hSplPrinter = hSplPrinter)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SplclientInfo3Vista) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pMachineName != other.pMachineName) return false
        if (this.pUserName != other.pUserName) return false
        if (this.dwBuildNum != other.dwBuildNum) return false
        if (this.dwMajorVersion != other.dwMajorVersion) return false
        if (this.dwMinorVersion != other.dwMinorVersion) return false
        if (this.wProcessorArchitecture != other.wProcessorArchitecture) return false
        if (this.hSplPrinter != other.hSplPrinter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.pMachineName.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.dwBuildNum.hashCode()
        result = 31 * result + this.dwMajorVersion.hashCode()
        result = 31 * result + this.dwMinorVersion.hashCode()
        result = 31 * result + this.wProcessorArchitecture.hashCode()
        result = 31 * result + this.hSplPrinter.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwSize: UInt = 0u,
            pMachineName: Pwstr = MutPtr(0L),
            pUserName: Pwstr = MutPtr(0L),
            dwBuildNum: UInt = 0u,
            dwMajorVersion: UInt = 0u,
            dwMinorVersion: UInt = 0u,
            wProcessorArchitecture: UShort = 0u,
            hSplPrinter: ULong = 0uL,
        ): SplclientInfo3Vista =
            SplclientInfo3Vista(
                cbSize = cbSize,
                dwFlags = dwFlags,
                dwSize = dwSize,
                pMachineNameCtorArg = pMachineName,
                pUserNameCtorArg = pUserName,
                dwBuildNum = dwBuildNum,
                dwMajorVersion = dwMajorVersion,
                dwMinorVersion = dwMinorVersion,
                wProcessorArchitecture = wProcessorArchitecture,
                hSplPrinter = hSplPrinter,
            )
    }
}

public class SplclientInfoInternal internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    public var dwSize: UInt,
    pMachineNameCtorArg: Pwstr,
    pUserNameCtorArg: Pwstr,
    public var dwBuildNum: UInt,
    public var dwMajorVersion: UInt,
    public var dwMinorVersion: UInt,
    public var wProcessorArchitecture: UShort,
    public var hSplPrinter: ULong,
    public var dwProcessId: UInt,
    public var dwSessionId: UInt,
) {
    public var pMachineName: Pwstr = pMachineNameCtorArg
        internal set

    public var pUserName: Pwstr = pUserNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        dwSize = 0u,
        pMachineNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        dwBuildNum = 0u,
        dwMajorVersion = 0u,
        dwMinorVersion = 0u,
        wProcessorArchitecture = 0u,
        hSplPrinter = 0uL,
        dwProcessId = 0u,
        dwSessionId = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwSize

    public operator fun component4(): Pwstr = this.pMachineName

    public operator fun component5(): Pwstr = this.pUserName

    public operator fun component6(): UInt = this.dwBuildNum

    public operator fun component7(): UInt = this.dwMajorVersion

    public operator fun component8(): UInt = this.dwMinorVersion

    public operator fun component9(): UShort = this.wProcessorArchitecture

    public operator fun component10(): ULong = this.hSplPrinter

    public operator fun component11(): UInt = this.dwProcessId

    public operator fun component12(): UInt = this.dwSessionId

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, dwSize: UInt = this.dwSize, pMachineName: Pwstr = this.pMachineName, pUserName: Pwstr = this.pUserName, dwBuildNum: UInt = this.dwBuildNum, dwMajorVersion: UInt = this.dwMajorVersion, dwMinorVersion: UInt = this.dwMinorVersion, wProcessorArchitecture: UShort = this.wProcessorArchitecture, hSplPrinter: ULong = this.hSplPrinter, dwProcessId: UInt = this.dwProcessId, dwSessionId: UInt = this.dwSessionId): SplclientInfoInternal = SplclientInfoInternal(cbSize = cbSize, dwFlags = dwFlags, dwSize = dwSize, pMachineNameCtorArg = pMachineName, pUserNameCtorArg = pUserName, dwBuildNum = dwBuildNum, dwMajorVersion = dwMajorVersion, dwMinorVersion = dwMinorVersion, wProcessorArchitecture = wProcessorArchitecture, hSplPrinter = hSplPrinter, dwProcessId = dwProcessId, dwSessionId = dwSessionId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SplclientInfoInternal) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pMachineName != other.pMachineName) return false
        if (this.pUserName != other.pUserName) return false
        if (this.dwBuildNum != other.dwBuildNum) return false
        if (this.dwMajorVersion != other.dwMajorVersion) return false
        if (this.dwMinorVersion != other.dwMinorVersion) return false
        if (this.wProcessorArchitecture != other.wProcessorArchitecture) return false
        if (this.hSplPrinter != other.hSplPrinter) return false
        if (this.dwProcessId != other.dwProcessId) return false
        if (this.dwSessionId != other.dwSessionId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.pMachineName.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.dwBuildNum.hashCode()
        result = 31 * result + this.dwMajorVersion.hashCode()
        result = 31 * result + this.dwMinorVersion.hashCode()
        result = 31 * result + this.wProcessorArchitecture.hashCode()
        result = 31 * result + this.hSplPrinter.hashCode()
        result = 31 * result + this.dwProcessId.hashCode()
        result = 31 * result + this.dwSessionId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwSize: UInt = 0u,
            pMachineName: Pwstr = MutPtr(0L),
            pUserName: Pwstr = MutPtr(0L),
            dwBuildNum: UInt = 0u,
            dwMajorVersion: UInt = 0u,
            dwMinorVersion: UInt = 0u,
            wProcessorArchitecture: UShort = 0u,
            hSplPrinter: ULong = 0uL,
            dwProcessId: UInt = 0u,
            dwSessionId: UInt = 0u,
        ): SplclientInfoInternal =
            SplclientInfoInternal(
                cbSize = cbSize,
                dwFlags = dwFlags,
                dwSize = dwSize,
                pMachineNameCtorArg = pMachineName,
                pUserNameCtorArg = pUserName,
                dwBuildNum = dwBuildNum,
                dwMajorVersion = dwMajorVersion,
                dwMinorVersion = dwMinorVersion,
                wProcessorArchitecture = wProcessorArchitecture,
                hSplPrinter = hSplPrinter,
                dwProcessId = dwProcessId,
                dwSessionId = dwSessionId,
            )
    }
}

public data class Transdata(
    public var ubCodePageID: UByte = 0u,
    public var ubType: UByte = 0u,
    public var uCode: Transdata0 = Transdata0(),
)

public data class Transdata0(
    public var sCode: Short = 0,
    public var ubCode: UByte = 0u,
    public var ubPairs: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Transdata0) return false
        if (this.sCode != other.sCode) return false
        if (this.ubCode != other.ubCode) return false
        if (!this.ubPairs.contentEquals(other.ubPairs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sCode.hashCode()
        result = 31 * result + this.ubCode.hashCode()
        result = 31 * result + this.ubPairs.contentHashCode()
        return result
    }
}

public data class UffFileheader(
    public var dwSignature: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var nFonts: UInt = 0u,
    public var nGlyphSets: UInt = 0u,
    public var nVarData: UInt = 0u,
    public var offFontDir: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UffFileheader) return false
        if (this.dwSignature != other.dwSignature) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwSize != other.dwSize) return false
        if (this.nFonts != other.nFonts) return false
        if (this.nGlyphSets != other.nGlyphSets) return false
        if (this.nVarData != other.nVarData) return false
        if (this.offFontDir != other.offFontDir) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSignature.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.nFonts.hashCode()
        result = 31 * result + this.nGlyphSets.hashCode()
        result = 31 * result + this.nVarData.hashCode()
        result = 31 * result + this.offFontDir.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UffFileheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UffFileheader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): UffFileheader =
                    UffFileheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 32L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: UffFileheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nFonts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nGlyphSets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nVarData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.offFontDir)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 32L, value.dwReserved.toList())
                }
            }
    }
}

public data class UffFontdirectory(
    public var dwSignature: UInt = 0u,
    public var wSize: UShort = 0u,
    public var wFontID: UShort = 0u,
    public var sGlyphID: Short = 0,
    public var wFlags: UShort = 0u,
    public var dwInstallerSig: UInt = 0u,
    public var offFontName: UInt = 0u,
    public var offCartridgeName: UInt = 0u,
    public var offFontData: UInt = 0u,
    public var offGlyphData: UInt = 0u,
    public var offVarData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UffFontdirectory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UffFontdirectory> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): UffFontdirectory =
                    UffFontdirectory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: UffFontdirectory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wFontID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.sGlyphID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.wFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwInstallerSig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.offFontName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.offCartridgeName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.offFontData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.offGlyphData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.offVarData)
                }
            }
    }
}

public data class Unidrvinfo(
    public var dwSize: UInt = 0u,
    public var flGenFlags: UInt = 0u,
    public var wType: UShort = 0u,
    public var fCaps: UShort = 0u,
    public var wXRes: UShort = 0u,
    public var wYRes: UShort = 0u,
    public var sYAdjust: Short = 0,
    public var sYMoved: Short = 0,
    public var wPrivateData: UShort = 0u,
    public var sShift: Short = 0,
    public var selectFont: Invoc = Invoc(),
    public var unSelectFont: Invoc = Invoc(),
    public var wReserved: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Unidrvinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.flGenFlags != other.flGenFlags) return false
        if (this.wType != other.wType) return false
        if (this.fCaps != other.fCaps) return false
        if (this.wXRes != other.wXRes) return false
        if (this.wYRes != other.wYRes) return false
        if (this.sYAdjust != other.sYAdjust) return false
        if (this.sYMoved != other.sYMoved) return false
        if (this.wPrivateData != other.wPrivateData) return false
        if (this.sShift != other.sShift) return false
        if (this.selectFont != other.selectFont) return false
        if (this.unSelectFont != other.unSelectFont) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.flGenFlags.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.fCaps.hashCode()
        result = 31 * result + this.wXRes.hashCode()
        result = 31 * result + this.wYRes.hashCode()
        result = 31 * result + this.sYAdjust.hashCode()
        result = 31 * result + this.sYMoved.hashCode()
        result = 31 * result + this.wPrivateData.hashCode()
        result = 31 * result + this.sShift.hashCode()
        result = 31 * result + this.selectFont.hashCode()
        result = 31 * result + this.unSelectFont.hashCode()
        result = 31 * result + this.wReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Unidrvinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Unidrvinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Unidrvinfo =
                    Unidrvinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 22L),
                        (Invoc.typeLayout()).readNative(addr + 24L),
                        (Invoc.typeLayout()).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr + 40L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Unidrvinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flGenFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.fCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wXRes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.wYRes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.sYAdjust)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 18L, value.sYMoved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.wPrivateData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 22L, value.sShift)
                    (Invoc.typeLayout()).writeNative(addr + 24L, value.selectFont)
                    (Invoc.typeLayout()).writeNative(addr + 32L, value.unSelectFont)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr + 40L, value.wReserved.toList())
                }
            }
    }
}

public data class UnidrvPrivateDevmode(
    public var wReserved: UShortArray = UShortArray(4),
    public var wSize: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UnidrvPrivateDevmode) return false
        if (!this.wReserved.contentEquals(other.wReserved)) return false
        if (this.wSize != other.wSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wReserved.contentHashCode()
        result = 31 * result + this.wSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnidrvPrivateDevmode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnidrvPrivateDevmode> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): UnidrvPrivateDevmode =
                    UnidrvPrivateDevmode(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UnidrvPrivateDevmode) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr, value.wReserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wSize)
                }
            }
    }
}

public data class UnifmHdr(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var ulDefaultCodepage: UInt = 0u,
    public var lGlyphSetDataRCID: Int = 0,
    public var loUnidrvInfo: UInt = 0u,
    public var loIFIMetrics: UInt = 0u,
    public var loExtTextMetric: UInt = 0u,
    public var loWidthTable: UInt = 0u,
    public var loKernPair: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UnifmHdr) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.ulDefaultCodepage != other.ulDefaultCodepage) return false
        if (this.lGlyphSetDataRCID != other.lGlyphSetDataRCID) return false
        if (this.loUnidrvInfo != other.loUnidrvInfo) return false
        if (this.loIFIMetrics != other.loIFIMetrics) return false
        if (this.loExtTextMetric != other.loExtTextMetric) return false
        if (this.loWidthTable != other.loWidthTable) return false
        if (this.loKernPair != other.loKernPair) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.ulDefaultCodepage.hashCode()
        result = 31 * result + this.lGlyphSetDataRCID.hashCode()
        result = 31 * result + this.loUnidrvInfo.hashCode()
        result = 31 * result + this.loIFIMetrics.hashCode()
        result = 31 * result + this.loExtTextMetric.hashCode()
        result = 31 * result + this.loWidthTable.hashCode()
        result = 31 * result + this.loKernPair.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnifmHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnifmHdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): UnifmHdr =
                    UnifmHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 36L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: UnifmHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulDefaultCodepage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lGlyphSetDataRCID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.loUnidrvInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.loIFIMetrics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.loExtTextMetric)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.loWidthTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.loKernPair)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 36L, value.dwReserved.toList())
                }
            }
    }
}

public data class UniCodepageinfo(
    public var dwCodePage: UInt = 0u,
    public var selectSymbolSet: Invoc = Invoc(),
    public var unSelectSymbolSet: Invoc = Invoc(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UniCodepageinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UniCodepageinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): UniCodepageinfo =
                    UniCodepageinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Invoc.typeLayout()).readNative(addr + 4L),
                        (Invoc.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: UniCodepageinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCodePage)
                    (Invoc.typeLayout()).writeNative(addr + 4L, value.selectSymbolSet)
                    (Invoc.typeLayout()).writeNative(addr + 12L, value.unSelectSymbolSet)
                }
            }
    }
}

public data class UniGlyphsetdata(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lPredefinedID: Int = 0,
    public var dwGlyphCount: UInt = 0u,
    public var dwRunCount: UInt = 0u,
    public var loRunOffset: UInt = 0u,
    public var dwCodePageCount: UInt = 0u,
    public var loCodePageOffset: UInt = 0u,
    public var loMapTableOffset: UInt = 0u,
    public var dwReserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UniGlyphsetdata) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lPredefinedID != other.lPredefinedID) return false
        if (this.dwGlyphCount != other.dwGlyphCount) return false
        if (this.dwRunCount != other.dwRunCount) return false
        if (this.loRunOffset != other.loRunOffset) return false
        if (this.dwCodePageCount != other.dwCodePageCount) return false
        if (this.loCodePageOffset != other.loCodePageOffset) return false
        if (this.loMapTableOffset != other.loMapTableOffset) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lPredefinedID.hashCode()
        result = 31 * result + this.dwGlyphCount.hashCode()
        result = 31 * result + this.dwRunCount.hashCode()
        result = 31 * result + this.loRunOffset.hashCode()
        result = 31 * result + this.dwCodePageCount.hashCode()
        result = 31 * result + this.loCodePageOffset.hashCode()
        result = 31 * result + this.loMapTableOffset.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UniGlyphsetdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UniGlyphsetdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): UniGlyphsetdata =
                    UniGlyphsetdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 40L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: UniGlyphsetdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lPredefinedID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwGlyphCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwRunCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.loRunOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwCodePageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.loCodePageOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.loMapTableOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 40L, value.dwReserved.toList())
                }
            }
    }
}

public class Userdata internal constructor(
    public var dwSize: UInt,
    public var dwItemID: Int,
    pKeyWordNameCtorArg: Pstr,
    public var dwReserved: UIntArray,
) {
    public var pKeyWordName: Pstr = pKeyWordNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwItemID = 0,
        pKeyWordNameCtorArg = MutPtr(0L),
        dwReserved = UIntArray(8),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Int = this.dwItemID

    public operator fun component3(): Pstr = this.pKeyWordName

    public operator fun component4(): UIntArray = this.dwReserved

    public fun copy(dwSize: UInt = this.dwSize, dwItemID: Int = this.dwItemID, pKeyWordName: Pstr = this.pKeyWordName, dwReserved: UIntArray = this.dwReserved): Userdata = Userdata(dwSize = dwSize, dwItemID = dwItemID, pKeyWordNameCtorArg = pKeyWordName, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Userdata) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwItemID != other.dwItemID) return false
        if (this.pKeyWordName != other.pKeyWordName) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwItemID.hashCode()
        result = 31 * result + this.pKeyWordName.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwItemID: Int = 0,
            pKeyWordName: Pstr = MutPtr(0L),
            dwReserved: UIntArray = UIntArray(8),
        ): Userdata =
            Userdata(
                dwSize = dwSize,
                dwItemID = dwItemID,
                pKeyWordNameCtorArg = pKeyWordName,
                dwReserved = dwReserved,
            )
    }
}

public data class Widthrun(
    public var wStartGlyph: UShort = 0u,
    public var wGlyphCount: UShort = 0u,
    public var loCharWidthOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Widthrun> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Widthrun> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Widthrun =
                    Widthrun(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Widthrun) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wStartGlyph)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wGlyphCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.loCharWidthOffset)
                }
            }
    }
}

public data class Widthtable(
    public var dwSize: UInt = 0u,
    public var dwRunNum: UInt = 0u,
    public var widthRun: List<Widthrun> = List(1) { Widthrun() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Widthtable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Widthtable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Widthtable =
                    Widthtable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Widthrun.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Widthtable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRunNum)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Widthrun.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.widthRun)
                }
            }
    }
}

public data class SplclientInfo2V3(
    public var hSplPrinter: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SplclientInfo2V3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SplclientInfo2V3> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SplclientInfo2V3 =
                    SplclientInfo2V3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SplclientInfo2V3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.hSplPrinter)
                }
            }
    }
}
