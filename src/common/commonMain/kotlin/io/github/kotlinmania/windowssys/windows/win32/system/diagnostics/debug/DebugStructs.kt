@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.VS_FIXEDFILEINFO
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EXCEPTION_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.LIST_ENTRY
import io.github.kotlinmania.windowssys.windows.win32.system.memory.VIRTUAL_ALLOCATION_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.IMAGE_FILE_MACHINE
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.PROCESSOR_ARCHITECTURE
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LPTHREAD_START_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.system.time.TIME_ZONE_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARIANT

public data class ADDRESS64(
    public var Offset: ULong = 0uL,
    public var Segment: UShort = 0u,
    public var Mode: ADDRESS_MODE = 0,
)

public data class AER_BRIDGE_DESCRIPTOR_FLAGS(public var Anonymous: AER_BRIDGE_DESCRIPTOR_FLAGS_0 = AER_BRIDGE_DESCRIPTOR_FLAGS_0(), public var AsUSHORT: UShort = 0u)

public data class AER_BRIDGE_DESCRIPTOR_FLAGS_0(public var _bitfield: UShort = 0u)

public data class AER_ENDPOINT_DESCRIPTOR_FLAGS(public var Anonymous: AER_ENDPOINT_DESCRIPTOR_FLAGS_0 = AER_ENDPOINT_DESCRIPTOR_FLAGS_0(), public var AsUSHORT: UShort = 0u)

public data class AER_ENDPOINT_DESCRIPTOR_FLAGS_0(public var _bitfield: UShort = 0u)

public data class AER_ROOTPORT_DESCRIPTOR_FLAGS(public var Anonymous: AER_ROOTPORT_DESCRIPTOR_FLAGS_0 = AER_ROOTPORT_DESCRIPTOR_FLAGS_0(), public var AsUSHORT: UShort = 0u)

public data class AER_ROOTPORT_DESCRIPTOR_FLAGS_0(public var _bitfield: UShort = 0u)

public data class APC_CALLBACK_DATA(
    public var Parameter: ULong = 0uL,
    public var ContextRecord: Long = 0L,
    public var Reserved0: ULong = 0uL,
    public var Reserved1: ULong = 0uL,
)

public data class API_VERSION(
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var Revision: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class ARM64_NT_CONTEXT(
    public var ContextFlags: UInt = 0u,
    public var Cpsr: UInt = 0u,
    public var Anonymous: ARM64_NT_CONTEXT_0 = ARM64_NT_CONTEXT_0(),
    public var Sp: ULong = 0uL,
    public var Pc: ULong = 0uL,
    public var V: List<ARM64_NT_NEON128> = List(32) { ARM64_NT_NEON128() },
    public var Fpcr: UInt = 0u,
    public var Fpsr: UInt = 0u,
    public var Bcr: UIntArray = UIntArray(8),
    public var Bvr: ULongArray = ULongArray(8),
    public var Wcr: UIntArray = UIntArray(2),
    public var Wvr: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ARM64_NT_CONTEXT) return false
        if (this.ContextFlags != other.ContextFlags) return false
        if (this.Cpsr != other.Cpsr) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.Sp != other.Sp) return false
        if (this.Pc != other.Pc) return false
        if (this.V != other.V) return false
        if (this.Fpcr != other.Fpcr) return false
        if (this.Fpsr != other.Fpsr) return false
        if (!this.Bcr.contentEquals(other.Bcr)) return false
        if (!this.Bvr.contentEquals(other.Bvr)) return false
        if (!this.Wcr.contentEquals(other.Wcr)) return false
        if (!this.Wvr.contentEquals(other.Wvr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ContextFlags.hashCode()
        result = 31 * result + this.Cpsr.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.Sp.hashCode()
        result = 31 * result + this.Pc.hashCode()
        result = 31 * result + this.V.hashCode()
        result = 31 * result + this.Fpcr.hashCode()
        result = 31 * result + this.Fpsr.hashCode()
        result = 31 * result + this.Bcr.contentHashCode()
        result = 31 * result + this.Bvr.contentHashCode()
        result = 31 * result + this.Wcr.contentHashCode()
        result = 31 * result + this.Wvr.contentHashCode()
        return result
    }
}

public data class ARM64_NT_CONTEXT_0(public var Anonymous: ARM64_NT_CONTEXT_0_0 = ARM64_NT_CONTEXT_0_0(), public var X: ULongArray = ULongArray(31)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ARM64_NT_CONTEXT_0) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.X.contentEquals(other.X)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.X.contentHashCode()
        return result
    }
}

public class ARM64_NT_CONTEXT_0_0(
    public var X0: ULong = 0uL,
    public var X1: ULong = 0uL,
    public var X2: ULong = 0uL,
    public var X3: ULong = 0uL,
    public var X4: ULong = 0uL,
    public var X5: ULong = 0uL,
    public var X6: ULong = 0uL,
    public var X7: ULong = 0uL,
    public var X8: ULong = 0uL,
    public var X9: ULong = 0uL,
    public var X10: ULong = 0uL,
    public var X11: ULong = 0uL,
    public var X12: ULong = 0uL,
    public var X13: ULong = 0uL,
    public var X14: ULong = 0uL,
    public var X15: ULong = 0uL,
    public var X16: ULong = 0uL,
    public var X17: ULong = 0uL,
    public var X18: ULong = 0uL,
    public var X19: ULong = 0uL,
    public var X20: ULong = 0uL,
    public var X21: ULong = 0uL,
    public var X22: ULong = 0uL,
    public var X23: ULong = 0uL,
    public var X24: ULong = 0uL,
    public var X25: ULong = 0uL,
    public var X26: ULong = 0uL,
    public var X27: ULong = 0uL,
    public var X28: ULong = 0uL,
    public var Fp: ULong = 0uL,
    public var Lr: ULong = 0uL,
)

public data class ARM64_NT_NEON128(
    public var Anonymous: ARM64_NT_NEON128_0 = ARM64_NT_NEON128_0(),
    public var D: DoubleArray = DoubleArray(2),
    public var S: FloatArray = FloatArray(4),
    public var H: UShortArray = UShortArray(8),
    public var B: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ARM64_NT_NEON128) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.D.contentEquals(other.D)) return false
        if (!this.S.contentEquals(other.S)) return false
        if (!this.H.contentEquals(other.H)) return false
        if (!this.B.contentEquals(other.B)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.D.contentHashCode()
        result = 31 * result + this.S.contentHashCode()
        result = 31 * result + this.H.contentHashCode()
        result = 31 * result + this.B.contentHashCode()
        return result
    }
}

public data class ARM64_NT_NEON128_0(public var Low: ULong = 0uL, public var High: Long = 0L)

public class CONTEXT(
    public var P1Home: ULong = 0uL,
    public var P2Home: ULong = 0uL,
    public var P3Home: ULong = 0uL,
    public var P4Home: ULong = 0uL,
    public var P5Home: ULong = 0uL,
    public var P6Home: ULong = 0uL,
    public var ContextFlags: CONTEXT_FLAGS = 0u,
    public var MxCsr: UInt = 0u,
    public var SegCs: UShort = 0u,
    public var SegDs: UShort = 0u,
    public var SegEs: UShort = 0u,
    public var SegFs: UShort = 0u,
    public var SegGs: UShort = 0u,
    public var SegSs: UShort = 0u,
    public var EFlags: UInt = 0u,
    public var Dr0: ULong = 0uL,
    public var Dr1: ULong = 0uL,
    public var Dr2: ULong = 0uL,
    public var Dr3: ULong = 0uL,
    public var Dr6: ULong = 0uL,
    public var Dr7: ULong = 0uL,
    public var Rax: ULong = 0uL,
    public var Rcx: ULong = 0uL,
    public var Rdx: ULong = 0uL,
    public var Rbx: ULong = 0uL,
    public var Rsp: ULong = 0uL,
    public var Rbp: ULong = 0uL,
    public var Rsi: ULong = 0uL,
    public var Rdi: ULong = 0uL,
    public var R8: ULong = 0uL,
    public var R9: ULong = 0uL,
    public var R10: ULong = 0uL,
    public var R11: ULong = 0uL,
    public var R12: ULong = 0uL,
    public var R13: ULong = 0uL,
    public var R14: ULong = 0uL,
    public var R15: ULong = 0uL,
    public var Rip: ULong = 0uL,
    public var Anonymous: CONTEXT_0 = CONTEXT_0(),
    public var VectorRegister: List<M128A> = List(26) { M128A() },
    public var VectorControl: ULong = 0uL,
    public var DebugControl: ULong = 0uL,
    public var LastBranchToRip: ULong = 0uL,
    public var LastBranchFromRip: ULong = 0uL,
    public var LastExceptionToRip: ULong = 0uL,
    public var LastExceptionFromRip: ULong = 0uL,
)

public data class CONTEXT_0(public var FltSave: XSAVE_FORMAT = XSAVE_FORMAT(), public var Anonymous: CONTEXT_0_0 = CONTEXT_0_0())

public class CONTEXT_0_0(
    public var Header: List<M128A> = List(2) { M128A() },
    public var Legacy: List<M128A> = List(8) { M128A() },
    public var Xmm0: M128A = M128A(),
    public var Xmm1: M128A = M128A(),
    public var Xmm2: M128A = M128A(),
    public var Xmm3: M128A = M128A(),
    public var Xmm4: M128A = M128A(),
    public var Xmm5: M128A = M128A(),
    public var Xmm6: M128A = M128A(),
    public var Xmm7: M128A = M128A(),
    public var Xmm8: M128A = M128A(),
    public var Xmm9: M128A = M128A(),
    public var Xmm10: M128A = M128A(),
    public var Xmm11: M128A = M128A(),
    public var Xmm12: M128A = M128A(),
    public var Xmm13: M128A = M128A(),
    public var Xmm14: M128A = M128A(),
    public var Xmm15: M128A = M128A(),
)

public data class CPU_INFORMATION(public var X86CpuInfo: CPU_INFORMATION_0 = CPU_INFORMATION_0(), public var OtherCpuInfo: CPU_INFORMATION_1 = CPU_INFORMATION_1())

public data class CPU_INFORMATION_1(public var ProcessorFeatures: ULongArray = ULongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CPU_INFORMATION_1) return false
        if (!this.ProcessorFeatures.contentEquals(other.ProcessorFeatures)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.ProcessorFeatures.contentHashCode()
    }
}

public data class CPU_INFORMATION_0(
    public var VendorId: UIntArray = UIntArray(3),
    public var VersionInformation: UInt = 0u,
    public var FeatureInformation: UInt = 0u,
    public var AMDExtendedCpuFeatures: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CPU_INFORMATION_0) return false
        if (!this.VendorId.contentEquals(other.VendorId)) return false
        if (this.VersionInformation != other.VersionInformation) return false
        if (this.FeatureInformation != other.FeatureInformation) return false
        if (this.AMDExtendedCpuFeatures != other.AMDExtendedCpuFeatures) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VendorId.contentHashCode()
        result = 31 * result + this.VersionInformation.hashCode()
        result = 31 * result + this.FeatureInformation.hashCode()
        result = 31 * result + this.AMDExtendedCpuFeatures.hashCode()
        return result
    }
}

public data class CREATE_PROCESS_DEBUG_INFO(
    public var hFile: HANDLE = 0L,
    public var hProcess: HANDLE = 0L,
    public var hThread: HANDLE = 0L,
    public var lpBaseOfImage: Long = 0L,
    public var dwDebugInfoFileOffset: UInt = 0u,
    public var nDebugInfoSize: UInt = 0u,
    public var lpThreadLocalBase: Long = 0L,
    public var lpStartAddress: LPTHREAD_START_ROUTINE = null,
    public var lpImageName: Long = 0L,
    public var fUnicode: UShort = 0u,
)

public data class CREATE_THREAD_DEBUG_INFO(
    public var hThread: HANDLE = 0L,
    public var lpThreadLocalBase: Long = 0L,
    public var lpStartAddress: LPTHREAD_START_ROUTINE = null,
)

public data class DBGHELP_DATA_REPORT_STRUCT(public var pBinPathNonExist: PCWSTR = 0L, public var pSymbolPathNonExist: PCWSTR = 0L)

public data class DEBUG_EVENT(
    public var dwDebugEventCode: DEBUG_EVENT_CODE = 0u,
    public var dwProcessId: UInt = 0u,
    public var dwThreadId: UInt = 0u,
    public var u: DEBUG_EVENT_0 = DEBUG_EVENT_0(),
)

public data class DEBUG_EVENT_0(
    public var Exception: EXCEPTION_DEBUG_INFO = EXCEPTION_DEBUG_INFO(),
    public var CreateThread: CREATE_THREAD_DEBUG_INFO = CREATE_THREAD_DEBUG_INFO(),
    public var CreateProcessInfo: CREATE_PROCESS_DEBUG_INFO = CREATE_PROCESS_DEBUG_INFO(),
    public var ExitThread: EXIT_THREAD_DEBUG_INFO = EXIT_THREAD_DEBUG_INFO(),
    public var ExitProcess: EXIT_PROCESS_DEBUG_INFO = EXIT_PROCESS_DEBUG_INFO(),
    public var LoadDll: LOAD_DLL_DEBUG_INFO = LOAD_DLL_DEBUG_INFO(),
    public var UnloadDll: UNLOAD_DLL_DEBUG_INFO = UNLOAD_DLL_DEBUG_INFO(),
    public var DebugString: OUTPUT_DEBUG_STRING_INFO = OUTPUT_DEBUG_STRING_INFO(),
    public var RipInfo: RIP_INFO = RIP_INFO(),
)

public data class DISPATCHER_CONTEXT(
    public var ControlPc: ULong = 0uL,
    public var ImageBase: ULong = 0uL,
    public var FunctionEntry: Long = 0L,
    public var EstablisherFrame: ULong = 0uL,
    public var TargetIp: ULong = 0uL,
    public var ContextRecord: Long = 0L,
    public var LanguageHandler: EXCEPTION_ROUTINE = null,
    public var HandlerData: Long = 0L,
    public var HistoryTable: Long = 0L,
    public var ScopeIndex: UInt = 0u,
    public var Fill0: UInt = 0u,
)

public data class DUMP_FILE_ATTRIBUTES(public var Anonymous: DUMP_FILE_ATTRIBUTES_0 = DUMP_FILE_ATTRIBUTES_0(), public var Attributes: UInt = 0u)

public data class DUMP_FILE_ATTRIBUTES_0(public var _bitfield: UInt = 0u)

public class DUMP_HEADER32(
    public var Signature: UInt = 0u,
    public var ValidDump: UInt = 0u,
    public var MajorVersion: UInt = 0u,
    public var MinorVersion: UInt = 0u,
    public var DirectoryTableBase: UInt = 0u,
    public var PfnDataBase: UInt = 0u,
    public var PsLoadedModuleList: UInt = 0u,
    public var PsActiveProcessHead: UInt = 0u,
    public var MachineImageType: UInt = 0u,
    public var NumberProcessors: UInt = 0u,
    public var BugCheckCode: UInt = 0u,
    public var BugCheckParameter1: UInt = 0u,
    public var BugCheckParameter2: UInt = 0u,
    public var BugCheckParameter3: UInt = 0u,
    public var BugCheckParameter4: UInt = 0u,
    public var VersionUser: ByteArray = ByteArray(32),
    public var PaeEnabled: UByte = 0u,
    public var KdSecondaryVersion: UByte = 0u,
    public var Spare3: UByteArray = UByteArray(2),
    public var KdDebuggerDataBlock: UInt = 0u,
    public var Anonymous: DUMP_HEADER32_0 = DUMP_HEADER32_0(),
    public var ContextRecord: UByteArray = UByteArray(1200),
    public var Exception: EXCEPTION_RECORD32 = EXCEPTION_RECORD32(),
    public var Comment: ByteArray = ByteArray(128),
    public var Attributes: DUMP_FILE_ATTRIBUTES = DUMP_FILE_ATTRIBUTES(),
    public var BootId: UInt = 0u,
    public var _reserved0: UByteArray = UByteArray(1760),
    public var DumpType: UInt = 0u,
    public var MiniDumpFields: UInt = 0u,
    public var SecondaryDataState: UInt = 0u,
    public var ProductType: UInt = 0u,
    public var SuiteMask: UInt = 0u,
    public var WriterStatus: UInt = 0u,
    public var RequiredDumpSpace: Long = 0L,
    public var _reserved2: UByteArray = UByteArray(16),
    public var SystemUpTime: Long = 0L,
    public var SystemTime: Long = 0L,
    public var _reserved3: UByteArray = UByteArray(56),
)

public data class DUMP_HEADER32_0(public var PhysicalMemoryBlock: PHYSICAL_MEMORY_DESCRIPTOR32 = PHYSICAL_MEMORY_DESCRIPTOR32(), public var PhysicalMemoryBlockBuffer: UByteArray = UByteArray(700)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DUMP_HEADER32_0) return false
        if (this.PhysicalMemoryBlock != other.PhysicalMemoryBlock) return false
        if (!this.PhysicalMemoryBlockBuffer.contentEquals(other.PhysicalMemoryBlockBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PhysicalMemoryBlock.hashCode()
        result = 31 * result + this.PhysicalMemoryBlockBuffer.contentHashCode()
        return result
    }
}

public class DUMP_HEADER64(
    public var Signature: UInt = 0u,
    public var ValidDump: UInt = 0u,
    public var MajorVersion: UInt = 0u,
    public var MinorVersion: UInt = 0u,
    public var DirectoryTableBase: ULong = 0uL,
    public var PfnDataBase: ULong = 0uL,
    public var PsLoadedModuleList: ULong = 0uL,
    public var PsActiveProcessHead: ULong = 0uL,
    public var MachineImageType: UInt = 0u,
    public var NumberProcessors: UInt = 0u,
    public var BugCheckCode: UInt = 0u,
    public var BugCheckParameter1: ULong = 0uL,
    public var BugCheckParameter2: ULong = 0uL,
    public var BugCheckParameter3: ULong = 0uL,
    public var BugCheckParameter4: ULong = 0uL,
    public var VersionUser: ByteArray = ByteArray(32),
    public var KdDebuggerDataBlock: ULong = 0uL,
    public var Anonymous: DUMP_HEADER64_0 = DUMP_HEADER64_0(),
    public var ContextRecord: UByteArray = UByteArray(3000),
    public var Exception: EXCEPTION_RECORD64 = EXCEPTION_RECORD64(),
    public var DumpType: UInt = 0u,
    public var RequiredDumpSpace: Long = 0L,
    public var SystemTime: Long = 0L,
    public var Comment: ByteArray = ByteArray(128),
    public var SystemUpTime: Long = 0L,
    public var MiniDumpFields: UInt = 0u,
    public var SecondaryDataState: UInt = 0u,
    public var ProductType: UInt = 0u,
    public var SuiteMask: UInt = 0u,
    public var WriterStatus: UInt = 0u,
    public var Unused1: UByte = 0u,
    public var KdSecondaryVersion: UByte = 0u,
    public var Unused: UByteArray = UByteArray(2),
    public var Attributes: DUMP_FILE_ATTRIBUTES = DUMP_FILE_ATTRIBUTES(),
    public var BootId: UInt = 0u,
    public var _reserved0: UByteArray = UByteArray(4008),
)

public data class DUMP_HEADER64_0(public var PhysicalMemoryBlock: PHYSICAL_MEMORY_DESCRIPTOR64 = PHYSICAL_MEMORY_DESCRIPTOR64(), public var PhysicalMemoryBlockBuffer: UByteArray = UByteArray(700)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DUMP_HEADER64_0) return false
        if (this.PhysicalMemoryBlock != other.PhysicalMemoryBlock) return false
        if (!this.PhysicalMemoryBlockBuffer.contentEquals(other.PhysicalMemoryBlockBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PhysicalMemoryBlock.hashCode()
        result = 31 * result + this.PhysicalMemoryBlockBuffer.contentHashCode()
        return result
    }
}

public data class DebugPropertyInfo(
    public var m_dwValidFields: UInt = 0u,
    public var m_bstrName: BSTR = 0L,
    public var m_bstrType: BSTR = 0L,
    public var m_bstrValue: BSTR = 0L,
    public var m_bstrFullName: BSTR = 0L,
    public var m_dwAttrib: UInt = 0u,
    public var m_pDebugProp: Long = 0L,
)

public data class EXCEPTION_DEBUG_INFO(public var ExceptionRecord: EXCEPTION_RECORD = EXCEPTION_RECORD(), public var dwFirstChance: UInt = 0u)

public data class EXCEPTION_POINTERS(public var ExceptionRecord: Long = 0L, public var ContextRecord: Long = 0L)

public data class EXCEPTION_RECORD(
    public var ExceptionCode: NTSTATUS = 0,
    public var ExceptionFlags: UInt = 0u,
    public var ExceptionRecord: Long = 0L,
    public var ExceptionAddress: Long = 0L,
    public var NumberParameters: UInt = 0u,
    public var ExceptionInformation: ULongArray = ULongArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXCEPTION_RECORD) return false
        if (this.ExceptionCode != other.ExceptionCode) return false
        if (this.ExceptionFlags != other.ExceptionFlags) return false
        if (this.ExceptionRecord != other.ExceptionRecord) return false
        if (this.ExceptionAddress != other.ExceptionAddress) return false
        if (this.NumberParameters != other.NumberParameters) return false
        if (!this.ExceptionInformation.contentEquals(other.ExceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ExceptionCode.hashCode()
        result = 31 * result + this.ExceptionFlags.hashCode()
        result = 31 * result + this.ExceptionRecord.hashCode()
        result = 31 * result + this.ExceptionAddress.hashCode()
        result = 31 * result + this.NumberParameters.hashCode()
        result = 31 * result + this.ExceptionInformation.contentHashCode()
        return result
    }
}

public data class EXCEPTION_RECORD32(
    public var ExceptionCode: NTSTATUS = 0,
    public var ExceptionFlags: UInt = 0u,
    public var ExceptionRecord: UInt = 0u,
    public var ExceptionAddress: UInt = 0u,
    public var NumberParameters: UInt = 0u,
    public var ExceptionInformation: UIntArray = UIntArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXCEPTION_RECORD32) return false
        if (this.ExceptionCode != other.ExceptionCode) return false
        if (this.ExceptionFlags != other.ExceptionFlags) return false
        if (this.ExceptionRecord != other.ExceptionRecord) return false
        if (this.ExceptionAddress != other.ExceptionAddress) return false
        if (this.NumberParameters != other.NumberParameters) return false
        if (!this.ExceptionInformation.contentEquals(other.ExceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ExceptionCode.hashCode()
        result = 31 * result + this.ExceptionFlags.hashCode()
        result = 31 * result + this.ExceptionRecord.hashCode()
        result = 31 * result + this.ExceptionAddress.hashCode()
        result = 31 * result + this.NumberParameters.hashCode()
        result = 31 * result + this.ExceptionInformation.contentHashCode()
        return result
    }
}

public data class EXCEPTION_RECORD64(
    public var ExceptionCode: NTSTATUS = 0,
    public var ExceptionFlags: UInt = 0u,
    public var ExceptionRecord: ULong = 0uL,
    public var ExceptionAddress: ULong = 0uL,
    public var NumberParameters: UInt = 0u,
    public var __unusedAlignment: UInt = 0u,
    public var ExceptionInformation: ULongArray = ULongArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXCEPTION_RECORD64) return false
        if (this.ExceptionCode != other.ExceptionCode) return false
        if (this.ExceptionFlags != other.ExceptionFlags) return false
        if (this.ExceptionRecord != other.ExceptionRecord) return false
        if (this.ExceptionAddress != other.ExceptionAddress) return false
        if (this.NumberParameters != other.NumberParameters) return false
        if (this.__unusedAlignment != other.__unusedAlignment) return false
        if (!this.ExceptionInformation.contentEquals(other.ExceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ExceptionCode.hashCode()
        result = 31 * result + this.ExceptionFlags.hashCode()
        result = 31 * result + this.ExceptionRecord.hashCode()
        result = 31 * result + this.ExceptionAddress.hashCode()
        result = 31 * result + this.NumberParameters.hashCode()
        result = 31 * result + this.__unusedAlignment.hashCode()
        result = 31 * result + this.ExceptionInformation.contentHashCode()
        return result
    }
}

public data class EXIT_PROCESS_DEBUG_INFO(public var dwExitCode: UInt = 0u)

public data class EXIT_THREAD_DEBUG_INFO(public var dwExitCode: UInt = 0u)

public data class ExtendedDebugPropertyInfo(
    public var dwValidFields: UInt = 0u,
    public var pszName: PWSTR = 0L,
    public var pszType: PWSTR = 0L,
    public var pszValue: PWSTR = 0L,
    public var pszFullName: PWSTR = 0L,
    public var dwAttrib: UInt = 0u,
    public var pDebugProp: Long = 0L,
    public var nDISPID: UInt = 0u,
    public var nType: UInt = 0u,
    public var varValue: VARIANT = VARIANT(),
    public var plbValue: Long = 0L,
    public var pDebugExtProp: Long = 0L,
)

public data class FPO_DATA(
    public var ulOffStart: UInt = 0u,
    public var cbProcSize: UInt = 0u,
    public var cdwLocals: UInt = 0u,
    public var cdwParams: UShort = 0u,
    public var _bitfield: UShort = 0u,
)

public data class IMAGEHLP_CBA_EVENT(
    public var severity: IMAGEHLP_CBA_EVENT_SEVERITY = 0u,
    public var code: UInt = 0u,
    public var desc: PSTR = 0L,
    public var obj: Long = 0L,
)

public data class IMAGEHLP_CBA_EVENTW(
    public var severity: IMAGEHLP_CBA_EVENT_SEVERITY = 0u,
    public var code: UInt = 0u,
    public var desc: PCWSTR = 0L,
    public var obj: Long = 0L,
)

public data class IMAGEHLP_CBA_READ_MEMORY(
    public var addr: ULong = 0uL,
    public var buf: Long = 0L,
    public var bytes: UInt = 0u,
    public var bytesread: Long = 0L,
)

public data class IMAGEHLP_DEFERRED_SYMBOL_LOAD64(
    public var SizeOfStruct: UInt = 0u,
    public var BaseOfImage: ULong = 0uL,
    public var CheckSum: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var FileName: ByteArray = ByteArray(260),
    public var Reparse: Boolean = false,
    public var hFile: HANDLE = 0L,
    public var Flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGEHLP_DEFERRED_SYMBOL_LOAD64) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.BaseOfImage != other.BaseOfImage) return false
        if (this.CheckSum != other.CheckSum) return false
        if (this.TimeDateStamp != other.TimeDateStamp) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        if (this.Reparse != other.Reparse) return false
        if (this.hFile != other.hFile) return false
        if (this.Flags != other.Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.BaseOfImage.hashCode()
        result = 31 * result + this.CheckSum.hashCode()
        result = 31 * result + this.TimeDateStamp.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        result = 31 * result + this.Reparse.hashCode()
        result = 31 * result + this.hFile.hashCode()
        result = 31 * result + this.Flags.hashCode()
        return result
    }
}

public data class IMAGEHLP_DEFERRED_SYMBOL_LOADW64(
    public var SizeOfStruct: UInt = 0u,
    public var BaseOfImage: ULong = 0uL,
    public var CheckSum: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var FileName: UShortArray = UShortArray(261),
    public var Reparse: Boolean = false,
    public var hFile: HANDLE = 0L,
    public var Flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGEHLP_DEFERRED_SYMBOL_LOADW64) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.BaseOfImage != other.BaseOfImage) return false
        if (this.CheckSum != other.CheckSum) return false
        if (this.TimeDateStamp != other.TimeDateStamp) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        if (this.Reparse != other.Reparse) return false
        if (this.hFile != other.hFile) return false
        if (this.Flags != other.Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.BaseOfImage.hashCode()
        result = 31 * result + this.CheckSum.hashCode()
        result = 31 * result + this.TimeDateStamp.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        result = 31 * result + this.Reparse.hashCode()
        result = 31 * result + this.hFile.hashCode()
        result = 31 * result + this.Flags.hashCode()
        return result
    }
}

public data class IMAGEHLP_DUPLICATE_SYMBOL64(
    public var SizeOfStruct: UInt = 0u,
    public var NumberOfDups: UInt = 0u,
    public var Symbol: Long = 0L,
    public var SelectedSymbol: UInt = 0u,
)

public class IMAGEHLP_GET_TYPE_INFO_PARAMS(
    public var SizeOfStruct: UInt = 0u,
    public var Flags: IMAGEHLP_GET_TYPE_INFO_FLAGS = 0u,
    public var NumIds: UInt = 0u,
    public var TypeIds: Long = 0L,
    public var TagFilter: ULong = 0uL,
    public var NumReqs: UInt = 0u,
    public var ReqKinds: Long = 0L,
    public var ReqOffsets: Long = 0L,
    public var ReqSizes: Long = 0L,
    public var ReqStride: ULong = 0uL,
    public var BufferSize: ULong = 0uL,
    public var Buffer: Long = 0L,
    public var EntriesMatched: UInt = 0u,
    public var EntriesFilled: UInt = 0u,
    public var TagsFound: ULong = 0uL,
    public var AllReqsValid: ULong = 0uL,
    public var NumReqsValid: UInt = 0u,
    public var ReqsValid: Long = 0L,
)

public data class IMAGEHLP_JIT_SYMBOLMAP(
    public var SizeOfStruct: UInt = 0u,
    public var Address: ULong = 0uL,
    public var BaseOfImage: ULong = 0uL,
)

public data class IMAGEHLP_LINE64(
    public var SizeOfStruct: UInt = 0u,
    public var Key: Long = 0L,
    public var LineNumber: UInt = 0u,
    public var FileName: PSTR = 0L,
    public var Address: ULong = 0uL,
)

public data class IMAGEHLP_LINEW64(
    public var SizeOfStruct: UInt = 0u,
    public var Key: Long = 0L,
    public var LineNumber: UInt = 0u,
    public var FileName: PWSTR = 0L,
    public var Address: ULong = 0uL,
)

public class IMAGEHLP_MODULE64(
    public var SizeOfStruct: UInt = 0u,
    public var BaseOfImage: ULong = 0uL,
    public var ImageSize: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var CheckSum: UInt = 0u,
    public var NumSyms: UInt = 0u,
    public var SymType: SYM_TYPE = 0,
    public var ModuleName: ByteArray = ByteArray(32),
    public var ImageName: ByteArray = ByteArray(256),
    public var LoadedImageName: ByteArray = ByteArray(256),
    public var LoadedPdbName: ByteArray = ByteArray(256),
    public var CVSig: UInt = 0u,
    public var CVData: ByteArray = ByteArray(780),
    public var PdbSig: UInt = 0u,
    public var PdbSig70: GUID = GUID(),
    public var PdbAge: UInt = 0u,
    public var PdbUnmatched: BOOL = 0,
    public var DbgUnmatched: BOOL = 0,
    public var LineNumbers: BOOL = 0,
    public var GlobalSymbols: BOOL = 0,
    public var TypeInfo: BOOL = 0,
    public var SourceIndexed: BOOL = 0,
    public var Publics: BOOL = 0,
    public var MachineType: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class IMAGEHLP_MODULE64_EX(public var Module: IMAGEHLP_MODULE64 = IMAGEHLP_MODULE64(), public var RegionFlags: UInt = 0u)

public class IMAGEHLP_MODULEW64(
    public var SizeOfStruct: UInt = 0u,
    public var BaseOfImage: ULong = 0uL,
    public var ImageSize: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var CheckSum: UInt = 0u,
    public var NumSyms: UInt = 0u,
    public var SymType: SYM_TYPE = 0,
    public var ModuleName: UShortArray = UShortArray(32),
    public var ImageName: UShortArray = UShortArray(256),
    public var LoadedImageName: UShortArray = UShortArray(256),
    public var LoadedPdbName: UShortArray = UShortArray(256),
    public var CVSig: UInt = 0u,
    public var CVData: UShortArray = UShortArray(780),
    public var PdbSig: UInt = 0u,
    public var PdbSig70: GUID = GUID(),
    public var PdbAge: UInt = 0u,
    public var PdbUnmatched: BOOL = 0,
    public var DbgUnmatched: BOOL = 0,
    public var LineNumbers: BOOL = 0,
    public var GlobalSymbols: BOOL = 0,
    public var TypeInfo: BOOL = 0,
    public var SourceIndexed: BOOL = 0,
    public var Publics: BOOL = 0,
    public var MachineType: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class IMAGEHLP_MODULEW64_EX(public var Module: IMAGEHLP_MODULEW64 = IMAGEHLP_MODULEW64(), public var RegionFlags: UInt = 0u)

public data class IMAGEHLP_STACK_FRAME(
    public var InstructionOffset: ULong = 0uL,
    public var ReturnOffset: ULong = 0uL,
    public var FrameOffset: ULong = 0uL,
    public var StackOffset: ULong = 0uL,
    public var BackingStoreOffset: ULong = 0uL,
    public var FuncTableEntry: ULong = 0uL,
    public var Params: ULongArray = ULongArray(4),
    public var Reserved: ULongArray = ULongArray(5),
    public var Virtual: BOOL = 0,
    public var Reserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGEHLP_STACK_FRAME) return false
        if (this.InstructionOffset != other.InstructionOffset) return false
        if (this.ReturnOffset != other.ReturnOffset) return false
        if (this.FrameOffset != other.FrameOffset) return false
        if (this.StackOffset != other.StackOffset) return false
        if (this.BackingStoreOffset != other.BackingStoreOffset) return false
        if (this.FuncTableEntry != other.FuncTableEntry) return false
        if (!this.Params.contentEquals(other.Params)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Virtual != other.Virtual) return false
        if (this.Reserved2 != other.Reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InstructionOffset.hashCode()
        result = 31 * result + this.ReturnOffset.hashCode()
        result = 31 * result + this.FrameOffset.hashCode()
        result = 31 * result + this.StackOffset.hashCode()
        result = 31 * result + this.BackingStoreOffset.hashCode()
        result = 31 * result + this.FuncTableEntry.hashCode()
        result = 31 * result + this.Params.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Virtual.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        return result
    }
}

public data class IMAGEHLP_SYMBOL64(
    public var SizeOfStruct: UInt = 0u,
    public var Address: ULong = 0uL,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var MaxNameLength: UInt = 0u,
    public var Name: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGEHLP_SYMBOL64) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.Address != other.Address) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.MaxNameLength != other.MaxNameLength) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.MaxNameLength.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class IMAGEHLP_SYMBOL64_PACKAGE(public var sym: IMAGEHLP_SYMBOL64 = IMAGEHLP_SYMBOL64(), public var name: ByteArray = ByteArray(2001)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGEHLP_SYMBOL64_PACKAGE) return false
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

public data class IMAGEHLP_SYMBOLW64(
    public var SizeOfStruct: UInt = 0u,
    public var Address: ULong = 0uL,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var MaxNameLength: UInt = 0u,
    public var Name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGEHLP_SYMBOLW64) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.Address != other.Address) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.MaxNameLength != other.MaxNameLength) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.MaxNameLength.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class IMAGEHLP_SYMBOLW64_PACKAGE(public var sym: IMAGEHLP_SYMBOLW64 = IMAGEHLP_SYMBOLW64(), public var name: UShortArray = UShortArray(2001)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGEHLP_SYMBOLW64_PACKAGE) return false
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

public data class IMAGEHLP_SYMBOL_SRC(
    public var sizeofstruct: UInt = 0u,
    public var type: UInt = 0u,
    public var file: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGEHLP_SYMBOL_SRC) return false
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

public data class IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY(public var BeginAddress: UInt = 0u, public var Anonymous: IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0 = IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0())

public data class IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0(public var UnwindData: UInt = 0u, public var Anonymous: IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0_0 = IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0_0())

public data class IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0_0(public var _bitfield: UInt = 0u)

public data class IMAGE_COFF_SYMBOLS_HEADER(
    public var NumberOfSymbols: UInt = 0u,
    public var LvaToFirstSymbol: UInt = 0u,
    public var NumberOfLinenumbers: UInt = 0u,
    public var LvaToFirstLinenumber: UInt = 0u,
    public var RvaToFirstByteOfCode: UInt = 0u,
    public var RvaToLastByteOfCode: UInt = 0u,
    public var RvaToFirstByteOfData: UInt = 0u,
    public var RvaToLastByteOfData: UInt = 0u,
)

public data class IMAGE_COR20_HEADER(
    public var cb: UInt = 0u,
    public var MajorRuntimeVersion: UShort = 0u,
    public var MinorRuntimeVersion: UShort = 0u,
    public var MetaData: IMAGE_DATA_DIRECTORY = IMAGE_DATA_DIRECTORY(),
    public var Flags: UInt = 0u,
    public var Anonymous: IMAGE_COR20_HEADER_0 = IMAGE_COR20_HEADER_0(),
    public var Resources: IMAGE_DATA_DIRECTORY = IMAGE_DATA_DIRECTORY(),
    public var StrongNameSignature: IMAGE_DATA_DIRECTORY = IMAGE_DATA_DIRECTORY(),
    public var CodeManagerTable: IMAGE_DATA_DIRECTORY = IMAGE_DATA_DIRECTORY(),
    public var VTableFixups: IMAGE_DATA_DIRECTORY = IMAGE_DATA_DIRECTORY(),
    public var ExportAddressTableJumps: IMAGE_DATA_DIRECTORY = IMAGE_DATA_DIRECTORY(),
    public var ManagedNativeHeader: IMAGE_DATA_DIRECTORY = IMAGE_DATA_DIRECTORY(),
)

public data class IMAGE_COR20_HEADER_0(public var EntryPointToken: UInt = 0u, public var EntryPointRVA: UInt = 0u)

public data class IMAGE_DATA_DIRECTORY(public var VirtualAddress: UInt = 0u, public var Size: UInt = 0u)

public data class IMAGE_DEBUG_DIRECTORY(
    public var Characteristics: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var Type: IMAGE_DEBUG_TYPE = 0u,
    public var SizeOfData: UInt = 0u,
    public var AddressOfRawData: UInt = 0u,
    public var PointerToRawData: UInt = 0u,
)

public data class IMAGE_FILE_HEADER(
    public var Machine: IMAGE_FILE_MACHINE = 0u,
    public var NumberOfSections: UShort = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var PointerToSymbolTable: UInt = 0u,
    public var NumberOfSymbols: UInt = 0u,
    public var SizeOfOptionalHeader: UShort = 0u,
    public var Characteristics: IMAGE_FILE_CHARACTERISTICS = 0u,
)

public data class IMAGE_FUNCTION_ENTRY(
    public var StartingAddress: UInt = 0u,
    public var EndingAddress: UInt = 0u,
    public var EndOfPrologue: UInt = 0u,
)

public data class IMAGE_FUNCTION_ENTRY64(
    public var StartingAddress: ULong = 0uL,
    public var EndingAddress: ULong = 0uL,
    public var Anonymous: IMAGE_FUNCTION_ENTRY64_0 = IMAGE_FUNCTION_ENTRY64_0(),
)

public data class IMAGE_FUNCTION_ENTRY64_0(public var EndOfPrologue: ULong = 0uL, public var UnwindInfoAddress: ULong = 0uL)

public data class IMAGE_LOAD_CONFIG_CODE_INTEGRITY(
    public var Flags: UShort = 0u,
    public var Catalog: UShort = 0u,
    public var CatalogOffset: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public class IMAGE_LOAD_CONFIG_DIRECTORY32(
    public var Size: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var GlobalFlagsClear: UInt = 0u,
    public var GlobalFlagsSet: UInt = 0u,
    public var CriticalSectionDefaultTimeout: UInt = 0u,
    public var DeCommitFreeBlockThreshold: UInt = 0u,
    public var DeCommitTotalFreeThreshold: UInt = 0u,
    public var LockPrefixTable: UInt = 0u,
    public var MaximumAllocationSize: UInt = 0u,
    public var VirtualMemoryThreshold: UInt = 0u,
    public var ProcessHeapFlags: UInt = 0u,
    public var ProcessAffinityMask: UInt = 0u,
    public var CSDVersion: UShort = 0u,
    public var DependentLoadFlags: UShort = 0u,
    public var EditList: UInt = 0u,
    public var SecurityCookie: UInt = 0u,
    public var SEHandlerTable: UInt = 0u,
    public var SEHandlerCount: UInt = 0u,
    public var GuardCFCheckFunctionPointer: UInt = 0u,
    public var GuardCFDispatchFunctionPointer: UInt = 0u,
    public var GuardCFFunctionTable: UInt = 0u,
    public var GuardCFFunctionCount: UInt = 0u,
    public var GuardFlags: UInt = 0u,
    public var CodeIntegrity: IMAGE_LOAD_CONFIG_CODE_INTEGRITY = IMAGE_LOAD_CONFIG_CODE_INTEGRITY(),
    public var GuardAddressTakenIatEntryTable: UInt = 0u,
    public var GuardAddressTakenIatEntryCount: UInt = 0u,
    public var GuardLongJumpTargetTable: UInt = 0u,
    public var GuardLongJumpTargetCount: UInt = 0u,
    public var DynamicValueRelocTable: UInt = 0u,
    public var CHPEMetadataPointer: UInt = 0u,
    public var GuardRFFailureRoutine: UInt = 0u,
    public var GuardRFFailureRoutineFunctionPointer: UInt = 0u,
    public var DynamicValueRelocTableOffset: UInt = 0u,
    public var DynamicValueRelocTableSection: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var GuardRFVerifyStackPointerFunctionPointer: UInt = 0u,
    public var HotPatchTableOffset: UInt = 0u,
    public var Reserved3: UInt = 0u,
    public var EnclaveConfigurationPointer: UInt = 0u,
    public var VolatileMetadataPointer: UInt = 0u,
    public var GuardEHContinuationTable: UInt = 0u,
    public var GuardEHContinuationCount: UInt = 0u,
    public var GuardXFGCheckFunctionPointer: UInt = 0u,
    public var GuardXFGDispatchFunctionPointer: UInt = 0u,
    public var GuardXFGTableDispatchFunctionPointer: UInt = 0u,
    public var CastGuardOsDeterminedFailureMode: UInt = 0u,
    public var GuardMemcpyFunctionPointer: UInt = 0u,
)

public class IMAGE_LOAD_CONFIG_DIRECTORY64(
    public var Size: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var GlobalFlagsClear: UInt = 0u,
    public var GlobalFlagsSet: UInt = 0u,
    public var CriticalSectionDefaultTimeout: UInt = 0u,
    public var DeCommitFreeBlockThreshold: ULong = 0uL,
    public var DeCommitTotalFreeThreshold: ULong = 0uL,
    public var LockPrefixTable: ULong = 0uL,
    public var MaximumAllocationSize: ULong = 0uL,
    public var VirtualMemoryThreshold: ULong = 0uL,
    public var ProcessAffinityMask: ULong = 0uL,
    public var ProcessHeapFlags: UInt = 0u,
    public var CSDVersion: UShort = 0u,
    public var DependentLoadFlags: UShort = 0u,
    public var EditList: ULong = 0uL,
    public var SecurityCookie: ULong = 0uL,
    public var SEHandlerTable: ULong = 0uL,
    public var SEHandlerCount: ULong = 0uL,
    public var GuardCFCheckFunctionPointer: ULong = 0uL,
    public var GuardCFDispatchFunctionPointer: ULong = 0uL,
    public var GuardCFFunctionTable: ULong = 0uL,
    public var GuardCFFunctionCount: ULong = 0uL,
    public var GuardFlags: UInt = 0u,
    public var CodeIntegrity: IMAGE_LOAD_CONFIG_CODE_INTEGRITY = IMAGE_LOAD_CONFIG_CODE_INTEGRITY(),
    public var GuardAddressTakenIatEntryTable: ULong = 0uL,
    public var GuardAddressTakenIatEntryCount: ULong = 0uL,
    public var GuardLongJumpTargetTable: ULong = 0uL,
    public var GuardLongJumpTargetCount: ULong = 0uL,
    public var DynamicValueRelocTable: ULong = 0uL,
    public var CHPEMetadataPointer: ULong = 0uL,
    public var GuardRFFailureRoutine: ULong = 0uL,
    public var GuardRFFailureRoutineFunctionPointer: ULong = 0uL,
    public var DynamicValueRelocTableOffset: UInt = 0u,
    public var DynamicValueRelocTableSection: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var GuardRFVerifyStackPointerFunctionPointer: ULong = 0uL,
    public var HotPatchTableOffset: UInt = 0u,
    public var Reserved3: UInt = 0u,
    public var EnclaveConfigurationPointer: ULong = 0uL,
    public var VolatileMetadataPointer: ULong = 0uL,
    public var GuardEHContinuationTable: ULong = 0uL,
    public var GuardEHContinuationCount: ULong = 0uL,
    public var GuardXFGCheckFunctionPointer: ULong = 0uL,
    public var GuardXFGDispatchFunctionPointer: ULong = 0uL,
    public var GuardXFGTableDispatchFunctionPointer: ULong = 0uL,
    public var CastGuardOsDeterminedFailureMode: ULong = 0uL,
    public var GuardMemcpyFunctionPointer: ULong = 0uL,
)

public data class IMAGE_NT_HEADERS32(
    public var Signature: UInt = 0u,
    public var FileHeader: IMAGE_FILE_HEADER = IMAGE_FILE_HEADER(),
    public var OptionalHeader: IMAGE_OPTIONAL_HEADER32 = IMAGE_OPTIONAL_HEADER32(),
)

public data class IMAGE_NT_HEADERS64(
    public var Signature: UInt = 0u,
    public var FileHeader: IMAGE_FILE_HEADER = IMAGE_FILE_HEADER(),
    public var OptionalHeader: IMAGE_OPTIONAL_HEADER64 = IMAGE_OPTIONAL_HEADER64(),
)

public class IMAGE_OPTIONAL_HEADER32(
    public var Magic: IMAGE_OPTIONAL_HEADER_MAGIC = 0u,
    public var MajorLinkerVersion: UByte = 0u,
    public var MinorLinkerVersion: UByte = 0u,
    public var SizeOfCode: UInt = 0u,
    public var SizeOfInitializedData: UInt = 0u,
    public var SizeOfUninitializedData: UInt = 0u,
    public var AddressOfEntryPoint: UInt = 0u,
    public var BaseOfCode: UInt = 0u,
    public var BaseOfData: UInt = 0u,
    public var ImageBase: UInt = 0u,
    public var SectionAlignment: UInt = 0u,
    public var FileAlignment: UInt = 0u,
    public var MajorOperatingSystemVersion: UShort = 0u,
    public var MinorOperatingSystemVersion: UShort = 0u,
    public var MajorImageVersion: UShort = 0u,
    public var MinorImageVersion: UShort = 0u,
    public var MajorSubsystemVersion: UShort = 0u,
    public var MinorSubsystemVersion: UShort = 0u,
    public var Win32VersionValue: UInt = 0u,
    public var SizeOfImage: UInt = 0u,
    public var SizeOfHeaders: UInt = 0u,
    public var CheckSum: UInt = 0u,
    public var Subsystem: IMAGE_SUBSYSTEM = 0u,
    public var DllCharacteristics: IMAGE_DLL_CHARACTERISTICS = 0u,
    public var SizeOfStackReserve: UInt = 0u,
    public var SizeOfStackCommit: UInt = 0u,
    public var SizeOfHeapReserve: UInt = 0u,
    public var SizeOfHeapCommit: UInt = 0u,
    public var LoaderFlags: UInt = 0u,
    public var NumberOfRvaAndSizes: UInt = 0u,
    public var DataDirectory: List<IMAGE_DATA_DIRECTORY> = List(16) { IMAGE_DATA_DIRECTORY() },
)

public class IMAGE_OPTIONAL_HEADER64(
    public var Magic: IMAGE_OPTIONAL_HEADER_MAGIC = 0u,
    public var MajorLinkerVersion: UByte = 0u,
    public var MinorLinkerVersion: UByte = 0u,
    public var SizeOfCode: UInt = 0u,
    public var SizeOfInitializedData: UInt = 0u,
    public var SizeOfUninitializedData: UInt = 0u,
    public var AddressOfEntryPoint: UInt = 0u,
    public var BaseOfCode: UInt = 0u,
    public var ImageBase: ULong = 0uL,
    public var SectionAlignment: UInt = 0u,
    public var FileAlignment: UInt = 0u,
    public var MajorOperatingSystemVersion: UShort = 0u,
    public var MinorOperatingSystemVersion: UShort = 0u,
    public var MajorImageVersion: UShort = 0u,
    public var MinorImageVersion: UShort = 0u,
    public var MajorSubsystemVersion: UShort = 0u,
    public var MinorSubsystemVersion: UShort = 0u,
    public var Win32VersionValue: UInt = 0u,
    public var SizeOfImage: UInt = 0u,
    public var SizeOfHeaders: UInt = 0u,
    public var CheckSum: UInt = 0u,
    public var Subsystem: IMAGE_SUBSYSTEM = 0u,
    public var DllCharacteristics: IMAGE_DLL_CHARACTERISTICS = 0u,
    public var SizeOfStackReserve: ULong = 0uL,
    public var SizeOfStackCommit: ULong = 0uL,
    public var SizeOfHeapReserve: ULong = 0uL,
    public var SizeOfHeapCommit: ULong = 0uL,
    public var LoaderFlags: UInt = 0u,
    public var NumberOfRvaAndSizes: UInt = 0u,
    public var DataDirectory: List<IMAGE_DATA_DIRECTORY> = List(16) { IMAGE_DATA_DIRECTORY() },
)

public data class IMAGE_ROM_HEADERS(public var FileHeader: IMAGE_FILE_HEADER = IMAGE_FILE_HEADER(), public var OptionalHeader: IMAGE_ROM_OPTIONAL_HEADER = IMAGE_ROM_OPTIONAL_HEADER())

public data class IMAGE_ROM_OPTIONAL_HEADER(
    public var Magic: UShort = 0u,
    public var MajorLinkerVersion: UByte = 0u,
    public var MinorLinkerVersion: UByte = 0u,
    public var SizeOfCode: UInt = 0u,
    public var SizeOfInitializedData: UInt = 0u,
    public var SizeOfUninitializedData: UInt = 0u,
    public var AddressOfEntryPoint: UInt = 0u,
    public var BaseOfCode: UInt = 0u,
    public var BaseOfData: UInt = 0u,
    public var BaseOfBss: UInt = 0u,
    public var GprMask: UInt = 0u,
    public var CprMask: UIntArray = UIntArray(4),
    public var GpValue: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_ROM_OPTIONAL_HEADER) return false
        if (this.Magic != other.Magic) return false
        if (this.MajorLinkerVersion != other.MajorLinkerVersion) return false
        if (this.MinorLinkerVersion != other.MinorLinkerVersion) return false
        if (this.SizeOfCode != other.SizeOfCode) return false
        if (this.SizeOfInitializedData != other.SizeOfInitializedData) return false
        if (this.SizeOfUninitializedData != other.SizeOfUninitializedData) return false
        if (this.AddressOfEntryPoint != other.AddressOfEntryPoint) return false
        if (this.BaseOfCode != other.BaseOfCode) return false
        if (this.BaseOfData != other.BaseOfData) return false
        if (this.BaseOfBss != other.BaseOfBss) return false
        if (this.GprMask != other.GprMask) return false
        if (!this.CprMask.contentEquals(other.CprMask)) return false
        if (this.GpValue != other.GpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Magic.hashCode()
        result = 31 * result + this.MajorLinkerVersion.hashCode()
        result = 31 * result + this.MinorLinkerVersion.hashCode()
        result = 31 * result + this.SizeOfCode.hashCode()
        result = 31 * result + this.SizeOfInitializedData.hashCode()
        result = 31 * result + this.SizeOfUninitializedData.hashCode()
        result = 31 * result + this.AddressOfEntryPoint.hashCode()
        result = 31 * result + this.BaseOfCode.hashCode()
        result = 31 * result + this.BaseOfData.hashCode()
        result = 31 * result + this.BaseOfBss.hashCode()
        result = 31 * result + this.GprMask.hashCode()
        result = 31 * result + this.CprMask.contentHashCode()
        result = 31 * result + this.GpValue.hashCode()
        return result
    }
}

public data class IMAGE_RUNTIME_FUNCTION_ENTRY(
    public var BeginAddress: UInt = 0u,
    public var EndAddress: UInt = 0u,
    public var Anonymous: IMAGE_RUNTIME_FUNCTION_ENTRY_0 = IMAGE_RUNTIME_FUNCTION_ENTRY_0(),
)

public data class IMAGE_RUNTIME_FUNCTION_ENTRY_0(public var UnwindInfoAddress: UInt = 0u, public var UnwindData: UInt = 0u)

public data class IMAGE_SECTION_HEADER(
    public var Name: UByteArray = UByteArray(8),
    public var Misc: IMAGE_SECTION_HEADER_0 = IMAGE_SECTION_HEADER_0(),
    public var VirtualAddress: UInt = 0u,
    public var SizeOfRawData: UInt = 0u,
    public var PointerToRawData: UInt = 0u,
    public var PointerToRelocations: UInt = 0u,
    public var PointerToLinenumbers: UInt = 0u,
    public var NumberOfRelocations: UShort = 0u,
    public var NumberOfLinenumbers: UShort = 0u,
    public var Characteristics: IMAGE_SECTION_CHARACTERISTICS = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMAGE_SECTION_HEADER) return false
        if (!this.Name.contentEquals(other.Name)) return false
        if (this.Misc != other.Misc) return false
        if (this.VirtualAddress != other.VirtualAddress) return false
        if (this.SizeOfRawData != other.SizeOfRawData) return false
        if (this.PointerToRawData != other.PointerToRawData) return false
        if (this.PointerToRelocations != other.PointerToRelocations) return false
        if (this.PointerToLinenumbers != other.PointerToLinenumbers) return false
        if (this.NumberOfRelocations != other.NumberOfRelocations) return false
        if (this.NumberOfLinenumbers != other.NumberOfLinenumbers) return false
        if (this.Characteristics != other.Characteristics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Name.contentHashCode()
        result = 31 * result + this.Misc.hashCode()
        result = 31 * result + this.VirtualAddress.hashCode()
        result = 31 * result + this.SizeOfRawData.hashCode()
        result = 31 * result + this.PointerToRawData.hashCode()
        result = 31 * result + this.PointerToRelocations.hashCode()
        result = 31 * result + this.PointerToLinenumbers.hashCode()
        result = 31 * result + this.NumberOfRelocations.hashCode()
        result = 31 * result + this.NumberOfLinenumbers.hashCode()
        result = 31 * result + this.Characteristics.hashCode()
        return result
    }
}

public data class IMAGE_SECTION_HEADER_0(public var PhysicalAddress: UInt = 0u, public var VirtualSize: UInt = 0u)

public data class IPMI_OS_SEL_RECORD(
    public var Signature: UInt = 0u,
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var RecordType: IPMI_OS_SEL_RECORD_TYPE = 0,
    public var DataLength: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IPMI_OS_SEL_RECORD) return false
        if (this.Signature != other.Signature) return false
        if (this.Version != other.Version) return false
        if (this.Length != other.Length) return false
        if (this.RecordType != other.RecordType) return false
        if (this.DataLength != other.DataLength) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Signature.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.RecordType.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public class KDHELP64(
    public var Thread: ULong = 0uL,
    public var ThCallbackStack: UInt = 0u,
    public var ThCallbackBStore: UInt = 0u,
    public var NextCallback: UInt = 0u,
    public var FramePointer: UInt = 0u,
    public var KiCallUserMode: ULong = 0uL,
    public var KeUserCallbackDispatcher: ULong = 0uL,
    public var SystemRangeStart: ULong = 0uL,
    public var KiUserExceptionDispatcher: ULong = 0uL,
    public var StackBase: ULong = 0uL,
    public var StackLimit: ULong = 0uL,
    public var BuildVersion: UInt = 0u,
    public var RetpolineStubFunctionTableSize: UInt = 0u,
    public var RetpolineStubFunctionTable: ULong = 0uL,
    public var RetpolineStubOffset: UInt = 0u,
    public var RetpolineStubSize: UInt = 0u,
    public var Reserved0: ULongArray = ULongArray(2),
)

public data class KNONVOLATILE_CONTEXT_POINTERS(public var Anonymous1: KNONVOLATILE_CONTEXT_POINTERS_0 = KNONVOLATILE_CONTEXT_POINTERS_0(), public var Anonymous2: KNONVOLATILE_CONTEXT_POINTERS_1 = KNONVOLATILE_CONTEXT_POINTERS_1())

public data class KNONVOLATILE_CONTEXT_POINTERS_0(public var FloatingContext: LongArray = LongArray(16), public var Anonymous: KNONVOLATILE_CONTEXT_POINTERS_0_0 = KNONVOLATILE_CONTEXT_POINTERS_0_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KNONVOLATILE_CONTEXT_POINTERS_0) return false
        if (!this.FloatingContext.contentEquals(other.FloatingContext)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FloatingContext.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class KNONVOLATILE_CONTEXT_POINTERS_0_0(
    public var Xmm0: Long = 0L,
    public var Xmm1: Long = 0L,
    public var Xmm2: Long = 0L,
    public var Xmm3: Long = 0L,
    public var Xmm4: Long = 0L,
    public var Xmm5: Long = 0L,
    public var Xmm6: Long = 0L,
    public var Xmm7: Long = 0L,
    public var Xmm8: Long = 0L,
    public var Xmm9: Long = 0L,
    public var Xmm10: Long = 0L,
    public var Xmm11: Long = 0L,
    public var Xmm12: Long = 0L,
    public var Xmm13: Long = 0L,
    public var Xmm14: Long = 0L,
    public var Xmm15: Long = 0L,
)

public data class KNONVOLATILE_CONTEXT_POINTERS_1(public var IntegerContext: LongArray = LongArray(16), public var Anonymous: KNONVOLATILE_CONTEXT_POINTERS_1_0 = KNONVOLATILE_CONTEXT_POINTERS_1_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KNONVOLATILE_CONTEXT_POINTERS_1) return false
        if (!this.IntegerContext.contentEquals(other.IntegerContext)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.IntegerContext.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class KNONVOLATILE_CONTEXT_POINTERS_1_0(
    public var Rax: Long = 0L,
    public var Rcx: Long = 0L,
    public var Rdx: Long = 0L,
    public var Rbx: Long = 0L,
    public var Rsp: Long = 0L,
    public var Rbp: Long = 0L,
    public var Rsi: Long = 0L,
    public var Rdi: Long = 0L,
    public var R8: Long = 0L,
    public var R9: Long = 0L,
    public var R10: Long = 0L,
    public var R11: Long = 0L,
    public var R12: Long = 0L,
    public var R13: Long = 0L,
    public var R14: Long = 0L,
    public var R15: Long = 0L,
)

public data class LDT_ENTRY(
    public var LimitLow: UShort = 0u,
    public var BaseLow: UShort = 0u,
    public var HighWord: LDT_ENTRY_0 = LDT_ENTRY_0(),
)

public data class LDT_ENTRY_0(public var Bytes: LDT_ENTRY_0_0 = LDT_ENTRY_0_0(), public var Bits: LDT_ENTRY_0_1 = LDT_ENTRY_0_1())

public data class LDT_ENTRY_0_1(public var _bitfield: UInt = 0u)

public data class LDT_ENTRY_0_0(
    public var BaseMid: UByte = 0u,
    public var Flags1: UByte = 0u,
    public var Flags2: UByte = 0u,
    public var BaseHi: UByte = 0u,
)

public data class LOADED_IMAGE(
    public var ModuleName: PSTR = 0L,
    public var hFile: HANDLE = 0L,
    public var MappedAddress: Long = 0L,
    public var FileHeader: Long = 0L,
    public var LastRvaSection: Long = 0L,
    public var NumberOfSections: UInt = 0u,
    public var Sections: Long = 0L,
    public var Characteristics: IMAGE_FILE_CHARACTERISTICS2 = 0u,
    public var fSystemImage: Boolean = false,
    public var fDOSImage: Boolean = false,
    public var fReadOnly: Boolean = false,
    public var Version: UByte = 0u,
    public var Links: LIST_ENTRY = LIST_ENTRY(),
    public var SizeOfImage: UInt = 0u,
)

public data class LOAD_DLL_DEBUG_INFO(
    public var hFile: HANDLE = 0L,
    public var lpBaseOfDll: Long = 0L,
    public var dwDebugInfoFileOffset: UInt = 0u,
    public var nDebugInfoSize: UInt = 0u,
    public var lpImageName: Long = 0L,
    public var fUnicode: UShort = 0u,
)

public data class M128A(public var Low: ULong = 0uL, public var High: Long = 0L)

public data class MINIDUMP_CALLBACK_INFORMATION(public var CallbackRoutine: MINIDUMP_CALLBACK_ROUTINE = null, public var CallbackParam: Long = 0L)

public data class MINIDUMP_CALLBACK_INPUT(
    public var ProcessId: UInt = 0u,
    public var ProcessHandle: HANDLE = 0L,
    public var CallbackType: UInt = 0u,
    public var Anonymous: MINIDUMP_CALLBACK_INPUT_0 = MINIDUMP_CALLBACK_INPUT_0(),
)

public data class MINIDUMP_CALLBACK_INPUT_0(
    public var Status: HRESULT = 0,
    public var Thread: MINIDUMP_THREAD_CALLBACK = MINIDUMP_THREAD_CALLBACK(),
    public var ThreadEx: MINIDUMP_THREAD_EX_CALLBACK = MINIDUMP_THREAD_EX_CALLBACK(),
    public var Module: MINIDUMP_MODULE_CALLBACK = MINIDUMP_MODULE_CALLBACK(),
    public var IncludeThread: MINIDUMP_INCLUDE_THREAD_CALLBACK = MINIDUMP_INCLUDE_THREAD_CALLBACK(),
    public var IncludeModule: MINIDUMP_INCLUDE_MODULE_CALLBACK = MINIDUMP_INCLUDE_MODULE_CALLBACK(),
    public var Io: MINIDUMP_IO_CALLBACK = MINIDUMP_IO_CALLBACK(),
    public var ReadMemoryFailure: MINIDUMP_READ_MEMORY_FAILURE_CALLBACK = MINIDUMP_READ_MEMORY_FAILURE_CALLBACK(),
    public var SecondaryFlags: UInt = 0u,
    public var VmQuery: MINIDUMP_VM_QUERY_CALLBACK = MINIDUMP_VM_QUERY_CALLBACK(),
    public var VmPreRead: MINIDUMP_VM_PRE_READ_CALLBACK = MINIDUMP_VM_PRE_READ_CALLBACK(),
    public var VmPostRead: MINIDUMP_VM_POST_READ_CALLBACK = MINIDUMP_VM_POST_READ_CALLBACK(),
)

public data class MINIDUMP_CALLBACK_OUTPUT(public var Anonymous: MINIDUMP_CALLBACK_OUTPUT_0 = MINIDUMP_CALLBACK_OUTPUT_0())

public data class MINIDUMP_CALLBACK_OUTPUT_0(
    public var ModuleWriteFlags: UInt = 0u,
    public var ThreadWriteFlags: UInt = 0u,
    public var SecondaryFlags: UInt = 0u,
    public var Anonymous1: MINIDUMP_CALLBACK_OUTPUT_0_0 = MINIDUMP_CALLBACK_OUTPUT_0_0(),
    public var Anonymous2: MINIDUMP_CALLBACK_OUTPUT_0_1 = MINIDUMP_CALLBACK_OUTPUT_0_1(),
    public var Handle: HANDLE = 0L,
    public var Anonymous3: MINIDUMP_CALLBACK_OUTPUT_0_2 = MINIDUMP_CALLBACK_OUTPUT_0_2(),
    public var Anonymous4: MINIDUMP_CALLBACK_OUTPUT_0_3 = MINIDUMP_CALLBACK_OUTPUT_0_3(),
    public var Anonymous5: MINIDUMP_CALLBACK_OUTPUT_0_4 = MINIDUMP_CALLBACK_OUTPUT_0_4(),
    public var Status: HRESULT = 0,
)

public data class MINIDUMP_CALLBACK_OUTPUT_0_0(public var MemoryBase: ULong = 0uL, public var MemorySize: UInt = 0u)

public data class MINIDUMP_CALLBACK_OUTPUT_0_1(public var CheckCancel: BOOL = 0, public var Cancel: BOOL = 0)

public data class MINIDUMP_CALLBACK_OUTPUT_0_2(public var VmRegion: MINIDUMP_MEMORY_INFO = MINIDUMP_MEMORY_INFO(), public var Continue: BOOL = 0)

public data class MINIDUMP_CALLBACK_OUTPUT_0_3(public var VmQueryStatus: HRESULT = 0, public var VmQueryResult: MINIDUMP_MEMORY_INFO = MINIDUMP_MEMORY_INFO())

public data class MINIDUMP_CALLBACK_OUTPUT_0_4(public var VmReadStatus: HRESULT = 0, public var VmReadBytesCompleted: UInt = 0u)

public data class MINIDUMP_DIRECTORY(public var StreamType: UInt = 0u, public var Location: MINIDUMP_LOCATION_DESCRIPTOR = MINIDUMP_LOCATION_DESCRIPTOR())

public data class MINIDUMP_EXCEPTION(
    public var ExceptionCode: UInt = 0u,
    public var ExceptionFlags: UInt = 0u,
    public var ExceptionRecord: ULong = 0uL,
    public var ExceptionAddress: ULong = 0uL,
    public var NumberParameters: UInt = 0u,
    public var __unusedAlignment: UInt = 0u,
    public var ExceptionInformation: ULongArray = ULongArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MINIDUMP_EXCEPTION) return false
        if (this.ExceptionCode != other.ExceptionCode) return false
        if (this.ExceptionFlags != other.ExceptionFlags) return false
        if (this.ExceptionRecord != other.ExceptionRecord) return false
        if (this.ExceptionAddress != other.ExceptionAddress) return false
        if (this.NumberParameters != other.NumberParameters) return false
        if (this.__unusedAlignment != other.__unusedAlignment) return false
        if (!this.ExceptionInformation.contentEquals(other.ExceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ExceptionCode.hashCode()
        result = 31 * result + this.ExceptionFlags.hashCode()
        result = 31 * result + this.ExceptionRecord.hashCode()
        result = 31 * result + this.ExceptionAddress.hashCode()
        result = 31 * result + this.NumberParameters.hashCode()
        result = 31 * result + this.__unusedAlignment.hashCode()
        result = 31 * result + this.ExceptionInformation.contentHashCode()
        return result
    }
}

public data class MINIDUMP_EXCEPTION_INFORMATION(
    public var ThreadId: UInt = 0u,
    public var ExceptionPointers: Long = 0L,
    public var ClientPointers: BOOL = 0,
)

public data class MINIDUMP_EXCEPTION_INFORMATION64(
    public var ThreadId: UInt = 0u,
    public var ExceptionRecord: ULong = 0uL,
    public var ContextRecord: ULong = 0uL,
    public var ClientPointers: BOOL = 0,
)

public data class MINIDUMP_EXCEPTION_STREAM(
    public var ThreadId: UInt = 0u,
    public var __alignment: UInt = 0u,
    public var ExceptionRecord: MINIDUMP_EXCEPTION = MINIDUMP_EXCEPTION(),
    public var ThreadContext: MINIDUMP_LOCATION_DESCRIPTOR = MINIDUMP_LOCATION_DESCRIPTOR(),
)

public data class MINIDUMP_FUNCTION_TABLE_DESCRIPTOR(
    public var MinimumAddress: ULong = 0uL,
    public var MaximumAddress: ULong = 0uL,
    public var BaseAddress: ULong = 0uL,
    public var EntryCount: UInt = 0u,
    public var SizeOfAlignPad: UInt = 0u,
)

public data class MINIDUMP_FUNCTION_TABLE_STREAM(
    public var SizeOfHeader: UInt = 0u,
    public var SizeOfDescriptor: UInt = 0u,
    public var SizeOfNativeDescriptor: UInt = 0u,
    public var SizeOfFunctionEntry: UInt = 0u,
    public var NumberOfDescriptors: UInt = 0u,
    public var SizeOfAlignPad: UInt = 0u,
)

public data class MINIDUMP_HANDLE_DATA_STREAM(
    public var SizeOfHeader: UInt = 0u,
    public var SizeOfDescriptor: UInt = 0u,
    public var NumberOfDescriptors: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class MINIDUMP_HANDLE_DESCRIPTOR(
    public var Handle: ULong = 0uL,
    public var TypeNameRva: UInt = 0u,
    public var ObjectNameRva: UInt = 0u,
    public var Attributes: UInt = 0u,
    public var GrantedAccess: UInt = 0u,
    public var HandleCount: UInt = 0u,
    public var PointerCount: UInt = 0u,
)

public data class MINIDUMP_HANDLE_DESCRIPTOR_2(
    public var Handle: ULong = 0uL,
    public var TypeNameRva: UInt = 0u,
    public var ObjectNameRva: UInt = 0u,
    public var Attributes: UInt = 0u,
    public var GrantedAccess: UInt = 0u,
    public var HandleCount: UInt = 0u,
    public var PointerCount: UInt = 0u,
    public var ObjectInfoRva: UInt = 0u,
    public var Reserved0: UInt = 0u,
)

public data class MINIDUMP_HANDLE_OBJECT_INFORMATION(
    public var NextInfoRva: UInt = 0u,
    public var InfoType: UInt = 0u,
    public var SizeOfInfo: UInt = 0u,
)

public data class MINIDUMP_HANDLE_OPERATION_LIST(
    public var SizeOfHeader: UInt = 0u,
    public var SizeOfEntry: UInt = 0u,
    public var NumberOfEntries: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class MINIDUMP_HEADER(
    public var Signature: UInt = 0u,
    public var Version: UInt = 0u,
    public var NumberOfStreams: UInt = 0u,
    public var StreamDirectoryRva: UInt = 0u,
    public var CheckSum: UInt = 0u,
    public var Anonymous: MINIDUMP_HEADER_0 = MINIDUMP_HEADER_0(),
    public var Flags: ULong = 0uL,
)

public data class MINIDUMP_HEADER_0(public var Reserved: UInt = 0u, public var TimeDateStamp: UInt = 0u)

public data class MINIDUMP_INCLUDE_MODULE_CALLBACK(public var BaseOfImage: ULong = 0uL)

public data class MINIDUMP_INCLUDE_THREAD_CALLBACK(public var ThreadId: UInt = 0u)

public data class MINIDUMP_IO_CALLBACK(
    public var Handle: HANDLE = 0L,
    public var Offset: ULong = 0uL,
    public var Buffer: Long = 0L,
    public var BufferBytes: UInt = 0u,
)

public data class MINIDUMP_LOCATION_DESCRIPTOR(public var DataSize: UInt = 0u, public var Rva: UInt = 0u)

public data class MINIDUMP_LOCATION_DESCRIPTOR64(public var DataSize: ULong = 0uL, public var Rva: ULong = 0uL)

public data class MINIDUMP_MEMORY64_LIST(
    public var NumberOfMemoryRanges: ULong = 0uL,
    public var BaseRva: ULong = 0uL,
    public var MemoryRanges: List<MINIDUMP_MEMORY_DESCRIPTOR64> = List(1) { MINIDUMP_MEMORY_DESCRIPTOR64() },
)

public data class MINIDUMP_MEMORY_DESCRIPTOR(public var StartOfMemoryRange: ULong = 0uL, public var Memory: MINIDUMP_LOCATION_DESCRIPTOR = MINIDUMP_LOCATION_DESCRIPTOR())

public data class MINIDUMP_MEMORY_DESCRIPTOR64(public var StartOfMemoryRange: ULong = 0uL, public var DataSize: ULong = 0uL)

public data class MINIDUMP_MEMORY_INFO(
    public var BaseAddress: ULong = 0uL,
    public var AllocationBase: ULong = 0uL,
    public var AllocationProtect: UInt = 0u,
    public var __alignment1: UInt = 0u,
    public var RegionSize: ULong = 0uL,
    public var State: VIRTUAL_ALLOCATION_TYPE = 0u,
    public var Protect: UInt = 0u,
    public var Type: UInt = 0u,
    public var __alignment2: UInt = 0u,
)

public data class MINIDUMP_MEMORY_INFO_LIST(
    public var SizeOfHeader: UInt = 0u,
    public var SizeOfEntry: UInt = 0u,
    public var NumberOfEntries: ULong = 0uL,
)

public data class MINIDUMP_MEMORY_LIST(public var NumberOfMemoryRanges: UInt = 0u, public var MemoryRanges: List<MINIDUMP_MEMORY_DESCRIPTOR> = List(1) { MINIDUMP_MEMORY_DESCRIPTOR() })

public data class MINIDUMP_MISC_INFO(
    public var SizeOfInfo: UInt = 0u,
    public var Flags1: MINIDUMP_MISC_INFO_FLAGS = 0u,
    public var ProcessId: UInt = 0u,
    public var ProcessCreateTime: UInt = 0u,
    public var ProcessUserTime: UInt = 0u,
    public var ProcessKernelTime: UInt = 0u,
)

public data class MINIDUMP_MISC_INFO_2(
    public var SizeOfInfo: UInt = 0u,
    public var Flags1: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var ProcessCreateTime: UInt = 0u,
    public var ProcessUserTime: UInt = 0u,
    public var ProcessKernelTime: UInt = 0u,
    public var ProcessorMaxMhz: UInt = 0u,
    public var ProcessorCurrentMhz: UInt = 0u,
    public var ProcessorMhzLimit: UInt = 0u,
    public var ProcessorMaxIdleState: UInt = 0u,
    public var ProcessorCurrentIdleState: UInt = 0u,
)

public data class MINIDUMP_MISC_INFO_3(
    public var SizeOfInfo: UInt = 0u,
    public var Flags1: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var ProcessCreateTime: UInt = 0u,
    public var ProcessUserTime: UInt = 0u,
    public var ProcessKernelTime: UInt = 0u,
    public var ProcessorMaxMhz: UInt = 0u,
    public var ProcessorCurrentMhz: UInt = 0u,
    public var ProcessorMhzLimit: UInt = 0u,
    public var ProcessorMaxIdleState: UInt = 0u,
    public var ProcessorCurrentIdleState: UInt = 0u,
    public var ProcessIntegrityLevel: UInt = 0u,
    public var ProcessExecuteFlags: UInt = 0u,
    public var ProtectedProcess: UInt = 0u,
    public var TimeZoneId: UInt = 0u,
    public var TimeZone: TIME_ZONE_INFORMATION = TIME_ZONE_INFORMATION(),
)

public class MINIDUMP_MISC_INFO_4(
    public var SizeOfInfo: UInt = 0u,
    public var Flags1: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var ProcessCreateTime: UInt = 0u,
    public var ProcessUserTime: UInt = 0u,
    public var ProcessKernelTime: UInt = 0u,
    public var ProcessorMaxMhz: UInt = 0u,
    public var ProcessorCurrentMhz: UInt = 0u,
    public var ProcessorMhzLimit: UInt = 0u,
    public var ProcessorMaxIdleState: UInt = 0u,
    public var ProcessorCurrentIdleState: UInt = 0u,
    public var ProcessIntegrityLevel: UInt = 0u,
    public var ProcessExecuteFlags: UInt = 0u,
    public var ProtectedProcess: UInt = 0u,
    public var TimeZoneId: UInt = 0u,
    public var TimeZone: TIME_ZONE_INFORMATION = TIME_ZONE_INFORMATION(),
    public var BuildString: UShortArray = UShortArray(260),
    public var DbgBldStr: UShortArray = UShortArray(40),
)

public class MINIDUMP_MISC_INFO_5(
    public var SizeOfInfo: UInt = 0u,
    public var Flags1: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var ProcessCreateTime: UInt = 0u,
    public var ProcessUserTime: UInt = 0u,
    public var ProcessKernelTime: UInt = 0u,
    public var ProcessorMaxMhz: UInt = 0u,
    public var ProcessorCurrentMhz: UInt = 0u,
    public var ProcessorMhzLimit: UInt = 0u,
    public var ProcessorMaxIdleState: UInt = 0u,
    public var ProcessorCurrentIdleState: UInt = 0u,
    public var ProcessIntegrityLevel: UInt = 0u,
    public var ProcessExecuteFlags: UInt = 0u,
    public var ProtectedProcess: UInt = 0u,
    public var TimeZoneId: UInt = 0u,
    public var TimeZone: TIME_ZONE_INFORMATION = TIME_ZONE_INFORMATION(),
    public var BuildString: UShortArray = UShortArray(260),
    public var DbgBldStr: UShortArray = UShortArray(40),
    public var XStateData: XSTATE_CONFIG_FEATURE_MSC_INFO = XSTATE_CONFIG_FEATURE_MSC_INFO(),
    public var ProcessCookie: UInt = 0u,
)

public data class MINIDUMP_MODULE(
    public var BaseOfImage: ULong = 0uL,
    public var SizeOfImage: UInt = 0u,
    public var CheckSum: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var ModuleNameRva: UInt = 0u,
    public var VersionInfo: VS_FIXEDFILEINFO = VS_FIXEDFILEINFO(),
    public var CvRecord: MINIDUMP_LOCATION_DESCRIPTOR = MINIDUMP_LOCATION_DESCRIPTOR(),
    public var MiscRecord: MINIDUMP_LOCATION_DESCRIPTOR = MINIDUMP_LOCATION_DESCRIPTOR(),
    public var Reserved0: ULong = 0uL,
    public var Reserved1: ULong = 0uL,
)

public data class MINIDUMP_MODULE_CALLBACK(
    public var FullPath: PWSTR = 0L,
    public var BaseOfImage: ULong = 0uL,
    public var SizeOfImage: UInt = 0u,
    public var CheckSum: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var VersionInfo: VS_FIXEDFILEINFO = VS_FIXEDFILEINFO(),
    public var CvRecord: Long = 0L,
    public var SizeOfCvRecord: UInt = 0u,
    public var MiscRecord: Long = 0L,
    public var SizeOfMiscRecord: UInt = 0u,
)

public data class MINIDUMP_MODULE_LIST(public var NumberOfModules: UInt = 0u, public var Modules: List<MINIDUMP_MODULE> = List(1) { MINIDUMP_MODULE() })

public data class MINIDUMP_PROCESS_VM_COUNTERS_1(
    public var Revision: UShort = 0u,
    public var PageFaultCount: UInt = 0u,
    public var PeakWorkingSetSize: ULong = 0uL,
    public var WorkingSetSize: ULong = 0uL,
    public var QuotaPeakPagedPoolUsage: ULong = 0uL,
    public var QuotaPagedPoolUsage: ULong = 0uL,
    public var QuotaPeakNonPagedPoolUsage: ULong = 0uL,
    public var QuotaNonPagedPoolUsage: ULong = 0uL,
    public var PagefileUsage: ULong = 0uL,
    public var PeakPagefileUsage: ULong = 0uL,
    public var PrivateUsage: ULong = 0uL,
)

public class MINIDUMP_PROCESS_VM_COUNTERS_2(
    public var Revision: UShort = 0u,
    public var Flags: UShort = 0u,
    public var PageFaultCount: UInt = 0u,
    public var PeakWorkingSetSize: ULong = 0uL,
    public var WorkingSetSize: ULong = 0uL,
    public var QuotaPeakPagedPoolUsage: ULong = 0uL,
    public var QuotaPagedPoolUsage: ULong = 0uL,
    public var QuotaPeakNonPagedPoolUsage: ULong = 0uL,
    public var QuotaNonPagedPoolUsage: ULong = 0uL,
    public var PagefileUsage: ULong = 0uL,
    public var PeakPagefileUsage: ULong = 0uL,
    public var PeakVirtualSize: ULong = 0uL,
    public var VirtualSize: ULong = 0uL,
    public var PrivateUsage: ULong = 0uL,
    public var PrivateWorkingSetSize: ULong = 0uL,
    public var SharedCommitUsage: ULong = 0uL,
    public var JobSharedCommitUsage: ULong = 0uL,
    public var JobPrivateCommitUsage: ULong = 0uL,
    public var JobPeakPrivateCommitUsage: ULong = 0uL,
    public var JobPrivateCommitLimit: ULong = 0uL,
    public var JobTotalCommitLimit: ULong = 0uL,
)

public data class MINIDUMP_READ_MEMORY_FAILURE_CALLBACK(
    public var Offset: ULong = 0uL,
    public var Bytes: UInt = 0u,
    public var FailureStatus: HRESULT = 0,
)

public data class MINIDUMP_STRING(public var Length: UInt = 0u, public var Buffer: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MINIDUMP_STRING) return false
        if (this.Length != other.Length) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class MINIDUMP_SYSTEM_BASIC_INFORMATION(
    public var TimerResolution: UInt = 0u,
    public var PageSize: UInt = 0u,
    public var NumberOfPhysicalPages: UInt = 0u,
    public var LowestPhysicalPageNumber: UInt = 0u,
    public var HighestPhysicalPageNumber: UInt = 0u,
    public var AllocationGranularity: UInt = 0u,
    public var MinimumUserModeAddress: ULong = 0uL,
    public var MaximumUserModeAddress: ULong = 0uL,
    public var ActiveProcessorsAffinityMask: ULong = 0uL,
    public var NumberOfProcessors: UInt = 0u,
)

public data class MINIDUMP_SYSTEM_BASIC_PERFORMANCE_INFORMATION(
    public var AvailablePages: ULong = 0uL,
    public var CommittedPages: ULong = 0uL,
    public var CommitLimit: ULong = 0uL,
    public var PeakCommitment: ULong = 0uL,
)

public data class MINIDUMP_SYSTEM_FILECACHE_INFORMATION(
    public var CurrentSize: ULong = 0uL,
    public var PeakSize: ULong = 0uL,
    public var PageFaultCount: UInt = 0u,
    public var MinimumWorkingSet: ULong = 0uL,
    public var MaximumWorkingSet: ULong = 0uL,
    public var CurrentSizeIncludingTransitionInPages: ULong = 0uL,
    public var PeakSizeIncludingTransitionInPages: ULong = 0uL,
    public var TransitionRePurposeCount: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class MINIDUMP_SYSTEM_INFO(
    public var ProcessorArchitecture: PROCESSOR_ARCHITECTURE = 0u,
    public var ProcessorLevel: UShort = 0u,
    public var ProcessorRevision: UShort = 0u,
    public var Anonymous1: MINIDUMP_SYSTEM_INFO_0 = MINIDUMP_SYSTEM_INFO_0(),
    public var MajorVersion: UInt = 0u,
    public var MinorVersion: UInt = 0u,
    public var BuildNumber: UInt = 0u,
    public var PlatformId: VER_PLATFORM = 0u,
    public var CSDVersionRva: UInt = 0u,
    public var Anonymous2: MINIDUMP_SYSTEM_INFO_1 = MINIDUMP_SYSTEM_INFO_1(),
    public var Cpu: CPU_INFORMATION = CPU_INFORMATION(),
)

public data class MINIDUMP_SYSTEM_INFO_0(public var Reserved0: UShort = 0u, public var Anonymous: MINIDUMP_SYSTEM_INFO_0_0 = MINIDUMP_SYSTEM_INFO_0_0())

public data class MINIDUMP_SYSTEM_INFO_0_0(public var NumberOfProcessors: UByte = 0u, public var ProductType: UByte = 0u)

public data class MINIDUMP_SYSTEM_INFO_1(public var Reserved1: UInt = 0u, public var Anonymous: MINIDUMP_SYSTEM_INFO_1_0 = MINIDUMP_SYSTEM_INFO_1_0())

public data class MINIDUMP_SYSTEM_INFO_1_0(public var SuiteMask: UShort = 0u, public var Reserved2: UShort = 0u)

public data class MINIDUMP_SYSTEM_MEMORY_INFO_1(
    public var Revision: UShort = 0u,
    public var Flags: UShort = 0u,
    public var BasicInfo: MINIDUMP_SYSTEM_BASIC_INFORMATION = MINIDUMP_SYSTEM_BASIC_INFORMATION(),
    public var FileCacheInfo: MINIDUMP_SYSTEM_FILECACHE_INFORMATION = MINIDUMP_SYSTEM_FILECACHE_INFORMATION(),
    public var BasicPerfInfo: MINIDUMP_SYSTEM_BASIC_PERFORMANCE_INFORMATION = MINIDUMP_SYSTEM_BASIC_PERFORMANCE_INFORMATION(),
    public var PerfInfo: MINIDUMP_SYSTEM_PERFORMANCE_INFORMATION = MINIDUMP_SYSTEM_PERFORMANCE_INFORMATION(),
)

public class MINIDUMP_SYSTEM_PERFORMANCE_INFORMATION {
    public var IdleProcessTime: ULong = 0uL

    public var IoReadTransferCount: ULong = 0uL

    public var IoWriteTransferCount: ULong = 0uL

    public var IoOtherTransferCount: ULong = 0uL

    public var IoReadOperationCount: UInt = 0u

    public var IoWriteOperationCount: UInt = 0u

    public var IoOtherOperationCount: UInt = 0u

    public var AvailablePages: UInt = 0u

    public var CommittedPages: UInt = 0u

    public var CommitLimit: UInt = 0u

    public var PeakCommitment: UInt = 0u

    public var PageFaultCount: UInt = 0u

    public var CopyOnWriteCount: UInt = 0u

    public var TransitionCount: UInt = 0u

    public var CacheTransitionCount: UInt = 0u

    public var DemandZeroCount: UInt = 0u

    public var PageReadCount: UInt = 0u

    public var PageReadIoCount: UInt = 0u

    public var CacheReadCount: UInt = 0u

    public var CacheIoCount: UInt = 0u

    public var DirtyPagesWriteCount: UInt = 0u

    public var DirtyWriteIoCount: UInt = 0u

    public var MappedPagesWriteCount: UInt = 0u

    public var MappedWriteIoCount: UInt = 0u

    public var PagedPoolPages: UInt = 0u

    public var NonPagedPoolPages: UInt = 0u

    public var PagedPoolAllocs: UInt = 0u

    public var PagedPoolFrees: UInt = 0u

    public var NonPagedPoolAllocs: UInt = 0u

    public var NonPagedPoolFrees: UInt = 0u

    public var FreeSystemPtes: UInt = 0u

    public var ResidentSystemCodePage: UInt = 0u

    public var TotalSystemDriverPages: UInt = 0u

    public var TotalSystemCodePages: UInt = 0u

    public var NonPagedPoolLookasideHits: UInt = 0u

    public var PagedPoolLookasideHits: UInt = 0u

    public var AvailablePagedPoolPages: UInt = 0u

    public var ResidentSystemCachePage: UInt = 0u

    public var ResidentPagedPoolPage: UInt = 0u

    public var ResidentSystemDriverPage: UInt = 0u

    public var CcFastReadNoWait: UInt = 0u

    public var CcFastReadWait: UInt = 0u

    public var CcFastReadResourceMiss: UInt = 0u

    public var CcFastReadNotPossible: UInt = 0u

    public var CcFastMdlReadNoWait: UInt = 0u

    public var CcFastMdlReadWait: UInt = 0u

    public var CcFastMdlReadResourceMiss: UInt = 0u

    public var CcFastMdlReadNotPossible: UInt = 0u

    public var CcMapDataNoWait: UInt = 0u

    public var CcMapDataWait: UInt = 0u

    public var CcMapDataNoWaitMiss: UInt = 0u

    public var CcMapDataWaitMiss: UInt = 0u

    public var CcPinMappedDataCount: UInt = 0u

    public var CcPinReadNoWait: UInt = 0u

    public var CcPinReadWait: UInt = 0u

    public var CcPinReadNoWaitMiss: UInt = 0u

    public var CcPinReadWaitMiss: UInt = 0u

    public var CcCopyReadNoWait: UInt = 0u

    public var CcCopyReadWait: UInt = 0u

    public var CcCopyReadNoWaitMiss: UInt = 0u

    public var CcCopyReadWaitMiss: UInt = 0u

    public var CcMdlReadNoWait: UInt = 0u

    public var CcMdlReadWait: UInt = 0u

    public var CcMdlReadNoWaitMiss: UInt = 0u

    public var CcMdlReadWaitMiss: UInt = 0u

    public var CcReadAheadIos: UInt = 0u

    public var CcLazyWriteIos: UInt = 0u

    public var CcLazyWritePages: UInt = 0u

    public var CcDataFlushes: UInt = 0u

    public var CcDataPages: UInt = 0u

    public var ContextSwitches: UInt = 0u

    public var FirstLevelTbFills: UInt = 0u

    public var SecondLevelTbFills: UInt = 0u

    public var SystemCalls: UInt = 0u

    public var CcTotalDirtyPages: ULong = 0uL

    public var CcDirtyPageThreshold: ULong = 0uL

    public var ResidentAvailablePages: Long = 0L

    public var SharedCommittedPages: ULong = 0uL
}

public data class MINIDUMP_THREAD(
    public var ThreadId: UInt = 0u,
    public var SuspendCount: UInt = 0u,
    public var PriorityClass: UInt = 0u,
    public var Priority: UInt = 0u,
    public var Teb: ULong = 0uL,
    public var Stack: MINIDUMP_MEMORY_DESCRIPTOR = MINIDUMP_MEMORY_DESCRIPTOR(),
    public var ThreadContext: MINIDUMP_LOCATION_DESCRIPTOR = MINIDUMP_LOCATION_DESCRIPTOR(),
)

public data class MINIDUMP_THREAD_CALLBACK(
    public var ThreadId: UInt = 0u,
    public var ThreadHandle: HANDLE = 0L,
    public var Context: CONTEXT = CONTEXT(),
    public var SizeOfContext: UInt = 0u,
    public var StackBase: ULong = 0uL,
    public var StackEnd: ULong = 0uL,
)

public data class MINIDUMP_THREAD_EX(
    public var ThreadId: UInt = 0u,
    public var SuspendCount: UInt = 0u,
    public var PriorityClass: UInt = 0u,
    public var Priority: UInt = 0u,
    public var Teb: ULong = 0uL,
    public var Stack: MINIDUMP_MEMORY_DESCRIPTOR = MINIDUMP_MEMORY_DESCRIPTOR(),
    public var ThreadContext: MINIDUMP_LOCATION_DESCRIPTOR = MINIDUMP_LOCATION_DESCRIPTOR(),
    public var BackingStore: MINIDUMP_MEMORY_DESCRIPTOR = MINIDUMP_MEMORY_DESCRIPTOR(),
)

public data class MINIDUMP_THREAD_EX_CALLBACK(
    public var ThreadId: UInt = 0u,
    public var ThreadHandle: HANDLE = 0L,
    public var Context: CONTEXT = CONTEXT(),
    public var SizeOfContext: UInt = 0u,
    public var StackBase: ULong = 0uL,
    public var StackEnd: ULong = 0uL,
    public var BackingStoreBase: ULong = 0uL,
    public var BackingStoreEnd: ULong = 0uL,
)

public data class MINIDUMP_THREAD_EX_LIST(public var NumberOfThreads: UInt = 0u, public var Threads: List<MINIDUMP_THREAD_EX> = List(1) { MINIDUMP_THREAD_EX() })

public data class MINIDUMP_THREAD_INFO(
    public var ThreadId: UInt = 0u,
    public var DumpFlags: MINIDUMP_THREAD_INFO_DUMP_FLAGS = 0u,
    public var DumpError: UInt = 0u,
    public var ExitStatus: UInt = 0u,
    public var CreateTime: ULong = 0uL,
    public var ExitTime: ULong = 0uL,
    public var KernelTime: ULong = 0uL,
    public var UserTime: ULong = 0uL,
    public var StartAddress: ULong = 0uL,
    public var Affinity: ULong = 0uL,
)

public data class MINIDUMP_THREAD_INFO_LIST(
    public var SizeOfHeader: UInt = 0u,
    public var SizeOfEntry: UInt = 0u,
    public var NumberOfEntries: UInt = 0u,
)

public data class MINIDUMP_THREAD_LIST(public var NumberOfThreads: UInt = 0u, public var Threads: List<MINIDUMP_THREAD> = List(1) { MINIDUMP_THREAD() })

public data class MINIDUMP_THREAD_NAME(public var ThreadId: UInt = 0u, public var RvaOfThreadName: ULong = 0uL)

public data class MINIDUMP_THREAD_NAME_LIST(public var NumberOfThreadNames: UInt = 0u, public var ThreadNames: List<MINIDUMP_THREAD_NAME> = List(1) { MINIDUMP_THREAD_NAME() })

public data class MINIDUMP_TOKEN_INFO_HEADER(
    public var TokenSize: UInt = 0u,
    public var TokenId: UInt = 0u,
    public var TokenHandle: ULong = 0uL,
)

public data class MINIDUMP_TOKEN_INFO_LIST(
    public var TokenListSize: UInt = 0u,
    public var TokenListEntries: UInt = 0u,
    public var ListHeaderSize: UInt = 0u,
    public var ElementHeaderSize: UInt = 0u,
)

public data class MINIDUMP_UNLOADED_MODULE(
    public var BaseOfImage: ULong = 0uL,
    public var SizeOfImage: UInt = 0u,
    public var CheckSum: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var ModuleNameRva: UInt = 0u,
)

public data class MINIDUMP_UNLOADED_MODULE_LIST(
    public var SizeOfHeader: UInt = 0u,
    public var SizeOfEntry: UInt = 0u,
    public var NumberOfEntries: UInt = 0u,
)

public data class MINIDUMP_USER_RECORD(public var Type: UInt = 0u, public var Memory: MINIDUMP_LOCATION_DESCRIPTOR = MINIDUMP_LOCATION_DESCRIPTOR())

public data class MINIDUMP_USER_STREAM(
    public var Type: UInt = 0u,
    public var BufferSize: UInt = 0u,
    public var Buffer: Long = 0L,
)

public data class MINIDUMP_USER_STREAM_INFORMATION(public var UserStreamCount: UInt = 0u, public var UserStreamArray: Long = 0L)

public data class MINIDUMP_VM_POST_READ_CALLBACK(
    public var Offset: ULong = 0uL,
    public var Buffer: Long = 0L,
    public var Size: UInt = 0u,
    public var Completed: UInt = 0u,
    public var Status: HRESULT = 0,
)

public data class MINIDUMP_VM_PRE_READ_CALLBACK(
    public var Offset: ULong = 0uL,
    public var Buffer: Long = 0L,
    public var Size: UInt = 0u,
)

public data class MINIDUMP_VM_QUERY_CALLBACK(public var Offset: ULong = 0uL)

public data class MODLOAD_CVMISC(
    public var oCV: UInt = 0u,
    public var cCV: ULong = 0uL,
    public var oMisc: UInt = 0u,
    public var cMisc: ULong = 0uL,
    public var dtImage: UInt = 0u,
    public var cImage: UInt = 0u,
)

public data class MODLOAD_DATA(
    public var ssize: UInt = 0u,
    public var ssig: MODLOAD_DATA_TYPE = 0u,
    public var data: Long = 0L,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class MODLOAD_PDBGUID_PDBAGE(public var PdbGuid: GUID = GUID(), public var PdbAge: UInt = 0u)

public data class MODULE_TYPE_INFO(
    public var dataLength: UShort = 0u,
    public var leaf: UShort = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MODULE_TYPE_INFO) return false
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

public data class OMAP(public var rva: UInt = 0u, public var rvaTo: UInt = 0u)

public data class OUTPUT_DEBUG_STRING_INFO(
    public var lpDebugStringData: PSTR = 0L,
    public var fUnicode: UShort = 0u,
    public var nDebugStringLength: UShort = 0u,
)

public data class PHYSICAL_MEMORY_DESCRIPTOR32(
    public var NumberOfRuns: UInt = 0u,
    public var NumberOfPages: UInt = 0u,
    public var Run: List<PHYSICAL_MEMORY_RUN32> = List(1) { PHYSICAL_MEMORY_RUN32() },
)

public data class PHYSICAL_MEMORY_DESCRIPTOR64(
    public var NumberOfRuns: UInt = 0u,
    public var NumberOfPages: ULong = 0uL,
    public var Run: List<PHYSICAL_MEMORY_RUN64> = List(1) { PHYSICAL_MEMORY_RUN64() },
)

public data class PHYSICAL_MEMORY_RUN32(public var BasePage: UInt = 0u, public var PageCount: UInt = 0u)

public data class PHYSICAL_MEMORY_RUN64(public var BasePage: ULong = 0uL, public var PageCount: ULong = 0uL)

public data class RIP_INFO(public var dwError: UInt = 0u, public var dwType: RIP_INFO_TYPE = 0u)

public data class SOURCEFILE(public var ModBase: ULong = 0uL, public var FileName: PSTR = 0L)

public data class SOURCEFILEW(public var ModBase: ULong = 0uL, public var FileName: PWSTR = 0L)

public data class SRCCODEINFO(
    public var SizeOfStruct: UInt = 0u,
    public var Key: Long = 0L,
    public var ModBase: ULong = 0uL,
    public var Obj: ByteArray = ByteArray(261),
    public var FileName: ByteArray = ByteArray(261),
    public var LineNumber: UInt = 0u,
    public var Address: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SRCCODEINFO) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.Key != other.Key) return false
        if (this.ModBase != other.ModBase) return false
        if (!this.Obj.contentEquals(other.Obj)) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        if (this.LineNumber != other.LineNumber) return false
        if (this.Address != other.Address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.Key.hashCode()
        result = 31 * result + this.ModBase.hashCode()
        result = 31 * result + this.Obj.contentHashCode()
        result = 31 * result + this.FileName.contentHashCode()
        result = 31 * result + this.LineNumber.hashCode()
        result = 31 * result + this.Address.hashCode()
        return result
    }
}

public data class SRCCODEINFOW(
    public var SizeOfStruct: UInt = 0u,
    public var Key: Long = 0L,
    public var ModBase: ULong = 0uL,
    public var Obj: UShortArray = UShortArray(261),
    public var FileName: UShortArray = UShortArray(261),
    public var LineNumber: UInt = 0u,
    public var Address: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SRCCODEINFOW) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.Key != other.Key) return false
        if (this.ModBase != other.ModBase) return false
        if (!this.Obj.contentEquals(other.Obj)) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        if (this.LineNumber != other.LineNumber) return false
        if (this.Address != other.Address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.Key.hashCode()
        result = 31 * result + this.ModBase.hashCode()
        result = 31 * result + this.Obj.contentHashCode()
        result = 31 * result + this.FileName.contentHashCode()
        result = 31 * result + this.LineNumber.hashCode()
        result = 31 * result + this.Address.hashCode()
        return result
    }
}

public data class STACKFRAME64(
    public var AddrPC: ADDRESS64 = ADDRESS64(),
    public var AddrReturn: ADDRESS64 = ADDRESS64(),
    public var AddrFrame: ADDRESS64 = ADDRESS64(),
    public var AddrStack: ADDRESS64 = ADDRESS64(),
    public var AddrBStore: ADDRESS64 = ADDRESS64(),
    public var FuncTableEntry: Long = 0L,
    public var Params: ULongArray = ULongArray(4),
    public var Far: BOOL = 0,
    public var Virtual: BOOL = 0,
    public var Reserved: ULongArray = ULongArray(3),
    public var KdHelp: KDHELP64 = KDHELP64(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STACKFRAME64) return false
        if (this.AddrPC != other.AddrPC) return false
        if (this.AddrReturn != other.AddrReturn) return false
        if (this.AddrFrame != other.AddrFrame) return false
        if (this.AddrStack != other.AddrStack) return false
        if (this.AddrBStore != other.AddrBStore) return false
        if (this.FuncTableEntry != other.FuncTableEntry) return false
        if (!this.Params.contentEquals(other.Params)) return false
        if (this.Far != other.Far) return false
        if (this.Virtual != other.Virtual) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.KdHelp != other.KdHelp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AddrPC.hashCode()
        result = 31 * result + this.AddrReturn.hashCode()
        result = 31 * result + this.AddrFrame.hashCode()
        result = 31 * result + this.AddrStack.hashCode()
        result = 31 * result + this.AddrBStore.hashCode()
        result = 31 * result + this.FuncTableEntry.hashCode()
        result = 31 * result + this.Params.contentHashCode()
        result = 31 * result + this.Far.hashCode()
        result = 31 * result + this.Virtual.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.KdHelp.hashCode()
        return result
    }
}

public data class STACKFRAME_EX(
    public var AddrPC: ADDRESS64 = ADDRESS64(),
    public var AddrReturn: ADDRESS64 = ADDRESS64(),
    public var AddrFrame: ADDRESS64 = ADDRESS64(),
    public var AddrStack: ADDRESS64 = ADDRESS64(),
    public var AddrBStore: ADDRESS64 = ADDRESS64(),
    public var FuncTableEntry: Long = 0L,
    public var Params: ULongArray = ULongArray(4),
    public var Far: BOOL = 0,
    public var Virtual: BOOL = 0,
    public var Reserved: ULongArray = ULongArray(3),
    public var KdHelp: KDHELP64 = KDHELP64(),
    public var StackFrameSize: UInt = 0u,
    public var InlineFrameContext: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STACKFRAME_EX) return false
        if (this.AddrPC != other.AddrPC) return false
        if (this.AddrReturn != other.AddrReturn) return false
        if (this.AddrFrame != other.AddrFrame) return false
        if (this.AddrStack != other.AddrStack) return false
        if (this.AddrBStore != other.AddrBStore) return false
        if (this.FuncTableEntry != other.FuncTableEntry) return false
        if (!this.Params.contentEquals(other.Params)) return false
        if (this.Far != other.Far) return false
        if (this.Virtual != other.Virtual) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.KdHelp != other.KdHelp) return false
        if (this.StackFrameSize != other.StackFrameSize) return false
        if (this.InlineFrameContext != other.InlineFrameContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AddrPC.hashCode()
        result = 31 * result + this.AddrReturn.hashCode()
        result = 31 * result + this.AddrFrame.hashCode()
        result = 31 * result + this.AddrStack.hashCode()
        result = 31 * result + this.AddrBStore.hashCode()
        result = 31 * result + this.FuncTableEntry.hashCode()
        result = 31 * result + this.Params.contentHashCode()
        result = 31 * result + this.Far.hashCode()
        result = 31 * result + this.Virtual.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.KdHelp.hashCode()
        result = 31 * result + this.StackFrameSize.hashCode()
        result = 31 * result + this.InlineFrameContext.hashCode()
        return result
    }
}

public data class SYMBOL_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var TypeIndex: UInt = 0u,
    public var Reserved: ULongArray = ULongArray(2),
    public var Index: UInt = 0u,
    public var Size: UInt = 0u,
    public var ModBase: ULong = 0uL,
    public var Flags: SYMBOL_INFO_FLAGS = 0u,
    public var Value: ULong = 0uL,
    public var Address: ULong = 0uL,
    public var Register: UInt = 0u,
    public var Scope: UInt = 0u,
    public var Tag: UInt = 0u,
    public var NameLen: UInt = 0u,
    public var MaxNameLen: UInt = 0u,
    public var Name: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYMBOL_INFO) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.TypeIndex != other.TypeIndex) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Index != other.Index) return false
        if (this.Size != other.Size) return false
        if (this.ModBase != other.ModBase) return false
        if (this.Flags != other.Flags) return false
        if (this.Value != other.Value) return false
        if (this.Address != other.Address) return false
        if (this.Register != other.Register) return false
        if (this.Scope != other.Scope) return false
        if (this.Tag != other.Tag) return false
        if (this.NameLen != other.NameLen) return false
        if (this.MaxNameLen != other.MaxNameLen) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.TypeIndex.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Index.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.ModBase.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Value.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.Register.hashCode()
        result = 31 * result + this.Scope.hashCode()
        result = 31 * result + this.Tag.hashCode()
        result = 31 * result + this.NameLen.hashCode()
        result = 31 * result + this.MaxNameLen.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class SYMBOL_INFOW(
    public var SizeOfStruct: UInt = 0u,
    public var TypeIndex: UInt = 0u,
    public var Reserved: ULongArray = ULongArray(2),
    public var Index: UInt = 0u,
    public var Size: UInt = 0u,
    public var ModBase: ULong = 0uL,
    public var Flags: SYMBOL_INFO_FLAGS = 0u,
    public var Value: ULong = 0uL,
    public var Address: ULong = 0uL,
    public var Register: UInt = 0u,
    public var Scope: UInt = 0u,
    public var Tag: UInt = 0u,
    public var NameLen: UInt = 0u,
    public var MaxNameLen: UInt = 0u,
    public var Name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYMBOL_INFOW) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.TypeIndex != other.TypeIndex) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Index != other.Index) return false
        if (this.Size != other.Size) return false
        if (this.ModBase != other.ModBase) return false
        if (this.Flags != other.Flags) return false
        if (this.Value != other.Value) return false
        if (this.Address != other.Address) return false
        if (this.Register != other.Register) return false
        if (this.Scope != other.Scope) return false
        if (this.Tag != other.Tag) return false
        if (this.NameLen != other.NameLen) return false
        if (this.MaxNameLen != other.MaxNameLen) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.TypeIndex.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Index.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.ModBase.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Value.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.Register.hashCode()
        result = 31 * result + this.Scope.hashCode()
        result = 31 * result + this.Tag.hashCode()
        result = 31 * result + this.NameLen.hashCode()
        result = 31 * result + this.MaxNameLen.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class SYMBOL_INFO_PACKAGE(public var si: SYMBOL_INFO = SYMBOL_INFO(), public var name: ByteArray = ByteArray(2001)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYMBOL_INFO_PACKAGE) return false
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

public data class SYMBOL_INFO_PACKAGEW(public var si: SYMBOL_INFOW = SYMBOL_INFOW(), public var name: UShortArray = UShortArray(2001)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYMBOL_INFO_PACKAGEW) return false
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

public data class SYMSRV_EXTENDED_OUTPUT_DATA(
    public var sizeOfStruct: UInt = 0u,
    public var version: UInt = 0u,
    public var filePtrMsg: UShortArray = UShortArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYMSRV_EXTENDED_OUTPUT_DATA) return false
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

public data class SYMSRV_INDEX_INFO(
    public var sizeofstruct: UInt = 0u,
    public var file: ByteArray = ByteArray(261),
    public var stripped: BOOL = 0,
    public var timestamp: UInt = 0u,
    public var size: UInt = 0u,
    public var dbgfile: ByteArray = ByteArray(261),
    public var pdbfile: ByteArray = ByteArray(261),
    public var guid: GUID = GUID(),
    public var sig: UInt = 0u,
    public var age: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYMSRV_INDEX_INFO) return false
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

public data class SYMSRV_INDEX_INFOW(
    public var sizeofstruct: UInt = 0u,
    public var file: UShortArray = UShortArray(261),
    public var stripped: BOOL = 0,
    public var timestamp: UInt = 0u,
    public var size: UInt = 0u,
    public var dbgfile: UShortArray = UShortArray(261),
    public var pdbfile: UShortArray = UShortArray(261),
    public var guid: GUID = GUID(),
    public var sig: UInt = 0u,
    public var age: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYMSRV_INDEX_INFOW) return false
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

public data class TI_FINDCHILDREN_PARAMS(
    public var Count: UInt = 0u,
    public var Start: UInt = 0u,
    public var ChildId: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TI_FINDCHILDREN_PARAMS) return false
        if (this.Count != other.Count) return false
        if (this.Start != other.Start) return false
        if (!this.ChildId.contentEquals(other.ChildId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Count.hashCode()
        result = 31 * result + this.Start.hashCode()
        result = 31 * result + this.ChildId.contentHashCode()
        return result
    }
}

public data class UNLOAD_DLL_DEBUG_INFO(public var lpBaseOfDll: Long = 0L)

public data class UNWIND_HISTORY_TABLE(
    public var Count: UInt = 0u,
    public var LocalHint: UByte = 0u,
    public var GlobalHint: UByte = 0u,
    public var Search: UByte = 0u,
    public var Once: UByte = 0u,
    public var LowAddress: ULong = 0uL,
    public var HighAddress: ULong = 0uL,
    public var Entry: List<UNWIND_HISTORY_TABLE_ENTRY> = List(12) { UNWIND_HISTORY_TABLE_ENTRY() },
)

public data class UNWIND_HISTORY_TABLE_ENTRY(public var ImageBase: ULong = 0uL, public var FunctionEntry: Long = 0L)

public data class WAITCHAIN_NODE_INFO(
    public var ObjectType: WCT_OBJECT_TYPE = 0,
    public var ObjectStatus: WCT_OBJECT_STATUS = 0,
    public var Anonymous: WAITCHAIN_NODE_INFO_0 = WAITCHAIN_NODE_INFO_0(),
)

public data class WAITCHAIN_NODE_INFO_0(public var LockObject: WAITCHAIN_NODE_INFO_0_0 = WAITCHAIN_NODE_INFO_0_0(), public var ThreadObject: WAITCHAIN_NODE_INFO_0_1 = WAITCHAIN_NODE_INFO_0_1())

public data class WAITCHAIN_NODE_INFO_0_0(
    public var ObjectName: UShortArray = UShortArray(128),
    public var Timeout: Long = 0L,
    public var Alertable: BOOL = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WAITCHAIN_NODE_INFO_0_0) return false
        if (!this.ObjectName.contentEquals(other.ObjectName)) return false
        if (this.Timeout != other.Timeout) return false
        if (this.Alertable != other.Alertable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ObjectName.contentHashCode()
        result = 31 * result + this.Timeout.hashCode()
        result = 31 * result + this.Alertable.hashCode()
        return result
    }
}

public data class WAITCHAIN_NODE_INFO_0_1(
    public var ProcessId: UInt = 0u,
    public var ThreadId: UInt = 0u,
    public var WaitTime: UInt = 0u,
    public var ContextSwitches: UInt = 0u,
)

public data class WHEA_AER_BRIDGE_DESCRIPTOR(
    public var Type: UShort = 0u,
    public var Enabled: Boolean = false,
    public var Reserved: UByte = 0u,
    public var BusNumber: UInt = 0u,
    public var Slot: WHEA_PCI_SLOT_NUMBER = WHEA_PCI_SLOT_NUMBER(),
    public var DeviceControl: UShort = 0u,
    public var Flags: AER_BRIDGE_DESCRIPTOR_FLAGS = AER_BRIDGE_DESCRIPTOR_FLAGS(),
    public var UncorrectableErrorMask: UInt = 0u,
    public var UncorrectableErrorSeverity: UInt = 0u,
    public var CorrectableErrorMask: UInt = 0u,
    public var AdvancedCapsAndControl: UInt = 0u,
    public var SecondaryUncorrectableErrorMask: UInt = 0u,
    public var SecondaryUncorrectableErrorSev: UInt = 0u,
    public var SecondaryCapsAndControl: UInt = 0u,
)

public data class WHEA_AER_ENDPOINT_DESCRIPTOR(
    public var Type: UShort = 0u,
    public var Enabled: Boolean = false,
    public var Reserved: UByte = 0u,
    public var BusNumber: UInt = 0u,
    public var Slot: WHEA_PCI_SLOT_NUMBER = WHEA_PCI_SLOT_NUMBER(),
    public var DeviceControl: UShort = 0u,
    public var Flags: AER_ENDPOINT_DESCRIPTOR_FLAGS = AER_ENDPOINT_DESCRIPTOR_FLAGS(),
    public var UncorrectableErrorMask: UInt = 0u,
    public var UncorrectableErrorSeverity: UInt = 0u,
    public var CorrectableErrorMask: UInt = 0u,
    public var AdvancedCapsAndControl: UInt = 0u,
)

public data class WHEA_AER_ROOTPORT_DESCRIPTOR(
    public var Type: UShort = 0u,
    public var Enabled: Boolean = false,
    public var Reserved: UByte = 0u,
    public var BusNumber: UInt = 0u,
    public var Slot: WHEA_PCI_SLOT_NUMBER = WHEA_PCI_SLOT_NUMBER(),
    public var DeviceControl: UShort = 0u,
    public var Flags: AER_ROOTPORT_DESCRIPTOR_FLAGS = AER_ROOTPORT_DESCRIPTOR_FLAGS(),
    public var UncorrectableErrorMask: UInt = 0u,
    public var UncorrectableErrorSeverity: UInt = 0u,
    public var CorrectableErrorMask: UInt = 0u,
    public var AdvancedCapsAndControl: UInt = 0u,
    public var RootErrorCommand: UInt = 0u,
)

public data class WHEA_DEVICE_DRIVER_DESCRIPTOR(
    public var Type: UShort = 0u,
    public var Enabled: Boolean = false,
    public var Reserved: UByte = 0u,
    public var SourceGuid: GUID = GUID(),
    public var LogTag: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var PacketLength: UInt = 0u,
    public var PacketCount: UInt = 0u,
    public var PacketBuffer: Long = 0L,
    public var Config: WHEA_ERROR_SOURCE_CONFIGURATION_DD = WHEA_ERROR_SOURCE_CONFIGURATION_DD(),
    public var CreatorId: GUID = GUID(),
    public var PartitionId: GUID = GUID(),
    public var MaxSectionDataLength: UInt = 0u,
    public var MaxSectionsPerRecord: UInt = 0u,
    public var PacketStateBuffer: Long = 0L,
    public var OpenHandles: Int = 0,
)

public data class WHEA_DRIVER_BUFFER_SET(
    public var Version: UInt = 0u,
    public var Data: Long = 0L,
    public var DataSize: UInt = 0u,
    public var SectionTypeGuid: Long = 0L,
    public var SectionFriendlyName: Long = 0L,
    public var Flags: Long = 0L,
)

public data class WHEA_ERROR_SOURCE_CONFIGURATION_DD(
    public var Initialize: WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER = null,
    public var Uninitialize: WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER = null,
    public var Correct: WHEA_ERROR_SOURCE_CORRECT_DEVICE_DRIVER = null,
)

public data class WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER(
    public var Version: UInt = 0u,
    public var SourceGuid: GUID = GUID(),
    public var LogTag: UShort = 0u,
    public var Reserved: UByteArray = UByteArray(6),
    public var Initialize: WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER = null,
    public var Uninitialize: WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER = null,
    public var MaxSectionDataLength: UInt = 0u,
    public var MaxSectionsPerReport: UInt = 0u,
    public var CreatorId: GUID = GUID(),
    public var PartitionId: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER) return false
        if (this.Version != other.Version) return false
        if (this.SourceGuid != other.SourceGuid) return false
        if (this.LogTag != other.LogTag) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Initialize != other.Initialize) return false
        if (this.Uninitialize != other.Uninitialize) return false
        if (this.MaxSectionDataLength != other.MaxSectionDataLength) return false
        if (this.MaxSectionsPerReport != other.MaxSectionsPerReport) return false
        if (this.CreatorId != other.CreatorId) return false
        if (this.PartitionId != other.PartitionId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.SourceGuid.hashCode()
        result = 31 * result + this.LogTag.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Initialize.hashCode()
        result = 31 * result + this.Uninitialize.hashCode()
        result = 31 * result + this.MaxSectionDataLength.hashCode()
        result = 31 * result + this.MaxSectionsPerReport.hashCode()
        result = 31 * result + this.CreatorId.hashCode()
        result = 31 * result + this.PartitionId.hashCode()
        return result
    }
}

public data class WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER_V1(
    public var Version: UInt = 0u,
    public var SourceGuid: GUID = GUID(),
    public var LogTag: UShort = 0u,
    public var Reserved: UByteArray = UByteArray(6),
    public var Initialize: WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER = null,
    public var Uninitialize: WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER_V1) return false
        if (this.Version != other.Version) return false
        if (this.SourceGuid != other.SourceGuid) return false
        if (this.LogTag != other.LogTag) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Initialize != other.Initialize) return false
        if (this.Uninitialize != other.Uninitialize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.SourceGuid.hashCode()
        result = 31 * result + this.LogTag.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Initialize.hashCode()
        result = 31 * result + this.Uninitialize.hashCode()
        return result
    }
}

public data class WHEA_ERROR_SOURCE_DESCRIPTOR(
    public var Length: UInt = 0u,
    public var Version: UInt = 0u,
    public var Type: WHEA_ERROR_SOURCE_TYPE = 0,
    public var State: WHEA_ERROR_SOURCE_STATE = 0,
    public var MaxRawDataLength: UInt = 0u,
    public var NumRecordsToPreallocate: UInt = 0u,
    public var MaxSectionsPerRecord: UInt = 0u,
    public var ErrorSourceId: UInt = 0u,
    public var PlatformErrorSourceId: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Info: WHEA_ERROR_SOURCE_DESCRIPTOR_0 = WHEA_ERROR_SOURCE_DESCRIPTOR_0(),
)

public data class WHEA_ERROR_SOURCE_DESCRIPTOR_0(
    public var XpfMceDescriptor: WHEA_XPF_MCE_DESCRIPTOR = WHEA_XPF_MCE_DESCRIPTOR(),
    public var XpfCmcDescriptor: WHEA_XPF_CMC_DESCRIPTOR = WHEA_XPF_CMC_DESCRIPTOR(),
    public var XpfNmiDescriptor: WHEA_XPF_NMI_DESCRIPTOR = WHEA_XPF_NMI_DESCRIPTOR(),
    public var IpfMcaDescriptor: WHEA_IPF_MCA_DESCRIPTOR = WHEA_IPF_MCA_DESCRIPTOR(),
    public var IpfCmcDescriptor: WHEA_IPF_CMC_DESCRIPTOR = WHEA_IPF_CMC_DESCRIPTOR(),
    public var IpfCpeDescriptor: WHEA_IPF_CPE_DESCRIPTOR = WHEA_IPF_CPE_DESCRIPTOR(),
    public var AerRootportDescriptor: WHEA_AER_ROOTPORT_DESCRIPTOR = WHEA_AER_ROOTPORT_DESCRIPTOR(),
    public var AerEndpointDescriptor: WHEA_AER_ENDPOINT_DESCRIPTOR = WHEA_AER_ENDPOINT_DESCRIPTOR(),
    public var AerBridgeDescriptor: WHEA_AER_BRIDGE_DESCRIPTOR = WHEA_AER_BRIDGE_DESCRIPTOR(),
    public var GenErrDescriptor: WHEA_GENERIC_ERROR_DESCRIPTOR = WHEA_GENERIC_ERROR_DESCRIPTOR(),
    public var GenErrDescriptorV2: WHEA_GENERIC_ERROR_DESCRIPTOR_V2 = WHEA_GENERIC_ERROR_DESCRIPTOR_V2(),
    public var DeviceDriverDescriptor: WHEA_DEVICE_DRIVER_DESCRIPTOR = WHEA_DEVICE_DRIVER_DESCRIPTOR(),
)

public data class WHEA_GENERIC_ERROR_DESCRIPTOR(
    public var Type: UShort = 0u,
    public var Reserved: UByte = 0u,
    public var Enabled: UByte = 0u,
    public var ErrStatusBlockLength: UInt = 0u,
    public var RelatedErrorSourceId: UInt = 0u,
    public var ErrStatusAddressSpaceID: UByte = 0u,
    public var ErrStatusAddressBitWidth: UByte = 0u,
    public var ErrStatusAddressBitOffset: UByte = 0u,
    public var ErrStatusAddressAccessSize: UByte = 0u,
    public var ErrStatusAddress: Long = 0L,
    public var Notify: WHEA_NOTIFICATION_DESCRIPTOR = WHEA_NOTIFICATION_DESCRIPTOR(),
)

public class WHEA_GENERIC_ERROR_DESCRIPTOR_V2(
    public var Type: UShort = 0u,
    public var Reserved: UByte = 0u,
    public var Enabled: UByte = 0u,
    public var ErrStatusBlockLength: UInt = 0u,
    public var RelatedErrorSourceId: UInt = 0u,
    public var ErrStatusAddressSpaceID: UByte = 0u,
    public var ErrStatusAddressBitWidth: UByte = 0u,
    public var ErrStatusAddressBitOffset: UByte = 0u,
    public var ErrStatusAddressAccessSize: UByte = 0u,
    public var ErrStatusAddress: Long = 0L,
    public var Notify: WHEA_NOTIFICATION_DESCRIPTOR = WHEA_NOTIFICATION_DESCRIPTOR(),
    public var ReadAckAddressSpaceID: UByte = 0u,
    public var ReadAckAddressBitWidth: UByte = 0u,
    public var ReadAckAddressBitOffset: UByte = 0u,
    public var ReadAckAddressAccessSize: UByte = 0u,
    public var ReadAckAddress: Long = 0L,
    public var ReadAckPreserveMask: ULong = 0uL,
    public var ReadAckWriteMask: ULong = 0uL,
)

public data class WHEA_IPF_CMC_DESCRIPTOR(
    public var Type: UShort = 0u,
    public var Enabled: UByte = 0u,
    public var Reserved: UByte = 0u,
)

public data class WHEA_IPF_CPE_DESCRIPTOR(
    public var Type: UShort = 0u,
    public var Enabled: UByte = 0u,
    public var Reserved: UByte = 0u,
)

public data class WHEA_IPF_MCA_DESCRIPTOR(
    public var Type: UShort = 0u,
    public var Enabled: UByte = 0u,
    public var Reserved: UByte = 0u,
)

public data class WHEA_NOTIFICATION_DESCRIPTOR(
    public var Type: UByte = 0u,
    public var Length: UByte = 0u,
    public var Flags: WHEA_NOTIFICATION_FLAGS = WHEA_NOTIFICATION_FLAGS(),
    public var u: WHEA_NOTIFICATION_DESCRIPTOR_0 = WHEA_NOTIFICATION_DESCRIPTOR_0(),
)

public data class WHEA_NOTIFICATION_DESCRIPTOR_0(
    public var Polled: WHEA_NOTIFICATION_DESCRIPTOR_0_0 = WHEA_NOTIFICATION_DESCRIPTOR_0_0(),
    public var Interrupt: WHEA_NOTIFICATION_DESCRIPTOR_0_1 = WHEA_NOTIFICATION_DESCRIPTOR_0_1(),
    public var LocalInterrupt: WHEA_NOTIFICATION_DESCRIPTOR_0_2 = WHEA_NOTIFICATION_DESCRIPTOR_0_2(),
    public var Sci: WHEA_NOTIFICATION_DESCRIPTOR_0_3 = WHEA_NOTIFICATION_DESCRIPTOR_0_3(),
    public var Nmi: WHEA_NOTIFICATION_DESCRIPTOR_0_4 = WHEA_NOTIFICATION_DESCRIPTOR_0_4(),
    public var Sea: WHEA_NOTIFICATION_DESCRIPTOR_0_5 = WHEA_NOTIFICATION_DESCRIPTOR_0_5(),
    public var Sei: WHEA_NOTIFICATION_DESCRIPTOR_0_6 = WHEA_NOTIFICATION_DESCRIPTOR_0_6(),
    public var Gsiv: WHEA_NOTIFICATION_DESCRIPTOR_0_7 = WHEA_NOTIFICATION_DESCRIPTOR_0_7(),
)

public data class WHEA_NOTIFICATION_DESCRIPTOR_0_7(
    public var PollInterval: UInt = 0u,
    public var Vector: UInt = 0u,
    public var SwitchToPollingThreshold: UInt = 0u,
    public var SwitchToPollingWindow: UInt = 0u,
    public var ErrorThreshold: UInt = 0u,
    public var ErrorThresholdWindow: UInt = 0u,
)

public data class WHEA_NOTIFICATION_DESCRIPTOR_0_1(
    public var PollInterval: UInt = 0u,
    public var Vector: UInt = 0u,
    public var SwitchToPollingThreshold: UInt = 0u,
    public var SwitchToPollingWindow: UInt = 0u,
    public var ErrorThreshold: UInt = 0u,
    public var ErrorThresholdWindow: UInt = 0u,
)

public data class WHEA_NOTIFICATION_DESCRIPTOR_0_2(
    public var PollInterval: UInt = 0u,
    public var Vector: UInt = 0u,
    public var SwitchToPollingThreshold: UInt = 0u,
    public var SwitchToPollingWindow: UInt = 0u,
    public var ErrorThreshold: UInt = 0u,
    public var ErrorThresholdWindow: UInt = 0u,
)

public data class WHEA_NOTIFICATION_DESCRIPTOR_0_4(
    public var PollInterval: UInt = 0u,
    public var Vector: UInt = 0u,
    public var SwitchToPollingThreshold: UInt = 0u,
    public var SwitchToPollingWindow: UInt = 0u,
    public var ErrorThreshold: UInt = 0u,
    public var ErrorThresholdWindow: UInt = 0u,
)

public data class WHEA_NOTIFICATION_DESCRIPTOR_0_0(public var PollInterval: UInt = 0u)

public data class WHEA_NOTIFICATION_DESCRIPTOR_0_3(
    public var PollInterval: UInt = 0u,
    public var Vector: UInt = 0u,
    public var SwitchToPollingThreshold: UInt = 0u,
    public var SwitchToPollingWindow: UInt = 0u,
    public var ErrorThreshold: UInt = 0u,
    public var ErrorThresholdWindow: UInt = 0u,
)

public data class WHEA_NOTIFICATION_DESCRIPTOR_0_5(
    public var PollInterval: UInt = 0u,
    public var Vector: UInt = 0u,
    public var SwitchToPollingThreshold: UInt = 0u,
    public var SwitchToPollingWindow: UInt = 0u,
    public var ErrorThreshold: UInt = 0u,
    public var ErrorThresholdWindow: UInt = 0u,
)

public data class WHEA_NOTIFICATION_DESCRIPTOR_0_6(
    public var PollInterval: UInt = 0u,
    public var Vector: UInt = 0u,
    public var SwitchToPollingThreshold: UInt = 0u,
    public var SwitchToPollingWindow: UInt = 0u,
    public var ErrorThreshold: UInt = 0u,
    public var ErrorThresholdWindow: UInt = 0u,
)

public data class WHEA_NOTIFICATION_FLAGS(public var Anonymous: WHEA_NOTIFICATION_FLAGS_0 = WHEA_NOTIFICATION_FLAGS_0(), public var AsUSHORT: UShort = 0u)

public data class WHEA_NOTIFICATION_FLAGS_0(public var _bitfield: UShort = 0u)

public data class WHEA_PCI_SLOT_NUMBER(public var u: WHEA_PCI_SLOT_NUMBER_0 = WHEA_PCI_SLOT_NUMBER_0())

public data class WHEA_PCI_SLOT_NUMBER_0(public var bits: WHEA_PCI_SLOT_NUMBER_0_0 = WHEA_PCI_SLOT_NUMBER_0_0(), public var AsULONG: UInt = 0u)

public data class WHEA_PCI_SLOT_NUMBER_0_0(public var _bitfield: UInt = 0u)

public data class WHEA_XPF_CMC_DESCRIPTOR(
    public var Type: UShort = 0u,
    public var Enabled: Boolean = false,
    public var NumberOfBanks: UByte = 0u,
    public var Reserved: UInt = 0u,
    public var Notify: WHEA_NOTIFICATION_DESCRIPTOR = WHEA_NOTIFICATION_DESCRIPTOR(),
    public var Banks: List<WHEA_XPF_MC_BANK_DESCRIPTOR> = List(32) { WHEA_XPF_MC_BANK_DESCRIPTOR() },
)

public data class WHEA_XPF_MCE_DESCRIPTOR(
    public var Type: UShort = 0u,
    public var Enabled: UByte = 0u,
    public var NumberOfBanks: UByte = 0u,
    public var Flags: XPF_MCE_FLAGS = XPF_MCE_FLAGS(),
    public var MCG_Capability: ULong = 0uL,
    public var MCG_GlobalControl: ULong = 0uL,
    public var Banks: List<WHEA_XPF_MC_BANK_DESCRIPTOR> = List(32) { WHEA_XPF_MC_BANK_DESCRIPTOR() },
)
