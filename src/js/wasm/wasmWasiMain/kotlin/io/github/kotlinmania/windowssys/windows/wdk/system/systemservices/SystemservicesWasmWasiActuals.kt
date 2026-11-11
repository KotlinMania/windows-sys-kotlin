@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverCancel
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverControl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverNotificationCallbackRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverReinitialize
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PaffinityToken
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PcallbackObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pejob
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PexRundownRefCacheAware
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PexTimer
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PfreeFunction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PioCompletionRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PioWorkitem
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PkdeferredRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkinterrupt
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkthread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PobjectType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pohandle
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwBuffer
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwInstance
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwRegistration
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PsiloMonitor
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SeAdtParameterType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsContextMode
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsIostatsClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsMgmtPolicyType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsLogInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsLsn
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.BugcheckError
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceState
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceType
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EventInfoClass
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.Reghandle
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SuiteType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerInformationLevel
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerRequestType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.FirmwareType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.LogicalProcessorRelationship
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.RtlSystemGlobalDataId
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.EnlistmentInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KtmobjectType
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ResourcemanagerInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionmanagerInformationClass

public actual fun clfsAddLogContainer(plfolog: COpaquePointer?, pcbcontainer: COpaquePointer?, puszcontainerpath: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsAddLogContainerSet(plfolog: COpaquePointer?, ccontainers: UShort, pcbcontainer: COpaquePointer?, rguszcontainerpath: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsAdvanceLogBase(pvmarshalcontext: COpaquePointer?, plsnbase: COpaquePointer?, fflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsAlignReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, rgcbreservation: COpaquePointer?, pcbalignreservation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsAllocReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, pcbadjustment: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsCloseAndResetLogFile(plfolog: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsCloseLogFileObject(plfolog: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsCreateLogFile(pplfolog: COpaquePointer?, puszlogfilename: COpaquePointer?, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: COpaquePointer?, cbcontext: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsCreateMarshallingArea(plfolog: COpaquePointer?, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsCreateMarshallingAreaEx(plfolog: COpaquePointer?, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsCreateScanContext(plfolog: COpaquePointer?, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsDeleteLogByPointer(plfolog: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsDeleteLogFile(puszlogfilename: COpaquePointer?, pvreserved: COpaquePointer?, flogoptionflag: UInt, pvcontext: COpaquePointer?, cbcontext: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsDeleteMarshallingArea(pvmarshalcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsEarlierLsn(plsn: COpaquePointer?): ClsLsn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsFinalize() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun clfsFlushBuffers(pvmarshalcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsFlushToLsn(pvmarshalcontext: COpaquePointer?, plsnflush: COpaquePointer?, plsnlastflushed: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsFreeReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, pcbadjustment: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsGetContainerName(plfolog: COpaquePointer?, cidlogicalcontainer: UInt, puszcontainername: COpaquePointer?, pcactuallencontainername: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsGetIoStatistics(plfolog: COpaquePointer?, pvstatsbuffer: COpaquePointer?, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsGetLogFileInformation(plfolog: COpaquePointer?, pinfobuffer: COpaquePointer?, pcbinfobuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsInitialize(): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLaterLsn(plsn: COpaquePointer?): ClsLsn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLsnBlockOffset(plsn: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLsnContainer(plsn: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLsnDifference(plsnstart: COpaquePointer?, plsnfinish: COpaquePointer?, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLsnEqual(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLsnGreater(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLsnInvalid(plsn: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLsnLess(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLsnNull(plsn: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsLsnRecordSequence(plsn: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsMgmtDeregisterManagedClient(clientcookie: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsMgmtHandleLogFileFull(client: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsMgmtInstallPolicy(logfile: COpaquePointer?, policy: COpaquePointer?, policylength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsMgmtQueryPolicy(logfile: COpaquePointer?, policytype: ClfsMgmtPolicyType, policy: COpaquePointer?, policylength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsMgmtRegisterManagedClient(logfile: COpaquePointer?, registrationdata: COpaquePointer?, clientcookie: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsMgmtRemovePolicy(logfile: COpaquePointer?, policytype: ClfsMgmtPolicyType): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsMgmtSetLogFileSize(logfile: COpaquePointer?, newsizeincontainers: COpaquePointer?, resultingsizeincontainers: COpaquePointer?, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsMgmtSetLogFileSizeAsClient(logfile: COpaquePointer?, clientcookie: COpaquePointer?, newsizeincontainers: COpaquePointer?, resultingsizeincontainers: COpaquePointer?, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsMgmtTailAdvanceFailure(client: COpaquePointer?, reason: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsQueryLogFileInformation(plfolog: COpaquePointer?, einformationclass: ClsLogInformationClass, pinfoinputbuffer: COpaquePointer?, cbinfoinputbuffer: UInt, pinfobuffer: COpaquePointer?, pcbinfobuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsReadLogRecord(pvmarshalcontext: COpaquePointer?, plsnfirst: COpaquePointer?, pecontextmode: ClfsContextMode, ppvreadbuffer: COpaquePointer?, pcbreadbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, ppvreadcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsReadNextLogRecord(pvreadcontext: COpaquePointer?, ppvbuffer: COpaquePointer?, pcbbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnuser: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, plsnrecord: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsReadPreviousRestartArea(pvreadcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsnrestart: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsReadRestartArea(pvmarshalcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsn: COpaquePointer?, ppvreadcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsRemoveLogContainer(plfolog: COpaquePointer?, puszcontainerpath: COpaquePointer?, fforce: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsRemoveLogContainerSet(plfolog: COpaquePointer?, ccontainers: UShort, rgwszcontainerpath: COpaquePointer?, fforce: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsReserveAndAppendLog(pvmarshalcontext: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: UInt, plsn: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsReserveAndAppendLogAligned(pvmarshalcontext: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: UInt, plsn: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsScanLogContainers(pcxscan: COpaquePointer?, escanmode: UByte): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsSetArchiveTail(plfolog: COpaquePointer?, plsnarchivetail: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsSetEndOfLog(plfolog: COpaquePointer?, plsnend: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsSetLogFileInformation(plfolog: COpaquePointer?, einformationclass: ClsLogInformationClass, pinfobuffer: COpaquePointer?, cbbuffer: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsTerminateReadLog(pvcursorcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clfsWriteRestartArea(pvmarshalcontext: COpaquePointer?, pvrestartbuffer: COpaquePointer?, cbrestartbuffer: UInt, plsnbase: COpaquePointer?, fflags: UInt, pcbwritten: COpaquePointer?, plsnnext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmCallbackGetKeyObjectID(cookie: COpaquePointer?, obj: COpaquePointer?, objectid: COpaquePointer?, objectname: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmCallbackGetKeyObjectIDEx(cookie: COpaquePointer?, obj: COpaquePointer?, objectid: COpaquePointer?, objectname: COpaquePointer?, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmCallbackReleaseKeyObjectIDEx(objectname: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun cmGetBoundTransaction(cookie: COpaquePointer?, obj: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetCallbackVersion(major: COpaquePointer?, minor: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun cmRegisterCallback(function: PexCallbackFunction, context: COpaquePointer?, cookie: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: COpaquePointer?, driver: COpaquePointer?, context: COpaquePointer?, cookie: COpaquePointer?, reserved: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetCallbackObjectContext(obj: COpaquePointer?, cookie: COpaquePointer?, newcontext: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmUnRegisterCallback(cookie: Long): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbgBreakPointWithStatus(status: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun etwActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun etwRegister(providerid: COpaquePointer?, enablecallback: Petwenablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun etwUnregister(reghandle: Reghandle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun etwWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun etwWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: COpaquePointer?, string: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireFastMutex(fastmutex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exAcquireFastMutexUnsafe(fastmutex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exAcquirePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exAcquirePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exAcquireResourceExclusiveLite(resource: COpaquePointer?, wait: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireResourceSharedLite(resource: COpaquePointer?, wait: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireRundownProtection(runref: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireRundownProtectionEx(runref: COpaquePointer?, count: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireSharedStarveExclusive(resource: COpaquePointer?, wait: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireSharedWaitForExclusive(resource: COpaquePointer?, wait: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireSpinLockExclusive(spinlock: COpaquePointer?): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exAcquireSpinLockShared(spinlock: COpaquePointer?): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAcquireSpinLockSharedAtDpcLevel(spinlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: COpaquePointer?, extendedparameterscount: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exAllocateTimer(callback: PextCallback, callbackcontext: COpaquePointer?, attributes: UInt): PexTimer =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exCancelTimer(timer: PexTimer, parameters: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exConvertExclusiveToSharedLite(resource: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exCreateCallback(callbackobject: COpaquePointer?, objectattributes: COpaquePointer?, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exCreatePool(flags: UInt, tag: ULong, params: COpaquePointer?, poolhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exDeleteResourceLite(resource: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exDestroyPool(poolhandle: Handle) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exEnterCriticalRegionAndAcquireResourceShared(resource: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exExtendZone(zone: COpaquePointer?, segment: COpaquePointer?, segmentsize: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exFreePool(p: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exFreePool2(p: COpaquePointer?, tag: UInt, extendedparameters: COpaquePointer?, extendedparameterscount: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exFreePoolWithTag(p: COpaquePointer?, tag: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exGetExclusiveWaiterCount(resource: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exGetFirmwareEnvironmentVariable(variablename: COpaquePointer?, vendorguid: COpaquePointer?, value: COpaquePointer?, valuelength: COpaquePointer?, attributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exGetFirmwareType(): FirmwareType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exGetPreviousMode(): Byte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exGetSharedWaiterCount(resource: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exInitializePushLock(pushlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exInitializeResourceLite(resource: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exInitializeRundownProtection(runref: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exInitializeZone(zone: COpaquePointer?, blocksize: UInt, initialsegment: COpaquePointer?, initialsegmentsize: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exInterlockedAddLargeInteger(addend: COpaquePointer?, increment: Long, lock: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exInterlockedExtendZone(zone: COpaquePointer?, segment: COpaquePointer?, segmentsize: UInt, lock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exIsManufacturingModeEnabled(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exIsResourceAcquiredExclusiveLite(resource: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exIsResourceAcquiredSharedLite(resource: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exIsSoftBoot(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exLocalTimeToSystemTime(localtime: COpaquePointer?, systemtime: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exNotifyCallback(callbackobject: COpaquePointer?, argument1: COpaquePointer?, argument2: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exQueueWorkItem(workitem: COpaquePointer?, queuetype: WorkQueueType) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exRaiseAccessViolation() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exRaiseDatatypeMisalignment() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exRaiseStatus(status: Ntstatus) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReInitializeRundownProtection(runref: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exReinitializeResourceLite(resource: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exReleaseFastMutex(fastmutex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseFastMutexUnsafe(fastmutex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleasePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleasePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseResourceAndLeaveCriticalRegion(resource: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseResourceForThreadLite(resource: COpaquePointer?, resourcethreadid: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseResourceLite(resource: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseRundownProtection(runref: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseRundownProtectionEx(runref: COpaquePointer?, count: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseSpinLockExclusive(spinlock: COpaquePointer?, oldirql: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseSpinLockShared(spinlock: COpaquePointer?, oldirql: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exReleaseSpinLockSharedFromDpcLevel(spinlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exRundownCompleted(runref: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: COpaquePointer?, cookie: ULong, offset: ULong, size: ULong, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: COpaquePointer?, cookie: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exSetFirmwareEnvironmentVariable(variablename: COpaquePointer?, vendorguid: COpaquePointer?, value: COpaquePointer?, valuelength: UInt, attributes: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exSetResourceOwnerPointer(resource: COpaquePointer?, ownerpointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exSetResourceOwnerPointerEx(resource: COpaquePointer?, ownerpointer: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exSizeOfRundownProtectionCacheAware(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exSystemTimeToLocalTime(systemtime: COpaquePointer?, localtime: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exTryConvertSharedSpinLockExclusive(spinlock: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exTryToAcquireFastMutex(fastmutex: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exUnregisterCallback(callbackregistration: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exUuidCreate(uuid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exVerifySuite(suitetype: SuiteType): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exWaitForRundownProtectionRelease(runref: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun halAllocateAdapterChannel(adapterobject: COpaquePointer?, wcb: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halAllocateCommonBuffer(adapterobject: COpaquePointer?, length: UInt, logicaladdress: COpaquePointer?, cacheenabled: Boolean): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halAllocateCrashDumpRegisters(adapterobject: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halAllocateHardwareCounters(groupaffinty: COpaquePointer?, groupcount: UInt, resourcelist: COpaquePointer?, countersethandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halAssignSlotResources(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halBugCheckSystem(errorsource: COpaquePointer?, errorrecord: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun halDmaAllocateCrashDumpRegistersEx(adapter: COpaquePointer?, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: COpaquePointer?, mapregistersavailable: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halDmaFreeCrashDumpRegistersEx(adapter: COpaquePointer?, type: HalDmaCrashDumpRegisterType): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halExamineMBR(deviceobject: COpaquePointer?, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun halFreeCommonBuffer(adapterobject: COpaquePointer?, length: UInt, logicaladdress: Long, virtualaddress: COpaquePointer?, cacheenabled: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halGetAdapter(devicedescription: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, length: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: COpaquePointer?, affinity: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halMakeBeep(frequency: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halReadDmaCounter(adapterobject: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, length: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAcquireCancelSpinLock(irql: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioAcquireKsrPersistentMemory(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, buffer: COpaquePointer?, size: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAcquireKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, buffer: COpaquePointer?, size: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAcquireRemoveLockEx(removelock: COpaquePointer?, tag: COpaquePointer?, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAllocateAdapterChannel(adapterobject: COpaquePointer?, deviceobject: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAllocateController(controllerobject: COpaquePointer?, deviceobject: COpaquePointer?, executionroutine: DriverControl, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioAllocateDriverObjectExtension(driverobject: COpaquePointer?, clientidentificationaddress: COpaquePointer?, driverobjectextensionsize: UInt, driverobjectextension: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAllocateErrorLogEntry(ioobject: COpaquePointer?, entrysize: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAllocateIrpEx(deviceobject: COpaquePointer?, stacksize: Byte, chargequota: Boolean): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAllocateMdl(virtualaddress: COpaquePointer?, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAllocateSfioStreamIdentifier(fileobject: COpaquePointer?, length: UInt, signature: COpaquePointer?, streamidentifier: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAllocateWorkItem(deviceobject: COpaquePointer?): PioWorkitem =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAssignResources(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, requestedresources: COpaquePointer?, allocatedresources: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAttachDevice(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?, attacheddevice: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAttachDeviceByPointer(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAttachDeviceToDeviceStack(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAttachDeviceToDeviceStackSafe(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?, attachedtodeviceobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt, startingoffset: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: COpaquePointer?, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioBuildPartialMdl(sourcemdl: COpaquePointer?, targetmdl: COpaquePointer?, virtualaddress: COpaquePointer?, length: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCancelFileOpen(deviceobject: COpaquePointer?, fileobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioCancelIrp(irp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, update: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, update: Boolean, writepermission: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCleanupIrp(irp: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioClearActivityIdThread(originalid: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioClearIrpExtraCreateParameter(irp: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioConnectInterrupt(interruptobject: COpaquePointer?, serviceroutine: PkserviceRoutine, servicecontext: COpaquePointer?, spinlock: COpaquePointer?, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioConnectInterruptEx(parameters: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateController(size: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateDevice(driverobject: COpaquePointer?, deviceextensionsize: UInt, devicename: COpaquePointer?, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateDisk(deviceobject: COpaquePointer?, disk: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateFileEx(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt, drivercontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateFileSpecifyDeviceObjectHint(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt, deviceobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateNotificationEvent(eventname: COpaquePointer?, eventhandle: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateSymbolicLink(symboliclinkname: COpaquePointer?, devicename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateSynchronizationEvent(eventname: COpaquePointer?, eventhandle: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateSystemThread(ioobject: COpaquePointer?, threadhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, processhandle: Handle, clientid: COpaquePointer?, startroutine: PkstartRoutine, startcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateUnprotectedSymbolicLink(symboliclinkname: COpaquePointer?, devicename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCsqInitialize(csq: COpaquePointer?, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCsqInitializeEx(csq: COpaquePointer?, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCsqInsertIrp(csq: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioCsqInsertIrpEx(csq: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCsqRemoveIrp(csq: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCsqRemoveNextIrp(csq: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioDecrementKeepAliveCount(fileobject: COpaquePointer?, process: Peprocess): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioDeleteController(controllerobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioDeleteDevice(deviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioDeleteSymbolicLink(symboliclinkname: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioDetachDevice(targetdevice: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioDisconnectInterrupt(interruptobject: Pkinterrupt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioDisconnectInterruptEx(parameters: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioEnumerateKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioFlushAdapterBuffers(adapterobject: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: UInt, writetodevice: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioForwardIrpSynchronously(deviceobject: COpaquePointer?, irp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioFreeAdapterChannel(adapterobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioFreeController(controllerobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioFreeErrorLogEntry(elentry: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioFreeIrp(irp: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioFreeKsrPersistentMemory(datahandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioFreeMapRegisters(adapterobject: COpaquePointer?, mapregisterbase: COpaquePointer?, numberofmapregisters: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioFreeMdl(mdl: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioFreeSfioStreamIdentifier(fileobject: COpaquePointer?, signature: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioFreeWorkItem(ioworkitem: PioWorkitem) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioGetActivityIdIrp(irp: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetActivityIdThread(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetAttachedDeviceReference(deviceobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetBootDiskInformation(bootdiskinformation: COpaquePointer?, size: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetBootDiskInformationLite(bootdiskinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetConfigurationInformation(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetCurrentProcess(): Peprocess =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDeviceDirectory(physicaldeviceobject: COpaquePointer?, directorytype: DeviceDirectoryType, flags: UInt, reserved: COpaquePointer?, devicedirectoryhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDeviceInterfaceAlias(symboliclinkname: COpaquePointer?, aliasinterfaceclassguid: COpaquePointer?, aliassymboliclinkname: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDeviceInterfacePropertyData(symboliclinkname: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, size: UInt, data: COpaquePointer?, requiredsize: COpaquePointer?, type: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDeviceInterfaces(interfaceclassguid: COpaquePointer?, physicaldeviceobject: COpaquePointer?, flags: UInt, symboliclinklist: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDeviceNumaNode(pdo: COpaquePointer?, nodenumber: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDeviceObjectPointer(objectname: COpaquePointer?, desiredaccess: UInt, fileobject: COpaquePointer?, deviceobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDeviceProperty(deviceobject: COpaquePointer?, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: COpaquePointer?, resultlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDevicePropertyData(pdo: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, size: UInt, data: COpaquePointer?, requiredsize: COpaquePointer?, type: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDmaAdapter(physicaldeviceobject: COpaquePointer?, devicedescription: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDriverDirectory(driverobject: COpaquePointer?, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDriverObjectExtension(driverobject: COpaquePointer?, clientidentificationaddress: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetFileObjectGenericMapping(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetFsZeroingOffset(irp: COpaquePointer?, zeroingoffset: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetInitialStack(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetInitiatorProcess(fileobject: COpaquePointer?): Peprocess =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetIoAttributionHandle(irp: COpaquePointer?, ioattributionhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetIoPriorityHint(irp: COpaquePointer?): IoPriorityHint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetIommuInterface(version: UInt, interfaceout: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetIrpExtraCreateParameter(irp: COpaquePointer?, extracreateparameter: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetPagingIoPriority(irp: COpaquePointer?): IoPagingPriority =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetRelatedDeviceObject(fileobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetSfioStreamIdentifier(fileobject: COpaquePointer?, signature: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetSilo(fileobject: COpaquePointer?): Pesilo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetSiloParameters(fileobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetStackLimits(lowlimit: COpaquePointer?, highlimit: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioGetTopLevelIrp(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetTransactionParameterBlock(fileobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioIncrementKeepAliveCount(fileobject: COpaquePointer?, process: Peprocess): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioInitializeIrp(irp: COpaquePointer?, packetsize: UShort, stacksize: Byte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioInitializeIrpEx(irp: COpaquePointer?, deviceobject: COpaquePointer?, packetsize: UShort, stacksize: Byte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioInitializeRemoveLockEx(lock: COpaquePointer?, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioInitializeTimer(deviceobject: COpaquePointer?, timerroutine: PioTimerRoutine, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioInitializeWorkItem(ioobject: COpaquePointer?, ioworkitem: PioWorkitem) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioInvalidateDeviceRelations(deviceobject: COpaquePointer?, type: DeviceRelationType) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioInvalidateDeviceState(physicaldeviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioIs32bitProcess(irp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioIsFileObjectIgnoringSharing(fileobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioIsFileOriginRemote(fileobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioIsInitiator32bitProcess(irp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioIsValidIrpStatus(status: Ntstatus): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioMakeAssociatedIrp(irp: COpaquePointer?, stacksize: Byte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioMakeAssociatedIrpEx(irp: COpaquePointer?, deviceobject: COpaquePointer?, stacksize: Byte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioMapTransfer(adapterobject: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: COpaquePointer?, writetodevice: Boolean): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: COpaquePointer?, desiredaccess: UInt, deviceinterfaceregkey: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioOpenDeviceRegistryKey(deviceobject: COpaquePointer?, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioOpenDriverRegistryKey(driverobject: COpaquePointer?, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioPropagateActivityIdToThread(irp: COpaquePointer?, propagatedid: COpaquePointer?, originalid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioQueryDeviceDescription(bustype: COpaquePointer?, busnumber: COpaquePointer?, controllertype: COpaquePointer?, controllernumber: COpaquePointer?, peripheraltype: COpaquePointer?, peripheralnumber: COpaquePointer?, calloutroutine: PioQueryDeviceRoutine, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioQueryFullDriverPath(driverobject: COpaquePointer?, fullpath: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioQueryKsrPersistentMemorySize(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioQueryKsrPersistentMemorySizeEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioRaiseHardError(irp: COpaquePointer?, vpb: COpaquePointer?, realdeviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: COpaquePointer?, thread: Pkthread): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReadDiskSignature(deviceobject: COpaquePointer?, bytespersector: UInt, signature: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReadPartitionTable(deviceobject: COpaquePointer?, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReadPartitionTableEx(deviceobject: COpaquePointer?, drivelayout: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRecordIoAttribution(opaquehandle: COpaquePointer?, attributioninformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRegisterBootDriverReinitialization(driverobject: COpaquePointer?, driverreinitializationroutine: DriverReinitialize, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: COpaquePointer?, notificationinformationlength: UInt, callbackregistration: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRegisterDeviceInterface(physicaldeviceobject: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: COpaquePointer?, symboliclinkname: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRegisterDriverReinitialization(driverobject: COpaquePointer?, driverreinitializationroutine: DriverReinitialize, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioRegisterLastChanceShutdownNotification(deviceobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: COpaquePointer?, driverobject: COpaquePointer?, callbackroutine: DriverNotificationCallbackRoutine, context: COpaquePointer?, notificationentry: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRegisterShutdownNotification(deviceobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReleaseCancelSpinLock(irql: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioReleaseRemoveLockAndWaitEx(removelock: COpaquePointer?, tag: COpaquePointer?, remlocksize: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioReleaseRemoveLockEx(removelock: COpaquePointer?, tag: COpaquePointer?, remlocksize: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioRemoveLinkShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioRemoveLinkShareAccessEx(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioRemoveShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioReplacePartitionUnit(targetpdo: COpaquePointer?, sparepdo: COpaquePointer?, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReportDetectedDevice(driverobject: COpaquePointer?, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: COpaquePointer?, resourcerequirements: COpaquePointer?, resourceassigned: Boolean, deviceobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReportInterruptActive(parameters: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioReportInterruptInactive(parameters: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioReportResourceForDetection(driverobject: COpaquePointer?, driverlist: COpaquePointer?, driverlistsize: UInt, deviceobject: COpaquePointer?, devicelist: COpaquePointer?, devicelistsize: UInt, conflictdetected: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReportResourceUsage(driverclassname: COpaquePointer?, driverobject: COpaquePointer?, driverlist: COpaquePointer?, driverlistsize: UInt, deviceobject: COpaquePointer?, devicelist: COpaquePointer?, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReportRootDevice(driverobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReportTargetDeviceChange(physicaldeviceobject: COpaquePointer?, notificationstructure: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: COpaquePointer?, notificationstructure: COpaquePointer?, callback: PdeviceChangeCompleteCallback, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRequestDeviceEject(physicaldeviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioRequestDeviceEjectEx(physicaldeviceobject: COpaquePointer?, callback: PioDeviceEjectCallback, context: COpaquePointer?, driverobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReserveKsrPersistentMemory(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, size: ULong, flags: UInt, datahandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReserveKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: UInt, size: ULong, flags: UInt, datahandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReuseIrp(irp: COpaquePointer?, iostatus: Ntstatus) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioSetActivityIdIrp(irp: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetActivityIdThread(activityid: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetCompletionRoutineEx(deviceobject: COpaquePointer?, irp: COpaquePointer?, completionroutine: PioCompletionRoutine, context: COpaquePointer?, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetDeviceInterfacePropertyData(symboliclinkname: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetDeviceInterfaceState(symboliclinkname: COpaquePointer?, enable: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetDevicePropertyData(pdo: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetFileObjectIgnoreSharing(fileobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetFileOrigin(fileobject: COpaquePointer?, remote: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetFsZeroingOffset(irp: COpaquePointer?, zeroingoffset: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetFsZeroingOffsetRequired(irp: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetHardErrorOrVerifyDevice(irp: COpaquePointer?, deviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioSetIoAttributionIrp(irp: COpaquePointer?, attributionsource: COpaquePointer?, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetIoPriorityHint(irp: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetIrpExtraCreateParameter(irp: COpaquePointer?, extracreateparameter: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioSetMasterIrpStatus(masterirp: COpaquePointer?, status: Ntstatus) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioSetPartitionInformation(deviceobject: COpaquePointer?, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetPartitionInformationEx(deviceobject: COpaquePointer?, partitionnumber: UInt, partitioninfo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, writepermission: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioSetStartIoAttributes(deviceobject: COpaquePointer?, deferredstartio: Boolean, noncancelable: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioSetSystemPartition(volumenamestring: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetTopLevelIrp(irp: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioSizeOfIrpEx(deviceobject: COpaquePointer?, stacksize: Byte): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSizeofWorkItem(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioStartNextPacket(deviceobject: COpaquePointer?, cancelable: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioStartNextPacketByKey(deviceobject: COpaquePointer?, cancelable: Boolean, key: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioStartPacket(deviceobject: COpaquePointer?, irp: COpaquePointer?, key: COpaquePointer?, cancelfunction: DriverCancel) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioStartTimer(deviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioStopTimer(deviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioSynchronousCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioTransferActivityId(activityid: COpaquePointer?, relatedactivityid: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioUninitializeWorkItem(ioworkitem: PioWorkitem) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioUnregisterBootDriverCallback(callbackhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioUnregisterContainerNotification(callbackregistration: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioUnregisterPlugPlayNotification(notificationentry: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioUnregisterPlugPlayNotificationEx(notificationentry: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioUnregisterShutdownNotification(deviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioUpdateLinkShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioUpdateLinkShareAccessEx(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioUpdateShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioValidateDeviceIoControlAccess(irp: COpaquePointer?, requiredaccess: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioVerifyPartitionTable(deviceobject: COpaquePointer?, fixerrors: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioVolumeDeviceNameToGuid(volumedevicename: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioVolumeDeviceNameToGuidPath(volumedevicename: COpaquePointer?, guidpath: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioVolumeDeviceToDosName(volumedeviceobject: COpaquePointer?, dosname: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioVolumeDeviceToGuid(volumedeviceobject: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioVolumeDeviceToGuidPath(volumedeviceobject: COpaquePointer?, guidpath: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIAllocateInstanceIds(guid: COpaquePointer?, instancecount: UInt, firstinstanceid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIDeviceObjectToInstanceName(datablockobject: COpaquePointer?, deviceobject: COpaquePointer?, instancename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIExecuteMethod(datablockobject: COpaquePointer?, instancename: COpaquePointer?, methodid: UInt, inbuffersize: UInt, outbuffersize: COpaquePointer?, inoutbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIHandleToInstanceName(datablockobject: COpaquePointer?, filehandle: Handle, instancename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIOpenBlock(guid: COpaquePointer?, desiredaccess: UInt, datablockobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIQueryAllData(datablockobject: COpaquePointer?, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIQueryAllDataMultiple(datablockobjectlist: COpaquePointer?, objectcount: UInt, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIQuerySingleInstance(datablockobject: COpaquePointer?, instancename: COpaquePointer?, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: COpaquePointer?, instancenames: COpaquePointer?, objectcount: UInt, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIRegistrationControl(deviceobject: COpaquePointer?, action: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMISetNotificationCallback(obj: COpaquePointer?, callback: WmiNotificationCallback, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMISetSingleInstance(datablockobject: COpaquePointer?, instancename: COpaquePointer?, version: UInt, valuebuffersize: UInt, valuebuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMISetSingleItem(datablockobject: COpaquePointer?, instancename: COpaquePointer?, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMISuggestInstanceName(physicaldeviceobject: COpaquePointer?, symboliclinkname: COpaquePointer?, combinenames: Boolean, suggestedinstancename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWMIWriteEvent(wnodeeventitem: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWriteErrorLogEntry(elentry: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioWriteKsrPersistentMemory(datahandle: COpaquePointer?, buffer: COpaquePointer?, size: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWritePartitionTable(deviceobject: COpaquePointer?, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioWritePartitionTableEx(deviceobject: COpaquePointer?, drivelayout: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iofCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iofCompleteRequest(irp: COpaquePointer?, priorityboost: Byte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: COpaquePointer?, outbufferbytes: UInt, outbuffer: COpaquePointer?, outbufferneeded: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kdDisableDebugger(): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kdEnableDebugger(): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kdRefreshDebuggerNotPresent(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keAcquireGuardedMutex(mutex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keAcquireGuardedMutexUnsafe(fastmutex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keAcquireInStackQueuedSpinLock(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keAcquireInStackQueuedSpinLockForDpc(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keAcquireSpinLockForDpc(spinlock: COpaquePointer?): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keAddTriageDumpDataBlock(ktriagedumpdataarray: COpaquePointer?, address: COpaquePointer?, size: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keAreAllApcsDisabled(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keAreApcsDisabled(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keBugCheck(bugcheckcode: BugcheckError) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keCancelTimer(param0: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keClearEvent(event: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: COpaquePointer?, conversionerror: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: COpaquePointer?, conversionerror: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keDeregisterBoundCallback(handle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keDeregisterBugCheckCallback(callbackrecord: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keDeregisterBugCheckReasonCallback(callbackrecord: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keDeregisterNmiCallback(handle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keDeregisterProcessorChangeCallback(callbackhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keEnterCriticalRegion() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keEnterGuardedRegion() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: COpaquePointer?, size: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: COpaquePointer?, size: ULong, wait: Boolean, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keFlushIoBuffers(mdl: COpaquePointer?, readoperation: Boolean, dmaoperation: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keFlushQueuedDpcs() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keFlushWriteBuffer() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keGetCurrentIrql(): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keGetCurrentNodeNumber(): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keGetCurrentProcessorNumberEx(procnumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keGetProcessorIndexFromNumber(procnumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keGetRecommendedSharedDataAlignment(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: COpaquePointer?, buffersize: UInt, bufferneeded: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keInitializeDeviceQueue(devicequeue: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeDpc(dpc: COpaquePointer?, deferredroutine: PkdeferredRoutine, deferredcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeEvent(event: COpaquePointer?, type: EventType, state: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeGuardedMutex(mutex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeMutex(mutex: COpaquePointer?, level: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeSemaphore(semaphore: COpaquePointer?, count: Int, limit: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeSpinLock(spinlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeThreadedDpc(dpc: COpaquePointer?, deferredroutine: PkdeferredRoutine, deferredcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeTimer(timer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeTimerEx(timer: COpaquePointer?, type: TimerType) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: COpaquePointer?, size: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keInsertByKeyDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?, sortkey: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keInsertDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keInsertQueueDpc(dpc: COpaquePointer?, systemargument1: COpaquePointer?, systemargument2: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keInvalidateAllCaches(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keInvalidateRangeAllCaches(baseaddress: COpaquePointer?, length: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keIsExecutingDpc(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keLeaveCriticalRegion() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keLeaveGuardedRegion() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun kePulseEvent(event: COpaquePointer?, increment: Int, wait: Boolean): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryActiveGroupCount(): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryActiveProcessorCount(activeprocessors: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryActiveProcessors(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryDpcWatchdogInformation(watchdoginformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryGroupAffinity(groupnumber: UShort): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryHardwareCounterConfiguration(counterarray: COpaquePointer?, maximumcount: UInt, count: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryHighestNodeNumber(): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryInterruptTimePrecise(qpctimestamp: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryLogicalProcessorRelationship(processornumber: COpaquePointer?, relationshiptype: LogicalProcessorRelationship, information: COpaquePointer?, length: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryMaximumGroupCount(): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryMaximumProcessorCount(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: COpaquePointer?, count: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: COpaquePointer?, groupaffinitiescount: UShort, groupaffinitiesrequired: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryPerformanceCounter(performancefrequency: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryPriorityThread(thread: Pkthread): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryRuntimeThread(thread: Pkthread, usertime: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQuerySystemTimePrecise(currenttime: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keQueryTimeIncrement(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryUnbiasedInterruptTime(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReadStateEvent(event: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReadStateMutex(mutex: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReadStateSemaphore(semaphore: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReadStateTimer(timer: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRegisterBoundCallback(callbackroutine: PboundCallback): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRegisterBugCheckCallback(callbackrecord: COpaquePointer?, callbackroutine: PkbugcheckCallbackRoutine, buffer: COpaquePointer?, length: UInt, component: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRegisterBugCheckReasonCallback(callbackrecord: COpaquePointer?, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: COpaquePointer?, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReleaseGuardedMutex(mutex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keReleaseGuardedMutexUnsafe(fastmutex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keReleaseInStackQueuedSpinLock(lockhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keReleaseMutex(mutex: COpaquePointer?, wait: Boolean): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReleaseSemaphore(semaphore: COpaquePointer?, increment: Int, adjustment: Int, wait: Boolean): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReleaseSpinLockForDpc(spinlock: COpaquePointer?, oldirql: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keRemoveByKeyDeviceQueue(devicequeue: COpaquePointer?, sortkey: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: COpaquePointer?, sortkey: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRemoveDeviceQueue(devicequeue: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRemoveEntryDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRemoveQueueDpc(dpc: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRemoveQueueDpcEx(dpc: COpaquePointer?, waitifactive: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keResetEvent(event: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRestoreExtendedProcessorState(xstatesave: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keRevertToUserAffinityThread() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keRevertToUserAffinityThreadEx(affinity: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keRevertToUserGroupAffinityThread(previousaffinity: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keSaveExtendedProcessorState(mask: ULong, xstatesave: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetCoalescableTimer(timer: COpaquePointer?, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetEvent(event: COpaquePointer?, increment: Int, wait: Boolean): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetHardwareCounterConfiguration(counterarray: COpaquePointer?, count: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetImportanceDpc(dpc: COpaquePointer?, importance: KdpcImportance) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keSetPriorityThread(thread: Pkthread, priority: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetSystemAffinityThread(affinity: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keSetSystemAffinityThreadEx(affinity: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetSystemGroupAffinityThread(affinity: COpaquePointer?, previousaffinity: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keSetTargetProcessorDpc(dpc: COpaquePointer?, number: Byte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keSetTargetProcessorDpcEx(dpc: COpaquePointer?, procnumber: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetTimer(timer: COpaquePointer?, duetime: Long, dpc: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetTimerEx(timer: COpaquePointer?, duetime: Long, period: Int, dpc: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keShouldYieldProcessor(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keStallExecutionProcessor(microseconds: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keTestSpinLock(spinlock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keTryToAcquireGuardedMutex(mutex: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keTryToAcquireSpinLockAtDpcLevel(spinlock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keWaitForMultipleObjects(count: UInt, obj: COpaquePointer?, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?, waitblockarray: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keWaitForSingleObject(obj: COpaquePointer?, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kfRaiseIrql(newirql: UByte): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAddPhysicalMemory(startaddress: COpaquePointer?, numberofbytes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: COpaquePointer?, thunkbuffersize: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAddVerifierThunks(thunkbuffer: COpaquePointer?, thunkbuffersize: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAdvanceMdl(mdl: COpaquePointer?, numberofbytes: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocateContiguousMemoryEx(numberofbytes: COpaquePointer?, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: COpaquePointer?, tag: UInt, flags: UInt, baseaddress: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocateMdlForIoSpace(physicaladdresslist: COpaquePointer?, numberofentries: ULong, newmdl: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocateNonCachedMemory(numberofbytes: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmAreMdlPagesCached(memorydescriptorlist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmBuildMdlForNonPagedPool(memorydescriptorlist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmCopyMemory(targetaddress: COpaquePointer?, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmCreateMdl(memorydescriptorlist: COpaquePointer?, base: COpaquePointer?, length: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmCreateMirror(): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmFreeContiguousMemory(baseaddress: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmFreeContiguousMemorySpecifyCache(baseaddress: COpaquePointer?, numberofbytes: ULong, cachetype: MemoryCachingType) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmFreeMappingAddress(baseaddress: COpaquePointer?, pooltag: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmFreeNonCachedMemory(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmFreePagesFromMdl(memorydescriptorlist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmFreePagesFromMdlEx(memorydescriptorlist: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmGetCacheAttribute(physicaladdress: Long, cachetype: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmGetPhysicalAddress(baseaddress: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmGetPhysicalMemoryRanges(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmGetPhysicalMemoryRangesEx(partitionobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmGetPhysicalMemoryRangesEx2(partitionobject: COpaquePointer?, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmGetSystemRoutineAddress(systemroutinename: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmGetVirtualForPhysical(physicaladdress: Long): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmIsAddressValid(virtualaddress: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmIsDriverSuspectForVerifier(driverobject: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmIsDriverVerifying(driverobject: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmIsDriverVerifyingByAddress(addresswithinsection: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmIsNonPagedSystemAddressValid(virtualaddress: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmIsThisAnNtAsSystem(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmIsVerifierEnabled(verifierflags: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmLockPagableDataSection(addresswithinsection: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmLockPagableSectionByHandle(imagesectionhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapLockedPages(memorydescriptorlist: COpaquePointer?, accessmode: Byte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: COpaquePointer?, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: COpaquePointer?, bugcheckonfailure: UInt, priority: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapLockedPagesWithReservedMapping(mappingaddress: COpaquePointer?, pooltag: UInt, memorydescriptorlist: COpaquePointer?, cachetype: MemoryCachingType): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapMdl(memorydescriptorlist: COpaquePointer?, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapMemoryDumpMdlEx(va: COpaquePointer?, pagetotal: UInt, memorydumpmdl: COpaquePointer?, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapUserAddressesToPage(baseaddress: COpaquePointer?, numberofbytes: ULong, pageaddress: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapViewInSessionSpace(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapViewInSessionSpaceEx(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?, sectionoffset: COpaquePointer?, flags: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapViewInSystemSpace(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMapViewInSystemSpaceEx(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?, sectionoffset: COpaquePointer?, flags: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMdlPageContentsState(memorydescriptorlist: COpaquePointer?, state: MmMdlPageContentsState): MmMdlPageContentsState =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmPageEntireDriver(addresswithinsection: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmProbeAndLockPages(memorydescriptorlist: COpaquePointer?, accessmode: Byte, operation: LockOperation) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmProbeAndLockProcessPages(memorydescriptorlist: COpaquePointer?, process: Peprocess, accessmode: Byte, operation: LockOperation) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmProbeAndLockSelectedPages(memorydescriptorlist: COpaquePointer?, segmentarray: COpaquePointer?, accessmode: Byte, operation: LockOperation) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmProtectDriverSection(addresswithinsection: COpaquePointer?, size: ULong, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmProtectMdlSystemAddress(memorydescriptorlist: COpaquePointer?, newprotect: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmQuerySystemSize(): MmSystemsize =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmRemovePhysicalMemory(startaddress: COpaquePointer?, numberofbytes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmResetDriverPaging(addresswithinsection: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmRotatePhysicalView(virtualaddress: COpaquePointer?, numberofbytes: COpaquePointer?, newmdl: COpaquePointer?, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmSecureVirtualMemory(address: COpaquePointer?, size: ULong, probemode: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmSecureVirtualMemoryEx(address: COpaquePointer?, size: ULong, probemode: UInt, flags: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmSizeOfMdl(base: COpaquePointer?, length: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmUnlockPagableImageSection(imagesectionhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmUnlockPages(memorydescriptorlist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmUnmapIoSpace(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmUnmapLockedPages(baseaddress: COpaquePointer?, memorydescriptorlist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmUnmapReservedMapping(baseaddress: COpaquePointer?, pooltag: UInt, memorydescriptorlist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmUnmapVideoDisplay(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mmUnmapViewInSessionSpace(mappedbase: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmUnmapViewInSystemSpace(mappedbase: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmUnsecureVirtualMemory(securehandle: Handle) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ntAllocateLocallyUniqueId(luid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, rmguid: COpaquePointer?, objectattributes: COpaquePointer?, createoptions: UInt, description: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, createoptions: UInt, commitstrength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntDisplayString(string: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: COpaquePointer?, objectcursorlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, timeout: COpaquePointer?, returnlength: COpaquePointer?, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntLoadDriver(driverservicename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntMakeTemporaryObject(handle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, tmidentity: COpaquePointer?, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: COpaquePointer?, protocolinformationsize: UInt, protocolinformation: COpaquePointer?, createoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntUnloadDriver(driverservicename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obDereferenceObjectDeferDelete(obj: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun obDereferenceObjectDeferDeleteWithTag(obj: COpaquePointer?, tag: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun obGetFilterVersion(): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obGetObjectSecurity(obj: COpaquePointer?, securitydescriptor: COpaquePointer?, memoryallocated: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: COpaquePointer?, handleinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: COpaquePointer?, handleinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obReferenceObjectByPointer(obj: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obReferenceObjectByPointerWithTag(obj: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obReferenceObjectSafe(obj: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obReferenceObjectSafeWithTag(obj: COpaquePointer?, tag: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obRegisterCallbacks(callbackregistration: COpaquePointer?, registrationhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun obUnRegisterCallbacks(registrationhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun obfDereferenceObject(obj: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obfDereferenceObjectWithTag(obj: COpaquePointer?, tag: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obfReferenceObject(obj: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obfReferenceObjectWithTag(obj: COpaquePointer?, tag: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pcwAddInstance(buffer: PpcwBuffer, name: COpaquePointer?, id: UInt, count: UInt, data: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pcwCloseInstance(instance: PpcwInstance) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun pcwCreateInstance(instance: COpaquePointer?, registration: PpcwRegistration, name: COpaquePointer?, count: UInt, data: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pcwRegister(registration: COpaquePointer?, info: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pcwUnregister(registration: PpcwRegistration) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poClearPowerRequest(powerrequest: COpaquePointer?, type: PowerRequestType): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poCreatePowerRequest(powerrequest: COpaquePointer?, deviceobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poCreateThermalRequest(thermalrequest: COpaquePointer?, targetdeviceobject: COpaquePointer?, policydeviceobject: COpaquePointer?, context: COpaquePointer?, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poDeletePowerRequest(powerrequest: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poDeleteThermalRequest(thermalrequest: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poEndDeviceBusy(idlepointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxCompleteDevicePowerNotRequired(handle: Pohandle) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxCompleteDirectedPowerDown(handle: Pohandle) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxCompleteIdleState(handle: Pohandle, component: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: COpaquePointer?, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: COpaquePointer?, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxNotifySurprisePowerOn(pdo: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxPowerControl(handle: Pohandle, powercontrolcode: COpaquePointer?, inbuffer: COpaquePointer?, inbuffersize: ULong, outbuffer: COpaquePointer?, outbuffersize: ULong, bytesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: COpaquePointer?, outputstateinfo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poFxRegisterDevice(pdo: COpaquePointer?, device: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxReportDevicePoweredOn(handle: Pohandle) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poFxStartDevicePowerManagement(handle: Pohandle) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poFxUnregisterDevice(handle: Pohandle) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poGetSystemWake(irp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poGetThermalRequestSupport(thermalrequest: COpaquePointer?, type: PoThermalRequestType): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poQueryWatchdogTime(pdo: COpaquePointer?, secondsremaining: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poRegisterDeviceForIdleDetection(deviceobject: COpaquePointer?, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poRegisterPowerSettingCallback(deviceobject: COpaquePointer?, settingguid: COpaquePointer?, callback: PpowerSettingCallback, context: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poRegisterSystemState(statehandle: COpaquePointer?, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poRequestPowerIrp(deviceobject: COpaquePointer?, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poSetDeviceBusyEx(idlepointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poSetHiberRange(memorymap: COpaquePointer?, flags: UInt, address: COpaquePointer?, length: ULong, tag: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poSetPowerRequest(powerrequest: COpaquePointer?, type: PowerRequestType): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poSetPowerState(deviceobject: COpaquePointer?, type: PowerStateType, state: PowerState): PowerState =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poSetSystemState(flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poSetSystemWake(irp: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poSetSystemWakeDevice(deviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poSetThermalActiveCooling(thermalrequest: COpaquePointer?, engaged: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poSetThermalPassiveCooling(thermalrequest: COpaquePointer?, throttle: UByte): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poStartDeviceBusy(idlepointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poStartNextPowerIrp(irp: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poUnregisterPowerSettingCallback(handle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poUnregisterSystemState(statehandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun probeForRead(address: COpaquePointer?, length: ULong, alignment: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun probeForWrite(address: COpaquePointer?, length: ULong, alignment: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psAllocateAffinityToken(affinitytoken: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psCreateSystemThread(threadhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, processhandle: Handle, clientid: COpaquePointer?, startroutine: PkstartRoutine, startcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psDereferenceSiloContext(silocontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psDetachSiloFromCurrentThread(previoussilo: Pesilo) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psFreeAffinityToken(affinitytoken: PaffinityToken) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetCurrentProcessId(): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetCurrentServerSilo(): Pesilo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetCurrentServerSiloName(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetCurrentSilo(): Pesilo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetCurrentThreadId(): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetCurrentThreadTeb(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetHostSilo(): Pesilo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetJobServerSilo(job: Pejob, serversilo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetJobSilo(job: Pejob, silo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetParentSilo(job: Pejob): Pesilo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetProcessExitStatus(process: Peprocess): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetProcessId(process: Peprocess): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetProcessStartKey(process: Peprocess): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetSiloContainerId(silo: Pesilo): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetThreadCreateTime(thread: Pethread): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetThreadExitStatus(thread: Pethread): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetThreadId(thread: Pethread): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetThreadProcessId(thread: Pethread): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetThreadServerSilo(thread: Pethread): Pesilo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetVersion(majorversion: COpaquePointer?, minorversion: COpaquePointer?, buildnumber: COpaquePointer?, csdversion: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psIsCurrentThreadInServerSilo(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psIsCurrentThreadPrefetching(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psIsHostSilo(silo: Pesilo): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psReferenceSiloContext(silocontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psRegisterSiloMonitor(registration: COpaquePointer?, returnedmonitor: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psReleaseSiloHardReference(silo: Pesilo) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: COpaquePointer?, oldsilocontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: COpaquePointer?, remove: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psSetSystemMultipleGroupAffinityThread(groupaffinities: COpaquePointer?, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psUnregisterSiloMonitor(monitor: PsiloMonitor) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psWrapApcWow64Thread(apccontext: COpaquePointer?, apcroutine: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pshedAllocateMemory(size: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pshedFreeMemory(address: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun pshedIsSystemWheaEnabled(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pshedRegisterPlugin(packet: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pshedSynchronizeExecution(errorsource: COpaquePointer?, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pshedUnregisterPlugin(pluginhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlAppendUnicodeStringToString(destination: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAppendUnicodeToString(destination: COpaquePointer?, source: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAreBitsClear(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAreBitsSet(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAssert(voidfailedassertion: COpaquePointer?, voidfilename: COpaquePointer?, linenumber: UInt, mutablemessage: Pcstr) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlClearAllBits(bitmapheader: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlClearBit(bitmapheader: COpaquePointer?, bitnumber: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlClearBits(bitmapheader: COpaquePointer?, startingindex: UInt, numbertoclear: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlCmDecodeMemIoResource(descriptor: COpaquePointer?, start: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCmEncodeMemIoResource(descriptor: COpaquePointer?, type: UByte, length: ULong, start: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCompareString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCompareUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCompareUnicodeStrings(string1: COpaquePointer?, string1length: ULong, string2: COpaquePointer?, string2length: ULong, caseinsensitive: Boolean): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlContractHashTable(hashtable: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCopyBitMap(source: COpaquePointer?, destination: COpaquePointer?, targetbit: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlCopyString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlCopyUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlCreateHashTable(hashtable: COpaquePointer?, shift: UInt, flags: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCreateHashTableEx(hashtable: COpaquePointer?, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDelete(links: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDeleteElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDeleteElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDeleteElementGenericTableAvlEx(table: COpaquePointer?, nodeorparent: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlDeleteHashTable(hashtable: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlDeleteNoSplay(links: COpaquePointer?, root: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEndEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlEndStrongEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlEndWeakEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEnumerateGenericTable(table: COpaquePointer?, restart: Boolean): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEnumerateGenericTableAvl(table: COpaquePointer?, restart: Boolean): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEnumerateGenericTableLikeADirectory(table: COpaquePointer?, matchfunction: PrtlAvlMatchFunction, matchdata: COpaquePointer?, nextflag: UInt, restartkey: COpaquePointer?, deletecount: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEnumerateGenericTableWithoutSplaying(table: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEnumerateGenericTableWithoutSplayingAvl(table: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEqualString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEqualUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlExpandHashTable(hashtable: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlExtractBitMap(source: COpaquePointer?, destination: COpaquePointer?, targetbit: UInt, numberofbits: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlFindClearBits(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindClearBitsAndSet(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindClearRuns(bitmapheader: COpaquePointer?, runarray: COpaquePointer?, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindFirstRunClear(bitmapheader: COpaquePointer?, startingindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindLastBackwardRunClear(bitmapheader: COpaquePointer?, fromindex: UInt, startingrunindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindLeastSignificantBit(set: ULong): Byte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindLongestRunClear(bitmapheader: COpaquePointer?, startingindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindMostSignificantBit(set: ULong): Byte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindNextForwardRunClear(bitmapheader: COpaquePointer?, fromindex: UInt, startingrunindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindSetBits(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindSetBitsAndClear(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFreeUTF8String(utf8string: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlGUIDFromString(guidstring: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGenerateClass5Guid(namespaceguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, guid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetActiveConsoleId(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetCallersAddress(callersaddress: COpaquePointer?, callerscaller: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlGetConsoleSessionForegroundProcessId(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetElementGenericTable(table: COpaquePointer?, i: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetElementGenericTableAvl(table: COpaquePointer?, i: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetNextEntryHashTable(hashtable: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetNtProductType(ntproducttype: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetNtSystemRoot(): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetSuiteMask(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetVersion(lpversioninformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlHashUnicodeString(string: COpaquePointer?, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInitEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInitStrongEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInitUTF8String(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlInitUTF8StringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInitWeakEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInitializeBitMap(bitmapheader: COpaquePointer?, bitmapbuffer: COpaquePointer?, sizeofbitmap: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlInitializeGenericTable(table: COpaquePointer?, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlInitializeGenericTableAvl(table: COpaquePointer?, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlInsertElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInsertElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInsertElementGenericTableFull(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: TableSearchResult): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInsertElementGenericTableFullAvl(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: TableSearchResult): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInsertEntryHashTable(hashtable: COpaquePointer?, entry: COpaquePointer?, signature: ULong, context: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIoDecodeMemIoResource(descriptor: COpaquePointer?, alignment: COpaquePointer?, minimumaddress: COpaquePointer?, maximumaddress: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIoEncodeMemIoResource(descriptor: COpaquePointer?, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsGenericTableEmpty(table: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsGenericTableEmptyAvl(table: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsMultiSessionSku(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsMultiUsersInSessionSku(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsServicePackVersionInstalled(version: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsStateSeparationEnabled(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsUntrustedObject(handle: Handle, obj: COpaquePointer?, untrustedobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlLookupElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlLookupElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlLookupElementGenericTableFull(table: COpaquePointer?, buffer: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlLookupElementGenericTableFullAvl(table: COpaquePointer?, buffer: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlLookupEntryHashTable(hashtable: COpaquePointer?, signature: ULong, context: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlLookupFirstMatchingElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlMapGenericMask(accessmask: COpaquePointer?, genericmapping: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: COpaquePointer?, securitydescriptorlength: UInt, newsecuritydescriptor: COpaquePointer?, newsecuritydescriptorlength: COpaquePointer?, checkonly: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNumberGenericTableElements(table: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNumberGenericTableElementsAvl(table: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNumberOfClearBits(bitmapheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNumberOfClearBitsInRange(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNumberOfSetBits(bitmapheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNumberOfSetBitsInRange(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlPrefetchMemoryNonTemporal(source: COpaquePointer?, length: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlPrefixUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: COpaquePointer?, valuelength: UInt, valuetype: COpaquePointer?, valuedata: COpaquePointer?, resultlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: COpaquePointer?, context: COpaquePointer?, environment: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlQueryValidationRunlevel(componentname: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRealPredecessor(links: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRealSuccessor(links: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRemoveEntryHashTable(hashtable: COpaquePointer?, entry: COpaquePointer?, context: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRunOnceBeginInitialize(runonce: COpaquePointer?, flags: UInt, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRunOnceComplete(runonce: COpaquePointer?, flags: UInt, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRunOnceExecuteOnce(runonce: COpaquePointer?, initfn: PrtlRunOnceInitFn, parameter: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRunOnceInitialize(runonce: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlSetAllBits(bitmapheader: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlSetBit(bitmapheader: COpaquePointer?, bitnumber: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlSetBits(bitmapheader: COpaquePointer?, startingindex: UInt, numbertoset: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: COpaquePointer?, dacldefaulted: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: COpaquePointer?, size: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSplay(links: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlStringFromGUID(guid: COpaquePointer?, guidstring: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlStronglyEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSubtreePredecessor(links: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSubtreeSuccessor(links: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSuffixUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlTestBit(bitmapheader: COpaquePointer?, bitnumber: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlTimeFieldsToTime(timefields: COpaquePointer?, time: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlTimeToTimeFields(time: COpaquePointer?, timefields: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlUTF8StringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: COpaquePointer?, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUnicodeStringToInt64(string: COpaquePointer?, base: UInt, number: COpaquePointer?, endpointer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUnicodeStringToInteger(string: COpaquePointer?, base: UInt, value: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUnicodeStringToUTF8String(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: COpaquePointer?, unicodestringsource: COpaquePointer?, unicodestringbytecount: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUpcaseUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUpperChar(character: Byte): Byte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUpperString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlVerifyVersionInfo(versioninfo: COpaquePointer?, typemask: UInt, conditionmask: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlVolumeDeviceToDosName(volumedeviceobject: COpaquePointer?, dosname: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlWalkFrameChain(callers: COpaquePointer?, count: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlWeaklyEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: COpaquePointer?, valuelength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlxAnsiStringToUnicodeSize(ansistring: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlxUnicodeStringToAnsiSize(unicodestring: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, isdirectoryobject: Boolean, subjectcontext: COpaquePointer?, genericmapping: COpaquePointer?, pooltype: PoolType): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttype: COpaquePointer?, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: COpaquePointer?, genericmapping: COpaquePointer?, pooltype: PoolType): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seCaptureSubjectContext(subjectcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seComputeAutoInheritByObjectType(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seDeassignSecurity(securitydescriptor: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seEtwWriteKMCveEvent(cveid: COpaquePointer?, additionaldetails: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seLockSubjectContext(subjectcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: COpaquePointer?, token: COpaquePointer?, callbackhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seReleaseSubjectContext(subjectcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seReportSecurityEvent(flags: UInt, sourcename: COpaquePointer?, usersid: Psid, auditparameters: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seSetAuditParameter(auditparameters: COpaquePointer?, type: SeAdtParameterType, index: UInt, data: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seUnlockSubjectContext(subjectcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seUnregisterImageVerificationCallback(callbackhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmCommitComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmCommitEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmCommitTransaction(transaction: COpaquePointer?, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmCreateEnlistment(enlistmenthandle: COpaquePointer?, previousmode: Byte, desiredaccess: UInt, objectattributes: COpaquePointer?, resourcemanager: COpaquePointer?, transaction: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmDereferenceEnlistmentKey(enlistment: COpaquePointer?, lastreference: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmEnableCallbacks(resourcemanager: COpaquePointer?, callbackroutine: PtmRmNotification, rmkey: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmGetTransactionId(transaction: COpaquePointer?, transactionid: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun tmInitializeTransactionManager(transactionmanager: COpaquePointer?, logfilename: COpaquePointer?, tmid: COpaquePointer?, createoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmIsTransactionActive(transaction: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmPrePrepareComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmPrePrepareEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmPrepareComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmPrepareEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmPropagationComplete(resourcemanager: COpaquePointer?, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmPropagationFailed(resourcemanager: COpaquePointer?, requestcookie: UInt, status: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmReadOnlyEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmRecoverEnlistment(enlistment: COpaquePointer?, enlistmentkey: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmRecoverResourceManager(resourcemanager: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmRecoverTransactionManager(tm: COpaquePointer?, targetvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmReferenceEnlistmentKey(enlistment: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmRequestOutcomeEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmRollbackComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmRollbackEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmRollbackTransaction(transaction: COpaquePointer?, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmSinglePhaseReject(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vslCreateSecureSection(handle: COpaquePointer?, targetprocess: Peprocess, mdl: COpaquePointer?, devicepageprotection: UInt, attributes: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaAddErrorSource(errorsource: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaAddErrorSourceDeviceDriver(context: COpaquePointer?, configuration: COpaquePointer?, numberpreallocatederrorreports: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaAddErrorSourceDeviceDriverV1(context: COpaquePointer?, configuration: COpaquePointer?, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: COpaquePointer?, sectiondatalength: UInt, bufferset: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaGetNotifyAllOfflinesPolicy(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaHighIrqlLogSelEventHandlerUnregister() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: COpaquePointer?, namelength: UInt, name: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: COpaquePointer?, errorseverity: WheaErrorSeverity): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaInitializeRecordHeader(header: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaIsCriticalState(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaLogInternalEvent(entry: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaRemoveErrorSource(errorsourceid: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaReportHwError(errorpacket: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: COpaquePointer?, errordata: COpaquePointer?, errordatalength: UInt, sectiontypeguid: COpaquePointer?, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: COpaquePointer?, traceinformationlength: UInt, requiredlength: COpaquePointer?, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwAllocateLocallyUniqueId(luid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwClose(handle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?, createoptions: UInt, description: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, createoptions: UInt, commitstrength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwDisplayString(string: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: COpaquePointer?, objectcursorlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, timeout: COpaquePointer?, returnlength: COpaquePointer?, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwLoadDriver(driverservicename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwMakeTemporaryObject(handle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenSymbolicLinkObject(linkhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, tmidentity: COpaquePointer?, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: COpaquePointer?, protocolinformationsize: UInt, protocolinformation: COpaquePointer?, createoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwUnloadDriver(driverservicename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
