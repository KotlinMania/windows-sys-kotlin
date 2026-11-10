@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ExceptionRecord64
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry32
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry64

public data class ArrayDimension(
    public var lowerBound: Long = 0L,
    public var length: ULong = 0uL,
    public var stride: ULong = 0uL,
)

public data class Busdata(
    public var busDataType: UInt = 0u,
    public var busNumber: UInt = 0u,
    public var slotNumber: UInt = 0u,
    public var buffer: COpaquePointer? = null,
    public var offset: UInt = 0u,
    public var length: UInt = 0u,
)

public data class CkclData(
    public var nextLogEvent: COpaquePointer? = null,
    public var tAnalyzeString: Pstr = null,
    public var tAnalyzeReturnType: TanalyzeReturn = 0,
)

public data class CkclListhead(
    public var logEventListHead: CkclData? = null,
    public var heap: Handle = null,
)

public data class CpuInfo(
    public var type: UInt = 0u,
    public var numCPUs: UInt = 0u,
    public var currentProc: UInt = 0u,
    public var procInfo: List<DebugProcessorIdentificationAll> = List(2048) { DebugProcessorIdentificationAll() },
    public var mhz: UInt = 0u,
)

public data class CpuInfoV1(
    public var type: UInt = 0u,
    public var numCPUs: UInt = 0u,
    public var currentProc: UInt = 0u,
    public var procInfo: List<DebugProcessorIdentificationAll> = List(32) { DebugProcessorIdentificationAll() },
    public var mhz: UInt = 0u,
)

public data class CpuInfoV2(
    public var type: UInt = 0u,
    public var numCPUs: UInt = 0u,
    public var currentProc: UInt = 0u,
    public var procInfo: List<DebugProcessorIdentificationAll> = List(1280) { DebugProcessorIdentificationAll() },
    public var mhz: UInt = 0u,
)

public data class DbgkdDebugDataHeader32(
    public var list: ListEntry32 = ListEntry32(),
    public var ownerTag: UInt = 0u,
    public var size: UInt = 0u,
)

public data class DbgkdDebugDataHeader64(
    public var list: ListEntry64 = ListEntry64(),
    public var ownerTag: UInt = 0u,
    public var size: UInt = 0u,
)

public data class DbgkdGetVersion32(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var protocolVersion: UShort = 0u,
    public var flags: UShort = 0u,
    public var kernBase: UInt = 0u,
    public var psLoadedModuleList: UInt = 0u,
    public var machineType: UShort = 0u,
    public var thCallbackStack: UShort = 0u,
    public var nextCallback: UShort = 0u,
    public var framePointer: UShort = 0u,
    public var kiCallUserMode: UInt = 0u,
    public var keUserCallbackDispatcher: UInt = 0u,
    public var breakpointWithStatus: UInt = 0u,
    public var debuggerDataList: UInt = 0u,
)

public data class DbgkdGetVersion64(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var protocolVersion: UByte = 0u,
    public var kdSecondaryVersion: UByte = 0u,
    public var flags: UShort = 0u,
    public var machineType: UShort = 0u,
    public var maxPacketType: UByte = 0u,
    public var maxStateChange: UByte = 0u,
    public var maxManipulate: UByte = 0u,
    public var simulation: UByte = 0u,
    public var unused: UShortArray = UShortArray(1),
    public var kernBase: ULong = 0uL,
    public var psLoadedModuleList: ULong = 0uL,
    public var debuggerDataList: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DbgkdGetVersion64) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.protocolVersion != other.protocolVersion) return false
        if (this.kdSecondaryVersion != other.kdSecondaryVersion) return false
        if (this.flags != other.flags) return false
        if (this.machineType != other.machineType) return false
        if (this.maxPacketType != other.maxPacketType) return false
        if (this.maxStateChange != other.maxStateChange) return false
        if (this.maxManipulate != other.maxManipulate) return false
        if (this.simulation != other.simulation) return false
        if (!this.unused.contentEquals(other.unused)) return false
        if (this.kernBase != other.kernBase) return false
        if (this.psLoadedModuleList != other.psLoadedModuleList) return false
        if (this.debuggerDataList != other.debuggerDataList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.protocolVersion.hashCode()
        result = 31 * result + this.kdSecondaryVersion.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.machineType.hashCode()
        result = 31 * result + this.maxPacketType.hashCode()
        result = 31 * result + this.maxStateChange.hashCode()
        result = 31 * result + this.maxManipulate.hashCode()
        result = 31 * result + this.simulation.hashCode()
        result = 31 * result + this.unused.contentHashCode()
        result = 31 * result + this.kernBase.hashCode()
        result = 31 * result + this.psLoadedModuleList.hashCode()
        result = 31 * result + this.debuggerDataList.hashCode()
        return result
    }
}

public data class DbgThreadAttributes(
    public var threadIndex: UInt = 0u,
    public var processID: ULong = 0uL,
    public var threadID: ULong = 0uL,
    public var attributeBits: ULong = 0uL,
    public var boolBits: UInt = 0u,
    public var blockedOnPID: ULong = 0uL,
    public var blockedOnTID: ULong = 0uL,
    public var critSecAddress: ULong = 0uL,
    public var timeoutMsec: UInt = 0u,
    public var stringData: ByteArray = ByteArray(100),
    public var symName: ByteArray = ByteArray(100),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DbgThreadAttributes) return false
        if (this.threadIndex != other.threadIndex) return false
        if (this.processID != other.processID) return false
        if (this.threadID != other.threadID) return false
        if (this.attributeBits != other.attributeBits) return false
        if (this.boolBits != other.boolBits) return false
        if (this.blockedOnPID != other.blockedOnPID) return false
        if (this.blockedOnTID != other.blockedOnTID) return false
        if (this.critSecAddress != other.critSecAddress) return false
        if (this.timeoutMsec != other.timeoutMsec) return false
        if (!this.stringData.contentEquals(other.stringData)) return false
        if (!this.symName.contentEquals(other.symName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadIndex.hashCode()
        result = 31 * result + this.processID.hashCode()
        result = 31 * result + this.threadID.hashCode()
        result = 31 * result + this.attributeBits.hashCode()
        result = 31 * result + this.boolBits.hashCode()
        result = 31 * result + this.blockedOnPID.hashCode()
        result = 31 * result + this.blockedOnTID.hashCode()
        result = 31 * result + this.critSecAddress.hashCode()
        result = 31 * result + this.timeoutMsec.hashCode()
        result = 31 * result + this.stringData.contentHashCode()
        result = 31 * result + this.symName.contentHashCode()
        return result
    }
}

public data class DebugAnalysisProcessorInfo(
    public var sizeOfStruct: UInt = 0u,
    public var model: UInt = 0u,
    public var family: UInt = 0u,
    public var stepping: UInt = 0u,
    public var architecture: UInt = 0u,
    public var revision: UInt = 0u,
    public var currentClockSpeed: UInt = 0u,
    public var currentVoltage: UInt = 0u,
    public var maxClockSpeed: UInt = 0u,
    public var processorType: UInt = 0u,
    public var deviceID: ByteArray = ByteArray(32),
    public var manufacturer: ByteArray = ByteArray(64),
    public var name: ByteArray = ByteArray(64),
    public var version: ByteArray = ByteArray(64),
    public var description: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugAnalysisProcessorInfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.model != other.model) return false
        if (this.family != other.family) return false
        if (this.stepping != other.stepping) return false
        if (this.architecture != other.architecture) return false
        if (this.revision != other.revision) return false
        if (this.currentClockSpeed != other.currentClockSpeed) return false
        if (this.currentVoltage != other.currentVoltage) return false
        if (this.maxClockSpeed != other.maxClockSpeed) return false
        if (this.processorType != other.processorType) return false
        if (!this.deviceID.contentEquals(other.deviceID)) return false
        if (!this.manufacturer.contentEquals(other.manufacturer)) return false
        if (!this.name.contentEquals(other.name)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.description.contentEquals(other.description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.model.hashCode()
        result = 31 * result + this.family.hashCode()
        result = 31 * result + this.stepping.hashCode()
        result = 31 * result + this.architecture.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.currentClockSpeed.hashCode()
        result = 31 * result + this.currentVoltage.hashCode()
        result = 31 * result + this.maxClockSpeed.hashCode()
        result = 31 * result + this.processorType.hashCode()
        result = 31 * result + this.deviceID.contentHashCode()
        result = 31 * result + this.manufacturer.contentHashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.description.contentHashCode()
        return result
    }
}

public data class DebugBreakpointParameters(
    public var offset: ULong = 0uL,
    public var id: UInt = 0u,
    public var breakType: UInt = 0u,
    public var procType: UInt = 0u,
    public var flags: UInt = 0u,
    public var dataSize: UInt = 0u,
    public var dataAccessType: UInt = 0u,
    public var passCount: UInt = 0u,
    public var currentPassCount: UInt = 0u,
    public var matchThread: UInt = 0u,
    public var commandSize: UInt = 0u,
    public var offsetExpressionSize: UInt = 0u,
)

public data class DebugCachedSymbolInfo(
    public var modBase: ULong = 0uL,
    public var arg1: ULong = 0uL,
    public var arg2: ULong = 0uL,
    public var id: UInt = 0u,
    public var arg3: UInt = 0u,
)

public data class DebugClientContext(
    public var cbSize: UInt = 0u,
    public var eClient: UInt = 0u,
)

public data class DebugCpuMicrocodeVersion(
    public var sizeOfStruct: UInt = 0u,
    public var cachedSignature: Long = 0L,
    public var initialSignature: Long = 0L,
    public var processorModel: UInt = 0u,
    public var processorFamily: UInt = 0u,
    public var processorStepping: UInt = 0u,
    public var processorArchRev: UInt = 0u,
)

public data class DebugCpuSpeedInfo(
    public var sizeOfStruct: UInt = 0u,
    public var currentSpeed: UInt = 0u,
    public var ratedSpeed: UInt = 0u,
    public var nameString: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugCpuSpeedInfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.currentSpeed != other.currentSpeed) return false
        if (this.ratedSpeed != other.ratedSpeed) return false
        if (!this.nameString.contentEquals(other.nameString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.currentSpeed.hashCode()
        result = 31 * result + this.ratedSpeed.hashCode()
        result = 31 * result + this.nameString.contentHashCode()
        return result
    }
}

public data class DebugCreateProcessOptions(
    public var createFlags: UInt = 0u,
    public var engCreateFlags: UInt = 0u,
    public var verifierFlags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class DebugDecodeError(
    public var sizeOfStruct: UInt = 0u,
    public var code: UInt = 0u,
    public var treatAsStatus: Bool = 0,
    public var source: ByteArray = ByteArray(64),
    public var message: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugDecodeError) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.code != other.code) return false
        if (this.treatAsStatus != other.treatAsStatus) return false
        if (!this.source.contentEquals(other.source)) return false
        if (!this.message.contentEquals(other.message)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.code.hashCode()
        result = 31 * result + this.treatAsStatus.hashCode()
        result = 31 * result + this.source.contentHashCode()
        result = 31 * result + this.message.contentHashCode()
        return result
    }
}

public data class DebugDeviceObjectInfo(
    public var sizeOfStruct: UInt = 0u,
    public var devObjAddress: ULong = 0uL,
    public var referenceCount: UInt = 0u,
    public var qBusy: Bool = 0,
    public var driverObject: ULong = 0uL,
    public var currentIrp: ULong = 0uL,
    public var devExtension: ULong = 0uL,
    public var devObjExtension: ULong = 0uL,
)

public data class DebugDriverObjectInfo(
    public var sizeOfStruct: UInt = 0u,
    public var driverSize: UInt = 0u,
    public var driverObjAddress: ULong = 0uL,
    public var driverStart: ULong = 0uL,
    public var driverExtension: ULong = 0uL,
    public var deviceObject: ULong = 0uL,
    public var driverName: DebugDriverObjectInfo0 = DebugDriverObjectInfo0(),
)

public data class DebugDriverObjectInfo0(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: ULong = 0uL,
)

public data class DebugEventContext(
    public var size: UInt = 0u,
    public var processEngineId: UInt = 0u,
    public var threadEngineId: UInt = 0u,
    public var frameEngineId: UInt = 0u,
)

public data class DebugExceptionFilterParameters(
    public var executionOption: UInt = 0u,
    public var continueOption: UInt = 0u,
    public var textSize: UInt = 0u,
    public var commandSize: UInt = 0u,
    public var secondCommandSize: UInt = 0u,
    public var exceptionCode: UInt = 0u,
)

public data class DebugGetTextCompletionsIn(
    public var flags: UInt = 0u,
    public var matchCountLimit: UInt = 0u,
    public var reserved: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugGetTextCompletionsIn) return false
        if (this.flags != other.flags) return false
        if (this.matchCountLimit != other.matchCountLimit) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.matchCountLimit.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class DebugGetTextCompletionsOut(
    public var flags: UInt = 0u,
    public var replaceIndex: UInt = 0u,
    public var matchCount: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugGetTextCompletionsOut) return false
        if (this.flags != other.flags) return false
        if (this.replaceIndex != other.replaceIndex) return false
        if (this.matchCount != other.matchCount) return false
        if (this.reserved1 != other.reserved1) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.replaceIndex.hashCode()
        result = 31 * result + this.matchCount.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class DebugHandleDataBasic(
    public var typeNameSize: UInt = 0u,
    public var objectNameSize: UInt = 0u,
    public var attributes: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pointerCount: UInt = 0u,
)

public data class DebugIrpInfo(
    public var sizeOfStruct: UInt = 0u,
    public var irpAddress: ULong = 0uL,
    public var ioStatus: UInt = 0u,
    public var stackCount: UInt = 0u,
    public var currentLocation: UInt = 0u,
    public var mdlAddress: ULong = 0uL,
    public var thread: ULong = 0uL,
    public var cancelRoutine: ULong = 0uL,
    public var currentStack: DebugIrpStackInfo = DebugIrpStackInfo(),
    public var stack: List<DebugIrpStackInfo> = List(10) { DebugIrpStackInfo() },
)

public data class DebugIrpStackInfo(
    public var major: UByte = 0u,
    public var minor: UByte = 0u,
    public var deviceObject: ULong = 0uL,
    public var fileObject: ULong = 0uL,
    public var completionRoutine: ULong = 0uL,
    public var stackAddress: ULong = 0uL,
)

public data class DebugLastEventInfoBreakpoint(
    public var id: UInt = 0u,
)

public data class DebugLastEventInfoException(
    public var exceptionRecord: ExceptionRecord64 = ExceptionRecord64(),
    public var firstChance: UInt = 0u,
)

public data class DebugLastEventInfoExitProcess(
    public var exitCode: UInt = 0u,
)

public data class DebugLastEventInfoExitThread(
    public var exitCode: UInt = 0u,
)

public data class DebugLastEventInfoLoadModule(
    public var base: ULong = 0uL,
)

public data class DebugLastEventInfoServiceException(
    public var kind: UInt = 0u,
    public var dataSize: UInt = 0u,
    public var address: ULong = 0uL,
)

public data class DebugLastEventInfoSystemError(
    public var error: UInt = 0u,
    public var level: UInt = 0u,
)

public data class DebugLastEventInfoUnloadModule(
    public var base: ULong = 0uL,
)

public data class DebugModuleAndId(
    public var moduleBase: ULong = 0uL,
    public var id: ULong = 0uL,
)

public data class DebugModuleParameters(
    public var base: ULong = 0uL,
    public var size: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var checksum: UInt = 0u,
    public var flags: UInt = 0u,
    public var symbolType: UInt = 0u,
    public var imageNameSize: UInt = 0u,
    public var moduleNameSize: UInt = 0u,
    public var loadedImageNameSize: UInt = 0u,
    public var symbolFileNameSize: UInt = 0u,
    public var mappedImageNameSize: UInt = 0u,
    public var reserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugModuleParameters) return false
        if (this.base != other.base) return false
        if (this.size != other.size) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        if (this.checksum != other.checksum) return false
        if (this.flags != other.flags) return false
        if (this.symbolType != other.symbolType) return false
        if (this.imageNameSize != other.imageNameSize) return false
        if (this.moduleNameSize != other.moduleNameSize) return false
        if (this.loadedImageNameSize != other.loadedImageNameSize) return false
        if (this.symbolFileNameSize != other.symbolFileNameSize) return false
        if (this.mappedImageNameSize != other.mappedImageNameSize) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        result = 31 * result + this.checksum.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.symbolType.hashCode()
        result = 31 * result + this.imageNameSize.hashCode()
        result = 31 * result + this.moduleNameSize.hashCode()
        result = 31 * result + this.loadedImageNameSize.hashCode()
        result = 31 * result + this.symbolFileNameSize.hashCode()
        result = 31 * result + this.mappedImageNameSize.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class DebugOffsetRegion(
    public var base: ULong = 0uL,
    public var size: ULong = 0uL,
)

public data class DebugPnpTriageInfo(
    public var sizeOfStruct: UInt = 0u,
    public var lockAddress: ULong = 0uL,
    public var lockActiveCount: Int = 0,
    public var lockContentionCount: UInt = 0u,
    public var lockNumberOfExclusiveWaiters: UInt = 0u,
    public var lockNumberOfSharedWaiters: UInt = 0u,
    public var lockFlag: UShort = 0u,
    public var triagedThread: ULong = 0uL,
    public var threadCount: Int = 0,
    public var triagedThreadWaitTime: ULong = 0uL,
)

public data class DebugPooltagDescription(
    public var sizeOfStruct: UInt = 0u,
    public var poolTag: UInt = 0u,
    public var description: ByteArray = ByteArray(260),
    public var binary: ByteArray = ByteArray(32),
    public var owner: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugPooltagDescription) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.poolTag != other.poolTag) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.binary.contentEquals(other.binary)) return false
        if (!this.owner.contentEquals(other.owner)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.poolTag.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.binary.contentHashCode()
        result = 31 * result + this.owner.contentHashCode()
        return result
    }
}

public data class DebugPoolData(
    public var sizeofStruct: UInt = 0u,
    public var poolBlock: ULong = 0uL,
    public var pool: ULong = 0uL,
    public var previousSize: UInt = 0u,
    public var size: UInt = 0u,
    public var poolTag: UInt = 0u,
    public var processBilled: ULong = 0uL,
    public var anonymous: DebugPoolData0 = DebugPoolData0(),
    public var reserved2: ULongArray = ULongArray(4),
    public var poolTagDescription: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugPoolData) return false
        if (this.sizeofStruct != other.sizeofStruct) return false
        if (this.poolBlock != other.poolBlock) return false
        if (this.pool != other.pool) return false
        if (this.previousSize != other.previousSize) return false
        if (this.size != other.size) return false
        if (this.poolTag != other.poolTag) return false
        if (this.processBilled != other.processBilled) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (!this.poolTagDescription.contentEquals(other.poolTagDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofStruct.hashCode()
        result = 31 * result + this.poolBlock.hashCode()
        result = 31 * result + this.pool.hashCode()
        result = 31 * result + this.previousSize.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.poolTag.hashCode()
        result = 31 * result + this.processBilled.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.poolTagDescription.contentHashCode()
        return result
    }
}

public data class DebugPoolData0(
    public var anonymous: DebugPoolData00 = DebugPoolData00(),
    public var asUlong: UInt = 0u,
)

public data class DebugPoolData00(
    public var bitfield: UInt = 0u,
)

public data class DebugProcessorIdentificationAll(
    public var alpha: DebugProcessorIdentificationAlpha = DebugProcessorIdentificationAlpha(),
    public var amd64: DebugProcessorIdentificationAmd64 = DebugProcessorIdentificationAmd64(),
    public var ia64: DebugProcessorIdentificationIa64 = DebugProcessorIdentificationIa64(),
    public var x86: DebugProcessorIdentificationX86 = DebugProcessorIdentificationX86(),
    public var arm: DebugProcessorIdentificationArm = DebugProcessorIdentificationArm(),
    public var arm64: DebugProcessorIdentificationArm64 = DebugProcessorIdentificationArm64(),
)

public data class DebugProcessorIdentificationAlpha(
    public var type: UInt = 0u,
    public var revision: UInt = 0u,
)

public data class DebugProcessorIdentificationAmd64(
    public var family: UInt = 0u,
    public var model: UInt = 0u,
    public var stepping: UInt = 0u,
    public var vendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugProcessorIdentificationAmd64) return false
        if (this.family != other.family) return false
        if (this.model != other.model) return false
        if (this.stepping != other.stepping) return false
        if (!this.vendorString.contentEquals(other.vendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.family.hashCode()
        result = 31 * result + this.model.hashCode()
        result = 31 * result + this.stepping.hashCode()
        result = 31 * result + this.vendorString.contentHashCode()
        return result
    }
}

public data class DebugProcessorIdentificationArm(
    public var model: UInt = 0u,
    public var revision: UInt = 0u,
    public var vendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugProcessorIdentificationArm) return false
        if (this.model != other.model) return false
        if (this.revision != other.revision) return false
        if (!this.vendorString.contentEquals(other.vendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.model.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.vendorString.contentHashCode()
        return result
    }
}

public data class DebugProcessorIdentificationArm64(
    public var model: UInt = 0u,
    public var revision: UInt = 0u,
    public var vendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugProcessorIdentificationArm64) return false
        if (this.model != other.model) return false
        if (this.revision != other.revision) return false
        if (!this.vendorString.contentEquals(other.vendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.model.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.vendorString.contentHashCode()
        return result
    }
}

public data class DebugProcessorIdentificationIa64(
    public var model: UInt = 0u,
    public var revision: UInt = 0u,
    public var family: UInt = 0u,
    public var archRev: UInt = 0u,
    public var vendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugProcessorIdentificationIa64) return false
        if (this.model != other.model) return false
        if (this.revision != other.revision) return false
        if (this.family != other.family) return false
        if (this.archRev != other.archRev) return false
        if (!this.vendorString.contentEquals(other.vendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.model.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.family.hashCode()
        result = 31 * result + this.archRev.hashCode()
        result = 31 * result + this.vendorString.contentHashCode()
        return result
    }
}

public data class DebugProcessorIdentificationX86(
    public var family: UInt = 0u,
    public var model: UInt = 0u,
    public var stepping: UInt = 0u,
    public var vendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugProcessorIdentificationX86) return false
        if (this.family != other.family) return false
        if (this.model != other.model) return false
        if (this.stepping != other.stepping) return false
        if (!this.vendorString.contentEquals(other.vendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.family.hashCode()
        result = 31 * result + this.model.hashCode()
        result = 31 * result + this.stepping.hashCode()
        result = 31 * result + this.vendorString.contentHashCode()
        return result
    }
}

public data class DebugReadUserMinidumpStream(
    public var streamType: UInt = 0u,
    public var flags: UInt = 0u,
    public var offset: ULong = 0uL,
    public var buffer: COpaquePointer? = null,
    public var bufferSize: UInt = 0u,
    public var bufferUsed: UInt = 0u,
)

public data class DebugRegisterDescription(
    public var type: UInt = 0u,
    public var flags: UInt = 0u,
    public var subregMaster: UInt = 0u,
    public var subregLength: UInt = 0u,
    public var subregMask: ULong = 0uL,
    public var subregShift: UInt = 0u,
    public var reserved0: UInt = 0u,
)

public class DebugSmbiosInfo(
    public var sizeOfStruct: UInt = 0u,
    public var smbiosMajorVersion: UByte = 0u,
    public var smbiosMinorVersion: UByte = 0u,
    public var dMIVersion: UByte = 0u,
    public var tableSize: UInt = 0u,
    public var biosMajorRelease: UByte = 0u,
    public var biosMinorRelease: UByte = 0u,
    public var firmwareMajorRelease: UByte = 0u,
    public var firmwareMinorRelease: UByte = 0u,
    public var baseBoardManufacturer: ByteArray = ByteArray(64),
    public var baseBoardProduct: ByteArray = ByteArray(64),
    public var baseBoardVersion: ByteArray = ByteArray(64),
    public var biosReleaseDate: ByteArray = ByteArray(64),
    public var biosVendor: ByteArray = ByteArray(64),
    public var biosVersion: ByteArray = ByteArray(64),
    public var systemFamily: ByteArray = ByteArray(64),
    public var systemManufacturer: ByteArray = ByteArray(64),
    public var systemProductName: ByteArray = ByteArray(64),
    public var systemSKU: ByteArray = ByteArray(64),
    public var systemVersion: ByteArray = ByteArray(64),
)

public data class DebugSpecificFilterParameters(
    public var executionOption: UInt = 0u,
    public var continueOption: UInt = 0u,
    public var textSize: UInt = 0u,
    public var commandSize: UInt = 0u,
    public var argumentSize: UInt = 0u,
)

public data class DebugStackFrame(
    public var instructionOffset: ULong = 0uL,
    public var returnOffset: ULong = 0uL,
    public var frameOffset: ULong = 0uL,
    public var stackOffset: ULong = 0uL,
    public var funcTableEntry: ULong = 0uL,
    public var params: ULongArray = ULongArray(4),
    public var reserved: ULongArray = ULongArray(6),
    public var virtual: Bool = 0,
    public var frameNumber: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugStackFrame) return false
        if (this.instructionOffset != other.instructionOffset) return false
        if (this.returnOffset != other.returnOffset) return false
        if (this.frameOffset != other.frameOffset) return false
        if (this.stackOffset != other.stackOffset) return false
        if (this.funcTableEntry != other.funcTableEntry) return false
        if (!this.params.contentEquals(other.params)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.virtual != other.virtual) return false
        if (this.frameNumber != other.frameNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionOffset.hashCode()
        result = 31 * result + this.returnOffset.hashCode()
        result = 31 * result + this.frameOffset.hashCode()
        result = 31 * result + this.stackOffset.hashCode()
        result = 31 * result + this.funcTableEntry.hashCode()
        result = 31 * result + this.params.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.virtual.hashCode()
        result = 31 * result + this.frameNumber.hashCode()
        return result
    }
}

public data class DebugStackFrameEx(
    public var instructionOffset: ULong = 0uL,
    public var returnOffset: ULong = 0uL,
    public var frameOffset: ULong = 0uL,
    public var stackOffset: ULong = 0uL,
    public var funcTableEntry: ULong = 0uL,
    public var params: ULongArray = ULongArray(4),
    public var reserved: ULongArray = ULongArray(6),
    public var virtual: Bool = 0,
    public var frameNumber: UInt = 0u,
    public var inlineFrameContext: UInt = 0u,
    public var reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugStackFrameEx) return false
        if (this.instructionOffset != other.instructionOffset) return false
        if (this.returnOffset != other.returnOffset) return false
        if (this.frameOffset != other.frameOffset) return false
        if (this.stackOffset != other.stackOffset) return false
        if (this.funcTableEntry != other.funcTableEntry) return false
        if (!this.params.contentEquals(other.params)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.virtual != other.virtual) return false
        if (this.frameNumber != other.frameNumber) return false
        if (this.inlineFrameContext != other.inlineFrameContext) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionOffset.hashCode()
        result = 31 * result + this.returnOffset.hashCode()
        result = 31 * result + this.frameOffset.hashCode()
        result = 31 * result + this.stackOffset.hashCode()
        result = 31 * result + this.funcTableEntry.hashCode()
        result = 31 * result + this.params.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.virtual.hashCode()
        result = 31 * result + this.frameNumber.hashCode()
        result = 31 * result + this.inlineFrameContext.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }
}

public data class DebugSymbolEntry(
    public var moduleBase: ULong = 0uL,
    public var offset: ULong = 0uL,
    public var id: ULong = 0uL,
    public var arg64: ULong = 0uL,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var typeId: UInt = 0u,
    public var nameSize: UInt = 0u,
    public var token: UInt = 0u,
    public var tag: UInt = 0u,
    public var arg32: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class DebugSymbolParameters(
    public var module: ULong = 0uL,
    public var typeId: UInt = 0u,
    public var parentSymbol: UInt = 0u,
    public var subElements: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: ULong = 0uL,
)

public data class DebugSymbolSourceEntry(
    public var moduleBase: ULong = 0uL,
    public var offset: ULong = 0uL,
    public var fileNameId: ULong = 0uL,
    public var engineInternal: ULong = 0uL,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileNameSize: UInt = 0u,
    public var startLine: UInt = 0u,
    public var endLine: UInt = 0u,
    public var startColumn: UInt = 0u,
    public var endColumn: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class DebugThreadBasicInformation(
    public var valid: UInt = 0u,
    public var exitStatus: UInt = 0u,
    public var priorityClass: UInt = 0u,
    public var priority: UInt = 0u,
    public var createTime: ULong = 0uL,
    public var exitTime: ULong = 0uL,
    public var kernelTime: ULong = 0uL,
    public var userTime: ULong = 0uL,
    public var startOffset: ULong = 0uL,
    public var affinity: ULong = 0uL,
)

public data class DebugTriageFollowupInfo(
    public var sizeOfStruct: UInt = 0u,
    public var ownerNameSize: UInt = 0u,
    public var ownerName: Pstr = null,
)

public data class DebugTriageFollowupInfo2(
    public var sizeOfStruct: UInt = 0u,
    public var ownerNameSize: UInt = 0u,
    public var ownerName: Pstr = null,
    public var featurePathSize: UInt = 0u,
    public var featurePath: Pstr = null,
)

public data class DebugTypedData(
    public var modBase: ULong = 0uL,
    public var offset: ULong = 0uL,
    public var engineHandle: ULong = 0uL,
    public var data: ULong = 0uL,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var typeId: UInt = 0u,
    public var baseTypeId: UInt = 0u,
    public var tag: UInt = 0u,
    public var register: UInt = 0u,
    public var internal: ULongArray = ULongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugTypedData) return false
        if (this.modBase != other.modBase) return false
        if (this.offset != other.offset) return false
        if (this.engineHandle != other.engineHandle) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.typeId != other.typeId) return false
        if (this.baseTypeId != other.baseTypeId) return false
        if (this.tag != other.tag) return false
        if (this.register != other.register) return false
        if (!this.internal.contentEquals(other.internal)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.modBase.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.engineHandle.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.typeId.hashCode()
        result = 31 * result + this.baseTypeId.hashCode()
        result = 31 * result + this.tag.hashCode()
        result = 31 * result + this.register.hashCode()
        result = 31 * result + this.internal.contentHashCode()
        return result
    }
}

public data class DebugValue(
    public var anonymous: DebugValue0 = DebugValue0(),
    public var tailOfRawBytes: UInt = 0u,
    public var type: UInt = 0u,
)

public class DebugValue0(
    public var i8: UByte = 0u,
    public var i16: UShort = 0u,
    public var i32: UInt = 0u,
    public var anonymous: DebugValue00 = DebugValue00(),
    public var f32: Float = 0.0f,
    public var f64: Double = 0.0,
    public var f80Bytes: UByteArray = UByteArray(10),
    public var f82Bytes: UByteArray = UByteArray(11),
    public var f128Bytes: UByteArray = UByteArray(16),
    public var vi8: UByteArray = UByteArray(16),
    public var vi16: UShortArray = UShortArray(8),
    public var vi32: UIntArray = UIntArray(4),
    public var vi64: ULongArray = ULongArray(2),
    public var vf32: FloatArray = FloatArray(4),
    public var vf64: DoubleArray = DoubleArray(2),
    public var i64Parts32: DebugValue01 = DebugValue01(),
    public var f128Parts64: DebugValue02 = DebugValue02(),
    public var rawBytes: UByteArray = UByteArray(24),
)

public data class DebugValue00(
    public var i64: ULong = 0uL,
    public var nat: Bool = 0,
)

public data class DebugValue02(
    public var lowPart: ULong = 0uL,
    public var highPart: Long = 0L,
)

public data class DebugValue01(
    public var lowPart: UInt = 0u,
    public var highPart: UInt = 0u,
)

public data class Extstacktrace(
    public var framePointer: UInt = 0u,
    public var programCounter: UInt = 0u,
    public var returnAddress: UInt = 0u,
    public var args: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extstacktrace) return false
        if (this.framePointer != other.framePointer) return false
        if (this.programCounter != other.programCounter) return false
        if (this.returnAddress != other.returnAddress) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.framePointer.hashCode()
        result = 31 * result + this.programCounter.hashCode()
        result = 31 * result + this.returnAddress.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }
}

public data class Extstacktrace32(
    public var framePointer: UInt = 0u,
    public var programCounter: UInt = 0u,
    public var returnAddress: UInt = 0u,
    public var args: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extstacktrace32) return false
        if (this.framePointer != other.framePointer) return false
        if (this.programCounter != other.programCounter) return false
        if (this.returnAddress != other.returnAddress) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.framePointer.hashCode()
        result = 31 * result + this.programCounter.hashCode()
        result = 31 * result + this.returnAddress.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }
}

public data class Extstacktrace64(
    public var framePointer: ULong = 0uL,
    public var programCounter: ULong = 0uL,
    public var returnAddress: ULong = 0uL,
    public var args: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extstacktrace64) return false
        if (this.framePointer != other.framePointer) return false
        if (this.programCounter != other.programCounter) return false
        if (this.returnAddress != other.returnAddress) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.framePointer.hashCode()
        result = 31 * result + this.programCounter.hashCode()
        result = 31 * result + this.returnAddress.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }
}

public data class ExtApiVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var revision: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class ExtCabXmlData(
    public var sizeOfStruct: UInt = 0u,
    public var xmlObjectTag: Pcwstr = null,
    public var numSubTags: UInt = 0u,
    public var subTags: List<ExtCabXmlData0> = List(1) { ExtCabXmlData0() },
)

public data class ExtCabXmlData0(
    public var subTag: Pcwstr = null,
    public var matchPattern: Pcwstr = null,
    public var returnText: Pwstr = null,
    public var returnTextSize: UInt = 0u,
    public var bitfield: UInt = 0u,
    public var reserved2: UInt = 0u,
)

public data class ExtFindFile(
    public var fileName: Pcwstr = null,
    public var indexedSize: ULong = 0uL,
    public var imageTimeDateStamp: UInt = 0u,
    public var imageCheckSum: UInt = 0u,
    public var extraInfo: COpaquePointer? = null,
    public var extraInfoSize: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileMapping: COpaquePointer? = null,
    public var fileMappingSize: ULong = 0uL,
    public var fileHandle: Handle = null,
    public var foundFileName: Pwstr = null,
    public var foundFileNameChars: UInt = 0u,
)

public data class ExtMatchPatternA(
    public var str: Pcstr = null,
    public var pattern: Pcstr = null,
    public var caseSensitive: UInt = 0u,
)

public class ExtTypedData(
    public var operation: ExtTdop = 0,
    public var flags: UInt = 0u,
    public var inData: DebugTypedData = DebugTypedData(),
    public var outData: DebugTypedData = DebugTypedData(),
    public var inStrIndex: UInt = 0u,
    public var in32: UInt = 0u,
    public var out32: UInt = 0u,
    public var in64: ULong = 0uL,
    public var out64: ULong = 0uL,
    public var strBufferIndex: UInt = 0u,
    public var strBufferChars: UInt = 0u,
    public var strCharsNeeded: UInt = 0u,
    public var dataBufferIndex: UInt = 0u,
    public var dataBufferBytes: UInt = 0u,
    public var dataBytesNeeded: UInt = 0u,
    public var status: Hresult = 0,
    public var reserved: ULongArray = ULongArray(8),
)

public data class FaEntry(
    public var tag: DebugFlrParamType = 0,
    public var fullSize: UShort = 0u,
    public var dataSize: UShort = 0u,
)

public data class FieldInfo(
    public var fName: COpaquePointer? = null,
    public var printName: COpaquePointer? = null,
    public var size: UInt = 0u,
    public var fOptions: UInt = 0u,
    public var address: ULong = 0uL,
    public var anonymous: FieldInfo0 = FieldInfo0(),
    public var typeId: UInt = 0u,
    public var fieldOffset: UInt = 0u,
    public var bufferSize: UInt = 0u,
    public var bitField: FieldInfo1 = FieldInfo1(),
    public var bitfield: UInt = 0u,
)

public data class FieldInfo0(
    public var fieldCallBack: COpaquePointer? = null,
    public var pBuffer: COpaquePointer? = null,
)

public data class FieldInfo1(
    public var position: UShort = 0u,
    public var size: UShort = 0u,
)

public data class GetContextEx(
    public var status: UInt = 0u,
    public var contextSize: UInt = 0u,
    public var pContext: COpaquePointer? = null,
)

public data class GetCurrentProcessAddress(
    public var processor: UInt = 0u,
    public var currentThread: ULong = 0uL,
    public var address: ULong = 0uL,
)

public data class GetCurrentThreadAddress(
    public var processor: UInt = 0u,
    public var address: ULong = 0uL,
)

public data class GetExpressionEx(
    public var expression: Pcstr = null,
    public var remainder: Pcstr = null,
    public var value: ULong = 0uL,
)

public data class GetInputLine(
    public var prompt: Pcstr = null,
    public var buffer: Pstr = null,
    public var bufferSize: UInt = 0u,
    public var inputSize: UInt = 0u,
)

public data class GetPebAddress(
    public var currentThread: ULong = 0uL,
    public var address: ULong = 0uL,
)

public data class GetSetSympath(
    public var args: Pcstr = null,
    public var result: Pstr = null,
    public var length: Int = 0,
)

public data class GetTebAddress(
    public var address: ULong = 0uL,
)

public data class InlineFrameContext(
    public var contextValue: UInt = 0u,
    public var anonymous: InlineFrameContext0 = InlineFrameContext0(),
)

public data class InlineFrameContext0(
    public var frameId: UByte = 0u,
    public var frameType: UByte = 0u,
    public var frameSignature: UShort = 0u,
)

public data class Iospace(
    public var address: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
)

public data class Iospace32(
    public var address: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
)

public data class Iospace64(
    public var address: ULong = 0uL,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
)

public data class IospaceEx(
    public var address: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
    public var interfaceType: UInt = 0u,
    public var busNumber: UInt = 0u,
    public var addressSpace: UInt = 0u,
)

public data class IospaceEx32(
    public var address: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
    public var interfaceType: UInt = 0u,
    public var busNumber: UInt = 0u,
    public var addressSpace: UInt = 0u,
)

public data class IospaceEx64(
    public var address: ULong = 0uL,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
    public var interfaceType: UInt = 0u,
    public var busNumber: UInt = 0u,
    public var addressSpace: UInt = 0u,
)

public class KddebuggerData32 {
    public var header: DbgkdDebugDataHeader32 = DbgkdDebugDataHeader32()

    public var kernBase: UInt = 0u

    public var breakpointWithStatus: UInt = 0u

    public var savedContext: UInt = 0u

    public var thCallbackStack: UShort = 0u

    public var nextCallback: UShort = 0u

    public var framePointer: UShort = 0u

    public var bitfield: UShort = 0u

    public var kiCallUserMode: UInt = 0u

    public var keUserCallbackDispatcher: UInt = 0u

    public var psLoadedModuleList: UInt = 0u

    public var psActiveProcessHead: UInt = 0u

    public var pspCidTable: UInt = 0u

    public var expSystemResourcesList: UInt = 0u

    public var expPagedPoolDescriptor: UInt = 0u

    public var expNumberOfPagedPools: UInt = 0u

    public var keTimeIncrement: UInt = 0u

    public var keBugCheckCallbackListHead: UInt = 0u

    public var kiBugcheckData: UInt = 0u

    public var iopErrorLogListHead: UInt = 0u

    public var obpRootDirectoryObject: UInt = 0u

    public var obpTypeObjectType: UInt = 0u

    public var mmSystemCacheStart: UInt = 0u

    public var mmSystemCacheEnd: UInt = 0u

    public var mmSystemCacheWs: UInt = 0u

    public var mmPfnDatabase: UInt = 0u

    public var mmSystemPtesStart: UInt = 0u

    public var mmSystemPtesEnd: UInt = 0u

    public var mmSubsectionBase: UInt = 0u

    public var mmNumberOfPagingFiles: UInt = 0u

    public var mmLowestPhysicalPage: UInt = 0u

    public var mmHighestPhysicalPage: UInt = 0u

    public var mmNumberOfPhysicalPages: UInt = 0u

    public var mmMaximumNonPagedPoolInBytes: UInt = 0u

    public var mmNonPagedSystemStart: UInt = 0u

    public var mmNonPagedPoolStart: UInt = 0u

    public var mmNonPagedPoolEnd: UInt = 0u

    public var mmPagedPoolStart: UInt = 0u

    public var mmPagedPoolEnd: UInt = 0u

    public var mmPagedPoolInformation: UInt = 0u

    public var mmPageSize: UInt = 0u

    public var mmSizeOfPagedPoolInBytes: UInt = 0u

    public var mmTotalCommitLimit: UInt = 0u

    public var mmTotalCommittedPages: UInt = 0u

    public var mmSharedCommit: UInt = 0u

    public var mmDriverCommit: UInt = 0u

    public var mmProcessCommit: UInt = 0u

    public var mmPagedPoolCommit: UInt = 0u

    public var mmExtendedCommit: UInt = 0u

    public var mmZeroedPageListHead: UInt = 0u

    public var mmFreePageListHead: UInt = 0u

    public var mmStandbyPageListHead: UInt = 0u

    public var mmModifiedPageListHead: UInt = 0u

    public var mmModifiedNoWritePageListHead: UInt = 0u

    public var mmAvailablePages: UInt = 0u

    public var mmResidentAvailablePages: UInt = 0u

    public var poolTrackTable: UInt = 0u

    public var nonPagedPoolDescriptor: UInt = 0u

    public var mmHighestUserAddress: UInt = 0u

    public var mmSystemRangeStart: UInt = 0u

    public var mmUserProbeAddress: UInt = 0u

    public var kdPrintCircularBuffer: UInt = 0u

    public var kdPrintCircularBufferEnd: UInt = 0u

    public var kdPrintWritePointer: UInt = 0u

    public var kdPrintRolloverCount: UInt = 0u

    public var mmLoadedUserImageList: UInt = 0u
}

public class KddebuggerData64 {
    public var header: DbgkdDebugDataHeader64 = DbgkdDebugDataHeader64()

    public var kernBase: ULong = 0uL

    public var breakpointWithStatus: ULong = 0uL

    public var savedContext: ULong = 0uL

    public var thCallbackStack: UShort = 0u

    public var nextCallback: UShort = 0u

    public var framePointer: UShort = 0u

    public var bitfield: UShort = 0u

    public var kiCallUserMode: ULong = 0uL

    public var keUserCallbackDispatcher: ULong = 0uL

    public var psLoadedModuleList: ULong = 0uL

    public var psActiveProcessHead: ULong = 0uL

    public var pspCidTable: ULong = 0uL

    public var expSystemResourcesList: ULong = 0uL

    public var expPagedPoolDescriptor: ULong = 0uL

    public var expNumberOfPagedPools: ULong = 0uL

    public var keTimeIncrement: ULong = 0uL

    public var keBugCheckCallbackListHead: ULong = 0uL

    public var kiBugcheckData: ULong = 0uL

    public var iopErrorLogListHead: ULong = 0uL

    public var obpRootDirectoryObject: ULong = 0uL

    public var obpTypeObjectType: ULong = 0uL

    public var mmSystemCacheStart: ULong = 0uL

    public var mmSystemCacheEnd: ULong = 0uL

    public var mmSystemCacheWs: ULong = 0uL

    public var mmPfnDatabase: ULong = 0uL

    public var mmSystemPtesStart: ULong = 0uL

    public var mmSystemPtesEnd: ULong = 0uL

    public var mmSubsectionBase: ULong = 0uL

    public var mmNumberOfPagingFiles: ULong = 0uL

    public var mmLowestPhysicalPage: ULong = 0uL

    public var mmHighestPhysicalPage: ULong = 0uL

    public var mmNumberOfPhysicalPages: ULong = 0uL

    public var mmMaximumNonPagedPoolInBytes: ULong = 0uL

    public var mmNonPagedSystemStart: ULong = 0uL

    public var mmNonPagedPoolStart: ULong = 0uL

    public var mmNonPagedPoolEnd: ULong = 0uL

    public var mmPagedPoolStart: ULong = 0uL

    public var mmPagedPoolEnd: ULong = 0uL

    public var mmPagedPoolInformation: ULong = 0uL

    public var mmPageSize: ULong = 0uL

    public var mmSizeOfPagedPoolInBytes: ULong = 0uL

    public var mmTotalCommitLimit: ULong = 0uL

    public var mmTotalCommittedPages: ULong = 0uL

    public var mmSharedCommit: ULong = 0uL

    public var mmDriverCommit: ULong = 0uL

    public var mmProcessCommit: ULong = 0uL

    public var mmPagedPoolCommit: ULong = 0uL

    public var mmExtendedCommit: ULong = 0uL

    public var mmZeroedPageListHead: ULong = 0uL

    public var mmFreePageListHead: ULong = 0uL

    public var mmStandbyPageListHead: ULong = 0uL

    public var mmModifiedPageListHead: ULong = 0uL

    public var mmModifiedNoWritePageListHead: ULong = 0uL

    public var mmAvailablePages: ULong = 0uL

    public var mmResidentAvailablePages: ULong = 0uL

    public var poolTrackTable: ULong = 0uL

    public var nonPagedPoolDescriptor: ULong = 0uL

    public var mmHighestUserAddress: ULong = 0uL

    public var mmSystemRangeStart: ULong = 0uL

    public var mmUserProbeAddress: ULong = 0uL

    public var kdPrintCircularBuffer: ULong = 0uL

    public var kdPrintCircularBufferEnd: ULong = 0uL

    public var kdPrintWritePointer: ULong = 0uL

    public var kdPrintRolloverCount: ULong = 0uL

    public var mmLoadedUserImageList: ULong = 0uL

    public var ntBuildLab: ULong = 0uL

    public var kiNormalSystemCall: ULong = 0uL

    public var kiProcessorBlock: ULong = 0uL

    public var mmUnloadedDrivers: ULong = 0uL

    public var mmLastUnloadedDriver: ULong = 0uL

    public var mmTriageActionTaken: ULong = 0uL

    public var mmSpecialPoolTag: ULong = 0uL

    public var kernelVerifier: ULong = 0uL

    public var mmVerifierData: ULong = 0uL

    public var mmAllocatedNonPagedPool: ULong = 0uL

    public var mmPeakCommitment: ULong = 0uL

    public var mmTotalCommitLimitMaximum: ULong = 0uL

    public var cmNtCSDVersion: ULong = 0uL

    public var mmPhysicalMemoryBlock: ULong = 0uL

    public var mmSessionBase: ULong = 0uL

    public var mmSessionSize: ULong = 0uL

    public var mmSystemParentTablePage: ULong = 0uL

    public var mmVirtualTranslationBase: ULong = 0uL

    public var offsetKThreadNextProcessor: UShort = 0u

    public var offsetKThreadTeb: UShort = 0u

    public var offsetKThreadKernelStack: UShort = 0u

    public var offsetKThreadInitialStack: UShort = 0u

    public var offsetKThreadApcProcess: UShort = 0u

    public var offsetKThreadState: UShort = 0u

    public var offsetKThreadBStore: UShort = 0u

    public var offsetKThreadBStoreLimit: UShort = 0u

    public var sizeEProcess: UShort = 0u

    public var offsetEprocessPeb: UShort = 0u

    public var offsetEprocessParentCID: UShort = 0u

    public var offsetEprocessDirectoryTableBase: UShort = 0u

    public var sizePrcb: UShort = 0u

    public var offsetPrcbDpcRoutine: UShort = 0u

    public var offsetPrcbCurrentThread: UShort = 0u

    public var offsetPrcbMhz: UShort = 0u

    public var offsetPrcbCpuType: UShort = 0u

    public var offsetPrcbVendorString: UShort = 0u

    public var offsetPrcbProcStateContext: UShort = 0u

    public var offsetPrcbNumber: UShort = 0u

    public var sizeEThread: UShort = 0u

    public var l1tfHighPhysicalBitIndex: UByte = 0u

    public var l1tfSwizzleBitIndex: UByte = 0u

    public var padding0: UInt = 0u

    public var kdPrintCircularBufferPtr: ULong = 0uL

    public var kdPrintBufferSize: ULong = 0uL

    public var keLoaderBlock: ULong = 0uL

    public var sizePcr: UShort = 0u

    public var offsetPcrSelfPcr: UShort = 0u

    public var offsetPcrCurrentPrcb: UShort = 0u

    public var offsetPcrContainedPrcb: UShort = 0u

    public var offsetPcrInitialBStore: UShort = 0u

    public var offsetPcrBStoreLimit: UShort = 0u

    public var offsetPcrInitialStack: UShort = 0u

    public var offsetPcrStackLimit: UShort = 0u

    public var offsetPrcbPcrPage: UShort = 0u

    public var offsetPrcbProcStateSpecialReg: UShort = 0u

    public var gdtR0Code: UShort = 0u

    public var gdtR0Data: UShort = 0u

    public var gdtR0Pcr: UShort = 0u

    public var gdtR3Code: UShort = 0u

    public var gdtR3Data: UShort = 0u

    public var gdtR3Teb: UShort = 0u

    public var gdtLdt: UShort = 0u

    public var gdtTss: UShort = 0u

    public var gdt64R3CmCode: UShort = 0u

    public var gdt64R3CmTeb: UShort = 0u

    public var iopNumTriageDumpDataBlocks: ULong = 0uL

    public var iopTriageDumpDataBlocks: ULong = 0uL

    public var vfCrashDataBlock: ULong = 0uL

    public var mmBadPagesDetected: ULong = 0uL

    public var mmZeroedPageSingleBitErrorsDetected: ULong = 0uL

    public var etwpDebuggerData: ULong = 0uL

    public var offsetPrcbContext: UShort = 0u

    public var offsetPrcbMaxBreakpoints: UShort = 0u

    public var offsetPrcbMaxWatchpoints: UShort = 0u

    public var offsetKThreadStackLimit: UInt = 0u

    public var offsetKThreadStackBase: UInt = 0u

    public var offsetKThreadQueueListEntry: UInt = 0u

    public var offsetEThreadIrpList: UInt = 0u

    public var offsetPrcbIdleThread: UShort = 0u

    public var offsetPrcbNormalDpcState: UShort = 0u

    public var offsetPrcbDpcStack: UShort = 0u

    public var offsetPrcbIsrStack: UShort = 0u

    public var sizeKdpcStackFrame: UShort = 0u

    public var offsetKPriQueueThreadListHead: UShort = 0u

    public var offsetKThreadWaitReason: UShort = 0u

    public var padding1: UShort = 0u

    public var pteBase: ULong = 0uL

    public var retpolineStubFunctionTable: ULong = 0uL

    public var retpolineStubFunctionTableSize: UInt = 0u

    public var retpolineStubOffset: UInt = 0u

    public var retpolineStubSize: UInt = 0u

    public var offsetEProcessMmHotPatchContext: UShort = 0u

    public var offsetKThreadShadowStackLimit: UInt = 0u

    public var offsetKThreadShadowStackBase: UInt = 0u

    public var shadowStackEnabled: ULong = 0uL

    public var pointerAuthMask: ULong = 0uL

    public var offsetPrcbExceptionStack: UShort = 0u
}

public data class KdextsLockInfo(
    public var sizeOfStruct: UInt = 0u,
    public var address: ULong = 0uL,
    public var owningThread: ULong = 0uL,
    public var exclusiveOwned: Bool = 0,
    public var numOwners: UInt = 0u,
    public var contentionCount: UInt = 0u,
    public var numExclusiveWaiters: UInt = 0u,
    public var numSharedWaiters: UInt = 0u,
    public var pOwnerThreads: ULong? = null,
    public var pWaiterThreads: ULong? = null,
)

public data class KdextsPteInfo(
    public var sizeOfStruct: UInt = 0u,
    public var virtualAddress: ULong = 0uL,
    public var ppeAddress: ULong = 0uL,
    public var pdeAddress: ULong = 0uL,
    public var pteAddress: ULong = 0uL,
    public var pfn: ULong = 0uL,
    public var levels: ULong = 0uL,
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
)

public data class KdextFilelockOwner(
    public var sizeofstruct: UInt = 0u,
    public var fileObject: ULong = 0uL,
    public var ownerThread: ULong = 0uL,
    public var waitIrp: ULong = 0uL,
    public var deviceObject: ULong = 0uL,
    public var blockingDirver: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KdextFilelockOwner) return false
        if (this.sizeofstruct != other.sizeofstruct) return false
        if (this.fileObject != other.fileObject) return false
        if (this.ownerThread != other.ownerThread) return false
        if (this.waitIrp != other.waitIrp) return false
        if (this.deviceObject != other.deviceObject) return false
        if (!this.blockingDirver.contentEquals(other.blockingDirver)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofstruct.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        result = 31 * result + this.ownerThread.hashCode()
        result = 31 * result + this.waitIrp.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        result = 31 * result + this.blockingDirver.contentHashCode()
        return result
    }
}

public data class KdextHandleInformation(
    public var handleTableEntry: ULong = 0uL,
    public var handle: ULong = 0uL,
    public var obj: ULong = 0uL,
    public var objectBody: ULong = 0uL,
    public var grantedAccess: ULong = 0uL,
    public var handleAttributes: UInt = 0u,
    public var pagedOut: Boolean = false,
)

public data class KdextProcessFindParams(
    public var sizeofStruct: UInt = 0u,
    public var pid: UInt = 0u,
    public var session: UInt = 0u,
    public var imageName: Pstr = null,
)

public data class KdextThreadFindParams(
    public var sizeofStruct: UInt = 0u,
    public var stackPointer: ULong = 0uL,
    public var cid: UInt = 0u,
    public var thread: ULong = 0uL,
)

public data class Location(
    public var hostDefined: ULong = 0uL,
    public var offset: ULong = 0uL,
)

public class OsInfo(
    public var majorVer: UInt = 0u,
    public var minorVer: UInt = 0u,
    public var build: UInt = 0u,
    public var buildQfe: UInt = 0u,
    public var productType: UInt = 0u,
    public var suite: UInt = 0u,
    public var revision: UInt = 0u,
    public var s: OsInfo0 = OsInfo0(),
    public var srvPackNumber: UInt = 0u,
    public var servicePackBuild: UInt = 0u,
    public var architecture: UInt = 0u,
    public var lcid: UInt = 0u,
    public var name: ByteArray = ByteArray(64),
    public var fullName: ByteArray = ByteArray(256),
    public var language: ByteArray = ByteArray(30),
    public var buildVersion: ByteArray = ByteArray(64),
    public var servicePackString: ByteArray = ByteArray(64),
)

public data class OsInfo0(
    public var bitfield: UInt = 0u,
)

public data class OsInfoV1(
    public var type: OsType = 0,
    public var anonymous: OsInfoV10 = OsInfoV10(),
    public var productType: UInt = 0u,
    public var suite: UInt = 0u,
    public var s: OsInfoV11 = OsInfoV11(),
    public var srvPackNumber: UInt = 0u,
    public var language: ByteArray = ByteArray(30),
    public var osString: ByteArray = ByteArray(64),
    public var servicePackString: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OsInfoV1) return false
        if (this.type != other.type) return false
        if (this.anonymous != other.anonymous) return false
        if (this.productType != other.productType) return false
        if (this.suite != other.suite) return false
        if (this.s != other.s) return false
        if (this.srvPackNumber != other.srvPackNumber) return false
        if (!this.language.contentEquals(other.language)) return false
        if (!this.osString.contentEquals(other.osString)) return false
        if (!this.servicePackString.contentEquals(other.servicePackString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.productType.hashCode()
        result = 31 * result + this.suite.hashCode()
        result = 31 * result + this.s.hashCode()
        result = 31 * result + this.srvPackNumber.hashCode()
        result = 31 * result + this.language.contentHashCode()
        result = 31 * result + this.osString.contentHashCode()
        result = 31 * result + this.servicePackString.contentHashCode()
        return result
    }
}

public data class OsInfoV10(
    public var version: OsInfoV100 = OsInfoV100(),
    public var ver64: ULong = 0uL,
)

public data class OsInfoV100(
    public var major: UInt = 0u,
    public var minor: UInt = 0u,
)

public data class OsInfoV11(
    public var bitfield: UInt = 0u,
)

public data class Physical(
    public var address: ULong = 0uL,
    public var bufLen: UInt = 0u,
    public var buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Physical) return false
        if (this.address != other.address) return false
        if (this.bufLen != other.bufLen) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.bufLen.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }
}

public data class PhysicalToVirtual(
    public var status: UInt = 0u,
    public var size: UInt = 0u,
    public var pdeAddress: ULong = 0uL,
)

public data class PhysicalWithFlags(
    public var address: ULong = 0uL,
    public var bufLen: UInt = 0u,
    public var flags: UInt = 0u,
    public var buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PhysicalWithFlags) return false
        if (this.address != other.address) return false
        if (this.bufLen != other.bufLen) return false
        if (this.flags != other.flags) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.bufLen.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }
}

public data class PointerSearchPhysical(
    public var offset: ULong = 0uL,
    public var length: ULong = 0uL,
    public var pointerMin: ULong = 0uL,
    public var pointerMax: ULong = 0uL,
    public var flags: UInt = 0u,
    public var matchOffsets: ULong? = null,
    public var matchOffsetsSize: UInt = 0u,
    public var matchOffsetsCount: UInt = 0u,
)

public data class Processorinfo(
    public var processor: UShort = 0u,
    public var numberProcessors: UShort = 0u,
)

public data class ProcessCommitUsage(
    public var imageFileName: UByteArray = UByteArray(16),
    public var clientId: ULong = 0uL,
    public var processAddress: ULong = 0uL,
    public var commitCharge: ULong = 0uL,
    public var sharedCommitCharge: ULong = 0uL,
    public var releasedCommitDebt: ULong = 0uL,
    public var reserved: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessCommitUsage) return false
        if (!this.imageFileName.contentEquals(other.imageFileName)) return false
        if (this.clientId != other.clientId) return false
        if (this.processAddress != other.processAddress) return false
        if (this.commitCharge != other.commitCharge) return false
        if (this.sharedCommitCharge != other.sharedCommitCharge) return false
        if (this.releasedCommitDebt != other.releasedCommitDebt) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.imageFileName.contentHashCode()
        result = 31 * result + this.clientId.hashCode()
        result = 31 * result + this.processAddress.hashCode()
        result = 31 * result + this.commitCharge.hashCode()
        result = 31 * result + this.sharedCommitCharge.hashCode()
        result = 31 * result + this.releasedCommitDebt.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }
}

public data class ProcessNameEntry(
    public var processId: UInt = 0u,
    public var nameOffset: UInt = 0u,
    public var nameSize: UInt = 0u,
    public var nextEntry: UInt = 0u,
)

public data class Readcontrolspace(
    public var processor: UShort = 0u,
    public var address: UInt = 0u,
    public var bufLen: UInt = 0u,
    public var buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Readcontrolspace) return false
        if (this.processor != other.processor) return false
        if (this.address != other.address) return false
        if (this.bufLen != other.bufLen) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processor.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.bufLen.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }
}

public data class Readcontrolspace32(
    public var processor: UShort = 0u,
    public var address: UInt = 0u,
    public var bufLen: UInt = 0u,
    public var buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Readcontrolspace32) return false
        if (this.processor != other.processor) return false
        if (this.address != other.address) return false
        if (this.bufLen != other.bufLen) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processor.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.bufLen.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }
}

public data class Readcontrolspace64(
    public var processor: UShort = 0u,
    public var address: ULong = 0uL,
    public var bufLen: UInt = 0u,
    public var buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Readcontrolspace64) return false
        if (this.processor != other.processor) return false
        if (this.address != other.address) return false
        if (this.bufLen != other.bufLen) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processor.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.bufLen.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }
}

public data class ReadWriteMsr(
    public var msr: UInt = 0u,
    public var value: Long = 0L,
)

public data class Searchmemory(
    public var searchAddress: ULong = 0uL,
    public var searchLength: ULong = 0uL,
    public var foundAddress: ULong = 0uL,
    public var patternLength: UInt = 0u,
    public var pattern: COpaquePointer? = null,
)

public data class StackSrcInfo(
    public var imagePath: Pcwstr = null,
    public var moduleName: Pcwstr = null,
    public var function: Pcwstr = null,
    public var displacement: UInt = 0u,
    public var row: UInt = 0u,
    public var column: UInt = 0u,
)

public data class StackSymFrameInfo(
    public var stackFrameEx: DebugStackFrameEx = DebugStackFrameEx(),
    public var srcInfo: StackSrcInfo = StackSrcInfo(),
)

public data class SymbolInfoEx(
    public var sizeOfStruct: UInt = 0u,
    public var typeOfInfo: UInt = 0u,
    public var offset: ULong = 0uL,
    public var line: UInt = 0u,
    public var displacement: UInt = 0u,
    public var reserved: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolInfoEx) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.typeOfInfo != other.typeOfInfo) return false
        if (this.offset != other.offset) return false
        if (this.line != other.line) return false
        if (this.displacement != other.displacement) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.typeOfInfo.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.line.hashCode()
        result = 31 * result + this.displacement.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class SymDumpParam(
    public var size: UInt = 0u,
    public var sName: COpaquePointer? = null,
    public var options: UInt = 0u,
    public var addr: ULong = 0uL,
    public var listLink: FieldInfo? = null,
    public var anonymous: SymDumpParam0 = SymDumpParam0(),
    public var callbackRoutine: PsymDumpFieldCallback = null,
    public var nFields: UInt = 0u,
    public var fields: FieldInfo? = null,
    public var modBase: ULong = 0uL,
    public var typeId: UInt = 0u,
    public var typeSize: UInt = 0u,
    public var bufferSize: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class SymDumpParam0(
    public var context: COpaquePointer? = null,
    public var pBuffer: COpaquePointer? = null,
)

public data class ScriptDebugEventInformation(
    public var debugEvent: ScriptDebugEvent = 0,
    public var eventPosition: ScriptDebugPosition = ScriptDebugPosition(),
    public var eventSpanEnd: ScriptDebugPosition = ScriptDebugPosition(),
    public var u: ScriptDebugEventInformation0 = ScriptDebugEventInformation0(),
)

public data class ScriptDebugEventInformation0(
    public var exceptionInformation: ScriptDebugEventInformation00 = ScriptDebugEventInformation00(),
    public var breakpointInformation: ScriptDebugEventInformation01 = ScriptDebugEventInformation01(),
)

public data class ScriptDebugEventInformation01(
    public var breakpointId: ULong = 0uL,
)

public data class ScriptDebugEventInformation00(
    public var isUncaught: UByte = 0u,
)

public data class ScriptDebugPosition(
    public var line: UInt = 0u,
    public var column: UInt = 0u,
)

public data class TargetDebugInfo(
    public var sizeOfStruct: UInt = 0u,
    public var entryDate: ULong = 0uL,
    public var debugeeClass: UInt = 0u,
    public var sysUpTime: ULong = 0uL,
    public var appUpTime: ULong = 0uL,
    public var crashTime: ULong = 0uL,
    public var osInfo: OsInfo = OsInfo(),
    public var cpu: CpuInfo = CpuInfo(),
    public var dumpFile: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TargetDebugInfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.entryDate != other.entryDate) return false
        if (this.debugeeClass != other.debugeeClass) return false
        if (this.sysUpTime != other.sysUpTime) return false
        if (this.appUpTime != other.appUpTime) return false
        if (this.crashTime != other.crashTime) return false
        if (this.osInfo != other.osInfo) return false
        if (this.cpu != other.cpu) return false
        if (!this.dumpFile.contentEquals(other.dumpFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.entryDate.hashCode()
        result = 31 * result + this.debugeeClass.hashCode()
        result = 31 * result + this.sysUpTime.hashCode()
        result = 31 * result + this.appUpTime.hashCode()
        result = 31 * result + this.crashTime.hashCode()
        result = 31 * result + this.osInfo.hashCode()
        result = 31 * result + this.cpu.hashCode()
        result = 31 * result + this.dumpFile.contentHashCode()
        return result
    }
}

public data class TargetDebugInfoV1(
    public var sizeOfStruct: UInt = 0u,
    public var id: ULong = 0uL,
    public var source: ULong = 0uL,
    public var entryDate: ULong = 0uL,
    public var sysUpTime: ULong = 0uL,
    public var appUpTime: ULong = 0uL,
    public var crashTime: ULong = 0uL,
    public var mode: ULong = 0uL,
    public var osInfo: OsInfoV1 = OsInfoV1(),
    public var cpu: CpuInfoV1 = CpuInfoV1(),
    public var dumpFile: ByteArray = ByteArray(260),
    public var failureData: COpaquePointer? = null,
    public var stackTr: ByteArray = ByteArray(4096),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TargetDebugInfoV1) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.id != other.id) return false
        if (this.source != other.source) return false
        if (this.entryDate != other.entryDate) return false
        if (this.sysUpTime != other.sysUpTime) return false
        if (this.appUpTime != other.appUpTime) return false
        if (this.crashTime != other.crashTime) return false
        if (this.mode != other.mode) return false
        if (this.osInfo != other.osInfo) return false
        if (this.cpu != other.cpu) return false
        if (!this.dumpFile.contentEquals(other.dumpFile)) return false
        if (this.failureData != other.failureData) return false
        if (!this.stackTr.contentEquals(other.stackTr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.source.hashCode()
        result = 31 * result + this.entryDate.hashCode()
        result = 31 * result + this.sysUpTime.hashCode()
        result = 31 * result + this.appUpTime.hashCode()
        result = 31 * result + this.crashTime.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.osInfo.hashCode()
        result = 31 * result + this.cpu.hashCode()
        result = 31 * result + this.dumpFile.contentHashCode()
        result = 31 * result + this.failureData.hashCode()
        result = 31 * result + this.stackTr.contentHashCode()
        return result
    }
}

public data class TargetDebugInfoV2(
    public var sizeOfStruct: UInt = 0u,
    public var entryDate: ULong = 0uL,
    public var debugeeClass: UInt = 0u,
    public var sysUpTime: ULong = 0uL,
    public var appUpTime: ULong = 0uL,
    public var crashTime: ULong = 0uL,
    public var osInfo: OsInfo = OsInfo(),
    public var cpu: CpuInfoV2 = CpuInfoV2(),
    public var dumpFile: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TargetDebugInfoV2) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.entryDate != other.entryDate) return false
        if (this.debugeeClass != other.debugeeClass) return false
        if (this.sysUpTime != other.sysUpTime) return false
        if (this.appUpTime != other.appUpTime) return false
        if (this.crashTime != other.crashTime) return false
        if (this.osInfo != other.osInfo) return false
        if (this.cpu != other.cpu) return false
        if (!this.dumpFile.contentEquals(other.dumpFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.entryDate.hashCode()
        result = 31 * result + this.debugeeClass.hashCode()
        result = 31 * result + this.sysUpTime.hashCode()
        result = 31 * result + this.appUpTime.hashCode()
        result = 31 * result + this.crashTime.hashCode()
        result = 31 * result + this.osInfo.hashCode()
        result = 31 * result + this.cpu.hashCode()
        result = 31 * result + this.dumpFile.contentHashCode()
        return result
    }
}

public data class TranslateVirtualToPhysical(
    public var virtual: ULong = 0uL,
    public var physical: ULong = 0uL,
)

public data class VirtualToPhysical(
    public var status: UInt = 0u,
    public var size: UInt = 0u,
    public var pdeAddress: ULong = 0uL,
    public var virtual: ULong = 0uL,
    public var physical: ULong = 0uL,
)

public data class WdbgextsClrDataInterface(
    public var iid: Guid? = null,
    public var iface: COpaquePointer? = null,
)

public data class WdbgextsDisassembleBuffer(
    public var inOffset: ULong = 0uL,
    public var outOffset: ULong = 0uL,
    public var addrFlags: UInt = 0u,
    public var formatFlags: UInt = 0u,
    public var dataBufferBytes: UInt = 0u,
    public var disasmBufferChars: UInt = 0u,
    public var dataBuffer: COpaquePointer? = null,
    public var disasmBuffer: Pwstr = null,
    public var reserved0: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WdbgextsDisassembleBuffer) return false
        if (this.inOffset != other.inOffset) return false
        if (this.outOffset != other.outOffset) return false
        if (this.addrFlags != other.addrFlags) return false
        if (this.formatFlags != other.formatFlags) return false
        if (this.dataBufferBytes != other.dataBufferBytes) return false
        if (this.disasmBufferChars != other.disasmBufferChars) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.disasmBuffer != other.disasmBuffer) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inOffset.hashCode()
        result = 31 * result + this.outOffset.hashCode()
        result = 31 * result + this.addrFlags.hashCode()
        result = 31 * result + this.formatFlags.hashCode()
        result = 31 * result + this.dataBufferBytes.hashCode()
        result = 31 * result + this.disasmBufferChars.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.disasmBuffer.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        return result
    }
}

public data class WdbgextsModuleInRange(
    public var start: ULong = 0uL,
    public var end: ULong = 0uL,
    public var foundModBase: ULong = 0uL,
    public var foundModSize: UInt = 0u,
)

public data class WdbgextsQueryInterface(
    public var iid: Guid? = null,
    public var iface: COpaquePointer? = null,
)

public data class WdbgextsThreadOsInfo(
    public var threadId: UInt = 0u,
    public var exitStatus: UInt = 0u,
    public var priorityClass: UInt = 0u,
    public var priority: UInt = 0u,
    public var createTime: ULong = 0uL,
    public var exitTime: ULong = 0uL,
    public var kernelTime: ULong = 0uL,
    public var userTime: ULong = 0uL,
    public var startOffset: ULong = 0uL,
    public var affinity: ULong = 0uL,
)

public data class WindbgExtensionApis(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PwindbgOutputRoutine = null,
    public var lpGetExpressionRoutine: PwindbgGetExpression = null,
    public var lpGetSymbolRoutine: PwindbgGetSymbol = null,
    public var lpDisasmRoutine: PwindbgDisasm = null,
    public var lpCheckControlCRoutine: PwindbgCheckControlC = null,
    public var lpReadProcessMemoryRoutine: PwindbgReadProcessMemoryRoutine = null,
    public var lpWriteProcessMemoryRoutine: PwindbgWriteProcessMemoryRoutine = null,
    public var lpGetThreadContextRoutine: PwindbgGetThreadContextRoutine = null,
    public var lpSetThreadContextRoutine: PwindbgSetThreadContextRoutine = null,
    public var lpIoctlRoutine: PwindbgIoctlRoutine = null,
    public var lpStackTraceRoutine: PwindbgStacktraceRoutine = null,
)

public data class WindbgExtensionApis32(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PwindbgOutputRoutine = null,
    public var lpGetExpressionRoutine: PwindbgGetExpression32 = null,
    public var lpGetSymbolRoutine: PwindbgGetSymbol32 = null,
    public var lpDisasmRoutine: PwindbgDisasm32 = null,
    public var lpCheckControlCRoutine: PwindbgCheckControlC = null,
    public var lpReadProcessMemoryRoutine: PwindbgReadProcessMemoryRoutine32 = null,
    public var lpWriteProcessMemoryRoutine: PwindbgWriteProcessMemoryRoutine32 = null,
    public var lpGetThreadContextRoutine: PwindbgGetThreadContextRoutine = null,
    public var lpSetThreadContextRoutine: PwindbgSetThreadContextRoutine = null,
    public var lpIoctlRoutine: PwindbgIoctlRoutine = null,
    public var lpStackTraceRoutine: PwindbgStacktraceRoutine32 = null,
)

public data class WindbgExtensionApis64(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PwindbgOutputRoutine = null,
    public var lpGetExpressionRoutine: PwindbgGetExpression64 = null,
    public var lpGetSymbolRoutine: PwindbgGetSymbol64 = null,
    public var lpDisasmRoutine: PwindbgDisasm64 = null,
    public var lpCheckControlCRoutine: PwindbgCheckControlC = null,
    public var lpReadProcessMemoryRoutine: PwindbgReadProcessMemoryRoutine64 = null,
    public var lpWriteProcessMemoryRoutine: PwindbgWriteProcessMemoryRoutine64 = null,
    public var lpGetThreadContextRoutine: PwindbgGetThreadContextRoutine = null,
    public var lpSetThreadContextRoutine: PwindbgSetThreadContextRoutine = null,
    public var lpIoctlRoutine: PwindbgIoctlRoutine = null,
    public var lpStackTraceRoutine: PwindbgStacktraceRoutine64 = null,
)

public data class WindbgOldkdExtensionApis(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PwindbgOutputRoutine = null,
    public var lpGetExpressionRoutine: PwindbgGetExpression32 = null,
    public var lpGetSymbolRoutine: PwindbgGetSymbol32 = null,
    public var lpDisasmRoutine: PwindbgDisasm32 = null,
    public var lpCheckControlCRoutine: PwindbgCheckControlC = null,
    public var lpReadVirtualMemRoutine: PwindbgReadProcessMemoryRoutine32 = null,
    public var lpWriteVirtualMemRoutine: PwindbgWriteProcessMemoryRoutine32 = null,
    public var lpReadPhysicalMemRoutine: PwindbgOldkdReadPhysicalMemory = null,
    public var lpWritePhysicalMemRoutine: PwindbgOldkdWritePhysicalMemory = null,
)

public data class WindbgOldExtensionApis(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PwindbgOutputRoutine = null,
    public var lpGetExpressionRoutine: PwindbgGetExpression = null,
    public var lpGetSymbolRoutine: PwindbgGetSymbol = null,
    public var lpDisasmRoutine: PwindbgDisasm = null,
    public var lpCheckControlCRoutine: PwindbgCheckControlC = null,
)

public data class XmlDriverNodeInfo(
    public var fileName: ByteArray = ByteArray(64),
    public var fileSize: ULong = 0uL,
    public var creationDate: ULong = 0uL,
    public var version: ByteArray = ByteArray(64),
    public var manufacturer: ByteArray = ByteArray(260),
    public var productName: ByteArray = ByteArray(260),
    public var group: ByteArray = ByteArray(260),
    public var altitude: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XmlDriverNodeInfo) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.fileSize != other.fileSize) return false
        if (this.creationDate != other.creationDate) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.manufacturer.contentEquals(other.manufacturer)) return false
        if (!this.productName.contentEquals(other.productName)) return false
        if (!this.group.contentEquals(other.group)) return false
        if (!this.altitude.contentEquals(other.altitude)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileName.contentHashCode()
        result = 31 * result + this.fileSize.hashCode()
        result = 31 * result + this.creationDate.hashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.manufacturer.contentHashCode()
        result = 31 * result + this.productName.contentHashCode()
        result = 31 * result + this.group.contentHashCode()
        result = 31 * result + this.altitude.contentHashCode()
        return result
    }
}
