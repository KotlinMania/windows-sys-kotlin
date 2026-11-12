package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr

public class Enumuilang internal constructor(
    public var numOfEnumUILang: UInt,
    public var sizeOfEnumUIBuffer: UInt,
    pEnumUIBufferCtorArg: MutPtr<UShort>,
) {
    public var pEnumUIBuffer: MutPtr<UShort> = pEnumUIBufferCtorArg
        internal set

    public constructor() : this(
        numOfEnumUILang = 0u,
        sizeOfEnumUIBuffer = 0u,
        pEnumUIBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numOfEnumUILang

    public operator fun component2(): UInt = this.sizeOfEnumUIBuffer

    public operator fun component3(): MutPtr<UShort> = this.pEnumUIBuffer

    public fun copy(numOfEnumUILang: UInt = this.numOfEnumUILang, sizeOfEnumUIBuffer: UInt = this.sizeOfEnumUIBuffer, pEnumUIBuffer: MutPtr<UShort> = this.pEnumUIBuffer): Enumuilang = Enumuilang(numOfEnumUILang = numOfEnumUILang, sizeOfEnumUIBuffer = sizeOfEnumUIBuffer, pEnumUIBufferCtorArg = pEnumUIBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Enumuilang) return false
        if (this.numOfEnumUILang != other.numOfEnumUILang) return false
        if (this.sizeOfEnumUIBuffer != other.sizeOfEnumUIBuffer) return false
        if (this.pEnumUIBuffer != other.pEnumUIBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numOfEnumUILang.hashCode()
        result = 31 * result + this.sizeOfEnumUIBuffer.hashCode()
        result = 31 * result + this.pEnumUIBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumuilang> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumuilang> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Enumuilang =
                    Enumuilang(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Enumuilang) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numOfEnumUILang)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfEnumUIBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.pEnumUIBuffer)
                }
            }

        public operator fun invoke(
            numOfEnumUILang: UInt = 0u,
            sizeOfEnumUIBuffer: UInt = 0u,
            pEnumUIBuffer: MutPtr<UShort> = MutPtr(0L),
        ): Enumuilang =
            Enumuilang(
                numOfEnumUILang = numOfEnumUILang,
                sizeOfEnumUIBuffer = sizeOfEnumUIBuffer,
                pEnumUIBufferCtorArg = pEnumUIBuffer,
            )
    }
}

public class RedirectionDescriptor internal constructor(
    public var version: UInt,
    public var functionCount: UInt,
    redirectionsCtorArg: MutPtr<RedirectionFunctionDescriptor>,
) {
    public var redirections: MutPtr<RedirectionFunctionDescriptor> = redirectionsCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        functionCount = 0u,
        redirectionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.functionCount

    public operator fun component3(): MutPtr<RedirectionFunctionDescriptor> = this.redirections

    public fun copy(version: UInt = this.version, functionCount: UInt = this.functionCount, redirections: MutPtr<RedirectionFunctionDescriptor> = this.redirections): RedirectionDescriptor = RedirectionDescriptor(version = version, functionCount = functionCount, redirectionsCtorArg = redirections)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RedirectionDescriptor) return false
        if (this.version != other.version) return false
        if (this.functionCount != other.functionCount) return false
        if (this.redirections != other.redirections) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.functionCount.hashCode()
        result = 31 * result + this.redirections.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RedirectionDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RedirectionDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RedirectionDescriptor =
                    RedirectionDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RedirectionFunctionDescriptor>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RedirectionDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.functionCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RedirectionFunctionDescriptor>(64)
                    ).writeNative(addr + 8L, value.redirections)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            functionCount: UInt = 0u,
            redirections: MutPtr<RedirectionFunctionDescriptor> = MutPtr(0L),
        ): RedirectionDescriptor =
            RedirectionDescriptor(
                version = version,
                functionCount = functionCount,
                redirectionsCtorArg = redirections,
            )
    }
}

public class RedirectionFunctionDescriptor internal constructor(
    dllNameCtorArg: Pcstr,
    functionNameCtorArg: Pcstr,
    redirectionTargetCtorArg: MutPtr<CVoid>,
) {
    public var dllName: Pcstr = dllNameCtorArg
        internal set

    public var functionName: Pcstr = functionNameCtorArg
        internal set

    public var redirectionTarget: MutPtr<CVoid> = redirectionTargetCtorArg
        internal set

    public constructor() : this(
        dllNameCtorArg = ConstPtr(0L),
        functionNameCtorArg = ConstPtr(0L),
        redirectionTargetCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcstr = this.dllName

    public operator fun component2(): Pcstr = this.functionName

    public operator fun component3(): MutPtr<CVoid> = this.redirectionTarget

    public fun copy(dllName: Pcstr = this.dllName, functionName: Pcstr = this.functionName, redirectionTarget: MutPtr<CVoid> = this.redirectionTarget): RedirectionFunctionDescriptor = RedirectionFunctionDescriptor(dllNameCtorArg = dllName, functionNameCtorArg = functionName, redirectionTargetCtorArg = redirectionTarget)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RedirectionFunctionDescriptor) return false
        if (this.dllName != other.dllName) return false
        if (this.functionName != other.functionName) return false
        if (this.redirectionTarget != other.redirectionTarget) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dllName.hashCode()
        result = 31 * result + this.functionName.hashCode()
        result = 31 * result + this.redirectionTarget.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dllName: Pcstr = ConstPtr(0L),
            functionName: Pcstr = ConstPtr(0L),
            redirectionTarget: MutPtr<CVoid> = MutPtr(0L),
        ): RedirectionFunctionDescriptor =
            RedirectionFunctionDescriptor(
                dllNameCtorArg = dllName,
                functionNameCtorArg = functionName,
                redirectionTargetCtorArg = redirectionTarget,
            )
    }
}
