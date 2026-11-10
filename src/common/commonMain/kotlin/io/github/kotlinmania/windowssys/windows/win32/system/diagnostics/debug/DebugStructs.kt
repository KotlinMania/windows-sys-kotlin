@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.VsFixedfileinfo
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ExceptionRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.memory.VirtualAllocationType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ImageFileMachine
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ProcessorArchitecture
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.time.TimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

public data class Address64(
    public var offset: ULong = 0uL,
    public var segment: UShort = 0u,
    public var mode: AddressMode = 0,
)

public data class AerBridgeDescriptorFlags(public var anonymous: AerBridgeDescriptorFlags0 = AerBridgeDescriptorFlags0(), public var asUSHORT: UShort = 0u)

public data class AerBridgeDescriptorFlags0(public var bitfield: UShort = 0u)

public data class AerEndpointDescriptorFlags(public var anonymous: AerEndpointDescriptorFlags0 = AerEndpointDescriptorFlags0(), public var asUSHORT: UShort = 0u)

public data class AerEndpointDescriptorFlags0(public var bitfield: UShort = 0u)

public data class AerRootportDescriptorFlags(public var anonymous: AerRootportDescriptorFlags0 = AerRootportDescriptorFlags0(), public var asUSHORT: UShort = 0u)

public data class AerRootportDescriptorFlags0(public var bitfield: UShort = 0u)

public data class ApcCallbackData(
    public var parameter: Int = 0,
    public var contextRecord: Context? = null,
    public var reserved0: Int = 0,
    public var reserved1: Int = 0,
)

public data class ApiVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var revision: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class Arm64NtContext(
    public var contextFlags: UInt = 0u,
    public var cpsr: UInt = 0u,
    public var anonymous: Arm64NtContext0 = Arm64NtContext0(),
    public var sp: ULong = 0uL,
    public var pc: ULong = 0uL,
    public var v: List<Arm64NtNeon128> = List(32) { Arm64NtNeon128() },
    public var fpcr: UInt = 0u,
    public var fpsr: UInt = 0u,
    public var bcr: UIntArray = UIntArray(8),
    public var bvr: ULongArray = ULongArray(8),
    public var wcr: UIntArray = UIntArray(2),
    public var wvr: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arm64NtContext) return false
        if (this.contextFlags != other.contextFlags) return false
        if (this.cpsr != other.cpsr) return false
        if (this.anonymous != other.anonymous) return false
        if (this.sp != other.sp) return false
        if (this.pc != other.pc) return false
        if (this.v != other.v) return false
        if (this.fpcr != other.fpcr) return false
        if (this.fpsr != other.fpsr) return false
        if (!this.bcr.contentEquals(other.bcr)) return false
        if (!this.bvr.contentEquals(other.bvr)) return false
        if (!this.wcr.contentEquals(other.wcr)) return false
        if (!this.wvr.contentEquals(other.wvr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.contextFlags.hashCode()
        result = 31 * result + this.cpsr.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.sp.hashCode()
        result = 31 * result + this.pc.hashCode()
        result = 31 * result + this.v.hashCode()
        result = 31 * result + this.fpcr.hashCode()
        result = 31 * result + this.fpsr.hashCode()
        result = 31 * result + this.bcr.contentHashCode()
        result = 31 * result + this.bvr.contentHashCode()
        result = 31 * result + this.wcr.contentHashCode()
        result = 31 * result + this.wvr.contentHashCode()
        return result
    }
}

public data class Arm64NtContext0(public var anonymous: Arm64NtContext00 = Arm64NtContext00(), public var x: ULongArray = ULongArray(31)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arm64NtContext0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.x.contentEquals(other.x)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.x.contentHashCode()
        return result
    }
}

public class Arm64NtContext00(
    public var x0: ULong = 0uL,
    public var x1: ULong = 0uL,
    public var x2: ULong = 0uL,
    public var x3: ULong = 0uL,
    public var x4: ULong = 0uL,
    public var x5: ULong = 0uL,
    public var x6: ULong = 0uL,
    public var x7: ULong = 0uL,
    public var x8: ULong = 0uL,
    public var x9: ULong = 0uL,
    public var x10: ULong = 0uL,
    public var x11: ULong = 0uL,
    public var x12: ULong = 0uL,
    public var x13: ULong = 0uL,
    public var x14: ULong = 0uL,
    public var x15: ULong = 0uL,
    public var x16: ULong = 0uL,
    public var x17: ULong = 0uL,
    public var x18: ULong = 0uL,
    public var x19: ULong = 0uL,
    public var x20: ULong = 0uL,
    public var x21: ULong = 0uL,
    public var x22: ULong = 0uL,
    public var x23: ULong = 0uL,
    public var x24: ULong = 0uL,
    public var x25: ULong = 0uL,
    public var x26: ULong = 0uL,
    public var x27: ULong = 0uL,
    public var x28: ULong = 0uL,
    public var fp: ULong = 0uL,
    public var lr: ULong = 0uL,
)

public data class Arm64NtNeon128(
    public var anonymous: Arm64NtNeon1280 = Arm64NtNeon1280(),
    public var d: DoubleArray = DoubleArray(2),
    public var s: FloatArray = FloatArray(4),
    public var h: UShortArray = UShortArray(8),
    public var b: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arm64NtNeon128) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.d.contentEquals(other.d)) return false
        if (!this.s.contentEquals(other.s)) return false
        if (!this.h.contentEquals(other.h)) return false
        if (!this.b.contentEquals(other.b)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.d.contentHashCode()
        result = 31 * result + this.s.contentHashCode()
        result = 31 * result + this.h.contentHashCode()
        result = 31 * result + this.b.contentHashCode()
        return result
    }
}

public data class Arm64NtNeon1280(public var low: ULong = 0uL, public var high: Long = 0L)

public class Context(
    public var p1Home: ULong = 0uL,
    public var p2Home: ULong = 0uL,
    public var p3Home: ULong = 0uL,
    public var p4Home: ULong = 0uL,
    public var p5Home: ULong = 0uL,
    public var p6Home: ULong = 0uL,
    public var contextFlags: ContextFlags = 0u,
    public var mxCsr: UInt = 0u,
    public var segCs: UShort = 0u,
    public var segDs: UShort = 0u,
    public var segEs: UShort = 0u,
    public var segFs: UShort = 0u,
    public var segGs: UShort = 0u,
    public var segSs: UShort = 0u,
    public var eFlags: UInt = 0u,
    public var dr0: ULong = 0uL,
    public var dr1: ULong = 0uL,
    public var dr2: ULong = 0uL,
    public var dr3: ULong = 0uL,
    public var dr6: ULong = 0uL,
    public var dr7: ULong = 0uL,
    public var rax: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rsp: ULong = 0uL,
    public var rbp: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var r9: ULong = 0uL,
    public var r10: ULong = 0uL,
    public var r11: ULong = 0uL,
    public var r12: ULong = 0uL,
    public var r13: ULong = 0uL,
    public var r14: ULong = 0uL,
    public var r15: ULong = 0uL,
    public var rip: ULong = 0uL,
    public var anonymous: Context0 = Context0(),
    public var vectorRegister: List<M128a> = List(26) { M128a() },
    public var vectorControl: ULong = 0uL,
    public var debugControl: ULong = 0uL,
    public var lastBranchToRip: ULong = 0uL,
    public var lastBranchFromRip: ULong = 0uL,
    public var lastExceptionToRip: ULong = 0uL,
    public var lastExceptionFromRip: ULong = 0uL,
)

public data class Context0(public var fltSave: XsaveFormat = XsaveFormat(), public var anonymous: Context00 = Context00())

public class Context00(
    public var header: List<M128a> = List(2) { M128a() },
    public var legacy: List<M128a> = List(8) { M128a() },
    public var xmm0: M128a = M128a(),
    public var xmm1: M128a = M128a(),
    public var xmm2: M128a = M128a(),
    public var xmm3: M128a = M128a(),
    public var xmm4: M128a = M128a(),
    public var xmm5: M128a = M128a(),
    public var xmm6: M128a = M128a(),
    public var xmm7: M128a = M128a(),
    public var xmm8: M128a = M128a(),
    public var xmm9: M128a = M128a(),
    public var xmm10: M128a = M128a(),
    public var xmm11: M128a = M128a(),
    public var xmm12: M128a = M128a(),
    public var xmm13: M128a = M128a(),
    public var xmm14: M128a = M128a(),
    public var xmm15: M128a = M128a(),
)

public data class CpuInformation(public var x86CpuInfo: CpuInformation0 = CpuInformation0(), public var otherCpuInfo: CpuInformation1 = CpuInformation1())

public data class CpuInformation1(public var processorFeatures: ULongArray = ULongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuInformation1) return false
        if (!this.processorFeatures.contentEquals(other.processorFeatures)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.processorFeatures.contentHashCode()
    }
}

public data class CpuInformation0(
    public var vendorId: UIntArray = UIntArray(3),
    public var versionInformation: UInt = 0u,
    public var featureInformation: UInt = 0u,
    public var aMDExtendedCpuFeatures: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuInformation0) return false
        if (!this.vendorId.contentEquals(other.vendorId)) return false
        if (this.versionInformation != other.versionInformation) return false
        if (this.featureInformation != other.featureInformation) return false
        if (this.aMDExtendedCpuFeatures != other.aMDExtendedCpuFeatures) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vendorId.contentHashCode()
        result = 31 * result + this.versionInformation.hashCode()
        result = 31 * result + this.featureInformation.hashCode()
        result = 31 * result + this.aMDExtendedCpuFeatures.hashCode()
        return result
    }
}

public data class CreateProcessDebugInfo(
    public var hFile: Handle = null,
    public var hProcess: Handle = null,
    public var hThread: Handle = null,
    public var lpBaseOfImage: COpaquePointer? = null,
    public var dwDebugInfoFileOffset: UInt = 0u,
    public var nDebugInfoSize: UInt = 0u,
    public var lpThreadLocalBase: COpaquePointer? = null,
    public var lpStartAddress: LpthreadStartRoutine = null,
    public var lpImageName: COpaquePointer? = null,
    public var fUnicode: UShort = 0u,
)

public data class CreateThreadDebugInfo(
    public var hThread: Handle = null,
    public var lpThreadLocalBase: COpaquePointer? = null,
    public var lpStartAddress: LpthreadStartRoutine = null,
)

public data class DbghelpDataReportStruct(public var pBinPathNonExist: Pcwstr = null, public var pSymbolPathNonExist: Pcwstr = null)

public data class DebugEvent(
    public var dwDebugEventCode: DebugEventCode = 0u,
    public var dwProcessId: UInt = 0u,
    public var dwThreadId: UInt = 0u,
    public var u: DebugEvent0 = DebugEvent0(),
)

public data class DebugEvent0(
    public var exception: ExceptionDebugInfo = ExceptionDebugInfo(),
    public var createThread: CreateThreadDebugInfo = CreateThreadDebugInfo(),
    public var createProcessInfo: CreateProcessDebugInfo = CreateProcessDebugInfo(),
    public var exitThread: ExitThreadDebugInfo = ExitThreadDebugInfo(),
    public var exitProcess: ExitProcessDebugInfo = ExitProcessDebugInfo(),
    public var loadDll: LoadDllDebugInfo = LoadDllDebugInfo(),
    public var unloadDll: UnloadDllDebugInfo = UnloadDllDebugInfo(),
    public var debugString: OutputDebugStringInfo = OutputDebugStringInfo(),
    public var ripInfo: RipInfo = RipInfo(),
)

public data class DispatcherContext(
    public var controlPc: ULong = 0uL,
    public var imageBase: ULong = 0uL,
    public var functionEntry: ImageRuntimeFunctionEntry? = null,
    public var establisherFrame: ULong = 0uL,
    public var targetIp: ULong = 0uL,
    public var contextRecord: Context? = null,
    public var languageHandler: ExceptionRoutine = null,
    public var handlerData: COpaquePointer? = null,
    public var historyTable: UnwindHistoryTable? = null,
    public var scopeIndex: UInt = 0u,
    public var fill0: UInt = 0u,
)

public data class DumpFileAttributes(public var anonymous: DumpFileAttributes0 = DumpFileAttributes0(), public var attributes: UInt = 0u)

public data class DumpFileAttributes0(public var bitfield: UInt = 0u)

public class DumpHeader32(
    public var signature: UInt = 0u,
    public var validDump: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var directoryTableBase: UInt = 0u,
    public var pfnDataBase: UInt = 0u,
    public var psLoadedModuleList: UInt = 0u,
    public var psActiveProcessHead: UInt = 0u,
    public var machineImageType: UInt = 0u,
    public var numberProcessors: UInt = 0u,
    public var bugCheckCode: UInt = 0u,
    public var bugCheckParameter1: UInt = 0u,
    public var bugCheckParameter2: UInt = 0u,
    public var bugCheckParameter3: UInt = 0u,
    public var bugCheckParameter4: UInt = 0u,
    public var versionUser: ByteArray = ByteArray(32),
    public var paeEnabled: UByte = 0u,
    public var kdSecondaryVersion: UByte = 0u,
    public var spare3: UByteArray = UByteArray(2),
    public var kdDebuggerDataBlock: UInt = 0u,
    public var anonymous: DumpHeader320 = DumpHeader320(),
    public var contextRecord: UByteArray = UByteArray(1200),
    public var exception: ExceptionRecord32 = ExceptionRecord32(),
    public var comment: ByteArray = ByteArray(128),
    public var attributes: DumpFileAttributes = DumpFileAttributes(),
    public var bootId: UInt = 0u,
    public var reserved0: UByteArray = UByteArray(1760),
    public var dumpType: UInt = 0u,
    public var miniDumpFields: UInt = 0u,
    public var secondaryDataState: UInt = 0u,
    public var productType: UInt = 0u,
    public var suiteMask: UInt = 0u,
    public var writerStatus: UInt = 0u,
    public var requiredDumpSpace: Long = 0L,
    public var reserved2: UByteArray = UByteArray(16),
    public var systemUpTime: Long = 0L,
    public var systemTime: Long = 0L,
    public var reserved3: UByteArray = UByteArray(56),
)

public data class DumpHeader320(public var physicalMemoryBlock: PhysicalMemoryDescriptor32 = PhysicalMemoryDescriptor32(), public var physicalMemoryBlockBuffer: UByteArray = UByteArray(700)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpHeader320) return false
        if (this.physicalMemoryBlock != other.physicalMemoryBlock) return false
        if (!this.physicalMemoryBlockBuffer.contentEquals(other.physicalMemoryBlockBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMemoryBlock.hashCode()
        result = 31 * result + this.physicalMemoryBlockBuffer.contentHashCode()
        return result
    }
}

public class DumpHeader64(
    public var signature: UInt = 0u,
    public var validDump: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var directoryTableBase: ULong = 0uL,
    public var pfnDataBase: ULong = 0uL,
    public var psLoadedModuleList: ULong = 0uL,
    public var psActiveProcessHead: ULong = 0uL,
    public var machineImageType: UInt = 0u,
    public var numberProcessors: UInt = 0u,
    public var bugCheckCode: UInt = 0u,
    public var bugCheckParameter1: ULong = 0uL,
    public var bugCheckParameter2: ULong = 0uL,
    public var bugCheckParameter3: ULong = 0uL,
    public var bugCheckParameter4: ULong = 0uL,
    public var versionUser: ByteArray = ByteArray(32),
    public var kdDebuggerDataBlock: ULong = 0uL,
    public var anonymous: DumpHeader640 = DumpHeader640(),
    public var contextRecord: UByteArray = UByteArray(3000),
    public var exception: ExceptionRecord64 = ExceptionRecord64(),
    public var dumpType: UInt = 0u,
    public var requiredDumpSpace: Long = 0L,
    public var systemTime: Long = 0L,
    public var comment: ByteArray = ByteArray(128),
    public var systemUpTime: Long = 0L,
    public var miniDumpFields: UInt = 0u,
    public var secondaryDataState: UInt = 0u,
    public var productType: UInt = 0u,
    public var suiteMask: UInt = 0u,
    public var writerStatus: UInt = 0u,
    public var unused1: UByte = 0u,
    public var kdSecondaryVersion: UByte = 0u,
    public var unused: UByteArray = UByteArray(2),
    public var attributes: DumpFileAttributes = DumpFileAttributes(),
    public var bootId: UInt = 0u,
    public var reserved0: UByteArray = UByteArray(4008),
)

public data class DumpHeader640(public var physicalMemoryBlock: PhysicalMemoryDescriptor64 = PhysicalMemoryDescriptor64(), public var physicalMemoryBlockBuffer: UByteArray = UByteArray(700)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpHeader640) return false
        if (this.physicalMemoryBlock != other.physicalMemoryBlock) return false
        if (!this.physicalMemoryBlockBuffer.contentEquals(other.physicalMemoryBlockBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMemoryBlock.hashCode()
        result = 31 * result + this.physicalMemoryBlockBuffer.contentHashCode()
        return result
    }
}

public data class DebugPropertyInfo(
    public var mDwValidFields: UInt = 0u,
    public var mBstrName: Bstr = null,
    public var mBstrType: Bstr = null,
    public var mBstrValue: Bstr = null,
    public var mBstrFullName: Bstr = null,
    public var mDwAttrib: UInt = 0u,
    public var mPDebugProp: COpaquePointer? = null,
)

public data class ExceptionDebugInfo(public var exceptionRecord: ExceptionRecord = ExceptionRecord(), public var dwFirstChance: UInt = 0u)

public data class ExceptionPointers(public var exceptionRecord: ExceptionRecord? = null, public var contextRecord: Context? = null)

public data class ExceptionRecord(
    public var exceptionCode: Ntstatus = 0,
    public var exceptionFlags: UInt = 0u,
    public var exceptionRecord: ExceptionRecord? = null,
    public var exceptionAddress: COpaquePointer? = null,
    public var numberParameters: UInt = 0u,
    public var exceptionInformation: IntArray = IntArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExceptionRecord) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.exceptionFlags != other.exceptionFlags) return false
        if (this.exceptionRecord != other.exceptionRecord) return false
        if (this.exceptionAddress != other.exceptionAddress) return false
        if (this.numberParameters != other.numberParameters) return false
        if (!this.exceptionInformation.contentEquals(other.exceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCode.hashCode()
        result = 31 * result + this.exceptionFlags.hashCode()
        result = 31 * result + this.exceptionRecord.hashCode()
        result = 31 * result + this.exceptionAddress.hashCode()
        result = 31 * result + this.numberParameters.hashCode()
        result = 31 * result + this.exceptionInformation.contentHashCode()
        return result
    }
}

public data class ExceptionRecord32(
    public var exceptionCode: Ntstatus = 0,
    public var exceptionFlags: UInt = 0u,
    public var exceptionRecord: UInt = 0u,
    public var exceptionAddress: UInt = 0u,
    public var numberParameters: UInt = 0u,
    public var exceptionInformation: UIntArray = UIntArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExceptionRecord32) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.exceptionFlags != other.exceptionFlags) return false
        if (this.exceptionRecord != other.exceptionRecord) return false
        if (this.exceptionAddress != other.exceptionAddress) return false
        if (this.numberParameters != other.numberParameters) return false
        if (!this.exceptionInformation.contentEquals(other.exceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCode.hashCode()
        result = 31 * result + this.exceptionFlags.hashCode()
        result = 31 * result + this.exceptionRecord.hashCode()
        result = 31 * result + this.exceptionAddress.hashCode()
        result = 31 * result + this.numberParameters.hashCode()
        result = 31 * result + this.exceptionInformation.contentHashCode()
        return result
    }
}

public data class ExceptionRecord64(
    public var exceptionCode: Ntstatus = 0,
    public var exceptionFlags: UInt = 0u,
    public var exceptionRecord: ULong = 0uL,
    public var exceptionAddress: ULong = 0uL,
    public var numberParameters: UInt = 0u,
    public var unusedAlignment: UInt = 0u,
    public var exceptionInformation: ULongArray = ULongArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExceptionRecord64) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.exceptionFlags != other.exceptionFlags) return false
        if (this.exceptionRecord != other.exceptionRecord) return false
        if (this.exceptionAddress != other.exceptionAddress) return false
        if (this.numberParameters != other.numberParameters) return false
        if (this.unusedAlignment != other.unusedAlignment) return false
        if (!this.exceptionInformation.contentEquals(other.exceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCode.hashCode()
        result = 31 * result + this.exceptionFlags.hashCode()
        result = 31 * result + this.exceptionRecord.hashCode()
        result = 31 * result + this.exceptionAddress.hashCode()
        result = 31 * result + this.numberParameters.hashCode()
        result = 31 * result + this.unusedAlignment.hashCode()
        result = 31 * result + this.exceptionInformation.contentHashCode()
        return result
    }
}

public data class ExitProcessDebugInfo(public var dwExitCode: UInt = 0u)

public data class ExitThreadDebugInfo(public var dwExitCode: UInt = 0u)

public data class ExtendedDebugPropertyInfo(
    public var dwValidFields: UInt = 0u,
    public var pszName: Pwstr = null,
    public var pszType: Pwstr = null,
    public var pszValue: Pwstr = null,
    public var pszFullName: Pwstr = null,
    public var dwAttrib: UInt = 0u,
    public var pDebugProp: COpaquePointer? = null,
    public var nDISPID: UInt = 0u,
    public var nType: UInt = 0u,
    public var varValue: Variant = Variant(),
    public var plbValue: COpaquePointer? = null,
    public var pDebugExtProp: COpaquePointer? = null,
)

public data class FpoData(
    public var ulOffStart: UInt = 0u,
    public var cbProcSize: UInt = 0u,
    public var cdwLocals: UInt = 0u,
    public var cdwParams: UShort = 0u,
    public var bitfield: UShort = 0u,
)

public data class ImagehlpCbaEvent(
    public var severity: ImagehlpCbaEventSeverity = 0u,
    public var code: UInt = 0u,
    public var desc: Pstr = null,
    public var obj: COpaquePointer? = null,
)

public data class ImagehlpCbaEventw(
    public var severity: ImagehlpCbaEventSeverity = 0u,
    public var code: UInt = 0u,
    public var desc: Pcwstr = null,
    public var obj: COpaquePointer? = null,
)

public data class ImagehlpCbaReadMemory(
    public var addr: ULong = 0uL,
    public var buf: COpaquePointer? = null,
    public var bytes: UInt = 0u,
    public var bytesread: UInt? = null,
)

public data class ImagehlpDeferredSymbolLoad64(
    public var sizeOfStruct: UInt = 0u,
    public var baseOfImage: ULong = 0uL,
    public var checkSum: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var fileName: ByteArray = ByteArray(260),
    public var reparse: Boolean = false,
    public var hFile: Handle = null,
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpDeferredSymbolLoad64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.baseOfImage != other.baseOfImage) return false
        if (this.checkSum != other.checkSum) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.reparse != other.reparse) return false
        if (this.hFile != other.hFile) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.baseOfImage.hashCode()
        result = 31 * result + this.checkSum.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.reparse.hashCode()
        result = 31 * result + this.hFile.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class ImagehlpDeferredSymbolLoadw64(
    public var sizeOfStruct: UInt = 0u,
    public var baseOfImage: ULong = 0uL,
    public var checkSum: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var fileName: UShortArray = UShortArray(261),
    public var reparse: Boolean = false,
    public var hFile: Handle = null,
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpDeferredSymbolLoadw64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.baseOfImage != other.baseOfImage) return false
        if (this.checkSum != other.checkSum) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.reparse != other.reparse) return false
        if (this.hFile != other.hFile) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.baseOfImage.hashCode()
        result = 31 * result + this.checkSum.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.reparse.hashCode()
        result = 31 * result + this.hFile.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class ImagehlpDuplicateSymbol64(
    public var sizeOfStruct: UInt = 0u,
    public var numberOfDups: UInt = 0u,
    public var symbol: ImagehlpSymbol64? = null,
    public var selectedSymbol: UInt = 0u,
)

public class ImagehlpGetTypeInfoParams(
    public var sizeOfStruct: UInt = 0u,
    public var flags: ImagehlpGetTypeInfoFlags = 0u,
    public var numIds: UInt = 0u,
    public var typeIds: UInt? = null,
    public var tagFilter: ULong = 0uL,
    public var numReqs: UInt = 0u,
    public var reqKinds: Int? = null,
    public var reqOffsets: Int? = null,
    public var reqSizes: UInt? = null,
    public var reqStride: Int = 0,
    public var bufferSize: Int = 0,
    public var buffer: COpaquePointer? = null,
    public var entriesMatched: UInt = 0u,
    public var entriesFilled: UInt = 0u,
    public var tagsFound: ULong = 0uL,
    public var allReqsValid: ULong = 0uL,
    public var numReqsValid: UInt = 0u,
    public var reqsValid: ULong? = null,
)

public data class ImagehlpJitSymbolmap(
    public var sizeOfStruct: UInt = 0u,
    public var address: ULong = 0uL,
    public var baseOfImage: ULong = 0uL,
)

public data class ImagehlpLine64(
    public var sizeOfStruct: UInt = 0u,
    public var key: COpaquePointer? = null,
    public var lineNumber: UInt = 0u,
    public var fileName: Pstr = null,
    public var address: ULong = 0uL,
)

public data class ImagehlpLinew64(
    public var sizeOfStruct: UInt = 0u,
    public var key: COpaquePointer? = null,
    public var lineNumber: UInt = 0u,
    public var fileName: Pwstr = null,
    public var address: ULong = 0uL,
)

public class ImagehlpModule64(
    public var sizeOfStruct: UInt = 0u,
    public var baseOfImage: ULong = 0uL,
    public var imageSize: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var numSyms: UInt = 0u,
    public var symType: SymType = 0,
    public var moduleName: ByteArray = ByteArray(32),
    public var imageName: ByteArray = ByteArray(256),
    public var loadedImageName: ByteArray = ByteArray(256),
    public var loadedPdbName: ByteArray = ByteArray(256),
    public var cVSig: UInt = 0u,
    public var cVData: ByteArray = ByteArray(780),
    public var pdbSig: UInt = 0u,
    public var pdbSig70: Guid = Guid(),
    public var pdbAge: UInt = 0u,
    public var pdbUnmatched: Bool = 0,
    public var dbgUnmatched: Bool = 0,
    public var lineNumbers: Bool = 0,
    public var globalSymbols: Bool = 0,
    public var typeInfo: Bool = 0,
    public var sourceIndexed: Bool = 0,
    public var publics: Bool = 0,
    public var machineType: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class ImagehlpModule64Ex(public var module: ImagehlpModule64 = ImagehlpModule64(), public var regionFlags: UInt = 0u)

public class ImagehlpModulew64(
    public var sizeOfStruct: UInt = 0u,
    public var baseOfImage: ULong = 0uL,
    public var imageSize: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var numSyms: UInt = 0u,
    public var symType: SymType = 0,
    public var moduleName: UShortArray = UShortArray(32),
    public var imageName: UShortArray = UShortArray(256),
    public var loadedImageName: UShortArray = UShortArray(256),
    public var loadedPdbName: UShortArray = UShortArray(256),
    public var cVSig: UInt = 0u,
    public var cVData: UShortArray = UShortArray(780),
    public var pdbSig: UInt = 0u,
    public var pdbSig70: Guid = Guid(),
    public var pdbAge: UInt = 0u,
    public var pdbUnmatched: Bool = 0,
    public var dbgUnmatched: Bool = 0,
    public var lineNumbers: Bool = 0,
    public var globalSymbols: Bool = 0,
    public var typeInfo: Bool = 0,
    public var sourceIndexed: Bool = 0,
    public var publics: Bool = 0,
    public var machineType: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class ImagehlpModulew64Ex(public var module: ImagehlpModulew64 = ImagehlpModulew64(), public var regionFlags: UInt = 0u)

public data class ImagehlpStackFrame(
    public var instructionOffset: ULong = 0uL,
    public var returnOffset: ULong = 0uL,
    public var frameOffset: ULong = 0uL,
    public var stackOffset: ULong = 0uL,
    public var backingStoreOffset: ULong = 0uL,
    public var funcTableEntry: ULong = 0uL,
    public var params: ULongArray = ULongArray(4),
    public var reserved: ULongArray = ULongArray(5),
    public var virtual: Bool = 0,
    public var reserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpStackFrame) return false
        if (this.instructionOffset != other.instructionOffset) return false
        if (this.returnOffset != other.returnOffset) return false
        if (this.frameOffset != other.frameOffset) return false
        if (this.stackOffset != other.stackOffset) return false
        if (this.backingStoreOffset != other.backingStoreOffset) return false
        if (this.funcTableEntry != other.funcTableEntry) return false
        if (!this.params.contentEquals(other.params)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.virtual != other.virtual) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionOffset.hashCode()
        result = 31 * result + this.returnOffset.hashCode()
        result = 31 * result + this.frameOffset.hashCode()
        result = 31 * result + this.stackOffset.hashCode()
        result = 31 * result + this.backingStoreOffset.hashCode()
        result = 31 * result + this.funcTableEntry.hashCode()
        result = 31 * result + this.params.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.virtual.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }
}

public data class ImagehlpSymbol64(
    public var sizeOfStruct: UInt = 0u,
    public var address: ULong = 0uL,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var maxNameLength: UInt = 0u,
    public var name: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpSymbol64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.address != other.address) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.maxNameLength != other.maxNameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxNameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class ImagehlpSymbol64Package(public var sym: ImagehlpSymbol64 = ImagehlpSymbol64(), public var name: ByteArray = ByteArray(2001)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpSymbol64Package) return false
        if (this.sym != other.sym) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sym.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class ImagehlpSymbolw64(
    public var sizeOfStruct: UInt = 0u,
    public var address: ULong = 0uL,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var maxNameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpSymbolw64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.address != other.address) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.maxNameLength != other.maxNameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxNameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class ImagehlpSymbolw64Package(public var sym: ImagehlpSymbolw64 = ImagehlpSymbolw64(), public var name: UShortArray = UShortArray(2001)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpSymbolw64Package) return false
        if (this.sym != other.sym) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sym.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class ImagehlpSymbolSrc(
    public var sizeofstruct: UInt = 0u,
    public var type: UInt = 0u,
    public var file: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpSymbolSrc) return false
        if (this.sizeofstruct != other.sizeofstruct) return false
        if (this.type != other.type) return false
        if (!this.file.contentEquals(other.file)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofstruct.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.file.contentHashCode()
        return result
    }
}

public data class ImageArm64RuntimeFunctionEntry(public var beginAddress: UInt = 0u, public var anonymous: ImageArm64RuntimeFunctionEntry0 = ImageArm64RuntimeFunctionEntry0())

public data class ImageArm64RuntimeFunctionEntry0(public var unwindData: UInt = 0u, public var anonymous: ImageArm64RuntimeFunctionEntry00 = ImageArm64RuntimeFunctionEntry00())

public data class ImageArm64RuntimeFunctionEntry00(public var bitfield: UInt = 0u)

public data class ImageCoffSymbolsHeader(
    public var numberOfSymbols: UInt = 0u,
    public var lvaToFirstSymbol: UInt = 0u,
    public var numberOfLinenumbers: UInt = 0u,
    public var lvaToFirstLinenumber: UInt = 0u,
    public var rvaToFirstByteOfCode: UInt = 0u,
    public var rvaToLastByteOfCode: UInt = 0u,
    public var rvaToFirstByteOfData: UInt = 0u,
    public var rvaToLastByteOfData: UInt = 0u,
)

public data class ImageCor20Header(
    public var cb: UInt = 0u,
    public var majorRuntimeVersion: UShort = 0u,
    public var minorRuntimeVersion: UShort = 0u,
    public var metaData: ImageDataDirectory = ImageDataDirectory(),
    public var flags: UInt = 0u,
    public var anonymous: ImageCor20Header0 = ImageCor20Header0(),
    public var resources: ImageDataDirectory = ImageDataDirectory(),
    public var strongNameSignature: ImageDataDirectory = ImageDataDirectory(),
    public var codeManagerTable: ImageDataDirectory = ImageDataDirectory(),
    public var vTableFixups: ImageDataDirectory = ImageDataDirectory(),
    public var exportAddressTableJumps: ImageDataDirectory = ImageDataDirectory(),
    public var managedNativeHeader: ImageDataDirectory = ImageDataDirectory(),
)

public data class ImageCor20Header0(public var entryPointToken: UInt = 0u, public var entryPointRVA: UInt = 0u)

public data class ImageDataDirectory(public var virtualAddress: UInt = 0u, public var size: UInt = 0u)

public data class ImageDebugDirectory(
    public var characteristics: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var type: ImageDebugType = 0u,
    public var sizeOfData: UInt = 0u,
    public var addressOfRawData: UInt = 0u,
    public var pointerToRawData: UInt = 0u,
)

public data class ImageFileHeader(
    public var machine: ImageFileMachine = 0u,
    public var numberOfSections: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var pointerToSymbolTable: UInt = 0u,
    public var numberOfSymbols: UInt = 0u,
    public var sizeOfOptionalHeader: UShort = 0u,
    public var characteristics: ImageFileCharacteristics = 0u,
)

public data class ImageFunctionEntry(
    public var startingAddress: UInt = 0u,
    public var endingAddress: UInt = 0u,
    public var endOfPrologue: UInt = 0u,
)

public data class ImageFunctionEntry64(
    public var startingAddress: ULong = 0uL,
    public var endingAddress: ULong = 0uL,
    public var anonymous: ImageFunctionEntry640 = ImageFunctionEntry640(),
)

public data class ImageFunctionEntry640(public var endOfPrologue: ULong = 0uL, public var unwindInfoAddress: ULong = 0uL)

public data class ImageLoadConfigCodeIntegrity(
    public var flags: UShort = 0u,
    public var catalog: UShort = 0u,
    public var catalogOffset: UInt = 0u,
    public var reserved: UInt = 0u,
)

public class ImageLoadConfigDirectory32(
    public var size: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var globalFlagsClear: UInt = 0u,
    public var globalFlagsSet: UInt = 0u,
    public var criticalSectionDefaultTimeout: UInt = 0u,
    public var deCommitFreeBlockThreshold: UInt = 0u,
    public var deCommitTotalFreeThreshold: UInt = 0u,
    public var lockPrefixTable: UInt = 0u,
    public var maximumAllocationSize: UInt = 0u,
    public var virtualMemoryThreshold: UInt = 0u,
    public var processHeapFlags: UInt = 0u,
    public var processAffinityMask: UInt = 0u,
    public var cSDVersion: UShort = 0u,
    public var dependentLoadFlags: UShort = 0u,
    public var editList: UInt = 0u,
    public var securityCookie: UInt = 0u,
    public var sEHandlerTable: UInt = 0u,
    public var sEHandlerCount: UInt = 0u,
    public var guardCFCheckFunctionPointer: UInt = 0u,
    public var guardCFDispatchFunctionPointer: UInt = 0u,
    public var guardCFFunctionTable: UInt = 0u,
    public var guardCFFunctionCount: UInt = 0u,
    public var guardFlags: UInt = 0u,
    public var codeIntegrity: ImageLoadConfigCodeIntegrity = ImageLoadConfigCodeIntegrity(),
    public var guardAddressTakenIatEntryTable: UInt = 0u,
    public var guardAddressTakenIatEntryCount: UInt = 0u,
    public var guardLongJumpTargetTable: UInt = 0u,
    public var guardLongJumpTargetCount: UInt = 0u,
    public var dynamicValueRelocTable: UInt = 0u,
    public var cHPEMetadataPointer: UInt = 0u,
    public var guardRFFailureRoutine: UInt = 0u,
    public var guardRFFailureRoutineFunctionPointer: UInt = 0u,
    public var dynamicValueRelocTableOffset: UInt = 0u,
    public var dynamicValueRelocTableSection: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var guardRFVerifyStackPointerFunctionPointer: UInt = 0u,
    public var hotPatchTableOffset: UInt = 0u,
    public var reserved3: UInt = 0u,
    public var enclaveConfigurationPointer: UInt = 0u,
    public var volatileMetadataPointer: UInt = 0u,
    public var guardEHContinuationTable: UInt = 0u,
    public var guardEHContinuationCount: UInt = 0u,
    public var guardXFGCheckFunctionPointer: UInt = 0u,
    public var guardXFGDispatchFunctionPointer: UInt = 0u,
    public var guardXFGTableDispatchFunctionPointer: UInt = 0u,
    public var castGuardOsDeterminedFailureMode: UInt = 0u,
    public var guardMemcpyFunctionPointer: UInt = 0u,
)

public class ImageLoadConfigDirectory64(
    public var size: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var globalFlagsClear: UInt = 0u,
    public var globalFlagsSet: UInt = 0u,
    public var criticalSectionDefaultTimeout: UInt = 0u,
    public var deCommitFreeBlockThreshold: ULong = 0uL,
    public var deCommitTotalFreeThreshold: ULong = 0uL,
    public var lockPrefixTable: ULong = 0uL,
    public var maximumAllocationSize: ULong = 0uL,
    public var virtualMemoryThreshold: ULong = 0uL,
    public var processAffinityMask: ULong = 0uL,
    public var processHeapFlags: UInt = 0u,
    public var cSDVersion: UShort = 0u,
    public var dependentLoadFlags: UShort = 0u,
    public var editList: ULong = 0uL,
    public var securityCookie: ULong = 0uL,
    public var sEHandlerTable: ULong = 0uL,
    public var sEHandlerCount: ULong = 0uL,
    public var guardCFCheckFunctionPointer: ULong = 0uL,
    public var guardCFDispatchFunctionPointer: ULong = 0uL,
    public var guardCFFunctionTable: ULong = 0uL,
    public var guardCFFunctionCount: ULong = 0uL,
    public var guardFlags: UInt = 0u,
    public var codeIntegrity: ImageLoadConfigCodeIntegrity = ImageLoadConfigCodeIntegrity(),
    public var guardAddressTakenIatEntryTable: ULong = 0uL,
    public var guardAddressTakenIatEntryCount: ULong = 0uL,
    public var guardLongJumpTargetTable: ULong = 0uL,
    public var guardLongJumpTargetCount: ULong = 0uL,
    public var dynamicValueRelocTable: ULong = 0uL,
    public var cHPEMetadataPointer: ULong = 0uL,
    public var guardRFFailureRoutine: ULong = 0uL,
    public var guardRFFailureRoutineFunctionPointer: ULong = 0uL,
    public var dynamicValueRelocTableOffset: UInt = 0u,
    public var dynamicValueRelocTableSection: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var guardRFVerifyStackPointerFunctionPointer: ULong = 0uL,
    public var hotPatchTableOffset: UInt = 0u,
    public var reserved3: UInt = 0u,
    public var enclaveConfigurationPointer: ULong = 0uL,
    public var volatileMetadataPointer: ULong = 0uL,
    public var guardEHContinuationTable: ULong = 0uL,
    public var guardEHContinuationCount: ULong = 0uL,
    public var guardXFGCheckFunctionPointer: ULong = 0uL,
    public var guardXFGDispatchFunctionPointer: ULong = 0uL,
    public var guardXFGTableDispatchFunctionPointer: ULong = 0uL,
    public var castGuardOsDeterminedFailureMode: ULong = 0uL,
    public var guardMemcpyFunctionPointer: ULong = 0uL,
)

public data class ImageNtHeaders32(
    public var signature: UInt = 0u,
    public var fileHeader: ImageFileHeader = ImageFileHeader(),
    public var optionalHeader: ImageOptionalHeader32 = ImageOptionalHeader32(),
)

public data class ImageNtHeaders64(
    public var signature: UInt = 0u,
    public var fileHeader: ImageFileHeader = ImageFileHeader(),
    public var optionalHeader: ImageOptionalHeader64 = ImageOptionalHeader64(),
)

public class ImageOptionalHeader32(
    public var magic: ImageOptionalHeaderMagic = 0u,
    public var majorLinkerVersion: UByte = 0u,
    public var minorLinkerVersion: UByte = 0u,
    public var sizeOfCode: UInt = 0u,
    public var sizeOfInitializedData: UInt = 0u,
    public var sizeOfUninitializedData: UInt = 0u,
    public var addressOfEntryPoint: UInt = 0u,
    public var baseOfCode: UInt = 0u,
    public var baseOfData: UInt = 0u,
    public var imageBase: UInt = 0u,
    public var sectionAlignment: UInt = 0u,
    public var fileAlignment: UInt = 0u,
    public var majorOperatingSystemVersion: UShort = 0u,
    public var minorOperatingSystemVersion: UShort = 0u,
    public var majorImageVersion: UShort = 0u,
    public var minorImageVersion: UShort = 0u,
    public var majorSubsystemVersion: UShort = 0u,
    public var minorSubsystemVersion: UShort = 0u,
    public var win32VersionValue: UInt = 0u,
    public var sizeOfImage: UInt = 0u,
    public var sizeOfHeaders: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var subsystem: ImageSubsystem = 0u,
    public var dllCharacteristics: ImageDllCharacteristics = 0u,
    public var sizeOfStackReserve: UInt = 0u,
    public var sizeOfStackCommit: UInt = 0u,
    public var sizeOfHeapReserve: UInt = 0u,
    public var sizeOfHeapCommit: UInt = 0u,
    public var loaderFlags: UInt = 0u,
    public var numberOfRvaAndSizes: UInt = 0u,
    public var dataDirectory: List<ImageDataDirectory> = List(16) { ImageDataDirectory() },
)

public class ImageOptionalHeader64(
    public var magic: ImageOptionalHeaderMagic = 0u,
    public var majorLinkerVersion: UByte = 0u,
    public var minorLinkerVersion: UByte = 0u,
    public var sizeOfCode: UInt = 0u,
    public var sizeOfInitializedData: UInt = 0u,
    public var sizeOfUninitializedData: UInt = 0u,
    public var addressOfEntryPoint: UInt = 0u,
    public var baseOfCode: UInt = 0u,
    public var imageBase: ULong = 0uL,
    public var sectionAlignment: UInt = 0u,
    public var fileAlignment: UInt = 0u,
    public var majorOperatingSystemVersion: UShort = 0u,
    public var minorOperatingSystemVersion: UShort = 0u,
    public var majorImageVersion: UShort = 0u,
    public var minorImageVersion: UShort = 0u,
    public var majorSubsystemVersion: UShort = 0u,
    public var minorSubsystemVersion: UShort = 0u,
    public var win32VersionValue: UInt = 0u,
    public var sizeOfImage: UInt = 0u,
    public var sizeOfHeaders: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var subsystem: ImageSubsystem = 0u,
    public var dllCharacteristics: ImageDllCharacteristics = 0u,
    public var sizeOfStackReserve: ULong = 0uL,
    public var sizeOfStackCommit: ULong = 0uL,
    public var sizeOfHeapReserve: ULong = 0uL,
    public var sizeOfHeapCommit: ULong = 0uL,
    public var loaderFlags: UInt = 0u,
    public var numberOfRvaAndSizes: UInt = 0u,
    public var dataDirectory: List<ImageDataDirectory> = List(16) { ImageDataDirectory() },
)

public data class ImageRomHeaders(public var fileHeader: ImageFileHeader = ImageFileHeader(), public var optionalHeader: ImageRomOptionalHeader = ImageRomOptionalHeader())

public data class ImageRomOptionalHeader(
    public var magic: UShort = 0u,
    public var majorLinkerVersion: UByte = 0u,
    public var minorLinkerVersion: UByte = 0u,
    public var sizeOfCode: UInt = 0u,
    public var sizeOfInitializedData: UInt = 0u,
    public var sizeOfUninitializedData: UInt = 0u,
    public var addressOfEntryPoint: UInt = 0u,
    public var baseOfCode: UInt = 0u,
    public var baseOfData: UInt = 0u,
    public var baseOfBss: UInt = 0u,
    public var gprMask: UInt = 0u,
    public var cprMask: UIntArray = UIntArray(4),
    public var gpValue: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageRomOptionalHeader) return false
        if (this.magic != other.magic) return false
        if (this.majorLinkerVersion != other.majorLinkerVersion) return false
        if (this.minorLinkerVersion != other.minorLinkerVersion) return false
        if (this.sizeOfCode != other.sizeOfCode) return false
        if (this.sizeOfInitializedData != other.sizeOfInitializedData) return false
        if (this.sizeOfUninitializedData != other.sizeOfUninitializedData) return false
        if (this.addressOfEntryPoint != other.addressOfEntryPoint) return false
        if (this.baseOfCode != other.baseOfCode) return false
        if (this.baseOfData != other.baseOfData) return false
        if (this.baseOfBss != other.baseOfBss) return false
        if (this.gprMask != other.gprMask) return false
        if (!this.cprMask.contentEquals(other.cprMask)) return false
        if (this.gpValue != other.gpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.magic.hashCode()
        result = 31 * result + this.majorLinkerVersion.hashCode()
        result = 31 * result + this.minorLinkerVersion.hashCode()
        result = 31 * result + this.sizeOfCode.hashCode()
        result = 31 * result + this.sizeOfInitializedData.hashCode()
        result = 31 * result + this.sizeOfUninitializedData.hashCode()
        result = 31 * result + this.addressOfEntryPoint.hashCode()
        result = 31 * result + this.baseOfCode.hashCode()
        result = 31 * result + this.baseOfData.hashCode()
        result = 31 * result + this.baseOfBss.hashCode()
        result = 31 * result + this.gprMask.hashCode()
        result = 31 * result + this.cprMask.contentHashCode()
        result = 31 * result + this.gpValue.hashCode()
        return result
    }
}

public data class ImageRuntimeFunctionEntry(
    public var beginAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var anonymous: ImageRuntimeFunctionEntry0 = ImageRuntimeFunctionEntry0(),
)

public data class ImageRuntimeFunctionEntry0(public var unwindInfoAddress: UInt = 0u, public var unwindData: UInt = 0u)

public data class ImageSectionHeader(
    public var name: UByteArray = UByteArray(8),
    public var misc: ImageSectionHeader0 = ImageSectionHeader0(),
    public var virtualAddress: UInt = 0u,
    public var sizeOfRawData: UInt = 0u,
    public var pointerToRawData: UInt = 0u,
    public var pointerToRelocations: UInt = 0u,
    public var pointerToLinenumbers: UInt = 0u,
    public var numberOfRelocations: UShort = 0u,
    public var numberOfLinenumbers: UShort = 0u,
    public var characteristics: ImageSectionCharacteristics = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageSectionHeader) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.misc != other.misc) return false
        if (this.virtualAddress != other.virtualAddress) return false
        if (this.sizeOfRawData != other.sizeOfRawData) return false
        if (this.pointerToRawData != other.pointerToRawData) return false
        if (this.pointerToRelocations != other.pointerToRelocations) return false
        if (this.pointerToLinenumbers != other.pointerToLinenumbers) return false
        if (this.numberOfRelocations != other.numberOfRelocations) return false
        if (this.numberOfLinenumbers != other.numberOfLinenumbers) return false
        if (this.characteristics != other.characteristics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.misc.hashCode()
        result = 31 * result + this.virtualAddress.hashCode()
        result = 31 * result + this.sizeOfRawData.hashCode()
        result = 31 * result + this.pointerToRawData.hashCode()
        result = 31 * result + this.pointerToRelocations.hashCode()
        result = 31 * result + this.pointerToLinenumbers.hashCode()
        result = 31 * result + this.numberOfRelocations.hashCode()
        result = 31 * result + this.numberOfLinenumbers.hashCode()
        result = 31 * result + this.characteristics.hashCode()
        return result
    }
}

public data class ImageSectionHeader0(public var physicalAddress: UInt = 0u, public var virtualSize: UInt = 0u)

public data class IpmiOsSelRecord(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var recordType: IpmiOsSelRecordType = 0,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpmiOsSelRecord) return false
        if (this.signature != other.signature) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.recordType != other.recordType) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.recordType.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public class Kdhelp64(
    public var thread: ULong = 0uL,
    public var thCallbackStack: UInt = 0u,
    public var thCallbackBStore: UInt = 0u,
    public var nextCallback: UInt = 0u,
    public var framePointer: UInt = 0u,
    public var kiCallUserMode: ULong = 0uL,
    public var keUserCallbackDispatcher: ULong = 0uL,
    public var systemRangeStart: ULong = 0uL,
    public var kiUserExceptionDispatcher: ULong = 0uL,
    public var stackBase: ULong = 0uL,
    public var stackLimit: ULong = 0uL,
    public var buildVersion: UInt = 0u,
    public var retpolineStubFunctionTableSize: UInt = 0u,
    public var retpolineStubFunctionTable: ULong = 0uL,
    public var retpolineStubOffset: UInt = 0u,
    public var retpolineStubSize: UInt = 0u,
    public var reserved0: ULongArray = ULongArray(2),
)

public data class KnonvolatileContextPointers(public var anonymous1: KnonvolatileContextPointers0 = KnonvolatileContextPointers0(), public var anonymous2: KnonvolatileContextPointers1 = KnonvolatileContextPointers1())

public data class KnonvolatileContextPointers0(public var floatingContext: List<M128a> = List(16) { M128a() }, public var anonymous: KnonvolatileContextPointers00 = KnonvolatileContextPointers00())

public data class KnonvolatileContextPointers00(
    public var xmm0: M128a? = null,
    public var xmm1: M128a? = null,
    public var xmm2: M128a? = null,
    public var xmm3: M128a? = null,
    public var xmm4: M128a? = null,
    public var xmm5: M128a? = null,
    public var xmm6: M128a? = null,
    public var xmm7: M128a? = null,
    public var xmm8: M128a? = null,
    public var xmm9: M128a? = null,
    public var xmm10: M128a? = null,
    public var xmm11: M128a? = null,
    public var xmm12: M128a? = null,
    public var xmm13: M128a? = null,
    public var xmm14: M128a? = null,
    public var xmm15: M128a? = null,
)

public data class KnonvolatileContextPointers1(public var integerContext: List<ULong> = List(16) { 0uL }, public var anonymous: KnonvolatileContextPointers10 = KnonvolatileContextPointers10())

public data class KnonvolatileContextPointers10(
    public var rax: ULong? = null,
    public var rcx: ULong? = null,
    public var rdx: ULong? = null,
    public var rbx: ULong? = null,
    public var rsp: ULong? = null,
    public var rbp: ULong? = null,
    public var rsi: ULong? = null,
    public var rdi: ULong? = null,
    public var r8: ULong? = null,
    public var r9: ULong? = null,
    public var r10: ULong? = null,
    public var r11: ULong? = null,
    public var r12: ULong? = null,
    public var r13: ULong? = null,
    public var r14: ULong? = null,
    public var r15: ULong? = null,
)

public data class LdtEntry(
    public var limitLow: UShort = 0u,
    public var baseLow: UShort = 0u,
    public var highWord: LdtEntry0 = LdtEntry0(),
)

public data class LdtEntry0(public var bytes: LdtEntry00 = LdtEntry00(), public var bits: LdtEntry01 = LdtEntry01())

public data class LdtEntry01(public var bitfield: UInt = 0u)

public data class LdtEntry00(
    public var baseMid: UByte = 0u,
    public var flags1: UByte = 0u,
    public var flags2: UByte = 0u,
    public var baseHi: UByte = 0u,
)

public data class LoadedImage(
    public var moduleName: Pstr = null,
    public var hFile: Handle = null,
    public var mappedAddress: COpaquePointer? = null,
    public var fileHeader: ImageNtHeaders64? = null,
    public var lastRvaSection: ImageSectionHeader? = null,
    public var numberOfSections: UInt = 0u,
    public var sections: ImageSectionHeader? = null,
    public var characteristics: ImageFileCharacteristics2 = 0u,
    public var fSystemImage: Boolean = false,
    public var fDOSImage: Boolean = false,
    public var fReadOnly: Boolean = false,
    public var version: UByte = 0u,
    public var links: ListEntry = ListEntry(),
    public var sizeOfImage: UInt = 0u,
)

public data class LoadDllDebugInfo(
    public var hFile: Handle = null,
    public var lpBaseOfDll: COpaquePointer? = null,
    public var dwDebugInfoFileOffset: UInt = 0u,
    public var nDebugInfoSize: UInt = 0u,
    public var lpImageName: COpaquePointer? = null,
    public var fUnicode: UShort = 0u,
)

public data class M128a(public var low: ULong = 0uL, public var high: Long = 0L)

public data class MinidumpCallbackInformation(public var callbackRoutine: MinidumpCallbackRoutine = null, public var callbackParam: COpaquePointer? = null)

public data class MinidumpCallbackInput(
    public var processId: UInt = 0u,
    public var processHandle: Handle = null,
    public var callbackType: UInt = 0u,
    public var anonymous: MinidumpCallbackInput0 = MinidumpCallbackInput0(),
)

public data class MinidumpCallbackInput0(
    public var status: Hresult = 0,
    public var thread: MinidumpThreadCallback = MinidumpThreadCallback(),
    public var threadEx: MinidumpThreadExCallback = MinidumpThreadExCallback(),
    public var module: MinidumpModuleCallback = MinidumpModuleCallback(),
    public var includeThread: MinidumpIncludeThreadCallback = MinidumpIncludeThreadCallback(),
    public var includeModule: MinidumpIncludeModuleCallback = MinidumpIncludeModuleCallback(),
    public var io: MinidumpIoCallback = MinidumpIoCallback(),
    public var readMemoryFailure: MinidumpReadMemoryFailureCallback = MinidumpReadMemoryFailureCallback(),
    public var secondaryFlags: UInt = 0u,
    public var vmQuery: MinidumpVmQueryCallback = MinidumpVmQueryCallback(),
    public var vmPreRead: MinidumpVmPreReadCallback = MinidumpVmPreReadCallback(),
    public var vmPostRead: MinidumpVmPostReadCallback = MinidumpVmPostReadCallback(),
)

public data class MinidumpCallbackOutput(public var anonymous: MinidumpCallbackOutput0 = MinidumpCallbackOutput0())

public data class MinidumpCallbackOutput0(
    public var moduleWriteFlags: UInt = 0u,
    public var threadWriteFlags: UInt = 0u,
    public var secondaryFlags: UInt = 0u,
    public var anonymous1: MinidumpCallbackOutput00 = MinidumpCallbackOutput00(),
    public var anonymous2: MinidumpCallbackOutput01 = MinidumpCallbackOutput01(),
    public var handle: Handle = null,
    public var anonymous3: MinidumpCallbackOutput02 = MinidumpCallbackOutput02(),
    public var anonymous4: MinidumpCallbackOutput03 = MinidumpCallbackOutput03(),
    public var anonymous5: MinidumpCallbackOutput04 = MinidumpCallbackOutput04(),
    public var status: Hresult = 0,
)

public data class MinidumpCallbackOutput00(public var memoryBase: ULong = 0uL, public var memorySize: UInt = 0u)

public data class MinidumpCallbackOutput01(public var checkCancel: Bool = 0, public var cancel: Bool = 0)

public data class MinidumpCallbackOutput02(public var vmRegion: MinidumpMemoryInfo = MinidumpMemoryInfo(), public var continueTarget: Bool = 0)

public data class MinidumpCallbackOutput03(public var vmQueryStatus: Hresult = 0, public var vmQueryResult: MinidumpMemoryInfo = MinidumpMemoryInfo())

public data class MinidumpCallbackOutput04(public var vmReadStatus: Hresult = 0, public var vmReadBytesCompleted: UInt = 0u)

public data class MinidumpDirectory(public var streamType: UInt = 0u, public var location: MinidumpLocationDescriptor = MinidumpLocationDescriptor())

public data class MinidumpException(
    public var exceptionCode: UInt = 0u,
    public var exceptionFlags: UInt = 0u,
    public var exceptionRecord: ULong = 0uL,
    public var exceptionAddress: ULong = 0uL,
    public var numberParameters: UInt = 0u,
    public var unusedAlignment: UInt = 0u,
    public var exceptionInformation: ULongArray = ULongArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpException) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.exceptionFlags != other.exceptionFlags) return false
        if (this.exceptionRecord != other.exceptionRecord) return false
        if (this.exceptionAddress != other.exceptionAddress) return false
        if (this.numberParameters != other.numberParameters) return false
        if (this.unusedAlignment != other.unusedAlignment) return false
        if (!this.exceptionInformation.contentEquals(other.exceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCode.hashCode()
        result = 31 * result + this.exceptionFlags.hashCode()
        result = 31 * result + this.exceptionRecord.hashCode()
        result = 31 * result + this.exceptionAddress.hashCode()
        result = 31 * result + this.numberParameters.hashCode()
        result = 31 * result + this.unusedAlignment.hashCode()
        result = 31 * result + this.exceptionInformation.contentHashCode()
        return result
    }
}

public data class MinidumpExceptionInformation(
    public var threadId: UInt = 0u,
    public var exceptionPointers: ExceptionPointers? = null,
    public var clientPointers: Bool = 0,
)

public data class MinidumpExceptionInformation64(
    public var threadId: UInt = 0u,
    public var exceptionRecord: ULong = 0uL,
    public var contextRecord: ULong = 0uL,
    public var clientPointers: Bool = 0,
)

public data class MinidumpExceptionStream(
    public var threadId: UInt = 0u,
    public var alignment: UInt = 0u,
    public var exceptionRecord: MinidumpException = MinidumpException(),
    public var threadContext: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
)

public data class MinidumpFunctionTableDescriptor(
    public var minimumAddress: ULong = 0uL,
    public var maximumAddress: ULong = 0uL,
    public var baseAddress: ULong = 0uL,
    public var entryCount: UInt = 0u,
    public var sizeOfAlignPad: UInt = 0u,
)

public data class MinidumpFunctionTableStream(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfDescriptor: UInt = 0u,
    public var sizeOfNativeDescriptor: UInt = 0u,
    public var sizeOfFunctionEntry: UInt = 0u,
    public var numberOfDescriptors: UInt = 0u,
    public var sizeOfAlignPad: UInt = 0u,
)

public data class MinidumpHandleDataStream(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfDescriptor: UInt = 0u,
    public var numberOfDescriptors: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class MinidumpHandleDescriptor(
    public var handle: ULong = 0uL,
    public var typeNameRva: UInt = 0u,
    public var objectNameRva: UInt = 0u,
    public var attributes: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pointerCount: UInt = 0u,
)

public data class MinidumpHandleDescriptor2(
    public var handle: ULong = 0uL,
    public var typeNameRva: UInt = 0u,
    public var objectNameRva: UInt = 0u,
    public var attributes: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pointerCount: UInt = 0u,
    public var objectInfoRva: UInt = 0u,
    public var reserved0: UInt = 0u,
)

public data class MinidumpHandleObjectInformation(
    public var nextInfoRva: UInt = 0u,
    public var infoType: UInt = 0u,
    public var sizeOfInfo: UInt = 0u,
)

public data class MinidumpHandleOperationList(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfEntry: UInt = 0u,
    public var numberOfEntries: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class MinidumpHeader(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var numberOfStreams: UInt = 0u,
    public var streamDirectoryRva: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var anonymous: MinidumpHeader0 = MinidumpHeader0(),
    public var flags: ULong = 0uL,
)

public data class MinidumpHeader0(public var reserved: UInt = 0u, public var timeDateStamp: UInt = 0u)

public data class MinidumpIncludeModuleCallback(public var baseOfImage: ULong = 0uL)

public data class MinidumpIncludeThreadCallback(public var threadId: UInt = 0u)

public data class MinidumpIoCallback(
    public var handle: Handle = null,
    public var offset: ULong = 0uL,
    public var buffer: COpaquePointer? = null,
    public var bufferBytes: UInt = 0u,
)

public data class MinidumpLocationDescriptor(public var dataSize: UInt = 0u, public var rva: UInt = 0u)

public data class MinidumpLocationDescriptor64(public var dataSize: ULong = 0uL, public var rva: ULong = 0uL)

public data class MinidumpMemory64List(
    public var numberOfMemoryRanges: ULong = 0uL,
    public var baseRva: ULong = 0uL,
    public var memoryRanges: List<MinidumpMemoryDescriptor64> = List(1) { MinidumpMemoryDescriptor64() },
)

public data class MinidumpMemoryDescriptor(public var startOfMemoryRange: ULong = 0uL, public var memory: MinidumpLocationDescriptor = MinidumpLocationDescriptor())

public data class MinidumpMemoryDescriptor64(public var startOfMemoryRange: ULong = 0uL, public var dataSize: ULong = 0uL)

public data class MinidumpMemoryInfo(
    public var baseAddress: ULong = 0uL,
    public var allocationBase: ULong = 0uL,
    public var allocationProtect: UInt = 0u,
    public var alignment1: UInt = 0u,
    public var regionSize: ULong = 0uL,
    public var state: VirtualAllocationType = 0u,
    public var protect: UInt = 0u,
    public var type: UInt = 0u,
    public var alignment2: UInt = 0u,
)

public data class MinidumpMemoryInfoList(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfEntry: UInt = 0u,
    public var numberOfEntries: ULong = 0uL,
)

public data class MinidumpMemoryList(public var numberOfMemoryRanges: UInt = 0u, public var memoryRanges: List<MinidumpMemoryDescriptor> = List(1) { MinidumpMemoryDescriptor() })

public data class MinidumpMiscInfo(
    public var sizeOfInfo: UInt = 0u,
    public var flags1: MinidumpMiscInfoFlags = 0u,
    public var processId: UInt = 0u,
    public var processCreateTime: UInt = 0u,
    public var processUserTime: UInt = 0u,
    public var processKernelTime: UInt = 0u,
)

public data class MinidumpMiscInfo2(
    public var sizeOfInfo: UInt = 0u,
    public var flags1: UInt = 0u,
    public var processId: UInt = 0u,
    public var processCreateTime: UInt = 0u,
    public var processUserTime: UInt = 0u,
    public var processKernelTime: UInt = 0u,
    public var processorMaxMhz: UInt = 0u,
    public var processorCurrentMhz: UInt = 0u,
    public var processorMhzLimit: UInt = 0u,
    public var processorMaxIdleState: UInt = 0u,
    public var processorCurrentIdleState: UInt = 0u,
)

public data class MinidumpMiscInfo3(
    public var sizeOfInfo: UInt = 0u,
    public var flags1: UInt = 0u,
    public var processId: UInt = 0u,
    public var processCreateTime: UInt = 0u,
    public var processUserTime: UInt = 0u,
    public var processKernelTime: UInt = 0u,
    public var processorMaxMhz: UInt = 0u,
    public var processorCurrentMhz: UInt = 0u,
    public var processorMhzLimit: UInt = 0u,
    public var processorMaxIdleState: UInt = 0u,
    public var processorCurrentIdleState: UInt = 0u,
    public var processIntegrityLevel: UInt = 0u,
    public var processExecuteFlags: UInt = 0u,
    public var protectedProcess: UInt = 0u,
    public var timeZoneId: UInt = 0u,
    public var timeZone: TimeZoneInformation = TimeZoneInformation(),
)

public class MinidumpMiscInfo4(
    public var sizeOfInfo: UInt = 0u,
    public var flags1: UInt = 0u,
    public var processId: UInt = 0u,
    public var processCreateTime: UInt = 0u,
    public var processUserTime: UInt = 0u,
    public var processKernelTime: UInt = 0u,
    public var processorMaxMhz: UInt = 0u,
    public var processorCurrentMhz: UInt = 0u,
    public var processorMhzLimit: UInt = 0u,
    public var processorMaxIdleState: UInt = 0u,
    public var processorCurrentIdleState: UInt = 0u,
    public var processIntegrityLevel: UInt = 0u,
    public var processExecuteFlags: UInt = 0u,
    public var protectedProcess: UInt = 0u,
    public var timeZoneId: UInt = 0u,
    public var timeZone: TimeZoneInformation = TimeZoneInformation(),
    public var buildString: UShortArray = UShortArray(260),
    public var dbgBldStr: UShortArray = UShortArray(40),
)

public class MinidumpMiscInfo5(
    public var sizeOfInfo: UInt = 0u,
    public var flags1: UInt = 0u,
    public var processId: UInt = 0u,
    public var processCreateTime: UInt = 0u,
    public var processUserTime: UInt = 0u,
    public var processKernelTime: UInt = 0u,
    public var processorMaxMhz: UInt = 0u,
    public var processorCurrentMhz: UInt = 0u,
    public var processorMhzLimit: UInt = 0u,
    public var processorMaxIdleState: UInt = 0u,
    public var processorCurrentIdleState: UInt = 0u,
    public var processIntegrityLevel: UInt = 0u,
    public var processExecuteFlags: UInt = 0u,
    public var protectedProcess: UInt = 0u,
    public var timeZoneId: UInt = 0u,
    public var timeZone: TimeZoneInformation = TimeZoneInformation(),
    public var buildString: UShortArray = UShortArray(260),
    public var dbgBldStr: UShortArray = UShortArray(40),
    public var xStateData: XstateConfigFeatureMscInfo = XstateConfigFeatureMscInfo(),
    public var processCookie: UInt = 0u,
)

public data class MinidumpModule(
    public var baseOfImage: ULong = 0uL,
    public var sizeOfImage: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var moduleNameRva: UInt = 0u,
    public var versionInfo: VsFixedfileinfo = VsFixedfileinfo(),
    public var cvRecord: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
    public var miscRecord: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
    public var reserved0: ULong = 0uL,
    public var reserved1: ULong = 0uL,
)

public data class MinidumpModuleCallback(
    public var fullPath: Pwstr = null,
    public var baseOfImage: ULong = 0uL,
    public var sizeOfImage: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var versionInfo: VsFixedfileinfo = VsFixedfileinfo(),
    public var cvRecord: COpaquePointer? = null,
    public var sizeOfCvRecord: UInt = 0u,
    public var miscRecord: COpaquePointer? = null,
    public var sizeOfMiscRecord: UInt = 0u,
)

public data class MinidumpModuleList(public var numberOfModules: UInt = 0u, public var modules: List<MinidumpModule> = List(1) { MinidumpModule() })

public data class MinidumpProcessVmCounters1(
    public var revision: UShort = 0u,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: ULong = 0uL,
    public var workingSetSize: ULong = 0uL,
    public var quotaPeakPagedPoolUsage: ULong = 0uL,
    public var quotaPagedPoolUsage: ULong = 0uL,
    public var quotaPeakNonPagedPoolUsage: ULong = 0uL,
    public var quotaNonPagedPoolUsage: ULong = 0uL,
    public var pagefileUsage: ULong = 0uL,
    public var peakPagefileUsage: ULong = 0uL,
    public var privateUsage: ULong = 0uL,
)

public class MinidumpProcessVmCounters2(
    public var revision: UShort = 0u,
    public var flags: UShort = 0u,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: ULong = 0uL,
    public var workingSetSize: ULong = 0uL,
    public var quotaPeakPagedPoolUsage: ULong = 0uL,
    public var quotaPagedPoolUsage: ULong = 0uL,
    public var quotaPeakNonPagedPoolUsage: ULong = 0uL,
    public var quotaNonPagedPoolUsage: ULong = 0uL,
    public var pagefileUsage: ULong = 0uL,
    public var peakPagefileUsage: ULong = 0uL,
    public var peakVirtualSize: ULong = 0uL,
    public var virtualSize: ULong = 0uL,
    public var privateUsage: ULong = 0uL,
    public var privateWorkingSetSize: ULong = 0uL,
    public var sharedCommitUsage: ULong = 0uL,
    public var jobSharedCommitUsage: ULong = 0uL,
    public var jobPrivateCommitUsage: ULong = 0uL,
    public var jobPeakPrivateCommitUsage: ULong = 0uL,
    public var jobPrivateCommitLimit: ULong = 0uL,
    public var jobTotalCommitLimit: ULong = 0uL,
)

public data class MinidumpReadMemoryFailureCallback(
    public var offset: ULong = 0uL,
    public var bytes: UInt = 0u,
    public var failureStatus: Hresult = 0,
)

public data class MinidumpString(public var length: UInt = 0u, public var buffer: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpString) return false
        if (this.length != other.length) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class MinidumpSystemBasicInformation(
    public var timerResolution: UInt = 0u,
    public var pageSize: UInt = 0u,
    public var numberOfPhysicalPages: UInt = 0u,
    public var lowestPhysicalPageNumber: UInt = 0u,
    public var highestPhysicalPageNumber: UInt = 0u,
    public var allocationGranularity: UInt = 0u,
    public var minimumUserModeAddress: ULong = 0uL,
    public var maximumUserModeAddress: ULong = 0uL,
    public var activeProcessorsAffinityMask: ULong = 0uL,
    public var numberOfProcessors: UInt = 0u,
)

public data class MinidumpSystemBasicPerformanceInformation(
    public var availablePages: ULong = 0uL,
    public var committedPages: ULong = 0uL,
    public var commitLimit: ULong = 0uL,
    public var peakCommitment: ULong = 0uL,
)

public data class MinidumpSystemFilecacheInformation(
    public var currentSize: ULong = 0uL,
    public var peakSize: ULong = 0uL,
    public var pageFaultCount: UInt = 0u,
    public var minimumWorkingSet: ULong = 0uL,
    public var maximumWorkingSet: ULong = 0uL,
    public var currentSizeIncludingTransitionInPages: ULong = 0uL,
    public var peakSizeIncludingTransitionInPages: ULong = 0uL,
    public var transitionRePurposeCount: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class MinidumpSystemInfo(
    public var processorArchitecture: ProcessorArchitecture = 0u,
    public var processorLevel: UShort = 0u,
    public var processorRevision: UShort = 0u,
    public var anonymous1: MinidumpSystemInfo0 = MinidumpSystemInfo0(),
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var buildNumber: UInt = 0u,
    public var platformId: VerPlatform = 0u,
    public var cSDVersionRva: UInt = 0u,
    public var anonymous2: MinidumpSystemInfo1 = MinidumpSystemInfo1(),
    public var cpu: CpuInformation = CpuInformation(),
)

public data class MinidumpSystemInfo0(public var reserved0: UShort = 0u, public var anonymous: MinidumpSystemInfo00 = MinidumpSystemInfo00())

public data class MinidumpSystemInfo00(public var numberOfProcessors: UByte = 0u, public var productType: UByte = 0u)

public data class MinidumpSystemInfo1(public var reserved1: UInt = 0u, public var anonymous: MinidumpSystemInfo10 = MinidumpSystemInfo10())

public data class MinidumpSystemInfo10(public var suiteMask: UShort = 0u, public var reserved2: UShort = 0u)

public data class MinidumpSystemMemoryInfo1(
    public var revision: UShort = 0u,
    public var flags: UShort = 0u,
    public var basicInfo: MinidumpSystemBasicInformation = MinidumpSystemBasicInformation(),
    public var fileCacheInfo: MinidumpSystemFilecacheInformation = MinidumpSystemFilecacheInformation(),
    public var basicPerfInfo: MinidumpSystemBasicPerformanceInformation = MinidumpSystemBasicPerformanceInformation(),
    public var perfInfo: MinidumpSystemPerformanceInformation = MinidumpSystemPerformanceInformation(),
)

public class MinidumpSystemPerformanceInformation {
    public var idleProcessTime: ULong = 0uL

    public var ioReadTransferCount: ULong = 0uL

    public var ioWriteTransferCount: ULong = 0uL

    public var ioOtherTransferCount: ULong = 0uL

    public var ioReadOperationCount: UInt = 0u

    public var ioWriteOperationCount: UInt = 0u

    public var ioOtherOperationCount: UInt = 0u

    public var availablePages: UInt = 0u

    public var committedPages: UInt = 0u

    public var commitLimit: UInt = 0u

    public var peakCommitment: UInt = 0u

    public var pageFaultCount: UInt = 0u

    public var copyOnWriteCount: UInt = 0u

    public var transitionCount: UInt = 0u

    public var cacheTransitionCount: UInt = 0u

    public var demandZeroCount: UInt = 0u

    public var pageReadCount: UInt = 0u

    public var pageReadIoCount: UInt = 0u

    public var cacheReadCount: UInt = 0u

    public var cacheIoCount: UInt = 0u

    public var dirtyPagesWriteCount: UInt = 0u

    public var dirtyWriteIoCount: UInt = 0u

    public var mappedPagesWriteCount: UInt = 0u

    public var mappedWriteIoCount: UInt = 0u

    public var pagedPoolPages: UInt = 0u

    public var nonPagedPoolPages: UInt = 0u

    public var pagedPoolAllocs: UInt = 0u

    public var pagedPoolFrees: UInt = 0u

    public var nonPagedPoolAllocs: UInt = 0u

    public var nonPagedPoolFrees: UInt = 0u

    public var freeSystemPtes: UInt = 0u

    public var residentSystemCodePage: UInt = 0u

    public var totalSystemDriverPages: UInt = 0u

    public var totalSystemCodePages: UInt = 0u

    public var nonPagedPoolLookasideHits: UInt = 0u

    public var pagedPoolLookasideHits: UInt = 0u

    public var availablePagedPoolPages: UInt = 0u

    public var residentSystemCachePage: UInt = 0u

    public var residentPagedPoolPage: UInt = 0u

    public var residentSystemDriverPage: UInt = 0u

    public var ccFastReadNoWait: UInt = 0u

    public var ccFastReadWait: UInt = 0u

    public var ccFastReadResourceMiss: UInt = 0u

    public var ccFastReadNotPossible: UInt = 0u

    public var ccFastMdlReadNoWait: UInt = 0u

    public var ccFastMdlReadWait: UInt = 0u

    public var ccFastMdlReadResourceMiss: UInt = 0u

    public var ccFastMdlReadNotPossible: UInt = 0u

    public var ccMapDataNoWait: UInt = 0u

    public var ccMapDataWait: UInt = 0u

    public var ccMapDataNoWaitMiss: UInt = 0u

    public var ccMapDataWaitMiss: UInt = 0u

    public var ccPinMappedDataCount: UInt = 0u

    public var ccPinReadNoWait: UInt = 0u

    public var ccPinReadWait: UInt = 0u

    public var ccPinReadNoWaitMiss: UInt = 0u

    public var ccPinReadWaitMiss: UInt = 0u

    public var ccCopyReadNoWait: UInt = 0u

    public var ccCopyReadWait: UInt = 0u

    public var ccCopyReadNoWaitMiss: UInt = 0u

    public var ccCopyReadWaitMiss: UInt = 0u

    public var ccMdlReadNoWait: UInt = 0u

    public var ccMdlReadWait: UInt = 0u

    public var ccMdlReadNoWaitMiss: UInt = 0u

    public var ccMdlReadWaitMiss: UInt = 0u

    public var ccReadAheadIos: UInt = 0u

    public var ccLazyWriteIos: UInt = 0u

    public var ccLazyWritePages: UInt = 0u

    public var ccDataFlushes: UInt = 0u

    public var ccDataPages: UInt = 0u

    public var contextSwitches: UInt = 0u

    public var firstLevelTbFills: UInt = 0u

    public var secondLevelTbFills: UInt = 0u

    public var systemCalls: UInt = 0u

    public var ccTotalDirtyPages: ULong = 0uL

    public var ccDirtyPageThreshold: ULong = 0uL

    public var residentAvailablePages: Long = 0L

    public var sharedCommittedPages: ULong = 0uL
}

public data class MinidumpThread(
    public var threadId: UInt = 0u,
    public var suspendCount: UInt = 0u,
    public var priorityClass: UInt = 0u,
    public var priority: UInt = 0u,
    public var teb: ULong = 0uL,
    public var stack: MinidumpMemoryDescriptor = MinidumpMemoryDescriptor(),
    public var threadContext: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
)

public data class MinidumpThreadCallback(
    public var threadId: UInt = 0u,
    public var threadHandle: Handle = null,
    public var context: Context = Context(),
    public var sizeOfContext: UInt = 0u,
    public var stackBase: ULong = 0uL,
    public var stackEnd: ULong = 0uL,
)

public data class MinidumpThreadEx(
    public var threadId: UInt = 0u,
    public var suspendCount: UInt = 0u,
    public var priorityClass: UInt = 0u,
    public var priority: UInt = 0u,
    public var teb: ULong = 0uL,
    public var stack: MinidumpMemoryDescriptor = MinidumpMemoryDescriptor(),
    public var threadContext: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
    public var backingStore: MinidumpMemoryDescriptor = MinidumpMemoryDescriptor(),
)

public data class MinidumpThreadExCallback(
    public var threadId: UInt = 0u,
    public var threadHandle: Handle = null,
    public var context: Context = Context(),
    public var sizeOfContext: UInt = 0u,
    public var stackBase: ULong = 0uL,
    public var stackEnd: ULong = 0uL,
    public var backingStoreBase: ULong = 0uL,
    public var backingStoreEnd: ULong = 0uL,
)

public data class MinidumpThreadExList(public var numberOfThreads: UInt = 0u, public var threads: List<MinidumpThreadEx> = List(1) { MinidumpThreadEx() })

public data class MinidumpThreadInfo(
    public var threadId: UInt = 0u,
    public var dumpFlags: MinidumpThreadInfoDumpFlags = 0u,
    public var dumpError: UInt = 0u,
    public var exitStatus: UInt = 0u,
    public var createTime: ULong = 0uL,
    public var exitTime: ULong = 0uL,
    public var kernelTime: ULong = 0uL,
    public var userTime: ULong = 0uL,
    public var startAddress: ULong = 0uL,
    public var affinity: ULong = 0uL,
)

public data class MinidumpThreadInfoList(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfEntry: UInt = 0u,
    public var numberOfEntries: UInt = 0u,
)

public data class MinidumpThreadList(public var numberOfThreads: UInt = 0u, public var threads: List<MinidumpThread> = List(1) { MinidumpThread() })

public data class MinidumpThreadName(public var threadId: UInt = 0u, public var rvaOfThreadName: ULong = 0uL)

public data class MinidumpThreadNameList(public var numberOfThreadNames: UInt = 0u, public var threadNames: List<MinidumpThreadName> = List(1) { MinidumpThreadName() })

public data class MinidumpTokenInfoHeader(
    public var tokenSize: UInt = 0u,
    public var tokenId: UInt = 0u,
    public var tokenHandle: ULong = 0uL,
)

public data class MinidumpTokenInfoList(
    public var tokenListSize: UInt = 0u,
    public var tokenListEntries: UInt = 0u,
    public var listHeaderSize: UInt = 0u,
    public var elementHeaderSize: UInt = 0u,
)

public data class MinidumpUnloadedModule(
    public var baseOfImage: ULong = 0uL,
    public var sizeOfImage: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var moduleNameRva: UInt = 0u,
)

public data class MinidumpUnloadedModuleList(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfEntry: UInt = 0u,
    public var numberOfEntries: UInt = 0u,
)

public data class MinidumpUserRecord(public var type: UInt = 0u, public var memory: MinidumpLocationDescriptor = MinidumpLocationDescriptor())

public data class MinidumpUserStream(
    public var type: UInt = 0u,
    public var bufferSize: UInt = 0u,
    public var buffer: COpaquePointer? = null,
)

public data class MinidumpUserStreamInformation(public var userStreamCount: UInt = 0u, public var userStreamArray: MinidumpUserStream? = null)

public data class MinidumpVmPostReadCallback(
    public var offset: ULong = 0uL,
    public var buffer: COpaquePointer? = null,
    public var size: UInt = 0u,
    public var completed: UInt = 0u,
    public var status: Hresult = 0,
)

public data class MinidumpVmPreReadCallback(
    public var offset: ULong = 0uL,
    public var buffer: COpaquePointer? = null,
    public var size: UInt = 0u,
)

public data class MinidumpVmQueryCallback(public var offset: ULong = 0uL)

public data class ModloadCvmisc(
    public var oCV: UInt = 0u,
    public var cCV: Int = 0,
    public var oMisc: UInt = 0u,
    public var cMisc: Int = 0,
    public var dtImage: UInt = 0u,
    public var cImage: UInt = 0u,
)

public data class ModloadData(
    public var ssize: UInt = 0u,
    public var ssig: ModloadDataType = 0u,
    public var data: COpaquePointer? = null,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class ModloadPdbguidPdbage(public var pdbGuid: Guid = Guid(), public var pdbAge: UInt = 0u)

public data class ModuleTypeInfo(
    public var dataLength: UShort = 0u,
    public var leaf: UShort = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ModuleTypeInfo) return false
        if (this.dataLength != other.dataLength) return false
        if (this.leaf != other.leaf) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataLength.hashCode()
        result = 31 * result + this.leaf.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class Omap(public var rva: UInt = 0u, public var rvaTo: UInt = 0u)

public data class OutputDebugStringInfo(
    public var lpDebugStringData: Pstr = null,
    public var fUnicode: UShort = 0u,
    public var nDebugStringLength: UShort = 0u,
)

public data class PhysicalMemoryDescriptor32(
    public var numberOfRuns: UInt = 0u,
    public var numberOfPages: UInt = 0u,
    public var run: List<PhysicalMemoryRun32> = List(1) { PhysicalMemoryRun32() },
)

public data class PhysicalMemoryDescriptor64(
    public var numberOfRuns: UInt = 0u,
    public var numberOfPages: ULong = 0uL,
    public var run: List<PhysicalMemoryRun64> = List(1) { PhysicalMemoryRun64() },
)

public data class PhysicalMemoryRun32(public var basePage: UInt = 0u, public var pageCount: UInt = 0u)

public data class PhysicalMemoryRun64(public var basePage: ULong = 0uL, public var pageCount: ULong = 0uL)

public data class RipInfo(public var dwError: UInt = 0u, public var dwType: RipInfoType = 0u)

public data class Sourcefile(public var modBase: ULong = 0uL, public var fileName: Pstr = null)

public data class Sourcefilew(public var modBase: ULong = 0uL, public var fileName: Pwstr = null)

public data class Srccodeinfo(
    public var sizeOfStruct: UInt = 0u,
    public var key: COpaquePointer? = null,
    public var modBase: ULong = 0uL,
    public var obj: ByteArray = ByteArray(261),
    public var fileName: ByteArray = ByteArray(261),
    public var lineNumber: UInt = 0u,
    public var address: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Srccodeinfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.key != other.key) return false
        if (this.modBase != other.modBase) return false
        if (!this.obj.contentEquals(other.obj)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.lineNumber != other.lineNumber) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.modBase.hashCode()
        result = 31 * result + this.obj.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.lineNumber.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }
}

public data class Srccodeinfow(
    public var sizeOfStruct: UInt = 0u,
    public var key: COpaquePointer? = null,
    public var modBase: ULong = 0uL,
    public var obj: UShortArray = UShortArray(261),
    public var fileName: UShortArray = UShortArray(261),
    public var lineNumber: UInt = 0u,
    public var address: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Srccodeinfow) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.key != other.key) return false
        if (this.modBase != other.modBase) return false
        if (!this.obj.contentEquals(other.obj)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.lineNumber != other.lineNumber) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.modBase.hashCode()
        result = 31 * result + this.obj.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.lineNumber.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }
}

public data class Stackframe64(
    public var addrPC: Address64 = Address64(),
    public var addrReturn: Address64 = Address64(),
    public var addrFrame: Address64 = Address64(),
    public var addrStack: Address64 = Address64(),
    public var addrBStore: Address64 = Address64(),
    public var funcTableEntry: COpaquePointer? = null,
    public var params: ULongArray = ULongArray(4),
    public var far: Bool = 0,
    public var virtual: Bool = 0,
    public var reserved: ULongArray = ULongArray(3),
    public var kdHelp: Kdhelp64 = Kdhelp64(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stackframe64) return false
        if (this.addrPC != other.addrPC) return false
        if (this.addrReturn != other.addrReturn) return false
        if (this.addrFrame != other.addrFrame) return false
        if (this.addrStack != other.addrStack) return false
        if (this.addrBStore != other.addrBStore) return false
        if (this.funcTableEntry != other.funcTableEntry) return false
        if (!this.params.contentEquals(other.params)) return false
        if (this.far != other.far) return false
        if (this.virtual != other.virtual) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.kdHelp != other.kdHelp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addrPC.hashCode()
        result = 31 * result + this.addrReturn.hashCode()
        result = 31 * result + this.addrFrame.hashCode()
        result = 31 * result + this.addrStack.hashCode()
        result = 31 * result + this.addrBStore.hashCode()
        result = 31 * result + this.funcTableEntry.hashCode()
        result = 31 * result + this.params.contentHashCode()
        result = 31 * result + this.far.hashCode()
        result = 31 * result + this.virtual.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.kdHelp.hashCode()
        return result
    }
}

public data class StackframeEx(
    public var addrPC: Address64 = Address64(),
    public var addrReturn: Address64 = Address64(),
    public var addrFrame: Address64 = Address64(),
    public var addrStack: Address64 = Address64(),
    public var addrBStore: Address64 = Address64(),
    public var funcTableEntry: COpaquePointer? = null,
    public var params: ULongArray = ULongArray(4),
    public var far: Bool = 0,
    public var virtual: Bool = 0,
    public var reserved: ULongArray = ULongArray(3),
    public var kdHelp: Kdhelp64 = Kdhelp64(),
    public var stackFrameSize: UInt = 0u,
    public var inlineFrameContext: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackframeEx) return false
        if (this.addrPC != other.addrPC) return false
        if (this.addrReturn != other.addrReturn) return false
        if (this.addrFrame != other.addrFrame) return false
        if (this.addrStack != other.addrStack) return false
        if (this.addrBStore != other.addrBStore) return false
        if (this.funcTableEntry != other.funcTableEntry) return false
        if (!this.params.contentEquals(other.params)) return false
        if (this.far != other.far) return false
        if (this.virtual != other.virtual) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.kdHelp != other.kdHelp) return false
        if (this.stackFrameSize != other.stackFrameSize) return false
        if (this.inlineFrameContext != other.inlineFrameContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addrPC.hashCode()
        result = 31 * result + this.addrReturn.hashCode()
        result = 31 * result + this.addrFrame.hashCode()
        result = 31 * result + this.addrStack.hashCode()
        result = 31 * result + this.addrBStore.hashCode()
        result = 31 * result + this.funcTableEntry.hashCode()
        result = 31 * result + this.params.contentHashCode()
        result = 31 * result + this.far.hashCode()
        result = 31 * result + this.virtual.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.kdHelp.hashCode()
        result = 31 * result + this.stackFrameSize.hashCode()
        result = 31 * result + this.inlineFrameContext.hashCode()
        return result
    }
}

public data class SymbolInfo(
    public var sizeOfStruct: UInt = 0u,
    public var typeIndex: UInt = 0u,
    public var reserved: ULongArray = ULongArray(2),
    public var index: UInt = 0u,
    public var size: UInt = 0u,
    public var modBase: ULong = 0uL,
    public var flags: SymbolInfoFlags = 0u,
    public var value: ULong = 0uL,
    public var address: ULong = 0uL,
    public var register: UInt = 0u,
    public var scope: UInt = 0u,
    public var tag: UInt = 0u,
    public var nameLen: UInt = 0u,
    public var maxNameLen: UInt = 0u,
    public var name: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolInfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.typeIndex != other.typeIndex) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.index != other.index) return false
        if (this.size != other.size) return false
        if (this.modBase != other.modBase) return false
        if (this.flags != other.flags) return false
        if (this.value != other.value) return false
        if (this.address != other.address) return false
        if (this.register != other.register) return false
        if (this.scope != other.scope) return false
        if (this.tag != other.tag) return false
        if (this.nameLen != other.nameLen) return false
        if (this.maxNameLen != other.maxNameLen) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.typeIndex.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.modBase.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.register.hashCode()
        result = 31 * result + this.scope.hashCode()
        result = 31 * result + this.tag.hashCode()
        result = 31 * result + this.nameLen.hashCode()
        result = 31 * result + this.maxNameLen.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class SymbolInfow(
    public var sizeOfStruct: UInt = 0u,
    public var typeIndex: UInt = 0u,
    public var reserved: ULongArray = ULongArray(2),
    public var index: UInt = 0u,
    public var size: UInt = 0u,
    public var modBase: ULong = 0uL,
    public var flags: SymbolInfoFlags = 0u,
    public var value: ULong = 0uL,
    public var address: ULong = 0uL,
    public var register: UInt = 0u,
    public var scope: UInt = 0u,
    public var tag: UInt = 0u,
    public var nameLen: UInt = 0u,
    public var maxNameLen: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolInfow) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.typeIndex != other.typeIndex) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.index != other.index) return false
        if (this.size != other.size) return false
        if (this.modBase != other.modBase) return false
        if (this.flags != other.flags) return false
        if (this.value != other.value) return false
        if (this.address != other.address) return false
        if (this.register != other.register) return false
        if (this.scope != other.scope) return false
        if (this.tag != other.tag) return false
        if (this.nameLen != other.nameLen) return false
        if (this.maxNameLen != other.maxNameLen) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.typeIndex.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.modBase.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.register.hashCode()
        result = 31 * result + this.scope.hashCode()
        result = 31 * result + this.tag.hashCode()
        result = 31 * result + this.nameLen.hashCode()
        result = 31 * result + this.maxNameLen.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class SymbolInfoPackage(public var si: SymbolInfo = SymbolInfo(), public var name: ByteArray = ByteArray(2001)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolInfoPackage) return false
        if (this.si != other.si) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.si.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class SymbolInfoPackagew(public var si: SymbolInfow = SymbolInfow(), public var name: UShortArray = UShortArray(2001)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolInfoPackagew) return false
        if (this.si != other.si) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.si.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class SymsrvExtendedOutputData(
    public var sizeOfStruct: UInt = 0u,
    public var version: UInt = 0u,
    public var filePtrMsg: UShortArray = UShortArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymsrvExtendedOutputData) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.version != other.version) return false
        if (!this.filePtrMsg.contentEquals(other.filePtrMsg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.filePtrMsg.contentHashCode()
        return result
    }
}

public data class SymsrvIndexInfo(
    public var sizeofstruct: UInt = 0u,
    public var file: ByteArray = ByteArray(261),
    public var stripped: Bool = 0,
    public var timestamp: UInt = 0u,
    public var size: UInt = 0u,
    public var dbgfile: ByteArray = ByteArray(261),
    public var pdbfile: ByteArray = ByteArray(261),
    public var guid: Guid = Guid(),
    public var sig: UInt = 0u,
    public var age: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymsrvIndexInfo) return false
        if (this.sizeofstruct != other.sizeofstruct) return false
        if (!this.file.contentEquals(other.file)) return false
        if (this.stripped != other.stripped) return false
        if (this.timestamp != other.timestamp) return false
        if (this.size != other.size) return false
        if (!this.dbgfile.contentEquals(other.dbgfile)) return false
        if (!this.pdbfile.contentEquals(other.pdbfile)) return false
        if (this.guid != other.guid) return false
        if (this.sig != other.sig) return false
        if (this.age != other.age) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofstruct.hashCode()
        result = 31 * result + this.file.contentHashCode()
        result = 31 * result + this.stripped.hashCode()
        result = 31 * result + this.timestamp.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.dbgfile.contentHashCode()
        result = 31 * result + this.pdbfile.contentHashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.sig.hashCode()
        result = 31 * result + this.age.hashCode()
        return result
    }
}

public data class SymsrvIndexInfow(
    public var sizeofstruct: UInt = 0u,
    public var file: UShortArray = UShortArray(261),
    public var stripped: Bool = 0,
    public var timestamp: UInt = 0u,
    public var size: UInt = 0u,
    public var dbgfile: UShortArray = UShortArray(261),
    public var pdbfile: UShortArray = UShortArray(261),
    public var guid: Guid = Guid(),
    public var sig: UInt = 0u,
    public var age: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymsrvIndexInfow) return false
        if (this.sizeofstruct != other.sizeofstruct) return false
        if (!this.file.contentEquals(other.file)) return false
        if (this.stripped != other.stripped) return false
        if (this.timestamp != other.timestamp) return false
        if (this.size != other.size) return false
        if (!this.dbgfile.contentEquals(other.dbgfile)) return false
        if (!this.pdbfile.contentEquals(other.pdbfile)) return false
        if (this.guid != other.guid) return false
        if (this.sig != other.sig) return false
        if (this.age != other.age) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofstruct.hashCode()
        result = 31 * result + this.file.contentHashCode()
        result = 31 * result + this.stripped.hashCode()
        result = 31 * result + this.timestamp.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.dbgfile.contentHashCode()
        result = 31 * result + this.pdbfile.contentHashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.sig.hashCode()
        result = 31 * result + this.age.hashCode()
        return result
    }
}

public data class TiFindchildrenParams(
    public var count: UInt = 0u,
    public var start: UInt = 0u,
    public var childId: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TiFindchildrenParams) return false
        if (this.count != other.count) return false
        if (this.start != other.start) return false
        if (!this.childId.contentEquals(other.childId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.start.hashCode()
        result = 31 * result + this.childId.contentHashCode()
        return result
    }
}

public data class UnloadDllDebugInfo(public var lpBaseOfDll: COpaquePointer? = null)

public data class UnwindHistoryTable(
    public var count: UInt = 0u,
    public var localHint: UByte = 0u,
    public var globalHint: UByte = 0u,
    public var search: UByte = 0u,
    public var once: UByte = 0u,
    public var lowAddress: Int = 0,
    public var highAddress: Int = 0,
    public var entry: List<UnwindHistoryTableEntry> = List(12) { UnwindHistoryTableEntry() },
)

public data class UnwindHistoryTableEntry(public var imageBase: Int = 0, public var functionEntry: ImageRuntimeFunctionEntry? = null)

public data class WaitchainNodeInfo(
    public var objectType: WctObjectType = 0,
    public var objectStatus: WctObjectStatus = 0,
    public var anonymous: WaitchainNodeInfo0 = WaitchainNodeInfo0(),
)

public data class WaitchainNodeInfo0(public var lockObject: WaitchainNodeInfo00 = WaitchainNodeInfo00(), public var threadObject: WaitchainNodeInfo01 = WaitchainNodeInfo01())

public data class WaitchainNodeInfo00(
    public var objectName: UShortArray = UShortArray(128),
    public var timeout: Long = 0L,
    public var alertable: Bool = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WaitchainNodeInfo00) return false
        if (!this.objectName.contentEquals(other.objectName)) return false
        if (this.timeout != other.timeout) return false
        if (this.alertable != other.alertable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectName.contentHashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.alertable.hashCode()
        return result
    }
}

public data class WaitchainNodeInfo01(
    public var processId: UInt = 0u,
    public var threadId: UInt = 0u,
    public var waitTime: UInt = 0u,
    public var contextSwitches: UInt = 0u,
)

public data class WheaAerBridgeDescriptor(
    public var type: UShort = 0u,
    public var enabled: Boolean = false,
    public var reserved: UByte = 0u,
    public var busNumber: UInt = 0u,
    public var slot: WheaPciSlotNumber = WheaPciSlotNumber(),
    public var deviceControl: UShort = 0u,
    public var flags: AerBridgeDescriptorFlags = AerBridgeDescriptorFlags(),
    public var uncorrectableErrorMask: UInt = 0u,
    public var uncorrectableErrorSeverity: UInt = 0u,
    public var correctableErrorMask: UInt = 0u,
    public var advancedCapsAndControl: UInt = 0u,
    public var secondaryUncorrectableErrorMask: UInt = 0u,
    public var secondaryUncorrectableErrorSev: UInt = 0u,
    public var secondaryCapsAndControl: UInt = 0u,
)

public data class WheaAerEndpointDescriptor(
    public var type: UShort = 0u,
    public var enabled: Boolean = false,
    public var reserved: UByte = 0u,
    public var busNumber: UInt = 0u,
    public var slot: WheaPciSlotNumber = WheaPciSlotNumber(),
    public var deviceControl: UShort = 0u,
    public var flags: AerEndpointDescriptorFlags = AerEndpointDescriptorFlags(),
    public var uncorrectableErrorMask: UInt = 0u,
    public var uncorrectableErrorSeverity: UInt = 0u,
    public var correctableErrorMask: UInt = 0u,
    public var advancedCapsAndControl: UInt = 0u,
)

public data class WheaAerRootportDescriptor(
    public var type: UShort = 0u,
    public var enabled: Boolean = false,
    public var reserved: UByte = 0u,
    public var busNumber: UInt = 0u,
    public var slot: WheaPciSlotNumber = WheaPciSlotNumber(),
    public var deviceControl: UShort = 0u,
    public var flags: AerRootportDescriptorFlags = AerRootportDescriptorFlags(),
    public var uncorrectableErrorMask: UInt = 0u,
    public var uncorrectableErrorSeverity: UInt = 0u,
    public var correctableErrorMask: UInt = 0u,
    public var advancedCapsAndControl: UInt = 0u,
    public var rootErrorCommand: UInt = 0u,
)

public data class WheaDeviceDriverDescriptor(
    public var type: UShort = 0u,
    public var enabled: Boolean = false,
    public var reserved: UByte = 0u,
    public var sourceGuid: Guid = Guid(),
    public var logTag: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var packetLength: UInt = 0u,
    public var packetCount: UInt = 0u,
    public var packetBuffer: COpaquePointer? = null,
    public var config: WheaErrorSourceConfigurationDd = WheaErrorSourceConfigurationDd(),
    public var creatorId: Guid = Guid(),
    public var partitionId: Guid = Guid(),
    public var maxSectionDataLength: UInt = 0u,
    public var maxSectionsPerRecord: UInt = 0u,
    public var packetStateBuffer: COpaquePointer? = null,
    public var openHandles: Int = 0,
)

public data class WheaDriverBufferSet(
    public var version: UInt = 0u,
    public var data: COpaquePointer? = null,
    public var dataSize: UInt = 0u,
    public var sectionTypeGuid: Guid? = null,
    public var sectionFriendlyName: COpaquePointer? = null,
    public var flags: COpaquePointer? = null,
)

public data class WheaErrorSourceConfigurationDd(
    public var initialize: WheaErrorSourceInitializeDeviceDriver = null,
    public var uninitialize: WheaErrorSourceUninitializeDeviceDriver = null,
    public var correct: WheaErrorSourceCorrectDeviceDriver = null,
)

public data class WheaErrorSourceConfigurationDeviceDriver(
    public var version: UInt = 0u,
    public var sourceGuid: Guid = Guid(),
    public var logTag: UShort = 0u,
    public var reserved: UByteArray = UByteArray(6),
    public var initialize: WheaErrorSourceInitializeDeviceDriver = null,
    public var uninitialize: WheaErrorSourceUninitializeDeviceDriver = null,
    public var maxSectionDataLength: UInt = 0u,
    public var maxSectionsPerReport: UInt = 0u,
    public var creatorId: Guid = Guid(),
    public var partitionId: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorSourceConfigurationDeviceDriver) return false
        if (this.version != other.version) return false
        if (this.sourceGuid != other.sourceGuid) return false
        if (this.logTag != other.logTag) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.initialize != other.initialize) return false
        if (this.uninitialize != other.uninitialize) return false
        if (this.maxSectionDataLength != other.maxSectionDataLength) return false
        if (this.maxSectionsPerReport != other.maxSectionsPerReport) return false
        if (this.creatorId != other.creatorId) return false
        if (this.partitionId != other.partitionId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.sourceGuid.hashCode()
        result = 31 * result + this.logTag.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.initialize.hashCode()
        result = 31 * result + this.uninitialize.hashCode()
        result = 31 * result + this.maxSectionDataLength.hashCode()
        result = 31 * result + this.maxSectionsPerReport.hashCode()
        result = 31 * result + this.creatorId.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        return result
    }
}

public data class WheaErrorSourceConfigurationDeviceDriverV1(
    public var version: UInt = 0u,
    public var sourceGuid: Guid = Guid(),
    public var logTag: UShort = 0u,
    public var reserved: UByteArray = UByteArray(6),
    public var initialize: WheaErrorSourceInitializeDeviceDriver = null,
    public var uninitialize: WheaErrorSourceUninitializeDeviceDriver = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorSourceConfigurationDeviceDriverV1) return false
        if (this.version != other.version) return false
        if (this.sourceGuid != other.sourceGuid) return false
        if (this.logTag != other.logTag) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.initialize != other.initialize) return false
        if (this.uninitialize != other.uninitialize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.sourceGuid.hashCode()
        result = 31 * result + this.logTag.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.initialize.hashCode()
        result = 31 * result + this.uninitialize.hashCode()
        return result
    }
}

public data class WheaErrorSourceDescriptor(
    public var length: UInt = 0u,
    public var version: UInt = 0u,
    public var type: WheaErrorSourceType = 0,
    public var state: WheaErrorSourceState = 0,
    public var maxRawDataLength: UInt = 0u,
    public var numRecordsToPreallocate: UInt = 0u,
    public var maxSectionsPerRecord: UInt = 0u,
    public var errorSourceId: UInt = 0u,
    public var platformErrorSourceId: UInt = 0u,
    public var flags: UInt = 0u,
    public var info: WheaErrorSourceDescriptor0 = WheaErrorSourceDescriptor0(),
)

public data class WheaErrorSourceDescriptor0(
    public var xpfMceDescriptor: WheaXpfMceDescriptor = WheaXpfMceDescriptor(),
    public var xpfCmcDescriptor: WheaXpfCmcDescriptor = WheaXpfCmcDescriptor(),
    public var xpfNmiDescriptor: WheaXpfNmiDescriptor = WheaXpfNmiDescriptor(),
    public var ipfMcaDescriptor: WheaIpfMcaDescriptor = WheaIpfMcaDescriptor(),
    public var ipfCmcDescriptor: WheaIpfCmcDescriptor = WheaIpfCmcDescriptor(),
    public var ipfCpeDescriptor: WheaIpfCpeDescriptor = WheaIpfCpeDescriptor(),
    public var aerRootportDescriptor: WheaAerRootportDescriptor = WheaAerRootportDescriptor(),
    public var aerEndpointDescriptor: WheaAerEndpointDescriptor = WheaAerEndpointDescriptor(),
    public var aerBridgeDescriptor: WheaAerBridgeDescriptor = WheaAerBridgeDescriptor(),
    public var genErrDescriptor: WheaGenericErrorDescriptor = WheaGenericErrorDescriptor(),
    public var genErrDescriptorV2: WheaGenericErrorDescriptorV2 = WheaGenericErrorDescriptorV2(),
    public var deviceDriverDescriptor: WheaDeviceDriverDescriptor = WheaDeviceDriverDescriptor(),
)

public data class WheaGenericErrorDescriptor(
    public var type: UShort = 0u,
    public var reserved: UByte = 0u,
    public var enabled: UByte = 0u,
    public var errStatusBlockLength: UInt = 0u,
    public var relatedErrorSourceId: UInt = 0u,
    public var errStatusAddressSpaceID: UByte = 0u,
    public var errStatusAddressBitWidth: UByte = 0u,
    public var errStatusAddressBitOffset: UByte = 0u,
    public var errStatusAddressAccessSize: UByte = 0u,
    public var errStatusAddress: Long = 0L,
    public var notify: WheaNotificationDescriptor = WheaNotificationDescriptor(),
)

public class WheaGenericErrorDescriptorV2(
    public var type: UShort = 0u,
    public var reserved: UByte = 0u,
    public var enabled: UByte = 0u,
    public var errStatusBlockLength: UInt = 0u,
    public var relatedErrorSourceId: UInt = 0u,
    public var errStatusAddressSpaceID: UByte = 0u,
    public var errStatusAddressBitWidth: UByte = 0u,
    public var errStatusAddressBitOffset: UByte = 0u,
    public var errStatusAddressAccessSize: UByte = 0u,
    public var errStatusAddress: Long = 0L,
    public var notify: WheaNotificationDescriptor = WheaNotificationDescriptor(),
    public var readAckAddressSpaceID: UByte = 0u,
    public var readAckAddressBitWidth: UByte = 0u,
    public var readAckAddressBitOffset: UByte = 0u,
    public var readAckAddressAccessSize: UByte = 0u,
    public var readAckAddress: Long = 0L,
    public var readAckPreserveMask: ULong = 0uL,
    public var readAckWriteMask: ULong = 0uL,
)

public data class WheaIpfCmcDescriptor(
    public var type: UShort = 0u,
    public var enabled: UByte = 0u,
    public var reserved: UByte = 0u,
)

public data class WheaIpfCpeDescriptor(
    public var type: UShort = 0u,
    public var enabled: UByte = 0u,
    public var reserved: UByte = 0u,
)

public data class WheaIpfMcaDescriptor(
    public var type: UShort = 0u,
    public var enabled: UByte = 0u,
    public var reserved: UByte = 0u,
)

public data class WheaNotificationDescriptor(
    public var type: UByte = 0u,
    public var length: UByte = 0u,
    public var flags: WheaNotificationFlags = WheaNotificationFlags(),
    public var u: WheaNotificationDescriptor0 = WheaNotificationDescriptor0(),
)

public data class WheaNotificationDescriptor0(
    public var polled: WheaNotificationDescriptor00 = WheaNotificationDescriptor00(),
    public var interrupt: WheaNotificationDescriptor01 = WheaNotificationDescriptor01(),
    public var localInterrupt: WheaNotificationDescriptor02 = WheaNotificationDescriptor02(),
    public var sci: WheaNotificationDescriptor03 = WheaNotificationDescriptor03(),
    public var nmi: WheaNotificationDescriptor04 = WheaNotificationDescriptor04(),
    public var sea: WheaNotificationDescriptor05 = WheaNotificationDescriptor05(),
    public var sei: WheaNotificationDescriptor06 = WheaNotificationDescriptor06(),
    public var gsiv: WheaNotificationDescriptor07 = WheaNotificationDescriptor07(),
)

public data class WheaNotificationDescriptor07(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
)

public data class WheaNotificationDescriptor01(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
)

public data class WheaNotificationDescriptor02(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
)

public data class WheaNotificationDescriptor04(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
)

public data class WheaNotificationDescriptor00(public var pollInterval: UInt = 0u)

public data class WheaNotificationDescriptor03(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
)

public data class WheaNotificationDescriptor05(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
)

public data class WheaNotificationDescriptor06(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
)

public data class WheaNotificationFlags(public var anonymous: WheaNotificationFlags0 = WheaNotificationFlags0(), public var asUSHORT: UShort = 0u)

public data class WheaNotificationFlags0(public var bitfield: UShort = 0u)

public data class WheaPciSlotNumber(public var u: WheaPciSlotNumber0 = WheaPciSlotNumber0())

public data class WheaPciSlotNumber0(public var bits: WheaPciSlotNumber00 = WheaPciSlotNumber00(), public var asULONG: UInt = 0u)

public data class WheaPciSlotNumber00(public var bitfield: UInt = 0u)

public data class WheaXpfCmcDescriptor(
    public var type: UShort = 0u,
    public var enabled: Boolean = false,
    public var numberOfBanks: UByte = 0u,
    public var reserved: UInt = 0u,
    public var notify: WheaNotificationDescriptor = WheaNotificationDescriptor(),
    public var banks: List<WheaXpfMcBankDescriptor> = List(32) { WheaXpfMcBankDescriptor() },
)

public data class WheaXpfMceDescriptor(
    public var type: UShort = 0u,
    public var enabled: UByte = 0u,
    public var numberOfBanks: UByte = 0u,
    public var flags: XpfMceFlags = XpfMceFlags(),
    public var mcgCapability: ULong = 0uL,
    public var mcgGlobalControl: ULong = 0uL,
    public var banks: List<WheaXpfMcBankDescriptor> = List(32) { WheaXpfMcBankDescriptor() },
)
