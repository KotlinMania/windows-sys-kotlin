@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule

public data class Heapentry32(
    public var dwSize: Int = 0,
    public var hHandle: Handle = null,
    public var dwAddress: Int = 0,
    public var dwBlockSize: Int = 0,
    public var dwFlags: Heapentry32Flags = 0u,
    public var dwLockCount: UInt = 0u,
    public var dwResvd: UInt = 0u,
    public var th32ProcessID: UInt = 0u,
    public var th32HeapID: Int = 0,
)

public data class Heaplist32(
    public var dwSize: Int = 0,
    public var th32ProcessID: UInt = 0u,
    public var th32HeapID: Int = 0,
    public var dwFlags: UInt = 0u,
)

public data class Moduleentry32(
    public var dwSize: UInt = 0u,
    public var th32ModuleID: UInt = 0u,
    public var th32ProcessID: UInt = 0u,
    public var glblcntUsage: UInt = 0u,
    public var proccntUsage: UInt = 0u,
    public var modBaseAddr: COpaquePointer? = null,
    public var modBaseSize: UInt = 0u,
    public var hModule: Hmodule = null,
    public var szModule: ByteArray = ByteArray(256),
    public var szExePath: ByteArray = ByteArray(260),
) {
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
}

public data class Moduleentry32w(
    public var dwSize: UInt = 0u,
    public var th32ModuleID: UInt = 0u,
    public var th32ProcessID: UInt = 0u,
    public var glblcntUsage: UInt = 0u,
    public var proccntUsage: UInt = 0u,
    public var modBaseAddr: COpaquePointer? = null,
    public var modBaseSize: UInt = 0u,
    public var hModule: Hmodule = null,
    public var szModule: UShortArray = UShortArray(256),
    public var szExePath: UShortArray = UShortArray(260),
) {
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
}

public data class Threadentry32(
    public var dwSize: UInt = 0u,
    public var cntUsage: UInt = 0u,
    public var th32ThreadID: UInt = 0u,
    public var th32OwnerProcessID: UInt = 0u,
    public var tpBasePri: Int = 0,
    public var tpDeltaPri: Int = 0,
    public var dwFlags: UInt = 0u,
)
