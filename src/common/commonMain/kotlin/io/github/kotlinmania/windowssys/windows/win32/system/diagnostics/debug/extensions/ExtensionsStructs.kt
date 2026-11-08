@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.EXCEPTION_RECORD64
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.LIST_ENTRY32
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.LIST_ENTRY64

public data class ArrayDimension(
    public var LowerBound: Long = 0L,
    public var Length: ULong = 0uL,
    public var Stride: ULong = 0uL,
)

public data class BUSDATA(
    public var BusDataType: UInt = 0u,
    public var BusNumber: UInt = 0u,
    public var SlotNumber: UInt = 0u,
    public var Buffer: Long = 0L,
    public var Offset: UInt = 0u,
    public var Length: UInt = 0u,
)

public data class CKCL_DATA(
    public var NextLogEvent: Long = 0L,
    public var TAnalyzeString: PSTR = 0L,
    public var TAnalyzeReturnType: TANALYZE_RETURN = 0,
)

public data class CKCL_LISTHEAD(public var LogEventListHead: Long = 0L, public var Heap: HANDLE = 0L)

public data class CPU_INFO(
    public var Type: UInt = 0u,
    public var NumCPUs: UInt = 0u,
    public var CurrentProc: UInt = 0u,
    public var ProcInfo: List<DEBUG_PROCESSOR_IDENTIFICATION_ALL> = List(2048) { DEBUG_PROCESSOR_IDENTIFICATION_ALL() },
    public var Mhz: UInt = 0u,
)

public data class CPU_INFO_v1(
    public var Type: UInt = 0u,
    public var NumCPUs: UInt = 0u,
    public var CurrentProc: UInt = 0u,
    public var ProcInfo: List<DEBUG_PROCESSOR_IDENTIFICATION_ALL> = List(32) { DEBUG_PROCESSOR_IDENTIFICATION_ALL() },
    public var Mhz: UInt = 0u,
)

public data class CPU_INFO_v2(
    public var Type: UInt = 0u,
    public var NumCPUs: UInt = 0u,
    public var CurrentProc: UInt = 0u,
    public var ProcInfo: List<DEBUG_PROCESSOR_IDENTIFICATION_ALL> = List(1280) { DEBUG_PROCESSOR_IDENTIFICATION_ALL() },
    public var Mhz: UInt = 0u,
)

public data class DBGKD_DEBUG_DATA_HEADER32(
    public var List: LIST_ENTRY32 = LIST_ENTRY32(),
    public var OwnerTag: UInt = 0u,
    public var Size: UInt = 0u,
)

public data class DBGKD_DEBUG_DATA_HEADER64(
    public var List: LIST_ENTRY64 = LIST_ENTRY64(),
    public var OwnerTag: UInt = 0u,
    public var Size: UInt = 0u,
)

public data class DBGKD_GET_VERSION32(
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var ProtocolVersion: UShort = 0u,
    public var Flags: UShort = 0u,
    public var KernBase: UInt = 0u,
    public var PsLoadedModuleList: UInt = 0u,
    public var MachineType: UShort = 0u,
    public var ThCallbackStack: UShort = 0u,
    public var NextCallback: UShort = 0u,
    public var FramePointer: UShort = 0u,
    public var KiCallUserMode: UInt = 0u,
    public var KeUserCallbackDispatcher: UInt = 0u,
    public var BreakpointWithStatus: UInt = 0u,
    public var DebuggerDataList: UInt = 0u,
)

public data class DBGKD_GET_VERSION64(
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var ProtocolVersion: UByte = 0u,
    public var KdSecondaryVersion: UByte = 0u,
    public var Flags: UShort = 0u,
    public var MachineType: UShort = 0u,
    public var MaxPacketType: UByte = 0u,
    public var MaxStateChange: UByte = 0u,
    public var MaxManipulate: UByte = 0u,
    public var Simulation: UByte = 0u,
    public var Unused: UShortArray = UShortArray(1),
    public var KernBase: ULong = 0uL,
    public var PsLoadedModuleList: ULong = 0uL,
    public var DebuggerDataList: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DBGKD_GET_VERSION64) return false
        if (this.MajorVersion != other.MajorVersion) return false
        if (this.MinorVersion != other.MinorVersion) return false
        if (this.ProtocolVersion != other.ProtocolVersion) return false
        if (this.KdSecondaryVersion != other.KdSecondaryVersion) return false
        if (this.Flags != other.Flags) return false
        if (this.MachineType != other.MachineType) return false
        if (this.MaxPacketType != other.MaxPacketType) return false
        if (this.MaxStateChange != other.MaxStateChange) return false
        if (this.MaxManipulate != other.MaxManipulate) return false
        if (this.Simulation != other.Simulation) return false
        if (!this.Unused.contentEquals(other.Unused)) return false
        if (this.KernBase != other.KernBase) return false
        if (this.PsLoadedModuleList != other.PsLoadedModuleList) return false
        if (this.DebuggerDataList != other.DebuggerDataList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MajorVersion.hashCode()
        result = 31 * result + this.MinorVersion.hashCode()
        result = 31 * result + this.ProtocolVersion.hashCode()
        result = 31 * result + this.KdSecondaryVersion.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.MachineType.hashCode()
        result = 31 * result + this.MaxPacketType.hashCode()
        result = 31 * result + this.MaxStateChange.hashCode()
        result = 31 * result + this.MaxManipulate.hashCode()
        result = 31 * result + this.Simulation.hashCode()
        result = 31 * result + this.Unused.contentHashCode()
        result = 31 * result + this.KernBase.hashCode()
        result = 31 * result + this.PsLoadedModuleList.hashCode()
        result = 31 * result + this.DebuggerDataList.hashCode()
        return result
    }
}

public data class DBG_THREAD_ATTRIBUTES(
    public var ThreadIndex: UInt = 0u,
    public var ProcessID: ULong = 0uL,
    public var ThreadID: ULong = 0uL,
    public var AttributeBits: ULong = 0uL,
    public var BoolBits: UInt = 0u,
    public var BlockedOnPID: ULong = 0uL,
    public var BlockedOnTID: ULong = 0uL,
    public var CritSecAddress: ULong = 0uL,
    public var Timeout_msec: UInt = 0u,
    public var StringData: ByteArray = ByteArray(100),
    public var SymName: ByteArray = ByteArray(100),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DBG_THREAD_ATTRIBUTES) return false
        if (this.ThreadIndex != other.ThreadIndex) return false
        if (this.ProcessID != other.ProcessID) return false
        if (this.ThreadID != other.ThreadID) return false
        if (this.AttributeBits != other.AttributeBits) return false
        if (this.BoolBits != other.BoolBits) return false
        if (this.BlockedOnPID != other.BlockedOnPID) return false
        if (this.BlockedOnTID != other.BlockedOnTID) return false
        if (this.CritSecAddress != other.CritSecAddress) return false
        if (this.Timeout_msec != other.Timeout_msec) return false
        if (!this.StringData.contentEquals(other.StringData)) return false
        if (!this.SymName.contentEquals(other.SymName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ThreadIndex.hashCode()
        result = 31 * result + this.ProcessID.hashCode()
        result = 31 * result + this.ThreadID.hashCode()
        result = 31 * result + this.AttributeBits.hashCode()
        result = 31 * result + this.BoolBits.hashCode()
        result = 31 * result + this.BlockedOnPID.hashCode()
        result = 31 * result + this.BlockedOnTID.hashCode()
        result = 31 * result + this.CritSecAddress.hashCode()
        result = 31 * result + this.Timeout_msec.hashCode()
        result = 31 * result + this.StringData.contentHashCode()
        result = 31 * result + this.SymName.contentHashCode()
        return result
    }
}

public data class DEBUG_ANALYSIS_PROCESSOR_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var Model: UInt = 0u,
    public var Family: UInt = 0u,
    public var Stepping: UInt = 0u,
    public var Architecture: UInt = 0u,
    public var Revision: UInt = 0u,
    public var CurrentClockSpeed: UInt = 0u,
    public var CurrentVoltage: UInt = 0u,
    public var MaxClockSpeed: UInt = 0u,
    public var ProcessorType: UInt = 0u,
    public var DeviceID: ByteArray = ByteArray(32),
    public var Manufacturer: ByteArray = ByteArray(64),
    public var Name: ByteArray = ByteArray(64),
    public var Version: ByteArray = ByteArray(64),
    public var Description: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_ANALYSIS_PROCESSOR_INFO) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.Model != other.Model) return false
        if (this.Family != other.Family) return false
        if (this.Stepping != other.Stepping) return false
        if (this.Architecture != other.Architecture) return false
        if (this.Revision != other.Revision) return false
        if (this.CurrentClockSpeed != other.CurrentClockSpeed) return false
        if (this.CurrentVoltage != other.CurrentVoltage) return false
        if (this.MaxClockSpeed != other.MaxClockSpeed) return false
        if (this.ProcessorType != other.ProcessorType) return false
        if (!this.DeviceID.contentEquals(other.DeviceID)) return false
        if (!this.Manufacturer.contentEquals(other.Manufacturer)) return false
        if (!this.Name.contentEquals(other.Name)) return false
        if (!this.Version.contentEquals(other.Version)) return false
        if (!this.Description.contentEquals(other.Description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.Model.hashCode()
        result = 31 * result + this.Family.hashCode()
        result = 31 * result + this.Stepping.hashCode()
        result = 31 * result + this.Architecture.hashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.CurrentClockSpeed.hashCode()
        result = 31 * result + this.CurrentVoltage.hashCode()
        result = 31 * result + this.MaxClockSpeed.hashCode()
        result = 31 * result + this.ProcessorType.hashCode()
        result = 31 * result + this.DeviceID.contentHashCode()
        result = 31 * result + this.Manufacturer.contentHashCode()
        result = 31 * result + this.Name.contentHashCode()
        result = 31 * result + this.Version.contentHashCode()
        result = 31 * result + this.Description.contentHashCode()
        return result
    }
}

public data class DEBUG_BREAKPOINT_PARAMETERS(
    public var Offset: ULong = 0uL,
    public var Id: UInt = 0u,
    public var BreakType: UInt = 0u,
    public var ProcType: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DataSize: UInt = 0u,
    public var DataAccessType: UInt = 0u,
    public var PassCount: UInt = 0u,
    public var CurrentPassCount: UInt = 0u,
    public var MatchThread: UInt = 0u,
    public var CommandSize: UInt = 0u,
    public var OffsetExpressionSize: UInt = 0u,
)

public data class DEBUG_CACHED_SYMBOL_INFO(
    public var ModBase: ULong = 0uL,
    public var Arg1: ULong = 0uL,
    public var Arg2: ULong = 0uL,
    public var Id: UInt = 0u,
    public var Arg3: UInt = 0u,
)

public data class DEBUG_CLIENT_CONTEXT(public var cbSize: UInt = 0u, public var eClient: UInt = 0u)

public data class DEBUG_CPU_MICROCODE_VERSION(
    public var SizeOfStruct: UInt = 0u,
    public var CachedSignature: Long = 0L,
    public var InitialSignature: Long = 0L,
    public var ProcessorModel: UInt = 0u,
    public var ProcessorFamily: UInt = 0u,
    public var ProcessorStepping: UInt = 0u,
    public var ProcessorArchRev: UInt = 0u,
)

public data class DEBUG_CPU_SPEED_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var CurrentSpeed: UInt = 0u,
    public var RatedSpeed: UInt = 0u,
    public var NameString: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_CPU_SPEED_INFO) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.CurrentSpeed != other.CurrentSpeed) return false
        if (this.RatedSpeed != other.RatedSpeed) return false
        if (!this.NameString.contentEquals(other.NameString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.CurrentSpeed.hashCode()
        result = 31 * result + this.RatedSpeed.hashCode()
        result = 31 * result + this.NameString.contentHashCode()
        return result
    }
}

public data class DEBUG_CREATE_PROCESS_OPTIONS(
    public var CreateFlags: UInt = 0u,
    public var EngCreateFlags: UInt = 0u,
    public var VerifierFlags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class DEBUG_DECODE_ERROR(
    public var SizeOfStruct: UInt = 0u,
    public var Code: UInt = 0u,
    public var TreatAsStatus: BOOL = 0,
    public var Source: ByteArray = ByteArray(64),
    public var Message: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_DECODE_ERROR) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.Code != other.Code) return false
        if (this.TreatAsStatus != other.TreatAsStatus) return false
        if (!this.Source.contentEquals(other.Source)) return false
        if (!this.Message.contentEquals(other.Message)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.Code.hashCode()
        result = 31 * result + this.TreatAsStatus.hashCode()
        result = 31 * result + this.Source.contentHashCode()
        result = 31 * result + this.Message.contentHashCode()
        return result
    }
}

public data class DEBUG_DEVICE_OBJECT_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var DevObjAddress: ULong = 0uL,
    public var ReferenceCount: UInt = 0u,
    public var QBusy: BOOL = 0,
    public var DriverObject: ULong = 0uL,
    public var CurrentIrp: ULong = 0uL,
    public var DevExtension: ULong = 0uL,
    public var DevObjExtension: ULong = 0uL,
)

public data class DEBUG_DRIVER_OBJECT_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var DriverSize: UInt = 0u,
    public var DriverObjAddress: ULong = 0uL,
    public var DriverStart: ULong = 0uL,
    public var DriverExtension: ULong = 0uL,
    public var DeviceObject: ULong = 0uL,
    public var DriverName: DEBUG_DRIVER_OBJECT_INFO_0 = DEBUG_DRIVER_OBJECT_INFO_0(),
)

public data class DEBUG_DRIVER_OBJECT_INFO_0(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Buffer: ULong = 0uL,
)

public data class DEBUG_EVENT_CONTEXT(
    public var Size: UInt = 0u,
    public var ProcessEngineId: UInt = 0u,
    public var ThreadEngineId: UInt = 0u,
    public var FrameEngineId: UInt = 0u,
)

public data class DEBUG_EXCEPTION_FILTER_PARAMETERS(
    public var ExecutionOption: UInt = 0u,
    public var ContinueOption: UInt = 0u,
    public var TextSize: UInt = 0u,
    public var CommandSize: UInt = 0u,
    public var SecondCommandSize: UInt = 0u,
    public var ExceptionCode: UInt = 0u,
)

public data class DEBUG_GET_TEXT_COMPLETIONS_IN(
    public var Flags: UInt = 0u,
    public var MatchCountLimit: UInt = 0u,
    public var Reserved: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_GET_TEXT_COMPLETIONS_IN) return false
        if (this.Flags != other.Flags) return false
        if (this.MatchCountLimit != other.MatchCountLimit) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.MatchCountLimit.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class DEBUG_GET_TEXT_COMPLETIONS_OUT(
    public var Flags: UInt = 0u,
    public var ReplaceIndex: UInt = 0u,
    public var MatchCount: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_GET_TEXT_COMPLETIONS_OUT) return false
        if (this.Flags != other.Flags) return false
        if (this.ReplaceIndex != other.ReplaceIndex) return false
        if (this.MatchCount != other.MatchCount) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.ReplaceIndex.hashCode()
        result = 31 * result + this.MatchCount.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class DEBUG_HANDLE_DATA_BASIC(
    public var TypeNameSize: UInt = 0u,
    public var ObjectNameSize: UInt = 0u,
    public var Attributes: UInt = 0u,
    public var GrantedAccess: UInt = 0u,
    public var HandleCount: UInt = 0u,
    public var PointerCount: UInt = 0u,
)

public data class DEBUG_IRP_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var IrpAddress: ULong = 0uL,
    public var IoStatus: UInt = 0u,
    public var StackCount: UInt = 0u,
    public var CurrentLocation: UInt = 0u,
    public var MdlAddress: ULong = 0uL,
    public var Thread: ULong = 0uL,
    public var CancelRoutine: ULong = 0uL,
    public var CurrentStack: DEBUG_IRP_STACK_INFO = DEBUG_IRP_STACK_INFO(),
    public var Stack: List<DEBUG_IRP_STACK_INFO> = List(10) { DEBUG_IRP_STACK_INFO() },
)

public data class DEBUG_IRP_STACK_INFO(
    public var Major: UByte = 0u,
    public var Minor: UByte = 0u,
    public var DeviceObject: ULong = 0uL,
    public var FileObject: ULong = 0uL,
    public var CompletionRoutine: ULong = 0uL,
    public var StackAddress: ULong = 0uL,
)

public data class DEBUG_LAST_EVENT_INFO_BREAKPOINT(public var Id: UInt = 0u)

public data class DEBUG_LAST_EVENT_INFO_EXCEPTION(public var ExceptionRecord: EXCEPTION_RECORD64 = EXCEPTION_RECORD64(), public var FirstChance: UInt = 0u)

public data class DEBUG_LAST_EVENT_INFO_EXIT_PROCESS(public var ExitCode: UInt = 0u)

public data class DEBUG_LAST_EVENT_INFO_EXIT_THREAD(public var ExitCode: UInt = 0u)

public data class DEBUG_LAST_EVENT_INFO_LOAD_MODULE(public var Base: ULong = 0uL)

public data class DEBUG_LAST_EVENT_INFO_SERVICE_EXCEPTION(
    public var Kind: UInt = 0u,
    public var DataSize: UInt = 0u,
    public var Address: ULong = 0uL,
)

public data class DEBUG_LAST_EVENT_INFO_SYSTEM_ERROR(public var Error: UInt = 0u, public var Level: UInt = 0u)

public data class DEBUG_LAST_EVENT_INFO_UNLOAD_MODULE(public var Base: ULong = 0uL)

public data class DEBUG_MODULE_AND_ID(public var ModuleBase: ULong = 0uL, public var Id: ULong = 0uL)

public data class DEBUG_MODULE_PARAMETERS(
    public var Base: ULong = 0uL,
    public var Size: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
    public var Checksum: UInt = 0u,
    public var Flags: UInt = 0u,
    public var SymbolType: UInt = 0u,
    public var ImageNameSize: UInt = 0u,
    public var ModuleNameSize: UInt = 0u,
    public var LoadedImageNameSize: UInt = 0u,
    public var SymbolFileNameSize: UInt = 0u,
    public var MappedImageNameSize: UInt = 0u,
    public var Reserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_MODULE_PARAMETERS) return false
        if (this.Base != other.Base) return false
        if (this.Size != other.Size) return false
        if (this.TimeDateStamp != other.TimeDateStamp) return false
        if (this.Checksum != other.Checksum) return false
        if (this.Flags != other.Flags) return false
        if (this.SymbolType != other.SymbolType) return false
        if (this.ImageNameSize != other.ImageNameSize) return false
        if (this.ModuleNameSize != other.ModuleNameSize) return false
        if (this.LoadedImageNameSize != other.LoadedImageNameSize) return false
        if (this.SymbolFileNameSize != other.SymbolFileNameSize) return false
        if (this.MappedImageNameSize != other.MappedImageNameSize) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Base.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.TimeDateStamp.hashCode()
        result = 31 * result + this.Checksum.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.SymbolType.hashCode()
        result = 31 * result + this.ImageNameSize.hashCode()
        result = 31 * result + this.ModuleNameSize.hashCode()
        result = 31 * result + this.LoadedImageNameSize.hashCode()
        result = 31 * result + this.SymbolFileNameSize.hashCode()
        result = 31 * result + this.MappedImageNameSize.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class DEBUG_OFFSET_REGION(public var Base: ULong = 0uL, public var Size: ULong = 0uL)

public data class DEBUG_PNP_TRIAGE_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var Lock_Address: ULong = 0uL,
    public var Lock_ActiveCount: Int = 0,
    public var Lock_ContentionCount: UInt = 0u,
    public var Lock_NumberOfExclusiveWaiters: UInt = 0u,
    public var Lock_NumberOfSharedWaiters: UInt = 0u,
    public var Lock_Flag: UShort = 0u,
    public var TriagedThread: ULong = 0uL,
    public var ThreadCount: Int = 0,
    public var TriagedThread_WaitTime: ULong = 0uL,
)

public data class DEBUG_POOLTAG_DESCRIPTION(
    public var SizeOfStruct: UInt = 0u,
    public var PoolTag: UInt = 0u,
    public var Description: ByteArray = ByteArray(260),
    public var Binary: ByteArray = ByteArray(32),
    public var Owner: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_POOLTAG_DESCRIPTION) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.PoolTag != other.PoolTag) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (!this.Binary.contentEquals(other.Binary)) return false
        if (!this.Owner.contentEquals(other.Owner)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.PoolTag.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.Binary.contentHashCode()
        result = 31 * result + this.Owner.contentHashCode()
        return result
    }
}

public data class DEBUG_POOL_DATA(
    public var SizeofStruct: UInt = 0u,
    public var PoolBlock: ULong = 0uL,
    public var Pool: ULong = 0uL,
    public var PreviousSize: UInt = 0u,
    public var Size: UInt = 0u,
    public var PoolTag: UInt = 0u,
    public var ProcessBilled: ULong = 0uL,
    public var Anonymous: DEBUG_POOL_DATA_0 = DEBUG_POOL_DATA_0(),
    public var Reserved2: ULongArray = ULongArray(4),
    public var PoolTagDescription: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_POOL_DATA) return false
        if (this.SizeofStruct != other.SizeofStruct) return false
        if (this.PoolBlock != other.PoolBlock) return false
        if (this.Pool != other.Pool) return false
        if (this.PreviousSize != other.PreviousSize) return false
        if (this.Size != other.Size) return false
        if (this.PoolTag != other.PoolTag) return false
        if (this.ProcessBilled != other.ProcessBilled) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (!this.PoolTagDescription.contentEquals(other.PoolTagDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeofStruct.hashCode()
        result = 31 * result + this.PoolBlock.hashCode()
        result = 31 * result + this.Pool.hashCode()
        result = 31 * result + this.PreviousSize.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.PoolTag.hashCode()
        result = 31 * result + this.ProcessBilled.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.PoolTagDescription.contentHashCode()
        return result
    }
}

public data class DEBUG_POOL_DATA_0(public var Anonymous: DEBUG_POOL_DATA_0_0 = DEBUG_POOL_DATA_0_0(), public var AsUlong: UInt = 0u)

public data class DEBUG_POOL_DATA_0_0(public var _bitfield: UInt = 0u)

public data class DEBUG_PROCESSOR_IDENTIFICATION_ALL(
    public var Alpha: DEBUG_PROCESSOR_IDENTIFICATION_ALPHA = DEBUG_PROCESSOR_IDENTIFICATION_ALPHA(),
    public var Amd64: DEBUG_PROCESSOR_IDENTIFICATION_AMD64 = DEBUG_PROCESSOR_IDENTIFICATION_AMD64(),
    public var Ia64: DEBUG_PROCESSOR_IDENTIFICATION_IA64 = DEBUG_PROCESSOR_IDENTIFICATION_IA64(),
    public var X86: DEBUG_PROCESSOR_IDENTIFICATION_X86 = DEBUG_PROCESSOR_IDENTIFICATION_X86(),
    public var Arm: DEBUG_PROCESSOR_IDENTIFICATION_ARM = DEBUG_PROCESSOR_IDENTIFICATION_ARM(),
    public var Arm64: DEBUG_PROCESSOR_IDENTIFICATION_ARM64 = DEBUG_PROCESSOR_IDENTIFICATION_ARM64(),
)

public data class DEBUG_PROCESSOR_IDENTIFICATION_ALPHA(public var Type: UInt = 0u, public var Revision: UInt = 0u)

public data class DEBUG_PROCESSOR_IDENTIFICATION_AMD64(
    public var Family: UInt = 0u,
    public var Model: UInt = 0u,
    public var Stepping: UInt = 0u,
    public var VendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_PROCESSOR_IDENTIFICATION_AMD64) return false
        if (this.Family != other.Family) return false
        if (this.Model != other.Model) return false
        if (this.Stepping != other.Stepping) return false
        if (!this.VendorString.contentEquals(other.VendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Family.hashCode()
        result = 31 * result + this.Model.hashCode()
        result = 31 * result + this.Stepping.hashCode()
        result = 31 * result + this.VendorString.contentHashCode()
        return result
    }
}

public data class DEBUG_PROCESSOR_IDENTIFICATION_ARM(
    public var Model: UInt = 0u,
    public var Revision: UInt = 0u,
    public var VendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_PROCESSOR_IDENTIFICATION_ARM) return false
        if (this.Model != other.Model) return false
        if (this.Revision != other.Revision) return false
        if (!this.VendorString.contentEquals(other.VendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Model.hashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.VendorString.contentHashCode()
        return result
    }
}

public data class DEBUG_PROCESSOR_IDENTIFICATION_ARM64(
    public var Model: UInt = 0u,
    public var Revision: UInt = 0u,
    public var VendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_PROCESSOR_IDENTIFICATION_ARM64) return false
        if (this.Model != other.Model) return false
        if (this.Revision != other.Revision) return false
        if (!this.VendorString.contentEquals(other.VendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Model.hashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.VendorString.contentHashCode()
        return result
    }
}

public data class DEBUG_PROCESSOR_IDENTIFICATION_IA64(
    public var Model: UInt = 0u,
    public var Revision: UInt = 0u,
    public var Family: UInt = 0u,
    public var ArchRev: UInt = 0u,
    public var VendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_PROCESSOR_IDENTIFICATION_IA64) return false
        if (this.Model != other.Model) return false
        if (this.Revision != other.Revision) return false
        if (this.Family != other.Family) return false
        if (this.ArchRev != other.ArchRev) return false
        if (!this.VendorString.contentEquals(other.VendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Model.hashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.Family.hashCode()
        result = 31 * result + this.ArchRev.hashCode()
        result = 31 * result + this.VendorString.contentHashCode()
        return result
    }
}

public data class DEBUG_PROCESSOR_IDENTIFICATION_X86(
    public var Family: UInt = 0u,
    public var Model: UInt = 0u,
    public var Stepping: UInt = 0u,
    public var VendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_PROCESSOR_IDENTIFICATION_X86) return false
        if (this.Family != other.Family) return false
        if (this.Model != other.Model) return false
        if (this.Stepping != other.Stepping) return false
        if (!this.VendorString.contentEquals(other.VendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Family.hashCode()
        result = 31 * result + this.Model.hashCode()
        result = 31 * result + this.Stepping.hashCode()
        result = 31 * result + this.VendorString.contentHashCode()
        return result
    }
}

public data class DEBUG_READ_USER_MINIDUMP_STREAM(
    public var StreamType: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Offset: ULong = 0uL,
    public var Buffer: Long = 0L,
    public var BufferSize: UInt = 0u,
    public var BufferUsed: UInt = 0u,
)

public data class DEBUG_REGISTER_DESCRIPTION(
    public var Type: UInt = 0u,
    public var Flags: UInt = 0u,
    public var SubregMaster: UInt = 0u,
    public var SubregLength: UInt = 0u,
    public var SubregMask: ULong = 0uL,
    public var SubregShift: UInt = 0u,
    public var Reserved0: UInt = 0u,
)

public class DEBUG_SMBIOS_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var SmbiosMajorVersion: UByte = 0u,
    public var SmbiosMinorVersion: UByte = 0u,
    public var DMIVersion: UByte = 0u,
    public var TableSize: UInt = 0u,
    public var BiosMajorRelease: UByte = 0u,
    public var BiosMinorRelease: UByte = 0u,
    public var FirmwareMajorRelease: UByte = 0u,
    public var FirmwareMinorRelease: UByte = 0u,
    public var BaseBoardManufacturer: ByteArray = ByteArray(64),
    public var BaseBoardProduct: ByteArray = ByteArray(64),
    public var BaseBoardVersion: ByteArray = ByteArray(64),
    public var BiosReleaseDate: ByteArray = ByteArray(64),
    public var BiosVendor: ByteArray = ByteArray(64),
    public var BiosVersion: ByteArray = ByteArray(64),
    public var SystemFamily: ByteArray = ByteArray(64),
    public var SystemManufacturer: ByteArray = ByteArray(64),
    public var SystemProductName: ByteArray = ByteArray(64),
    public var SystemSKU: ByteArray = ByteArray(64),
    public var SystemVersion: ByteArray = ByteArray(64),
)

public data class DEBUG_SPECIFIC_FILTER_PARAMETERS(
    public var ExecutionOption: UInt = 0u,
    public var ContinueOption: UInt = 0u,
    public var TextSize: UInt = 0u,
    public var CommandSize: UInt = 0u,
    public var ArgumentSize: UInt = 0u,
)

public data class DEBUG_STACK_FRAME(
    public var InstructionOffset: ULong = 0uL,
    public var ReturnOffset: ULong = 0uL,
    public var FrameOffset: ULong = 0uL,
    public var StackOffset: ULong = 0uL,
    public var FuncTableEntry: ULong = 0uL,
    public var Params: ULongArray = ULongArray(4),
    public var Reserved: ULongArray = ULongArray(6),
    public var Virtual: BOOL = 0,
    public var FrameNumber: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_STACK_FRAME) return false
        if (this.InstructionOffset != other.InstructionOffset) return false
        if (this.ReturnOffset != other.ReturnOffset) return false
        if (this.FrameOffset != other.FrameOffset) return false
        if (this.StackOffset != other.StackOffset) return false
        if (this.FuncTableEntry != other.FuncTableEntry) return false
        if (!this.Params.contentEquals(other.Params)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Virtual != other.Virtual) return false
        if (this.FrameNumber != other.FrameNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InstructionOffset.hashCode()
        result = 31 * result + this.ReturnOffset.hashCode()
        result = 31 * result + this.FrameOffset.hashCode()
        result = 31 * result + this.StackOffset.hashCode()
        result = 31 * result + this.FuncTableEntry.hashCode()
        result = 31 * result + this.Params.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Virtual.hashCode()
        result = 31 * result + this.FrameNumber.hashCode()
        return result
    }
}

public data class DEBUG_STACK_FRAME_EX(
    public var InstructionOffset: ULong = 0uL,
    public var ReturnOffset: ULong = 0uL,
    public var FrameOffset: ULong = 0uL,
    public var StackOffset: ULong = 0uL,
    public var FuncTableEntry: ULong = 0uL,
    public var Params: ULongArray = ULongArray(4),
    public var Reserved: ULongArray = ULongArray(6),
    public var Virtual: BOOL = 0,
    public var FrameNumber: UInt = 0u,
    public var InlineFrameContext: UInt = 0u,
    public var Reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_STACK_FRAME_EX) return false
        if (this.InstructionOffset != other.InstructionOffset) return false
        if (this.ReturnOffset != other.ReturnOffset) return false
        if (this.FrameOffset != other.FrameOffset) return false
        if (this.StackOffset != other.StackOffset) return false
        if (this.FuncTableEntry != other.FuncTableEntry) return false
        if (!this.Params.contentEquals(other.Params)) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Virtual != other.Virtual) return false
        if (this.FrameNumber != other.FrameNumber) return false
        if (this.InlineFrameContext != other.InlineFrameContext) return false
        if (this.Reserved1 != other.Reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InstructionOffset.hashCode()
        result = 31 * result + this.ReturnOffset.hashCode()
        result = 31 * result + this.FrameOffset.hashCode()
        result = 31 * result + this.StackOffset.hashCode()
        result = 31 * result + this.FuncTableEntry.hashCode()
        result = 31 * result + this.Params.contentHashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Virtual.hashCode()
        result = 31 * result + this.FrameNumber.hashCode()
        result = 31 * result + this.InlineFrameContext.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        return result
    }
}

public data class DEBUG_SYMBOL_ENTRY(
    public var ModuleBase: ULong = 0uL,
    public var Offset: ULong = 0uL,
    public var Id: ULong = 0uL,
    public var Arg64: ULong = 0uL,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TypeId: UInt = 0u,
    public var NameSize: UInt = 0u,
    public var Token: UInt = 0u,
    public var Tag: UInt = 0u,
    public var Arg32: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class DEBUG_SYMBOL_PARAMETERS(
    public var Module: ULong = 0uL,
    public var TypeId: UInt = 0u,
    public var ParentSymbol: UInt = 0u,
    public var SubElements: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Reserved: ULong = 0uL,
)

public data class DEBUG_SYMBOL_SOURCE_ENTRY(
    public var ModuleBase: ULong = 0uL,
    public var Offset: ULong = 0uL,
    public var FileNameId: ULong = 0uL,
    public var EngineInternal: ULong = 0uL,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var FileNameSize: UInt = 0u,
    public var StartLine: UInt = 0u,
    public var EndLine: UInt = 0u,
    public var StartColumn: UInt = 0u,
    public var EndColumn: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class DEBUG_THREAD_BASIC_INFORMATION(
    public var Valid: UInt = 0u,
    public var ExitStatus: UInt = 0u,
    public var PriorityClass: UInt = 0u,
    public var Priority: UInt = 0u,
    public var CreateTime: ULong = 0uL,
    public var ExitTime: ULong = 0uL,
    public var KernelTime: ULong = 0uL,
    public var UserTime: ULong = 0uL,
    public var StartOffset: ULong = 0uL,
    public var Affinity: ULong = 0uL,
)

public data class DEBUG_TRIAGE_FOLLOWUP_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var OwnerNameSize: UInt = 0u,
    public var OwnerName: PSTR = 0L,
)

public data class DEBUG_TRIAGE_FOLLOWUP_INFO_2(
    public var SizeOfStruct: UInt = 0u,
    public var OwnerNameSize: UInt = 0u,
    public var OwnerName: PSTR = 0L,
    public var FeaturePathSize: UInt = 0u,
    public var FeaturePath: PSTR = 0L,
)

public data class DEBUG_TYPED_DATA(
    public var ModBase: ULong = 0uL,
    public var Offset: ULong = 0uL,
    public var EngineHandle: ULong = 0uL,
    public var Data: ULong = 0uL,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var TypeId: UInt = 0u,
    public var BaseTypeId: UInt = 0u,
    public var Tag: UInt = 0u,
    public var Register: UInt = 0u,
    public var Internal: ULongArray = ULongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DEBUG_TYPED_DATA) return false
        if (this.ModBase != other.ModBase) return false
        if (this.Offset != other.Offset) return false
        if (this.EngineHandle != other.EngineHandle) return false
        if (this.Data != other.Data) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.TypeId != other.TypeId) return false
        if (this.BaseTypeId != other.BaseTypeId) return false
        if (this.Tag != other.Tag) return false
        if (this.Register != other.Register) return false
        if (!this.Internal.contentEquals(other.Internal)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ModBase.hashCode()
        result = 31 * result + this.Offset.hashCode()
        result = 31 * result + this.EngineHandle.hashCode()
        result = 31 * result + this.Data.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.TypeId.hashCode()
        result = 31 * result + this.BaseTypeId.hashCode()
        result = 31 * result + this.Tag.hashCode()
        result = 31 * result + this.Register.hashCode()
        result = 31 * result + this.Internal.contentHashCode()
        return result
    }
}

public data class DEBUG_VALUE(
    public var Anonymous: DEBUG_VALUE_0 = DEBUG_VALUE_0(),
    public var TailOfRawBytes: UInt = 0u,
    public var Type: UInt = 0u,
)

public class DEBUG_VALUE_0(
    public var I8: UByte = 0u,
    public var I16: UShort = 0u,
    public var I32: UInt = 0u,
    public var Anonymous: DEBUG_VALUE_0_0 = DEBUG_VALUE_0_0(),
    public var F32: Float = 0.0f,
    public var F64: Double = 0.0,
    public var F80Bytes: UByteArray = UByteArray(10),
    public var F82Bytes: UByteArray = UByteArray(11),
    public var F128Bytes: UByteArray = UByteArray(16),
    public var VI8: UByteArray = UByteArray(16),
    public var VI16: UShortArray = UShortArray(8),
    public var VI32: UIntArray = UIntArray(4),
    public var VI64: ULongArray = ULongArray(2),
    public var VF32: FloatArray = FloatArray(4),
    public var VF64: DoubleArray = DoubleArray(2),
    public var I64Parts32: DEBUG_VALUE_0_1 = DEBUG_VALUE_0_1(),
    public var F128Parts64: DEBUG_VALUE_0_2 = DEBUG_VALUE_0_2(),
    public var RawBytes: UByteArray = UByteArray(24),
)

public data class DEBUG_VALUE_0_0(public var I64: ULong = 0uL, public var Nat: BOOL = 0)

public data class DEBUG_VALUE_0_2(public var LowPart: ULong = 0uL, public var HighPart: Long = 0L)

public data class DEBUG_VALUE_0_1(public var LowPart: UInt = 0u, public var HighPart: UInt = 0u)

public data class EXTSTACKTRACE(
    public var FramePointer: UInt = 0u,
    public var ProgramCounter: UInt = 0u,
    public var ReturnAddress: UInt = 0u,
    public var Args: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXTSTACKTRACE) return false
        if (this.FramePointer != other.FramePointer) return false
        if (this.ProgramCounter != other.ProgramCounter) return false
        if (this.ReturnAddress != other.ReturnAddress) return false
        if (!this.Args.contentEquals(other.Args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FramePointer.hashCode()
        result = 31 * result + this.ProgramCounter.hashCode()
        result = 31 * result + this.ReturnAddress.hashCode()
        result = 31 * result + this.Args.contentHashCode()
        return result
    }
}

public data class EXTSTACKTRACE32(
    public var FramePointer: UInt = 0u,
    public var ProgramCounter: UInt = 0u,
    public var ReturnAddress: UInt = 0u,
    public var Args: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXTSTACKTRACE32) return false
        if (this.FramePointer != other.FramePointer) return false
        if (this.ProgramCounter != other.ProgramCounter) return false
        if (this.ReturnAddress != other.ReturnAddress) return false
        if (!this.Args.contentEquals(other.Args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FramePointer.hashCode()
        result = 31 * result + this.ProgramCounter.hashCode()
        result = 31 * result + this.ReturnAddress.hashCode()
        result = 31 * result + this.Args.contentHashCode()
        return result
    }
}

public data class EXTSTACKTRACE64(
    public var FramePointer: ULong = 0uL,
    public var ProgramCounter: ULong = 0uL,
    public var ReturnAddress: ULong = 0uL,
    public var Args: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXTSTACKTRACE64) return false
        if (this.FramePointer != other.FramePointer) return false
        if (this.ProgramCounter != other.ProgramCounter) return false
        if (this.ReturnAddress != other.ReturnAddress) return false
        if (!this.Args.contentEquals(other.Args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FramePointer.hashCode()
        result = 31 * result + this.ProgramCounter.hashCode()
        result = 31 * result + this.ReturnAddress.hashCode()
        result = 31 * result + this.Args.contentHashCode()
        return result
    }
}

public data class EXT_API_VERSION(
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var Revision: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class EXT_CAB_XML_DATA(
    public var SizeOfStruct: UInt = 0u,
    public var XmlObjectTag: PCWSTR = 0L,
    public var NumSubTags: UInt = 0u,
    public var SubTags: List<EXT_CAB_XML_DATA_0> = List(1) { EXT_CAB_XML_DATA_0() },
)

public data class EXT_CAB_XML_DATA_0(
    public var SubTag: PCWSTR = 0L,
    public var MatchPattern: PCWSTR = 0L,
    public var ReturnText: PWSTR = 0L,
    public var ReturnTextSize: UInt = 0u,
    public var _bitfield: UInt = 0u,
    public var Reserved2: UInt = 0u,
)

public data class EXT_FIND_FILE(
    public var FileName: PCWSTR = 0L,
    public var IndexedSize: ULong = 0uL,
    public var ImageTimeDateStamp: UInt = 0u,
    public var ImageCheckSum: UInt = 0u,
    public var ExtraInfo: Long = 0L,
    public var ExtraInfoSize: UInt = 0u,
    public var Flags: UInt = 0u,
    public var FileMapping: Long = 0L,
    public var FileMappingSize: ULong = 0uL,
    public var FileHandle: HANDLE = 0L,
    public var FoundFileName: PWSTR = 0L,
    public var FoundFileNameChars: UInt = 0u,
)

public data class EXT_MATCH_PATTERN_A(
    public var Str: PCSTR = 0L,
    public var Pattern: PCSTR = 0L,
    public var CaseSensitive: UInt = 0u,
)

public class EXT_TYPED_DATA(
    public var Operation: EXT_TDOP = 0,
    public var Flags: UInt = 0u,
    public var InData: DEBUG_TYPED_DATA = DEBUG_TYPED_DATA(),
    public var OutData: DEBUG_TYPED_DATA = DEBUG_TYPED_DATA(),
    public var InStrIndex: UInt = 0u,
    public var In32: UInt = 0u,
    public var Out32: UInt = 0u,
    public var In64: ULong = 0uL,
    public var Out64: ULong = 0uL,
    public var StrBufferIndex: UInt = 0u,
    public var StrBufferChars: UInt = 0u,
    public var StrCharsNeeded: UInt = 0u,
    public var DataBufferIndex: UInt = 0u,
    public var DataBufferBytes: UInt = 0u,
    public var DataBytesNeeded: UInt = 0u,
    public var Status: HRESULT = 0,
    public var Reserved: ULongArray = ULongArray(8),
)

public data class FA_ENTRY(
    public var Tag: DEBUG_FLR_PARAM_TYPE = 0,
    public var FullSize: UShort = 0u,
    public var DataSize: UShort = 0u,
)

public data class FIELD_INFO(
    public var fName: Long = 0L,
    public var printName: Long = 0L,
    public var size: UInt = 0u,
    public var fOptions: UInt = 0u,
    public var address: ULong = 0uL,
    public var Anonymous: FIELD_INFO_0 = FIELD_INFO_0(),
    public var TypeId: UInt = 0u,
    public var FieldOffset: UInt = 0u,
    public var BufferSize: UInt = 0u,
    public var BitField: FIELD_INFO_1 = FIELD_INFO_1(),
    public var _bitfield: UInt = 0u,
)

public data class FIELD_INFO_0(public var fieldCallBack: Long = 0L, public var pBuffer: Long = 0L)

public data class FIELD_INFO_1(public var Position: UShort = 0u, public var Size: UShort = 0u)

public data class GET_CONTEXT_EX(
    public var Status: UInt = 0u,
    public var ContextSize: UInt = 0u,
    public var pContext: Long = 0L,
)

public data class GET_CURRENT_PROCESS_ADDRESS(
    public var Processor: UInt = 0u,
    public var CurrentThread: ULong = 0uL,
    public var Address: ULong = 0uL,
)

public data class GET_CURRENT_THREAD_ADDRESS(public var Processor: UInt = 0u, public var Address: ULong = 0uL)

public data class GET_EXPRESSION_EX(
    public var Expression: PCSTR = 0L,
    public var Remainder: PCSTR = 0L,
    public var Value: ULong = 0uL,
)

public data class GET_INPUT_LINE(
    public var Prompt: PCSTR = 0L,
    public var Buffer: PSTR = 0L,
    public var BufferSize: UInt = 0u,
    public var InputSize: UInt = 0u,
)

public data class GET_PEB_ADDRESS(public var CurrentThread: ULong = 0uL, public var Address: ULong = 0uL)

public data class GET_SET_SYMPATH(
    public var Args: PCSTR = 0L,
    public var Result: PSTR = 0L,
    public var Length: Int = 0,
)

public data class GET_TEB_ADDRESS(public var Address: ULong = 0uL)

public data class INLINE_FRAME_CONTEXT(public var ContextValue: UInt = 0u, public var Anonymous: INLINE_FRAME_CONTEXT_0 = INLINE_FRAME_CONTEXT_0())

public data class INLINE_FRAME_CONTEXT_0(
    public var FrameId: UByte = 0u,
    public var FrameType: UByte = 0u,
    public var FrameSignature: UShort = 0u,
)

public data class IOSPACE(
    public var Address: UInt = 0u,
    public var Length: UInt = 0u,
    public var Data: UInt = 0u,
)

public data class IOSPACE32(
    public var Address: UInt = 0u,
    public var Length: UInt = 0u,
    public var Data: UInt = 0u,
)

public data class IOSPACE64(
    public var Address: ULong = 0uL,
    public var Length: UInt = 0u,
    public var Data: UInt = 0u,
)

public data class IOSPACE_EX(
    public var Address: UInt = 0u,
    public var Length: UInt = 0u,
    public var Data: UInt = 0u,
    public var InterfaceType: UInt = 0u,
    public var BusNumber: UInt = 0u,
    public var AddressSpace: UInt = 0u,
)

public data class IOSPACE_EX32(
    public var Address: UInt = 0u,
    public var Length: UInt = 0u,
    public var Data: UInt = 0u,
    public var InterfaceType: UInt = 0u,
    public var BusNumber: UInt = 0u,
    public var AddressSpace: UInt = 0u,
)

public data class IOSPACE_EX64(
    public var Address: ULong = 0uL,
    public var Length: UInt = 0u,
    public var Data: UInt = 0u,
    public var InterfaceType: UInt = 0u,
    public var BusNumber: UInt = 0u,
    public var AddressSpace: UInt = 0u,
)

public class KDDEBUGGER_DATA32 {
    public var Header: DBGKD_DEBUG_DATA_HEADER32 = DBGKD_DEBUG_DATA_HEADER32()

    public var KernBase: UInt = 0u

    public var BreakpointWithStatus: UInt = 0u

    public var SavedContext: UInt = 0u

    public var ThCallbackStack: UShort = 0u

    public var NextCallback: UShort = 0u

    public var FramePointer: UShort = 0u

    public var _bitfield: UShort = 0u

    public var KiCallUserMode: UInt = 0u

    public var KeUserCallbackDispatcher: UInt = 0u

    public var PsLoadedModuleList: UInt = 0u

    public var PsActiveProcessHead: UInt = 0u

    public var PspCidTable: UInt = 0u

    public var ExpSystemResourcesList: UInt = 0u

    public var ExpPagedPoolDescriptor: UInt = 0u

    public var ExpNumberOfPagedPools: UInt = 0u

    public var KeTimeIncrement: UInt = 0u

    public var KeBugCheckCallbackListHead: UInt = 0u

    public var KiBugcheckData: UInt = 0u

    public var IopErrorLogListHead: UInt = 0u

    public var ObpRootDirectoryObject: UInt = 0u

    public var ObpTypeObjectType: UInt = 0u

    public var MmSystemCacheStart: UInt = 0u

    public var MmSystemCacheEnd: UInt = 0u

    public var MmSystemCacheWs: UInt = 0u

    public var MmPfnDatabase: UInt = 0u

    public var MmSystemPtesStart: UInt = 0u

    public var MmSystemPtesEnd: UInt = 0u

    public var MmSubsectionBase: UInt = 0u

    public var MmNumberOfPagingFiles: UInt = 0u

    public var MmLowestPhysicalPage: UInt = 0u

    public var MmHighestPhysicalPage: UInt = 0u

    public var MmNumberOfPhysicalPages: UInt = 0u

    public var MmMaximumNonPagedPoolInBytes: UInt = 0u

    public var MmNonPagedSystemStart: UInt = 0u

    public var MmNonPagedPoolStart: UInt = 0u

    public var MmNonPagedPoolEnd: UInt = 0u

    public var MmPagedPoolStart: UInt = 0u

    public var MmPagedPoolEnd: UInt = 0u

    public var MmPagedPoolInformation: UInt = 0u

    public var MmPageSize: UInt = 0u

    public var MmSizeOfPagedPoolInBytes: UInt = 0u

    public var MmTotalCommitLimit: UInt = 0u

    public var MmTotalCommittedPages: UInt = 0u

    public var MmSharedCommit: UInt = 0u

    public var MmDriverCommit: UInt = 0u

    public var MmProcessCommit: UInt = 0u

    public var MmPagedPoolCommit: UInt = 0u

    public var MmExtendedCommit: UInt = 0u

    public var MmZeroedPageListHead: UInt = 0u

    public var MmFreePageListHead: UInt = 0u

    public var MmStandbyPageListHead: UInt = 0u

    public var MmModifiedPageListHead: UInt = 0u

    public var MmModifiedNoWritePageListHead: UInt = 0u

    public var MmAvailablePages: UInt = 0u

    public var MmResidentAvailablePages: UInt = 0u

    public var PoolTrackTable: UInt = 0u

    public var NonPagedPoolDescriptor: UInt = 0u

    public var MmHighestUserAddress: UInt = 0u

    public var MmSystemRangeStart: UInt = 0u

    public var MmUserProbeAddress: UInt = 0u

    public var KdPrintCircularBuffer: UInt = 0u

    public var KdPrintCircularBufferEnd: UInt = 0u

    public var KdPrintWritePointer: UInt = 0u

    public var KdPrintRolloverCount: UInt = 0u

    public var MmLoadedUserImageList: UInt = 0u
}

public class KDDEBUGGER_DATA64 {
    public var Header: DBGKD_DEBUG_DATA_HEADER64 = DBGKD_DEBUG_DATA_HEADER64()

    public var KernBase: ULong = 0uL

    public var BreakpointWithStatus: ULong = 0uL

    public var SavedContext: ULong = 0uL

    public var ThCallbackStack: UShort = 0u

    public var NextCallback: UShort = 0u

    public var FramePointer: UShort = 0u

    public var _bitfield: UShort = 0u

    public var KiCallUserMode: ULong = 0uL

    public var KeUserCallbackDispatcher: ULong = 0uL

    public var PsLoadedModuleList: ULong = 0uL

    public var PsActiveProcessHead: ULong = 0uL

    public var PspCidTable: ULong = 0uL

    public var ExpSystemResourcesList: ULong = 0uL

    public var ExpPagedPoolDescriptor: ULong = 0uL

    public var ExpNumberOfPagedPools: ULong = 0uL

    public var KeTimeIncrement: ULong = 0uL

    public var KeBugCheckCallbackListHead: ULong = 0uL

    public var KiBugcheckData: ULong = 0uL

    public var IopErrorLogListHead: ULong = 0uL

    public var ObpRootDirectoryObject: ULong = 0uL

    public var ObpTypeObjectType: ULong = 0uL

    public var MmSystemCacheStart: ULong = 0uL

    public var MmSystemCacheEnd: ULong = 0uL

    public var MmSystemCacheWs: ULong = 0uL

    public var MmPfnDatabase: ULong = 0uL

    public var MmSystemPtesStart: ULong = 0uL

    public var MmSystemPtesEnd: ULong = 0uL

    public var MmSubsectionBase: ULong = 0uL

    public var MmNumberOfPagingFiles: ULong = 0uL

    public var MmLowestPhysicalPage: ULong = 0uL

    public var MmHighestPhysicalPage: ULong = 0uL

    public var MmNumberOfPhysicalPages: ULong = 0uL

    public var MmMaximumNonPagedPoolInBytes: ULong = 0uL

    public var MmNonPagedSystemStart: ULong = 0uL

    public var MmNonPagedPoolStart: ULong = 0uL

    public var MmNonPagedPoolEnd: ULong = 0uL

    public var MmPagedPoolStart: ULong = 0uL

    public var MmPagedPoolEnd: ULong = 0uL

    public var MmPagedPoolInformation: ULong = 0uL

    public var MmPageSize: ULong = 0uL

    public var MmSizeOfPagedPoolInBytes: ULong = 0uL

    public var MmTotalCommitLimit: ULong = 0uL

    public var MmTotalCommittedPages: ULong = 0uL

    public var MmSharedCommit: ULong = 0uL

    public var MmDriverCommit: ULong = 0uL

    public var MmProcessCommit: ULong = 0uL

    public var MmPagedPoolCommit: ULong = 0uL

    public var MmExtendedCommit: ULong = 0uL

    public var MmZeroedPageListHead: ULong = 0uL

    public var MmFreePageListHead: ULong = 0uL

    public var MmStandbyPageListHead: ULong = 0uL

    public var MmModifiedPageListHead: ULong = 0uL

    public var MmModifiedNoWritePageListHead: ULong = 0uL

    public var MmAvailablePages: ULong = 0uL

    public var MmResidentAvailablePages: ULong = 0uL

    public var PoolTrackTable: ULong = 0uL

    public var NonPagedPoolDescriptor: ULong = 0uL

    public var MmHighestUserAddress: ULong = 0uL

    public var MmSystemRangeStart: ULong = 0uL

    public var MmUserProbeAddress: ULong = 0uL

    public var KdPrintCircularBuffer: ULong = 0uL

    public var KdPrintCircularBufferEnd: ULong = 0uL

    public var KdPrintWritePointer: ULong = 0uL

    public var KdPrintRolloverCount: ULong = 0uL

    public var MmLoadedUserImageList: ULong = 0uL

    public var NtBuildLab: ULong = 0uL

    public var KiNormalSystemCall: ULong = 0uL

    public var KiProcessorBlock: ULong = 0uL

    public var MmUnloadedDrivers: ULong = 0uL

    public var MmLastUnloadedDriver: ULong = 0uL

    public var MmTriageActionTaken: ULong = 0uL

    public var MmSpecialPoolTag: ULong = 0uL

    public var KernelVerifier: ULong = 0uL

    public var MmVerifierData: ULong = 0uL

    public var MmAllocatedNonPagedPool: ULong = 0uL

    public var MmPeakCommitment: ULong = 0uL

    public var MmTotalCommitLimitMaximum: ULong = 0uL

    public var CmNtCSDVersion: ULong = 0uL

    public var MmPhysicalMemoryBlock: ULong = 0uL

    public var MmSessionBase: ULong = 0uL

    public var MmSessionSize: ULong = 0uL

    public var MmSystemParentTablePage: ULong = 0uL

    public var MmVirtualTranslationBase: ULong = 0uL

    public var OffsetKThreadNextProcessor: UShort = 0u

    public var OffsetKThreadTeb: UShort = 0u

    public var OffsetKThreadKernelStack: UShort = 0u

    public var OffsetKThreadInitialStack: UShort = 0u

    public var OffsetKThreadApcProcess: UShort = 0u

    public var OffsetKThreadState: UShort = 0u

    public var OffsetKThreadBStore: UShort = 0u

    public var OffsetKThreadBStoreLimit: UShort = 0u

    public var SizeEProcess: UShort = 0u

    public var OffsetEprocessPeb: UShort = 0u

    public var OffsetEprocessParentCID: UShort = 0u

    public var OffsetEprocessDirectoryTableBase: UShort = 0u

    public var SizePrcb: UShort = 0u

    public var OffsetPrcbDpcRoutine: UShort = 0u

    public var OffsetPrcbCurrentThread: UShort = 0u

    public var OffsetPrcbMhz: UShort = 0u

    public var OffsetPrcbCpuType: UShort = 0u

    public var OffsetPrcbVendorString: UShort = 0u

    public var OffsetPrcbProcStateContext: UShort = 0u

    public var OffsetPrcbNumber: UShort = 0u

    public var SizeEThread: UShort = 0u

    public var L1tfHighPhysicalBitIndex: UByte = 0u

    public var L1tfSwizzleBitIndex: UByte = 0u

    public var Padding0: UInt = 0u

    public var KdPrintCircularBufferPtr: ULong = 0uL

    public var KdPrintBufferSize: ULong = 0uL

    public var KeLoaderBlock: ULong = 0uL

    public var SizePcr: UShort = 0u

    public var OffsetPcrSelfPcr: UShort = 0u

    public var OffsetPcrCurrentPrcb: UShort = 0u

    public var OffsetPcrContainedPrcb: UShort = 0u

    public var OffsetPcrInitialBStore: UShort = 0u

    public var OffsetPcrBStoreLimit: UShort = 0u

    public var OffsetPcrInitialStack: UShort = 0u

    public var OffsetPcrStackLimit: UShort = 0u

    public var OffsetPrcbPcrPage: UShort = 0u

    public var OffsetPrcbProcStateSpecialReg: UShort = 0u

    public var GdtR0Code: UShort = 0u

    public var GdtR0Data: UShort = 0u

    public var GdtR0Pcr: UShort = 0u

    public var GdtR3Code: UShort = 0u

    public var GdtR3Data: UShort = 0u

    public var GdtR3Teb: UShort = 0u

    public var GdtLdt: UShort = 0u

    public var GdtTss: UShort = 0u

    public var Gdt64R3CmCode: UShort = 0u

    public var Gdt64R3CmTeb: UShort = 0u

    public var IopNumTriageDumpDataBlocks: ULong = 0uL

    public var IopTriageDumpDataBlocks: ULong = 0uL

    public var VfCrashDataBlock: ULong = 0uL

    public var MmBadPagesDetected: ULong = 0uL

    public var MmZeroedPageSingleBitErrorsDetected: ULong = 0uL

    public var EtwpDebuggerData: ULong = 0uL

    public var OffsetPrcbContext: UShort = 0u

    public var OffsetPrcbMaxBreakpoints: UShort = 0u

    public var OffsetPrcbMaxWatchpoints: UShort = 0u

    public var OffsetKThreadStackLimit: UInt = 0u

    public var OffsetKThreadStackBase: UInt = 0u

    public var OffsetKThreadQueueListEntry: UInt = 0u

    public var OffsetEThreadIrpList: UInt = 0u

    public var OffsetPrcbIdleThread: UShort = 0u

    public var OffsetPrcbNormalDpcState: UShort = 0u

    public var OffsetPrcbDpcStack: UShort = 0u

    public var OffsetPrcbIsrStack: UShort = 0u

    public var SizeKDPC_STACK_FRAME: UShort = 0u

    public var OffsetKPriQueueThreadListHead: UShort = 0u

    public var OffsetKThreadWaitReason: UShort = 0u

    public var Padding1: UShort = 0u

    public var PteBase: ULong = 0uL

    public var RetpolineStubFunctionTable: ULong = 0uL

    public var RetpolineStubFunctionTableSize: UInt = 0u

    public var RetpolineStubOffset: UInt = 0u

    public var RetpolineStubSize: UInt = 0u

    public var OffsetEProcessMmHotPatchContext: UShort = 0u

    public var OffsetKThreadShadowStackLimit: UInt = 0u

    public var OffsetKThreadShadowStackBase: UInt = 0u

    public var ShadowStackEnabled: ULong = 0uL

    public var PointerAuthMask: ULong = 0uL

    public var OffsetPrcbExceptionStack: UShort = 0u
}

public data class KDEXTS_LOCK_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var Address: ULong = 0uL,
    public var OwningThread: ULong = 0uL,
    public var ExclusiveOwned: BOOL = 0,
    public var NumOwners: UInt = 0u,
    public var ContentionCount: UInt = 0u,
    public var NumExclusiveWaiters: UInt = 0u,
    public var NumSharedWaiters: UInt = 0u,
    public var pOwnerThreads: Long = 0L,
    public var pWaiterThreads: Long = 0L,
)

public data class KDEXTS_PTE_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var VirtualAddress: ULong = 0uL,
    public var PpeAddress: ULong = 0uL,
    public var PdeAddress: ULong = 0uL,
    public var PteAddress: ULong = 0uL,
    public var Pfn: ULong = 0uL,
    public var Levels: ULong = 0uL,
    public var _bitfield1: UInt = 0u,
    public var _bitfield2: UInt = 0u,
)

public data class KDEXT_FILELOCK_OWNER(
    public var Sizeofstruct: UInt = 0u,
    public var FileObject: ULong = 0uL,
    public var OwnerThread: ULong = 0uL,
    public var WaitIrp: ULong = 0uL,
    public var DeviceObject: ULong = 0uL,
    public var BlockingDirver: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KDEXT_FILELOCK_OWNER) return false
        if (this.Sizeofstruct != other.Sizeofstruct) return false
        if (this.FileObject != other.FileObject) return false
        if (this.OwnerThread != other.OwnerThread) return false
        if (this.WaitIrp != other.WaitIrp) return false
        if (this.DeviceObject != other.DeviceObject) return false
        if (!this.BlockingDirver.contentEquals(other.BlockingDirver)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Sizeofstruct.hashCode()
        result = 31 * result + this.FileObject.hashCode()
        result = 31 * result + this.OwnerThread.hashCode()
        result = 31 * result + this.WaitIrp.hashCode()
        result = 31 * result + this.DeviceObject.hashCode()
        result = 31 * result + this.BlockingDirver.contentHashCode()
        return result
    }
}

public data class KDEXT_HANDLE_INFORMATION(
    public var HandleTableEntry: ULong = 0uL,
    public var Handle: ULong = 0uL,
    public var Object: ULong = 0uL,
    public var ObjectBody: ULong = 0uL,
    public var GrantedAccess: ULong = 0uL,
    public var HandleAttributes: UInt = 0u,
    public var PagedOut: Boolean = false,
)

public data class KDEXT_PROCESS_FIND_PARAMS(
    public var SizeofStruct: UInt = 0u,
    public var Pid: UInt = 0u,
    public var Session: UInt = 0u,
    public var ImageName: PSTR = 0L,
)

public data class KDEXT_THREAD_FIND_PARAMS(
    public var SizeofStruct: UInt = 0u,
    public var StackPointer: ULong = 0uL,
    public var Cid: UInt = 0u,
    public var Thread: ULong = 0uL,
)

public data class Location(public var HostDefined: ULong = 0uL, public var Offset: ULong = 0uL)

public class OS_INFO(
    public var MajorVer: UInt = 0u,
    public var MinorVer: UInt = 0u,
    public var Build: UInt = 0u,
    public var BuildQfe: UInt = 0u,
    public var ProductType: UInt = 0u,
    public var Suite: UInt = 0u,
    public var Revision: UInt = 0u,
    public var s: OS_INFO_0 = OS_INFO_0(),
    public var SrvPackNumber: UInt = 0u,
    public var ServicePackBuild: UInt = 0u,
    public var Architecture: UInt = 0u,
    public var Lcid: UInt = 0u,
    public var Name: ByteArray = ByteArray(64),
    public var FullName: ByteArray = ByteArray(256),
    public var Language: ByteArray = ByteArray(30),
    public var BuildVersion: ByteArray = ByteArray(64),
    public var ServicePackString: ByteArray = ByteArray(64),
)

public data class OS_INFO_0(public var _bitfield: UInt = 0u)

public data class OS_INFO_v1(
    public var Type: OS_TYPE = 0,
    public var Anonymous: OS_INFO_v1_0 = OS_INFO_v1_0(),
    public var ProductType: UInt = 0u,
    public var Suite: UInt = 0u,
    public var s: OS_INFO_v1_1 = OS_INFO_v1_1(),
    public var SrvPackNumber: UInt = 0u,
    public var Language: ByteArray = ByteArray(30),
    public var OsString: ByteArray = ByteArray(64),
    public var ServicePackString: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OS_INFO_v1) return false
        if (this.Type != other.Type) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.ProductType != other.ProductType) return false
        if (this.Suite != other.Suite) return false
        if (this.s != other.s) return false
        if (this.SrvPackNumber != other.SrvPackNumber) return false
        if (!this.Language.contentEquals(other.Language)) return false
        if (!this.OsString.contentEquals(other.OsString)) return false
        if (!this.ServicePackString.contentEquals(other.ServicePackString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.ProductType.hashCode()
        result = 31 * result + this.Suite.hashCode()
        result = 31 * result + this.s.hashCode()
        result = 31 * result + this.SrvPackNumber.hashCode()
        result = 31 * result + this.Language.contentHashCode()
        result = 31 * result + this.OsString.contentHashCode()
        result = 31 * result + this.ServicePackString.contentHashCode()
        return result
    }
}

public data class OS_INFO_v1_0(public var Version: OS_INFO_v1_0_0 = OS_INFO_v1_0_0(), public var Ver64: ULong = 0uL)

public data class OS_INFO_v1_0_0(public var Major: UInt = 0u, public var Minor: UInt = 0u)

public data class OS_INFO_v1_1(public var _bitfield: UInt = 0u)

public data class PHYSICAL(
    public var Address: ULong = 0uL,
    public var BufLen: UInt = 0u,
    public var Buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PHYSICAL) return false
        if (this.Address != other.Address) return false
        if (this.BufLen != other.BufLen) return false
        if (!this.Buf.contentEquals(other.Buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Address.hashCode()
        result = 31 * result + this.BufLen.hashCode()
        result = 31 * result + this.Buf.contentHashCode()
        return result
    }
}

public data class PHYSICAL_TO_VIRTUAL(
    public var Status: UInt = 0u,
    public var Size: UInt = 0u,
    public var PdeAddress: ULong = 0uL,
)

public data class PHYSICAL_WITH_FLAGS(
    public var Address: ULong = 0uL,
    public var BufLen: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PHYSICAL_WITH_FLAGS) return false
        if (this.Address != other.Address) return false
        if (this.BufLen != other.BufLen) return false
        if (this.Flags != other.Flags) return false
        if (!this.Buf.contentEquals(other.Buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Address.hashCode()
        result = 31 * result + this.BufLen.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Buf.contentHashCode()
        return result
    }
}

public data class POINTER_SEARCH_PHYSICAL(
    public var Offset: ULong = 0uL,
    public var Length: ULong = 0uL,
    public var PointerMin: ULong = 0uL,
    public var PointerMax: ULong = 0uL,
    public var Flags: UInt = 0u,
    public var MatchOffsets: Long = 0L,
    public var MatchOffsetsSize: UInt = 0u,
    public var MatchOffsetsCount: UInt = 0u,
)

public data class PROCESSORINFO(public var Processor: UShort = 0u, public var NumberProcessors: UShort = 0u)

public data class PROCESS_COMMIT_USAGE(
    public var ImageFileName: UByteArray = UByteArray(16),
    public var ClientId: ULong = 0uL,
    public var ProcessAddress: ULong = 0uL,
    public var CommitCharge: ULong = 0uL,
    public var SharedCommitCharge: ULong = 0uL,
    public var ReleasedCommitDebt: ULong = 0uL,
    public var Reserved: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESS_COMMIT_USAGE) return false
        if (!this.ImageFileName.contentEquals(other.ImageFileName)) return false
        if (this.ClientId != other.ClientId) return false
        if (this.ProcessAddress != other.ProcessAddress) return false
        if (this.CommitCharge != other.CommitCharge) return false
        if (this.SharedCommitCharge != other.SharedCommitCharge) return false
        if (this.ReleasedCommitDebt != other.ReleasedCommitDebt) return false
        if (this.Reserved != other.Reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ImageFileName.contentHashCode()
        result = 31 * result + this.ClientId.hashCode()
        result = 31 * result + this.ProcessAddress.hashCode()
        result = 31 * result + this.CommitCharge.hashCode()
        result = 31 * result + this.SharedCommitCharge.hashCode()
        result = 31 * result + this.ReleasedCommitDebt.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        return result
    }
}

public data class PROCESS_NAME_ENTRY(
    public var ProcessId: UInt = 0u,
    public var NameOffset: UInt = 0u,
    public var NameSize: UInt = 0u,
    public var NextEntry: UInt = 0u,
)

public data class READCONTROLSPACE(
    public var Processor: UShort = 0u,
    public var Address: UInt = 0u,
    public var BufLen: UInt = 0u,
    public var Buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is READCONTROLSPACE) return false
        if (this.Processor != other.Processor) return false
        if (this.Address != other.Address) return false
        if (this.BufLen != other.BufLen) return false
        if (!this.Buf.contentEquals(other.Buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Processor.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.BufLen.hashCode()
        result = 31 * result + this.Buf.contentHashCode()
        return result
    }
}

public data class READCONTROLSPACE32(
    public var Processor: UShort = 0u,
    public var Address: UInt = 0u,
    public var BufLen: UInt = 0u,
    public var Buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is READCONTROLSPACE32) return false
        if (this.Processor != other.Processor) return false
        if (this.Address != other.Address) return false
        if (this.BufLen != other.BufLen) return false
        if (!this.Buf.contentEquals(other.Buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Processor.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.BufLen.hashCode()
        result = 31 * result + this.Buf.contentHashCode()
        return result
    }
}

public data class READCONTROLSPACE64(
    public var Processor: UShort = 0u,
    public var Address: ULong = 0uL,
    public var BufLen: UInt = 0u,
    public var Buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is READCONTROLSPACE64) return false
        if (this.Processor != other.Processor) return false
        if (this.Address != other.Address) return false
        if (this.BufLen != other.BufLen) return false
        if (!this.Buf.contentEquals(other.Buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Processor.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.BufLen.hashCode()
        result = 31 * result + this.Buf.contentHashCode()
        return result
    }
}

public data class READ_WRITE_MSR(public var Msr: UInt = 0u, public var Value: Long = 0L)

public data class SEARCHMEMORY(
    public var SearchAddress: ULong = 0uL,
    public var SearchLength: ULong = 0uL,
    public var FoundAddress: ULong = 0uL,
    public var PatternLength: UInt = 0u,
    public var Pattern: Long = 0L,
)

public data class STACK_SRC_INFO(
    public var ImagePath: PCWSTR = 0L,
    public var ModuleName: PCWSTR = 0L,
    public var Function: PCWSTR = 0L,
    public var Displacement: UInt = 0u,
    public var Row: UInt = 0u,
    public var Column: UInt = 0u,
)

public data class STACK_SYM_FRAME_INFO(public var StackFrameEx: DEBUG_STACK_FRAME_EX = DEBUG_STACK_FRAME_EX(), public var SrcInfo: STACK_SRC_INFO = STACK_SRC_INFO())

public data class SYMBOL_INFO_EX(
    public var SizeOfStruct: UInt = 0u,
    public var TypeOfInfo: UInt = 0u,
    public var Offset: ULong = 0uL,
    public var Line: UInt = 0u,
    public var Displacement: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYMBOL_INFO_EX) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.TypeOfInfo != other.TypeOfInfo) return false
        if (this.Offset != other.Offset) return false
        if (this.Line != other.Line) return false
        if (this.Displacement != other.Displacement) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.TypeOfInfo.hashCode()
        result = 31 * result + this.Offset.hashCode()
        result = 31 * result + this.Line.hashCode()
        result = 31 * result + this.Displacement.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class SYM_DUMP_PARAM(
    public var size: UInt = 0u,
    public var sName: Long = 0L,
    public var Options: UInt = 0u,
    public var addr: ULong = 0uL,
    public var listLink: Long = 0L,
    public var Anonymous: SYM_DUMP_PARAM_0 = SYM_DUMP_PARAM_0(),
    public var CallbackRoutine: PSYM_DUMP_FIELD_CALLBACK = null,
    public var nFields: UInt = 0u,
    public var Fields: Long = 0L,
    public var ModBase: ULong = 0uL,
    public var TypeId: UInt = 0u,
    public var TypeSize: UInt = 0u,
    public var BufferSize: UInt = 0u,
    public var _bitfield: UInt = 0u,
)

public data class SYM_DUMP_PARAM_0(public var Context: Long = 0L, public var pBuffer: Long = 0L)

public data class ScriptDebugEventInformation(
    public var DebugEvent: ScriptDebugEvent = 0,
    public var EventPosition: ScriptDebugPosition = ScriptDebugPosition(),
    public var EventSpanEnd: ScriptDebugPosition = ScriptDebugPosition(),
    public var u: ScriptDebugEventInformation_0 = ScriptDebugEventInformation_0(),
)

public data class ScriptDebugEventInformation_0(public var ExceptionInformation: ScriptDebugEventInformation_0_0 = ScriptDebugEventInformation_0_0(), public var BreakpointInformation: ScriptDebugEventInformation_0_1 = ScriptDebugEventInformation_0_1())

public data class ScriptDebugEventInformation_0_1(public var BreakpointId: ULong = 0uL)

public data class ScriptDebugEventInformation_0_0(public var IsUncaught: UByte = 0u)

public data class ScriptDebugPosition(public var Line: UInt = 0u, public var Column: UInt = 0u)

public data class TARGET_DEBUG_INFO(
    public var SizeOfStruct: UInt = 0u,
    public var EntryDate: ULong = 0uL,
    public var DebugeeClass: UInt = 0u,
    public var SysUpTime: ULong = 0uL,
    public var AppUpTime: ULong = 0uL,
    public var CrashTime: ULong = 0uL,
    public var OsInfo: OS_INFO = OS_INFO(),
    public var Cpu: CPU_INFO = CPU_INFO(),
    public var DumpFile: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TARGET_DEBUG_INFO) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.EntryDate != other.EntryDate) return false
        if (this.DebugeeClass != other.DebugeeClass) return false
        if (this.SysUpTime != other.SysUpTime) return false
        if (this.AppUpTime != other.AppUpTime) return false
        if (this.CrashTime != other.CrashTime) return false
        if (this.OsInfo != other.OsInfo) return false
        if (this.Cpu != other.Cpu) return false
        if (!this.DumpFile.contentEquals(other.DumpFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.EntryDate.hashCode()
        result = 31 * result + this.DebugeeClass.hashCode()
        result = 31 * result + this.SysUpTime.hashCode()
        result = 31 * result + this.AppUpTime.hashCode()
        result = 31 * result + this.CrashTime.hashCode()
        result = 31 * result + this.OsInfo.hashCode()
        result = 31 * result + this.Cpu.hashCode()
        result = 31 * result + this.DumpFile.contentHashCode()
        return result
    }
}

public data class TARGET_DEBUG_INFO_v1(
    public var SizeOfStruct: UInt = 0u,
    public var Id: ULong = 0uL,
    public var Source: ULong = 0uL,
    public var EntryDate: ULong = 0uL,
    public var SysUpTime: ULong = 0uL,
    public var AppUpTime: ULong = 0uL,
    public var CrashTime: ULong = 0uL,
    public var Mode: ULong = 0uL,
    public var OsInfo: OS_INFO_v1 = OS_INFO_v1(),
    public var Cpu: CPU_INFO_v1 = CPU_INFO_v1(),
    public var DumpFile: ByteArray = ByteArray(260),
    public var FailureData: Long = 0L,
    public var StackTr: ByteArray = ByteArray(4096),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TARGET_DEBUG_INFO_v1) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.Id != other.Id) return false
        if (this.Source != other.Source) return false
        if (this.EntryDate != other.EntryDate) return false
        if (this.SysUpTime != other.SysUpTime) return false
        if (this.AppUpTime != other.AppUpTime) return false
        if (this.CrashTime != other.CrashTime) return false
        if (this.Mode != other.Mode) return false
        if (this.OsInfo != other.OsInfo) return false
        if (this.Cpu != other.Cpu) return false
        if (!this.DumpFile.contentEquals(other.DumpFile)) return false
        if (this.FailureData != other.FailureData) return false
        if (!this.StackTr.contentEquals(other.StackTr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.Id.hashCode()
        result = 31 * result + this.Source.hashCode()
        result = 31 * result + this.EntryDate.hashCode()
        result = 31 * result + this.SysUpTime.hashCode()
        result = 31 * result + this.AppUpTime.hashCode()
        result = 31 * result + this.CrashTime.hashCode()
        result = 31 * result + this.Mode.hashCode()
        result = 31 * result + this.OsInfo.hashCode()
        result = 31 * result + this.Cpu.hashCode()
        result = 31 * result + this.DumpFile.contentHashCode()
        result = 31 * result + this.FailureData.hashCode()
        result = 31 * result + this.StackTr.contentHashCode()
        return result
    }
}

public data class TARGET_DEBUG_INFO_v2(
    public var SizeOfStruct: UInt = 0u,
    public var EntryDate: ULong = 0uL,
    public var DebugeeClass: UInt = 0u,
    public var SysUpTime: ULong = 0uL,
    public var AppUpTime: ULong = 0uL,
    public var CrashTime: ULong = 0uL,
    public var OsInfo: OS_INFO = OS_INFO(),
    public var Cpu: CPU_INFO_v2 = CPU_INFO_v2(),
    public var DumpFile: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TARGET_DEBUG_INFO_v2) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.EntryDate != other.EntryDate) return false
        if (this.DebugeeClass != other.DebugeeClass) return false
        if (this.SysUpTime != other.SysUpTime) return false
        if (this.AppUpTime != other.AppUpTime) return false
        if (this.CrashTime != other.CrashTime) return false
        if (this.OsInfo != other.OsInfo) return false
        if (this.Cpu != other.Cpu) return false
        if (!this.DumpFile.contentEquals(other.DumpFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.EntryDate.hashCode()
        result = 31 * result + this.DebugeeClass.hashCode()
        result = 31 * result + this.SysUpTime.hashCode()
        result = 31 * result + this.AppUpTime.hashCode()
        result = 31 * result + this.CrashTime.hashCode()
        result = 31 * result + this.OsInfo.hashCode()
        result = 31 * result + this.Cpu.hashCode()
        result = 31 * result + this.DumpFile.contentHashCode()
        return result
    }
}

public data class TRANSLATE_VIRTUAL_TO_PHYSICAL(public var Virtual: ULong = 0uL, public var Physical: ULong = 0uL)

public data class VIRTUAL_TO_PHYSICAL(
    public var Status: UInt = 0u,
    public var Size: UInt = 0u,
    public var PdeAddress: ULong = 0uL,
    public var Virtual: ULong = 0uL,
    public var Physical: ULong = 0uL,
)

public data class WDBGEXTS_CLR_DATA_INTERFACE(public var Iid: Long = 0L, public var Iface: Long = 0L)

public data class WDBGEXTS_DISASSEMBLE_BUFFER(
    public var InOffset: ULong = 0uL,
    public var OutOffset: ULong = 0uL,
    public var AddrFlags: UInt = 0u,
    public var FormatFlags: UInt = 0u,
    public var DataBufferBytes: UInt = 0u,
    public var DisasmBufferChars: UInt = 0u,
    public var DataBuffer: Long = 0L,
    public var DisasmBuffer: PWSTR = 0L,
    public var Reserved0: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WDBGEXTS_DISASSEMBLE_BUFFER) return false
        if (this.InOffset != other.InOffset) return false
        if (this.OutOffset != other.OutOffset) return false
        if (this.AddrFlags != other.AddrFlags) return false
        if (this.FormatFlags != other.FormatFlags) return false
        if (this.DataBufferBytes != other.DataBufferBytes) return false
        if (this.DisasmBufferChars != other.DisasmBufferChars) return false
        if (this.DataBuffer != other.DataBuffer) return false
        if (this.DisasmBuffer != other.DisasmBuffer) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InOffset.hashCode()
        result = 31 * result + this.OutOffset.hashCode()
        result = 31 * result + this.AddrFlags.hashCode()
        result = 31 * result + this.FormatFlags.hashCode()
        result = 31 * result + this.DataBufferBytes.hashCode()
        result = 31 * result + this.DisasmBufferChars.hashCode()
        result = 31 * result + this.DataBuffer.hashCode()
        result = 31 * result + this.DisasmBuffer.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        return result
    }
}

public data class WDBGEXTS_MODULE_IN_RANGE(
    public var Start: ULong = 0uL,
    public var End: ULong = 0uL,
    public var FoundModBase: ULong = 0uL,
    public var FoundModSize: UInt = 0u,
)

public data class WDBGEXTS_QUERY_INTERFACE(public var Iid: Long = 0L, public var Iface: Long = 0L)

public data class WDBGEXTS_THREAD_OS_INFO(
    public var ThreadId: UInt = 0u,
    public var ExitStatus: UInt = 0u,
    public var PriorityClass: UInt = 0u,
    public var Priority: UInt = 0u,
    public var CreateTime: ULong = 0uL,
    public var ExitTime: ULong = 0uL,
    public var KernelTime: ULong = 0uL,
    public var UserTime: ULong = 0uL,
    public var StartOffset: ULong = 0uL,
    public var Affinity: ULong = 0uL,
)

public data class WINDBG_EXTENSION_APIS(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PWINDBG_OUTPUT_ROUTINE = null,
    public var lpGetExpressionRoutine: PWINDBG_GET_EXPRESSION = null,
    public var lpGetSymbolRoutine: PWINDBG_GET_SYMBOL = null,
    public var lpDisasmRoutine: PWINDBG_DISASM = null,
    public var lpCheckControlCRoutine: PWINDBG_CHECK_CONTROL_C = null,
    public var lpReadProcessMemoryRoutine: PWINDBG_READ_PROCESS_MEMORY_ROUTINE = null,
    public var lpWriteProcessMemoryRoutine: PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE = null,
    public var lpGetThreadContextRoutine: PWINDBG_GET_THREAD_CONTEXT_ROUTINE = null,
    public var lpSetThreadContextRoutine: PWINDBG_SET_THREAD_CONTEXT_ROUTINE = null,
    public var lpIoctlRoutine: PWINDBG_IOCTL_ROUTINE = null,
    public var lpStackTraceRoutine: PWINDBG_STACKTRACE_ROUTINE = null,
)

public data class WINDBG_EXTENSION_APIS32(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PWINDBG_OUTPUT_ROUTINE = null,
    public var lpGetExpressionRoutine: PWINDBG_GET_EXPRESSION32 = null,
    public var lpGetSymbolRoutine: PWINDBG_GET_SYMBOL32 = null,
    public var lpDisasmRoutine: PWINDBG_DISASM32 = null,
    public var lpCheckControlCRoutine: PWINDBG_CHECK_CONTROL_C = null,
    public var lpReadProcessMemoryRoutine: PWINDBG_READ_PROCESS_MEMORY_ROUTINE32 = null,
    public var lpWriteProcessMemoryRoutine: PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE32 = null,
    public var lpGetThreadContextRoutine: PWINDBG_GET_THREAD_CONTEXT_ROUTINE = null,
    public var lpSetThreadContextRoutine: PWINDBG_SET_THREAD_CONTEXT_ROUTINE = null,
    public var lpIoctlRoutine: PWINDBG_IOCTL_ROUTINE = null,
    public var lpStackTraceRoutine: PWINDBG_STACKTRACE_ROUTINE32 = null,
)

public data class WINDBG_EXTENSION_APIS64(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PWINDBG_OUTPUT_ROUTINE = null,
    public var lpGetExpressionRoutine: PWINDBG_GET_EXPRESSION64 = null,
    public var lpGetSymbolRoutine: PWINDBG_GET_SYMBOL64 = null,
    public var lpDisasmRoutine: PWINDBG_DISASM64 = null,
    public var lpCheckControlCRoutine: PWINDBG_CHECK_CONTROL_C = null,
    public var lpReadProcessMemoryRoutine: PWINDBG_READ_PROCESS_MEMORY_ROUTINE64 = null,
    public var lpWriteProcessMemoryRoutine: PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE64 = null,
    public var lpGetThreadContextRoutine: PWINDBG_GET_THREAD_CONTEXT_ROUTINE = null,
    public var lpSetThreadContextRoutine: PWINDBG_SET_THREAD_CONTEXT_ROUTINE = null,
    public var lpIoctlRoutine: PWINDBG_IOCTL_ROUTINE = null,
    public var lpStackTraceRoutine: PWINDBG_STACKTRACE_ROUTINE64 = null,
)

public data class WINDBG_OLDKD_EXTENSION_APIS(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PWINDBG_OUTPUT_ROUTINE = null,
    public var lpGetExpressionRoutine: PWINDBG_GET_EXPRESSION32 = null,
    public var lpGetSymbolRoutine: PWINDBG_GET_SYMBOL32 = null,
    public var lpDisasmRoutine: PWINDBG_DISASM32 = null,
    public var lpCheckControlCRoutine: PWINDBG_CHECK_CONTROL_C = null,
    public var lpReadVirtualMemRoutine: PWINDBG_READ_PROCESS_MEMORY_ROUTINE32 = null,
    public var lpWriteVirtualMemRoutine: PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE32 = null,
    public var lpReadPhysicalMemRoutine: PWINDBG_OLDKD_READ_PHYSICAL_MEMORY = null,
    public var lpWritePhysicalMemRoutine: PWINDBG_OLDKD_WRITE_PHYSICAL_MEMORY = null,
)

public data class WINDBG_OLD_EXTENSION_APIS(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PWINDBG_OUTPUT_ROUTINE = null,
    public var lpGetExpressionRoutine: PWINDBG_GET_EXPRESSION = null,
    public var lpGetSymbolRoutine: PWINDBG_GET_SYMBOL = null,
    public var lpDisasmRoutine: PWINDBG_DISASM = null,
    public var lpCheckControlCRoutine: PWINDBG_CHECK_CONTROL_C = null,
)

public data class XML_DRIVER_NODE_INFO(
    public var FileName: ByteArray = ByteArray(64),
    public var FileSize: ULong = 0uL,
    public var CreationDate: ULong = 0uL,
    public var Version: ByteArray = ByteArray(64),
    public var Manufacturer: ByteArray = ByteArray(260),
    public var ProductName: ByteArray = ByteArray(260),
    public var Group: ByteArray = ByteArray(260),
    public var Altitude: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XML_DRIVER_NODE_INFO) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        if (this.FileSize != other.FileSize) return false
        if (this.CreationDate != other.CreationDate) return false
        if (!this.Version.contentEquals(other.Version)) return false
        if (!this.Manufacturer.contentEquals(other.Manufacturer)) return false
        if (!this.ProductName.contentEquals(other.ProductName)) return false
        if (!this.Group.contentEquals(other.Group)) return false
        if (!this.Altitude.contentEquals(other.Altitude)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileName.contentHashCode()
        result = 31 * result + this.FileSize.hashCode()
        result = 31 * result + this.CreationDate.hashCode()
        result = 31 * result + this.Version.contentHashCode()
        result = 31 * result + this.Manufacturer.contentHashCode()
        result = 31 * result + this.ProductName.contentHashCode()
        result = 31 * result + this.Group.contentHashCode()
        result = 31 * result + this.Altitude.contentHashCode()
        return result
    }
}
