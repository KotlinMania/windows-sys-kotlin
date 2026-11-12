@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.Context
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ExceptionRecord

public data class WerDumpCustomOptions(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwDumpFlags: UInt = 0u,
    public var bOnlyThisThread: Bool = 0,
    public var dwExceptionThreadFlags: UInt = 0u,
    public var dwOtherThreadFlags: UInt = 0u,
    public var dwExceptionThreadExFlags: UInt = 0u,
    public var dwOtherThreadExFlags: UInt = 0u,
    public var dwPreferredModuleFlags: UInt = 0u,
    public var dwOtherModuleFlags: UInt = 0u,
    public var wzPreferredModuleList: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerDumpCustomOptions) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwDumpFlags != other.dwDumpFlags) return false
        if (this.bOnlyThisThread != other.bOnlyThisThread) return false
        if (this.dwExceptionThreadFlags != other.dwExceptionThreadFlags) return false
        if (this.dwOtherThreadFlags != other.dwOtherThreadFlags) return false
        if (this.dwExceptionThreadExFlags != other.dwExceptionThreadExFlags) return false
        if (this.dwOtherThreadExFlags != other.dwOtherThreadExFlags) return false
        if (this.dwPreferredModuleFlags != other.dwPreferredModuleFlags) return false
        if (this.dwOtherModuleFlags != other.dwOtherModuleFlags) return false
        if (!this.wzPreferredModuleList.contentEquals(other.wzPreferredModuleList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwDumpFlags.hashCode()
        result = 31 * result + this.bOnlyThisThread.hashCode()
        result = 31 * result + this.dwExceptionThreadFlags.hashCode()
        result = 31 * result + this.dwOtherThreadFlags.hashCode()
        result = 31 * result + this.dwExceptionThreadExFlags.hashCode()
        result = 31 * result + this.dwOtherThreadExFlags.hashCode()
        result = 31 * result + this.dwPreferredModuleFlags.hashCode()
        result = 31 * result + this.dwOtherModuleFlags.hashCode()
        result = 31 * result + this.wzPreferredModuleList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WerDumpCustomOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WerDumpCustomOptions> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 552L
                override fun readNative(addr: Long): WerDumpCustomOptions =
                    WerDumpCustomOptions(
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
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 40L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: WerDumpCustomOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDumpFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.bOnlyThisThread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwExceptionThreadFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwOtherThreadFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwExceptionThreadExFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwOtherThreadExFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwPreferredModuleFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwOtherModuleFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 40L, value.wzPreferredModuleList.toList())
                }
            }
    }
}

public data class WerDumpCustomOptionsV2(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwDumpFlags: UInt = 0u,
    public var bOnlyThisThread: Bool = 0,
    public var dwExceptionThreadFlags: UInt = 0u,
    public var dwOtherThreadFlags: UInt = 0u,
    public var dwExceptionThreadExFlags: UInt = 0u,
    public var dwOtherThreadExFlags: UInt = 0u,
    public var dwPreferredModuleFlags: UInt = 0u,
    public var dwOtherModuleFlags: UInt = 0u,
    public var wzPreferredModuleList: UShortArray = UShortArray(256),
    public var dwPreferredModuleResetFlags: UInt = 0u,
    public var dwOtherModuleResetFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerDumpCustomOptionsV2) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwDumpFlags != other.dwDumpFlags) return false
        if (this.bOnlyThisThread != other.bOnlyThisThread) return false
        if (this.dwExceptionThreadFlags != other.dwExceptionThreadFlags) return false
        if (this.dwOtherThreadFlags != other.dwOtherThreadFlags) return false
        if (this.dwExceptionThreadExFlags != other.dwExceptionThreadExFlags) return false
        if (this.dwOtherThreadExFlags != other.dwOtherThreadExFlags) return false
        if (this.dwPreferredModuleFlags != other.dwPreferredModuleFlags) return false
        if (this.dwOtherModuleFlags != other.dwOtherModuleFlags) return false
        if (!this.wzPreferredModuleList.contentEquals(other.wzPreferredModuleList)) return false
        if (this.dwPreferredModuleResetFlags != other.dwPreferredModuleResetFlags) return false
        if (this.dwOtherModuleResetFlags != other.dwOtherModuleResetFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwDumpFlags.hashCode()
        result = 31 * result + this.bOnlyThisThread.hashCode()
        result = 31 * result + this.dwExceptionThreadFlags.hashCode()
        result = 31 * result + this.dwOtherThreadFlags.hashCode()
        result = 31 * result + this.dwExceptionThreadExFlags.hashCode()
        result = 31 * result + this.dwOtherThreadExFlags.hashCode()
        result = 31 * result + this.dwPreferredModuleFlags.hashCode()
        result = 31 * result + this.dwOtherModuleFlags.hashCode()
        result = 31 * result + this.wzPreferredModuleList.contentHashCode()
        result = 31 * result + this.dwPreferredModuleResetFlags.hashCode()
        result = 31 * result + this.dwOtherModuleResetFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WerDumpCustomOptionsV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WerDumpCustomOptionsV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 560L
                override fun readNative(addr: Long): WerDumpCustomOptionsV2 =
                    WerDumpCustomOptionsV2(
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
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 40L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 552L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 556L),
                    )
                override fun writeNative(addr: Long, value: WerDumpCustomOptionsV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDumpFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.bOnlyThisThread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwExceptionThreadFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwOtherThreadFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwExceptionThreadExFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwOtherThreadExFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwPreferredModuleFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwOtherModuleFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 40L, value.wzPreferredModuleList.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 552L, value.dwPreferredModuleResetFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 556L, value.dwOtherModuleResetFlags)
                }
            }
    }
}

public class WerDumpCustomOptionsV3 internal constructor(
    public var dwSize: UInt,
    public var dwMask: UInt,
    public var dwDumpFlags: UInt,
    public var bOnlyThisThread: Bool,
    public var dwExceptionThreadFlags: UInt,
    public var dwOtherThreadFlags: UInt,
    public var dwExceptionThreadExFlags: UInt,
    public var dwOtherThreadExFlags: UInt,
    public var dwPreferredModuleFlags: UInt,
    public var dwOtherModuleFlags: UInt,
    public var wzPreferredModuleList: UShortArray,
    public var dwPreferredModuleResetFlags: UInt,
    public var dwOtherModuleResetFlags: UInt,
    pvDumpKeyCtorArg: MutPtr,
    hSnapshotCtorArg: Handle,
    public var dwThreadID: UInt,
) {
    public var pvDumpKey: MutPtr = pvDumpKeyCtorArg
        internal set

    public var hSnapshot: Handle = hSnapshotCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwMask = 0u,
        dwDumpFlags = 0u,
        bOnlyThisThread = 0,
        dwExceptionThreadFlags = 0u,
        dwOtherThreadFlags = 0u,
        dwExceptionThreadExFlags = 0u,
        dwOtherThreadExFlags = 0u,
        dwPreferredModuleFlags = 0u,
        dwOtherModuleFlags = 0u,
        wzPreferredModuleList = UShortArray(256),
        dwPreferredModuleResetFlags = 0u,
        dwOtherModuleResetFlags = 0u,
        pvDumpKeyCtorArg = MutPtr(0L),
        hSnapshotCtorArg = MutPtr(0L),
        dwThreadID = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwMask

    public operator fun component3(): UInt = this.dwDumpFlags

    public operator fun component4(): Bool = this.bOnlyThisThread

    public operator fun component5(): UInt = this.dwExceptionThreadFlags

    public operator fun component6(): UInt = this.dwOtherThreadFlags

    public operator fun component7(): UInt = this.dwExceptionThreadExFlags

    public operator fun component8(): UInt = this.dwOtherThreadExFlags

    public operator fun component9(): UInt = this.dwPreferredModuleFlags

    public operator fun component10(): UInt = this.dwOtherModuleFlags

    public operator fun component11(): UShortArray = this.wzPreferredModuleList

    public operator fun component12(): UInt = this.dwPreferredModuleResetFlags

    public operator fun component13(): UInt = this.dwOtherModuleResetFlags

    public operator fun component14(): MutPtr = this.pvDumpKey

    public operator fun component15(): Handle = this.hSnapshot

    public operator fun component16(): UInt = this.dwThreadID

    public fun copy(dwSize: UInt = this.dwSize, dwMask: UInt = this.dwMask, dwDumpFlags: UInt = this.dwDumpFlags, bOnlyThisThread: Bool = this.bOnlyThisThread, dwExceptionThreadFlags: UInt = this.dwExceptionThreadFlags, dwOtherThreadFlags: UInt = this.dwOtherThreadFlags, dwExceptionThreadExFlags: UInt = this.dwExceptionThreadExFlags, dwOtherThreadExFlags: UInt = this.dwOtherThreadExFlags, dwPreferredModuleFlags: UInt = this.dwPreferredModuleFlags, dwOtherModuleFlags: UInt = this.dwOtherModuleFlags, wzPreferredModuleList: UShortArray = this.wzPreferredModuleList, dwPreferredModuleResetFlags: UInt = this.dwPreferredModuleResetFlags, dwOtherModuleResetFlags: UInt = this.dwOtherModuleResetFlags, pvDumpKey: MutPtr = this.pvDumpKey, hSnapshot: Handle = this.hSnapshot, dwThreadID: UInt = this.dwThreadID): WerDumpCustomOptionsV3 = WerDumpCustomOptionsV3(dwSize = dwSize, dwMask = dwMask, dwDumpFlags = dwDumpFlags, bOnlyThisThread = bOnlyThisThread, dwExceptionThreadFlags = dwExceptionThreadFlags, dwOtherThreadFlags = dwOtherThreadFlags, dwExceptionThreadExFlags = dwExceptionThreadExFlags, dwOtherThreadExFlags = dwOtherThreadExFlags, dwPreferredModuleFlags = dwPreferredModuleFlags, dwOtherModuleFlags = dwOtherModuleFlags, wzPreferredModuleList = wzPreferredModuleList, dwPreferredModuleResetFlags = dwPreferredModuleResetFlags, dwOtherModuleResetFlags = dwOtherModuleResetFlags, pvDumpKeyCtorArg = pvDumpKey, hSnapshotCtorArg = hSnapshot, dwThreadID = dwThreadID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerDumpCustomOptionsV3) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwDumpFlags != other.dwDumpFlags) return false
        if (this.bOnlyThisThread != other.bOnlyThisThread) return false
        if (this.dwExceptionThreadFlags != other.dwExceptionThreadFlags) return false
        if (this.dwOtherThreadFlags != other.dwOtherThreadFlags) return false
        if (this.dwExceptionThreadExFlags != other.dwExceptionThreadExFlags) return false
        if (this.dwOtherThreadExFlags != other.dwOtherThreadExFlags) return false
        if (this.dwPreferredModuleFlags != other.dwPreferredModuleFlags) return false
        if (this.dwOtherModuleFlags != other.dwOtherModuleFlags) return false
        if (!this.wzPreferredModuleList.contentEquals(other.wzPreferredModuleList)) return false
        if (this.dwPreferredModuleResetFlags != other.dwPreferredModuleResetFlags) return false
        if (this.dwOtherModuleResetFlags != other.dwOtherModuleResetFlags) return false
        if (this.pvDumpKey != other.pvDumpKey) return false
        if (this.hSnapshot != other.hSnapshot) return false
        if (this.dwThreadID != other.dwThreadID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwDumpFlags.hashCode()
        result = 31 * result + this.bOnlyThisThread.hashCode()
        result = 31 * result + this.dwExceptionThreadFlags.hashCode()
        result = 31 * result + this.dwOtherThreadFlags.hashCode()
        result = 31 * result + this.dwExceptionThreadExFlags.hashCode()
        result = 31 * result + this.dwOtherThreadExFlags.hashCode()
        result = 31 * result + this.dwPreferredModuleFlags.hashCode()
        result = 31 * result + this.dwOtherModuleFlags.hashCode()
        result = 31 * result + this.wzPreferredModuleList.contentHashCode()
        result = 31 * result + this.dwPreferredModuleResetFlags.hashCode()
        result = 31 * result + this.dwOtherModuleResetFlags.hashCode()
        result = 31 * result + this.pvDumpKey.hashCode()
        result = 31 * result + this.hSnapshot.hashCode()
        result = 31 * result + this.dwThreadID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwMask: UInt = 0u,
            dwDumpFlags: UInt = 0u,
            bOnlyThisThread: Bool = 0,
            dwExceptionThreadFlags: UInt = 0u,
            dwOtherThreadFlags: UInt = 0u,
            dwExceptionThreadExFlags: UInt = 0u,
            dwOtherThreadExFlags: UInt = 0u,
            dwPreferredModuleFlags: UInt = 0u,
            dwOtherModuleFlags: UInt = 0u,
            wzPreferredModuleList: UShortArray = UShortArray(256),
            dwPreferredModuleResetFlags: UInt = 0u,
            dwOtherModuleResetFlags: UInt = 0u,
            pvDumpKey: MutPtr = MutPtr(0L),
            hSnapshot: Handle = MutPtr(0L),
            dwThreadID: UInt = 0u,
        ): WerDumpCustomOptionsV3 =
            WerDumpCustomOptionsV3(
                dwSize = dwSize,
                dwMask = dwMask,
                dwDumpFlags = dwDumpFlags,
                bOnlyThisThread = bOnlyThisThread,
                dwExceptionThreadFlags = dwExceptionThreadFlags,
                dwOtherThreadFlags = dwOtherThreadFlags,
                dwExceptionThreadExFlags = dwExceptionThreadExFlags,
                dwOtherThreadExFlags = dwOtherThreadExFlags,
                dwPreferredModuleFlags = dwPreferredModuleFlags,
                dwOtherModuleFlags = dwOtherModuleFlags,
                wzPreferredModuleList = wzPreferredModuleList,
                dwPreferredModuleResetFlags = dwPreferredModuleResetFlags,
                dwOtherModuleResetFlags = dwOtherModuleResetFlags,
                pvDumpKeyCtorArg = pvDumpKey,
                hSnapshotCtorArg = hSnapshot,
                dwThreadID = dwThreadID,
            )
    }
}

public class WerExceptionInformation internal constructor(
    pExceptionPointersCtorArg: MutPtr,
    public var bClientPointers: Bool,
) {
    public var pExceptionPointers: MutPtr = pExceptionPointersCtorArg
        internal set

    public constructor() : this(
        pExceptionPointersCtorArg = MutPtr(0L),
        bClientPointers = 0,
    )

    public operator fun component1(): MutPtr = this.pExceptionPointers

    public operator fun component2(): Bool = this.bClientPointers

    public fun copy(pExceptionPointers: MutPtr = this.pExceptionPointers, bClientPointers: Bool = this.bClientPointers): WerExceptionInformation = WerExceptionInformation(pExceptionPointersCtorArg = pExceptionPointers, bClientPointers = bClientPointers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerExceptionInformation) return false
        if (this.pExceptionPointers != other.pExceptionPointers) return false
        if (this.bClientPointers != other.bClientPointers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pExceptionPointers.hashCode()
        result = 31 * result + this.bClientPointers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WerExceptionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WerExceptionInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WerExceptionInformation =
                    WerExceptionInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WerExceptionInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pExceptionPointers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bClientPointers)
                }
            }

        public operator fun invoke(
            pExceptionPointers: MutPtr = MutPtr(0L),
            bClientPointers: Bool = 0,
        ): WerExceptionInformation =
            WerExceptionInformation(
                pExceptionPointersCtorArg = pExceptionPointers,
                bClientPointers = bClientPointers,
            )
    }
}

public class WerReportInformation internal constructor(
    public var dwSize: UInt,
    hProcessCtorArg: Handle,
    public var wzConsentKey: UShortArray,
    public var wzFriendlyEventName: UShortArray,
    public var wzApplicationName: UShortArray,
    public var wzApplicationPath: UShortArray,
    public var wzDescription: UShortArray,
    hwndParentCtorArg: Hwnd,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hProcessCtorArg = MutPtr(0L),
        wzConsentKey = UShortArray(64),
        wzFriendlyEventName = UShortArray(128),
        wzApplicationName = UShortArray(128),
        wzApplicationPath = UShortArray(260),
        wzDescription = UShortArray(512),
        hwndParentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Handle = this.hProcess

    public operator fun component3(): UShortArray = this.wzConsentKey

    public operator fun component4(): UShortArray = this.wzFriendlyEventName

    public operator fun component5(): UShortArray = this.wzApplicationName

    public operator fun component6(): UShortArray = this.wzApplicationPath

    public operator fun component7(): UShortArray = this.wzDescription

    public operator fun component8(): Hwnd = this.hwndParent

    public fun copy(dwSize: UInt = this.dwSize, hProcess: Handle = this.hProcess, wzConsentKey: UShortArray = this.wzConsentKey, wzFriendlyEventName: UShortArray = this.wzFriendlyEventName, wzApplicationName: UShortArray = this.wzApplicationName, wzApplicationPath: UShortArray = this.wzApplicationPath, wzDescription: UShortArray = this.wzDescription, hwndParent: Hwnd = this.hwndParent): WerReportInformation = WerReportInformation(dwSize = dwSize, hProcessCtorArg = hProcess, wzConsentKey = wzConsentKey, wzFriendlyEventName = wzFriendlyEventName, wzApplicationName = wzApplicationName, wzApplicationPath = wzApplicationPath, wzDescription = wzDescription, hwndParentCtorArg = hwndParent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportInformation) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hProcess != other.hProcess) return false
        if (!this.wzConsentKey.contentEquals(other.wzConsentKey)) return false
        if (!this.wzFriendlyEventName.contentEquals(other.wzFriendlyEventName)) return false
        if (!this.wzApplicationName.contentEquals(other.wzApplicationName)) return false
        if (!this.wzApplicationPath.contentEquals(other.wzApplicationPath)) return false
        if (!this.wzDescription.contentEquals(other.wzDescription)) return false
        if (this.hwndParent != other.hwndParent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.wzConsentKey.contentHashCode()
        result = 31 * result + this.wzFriendlyEventName.contentHashCode()
        result = 31 * result + this.wzApplicationName.contentHashCode()
        result = 31 * result + this.wzApplicationPath.contentHashCode()
        result = 31 * result + this.wzDescription.contentHashCode()
        result = 31 * result + this.hwndParent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hProcess: Handle = MutPtr(0L),
            wzConsentKey: UShortArray = UShortArray(64),
            wzFriendlyEventName: UShortArray = UShortArray(128),
            wzApplicationName: UShortArray = UShortArray(128),
            wzApplicationPath: UShortArray = UShortArray(260),
            wzDescription: UShortArray = UShortArray(512),
            hwndParent: Hwnd = MutPtr(0L),
        ): WerReportInformation =
            WerReportInformation(
                dwSize = dwSize,
                hProcessCtorArg = hProcess,
                wzConsentKey = wzConsentKey,
                wzFriendlyEventName = wzFriendlyEventName,
                wzApplicationName = wzApplicationName,
                wzApplicationPath = wzApplicationPath,
                wzDescription = wzDescription,
                hwndParentCtorArg = hwndParent,
            )
    }
}

public class WerReportInformationV3 internal constructor(
    public var dwSize: UInt,
    hProcessCtorArg: Handle,
    public var wzConsentKey: UShortArray,
    public var wzFriendlyEventName: UShortArray,
    public var wzApplicationName: UShortArray,
    public var wzApplicationPath: UShortArray,
    public var wzDescription: UShortArray,
    hwndParentCtorArg: Hwnd,
    public var wzNamespacePartner: UShortArray,
    public var wzNamespaceGroup: UShortArray,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hProcessCtorArg = MutPtr(0L),
        wzConsentKey = UShortArray(64),
        wzFriendlyEventName = UShortArray(128),
        wzApplicationName = UShortArray(128),
        wzApplicationPath = UShortArray(260),
        wzDescription = UShortArray(512),
        hwndParentCtorArg = MutPtr(0L),
        wzNamespacePartner = UShortArray(64),
        wzNamespaceGroup = UShortArray(64),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Handle = this.hProcess

    public operator fun component3(): UShortArray = this.wzConsentKey

    public operator fun component4(): UShortArray = this.wzFriendlyEventName

    public operator fun component5(): UShortArray = this.wzApplicationName

    public operator fun component6(): UShortArray = this.wzApplicationPath

    public operator fun component7(): UShortArray = this.wzDescription

    public operator fun component8(): Hwnd = this.hwndParent

    public operator fun component9(): UShortArray = this.wzNamespacePartner

    public operator fun component10(): UShortArray = this.wzNamespaceGroup

    public fun copy(dwSize: UInt = this.dwSize, hProcess: Handle = this.hProcess, wzConsentKey: UShortArray = this.wzConsentKey, wzFriendlyEventName: UShortArray = this.wzFriendlyEventName, wzApplicationName: UShortArray = this.wzApplicationName, wzApplicationPath: UShortArray = this.wzApplicationPath, wzDescription: UShortArray = this.wzDescription, hwndParent: Hwnd = this.hwndParent, wzNamespacePartner: UShortArray = this.wzNamespacePartner, wzNamespaceGroup: UShortArray = this.wzNamespaceGroup): WerReportInformationV3 = WerReportInformationV3(dwSize = dwSize, hProcessCtorArg = hProcess, wzConsentKey = wzConsentKey, wzFriendlyEventName = wzFriendlyEventName, wzApplicationName = wzApplicationName, wzApplicationPath = wzApplicationPath, wzDescription = wzDescription, hwndParentCtorArg = hwndParent, wzNamespacePartner = wzNamespacePartner, wzNamespaceGroup = wzNamespaceGroup)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportInformationV3) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hProcess != other.hProcess) return false
        if (!this.wzConsentKey.contentEquals(other.wzConsentKey)) return false
        if (!this.wzFriendlyEventName.contentEquals(other.wzFriendlyEventName)) return false
        if (!this.wzApplicationName.contentEquals(other.wzApplicationName)) return false
        if (!this.wzApplicationPath.contentEquals(other.wzApplicationPath)) return false
        if (!this.wzDescription.contentEquals(other.wzDescription)) return false
        if (this.hwndParent != other.hwndParent) return false
        if (!this.wzNamespacePartner.contentEquals(other.wzNamespacePartner)) return false
        if (!this.wzNamespaceGroup.contentEquals(other.wzNamespaceGroup)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.wzConsentKey.contentHashCode()
        result = 31 * result + this.wzFriendlyEventName.contentHashCode()
        result = 31 * result + this.wzApplicationName.contentHashCode()
        result = 31 * result + this.wzApplicationPath.contentHashCode()
        result = 31 * result + this.wzDescription.contentHashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.wzNamespacePartner.contentHashCode()
        result = 31 * result + this.wzNamespaceGroup.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hProcess: Handle = MutPtr(0L),
            wzConsentKey: UShortArray = UShortArray(64),
            wzFriendlyEventName: UShortArray = UShortArray(128),
            wzApplicationName: UShortArray = UShortArray(128),
            wzApplicationPath: UShortArray = UShortArray(260),
            wzDescription: UShortArray = UShortArray(512),
            hwndParent: Hwnd = MutPtr(0L),
            wzNamespacePartner: UShortArray = UShortArray(64),
            wzNamespaceGroup: UShortArray = UShortArray(64),
        ): WerReportInformationV3 =
            WerReportInformationV3(
                dwSize = dwSize,
                hProcessCtorArg = hProcess,
                wzConsentKey = wzConsentKey,
                wzFriendlyEventName = wzFriendlyEventName,
                wzApplicationName = wzApplicationName,
                wzApplicationPath = wzApplicationPath,
                wzDescription = wzDescription,
                hwndParentCtorArg = hwndParent,
                wzNamespacePartner = wzNamespacePartner,
                wzNamespaceGroup = wzNamespaceGroup,
            )
    }
}

public class WerReportInformationV4 internal constructor(
    public var dwSize: UInt,
    hProcessCtorArg: Handle,
    public var wzConsentKey: UShortArray,
    public var wzFriendlyEventName: UShortArray,
    public var wzApplicationName: UShortArray,
    public var wzApplicationPath: UShortArray,
    public var wzDescription: UShortArray,
    hwndParentCtorArg: Hwnd,
    public var wzNamespacePartner: UShortArray,
    public var wzNamespaceGroup: UShortArray,
    public var rgbApplicationIdentity: UByteArray,
    hSnapshotCtorArg: Handle,
    hDeleteFilesImpersonationTokenCtorArg: Handle,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hSnapshot: Handle = hSnapshotCtorArg
        internal set

    public var hDeleteFilesImpersonationToken: Handle = hDeleteFilesImpersonationTokenCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hProcessCtorArg = MutPtr(0L),
        wzConsentKey = UShortArray(64),
        wzFriendlyEventName = UShortArray(128),
        wzApplicationName = UShortArray(128),
        wzApplicationPath = UShortArray(260),
        wzDescription = UShortArray(512),
        hwndParentCtorArg = MutPtr(0L),
        wzNamespacePartner = UShortArray(64),
        wzNamespaceGroup = UShortArray(64),
        rgbApplicationIdentity = UByteArray(16),
        hSnapshotCtorArg = MutPtr(0L),
        hDeleteFilesImpersonationTokenCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Handle = this.hProcess

    public operator fun component3(): UShortArray = this.wzConsentKey

    public operator fun component4(): UShortArray = this.wzFriendlyEventName

    public operator fun component5(): UShortArray = this.wzApplicationName

    public operator fun component6(): UShortArray = this.wzApplicationPath

    public operator fun component7(): UShortArray = this.wzDescription

    public operator fun component8(): Hwnd = this.hwndParent

    public operator fun component9(): UShortArray = this.wzNamespacePartner

    public operator fun component10(): UShortArray = this.wzNamespaceGroup

    public operator fun component11(): UByteArray = this.rgbApplicationIdentity

    public operator fun component12(): Handle = this.hSnapshot

    public operator fun component13(): Handle = this.hDeleteFilesImpersonationToken

    public fun copy(dwSize: UInt = this.dwSize, hProcess: Handle = this.hProcess, wzConsentKey: UShortArray = this.wzConsentKey, wzFriendlyEventName: UShortArray = this.wzFriendlyEventName, wzApplicationName: UShortArray = this.wzApplicationName, wzApplicationPath: UShortArray = this.wzApplicationPath, wzDescription: UShortArray = this.wzDescription, hwndParent: Hwnd = this.hwndParent, wzNamespacePartner: UShortArray = this.wzNamespacePartner, wzNamespaceGroup: UShortArray = this.wzNamespaceGroup, rgbApplicationIdentity: UByteArray = this.rgbApplicationIdentity, hSnapshot: Handle = this.hSnapshot, hDeleteFilesImpersonationToken: Handle = this.hDeleteFilesImpersonationToken): WerReportInformationV4 = WerReportInformationV4(dwSize = dwSize, hProcessCtorArg = hProcess, wzConsentKey = wzConsentKey, wzFriendlyEventName = wzFriendlyEventName, wzApplicationName = wzApplicationName, wzApplicationPath = wzApplicationPath, wzDescription = wzDescription, hwndParentCtorArg = hwndParent, wzNamespacePartner = wzNamespacePartner, wzNamespaceGroup = wzNamespaceGroup, rgbApplicationIdentity = rgbApplicationIdentity, hSnapshotCtorArg = hSnapshot, hDeleteFilesImpersonationTokenCtorArg = hDeleteFilesImpersonationToken)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportInformationV4) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hProcess != other.hProcess) return false
        if (!this.wzConsentKey.contentEquals(other.wzConsentKey)) return false
        if (!this.wzFriendlyEventName.contentEquals(other.wzFriendlyEventName)) return false
        if (!this.wzApplicationName.contentEquals(other.wzApplicationName)) return false
        if (!this.wzApplicationPath.contentEquals(other.wzApplicationPath)) return false
        if (!this.wzDescription.contentEquals(other.wzDescription)) return false
        if (this.hwndParent != other.hwndParent) return false
        if (!this.wzNamespacePartner.contentEquals(other.wzNamespacePartner)) return false
        if (!this.wzNamespaceGroup.contentEquals(other.wzNamespaceGroup)) return false
        if (!this.rgbApplicationIdentity.contentEquals(other.rgbApplicationIdentity)) return false
        if (this.hSnapshot != other.hSnapshot) return false
        if (this.hDeleteFilesImpersonationToken != other.hDeleteFilesImpersonationToken) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.wzConsentKey.contentHashCode()
        result = 31 * result + this.wzFriendlyEventName.contentHashCode()
        result = 31 * result + this.wzApplicationName.contentHashCode()
        result = 31 * result + this.wzApplicationPath.contentHashCode()
        result = 31 * result + this.wzDescription.contentHashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.wzNamespacePartner.contentHashCode()
        result = 31 * result + this.wzNamespaceGroup.contentHashCode()
        result = 31 * result + this.rgbApplicationIdentity.contentHashCode()
        result = 31 * result + this.hSnapshot.hashCode()
        result = 31 * result + this.hDeleteFilesImpersonationToken.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hProcess: Handle = MutPtr(0L),
            wzConsentKey: UShortArray = UShortArray(64),
            wzFriendlyEventName: UShortArray = UShortArray(128),
            wzApplicationName: UShortArray = UShortArray(128),
            wzApplicationPath: UShortArray = UShortArray(260),
            wzDescription: UShortArray = UShortArray(512),
            hwndParent: Hwnd = MutPtr(0L),
            wzNamespacePartner: UShortArray = UShortArray(64),
            wzNamespaceGroup: UShortArray = UShortArray(64),
            rgbApplicationIdentity: UByteArray = UByteArray(16),
            hSnapshot: Handle = MutPtr(0L),
            hDeleteFilesImpersonationToken: Handle = MutPtr(0L),
        ): WerReportInformationV4 =
            WerReportInformationV4(
                dwSize = dwSize,
                hProcessCtorArg = hProcess,
                wzConsentKey = wzConsentKey,
                wzFriendlyEventName = wzFriendlyEventName,
                wzApplicationName = wzApplicationName,
                wzApplicationPath = wzApplicationPath,
                wzDescription = wzDescription,
                hwndParentCtorArg = hwndParent,
                wzNamespacePartner = wzNamespacePartner,
                wzNamespaceGroup = wzNamespaceGroup,
                rgbApplicationIdentity = rgbApplicationIdentity,
                hSnapshotCtorArg = hSnapshot,
                hDeleteFilesImpersonationTokenCtorArg = hDeleteFilesImpersonationToken,
            )
    }
}

public class WerReportInformationV5 internal constructor(
    public var dwSize: UInt,
    hProcessCtorArg: Handle,
    public var wzConsentKey: UShortArray,
    public var wzFriendlyEventName: UShortArray,
    public var wzApplicationName: UShortArray,
    public var wzApplicationPath: UShortArray,
    public var wzDescription: UShortArray,
    hwndParentCtorArg: Hwnd,
    public var wzNamespacePartner: UShortArray,
    public var wzNamespaceGroup: UShortArray,
    public var rgbApplicationIdentity: UByteArray,
    hSnapshotCtorArg: Handle,
    hDeleteFilesImpersonationTokenCtorArg: Handle,
    public var submitResultMax: WerSubmitResult,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hSnapshot: Handle = hSnapshotCtorArg
        internal set

    public var hDeleteFilesImpersonationToken: Handle = hDeleteFilesImpersonationTokenCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hProcessCtorArg = MutPtr(0L),
        wzConsentKey = UShortArray(64),
        wzFriendlyEventName = UShortArray(128),
        wzApplicationName = UShortArray(128),
        wzApplicationPath = UShortArray(260),
        wzDescription = UShortArray(512),
        hwndParentCtorArg = MutPtr(0L),
        wzNamespacePartner = UShortArray(64),
        wzNamespaceGroup = UShortArray(64),
        rgbApplicationIdentity = UByteArray(16),
        hSnapshotCtorArg = MutPtr(0L),
        hDeleteFilesImpersonationTokenCtorArg = MutPtr(0L),
        submitResultMax = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Handle = this.hProcess

    public operator fun component3(): UShortArray = this.wzConsentKey

    public operator fun component4(): UShortArray = this.wzFriendlyEventName

    public operator fun component5(): UShortArray = this.wzApplicationName

    public operator fun component6(): UShortArray = this.wzApplicationPath

    public operator fun component7(): UShortArray = this.wzDescription

    public operator fun component8(): Hwnd = this.hwndParent

    public operator fun component9(): UShortArray = this.wzNamespacePartner

    public operator fun component10(): UShortArray = this.wzNamespaceGroup

    public operator fun component11(): UByteArray = this.rgbApplicationIdentity

    public operator fun component12(): Handle = this.hSnapshot

    public operator fun component13(): Handle = this.hDeleteFilesImpersonationToken

    public operator fun component14(): WerSubmitResult = this.submitResultMax

    public fun copy(dwSize: UInt = this.dwSize, hProcess: Handle = this.hProcess, wzConsentKey: UShortArray = this.wzConsentKey, wzFriendlyEventName: UShortArray = this.wzFriendlyEventName, wzApplicationName: UShortArray = this.wzApplicationName, wzApplicationPath: UShortArray = this.wzApplicationPath, wzDescription: UShortArray = this.wzDescription, hwndParent: Hwnd = this.hwndParent, wzNamespacePartner: UShortArray = this.wzNamespacePartner, wzNamespaceGroup: UShortArray = this.wzNamespaceGroup, rgbApplicationIdentity: UByteArray = this.rgbApplicationIdentity, hSnapshot: Handle = this.hSnapshot, hDeleteFilesImpersonationToken: Handle = this.hDeleteFilesImpersonationToken, submitResultMax: WerSubmitResult = this.submitResultMax): WerReportInformationV5 = WerReportInformationV5(dwSize = dwSize, hProcessCtorArg = hProcess, wzConsentKey = wzConsentKey, wzFriendlyEventName = wzFriendlyEventName, wzApplicationName = wzApplicationName, wzApplicationPath = wzApplicationPath, wzDescription = wzDescription, hwndParentCtorArg = hwndParent, wzNamespacePartner = wzNamespacePartner, wzNamespaceGroup = wzNamespaceGroup, rgbApplicationIdentity = rgbApplicationIdentity, hSnapshotCtorArg = hSnapshot, hDeleteFilesImpersonationTokenCtorArg = hDeleteFilesImpersonationToken, submitResultMax = submitResultMax)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportInformationV5) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hProcess != other.hProcess) return false
        if (!this.wzConsentKey.contentEquals(other.wzConsentKey)) return false
        if (!this.wzFriendlyEventName.contentEquals(other.wzFriendlyEventName)) return false
        if (!this.wzApplicationName.contentEquals(other.wzApplicationName)) return false
        if (!this.wzApplicationPath.contentEquals(other.wzApplicationPath)) return false
        if (!this.wzDescription.contentEquals(other.wzDescription)) return false
        if (this.hwndParent != other.hwndParent) return false
        if (!this.wzNamespacePartner.contentEquals(other.wzNamespacePartner)) return false
        if (!this.wzNamespaceGroup.contentEquals(other.wzNamespaceGroup)) return false
        if (!this.rgbApplicationIdentity.contentEquals(other.rgbApplicationIdentity)) return false
        if (this.hSnapshot != other.hSnapshot) return false
        if (this.hDeleteFilesImpersonationToken != other.hDeleteFilesImpersonationToken) return false
        if (this.submitResultMax != other.submitResultMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.wzConsentKey.contentHashCode()
        result = 31 * result + this.wzFriendlyEventName.contentHashCode()
        result = 31 * result + this.wzApplicationName.contentHashCode()
        result = 31 * result + this.wzApplicationPath.contentHashCode()
        result = 31 * result + this.wzDescription.contentHashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.wzNamespacePartner.contentHashCode()
        result = 31 * result + this.wzNamespaceGroup.contentHashCode()
        result = 31 * result + this.rgbApplicationIdentity.contentHashCode()
        result = 31 * result + this.hSnapshot.hashCode()
        result = 31 * result + this.hDeleteFilesImpersonationToken.hashCode()
        result = 31 * result + this.submitResultMax.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hProcess: Handle = MutPtr(0L),
            wzConsentKey: UShortArray = UShortArray(64),
            wzFriendlyEventName: UShortArray = UShortArray(128),
            wzApplicationName: UShortArray = UShortArray(128),
            wzApplicationPath: UShortArray = UShortArray(260),
            wzDescription: UShortArray = UShortArray(512),
            hwndParent: Hwnd = MutPtr(0L),
            wzNamespacePartner: UShortArray = UShortArray(64),
            wzNamespaceGroup: UShortArray = UShortArray(64),
            rgbApplicationIdentity: UByteArray = UByteArray(16),
            hSnapshot: Handle = MutPtr(0L),
            hDeleteFilesImpersonationToken: Handle = MutPtr(0L),
            submitResultMax: WerSubmitResult = 0,
        ): WerReportInformationV5 =
            WerReportInformationV5(
                dwSize = dwSize,
                hProcessCtorArg = hProcess,
                wzConsentKey = wzConsentKey,
                wzFriendlyEventName = wzFriendlyEventName,
                wzApplicationName = wzApplicationName,
                wzApplicationPath = wzApplicationPath,
                wzDescription = wzDescription,
                hwndParentCtorArg = hwndParent,
                wzNamespacePartner = wzNamespacePartner,
                wzNamespaceGroup = wzNamespaceGroup,
                rgbApplicationIdentity = rgbApplicationIdentity,
                hSnapshotCtorArg = hSnapshot,
                hDeleteFilesImpersonationTokenCtorArg = hDeleteFilesImpersonationToken,
                submitResultMax = submitResultMax,
            )
    }
}

public data class WerReportMetadataV1(
    public var signature: WerReportSignature = WerReportSignature(),
    public var bucketId: Guid = Guid(),
    public var reportId: Guid = Guid(),
    public var creationTime: Filetime = Filetime(),
    public var sizeInBytes: ULong = 0uL,
)

public class WerReportMetadataV2 internal constructor(
    public var signature: WerReportSignature,
    public var bucketId: Guid,
    public var reportId: Guid,
    public var creationTime: Filetime,
    public var sizeInBytes: ULong,
    public var cabId: UShortArray,
    public var reportStatus: UInt,
    public var reportIntegratorId: Guid,
    public var numberOfFiles: UInt,
    public var sizeOfFileNames: UInt,
    fileNamesCtorArg: Pwstr,
) {
    public var fileNames: Pwstr = fileNamesCtorArg
        internal set

    public constructor() : this(
        signature = WerReportSignature(),
        bucketId = Guid(),
        reportId = Guid(),
        creationTime = Filetime(),
        sizeInBytes = 0uL,
        cabId = UShortArray(260),
        reportStatus = 0u,
        reportIntegratorId = Guid(),
        numberOfFiles = 0u,
        sizeOfFileNames = 0u,
        fileNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WerReportSignature = this.signature

    public operator fun component2(): Guid = this.bucketId

    public operator fun component3(): Guid = this.reportId

    public operator fun component4(): Filetime = this.creationTime

    public operator fun component5(): ULong = this.sizeInBytes

    public operator fun component6(): UShortArray = this.cabId

    public operator fun component7(): UInt = this.reportStatus

    public operator fun component8(): Guid = this.reportIntegratorId

    public operator fun component9(): UInt = this.numberOfFiles

    public operator fun component10(): UInt = this.sizeOfFileNames

    public operator fun component11(): Pwstr = this.fileNames

    public fun copy(signature: WerReportSignature = this.signature, bucketId: Guid = this.bucketId, reportId: Guid = this.reportId, creationTime: Filetime = this.creationTime, sizeInBytes: ULong = this.sizeInBytes, cabId: UShortArray = this.cabId, reportStatus: UInt = this.reportStatus, reportIntegratorId: Guid = this.reportIntegratorId, numberOfFiles: UInt = this.numberOfFiles, sizeOfFileNames: UInt = this.sizeOfFileNames, fileNames: Pwstr = this.fileNames): WerReportMetadataV2 = WerReportMetadataV2(signature = signature, bucketId = bucketId, reportId = reportId, creationTime = creationTime, sizeInBytes = sizeInBytes, cabId = cabId, reportStatus = reportStatus, reportIntegratorId = reportIntegratorId, numberOfFiles = numberOfFiles, sizeOfFileNames = sizeOfFileNames, fileNamesCtorArg = fileNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportMetadataV2) return false
        if (this.signature != other.signature) return false
        if (this.bucketId != other.bucketId) return false
        if (this.reportId != other.reportId) return false
        if (this.creationTime != other.creationTime) return false
        if (this.sizeInBytes != other.sizeInBytes) return false
        if (!this.cabId.contentEquals(other.cabId)) return false
        if (this.reportStatus != other.reportStatus) return false
        if (this.reportIntegratorId != other.reportIntegratorId) return false
        if (this.numberOfFiles != other.numberOfFiles) return false
        if (this.sizeOfFileNames != other.sizeOfFileNames) return false
        if (this.fileNames != other.fileNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.bucketId.hashCode()
        result = 31 * result + this.reportId.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.sizeInBytes.hashCode()
        result = 31 * result + this.cabId.contentHashCode()
        result = 31 * result + this.reportStatus.hashCode()
        result = 31 * result + this.reportIntegratorId.hashCode()
        result = 31 * result + this.numberOfFiles.hashCode()
        result = 31 * result + this.sizeOfFileNames.hashCode()
        result = 31 * result + this.fileNames.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            signature: WerReportSignature = WerReportSignature(),
            bucketId: Guid = Guid(),
            reportId: Guid = Guid(),
            creationTime: Filetime = Filetime(),
            sizeInBytes: ULong = 0uL,
            cabId: UShortArray = UShortArray(260),
            reportStatus: UInt = 0u,
            reportIntegratorId: Guid = Guid(),
            numberOfFiles: UInt = 0u,
            sizeOfFileNames: UInt = 0u,
            fileNames: Pwstr = MutPtr(0L),
        ): WerReportMetadataV2 =
            WerReportMetadataV2(
                signature = signature,
                bucketId = bucketId,
                reportId = reportId,
                creationTime = creationTime,
                sizeInBytes = sizeInBytes,
                cabId = cabId,
                reportStatus = reportStatus,
                reportIntegratorId = reportIntegratorId,
                numberOfFiles = numberOfFiles,
                sizeOfFileNames = sizeOfFileNames,
                fileNamesCtorArg = fileNames,
            )
    }
}

public class WerReportMetadataV3 internal constructor(
    public var signature: WerReportSignature,
    public var bucketId: Guid,
    public var reportId: Guid,
    public var creationTime: Filetime,
    public var sizeInBytes: ULong,
    public var cabId: UShortArray,
    public var reportStatus: UInt,
    public var reportIntegratorId: Guid,
    public var numberOfFiles: UInt,
    public var sizeOfFileNames: UInt,
    fileNamesCtorArg: Pwstr,
    public var friendlyEventName: UShortArray,
    public var applicationName: UShortArray,
    public var applicationPath: UShortArray,
    public var description: UShortArray,
    public var bucketIdString: UShortArray,
    public var legacyBucketId: ULong,
) {
    public var fileNames: Pwstr = fileNamesCtorArg
        internal set

    public constructor() : this(
        signature = WerReportSignature(),
        bucketId = Guid(),
        reportId = Guid(),
        creationTime = Filetime(),
        sizeInBytes = 0uL,
        cabId = UShortArray(260),
        reportStatus = 0u,
        reportIntegratorId = Guid(),
        numberOfFiles = 0u,
        sizeOfFileNames = 0u,
        fileNamesCtorArg = MutPtr(0L),
        friendlyEventName = UShortArray(128),
        applicationName = UShortArray(128),
        applicationPath = UShortArray(260),
        description = UShortArray(512),
        bucketIdString = UShortArray(260),
        legacyBucketId = 0uL,
    )

    public companion object {
        public operator fun invoke(
            signature: WerReportSignature = WerReportSignature(),
            bucketId: Guid = Guid(),
            reportId: Guid = Guid(),
            creationTime: Filetime = Filetime(),
            sizeInBytes: ULong = 0uL,
            cabId: UShortArray = UShortArray(260),
            reportStatus: UInt = 0u,
            reportIntegratorId: Guid = Guid(),
            numberOfFiles: UInt = 0u,
            sizeOfFileNames: UInt = 0u,
            fileNames: Pwstr = MutPtr(0L),
            friendlyEventName: UShortArray = UShortArray(128),
            applicationName: UShortArray = UShortArray(128),
            applicationPath: UShortArray = UShortArray(260),
            description: UShortArray = UShortArray(512),
            bucketIdString: UShortArray = UShortArray(260),
            legacyBucketId: ULong = 0uL,
        ): WerReportMetadataV3 =
            WerReportMetadataV3(
                signature = signature,
                bucketId = bucketId,
                reportId = reportId,
                creationTime = creationTime,
                sizeInBytes = sizeInBytes,
                cabId = cabId,
                reportStatus = reportStatus,
                reportIntegratorId = reportIntegratorId,
                numberOfFiles = numberOfFiles,
                sizeOfFileNames = sizeOfFileNames,
                fileNamesCtorArg = fileNames,
                friendlyEventName = friendlyEventName,
                applicationName = applicationName,
                applicationPath = applicationPath,
                description = description,
                bucketIdString = bucketIdString,
                legacyBucketId = legacyBucketId,
            )
    }
}

public data class WerReportParameter(
    public var name: UShortArray = UShortArray(129),
    public var value: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportParameter) return false
        if (!this.name.contentEquals(other.name)) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WerReportParameter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WerReportParameter> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 778L
                override fun readNative(addr: Long): WerReportParameter =
                    WerReportParameter(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 258L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: WerReportParameter) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                    ).writeNative(addr, value.name.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 258L, value.value.toList())
                }
            }
    }
}

public data class WerReportSignature(
    public var eventName: UShortArray = UShortArray(65),
    public var parameters: List<WerReportParameter> = List(10) { WerReportParameter() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportSignature) return false
        if (!this.eventName.contentEquals(other.eventName)) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventName.contentHashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WerReportSignature> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WerReportSignature> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 7910L
                override fun readNative(addr: Long): WerReportSignature =
                    WerReportSignature(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(WerReportParameter.typeLayout(), (10).toInt())
                        ).readNative(addr + 130L),
                    )
                override fun writeNative(addr: Long, value: WerReportSignature) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65).toInt())
                    ).writeNative(addr, value.eventName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(WerReportParameter.typeLayout(), (10).toInt())
                    ).writeNative(addr + 130L, value.parameters)
                }
            }
    }
}

public class WerRuntimeExceptionInformation internal constructor(
    public var dwSize: UInt,
    hProcessCtorArg: Handle,
    hThreadCtorArg: Handle,
    public var exceptionRecord: ExceptionRecord,
    public var context: Context,
    pwszReportIdCtorArg: Pcwstr,
    public var bIsFatal: Bool,
    public var dwReserved: UInt,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public var hThread: Handle = hThreadCtorArg
        internal set

    public var pwszReportId: Pcwstr = pwszReportIdCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hProcessCtorArg = MutPtr(0L),
        hThreadCtorArg = MutPtr(0L),
        exceptionRecord = ExceptionRecord(),
        context = Context(),
        pwszReportIdCtorArg = ConstPtr(0L),
        bIsFatal = 0,
        dwReserved = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Handle = this.hProcess

    public operator fun component3(): Handle = this.hThread

    public operator fun component4(): ExceptionRecord = this.exceptionRecord

    public operator fun component5(): Context = this.context

    public operator fun component6(): Pcwstr = this.pwszReportId

    public operator fun component7(): Bool = this.bIsFatal

    public operator fun component8(): UInt = this.dwReserved

    public fun copy(dwSize: UInt = this.dwSize, hProcess: Handle = this.hProcess, hThread: Handle = this.hThread, exceptionRecord: ExceptionRecord = this.exceptionRecord, context: Context = this.context, pwszReportId: Pcwstr = this.pwszReportId, bIsFatal: Bool = this.bIsFatal, dwReserved: UInt = this.dwReserved): WerRuntimeExceptionInformation = WerRuntimeExceptionInformation(dwSize = dwSize, hProcessCtorArg = hProcess, hThreadCtorArg = hThread, exceptionRecord = exceptionRecord, context = context, pwszReportIdCtorArg = pwszReportId, bIsFatal = bIsFatal, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerRuntimeExceptionInformation) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hProcess != other.hProcess) return false
        if (this.hThread != other.hThread) return false
        if (this.exceptionRecord != other.exceptionRecord) return false
        if (this.context != other.context) return false
        if (this.pwszReportId != other.pwszReportId) return false
        if (this.bIsFatal != other.bIsFatal) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.hThread.hashCode()
        result = 31 * result + this.exceptionRecord.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.pwszReportId.hashCode()
        result = 31 * result + this.bIsFatal.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hProcess: Handle = MutPtr(0L),
            hThread: Handle = MutPtr(0L),
            exceptionRecord: ExceptionRecord = ExceptionRecord(),
            context: Context = Context(),
            pwszReportId: Pcwstr = ConstPtr(0L),
            bIsFatal: Bool = 0,
            dwReserved: UInt = 0u,
        ): WerRuntimeExceptionInformation =
            WerRuntimeExceptionInformation(
                dwSize = dwSize,
                hProcessCtorArg = hProcess,
                hThreadCtorArg = hThread,
                exceptionRecord = exceptionRecord,
                context = context,
                pwszReportIdCtorArg = pwszReportId,
                bIsFatal = bIsFatal,
                dwReserved = dwReserved,
            )
    }
}
