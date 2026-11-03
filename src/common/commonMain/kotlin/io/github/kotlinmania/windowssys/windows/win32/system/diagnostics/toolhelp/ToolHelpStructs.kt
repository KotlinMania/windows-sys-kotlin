@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

public data class HEAPENTRY32(
    public var dwSize: ULong = 0uL,
    public var hHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var dwAddress: ULong = 0uL,
    public var dwBlockSize: ULong = 0uL,
    public var dwFlags: HEAPENTRY32_FLAGS = 0u,
    public var dwLockCount: UInt = 0u,
    public var dwResvd: UInt = 0u,
    public var th32ProcessID: UInt = 0u,
    public var th32HeapID: ULong = 0uL,
)

public data class HEAPLIST32(
    public var dwSize: ULong = 0uL,
    public var th32ProcessID: UInt = 0u,
    public var th32HeapID: ULong = 0uL,
    public var dwFlags: UInt = 0u,
)

public data class MODULEENTRY32(
    public var dwSize: UInt = 0u,
    public var th32ModuleID: UInt = 0u,
    public var th32ProcessID: UInt = 0u,
    public var GlblcntUsage: UInt = 0u,
    public var ProccntUsage: UInt = 0u,
    public var modBaseAddr: Long = 0L,
    public var modBaseSize: UInt = 0u,
    public var hModule: Foundation.HMODULE = Foundation.HMODULE(),
    public var szModule: ByteArray = ByteArray(256),
    public var szExePath: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MODULEENTRY32) return false
        if (this.dwSize != other.dwSize) return false
        if (this.th32ModuleID != other.th32ModuleID) return false
        if (this.th32ProcessID != other.th32ProcessID) return false
        if (this.GlblcntUsage != other.GlblcntUsage) return false
        if (this.ProccntUsage != other.ProccntUsage) return false
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
        result = 31 * result + this.GlblcntUsage.hashCode()
        result = 31 * result + this.ProccntUsage.hashCode()
        result = 31 * result + this.modBaseAddr.hashCode()
        result = 31 * result + this.modBaseSize.hashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.szModule.contentHashCode()
        result = 31 * result + this.szExePath.contentHashCode()
        return result
    }
}

public data class MODULEENTRY32W(
    public var dwSize: UInt = 0u,
    public var th32ModuleID: UInt = 0u,
    public var th32ProcessID: UInt = 0u,
    public var GlblcntUsage: UInt = 0u,
    public var ProccntUsage: UInt = 0u,
    public var modBaseAddr: Long = 0L,
    public var modBaseSize: UInt = 0u,
    public var hModule: Foundation.HMODULE = Foundation.HMODULE(),
    public var szModule: UShortArray = UShortArray(256),
    public var szExePath: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MODULEENTRY32W) return false
        if (this.dwSize != other.dwSize) return false
        if (this.th32ModuleID != other.th32ModuleID) return false
        if (this.th32ProcessID != other.th32ProcessID) return false
        if (this.GlblcntUsage != other.GlblcntUsage) return false
        if (this.ProccntUsage != other.ProccntUsage) return false
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
        result = 31 * result + this.GlblcntUsage.hashCode()
        result = 31 * result + this.ProccntUsage.hashCode()
        result = 31 * result + this.modBaseAddr.hashCode()
        result = 31 * result + this.modBaseSize.hashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.szModule.contentHashCode()
        result = 31 * result + this.szExePath.contentHashCode()
        return result
    }
}

public data class PROCESSENTRY32(
    public var dwSize: UInt = 0u,
    public var cntUsage: UInt = 0u,
    public var th32ProcessID: UInt = 0u,
    public var th32DefaultHeapID: ULong = 0uL,
    public var th32ModuleID: UInt = 0u,
    public var cntThreads: UInt = 0u,
    public var th32ParentProcessID: UInt = 0u,
    public var pcPriClassBase: Int = 0,
    public var dwFlags: UInt = 0u,
    public var szExeFile: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESSENTRY32) return false
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

public data class PROCESSENTRY32W(
    public var dwSize: UInt = 0u,
    public var cntUsage: UInt = 0u,
    public var th32ProcessID: UInt = 0u,
    public var th32DefaultHeapID: ULong = 0uL,
    public var th32ModuleID: UInt = 0u,
    public var cntThreads: UInt = 0u,
    public var th32ParentProcessID: UInt = 0u,
    public var pcPriClassBase: Int = 0,
    public var dwFlags: UInt = 0u,
    public var szExeFile: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESSENTRY32W) return false
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

public data class THREADENTRY32(
    public var dwSize: UInt = 0u,
    public var cntUsage: UInt = 0u,
    public var th32ThreadID: UInt = 0u,
    public var th32OwnerProcessID: UInt = 0u,
    public var tpBasePri: Int = 0,
    public var tpDeltaPri: Int = 0,
    public var dwFlags: UInt = 0u,
)
