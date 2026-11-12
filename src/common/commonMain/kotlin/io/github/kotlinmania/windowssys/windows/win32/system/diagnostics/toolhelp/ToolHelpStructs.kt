@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule

public class Heapentry32 internal constructor(
    public var dwSize: Int,
    hHandleCtorArg: Handle,
    public var dwAddress: Int,
    public var dwBlockSize: Int,
    public var dwFlags: Heapentry32Flags,
    public var dwLockCount: UInt,
    public var dwResvd: UInt,
    public var th32ProcessID: UInt,
    public var th32HeapID: Int,
) {
    public var hHandle: Handle = hHandleCtorArg
        internal set

    public constructor() : this(
        dwSize = 0,
        hHandleCtorArg = MutPtr(0L),
        dwAddress = 0,
        dwBlockSize = 0,
        dwFlags = 0u,
        dwLockCount = 0u,
        dwResvd = 0u,
        th32ProcessID = 0u,
        th32HeapID = 0,
    )

    public operator fun component1(): Int = this.dwSize

    public operator fun component2(): Handle = this.hHandle

    public operator fun component3(): Int = this.dwAddress

    public operator fun component4(): Int = this.dwBlockSize

    public operator fun component5(): Heapentry32Flags = this.dwFlags

    public operator fun component6(): UInt = this.dwLockCount

    public operator fun component7(): UInt = this.dwResvd

    public operator fun component8(): UInt = this.th32ProcessID

    public operator fun component9(): Int = this.th32HeapID

    public fun copy(dwSize: Int = this.dwSize, hHandle: Handle = this.hHandle, dwAddress: Int = this.dwAddress, dwBlockSize: Int = this.dwBlockSize, dwFlags: Heapentry32Flags = this.dwFlags, dwLockCount: UInt = this.dwLockCount, dwResvd: UInt = this.dwResvd, th32ProcessID: UInt = this.th32ProcessID, th32HeapID: Int = this.th32HeapID): Heapentry32 = Heapentry32(dwSize = dwSize, hHandleCtorArg = hHandle, dwAddress = dwAddress, dwBlockSize = dwBlockSize, dwFlags = dwFlags, dwLockCount = dwLockCount, dwResvd = dwResvd, th32ProcessID = th32ProcessID, th32HeapID = th32HeapID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Heapentry32) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hHandle != other.hHandle) return false
        if (this.dwAddress != other.dwAddress) return false
        if (this.dwBlockSize != other.dwBlockSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwLockCount != other.dwLockCount) return false
        if (this.dwResvd != other.dwResvd) return false
        if (this.th32ProcessID != other.th32ProcessID) return false
        if (this.th32HeapID != other.th32HeapID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hHandle.hashCode()
        result = 31 * result + this.dwAddress.hashCode()
        result = 31 * result + this.dwBlockSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwLockCount.hashCode()
        result = 31 * result + this.dwResvd.hashCode()
        result = 31 * result + this.th32ProcessID.hashCode()
        result = 31 * result + this.th32HeapID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: Int = 0,
            hHandle: Handle = MutPtr(0L),
            dwAddress: Int = 0,
            dwBlockSize: Int = 0,
            dwFlags: Heapentry32Flags = 0u,
            dwLockCount: UInt = 0u,
            dwResvd: UInt = 0u,
            th32ProcessID: UInt = 0u,
            th32HeapID: Int = 0,
        ): Heapentry32 =
            Heapentry32(
                dwSize = dwSize,
                hHandleCtorArg = hHandle,
                dwAddress = dwAddress,
                dwBlockSize = dwBlockSize,
                dwFlags = dwFlags,
                dwLockCount = dwLockCount,
                dwResvd = dwResvd,
                th32ProcessID = th32ProcessID,
                th32HeapID = th32HeapID,
            )
    }
}

public data class Heaplist32(
    public var dwSize: Int = 0,
    public var th32ProcessID: UInt = 0u,
    public var th32HeapID: Int = 0,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Heaplist32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Heaplist32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Heaplist32 =
                    Heaplist32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Heaplist32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.th32ProcessID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.th32HeapID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwFlags)
                }
            }
    }
}

public class Moduleentry32 internal constructor(
    public var dwSize: UInt,
    public var th32ModuleID: UInt,
    public var th32ProcessID: UInt,
    public var glblcntUsage: UInt,
    public var proccntUsage: UInt,
    modBaseAddrCtorArg: MutPtr<UByte>,
    public var modBaseSize: UInt,
    hModuleCtorArg: Hmodule,
    public var szModule: ByteArray,
    public var szExePath: ByteArray,
) {
    public var modBaseAddr: MutPtr<UByte> = modBaseAddrCtorArg
        internal set

    public var hModule: Hmodule = hModuleCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        th32ModuleID = 0u,
        th32ProcessID = 0u,
        glblcntUsage = 0u,
        proccntUsage = 0u,
        modBaseAddrCtorArg = MutPtr(0L),
        modBaseSize = 0u,
        hModuleCtorArg = MutPtr(0L),
        szModule = ByteArray(256),
        szExePath = ByteArray(260),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.th32ModuleID

    public operator fun component3(): UInt = this.th32ProcessID

    public operator fun component4(): UInt = this.glblcntUsage

    public operator fun component5(): UInt = this.proccntUsage

    public operator fun component6(): MutPtr<UByte> = this.modBaseAddr

    public operator fun component7(): UInt = this.modBaseSize

    public operator fun component8(): Hmodule = this.hModule

    public operator fun component9(): ByteArray = this.szModule

    public operator fun component10(): ByteArray = this.szExePath

    public fun copy(dwSize: UInt = this.dwSize, th32ModuleID: UInt = this.th32ModuleID, th32ProcessID: UInt = this.th32ProcessID, glblcntUsage: UInt = this.glblcntUsage, proccntUsage: UInt = this.proccntUsage, modBaseAddr: MutPtr<UByte> = this.modBaseAddr, modBaseSize: UInt = this.modBaseSize, hModule: Hmodule = this.hModule, szModule: ByteArray = this.szModule, szExePath: ByteArray = this.szExePath): Moduleentry32 = Moduleentry32(dwSize = dwSize, th32ModuleID = th32ModuleID, th32ProcessID = th32ProcessID, glblcntUsage = glblcntUsage, proccntUsage = proccntUsage, modBaseAddrCtorArg = modBaseAddr, modBaseSize = modBaseSize, hModuleCtorArg = hModule, szModule = szModule, szExePath = szExePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Moduleentry32) return false
        if (this.dwSize != other.dwSize) return false
        if (this.th32ModuleID != other.th32ModuleID) return false
        if (this.th32ProcessID != other.th32ProcessID) return false
        if (this.glblcntUsage != other.glblcntUsage) return false
        if (this.proccntUsage != other.proccntUsage) return false
        if (this.modBaseAddr != other.modBaseAddr) return false
        if (this.modBaseSize != other.modBaseSize) return false
        if (this.hModule != other.hModule) return false
        if (!this.szModule.contentEquals(other.szModule)) return false
        if (!this.szExePath.contentEquals(other.szExePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.th32ModuleID.hashCode()
        result = 31 * result + this.th32ProcessID.hashCode()
        result = 31 * result + this.glblcntUsage.hashCode()
        result = 31 * result + this.proccntUsage.hashCode()
        result = 31 * result + this.modBaseAddr.hashCode()
        result = 31 * result + this.modBaseSize.hashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.szModule.contentHashCode()
        result = 31 * result + this.szExePath.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            th32ModuleID: UInt = 0u,
            th32ProcessID: UInt = 0u,
            glblcntUsage: UInt = 0u,
            proccntUsage: UInt = 0u,
            modBaseAddr: MutPtr<UByte> = MutPtr(0L),
            modBaseSize: UInt = 0u,
            hModule: Hmodule = MutPtr(0L),
            szModule: ByteArray = ByteArray(256),
            szExePath: ByteArray = ByteArray(260),
        ): Moduleentry32 =
            Moduleentry32(
                dwSize = dwSize,
                th32ModuleID = th32ModuleID,
                th32ProcessID = th32ProcessID,
                glblcntUsage = glblcntUsage,
                proccntUsage = proccntUsage,
                modBaseAddrCtorArg = modBaseAddr,
                modBaseSize = modBaseSize,
                hModuleCtorArg = hModule,
                szModule = szModule,
                szExePath = szExePath,
            )
    }
}

public class Moduleentry32w internal constructor(
    public var dwSize: UInt,
    public var th32ModuleID: UInt,
    public var th32ProcessID: UInt,
    public var glblcntUsage: UInt,
    public var proccntUsage: UInt,
    modBaseAddrCtorArg: MutPtr<UByte>,
    public var modBaseSize: UInt,
    hModuleCtorArg: Hmodule,
    public var szModule: UShortArray,
    public var szExePath: UShortArray,
) {
    public var modBaseAddr: MutPtr<UByte> = modBaseAddrCtorArg
        internal set

    public var hModule: Hmodule = hModuleCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        th32ModuleID = 0u,
        th32ProcessID = 0u,
        glblcntUsage = 0u,
        proccntUsage = 0u,
        modBaseAddrCtorArg = MutPtr(0L),
        modBaseSize = 0u,
        hModuleCtorArg = MutPtr(0L),
        szModule = UShortArray(256),
        szExePath = UShortArray(260),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.th32ModuleID

    public operator fun component3(): UInt = this.th32ProcessID

    public operator fun component4(): UInt = this.glblcntUsage

    public operator fun component5(): UInt = this.proccntUsage

    public operator fun component6(): MutPtr<UByte> = this.modBaseAddr

    public operator fun component7(): UInt = this.modBaseSize

    public operator fun component8(): Hmodule = this.hModule

    public operator fun component9(): UShortArray = this.szModule

    public operator fun component10(): UShortArray = this.szExePath

    public fun copy(dwSize: UInt = this.dwSize, th32ModuleID: UInt = this.th32ModuleID, th32ProcessID: UInt = this.th32ProcessID, glblcntUsage: UInt = this.glblcntUsage, proccntUsage: UInt = this.proccntUsage, modBaseAddr: MutPtr<UByte> = this.modBaseAddr, modBaseSize: UInt = this.modBaseSize, hModule: Hmodule = this.hModule, szModule: UShortArray = this.szModule, szExePath: UShortArray = this.szExePath): Moduleentry32w = Moduleentry32w(dwSize = dwSize, th32ModuleID = th32ModuleID, th32ProcessID = th32ProcessID, glblcntUsage = glblcntUsage, proccntUsage = proccntUsage, modBaseAddrCtorArg = modBaseAddr, modBaseSize = modBaseSize, hModuleCtorArg = hModule, szModule = szModule, szExePath = szExePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Moduleentry32w) return false
        if (this.dwSize != other.dwSize) return false
        if (this.th32ModuleID != other.th32ModuleID) return false
        if (this.th32ProcessID != other.th32ProcessID) return false
        if (this.glblcntUsage != other.glblcntUsage) return false
        if (this.proccntUsage != other.proccntUsage) return false
        if (this.modBaseAddr != other.modBaseAddr) return false
        if (this.modBaseSize != other.modBaseSize) return false
        if (this.hModule != other.hModule) return false
        if (!this.szModule.contentEquals(other.szModule)) return false
        if (!this.szExePath.contentEquals(other.szExePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.th32ModuleID.hashCode()
        result = 31 * result + this.th32ProcessID.hashCode()
        result = 31 * result + this.glblcntUsage.hashCode()
        result = 31 * result + this.proccntUsage.hashCode()
        result = 31 * result + this.modBaseAddr.hashCode()
        result = 31 * result + this.modBaseSize.hashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.szModule.contentHashCode()
        result = 31 * result + this.szExePath.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            th32ModuleID: UInt = 0u,
            th32ProcessID: UInt = 0u,
            glblcntUsage: UInt = 0u,
            proccntUsage: UInt = 0u,
            modBaseAddr: MutPtr<UByte> = MutPtr(0L),
            modBaseSize: UInt = 0u,
            hModule: Hmodule = MutPtr(0L),
            szModule: UShortArray = UShortArray(256),
            szExePath: UShortArray = UShortArray(260),
        ): Moduleentry32w =
            Moduleentry32w(
                dwSize = dwSize,
                th32ModuleID = th32ModuleID,
                th32ProcessID = th32ProcessID,
                glblcntUsage = glblcntUsage,
                proccntUsage = proccntUsage,
                modBaseAddrCtorArg = modBaseAddr,
                modBaseSize = modBaseSize,
                hModuleCtorArg = hModule,
                szModule = szModule,
                szExePath = szExePath,
            )
    }
}

public data class Processentry32(
    public var dwSize: UInt = 0u,
    public var cntUsage: UInt = 0u,
    public var th32ProcessID: UInt = 0u,
    public var th32DefaultHeapID: Int = 0,
    public var th32ModuleID: UInt = 0u,
    public var cntThreads: UInt = 0u,
    public var th32ParentProcessID: UInt = 0u,
    public var pcPriClassBase: Int = 0,
    public var dwFlags: UInt = 0u,
    public var szExeFile: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Processentry32) return false
        if (this.dwSize != other.dwSize) return false
        if (this.cntUsage != other.cntUsage) return false
        if (this.th32ProcessID != other.th32ProcessID) return false
        if (this.th32DefaultHeapID != other.th32DefaultHeapID) return false
        if (this.th32ModuleID != other.th32ModuleID) return false
        if (this.cntThreads != other.cntThreads) return false
        if (this.th32ParentProcessID != other.th32ParentProcessID) return false
        if (this.pcPriClassBase != other.pcPriClassBase) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szExeFile.contentEquals(other.szExeFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.cntUsage.hashCode()
        result = 31 * result + this.th32ProcessID.hashCode()
        result = 31 * result + this.th32DefaultHeapID.hashCode()
        result = 31 * result + this.th32ModuleID.hashCode()
        result = 31 * result + this.cntThreads.hashCode()
        result = 31 * result + this.th32ParentProcessID.hashCode()
        result = 31 * result + this.pcPriClassBase.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.szExeFile.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Processentry32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Processentry32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 304L
                override fun readNative(addr: Long): Processentry32 =
                    Processentry32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 44L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Processentry32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cntUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.th32ProcessID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.th32DefaultHeapID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.th32ModuleID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cntThreads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.th32ParentProcessID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.pcPriClassBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 44L, value.szExeFile.toList())
                }
            }
    }
}

public data class Processentry32w(
    public var dwSize: UInt = 0u,
    public var cntUsage: UInt = 0u,
    public var th32ProcessID: UInt = 0u,
    public var th32DefaultHeapID: Int = 0,
    public var th32ModuleID: UInt = 0u,
    public var cntThreads: UInt = 0u,
    public var th32ParentProcessID: UInt = 0u,
    public var pcPriClassBase: Int = 0,
    public var dwFlags: UInt = 0u,
    public var szExeFile: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Processentry32w) return false
        if (this.dwSize != other.dwSize) return false
        if (this.cntUsage != other.cntUsage) return false
        if (this.th32ProcessID != other.th32ProcessID) return false
        if (this.th32DefaultHeapID != other.th32DefaultHeapID) return false
        if (this.th32ModuleID != other.th32ModuleID) return false
        if (this.cntThreads != other.cntThreads) return false
        if (this.th32ParentProcessID != other.th32ParentProcessID) return false
        if (this.pcPriClassBase != other.pcPriClassBase) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szExeFile.contentEquals(other.szExeFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.cntUsage.hashCode()
        result = 31 * result + this.th32ProcessID.hashCode()
        result = 31 * result + this.th32DefaultHeapID.hashCode()
        result = 31 * result + this.th32ModuleID.hashCode()
        result = 31 * result + this.cntThreads.hashCode()
        result = 31 * result + this.th32ParentProcessID.hashCode()
        result = 31 * result + this.pcPriClassBase.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.szExeFile.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Processentry32w> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Processentry32w> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 568L
                override fun readNative(addr: Long): Processentry32w =
                    Processentry32w(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 44L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Processentry32w) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cntUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.th32ProcessID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.th32DefaultHeapID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.th32ModuleID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cntThreads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.th32ParentProcessID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.pcPriClassBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 44L, value.szExeFile.toList())
                }
            }
    }
}

public data class Threadentry32(
    public var dwSize: UInt = 0u,
    public var cntUsage: UInt = 0u,
    public var th32ThreadID: UInt = 0u,
    public var th32OwnerProcessID: UInt = 0u,
    public var tpBasePri: Int = 0,
    public var tpDeltaPri: Int = 0,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Threadentry32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Threadentry32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Threadentry32 =
                    Threadentry32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Threadentry32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cntUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.th32ThreadID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.th32OwnerProcessID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.tpBasePri)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.tpDeltaPri)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwFlags)
                }
            }
    }
}
