@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun clfsAddLogContainer(plfolog: COpaquePointer?, pcbcontainer: COpaquePointer?, puszcontainerpath: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsAddLogContainer(plfolog?.value?.toCPointer<ByteVar>(), pcbcontainer?.value?.toCPointer<ByteVar>(), puszcontainerpath?.value?.toCPointer<ByteVar>())

public actual fun clfsAddLogContainerSet(plfolog: COpaquePointer?, ccontainers: UShort, pcbcontainer: COpaquePointer?, rguszcontainerpath: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsAddLogContainerSet(plfolog?.value?.toCPointer<ByteVar>(), ccontainers, pcbcontainer?.value?.toCPointer<ByteVar>(), rguszcontainerpath?.value?.toCPointer<ByteVar>())

public actual fun clfsAdvanceLogBase(pvmarshalcontext: COpaquePointer?, plsnbase: COpaquePointer?, fflags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsAdvanceLogBase(pvmarshalcontext?.value?.toCPointer<ByteVar>(), plsnbase?.value?.toCPointer<ByteVar>(), fflags)

public actual fun clfsAlignReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, rgcbreservation: COpaquePointer?, pcbalignreservation: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsAlignReservedLog(pvmarshalcontext?.value?.toCPointer<ByteVar>(), crecords, rgcbreservation?.value?.toCPointer<ByteVar>(), pcbalignreservation?.value?.toCPointer<ByteVar>())

public actual fun clfsAllocReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, pcbadjustment: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsAllocReservedLog(pvmarshalcontext?.value?.toCPointer<ByteVar>(), crecords, pcbadjustment?.value?.toCPointer<ByteVar>())

public actual fun clfsCloseAndResetLogFile(plfolog: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsCloseAndResetLogFile(plfolog?.value?.toCPointer<ByteVar>())

public actual fun clfsCloseLogFileObject(plfolog: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsCloseLogFileObject(plfolog?.value?.toCPointer<ByteVar>())

public actual fun clfsCreateLogFile(pplfolog: COpaquePointer?, puszlogfilename: COpaquePointer?, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: COpaquePointer?, cbcontext: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsCreateLogFile(pplfolog?.value?.toCPointer<ByteVar>(), puszlogfilename?.value?.toCPointer<ByteVar>(), fdesiredaccess, dwsharemode, psdlogfile?.value?.toCPointer<ByteVar>(), fcreatedisposition, fcreateoptions, fflagsandattributes, flogoptionflag, pvcontext?.value?.toCPointer<ByteVar>(), cbcontext)

public actual fun clfsCreateMarshallingArea(plfolog: COpaquePointer?, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: COpaquePointer?): Ntstatus =
    0

public actual fun clfsCreateMarshallingAreaEx(plfolog: COpaquePointer?, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: COpaquePointer?): Ntstatus =
    0

public actual fun clfsCreateScanContext(plfolog: COpaquePointer?, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsCreateScanContext(plfolog?.value?.toCPointer<ByteVar>(), cfromcontainer, ccontainers, escanmode, pcxscan?.value?.toCPointer<ByteVar>())

public actual fun clfsDeleteLogByPointer(plfolog: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsDeleteLogByPointer(plfolog?.value?.toCPointer<ByteVar>())

public actual fun clfsDeleteLogFile(puszlogfilename: COpaquePointer?, pvreserved: COpaquePointer?, flogoptionflag: UInt, pvcontext: COpaquePointer?, cbcontext: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsDeleteLogFile(puszlogfilename?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>(), flogoptionflag, pvcontext?.value?.toCPointer<ByteVar>(), cbcontext)

public actual fun clfsDeleteMarshallingArea(pvmarshalcontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsDeleteMarshallingArea(pvmarshalcontext?.value?.toCPointer<ByteVar>())

public actual fun clfsEarlierLsn(plsn: COpaquePointer?): ClsLsn =
    ClsLsn()

public actual fun clfsFinalize() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsFinalize()
}

public actual fun clfsFlushBuffers(pvmarshalcontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsFlushBuffers(pvmarshalcontext?.value?.toCPointer<ByteVar>())

public actual fun clfsFlushToLsn(pvmarshalcontext: COpaquePointer?, plsnflush: COpaquePointer?, plsnlastflushed: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsFlushToLsn(pvmarshalcontext?.value?.toCPointer<ByteVar>(), plsnflush?.value?.toCPointer<ByteVar>(), plsnlastflushed?.value?.toCPointer<ByteVar>())

public actual fun clfsFreeReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, pcbadjustment: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsFreeReservedLog(pvmarshalcontext?.value?.toCPointer<ByteVar>(), crecords, pcbadjustment?.value?.toCPointer<ByteVar>())

public actual fun clfsGetContainerName(plfolog: COpaquePointer?, cidlogicalcontainer: UInt, puszcontainername: COpaquePointer?, pcactuallencontainername: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsGetContainerName(plfolog?.value?.toCPointer<ByteVar>(), cidlogicalcontainer, puszcontainername?.value?.toCPointer<ByteVar>(), pcactuallencontainername?.value?.toCPointer<ByteVar>())

public actual fun clfsGetIoStatistics(plfolog: COpaquePointer?, pvstatsbuffer: COpaquePointer?, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsGetIoStatistics(plfolog?.value?.toCPointer<ByteVar>(), pvstatsbuffer?.value?.toCPointer<ByteVar>(), cbstatsbuffer, estatsclass, pcbstatswritten?.value?.toCPointer<ByteVar>())

public actual fun clfsGetLogFileInformation(plfolog: COpaquePointer?, pinfobuffer: COpaquePointer?, pcbinfobuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsGetLogFileInformation(plfolog?.value?.toCPointer<ByteVar>(), pinfobuffer?.value?.toCPointer<ByteVar>(), pcbinfobuffer?.value?.toCPointer<ByteVar>())

public actual fun clfsInitialize(): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsInitialize()

public actual fun clfsLaterLsn(plsn: COpaquePointer?): ClsLsn =
    ClsLsn()

public actual fun clfsLsnBlockOffset(plsn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsLsnBlockOffset(plsn?.value?.toCPointer<ByteVar>())

public actual fun clfsLsnContainer(plsn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsLsnContainer(plsn?.value?.toCPointer<ByteVar>())

public actual fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    ClsLsn()

public actual fun clfsLsnDifference(plsnstart: COpaquePointer?, plsnfinish: COpaquePointer?, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsLsnDifference(plsnstart?.value?.toCPointer<ByteVar>(), plsnfinish?.value?.toCPointer<ByteVar>(), cbcontainer, cbmaxblock, pcbdifference?.value?.toCPointer<ByteVar>())

public actual fun clfsLsnEqual(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsLsnEqual(plsn1?.value?.toCPointer<ByteVar>(), plsn2?.value?.toCPointer<ByteVar>())

public actual fun clfsLsnGreater(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsLsnGreater(plsn1?.value?.toCPointer<ByteVar>(), plsn2?.value?.toCPointer<ByteVar>())

public actual fun clfsLsnInvalid(plsn: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsLsnInvalid(plsn?.value?.toCPointer<ByteVar>())

public actual fun clfsLsnLess(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsLsnLess(plsn1?.value?.toCPointer<ByteVar>(), plsn2?.value?.toCPointer<ByteVar>())

public actual fun clfsLsnNull(plsn: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsLsnNull(plsn?.value?.toCPointer<ByteVar>())

public actual fun clfsLsnRecordSequence(plsn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsLsnRecordSequence(plsn?.value?.toCPointer<ByteVar>())

public actual fun clfsMgmtDeregisterManagedClient(clientcookie: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsMgmtDeregisterManagedClient(clientcookie?.value?.toCPointer<ByteVar>())

public actual fun clfsMgmtHandleLogFileFull(client: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsMgmtHandleLogFileFull(client?.value?.toCPointer<ByteVar>())

public actual fun clfsMgmtInstallPolicy(logfile: COpaquePointer?, policy: COpaquePointer?, policylength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsMgmtInstallPolicy(logfile?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), policylength)

public actual fun clfsMgmtQueryPolicy(logfile: COpaquePointer?, policytype: ClfsMgmtPolicyType, policy: COpaquePointer?, policylength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsMgmtQueryPolicy(logfile?.value?.toCPointer<ByteVar>(), policytype, policy?.value?.toCPointer<ByteVar>(), policylength?.value?.toCPointer<ByteVar>())

public actual fun clfsMgmtRegisterManagedClient(logfile: COpaquePointer?, registrationdata: COpaquePointer?, clientcookie: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsMgmtRegisterManagedClient(logfile?.value?.toCPointer<ByteVar>(), registrationdata?.value?.toCPointer<ByteVar>(), clientcookie?.value?.toCPointer<ByteVar>())

public actual fun clfsMgmtRemovePolicy(logfile: COpaquePointer?, policytype: ClfsMgmtPolicyType): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsMgmtRemovePolicy(logfile?.value?.toCPointer<ByteVar>(), policytype)

public actual fun clfsMgmtSetLogFileSize(logfile: COpaquePointer?, newsizeincontainers: COpaquePointer?, resultingsizeincontainers: COpaquePointer?, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSize(logfile?.value?.toCPointer<ByteVar>(), newsizeincontainers?.value?.toCPointer<ByteVar>(), resultingsizeincontainers?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), completionroutinedata?.value?.toCPointer<ByteVar>())

public actual fun clfsMgmtSetLogFileSizeAsClient(logfile: COpaquePointer?, clientcookie: COpaquePointer?, newsizeincontainers: COpaquePointer?, resultingsizeincontainers: COpaquePointer?, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSizeAsClient(logfile?.value?.toCPointer<ByteVar>(), clientcookie?.value?.toCPointer<ByteVar>(), newsizeincontainers?.value?.toCPointer<ByteVar>(), resultingsizeincontainers?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), completionroutinedata?.value?.toCPointer<ByteVar>())

public actual fun clfsMgmtTailAdvanceFailure(client: COpaquePointer?, reason: Ntstatus): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsMgmtTailAdvanceFailure(client?.value?.toCPointer<ByteVar>(), reason)

public actual fun clfsQueryLogFileInformation(plfolog: COpaquePointer?, einformationclass: ClsLogInformationClass, pinfoinputbuffer: COpaquePointer?, cbinfoinputbuffer: UInt, pinfobuffer: COpaquePointer?, pcbinfobuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsQueryLogFileInformation(plfolog?.value?.toCPointer<ByteVar>(), einformationclass, pinfoinputbuffer?.value?.toCPointer<ByteVar>(), cbinfoinputbuffer, pinfobuffer?.value?.toCPointer<ByteVar>(), pcbinfobuffer?.value?.toCPointer<ByteVar>())

public actual fun clfsReadLogRecord(pvmarshalcontext: COpaquePointer?, plsnfirst: COpaquePointer?, pecontextmode: ClfsContextMode, ppvreadbuffer: COpaquePointer?, pcbreadbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, ppvreadcontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsReadLogRecord(pvmarshalcontext?.value?.toCPointer<ByteVar>(), plsnfirst?.value?.toCPointer<ByteVar>(), pecontextmode, ppvreadbuffer?.value?.toCPointer<ByteVar>(), pcbreadbuffer?.value?.toCPointer<ByteVar>(), perecordtype?.value?.toCPointer<ByteVar>(), plsnundonext?.value?.toCPointer<ByteVar>(), plsnprevious?.value?.toCPointer<ByteVar>(), ppvreadcontext?.value?.toCPointer<ByteVar>())

public actual fun clfsReadNextLogRecord(pvreadcontext: COpaquePointer?, ppvbuffer: COpaquePointer?, pcbbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnuser: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, plsnrecord: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsReadNextLogRecord(pvreadcontext?.value?.toCPointer<ByteVar>(), ppvbuffer?.value?.toCPointer<ByteVar>(), pcbbuffer?.value?.toCPointer<ByteVar>(), perecordtype?.value?.toCPointer<ByteVar>(), plsnuser?.value?.toCPointer<ByteVar>(), plsnundonext?.value?.toCPointer<ByteVar>(), plsnprevious?.value?.toCPointer<ByteVar>(), plsnrecord?.value?.toCPointer<ByteVar>())

public actual fun clfsReadPreviousRestartArea(pvreadcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsnrestart: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsReadPreviousRestartArea(pvreadcontext?.value?.toCPointer<ByteVar>(), ppvrestartbuffer?.value?.toCPointer<ByteVar>(), pcbrestartbuffer?.value?.toCPointer<ByteVar>(), plsnrestart?.value?.toCPointer<ByteVar>())

public actual fun clfsReadRestartArea(pvmarshalcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsn: COpaquePointer?, ppvreadcontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsReadRestartArea(pvmarshalcontext?.value?.toCPointer<ByteVar>(), ppvrestartbuffer?.value?.toCPointer<ByteVar>(), pcbrestartbuffer?.value?.toCPointer<ByteVar>(), plsn?.value?.toCPointer<ByteVar>(), ppvreadcontext?.value?.toCPointer<ByteVar>())

public actual fun clfsRemoveLogContainer(plfolog: COpaquePointer?, puszcontainerpath: COpaquePointer?, fforce: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainer(plfolog?.value?.toCPointer<ByteVar>(), puszcontainerpath?.value?.toCPointer<ByteVar>(), fforce)

public actual fun clfsRemoveLogContainerSet(plfolog: COpaquePointer?, ccontainers: UShort, rgwszcontainerpath: COpaquePointer?, fforce: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainerSet(plfolog?.value?.toCPointer<ByteVar>(), ccontainers, rgwszcontainerpath?.value?.toCPointer<ByteVar>(), fforce)

public actual fun clfsReserveAndAppendLog(pvmarshalcontext: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: UInt, plsn: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLog(pvmarshalcontext?.value?.toCPointer<ByteVar>(), rgwriteentries?.value?.toCPointer<ByteVar>(), cwriteentries, plsnundonext?.value?.toCPointer<ByteVar>(), plsnprevious?.value?.toCPointer<ByteVar>(), creserverecords, rgcbreservation?.value?.toCPointer<ByteVar>(), fflags, plsn?.value?.toCPointer<ByteVar>())

public actual fun clfsReserveAndAppendLogAligned(pvmarshalcontext: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: UInt, plsn: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLogAligned(pvmarshalcontext?.value?.toCPointer<ByteVar>(), rgwriteentries?.value?.toCPointer<ByteVar>(), cwriteentries, cbentryalignment, plsnundonext?.value?.toCPointer<ByteVar>(), plsnprevious?.value?.toCPointer<ByteVar>(), creserverecords, rgcbreservation?.value?.toCPointer<ByteVar>(), fflags, plsn?.value?.toCPointer<ByteVar>())

public actual fun clfsScanLogContainers(pcxscan: COpaquePointer?, escanmode: UByte): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsScanLogContainers(pcxscan?.value?.toCPointer<ByteVar>(), escanmode)

public actual fun clfsSetArchiveTail(plfolog: COpaquePointer?, plsnarchivetail: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsSetArchiveTail(plfolog?.value?.toCPointer<ByteVar>(), plsnarchivetail?.value?.toCPointer<ByteVar>())

public actual fun clfsSetEndOfLog(plfolog: COpaquePointer?, plsnend: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsSetEndOfLog(plfolog?.value?.toCPointer<ByteVar>(), plsnend?.value?.toCPointer<ByteVar>())

public actual fun clfsSetLogFileInformation(plfolog: COpaquePointer?, einformationclass: ClsLogInformationClass, pinfobuffer: COpaquePointer?, cbbuffer: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsSetLogFileInformation(plfolog?.value?.toCPointer<ByteVar>(), einformationclass, pinfobuffer?.value?.toCPointer<ByteVar>(), cbbuffer)

public actual fun clfsTerminateReadLog(pvcursorcontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsTerminateReadLog(pvcursorcontext?.value?.toCPointer<ByteVar>())

public actual fun clfsWriteRestartArea(pvmarshalcontext: COpaquePointer?, pvrestartbuffer: COpaquePointer?, cbrestartbuffer: UInt, plsnbase: COpaquePointer?, fflags: UInt, pcbwritten: COpaquePointer?, plsnnext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_clfsWriteRestartArea(pvmarshalcontext?.value?.toCPointer<ByteVar>(), pvrestartbuffer?.value?.toCPointer<ByteVar>(), cbrestartbuffer, plsnbase?.value?.toCPointer<ByteVar>(), fflags, pcbwritten?.value?.toCPointer<ByteVar>(), plsnnext?.value?.toCPointer<ByteVar>())

public actual fun cmCallbackGetKeyObjectID(cookie: COpaquePointer?, obj: COpaquePointer?, objectid: COpaquePointer?, objectname: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectID(cookie?.value?.toCPointer<ByteVar>(), obj?.value?.toCPointer<ByteVar>(), objectid?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>())

public actual fun cmCallbackGetKeyObjectIDEx(cookie: COpaquePointer?, obj: COpaquePointer?, objectid: COpaquePointer?, objectname: COpaquePointer?, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectIDEx(cookie?.value?.toCPointer<ByteVar>(), obj?.value?.toCPointer<ByteVar>(), objectid?.value?.toCPointer<ByteVar>(), objectname?.value?.toCPointer<ByteVar>(), flags)

public actual fun cmCallbackReleaseKeyObjectIDEx(objectname: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_cmCallbackReleaseKeyObjectIDEx(objectname?.value?.toCPointer<ByteVar>())
}

public actual fun cmGetBoundTransaction(cookie: COpaquePointer?, obj: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_cmGetBoundTransaction(cookie?.value?.toCPointer<ByteVar>(), obj?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cmGetCallbackVersion(major: COpaquePointer?, minor: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_cmGetCallbackVersion(major?.value?.toCPointer<ByteVar>(), minor?.value?.toCPointer<ByteVar>())
}

public actual fun cmRegisterCallback(function: PexCallbackFunction, context: COpaquePointer?, cookie: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_cmRegisterCallback(0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), cookie?.value?.toCPointer<ByteVar>())

public actual fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: COpaquePointer?, driver: COpaquePointer?, context: COpaquePointer?, cookie: COpaquePointer?, reserved: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_cmRegisterCallbackEx(0L.toCPointer<ByteVar>(), altitude?.value?.toCPointer<ByteVar>(), driver?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), cookie?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>())

public actual fun cmSetCallbackObjectContext(obj: COpaquePointer?, cookie: COpaquePointer?, newcontext: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_cmSetCallbackObjectContext(obj?.value?.toCPointer<ByteVar>(), cookie?.value?.toCPointer<ByteVar>(), newcontext?.value?.toCPointer<ByteVar>(), oldcontext?.value?.toCPointer<ByteVar>())

public actual fun cmUnRegisterCallback(cookie: Long): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_cmUnRegisterCallback(cookie)

public actual fun dbgBreakPointWithStatus(status: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_dbgBreakPointWithStatus(status)
}

public actual fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_dbgPrint(format?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_dbgPrintEx(componentid, level, format?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_dbgPrintReturnControlC(format?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_dbgPrompt(prompt?.value?.toCPointer<ByteVar>(), response?.value?.toCPointer<ByteVar>(), length)

public actual fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_dbgQueryDebugFilterState(componentid, level)

public actual fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_dbgSetDebugFilterState(componentid, level, state)

public actual fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_dbgSetDebugPrintCallback(0L.toCPointer<ByteVar>(), enable)

public actual fun etwActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_etwActivityIdControl(controlcode, activityid?.value?.toCPointer<ByteVar>())

public actual fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_etwEventEnabled(reghandle, eventdescriptor?.value?.toCPointer<ByteVar>())

public actual fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_etwProviderEnabled(reghandle, level, keyword)

public actual fun etwRegister(providerid: COpaquePointer?, enablecallback: Petwenablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_etwRegister(providerid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>(), reghandle?.value?.toCPointer<ByteVar>())

public actual fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_etwSetInformation(reghandle, informationclass, eventinformation?.value?.toCPointer<ByteVar>(), informationlength)

public actual fun etwUnregister(reghandle: Reghandle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_etwUnregister(reghandle)

public actual fun etwWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_etwWrite(reghandle, eventdescriptor?.value?.toCPointer<ByteVar>(), activityid?.value?.toCPointer<ByteVar>(), userdatacount, userdata?.value?.toCPointer<ByteVar>())

public actual fun etwWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_etwWriteEx(reghandle, eventdescriptor?.value?.toCPointer<ByteVar>(), filter, flags, activityid?.value?.toCPointer<ByteVar>(), relatedactivityid?.value?.toCPointer<ByteVar>(), userdatacount, userdata?.value?.toCPointer<ByteVar>())

public actual fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: COpaquePointer?, string: Pcwstr): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_etwWriteString(reghandle, level, keyword, activityid?.value?.toCPointer<ByteVar>(), string?.value?.toCPointer<ByteVar>())

public actual fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_etwWriteTransfer(reghandle, eventdescriptor?.value?.toCPointer<ByteVar>(), activityid?.value?.toCPointer<ByteVar>(), relatedactivityid?.value?.toCPointer<ByteVar>(), userdatacount, userdata?.value?.toCPointer<ByteVar>())

public actual fun exAcquireFastMutex(fastmutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireFastMutex(fastmutex?.value?.toCPointer<ByteVar>())
}

public actual fun exAcquireFastMutexUnsafe(fastmutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireFastMutexUnsafe(fastmutex?.value?.toCPointer<ByteVar>())
}

public actual fun exAcquirePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquirePushLockExclusiveEx(pushlock?.value?.toCPointer<ByteVar>(), flags)
}

public actual fun exAcquirePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquirePushLockSharedEx(pushlock?.value?.toCPointer<ByteVar>(), flags)
}

public actual fun exAcquireResourceExclusiveLite(resource: COpaquePointer?, wait: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireResourceExclusiveLite(resource?.value?.toCPointer<ByteVar>(), wait)

public actual fun exAcquireResourceSharedLite(resource: COpaquePointer?, wait: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireResourceSharedLite(resource?.value?.toCPointer<ByteVar>(), wait)

public actual fun exAcquireRundownProtection(runref: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtection(runref?.value?.toCPointer<ByteVar>())

public actual fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAware(runrefcacheaware)

public actual fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAwareEx(runrefcacheaware, count)

public actual fun exAcquireRundownProtectionEx(runref: COpaquePointer?, count: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionEx(runref?.value?.toCPointer<ByteVar>(), count)

public actual fun exAcquireSharedStarveExclusive(resource: COpaquePointer?, wait: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireSharedStarveExclusive(resource?.value?.toCPointer<ByteVar>(), wait)

public actual fun exAcquireSharedWaitForExclusive(resource: COpaquePointer?, wait: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireSharedWaitForExclusive(resource?.value?.toCPointer<ByteVar>(), wait)

public actual fun exAcquireSpinLockExclusive(spinlock: COpaquePointer?): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusive(spinlock?.value?.toCPointer<ByteVar>())

public actual fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusiveAtDpcLevel(spinlock?.value?.toCPointer<ByteVar>())
}

public actual fun exAcquireSpinLockShared(spinlock: COpaquePointer?): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockShared(spinlock?.value?.toCPointer<ByteVar>())

public actual fun exAcquireSpinLockSharedAtDpcLevel(spinlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockSharedAtDpcLevel(spinlock?.value?.toCPointer<ByteVar>())
}

public actual fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAllocateCacheAwareRundownProtection(pooltype, pooltag)

public actual fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAllocatePool(pooltype, numberofbytes)?.let { COpaquePointer(it.toLong()) }

public actual fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAllocatePool2(flags, numberofbytes, tag)?.let { COpaquePointer(it.toLong()) }

public actual fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: COpaquePointer?, extendedparameterscount: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAllocatePool3(flags, numberofbytes, tag, extendedparameters?.value?.toCPointer<ByteVar>(), extendedparameterscount)?.let { COpaquePointer(it.toLong()) }

public actual fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuota(pooltype, numberofbytes)?.let { COpaquePointer(it.toLong()) }

public actual fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuotaTag(pooltype, numberofbytes, tag)?.let { COpaquePointer(it.toLong()) }

public actual fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTag(pooltype, numberofbytes, tag)?.let { COpaquePointer(it.toLong()) }

public actual fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTagPriority(pooltype, numberofbytes, tag, priority)?.let { COpaquePointer(it.toLong()) }

public actual fun exAllocateTimer(callback: PextCallback, callbackcontext: COpaquePointer?, attributes: UInt): PexTimer =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exAllocateTimer(0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>(), attributes)

public actual fun exCancelTimer(timer: PexTimer, parameters: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exCancelTimer(timer, parameters?.value?.toCPointer<ByteVar>())

public actual fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exCleanupRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exConvertExclusiveToSharedLite(resource: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exConvertExclusiveToSharedLite(resource?.value?.toCPointer<ByteVar>())
}

public actual fun exCreateCallback(callbackobject: COpaquePointer?, objectattributes: COpaquePointer?, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exCreateCallback(callbackobject?.value?.toCPointer<ByteVar>(), objectattributes?.value?.toCPointer<ByteVar>(), create, allowmultiplecallbacks)

public actual fun exCreatePool(flags: UInt, tag: ULong, params: COpaquePointer?, poolhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exCreatePool(flags, tag, params?.value?.toCPointer<ByteVar>(), poolhandle?.value?.toCPointer<ByteVar>())

public actual fun exDeleteResourceLite(resource: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exDeleteResourceLite(resource?.value?.toCPointer<ByteVar>())

public actual fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exDeleteTimer(timer, cancel, wait, parameters?.value?.toCPointer<ByteVar>())

public actual fun exDestroyPool(poolhandle: Handle) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exDestroyPool(poolhandle?.value?.toCPointer<ByteVar>())
}

public actual fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceExclusive(resource?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun exEnterCriticalRegionAndAcquireResourceShared(resource: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceShared(resource?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exEnumerateSystemFirmwareTables(firmwaretableprovidersignature, firmwaretablebuffer?.value?.toCPointer<ByteVar>(), bufferlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun exExtendZone(zone: COpaquePointer?, segment: COpaquePointer?, segmentsize: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exExtendZone(zone?.value?.toCPointer<ByteVar>(), segment?.value?.toCPointer<ByteVar>(), segmentsize)

public actual fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exFreeCacheAwareRundownProtection(runrefcacheaware)
}

public actual fun exFreePool(p: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exFreePool(p?.value?.toCPointer<ByteVar>())
}

public actual fun exFreePool2(p: COpaquePointer?, tag: UInt, extendedparameters: COpaquePointer?, extendedparameterscount: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exFreePool2(p?.value?.toCPointer<ByteVar>(), tag, extendedparameters?.value?.toCPointer<ByteVar>(), extendedparameterscount)
}

public actual fun exFreePoolWithTag(p: COpaquePointer?, tag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exFreePoolWithTag(p?.value?.toCPointer<ByteVar>(), tag)
}

public actual fun exGetExclusiveWaiterCount(resource: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exGetExclusiveWaiterCount(resource?.value?.toCPointer<ByteVar>())

public actual fun exGetFirmwareEnvironmentVariable(variablename: COpaquePointer?, vendorguid: COpaquePointer?, value: COpaquePointer?, valuelength: COpaquePointer?, attributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exGetFirmwareEnvironmentVariable(variablename?.value?.toCPointer<ByteVar>(), vendorguid?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), valuelength?.value?.toCPointer<ByteVar>(), attributes?.value?.toCPointer<ByteVar>())

public actual fun exGetFirmwareType(): FirmwareType =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exGetFirmwareType()

public actual fun exGetPreviousMode(): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exGetPreviousMode()

public actual fun exGetSharedWaiterCount(resource: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exGetSharedWaiterCount(resource?.value?.toCPointer<ByteVar>())

public actual fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exGetSystemFirmwareTable(firmwaretableprovidersignature, firmwaretableid, firmwaretablebuffer?.value?.toCPointer<ByteVar>(), bufferlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun exInitializePushLock(pushlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exInitializePushLock(pushlock?.value?.toCPointer<ByteVar>())
}

public actual fun exInitializeResourceLite(resource: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exInitializeResourceLite(resource?.value?.toCPointer<ByteVar>())

public actual fun exInitializeRundownProtection(runref: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exInitializeRundownProtection(runref?.value?.toCPointer<ByteVar>())
}

public actual fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAware(runrefcacheaware, runrefsize)
}

public actual fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAwareEx(runrefcacheaware, flags)
}

public actual fun exInitializeZone(zone: COpaquePointer?, blocksize: UInt, initialsegment: COpaquePointer?, initialsegmentsize: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exInitializeZone(zone?.value?.toCPointer<ByteVar>(), blocksize, initialsegment?.value?.toCPointer<ByteVar>(), initialsegmentsize)

public actual fun exInterlockedAddLargeInteger(addend: COpaquePointer?, increment: Long, lock: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exInterlockedAddLargeInteger(addend?.value?.toCPointer<ByteVar>(), increment, lock?.value?.toCPointer<ByteVar>())

public actual fun exInterlockedExtendZone(zone: COpaquePointer?, segment: COpaquePointer?, segmentsize: UInt, lock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exInterlockedExtendZone(zone?.value?.toCPointer<ByteVar>(), segment?.value?.toCPointer<ByteVar>(), segmentsize, lock?.value?.toCPointer<ByteVar>())

public actual fun exIsManufacturingModeEnabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exIsManufacturingModeEnabled()

public actual fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exIsProcessorFeaturePresent(processorfeature)

public actual fun exIsResourceAcquiredExclusiveLite(resource: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredExclusiveLite(resource?.value?.toCPointer<ByteVar>())

public actual fun exIsResourceAcquiredSharedLite(resource: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredSharedLite(resource?.value?.toCPointer<ByteVar>())

public actual fun exIsSoftBoot(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exIsSoftBoot()

public actual fun exLocalTimeToSystemTime(localtime: COpaquePointer?, systemtime: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exLocalTimeToSystemTime(localtime?.value?.toCPointer<ByteVar>(), systemtime?.value?.toCPointer<ByteVar>())
}

public actual fun exNotifyCallback(callbackobject: COpaquePointer?, argument1: COpaquePointer?, argument2: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exNotifyCallback(callbackobject?.value?.toCPointer<ByteVar>(), argument1?.value?.toCPointer<ByteVar>(), argument2?.value?.toCPointer<ByteVar>())
}

public actual fun exQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exQueryTimerResolution(maximumtime?.value?.toCPointer<ByteVar>(), minimumtime?.value?.toCPointer<ByteVar>(), currenttime?.value?.toCPointer<ByteVar>())
}

public actual fun exQueueWorkItem(workitem: COpaquePointer?, queuetype: WorkQueueType) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exQueueWorkItem(workitem?.value?.toCPointer<ByteVar>(), queuetype)
}

public actual fun exRaiseAccessViolation() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exRaiseAccessViolation()
}

public actual fun exRaiseDatatypeMisalignment() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exRaiseDatatypeMisalignment()
}

public actual fun exRaiseStatus(status: Ntstatus) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exRaiseStatus(status)
}

public actual fun exReInitializeRundownProtection(runref: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtection(runref?.value?.toCPointer<ByteVar>())
}

public actual fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exRegisterCallback(callbackobject, 0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun exReinitializeResourceLite(resource: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReinitializeResourceLite(resource?.value?.toCPointer<ByteVar>())

public actual fun exReleaseFastMutex(fastmutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseFastMutex(fastmutex?.value?.toCPointer<ByteVar>())
}

public actual fun exReleaseFastMutexUnsafe(fastmutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseFastMutexUnsafe(fastmutex?.value?.toCPointer<ByteVar>())
}

public actual fun exReleasePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleasePushLockExclusiveEx(pushlock?.value?.toCPointer<ByteVar>(), flags)
}

public actual fun exReleasePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleasePushLockSharedEx(pushlock?.value?.toCPointer<ByteVar>(), flags)
}

public actual fun exReleaseResourceAndLeaveCriticalRegion(resource: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseResourceAndLeaveCriticalRegion(resource?.value?.toCPointer<ByteVar>())
}

public actual fun exReleaseResourceForThreadLite(resource: COpaquePointer?, resourcethreadid: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseResourceForThreadLite(resource?.value?.toCPointer<ByteVar>(), resourcethreadid)
}

public actual fun exReleaseResourceLite(resource: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseResourceLite(resource?.value?.toCPointer<ByteVar>())
}

public actual fun exReleaseRundownProtection(runref: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtection(runref?.value?.toCPointer<ByteVar>())
}

public actual fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAwareEx(runref, count)
}

public actual fun exReleaseRundownProtectionEx(runref: COpaquePointer?, count: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionEx(runref?.value?.toCPointer<ByteVar>(), count)
}

public actual fun exReleaseSpinLockExclusive(spinlock: COpaquePointer?, oldirql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusive(spinlock?.value?.toCPointer<ByteVar>(), oldirql)
}

public actual fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusiveFromDpcLevel(spinlock?.value?.toCPointer<ByteVar>())
}

public actual fun exReleaseSpinLockShared(spinlock: COpaquePointer?, oldirql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockShared(spinlock?.value?.toCPointer<ByteVar>(), oldirql)
}

public actual fun exReleaseSpinLockSharedFromDpcLevel(spinlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockSharedFromDpcLevel(spinlock?.value?.toCPointer<ByteVar>())
}

public actual fun exRundownCompleted(runref: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exRundownCompleted(runref?.value?.toCPointer<ByteVar>())
}

public actual fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exRundownCompletedCacheAware(runrefcacheaware)
}

public actual fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: COpaquePointer?, cookie: ULong, offset: ULong, size: ULong, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exSecurePoolUpdate(securepoolhandle?.value?.toCPointer<ByteVar>(), tag, allocation?.value?.toCPointer<ByteVar>(), cookie, offset, size, buffer?.value?.toCPointer<ByteVar>())

public actual fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: COpaquePointer?, cookie: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exSecurePoolValidate(securepoolhandle?.value?.toCPointer<ByteVar>(), tag, allocation?.value?.toCPointer<ByteVar>(), cookie)

public actual fun exSetFirmwareEnvironmentVariable(variablename: COpaquePointer?, vendorguid: COpaquePointer?, value: COpaquePointer?, valuelength: UInt, attributes: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exSetFirmwareEnvironmentVariable(variablename?.value?.toCPointer<ByteVar>(), vendorguid?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), valuelength, attributes)

public actual fun exSetResourceOwnerPointer(resource: COpaquePointer?, ownerpointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointer(resource?.value?.toCPointer<ByteVar>(), ownerpointer?.value?.toCPointer<ByteVar>())
}

public actual fun exSetResourceOwnerPointerEx(resource: COpaquePointer?, ownerpointer: COpaquePointer?, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointerEx(resource?.value?.toCPointer<ByteVar>(), ownerpointer?.value?.toCPointer<ByteVar>(), flags)
}

public actual fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exSetTimer(timer, duetime, period, parameters?.value?.toCPointer<ByteVar>())

public actual fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exSetTimerResolution(desiredtime, setresolution)

public actual fun exSizeOfRundownProtectionCacheAware(): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exSizeOfRundownProtectionCacheAware()

public actual fun exSystemTimeToLocalTime(systemtime: COpaquePointer?, localtime: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exSystemTimeToLocalTime(systemtime?.value?.toCPointer<ByteVar>(), localtime?.value?.toCPointer<ByteVar>())
}

public actual fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock?.value?.toCPointer<ByteVar>())

public actual fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockSharedAtDpcLevel(spinlock?.value?.toCPointer<ByteVar>())

public actual fun exTryConvertSharedSpinLockExclusive(spinlock: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exTryConvertSharedSpinLockExclusive(spinlock?.value?.toCPointer<ByteVar>())

public actual fun exTryToAcquireFastMutex(fastmutex: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exTryToAcquireFastMutex(fastmutex?.value?.toCPointer<ByteVar>())

public actual fun exUnregisterCallback(callbackregistration: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exUnregisterCallback(callbackregistration?.value?.toCPointer<ByteVar>())
}

public actual fun exUuidCreate(uuid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exUuidCreate(uuid?.value?.toCPointer<ByteVar>())

public actual fun exVerifySuite(suitetype: SuiteType): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exVerifySuite(suitetype)

public actual fun exWaitForRundownProtectionRelease(runref: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionRelease(runref?.value?.toCPointer<ByteVar>())
}

public actual fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionReleaseCacheAware(runref)
}

public actual fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_fsRtlIsTotalDeviceFailure(status)

public actual fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halAcquireDisplayOwnership(0L.toCPointer<ByteVar>())
}

public actual fun halAllocateAdapterChannel(adapterobject: COpaquePointer?, wcb: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus =
    0

public actual fun halAllocateCommonBuffer(adapterobject: COpaquePointer?, length: UInt, logicaladdress: COpaquePointer?, cacheenabled: Boolean): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halAllocateCommonBuffer(adapterobject?.value?.toCPointer<ByteVar>(), length, logicaladdress?.value?.toCPointer<ByteVar>(), cacheenabled)?.let { COpaquePointer(it.toLong()) }

public actual fun halAllocateCrashDumpRegisters(adapterobject: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halAllocateCrashDumpRegisters(adapterobject?.value?.toCPointer<ByteVar>(), numberofmapregisters?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun halAllocateHardwareCounters(groupaffinty: COpaquePointer?, groupcount: UInt, resourcelist: COpaquePointer?, countersethandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halAllocateHardwareCounters(groupaffinty?.value?.toCPointer<ByteVar>(), groupcount, resourcelist?.value?.toCPointer<ByteVar>(), countersethandle?.value?.toCPointer<ByteVar>())

public actual fun halAssignSlotResources(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halAssignSlotResources(registrypath?.value?.toCPointer<ByteVar>(), driverclassname?.value?.toCPointer<ByteVar>(), driverobject?.value?.toCPointer<ByteVar>(), deviceobject?.value?.toCPointer<ByteVar>(), bustype, busnumber, slotnumber, allocatedresources?.value?.toCPointer<ByteVar>())

public actual fun halBugCheckSystem(errorsource: COpaquePointer?, errorrecord: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halBugCheckSystem(errorsource?.value?.toCPointer<ByteVar>(), errorrecord?.value?.toCPointer<ByteVar>())
}

public actual fun halDmaAllocateCrashDumpRegistersEx(adapter: COpaquePointer?, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: COpaquePointer?, mapregistersavailable: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halDmaAllocateCrashDumpRegistersEx(adapter?.value?.toCPointer<ByteVar>(), numberofmapregisters, type, mapregisterbase?.value?.toCPointer<ByteVar>(), mapregistersavailable?.value?.toCPointer<ByteVar>())

public actual fun halDmaFreeCrashDumpRegistersEx(adapter: COpaquePointer?, type: HalDmaCrashDumpRegisterType): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halDmaFreeCrashDumpRegistersEx(adapter?.value?.toCPointer<ByteVar>(), type)

public actual fun halExamineMBR(deviceobject: COpaquePointer?, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halExamineMBR(deviceobject?.value?.toCPointer<ByteVar>(), sectorsize, mbrtypeidentifier, buffer?.value?.toCPointer<ByteVar>())
}

public actual fun halFreeCommonBuffer(adapterobject: COpaquePointer?, length: UInt, logicaladdress: Long, virtualaddress: COpaquePointer?, cacheenabled: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halFreeCommonBuffer(adapterobject?.value?.toCPointer<ByteVar>(), length, logicaladdress, virtualaddress?.value?.toCPointer<ByteVar>(), cacheenabled)
}

public actual fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halFreeHardwareCounters(countersethandle?.value?.toCPointer<ByteVar>())

public actual fun halGetAdapter(devicedescription: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halGetAdapter(devicedescription?.value?.toCPointer<ByteVar>(), numberofmapregisters?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halGetBusData(busdatatype, busnumber, slotnumber, buffer?.value?.toCPointer<ByteVar>(), length)

public actual fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halGetBusDataByOffset(busdatatype, busnumber, slotnumber, buffer?.value?.toCPointer<ByteVar>(), offset, length)

public actual fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: COpaquePointer?, affinity: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halGetInterruptVector(interfacetype, busnumber, businterruptlevel, businterruptvector, irql?.value?.toCPointer<ByteVar>(), affinity?.value?.toCPointer<ByteVar>())

public actual fun halMakeBeep(frequency: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halMakeBeep(frequency)

public actual fun halReadDmaCounter(adapterobject: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halReadDmaCounter(adapterobject?.value?.toCPointer<ByteVar>())

public actual fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halSetBusData(busdatatype, busnumber, slotnumber, buffer?.value?.toCPointer<ByteVar>(), length)

public actual fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halSetBusDataByOffset(busdatatype, busnumber, slotnumber, buffer?.value?.toCPointer<ByteVar>(), offset, length)

public actual fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_halTranslateBusAddress(interfacetype, busnumber, busaddress, addressspace?.value?.toCPointer<ByteVar>(), translatedaddress?.value?.toCPointer<ByteVar>())

public actual fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_hvlRegisterWheaErrorNotification(0L.toCPointer<ByteVar>())

public actual fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_hvlUnregisterWheaErrorNotification(0L.toCPointer<ByteVar>())

public actual fun ioAcquireCancelSpinLock(irql: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAcquireCancelSpinLock(irql?.value?.toCPointer<ByteVar>())
}

public actual fun ioAcquireKsrPersistentMemory(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, buffer: COpaquePointer?, size: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemory(driverobject?.value?.toCPointer<ByteVar>(), physicaldeviceobject?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun ioAcquireKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, buffer: COpaquePointer?, size: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemoryEx(driverobject?.value?.toCPointer<ByteVar>(), physicaldeviceobject?.value?.toCPointer<ByteVar>(), physicaldeviceid?.value?.toCPointer<ByteVar>(), datatag?.value?.toCPointer<ByteVar>(), dataversion?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun ioAcquireRemoveLockEx(removelock: COpaquePointer?, tag: COpaquePointer?, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAcquireRemoveLockEx(removelock?.value?.toCPointer<ByteVar>(), tag?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), line, remlocksize)

public actual fun ioAllocateAdapterChannel(adapterobject: COpaquePointer?, deviceobject: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl, context: COpaquePointer?): Ntstatus =
    0

public actual fun ioAllocateController(controllerobject: COpaquePointer?, deviceobject: COpaquePointer?, executionroutine: DriverControl, context: COpaquePointer?) {
}

public actual fun ioAllocateDriverObjectExtension(driverobject: COpaquePointer?, clientidentificationaddress: COpaquePointer?, driverobjectextensionsize: UInt, driverobjectextension: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAllocateDriverObjectExtension(driverobject?.value?.toCPointer<ByteVar>(), clientidentificationaddress?.value?.toCPointer<ByteVar>(), driverobjectextensionsize, driverobjectextension?.value?.toCPointer<ByteVar>())

public actual fun ioAllocateErrorLogEntry(ioobject: COpaquePointer?, entrysize: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAllocateErrorLogEntry(ioobject?.value?.toCPointer<ByteVar>(), entrysize)?.let { COpaquePointer(it.toLong()) }

public actual fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAllocateIrp(stacksize, chargequota)?.let { COpaquePointer(it.toLong()) }

public actual fun ioAllocateIrpEx(deviceobject: COpaquePointer?, stacksize: Byte, chargequota: Boolean): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAllocateIrpEx(deviceobject?.value?.toCPointer<ByteVar>(), stacksize, chargequota)?.let { COpaquePointer(it.toLong()) }

public actual fun ioAllocateMdl(virtualaddress: COpaquePointer?, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAllocateMdl(virtualaddress?.value?.toCPointer<ByteVar>(), length, secondarybuffer, chargequota, irp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioAllocateSfioStreamIdentifier(fileobject: COpaquePointer?, length: UInt, signature: COpaquePointer?, streamidentifier: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAllocateSfioStreamIdentifier(fileobject?.value?.toCPointer<ByteVar>(), length, signature?.value?.toCPointer<ByteVar>(), streamidentifier?.value?.toCPointer<ByteVar>())

public actual fun ioAllocateWorkItem(deviceobject: COpaquePointer?): PioWorkitem =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAllocateWorkItem(deviceobject?.value?.toCPointer<ByteVar>())

public actual fun ioAssignResources(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, requestedresources: COpaquePointer?, allocatedresources: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAssignResources(registrypath?.value?.toCPointer<ByteVar>(), driverclassname?.value?.toCPointer<ByteVar>(), driverobject?.value?.toCPointer<ByteVar>(), deviceobject?.value?.toCPointer<ByteVar>(), requestedresources?.value?.toCPointer<ByteVar>(), allocatedresources?.value?.toCPointer<ByteVar>())

public actual fun ioAttachDevice(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?, attacheddevice: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAttachDevice(sourcedevice?.value?.toCPointer<ByteVar>(), targetdevice?.value?.toCPointer<ByteVar>(), attacheddevice?.value?.toCPointer<ByteVar>())

public actual fun ioAttachDeviceByPointer(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAttachDeviceByPointer(sourcedevice?.value?.toCPointer<ByteVar>(), targetdevice?.value?.toCPointer<ByteVar>())

public actual fun ioAttachDeviceToDeviceStack(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStack(sourcedevice?.value?.toCPointer<ByteVar>(), targetdevice?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioAttachDeviceToDeviceStackSafe(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?, attachedtodeviceobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStackSafe(sourcedevice?.value?.toCPointer<ByteVar>(), targetdevice?.value?.toCPointer<ByteVar>(), attachedtodeviceobject?.value?.toCPointer<ByteVar>())

public actual fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt, startingoffset: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioBuildAsynchronousFsdRequest(majorfunction, deviceobject?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), length, startingoffset?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: COpaquePointer?, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioBuildDeviceIoControlRequest(iocontrolcode, deviceobject?.value?.toCPointer<ByteVar>(), inputbuffer?.value?.toCPointer<ByteVar>(), inputbufferlength, outputbuffer?.value?.toCPointer<ByteVar>(), outputbufferlength, internaldeviceiocontrol, event?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioBuildPartialMdl(sourcemdl: COpaquePointer?, targetmdl: COpaquePointer?, virtualaddress: COpaquePointer?, length: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioBuildPartialMdl(sourcemdl?.value?.toCPointer<ByteVar>(), targetmdl?.value?.toCPointer<ByteVar>(), virtualaddress?.value?.toCPointer<ByteVar>(), length)
}

public actual fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioBuildSynchronousFsdRequest(majorfunction, deviceobject?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), length, startingoffset?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioCancelFileOpen(deviceobject: COpaquePointer?, fileobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCancelFileOpen(deviceobject?.value?.toCPointer<ByteVar>(), fileobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioCancelIrp(irp: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCancelIrp(irp?.value?.toCPointer<ByteVar>())

public actual fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCheckLinkShareAccess(desiredaccess, desiredshareaccess, fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>(), linkshareaccess?.value?.toCPointer<ByteVar>(), ioshareaccessflags)

public actual fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, update: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCheckShareAccess(desiredaccess, desiredshareaccess, fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>(), update)

public actual fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, update: Boolean, writepermission: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCheckShareAccessEx(desiredaccess, desiredshareaccess, fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>(), update, writepermission?.value?.toCPointer<ByteVar>())

public actual fun ioCleanupIrp(irp: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCleanupIrp(irp?.value?.toCPointer<ByteVar>())
}

public actual fun ioClearActivityIdThread(originalid: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioClearActivityIdThread(originalid?.value?.toCPointer<ByteVar>())
}

public actual fun ioClearIrpExtraCreateParameter(irp: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioClearIrpExtraCreateParameter(irp?.value?.toCPointer<ByteVar>())
}

public actual fun ioConnectInterrupt(interruptobject: COpaquePointer?, serviceroutine: PkserviceRoutine, servicecontext: COpaquePointer?, spinlock: COpaquePointer?, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioConnectInterrupt(interruptobject?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), servicecontext?.value?.toCPointer<ByteVar>(), spinlock?.value?.toCPointer<ByteVar>(), vector, irql, synchronizeirql, interruptmode, sharevector, processorenablemask, floatingsave)

public actual fun ioConnectInterruptEx(parameters: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioConnectInterruptEx(parameters?.value?.toCPointer<ByteVar>())

public actual fun ioCreateController(size: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateController(size)?.let { COpaquePointer(it.toLong()) }

public actual fun ioCreateDevice(driverobject: COpaquePointer?, deviceextensionsize: UInt, devicename: COpaquePointer?, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateDevice(driverobject?.value?.toCPointer<ByteVar>(), deviceextensionsize, devicename?.value?.toCPointer<ByteVar>(), devicetype, devicecharacteristics, exclusive, deviceobject?.value?.toCPointer<ByteVar>())

public actual fun ioCreateDisk(deviceobject: COpaquePointer?, disk: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateDisk(deviceobject?.value?.toCPointer<ByteVar>(), disk?.value?.toCPointer<ByteVar>())

public actual fun ioCreateFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateFile(filehandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), allocationsize?.value?.toCPointer<ByteVar>(), fileattributes, shareaccess, disposition, createoptions, eabuffer?.value?.toCPointer<ByteVar>(), ealength, createfiletype, internalparameters?.value?.toCPointer<ByteVar>(), options)

public actual fun ioCreateFileEx(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt, drivercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateFileEx(filehandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), allocationsize?.value?.toCPointer<ByteVar>(), fileattributes, shareaccess, disposition, createoptions, eabuffer?.value?.toCPointer<ByteVar>(), ealength, createfiletype, internalparameters?.value?.toCPointer<ByteVar>(), options, drivercontext?.value?.toCPointer<ByteVar>())

public actual fun ioCreateFileSpecifyDeviceObjectHint(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt, deviceobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateFileSpecifyDeviceObjectHint(filehandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), allocationsize?.value?.toCPointer<ByteVar>(), fileattributes, shareaccess, disposition, createoptions, eabuffer?.value?.toCPointer<ByteVar>(), ealength, createfiletype, internalparameters?.value?.toCPointer<ByteVar>(), options, deviceobject?.value?.toCPointer<ByteVar>())

public actual fun ioCreateNotificationEvent(eventname: COpaquePointer?, eventhandle: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateNotificationEvent(eventname?.value?.toCPointer<ByteVar>(), eventhandle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioCreateSymbolicLink(symboliclinkname: COpaquePointer?, devicename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateSymbolicLink(symboliclinkname?.value?.toCPointer<ByteVar>(), devicename?.value?.toCPointer<ByteVar>())

public actual fun ioCreateSynchronizationEvent(eventname: COpaquePointer?, eventhandle: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateSynchronizationEvent(eventname?.value?.toCPointer<ByteVar>(), eventhandle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioCreateSystemThread(ioobject: COpaquePointer?, threadhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, processhandle: Handle, clientid: COpaquePointer?, startroutine: PkstartRoutine, startcontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateSystemThread(ioobject?.value?.toCPointer<ByteVar>(), threadhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), processhandle?.value?.toCPointer<ByteVar>(), clientid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), startcontext?.value?.toCPointer<ByteVar>())

public actual fun ioCreateUnprotectedSymbolicLink(symboliclinkname: COpaquePointer?, devicename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCreateUnprotectedSymbolicLink(symboliclinkname?.value?.toCPointer<ByteVar>(), devicename?.value?.toCPointer<ByteVar>())

public actual fun ioCsqInitialize(csq: COpaquePointer?, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCsqInitialize(csq?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun ioCsqInitializeEx(csq: COpaquePointer?, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCsqInitializeEx(csq?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun ioCsqInsertIrp(csq: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCsqInsertIrp(csq?.value?.toCPointer<ByteVar>(), irp?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())
}

public actual fun ioCsqInsertIrpEx(csq: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCsqInsertIrpEx(csq?.value?.toCPointer<ByteVar>(), irp?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), insertcontext?.value?.toCPointer<ByteVar>())

public actual fun ioCsqRemoveIrp(csq: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCsqRemoveIrp(csq?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioCsqRemoveNextIrp(csq: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioCsqRemoveNextIrp(csq?.value?.toCPointer<ByteVar>(), peekcontext?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioDecrementKeepAliveCount(fileobject: COpaquePointer?, process: Peprocess): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioDecrementKeepAliveCount(fileobject?.value?.toCPointer<ByteVar>(), process)

public actual fun ioDeleteController(controllerobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioDeleteController(controllerobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioDeleteDevice(deviceobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioDeleteDevice(deviceobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioDeleteSymbolicLink(symboliclinkname: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioDeleteSymbolicLink(symboliclinkname?.value?.toCPointer<ByteVar>())

public actual fun ioDetachDevice(targetdevice: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioDetachDevice(targetdevice?.value?.toCPointer<ByteVar>())
}

public actual fun ioDisconnectInterrupt(interruptobject: Pkinterrupt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioDisconnectInterrupt(interruptobject)
}

public actual fun ioDisconnectInterruptEx(parameters: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioDisconnectInterruptEx(parameters?.value?.toCPointer<ByteVar>())
}

public actual fun ioEnumerateKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioEnumerateKsrPersistentMemoryEx(driverobject?.value?.toCPointer<ByteVar>(), physicaldeviceobject?.value?.toCPointer<ByteVar>(), physicaldeviceid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>())

public actual fun ioFlushAdapterBuffers(adapterobject: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: UInt, writetodevice: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioFlushAdapterBuffers(adapterobject?.value?.toCPointer<ByteVar>(), mdl?.value?.toCPointer<ByteVar>(), mapregisterbase?.value?.toCPointer<ByteVar>(), currentva?.value?.toCPointer<ByteVar>(), length, writetodevice)

public actual fun ioForwardIrpSynchronously(deviceobject: COpaquePointer?, irp: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioForwardIrpSynchronously(deviceobject?.value?.toCPointer<ByteVar>(), irp?.value?.toCPointer<ByteVar>())

public actual fun ioFreeAdapterChannel(adapterobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioFreeAdapterChannel(adapterobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioFreeController(controllerobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioFreeController(controllerobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioFreeErrorLogEntry(elentry: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioFreeErrorLogEntry(elentry?.value?.toCPointer<ByteVar>())
}

public actual fun ioFreeIrp(irp: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioFreeIrp(irp?.value?.toCPointer<ByteVar>())
}

public actual fun ioFreeKsrPersistentMemory(datahandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioFreeKsrPersistentMemory(datahandle?.value?.toCPointer<ByteVar>())

public actual fun ioFreeMapRegisters(adapterobject: COpaquePointer?, mapregisterbase: COpaquePointer?, numberofmapregisters: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioFreeMapRegisters(adapterobject?.value?.toCPointer<ByteVar>(), mapregisterbase?.value?.toCPointer<ByteVar>(), numberofmapregisters)
}

public actual fun ioFreeMdl(mdl: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioFreeMdl(mdl?.value?.toCPointer<ByteVar>())
}

public actual fun ioFreeSfioStreamIdentifier(fileobject: COpaquePointer?, signature: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioFreeSfioStreamIdentifier(fileobject?.value?.toCPointer<ByteVar>(), signature?.value?.toCPointer<ByteVar>())

public actual fun ioFreeWorkItem(ioworkitem: PioWorkitem) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioFreeWorkItem(ioworkitem)
}

public actual fun ioGetActivityIdIrp(irp: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetActivityIdIrp(irp?.value?.toCPointer<ByteVar>(), guid?.value?.toCPointer<ByteVar>())

public actual fun ioGetActivityIdThread(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetActivityIdThread()?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetAffinityInterrupt(interruptobject, groupaffinity?.value?.toCPointer<ByteVar>())

public actual fun ioGetAttachedDeviceReference(deviceobject: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetAttachedDeviceReference(deviceobject?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetBootDiskInformation(bootdiskinformation: COpaquePointer?, size: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformation(bootdiskinformation?.value?.toCPointer<ByteVar>(), size)

public actual fun ioGetBootDiskInformationLite(bootdiskinformation: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformationLite(bootdiskinformation?.value?.toCPointer<ByteVar>())

public actual fun ioGetConfigurationInformation(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetConfigurationInformation()?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetContainerInformation(informationclass, containerobject?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferlength)

public actual fun ioGetCurrentProcess(): Peprocess =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetCurrentProcess()

public actual fun ioGetDeviceDirectory(physicaldeviceobject: COpaquePointer?, directorytype: DeviceDirectoryType, flags: UInt, reserved: COpaquePointer?, devicedirectoryhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDeviceDirectory(physicaldeviceobject?.value?.toCPointer<ByteVar>(), directorytype, flags, reserved?.value?.toCPointer<ByteVar>(), devicedirectoryhandle?.value?.toCPointer<ByteVar>())

public actual fun ioGetDeviceInterfaceAlias(symboliclinkname: COpaquePointer?, aliasinterfaceclassguid: COpaquePointer?, aliassymboliclinkname: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaceAlias(symboliclinkname?.value?.toCPointer<ByteVar>(), aliasinterfaceclassguid?.value?.toCPointer<ByteVar>(), aliassymboliclinkname?.value?.toCPointer<ByteVar>())

public actual fun ioGetDeviceInterfacePropertyData(symboliclinkname: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, size: UInt, data: COpaquePointer?, requiredsize: COpaquePointer?, type: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfacePropertyData(symboliclinkname?.value?.toCPointer<ByteVar>(), propertykey?.value?.toCPointer<ByteVar>(), lcid, flags, size, data?.value?.toCPointer<ByteVar>(), requiredsize?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>())

public actual fun ioGetDeviceInterfaces(interfaceclassguid: COpaquePointer?, physicaldeviceobject: COpaquePointer?, flags: UInt, symboliclinklist: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaces(interfaceclassguid?.value?.toCPointer<ByteVar>(), physicaldeviceobject?.value?.toCPointer<ByteVar>(), flags, symboliclinklist?.value?.toCPointer<ByteVar>())

public actual fun ioGetDeviceNumaNode(pdo: COpaquePointer?, nodenumber: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDeviceNumaNode(pdo?.value?.toCPointer<ByteVar>(), nodenumber?.value?.toCPointer<ByteVar>())

public actual fun ioGetDeviceObjectPointer(objectname: COpaquePointer?, desiredaccess: UInt, fileobject: COpaquePointer?, deviceobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDeviceObjectPointer(objectname?.value?.toCPointer<ByteVar>(), desiredaccess, fileobject?.value?.toCPointer<ByteVar>(), deviceobject?.value?.toCPointer<ByteVar>())

public actual fun ioGetDeviceProperty(deviceobject: COpaquePointer?, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: COpaquePointer?, resultlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDeviceProperty(deviceobject?.value?.toCPointer<ByteVar>(), deviceproperty, bufferlength, propertybuffer?.value?.toCPointer<ByteVar>(), resultlength?.value?.toCPointer<ByteVar>())

public actual fun ioGetDevicePropertyData(pdo: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, size: UInt, data: COpaquePointer?, requiredsize: COpaquePointer?, type: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDevicePropertyData(pdo?.value?.toCPointer<ByteVar>(), propertykey?.value?.toCPointer<ByteVar>(), lcid, flags, size, data?.value?.toCPointer<ByteVar>(), requiredsize?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>())

public actual fun ioGetDmaAdapter(physicaldeviceobject: COpaquePointer?, devicedescription: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDmaAdapter(physicaldeviceobject?.value?.toCPointer<ByteVar>(), devicedescription?.value?.toCPointer<ByteVar>(), numberofmapregisters?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetDriverDirectory(driverobject: COpaquePointer?, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDriverDirectory(driverobject?.value?.toCPointer<ByteVar>(), directorytype, flags, driverdirectoryhandle?.value?.toCPointer<ByteVar>())

public actual fun ioGetDriverObjectExtension(driverobject: COpaquePointer?, clientidentificationaddress: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetDriverObjectExtension(driverobject?.value?.toCPointer<ByteVar>(), clientidentificationaddress?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetFileObjectGenericMapping(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetFileObjectGenericMapping()?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetFsZeroingOffset(irp: COpaquePointer?, zeroingoffset: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetFsZeroingOffset(irp?.value?.toCPointer<ByteVar>(), zeroingoffset?.value?.toCPointer<ByteVar>())

public actual fun ioGetInitialStack(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetInitialStack()?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetInitiatorProcess(fileobject: COpaquePointer?): Peprocess =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetInitiatorProcess(fileobject?.value?.toCPointer<ByteVar>())

public actual fun ioGetIoAttributionHandle(irp: COpaquePointer?, ioattributionhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetIoAttributionHandle(irp?.value?.toCPointer<ByteVar>(), ioattributionhandle?.value?.toCPointer<ByteVar>())

public actual fun ioGetIoPriorityHint(irp: COpaquePointer?): IoPriorityHint =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetIoPriorityHint(irp?.value?.toCPointer<ByteVar>())

public actual fun ioGetIommuInterface(version: UInt, interfaceout: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetIommuInterface(version, interfaceout?.value?.toCPointer<ByteVar>())

public actual fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetIommuInterfaceEx(version, flags, interfaceout?.value?.toCPointer<ByteVar>())

public actual fun ioGetIrpExtraCreateParameter(irp: COpaquePointer?, extracreateparameter: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetIrpExtraCreateParameter(irp?.value?.toCPointer<ByteVar>(), extracreateparameter?.value?.toCPointer<ByteVar>())

public actual fun ioGetPagingIoPriority(irp: COpaquePointer?): IoPagingPriority =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetPagingIoPriority(irp?.value?.toCPointer<ByteVar>())

public actual fun ioGetRelatedDeviceObject(fileobject: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetRelatedDeviceObject(fileobject?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetSfioStreamIdentifier(fileobject: COpaquePointer?, signature: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetSfioStreamIdentifier(fileobject?.value?.toCPointer<ByteVar>(), signature?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetSilo(fileobject: COpaquePointer?): Pesilo =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetSilo(fileobject?.value?.toCPointer<ByteVar>())

public actual fun ioGetSiloParameters(fileobject: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetSiloParameters(fileobject?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetStackLimits(lowlimit: COpaquePointer?, highlimit: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetStackLimits(lowlimit?.value?.toCPointer<ByteVar>(), highlimit?.value?.toCPointer<ByteVar>())
}

public actual fun ioGetTopLevelIrp(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetTopLevelIrp()?.let { COpaquePointer(it.toLong()) }

public actual fun ioGetTransactionParameterBlock(fileobject: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioGetTransactionParameterBlock(fileobject?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioIncrementKeepAliveCount(fileobject: COpaquePointer?, process: Peprocess): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioIncrementKeepAliveCount(fileobject?.value?.toCPointer<ByteVar>(), process)

public actual fun ioInitializeIrp(irp: COpaquePointer?, packetsize: UShort, stacksize: Byte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioInitializeIrp(irp?.value?.toCPointer<ByteVar>(), packetsize, stacksize)
}

public actual fun ioInitializeIrpEx(irp: COpaquePointer?, deviceobject: COpaquePointer?, packetsize: UShort, stacksize: Byte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioInitializeIrpEx(irp?.value?.toCPointer<ByteVar>(), deviceobject?.value?.toCPointer<ByteVar>(), packetsize, stacksize)
}

public actual fun ioInitializeRemoveLockEx(lock: COpaquePointer?, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioInitializeRemoveLockEx(lock?.value?.toCPointer<ByteVar>(), allocatetag, maxlockedminutes, highwatermark, remlocksize)
}

public actual fun ioInitializeTimer(deviceobject: COpaquePointer?, timerroutine: PioTimerRoutine, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioInitializeTimer(deviceobject?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun ioInitializeWorkItem(ioobject: COpaquePointer?, ioworkitem: PioWorkitem) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioInitializeWorkItem(ioobject?.value?.toCPointer<ByteVar>(), ioworkitem)
}

public actual fun ioInvalidateDeviceRelations(deviceobject: COpaquePointer?, type: DeviceRelationType) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceRelations(deviceobject?.value?.toCPointer<ByteVar>(), type)
}

public actual fun ioInvalidateDeviceState(physicaldeviceobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceState(physicaldeviceobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioIs32bitProcess(irp: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioIs32bitProcess(irp?.value?.toCPointer<ByteVar>())

public actual fun ioIsFileObjectIgnoringSharing(fileobject: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioIsFileObjectIgnoringSharing(fileobject?.value?.toCPointer<ByteVar>())

public actual fun ioIsFileOriginRemote(fileobject: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioIsFileOriginRemote(fileobject?.value?.toCPointer<ByteVar>())

public actual fun ioIsInitiator32bitProcess(irp: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioIsInitiator32bitProcess(irp?.value?.toCPointer<ByteVar>())

public actual fun ioIsValidIrpStatus(status: Ntstatus): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioIsValidIrpStatus(status)

public actual fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioIsWdmVersionAvailable(majorversion, minorversion)

public actual fun ioMakeAssociatedIrp(irp: COpaquePointer?, stacksize: Byte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrp(irp?.value?.toCPointer<ByteVar>(), stacksize)?.let { COpaquePointer(it.toLong()) }

public actual fun ioMakeAssociatedIrpEx(irp: COpaquePointer?, deviceobject: COpaquePointer?, stacksize: Byte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrpEx(irp?.value?.toCPointer<ByteVar>(), deviceobject?.value?.toCPointer<ByteVar>(), stacksize)?.let { COpaquePointer(it.toLong()) }

public actual fun ioMapTransfer(adapterobject: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: COpaquePointer?, writetodevice: Boolean): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioMapTransfer(adapterobject?.value?.toCPointer<ByteVar>(), mdl?.value?.toCPointer<ByteVar>(), mapregisterbase?.value?.toCPointer<ByteVar>(), currentva?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>(), writetodevice)

public actual fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: COpaquePointer?, desiredaccess: UInt, deviceinterfaceregkey: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioOpenDeviceInterfaceRegistryKey(symboliclinkname?.value?.toCPointer<ByteVar>(), desiredaccess, deviceinterfaceregkey?.value?.toCPointer<ByteVar>())

public actual fun ioOpenDeviceRegistryKey(deviceobject: COpaquePointer?, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioOpenDeviceRegistryKey(deviceobject?.value?.toCPointer<ByteVar>(), devinstkeytype, desiredaccess, deviceregkey?.value?.toCPointer<ByteVar>())

public actual fun ioOpenDriverRegistryKey(driverobject: COpaquePointer?, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioOpenDriverRegistryKey(driverobject?.value?.toCPointer<ByteVar>(), regkeytype, desiredaccess, flags, driverregkey?.value?.toCPointer<ByteVar>())

public actual fun ioPropagateActivityIdToThread(irp: COpaquePointer?, propagatedid: COpaquePointer?, originalid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioPropagateActivityIdToThread(irp?.value?.toCPointer<ByteVar>(), propagatedid?.value?.toCPointer<ByteVar>(), originalid?.value?.toCPointer<ByteVar>())

public actual fun ioQueryDeviceDescription(bustype: COpaquePointer?, busnumber: COpaquePointer?, controllertype: COpaquePointer?, controllernumber: COpaquePointer?, peripheraltype: COpaquePointer?, peripheralnumber: COpaquePointer?, calloutroutine: PioQueryDeviceRoutine, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioQueryDeviceDescription(bustype?.value?.toCPointer<ByteVar>(), busnumber?.value?.toCPointer<ByteVar>(), controllertype?.value?.toCPointer<ByteVar>(), controllernumber?.value?.toCPointer<ByteVar>(), peripheraltype?.value?.toCPointer<ByteVar>(), peripheralnumber?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun ioQueryFullDriverPath(driverobject: COpaquePointer?, fullpath: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioQueryFullDriverPath(driverobject?.value?.toCPointer<ByteVar>(), fullpath?.value?.toCPointer<ByteVar>())

public actual fun ioQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioQueryInformationByName(objectattributes?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), fileinformation?.value?.toCPointer<ByteVar>(), length, fileinformationclass, options, drivercontext?.value?.toCPointer<ByteVar>())

public actual fun ioQueryKsrPersistentMemorySize(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySize(driverobject?.value?.toCPointer<ByteVar>(), physicaldeviceobject?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun ioQueryKsrPersistentMemorySizeEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySizeEx(driverobject?.value?.toCPointer<ByteVar>(), physicaldeviceobject?.value?.toCPointer<ByteVar>(), physicaldeviceid?.value?.toCPointer<ByteVar>(), datatag?.value?.toCPointer<ByteVar>(), dataversion?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioQueueWorkItem(ioworkitem, 0L.toCPointer<ByteVar>(), queuetype, context?.value?.toCPointer<ByteVar>())
}

public actual fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioQueueWorkItemEx(ioworkitem, 0L.toCPointer<ByteVar>(), queuetype, context?.value?.toCPointer<ByteVar>())
}

public actual fun ioRaiseHardError(irp: COpaquePointer?, vpb: COpaquePointer?, realdeviceobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRaiseHardError(irp?.value?.toCPointer<ByteVar>(), vpb?.value?.toCPointer<ByteVar>(), realdeviceobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: COpaquePointer?, thread: Pkthread): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRaiseInformationalHardError(errorstatus, string?.value?.toCPointer<ByteVar>(), thread)

public actual fun ioReadDiskSignature(deviceobject: COpaquePointer?, bytespersector: UInt, signature: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReadDiskSignature(deviceobject?.value?.toCPointer<ByteVar>(), bytespersector, signature?.value?.toCPointer<ByteVar>())

public actual fun ioReadPartitionTable(deviceobject: COpaquePointer?, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReadPartitionTable(deviceobject?.value?.toCPointer<ByteVar>(), sectorsize, returnrecognizedpartitions, partitionbuffer?.value?.toCPointer<ByteVar>())

public actual fun ioReadPartitionTableEx(deviceobject: COpaquePointer?, drivelayout: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReadPartitionTableEx(deviceobject?.value?.toCPointer<ByteVar>(), drivelayout?.value?.toCPointer<ByteVar>())

public actual fun ioRecordIoAttribution(opaquehandle: COpaquePointer?, attributioninformation: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRecordIoAttribution(opaquehandle?.value?.toCPointer<ByteVar>(), attributioninformation?.value?.toCPointer<ByteVar>())

public actual fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRegisterBootDriverCallback(0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioRegisterBootDriverReinitialization(driverobject: COpaquePointer?, driverreinitializationroutine: DriverReinitialize, context: COpaquePointer?) {
}

public actual fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: COpaquePointer?, notificationinformationlength: UInt, callbackregistration: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRegisterContainerNotification(notificationclass, 0L.toCPointer<ByteVar>(), notificationinformation?.value?.toCPointer<ByteVar>(), notificationinformationlength, callbackregistration?.value?.toCPointer<ByteVar>())

public actual fun ioRegisterDeviceInterface(physicaldeviceobject: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: COpaquePointer?, symboliclinkname: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRegisterDeviceInterface(physicaldeviceobject?.value?.toCPointer<ByteVar>(), interfaceclassguid?.value?.toCPointer<ByteVar>(), referencestring?.value?.toCPointer<ByteVar>(), symboliclinkname?.value?.toCPointer<ByteVar>())

public actual fun ioRegisterDriverReinitialization(driverobject: COpaquePointer?, driverreinitializationroutine: DriverReinitialize, context: COpaquePointer?) {
}

public actual fun ioRegisterLastChanceShutdownNotification(deviceobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRegisterLastChanceShutdownNotification(deviceobject?.value?.toCPointer<ByteVar>())

public actual fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: COpaquePointer?, driverobject: COpaquePointer?, callbackroutine: DriverNotificationCallbackRoutine, context: COpaquePointer?, notificationentry: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRegisterPlugPlayNotification(eventcategory, eventcategoryflags, eventcategorydata?.value?.toCPointer<ByteVar>(), driverobject?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), notificationentry?.value?.toCPointer<ByteVar>())

public actual fun ioRegisterShutdownNotification(deviceobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRegisterShutdownNotification(deviceobject?.value?.toCPointer<ByteVar>())

public actual fun ioReleaseCancelSpinLock(irql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReleaseCancelSpinLock(irql)
}

public actual fun ioReleaseRemoveLockAndWaitEx(removelock: COpaquePointer?, tag: COpaquePointer?, remlocksize: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockAndWaitEx(removelock?.value?.toCPointer<ByteVar>(), tag?.value?.toCPointer<ByteVar>(), remlocksize)
}

public actual fun ioReleaseRemoveLockEx(removelock: COpaquePointer?, tag: COpaquePointer?, remlocksize: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockEx(removelock?.value?.toCPointer<ByteVar>(), tag?.value?.toCPointer<ByteVar>(), remlocksize)
}

public actual fun ioRemoveLinkShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccess(fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>(), linkshareaccess?.value?.toCPointer<ByteVar>())
}

public actual fun ioRemoveLinkShareAccessEx(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccessEx(fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>(), linkshareaccess?.value?.toCPointer<ByteVar>(), ioshareaccessflags)
}

public actual fun ioRemoveShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRemoveShareAccess(fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>())
}

public actual fun ioReplacePartitionUnit(targetpdo: COpaquePointer?, sparepdo: COpaquePointer?, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReplacePartitionUnit(targetpdo?.value?.toCPointer<ByteVar>(), sparepdo?.value?.toCPointer<ByteVar>(), flags)

public actual fun ioReportDetectedDevice(driverobject: COpaquePointer?, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: COpaquePointer?, resourcerequirements: COpaquePointer?, resourceassigned: Boolean, deviceobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReportDetectedDevice(driverobject?.value?.toCPointer<ByteVar>(), legacybustype, busnumber, slotnumber, resourcelist?.value?.toCPointer<ByteVar>(), resourcerequirements?.value?.toCPointer<ByteVar>(), resourceassigned, deviceobject?.value?.toCPointer<ByteVar>())

public actual fun ioReportInterruptActive(parameters: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReportInterruptActive(parameters?.value?.toCPointer<ByteVar>())
}

public actual fun ioReportInterruptInactive(parameters: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReportInterruptInactive(parameters?.value?.toCPointer<ByteVar>())
}

public actual fun ioReportResourceForDetection(driverobject: COpaquePointer?, driverlist: COpaquePointer?, driverlistsize: UInt, deviceobject: COpaquePointer?, devicelist: COpaquePointer?, devicelistsize: UInt, conflictdetected: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReportResourceForDetection(driverobject?.value?.toCPointer<ByteVar>(), driverlist?.value?.toCPointer<ByteVar>(), driverlistsize, deviceobject?.value?.toCPointer<ByteVar>(), devicelist?.value?.toCPointer<ByteVar>(), devicelistsize, conflictdetected?.value?.toCPointer<ByteVar>())

public actual fun ioReportResourceUsage(driverclassname: COpaquePointer?, driverobject: COpaquePointer?, driverlist: COpaquePointer?, driverlistsize: UInt, deviceobject: COpaquePointer?, devicelist: COpaquePointer?, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReportResourceUsage(driverclassname?.value?.toCPointer<ByteVar>(), driverobject?.value?.toCPointer<ByteVar>(), driverlist?.value?.toCPointer<ByteVar>(), driverlistsize, deviceobject?.value?.toCPointer<ByteVar>(), devicelist?.value?.toCPointer<ByteVar>(), devicelistsize, overrideconflict, conflictdetected?.value?.toCPointer<ByteVar>())

public actual fun ioReportRootDevice(driverobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReportRootDevice(driverobject?.value?.toCPointer<ByteVar>())

public actual fun ioReportTargetDeviceChange(physicaldeviceobject: COpaquePointer?, notificationstructure: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChange(physicaldeviceobject?.value?.toCPointer<ByteVar>(), notificationstructure?.value?.toCPointer<ByteVar>())

public actual fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: COpaquePointer?, notificationstructure: COpaquePointer?, callback: PdeviceChangeCompleteCallback, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject?.value?.toCPointer<ByteVar>(), notificationstructure?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun ioRequestDeviceEject(physicaldeviceobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRequestDeviceEject(physicaldeviceobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioRequestDeviceEjectEx(physicaldeviceobject: COpaquePointer?, callback: PioDeviceEjectCallback, context: COpaquePointer?, driverobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioRequestDeviceEjectEx(physicaldeviceobject?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), driverobject?.value?.toCPointer<ByteVar>())

public actual fun ioReserveKsrPersistentMemory(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, size: ULong, flags: UInt, datahandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemory(driverobject?.value?.toCPointer<ByteVar>(), physicaldeviceobject?.value?.toCPointer<ByteVar>(), size, flags, datahandle?.value?.toCPointer<ByteVar>())

public actual fun ioReserveKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: UInt, size: ULong, flags: UInt, datahandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemoryEx(driverobject?.value?.toCPointer<ByteVar>(), physicaldeviceobject?.value?.toCPointer<ByteVar>(), physicaldeviceid?.value?.toCPointer<ByteVar>(), datatag?.value?.toCPointer<ByteVar>(), dataversion, size, flags, datahandle?.value?.toCPointer<ByteVar>())

public actual fun ioReuseIrp(irp: COpaquePointer?, iostatus: Ntstatus) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioReuseIrp(irp?.value?.toCPointer<ByteVar>(), iostatus)
}

public actual fun ioSetActivityIdIrp(irp: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetActivityIdIrp(irp?.value?.toCPointer<ByteVar>(), guid?.value?.toCPointer<ByteVar>())

public actual fun ioSetActivityIdThread(activityid: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetActivityIdThread(activityid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioSetCompletionRoutineEx(deviceobject: COpaquePointer?, irp: COpaquePointer?, completionroutine: PioCompletionRoutine, context: COpaquePointer?, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetCompletionRoutineEx(deviceobject?.value?.toCPointer<ByteVar>(), irp?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), invokeonsuccess, invokeonerror, invokeoncancel)

public actual fun ioSetDeviceInterfacePropertyData(symboliclinkname: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfacePropertyData(symboliclinkname?.value?.toCPointer<ByteVar>(), propertykey?.value?.toCPointer<ByteVar>(), lcid, flags, type, size, data?.value?.toCPointer<ByteVar>())

public actual fun ioSetDeviceInterfaceState(symboliclinkname: COpaquePointer?, enable: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfaceState(symboliclinkname?.value?.toCPointer<ByteVar>(), enable)

public actual fun ioSetDevicePropertyData(pdo: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetDevicePropertyData(pdo?.value?.toCPointer<ByteVar>(), propertykey?.value?.toCPointer<ByteVar>(), lcid, flags, type, size, data?.value?.toCPointer<ByteVar>())

public actual fun ioSetFileObjectIgnoreSharing(fileobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetFileObjectIgnoreSharing(fileobject?.value?.toCPointer<ByteVar>())

public actual fun ioSetFileOrigin(fileobject: COpaquePointer?, remote: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetFileOrigin(fileobject?.value?.toCPointer<ByteVar>(), remote)

public actual fun ioSetFsZeroingOffset(irp: COpaquePointer?, zeroingoffset: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffset(irp?.value?.toCPointer<ByteVar>(), zeroingoffset)

public actual fun ioSetFsZeroingOffsetRequired(irp: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffsetRequired(irp?.value?.toCPointer<ByteVar>())

public actual fun ioSetHardErrorOrVerifyDevice(irp: COpaquePointer?, deviceobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetHardErrorOrVerifyDevice(irp?.value?.toCPointer<ByteVar>(), deviceobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioSetIoAttributionIrp(irp: COpaquePointer?, attributionsource: COpaquePointer?, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetIoAttributionIrp(irp?.value?.toCPointer<ByteVar>(), attributionsource?.value?.toCPointer<ByteVar>(), flags)

public actual fun ioSetIoPriorityHint(irp: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetIoPriorityHint(irp?.value?.toCPointer<ByteVar>(), priorityhint)

public actual fun ioSetIrpExtraCreateParameter(irp: COpaquePointer?, extracreateparameter: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetIrpExtraCreateParameter(irp?.value?.toCPointer<ByteVar>(), extracreateparameter?.value?.toCPointer<ByteVar>())

public actual fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetLinkShareAccess(desiredaccess, desiredshareaccess, fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>(), linkshareaccess?.value?.toCPointer<ByteVar>(), ioshareaccessflags)
}

public actual fun ioSetMasterIrpStatus(masterirp: COpaquePointer?, status: Ntstatus) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetMasterIrpStatus(masterirp?.value?.toCPointer<ByteVar>(), status)
}

public actual fun ioSetPartitionInformation(deviceobject: COpaquePointer?, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetPartitionInformation(deviceobject?.value?.toCPointer<ByteVar>(), sectorsize, partitionnumber, partitiontype)

public actual fun ioSetPartitionInformationEx(deviceobject: COpaquePointer?, partitionnumber: UInt, partitioninfo: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetPartitionInformationEx(deviceobject?.value?.toCPointer<ByteVar>(), partitionnumber, partitioninfo?.value?.toCPointer<ByteVar>())

public actual fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetShareAccess(desiredaccess, desiredshareaccess, fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>())
}

public actual fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, writepermission: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetShareAccessEx(desiredaccess, desiredshareaccess, fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>(), writepermission?.value?.toCPointer<ByteVar>())
}

public actual fun ioSetStartIoAttributes(deviceobject: COpaquePointer?, deferredstartio: Boolean, noncancelable: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetStartIoAttributes(deviceobject?.value?.toCPointer<ByteVar>(), deferredstartio, noncancelable)
}

public actual fun ioSetSystemPartition(volumenamestring: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetSystemPartition(volumenamestring?.value?.toCPointer<ByteVar>())

public actual fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetThreadHardErrorMode(enableharderrors)

public actual fun ioSetTopLevelIrp(irp: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSetTopLevelIrp(irp?.value?.toCPointer<ByteVar>())
}

public actual fun ioSizeOfIrpEx(deviceobject: COpaquePointer?, stacksize: Byte): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSizeOfIrpEx(deviceobject?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun ioSizeofWorkItem(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSizeofWorkItem()

public actual fun ioStartNextPacket(deviceobject: COpaquePointer?, cancelable: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioStartNextPacket(deviceobject?.value?.toCPointer<ByteVar>(), cancelable)
}

public actual fun ioStartNextPacketByKey(deviceobject: COpaquePointer?, cancelable: Boolean, key: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioStartNextPacketByKey(deviceobject?.value?.toCPointer<ByteVar>(), cancelable, key)
}

public actual fun ioStartPacket(deviceobject: COpaquePointer?, irp: COpaquePointer?, key: COpaquePointer?, cancelfunction: DriverCancel) {
}

public actual fun ioStartTimer(deviceobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioStartTimer(deviceobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioStopTimer(deviceobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioStopTimer(deviceobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioSynchronousCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioSynchronousCallDriver(deviceobject?.value?.toCPointer<ByteVar>(), irp?.value?.toCPointer<ByteVar>())

public actual fun ioTransferActivityId(activityid: COpaquePointer?, relatedactivityid: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioTransferActivityId(activityid?.value?.toCPointer<ByteVar>(), relatedactivityid?.value?.toCPointer<ByteVar>())
}

public actual fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioTranslateBusAddress(interfacetype, busnumber, busaddress, addressspace?.value?.toCPointer<ByteVar>(), translatedaddress?.value?.toCPointer<ByteVar>())

public actual fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioTryQueueWorkItem(ioworkitem, 0L.toCPointer<ByteVar>(), queuetype, context?.value?.toCPointer<ByteVar>())

public actual fun ioUninitializeWorkItem(ioworkitem: PioWorkitem) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioUninitializeWorkItem(ioworkitem)
}

public actual fun ioUnregisterBootDriverCallback(callbackhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioUnregisterBootDriverCallback(callbackhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ioUnregisterContainerNotification(callbackregistration: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioUnregisterContainerNotification(callbackregistration?.value?.toCPointer<ByteVar>())
}

public actual fun ioUnregisterPlugPlayNotification(notificationentry: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotification(notificationentry?.value?.toCPointer<ByteVar>())

public actual fun ioUnregisterPlugPlayNotificationEx(notificationentry: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotificationEx(notificationentry?.value?.toCPointer<ByteVar>())

public actual fun ioUnregisterShutdownNotification(deviceobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioUnregisterShutdownNotification(deviceobject?.value?.toCPointer<ByteVar>())
}

public actual fun ioUpdateLinkShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccess(fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>(), linkshareaccess?.value?.toCPointer<ByteVar>())
}

public actual fun ioUpdateLinkShareAccessEx(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccessEx(fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>(), linkshareaccess?.value?.toCPointer<ByteVar>(), ioshareaccessflags)
}

public actual fun ioUpdateShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioUpdateShareAccess(fileobject?.value?.toCPointer<ByteVar>(), shareaccess?.value?.toCPointer<ByteVar>())
}

public actual fun ioValidateDeviceIoControlAccess(irp: COpaquePointer?, requiredaccess: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioValidateDeviceIoControlAccess(irp?.value?.toCPointer<ByteVar>(), requiredaccess)

public actual fun ioVerifyPartitionTable(deviceobject: COpaquePointer?, fixerrors: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioVerifyPartitionTable(deviceobject?.value?.toCPointer<ByteVar>(), fixerrors)

public actual fun ioVolumeDeviceNameToGuid(volumedevicename: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuid(volumedevicename?.value?.toCPointer<ByteVar>(), guid?.value?.toCPointer<ByteVar>())

public actual fun ioVolumeDeviceNameToGuidPath(volumedevicename: COpaquePointer?, guidpath: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuidPath(volumedevicename?.value?.toCPointer<ByteVar>(), guidpath?.value?.toCPointer<ByteVar>())

public actual fun ioVolumeDeviceToDosName(volumedeviceobject: COpaquePointer?, dosname: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToDosName(volumedeviceobject?.value?.toCPointer<ByteVar>(), dosname?.value?.toCPointer<ByteVar>())

public actual fun ioVolumeDeviceToGuid(volumedeviceobject: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuid(volumedeviceobject?.value?.toCPointer<ByteVar>(), guid?.value?.toCPointer<ByteVar>())

public actual fun ioVolumeDeviceToGuidPath(volumedeviceobject: COpaquePointer?, guidpath: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuidPath(volumedeviceobject?.value?.toCPointer<ByteVar>(), guidpath?.value?.toCPointer<ByteVar>())

public actual fun ioWMIAllocateInstanceIds(guid: COpaquePointer?, instancecount: UInt, firstinstanceid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIAllocateInstanceIds(guid?.value?.toCPointer<ByteVar>(), instancecount, firstinstanceid?.value?.toCPointer<ByteVar>())

public actual fun ioWMIDeviceObjectToInstanceName(datablockobject: COpaquePointer?, deviceobject: COpaquePointer?, instancename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIDeviceObjectToInstanceName(datablockobject?.value?.toCPointer<ByteVar>(), deviceobject?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>())

public actual fun ioWMIExecuteMethod(datablockobject: COpaquePointer?, instancename: COpaquePointer?, methodid: UInt, inbuffersize: UInt, outbuffersize: COpaquePointer?, inoutbuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIExecuteMethod(datablockobject?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), methodid, inbuffersize, outbuffersize?.value?.toCPointer<ByteVar>(), inoutbuffer?.value?.toCPointer<ByteVar>())

public actual fun ioWMIHandleToInstanceName(datablockobject: COpaquePointer?, filehandle: Handle, instancename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIHandleToInstanceName(datablockobject?.value?.toCPointer<ByteVar>(), filehandle?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>())

public actual fun ioWMIOpenBlock(guid: COpaquePointer?, desiredaccess: UInt, datablockobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIOpenBlock(guid?.value?.toCPointer<ByteVar>(), desiredaccess, datablockobject?.value?.toCPointer<ByteVar>())

public actual fun ioWMIQueryAllData(datablockobject: COpaquePointer?, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIQueryAllData(datablockobject?.value?.toCPointer<ByteVar>(), inoutbuffersize?.value?.toCPointer<ByteVar>(), outbuffer?.value?.toCPointer<ByteVar>())

public actual fun ioWMIQueryAllDataMultiple(datablockobjectlist: COpaquePointer?, objectcount: UInt, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIQueryAllDataMultiple(datablockobjectlist?.value?.toCPointer<ByteVar>(), objectcount, inoutbuffersize?.value?.toCPointer<ByteVar>(), outbuffer?.value?.toCPointer<ByteVar>())

public actual fun ioWMIQuerySingleInstance(datablockobject: COpaquePointer?, instancename: COpaquePointer?, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstance(datablockobject?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), inoutbuffersize?.value?.toCPointer<ByteVar>(), outbuffer?.value?.toCPointer<ByteVar>())

public actual fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: COpaquePointer?, instancenames: COpaquePointer?, objectcount: UInt, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstanceMultiple(datablockobjectlist?.value?.toCPointer<ByteVar>(), instancenames?.value?.toCPointer<ByteVar>(), objectcount, inoutbuffersize?.value?.toCPointer<ByteVar>(), outbuffer?.value?.toCPointer<ByteVar>())

public actual fun ioWMIRegistrationControl(deviceobject: COpaquePointer?, action: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIRegistrationControl(deviceobject?.value?.toCPointer<ByteVar>(), action)

public actual fun ioWMISetNotificationCallback(obj: COpaquePointer?, callback: WmiNotificationCallback, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMISetNotificationCallback(obj?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun ioWMISetSingleInstance(datablockobject: COpaquePointer?, instancename: COpaquePointer?, version: UInt, valuebuffersize: UInt, valuebuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMISetSingleInstance(datablockobject?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), version, valuebuffersize, valuebuffer?.value?.toCPointer<ByteVar>())

public actual fun ioWMISetSingleItem(datablockobject: COpaquePointer?, instancename: COpaquePointer?, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMISetSingleItem(datablockobject?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), dataitemid, version, valuebuffersize, valuebuffer?.value?.toCPointer<ByteVar>())

public actual fun ioWMISuggestInstanceName(physicaldeviceobject: COpaquePointer?, symboliclinkname: COpaquePointer?, combinenames: Boolean, suggestedinstancename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMISuggestInstanceName(physicaldeviceobject?.value?.toCPointer<ByteVar>(), symboliclinkname?.value?.toCPointer<ByteVar>(), combinenames, suggestedinstancename?.value?.toCPointer<ByteVar>())

public actual fun ioWMIWriteEvent(wnodeeventitem: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWMIWriteEvent(wnodeeventitem?.value?.toCPointer<ByteVar>())

public actual fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWithinStackLimits(regionstart, regionsize)

public actual fun ioWriteErrorLogEntry(elentry: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWriteErrorLogEntry(elentry?.value?.toCPointer<ByteVar>())
}

public actual fun ioWriteKsrPersistentMemory(datahandle: COpaquePointer?, buffer: COpaquePointer?, size: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWriteKsrPersistentMemory(datahandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), size)

public actual fun ioWritePartitionTable(deviceobject: COpaquePointer?, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWritePartitionTable(deviceobject?.value?.toCPointer<ByteVar>(), sectorsize, sectorspertrack, numberofheads, partitionbuffer?.value?.toCPointer<ByteVar>())

public actual fun ioWritePartitionTableEx(deviceobject: COpaquePointer?, drivelayout: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ioWritePartitionTableEx(deviceobject?.value?.toCPointer<ByteVar>(), drivelayout?.value?.toCPointer<ByteVar>())

public actual fun iofCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_iofCallDriver(deviceobject?.value?.toCPointer<ByteVar>(), irp?.value?.toCPointer<ByteVar>())

public actual fun iofCompleteRequest(irp: COpaquePointer?, priorityboost: Byte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_iofCompleteRequest(irp?.value?.toCPointer<ByteVar>(), priorityboost)
}

public actual fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: COpaquePointer?, outbufferbytes: UInt, outbuffer: COpaquePointer?, outbufferneeded: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_kdChangeOption(option, inbufferbytes, inbuffer?.value?.toCPointer<ByteVar>(), outbufferbytes, outbuffer?.value?.toCPointer<ByteVar>(), outbufferneeded?.value?.toCPointer<ByteVar>())

public actual fun kdDisableDebugger(): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_kdDisableDebugger()

public actual fun kdEnableDebugger(): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_kdEnableDebugger()

public actual fun kdRefreshDebuggerNotPresent(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_kdRefreshDebuggerNotPresent()

public actual fun keAcquireGuardedMutex(mutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutex(mutex?.value?.toCPointer<ByteVar>())
}

public actual fun keAcquireGuardedMutexUnsafe(fastmutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutexUnsafe(fastmutex?.value?.toCPointer<ByteVar>())
}

public actual fun keAcquireInStackQueuedSpinLock(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLock(spinlock?.value?.toCPointer<ByteVar>(), lockhandle?.value?.toCPointer<ByteVar>())
}

public actual fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock?.value?.toCPointer<ByteVar>(), lockhandle?.value?.toCPointer<ByteVar>())
}

public actual fun keAcquireInStackQueuedSpinLockForDpc(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockForDpc(spinlock?.value?.toCPointer<ByteVar>(), lockhandle?.value?.toCPointer<ByteVar>())
}

public actual fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keAcquireInterruptSpinLock(interrupt)

public actual fun keAcquireSpinLockForDpc(spinlock: COpaquePointer?): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keAcquireSpinLockForDpc(spinlock?.value?.toCPointer<ByteVar>())

public actual fun keAddTriageDumpDataBlock(ktriagedumpdataarray: COpaquePointer?, address: COpaquePointer?, size: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keAddTriageDumpDataBlock(ktriagedumpdataarray?.value?.toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>(), size)

public actual fun keAreAllApcsDisabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keAreAllApcsDisabled()

public actual fun keAreApcsDisabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keAreApcsDisabled()

public actual fun keBugCheck(bugcheckcode: BugcheckError) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keBugCheck(bugcheckcode)
}

public actual fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keBugCheckEx(bugcheckcode, bugcheckparameter1, bugcheckparameter2, bugcheckparameter3, bugcheckparameter4)
}

public actual fun keCancelTimer(param0: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keCancelTimer(param0?.value?.toCPointer<ByteVar>())

public actual fun keClearEvent(event: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keClearEvent(event?.value?.toCPointer<ByteVar>())
}

public actual fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: COpaquePointer?, conversionerror: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue, performancecountervalue?.value?.toCPointer<ByteVar>(), conversionerror?.value?.toCPointer<ByteVar>())

public actual fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: COpaquePointer?, conversionerror: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue, auxiliarycountervalue?.value?.toCPointer<ByteVar>(), conversionerror?.value?.toCPointer<ByteVar>())

public actual fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keDelayExecutionThread(waitmode, alertable, interval?.value?.toCPointer<ByteVar>())

public actual fun keDeregisterBoundCallback(handle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keDeregisterBoundCallback(handle?.value?.toCPointer<ByteVar>())

public actual fun keDeregisterBugCheckCallback(callbackrecord: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckCallback(callbackrecord?.value?.toCPointer<ByteVar>())

public actual fun keDeregisterBugCheckReasonCallback(callbackrecord: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckReasonCallback(callbackrecord?.value?.toCPointer<ByteVar>())

public actual fun keDeregisterNmiCallback(handle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keDeregisterNmiCallback(handle?.value?.toCPointer<ByteVar>())

public actual fun keDeregisterProcessorChangeCallback(callbackhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keDeregisterProcessorChangeCallback(callbackhandle?.value?.toCPointer<ByteVar>())
}

public actual fun keEnterCriticalRegion() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keEnterCriticalRegion()
}

public actual fun keEnterGuardedRegion() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keEnterGuardedRegion()
}

public actual fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: COpaquePointer?, size: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCallout(0L.toCPointer<ByteVar>(), parameter?.value?.toCPointer<ByteVar>(), size)

public actual fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: COpaquePointer?, size: ULong, wait: Boolean, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCalloutEx(0L.toCPointer<ByteVar>(), parameter?.value?.toCPointer<ByteVar>(), size, wait, context?.value?.toCPointer<ByteVar>())

public actual fun keFlushIoBuffers(mdl: COpaquePointer?, readoperation: Boolean, dmaoperation: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keFlushIoBuffers(mdl?.value?.toCPointer<ByteVar>(), readoperation, dmaoperation)
}

public actual fun keFlushQueuedDpcs() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keFlushQueuedDpcs()
}

public actual fun keFlushWriteBuffer() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keFlushWriteBuffer()
}

public actual fun keGetCurrentIrql(): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keGetCurrentIrql()

public actual fun keGetCurrentNodeNumber(): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keGetCurrentNodeNumber()

public actual fun keGetCurrentProcessorNumberEx(procnumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keGetCurrentProcessorNumberEx(procnumber?.value?.toCPointer<ByteVar>())

public actual fun keGetProcessorIndexFromNumber(procnumber: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keGetProcessorIndexFromNumber(procnumber?.value?.toCPointer<ByteVar>())

public actual fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keGetProcessorNumberFromIndex(procindex, procnumber?.value?.toCPointer<ByteVar>())

public actual fun keGetRecommendedSharedDataAlignment(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keGetRecommendedSharedDataAlignment()

public actual fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: COpaquePointer?, buffersize: UInt, bufferneeded: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeCrashDumpHeader(dumptype, flags, buffer?.value?.toCPointer<ByteVar>(), buffersize, bufferneeded?.value?.toCPointer<ByteVar>())

public actual fun keInitializeDeviceQueue(devicequeue: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeDeviceQueue(devicequeue?.value?.toCPointer<ByteVar>())
}

public actual fun keInitializeDpc(dpc: COpaquePointer?, deferredroutine: PkdeferredRoutine, deferredcontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeDpc(dpc?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), deferredcontext?.value?.toCPointer<ByteVar>())
}

public actual fun keInitializeEvent(event: COpaquePointer?, type: EventType, state: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeEvent(event?.value?.toCPointer<ByteVar>(), type, state)
}

public actual fun keInitializeGuardedMutex(mutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeGuardedMutex(mutex?.value?.toCPointer<ByteVar>())
}

public actual fun keInitializeMutex(mutex: COpaquePointer?, level: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeMutex(mutex?.value?.toCPointer<ByteVar>(), level)
}

public actual fun keInitializeSemaphore(semaphore: COpaquePointer?, count: Int, limit: Int) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeSemaphore(semaphore?.value?.toCPointer<ByteVar>(), count, limit)
}

public actual fun keInitializeSpinLock(spinlock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeSpinLock(spinlock?.value?.toCPointer<ByteVar>())
}

public actual fun keInitializeThreadedDpc(dpc: COpaquePointer?, deferredroutine: PkdeferredRoutine, deferredcontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeThreadedDpc(dpc?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), deferredcontext?.value?.toCPointer<ByteVar>())
}

public actual fun keInitializeTimer(timer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeTimer(timer?.value?.toCPointer<ByteVar>())
}

public actual fun keInitializeTimerEx(timer: COpaquePointer?, type: TimerType) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeTimerEx(timer?.value?.toCPointer<ByteVar>(), type)
}

public actual fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: COpaquePointer?, size: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInitializeTriageDumpDataArray(ktriagedumpdataarray?.value?.toCPointer<ByteVar>(), size)

public actual fun keInsertByKeyDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?, sortkey: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInsertByKeyDeviceQueue(devicequeue?.value?.toCPointer<ByteVar>(), devicequeueentry?.value?.toCPointer<ByteVar>(), sortkey)

public actual fun keInsertDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInsertDeviceQueue(devicequeue?.value?.toCPointer<ByteVar>(), devicequeueentry?.value?.toCPointer<ByteVar>())

public actual fun keInsertQueueDpc(dpc: COpaquePointer?, systemargument1: COpaquePointer?, systemargument2: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInsertQueueDpc(dpc?.value?.toCPointer<ByteVar>(), systemargument1?.value?.toCPointer<ByteVar>(), systemargument2?.value?.toCPointer<ByteVar>())

public actual fun keInvalidateAllCaches(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInvalidateAllCaches()

public actual fun keInvalidateRangeAllCaches(baseaddress: COpaquePointer?, length: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keInvalidateRangeAllCaches(baseaddress?.value?.toCPointer<ByteVar>(), length)
}

public actual fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keIpiGenericCall(0L.toCPointer<ByteVar>(), context)

public actual fun keIsExecutingDpc(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keIsExecutingDpc()

public actual fun keLeaveCriticalRegion() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keLeaveCriticalRegion()
}

public actual fun keLeaveGuardedRegion() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keLeaveGuardedRegion()
}

public actual fun kePulseEvent(event: COpaquePointer?, increment: Int, wait: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_kePulseEvent(event?.value?.toCPointer<ByteVar>(), increment, wait)

public actual fun keQueryActiveGroupCount(): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryActiveGroupCount()

public actual fun keQueryActiveProcessorCount(activeprocessors: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCount(activeprocessors?.value?.toCPointer<ByteVar>())

public actual fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCountEx(groupnumber)

public actual fun keQueryActiveProcessors(): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryActiveProcessors()

public actual fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency?.value?.toCPointer<ByteVar>())

public actual fun keQueryDpcWatchdogInformation(watchdoginformation: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryDpcWatchdogInformation(watchdoginformation?.value?.toCPointer<ByteVar>())

public actual fun keQueryGroupAffinity(groupnumber: UShort): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryGroupAffinity(groupnumber)

public actual fun keQueryHardwareCounterConfiguration(counterarray: COpaquePointer?, maximumcount: UInt, count: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryHardwareCounterConfiguration(counterarray?.value?.toCPointer<ByteVar>(), maximumcount, count?.value?.toCPointer<ByteVar>())

public actual fun keQueryHighestNodeNumber(): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryHighestNodeNumber()

public actual fun keQueryInterruptTimePrecise(qpctimestamp: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryInterruptTimePrecise(qpctimestamp?.value?.toCPointer<ByteVar>())

public actual fun keQueryLogicalProcessorRelationship(processornumber: COpaquePointer?, relationshiptype: LogicalProcessorRelationship, information: COpaquePointer?, length: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryLogicalProcessorRelationship(processornumber?.value?.toCPointer<ByteVar>(), relationshiptype, information?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>())

public actual fun keQueryMaximumGroupCount(): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryMaximumGroupCount()

public actual fun keQueryMaximumProcessorCount(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCount()

public actual fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCountEx(groupnumber)

public actual fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: COpaquePointer?, count: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity(nodenumber, affinity?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())
}

public actual fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: COpaquePointer?, groupaffinitiescount: UShort, groupaffinitiesrequired: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity2(nodenumber, groupaffinities?.value?.toCPointer<ByteVar>(), groupaffinitiescount, groupaffinitiesrequired?.value?.toCPointer<ByteVar>())

public actual fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryNodeActiveProcessorCount(nodenumber)

public actual fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryNodeMaximumProcessorCount(nodenumber)

public actual fun keQueryPerformanceCounter(performancefrequency: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryPerformanceCounter(performancefrequency?.value?.toCPointer<ByteVar>())

public actual fun keQueryPriorityThread(thread: Pkthread): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryPriorityThread(thread)

public actual fun keQueryRuntimeThread(thread: Pkthread, usertime: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryRuntimeThread(thread, usertime?.value?.toCPointer<ByteVar>())

public actual fun keQuerySystemTimePrecise(currenttime: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQuerySystemTimePrecise(currenttime?.value?.toCPointer<ByteVar>())
}

public actual fun keQueryTimeIncrement(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryTimeIncrement()

public actual fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryTotalCycleTimeThread(thread, cycletimestamp?.value?.toCPointer<ByteVar>())

public actual fun keQueryUnbiasedInterruptTime(): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTime()

public actual fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTimePrecise(qpctimestamp?.value?.toCPointer<ByteVar>())

public actual fun keReadStateEvent(event: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReadStateEvent(event?.value?.toCPointer<ByteVar>())

public actual fun keReadStateMutex(mutex: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReadStateMutex(mutex?.value?.toCPointer<ByteVar>())

public actual fun keReadStateSemaphore(semaphore: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReadStateSemaphore(semaphore?.value?.toCPointer<ByteVar>())

public actual fun keReadStateTimer(timer: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReadStateTimer(timer?.value?.toCPointer<ByteVar>())

public actual fun keRegisterBoundCallback(callbackroutine: PboundCallback): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRegisterBoundCallback(0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun keRegisterBugCheckCallback(callbackrecord: COpaquePointer?, callbackroutine: PkbugcheckCallbackRoutine, buffer: COpaquePointer?, length: UInt, component: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRegisterBugCheckCallback(callbackrecord?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), length, component?.value?.toCPointer<ByteVar>())

public actual fun keRegisterBugCheckReasonCallback(callbackrecord: COpaquePointer?, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRegisterBugCheckReasonCallback(callbackrecord?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), reason, component?.value?.toCPointer<ByteVar>())

public actual fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRegisterNmiCallback(0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: COpaquePointer?, flags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRegisterProcessorChangeCallback(0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun keReleaseGuardedMutex(mutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutex(mutex?.value?.toCPointer<ByteVar>())
}

public actual fun keReleaseGuardedMutexUnsafe(fastmutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutexUnsafe(fastmutex?.value?.toCPointer<ByteVar>())
}

public actual fun keReleaseInStackQueuedSpinLock(lockhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLock(lockhandle?.value?.toCPointer<ByteVar>())
}

public actual fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockForDpc(lockhandle?.value?.toCPointer<ByteVar>())
}

public actual fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle?.value?.toCPointer<ByteVar>())
}

public actual fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReleaseInterruptSpinLock(interrupt, oldirql)
}

public actual fun keReleaseMutex(mutex: COpaquePointer?, wait: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReleaseMutex(mutex?.value?.toCPointer<ByteVar>(), wait)

public actual fun keReleaseSemaphore(semaphore: COpaquePointer?, increment: Int, adjustment: Int, wait: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReleaseSemaphore(semaphore?.value?.toCPointer<ByteVar>(), increment, adjustment, wait)

public actual fun keReleaseSpinLockForDpc(spinlock: COpaquePointer?, oldirql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keReleaseSpinLockForDpc(spinlock?.value?.toCPointer<ByteVar>(), oldirql)
}

public actual fun keRemoveByKeyDeviceQueue(devicequeue: COpaquePointer?, sortkey: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueue(devicequeue?.value?.toCPointer<ByteVar>(), sortkey)?.let { COpaquePointer(it.toLong()) }

public actual fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: COpaquePointer?, sortkey: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueueIfBusy(devicequeue?.value?.toCPointer<ByteVar>(), sortkey)?.let { COpaquePointer(it.toLong()) }

public actual fun keRemoveDeviceQueue(devicequeue: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRemoveDeviceQueue(devicequeue?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun keRemoveEntryDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRemoveEntryDeviceQueue(devicequeue?.value?.toCPointer<ByteVar>(), devicequeueentry?.value?.toCPointer<ByteVar>())

public actual fun keRemoveQueueDpc(dpc: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRemoveQueueDpc(dpc?.value?.toCPointer<ByteVar>())

public actual fun keRemoveQueueDpcEx(dpc: COpaquePointer?, waitifactive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRemoveQueueDpcEx(dpc?.value?.toCPointer<ByteVar>(), waitifactive)

public actual fun keResetEvent(event: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keResetEvent(event?.value?.toCPointer<ByteVar>())

public actual fun keRestoreExtendedProcessorState(xstatesave: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRestoreExtendedProcessorState(xstatesave?.value?.toCPointer<ByteVar>())
}

public actual fun keRevertToUserAffinityThread() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThread()
}

public actual fun keRevertToUserAffinityThreadEx(affinity: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThreadEx(affinity)
}

public actual fun keRevertToUserGroupAffinityThread(previousaffinity: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keRevertToUserGroupAffinityThread(previousaffinity?.value?.toCPointer<ByteVar>())
}

public actual fun keSaveExtendedProcessorState(mask: ULong, xstatesave: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSaveExtendedProcessorState(mask, xstatesave?.value?.toCPointer<ByteVar>())

public actual fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetBasePriorityThread(thread, increment)

public actual fun keSetCoalescableTimer(timer: COpaquePointer?, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetCoalescableTimer(timer?.value?.toCPointer<ByteVar>(), duetime, period, tolerabledelay, dpc?.value?.toCPointer<ByteVar>())

public actual fun keSetEvent(event: COpaquePointer?, increment: Int, wait: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetEvent(event?.value?.toCPointer<ByteVar>(), increment, wait)

public actual fun keSetHardwareCounterConfiguration(counterarray: COpaquePointer?, count: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetHardwareCounterConfiguration(counterarray?.value?.toCPointer<ByteVar>(), count)

public actual fun keSetImportanceDpc(dpc: COpaquePointer?, importance: KdpcImportance) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetImportanceDpc(dpc?.value?.toCPointer<ByteVar>(), importance)
}

public actual fun keSetPriorityThread(thread: Pkthread, priority: Int): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetPriorityThread(thread, priority)

public actual fun keSetSystemAffinityThread(affinity: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThread(affinity)
}

public actual fun keSetSystemAffinityThreadEx(affinity: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThreadEx(affinity)

public actual fun keSetSystemGroupAffinityThread(affinity: COpaquePointer?, previousaffinity: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetSystemGroupAffinityThread(affinity?.value?.toCPointer<ByteVar>(), previousaffinity?.value?.toCPointer<ByteVar>())
}

public actual fun keSetTargetProcessorDpc(dpc: COpaquePointer?, number: Byte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpc(dpc?.value?.toCPointer<ByteVar>(), number)
}

public actual fun keSetTargetProcessorDpcEx(dpc: COpaquePointer?, procnumber: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpcEx(dpc?.value?.toCPointer<ByteVar>(), procnumber?.value?.toCPointer<ByteVar>())

public actual fun keSetTimer(timer: COpaquePointer?, duetime: Long, dpc: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetTimer(timer?.value?.toCPointer<ByteVar>(), duetime, dpc?.value?.toCPointer<ByteVar>())

public actual fun keSetTimerEx(timer: COpaquePointer?, duetime: Long, period: Int, dpc: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSetTimerEx(timer?.value?.toCPointer<ByteVar>(), duetime, period, dpc?.value?.toCPointer<ByteVar>())

public actual fun keShouldYieldProcessor(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keShouldYieldProcessor()

public actual fun keStallExecutionProcessor(microseconds: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keStallExecutionProcessor(microseconds)
}

public actual fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keSynchronizeExecution(interrupt, 0L.toCPointer<ByteVar>(), synchronizecontext?.value?.toCPointer<ByteVar>())

public actual fun keTestSpinLock(spinlock: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keTestSpinLock(spinlock?.value?.toCPointer<ByteVar>())

public actual fun keTryToAcquireGuardedMutex(mutex: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keTryToAcquireGuardedMutex(mutex?.value?.toCPointer<ByteVar>())

public actual fun keTryToAcquireSpinLockAtDpcLevel(spinlock: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keTryToAcquireSpinLockAtDpcLevel(spinlock?.value?.toCPointer<ByteVar>())

public actual fun keWaitForMultipleObjects(count: UInt, obj: COpaquePointer?, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?, waitblockarray: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keWaitForMultipleObjects(count, obj?.value?.toCPointer<ByteVar>(), waittype, waitreason, waitmode, alertable, timeout?.value?.toCPointer<ByteVar>(), waitblockarray?.value?.toCPointer<ByteVar>())

public actual fun keWaitForSingleObject(obj: COpaquePointer?, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_keWaitForSingleObject(obj?.value?.toCPointer<ByteVar>(), waitreason, waitmode, alertable, timeout?.value?.toCPointer<ByteVar>())

public actual fun kfRaiseIrql(newirql: UByte): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_kfRaiseIrql(newirql)

public actual fun mmAddPhysicalMemory(startaddress: COpaquePointer?, numberofbytes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAddPhysicalMemory(startaddress?.value?.toCPointer<ByteVar>(), numberofbytes?.value?.toCPointer<ByteVar>())

public actual fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: COpaquePointer?, thunkbuffersize: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAddVerifierSpecialThunks(entryroutine, thunkbuffer?.value?.toCPointer<ByteVar>(), thunkbuffersize)

public actual fun mmAddVerifierThunks(thunkbuffer: COpaquePointer?, thunkbuffersize: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAddVerifierThunks(thunkbuffer?.value?.toCPointer<ByteVar>(), thunkbuffersize)

public actual fun mmAdvanceMdl(mdl: COpaquePointer?, numberofbytes: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAdvanceMdl(mdl?.value?.toCPointer<ByteVar>(), numberofbytes)

public actual fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemory(numberofbytes, highestacceptableaddress)?.let { COpaquePointer(it.toLong()) }

public actual fun mmAllocateContiguousMemoryEx(numberofbytes: COpaquePointer?, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: COpaquePointer?, tag: UInt, flags: UInt, baseaddress: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemoryEx(numberofbytes?.value?.toCPointer<ByteVar>(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, preferrednode, protect, partitionobject?.value?.toCPointer<ByteVar>(), tag, flags, baseaddress?.value?.toCPointer<ByteVar>())

public actual fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCache(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype)?.let { COpaquePointer(it.toLong()) }

public actual fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype, preferrednode)?.let { COpaquePointer(it.toLong()) }

public actual fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousNodeMemory(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, protect, preferrednode)?.let { COpaquePointer(it.toLong()) }

public actual fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddress(numberofbytes, pooltag)?.let { COpaquePointer(it.toLong()) }

public actual fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddressEx(numberofbytes, pooltag, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun mmAllocateMdlForIoSpace(physicaladdresslist: COpaquePointer?, numberofentries: ULong, newmdl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocateMdlForIoSpace(physicaladdresslist?.value?.toCPointer<ByteVar>(), numberofentries, newmdl?.value?.toCPointer<ByteVar>())

public actual fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocateNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes, cachetype, idealnode, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun mmAllocateNonCachedMemory(numberofbytes: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocateNonCachedMemory(numberofbytes)?.let { COpaquePointer(it.toLong()) }

public actual fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdl(lowaddress, highaddress, skipbytes, totalbytes)?.let { COpaquePointer(it.toLong()) }

public actual fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes, cachetype, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAllocatePartitionNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes, cachetype, idealnode, flags, partitionobject?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mmAreMdlPagesCached(memorydescriptorlist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmAreMdlPagesCached(memorydescriptorlist?.value?.toCPointer<ByteVar>())

public actual fun mmBuildMdlForNonPagedPool(memorydescriptorlist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmBuildMdlForNonPagedPool(memorydescriptorlist?.value?.toCPointer<ByteVar>())
}

public actual fun mmCopyMemory(targetaddress: COpaquePointer?, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: COpaquePointer?): Ntstatus =
    0

public actual fun mmCreateMdl(memorydescriptorlist: COpaquePointer?, base: COpaquePointer?, length: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmCreateMdl(memorydescriptorlist?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), length)?.let { COpaquePointer(it.toLong()) }

public actual fun mmCreateMirror(): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmCreateMirror()

public actual fun mmFreeContiguousMemory(baseaddress: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemory(baseaddress?.value?.toCPointer<ByteVar>())
}

public actual fun mmFreeContiguousMemorySpecifyCache(baseaddress: COpaquePointer?, numberofbytes: ULong, cachetype: MemoryCachingType) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemorySpecifyCache(baseaddress?.value?.toCPointer<ByteVar>(), numberofbytes, cachetype)
}

public actual fun mmFreeMappingAddress(baseaddress: COpaquePointer?, pooltag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmFreeMappingAddress(baseaddress?.value?.toCPointer<ByteVar>(), pooltag)
}

public actual fun mmFreeNonCachedMemory(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmFreeNonCachedMemory(baseaddress?.value?.toCPointer<ByteVar>(), numberofbytes)
}

public actual fun mmFreePagesFromMdl(memorydescriptorlist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdl(memorydescriptorlist?.value?.toCPointer<ByteVar>())
}

public actual fun mmFreePagesFromMdlEx(memorydescriptorlist: COpaquePointer?, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdlEx(memorydescriptorlist?.value?.toCPointer<ByteVar>(), flags)
}

public actual fun mmGetCacheAttribute(physicaladdress: Long, cachetype: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmGetCacheAttribute(physicaladdress, cachetype?.value?.toCPointer<ByteVar>())

public actual fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmGetCacheAttributeEx(physicaladdress, flags, cachetype?.value?.toCPointer<ByteVar>())

public actual fun mmGetPhysicalAddress(baseaddress: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmGetPhysicalAddress(baseaddress?.value?.toCPointer<ByteVar>())

public actual fun mmGetPhysicalMemoryRanges(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRanges()?.let { COpaquePointer(it.toLong()) }

public actual fun mmGetPhysicalMemoryRangesEx(partitionobject: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx(partitionobject?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mmGetPhysicalMemoryRangesEx2(partitionobject: COpaquePointer?, flags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx2(partitionobject?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun mmGetSystemRoutineAddress(systemroutinename: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmGetSystemRoutineAddress(systemroutinename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mmGetVirtualForPhysical(physicaladdress: Long): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmGetVirtualForPhysical(physicaladdress)?.let { COpaquePointer(it.toLong()) }

public actual fun mmIsAddressValid(virtualaddress: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmIsAddressValid(virtualaddress?.value?.toCPointer<ByteVar>())

public actual fun mmIsDriverSuspectForVerifier(driverobject: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmIsDriverSuspectForVerifier(driverobject?.value?.toCPointer<ByteVar>())

public actual fun mmIsDriverVerifying(driverobject: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmIsDriverVerifying(driverobject?.value?.toCPointer<ByteVar>())

public actual fun mmIsDriverVerifyingByAddress(addresswithinsection: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmIsDriverVerifyingByAddress(addresswithinsection?.value?.toCPointer<ByteVar>())

public actual fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmIsIoSpaceActive(startaddress, numberofbytes)

public actual fun mmIsNonPagedSystemAddressValid(virtualaddress: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmIsNonPagedSystemAddressValid(virtualaddress?.value?.toCPointer<ByteVar>())

public actual fun mmIsThisAnNtAsSystem(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmIsThisAnNtAsSystem()

public actual fun mmIsVerifierEnabled(verifierflags: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmIsVerifierEnabled(verifierflags?.value?.toCPointer<ByteVar>())

public actual fun mmLockPagableDataSection(addresswithinsection: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmLockPagableDataSection(addresswithinsection?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mmLockPagableSectionByHandle(imagesectionhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmLockPagableSectionByHandle(imagesectionhandle?.value?.toCPointer<ByteVar>())
}

public actual fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapIoSpace(physicaladdress, numberofbytes, cachetype)?.let { COpaquePointer(it.toLong()) }

public actual fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapIoSpaceEx(physicaladdress, numberofbytes, protect)?.let { COpaquePointer(it.toLong()) }

public actual fun mmMapLockedPages(memorydescriptorlist: COpaquePointer?, accessmode: Byte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapLockedPages(memorydescriptorlist?.value?.toCPointer<ByteVar>(), accessmode)?.let { COpaquePointer(it.toLong()) }

public actual fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: COpaquePointer?, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: COpaquePointer?, bugcheckonfailure: UInt, priority: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapLockedPagesSpecifyCache(memorydescriptorlist?.value?.toCPointer<ByteVar>(), accessmode, cachetype, requestedaddress?.value?.toCPointer<ByteVar>(), bugcheckonfailure, priority)?.let { COpaquePointer(it.toLong()) }

public actual fun mmMapLockedPagesWithReservedMapping(mappingaddress: COpaquePointer?, pooltag: UInt, memorydescriptorlist: COpaquePointer?, cachetype: MemoryCachingType): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapLockedPagesWithReservedMapping(mappingaddress?.value?.toCPointer<ByteVar>(), pooltag, memorydescriptorlist?.value?.toCPointer<ByteVar>(), cachetype)?.let { COpaquePointer(it.toLong()) }

public actual fun mmMapMdl(memorydescriptorlist: COpaquePointer?, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapMdl(memorydescriptorlist?.value?.toCPointer<ByteVar>(), protection, 0L.toCPointer<ByteVar>(), drivercontext?.value?.toCPointer<ByteVar>())

public actual fun mmMapMemoryDumpMdlEx(va: COpaquePointer?, pagetotal: UInt, memorydumpmdl: COpaquePointer?, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapMemoryDumpMdlEx(va?.value?.toCPointer<ByteVar>(), pagetotal, memorydumpmdl?.value?.toCPointer<ByteVar>(), flags)

public actual fun mmMapUserAddressesToPage(baseaddress: COpaquePointer?, numberofbytes: ULong, pageaddress: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapUserAddressesToPage(baseaddress?.value?.toCPointer<ByteVar>(), numberofbytes, pageaddress?.value?.toCPointer<ByteVar>())

public actual fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapVideoDisplay(physicaladdress, numberofbytes, cachetype)?.let { COpaquePointer(it.toLong()) }

public actual fun mmMapViewInSessionSpace(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpace(section?.value?.toCPointer<ByteVar>(), mappedbase?.value?.toCPointer<ByteVar>(), viewsize?.value?.toCPointer<ByteVar>())

public actual fun mmMapViewInSessionSpaceEx(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?, sectionoffset: COpaquePointer?, flags: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpaceEx(section?.value?.toCPointer<ByteVar>(), mappedbase?.value?.toCPointer<ByteVar>(), viewsize?.value?.toCPointer<ByteVar>(), sectionoffset?.value?.toCPointer<ByteVar>(), flags)

public actual fun mmMapViewInSystemSpace(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpace(section?.value?.toCPointer<ByteVar>(), mappedbase?.value?.toCPointer<ByteVar>(), viewsize?.value?.toCPointer<ByteVar>())

public actual fun mmMapViewInSystemSpaceEx(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?, sectionoffset: COpaquePointer?, flags: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpaceEx(section?.value?.toCPointer<ByteVar>(), mappedbase?.value?.toCPointer<ByteVar>(), viewsize?.value?.toCPointer<ByteVar>(), sectionoffset?.value?.toCPointer<ByteVar>(), flags)

public actual fun mmMdlPageContentsState(memorydescriptorlist: COpaquePointer?, state: MmMdlPageContentsState): MmMdlPageContentsState =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmMdlPageContentsState(memorydescriptorlist?.value?.toCPointer<ByteVar>(), state)

public actual fun mmPageEntireDriver(addresswithinsection: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmPageEntireDriver(addresswithinsection?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mmProbeAndLockPages(memorydescriptorlist: COpaquePointer?, accessmode: Byte, operation: LockOperation) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmProbeAndLockPages(memorydescriptorlist?.value?.toCPointer<ByteVar>(), accessmode, operation)
}

public actual fun mmProbeAndLockProcessPages(memorydescriptorlist: COpaquePointer?, process: Peprocess, accessmode: Byte, operation: LockOperation) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmProbeAndLockProcessPages(memorydescriptorlist?.value?.toCPointer<ByteVar>(), process, accessmode, operation)
}

public actual fun mmProbeAndLockSelectedPages(memorydescriptorlist: COpaquePointer?, segmentarray: COpaquePointer?, accessmode: Byte, operation: LockOperation) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmProbeAndLockSelectedPages(memorydescriptorlist?.value?.toCPointer<ByteVar>(), segmentarray?.value?.toCPointer<ByteVar>(), accessmode, operation)
}

public actual fun mmProtectDriverSection(addresswithinsection: COpaquePointer?, size: ULong, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmProtectDriverSection(addresswithinsection?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun mmProtectMdlSystemAddress(memorydescriptorlist: COpaquePointer?, newprotect: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmProtectMdlSystemAddress(memorydescriptorlist?.value?.toCPointer<ByteVar>(), newprotect)

public actual fun mmQuerySystemSize(): MmSystemsize =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmQuerySystemSize()

public actual fun mmRemovePhysicalMemory(startaddress: COpaquePointer?, numberofbytes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmRemovePhysicalMemory(startaddress?.value?.toCPointer<ByteVar>(), numberofbytes?.value?.toCPointer<ByteVar>())

public actual fun mmResetDriverPaging(addresswithinsection: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmResetDriverPaging(addresswithinsection?.value?.toCPointer<ByteVar>())
}

public actual fun mmRotatePhysicalView(virtualaddress: COpaquePointer?, numberofbytes: COpaquePointer?, newmdl: COpaquePointer?, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmRotatePhysicalView(virtualaddress?.value?.toCPointer<ByteVar>(), numberofbytes?.value?.toCPointer<ByteVar>(), newmdl?.value?.toCPointer<ByteVar>(), direction, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun mmSecureVirtualMemory(address: COpaquePointer?, size: ULong, probemode: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemory(address?.value?.toCPointer<ByteVar>(), size, probemode)?.let { COpaquePointer(it.toLong()) }

public actual fun mmSecureVirtualMemoryEx(address: COpaquePointer?, size: ULong, probemode: UInt, flags: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemoryEx(address?.value?.toCPointer<ByteVar>(), size, probemode, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmSetPermanentCacheAttribute(startaddress, numberofbytes, cachetype, flags)

public actual fun mmSizeOfMdl(base: COpaquePointer?, length: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmSizeOfMdl(base?.value?.toCPointer<ByteVar>(), length)

public actual fun mmUnlockPagableImageSection(imagesectionhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmUnlockPagableImageSection(imagesectionhandle?.value?.toCPointer<ByteVar>())
}

public actual fun mmUnlockPages(memorydescriptorlist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmUnlockPages(memorydescriptorlist?.value?.toCPointer<ByteVar>())
}

public actual fun mmUnmapIoSpace(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmUnmapIoSpace(baseaddress?.value?.toCPointer<ByteVar>(), numberofbytes)
}

public actual fun mmUnmapLockedPages(baseaddress: COpaquePointer?, memorydescriptorlist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmUnmapLockedPages(baseaddress?.value?.toCPointer<ByteVar>(), memorydescriptorlist?.value?.toCPointer<ByteVar>())
}

public actual fun mmUnmapReservedMapping(baseaddress: COpaquePointer?, pooltag: UInt, memorydescriptorlist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmUnmapReservedMapping(baseaddress?.value?.toCPointer<ByteVar>(), pooltag, memorydescriptorlist?.value?.toCPointer<ByteVar>())
}

public actual fun mmUnmapVideoDisplay(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmUnmapVideoDisplay(baseaddress?.value?.toCPointer<ByteVar>(), numberofbytes)
}

public actual fun mmUnmapViewInSessionSpace(mappedbase: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmUnmapViewInSessionSpace(mappedbase?.value?.toCPointer<ByteVar>())

public actual fun mmUnmapViewInSystemSpace(mappedbase: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmUnmapViewInSystemSpace(mappedbase?.value?.toCPointer<ByteVar>())

public actual fun mmUnsecureVirtualMemory(securehandle: Handle) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_mmUnsecureVirtualMemory(securehandle?.value?.toCPointer<ByteVar>())
}

public actual fun ntAllocateLocallyUniqueId(luid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntAllocateLocallyUniqueId(luid?.value?.toCPointer<ByteVar>())

public actual fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntCommitComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntCommitEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntCommitTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), wait)

public actual fun ntCreateEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntCreateEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), desiredaccess, resourcemanagerhandle?.value?.toCPointer<ByteVar>(), transactionhandle?.value?.toCPointer<ByteVar>(), objectattributes?.value?.toCPointer<ByteVar>(), createoptions, notificationmask, enlistmentkey?.value?.toCPointer<ByteVar>())

public actual fun ntCreateResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, rmguid: COpaquePointer?, objectattributes: COpaquePointer?, createoptions: UInt, description: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntCreateResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), desiredaccess, tmhandle?.value?.toCPointer<ByteVar>(), rmguid?.value?.toCPointer<ByteVar>(), objectattributes?.value?.toCPointer<ByteVar>(), createoptions, description?.value?.toCPointer<ByteVar>())

public actual fun ntCreateTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntCreateTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), uow?.value?.toCPointer<ByteVar>(), tmhandle?.value?.toCPointer<ByteVar>(), createoptions, isolationlevel, isolationflags, timeout?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>())

public actual fun ntCreateTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, createoptions: UInt, commitstrength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntCreateTransactionManager(tmhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), logfilename?.value?.toCPointer<ByteVar>(), createoptions, commitstrength)

public actual fun ntDisplayString(string: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntDisplayString(string?.value?.toCPointer<ByteVar>())

public actual fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: COpaquePointer?, objectcursorlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntEnumerateTransactionObject(rootobjecthandle?.value?.toCPointer<ByteVar>(), querytype, objectcursor?.value?.toCPointer<ByteVar>(), objectcursorlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, timeout: COpaquePointer?, returnlength: COpaquePointer?, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntGetNotificationResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), transactionnotification?.value?.toCPointer<ByteVar>(), notificationlength, timeout?.value?.toCPointer<ByteVar>(), returnlength?.value?.toCPointer<ByteVar>(), asynchronous, asynchronouscontext)

public actual fun ntLoadDriver(driverservicename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntLoadDriver(driverservicename?.value?.toCPointer<ByteVar>())

public actual fun ntMakeTemporaryObject(handle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntMakeTemporaryObject(handle?.value?.toCPointer<ByteVar>())

public actual fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntManagePartition(targethandle?.value?.toCPointer<ByteVar>(), sourcehandle?.value?.toCPointer<ByteVar>(), partitioninformationclass, partitioninformation?.value?.toCPointer<ByteVar>(), partitioninformationlength)

public actual fun ntOpenEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntOpenEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), desiredaccess, resourcemanagerhandle?.value?.toCPointer<ByteVar>(), enlistmentguid?.value?.toCPointer<ByteVar>(), objectattributes?.value?.toCPointer<ByteVar>())

public actual fun ntOpenResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntOpenResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), desiredaccess, tmhandle?.value?.toCPointer<ByteVar>(), resourcemanagerguid?.value?.toCPointer<ByteVar>(), objectattributes?.value?.toCPointer<ByteVar>())

public actual fun ntOpenTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntOpenTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), uow?.value?.toCPointer<ByteVar>(), tmhandle?.value?.toCPointer<ByteVar>())

public actual fun ntOpenTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, tmidentity: COpaquePointer?, openoptions: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntOpenTransactionManager(tmhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), logfilename?.value?.toCPointer<ByteVar>(), tmidentity?.value?.toCPointer<ByteVar>(), openoptions)

public actual fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntPowerInformation(informationlevel, inputbuffer?.value?.toCPointer<ByteVar>(), inputbufferlength, outputbuffer?.value?.toCPointer<ByteVar>(), outputbufferlength)

public actual fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntPrePrepareComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntPrePrepareEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntPrepareComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntPrepareEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntPropagationComplete(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), requestcookie, bufferlength, buffer?.value?.toCPointer<ByteVar>())

public actual fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntPropagationFailed(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), requestcookie, propstatus)

public actual fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntQueryInformationEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), enlistmentinformationclass, enlistmentinformation?.value?.toCPointer<ByteVar>(), enlistmentinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntQueryInformationResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), resourcemanagerinformationclass, resourcemanagerinformation?.value?.toCPointer<ByteVar>(), resourcemanagerinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntQueryInformationTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), transactioninformationclass, transactioninformation?.value?.toCPointer<ByteVar>(), transactioninformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntQueryInformationTransactionManager(transactionmanagerhandle?.value?.toCPointer<ByteVar>(), transactionmanagerinformationclass, transactionmanagerinformation?.value?.toCPointer<ByteVar>(), transactionmanagerinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntReadOnlyEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntRecoverEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), enlistmentkey?.value?.toCPointer<ByteVar>())

public actual fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntRecoverResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>())

public actual fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntRecoverTransactionManager(transactionmanagerhandle?.value?.toCPointer<ByteVar>())

public actual fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: COpaquePointer?, protocolinformationsize: UInt, protocolinformation: COpaquePointer?, createoptions: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntRegisterProtocolAddressInformation(resourcemanager?.value?.toCPointer<ByteVar>(), protocolid?.value?.toCPointer<ByteVar>(), protocolinformationsize, protocolinformation?.value?.toCPointer<ByteVar>(), createoptions)

public actual fun ntRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntRenameTransactionManager(logfilename?.value?.toCPointer<ByteVar>(), existingtransactionmanagerguid?.value?.toCPointer<ByteVar>())

public actual fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntRollbackComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntRollbackEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntRollbackTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), wait)

public actual fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntRollforwardTransactionManager(transactionmanagerhandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntSetInformationEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), enlistmentinformationclass, enlistmentinformation?.value?.toCPointer<ByteVar>(), enlistmentinformationlength)

public actual fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntSetInformationResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), resourcemanagerinformationclass, resourcemanagerinformation?.value?.toCPointer<ByteVar>(), resourcemanagerinformationlength)

public actual fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntSetInformationTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), transactioninformationclass, transactioninformation?.value?.toCPointer<ByteVar>(), transactioninformationlength)

public actual fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntSetInformationTransactionManager(tmhandle?.value?.toCPointer<ByteVar>(), transactionmanagerinformationclass, transactionmanagerinformation?.value?.toCPointer<ByteVar>(), transactionmanagerinformationlength)

public actual fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntSinglePhaseReject(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun ntUnloadDriver(driverservicename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ntUnloadDriver(driverservicename?.value?.toCPointer<ByteVar>())

public actual fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obCloseHandle(handle?.value?.toCPointer<ByteVar>(), previousmode)

public actual fun obDereferenceObjectDeferDelete(obj: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDelete(obj?.value?.toCPointer<ByteVar>())
}

public actual fun obDereferenceObjectDeferDeleteWithTag(obj: COpaquePointer?, tag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDeleteWithTag(obj?.value?.toCPointer<ByteVar>(), tag)
}

public actual fun obGetFilterVersion(): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obGetFilterVersion()

public actual fun obGetObjectSecurity(obj: COpaquePointer?, securitydescriptor: COpaquePointer?, memoryallocated: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obGetObjectSecurity(obj?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), memoryallocated?.value?.toCPointer<ByteVar>())

public actual fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: COpaquePointer?, handleinformation: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandle(handle?.value?.toCPointer<ByteVar>(), desiredaccess, objecttype, accessmode, obj?.value?.toCPointer<ByteVar>(), handleinformation?.value?.toCPointer<ByteVar>())

public actual fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: COpaquePointer?, handleinformation: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandleWithTag(handle?.value?.toCPointer<ByteVar>(), desiredaccess, objecttype, accessmode, tag, obj?.value?.toCPointer<ByteVar>(), handleinformation?.value?.toCPointer<ByteVar>())

public actual fun obReferenceObjectByPointer(obj: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointer(obj?.value?.toCPointer<ByteVar>(), desiredaccess, objecttype, accessmode)

public actual fun obReferenceObjectByPointerWithTag(obj: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointerWithTag(obj?.value?.toCPointer<ByteVar>(), desiredaccess, objecttype, accessmode, tag)

public actual fun obReferenceObjectSafe(obj: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obReferenceObjectSafe(obj?.value?.toCPointer<ByteVar>())

public actual fun obReferenceObjectSafeWithTag(obj: COpaquePointer?, tag: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obReferenceObjectSafeWithTag(obj?.value?.toCPointer<ByteVar>(), tag)

public actual fun obRegisterCallbacks(callbackregistration: COpaquePointer?, registrationhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obRegisterCallbacks(callbackregistration?.value?.toCPointer<ByteVar>(), registrationhandle?.value?.toCPointer<ByteVar>())

public actual fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obReleaseObjectSecurity(securitydescriptor?.value?.toCPointer<ByteVar>(), memoryallocated)
}

public actual fun obUnRegisterCallbacks(registrationhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obUnRegisterCallbacks(registrationhandle?.value?.toCPointer<ByteVar>())
}

public actual fun obfDereferenceObject(obj: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obfDereferenceObject(obj?.value?.toCPointer<ByteVar>())

public actual fun obfDereferenceObjectWithTag(obj: COpaquePointer?, tag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obfDereferenceObjectWithTag(obj?.value?.toCPointer<ByteVar>(), tag)

public actual fun obfReferenceObject(obj: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obfReferenceObject(obj?.value?.toCPointer<ByteVar>())

public actual fun obfReferenceObjectWithTag(obj: COpaquePointer?, tag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_obfReferenceObjectWithTag(obj?.value?.toCPointer<ByteVar>(), tag)

public actual fun pcwAddInstance(buffer: PpcwBuffer, name: COpaquePointer?, id: UInt, count: UInt, data: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pcwAddInstance(buffer, name?.value?.toCPointer<ByteVar>(), id, count, data?.value?.toCPointer<ByteVar>())

public actual fun pcwCloseInstance(instance: PpcwInstance) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pcwCloseInstance(instance)
}

public actual fun pcwCreateInstance(instance: COpaquePointer?, registration: PpcwRegistration, name: COpaquePointer?, count: UInt, data: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pcwCreateInstance(instance?.value?.toCPointer<ByteVar>(), registration, name?.value?.toCPointer<ByteVar>(), count, data?.value?.toCPointer<ByteVar>())

public actual fun pcwRegister(registration: COpaquePointer?, info: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pcwRegister(registration?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun pcwUnregister(registration: PpcwRegistration) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pcwUnregister(registration)
}

public actual fun poCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poCallDriver(deviceobject?.value?.toCPointer<ByteVar>(), irp?.value?.toCPointer<ByteVar>())

public actual fun poClearPowerRequest(powerrequest: COpaquePointer?, type: PowerRequestType): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poClearPowerRequest(powerrequest?.value?.toCPointer<ByteVar>(), type)

public actual fun poCreatePowerRequest(powerrequest: COpaquePointer?, deviceobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poCreatePowerRequest(powerrequest?.value?.toCPointer<ByteVar>(), deviceobject?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun poCreateThermalRequest(thermalrequest: COpaquePointer?, targetdeviceobject: COpaquePointer?, policydeviceobject: COpaquePointer?, context: COpaquePointer?, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poCreateThermalRequest(thermalrequest?.value?.toCPointer<ByteVar>(), targetdeviceobject?.value?.toCPointer<ByteVar>(), policydeviceobject?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), flags)

public actual fun poDeletePowerRequest(powerrequest: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poDeletePowerRequest(powerrequest?.value?.toCPointer<ByteVar>())
}

public actual fun poDeleteThermalRequest(thermalrequest: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poDeleteThermalRequest(thermalrequest?.value?.toCPointer<ByteVar>())
}

public actual fun poEndDeviceBusy(idlepointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poEndDeviceBusy(idlepointer?.value?.toCPointer<ByteVar>())
}

public actual fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxActivateComponent(handle?.value?.toCPointer<ByteVar>(), component, flags)
}

public actual fun poFxCompleteDevicePowerNotRequired(handle: Pohandle) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxCompleteDevicePowerNotRequired(handle?.value?.toCPointer<ByteVar>())
}

public actual fun poFxCompleteDirectedPowerDown(handle: Pohandle) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxCompleteDirectedPowerDown(handle?.value?.toCPointer<ByteVar>())
}

public actual fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxCompleteIdleCondition(handle?.value?.toCPointer<ByteVar>(), component)
}

public actual fun poFxCompleteIdleState(handle: Pohandle, component: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxCompleteIdleState(handle?.value?.toCPointer<ByteVar>(), component)
}

public actual fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxIdleComponent(handle?.value?.toCPointer<ByteVar>(), component, flags)
}

public actual fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: COpaquePointer?, context: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChange(handle?.value?.toCPointer<ByteVar>(), flags, component, perfchange?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())
}

public actual fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: COpaquePointer?, context: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChangeMultiple(handle?.value?.toCPointer<ByteVar>(), flags, component, perfchangescount, perfchanges?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())
}

public actual fun poFxNotifySurprisePowerOn(pdo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxNotifySurprisePowerOn(pdo?.value?.toCPointer<ByteVar>())
}

public actual fun poFxPowerControl(handle: Pohandle, powercontrolcode: COpaquePointer?, inbuffer: COpaquePointer?, inbuffersize: ULong, outbuffer: COpaquePointer?, outbuffersize: ULong, bytesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxPowerControl(handle?.value?.toCPointer<ByteVar>(), powercontrolcode?.value?.toCPointer<ByteVar>(), inbuffer?.value?.toCPointer<ByteVar>(), inbuffersize, outbuffer?.value?.toCPointer<ByteVar>(), outbuffersize, bytesreturned?.value?.toCPointer<ByteVar>())

public actual fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxPowerOnCrashdumpDevice(handle?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxQueryCurrentComponentPerfState(handle?.value?.toCPointer<ByteVar>(), flags, component, setindex, currentperf?.value?.toCPointer<ByteVar>())

public actual fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: COpaquePointer?, outputstateinfo: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxRegisterComponentPerfStates(handle?.value?.toCPointer<ByteVar>(), component, flags, 0L.toCPointer<ByteVar>(), inputstateinfo?.value?.toCPointer<ByteVar>(), outputstateinfo?.value?.toCPointer<ByteVar>())

public actual fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxRegisterCrashdumpDevice(handle?.value?.toCPointer<ByteVar>())

public actual fun poFxRegisterDevice(pdo: COpaquePointer?, device: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxRegisterDevice(pdo?.value?.toCPointer<ByteVar>(), device?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxRegisterDripsWatchdogCallback(handle?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), includechilddevices, matchingdriverobject?.value?.toCPointer<ByteVar>())
}

public actual fun poFxReportDevicePoweredOn(handle: Pohandle) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxReportDevicePoweredOn(handle?.value?.toCPointer<ByteVar>())
}

public actual fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxSetComponentLatency(handle?.value?.toCPointer<ByteVar>(), component, latency)
}

public actual fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxSetComponentResidency(handle?.value?.toCPointer<ByteVar>(), component, residency)
}

public actual fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxSetComponentWake(handle?.value?.toCPointer<ByteVar>(), component, wakehint)
}

public actual fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxSetDeviceIdleTimeout(handle?.value?.toCPointer<ByteVar>(), idletimeout)
}

public actual fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxSetTargetDripsDevicePowerState(handle?.value?.toCPointer<ByteVar>(), targetstate)

public actual fun poFxStartDevicePowerManagement(handle: Pohandle) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxStartDevicePowerManagement(handle?.value?.toCPointer<ByteVar>())
}

public actual fun poFxUnregisterDevice(handle: Pohandle) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poFxUnregisterDevice(handle?.value?.toCPointer<ByteVar>())
}

public actual fun poGetSystemWake(irp: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poGetSystemWake(irp?.value?.toCPointer<ByteVar>())

public actual fun poGetThermalRequestSupport(thermalrequest: COpaquePointer?, type: PoThermalRequestType): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poGetThermalRequestSupport(thermalrequest?.value?.toCPointer<ByteVar>(), type)

public actual fun poQueryWatchdogTime(pdo: COpaquePointer?, secondsremaining: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poQueryWatchdogTime(pdo?.value?.toCPointer<ByteVar>(), secondsremaining?.value?.toCPointer<ByteVar>())

public actual fun poRegisterDeviceForIdleDetection(deviceobject: COpaquePointer?, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poRegisterDeviceForIdleDetection(deviceobject?.value?.toCPointer<ByteVar>(), conservationidletime, performanceidletime, state)?.let { COpaquePointer(it.toLong()) }

public actual fun poRegisterPowerSettingCallback(deviceobject: COpaquePointer?, settingguid: COpaquePointer?, callback: PpowerSettingCallback, context: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poRegisterPowerSettingCallback(deviceobject?.value?.toCPointer<ByteVar>(), settingguid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun poRegisterSystemState(statehandle: COpaquePointer?, flags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poRegisterSystemState(statehandle?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun poRequestPowerIrp(deviceobject: COpaquePointer?, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    0

public actual fun poSetDeviceBusyEx(idlepointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poSetDeviceBusyEx(idlepointer?.value?.toCPointer<ByteVar>())
}

public actual fun poSetHiberRange(memorymap: COpaquePointer?, flags: UInt, address: COpaquePointer?, length: ULong, tag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poSetHiberRange(memorymap?.value?.toCPointer<ByteVar>(), flags, address?.value?.toCPointer<ByteVar>(), length, tag)
}

public actual fun poSetPowerRequest(powerrequest: COpaquePointer?, type: PowerRequestType): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poSetPowerRequest(powerrequest?.value?.toCPointer<ByteVar>(), type)

public actual fun poSetPowerState(deviceobject: COpaquePointer?, type: PowerStateType, state: PowerState): PowerState =
    PowerState()

public actual fun poSetSystemState(flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poSetSystemState(flags)
}

public actual fun poSetSystemWake(irp: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poSetSystemWake(irp?.value?.toCPointer<ByteVar>())
}

public actual fun poSetSystemWakeDevice(deviceobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poSetSystemWakeDevice(deviceobject?.value?.toCPointer<ByteVar>())
}

public actual fun poSetThermalActiveCooling(thermalrequest: COpaquePointer?, engaged: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poSetThermalActiveCooling(thermalrequest?.value?.toCPointer<ByteVar>(), engaged)

public actual fun poSetThermalPassiveCooling(thermalrequest: COpaquePointer?, throttle: UByte): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poSetThermalPassiveCooling(thermalrequest?.value?.toCPointer<ByteVar>(), throttle)

public actual fun poStartDeviceBusy(idlepointer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poStartDeviceBusy(idlepointer?.value?.toCPointer<ByteVar>())
}

public actual fun poStartNextPowerIrp(irp: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poStartNextPowerIrp(irp?.value?.toCPointer<ByteVar>())
}

public actual fun poUnregisterPowerSettingCallback(handle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poUnregisterPowerSettingCallback(handle?.value?.toCPointer<ByteVar>())

public actual fun poUnregisterSystemState(statehandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_poUnregisterSystemState(statehandle?.value?.toCPointer<ByteVar>())
}

public actual fun probeForRead(address: COpaquePointer?, length: ULong, alignment: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_probeForRead(address?.value?.toCPointer<ByteVar>(), length, alignment)
}

public actual fun probeForWrite(address: COpaquePointer?, length: ULong, alignment: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_probeForWrite(address?.value?.toCPointer<ByteVar>(), length, alignment)
}

public actual fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psAcquireSiloHardReference(silo)

public actual fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psAllocSiloContextSlot(reserved, returnedcontextslot?.value?.toCPointer<ByteVar>())

public actual fun psAllocateAffinityToken(affinitytoken: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psAllocateAffinityToken(affinitytoken?.value?.toCPointer<ByteVar>())

public actual fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psAttachSiloToCurrentThread(silo)

public actual fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psCreateSiloContext(silo, size, pooltype, 0L.toCPointer<ByteVar>(), returnedsilocontext?.value?.toCPointer<ByteVar>())

public actual fun psCreateSystemThread(threadhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, processhandle: Handle, clientid: COpaquePointer?, startroutine: PkstartRoutine, startcontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psCreateSystemThread(threadhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), processhandle?.value?.toCPointer<ByteVar>(), clientid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), startcontext?.value?.toCPointer<ByteVar>())

public actual fun psDereferenceSiloContext(silocontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psDereferenceSiloContext(silocontext?.value?.toCPointer<ByteVar>())
}

public actual fun psDetachSiloFromCurrentThread(previoussilo: Pesilo) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psDetachSiloFromCurrentThread(previoussilo)
}

public actual fun psFreeAffinityToken(affinitytoken: PaffinityToken) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psFreeAffinityToken(affinitytoken)
}

public actual fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psFreeSiloContextSlot(contextslot)

public actual fun psGetCurrentProcessId(): Handle =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetCurrentProcessId()?.let { COpaquePointer(it.toLong()) }

public actual fun psGetCurrentServerSilo(): Pesilo =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetCurrentServerSilo()

public actual fun psGetCurrentServerSiloName(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetCurrentServerSiloName()?.let { COpaquePointer(it.toLong()) }

public actual fun psGetCurrentSilo(): Pesilo =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetCurrentSilo()

public actual fun psGetCurrentThreadId(): Handle =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetCurrentThreadId()?.let { COpaquePointer(it.toLong()) }

public actual fun psGetCurrentThreadTeb(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetCurrentThreadTeb()?.let { COpaquePointer(it.toLong()) }

public actual fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetEffectiveServerSilo(silo)

public actual fun psGetHostSilo(): Pesilo =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetHostSilo()

public actual fun psGetJobServerSilo(job: Pejob, serversilo: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetJobServerSilo(job, serversilo?.value?.toCPointer<ByteVar>())

public actual fun psGetJobSilo(job: Pejob, silo: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetJobSilo(job, silo?.value?.toCPointer<ByteVar>())

public actual fun psGetParentSilo(job: Pejob): Pesilo =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetParentSilo(job)

public actual fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetPermanentSiloContext(silo, contextslot, returnedsilocontext?.value?.toCPointer<ByteVar>())

public actual fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetProcessCreateTimeQuadPart(process)

public actual fun psGetProcessExitStatus(process: Peprocess): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetProcessExitStatus(process)

public actual fun psGetProcessId(process: Peprocess): Handle =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetProcessId(process)?.let { COpaquePointer(it.toLong()) }

public actual fun psGetProcessStartKey(process: Peprocess): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetProcessStartKey(process)

public actual fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetServerSiloServiceSessionId(silo)

public actual fun psGetSiloContainerId(silo: Pesilo): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetSiloContainerId(silo)?.let { COpaquePointer(it.toLong()) }

public actual fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetSiloContext(silo, contextslot, returnedsilocontext?.value?.toCPointer<ByteVar>())

public actual fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetSiloMonitorContextSlot(monitor)

public actual fun psGetThreadCreateTime(thread: Pethread): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetThreadCreateTime(thread)

public actual fun psGetThreadExitStatus(thread: Pethread): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetThreadExitStatus(thread)

public actual fun psGetThreadId(thread: Pethread): Handle =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetThreadId(thread)?.let { COpaquePointer(it.toLong()) }

public actual fun psGetThreadProcessId(thread: Pethread): Handle =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetThreadProcessId(thread)?.let { COpaquePointer(it.toLong()) }

public actual fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetThreadProperty(thread, key, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun psGetThreadServerSilo(thread: Pethread): Pesilo =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetThreadServerSilo(thread)

public actual fun psGetVersion(majorversion: COpaquePointer?, minorversion: COpaquePointer?, buildnumber: COpaquePointer?, csdversion: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psGetVersion(majorversion?.value?.toCPointer<ByteVar>(), minorversion?.value?.toCPointer<ByteVar>(), buildnumber?.value?.toCPointer<ByteVar>(), csdversion?.value?.toCPointer<ByteVar>())

public actual fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psInsertPermanentSiloContext(silo, contextslot, silocontext?.value?.toCPointer<ByteVar>())

public actual fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psInsertSiloContext(silo, contextslot, silocontext?.value?.toCPointer<ByteVar>())

public actual fun psIsCurrentThreadInServerSilo(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psIsCurrentThreadInServerSilo()

public actual fun psIsCurrentThreadPrefetching(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psIsCurrentThreadPrefetching()

public actual fun psIsHostSilo(silo: Pesilo): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psIsHostSilo(silo)

public actual fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psMakeSiloContextPermanent(silo, contextslot)

public actual fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psQueryTotalCycleTimeProcess(process, cycletimestamp?.value?.toCPointer<ByteVar>())

public actual fun psReferenceSiloContext(silocontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psReferenceSiloContext(silocontext?.value?.toCPointer<ByteVar>())
}

public actual fun psRegisterSiloMonitor(registration: COpaquePointer?, returnedmonitor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psRegisterSiloMonitor(registration?.value?.toCPointer<ByteVar>(), returnedmonitor?.value?.toCPointer<ByteVar>())

public actual fun psReleaseSiloHardReference(silo: Pesilo) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psReleaseSiloHardReference(silo)
}

public actual fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psRemoveCreateThreadNotifyRoutine(0L.toCPointer<ByteVar>())

public actual fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psRemoveLoadImageNotifyRoutine(0L.toCPointer<ByteVar>())

public actual fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psRemoveSiloContext(silo, contextslot, removedsilocontext?.value?.toCPointer<ByteVar>())

public actual fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: COpaquePointer?, oldsilocontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psReplaceSiloContext(silo, contextslot, newsilocontext?.value?.toCPointer<ByteVar>(), oldsilocontext?.value?.toCPointer<ByteVar>())

public actual fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psRevertToUserMultipleGroupAffinityThread(affinitytoken)
}

public actual fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutine(0L.toCPointer<ByteVar>(), remove)

public actual fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx(0L.toCPointer<ByteVar>(), remove)

public actual fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: COpaquePointer?, remove: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx2(notifytype, notifyinformation?.value?.toCPointer<ByteVar>(), remove)

public actual fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutine(0L.toCPointer<ByteVar>())

public actual fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutineEx(notifytype, notifyinformation?.value?.toCPointer<ByteVar>())

public actual fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psSetCurrentThreadPrefetching(prefetching)

public actual fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutine(0L.toCPointer<ByteVar>())

public actual fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutineEx(0L.toCPointer<ByteVar>(), flags)

public actual fun psSetSystemMultipleGroupAffinityThread(groupaffinities: COpaquePointer?, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psSetSystemMultipleGroupAffinityThread(groupaffinities?.value?.toCPointer<ByteVar>(), groupcount, affinitytoken)

public actual fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psStartSiloMonitor(monitor)

public actual fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psTerminateServerSilo(serversilo, exitstatus)
}

public actual fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psTerminateSystemThread(exitstatus)

public actual fun psUnregisterSiloMonitor(monitor: PsiloMonitor) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psUnregisterSiloMonitor(monitor)
}

public actual fun psWrapApcWow64Thread(apccontext: COpaquePointer?, apcroutine: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_psWrapApcWow64Thread(apccontext?.value?.toCPointer<ByteVar>(), apcroutine?.value?.toCPointer<ByteVar>())

public actual fun pshedAllocateMemory(size: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pshedAllocateMemory(size)?.let { COpaquePointer(it.toLong()) }

public actual fun pshedFreeMemory(address: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pshedFreeMemory(address?.value?.toCPointer<ByteVar>())
}

public actual fun pshedIsSystemWheaEnabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pshedIsSystemWheaEnabled()

public actual fun pshedRegisterPlugin(packet: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pshedRegisterPlugin(packet?.value?.toCPointer<ByteVar>())

public actual fun pshedSynchronizeExecution(errorsource: COpaquePointer?, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pshedSynchronizeExecution(errorsource?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), synchronizecontext?.value?.toCPointer<ByteVar>())

public actual fun pshedUnregisterPlugin(pluginhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_pshedUnregisterPlugin(pluginhandle?.value?.toCPointer<ByteVar>())
}

public actual fun rtlAppendUnicodeStringToString(destination: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeStringToString(destination?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>())

public actual fun rtlAppendUnicodeToString(destination: COpaquePointer?, source: Pcwstr): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeToString(destination?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>())

public actual fun rtlAreBitsClear(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlAreBitsClear(bitmapheader?.value?.toCPointer<ByteVar>(), startingindex, length)

public actual fun rtlAreBitsSet(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlAreBitsSet(bitmapheader?.value?.toCPointer<ByteVar>(), startingindex, length)

public actual fun rtlAssert(voidfailedassertion: COpaquePointer?, voidfilename: COpaquePointer?, linenumber: UInt, mutablemessage: Pcstr) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlAssert(voidfailedassertion?.value?.toCPointer<ByteVar>(), voidfilename?.value?.toCPointer<ByteVar>(), linenumber, mutablemessage?.value?.toCPointer<ByteVar>())
}

public actual fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCheckRegistryKey(relativeto, path?.value?.toCPointer<ByteVar>())

public actual fun rtlClearAllBits(bitmapheader: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlClearAllBits(bitmapheader?.value?.toCPointer<ByteVar>())
}

public actual fun rtlClearBit(bitmapheader: COpaquePointer?, bitnumber: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlClearBit(bitmapheader?.value?.toCPointer<ByteVar>(), bitnumber)
}

public actual fun rtlClearBits(bitmapheader: COpaquePointer?, startingindex: UInt, numbertoclear: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlClearBits(bitmapheader?.value?.toCPointer<ByteVar>(), startingindex, numbertoclear)
}

public actual fun rtlCmDecodeMemIoResource(descriptor: COpaquePointer?, start: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCmDecodeMemIoResource(descriptor?.value?.toCPointer<ByteVar>(), start?.value?.toCPointer<ByteVar>())

public actual fun rtlCmEncodeMemIoResource(descriptor: COpaquePointer?, type: UByte, length: ULong, start: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCmEncodeMemIoResource(descriptor?.value?.toCPointer<ByteVar>(), type, length, start)

public actual fun rtlCompareString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCompareString(string1?.value?.toCPointer<ByteVar>(), string2?.value?.toCPointer<ByteVar>(), caseinsensitive)

public actual fun rtlCompareUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeString(string1?.value?.toCPointer<ByteVar>(), string2?.value?.toCPointer<ByteVar>(), caseinsensitive)

public actual fun rtlCompareUnicodeStrings(string1: COpaquePointer?, string1length: ULong, string2: COpaquePointer?, string2length: ULong, caseinsensitive: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeStrings(string1?.value?.toCPointer<ByteVar>(), string1length, string2?.value?.toCPointer<ByteVar>(), string2length, caseinsensitive)

public actual fun rtlContractHashTable(hashtable: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlContractHashTable(hashtable?.value?.toCPointer<ByteVar>())

public actual fun rtlCopyBitMap(source: COpaquePointer?, destination: COpaquePointer?, targetbit: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCopyBitMap(source?.value?.toCPointer<ByteVar>(), destination?.value?.toCPointer<ByteVar>(), targetbit)
}

public actual fun rtlCopyString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCopyString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>())
}

public actual fun rtlCopyUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCopyUnicodeString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>())
}

public actual fun rtlCreateHashTable(hashtable: COpaquePointer?, shift: UInt, flags: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCreateHashTable(hashtable?.value?.toCPointer<ByteVar>(), shift, flags)

public actual fun rtlCreateHashTableEx(hashtable: COpaquePointer?, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCreateHashTableEx(hashtable?.value?.toCPointer<ByteVar>(), initialsize, shift, flags)

public actual fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCreateRegistryKey(relativeto, path?.value?.toCPointer<ByteVar>())

public actual fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlCreateSecurityDescriptor(securitydescriptor?.value?.toCPointer<ByteVar>(), revision)

public actual fun rtlDelete(links: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlDelete(links?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlDeleteElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTable(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun rtlDeleteElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvl(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun rtlDeleteElementGenericTableAvlEx(table: COpaquePointer?, nodeorparent: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvlEx(table?.value?.toCPointer<ByteVar>(), nodeorparent?.value?.toCPointer<ByteVar>())
}

public actual fun rtlDeleteHashTable(hashtable: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlDeleteHashTable(hashtable?.value?.toCPointer<ByteVar>())
}

public actual fun rtlDeleteNoSplay(links: COpaquePointer?, root: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlDeleteNoSplay(links?.value?.toCPointer<ByteVar>(), root?.value?.toCPointer<ByteVar>())
}

public actual fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlDeleteRegistryValue(relativeto, path?.value?.toCPointer<ByteVar>(), valuename?.value?.toCPointer<ByteVar>())

public actual fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlDowncaseUnicodeChar(sourcecharacter)

public actual fun rtlEndEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEndEnumerationHashTable(hashtable?.value?.toCPointer<ByteVar>(), enumerator?.value?.toCPointer<ByteVar>())
}

public actual fun rtlEndStrongEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEndStrongEnumerationHashTable(hashtable?.value?.toCPointer<ByteVar>(), enumerator?.value?.toCPointer<ByteVar>())
}

public actual fun rtlEndWeakEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEndWeakEnumerationHashTable(hashtable?.value?.toCPointer<ByteVar>(), enumerator?.value?.toCPointer<ByteVar>())
}

public actual fun rtlEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEnumerateEntryHashTable(hashtable?.value?.toCPointer<ByteVar>(), enumerator?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlEnumerateGenericTable(table: COpaquePointer?, restart: Boolean): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTable(table?.value?.toCPointer<ByteVar>(), restart)?.let { COpaquePointer(it.toLong()) }

public actual fun rtlEnumerateGenericTableAvl(table: COpaquePointer?, restart: Boolean): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableAvl(table?.value?.toCPointer<ByteVar>(), restart)?.let { COpaquePointer(it.toLong()) }

public actual fun rtlEnumerateGenericTableLikeADirectory(table: COpaquePointer?, matchfunction: PrtlAvlMatchFunction, matchdata: COpaquePointer?, nextflag: UInt, restartkey: COpaquePointer?, deletecount: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableLikeADirectory(table?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), matchdata?.value?.toCPointer<ByteVar>(), nextflag, restartkey?.value?.toCPointer<ByteVar>(), deletecount?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlEnumerateGenericTableWithoutSplaying(table: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplaying(table?.value?.toCPointer<ByteVar>(), restartkey?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlEnumerateGenericTableWithoutSplayingAvl(table: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplayingAvl(table?.value?.toCPointer<ByteVar>(), restartkey?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlEqualString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEqualString(string1?.value?.toCPointer<ByteVar>(), string2?.value?.toCPointer<ByteVar>(), caseinsensitive)

public actual fun rtlEqualUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlEqualUnicodeString(string1?.value?.toCPointer<ByteVar>(), string2?.value?.toCPointer<ByteVar>(), caseinsensitive)

public actual fun rtlExpandHashTable(hashtable: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlExpandHashTable(hashtable?.value?.toCPointer<ByteVar>())

public actual fun rtlExtractBitMap(source: COpaquePointer?, destination: COpaquePointer?, targetbit: UInt, numberofbits: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlExtractBitMap(source?.value?.toCPointer<ByteVar>(), destination?.value?.toCPointer<ByteVar>(), targetbit, numberofbits)
}

public actual fun rtlFindClearBits(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindClearBits(bitmapheader?.value?.toCPointer<ByteVar>(), numbertofind, hintindex)

public actual fun rtlFindClearBitsAndSet(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindClearBitsAndSet(bitmapheader?.value?.toCPointer<ByteVar>(), numbertofind, hintindex)

public actual fun rtlFindClearRuns(bitmapheader: COpaquePointer?, runarray: COpaquePointer?, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindClearRuns(bitmapheader?.value?.toCPointer<ByteVar>(), runarray?.value?.toCPointer<ByteVar>(), sizeofrunarray, locatelongestruns)

public actual fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindClosestEncodableLength(sourcelength, targetlength?.value?.toCPointer<ByteVar>())

public actual fun rtlFindFirstRunClear(bitmapheader: COpaquePointer?, startingindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindFirstRunClear(bitmapheader?.value?.toCPointer<ByteVar>(), startingindex?.value?.toCPointer<ByteVar>())

public actual fun rtlFindLastBackwardRunClear(bitmapheader: COpaquePointer?, fromindex: UInt, startingrunindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindLastBackwardRunClear(bitmapheader?.value?.toCPointer<ByteVar>(), fromindex, startingrunindex?.value?.toCPointer<ByteVar>())

public actual fun rtlFindLeastSignificantBit(set: ULong): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindLeastSignificantBit(set)

public actual fun rtlFindLongestRunClear(bitmapheader: COpaquePointer?, startingindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindLongestRunClear(bitmapheader?.value?.toCPointer<ByteVar>(), startingindex?.value?.toCPointer<ByteVar>())

public actual fun rtlFindMostSignificantBit(set: ULong): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindMostSignificantBit(set)

public actual fun rtlFindNextForwardRunClear(bitmapheader: COpaquePointer?, fromindex: UInt, startingrunindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindNextForwardRunClear(bitmapheader?.value?.toCPointer<ByteVar>(), fromindex, startingrunindex?.value?.toCPointer<ByteVar>())

public actual fun rtlFindSetBits(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindSetBits(bitmapheader?.value?.toCPointer<ByteVar>(), numbertofind, hintindex)

public actual fun rtlFindSetBitsAndClear(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFindSetBitsAndClear(bitmapheader?.value?.toCPointer<ByteVar>(), numbertofind, hintindex)

public actual fun rtlFreeUTF8String(utf8string: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlFreeUTF8String(utf8string?.value?.toCPointer<ByteVar>())
}

public actual fun rtlGUIDFromString(guidstring: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGUIDFromString(guidstring?.value?.toCPointer<ByteVar>(), guid?.value?.toCPointer<ByteVar>())

public actual fun rtlGenerateClass5Guid(namespaceguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, guid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGenerateClass5Guid(namespaceguid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize, guid?.value?.toCPointer<ByteVar>())

public actual fun rtlGetActiveConsoleId(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetActiveConsoleId()

public actual fun rtlGetCallersAddress(callersaddress: COpaquePointer?, callerscaller: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetCallersAddress(callersaddress?.value?.toCPointer<ByteVar>(), callerscaller?.value?.toCPointer<ByteVar>())
}

public actual fun rtlGetConsoleSessionForegroundProcessId(): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetConsoleSessionForegroundProcessId()

public actual fun rtlGetElementGenericTable(table: COpaquePointer?, i: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTable(table?.value?.toCPointer<ByteVar>(), i)?.let { COpaquePointer(it.toLong()) }

public actual fun rtlGetElementGenericTableAvl(table: COpaquePointer?, i: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTableAvl(table?.value?.toCPointer<ByteVar>(), i)?.let { COpaquePointer(it.toLong()) }

public actual fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetEnabledExtendedFeatures(featuremask)

public actual fun rtlGetNextEntryHashTable(hashtable: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetNextEntryHashTable(hashtable?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlGetNtProductType(ntproducttype: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetNtProductType(ntproducttype?.value?.toCPointer<ByteVar>())

public actual fun rtlGetNtSystemRoot(): Pcwstr =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetNtSystemRoot()?.let { COpaquePointer(it.toLong()) }

public actual fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetPersistedStateLocation(sourceid?.value?.toCPointer<ByteVar>(), customvalue?.value?.toCPointer<ByteVar>(), defaultpath?.value?.toCPointer<ByteVar>(), statelocationtype, targetpath?.value?.toCPointer<ByteVar>(), bufferlengthin, bufferlengthout?.value?.toCPointer<ByteVar>())

public actual fun rtlGetSuiteMask(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetSuiteMask()

public actual fun rtlGetVersion(lpversioninformation: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlGetVersion(lpversioninformation?.value?.toCPointer<ByteVar>())

public actual fun rtlHashUnicodeString(string: COpaquePointer?, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlHashUnicodeString(string?.value?.toCPointer<ByteVar>(), caseinsensitive, hashalgorithm, hashvalue?.value?.toCPointer<ByteVar>())

public actual fun rtlInitEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInitEnumerationHashTable(hashtable?.value?.toCPointer<ByteVar>(), enumerator?.value?.toCPointer<ByteVar>())

public actual fun rtlInitStrongEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInitStrongEnumerationHashTable(hashtable?.value?.toCPointer<ByteVar>(), enumerator?.value?.toCPointer<ByteVar>())

public actual fun rtlInitUTF8String(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInitUTF8String(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>())
}

public actual fun rtlInitUTF8StringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInitUTF8StringEx(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>())

public actual fun rtlInitWeakEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInitWeakEnumerationHashTable(hashtable?.value?.toCPointer<ByteVar>(), enumerator?.value?.toCPointer<ByteVar>())

public actual fun rtlInitializeBitMap(bitmapheader: COpaquePointer?, bitmapbuffer: COpaquePointer?, sizeofbitmap: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInitializeBitMap(bitmapheader?.value?.toCPointer<ByteVar>(), bitmapbuffer?.value?.toCPointer<ByteVar>(), sizeofbitmap)
}

public actual fun rtlInitializeGenericTable(table: COpaquePointer?, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTable(table?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), tablecontext?.value?.toCPointer<ByteVar>())
}

public actual fun rtlInitializeGenericTableAvl(table: COpaquePointer?, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTableAvl(table?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), tablecontext?.value?.toCPointer<ByteVar>())
}

public actual fun rtlInsertElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTable(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize, newelement?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlInsertElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableAvl(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize, newelement?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlInsertElementGenericTableFull(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: TableSearchResult): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFull(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize, newelement?.value?.toCPointer<ByteVar>(), nodeorparent?.value?.toCPointer<ByteVar>(), searchresult)?.let { COpaquePointer(it.toLong()) }

public actual fun rtlInsertElementGenericTableFullAvl(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: TableSearchResult): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFullAvl(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize, newelement?.value?.toCPointer<ByteVar>(), nodeorparent?.value?.toCPointer<ByteVar>(), searchresult)?.let { COpaquePointer(it.toLong()) }

public actual fun rtlInsertEntryHashTable(hashtable: COpaquePointer?, entry: COpaquePointer?, signature: ULong, context: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInsertEntryHashTable(hashtable?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), signature, context?.value?.toCPointer<ByteVar>())

public actual fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlInt64ToUnicodeString(value, base, string?.value?.toCPointer<ByteVar>())

public actual fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIntegerToUnicodeString(value, base, string?.value?.toCPointer<ByteVar>())

public actual fun rtlIoDecodeMemIoResource(descriptor: COpaquePointer?, alignment: COpaquePointer?, minimumaddress: COpaquePointer?, maximumaddress: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIoDecodeMemIoResource(descriptor?.value?.toCPointer<ByteVar>(), alignment?.value?.toCPointer<ByteVar>(), minimumaddress?.value?.toCPointer<ByteVar>(), maximumaddress?.value?.toCPointer<ByteVar>())

public actual fun rtlIoEncodeMemIoResource(descriptor: COpaquePointer?, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIoEncodeMemIoResource(descriptor?.value?.toCPointer<ByteVar>(), type, length, alignment, minimumaddress, maximumaddress)

public actual fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIsApiSetImplemented(apisetname?.value?.toCPointer<ByteVar>())

public actual fun rtlIsGenericTableEmpty(table: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmpty(table?.value?.toCPointer<ByteVar>())

public actual fun rtlIsGenericTableEmptyAvl(table: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmptyAvl(table?.value?.toCPointer<ByteVar>())

public actual fun rtlIsMultiSessionSku(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIsMultiSessionSku()

public actual fun rtlIsMultiUsersInSessionSku(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIsMultiUsersInSessionSku()

public actual fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIsNtDdiVersionAvailable(version)

public actual fun rtlIsServicePackVersionInstalled(version: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIsServicePackVersionInstalled(version)

public actual fun rtlIsStateSeparationEnabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIsStateSeparationEnabled()

public actual fun rtlIsUntrustedObject(handle: Handle, obj: COpaquePointer?, untrustedobject: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlIsUntrustedObject(handle?.value?.toCPointer<ByteVar>(), obj?.value?.toCPointer<ByteVar>(), untrustedobject?.value?.toCPointer<ByteVar>())

public actual fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlLengthSecurityDescriptor(securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rtlLookupElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTable(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlLookupElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableAvl(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlLookupElementGenericTableFull(table: COpaquePointer?, buffer: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFull(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), nodeorparent?.value?.toCPointer<ByteVar>(), searchresult?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlLookupElementGenericTableFullAvl(table: COpaquePointer?, buffer: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFullAvl(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), nodeorparent?.value?.toCPointer<ByteVar>(), searchresult?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlLookupEntryHashTable(hashtable: COpaquePointer?, signature: ULong, context: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlLookupEntryHashTable(hashtable?.value?.toCPointer<ByteVar>(), signature, context?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlLookupFirstMatchingElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlLookupFirstMatchingElementGenericTableAvl(table?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), restartkey?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlMapGenericMask(accessmask: COpaquePointer?, genericmapping: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlMapGenericMask(accessmask?.value?.toCPointer<ByteVar>(), genericmapping?.value?.toCPointer<ByteVar>())
}

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: COpaquePointer?, securitydescriptorlength: UInt, newsecuritydescriptor: COpaquePointer?, newsecuritydescriptorlength: COpaquePointer?, checkonly: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlNormalizeSecurityDescriptor(securitydescriptor?.value?.toCPointer<ByteVar>(), securitydescriptorlength, newsecuritydescriptor?.value?.toCPointer<ByteVar>(), newsecuritydescriptorlength?.value?.toCPointer<ByteVar>(), checkonly)

public actual fun rtlNumberGenericTableElements(table: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElements(table?.value?.toCPointer<ByteVar>())

public actual fun rtlNumberGenericTableElementsAvl(table: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElementsAvl(table?.value?.toCPointer<ByteVar>())

public actual fun rtlNumberOfClearBits(bitmapheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBits(bitmapheader?.value?.toCPointer<ByteVar>())

public actual fun rtlNumberOfClearBitsInRange(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBitsInRange(bitmapheader?.value?.toCPointer<ByteVar>(), startingindex, length)

public actual fun rtlNumberOfSetBits(bitmapheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBits(bitmapheader?.value?.toCPointer<ByteVar>())

public actual fun rtlNumberOfSetBitsInRange(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsInRange(bitmapheader?.value?.toCPointer<ByteVar>(), startingindex, length)

public actual fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsUlongPtr(target)

public actual fun rtlPrefetchMemoryNonTemporal(source: COpaquePointer?, length: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlPrefetchMemoryNonTemporal(source?.value?.toCPointer<ByteVar>(), length)
}

public actual fun rtlPrefixUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlPrefixUnicodeString(string1?.value?.toCPointer<ByteVar>(), string2?.value?.toCPointer<ByteVar>(), caseinsensitive)

public actual fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: COpaquePointer?, valuelength: UInt, valuetype: COpaquePointer?, valuedata: COpaquePointer?, resultlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValueWithFallback(primaryhandle?.value?.toCPointer<ByteVar>(), fallbackhandle?.value?.toCPointer<ByteVar>(), valuename?.value?.toCPointer<ByteVar>(), valuelength, valuetype?.value?.toCPointer<ByteVar>(), valuedata?.value?.toCPointer<ByteVar>(), resultlength?.value?.toCPointer<ByteVar>())

public actual fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: COpaquePointer?, context: COpaquePointer?, environment: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValues(relativeto, path?.value?.toCPointer<ByteVar>(), querytable?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), environment?.value?.toCPointer<ByteVar>())

public actual fun rtlQueryValidationRunlevel(componentname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlQueryValidationRunlevel(componentname?.value?.toCPointer<ByteVar>())

public actual fun rtlRealPredecessor(links: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlRealPredecessor(links?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlRealSuccessor(links: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlRealSuccessor(links?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlRemoveEntryHashTable(hashtable: COpaquePointer?, entry: COpaquePointer?, context: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlRemoveEntryHashTable(hashtable?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun rtlRunOnceBeginInitialize(runonce: COpaquePointer?, flags: UInt, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlRunOnceBeginInitialize(runonce?.value?.toCPointer<ByteVar>(), flags, context?.value?.toCPointer<ByteVar>())

public actual fun rtlRunOnceComplete(runonce: COpaquePointer?, flags: UInt, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlRunOnceComplete(runonce?.value?.toCPointer<ByteVar>(), flags, context?.value?.toCPointer<ByteVar>())

public actual fun rtlRunOnceExecuteOnce(runonce: COpaquePointer?, initfn: PrtlRunOnceInitFn, parameter: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlRunOnceExecuteOnce(runonce?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), parameter?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun rtlRunOnceInitialize(runonce: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlRunOnceInitialize(runonce?.value?.toCPointer<ByteVar>())
}

public actual fun rtlSetAllBits(bitmapheader: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlSetAllBits(bitmapheader?.value?.toCPointer<ByteVar>())
}

public actual fun rtlSetBit(bitmapheader: COpaquePointer?, bitnumber: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlSetBit(bitmapheader?.value?.toCPointer<ByteVar>(), bitnumber)
}

public actual fun rtlSetBits(bitmapheader: COpaquePointer?, startingindex: UInt, numbertoset: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlSetBits(bitmapheader?.value?.toCPointer<ByteVar>(), startingindex, numbertoset)
}

public actual fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: COpaquePointer?, dacldefaulted: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlSetDaclSecurityDescriptor(securitydescriptor?.value?.toCPointer<ByteVar>(), daclpresent, dacl?.value?.toCPointer<ByteVar>(), dacldefaulted)

public actual fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: COpaquePointer?, size: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlSetSystemGlobalData(dataid, buffer?.value?.toCPointer<ByteVar>(), size)

public actual fun rtlSplay(links: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlSplay(links?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlStringFromGUID(guid: COpaquePointer?, guidstring: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlStringFromGUID(guid?.value?.toCPointer<ByteVar>(), guidstring?.value?.toCPointer<ByteVar>())

public actual fun rtlStronglyEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlStronglyEnumerateEntryHashTable(hashtable?.value?.toCPointer<ByteVar>(), enumerator?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlSubtreePredecessor(links: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlSubtreePredecessor(links?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlSubtreeSuccessor(links: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlSubtreeSuccessor(links?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlSuffixUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlSuffixUnicodeString(string1?.value?.toCPointer<ByteVar>(), string2?.value?.toCPointer<ByteVar>(), caseinsensitive)

public actual fun rtlTestBit(bitmapheader: COpaquePointer?, bitnumber: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlTestBit(bitmapheader?.value?.toCPointer<ByteVar>(), bitnumber)

public actual fun rtlTimeFieldsToTime(timefields: COpaquePointer?, time: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlTimeFieldsToTime(timefields?.value?.toCPointer<ByteVar>(), time?.value?.toCPointer<ByteVar>())

public actual fun rtlTimeToTimeFields(time: COpaquePointer?, timefields: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlTimeToTimeFields(time?.value?.toCPointer<ByteVar>(), timefields?.value?.toCPointer<ByteVar>())
}

public actual fun rtlUTF8StringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlUTF8StringToUnicodeString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: COpaquePointer?, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlUTF8ToUnicodeN(unicodestringdestination?.value?.toCPointer<ByteVar>(), unicodestringmaxbytecount, unicodestringactualbytecount?.value?.toCPointer<ByteVar>(), utf8stringsource?.value?.toCPointer<ByteVar>(), utf8stringbytecount)

public actual fun rtlUnicodeStringToInt64(string: COpaquePointer?, base: UInt, number: COpaquePointer?, endpointer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInt64(string?.value?.toCPointer<ByteVar>(), base, number?.value?.toCPointer<ByteVar>(), endpointer?.value?.toCPointer<ByteVar>())

public actual fun rtlUnicodeStringToInteger(string: COpaquePointer?, base: UInt, value: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInteger(string?.value?.toCPointer<ByteVar>(), base, value?.value?.toCPointer<ByteVar>())

public actual fun rtlUnicodeStringToUTF8String(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToUTF8String(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: COpaquePointer?, unicodestringsource: COpaquePointer?, unicodestringbytecount: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlUnicodeToUTF8N(utf8stringdestination?.value?.toCPointer<ByteVar>(), utf8stringmaxbytecount, utf8stringactualbytecount?.value?.toCPointer<ByteVar>(), unicodestringsource?.value?.toCPointer<ByteVar>(), unicodestringbytecount)

public actual fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeChar(sourcecharacter)

public actual fun rtlUpcaseUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun rtlUpperChar(character: Byte): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlUpperChar(character)

public actual fun rtlUpperString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlUpperString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>())
}

public actual fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlValidRelativeSecurityDescriptor(securitydescriptorinput?.value?.toCPointer<ByteVar>(), securitydescriptorlength, requiredinformation)

public actual fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlValidSecurityDescriptor(securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rtlVerifyVersionInfo(versioninfo: COpaquePointer?, typemask: UInt, conditionmask: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlVerifyVersionInfo(versioninfo?.value?.toCPointer<ByteVar>(), typemask, conditionmask)

public actual fun rtlVolumeDeviceToDosName(volumedeviceobject: COpaquePointer?, dosname: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlVolumeDeviceToDosName(volumedeviceobject?.value?.toCPointer<ByteVar>(), dosname?.value?.toCPointer<ByteVar>())

public actual fun rtlWalkFrameChain(callers: COpaquePointer?, count: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlWalkFrameChain(callers?.value?.toCPointer<ByteVar>(), count, flags)

public actual fun rtlWeaklyEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlWeaklyEnumerateEntryHashTable(hashtable?.value?.toCPointer<ByteVar>(), enumerator?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: COpaquePointer?, valuelength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlWriteRegistryValue(relativeto, path?.value?.toCPointer<ByteVar>(), valuename?.value?.toCPointer<ByteVar>(), valuetype, valuedata?.value?.toCPointer<ByteVar>(), valuelength)

public actual fun rtlxAnsiStringToUnicodeSize(ansistring: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlxAnsiStringToUnicodeSize(ansistring?.value?.toCPointer<ByteVar>())

public actual fun rtlxUnicodeStringToAnsiSize(unicodestring: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_rtlxUnicodeStringToAnsiSize(unicodestring?.value?.toCPointer<ByteVar>())

public actual fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seAccessCheck(securitydescriptor?.value?.toCPointer<ByteVar>(), subjectsecuritycontext?.value?.toCPointer<ByteVar>(), subjectcontextlocked, desiredaccess, previouslygrantedaccess, privileges?.value?.toCPointer<ByteVar>(), genericmapping?.value?.toCPointer<ByteVar>(), accessmode, grantedaccess?.value?.toCPointer<ByteVar>(), accessstatus?.value?.toCPointer<ByteVar>())

public actual fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, isdirectoryobject: Boolean, subjectcontext: COpaquePointer?, genericmapping: COpaquePointer?, pooltype: PoolType): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seAssignSecurity(parentdescriptor?.value?.toCPointer<ByteVar>(), explicitdescriptor?.value?.toCPointer<ByteVar>(), newdescriptor?.value?.toCPointer<ByteVar>(), isdirectoryobject, subjectcontext?.value?.toCPointer<ByteVar>(), genericmapping?.value?.toCPointer<ByteVar>(), pooltype)

public actual fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttype: COpaquePointer?, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: COpaquePointer?, genericmapping: COpaquePointer?, pooltype: PoolType): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seAssignSecurityEx(parentdescriptor?.value?.toCPointer<ByteVar>(), explicitdescriptor?.value?.toCPointer<ByteVar>(), newdescriptor?.value?.toCPointer<ByteVar>(), objecttype?.value?.toCPointer<ByteVar>(), isdirectoryobject, autoinheritflags, subjectcontext?.value?.toCPointer<ByteVar>(), genericmapping?.value?.toCPointer<ByteVar>(), pooltype)

public actual fun seCaptureSubjectContext(subjectcontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seCaptureSubjectContext(subjectcontext?.value?.toCPointer<ByteVar>())
}

public actual fun seComputeAutoInheritByObjectType(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seComputeAutoInheritByObjectType(objecttype?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), parentsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun seDeassignSecurity(securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seDeassignSecurity(securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun seEtwWriteKMCveEvent(cveid: COpaquePointer?, additionaldetails: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seEtwWriteKMCveEvent(cveid?.value?.toCPointer<ByteVar>(), additionaldetails?.value?.toCPointer<ByteVar>())

public actual fun seLockSubjectContext(subjectcontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seLockSubjectContext(subjectcontext?.value?.toCPointer<ByteVar>())
}

public actual fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: COpaquePointer?, token: COpaquePointer?, callbackhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seRegisterImageVerificationCallback(imagetype, callbacktype, 0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), callbackhandle?.value?.toCPointer<ByteVar>())

public actual fun seReleaseSubjectContext(subjectcontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seReleaseSubjectContext(subjectcontext?.value?.toCPointer<ByteVar>())
}

public actual fun seReportSecurityEvent(flags: UInt, sourcename: COpaquePointer?, usersid: Psid, auditparameters: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seReportSecurityEvent(flags, sourcename?.value?.toCPointer<ByteVar>(), usersid?.value?.toCPointer<ByteVar>(), auditparameters?.value?.toCPointer<ByteVar>())

public actual fun seSetAuditParameter(auditparameters: COpaquePointer?, type: SeAdtParameterType, index: UInt, data: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seSetAuditParameter(auditparameters?.value?.toCPointer<ByteVar>(), type, index, data?.value?.toCPointer<ByteVar>())

public actual fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean =
    false

public actual fun seUnlockSubjectContext(subjectcontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seUnlockSubjectContext(subjectcontext?.value?.toCPointer<ByteVar>())
}

public actual fun seUnregisterImageVerificationCallback(callbackhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seUnregisterImageVerificationCallback(callbackhandle?.value?.toCPointer<ByteVar>())
}

public actual fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_seValidSecurityDescriptor(length, securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun tmCommitComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmCommitComplete(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmCommitEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmCommitEnlistment(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmCommitTransaction(transaction: COpaquePointer?, wait: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmCommitTransaction(transaction?.value?.toCPointer<ByteVar>(), wait)

public actual fun tmCreateEnlistment(enlistmenthandle: COpaquePointer?, previousmode: Byte, desiredaccess: UInt, objectattributes: COpaquePointer?, resourcemanager: COpaquePointer?, transaction: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmCreateEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), previousmode, desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), resourcemanager?.value?.toCPointer<ByteVar>(), transaction?.value?.toCPointer<ByteVar>(), createoptions, notificationmask, enlistmentkey?.value?.toCPointer<ByteVar>())

public actual fun tmDereferenceEnlistmentKey(enlistment: COpaquePointer?, lastreference: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmDereferenceEnlistmentKey(enlistment?.value?.toCPointer<ByteVar>(), lastreference?.value?.toCPointer<ByteVar>())

public actual fun tmEnableCallbacks(resourcemanager: COpaquePointer?, callbackroutine: PtmRmNotification, rmkey: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmEnableCallbacks(resourcemanager?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), rmkey?.value?.toCPointer<ByteVar>())

public actual fun tmGetTransactionId(transaction: COpaquePointer?, transactionid: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmGetTransactionId(transaction?.value?.toCPointer<ByteVar>(), transactionid?.value?.toCPointer<ByteVar>())
}

public actual fun tmInitializeTransactionManager(transactionmanager: COpaquePointer?, logfilename: COpaquePointer?, tmid: COpaquePointer?, createoptions: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmInitializeTransactionManager(transactionmanager?.value?.toCPointer<ByteVar>(), logfilename?.value?.toCPointer<ByteVar>(), tmid?.value?.toCPointer<ByteVar>(), createoptions)

public actual fun tmIsTransactionActive(transaction: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmIsTransactionActive(transaction?.value?.toCPointer<ByteVar>())

public actual fun tmPrePrepareComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmPrePrepareComplete(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmPrePrepareEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmPrePrepareEnlistment(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmPrepareComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmPrepareComplete(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmPrepareEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmPrepareEnlistment(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmPropagationComplete(resourcemanager: COpaquePointer?, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmPropagationComplete(resourcemanager?.value?.toCPointer<ByteVar>(), requestcookie, bufferlength, buffer?.value?.toCPointer<ByteVar>())

public actual fun tmPropagationFailed(resourcemanager: COpaquePointer?, requestcookie: UInt, status: Ntstatus): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmPropagationFailed(resourcemanager?.value?.toCPointer<ByteVar>(), requestcookie, status)

public actual fun tmReadOnlyEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmReadOnlyEnlistment(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmRecoverEnlistment(enlistment: COpaquePointer?, enlistmentkey: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmRecoverEnlistment(enlistment?.value?.toCPointer<ByteVar>(), enlistmentkey?.value?.toCPointer<ByteVar>())

public actual fun tmRecoverResourceManager(resourcemanager: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmRecoverResourceManager(resourcemanager?.value?.toCPointer<ByteVar>())

public actual fun tmRecoverTransactionManager(tm: COpaquePointer?, targetvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmRecoverTransactionManager(tm?.value?.toCPointer<ByteVar>(), targetvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmReferenceEnlistmentKey(enlistment: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmReferenceEnlistmentKey(enlistment?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun tmRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmRenameTransactionManager(logfilename?.value?.toCPointer<ByteVar>(), existingtransactionmanagerguid?.value?.toCPointer<ByteVar>())

public actual fun tmRequestOutcomeEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmRequestOutcomeEnlistment(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmRollbackComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmRollbackComplete(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmRollbackEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmRollbackEnlistment(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun tmRollbackTransaction(transaction: COpaquePointer?, wait: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmRollbackTransaction(transaction?.value?.toCPointer<ByteVar>(), wait)

public actual fun tmSinglePhaseReject(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_tmSinglePhaseReject(enlistment?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun vslCreateSecureSection(handle: COpaquePointer?, targetprocess: Peprocess, mdl: COpaquePointer?, devicepageprotection: UInt, attributes: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_vslCreateSecureSection(handle?.value?.toCPointer<ByteVar>(), targetprocess, mdl?.value?.toCPointer<ByteVar>(), devicepageprotection, attributes)

public actual fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_vslDeleteSecureSection(globalhandle?.value?.toCPointer<ByteVar>())

public actual fun wheaAddErrorSource(errorsource: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaAddErrorSource(errorsource?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun wheaAddErrorSourceDeviceDriver(context: COpaquePointer?, configuration: COpaquePointer?, numberpreallocatederrorreports: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriver(context?.value?.toCPointer<ByteVar>(), configuration?.value?.toCPointer<ByteVar>(), numberpreallocatederrorreports)

public actual fun wheaAddErrorSourceDeviceDriverV1(context: COpaquePointer?, configuration: COpaquePointer?, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriverV1(context?.value?.toCPointer<ByteVar>(), configuration?.value?.toCPointer<ByteVar>(), numbufferstopreallocate, maxdatalength)

public actual fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: COpaquePointer?, sectiondatalength: UInt, bufferset: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaAddHwErrorReportSectionDeviceDriver(errorhandle?.value?.toCPointer<ByteVar>(), sectiondatalength, bufferset?.value?.toCPointer<ByteVar>())

public actual fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaConfigureErrorSource(sourcetype, configuration?.value?.toCPointer<ByteVar>())

public actual fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaCreateHwErrorReportDeviceDriver(errorsourceid, deviceobject?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaErrorSourceGetState(errorsourceid)

public actual fun wheaGetNotifyAllOfflinesPolicy(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaGetNotifyAllOfflinesPolicy()

public actual fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerRegister(0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun wheaHighIrqlLogSelEventHandlerUnregister() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerUnregister()
}

public actual fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportAbandonDeviceDriver(errorhandle?.value?.toCPointer<ByteVar>())

public actual fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: COpaquePointer?, namelength: UInt, name: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSectionNameDeviceDriver(bufferset?.value?.toCPointer<ByteVar>(), namelength, name?.value?.toCPointer<ByteVar>())

public actual fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: COpaquePointer?, errorseverity: WheaErrorSeverity): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSeverityDeviceDriver(errorhandle?.value?.toCPointer<ByteVar>(), errorseverity)

public actual fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSubmitDeviceDriver(errorhandle?.value?.toCPointer<ByteVar>())

public actual fun wheaInitializeRecordHeader(header: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaInitializeRecordHeader(header?.value?.toCPointer<ByteVar>())

public actual fun wheaIsCriticalState(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaIsCriticalState()

public actual fun wheaLogInternalEvent(entry: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaLogInternalEvent(entry?.value?.toCPointer<ByteVar>())
}

public actual fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaRegisterInUsePageOfflineNotification(0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun wheaRemoveErrorSource(errorsourceid: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSource(errorsourceid)
}

public actual fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSourceDeviceDriver(errorsourceid)

public actual fun wheaReportHwError(errorpacket: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaReportHwError(errorpacket?.value?.toCPointer<ByteVar>())

public actual fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: COpaquePointer?, errordata: COpaquePointer?, errordatalength: UInt, sectiontypeguid: COpaquePointer?, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaReportHwErrorDeviceDriver(errorsourceid, deviceobject?.value?.toCPointer<ByteVar>(), errordata?.value?.toCPointer<ByteVar>(), errordatalength, sectiontypeguid?.value?.toCPointer<ByteVar>(), errorseverity, devicefriendlyname?.value?.toCPointer<ByteVar>())

public actual fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaUnconfigureErrorSource(sourcetype)

public actual fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wheaUnregisterInUsePageOfflineNotification(0L.toCPointer<ByteVar>())

public actual fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: COpaquePointer?, traceinformationlength: UInt, requiredlength: COpaquePointer?, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_wmiQueryTraceInformation(traceinformationclass, traceinformation?.value?.toCPointer<ByteVar>(), traceinformationlength, requiredlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun zwAllocateLocallyUniqueId(luid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwAllocateLocallyUniqueId(luid?.value?.toCPointer<ByteVar>())

public actual fun zwClose(handle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwClose(handle?.value?.toCPointer<ByteVar>())

public actual fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwCommitComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwCommitEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwCommitTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), wait)

public actual fun zwCreateEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwCreateEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), desiredaccess, resourcemanagerhandle?.value?.toCPointer<ByteVar>(), transactionhandle?.value?.toCPointer<ByteVar>(), objectattributes?.value?.toCPointer<ByteVar>(), createoptions, notificationmask, enlistmentkey?.value?.toCPointer<ByteVar>())

public actual fun zwCreateFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwCreateFile(filehandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), allocationsize?.value?.toCPointer<ByteVar>(), fileattributes, shareaccess, createdisposition, createoptions, eabuffer?.value?.toCPointer<ByteVar>(), ealength)

public actual fun zwCreateResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?, createoptions: UInt, description: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwCreateResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), desiredaccess, tmhandle?.value?.toCPointer<ByteVar>(), resourcemanagerguid?.value?.toCPointer<ByteVar>(), objectattributes?.value?.toCPointer<ByteVar>(), createoptions, description?.value?.toCPointer<ByteVar>())

public actual fun zwCreateSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwCreateSection(sectionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), maximumsize?.value?.toCPointer<ByteVar>(), sectionpageprotection, allocationattributes, filehandle?.value?.toCPointer<ByteVar>())

public actual fun zwCreateTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwCreateTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), uow?.value?.toCPointer<ByteVar>(), tmhandle?.value?.toCPointer<ByteVar>(), createoptions, isolationlevel, isolationflags, timeout?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>())

public actual fun zwCreateTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, createoptions: UInt, commitstrength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwCreateTransactionManager(tmhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), logfilename?.value?.toCPointer<ByteVar>(), createoptions, commitstrength)

public actual fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwDeviceIoControlFile(filehandle?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), iocontrolcode, inputbuffer?.value?.toCPointer<ByteVar>(), inputbufferlength, outputbuffer?.value?.toCPointer<ByteVar>(), outputbufferlength)

public actual fun zwDisplayString(string: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwDisplayString(string?.value?.toCPointer<ByteVar>())

public actual fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: COpaquePointer?, objectcursorlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwEnumerateTransactionObject(rootobjecthandle?.value?.toCPointer<ByteVar>(), querytype, objectcursor?.value?.toCPointer<ByteVar>(), objectcursorlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, timeout: COpaquePointer?, returnlength: COpaquePointer?, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwGetNotificationResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), transactionnotification?.value?.toCPointer<ByteVar>(), notificationlength, timeout?.value?.toCPointer<ByteVar>(), returnlength?.value?.toCPointer<ByteVar>(), asynchronous, asynchronouscontext)

public actual fun zwLoadDriver(driverservicename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwLoadDriver(driverservicename?.value?.toCPointer<ByteVar>())

public actual fun zwMakeTemporaryObject(handle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwMakeTemporaryObject(handle?.value?.toCPointer<ByteVar>())

public actual fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwManagePartition(targethandle?.value?.toCPointer<ByteVar>(), sourcehandle?.value?.toCPointer<ByteVar>(), partitioninformationclass, partitioninformation?.value?.toCPointer<ByteVar>(), partitioninformationlength)

public actual fun zwOpenEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwOpenEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), desiredaccess, rmhandle?.value?.toCPointer<ByteVar>(), enlistmentguid?.value?.toCPointer<ByteVar>(), objectattributes?.value?.toCPointer<ByteVar>())

public actual fun zwOpenFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, openoptions: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwOpenFile(filehandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), shareaccess, openoptions)

public actual fun zwOpenResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwOpenResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), desiredaccess, tmhandle?.value?.toCPointer<ByteVar>(), resourcemanagerguid?.value?.toCPointer<ByteVar>(), objectattributes?.value?.toCPointer<ByteVar>())

public actual fun zwOpenSymbolicLinkObject(linkhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwOpenSymbolicLinkObject(linkhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun zwOpenTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwOpenTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), uow?.value?.toCPointer<ByteVar>(), tmhandle?.value?.toCPointer<ByteVar>())

public actual fun zwOpenTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, tmidentity: COpaquePointer?, openoptions: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwOpenTransactionManager(tmhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), logfilename?.value?.toCPointer<ByteVar>(), tmidentity?.value?.toCPointer<ByteVar>(), openoptions)

public actual fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwPowerInformation(informationlevel, inputbuffer?.value?.toCPointer<ByteVar>(), inputbufferlength, outputbuffer?.value?.toCPointer<ByteVar>(), outputbufferlength)

public actual fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwPrePrepareComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwPrePrepareEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwPrepareComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwPrepareEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwPropagationComplete(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), requestcookie, bufferlength, buffer?.value?.toCPointer<ByteVar>())

public actual fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwPropagationFailed(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), requestcookie, propstatus)

public actual fun zwQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwQueryInformationByName(objectattributes?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), fileinformation?.value?.toCPointer<ByteVar>(), length, fileinformationclass)

public actual fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwQueryInformationEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), enlistmentinformationclass, enlistmentinformation?.value?.toCPointer<ByteVar>(), enlistmentinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun zwQueryInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwQueryInformationFile(filehandle?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), fileinformation?.value?.toCPointer<ByteVar>(), length, fileinformationclass)

public actual fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwQueryInformationResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), resourcemanagerinformationclass, resourcemanagerinformation?.value?.toCPointer<ByteVar>(), resourcemanagerinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwQueryInformationTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), transactioninformationclass, transactioninformation?.value?.toCPointer<ByteVar>(), transactioninformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwQueryInformationTransactionManager(transactionmanagerhandle?.value?.toCPointer<ByteVar>(), transactionmanagerinformationclass, transactionmanagerinformation?.value?.toCPointer<ByteVar>(), transactionmanagerinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwQuerySymbolicLinkObject(linkhandle?.value?.toCPointer<ByteVar>(), linktarget?.value?.toCPointer<ByteVar>(), returnedlength?.value?.toCPointer<ByteVar>())

public actual fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwReadFile(filehandle?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), length, byteoffset?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwReadOnlyEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwRecoverEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), enlistmentkey?.value?.toCPointer<ByteVar>())

public actual fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwRecoverResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>())

public actual fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwRecoverTransactionManager(transactionmanagerhandle?.value?.toCPointer<ByteVar>())

public actual fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: COpaquePointer?, protocolinformationsize: UInt, protocolinformation: COpaquePointer?, createoptions: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwRegisterProtocolAddressInformation(resourcemanager?.value?.toCPointer<ByteVar>(), protocolid?.value?.toCPointer<ByteVar>(), protocolinformationsize, protocolinformation?.value?.toCPointer<ByteVar>(), createoptions)

public actual fun zwRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwRenameTransactionManager(logfilename?.value?.toCPointer<ByteVar>(), existingtransactionmanagerguid?.value?.toCPointer<ByteVar>())

public actual fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwRollbackComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwRollbackEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwRollbackTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), wait)

public actual fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwRollforwardTransactionManager(transactionmanagerhandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwSetInformationEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), enlistmentinformationclass, enlistmentinformation?.value?.toCPointer<ByteVar>(), enlistmentinformationlength)

public actual fun zwSetInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwSetInformationFile(filehandle?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), fileinformation?.value?.toCPointer<ByteVar>(), length, fileinformationclass)

public actual fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwSetInformationResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), resourcemanagerinformationclass, resourcemanagerinformation?.value?.toCPointer<ByteVar>(), resourcemanagerinformationlength)

public actual fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwSetInformationTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), transactioninformationclass, transactioninformation?.value?.toCPointer<ByteVar>(), transactioninformationlength)

public actual fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwSetInformationTransactionManager(tmhandle?.value?.toCPointer<ByteVar>(), transactionmanagerinformationclass, transactionmanagerinformation?.value?.toCPointer<ByteVar>(), transactionmanagerinformationlength)

public actual fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwSinglePhaseReject(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun zwUnloadDriver(driverservicename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwUnloadDriver(driverservicename?.value?.toCPointer<ByteVar>())

public actual fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_zwWriteFile(filehandle?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), length, byteoffset?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_vDbgPrintEx(componentid, level, format?.value?.toCPointer<ByteVar>(), arglist?.value?.toCPointer<ByteVar>())

public actual fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_vDbgPrintExWithPrefix(prefix?.value?.toCPointer<ByteVar>(), componentid, level, format?.value?.toCPointer<ByteVar>(), arglist?.value?.toCPointer<ByteVar>())
