package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.Context

public typealias CallingConventionKind = Int

public typealias DbgkdMajorTypes = Int

public typealias DebugFailureType = Int

public typealias DebugFlrParamType = Int

public typealias DebugPoolRegion = Int

public fun interface EntryCallbackFn {
    public operator fun invoke(entryaddress: ULong, context: MutPtr<CVoid>): Hresult
}

public typealias EntryCallback = EntryCallbackFn?

public fun interface ExtdllIteratertlbalancednodesFn {
    public operator fun invoke(rootnode: ULong, entryoffset: UInt, callback: EntryCallback, callbackcontext: MutPtr<CVoid>)
}

public typealias ExtdllIteratertlbalancednodes = ExtdllIteratertlbalancednodesFn?

public fun interface ExtdllQuerydatabytagFn {
    public operator fun invoke(client: MutPtr<CVoid>, dwdatatag: UInt, pqueryinfo: ConstPtr<CVoid>, pdata: MutPtr<UByte>, cbdata: UInt): Hresult
}

public typealias ExtdllQuerydatabytag = ExtdllQuerydatabytagFn?

public fun interface ExtdllQuerydatabytagexFn {
    public operator fun invoke(client: MutPtr<CVoid>, dwdatatag: UInt, pqueryinfo: ConstPtr<CVoid>, pdata: MutPtr<UByte>, cbdata: UInt, pdataex: MutPtr<UByte>, cbdataex: UInt): Hresult
}

public typealias ExtdllQuerydatabytagex = ExtdllQuerydatabytagexFn?

public fun interface ExtsJobProcessCallbackFn {
    public operator fun invoke(job: ULong, process: ULong, context: MutPtr<CVoid>): Boolean
}

public typealias ExtsJobProcessCallback = ExtsJobProcessCallbackFn?

public fun interface ExtsTableEntryCallbackFn {
    public operator fun invoke(entry: ULong, context: MutPtr<CVoid>): Boolean
}

public typealias ExtsTableEntryCallback = ExtsTableEntryCallbackFn?

public fun interface ExtAnalysisPluginFn {
    public operator fun invoke(client: MutPtr<CVoid>, callphase: FaExtensionPluginPhase, panalysis: MutPtr<CVoid>): Hresult
}

public typealias ExtAnalysisPlugin = ExtAnalysisPluginFn?

public fun interface ExtAnalyzerFn {
    public operator fun invoke(client: MutPtr<CVoid>, bucketsuffix: Pstr, cbbucketsuffix: UInt, debugtext: Pstr, cbdebugtext: UInt, flags: ConstPtr<UInt>, panalysis: MutPtr<CVoid>): Hresult
}

public typealias ExtAnalyzer = ExtAnalyzerFn?

public fun interface ExtDecodeErrorFn {
    public operator fun invoke(pdecodeerror: MutPtr<DebugDecodeError>)
}

public typealias ExtDecodeError = ExtDecodeErrorFn?

public fun interface ExtGetDebugFailureAnalysisFn {
    public operator fun invoke(client: MutPtr<CVoid>, flags: UInt, classid: Guid, ppanalysis: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias ExtGetDebugFailureAnalysis = ExtGetDebugFailureAnalysisFn?

public fun interface ExtGetEnvironmentVariableFn {
    public operator fun invoke(peb: ULong, variable: Pcstr, buffer: Pcstr, buffersize: UInt): Hresult
}

public typealias ExtGetEnvironmentVariable = ExtGetEnvironmentVariableFn?

public fun interface ExtGetFailureAnalysisFn {
    public operator fun invoke(client: MutPtr<CVoid>, flags: UInt, ppanalysis: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias ExtGetFailureAnalysis = ExtGetFailureAnalysisFn?

public fun interface ExtGetFaEntriesDataFn {
    public operator fun invoke(client: MutPtr<CVoid>, count: MutPtr<UInt>, entries: MutPtr<MutPtr<FaEntry>>): Hresult
}

public typealias ExtGetFaEntriesData = ExtGetFaEntriesDataFn?

public fun interface ExtGetHandleTraceFn {
    public operator fun invoke(client: MutPtr<CVoid>, tracetype: UInt, startindex: UInt, handlevalue: MutPtr<ULong>, stackfunctions: MutPtr<ULong>, stacktracesize: UInt): Hresult
}

public typealias ExtGetHandleTrace = ExtGetHandleTraceFn?

public fun interface ExtReloadTriagerFn {
    public operator fun invoke(client: MutPtr<CVoid>): Hresult
}

public typealias ExtReloadTriager = ExtReloadTriagerFn?

public fun interface ExtTargetInfoFn {
    public operator fun invoke(client: MutPtr<CVoid>, ptargetinfo: MutPtr<TargetDebugInfo>): Hresult
}

public typealias ExtTargetInfo = ExtTargetInfoFn?

public typealias ExtTdop = Int

public fun interface ExtTriageFollowupFn {
    public operator fun invoke(client: MutPtr<CVoid>, symbolname: Pcstr, ownerinfo: MutPtr<DebugTriageFollowupInfo>): UInt
}

public typealias ExtTriageFollowup = ExtTriageFollowupFn?

public fun interface ExtXmlDataFn {
    public operator fun invoke(client: MutPtr<CVoid>, pxmpdata: MutPtr<ExtCabXmlData>): Hresult
}

public typealias ExtXmlData = ExtXmlDataFn?

public typealias ErrorClass = Int

public typealias FaEntryType = Int

public typealias FaExtensionPluginPhase = Int

public typealias IntrinsicKind = Int

public fun interface KdextsLockCallbackroutineFn {
    public operator fun invoke(plock: MutPtr<KdextsLockInfo>, context: MutPtr<CVoid>): Hresult
}

public typealias KdextsLockCallbackroutine = KdextsLockCallbackroutineFn?

public fun interface KdextDumpHandleCallbackFn {
    public operator fun invoke(handleinfo: ConstPtr<KdextHandleInformation>, flags: UInt, context: MutPtr<CVoid>): Boolean
}

public typealias KdextDumpHandleCallback = KdextDumpHandleCallbackFn?

public typealias LanguageKind = Int

public typealias LocationKind = Int

public typealias ModelObjectKind = Int

public typealias OsType = Int

public fun interface PdebugExtensionCallFn {
    public operator fun invoke(client: MutPtr<CVoid>, args: Pcstr): Hresult
}

public typealias PdebugExtensionCall = PdebugExtensionCallFn?

public fun interface PdebugExtensionCanunloadFn {
    public operator fun invoke(): Hresult
}

public typealias PdebugExtensionCanunload = PdebugExtensionCanunloadFn?

public fun interface PdebugExtensionInitializeFn {
    public operator fun invoke(version: MutPtr<UInt>, flags: MutPtr<UInt>): Hresult
}

public typealias PdebugExtensionInitialize = PdebugExtensionInitializeFn?

public fun interface PdebugExtensionKnownStructFn {
    public operator fun invoke(flags: UInt, offset: ULong, typename: Pcstr, buffer: Pstr, bufferchars: MutPtr<UInt>): Hresult
}

public typealias PdebugExtensionKnownStruct = PdebugExtensionKnownStructFn?

public fun interface PdebugExtensionKnownStructExFn {
    public operator fun invoke(client: MutPtr<CVoid>, flags: UInt, offset: ULong, typename: Pcstr, buffer: Pstr, bufferchars: MutPtr<UInt>): Hresult
}

public typealias PdebugExtensionKnownStructEx = PdebugExtensionKnownStructExFn?

public fun interface PdebugExtensionNotifyFn {
    public operator fun invoke(notify: UInt, argument: ULong)
}

public typealias PdebugExtensionNotify = PdebugExtensionNotifyFn?

public fun interface PdebugExtensionProvideValueFn {
    public operator fun invoke(client: MutPtr<CVoid>, flags: UInt, name: Pcwstr, value: MutPtr<ULong>, typemodbase: MutPtr<ULong>, typeid: MutPtr<UInt>, typeflags: MutPtr<UInt>): Hresult
}

public typealias PdebugExtensionProvideValue = PdebugExtensionProvideValueFn?

public fun interface PdebugExtensionQueryValueNamesFn {
    public operator fun invoke(client: MutPtr<CVoid>, flags: UInt, buffer: Pwstr, bufferchars: UInt, bufferneeded: MutPtr<UInt>): Hresult
}

public typealias PdebugExtensionQueryValueNames = PdebugExtensionQueryValueNamesFn?

public fun interface PdebugExtensionUninitializeFn {
    public operator fun invoke()
}

public typealias PdebugExtensionUninitialize = PdebugExtensionUninitializeFn?

public fun interface PdebugExtensionUnloadFn {
    public operator fun invoke()
}

public typealias PdebugExtensionUnload = PdebugExtensionUnloadFn?

public fun interface PdebugStackProviderBeginthreadstackreconstructionFn {
    public operator fun invoke(streamtype: UInt, minidumpstreambuffer: ConstPtr<CVoid>, buffersize: UInt): Hresult
}

public typealias PdebugStackProviderBeginthreadstackreconstruction = PdebugStackProviderBeginthreadstackreconstructionFn?

public fun interface PdebugStackProviderEndthreadstackreconstructionFn {
    public operator fun invoke(): Hresult
}

public typealias PdebugStackProviderEndthreadstackreconstruction = PdebugStackProviderEndthreadstackreconstructionFn?

public fun interface PdebugStackProviderFreestacksymframesFn {
    public operator fun invoke(stacksymframes: ConstPtr<StackSymFrameInfo>): Hresult
}

public typealias PdebugStackProviderFreestacksymframes = PdebugStackProviderFreestacksymframesFn?

public fun interface PdebugStackProviderReconstructstackFn {
    public operator fun invoke(systemthreadid: UInt, nativeframes: ConstPtr<DebugStackFrameEx>, countnativeframes: UInt, stacksymframes: MutPtr<MutPtr<StackSymFrameInfo>>, stacksymframesfilled: MutPtr<UInt>): Hresult
}

public typealias PdebugStackProviderReconstructstack = PdebugStackProviderReconstructstackFn?

public fun interface PenumerateHandlesFn {
    public operator fun invoke(client: MutPtr<CVoid>, process: ULong, handletodump: ULong, flags: UInt, callback: KdextDumpHandleCallback, context: ConstPtr<CVoid>): Hresult
}

public typealias PenumerateHandles = PenumerateHandlesFn?

public fun interface PenumerateHashTableFn {
    public operator fun invoke(client: MutPtr<CVoid>, hashtable: ULong, callback: ExtsTableEntryCallback, context: MutPtr<CVoid>): Hresult
}

public typealias PenumerateHashTable = PenumerateHashTableFn?

public fun interface PenumerateJobProcessesFn {
    public operator fun invoke(client: MutPtr<CVoid>, job: ULong, callback: ExtsJobProcessCallback, context: ConstPtr<CVoid>): Hresult
}

public typealias PenumerateJobProcesses = PenumerateJobProcessesFn?

public fun interface PenumerateSystemLocksFn {
    public operator fun invoke(client: MutPtr<CVoid>, flags: UInt, callback: KdextsLockCallbackroutine, context: MutPtr<CVoid>): Hresult
}

public typealias PenumerateSystemLocks = PenumerateSystemLocksFn?

public fun interface PfindFilelockOwnerinfoFn {
    public operator fun invoke(client: MutPtr<CVoid>, pfilelockowner: MutPtr<KdextFilelockOwner>): Hresult
}

public typealias PfindFilelockOwnerinfo = PfindFilelockOwnerinfoFn?

public fun interface PfindMatchingProcessFn {
    public operator fun invoke(client: MutPtr<CVoid>, processinfo: ConstPtr<KdextProcessFindParams>, process: MutPtr<ULong>): Hresult
}

public typealias PfindMatchingProcess = PfindMatchingProcessFn?

public fun interface PfindMatchingThreadFn {
    public operator fun invoke(client: MutPtr<CVoid>, threadinfo: MutPtr<KdextThreadFindParams>): Hresult
}

public typealias PfindMatchingThread = PfindMatchingThreadFn?

public fun interface PgetCpuMicrocodeVersionFn {
    public operator fun invoke(client: MutPtr<CVoid>, pcpumicrocodeversion: MutPtr<DebugCpuMicrocodeVersion>): Hresult
}

public typealias PgetCpuMicrocodeVersion = PgetCpuMicrocodeVersionFn?

public fun interface PgetCpuPspeedInfoFn {
    public operator fun invoke(client: MutPtr<CVoid>, pcpuspeedinfo: MutPtr<DebugCpuSpeedInfo>): Hresult
}

public typealias PgetCpuPspeedInfo = PgetCpuPspeedInfoFn?

public fun interface PgetDeviceObjectInfoFn {
    public operator fun invoke(client: MutPtr<CVoid>, deviceobject: ULong, pdevobjinfo: MutPtr<DebugDeviceObjectInfo>): Hresult
}

public typealias PgetDeviceObjectInfo = PgetDeviceObjectInfoFn?

public fun interface PgetDriverObjectInfoFn {
    public operator fun invoke(client: MutPtr<CVoid>, driverobject: ULong, pdrvobjinfo: MutPtr<DebugDriverObjectInfo>): Hresult
}

public typealias PgetDriverObjectInfo = PgetDriverObjectInfoFn?

public fun interface PgetFullImageNameFn {
    public operator fun invoke(client: MutPtr<CVoid>, process: ULong, fullimagename: MutPtr<Pstr>): Hresult
}

public typealias PgetFullImageName = PgetFullImageNameFn?

public fun interface PgetIrpInfoFn {
    public operator fun invoke(client: MutPtr<CVoid>, irp: ULong, irpinfo: MutPtr<DebugIrpInfo>): Hresult
}

public typealias PgetIrpInfo = PgetIrpInfoFn?

public fun interface PgetPnpTriageInfoFn {
    public operator fun invoke(client: MutPtr<CVoid>, ppnptriageinfo: MutPtr<DebugPnpTriageInfo>): Hresult
}

public typealias PgetPnpTriageInfo = PgetPnpTriageInfoFn?

public fun interface PgetPoolDataFn {
    public operator fun invoke(client: MutPtr<CVoid>, pool: ULong, pooldata: MutPtr<DebugPoolData>): Hresult
}

public typealias PgetPoolData = PgetPoolDataFn?

public fun interface PgetPoolRegionFn {
    public operator fun invoke(client: MutPtr<CVoid>, pool: ULong, poolregion: MutPtr<DebugPoolRegion>): Hresult
}

public typealias PgetPoolRegion = PgetPoolRegionFn?

public fun interface PgetPoolTagDescriptionFn {
    public operator fun invoke(pooltag: UInt, pdescription: MutPtr<DebugPooltagDescription>): Hresult
}

public typealias PgetPoolTagDescription = PgetPoolTagDescriptionFn?

public fun interface PgetProcessCommitFn {
    public operator fun invoke(client: MutPtr<CVoid>, totalcommitcharge: MutPtr<ULong>, numberofprocesses: MutPtr<UInt>, commitdata: MutPtr<MutPtr<ProcessCommitUsage>>): Hresult
}

public typealias PgetProcessCommit = PgetProcessCommitFn?

public fun interface PgetSmbiosInfoFn {
    public operator fun invoke(client: MutPtr<CVoid>, psmbiosinfo: MutPtr<DebugSmbiosInfo>): Hresult
}

public typealias PgetSmbiosInfo = PgetSmbiosInfoFn?

public fun interface PkdextsGetPteInfoFn {
    public operator fun invoke(client: MutPtr<CVoid>, virtual: ULong, pteinfo: MutPtr<KdextsPteInfo>): Hresult
}

public typealias PkdextsGetPteInfo = PkdextsGetPteInfoFn?

public fun interface PsymDumpFieldCallbackFn {
    public operator fun invoke(pfield: MutPtr<FieldInfo>, usercontext: MutPtr<CVoid>): UInt
}

public typealias PsymDumpFieldCallback = PsymDumpFieldCallbackFn?

public fun interface PwindbgCheckControlCFn {
    public operator fun invoke(): UInt
}

public typealias PwindbgCheckControlC = PwindbgCheckControlCFn?

public fun interface PwindbgCheckVersionFn {
    public operator fun invoke(): UInt
}

public typealias PwindbgCheckVersion = PwindbgCheckVersionFn?

public fun interface PwindbgDisasmFn {
    public operator fun invoke(lpoffset: MutPtr<ULong>, lpbuffer: Pcstr, fshoweffectiveaddress: UInt): UInt
}

public typealias PwindbgDisasm = PwindbgDisasmFn?

public fun interface PwindbgDisasm32Fn {
    public operator fun invoke(lpoffset: MutPtr<UInt>, lpbuffer: Pcstr, fshoweffectiveaddress: UInt): UInt
}

public typealias PwindbgDisasm32 = PwindbgDisasm32Fn?

public fun interface PwindbgDisasm64Fn {
    public operator fun invoke(lpoffset: MutPtr<ULong>, lpbuffer: Pcstr, fshoweffectiveaddress: UInt): UInt
}

public typealias PwindbgDisasm64 = PwindbgDisasm64Fn?

public fun interface PwindbgExtensionApiVersionFn {
    public operator fun invoke(): MutPtr<ExtApiVersion>
}

public typealias PwindbgExtensionApiVersion = PwindbgExtensionApiVersionFn?

public fun interface PwindbgExtensionDllInitFn {
    public operator fun invoke(lpextensionapis: MutPtr<WindbgExtensionApis>, majorversion: UShort, minorversion: UShort)
}

public typealias PwindbgExtensionDllInit = PwindbgExtensionDllInitFn?

public fun interface PwindbgExtensionDllInit32Fn {
    public operator fun invoke(lpextensionapis: MutPtr<WindbgExtensionApis32>, majorversion: UShort, minorversion: UShort)
}

public typealias PwindbgExtensionDllInit32 = PwindbgExtensionDllInit32Fn?

public fun interface PwindbgExtensionDllInit64Fn {
    public operator fun invoke(lpextensionapis: MutPtr<WindbgExtensionApis64>, majorversion: UShort, minorversion: UShort)
}

public typealias PwindbgExtensionDllInit64 = PwindbgExtensionDllInit64Fn?

public fun interface PwindbgExtensionRoutineFn {
    public operator fun invoke(hcurrentprocess: Handle, hcurrentthread: Handle, dwcurrentpc: UInt, dwprocessor: UInt, lpargumentstring: Pcstr)
}

public typealias PwindbgExtensionRoutine = PwindbgExtensionRoutineFn?

public fun interface PwindbgExtensionRoutine32Fn {
    public operator fun invoke(hcurrentprocess: Handle, hcurrentthread: Handle, dwcurrentpc: UInt, dwprocessor: UInt, lpargumentstring: Pcstr)
}

public typealias PwindbgExtensionRoutine32 = PwindbgExtensionRoutine32Fn?

public fun interface PwindbgExtensionRoutine64Fn {
    public operator fun invoke(hcurrentprocess: Handle, hcurrentthread: Handle, dwcurrentpc: ULong, dwprocessor: UInt, lpargumentstring: Pcstr)
}

public typealias PwindbgExtensionRoutine64 = PwindbgExtensionRoutine64Fn?

public fun interface PwindbgGetExpressionFn {
    public operator fun invoke(lpexpression: Pcstr): ULong
}

public typealias PwindbgGetExpression = PwindbgGetExpressionFn?

public fun interface PwindbgGetExpression32Fn {
    public operator fun invoke(lpexpression: Pcstr): UInt
}

public typealias PwindbgGetExpression32 = PwindbgGetExpression32Fn?

public fun interface PwindbgGetExpression64Fn {
    public operator fun invoke(lpexpression: Pcstr): ULong
}

public typealias PwindbgGetExpression64 = PwindbgGetExpression64Fn?

public fun interface PwindbgGetSymbolFn {
    public operator fun invoke(offset: MutPtr<CVoid>, pchbuffer: Pcstr, pdisplacement: MutPtr<ULong>)
}

public typealias PwindbgGetSymbol = PwindbgGetSymbolFn?

public fun interface PwindbgGetSymbol32Fn {
    public operator fun invoke(offset: UInt, pchbuffer: Pcstr, pdisplacement: MutPtr<UInt>)
}

public typealias PwindbgGetSymbol32 = PwindbgGetSymbol32Fn?

public fun interface PwindbgGetSymbol64Fn {
    public operator fun invoke(offset: ULong, pchbuffer: Pcstr, pdisplacement: MutPtr<ULong>)
}

public typealias PwindbgGetSymbol64 = PwindbgGetSymbol64Fn?

public fun interface PwindbgGetThreadContextRoutineFn {
    public operator fun invoke(processor: UInt, lpcontext: MutPtr<Context>, cbsizeofcontext: UInt): UInt
}

public typealias PwindbgGetThreadContextRoutine = PwindbgGetThreadContextRoutineFn?

public fun interface PwindbgIoctlRoutineFn {
    public operator fun invoke(ioctltype: UShort, lpvdata: MutPtr<CVoid>, cbsize: UInt): UInt
}

public typealias PwindbgIoctlRoutine = PwindbgIoctlRoutineFn?

public fun interface PwindbgOldkdExtensionRoutineFn {
    public operator fun invoke(dwcurrentpc: UInt, lpextensionapis: MutPtr<WindbgOldkdExtensionApis>, lpargumentstring: Pcstr)
}

public typealias PwindbgOldkdExtensionRoutine = PwindbgOldkdExtensionRoutineFn?

public fun interface PwindbgOldkdReadPhysicalMemoryFn {
    public operator fun invoke(address: ULong, buffer: MutPtr<CVoid>, count: UInt, bytesread: MutPtr<UInt>): UInt
}

public typealias PwindbgOldkdReadPhysicalMemory = PwindbgOldkdReadPhysicalMemoryFn?

public fun interface PwindbgOldkdWritePhysicalMemoryFn {
    public operator fun invoke(address: ULong, buffer: MutPtr<CVoid>, length: UInt, byteswritten: MutPtr<UInt>): UInt
}

public typealias PwindbgOldkdWritePhysicalMemory = PwindbgOldkdWritePhysicalMemoryFn?

public fun interface PwindbgOldExtensionRoutineFn {
    public operator fun invoke(dwcurrentpc: UInt, lpextensionapis: MutPtr<WindbgExtensionApis>, lpargumentstring: Pcstr)
}

public typealias PwindbgOldExtensionRoutine = PwindbgOldExtensionRoutineFn?

public fun interface PwindbgOutputRoutineFn {
    public operator fun invoke(lpformat: Pcstr)
}

public typealias PwindbgOutputRoutine = PwindbgOutputRoutineFn?

public fun interface PwindbgReadProcessMemoryRoutineFn {
    public operator fun invoke(offset: ULong, lpbuffer: MutPtr<CVoid>, cb: UInt, lpcbbytesread: MutPtr<UInt>): UInt
}

public typealias PwindbgReadProcessMemoryRoutine = PwindbgReadProcessMemoryRoutineFn?

public fun interface PwindbgReadProcessMemoryRoutine32Fn {
    public operator fun invoke(offset: UInt, lpbuffer: MutPtr<CVoid>, cb: UInt, lpcbbytesread: MutPtr<UInt>): UInt
}

public typealias PwindbgReadProcessMemoryRoutine32 = PwindbgReadProcessMemoryRoutine32Fn?

public fun interface PwindbgReadProcessMemoryRoutine64Fn {
    public operator fun invoke(offset: ULong, lpbuffer: MutPtr<CVoid>, cb: UInt, lpcbbytesread: MutPtr<UInt>): UInt
}

public typealias PwindbgReadProcessMemoryRoutine64 = PwindbgReadProcessMemoryRoutine64Fn?

public fun interface PwindbgSetThreadContextRoutineFn {
    public operator fun invoke(processor: UInt, lpcontext: MutPtr<Context>, cbsizeofcontext: UInt): UInt
}

public typealias PwindbgSetThreadContextRoutine = PwindbgSetThreadContextRoutineFn?

public fun interface PwindbgStacktraceRoutineFn {
    public operator fun invoke(framepointer: UInt, stackpointer: UInt, programcounter: UInt, stackframes: MutPtr<Extstacktrace>, frames: UInt): UInt
}

public typealias PwindbgStacktraceRoutine = PwindbgStacktraceRoutineFn?

public fun interface PwindbgStacktraceRoutine32Fn {
    public operator fun invoke(framepointer: UInt, stackpointer: UInt, programcounter: UInt, stackframes: MutPtr<Extstacktrace32>, frames: UInt): UInt
}

public typealias PwindbgStacktraceRoutine32 = PwindbgStacktraceRoutine32Fn?

public fun interface PwindbgStacktraceRoutine64Fn {
    public operator fun invoke(framepointer: ULong, stackpointer: ULong, programcounter: ULong, stackframes: MutPtr<Extstacktrace64>, frames: UInt): UInt
}

public typealias PwindbgStacktraceRoutine64 = PwindbgStacktraceRoutine64Fn?

public fun interface PwindbgWriteProcessMemoryRoutineFn {
    public operator fun invoke(offset: ULong, lpbuffer: ConstPtr<CVoid>, cb: UInt, lpcbbyteswritten: MutPtr<UInt>): UInt
}

public typealias PwindbgWriteProcessMemoryRoutine = PwindbgWriteProcessMemoryRoutineFn?

public fun interface PwindbgWriteProcessMemoryRoutine32Fn {
    public operator fun invoke(offset: UInt, lpbuffer: ConstPtr<CVoid>, cb: UInt, lpcbbyteswritten: MutPtr<UInt>): UInt
}

public typealias PwindbgWriteProcessMemoryRoutine32 = PwindbgWriteProcessMemoryRoutine32Fn?

public fun interface PwindbgWriteProcessMemoryRoutine64Fn {
    public operator fun invoke(offset: ULong, lpbuffer: ConstPtr<CVoid>, cb: UInt, lpcbbyteswritten: MutPtr<UInt>): UInt
}

public typealias PwindbgWriteProcessMemoryRoutine64 = PwindbgWriteProcessMemoryRoutine64Fn?

public typealias PointerKind = Int

public typealias PreferredFormat = Int

public typealias RawSearchFlags = Int

public typealias ScriptChangeKind = Int

public typealias ScriptDebugEvent = Int

public typealias ScriptDebugEventFilter = Int

public typealias ScriptDebugState = Int

public typealias ScriptExecutionKind = Int

public typealias SignatureComparison = Int

public typealias SymbolKind = Int

public typealias SymbolSearchOptions = Int

public typealias TanalyzeReturn = Int

public typealias TypeKind = Int

public typealias VarArgsKind = Int

public fun interface FnDebugFailureAnalysisCreateInstanceFn {
    public operator fun invoke(client: MutPtr<CVoid>, args: Pcwstr, flags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias FnDebugFailureAnalysisCreateInstance = FnDebugFailureAnalysisCreateInstanceFn?
