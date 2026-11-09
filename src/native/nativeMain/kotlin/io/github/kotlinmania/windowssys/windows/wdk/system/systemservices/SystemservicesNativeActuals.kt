@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_CANCEL
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_CONTROL
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_NOTIFICATION_CALLBACK_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_REINITIALIZE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IO_PRIORITY_HINT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PAFFINITY_TOKEN
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PCALLBACK_OBJECT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEJOB
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PESILO
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PETHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEX_RUNDOWN_REF_CACHE_AWARE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEX_TIMER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PFREE_FUNCTION
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PIO_COMPLETION_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PIO_WORKITEM
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKDEFERRED_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKINTERRUPT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKTHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POBJECT_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POHANDLE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POOL_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PPCW_BUFFER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PPCW_INSTANCE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PPCW_REGISTRATION
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PSILO_MONITOR
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FILE_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SE_ADT_PARAMETER_TYPE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_CONTEXT_MODE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_IOSTATS_CLASS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_MGMT_POLICY_TYPE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLS_LOG_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLS_LSN
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.BUGCHECK_ERROR
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WHEA_ERROR_SOURCE_STATE
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WHEA_ERROR_SOURCE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EVENT_INFO_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.REGHANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EVENT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SUITE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TIMER_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WAIT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE
import io.github.kotlinmania.windowssys.windows.win32.system.power.POWER_INFORMATION_LEVEL
import io.github.kotlinmania.windowssys.windows.win32.system.power.POWER_REQUEST_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.FIRMWARE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.LOGICAL_PROCESSOR_RELATIONSHIP
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.RTL_SYSTEM_GLOBAL_DATA_ID
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ENLISTMENT_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KTMOBJECT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.RESOURCEMANAGER_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TRANSACTIONMANAGER_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TRANSACTION_INFORMATION_CLASS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ClfsAddLogContainer(plfolog: Long, pcbcontainer: Long, puszcontainerpath: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsAddLogContainer(plfolog.toCPointer<ByteVar>(), pcbcontainer.toCPointer<ByteVar>(), puszcontainerpath.toCPointer<ByteVar>())

public actual fun ClfsAddLogContainerSet(plfolog: Long, ccontainers: UShort, pcbcontainer: Long, rguszcontainerpath: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsAddLogContainerSet(plfolog.toCPointer<ByteVar>(), ccontainers, pcbcontainer.toCPointer<ByteVar>(), rguszcontainerpath.toCPointer<ByteVar>())

public actual fun ClfsAdvanceLogBase(pvmarshalcontext: Long, plsnbase: Long, fflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsAdvanceLogBase(pvmarshalcontext.toCPointer<ByteVar>(), plsnbase.toCPointer<ByteVar>(), fflags)

public actual fun ClfsAlignReservedLog(pvmarshalcontext: Long, crecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsAlignReservedLog(pvmarshalcontext.toCPointer<ByteVar>(), crecords, rgcbreservation.toCPointer<ByteVar>(), pcbalignreservation.toCPointer<ByteVar>())

public actual fun ClfsAllocReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsAllocReservedLog(pvmarshalcontext.toCPointer<ByteVar>(), crecords, pcbadjustment.toCPointer<ByteVar>())

public actual fun ClfsCloseAndResetLogFile(plfolog: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsCloseAndResetLogFile(plfolog.toCPointer<ByteVar>())

public actual fun ClfsCloseLogFileObject(plfolog: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsCloseLogFileObject(plfolog.toCPointer<ByteVar>())

public actual fun ClfsCreateLogFile(pplfolog: Long, puszlogfilename: Long, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PSECURITY_DESCRIPTOR, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsCreateLogFile(pplfolog.toCPointer<ByteVar>(), puszlogfilename.toCPointer<ByteVar>(), fdesiredaccess, dwsharemode, psdlogfile.toCPointer<ByteVar>(), fcreatedisposition, fcreateoptions, fflagsandattributes, flogoptionflag, pvcontext.toCPointer<ByteVar>(), cbcontext)

public actual fun ClfsCreateMarshallingArea(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: Long): NTSTATUS =
    0

public actual fun ClfsCreateMarshallingAreaEx(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: Long): NTSTATUS =
    0

public actual fun ClfsCreateScanContext(plfolog: Long, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsCreateScanContext(plfolog.toCPointer<ByteVar>(), cfromcontainer, ccontainers, escanmode, pcxscan.toCPointer<ByteVar>())

public actual fun ClfsDeleteLogByPointer(plfolog: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsDeleteLogByPointer(plfolog.toCPointer<ByteVar>())

public actual fun ClfsDeleteLogFile(puszlogfilename: Long, pvreserved: Long, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsDeleteLogFile(puszlogfilename.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>(), flogoptionflag, pvcontext.toCPointer<ByteVar>(), cbcontext)

public actual fun ClfsDeleteMarshallingArea(pvmarshalcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsDeleteMarshallingArea(pvmarshalcontext.toCPointer<ByteVar>())

public actual fun ClfsEarlierLsn(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun ClfsFinalize() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsFinalize()
}

public actual fun ClfsFlushBuffers(pvmarshalcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsFlushBuffers(pvmarshalcontext.toCPointer<ByteVar>())

public actual fun ClfsFlushToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsFlushToLsn(pvmarshalcontext.toCPointer<ByteVar>(), plsnflush.toCPointer<ByteVar>(), plsnlastflushed.toCPointer<ByteVar>())

public actual fun ClfsFreeReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsFreeReservedLog(pvmarshalcontext.toCPointer<ByteVar>(), crecords, pcbadjustment.toCPointer<ByteVar>())

public actual fun ClfsGetContainerName(plfolog: Long, cidlogicalcontainer: UInt, puszcontainername: Long, pcactuallencontainername: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsGetContainerName(plfolog.toCPointer<ByteVar>(), cidlogicalcontainer, puszcontainername.toCPointer<ByteVar>(), pcactuallencontainername.toCPointer<ByteVar>())

public actual fun ClfsGetIoStatistics(plfolog: Long, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsGetIoStatistics(plfolog.toCPointer<ByteVar>(), pvstatsbuffer.toCPointer<ByteVar>(), cbstatsbuffer, estatsclass, pcbstatswritten.toCPointer<ByteVar>())

public actual fun ClfsGetLogFileInformation(plfolog: Long, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsGetLogFileInformation(plfolog.toCPointer<ByteVar>(), pinfobuffer.toCPointer<ByteVar>(), pcbinfobuffer.toCPointer<ByteVar>())

public actual fun ClfsInitialize(): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsInitialize()

public actual fun ClfsLaterLsn(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun ClfsLsnBlockOffset(plsn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsLsnBlockOffset(plsn.toCPointer<ByteVar>())

public actual fun ClfsLsnContainer(plsn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsLsnContainer(plsn.toCPointer<ByteVar>())

public actual fun ClfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN =
    CLS_LSN()

public actual fun ClfsLsnDifference(plsnstart: Long, plsnfinish: Long, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsLsnDifference(plsnstart.toCPointer<ByteVar>(), plsnfinish.toCPointer<ByteVar>(), cbcontainer, cbmaxblock, pcbdifference.toCPointer<ByteVar>())

public actual fun ClfsLsnEqual(plsn1: Long, plsn2: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsLsnEqual(plsn1.toCPointer<ByteVar>(), plsn2.toCPointer<ByteVar>())

public actual fun ClfsLsnGreater(plsn1: Long, plsn2: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsLsnGreater(plsn1.toCPointer<ByteVar>(), plsn2.toCPointer<ByteVar>())

public actual fun ClfsLsnInvalid(plsn: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsLsnInvalid(plsn.toCPointer<ByteVar>())

public actual fun ClfsLsnLess(plsn1: Long, plsn2: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsLsnLess(plsn1.toCPointer<ByteVar>(), plsn2.toCPointer<ByteVar>())

public actual fun ClfsLsnNull(plsn: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsLsnNull(plsn.toCPointer<ByteVar>())

public actual fun ClfsLsnRecordSequence(plsn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsLsnRecordSequence(plsn.toCPointer<ByteVar>())

public actual fun ClfsMgmtDeregisterManagedClient(clientcookie: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsMgmtDeregisterManagedClient(clientcookie.toCPointer<ByteVar>())

public actual fun ClfsMgmtHandleLogFileFull(client: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsMgmtHandleLogFileFull(client.toCPointer<ByteVar>())

public actual fun ClfsMgmtInstallPolicy(logfile: Long, policy: Long, policylength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsMgmtInstallPolicy(logfile.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>(), policylength)

public actual fun ClfsMgmtQueryPolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE, policy: Long, policylength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsMgmtQueryPolicy(logfile.toCPointer<ByteVar>(), policytype, policy.toCPointer<ByteVar>(), policylength.toCPointer<ByteVar>())

public actual fun ClfsMgmtRegisterManagedClient(logfile: Long, registrationdata: Long, clientcookie: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsMgmtRegisterManagedClient(logfile.toCPointer<ByteVar>(), registrationdata.toCPointer<ByteVar>(), clientcookie.toCPointer<ByteVar>())

public actual fun ClfsMgmtRemovePolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsMgmtRemovePolicy(logfile.toCPointer<ByteVar>(), policytype)

public actual fun ClfsMgmtSetLogFileSize(logfile: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsMgmtSetLogFileSize(logfile.toCPointer<ByteVar>(), newsizeincontainers.toCPointer<ByteVar>(), resultingsizeincontainers.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), completionroutinedata.toCPointer<ByteVar>())

public actual fun ClfsMgmtSetLogFileSizeAsClient(logfile: Long, clientcookie: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsMgmtSetLogFileSizeAsClient(logfile.toCPointer<ByteVar>(), clientcookie.toCPointer<ByteVar>(), newsizeincontainers.toCPointer<ByteVar>(), resultingsizeincontainers.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), completionroutinedata.toCPointer<ByteVar>())

public actual fun ClfsMgmtTailAdvanceFailure(client: Long, reason: NTSTATUS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsMgmtTailAdvanceFailure(client.toCPointer<ByteVar>(), reason)

public actual fun ClfsQueryLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfoinputbuffer: Long, cbinfoinputbuffer: UInt, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsQueryLogFileInformation(plfolog.toCPointer<ByteVar>(), einformationclass, pinfoinputbuffer.toCPointer<ByteVar>(), cbinfoinputbuffer, pinfobuffer.toCPointer<ByteVar>(), pcbinfobuffer.toCPointer<ByteVar>())

public actual fun ClfsReadLogRecord(pvmarshalcontext: Long, plsnfirst: Long, pecontextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsReadLogRecord(pvmarshalcontext.toCPointer<ByteVar>(), plsnfirst.toCPointer<ByteVar>(), pecontextmode, ppvreadbuffer.toCPointer<ByteVar>(), pcbreadbuffer.toCPointer<ByteVar>(), perecordtype.toCPointer<ByteVar>(), plsnundonext.toCPointer<ByteVar>(), plsnprevious.toCPointer<ByteVar>(), ppvreadcontext.toCPointer<ByteVar>())

public actual fun ClfsReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsReadNextLogRecord(pvreadcontext.toCPointer<ByteVar>(), ppvbuffer.toCPointer<ByteVar>(), pcbbuffer.toCPointer<ByteVar>(), perecordtype.toCPointer<ByteVar>(), plsnuser.toCPointer<ByteVar>(), plsnundonext.toCPointer<ByteVar>(), plsnprevious.toCPointer<ByteVar>(), plsnrecord.toCPointer<ByteVar>())

public actual fun ClfsReadPreviousRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsReadPreviousRestartArea(pvreadcontext.toCPointer<ByteVar>(), ppvrestartbuffer.toCPointer<ByteVar>(), pcbrestartbuffer.toCPointer<ByteVar>(), plsnrestart.toCPointer<ByteVar>())

public actual fun ClfsReadRestartArea(pvmarshalcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvreadcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsReadRestartArea(pvmarshalcontext.toCPointer<ByteVar>(), ppvrestartbuffer.toCPointer<ByteVar>(), pcbrestartbuffer.toCPointer<ByteVar>(), plsn.toCPointer<ByteVar>(), ppvreadcontext.toCPointer<ByteVar>())

public actual fun ClfsRemoveLogContainer(plfolog: Long, puszcontainerpath: Long, fforce: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsRemoveLogContainer(plfolog.toCPointer<ByteVar>(), puszcontainerpath.toCPointer<ByteVar>(), fforce)

public actual fun ClfsRemoveLogContainerSet(plfolog: Long, ccontainers: UShort, rgwszcontainerpath: Long, fforce: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsRemoveLogContainerSet(plfolog.toCPointer<ByteVar>(), ccontainers, rgwszcontainerpath.toCPointer<ByteVar>(), fforce)

public actual fun ClfsReserveAndAppendLog(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsReserveAndAppendLog(pvmarshalcontext.toCPointer<ByteVar>(), rgwriteentries.toCPointer<ByteVar>(), cwriteentries, plsnundonext.toCPointer<ByteVar>(), plsnprevious.toCPointer<ByteVar>(), creserverecords, rgcbreservation.toCPointer<ByteVar>(), fflags, plsn.toCPointer<ByteVar>())

public actual fun ClfsReserveAndAppendLogAligned(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsReserveAndAppendLogAligned(pvmarshalcontext.toCPointer<ByteVar>(), rgwriteentries.toCPointer<ByteVar>(), cwriteentries, cbentryalignment, plsnundonext.toCPointer<ByteVar>(), plsnprevious.toCPointer<ByteVar>(), creserverecords, rgcbreservation.toCPointer<ByteVar>(), fflags, plsn.toCPointer<ByteVar>())

public actual fun ClfsScanLogContainers(pcxscan: Long, escanmode: UByte): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsScanLogContainers(pcxscan.toCPointer<ByteVar>(), escanmode)

public actual fun ClfsSetArchiveTail(plfolog: Long, plsnarchivetail: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsSetArchiveTail(plfolog.toCPointer<ByteVar>(), plsnarchivetail.toCPointer<ByteVar>())

public actual fun ClfsSetEndOfLog(plfolog: Long, plsnend: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsSetEndOfLog(plfolog.toCPointer<ByteVar>(), plsnend.toCPointer<ByteVar>())

public actual fun ClfsSetLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfobuffer: Long, cbbuffer: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsSetLogFileInformation(plfolog.toCPointer<ByteVar>(), einformationclass, pinfobuffer.toCPointer<ByteVar>(), cbbuffer)

public actual fun ClfsTerminateReadLog(pvcursorcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsTerminateReadLog(pvcursorcontext.toCPointer<ByteVar>())

public actual fun ClfsWriteRestartArea(pvmarshalcontext: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: UInt, pcbwritten: Long, plsnnext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ClfsWriteRestartArea(pvmarshalcontext.toCPointer<ByteVar>(), pvrestartbuffer.toCPointer<ByteVar>(), cbrestartbuffer, plsnbase.toCPointer<ByteVar>(), fflags, pcbwritten.toCPointer<ByteVar>(), plsnnext.toCPointer<ByteVar>())

public actual fun CmCallbackGetKeyObjectID(cookie: Long, obj: Long, objectid: Long, objectname: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_CmCallbackGetKeyObjectID(cookie.toCPointer<ByteVar>(), obj.toCPointer<ByteVar>(), objectid.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>())

public actual fun CmCallbackGetKeyObjectIDEx(cookie: Long, obj: Long, objectid: Long, objectname: Long, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_CmCallbackGetKeyObjectIDEx(cookie.toCPointer<ByteVar>(), obj.toCPointer<ByteVar>(), objectid.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), flags)

public actual fun CmCallbackReleaseKeyObjectIDEx(objectname: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_CmCallbackReleaseKeyObjectIDEx(objectname.toCPointer<ByteVar>())
}

public actual fun CmGetBoundTransaction(cookie: Long, obj: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_CmGetBoundTransaction(cookie.toCPointer<ByteVar>(), obj.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CmGetCallbackVersion(major: Long, minor: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_CmGetCallbackVersion(major.toCPointer<ByteVar>(), minor.toCPointer<ByteVar>())
}

public actual fun CmRegisterCallback(function: PEX_CALLBACK_FUNCTION, context: Long, cookie: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_CmRegisterCallback(function.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), cookie.toCPointer<ByteVar>())

public actual fun CmRegisterCallbackEx(function: PEX_CALLBACK_FUNCTION, altitude: Long, driver: Long, context: Long, cookie: Long, reserved: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_CmRegisterCallbackEx(function.toLong().toCPointer<ByteVar>(), altitude.toCPointer<ByteVar>(), driver.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), cookie.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun CmSetCallbackObjectContext(obj: Long, cookie: Long, newcontext: Long, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_CmSetCallbackObjectContext(obj.toCPointer<ByteVar>(), cookie.toCPointer<ByteVar>(), newcontext.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun CmUnRegisterCallback(cookie: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_CmUnRegisterCallback(cookie)

public actual fun DbgBreakPointWithStatus(status: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_DbgBreakPointWithStatus(status)
}

public actual fun DbgPrint(format: PCSTR): UInt =
    0u

public actual fun DbgPrintEx(componentid: UInt, level: UInt, format: PCSTR): UInt =
    0u

public actual fun DbgPrintReturnControlC(format: PCSTR): UInt =
    0u

public actual fun DbgPrompt(prompt: PCSTR, response: PSTR, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_DbgPrompt(prompt.toCPointer<ByteVar>(), response.toCPointer<ByteVar>(), length)

public actual fun DbgQueryDebugFilterState(componentid: UInt, level: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_DbgQueryDebugFilterState(componentid, level)

public actual fun DbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_DbgSetDebugFilterState(componentid, level, state)

public actual fun DbgSetDebugPrintCallback(debugprintcallback: PDEBUG_PRINT_CALLBACK, enable: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_DbgSetDebugPrintCallback(debugprintcallback.toLong().toCPointer<ByteVar>(), enable)

public actual fun EtwActivityIdControl(controlcode: UInt, activityid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_EtwActivityIdControl(controlcode, activityid.toCPointer<ByteVar>())

public actual fun EtwEventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_EtwEventEnabled(reghandle, eventdescriptor.toCPointer<ByteVar>())

public actual fun EtwProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_EtwProviderEnabled(reghandle, level, keyword)

public actual fun EtwRegister(providerid: Long, enablecallback: PETWENABLECALLBACK, callbackcontext: Long, reghandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_EtwRegister(providerid.toCPointer<ByteVar>(), enablecallback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), reghandle.toCPointer<ByteVar>())

public actual fun EtwSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_EtwSetInformation(reghandle, informationclass, eventinformation.toCPointer<ByteVar>(), informationlength)

public actual fun EtwUnregister(reghandle: REGHANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_EtwUnregister(reghandle)

public actual fun EtwWrite(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_EtwWrite(reghandle, eventdescriptor.toCPointer<ByteVar>(), activityid.toCPointer<ByteVar>(), userdatacount, userdata.toCPointer<ByteVar>())

public actual fun EtwWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_EtwWriteEx(reghandle, eventdescriptor.toCPointer<ByteVar>(), filter, flags, activityid.toCPointer<ByteVar>(), relatedactivityid.toCPointer<ByteVar>(), userdatacount, userdata.toCPointer<ByteVar>())

public actual fun EtwWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, activityid: Long, string: PCWSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_EtwWriteString(reghandle, level, keyword, activityid.toCPointer<ByteVar>(), string.toCPointer<ByteVar>())

public actual fun EtwWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_EtwWriteTransfer(reghandle, eventdescriptor.toCPointer<ByteVar>(), activityid.toCPointer<ByteVar>(), relatedactivityid.toCPointer<ByteVar>(), userdatacount, userdata.toCPointer<ByteVar>())

public actual fun ExAcquireFastMutex(fastmutex: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireFastMutex(fastmutex.toCPointer<ByteVar>())
}

public actual fun ExAcquireFastMutexUnsafe(fastmutex: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireFastMutexUnsafe(fastmutex.toCPointer<ByteVar>())
}

public actual fun ExAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquirePushLockExclusiveEx(pushlock.toCPointer<ByteVar>(), flags)
}

public actual fun ExAcquirePushLockSharedEx(pushlock: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquirePushLockSharedEx(pushlock.toCPointer<ByteVar>(), flags)
}

public actual fun ExAcquireResourceExclusiveLite(resource: Long, wait: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireResourceExclusiveLite(resource.toCPointer<ByteVar>(), wait)

public actual fun ExAcquireResourceSharedLite(resource: Long, wait: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireResourceSharedLite(resource.toCPointer<ByteVar>(), wait)

public actual fun ExAcquireRundownProtection(runref: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtection(runref.toCPointer<ByteVar>())

public actual fun ExAcquireRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionCacheAware(runrefcacheaware)

public actual fun ExAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionCacheAwareEx(runrefcacheaware, count)

public actual fun ExAcquireRundownProtectionEx(runref: Long, count: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionEx(runref.toCPointer<ByteVar>(), count)

public actual fun ExAcquireSharedStarveExclusive(resource: Long, wait: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireSharedStarveExclusive(resource.toCPointer<ByteVar>(), wait)

public actual fun ExAcquireSharedWaitForExclusive(resource: Long, wait: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireSharedWaitForExclusive(resource.toCPointer<ByteVar>(), wait)

public actual fun ExAcquireSpinLockExclusive(spinlock: Long): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockExclusive(spinlock.toCPointer<ByteVar>())

public actual fun ExAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockExclusiveAtDpcLevel(spinlock.toCPointer<ByteVar>())
}

public actual fun ExAcquireSpinLockShared(spinlock: Long): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockShared(spinlock.toCPointer<ByteVar>())

public actual fun ExAcquireSpinLockSharedAtDpcLevel(spinlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockSharedAtDpcLevel(spinlock.toCPointer<ByteVar>())
}

public actual fun ExAllocateCacheAwareRundownProtection(pooltype: POOL_TYPE, pooltag: UInt): PEX_RUNDOWN_REF_CACHE_AWARE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAllocateCacheAwareRundownProtection(pooltype, pooltag)

public actual fun ExAllocatePool(pooltype: POOL_TYPE, numberofbytes: ULong): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAllocatePool(pooltype, numberofbytes)?.toLong() ?: 0L

public actual fun ExAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAllocatePool2(flags, numberofbytes, tag)?.toLong() ?: 0L

public actual fun ExAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAllocatePool3(flags, numberofbytes, tag, extendedparameters.toCPointer<ByteVar>(), extendedparameterscount)?.toLong() ?: 0L

public actual fun ExAllocatePoolWithQuota(pooltype: POOL_TYPE, numberofbytes: ULong): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithQuota(pooltype, numberofbytes)?.toLong() ?: 0L

public actual fun ExAllocatePoolWithQuotaTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithQuotaTag(pooltype, numberofbytes, tag)?.toLong() ?: 0L

public actual fun ExAllocatePoolWithTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithTag(pooltype, numberofbytes, tag)?.toLong() ?: 0L

public actual fun ExAllocatePoolWithTagPriority(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt, priority: EX_POOL_PRIORITY): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithTagPriority(pooltype, numberofbytes, tag, priority)?.toLong() ?: 0L

public actual fun ExAllocateTimer(callback: PEXT_CALLBACK, callbackcontext: Long, attributes: UInt): PEX_TIMER =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExAllocateTimer(callback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), attributes)

public actual fun ExCancelTimer(timer: PEX_TIMER, parameters: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExCancelTimer(timer, parameters.toCPointer<ByteVar>())

public actual fun ExCleanupRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExCleanupRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun ExConvertExclusiveToSharedLite(resource: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExConvertExclusiveToSharedLite(resource.toCPointer<ByteVar>())
}

public actual fun ExCreateCallback(callbackobject: Long, objectattributes: Long, create: Boolean, allowmultiplecallbacks: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExCreateCallback(callbackobject.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>(), create, allowmultiplecallbacks)

public actual fun ExCreatePool(flags: UInt, tag: ULong, params: Long, poolhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExCreatePool(flags, tag, params.toCPointer<ByteVar>(), poolhandle.toCPointer<ByteVar>())

public actual fun ExDeleteResourceLite(resource: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExDeleteResourceLite(resource.toCPointer<ByteVar>())

public actual fun ExDeleteTimer(timer: PEX_TIMER, cancel: Boolean, wait: Boolean, parameters: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExDeleteTimer(timer, cancel, wait, parameters.toCPointer<ByteVar>())

public actual fun ExDestroyPool(poolhandle: HANDLE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExDestroyPool(poolhandle.toCPointer<ByteVar>())
}

public actual fun ExEnterCriticalRegionAndAcquireResourceExclusive(resource: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireResourceExclusive(resource.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExEnterCriticalRegionAndAcquireResourceShared(resource: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireResourceShared(resource.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExEnumerateSystemFirmwareTables(firmwaretableprovidersignature, firmwaretablebuffer.toCPointer<ByteVar>(), bufferlength, returnlength.toCPointer<ByteVar>())

public actual fun ExExtendZone(zone: Long, segment: Long, segmentsize: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExExtendZone(zone.toCPointer<ByteVar>(), segment.toCPointer<ByteVar>(), segmentsize)

public actual fun ExFreeCacheAwareRundownProtection(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExFreeCacheAwareRundownProtection(runrefcacheaware)
}

public actual fun ExFreePool(p: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExFreePool(p.toCPointer<ByteVar>())
}

public actual fun ExFreePool2(p: Long, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExFreePool2(p.toCPointer<ByteVar>(), tag, extendedparameters.toCPointer<ByteVar>(), extendedparameterscount)
}

public actual fun ExFreePoolWithTag(p: Long, tag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExFreePoolWithTag(p.toCPointer<ByteVar>(), tag)
}

public actual fun ExGetExclusiveWaiterCount(resource: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExGetExclusiveWaiterCount(resource.toCPointer<ByteVar>())

public actual fun ExGetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Long, attributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExGetFirmwareEnvironmentVariable(variablename.toCPointer<ByteVar>(), vendorguid.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuelength.toCPointer<ByteVar>(), attributes.toCPointer<ByteVar>())

public actual fun ExGetFirmwareType(): FIRMWARE_TYPE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExGetFirmwareType()

public actual fun ExGetPreviousMode(): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExGetPreviousMode()

public actual fun ExGetSharedWaiterCount(resource: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExGetSharedWaiterCount(resource.toCPointer<ByteVar>())

public actual fun ExGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExGetSystemFirmwareTable(firmwaretableprovidersignature, firmwaretableid, firmwaretablebuffer.toCPointer<ByteVar>(), bufferlength, returnlength.toCPointer<ByteVar>())

public actual fun ExInitializePushLock(pushlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExInitializePushLock(pushlock.toCPointer<ByteVar>())
}

public actual fun ExInitializeResourceLite(resource: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExInitializeResourceLite(resource.toCPointer<ByteVar>())

public actual fun ExInitializeRundownProtection(runref: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtection(runref.toCPointer<ByteVar>())
}

public actual fun ExInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, runrefsize: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtectionCacheAware(runrefcacheaware, runrefsize)
}

public actual fun ExInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtectionCacheAwareEx(runrefcacheaware, flags)
}

public actual fun ExInitializeZone(zone: Long, blocksize: UInt, initialsegment: Long, initialsegmentsize: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExInitializeZone(zone.toCPointer<ByteVar>(), blocksize, initialsegment.toCPointer<ByteVar>(), initialsegmentsize)

public actual fun ExInterlockedAddLargeInteger(addend: Long, increment: Long, lock: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExInterlockedAddLargeInteger(addend.toCPointer<ByteVar>(), increment, lock.toCPointer<ByteVar>())

public actual fun ExInterlockedExtendZone(zone: Long, segment: Long, segmentsize: UInt, lock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExInterlockedExtendZone(zone.toCPointer<ByteVar>(), segment.toCPointer<ByteVar>(), segmentsize, lock.toCPointer<ByteVar>())

public actual fun ExIsManufacturingModeEnabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExIsManufacturingModeEnabled()

public actual fun ExIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExIsProcessorFeaturePresent(processorfeature)

public actual fun ExIsResourceAcquiredExclusiveLite(resource: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExIsResourceAcquiredExclusiveLite(resource.toCPointer<ByteVar>())

public actual fun ExIsResourceAcquiredSharedLite(resource: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExIsResourceAcquiredSharedLite(resource.toCPointer<ByteVar>())

public actual fun ExIsSoftBoot(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExIsSoftBoot()

public actual fun ExLocalTimeToSystemTime(localtime: Long, systemtime: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExLocalTimeToSystemTime(localtime.toCPointer<ByteVar>(), systemtime.toCPointer<ByteVar>())
}

public actual fun ExNotifyCallback(callbackobject: Long, argument1: Long, argument2: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExNotifyCallback(callbackobject.toCPointer<ByteVar>(), argument1.toCPointer<ByteVar>(), argument2.toCPointer<ByteVar>())
}

public actual fun ExQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExQueryTimerResolution(maximumtime.toCPointer<ByteVar>(), minimumtime.toCPointer<ByteVar>(), currenttime.toCPointer<ByteVar>())
}

public actual fun ExQueueWorkItem(workitem: Long, queuetype: WORK_QUEUE_TYPE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExQueueWorkItem(workitem.toCPointer<ByteVar>(), queuetype)
}

public actual fun ExRaiseAccessViolation() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExRaiseAccessViolation()
}

public actual fun ExRaiseDatatypeMisalignment() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExRaiseDatatypeMisalignment()
}

public actual fun ExRaiseStatus(status: NTSTATUS) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExRaiseStatus(status)
}

public actual fun ExReInitializeRundownProtection(runref: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReInitializeRundownProtection(runref.toCPointer<ByteVar>())
}

public actual fun ExReInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReInitializeRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun ExRegisterCallback(callbackobject: PCALLBACK_OBJECT, callbackfunction: PCALLBACK_FUNCTION, callbackcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExRegisterCallback(callbackobject, callbackfunction.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExReinitializeResourceLite(resource: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReinitializeResourceLite(resource.toCPointer<ByteVar>())

public actual fun ExReleaseFastMutex(fastmutex: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseFastMutex(fastmutex.toCPointer<ByteVar>())
}

public actual fun ExReleaseFastMutexUnsafe(fastmutex: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseFastMutexUnsafe(fastmutex.toCPointer<ByteVar>())
}

public actual fun ExReleasePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleasePushLockExclusiveEx(pushlock.toCPointer<ByteVar>(), flags)
}

public actual fun ExReleasePushLockSharedEx(pushlock: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleasePushLockSharedEx(pushlock.toCPointer<ByteVar>(), flags)
}

public actual fun ExReleaseResourceAndLeaveCriticalRegion(resource: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseResourceAndLeaveCriticalRegion(resource.toCPointer<ByteVar>())
}

public actual fun ExReleaseResourceForThreadLite(resource: Long, resourcethreadid: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseResourceForThreadLite(resource.toCPointer<ByteVar>(), resourcethreadid)
}

public actual fun ExReleaseResourceLite(resource: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseResourceLite(resource.toCPointer<ByteVar>())
}

public actual fun ExReleaseRundownProtection(runref: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtection(runref.toCPointer<ByteVar>())
}

public actual fun ExReleaseRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun ExReleaseRundownProtectionCacheAwareEx(runref: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionCacheAwareEx(runref, count)
}

public actual fun ExReleaseRundownProtectionEx(runref: Long, count: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionEx(runref.toCPointer<ByteVar>(), count)
}

public actual fun ExReleaseSpinLockExclusive(spinlock: Long, oldirql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockExclusive(spinlock.toCPointer<ByteVar>(), oldirql)
}

public actual fun ExReleaseSpinLockExclusiveFromDpcLevel(spinlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockExclusiveFromDpcLevel(spinlock.toCPointer<ByteVar>())
}

public actual fun ExReleaseSpinLockShared(spinlock: Long, oldirql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockShared(spinlock.toCPointer<ByteVar>(), oldirql)
}

public actual fun ExReleaseSpinLockSharedFromDpcLevel(spinlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockSharedFromDpcLevel(spinlock.toCPointer<ByteVar>())
}

public actual fun ExRundownCompleted(runref: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExRundownCompleted(runref.toCPointer<ByteVar>())
}

public actual fun ExRundownCompletedCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExRundownCompletedCacheAware(runrefcacheaware)
}

public actual fun ExSecurePoolUpdate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong, offset: ULong, size: ULong, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExSecurePoolUpdate(securepoolhandle.toCPointer<ByteVar>(), tag, allocation.toCPointer<ByteVar>(), cookie, offset, size, buffer.toCPointer<ByteVar>())

public actual fun ExSecurePoolValidate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExSecurePoolValidate(securepoolhandle.toCPointer<ByteVar>(), tag, allocation.toCPointer<ByteVar>(), cookie)

public actual fun ExSetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: UInt, attributes: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExSetFirmwareEnvironmentVariable(variablename.toCPointer<ByteVar>(), vendorguid.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuelength, attributes)

public actual fun ExSetResourceOwnerPointer(resource: Long, ownerpointer: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExSetResourceOwnerPointer(resource.toCPointer<ByteVar>(), ownerpointer.toCPointer<ByteVar>())
}

public actual fun ExSetResourceOwnerPointerEx(resource: Long, ownerpointer: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExSetResourceOwnerPointerEx(resource.toCPointer<ByteVar>(), ownerpointer.toCPointer<ByteVar>(), flags)
}

public actual fun ExSetTimer(timer: PEX_TIMER, duetime: Long, period: Long, parameters: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExSetTimer(timer, duetime, period, parameters.toCPointer<ByteVar>())

public actual fun ExSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExSetTimerResolution(desiredtime, setresolution)

public actual fun ExSizeOfRundownProtectionCacheAware(): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExSizeOfRundownProtectionCacheAware()

public actual fun ExSystemTimeToLocalTime(systemtime: Long, localtime: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExSystemTimeToLocalTime(systemtime.toCPointer<ByteVar>(), localtime.toCPointer<ByteVar>())
}

public actual fun ExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock.toCPointer<ByteVar>())

public actual fun ExTryAcquireSpinLockSharedAtDpcLevel(spinlock: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExTryAcquireSpinLockSharedAtDpcLevel(spinlock.toCPointer<ByteVar>())

public actual fun ExTryConvertSharedSpinLockExclusive(spinlock: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExTryConvertSharedSpinLockExclusive(spinlock.toCPointer<ByteVar>())

public actual fun ExTryToAcquireFastMutex(fastmutex: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExTryToAcquireFastMutex(fastmutex.toCPointer<ByteVar>())

public actual fun ExUnregisterCallback(callbackregistration: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExUnregisterCallback(callbackregistration.toCPointer<ByteVar>())
}

public actual fun ExUuidCreate(uuid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExUuidCreate(uuid.toCPointer<ByteVar>())

public actual fun ExVerifySuite(suitetype: SUITE_TYPE): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExVerifySuite(suitetype)

public actual fun ExWaitForRundownProtectionRelease(runref: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExWaitForRundownProtectionRelease(runref.toCPointer<ByteVar>())
}

public actual fun ExWaitForRundownProtectionReleaseCacheAware(runref: PEX_RUNDOWN_REF_CACHE_AWARE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ExWaitForRundownProtectionReleaseCacheAware(runref)
}

public actual fun FsRtlIsTotalDeviceFailure(status: NTSTATUS): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_FsRtlIsTotalDeviceFailure(status)

public actual fun HalAcquireDisplayOwnership(resetdisplayparameters: PHAL_RESET_DISPLAY_PARAMETERS) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalAcquireDisplayOwnership(resetdisplayparameters.toLong().toCPointer<ByteVar>())
}

public actual fun HalAllocateAdapterChannel(adapterobject: Long, wcb: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL): NTSTATUS =
    0

public actual fun HalAllocateCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, cacheenabled: Boolean): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalAllocateCommonBuffer(adapterobject.toCPointer<ByteVar>(), length, logicaladdress.toCPointer<ByteVar>(), cacheenabled)?.toLong() ?: 0L

public actual fun HalAllocateCrashDumpRegisters(adapterobject: Long, numberofmapregisters: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalAllocateCrashDumpRegisters(adapterobject.toCPointer<ByteVar>(), numberofmapregisters.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HalAllocateHardwareCounters(groupaffinty: Long, groupcount: UInt, resourcelist: Long, countersethandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalAllocateHardwareCounters(groupaffinty.toCPointer<ByteVar>(), groupcount, resourcelist.toCPointer<ByteVar>(), countersethandle.toCPointer<ByteVar>())

public actual fun HalAssignSlotResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, bustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, allocatedresources: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalAssignSlotResources(registrypath.toCPointer<ByteVar>(), driverclassname.toCPointer<ByteVar>(), driverobject.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), bustype, busnumber, slotnumber, allocatedresources.toCPointer<ByteVar>())

public actual fun HalBugCheckSystem(errorsource: Long, errorrecord: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalBugCheckSystem(errorsource.toCPointer<ByteVar>(), errorrecord.toCPointer<ByteVar>())
}

public actual fun HalDmaAllocateCrashDumpRegistersEx(adapter: Long, numberofmapregisters: UInt, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE, mapregisterbase: Long, mapregistersavailable: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalDmaAllocateCrashDumpRegistersEx(adapter.toCPointer<ByteVar>(), numberofmapregisters, type, mapregisterbase.toCPointer<ByteVar>(), mapregistersavailable.toCPointer<ByteVar>())

public actual fun HalDmaFreeCrashDumpRegistersEx(adapter: Long, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalDmaFreeCrashDumpRegistersEx(adapter.toCPointer<ByteVar>(), type)

public actual fun HalExamineMBR(deviceobject: Long, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalExamineMBR(deviceobject.toCPointer<ByteVar>(), sectorsize, mbrtypeidentifier, buffer.toCPointer<ByteVar>())
}

public actual fun HalFreeCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, virtualaddress: Long, cacheenabled: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalFreeCommonBuffer(adapterobject.toCPointer<ByteVar>(), length, logicaladdress, virtualaddress.toCPointer<ByteVar>(), cacheenabled)
}

public actual fun HalFreeHardwareCounters(countersethandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalFreeHardwareCounters(countersethandle.toCPointer<ByteVar>())

public actual fun HalGetAdapter(devicedescription: Long, numberofmapregisters: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalGetAdapter(devicedescription.toCPointer<ByteVar>(), numberofmapregisters.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HalGetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalGetBusData(busdatatype, busnumber, slotnumber, buffer.toCPointer<ByteVar>(), length)

public actual fun HalGetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalGetBusDataByOffset(busdatatype, busnumber, slotnumber, buffer.toCPointer<ByteVar>(), offset, length)

public actual fun HalGetInterruptVector(interfacetype: INTERFACE_TYPE, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: Long, affinity: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalGetInterruptVector(interfacetype, busnumber, businterruptlevel, businterruptvector, irql.toCPointer<ByteVar>(), affinity.toCPointer<ByteVar>())

public actual fun HalMakeBeep(frequency: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalMakeBeep(frequency)

public actual fun HalReadDmaCounter(adapterobject: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalReadDmaCounter(adapterobject.toCPointer<ByteVar>())

public actual fun HalSetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalSetBusData(busdatatype, busnumber, slotnumber, buffer.toCPointer<ByteVar>(), length)

public actual fun HalSetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalSetBusDataByOffset(busdatatype, busnumber, slotnumber, buffer.toCPointer<ByteVar>(), offset, length)

public actual fun HalTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HalTranslateBusAddress(interfacetype, busnumber, busaddress, addressspace.toCPointer<ByteVar>(), translatedaddress.toCPointer<ByteVar>())

public actual fun HvlRegisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HvlRegisterWheaErrorNotification(callback.toLong().toCPointer<ByteVar>())

public actual fun HvlUnregisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_HvlUnregisterWheaErrorNotification(callback.toLong().toCPointer<ByteVar>())

public actual fun IoAcquireCancelSpinLock(irql: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAcquireCancelSpinLock(irql.toCPointer<ByteVar>())
}

public actual fun IoAcquireKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, buffer: Long, size: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAcquireKsrPersistentMemory(driverobject.toCPointer<ByteVar>(), physicaldeviceobject.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun IoAcquireKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffer: Long, size: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAcquireKsrPersistentMemoryEx(driverobject.toCPointer<ByteVar>(), physicaldeviceobject.toCPointer<ByteVar>(), physicaldeviceid.toCPointer<ByteVar>(), datatag.toCPointer<ByteVar>(), dataversion.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun IoAcquireRemoveLockEx(removelock: Long, tag: Long, file: PCSTR, line: UInt, remlocksize: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAcquireRemoveLockEx(removelock.toCPointer<ByteVar>(), tag.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), line, remlocksize)

public actual fun IoAllocateAdapterChannel(adapterobject: Long, deviceobject: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL, context: Long): NTSTATUS =
    0

public actual fun IoAllocateController(controllerobject: Long, deviceobject: Long, executionroutine: DRIVER_CONTROL, context: Long) {
}

public actual fun IoAllocateDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long, driverobjectextensionsize: UInt, driverobjectextension: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAllocateDriverObjectExtension(driverobject.toCPointer<ByteVar>(), clientidentificationaddress.toCPointer<ByteVar>(), driverobjectextensionsize, driverobjectextension.toCPointer<ByteVar>())

public actual fun IoAllocateErrorLogEntry(ioobject: Long, entrysize: UByte): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAllocateErrorLogEntry(ioobject.toCPointer<ByteVar>(), entrysize)?.toLong() ?: 0L

public actual fun IoAllocateIrp(stacksize: Byte, chargequota: Boolean): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAllocateIrp(stacksize, chargequota)?.toLong() ?: 0L

public actual fun IoAllocateIrpEx(deviceobject: Long, stacksize: Byte, chargequota: Boolean): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAllocateIrpEx(deviceobject.toCPointer<ByteVar>(), stacksize, chargequota)?.toLong() ?: 0L

public actual fun IoAllocateMdl(virtualaddress: Long, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAllocateMdl(virtualaddress.toCPointer<ByteVar>(), length, secondarybuffer, chargequota, irp.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoAllocateSfioStreamIdentifier(fileobject: Long, length: UInt, signature: Long, streamidentifier: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAllocateSfioStreamIdentifier(fileobject.toCPointer<ByteVar>(), length, signature.toCPointer<ByteVar>(), streamidentifier.toCPointer<ByteVar>())

public actual fun IoAllocateWorkItem(deviceobject: Long): PIO_WORKITEM =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAllocateWorkItem(deviceobject.toCPointer<ByteVar>())

public actual fun IoAssignResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, requestedresources: Long, allocatedresources: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAssignResources(registrypath.toCPointer<ByteVar>(), driverclassname.toCPointer<ByteVar>(), driverobject.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), requestedresources.toCPointer<ByteVar>(), allocatedresources.toCPointer<ByteVar>())

public actual fun IoAttachDevice(sourcedevice: Long, targetdevice: Long, attacheddevice: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAttachDevice(sourcedevice.toCPointer<ByteVar>(), targetdevice.toCPointer<ByteVar>(), attacheddevice.toCPointer<ByteVar>())

public actual fun IoAttachDeviceByPointer(sourcedevice: Long, targetdevice: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAttachDeviceByPointer(sourcedevice.toCPointer<ByteVar>(), targetdevice.toCPointer<ByteVar>())

public actual fun IoAttachDeviceToDeviceStack(sourcedevice: Long, targetdevice: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAttachDeviceToDeviceStack(sourcedevice.toCPointer<ByteVar>(), targetdevice.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoAttachDeviceToDeviceStackSafe(sourcedevice: Long, targetdevice: Long, attachedtodeviceobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoAttachDeviceToDeviceStackSafe(sourcedevice.toCPointer<ByteVar>(), targetdevice.toCPointer<ByteVar>(), attachedtodeviceobject.toCPointer<ByteVar>())

public actual fun IoBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, iostatusblock: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoBuildAsynchronousFsdRequest(majorfunction, deviceobject.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, startingoffset.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: Long, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: Long, iostatusblock: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoBuildDeviceIoControlRequest(iocontrolcode, deviceobject.toCPointer<ByteVar>(), inputbuffer.toCPointer<ByteVar>(), inputbufferlength, outputbuffer.toCPointer<ByteVar>(), outputbufferlength, internaldeviceiocontrol, event.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoBuildPartialMdl(sourcemdl: Long, targetmdl: Long, virtualaddress: Long, length: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoBuildPartialMdl(sourcemdl.toCPointer<ByteVar>(), targetmdl.toCPointer<ByteVar>(), virtualaddress.toCPointer<ByteVar>(), length)
}

public actual fun IoBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, event: Long, iostatusblock: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoBuildSynchronousFsdRequest(majorfunction, deviceobject.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, startingoffset.toCPointer<ByteVar>(), event.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoCancelFileOpen(deviceobject: Long, fileobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCancelFileOpen(deviceobject.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>())
}

public actual fun IoCancelIrp(irp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCancelIrp(irp.toCPointer<ByteVar>())

public actual fun IoCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCheckLinkShareAccess(desiredaccess, desiredshareaccess, fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>(), linkshareaccess.toCPointer<ByteVar>(), ioshareaccessflags)

public actual fun IoCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCheckShareAccess(desiredaccess, desiredshareaccess, fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>(), update)

public actual fun IoCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean, writepermission: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCheckShareAccessEx(desiredaccess, desiredshareaccess, fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>(), update, writepermission.toCPointer<ByteVar>())

public actual fun IoCleanupIrp(irp: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCleanupIrp(irp.toCPointer<ByteVar>())
}

public actual fun IoClearActivityIdThread(originalid: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoClearActivityIdThread(originalid.toCPointer<ByteVar>())
}

public actual fun IoClearIrpExtraCreateParameter(irp: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoClearIrpExtraCreateParameter(irp.toCPointer<ByteVar>())
}

public actual fun IoConnectInterrupt(interruptobject: Long, serviceroutine: PKSERVICE_ROUTINE, servicecontext: Long, spinlock: Long, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KINTERRUPT_MODE, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoConnectInterrupt(interruptobject.toCPointer<ByteVar>(), serviceroutine.toLong().toCPointer<ByteVar>(), servicecontext.toCPointer<ByteVar>(), spinlock.toCPointer<ByteVar>(), vector, irql, synchronizeirql, interruptmode, sharevector, processorenablemask, floatingsave)

public actual fun IoConnectInterruptEx(parameters: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoConnectInterruptEx(parameters.toCPointer<ByteVar>())

public actual fun IoCreateController(size: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateController(size)?.toLong() ?: 0L

public actual fun IoCreateDevice(driverobject: Long, deviceextensionsize: UInt, devicename: Long, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateDevice(driverobject.toCPointer<ByteVar>(), deviceextensionsize, devicename.toCPointer<ByteVar>(), devicetype, devicecharacteristics, exclusive, deviceobject.toCPointer<ByteVar>())

public actual fun IoCreateDisk(deviceobject: Long, disk: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateDisk(deviceobject.toCPointer<ByteVar>(), disk.toCPointer<ByteVar>())

public actual fun IoCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateFile(filehandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), allocationsize.toCPointer<ByteVar>(), fileattributes, shareaccess, disposition, createoptions, eabuffer.toCPointer<ByteVar>(), ealength, createfiletype, internalparameters.toCPointer<ByteVar>(), options)

public actual fun IoCreateFileEx(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, drivercontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateFileEx(filehandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), allocationsize.toCPointer<ByteVar>(), fileattributes, shareaccess, disposition, createoptions, eabuffer.toCPointer<ByteVar>(), ealength, createfiletype, internalparameters.toCPointer<ByteVar>(), options, drivercontext.toCPointer<ByteVar>())

public actual fun IoCreateFileSpecifyDeviceObjectHint(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, deviceobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateFileSpecifyDeviceObjectHint(filehandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), allocationsize.toCPointer<ByteVar>(), fileattributes, shareaccess, disposition, createoptions, eabuffer.toCPointer<ByteVar>(), ealength, createfiletype, internalparameters.toCPointer<ByteVar>(), options, deviceobject.toCPointer<ByteVar>())

public actual fun IoCreateNotificationEvent(eventname: Long, eventhandle: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateNotificationEvent(eventname.toCPointer<ByteVar>(), eventhandle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoCreateSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateSymbolicLink(symboliclinkname.toCPointer<ByteVar>(), devicename.toCPointer<ByteVar>())

public actual fun IoCreateSynchronizationEvent(eventname: Long, eventhandle: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateSynchronizationEvent(eventname.toCPointer<ByteVar>(), eventhandle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoCreateSystemThread(ioobject: Long, threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateSystemThread(ioobject.toCPointer<ByteVar>(), threadhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), processhandle.toCPointer<ByteVar>(), clientid.toCPointer<ByteVar>(), startroutine.toLong().toCPointer<ByteVar>(), startcontext.toCPointer<ByteVar>())

public actual fun IoCreateUnprotectedSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCreateUnprotectedSymbolicLink(symboliclinkname.toCPointer<ByteVar>(), devicename.toCPointer<ByteVar>())

public actual fun IoCsqInitialize(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCsqInitialize(csq.toCPointer<ByteVar>(), csqinsertirp.toLong().toCPointer<ByteVar>(), csqremoveirp.toLong().toCPointer<ByteVar>(), csqpeeknextirp.toLong().toCPointer<ByteVar>(), csqacquirelock.toLong().toCPointer<ByteVar>(), csqreleaselock.toLong().toCPointer<ByteVar>(), csqcompletecanceledirp.toLong().toCPointer<ByteVar>())

public actual fun IoCsqInitializeEx(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP_EX, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCsqInitializeEx(csq.toCPointer<ByteVar>(), csqinsertirp.toLong().toCPointer<ByteVar>(), csqremoveirp.toLong().toCPointer<ByteVar>(), csqpeeknextirp.toLong().toCPointer<ByteVar>(), csqacquirelock.toLong().toCPointer<ByteVar>(), csqreleaselock.toLong().toCPointer<ByteVar>(), csqcompletecanceledirp.toLong().toCPointer<ByteVar>())

public actual fun IoCsqInsertIrp(csq: Long, irp: Long, context: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCsqInsertIrp(csq.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())
}

public actual fun IoCsqInsertIrpEx(csq: Long, irp: Long, context: Long, insertcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCsqInsertIrpEx(csq.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), insertcontext.toCPointer<ByteVar>())

public actual fun IoCsqRemoveIrp(csq: Long, context: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCsqRemoveIrp(csq.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoCsqRemoveNextIrp(csq: Long, peekcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoCsqRemoveNextIrp(csq.toCPointer<ByteVar>(), peekcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoDecrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoDecrementKeepAliveCount(fileobject.toCPointer<ByteVar>(), process)

public actual fun IoDeleteController(controllerobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoDeleteController(controllerobject.toCPointer<ByteVar>())
}

public actual fun IoDeleteDevice(deviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoDeleteDevice(deviceobject.toCPointer<ByteVar>())
}

public actual fun IoDeleteSymbolicLink(symboliclinkname: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoDeleteSymbolicLink(symboliclinkname.toCPointer<ByteVar>())

public actual fun IoDetachDevice(targetdevice: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoDetachDevice(targetdevice.toCPointer<ByteVar>())
}

public actual fun IoDisconnectInterrupt(interruptobject: PKINTERRUPT) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoDisconnectInterrupt(interruptobject)
}

public actual fun IoDisconnectInterruptEx(parameters: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoDisconnectInterruptEx(parameters.toCPointer<ByteVar>())
}

public actual fun IoEnumerateKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, callback: PIO_PERSISTED_MEMORY_ENUMERATION_CALLBACK, callbackcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoEnumerateKsrPersistentMemoryEx(driverobject.toCPointer<ByteVar>(), physicaldeviceobject.toCPointer<ByteVar>(), physicaldeviceid.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun IoFlushAdapterBuffers(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: UInt, writetodevice: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoFlushAdapterBuffers(adapterobject.toCPointer<ByteVar>(), mdl.toCPointer<ByteVar>(), mapregisterbase.toCPointer<ByteVar>(), currentva.toCPointer<ByteVar>(), length, writetodevice)

public actual fun IoForwardIrpSynchronously(deviceobject: Long, irp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoForwardIrpSynchronously(deviceobject.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>())

public actual fun IoFreeAdapterChannel(adapterobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoFreeAdapterChannel(adapterobject.toCPointer<ByteVar>())
}

public actual fun IoFreeController(controllerobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoFreeController(controllerobject.toCPointer<ByteVar>())
}

public actual fun IoFreeErrorLogEntry(elentry: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoFreeErrorLogEntry(elentry.toCPointer<ByteVar>())
}

public actual fun IoFreeIrp(irp: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoFreeIrp(irp.toCPointer<ByteVar>())
}

public actual fun IoFreeKsrPersistentMemory(datahandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoFreeKsrPersistentMemory(datahandle.toCPointer<ByteVar>())

public actual fun IoFreeMapRegisters(adapterobject: Long, mapregisterbase: Long, numberofmapregisters: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoFreeMapRegisters(adapterobject.toCPointer<ByteVar>(), mapregisterbase.toCPointer<ByteVar>(), numberofmapregisters)
}

public actual fun IoFreeMdl(mdl: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoFreeMdl(mdl.toCPointer<ByteVar>())
}

public actual fun IoFreeSfioStreamIdentifier(fileobject: Long, signature: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoFreeSfioStreamIdentifier(fileobject.toCPointer<ByteVar>(), signature.toCPointer<ByteVar>())

public actual fun IoFreeWorkItem(ioworkitem: PIO_WORKITEM) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoFreeWorkItem(ioworkitem)
}

public actual fun IoGetActivityIdIrp(irp: Long, guid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetActivityIdIrp(irp.toCPointer<ByteVar>(), guid.toCPointer<ByteVar>())

public actual fun IoGetActivityIdThread(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetActivityIdThread()?.toLong() ?: 0L

public actual fun IoGetAffinityInterrupt(interruptobject: PKINTERRUPT, groupaffinity: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetAffinityInterrupt(interruptobject, groupaffinity.toCPointer<ByteVar>())

public actual fun IoGetAttachedDeviceReference(deviceobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetAttachedDeviceReference(deviceobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetBootDiskInformation(bootdiskinformation: Long, size: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetBootDiskInformation(bootdiskinformation.toCPointer<ByteVar>(), size)

public actual fun IoGetBootDiskInformationLite(bootdiskinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetBootDiskInformationLite(bootdiskinformation.toCPointer<ByteVar>())

public actual fun IoGetConfigurationInformation(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetConfigurationInformation()?.toLong() ?: 0L

public actual fun IoGetContainerInformation(informationclass: IO_CONTAINER_INFORMATION_CLASS, containerobject: Long, buffer: Long, bufferlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetContainerInformation(informationclass, containerobject.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlength)

public actual fun IoGetCurrentProcess(): PEPROCESS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetCurrentProcess()

public actual fun IoGetDeviceDirectory(physicaldeviceobject: Long, directorytype: DEVICE_DIRECTORY_TYPE, flags: UInt, reserved: Long, devicedirectoryhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDeviceDirectory(physicaldeviceobject.toCPointer<ByteVar>(), directorytype, flags, reserved.toCPointer<ByteVar>(), devicedirectoryhandle.toCPointer<ByteVar>())

public actual fun IoGetDeviceInterfaceAlias(symboliclinkname: Long, aliasinterfaceclassguid: Long, aliassymboliclinkname: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfaceAlias(symboliclinkname.toCPointer<ByteVar>(), aliasinterfaceclassguid.toCPointer<ByteVar>(), aliassymboliclinkname.toCPointer<ByteVar>())

public actual fun IoGetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfacePropertyData(symboliclinkname.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), lcid, flags, size, data.toCPointer<ByteVar>(), requiredsize.toCPointer<ByteVar>(), type.toCPointer<ByteVar>())

public actual fun IoGetDeviceInterfaces(interfaceclassguid: Long, physicaldeviceobject: Long, flags: UInt, symboliclinklist: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfaces(interfaceclassguid.toCPointer<ByteVar>(), physicaldeviceobject.toCPointer<ByteVar>(), flags, symboliclinklist.toCPointer<ByteVar>())

public actual fun IoGetDeviceNumaNode(pdo: Long, nodenumber: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDeviceNumaNode(pdo.toCPointer<ByteVar>(), nodenumber.toCPointer<ByteVar>())

public actual fun IoGetDeviceObjectPointer(objectname: Long, desiredaccess: UInt, fileobject: Long, deviceobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDeviceObjectPointer(objectname.toCPointer<ByteVar>(), desiredaccess, fileobject.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>())

public actual fun IoGetDeviceProperty(deviceobject: Long, deviceproperty: DEVICE_REGISTRY_PROPERTY, bufferlength: UInt, propertybuffer: Long, resultlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDeviceProperty(deviceobject.toCPointer<ByteVar>(), deviceproperty, bufferlength, propertybuffer.toCPointer<ByteVar>(), resultlength.toCPointer<ByteVar>())

public actual fun IoGetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDevicePropertyData(pdo.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), lcid, flags, size, data.toCPointer<ByteVar>(), requiredsize.toCPointer<ByteVar>(), type.toCPointer<ByteVar>())

public actual fun IoGetDmaAdapter(physicaldeviceobject: Long, devicedescription: Long, numberofmapregisters: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDmaAdapter(physicaldeviceobject.toCPointer<ByteVar>(), devicedescription.toCPointer<ByteVar>(), numberofmapregisters.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetDriverDirectory(driverobject: Long, directorytype: DRIVER_DIRECTORY_TYPE, flags: UInt, driverdirectoryhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDriverDirectory(driverobject.toCPointer<ByteVar>(), directorytype, flags, driverdirectoryhandle.toCPointer<ByteVar>())

public actual fun IoGetDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetDriverObjectExtension(driverobject.toCPointer<ByteVar>(), clientidentificationaddress.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetFileObjectGenericMapping(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetFileObjectGenericMapping()?.toLong() ?: 0L

public actual fun IoGetFsZeroingOffset(irp: Long, zeroingoffset: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetFsZeroingOffset(irp.toCPointer<ByteVar>(), zeroingoffset.toCPointer<ByteVar>())

public actual fun IoGetInitialStack(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetInitialStack()?.toLong() ?: 0L

public actual fun IoGetInitiatorProcess(fileobject: Long): PEPROCESS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetInitiatorProcess(fileobject.toCPointer<ByteVar>())

public actual fun IoGetIoAttributionHandle(irp: Long, ioattributionhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetIoAttributionHandle(irp.toCPointer<ByteVar>(), ioattributionhandle.toCPointer<ByteVar>())

public actual fun IoGetIoPriorityHint(irp: Long): IO_PRIORITY_HINT =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetIoPriorityHint(irp.toCPointer<ByteVar>())

public actual fun IoGetIommuInterface(version: UInt, interfaceout: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetIommuInterface(version, interfaceout.toCPointer<ByteVar>())

public actual fun IoGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetIommuInterfaceEx(version, flags, interfaceout.toCPointer<ByteVar>())

public actual fun IoGetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetIrpExtraCreateParameter(irp.toCPointer<ByteVar>(), extracreateparameter.toCPointer<ByteVar>())

public actual fun IoGetPagingIoPriority(irp: Long): IO_PAGING_PRIORITY =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetPagingIoPriority(irp.toCPointer<ByteVar>())

public actual fun IoGetRelatedDeviceObject(fileobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetRelatedDeviceObject(fileobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetSfioStreamIdentifier(fileobject: Long, signature: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetSfioStreamIdentifier(fileobject.toCPointer<ByteVar>(), signature.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetSilo(fileobject: Long): PESILO =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetSilo(fileobject.toCPointer<ByteVar>())

public actual fun IoGetSiloParameters(fileobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetSiloParameters(fileobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetStackLimits(lowlimit: Long, highlimit: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetStackLimits(lowlimit.toCPointer<ByteVar>(), highlimit.toCPointer<ByteVar>())
}

public actual fun IoGetTopLevelIrp(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetTopLevelIrp()?.toLong() ?: 0L

public actual fun IoGetTransactionParameterBlock(fileobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoGetTransactionParameterBlock(fileobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoIncrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoIncrementKeepAliveCount(fileobject.toCPointer<ByteVar>(), process)

public actual fun IoInitializeIrp(irp: Long, packetsize: UShort, stacksize: Byte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoInitializeIrp(irp.toCPointer<ByteVar>(), packetsize, stacksize)
}

public actual fun IoInitializeIrpEx(irp: Long, deviceobject: Long, packetsize: UShort, stacksize: Byte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoInitializeIrpEx(irp.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), packetsize, stacksize)
}

public actual fun IoInitializeRemoveLockEx(lock: Long, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoInitializeRemoveLockEx(lock.toCPointer<ByteVar>(), allocatetag, maxlockedminutes, highwatermark, remlocksize)
}

public actual fun IoInitializeTimer(deviceobject: Long, timerroutine: PIO_TIMER_ROUTINE, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoInitializeTimer(deviceobject.toCPointer<ByteVar>(), timerroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun IoInitializeWorkItem(ioobject: Long, ioworkitem: PIO_WORKITEM) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoInitializeWorkItem(ioobject.toCPointer<ByteVar>(), ioworkitem)
}

public actual fun IoInvalidateDeviceRelations(deviceobject: Long, type: DEVICE_RELATION_TYPE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoInvalidateDeviceRelations(deviceobject.toCPointer<ByteVar>(), type)
}

public actual fun IoInvalidateDeviceState(physicaldeviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoInvalidateDeviceState(physicaldeviceobject.toCPointer<ByteVar>())
}

public actual fun IoIs32bitProcess(irp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoIs32bitProcess(irp.toCPointer<ByteVar>())

public actual fun IoIsFileObjectIgnoringSharing(fileobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoIsFileObjectIgnoringSharing(fileobject.toCPointer<ByteVar>())

public actual fun IoIsFileOriginRemote(fileobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoIsFileOriginRemote(fileobject.toCPointer<ByteVar>())

public actual fun IoIsInitiator32bitProcess(irp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoIsInitiator32bitProcess(irp.toCPointer<ByteVar>())

public actual fun IoIsValidIrpStatus(status: NTSTATUS): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoIsValidIrpStatus(status)

public actual fun IoIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoIsWdmVersionAvailable(majorversion, minorversion)

public actual fun IoMakeAssociatedIrp(irp: Long, stacksize: Byte): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoMakeAssociatedIrp(irp.toCPointer<ByteVar>(), stacksize)?.toLong() ?: 0L

public actual fun IoMakeAssociatedIrpEx(irp: Long, deviceobject: Long, stacksize: Byte): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoMakeAssociatedIrpEx(irp.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), stacksize)?.toLong() ?: 0L

public actual fun IoMapTransfer(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Long, writetodevice: Boolean): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoMapTransfer(adapterobject.toCPointer<ByteVar>(), mdl.toCPointer<ByteVar>(), mapregisterbase.toCPointer<ByteVar>(), currentva.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), writetodevice)

public actual fun IoOpenDeviceInterfaceRegistryKey(symboliclinkname: Long, desiredaccess: UInt, deviceinterfaceregkey: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoOpenDeviceInterfaceRegistryKey(symboliclinkname.toCPointer<ByteVar>(), desiredaccess, deviceinterfaceregkey.toCPointer<ByteVar>())

public actual fun IoOpenDeviceRegistryKey(deviceobject: Long, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoOpenDeviceRegistryKey(deviceobject.toCPointer<ByteVar>(), devinstkeytype, desiredaccess, deviceregkey.toCPointer<ByteVar>())

public actual fun IoOpenDriverRegistryKey(driverobject: Long, regkeytype: DRIVER_REGKEY_TYPE, desiredaccess: UInt, flags: UInt, driverregkey: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoOpenDriverRegistryKey(driverobject.toCPointer<ByteVar>(), regkeytype, desiredaccess, flags, driverregkey.toCPointer<ByteVar>())

public actual fun IoPropagateActivityIdToThread(irp: Long, propagatedid: Long, originalid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoPropagateActivityIdToThread(irp.toCPointer<ByteVar>(), propagatedid.toCPointer<ByteVar>(), originalid.toCPointer<ByteVar>())

public actual fun IoQueryDeviceDescription(bustype: Long, busnumber: Long, controllertype: Long, controllernumber: Long, peripheraltype: Long, peripheralnumber: Long, calloutroutine: PIO_QUERY_DEVICE_ROUTINE, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoQueryDeviceDescription(bustype.toCPointer<ByteVar>(), busnumber.toCPointer<ByteVar>(), controllertype.toCPointer<ByteVar>(), controllernumber.toCPointer<ByteVar>(), peripheraltype.toCPointer<ByteVar>(), peripheralnumber.toCPointer<ByteVar>(), calloutroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun IoQueryFullDriverPath(driverobject: Long, fullpath: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoQueryFullDriverPath(driverobject.toCPointer<ByteVar>(), fullpath.toCPointer<ByteVar>())

public actual fun IoQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, options: UInt, drivercontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoQueryInformationByName(objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass, options, drivercontext.toCPointer<ByteVar>())

public actual fun IoQueryKsrPersistentMemorySize(driverobject: Long, physicaldeviceobject: Long, buffersize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoQueryKsrPersistentMemorySize(driverobject.toCPointer<ByteVar>(), physicaldeviceobject.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun IoQueryKsrPersistentMemorySizeEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffersize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoQueryKsrPersistentMemorySizeEx(driverobject.toCPointer<ByteVar>(), physicaldeviceobject.toCPointer<ByteVar>(), physicaldeviceid.toCPointer<ByteVar>(), datatag.toCPointer<ByteVar>(), dataversion.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun IoQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoQueueWorkItem(ioworkitem, workerroutine.toLong().toCPointer<ByteVar>(), queuetype, context.toCPointer<ByteVar>())
}

public actual fun IoQueueWorkItemEx(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoQueueWorkItemEx(ioworkitem, workerroutine.toLong().toCPointer<ByteVar>(), queuetype, context.toCPointer<ByteVar>())
}

public actual fun IoRaiseHardError(irp: Long, vpb: Long, realdeviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRaiseHardError(irp.toCPointer<ByteVar>(), vpb.toCPointer<ByteVar>(), realdeviceobject.toCPointer<ByteVar>())
}

public actual fun IoRaiseInformationalHardError(errorstatus: NTSTATUS, string: Long, thread: PKTHREAD): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRaiseInformationalHardError(errorstatus, string.toCPointer<ByteVar>(), thread)

public actual fun IoReadDiskSignature(deviceobject: Long, bytespersector: UInt, signature: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReadDiskSignature(deviceobject.toCPointer<ByteVar>(), bytespersector, signature.toCPointer<ByteVar>())

public actual fun IoReadPartitionTable(deviceobject: Long, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReadPartitionTable(deviceobject.toCPointer<ByteVar>(), sectorsize, returnrecognizedpartitions, partitionbuffer.toCPointer<ByteVar>())

public actual fun IoReadPartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReadPartitionTableEx(deviceobject.toCPointer<ByteVar>(), drivelayout.toCPointer<ByteVar>())

public actual fun IoRecordIoAttribution(opaquehandle: Long, attributioninformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRecordIoAttribution(opaquehandle.toCPointer<ByteVar>(), attributioninformation.toCPointer<ByteVar>())

public actual fun IoRegisterBootDriverCallback(callbackfunction: PBOOT_DRIVER_CALLBACK_FUNCTION, callbackcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRegisterBootDriverCallback(callbackfunction.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoRegisterBootDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long) {
}

public actual fun IoRegisterContainerNotification(notificationclass: IO_CONTAINER_NOTIFICATION_CLASS, callbackfunction: PIO_CONTAINER_NOTIFICATION_FUNCTION, notificationinformation: Long, notificationinformationlength: UInt, callbackregistration: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRegisterContainerNotification(notificationclass, callbackfunction.toLong().toCPointer<ByteVar>(), notificationinformation.toCPointer<ByteVar>(), notificationinformationlength, callbackregistration.toCPointer<ByteVar>())

public actual fun IoRegisterDeviceInterface(physicaldeviceobject: Long, interfaceclassguid: Long, referencestring: Long, symboliclinkname: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRegisterDeviceInterface(physicaldeviceobject.toCPointer<ByteVar>(), interfaceclassguid.toCPointer<ByteVar>(), referencestring.toCPointer<ByteVar>(), symboliclinkname.toCPointer<ByteVar>())

public actual fun IoRegisterDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long) {
}

public actual fun IoRegisterLastChanceShutdownNotification(deviceobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRegisterLastChanceShutdownNotification(deviceobject.toCPointer<ByteVar>())

public actual fun IoRegisterPlugPlayNotification(eventcategory: IO_NOTIFICATION_EVENT_CATEGORY, eventcategoryflags: UInt, eventcategorydata: Long, driverobject: Long, callbackroutine: DRIVER_NOTIFICATION_CALLBACK_ROUTINE, context: Long, notificationentry: Long): NTSTATUS =
    0

public actual fun IoRegisterShutdownNotification(deviceobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRegisterShutdownNotification(deviceobject.toCPointer<ByteVar>())

public actual fun IoReleaseCancelSpinLock(irql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReleaseCancelSpinLock(irql)
}

public actual fun IoReleaseRemoveLockAndWaitEx(removelock: Long, tag: Long, remlocksize: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReleaseRemoveLockAndWaitEx(removelock.toCPointer<ByteVar>(), tag.toCPointer<ByteVar>(), remlocksize)
}

public actual fun IoReleaseRemoveLockEx(removelock: Long, tag: Long, remlocksize: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReleaseRemoveLockEx(removelock.toCPointer<ByteVar>(), tag.toCPointer<ByteVar>(), remlocksize)
}

public actual fun IoRemoveLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRemoveLinkShareAccess(fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>(), linkshareaccess.toCPointer<ByteVar>())
}

public actual fun IoRemoveLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRemoveLinkShareAccessEx(fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>(), linkshareaccess.toCPointer<ByteVar>(), ioshareaccessflags)
}

public actual fun IoRemoveShareAccess(fileobject: Long, shareaccess: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRemoveShareAccess(fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>())
}

public actual fun IoReplacePartitionUnit(targetpdo: Long, sparepdo: Long, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReplacePartitionUnit(targetpdo.toCPointer<ByteVar>(), sparepdo.toCPointer<ByteVar>(), flags)

public actual fun IoReportDetectedDevice(driverobject: Long, legacybustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, resourcelist: Long, resourcerequirements: Long, resourceassigned: Boolean, deviceobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReportDetectedDevice(driverobject.toCPointer<ByteVar>(), legacybustype, busnumber, slotnumber, resourcelist.toCPointer<ByteVar>(), resourcerequirements.toCPointer<ByteVar>(), resourceassigned, deviceobject.toCPointer<ByteVar>())

public actual fun IoReportInterruptActive(parameters: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReportInterruptActive(parameters.toCPointer<ByteVar>())
}

public actual fun IoReportInterruptInactive(parameters: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReportInterruptInactive(parameters.toCPointer<ByteVar>())
}

public actual fun IoReportResourceForDetection(driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, conflictdetected: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReportResourceForDetection(driverobject.toCPointer<ByteVar>(), driverlist.toCPointer<ByteVar>(), driverlistsize, deviceobject.toCPointer<ByteVar>(), devicelist.toCPointer<ByteVar>(), devicelistsize, conflictdetected.toCPointer<ByteVar>())

public actual fun IoReportResourceUsage(driverclassname: Long, driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReportResourceUsage(driverclassname.toCPointer<ByteVar>(), driverobject.toCPointer<ByteVar>(), driverlist.toCPointer<ByteVar>(), driverlistsize, deviceobject.toCPointer<ByteVar>(), devicelist.toCPointer<ByteVar>(), devicelistsize, overrideconflict, conflictdetected.toCPointer<ByteVar>())

public actual fun IoReportRootDevice(driverobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReportRootDevice(driverobject.toCPointer<ByteVar>())

public actual fun IoReportTargetDeviceChange(physicaldeviceobject: Long, notificationstructure: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReportTargetDeviceChange(physicaldeviceobject.toCPointer<ByteVar>(), notificationstructure.toCPointer<ByteVar>())

public actual fun IoReportTargetDeviceChangeAsynchronous(physicaldeviceobject: Long, notificationstructure: Long, callback: PDEVICE_CHANGE_COMPLETE_CALLBACK, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReportTargetDeviceChangeAsynchronous(physicaldeviceobject.toCPointer<ByteVar>(), notificationstructure.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun IoRequestDeviceEject(physicaldeviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRequestDeviceEject(physicaldeviceobject.toCPointer<ByteVar>())
}

public actual fun IoRequestDeviceEjectEx(physicaldeviceobject: Long, callback: PIO_DEVICE_EJECT_CALLBACK, context: Long, driverobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoRequestDeviceEjectEx(physicaldeviceobject.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), driverobject.toCPointer<ByteVar>())

public actual fun IoReserveKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, size: ULong, flags: UInt, datahandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReserveKsrPersistentMemory(driverobject.toCPointer<ByteVar>(), physicaldeviceobject.toCPointer<ByteVar>(), size, flags, datahandle.toCPointer<ByteVar>())

public actual fun IoReserveKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: UInt, size: ULong, flags: UInt, datahandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReserveKsrPersistentMemoryEx(driverobject.toCPointer<ByteVar>(), physicaldeviceobject.toCPointer<ByteVar>(), physicaldeviceid.toCPointer<ByteVar>(), datatag.toCPointer<ByteVar>(), dataversion, size, flags, datahandle.toCPointer<ByteVar>())

public actual fun IoReuseIrp(irp: Long, iostatus: NTSTATUS) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoReuseIrp(irp.toCPointer<ByteVar>(), iostatus)
}

public actual fun IoSetActivityIdIrp(irp: Long, guid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetActivityIdIrp(irp.toCPointer<ByteVar>(), guid.toCPointer<ByteVar>())

public actual fun IoSetActivityIdThread(activityid: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetActivityIdThread(activityid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoSetCompletionRoutineEx(deviceobject: Long, irp: Long, completionroutine: PIO_COMPLETION_ROUTINE, context: Long, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): NTSTATUS =
    0

public actual fun IoSetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetDeviceInterfacePropertyData(symboliclinkname.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), lcid, flags, type, size, data.toCPointer<ByteVar>())

public actual fun IoSetDeviceInterfaceState(symboliclinkname: Long, enable: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetDeviceInterfaceState(symboliclinkname.toCPointer<ByteVar>(), enable)

public actual fun IoSetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetDevicePropertyData(pdo.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), lcid, flags, type, size, data.toCPointer<ByteVar>())

public actual fun IoSetFileObjectIgnoreSharing(fileobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetFileObjectIgnoreSharing(fileobject.toCPointer<ByteVar>())

public actual fun IoSetFileOrigin(fileobject: Long, remote: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetFileOrigin(fileobject.toCPointer<ByteVar>(), remote)

public actual fun IoSetFsZeroingOffset(irp: Long, zeroingoffset: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetFsZeroingOffset(irp.toCPointer<ByteVar>(), zeroingoffset)

public actual fun IoSetFsZeroingOffsetRequired(irp: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetFsZeroingOffsetRequired(irp.toCPointer<ByteVar>())

public actual fun IoSetHardErrorOrVerifyDevice(irp: Long, deviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetHardErrorOrVerifyDevice(irp.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>())
}

public actual fun IoSetIoAttributionIrp(irp: Long, attributionsource: Long, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetIoAttributionIrp(irp.toCPointer<ByteVar>(), attributionsource.toCPointer<ByteVar>(), flags)

public actual fun IoSetIoPriorityHint(irp: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetIoPriorityHint(irp.toCPointer<ByteVar>(), priorityhint)

public actual fun IoSetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetIrpExtraCreateParameter(irp.toCPointer<ByteVar>(), extracreateparameter.toCPointer<ByteVar>())

public actual fun IoSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetLinkShareAccess(desiredaccess, desiredshareaccess, fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>(), linkshareaccess.toCPointer<ByteVar>(), ioshareaccessflags)
}

public actual fun IoSetMasterIrpStatus(masterirp: Long, status: NTSTATUS) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetMasterIrpStatus(masterirp.toCPointer<ByteVar>(), status)
}

public actual fun IoSetPartitionInformation(deviceobject: Long, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetPartitionInformation(deviceobject.toCPointer<ByteVar>(), sectorsize, partitionnumber, partitiontype)

public actual fun IoSetPartitionInformationEx(deviceobject: Long, partitionnumber: UInt, partitioninfo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetPartitionInformationEx(deviceobject.toCPointer<ByteVar>(), partitionnumber, partitioninfo.toCPointer<ByteVar>())

public actual fun IoSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetShareAccess(desiredaccess, desiredshareaccess, fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>())
}

public actual fun IoSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, writepermission: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetShareAccessEx(desiredaccess, desiredshareaccess, fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>(), writepermission.toCPointer<ByteVar>())
}

public actual fun IoSetStartIoAttributes(deviceobject: Long, deferredstartio: Boolean, noncancelable: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetStartIoAttributes(deviceobject.toCPointer<ByteVar>(), deferredstartio, noncancelable)
}

public actual fun IoSetSystemPartition(volumenamestring: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetSystemPartition(volumenamestring.toCPointer<ByteVar>())

public actual fun IoSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetThreadHardErrorMode(enableharderrors)

public actual fun IoSetTopLevelIrp(irp: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSetTopLevelIrp(irp.toCPointer<ByteVar>())
}

public actual fun IoSizeOfIrpEx(deviceobject: Long, stacksize: Byte): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSizeOfIrpEx(deviceobject.toCPointer<ByteVar>(), stacksize)

public actual fun IoSizeofWorkItem(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSizeofWorkItem()

public actual fun IoStartNextPacket(deviceobject: Long, cancelable: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoStartNextPacket(deviceobject.toCPointer<ByteVar>(), cancelable)
}

public actual fun IoStartNextPacketByKey(deviceobject: Long, cancelable: Boolean, key: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoStartNextPacketByKey(deviceobject.toCPointer<ByteVar>(), cancelable, key)
}

public actual fun IoStartPacket(deviceobject: Long, irp: Long, key: Long, cancelfunction: DRIVER_CANCEL) {
}

public actual fun IoStartTimer(deviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoStartTimer(deviceobject.toCPointer<ByteVar>())
}

public actual fun IoStopTimer(deviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoStopTimer(deviceobject.toCPointer<ByteVar>())
}

public actual fun IoSynchronousCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoSynchronousCallDriver(deviceobject.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>())

public actual fun IoTransferActivityId(activityid: Long, relatedactivityid: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoTransferActivityId(activityid.toCPointer<ByteVar>(), relatedactivityid.toCPointer<ByteVar>())
}

public actual fun IoTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoTranslateBusAddress(interfacetype, busnumber, busaddress, addressspace.toCPointer<ByteVar>(), translatedaddress.toCPointer<ByteVar>())

public actual fun IoTryQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoTryQueueWorkItem(ioworkitem, workerroutine.toLong().toCPointer<ByteVar>(), queuetype, context.toCPointer<ByteVar>())

public actual fun IoUninitializeWorkItem(ioworkitem: PIO_WORKITEM) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoUninitializeWorkItem(ioworkitem)
}

public actual fun IoUnregisterBootDriverCallback(callbackhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoUnregisterBootDriverCallback(callbackhandle.toCPointer<ByteVar>())
}

public actual fun IoUnregisterContainerNotification(callbackregistration: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoUnregisterContainerNotification(callbackregistration.toCPointer<ByteVar>())
}

public actual fun IoUnregisterPlugPlayNotification(notificationentry: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoUnregisterPlugPlayNotification(notificationentry.toCPointer<ByteVar>())

public actual fun IoUnregisterPlugPlayNotificationEx(notificationentry: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoUnregisterPlugPlayNotificationEx(notificationentry.toCPointer<ByteVar>())

public actual fun IoUnregisterShutdownNotification(deviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoUnregisterShutdownNotification(deviceobject.toCPointer<ByteVar>())
}

public actual fun IoUpdateLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoUpdateLinkShareAccess(fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>(), linkshareaccess.toCPointer<ByteVar>())
}

public actual fun IoUpdateLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoUpdateLinkShareAccessEx(fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>(), linkshareaccess.toCPointer<ByteVar>(), ioshareaccessflags)
}

public actual fun IoUpdateShareAccess(fileobject: Long, shareaccess: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoUpdateShareAccess(fileobject.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>())
}

public actual fun IoValidateDeviceIoControlAccess(irp: Long, requiredaccess: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoValidateDeviceIoControlAccess(irp.toCPointer<ByteVar>(), requiredaccess)

public actual fun IoVerifyPartitionTable(deviceobject: Long, fixerrors: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoVerifyPartitionTable(deviceobject.toCPointer<ByteVar>(), fixerrors)

public actual fun IoVolumeDeviceNameToGuid(volumedevicename: Long, guid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceNameToGuid(volumedevicename.toCPointer<ByteVar>(), guid.toCPointer<ByteVar>())

public actual fun IoVolumeDeviceNameToGuidPath(volumedevicename: Long, guidpath: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceNameToGuidPath(volumedevicename.toCPointer<ByteVar>(), guidpath.toCPointer<ByteVar>())

public actual fun IoVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToDosName(volumedeviceobject.toCPointer<ByteVar>(), dosname.toCPointer<ByteVar>())

public actual fun IoVolumeDeviceToGuid(volumedeviceobject: Long, guid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToGuid(volumedeviceobject.toCPointer<ByteVar>(), guid.toCPointer<ByteVar>())

public actual fun IoVolumeDeviceToGuidPath(volumedeviceobject: Long, guidpath: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToGuidPath(volumedeviceobject.toCPointer<ByteVar>(), guidpath.toCPointer<ByteVar>())

public actual fun IoWMIAllocateInstanceIds(guid: Long, instancecount: UInt, firstinstanceid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIAllocateInstanceIds(guid.toCPointer<ByteVar>(), instancecount, firstinstanceid.toCPointer<ByteVar>())

public actual fun IoWMIDeviceObjectToInstanceName(datablockobject: Long, deviceobject: Long, instancename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIDeviceObjectToInstanceName(datablockobject.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>())

public actual fun IoWMIExecuteMethod(datablockobject: Long, instancename: Long, methodid: UInt, inbuffersize: UInt, outbuffersize: Long, inoutbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIExecuteMethod(datablockobject.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), methodid, inbuffersize, outbuffersize.toCPointer<ByteVar>(), inoutbuffer.toCPointer<ByteVar>())

public actual fun IoWMIHandleToInstanceName(datablockobject: Long, filehandle: HANDLE, instancename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIHandleToInstanceName(datablockobject.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>())

public actual fun IoWMIOpenBlock(guid: Long, desiredaccess: UInt, datablockobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIOpenBlock(guid.toCPointer<ByteVar>(), desiredaccess, datablockobject.toCPointer<ByteVar>())

public actual fun IoWMIQueryAllData(datablockobject: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIQueryAllData(datablockobject.toCPointer<ByteVar>(), inoutbuffersize.toCPointer<ByteVar>(), outbuffer.toCPointer<ByteVar>())

public actual fun IoWMIQueryAllDataMultiple(datablockobjectlist: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIQueryAllDataMultiple(datablockobjectlist.toCPointer<ByteVar>(), objectcount, inoutbuffersize.toCPointer<ByteVar>(), outbuffer.toCPointer<ByteVar>())

public actual fun IoWMIQuerySingleInstance(datablockobject: Long, instancename: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIQuerySingleInstance(datablockobject.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), inoutbuffersize.toCPointer<ByteVar>(), outbuffer.toCPointer<ByteVar>())

public actual fun IoWMIQuerySingleInstanceMultiple(datablockobjectlist: Long, instancenames: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIQuerySingleInstanceMultiple(datablockobjectlist.toCPointer<ByteVar>(), instancenames.toCPointer<ByteVar>(), objectcount, inoutbuffersize.toCPointer<ByteVar>(), outbuffer.toCPointer<ByteVar>())

public actual fun IoWMIRegistrationControl(deviceobject: Long, action: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIRegistrationControl(deviceobject.toCPointer<ByteVar>(), action)

public actual fun IoWMISetNotificationCallback(obj: Long, callback: WMI_NOTIFICATION_CALLBACK, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMISetNotificationCallback(obj.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun IoWMISetSingleInstance(datablockobject: Long, instancename: Long, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMISetSingleInstance(datablockobject.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), version, valuebuffersize, valuebuffer.toCPointer<ByteVar>())

public actual fun IoWMISetSingleItem(datablockobject: Long, instancename: Long, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMISetSingleItem(datablockobject.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), dataitemid, version, valuebuffersize, valuebuffer.toCPointer<ByteVar>())

public actual fun IoWMISuggestInstanceName(physicaldeviceobject: Long, symboliclinkname: Long, combinenames: Boolean, suggestedinstancename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMISuggestInstanceName(physicaldeviceobject.toCPointer<ByteVar>(), symboliclinkname.toCPointer<ByteVar>(), combinenames, suggestedinstancename.toCPointer<ByteVar>())

public actual fun IoWMIWriteEvent(wnodeeventitem: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWMIWriteEvent(wnodeeventitem.toCPointer<ByteVar>())

public actual fun IoWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWithinStackLimits(regionstart, regionsize)

public actual fun IoWriteErrorLogEntry(elentry: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWriteErrorLogEntry(elentry.toCPointer<ByteVar>())
}

public actual fun IoWriteKsrPersistentMemory(datahandle: Long, buffer: Long, size: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWriteKsrPersistentMemory(datahandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), size)

public actual fun IoWritePartitionTable(deviceobject: Long, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWritePartitionTable(deviceobject.toCPointer<ByteVar>(), sectorsize, sectorspertrack, numberofheads, partitionbuffer.toCPointer<ByteVar>())

public actual fun IoWritePartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IoWritePartitionTableEx(deviceobject.toCPointer<ByteVar>(), drivelayout.toCPointer<ByteVar>())

public actual fun IofCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IofCallDriver(deviceobject.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>())

public actual fun IofCompleteRequest(irp: Long, priorityboost: Byte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_IofCompleteRequest(irp.toCPointer<ByteVar>(), priorityboost)
}

public actual fun KdChangeOption(option: KD_OPTION, inbufferbytes: UInt, inbuffer: Long, outbufferbytes: UInt, outbuffer: Long, outbufferneeded: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KdChangeOption(option, inbufferbytes, inbuffer.toCPointer<ByteVar>(), outbufferbytes, outbuffer.toCPointer<ByteVar>(), outbufferneeded.toCPointer<ByteVar>())

public actual fun KdDisableDebugger(): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KdDisableDebugger()

public actual fun KdEnableDebugger(): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KdEnableDebugger()

public actual fun KdRefreshDebuggerNotPresent(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KdRefreshDebuggerNotPresent()

public actual fun KeAcquireGuardedMutex(mutex: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeAcquireGuardedMutex(mutex.toCPointer<ByteVar>())
}

public actual fun KeAcquireGuardedMutexUnsafe(fastmutex: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeAcquireGuardedMutexUnsafe(fastmutex.toCPointer<ByteVar>())
}

public actual fun KeAcquireInStackQueuedSpinLock(spinlock: Long, lockhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLock(spinlock.toCPointer<ByteVar>(), lockhandle.toCPointer<ByteVar>())
}

public actual fun KeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: Long, lockhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock.toCPointer<ByteVar>(), lockhandle.toCPointer<ByteVar>())
}

public actual fun KeAcquireInStackQueuedSpinLockForDpc(spinlock: Long, lockhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLockForDpc(spinlock.toCPointer<ByteVar>(), lockhandle.toCPointer<ByteVar>())
}

public actual fun KeAcquireInterruptSpinLock(interrupt: PKINTERRUPT): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeAcquireInterruptSpinLock(interrupt)

public actual fun KeAcquireSpinLockForDpc(spinlock: Long): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeAcquireSpinLockForDpc(spinlock.toCPointer<ByteVar>())

public actual fun KeAddTriageDumpDataBlock(ktriagedumpdataarray: Long, address: Long, size: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeAddTriageDumpDataBlock(ktriagedumpdataarray.toCPointer<ByteVar>(), address.toCPointer<ByteVar>(), size)

public actual fun KeAreAllApcsDisabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeAreAllApcsDisabled()

public actual fun KeAreApcsDisabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeAreApcsDisabled()

public actual fun KeBugCheck(bugcheckcode: BUGCHECK_ERROR) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeBugCheck(bugcheckcode)
}

public actual fun KeBugCheckEx(bugcheckcode: BUGCHECK_ERROR, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeBugCheckEx(bugcheckcode, bugcheckparameter1, bugcheckparameter2, bugcheckparameter3, bugcheckparameter4)
}

public actual fun KeCancelTimer(param0: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeCancelTimer(param0.toCPointer<ByteVar>())

public actual fun KeClearEvent(event: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeClearEvent(event.toCPointer<ByteVar>())
}

public actual fun KeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: Long, conversionerror: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue, performancecountervalue.toCPointer<ByteVar>(), conversionerror.toCPointer<ByteVar>())

public actual fun KeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: Long, conversionerror: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue, auxiliarycountervalue.toCPointer<ByteVar>(), conversionerror.toCPointer<ByteVar>())

public actual fun KeDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeDelayExecutionThread(waitmode, alertable, interval.toCPointer<ByteVar>())

public actual fun KeDeregisterBoundCallback(handle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeDeregisterBoundCallback(handle.toCPointer<ByteVar>())

public actual fun KeDeregisterBugCheckCallback(callbackrecord: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeDeregisterBugCheckCallback(callbackrecord.toCPointer<ByteVar>())

public actual fun KeDeregisterBugCheckReasonCallback(callbackrecord: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeDeregisterBugCheckReasonCallback(callbackrecord.toCPointer<ByteVar>())

public actual fun KeDeregisterNmiCallback(handle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeDeregisterNmiCallback(handle.toCPointer<ByteVar>())

public actual fun KeDeregisterProcessorChangeCallback(callbackhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeDeregisterProcessorChangeCallback(callbackhandle.toCPointer<ByteVar>())
}

public actual fun KeEnterCriticalRegion() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeEnterCriticalRegion()
}

public actual fun KeEnterGuardedRegion() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeEnterGuardedRegion()
}

public actual fun KeExpandKernelStackAndCallout(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeExpandKernelStackAndCallout(callout.toLong().toCPointer<ByteVar>(), parameter.toCPointer<ByteVar>(), size)

public actual fun KeExpandKernelStackAndCalloutEx(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong, wait: Boolean, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeExpandKernelStackAndCalloutEx(callout.toLong().toCPointer<ByteVar>(), parameter.toCPointer<ByteVar>(), size, wait, context.toCPointer<ByteVar>())

public actual fun KeFlushIoBuffers(mdl: Long, readoperation: Boolean, dmaoperation: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeFlushIoBuffers(mdl.toCPointer<ByteVar>(), readoperation, dmaoperation)
}

public actual fun KeFlushQueuedDpcs() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeFlushQueuedDpcs()
}

public actual fun KeFlushWriteBuffer() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeFlushWriteBuffer()
}

public actual fun KeGetCurrentIrql(): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeGetCurrentIrql()

public actual fun KeGetCurrentNodeNumber(): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeGetCurrentNodeNumber()

public actual fun KeGetCurrentProcessorNumberEx(procnumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeGetCurrentProcessorNumberEx(procnumber.toCPointer<ByteVar>())

public actual fun KeGetProcessorIndexFromNumber(procnumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeGetProcessorIndexFromNumber(procnumber.toCPointer<ByteVar>())

public actual fun KeGetProcessorNumberFromIndex(procindex: UInt, procnumber: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeGetProcessorNumberFromIndex(procindex, procnumber.toCPointer<ByteVar>())

public actual fun KeGetRecommendedSharedDataAlignment(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeGetRecommendedSharedDataAlignment()

public actual fun KeInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: Long, buffersize: UInt, bufferneeded: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInitializeCrashDumpHeader(dumptype, flags, buffer.toCPointer<ByteVar>(), buffersize, bufferneeded.toCPointer<ByteVar>())

public actual fun KeInitializeDeviceQueue(devicequeue: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInitializeDeviceQueue(devicequeue.toCPointer<ByteVar>())
}

public actual fun KeInitializeDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long) {
}

public actual fun KeInitializeEvent(event: Long, type: EVENT_TYPE, state: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInitializeEvent(event.toCPointer<ByteVar>(), type, state)
}

public actual fun KeInitializeGuardedMutex(mutex: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInitializeGuardedMutex(mutex.toCPointer<ByteVar>())
}

public actual fun KeInitializeMutex(mutex: Long, level: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInitializeMutex(mutex.toCPointer<ByteVar>(), level)
}

public actual fun KeInitializeSemaphore(semaphore: Long, count: Int, limit: Int) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInitializeSemaphore(semaphore.toCPointer<ByteVar>(), count, limit)
}

public actual fun KeInitializeSpinLock(spinlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInitializeSpinLock(spinlock.toCPointer<ByteVar>())
}

public actual fun KeInitializeThreadedDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long) {
}

public actual fun KeInitializeTimer(timer: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInitializeTimer(timer.toCPointer<ByteVar>())
}

public actual fun KeInitializeTimerEx(timer: Long, type: TIMER_TYPE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInitializeTimerEx(timer.toCPointer<ByteVar>(), type)
}

public actual fun KeInitializeTriageDumpDataArray(ktriagedumpdataarray: Long, size: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInitializeTriageDumpDataArray(ktriagedumpdataarray.toCPointer<ByteVar>(), size)

public actual fun KeInsertByKeyDeviceQueue(devicequeue: Long, devicequeueentry: Long, sortkey: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInsertByKeyDeviceQueue(devicequeue.toCPointer<ByteVar>(), devicequeueentry.toCPointer<ByteVar>(), sortkey)

public actual fun KeInsertDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInsertDeviceQueue(devicequeue.toCPointer<ByteVar>(), devicequeueentry.toCPointer<ByteVar>())

public actual fun KeInsertQueueDpc(dpc: Long, systemargument1: Long, systemargument2: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInsertQueueDpc(dpc.toCPointer<ByteVar>(), systemargument1.toCPointer<ByteVar>(), systemargument2.toCPointer<ByteVar>())

public actual fun KeInvalidateAllCaches(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInvalidateAllCaches()

public actual fun KeInvalidateRangeAllCaches(baseaddress: Long, length: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeInvalidateRangeAllCaches(baseaddress.toCPointer<ByteVar>(), length)
}

public actual fun KeIpiGenericCall(broadcastfunction: PKIPI_BROADCAST_WORKER, context: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeIpiGenericCall(broadcastfunction.toLong().toCPointer<ByteVar>(), context)

public actual fun KeIsExecutingDpc(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeIsExecutingDpc()

public actual fun KeLeaveCriticalRegion() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeLeaveCriticalRegion()
}

public actual fun KeLeaveGuardedRegion() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeLeaveGuardedRegion()
}

public actual fun KePulseEvent(event: Long, increment: Int, wait: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KePulseEvent(event.toCPointer<ByteVar>(), increment, wait)

public actual fun KeQueryActiveGroupCount(): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryActiveGroupCount()

public actual fun KeQueryActiveProcessorCount(activeprocessors: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessorCount(activeprocessors.toCPointer<ByteVar>())

public actual fun KeQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessorCountEx(groupnumber)

public actual fun KeQueryActiveProcessors(): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessors()

public actual fun KeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency.toCPointer<ByteVar>())

public actual fun KeQueryDpcWatchdogInformation(watchdoginformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryDpcWatchdogInformation(watchdoginformation.toCPointer<ByteVar>())

public actual fun KeQueryGroupAffinity(groupnumber: UShort): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryGroupAffinity(groupnumber)

public actual fun KeQueryHardwareCounterConfiguration(counterarray: Long, maximumcount: UInt, count: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryHardwareCounterConfiguration(counterarray.toCPointer<ByteVar>(), maximumcount, count.toCPointer<ByteVar>())

public actual fun KeQueryHighestNodeNumber(): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryHighestNodeNumber()

public actual fun KeQueryInterruptTimePrecise(qpctimestamp: Long): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryInterruptTimePrecise(qpctimestamp.toCPointer<ByteVar>())

public actual fun KeQueryLogicalProcessorRelationship(processornumber: Long, relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, information: Long, length: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryLogicalProcessorRelationship(processornumber.toCPointer<ByteVar>(), relationshiptype, information.toCPointer<ByteVar>(), length.toCPointer<ByteVar>())

public actual fun KeQueryMaximumGroupCount(): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryMaximumGroupCount()

public actual fun KeQueryMaximumProcessorCount(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryMaximumProcessorCount()

public actual fun KeQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryMaximumProcessorCountEx(groupnumber)

public actual fun KeQueryNodeActiveAffinity(nodenumber: UShort, affinity: Long, count: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveAffinity(nodenumber, affinity.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())
}

public actual fun KeQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: Long, groupaffinitiescount: UShort, groupaffinitiesrequired: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveAffinity2(nodenumber, groupaffinities.toCPointer<ByteVar>(), groupaffinitiescount, groupaffinitiesrequired.toCPointer<ByteVar>())

public actual fun KeQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveProcessorCount(nodenumber)

public actual fun KeQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryNodeMaximumProcessorCount(nodenumber)

public actual fun KeQueryPerformanceCounter(performancefrequency: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryPerformanceCounter(performancefrequency.toCPointer<ByteVar>())

public actual fun KeQueryPriorityThread(thread: PKTHREAD): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryPriorityThread(thread)

public actual fun KeQueryRuntimeThread(thread: PKTHREAD, usertime: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryRuntimeThread(thread, usertime.toCPointer<ByteVar>())

public actual fun KeQuerySystemTimePrecise(currenttime: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQuerySystemTimePrecise(currenttime.toCPointer<ByteVar>())
}

public actual fun KeQueryTimeIncrement(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryTimeIncrement()

public actual fun KeQueryTotalCycleTimeThread(thread: PKTHREAD, cycletimestamp: Long): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryTotalCycleTimeThread(thread, cycletimestamp.toCPointer<ByteVar>())

public actual fun KeQueryUnbiasedInterruptTime(): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryUnbiasedInterruptTime()

public actual fun KeQueryUnbiasedInterruptTimePrecise(qpctimestamp: Long): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeQueryUnbiasedInterruptTimePrecise(qpctimestamp.toCPointer<ByteVar>())

public actual fun KeReadStateEvent(event: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReadStateEvent(event.toCPointer<ByteVar>())

public actual fun KeReadStateMutex(mutex: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReadStateMutex(mutex.toCPointer<ByteVar>())

public actual fun KeReadStateSemaphore(semaphore: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReadStateSemaphore(semaphore.toCPointer<ByteVar>())

public actual fun KeReadStateTimer(timer: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReadStateTimer(timer.toCPointer<ByteVar>())

public actual fun KeRegisterBoundCallback(callbackroutine: PBOUND_CALLBACK): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRegisterBoundCallback(callbackroutine.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun KeRegisterBugCheckCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_CALLBACK_ROUTINE, buffer: Long, length: UInt, component: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRegisterBugCheckCallback(callbackrecord.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, component.toCPointer<ByteVar>())

public actual fun KeRegisterBugCheckReasonCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_REASON_CALLBACK_ROUTINE, reason: KBUGCHECK_CALLBACK_REASON, component: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRegisterBugCheckReasonCallback(callbackrecord.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), reason, component.toCPointer<ByteVar>())

public actual fun KeRegisterNmiCallback(callbackroutine: PNMI_CALLBACK, context: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRegisterNmiCallback(callbackroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun KeRegisterProcessorChangeCallback(callbackfunction: PPROCESSOR_CALLBACK_FUNCTION, callbackcontext: Long, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRegisterProcessorChangeCallback(callbackfunction.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun KeReleaseGuardedMutex(mutex: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReleaseGuardedMutex(mutex.toCPointer<ByteVar>())
}

public actual fun KeReleaseGuardedMutexUnsafe(fastmutex: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReleaseGuardedMutexUnsafe(fastmutex.toCPointer<ByteVar>())
}

public actual fun KeReleaseInStackQueuedSpinLock(lockhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLock(lockhandle.toCPointer<ByteVar>())
}

public actual fun KeReleaseInStackQueuedSpinLockForDpc(lockhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLockForDpc(lockhandle.toCPointer<ByteVar>())
}

public actual fun KeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle.toCPointer<ByteVar>())
}

public actual fun KeReleaseInterruptSpinLock(interrupt: PKINTERRUPT, oldirql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReleaseInterruptSpinLock(interrupt, oldirql)
}

public actual fun KeReleaseMutex(mutex: Long, wait: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReleaseMutex(mutex.toCPointer<ByteVar>(), wait)

public actual fun KeReleaseSemaphore(semaphore: Long, increment: Int, adjustment: Int, wait: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReleaseSemaphore(semaphore.toCPointer<ByteVar>(), increment, adjustment, wait)

public actual fun KeReleaseSpinLockForDpc(spinlock: Long, oldirql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeReleaseSpinLockForDpc(spinlock.toCPointer<ByteVar>(), oldirql)
}

public actual fun KeRemoveByKeyDeviceQueue(devicequeue: Long, sortkey: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRemoveByKeyDeviceQueue(devicequeue.toCPointer<ByteVar>(), sortkey)?.toLong() ?: 0L

public actual fun KeRemoveByKeyDeviceQueueIfBusy(devicequeue: Long, sortkey: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRemoveByKeyDeviceQueueIfBusy(devicequeue.toCPointer<ByteVar>(), sortkey)?.toLong() ?: 0L

public actual fun KeRemoveDeviceQueue(devicequeue: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRemoveDeviceQueue(devicequeue.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun KeRemoveEntryDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRemoveEntryDeviceQueue(devicequeue.toCPointer<ByteVar>(), devicequeueentry.toCPointer<ByteVar>())

public actual fun KeRemoveQueueDpc(dpc: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRemoveQueueDpc(dpc.toCPointer<ByteVar>())

public actual fun KeRemoveQueueDpcEx(dpc: Long, waitifactive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRemoveQueueDpcEx(dpc.toCPointer<ByteVar>(), waitifactive)

public actual fun KeResetEvent(event: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeResetEvent(event.toCPointer<ByteVar>())

public actual fun KeRestoreExtendedProcessorState(xstatesave: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRestoreExtendedProcessorState(xstatesave.toCPointer<ByteVar>())
}

public actual fun KeRevertToUserAffinityThread() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRevertToUserAffinityThread()
}

public actual fun KeRevertToUserAffinityThreadEx(affinity: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRevertToUserAffinityThreadEx(affinity)
}

public actual fun KeRevertToUserGroupAffinityThread(previousaffinity: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeRevertToUserGroupAffinityThread(previousaffinity.toCPointer<ByteVar>())
}

public actual fun KeSaveExtendedProcessorState(mask: ULong, xstatesave: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSaveExtendedProcessorState(mask, xstatesave.toCPointer<ByteVar>())

public actual fun KeSetBasePriorityThread(thread: PKTHREAD, increment: Int): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetBasePriorityThread(thread, increment)

public actual fun KeSetCoalescableTimer(timer: Long, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetCoalescableTimer(timer.toCPointer<ByteVar>(), duetime, period, tolerabledelay, dpc.toCPointer<ByteVar>())

public actual fun KeSetEvent(event: Long, increment: Int, wait: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetEvent(event.toCPointer<ByteVar>(), increment, wait)

public actual fun KeSetHardwareCounterConfiguration(counterarray: Long, count: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetHardwareCounterConfiguration(counterarray.toCPointer<ByteVar>(), count)

public actual fun KeSetImportanceDpc(dpc: Long, importance: KDPC_IMPORTANCE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetImportanceDpc(dpc.toCPointer<ByteVar>(), importance)
}

public actual fun KeSetPriorityThread(thread: PKTHREAD, priority: Int): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetPriorityThread(thread, priority)

public actual fun KeSetSystemAffinityThread(affinity: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetSystemAffinityThread(affinity)
}

public actual fun KeSetSystemAffinityThreadEx(affinity: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetSystemAffinityThreadEx(affinity)

public actual fun KeSetSystemGroupAffinityThread(affinity: Long, previousaffinity: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetSystemGroupAffinityThread(affinity.toCPointer<ByteVar>(), previousaffinity.toCPointer<ByteVar>())
}

public actual fun KeSetTargetProcessorDpc(dpc: Long, number: Byte) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetTargetProcessorDpc(dpc.toCPointer<ByteVar>(), number)
}

public actual fun KeSetTargetProcessorDpcEx(dpc: Long, procnumber: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetTargetProcessorDpcEx(dpc.toCPointer<ByteVar>(), procnumber.toCPointer<ByteVar>())

public actual fun KeSetTimer(timer: Long, duetime: Long, dpc: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetTimer(timer.toCPointer<ByteVar>(), duetime, dpc.toCPointer<ByteVar>())

public actual fun KeSetTimerEx(timer: Long, duetime: Long, period: Int, dpc: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSetTimerEx(timer.toCPointer<ByteVar>(), duetime, period, dpc.toCPointer<ByteVar>())

public actual fun KeShouldYieldProcessor(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeShouldYieldProcessor()

public actual fun KeStallExecutionProcessor(microseconds: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeStallExecutionProcessor(microseconds)
}

public actual fun KeSynchronizeExecution(interrupt: PKINTERRUPT, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeSynchronizeExecution(interrupt, synchronizeroutine.toLong().toCPointer<ByteVar>(), synchronizecontext.toCPointer<ByteVar>())

public actual fun KeTestSpinLock(spinlock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeTestSpinLock(spinlock.toCPointer<ByteVar>())

public actual fun KeTryToAcquireGuardedMutex(mutex: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeTryToAcquireGuardedMutex(mutex.toCPointer<ByteVar>())

public actual fun KeTryToAcquireSpinLockAtDpcLevel(spinlock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeTryToAcquireSpinLockAtDpcLevel(spinlock.toCPointer<ByteVar>())

public actual fun KeWaitForMultipleObjects(count: UInt, obj: Long, waittype: WAIT_TYPE, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long, waitblockarray: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeWaitForMultipleObjects(count, obj.toCPointer<ByteVar>(), waittype, waitreason, waitmode, alertable, timeout.toCPointer<ByteVar>(), waitblockarray.toCPointer<ByteVar>())

public actual fun KeWaitForSingleObject(obj: Long, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KeWaitForSingleObject(obj.toCPointer<ByteVar>(), waitreason, waitmode, alertable, timeout.toCPointer<ByteVar>())

public actual fun KfRaiseIrql(newirql: UByte): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_KfRaiseIrql(newirql)

public actual fun MmAddPhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAddPhysicalMemory(startaddress.toCPointer<ByteVar>(), numberofbytes.toCPointer<ByteVar>())

public actual fun MmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAddVerifierSpecialThunks(entryroutine, thunkbuffer.toCPointer<ByteVar>(), thunkbuffersize)

public actual fun MmAddVerifierThunks(thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAddVerifierThunks(thunkbuffer.toCPointer<ByteVar>(), thunkbuffersize)

public actual fun MmAdvanceMdl(mdl: Long, numberofbytes: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAdvanceMdl(mdl.toCPointer<ByteVar>(), numberofbytes)

public actual fun MmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemory(numberofbytes, highestacceptableaddress)?.toLong() ?: 0L

public actual fun MmAllocateContiguousMemoryEx(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: Long, tag: UInt, flags: UInt, baseaddress: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemoryEx(numberofbytes.toCPointer<ByteVar>(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, preferrednode, protect, partitionobject.toCPointer<ByteVar>(), tag, flags, baseaddress.toCPointer<ByteVar>())

public actual fun MmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemorySpecifyCache(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype)?.toLong() ?: 0L

public actual fun MmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE, preferrednode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemorySpecifyCacheNode(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype, preferrednode)?.toLong() ?: 0L

public actual fun MmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousNodeMemory(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, protect, preferrednode)?.toLong() ?: 0L

public actual fun MmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocateMappingAddress(numberofbytes, pooltag)?.toLong() ?: 0L

public actual fun MmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocateMappingAddressEx(numberofbytes, pooltag, flags)?.toLong() ?: 0L

public actual fun MmAllocateMdlForIoSpace(physicaladdresslist: Long, numberofentries: ULong, newmdl: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocateMdlForIoSpace(physicaladdresslist.toCPointer<ByteVar>(), numberofentries, newmdl.toCPointer<ByteVar>())

public actual fun MmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocateNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes, cachetype, idealnode, flags)?.toLong() ?: 0L

public actual fun MmAllocateNonCachedMemory(numberofbytes: ULong): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocateNonCachedMemory(numberofbytes)?.toLong() ?: 0L

public actual fun MmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocatePagesForMdl(lowaddress, highaddress, skipbytes, totalbytes)?.toLong() ?: 0L

public actual fun MmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocatePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes, cachetype, flags)?.toLong() ?: 0L

public actual fun MmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt, partitionobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAllocatePartitionNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes, cachetype, idealnode, flags, partitionobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MmAreMdlPagesCached(memorydescriptorlist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmAreMdlPagesCached(memorydescriptorlist.toCPointer<ByteVar>())

public actual fun MmBuildMdlForNonPagedPool(memorydescriptorlist: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmBuildMdlForNonPagedPool(memorydescriptorlist.toCPointer<ByteVar>())
}

public actual fun MmCopyMemory(targetaddress: Long, sourceaddress: MM_COPY_ADDRESS, numberofbytes: ULong, flags: UInt, numberofbytestransferred: Long): NTSTATUS =
    0

public actual fun MmCreateMdl(memorydescriptorlist: Long, base: Long, length: ULong): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmCreateMdl(memorydescriptorlist.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), length)?.toLong() ?: 0L

public actual fun MmCreateMirror(): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmCreateMirror()

public actual fun MmFreeContiguousMemory(baseaddress: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmFreeContiguousMemory(baseaddress.toCPointer<ByteVar>())
}

public actual fun MmFreeContiguousMemorySpecifyCache(baseaddress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmFreeContiguousMemorySpecifyCache(baseaddress.toCPointer<ByteVar>(), numberofbytes, cachetype)
}

public actual fun MmFreeMappingAddress(baseaddress: Long, pooltag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmFreeMappingAddress(baseaddress.toCPointer<ByteVar>(), pooltag)
}

public actual fun MmFreeNonCachedMemory(baseaddress: Long, numberofbytes: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmFreeNonCachedMemory(baseaddress.toCPointer<ByteVar>(), numberofbytes)
}

public actual fun MmFreePagesFromMdl(memorydescriptorlist: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmFreePagesFromMdl(memorydescriptorlist.toCPointer<ByteVar>())
}

public actual fun MmFreePagesFromMdlEx(memorydescriptorlist: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmFreePagesFromMdlEx(memorydescriptorlist.toCPointer<ByteVar>(), flags)
}

public actual fun MmGetCacheAttribute(physicaladdress: Long, cachetype: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmGetCacheAttribute(physicaladdress, cachetype.toCPointer<ByteVar>())

public actual fun MmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmGetCacheAttributeEx(physicaladdress, flags, cachetype.toCPointer<ByteVar>())

public actual fun MmGetPhysicalAddress(baseaddress: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmGetPhysicalAddress(baseaddress.toCPointer<ByteVar>())

public actual fun MmGetPhysicalMemoryRanges(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRanges()?.toLong() ?: 0L

public actual fun MmGetPhysicalMemoryRangesEx(partitionobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRangesEx(partitionobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MmGetPhysicalMemoryRangesEx2(partitionobject: Long, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRangesEx2(partitionobject.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun MmGetSystemRoutineAddress(systemroutinename: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmGetSystemRoutineAddress(systemroutinename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MmGetVirtualForPhysical(physicaladdress: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmGetVirtualForPhysical(physicaladdress)?.toLong() ?: 0L

public actual fun MmIsAddressValid(virtualaddress: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmIsAddressValid(virtualaddress.toCPointer<ByteVar>())

public actual fun MmIsDriverSuspectForVerifier(driverobject: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmIsDriverSuspectForVerifier(driverobject.toCPointer<ByteVar>())

public actual fun MmIsDriverVerifying(driverobject: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmIsDriverVerifying(driverobject.toCPointer<ByteVar>())

public actual fun MmIsDriverVerifyingByAddress(addresswithinsection: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmIsDriverVerifyingByAddress(addresswithinsection.toCPointer<ByteVar>())

public actual fun MmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmIsIoSpaceActive(startaddress, numberofbytes)

public actual fun MmIsNonPagedSystemAddressValid(virtualaddress: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmIsNonPagedSystemAddressValid(virtualaddress.toCPointer<ByteVar>())

public actual fun MmIsThisAnNtAsSystem(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmIsThisAnNtAsSystem()

public actual fun MmIsVerifierEnabled(verifierflags: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmIsVerifierEnabled(verifierflags.toCPointer<ByteVar>())

public actual fun MmLockPagableDataSection(addresswithinsection: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmLockPagableDataSection(addresswithinsection.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MmLockPagableSectionByHandle(imagesectionhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmLockPagableSectionByHandle(imagesectionhandle.toCPointer<ByteVar>())
}

public actual fun MmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapIoSpace(physicaladdress, numberofbytes, cachetype)?.toLong() ?: 0L

public actual fun MmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapIoSpaceEx(physicaladdress, numberofbytes, protect)?.toLong() ?: 0L

public actual fun MmMapLockedPages(memorydescriptorlist: Long, accessmode: Byte): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapLockedPages(memorydescriptorlist.toCPointer<ByteVar>(), accessmode)?.toLong() ?: 0L

public actual fun MmMapLockedPagesSpecifyCache(memorydescriptorlist: Long, accessmode: Byte, cachetype: MEMORY_CACHING_TYPE, requestedaddress: Long, bugcheckonfailure: UInt, priority: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapLockedPagesSpecifyCache(memorydescriptorlist.toCPointer<ByteVar>(), accessmode, cachetype, requestedaddress.toCPointer<ByteVar>(), bugcheckonfailure, priority)?.toLong() ?: 0L

public actual fun MmMapLockedPagesWithReservedMapping(mappingaddress: Long, pooltag: UInt, memorydescriptorlist: Long, cachetype: MEMORY_CACHING_TYPE): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapLockedPagesWithReservedMapping(mappingaddress.toCPointer<ByteVar>(), pooltag, memorydescriptorlist.toCPointer<ByteVar>(), cachetype)?.toLong() ?: 0L

public actual fun MmMapMdl(memorydescriptorlist: Long, protection: UInt, driverroutine: PMM_MDL_ROUTINE, drivercontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapMdl(memorydescriptorlist.toCPointer<ByteVar>(), protection, driverroutine.toLong().toCPointer<ByteVar>(), drivercontext.toCPointer<ByteVar>())

public actual fun MmMapMemoryDumpMdlEx(va: Long, pagetotal: UInt, memorydumpmdl: Long, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapMemoryDumpMdlEx(va.toCPointer<ByteVar>(), pagetotal, memorydumpmdl.toCPointer<ByteVar>(), flags)

public actual fun MmMapUserAddressesToPage(baseaddress: Long, numberofbytes: ULong, pageaddress: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapUserAddressesToPage(baseaddress.toCPointer<ByteVar>(), numberofbytes, pageaddress.toCPointer<ByteVar>())

public actual fun MmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapVideoDisplay(physicaladdress, numberofbytes, cachetype)?.toLong() ?: 0L

public actual fun MmMapViewInSessionSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapViewInSessionSpace(section.toCPointer<ByteVar>(), mappedbase.toCPointer<ByteVar>(), viewsize.toCPointer<ByteVar>())

public actual fun MmMapViewInSessionSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapViewInSessionSpaceEx(section.toCPointer<ByteVar>(), mappedbase.toCPointer<ByteVar>(), viewsize.toCPointer<ByteVar>(), sectionoffset.toCPointer<ByteVar>(), flags)

public actual fun MmMapViewInSystemSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapViewInSystemSpace(section.toCPointer<ByteVar>(), mappedbase.toCPointer<ByteVar>(), viewsize.toCPointer<ByteVar>())

public actual fun MmMapViewInSystemSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMapViewInSystemSpaceEx(section.toCPointer<ByteVar>(), mappedbase.toCPointer<ByteVar>(), viewsize.toCPointer<ByteVar>(), sectionoffset.toCPointer<ByteVar>(), flags)

public actual fun MmMdlPageContentsState(memorydescriptorlist: Long, state: MM_MDL_PAGE_CONTENTS_STATE): MM_MDL_PAGE_CONTENTS_STATE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmMdlPageContentsState(memorydescriptorlist.toCPointer<ByteVar>(), state)

public actual fun MmPageEntireDriver(addresswithinsection: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmPageEntireDriver(addresswithinsection.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MmProbeAndLockPages(memorydescriptorlist: Long, accessmode: Byte, operation: LOCK_OPERATION) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmProbeAndLockPages(memorydescriptorlist.toCPointer<ByteVar>(), accessmode, operation)
}

public actual fun MmProbeAndLockProcessPages(memorydescriptorlist: Long, process: PEPROCESS, accessmode: Byte, operation: LOCK_OPERATION) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmProbeAndLockProcessPages(memorydescriptorlist.toCPointer<ByteVar>(), process, accessmode, operation)
}

public actual fun MmProbeAndLockSelectedPages(memorydescriptorlist: Long, segmentarray: Long, accessmode: Byte, operation: LOCK_OPERATION) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmProbeAndLockSelectedPages(memorydescriptorlist.toCPointer<ByteVar>(), segmentarray.toCPointer<ByteVar>(), accessmode, operation)
}

public actual fun MmProtectDriverSection(addresswithinsection: Long, size: ULong, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmProtectDriverSection(addresswithinsection.toCPointer<ByteVar>(), size, flags)

public actual fun MmProtectMdlSystemAddress(memorydescriptorlist: Long, newprotect: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmProtectMdlSystemAddress(memorydescriptorlist.toCPointer<ByteVar>(), newprotect)

public actual fun MmQuerySystemSize(): MM_SYSTEMSIZE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmQuerySystemSize()

public actual fun MmRemovePhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmRemovePhysicalMemory(startaddress.toCPointer<ByteVar>(), numberofbytes.toCPointer<ByteVar>())

public actual fun MmResetDriverPaging(addresswithinsection: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmResetDriverPaging(addresswithinsection.toCPointer<ByteVar>())
}

public actual fun MmRotatePhysicalView(virtualaddress: Long, numberofbytes: Long, newmdl: Long, direction: MM_ROTATE_DIRECTION, copyfunction: PMM_ROTATE_COPY_CALLBACK_FUNCTION, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmRotatePhysicalView(virtualaddress.toCPointer<ByteVar>(), numberofbytes.toCPointer<ByteVar>(), newmdl.toCPointer<ByteVar>(), direction, copyfunction.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun MmSecureVirtualMemory(address: Long, size: ULong, probemode: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmSecureVirtualMemory(address.toCPointer<ByteVar>(), size, probemode)?.toLong() ?: 0L

public actual fun MmSecureVirtualMemoryEx(address: Long, size: ULong, probemode: UInt, flags: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmSecureVirtualMemoryEx(address.toCPointer<ByteVar>(), size, probemode, flags)?.toLong() ?: 0L

public actual fun MmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MEMORY_CACHING_TYPE, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmSetPermanentCacheAttribute(startaddress, numberofbytes, cachetype, flags)

public actual fun MmSizeOfMdl(base: Long, length: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmSizeOfMdl(base.toCPointer<ByteVar>(), length)

public actual fun MmUnlockPagableImageSection(imagesectionhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmUnlockPagableImageSection(imagesectionhandle.toCPointer<ByteVar>())
}

public actual fun MmUnlockPages(memorydescriptorlist: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmUnlockPages(memorydescriptorlist.toCPointer<ByteVar>())
}

public actual fun MmUnmapIoSpace(baseaddress: Long, numberofbytes: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmUnmapIoSpace(baseaddress.toCPointer<ByteVar>(), numberofbytes)
}

public actual fun MmUnmapLockedPages(baseaddress: Long, memorydescriptorlist: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmUnmapLockedPages(baseaddress.toCPointer<ByteVar>(), memorydescriptorlist.toCPointer<ByteVar>())
}

public actual fun MmUnmapReservedMapping(baseaddress: Long, pooltag: UInt, memorydescriptorlist: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmUnmapReservedMapping(baseaddress.toCPointer<ByteVar>(), pooltag, memorydescriptorlist.toCPointer<ByteVar>())
}

public actual fun MmUnmapVideoDisplay(baseaddress: Long, numberofbytes: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmUnmapVideoDisplay(baseaddress.toCPointer<ByteVar>(), numberofbytes)
}

public actual fun MmUnmapViewInSessionSpace(mappedbase: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmUnmapViewInSessionSpace(mappedbase.toCPointer<ByteVar>())

public actual fun MmUnmapViewInSystemSpace(mappedbase: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmUnmapViewInSystemSpace(mappedbase.toCPointer<ByteVar>())

public actual fun MmUnsecureVirtualMemory(securehandle: HANDLE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_MmUnsecureVirtualMemory(securehandle.toCPointer<ByteVar>())
}

public actual fun NtAllocateLocallyUniqueId(luid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtAllocateLocallyUniqueId(luid.toCPointer<ByteVar>())

public actual fun NtCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtCommitComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtCommitEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtCommitTransaction(transactionhandle.toCPointer<ByteVar>(), wait)

public actual fun NtCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtCreateEnlistment(enlistmenthandle.toCPointer<ByteVar>(), desiredaccess, resourcemanagerhandle.toCPointer<ByteVar>(), transactionhandle.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>(), createoptions, notificationmask, enlistmentkey.toCPointer<ByteVar>())

public actual fun NtCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, rmguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtCreateResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), desiredaccess, tmhandle.toCPointer<ByteVar>(), rmguid.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>(), createoptions, description.toCPointer<ByteVar>())

public actual fun NtCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtCreateTransaction(transactionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), uow.toCPointer<ByteVar>(), tmhandle.toCPointer<ByteVar>(), createoptions, isolationlevel, isolationflags, timeout.toCPointer<ByteVar>(), description.toCPointer<ByteVar>())

public actual fun NtCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtCreateTransactionManager(tmhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), logfilename.toCPointer<ByteVar>(), createoptions, commitstrength)

public actual fun NtDisplayString(string: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtDisplayString(string.toCPointer<ByteVar>())

public actual fun NtEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtEnumerateTransactionObject(rootobjecthandle.toCPointer<ByteVar>(), querytype, objectcursor.toCPointer<ByteVar>(), objectcursorlength, returnlength.toCPointer<ByteVar>())

public actual fun NtGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtGetNotificationResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), transactionnotification.toCPointer<ByteVar>(), notificationlength, timeout.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>(), asynchronous, asynchronouscontext)

public actual fun NtLoadDriver(driverservicename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtLoadDriver(driverservicename.toCPointer<ByteVar>())

public actual fun NtMakeTemporaryObject(handle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtMakeTemporaryObject(handle.toCPointer<ByteVar>())

public actual fun NtManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtManagePartition(targethandle.toCPointer<ByteVar>(), sourcehandle.toCPointer<ByteVar>(), partitioninformationclass, partitioninformation.toCPointer<ByteVar>(), partitioninformationlength)

public actual fun NtOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtOpenEnlistment(enlistmenthandle.toCPointer<ByteVar>(), desiredaccess, resourcemanagerhandle.toCPointer<ByteVar>(), enlistmentguid.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>())

public actual fun NtOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtOpenResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), desiredaccess, tmhandle.toCPointer<ByteVar>(), resourcemanagerguid.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>())

public actual fun NtOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtOpenTransaction(transactionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), uow.toCPointer<ByteVar>(), tmhandle.toCPointer<ByteVar>())

public actual fun NtOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtOpenTransactionManager(tmhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), logfilename.toCPointer<ByteVar>(), tmidentity.toCPointer<ByteVar>(), openoptions)

public actual fun NtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtPowerInformation(informationlevel, inputbuffer.toCPointer<ByteVar>(), inputbufferlength, outputbuffer.toCPointer<ByteVar>(), outputbufferlength)

public actual fun NtPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtPrePrepareComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtPrePrepareEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtPrepareComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtPrepareEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtPropagationComplete(resourcemanagerhandle.toCPointer<ByteVar>(), requestcookie, bufferlength, buffer.toCPointer<ByteVar>())

public actual fun NtPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtPropagationFailed(resourcemanagerhandle.toCPointer<ByteVar>(), requestcookie, propstatus)

public actual fun NtQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtQueryInformationEnlistment(enlistmenthandle.toCPointer<ByteVar>(), enlistmentinformationclass, enlistmentinformation.toCPointer<ByteVar>(), enlistmentinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun NtQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtQueryInformationResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), resourcemanagerinformationclass, resourcemanagerinformation.toCPointer<ByteVar>(), resourcemanagerinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun NtQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtQueryInformationTransaction(transactionhandle.toCPointer<ByteVar>(), transactioninformationclass, transactioninformation.toCPointer<ByteVar>(), transactioninformationlength, returnlength.toCPointer<ByteVar>())

public actual fun NtQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtQueryInformationTransactionManager(transactionmanagerhandle.toCPointer<ByteVar>(), transactionmanagerinformationclass, transactionmanagerinformation.toCPointer<ByteVar>(), transactionmanagerinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun NtReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtReadOnlyEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtRecoverEnlistment(enlistmenthandle.toCPointer<ByteVar>(), enlistmentkey.toCPointer<ByteVar>())

public actual fun NtRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtRecoverResourceManager(resourcemanagerhandle.toCPointer<ByteVar>())

public actual fun NtRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtRecoverTransactionManager(transactionmanagerhandle.toCPointer<ByteVar>())

public actual fun NtRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtRegisterProtocolAddressInformation(resourcemanager.toCPointer<ByteVar>(), protocolid.toCPointer<ByteVar>(), protocolinformationsize, protocolinformation.toCPointer<ByteVar>(), createoptions)

public actual fun NtRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtRenameTransactionManager(logfilename.toCPointer<ByteVar>(), existingtransactionmanagerguid.toCPointer<ByteVar>())

public actual fun NtRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtRollbackComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtRollbackEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtRollbackTransaction(transactionhandle.toCPointer<ByteVar>(), wait)

public actual fun NtRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtRollforwardTransactionManager(transactionmanagerhandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtSetInformationEnlistment(enlistmenthandle.toCPointer<ByteVar>(), enlistmentinformationclass, enlistmentinformation.toCPointer<ByteVar>(), enlistmentinformationlength)

public actual fun NtSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtSetInformationResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), resourcemanagerinformationclass, resourcemanagerinformation.toCPointer<ByteVar>(), resourcemanagerinformationlength)

public actual fun NtSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtSetInformationTransaction(transactionhandle.toCPointer<ByteVar>(), transactioninformationclass, transactioninformation.toCPointer<ByteVar>(), transactioninformationlength)

public actual fun NtSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtSetInformationTransactionManager(tmhandle.toCPointer<ByteVar>(), transactionmanagerinformationclass, transactionmanagerinformation.toCPointer<ByteVar>(), transactionmanagerinformationlength)

public actual fun NtSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtSinglePhaseReject(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun NtUnloadDriver(driverservicename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_NtUnloadDriver(driverservicename.toCPointer<ByteVar>())

public actual fun ObCloseHandle(handle: HANDLE, previousmode: Byte): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObCloseHandle(handle.toCPointer<ByteVar>(), previousmode)

public actual fun ObDereferenceObjectDeferDelete(obj: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObDereferenceObjectDeferDelete(obj.toCPointer<ByteVar>())
}

public actual fun ObDereferenceObjectDeferDeleteWithTag(obj: Long, tag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObDereferenceObjectDeferDeleteWithTag(obj.toCPointer<ByteVar>(), tag)
}

public actual fun ObGetFilterVersion(): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObGetFilterVersion()

public actual fun ObGetObjectSecurity(obj: Long, securitydescriptor: Long, memoryallocated: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObGetObjectSecurity(obj.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), memoryallocated.toCPointer<ByteVar>())

public actual fun ObReferenceObjectByHandle(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, obj: Long, handleinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByHandle(handle.toCPointer<ByteVar>(), desiredaccess, objecttype, accessmode, obj.toCPointer<ByteVar>(), handleinformation.toCPointer<ByteVar>())

public actual fun ObReferenceObjectByHandleWithTag(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, obj: Long, handleinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByHandleWithTag(handle.toCPointer<ByteVar>(), desiredaccess, objecttype, accessmode, tag, obj.toCPointer<ByteVar>(), handleinformation.toCPointer<ByteVar>())

public actual fun ObReferenceObjectByPointer(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByPointer(obj.toCPointer<ByteVar>(), desiredaccess, objecttype, accessmode)

public actual fun ObReferenceObjectByPointerWithTag(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByPointerWithTag(obj.toCPointer<ByteVar>(), desiredaccess, objecttype, accessmode, tag)

public actual fun ObReferenceObjectSafe(obj: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObReferenceObjectSafe(obj.toCPointer<ByteVar>())

public actual fun ObReferenceObjectSafeWithTag(obj: Long, tag: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObReferenceObjectSafeWithTag(obj.toCPointer<ByteVar>(), tag)

public actual fun ObRegisterCallbacks(callbackregistration: Long, registrationhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObRegisterCallbacks(callbackregistration.toCPointer<ByteVar>(), registrationhandle.toCPointer<ByteVar>())

public actual fun ObReleaseObjectSecurity(securitydescriptor: PSECURITY_DESCRIPTOR, memoryallocated: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObReleaseObjectSecurity(securitydescriptor.toCPointer<ByteVar>(), memoryallocated)
}

public actual fun ObUnRegisterCallbacks(registrationhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObUnRegisterCallbacks(registrationhandle.toCPointer<ByteVar>())
}

public actual fun ObfDereferenceObject(obj: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObfDereferenceObject(obj.toCPointer<ByteVar>())

public actual fun ObfDereferenceObjectWithTag(obj: Long, tag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObfDereferenceObjectWithTag(obj.toCPointer<ByteVar>(), tag)

public actual fun ObfReferenceObject(obj: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObfReferenceObject(obj.toCPointer<ByteVar>())

public actual fun ObfReferenceObjectWithTag(obj: Long, tag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ObfReferenceObjectWithTag(obj.toCPointer<ByteVar>(), tag)

public actual fun PcwAddInstance(buffer: PPCW_BUFFER, name: Long, id: UInt, count: UInt, data: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PcwAddInstance(buffer, name.toCPointer<ByteVar>(), id, count, data.toCPointer<ByteVar>())

public actual fun PcwCloseInstance(instance: PPCW_INSTANCE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PcwCloseInstance(instance)
}

public actual fun PcwCreateInstance(instance: Long, registration: PPCW_REGISTRATION, name: Long, count: UInt, data: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PcwCreateInstance(instance.toCPointer<ByteVar>(), registration, name.toCPointer<ByteVar>(), count, data.toCPointer<ByteVar>())

public actual fun PcwRegister(registration: Long, info: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PcwRegister(registration.toCPointer<ByteVar>(), info.toCPointer<ByteVar>())

public actual fun PcwUnregister(registration: PPCW_REGISTRATION) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PcwUnregister(registration)
}

public actual fun PoCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoCallDriver(deviceobject.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>())

public actual fun PoClearPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoClearPowerRequest(powerrequest.toCPointer<ByteVar>(), type)

public actual fun PoCreatePowerRequest(powerrequest: Long, deviceobject: Long, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoCreatePowerRequest(powerrequest.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun PoCreateThermalRequest(thermalrequest: Long, targetdeviceobject: Long, policydeviceobject: Long, context: Long, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoCreateThermalRequest(thermalrequest.toCPointer<ByteVar>(), targetdeviceobject.toCPointer<ByteVar>(), policydeviceobject.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), flags)

public actual fun PoDeletePowerRequest(powerrequest: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoDeletePowerRequest(powerrequest.toCPointer<ByteVar>())
}

public actual fun PoDeleteThermalRequest(thermalrequest: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoDeleteThermalRequest(thermalrequest.toCPointer<ByteVar>())
}

public actual fun PoEndDeviceBusy(idlepointer: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoEndDeviceBusy(idlepointer.toCPointer<ByteVar>())
}

public actual fun PoFxActivateComponent(handle: POHANDLE, component: UInt, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxActivateComponent(handle.toCPointer<ByteVar>(), component, flags)
}

public actual fun PoFxCompleteDevicePowerNotRequired(handle: POHANDLE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxCompleteDevicePowerNotRequired(handle.toCPointer<ByteVar>())
}

public actual fun PoFxCompleteDirectedPowerDown(handle: POHANDLE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxCompleteDirectedPowerDown(handle.toCPointer<ByteVar>())
}

public actual fun PoFxCompleteIdleCondition(handle: POHANDLE, component: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxCompleteIdleCondition(handle.toCPointer<ByteVar>(), component)
}

public actual fun PoFxCompleteIdleState(handle: POHANDLE, component: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxCompleteIdleState(handle.toCPointer<ByteVar>(), component)
}

public actual fun PoFxIdleComponent(handle: POHANDLE, component: UInt, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxIdleComponent(handle.toCPointer<ByteVar>(), component, flags)
}

public actual fun PoFxIssueComponentPerfStateChange(handle: POHANDLE, flags: UInt, component: UInt, perfchange: Long, context: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxIssueComponentPerfStateChange(handle.toCPointer<ByteVar>(), flags, component, perfchange.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())
}

public actual fun PoFxIssueComponentPerfStateChangeMultiple(handle: POHANDLE, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: Long, context: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxIssueComponentPerfStateChangeMultiple(handle.toCPointer<ByteVar>(), flags, component, perfchangescount, perfchanges.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())
}

public actual fun PoFxNotifySurprisePowerOn(pdo: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxNotifySurprisePowerOn(pdo.toCPointer<ByteVar>())
}

public actual fun PoFxPowerControl(handle: POHANDLE, powercontrolcode: Long, inbuffer: Long, inbuffersize: ULong, outbuffer: Long, outbuffersize: ULong, bytesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxPowerControl(handle.toCPointer<ByteVar>(), powercontrolcode.toCPointer<ByteVar>(), inbuffer.toCPointer<ByteVar>(), inbuffersize, outbuffer.toCPointer<ByteVar>(), outbuffersize, bytesreturned.toCPointer<ByteVar>())

public actual fun PoFxPowerOnCrashdumpDevice(handle: POHANDLE, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxPowerOnCrashdumpDevice(handle.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun PoFxQueryCurrentComponentPerfState(handle: POHANDLE, flags: UInt, component: UInt, setindex: UInt, currentperf: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxQueryCurrentComponentPerfState(handle.toCPointer<ByteVar>(), flags, component, setindex, currentperf.toCPointer<ByteVar>())

public actual fun PoFxRegisterComponentPerfStates(handle: POHANDLE, component: UInt, flags: ULong, componentperfstatecallback: PPO_FX_COMPONENT_PERF_STATE_CALLBACK, inputstateinfo: Long, outputstateinfo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxRegisterComponentPerfStates(handle.toCPointer<ByteVar>(), component, flags, componentperfstatecallback.toLong().toCPointer<ByteVar>(), inputstateinfo.toCPointer<ByteVar>(), outputstateinfo.toCPointer<ByteVar>())

public actual fun PoFxRegisterCrashdumpDevice(handle: POHANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxRegisterCrashdumpDevice(handle.toCPointer<ByteVar>())

public actual fun PoFxRegisterDevice(pdo: Long, device: Long, handle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxRegisterDevice(pdo.toCPointer<ByteVar>(), device.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun PoFxRegisterDripsWatchdogCallback(handle: POHANDLE, callback: PPO_FX_DRIPS_WATCHDOG_CALLBACK, includechilddevices: Boolean, matchingdriverobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxRegisterDripsWatchdogCallback(handle.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), includechilddevices, matchingdriverobject.toCPointer<ByteVar>())
}

public actual fun PoFxReportDevicePoweredOn(handle: POHANDLE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxReportDevicePoweredOn(handle.toCPointer<ByteVar>())
}

public actual fun PoFxSetComponentLatency(handle: POHANDLE, component: UInt, latency: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxSetComponentLatency(handle.toCPointer<ByteVar>(), component, latency)
}

public actual fun PoFxSetComponentResidency(handle: POHANDLE, component: UInt, residency: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxSetComponentResidency(handle.toCPointer<ByteVar>(), component, residency)
}

public actual fun PoFxSetComponentWake(handle: POHANDLE, component: UInt, wakehint: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxSetComponentWake(handle.toCPointer<ByteVar>(), component, wakehint)
}

public actual fun PoFxSetDeviceIdleTimeout(handle: POHANDLE, idletimeout: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxSetDeviceIdleTimeout(handle.toCPointer<ByteVar>(), idletimeout)
}

public actual fun PoFxSetTargetDripsDevicePowerState(handle: POHANDLE, targetstate: DEVICE_POWER_STATE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxSetTargetDripsDevicePowerState(handle.toCPointer<ByteVar>(), targetstate)

public actual fun PoFxStartDevicePowerManagement(handle: POHANDLE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxStartDevicePowerManagement(handle.toCPointer<ByteVar>())
}

public actual fun PoFxUnregisterDevice(handle: POHANDLE) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoFxUnregisterDevice(handle.toCPointer<ByteVar>())
}

public actual fun PoGetSystemWake(irp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoGetSystemWake(irp.toCPointer<ByteVar>())

public actual fun PoGetThermalRequestSupport(thermalrequest: Long, type: PO_THERMAL_REQUEST_TYPE): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoGetThermalRequestSupport(thermalrequest.toCPointer<ByteVar>(), type)

public actual fun PoQueryWatchdogTime(pdo: Long, secondsremaining: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoQueryWatchdogTime(pdo.toCPointer<ByteVar>(), secondsremaining.toCPointer<ByteVar>())

public actual fun PoRegisterDeviceForIdleDetection(deviceobject: Long, conservationidletime: UInt, performanceidletime: UInt, state: DEVICE_POWER_STATE): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoRegisterDeviceForIdleDetection(deviceobject.toCPointer<ByteVar>(), conservationidletime, performanceidletime, state)?.toLong() ?: 0L

public actual fun PoRegisterPowerSettingCallback(deviceobject: Long, settingguid: Long, callback: PPOWER_SETTING_CALLBACK, context: Long, handle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoRegisterPowerSettingCallback(deviceobject.toCPointer<ByteVar>(), settingguid.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun PoRegisterSystemState(statehandle: Long, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoRegisterSystemState(statehandle.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun PoRequestPowerIrp(deviceobject: Long, minorfunction: UByte, powerstate: POWER_STATE, completionfunction: PREQUEST_POWER_COMPLETE, context: Long, irp: Long): NTSTATUS =
    0

public actual fun PoSetDeviceBusyEx(idlepointer: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoSetDeviceBusyEx(idlepointer.toCPointer<ByteVar>())
}

public actual fun PoSetHiberRange(memorymap: Long, flags: UInt, address: Long, length: ULong, tag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoSetHiberRange(memorymap.toCPointer<ByteVar>(), flags, address.toCPointer<ByteVar>(), length, tag)
}

public actual fun PoSetPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoSetPowerRequest(powerrequest.toCPointer<ByteVar>(), type)

public actual fun PoSetPowerState(deviceobject: Long, type: POWER_STATE_TYPE, state: POWER_STATE): POWER_STATE =
    POWER_STATE()

public actual fun PoSetSystemState(flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoSetSystemState(flags)
}

public actual fun PoSetSystemWake(irp: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoSetSystemWake(irp.toCPointer<ByteVar>())
}

public actual fun PoSetSystemWakeDevice(deviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoSetSystemWakeDevice(deviceobject.toCPointer<ByteVar>())
}

public actual fun PoSetThermalActiveCooling(thermalrequest: Long, engaged: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoSetThermalActiveCooling(thermalrequest.toCPointer<ByteVar>(), engaged)

public actual fun PoSetThermalPassiveCooling(thermalrequest: Long, throttle: UByte): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoSetThermalPassiveCooling(thermalrequest.toCPointer<ByteVar>(), throttle)

public actual fun PoStartDeviceBusy(idlepointer: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoStartDeviceBusy(idlepointer.toCPointer<ByteVar>())
}

public actual fun PoStartNextPowerIrp(irp: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoStartNextPowerIrp(irp.toCPointer<ByteVar>())
}

public actual fun PoUnregisterPowerSettingCallback(handle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoUnregisterPowerSettingCallback(handle.toCPointer<ByteVar>())

public actual fun PoUnregisterSystemState(statehandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PoUnregisterSystemState(statehandle.toCPointer<ByteVar>())
}

public actual fun ProbeForRead(address: Long, length: ULong, alignment: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ProbeForRead(address.toCPointer<ByteVar>(), length, alignment)
}

public actual fun ProbeForWrite(address: Long, length: ULong, alignment: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ProbeForWrite(address.toCPointer<ByteVar>(), length, alignment)
}

public actual fun PsAcquireSiloHardReference(silo: PESILO): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsAcquireSiloHardReference(silo)

public actual fun PsAllocSiloContextSlot(reserved: ULong, returnedcontextslot: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsAllocSiloContextSlot(reserved, returnedcontextslot.toCPointer<ByteVar>())

public actual fun PsAllocateAffinityToken(affinitytoken: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsAllocateAffinityToken(affinitytoken.toCPointer<ByteVar>())

public actual fun PsAttachSiloToCurrentThread(silo: PESILO): PESILO =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsAttachSiloToCurrentThread(silo)

public actual fun PsCreateSiloContext(silo: PESILO, size: UInt, pooltype: POOL_TYPE, contextcleanupcallback: SILO_CONTEXT_CLEANUP_CALLBACK, returnedsilocontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsCreateSiloContext(silo, size, pooltype, contextcleanupcallback.toLong().toCPointer<ByteVar>(), returnedsilocontext.toCPointer<ByteVar>())

public actual fun PsCreateSystemThread(threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsCreateSystemThread(threadhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), processhandle.toCPointer<ByteVar>(), clientid.toCPointer<ByteVar>(), startroutine.toLong().toCPointer<ByteVar>(), startcontext.toCPointer<ByteVar>())

public actual fun PsDereferenceSiloContext(silocontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsDereferenceSiloContext(silocontext.toCPointer<ByteVar>())
}

public actual fun PsDetachSiloFromCurrentThread(previoussilo: PESILO) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsDetachSiloFromCurrentThread(previoussilo)
}

public actual fun PsFreeAffinityToken(affinitytoken: PAFFINITY_TOKEN) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsFreeAffinityToken(affinitytoken)
}

public actual fun PsFreeSiloContextSlot(contextslot: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsFreeSiloContextSlot(contextslot)

public actual fun PsGetCurrentProcessId(): HANDLE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetCurrentProcessId()?.toLong() ?: 0L

public actual fun PsGetCurrentServerSilo(): PESILO =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetCurrentServerSilo()

public actual fun PsGetCurrentServerSiloName(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetCurrentServerSiloName()?.toLong() ?: 0L

public actual fun PsGetCurrentSilo(): PESILO =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetCurrentSilo()

public actual fun PsGetCurrentThreadId(): HANDLE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetCurrentThreadId()?.toLong() ?: 0L

public actual fun PsGetCurrentThreadTeb(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetCurrentThreadTeb()?.toLong() ?: 0L

public actual fun PsGetEffectiveServerSilo(silo: PESILO): PESILO =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetEffectiveServerSilo(silo)

public actual fun PsGetHostSilo(): PESILO =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetHostSilo()

public actual fun PsGetJobServerSilo(job: PEJOB, serversilo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetJobServerSilo(job, serversilo.toCPointer<ByteVar>())

public actual fun PsGetJobSilo(job: PEJOB, silo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetJobSilo(job, silo.toCPointer<ByteVar>())

public actual fun PsGetParentSilo(job: PEJOB): PESILO =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetParentSilo(job)

public actual fun PsGetPermanentSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetPermanentSiloContext(silo, contextslot, returnedsilocontext.toCPointer<ByteVar>())

public actual fun PsGetProcessCreateTimeQuadPart(process: PEPROCESS): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetProcessCreateTimeQuadPart(process)

public actual fun PsGetProcessExitStatus(process: PEPROCESS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetProcessExitStatus(process)

public actual fun PsGetProcessId(process: PEPROCESS): HANDLE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetProcessId(process)?.toLong() ?: 0L

public actual fun PsGetProcessStartKey(process: PEPROCESS): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetProcessStartKey(process)

public actual fun PsGetServerSiloServiceSessionId(silo: PESILO): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetServerSiloServiceSessionId(silo)

public actual fun PsGetSiloContainerId(silo: PESILO): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetSiloContainerId(silo)?.toLong() ?: 0L

public actual fun PsGetSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetSiloContext(silo, contextslot, returnedsilocontext.toCPointer<ByteVar>())

public actual fun PsGetSiloMonitorContextSlot(monitor: PSILO_MONITOR): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetSiloMonitorContextSlot(monitor)

public actual fun PsGetThreadCreateTime(thread: PETHREAD): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetThreadCreateTime(thread)

public actual fun PsGetThreadExitStatus(thread: PETHREAD): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetThreadExitStatus(thread)

public actual fun PsGetThreadId(thread: PETHREAD): HANDLE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetThreadId(thread)?.toLong() ?: 0L

public actual fun PsGetThreadProcessId(thread: PETHREAD): HANDLE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetThreadProcessId(thread)?.toLong() ?: 0L

public actual fun PsGetThreadProperty(thread: PETHREAD, key: ULong, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetThreadProperty(thread, key, flags)?.toLong() ?: 0L

public actual fun PsGetThreadServerSilo(thread: PETHREAD): PESILO =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetThreadServerSilo(thread)

public actual fun PsGetVersion(majorversion: Long, minorversion: Long, buildnumber: Long, csdversion: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsGetVersion(majorversion.toCPointer<ByteVar>(), minorversion.toCPointer<ByteVar>(), buildnumber.toCPointer<ByteVar>(), csdversion.toCPointer<ByteVar>())

public actual fun PsInsertPermanentSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsInsertPermanentSiloContext(silo, contextslot, silocontext.toCPointer<ByteVar>())

public actual fun PsInsertSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsInsertSiloContext(silo, contextslot, silocontext.toCPointer<ByteVar>())

public actual fun PsIsCurrentThreadInServerSilo(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsIsCurrentThreadInServerSilo()

public actual fun PsIsCurrentThreadPrefetching(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsIsCurrentThreadPrefetching()

public actual fun PsIsHostSilo(silo: PESILO): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsIsHostSilo(silo)

public actual fun PsMakeSiloContextPermanent(silo: PESILO, contextslot: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsMakeSiloContextPermanent(silo, contextslot)

public actual fun PsQueryTotalCycleTimeProcess(process: PEPROCESS, cycletimestamp: Long): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsQueryTotalCycleTimeProcess(process, cycletimestamp.toCPointer<ByteVar>())

public actual fun PsReferenceSiloContext(silocontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsReferenceSiloContext(silocontext.toCPointer<ByteVar>())
}

public actual fun PsRegisterSiloMonitor(registration: Long, returnedmonitor: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsRegisterSiloMonitor(registration.toCPointer<ByteVar>(), returnedmonitor.toCPointer<ByteVar>())

public actual fun PsReleaseSiloHardReference(silo: PESILO) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsReleaseSiloHardReference(silo)
}

public actual fun PsRemoveCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsRemoveCreateThreadNotifyRoutine(notifyroutine.toLong().toCPointer<ByteVar>())

public actual fun PsRemoveLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsRemoveLoadImageNotifyRoutine(notifyroutine.toLong().toCPointer<ByteVar>())

public actual fun PsRemoveSiloContext(silo: PESILO, contextslot: UInt, removedsilocontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsRemoveSiloContext(silo, contextslot, removedsilocontext.toCPointer<ByteVar>())

public actual fun PsReplaceSiloContext(silo: PESILO, contextslot: UInt, newsilocontext: Long, oldsilocontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsReplaceSiloContext(silo, contextslot, newsilocontext.toCPointer<ByteVar>(), oldsilocontext.toCPointer<ByteVar>())

public actual fun PsRevertToUserMultipleGroupAffinityThread(affinitytoken: PAFFINITY_TOKEN) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsRevertToUserMultipleGroupAffinityThread(affinitytoken)
}

public actual fun PsSetCreateProcessNotifyRoutine(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE, remove: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutine(notifyroutine.toLong().toCPointer<ByteVar>(), remove)

public actual fun PsSetCreateProcessNotifyRoutineEx(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE_EX, remove: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutineEx(notifyroutine.toLong().toCPointer<ByteVar>(), remove)

public actual fun PsSetCreateProcessNotifyRoutineEx2(notifytype: PSCREATEPROCESSNOTIFYTYPE, notifyinformation: Long, remove: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutineEx2(notifytype, notifyinformation.toCPointer<ByteVar>(), remove)

public actual fun PsSetCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsSetCreateThreadNotifyRoutine(notifyroutine.toLong().toCPointer<ByteVar>())

public actual fun PsSetCreateThreadNotifyRoutineEx(notifytype: PSCREATETHREADNOTIFYTYPE, notifyinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsSetCreateThreadNotifyRoutineEx(notifytype, notifyinformation.toCPointer<ByteVar>())

public actual fun PsSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsSetCurrentThreadPrefetching(prefetching)

public actual fun PsSetLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsSetLoadImageNotifyRoutine(notifyroutine.toLong().toCPointer<ByteVar>())

public actual fun PsSetLoadImageNotifyRoutineEx(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE, flags: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsSetLoadImageNotifyRoutineEx(notifyroutine.toLong().toCPointer<ByteVar>(), flags)

public actual fun PsSetSystemMultipleGroupAffinityThread(groupaffinities: Long, groupcount: UShort, affinitytoken: PAFFINITY_TOKEN): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsSetSystemMultipleGroupAffinityThread(groupaffinities.toCPointer<ByteVar>(), groupcount, affinitytoken)

public actual fun PsStartSiloMonitor(monitor: PSILO_MONITOR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsStartSiloMonitor(monitor)

public actual fun PsTerminateServerSilo(serversilo: PESILO, exitstatus: NTSTATUS) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsTerminateServerSilo(serversilo, exitstatus)
}

public actual fun PsTerminateSystemThread(exitstatus: NTSTATUS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsTerminateSystemThread(exitstatus)

public actual fun PsUnregisterSiloMonitor(monitor: PSILO_MONITOR) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsUnregisterSiloMonitor(monitor)
}

public actual fun PsWrapApcWow64Thread(apccontext: Long, apcroutine: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PsWrapApcWow64Thread(apccontext.toCPointer<ByteVar>(), apcroutine.toCPointer<ByteVar>())

public actual fun PshedAllocateMemory(size: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PshedAllocateMemory(size)?.toLong() ?: 0L

public actual fun PshedFreeMemory(address: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PshedFreeMemory(address.toCPointer<ByteVar>())
}

public actual fun PshedIsSystemWheaEnabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PshedIsSystemWheaEnabled()

public actual fun PshedRegisterPlugin(packet: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PshedRegisterPlugin(packet.toCPointer<ByteVar>())

public actual fun PshedSynchronizeExecution(errorsource: Long, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PshedSynchronizeExecution(errorsource.toCPointer<ByteVar>(), synchronizeroutine.toLong().toCPointer<ByteVar>(), synchronizecontext.toCPointer<ByteVar>())

public actual fun PshedUnregisterPlugin(pluginhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_PshedUnregisterPlugin(pluginhandle.toCPointer<ByteVar>())
}

public actual fun RtlAppendUnicodeStringToString(destination: Long, source: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlAppendUnicodeStringToString(destination.toCPointer<ByteVar>(), source.toCPointer<ByteVar>())

public actual fun RtlAppendUnicodeToString(destination: Long, source: PCWSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlAppendUnicodeToString(destination.toCPointer<ByteVar>(), source.toCPointer<ByteVar>())

public actual fun RtlAreBitsClear(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlAreBitsClear(bitmapheader.toCPointer<ByteVar>(), startingindex, length)

public actual fun RtlAreBitsSet(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlAreBitsSet(bitmapheader.toCPointer<ByteVar>(), startingindex, length)

public actual fun RtlAssert(voidfailedassertion: Long, voidfilename: Long, linenumber: UInt, mutablemessage: PCSTR) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlAssert(voidfailedassertion.toCPointer<ByteVar>(), voidfilename.toCPointer<ByteVar>(), linenumber, mutablemessage.toCPointer<ByteVar>())
}

public actual fun RtlCheckRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCheckRegistryKey(relativeto, path.toCPointer<ByteVar>())

public actual fun RtlClearAllBits(bitmapheader: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlClearAllBits(bitmapheader.toCPointer<ByteVar>())
}

public actual fun RtlClearBit(bitmapheader: Long, bitnumber: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlClearBit(bitmapheader.toCPointer<ByteVar>(), bitnumber)
}

public actual fun RtlClearBits(bitmapheader: Long, startingindex: UInt, numbertoclear: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlClearBits(bitmapheader.toCPointer<ByteVar>(), startingindex, numbertoclear)
}

public actual fun RtlCmDecodeMemIoResource(descriptor: Long, start: Long): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCmDecodeMemIoResource(descriptor.toCPointer<ByteVar>(), start.toCPointer<ByteVar>())

public actual fun RtlCmEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, start: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCmEncodeMemIoResource(descriptor.toCPointer<ByteVar>(), type, length, start)

public actual fun RtlCompareString(string1: Long, string2: Long, caseinsensitive: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCompareString(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>(), caseinsensitive)

public actual fun RtlCompareUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCompareUnicodeString(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>(), caseinsensitive)

public actual fun RtlCompareUnicodeStrings(string1: Long, string1length: ULong, string2: Long, string2length: ULong, caseinsensitive: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCompareUnicodeStrings(string1.toCPointer<ByteVar>(), string1length, string2.toCPointer<ByteVar>(), string2length, caseinsensitive)

public actual fun RtlContractHashTable(hashtable: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlContractHashTable(hashtable.toCPointer<ByteVar>())

public actual fun RtlCopyBitMap(source: Long, destination: Long, targetbit: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCopyBitMap(source.toCPointer<ByteVar>(), destination.toCPointer<ByteVar>(), targetbit)
}

public actual fun RtlCopyString(destinationstring: Long, sourcestring: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCopyString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())
}

public actual fun RtlCopyUnicodeString(destinationstring: Long, sourcestring: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCopyUnicodeString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())
}

public actual fun RtlCreateHashTable(hashtable: Long, shift: UInt, flags: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCreateHashTable(hashtable.toCPointer<ByteVar>(), shift, flags)

public actual fun RtlCreateHashTableEx(hashtable: Long, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCreateHashTableEx(hashtable.toCPointer<ByteVar>(), initialsize, shift, flags)

public actual fun RtlCreateRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCreateRegistryKey(relativeto, path.toCPointer<ByteVar>())

public actual fun RtlCreateSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, revision: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlCreateSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), revision)

public actual fun RtlDelete(links: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlDelete(links.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlDeleteElementGenericTable(table: Long, buffer: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTable(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun RtlDeleteElementGenericTableAvl(table: Long, buffer: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTableAvl(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun RtlDeleteElementGenericTableAvlEx(table: Long, nodeorparent: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTableAvlEx(table.toCPointer<ByteVar>(), nodeorparent.toCPointer<ByteVar>())
}

public actual fun RtlDeleteHashTable(hashtable: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlDeleteHashTable(hashtable.toCPointer<ByteVar>())
}

public actual fun RtlDeleteNoSplay(links: Long, root: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlDeleteNoSplay(links.toCPointer<ByteVar>(), root.toCPointer<ByteVar>())
}

public actual fun RtlDeleteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlDeleteRegistryValue(relativeto, path.toCPointer<ByteVar>(), valuename.toCPointer<ByteVar>())

public actual fun RtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlDowncaseUnicodeChar(sourcecharacter)

public actual fun RtlEndEnumerationHashTable(hashtable: Long, enumerator: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEndEnumerationHashTable(hashtable.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>())
}

public actual fun RtlEndStrongEnumerationHashTable(hashtable: Long, enumerator: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEndStrongEnumerationHashTable(hashtable.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>())
}

public actual fun RtlEndWeakEnumerationHashTable(hashtable: Long, enumerator: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEndWeakEnumerationHashTable(hashtable.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>())
}

public actual fun RtlEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEnumerateEntryHashTable(hashtable.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlEnumerateGenericTable(table: Long, restart: Boolean): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTable(table.toCPointer<ByteVar>(), restart)?.toLong() ?: 0L

public actual fun RtlEnumerateGenericTableAvl(table: Long, restart: Boolean): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableAvl(table.toCPointer<ByteVar>(), restart)?.toLong() ?: 0L

public actual fun RtlEnumerateGenericTableLikeADirectory(table: Long, matchfunction: PRTL_AVL_MATCH_FUNCTION, matchdata: Long, nextflag: UInt, restartkey: Long, deletecount: Long, buffer: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableLikeADirectory(table.toCPointer<ByteVar>(), matchfunction.toLong().toCPointer<ByteVar>(), matchdata.toCPointer<ByteVar>(), nextflag, restartkey.toCPointer<ByteVar>(), deletecount.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlEnumerateGenericTableWithoutSplaying(table: Long, restartkey: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableWithoutSplaying(table.toCPointer<ByteVar>(), restartkey.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlEnumerateGenericTableWithoutSplayingAvl(table: Long, restartkey: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableWithoutSplayingAvl(table.toCPointer<ByteVar>(), restartkey.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlEqualString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEqualString(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>(), caseinsensitive)

public actual fun RtlEqualUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlEqualUnicodeString(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>(), caseinsensitive)

public actual fun RtlExpandHashTable(hashtable: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlExpandHashTable(hashtable.toCPointer<ByteVar>())

public actual fun RtlExtractBitMap(source: Long, destination: Long, targetbit: UInt, numberofbits: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlExtractBitMap(source.toCPointer<ByteVar>(), destination.toCPointer<ByteVar>(), targetbit, numberofbits)
}

public actual fun RtlFindClearBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindClearBits(bitmapheader.toCPointer<ByteVar>(), numbertofind, hintindex)

public actual fun RtlFindClearBitsAndSet(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindClearBitsAndSet(bitmapheader.toCPointer<ByteVar>(), numbertofind, hintindex)

public actual fun RtlFindClearRuns(bitmapheader: Long, runarray: Long, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindClearRuns(bitmapheader.toCPointer<ByteVar>(), runarray.toCPointer<ByteVar>(), sizeofrunarray, locatelongestruns)

public actual fun RtlFindClosestEncodableLength(sourcelength: ULong, targetlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindClosestEncodableLength(sourcelength, targetlength.toCPointer<ByteVar>())

public actual fun RtlFindFirstRunClear(bitmapheader: Long, startingindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindFirstRunClear(bitmapheader.toCPointer<ByteVar>(), startingindex.toCPointer<ByteVar>())

public actual fun RtlFindLastBackwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindLastBackwardRunClear(bitmapheader.toCPointer<ByteVar>(), fromindex, startingrunindex.toCPointer<ByteVar>())

public actual fun RtlFindLeastSignificantBit(set: ULong): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindLeastSignificantBit(set)

public actual fun RtlFindLongestRunClear(bitmapheader: Long, startingindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindLongestRunClear(bitmapheader.toCPointer<ByteVar>(), startingindex.toCPointer<ByteVar>())

public actual fun RtlFindMostSignificantBit(set: ULong): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindMostSignificantBit(set)

public actual fun RtlFindNextForwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindNextForwardRunClear(bitmapheader.toCPointer<ByteVar>(), fromindex, startingrunindex.toCPointer<ByteVar>())

public actual fun RtlFindSetBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindSetBits(bitmapheader.toCPointer<ByteVar>(), numbertofind, hintindex)

public actual fun RtlFindSetBitsAndClear(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFindSetBitsAndClear(bitmapheader.toCPointer<ByteVar>(), numbertofind, hintindex)

public actual fun RtlFreeUTF8String(utf8string: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlFreeUTF8String(utf8string.toCPointer<ByteVar>())
}

public actual fun RtlGUIDFromString(guidstring: Long, guid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGUIDFromString(guidstring.toCPointer<ByteVar>(), guid.toCPointer<ByteVar>())

public actual fun RtlGenerateClass5Guid(namespaceguid: Long, buffer: Long, buffersize: UInt, guid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGenerateClass5Guid(namespaceguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize, guid.toCPointer<ByteVar>())

public actual fun RtlGetActiveConsoleId(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetActiveConsoleId()

public actual fun RtlGetCallersAddress(callersaddress: Long, callerscaller: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetCallersAddress(callersaddress.toCPointer<ByteVar>(), callerscaller.toCPointer<ByteVar>())
}

public actual fun RtlGetConsoleSessionForegroundProcessId(): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetConsoleSessionForegroundProcessId()

public actual fun RtlGetElementGenericTable(table: Long, i: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetElementGenericTable(table.toCPointer<ByteVar>(), i)?.toLong() ?: 0L

public actual fun RtlGetElementGenericTableAvl(table: Long, i: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetElementGenericTableAvl(table.toCPointer<ByteVar>(), i)?.toLong() ?: 0L

public actual fun RtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetEnabledExtendedFeatures(featuremask)

public actual fun RtlGetNextEntryHashTable(hashtable: Long, context: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetNextEntryHashTable(hashtable.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlGetNtProductType(ntproducttype: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetNtProductType(ntproducttype.toCPointer<ByteVar>())

public actual fun RtlGetNtSystemRoot(): PCWSTR =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetNtSystemRoot()?.toLong() ?: 0L

public actual fun RtlGetPersistedStateLocation(sourceid: PCWSTR, customvalue: PCWSTR, defaultpath: PCWSTR, statelocationtype: STATE_LOCATION_TYPE, targetpath: PWSTR, bufferlengthin: UInt, bufferlengthout: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetPersistedStateLocation(sourceid.toCPointer<ByteVar>(), customvalue.toCPointer<ByteVar>(), defaultpath.toCPointer<ByteVar>(), statelocationtype, targetpath.toCPointer<ByteVar>(), bufferlengthin, bufferlengthout.toCPointer<ByteVar>())

public actual fun RtlGetSuiteMask(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetSuiteMask()

public actual fun RtlGetVersion(lpversioninformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlGetVersion(lpversioninformation.toCPointer<ByteVar>())

public actual fun RtlHashUnicodeString(string: Long, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlHashUnicodeString(string.toCPointer<ByteVar>(), caseinsensitive, hashalgorithm, hashvalue.toCPointer<ByteVar>())

public actual fun RtlInitEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInitEnumerationHashTable(hashtable.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>())

public actual fun RtlInitStrongEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInitStrongEnumerationHashTable(hashtable.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>())

public actual fun RtlInitUTF8String(destinationstring: Long, sourcestring: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInitUTF8String(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())
}

public actual fun RtlInitUTF8StringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInitUTF8StringEx(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())

public actual fun RtlInitWeakEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInitWeakEnumerationHashTable(hashtable.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>())

public actual fun RtlInitializeBitMap(bitmapheader: Long, bitmapbuffer: Long, sizeofbitmap: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInitializeBitMap(bitmapheader.toCPointer<ByteVar>(), bitmapbuffer.toCPointer<ByteVar>(), sizeofbitmap)
}

public actual fun RtlInitializeGenericTable(table: Long, compareroutine: PRTL_GENERIC_COMPARE_ROUTINE, allocateroutine: PRTL_GENERIC_ALLOCATE_ROUTINE, freeroutine: PRTL_GENERIC_FREE_ROUTINE, tablecontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInitializeGenericTable(table.toCPointer<ByteVar>(), compareroutine.toLong().toCPointer<ByteVar>(), allocateroutine.toLong().toCPointer<ByteVar>(), freeroutine.toLong().toCPointer<ByteVar>(), tablecontext.toCPointer<ByteVar>())
}

public actual fun RtlInitializeGenericTableAvl(table: Long, compareroutine: PRTL_AVL_COMPARE_ROUTINE, allocateroutine: PRTL_AVL_ALLOCATE_ROUTINE, freeroutine: PRTL_AVL_FREE_ROUTINE, tablecontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInitializeGenericTableAvl(table.toCPointer<ByteVar>(), compareroutine.toLong().toCPointer<ByteVar>(), allocateroutine.toLong().toCPointer<ByteVar>(), freeroutine.toLong().toCPointer<ByteVar>(), tablecontext.toCPointer<ByteVar>())
}

public actual fun RtlInsertElementGenericTable(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTable(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize, newelement.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlInsertElementGenericTableAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableAvl(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize, newelement.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlInsertElementGenericTableFull(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableFull(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize, newelement.toCPointer<ByteVar>(), nodeorparent.toCPointer<ByteVar>(), searchresult)?.toLong() ?: 0L

public actual fun RtlInsertElementGenericTableFullAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableFullAvl(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize, newelement.toCPointer<ByteVar>(), nodeorparent.toCPointer<ByteVar>(), searchresult)?.toLong() ?: 0L

public actual fun RtlInsertEntryHashTable(hashtable: Long, entry: Long, signature: ULong, context: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInsertEntryHashTable(hashtable.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), signature, context.toCPointer<ByteVar>())

public actual fun RtlInt64ToUnicodeString(value: ULong, base: UInt, string: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlInt64ToUnicodeString(value, base, string.toCPointer<ByteVar>())

public actual fun RtlIntegerToUnicodeString(value: UInt, base: UInt, string: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIntegerToUnicodeString(value, base, string.toCPointer<ByteVar>())

public actual fun RtlIoDecodeMemIoResource(descriptor: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIoDecodeMemIoResource(descriptor.toCPointer<ByteVar>(), alignment.toCPointer<ByteVar>(), minimumaddress.toCPointer<ByteVar>(), maximumaddress.toCPointer<ByteVar>())

public actual fun RtlIoEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIoEncodeMemIoResource(descriptor.toCPointer<ByteVar>(), type, length, alignment, minimumaddress, maximumaddress)

public actual fun RtlIsApiSetImplemented(apisetname: PCSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIsApiSetImplemented(apisetname.toCPointer<ByteVar>())

public actual fun RtlIsGenericTableEmpty(table: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIsGenericTableEmpty(table.toCPointer<ByteVar>())

public actual fun RtlIsGenericTableEmptyAvl(table: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIsGenericTableEmptyAvl(table.toCPointer<ByteVar>())

public actual fun RtlIsMultiSessionSku(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIsMultiSessionSku()

public actual fun RtlIsMultiUsersInSessionSku(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIsMultiUsersInSessionSku()

public actual fun RtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIsNtDdiVersionAvailable(version)

public actual fun RtlIsServicePackVersionInstalled(version: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIsServicePackVersionInstalled(version)

public actual fun RtlIsStateSeparationEnabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIsStateSeparationEnabled()

public actual fun RtlIsUntrustedObject(handle: HANDLE, obj: Long, untrustedobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlIsUntrustedObject(handle.toCPointer<ByteVar>(), obj.toCPointer<ByteVar>(), untrustedobject.toCPointer<ByteVar>())

public actual fun RtlLengthSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlLengthSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>())

public actual fun RtlLookupElementGenericTable(table: Long, buffer: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTable(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlLookupElementGenericTableAvl(table: Long, buffer: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableAvl(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlLookupElementGenericTableFull(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableFull(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), nodeorparent.toCPointer<ByteVar>(), searchresult.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlLookupElementGenericTableFullAvl(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableFullAvl(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), nodeorparent.toCPointer<ByteVar>(), searchresult.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlLookupEntryHashTable(hashtable: Long, signature: ULong, context: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlLookupEntryHashTable(hashtable.toCPointer<ByteVar>(), signature, context.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlLookupFirstMatchingElementGenericTableAvl(table: Long, buffer: Long, restartkey: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlLookupFirstMatchingElementGenericTableAvl(table.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), restartkey.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlMapGenericMask(accessmask: Long, genericmapping: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlMapGenericMask(accessmask.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>())
}

public actual fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlNormalizeSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), securitydescriptorlength, newsecuritydescriptor.toCPointer<ByteVar>(), newsecuritydescriptorlength.toCPointer<ByteVar>(), checkonly)

public actual fun RtlNumberGenericTableElements(table: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlNumberGenericTableElements(table.toCPointer<ByteVar>())

public actual fun RtlNumberGenericTableElementsAvl(table: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlNumberGenericTableElementsAvl(table.toCPointer<ByteVar>())

public actual fun RtlNumberOfClearBits(bitmapheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlNumberOfClearBits(bitmapheader.toCPointer<ByteVar>())

public actual fun RtlNumberOfClearBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlNumberOfClearBitsInRange(bitmapheader.toCPointer<ByteVar>(), startingindex, length)

public actual fun RtlNumberOfSetBits(bitmapheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBits(bitmapheader.toCPointer<ByteVar>())

public actual fun RtlNumberOfSetBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBitsInRange(bitmapheader.toCPointer<ByteVar>(), startingindex, length)

public actual fun RtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBitsUlongPtr(target)

public actual fun RtlPrefetchMemoryNonTemporal(source: Long, length: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlPrefetchMemoryNonTemporal(source.toCPointer<ByteVar>(), length)
}

public actual fun RtlPrefixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlPrefixUnicodeString(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>(), caseinsensitive)

public actual fun RtlQueryRegistryValueWithFallback(primaryhandle: HANDLE, fallbackhandle: HANDLE, valuename: Long, valuelength: UInt, valuetype: Long, valuedata: Long, resultlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlQueryRegistryValueWithFallback(primaryhandle.toCPointer<ByteVar>(), fallbackhandle.toCPointer<ByteVar>(), valuename.toCPointer<ByteVar>(), valuelength, valuetype.toCPointer<ByteVar>(), valuedata.toCPointer<ByteVar>(), resultlength.toCPointer<ByteVar>())

public actual fun RtlQueryRegistryValues(relativeto: UInt, path: PCWSTR, querytable: Long, context: Long, environment: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlQueryRegistryValues(relativeto, path.toCPointer<ByteVar>(), querytable.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), environment.toCPointer<ByteVar>())

public actual fun RtlQueryValidationRunlevel(componentname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlQueryValidationRunlevel(componentname.toCPointer<ByteVar>())

public actual fun RtlRealPredecessor(links: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlRealPredecessor(links.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlRealSuccessor(links: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlRealSuccessor(links.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlRemoveEntryHashTable(hashtable: Long, entry: Long, context: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlRemoveEntryHashTable(hashtable.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun RtlRunOnceBeginInitialize(runonce: Long, flags: UInt, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlRunOnceBeginInitialize(runonce.toCPointer<ByteVar>(), flags, context.toCPointer<ByteVar>())

public actual fun RtlRunOnceComplete(runonce: Long, flags: UInt, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlRunOnceComplete(runonce.toCPointer<ByteVar>(), flags, context.toCPointer<ByteVar>())

public actual fun RtlRunOnceExecuteOnce(runonce: Long, initfn: PRTL_RUN_ONCE_INIT_FN, parameter: Long, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlRunOnceExecuteOnce(runonce.toCPointer<ByteVar>(), initfn.toLong().toCPointer<ByteVar>(), parameter.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun RtlRunOnceInitialize(runonce: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlRunOnceInitialize(runonce.toCPointer<ByteVar>())
}

public actual fun RtlSetAllBits(bitmapheader: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlSetAllBits(bitmapheader.toCPointer<ByteVar>())
}

public actual fun RtlSetBit(bitmapheader: Long, bitnumber: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlSetBit(bitmapheader.toCPointer<ByteVar>(), bitnumber)
}

public actual fun RtlSetBits(bitmapheader: Long, startingindex: UInt, numbertoset: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlSetBits(bitmapheader.toCPointer<ByteVar>(), startingindex, numbertoset)
}

public actual fun RtlSetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Boolean, dacl: Long, dacldefaulted: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlSetDaclSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), daclpresent, dacl.toCPointer<ByteVar>(), dacldefaulted)

public actual fun RtlSetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlSetSystemGlobalData(dataid, buffer.toCPointer<ByteVar>(), size)

public actual fun RtlSplay(links: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlSplay(links.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlStringFromGUID(guid: Long, guidstring: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlStringFromGUID(guid.toCPointer<ByteVar>(), guidstring.toCPointer<ByteVar>())

public actual fun RtlStronglyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlStronglyEnumerateEntryHashTable(hashtable.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlSubtreePredecessor(links: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlSubtreePredecessor(links.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlSubtreeSuccessor(links: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlSubtreeSuccessor(links.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlSuffixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlSuffixUnicodeString(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>(), caseinsensitive)

public actual fun RtlTestBit(bitmapheader: Long, bitnumber: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlTestBit(bitmapheader.toCPointer<ByteVar>(), bitnumber)

public actual fun RtlTimeFieldsToTime(timefields: Long, time: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlTimeFieldsToTime(timefields.toCPointer<ByteVar>(), time.toCPointer<ByteVar>())

public actual fun RtlTimeToTimeFields(time: Long, timefields: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlTimeToTimeFields(time.toCPointer<ByteVar>(), timefields.toCPointer<ByteVar>())
}

public actual fun RtlUTF8StringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlUTF8StringToUnicodeString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlUTF8ToUnicodeN(unicodestringdestination: PWSTR, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: Long, utf8stringsource: PCSTR, utf8stringbytecount: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlUTF8ToUnicodeN(unicodestringdestination.toCPointer<ByteVar>(), unicodestringmaxbytecount, unicodestringactualbytecount.toCPointer<ByteVar>(), utf8stringsource.toCPointer<ByteVar>(), utf8stringbytecount)

public actual fun RtlUnicodeStringToInt64(string: Long, base: UInt, number: Long, endpointer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToInt64(string.toCPointer<ByteVar>(), base, number.toCPointer<ByteVar>(), endpointer.toCPointer<ByteVar>())

public actual fun RtlUnicodeStringToInteger(string: Long, base: UInt, value: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToInteger(string.toCPointer<ByteVar>(), base, value.toCPointer<ByteVar>())

public actual fun RtlUnicodeStringToUTF8String(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToUTF8String(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlUnicodeToUTF8N(utf8stringdestination: PSTR, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: Long, unicodestringsource: Long, unicodestringbytecount: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlUnicodeToUTF8N(utf8stringdestination.toCPointer<ByteVar>(), utf8stringmaxbytecount, utf8stringactualbytecount.toCPointer<ByteVar>(), unicodestringsource.toCPointer<ByteVar>(), unicodestringbytecount)

public actual fun RtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlUpcaseUnicodeChar(sourcecharacter)

public actual fun RtlUpcaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlUpcaseUnicodeString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlUpperChar(character: Byte): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlUpperChar(character)

public actual fun RtlUpperString(destinationstring: Long, sourcestring: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlUpperString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())
}

public actual fun RtlValidRelativeSecurityDescriptor(securitydescriptorinput: PSECURITY_DESCRIPTOR, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlValidRelativeSecurityDescriptor(securitydescriptorinput.toCPointer<ByteVar>(), securitydescriptorlength, requiredinformation)

public actual fun RtlValidSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlValidSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>())

public actual fun RtlVerifyVersionInfo(versioninfo: Long, typemask: UInt, conditionmask: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlVerifyVersionInfo(versioninfo.toCPointer<ByteVar>(), typemask, conditionmask)

public actual fun RtlVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlVolumeDeviceToDosName(volumedeviceobject.toCPointer<ByteVar>(), dosname.toCPointer<ByteVar>())

public actual fun RtlWalkFrameChain(callers: Long, count: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlWalkFrameChain(callers.toCPointer<ByteVar>(), count, flags)

public actual fun RtlWeaklyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlWeaklyEnumerateEntryHashTable(hashtable.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlWriteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuelength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlWriteRegistryValue(relativeto, path.toCPointer<ByteVar>(), valuename.toCPointer<ByteVar>(), valuetype, valuedata.toCPointer<ByteVar>(), valuelength)

public actual fun RtlxAnsiStringToUnicodeSize(ansistring: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlxAnsiStringToUnicodeSize(ansistring.toCPointer<ByteVar>())

public actual fun RtlxUnicodeStringToAnsiSize(unicodestring: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_RtlxUnicodeStringToAnsiSize(unicodestring.toCPointer<ByteVar>())

public actual fun SeAccessCheck(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeAccessCheck(securitydescriptor.toCPointer<ByteVar>(), subjectsecuritycontext.toCPointer<ByteVar>(), subjectcontextlocked, desiredaccess, previouslygrantedaccess, privileges.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>(), accessmode, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>())

public actual fun SeAssignSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: Boolean, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeAssignSecurity(parentdescriptor.toCPointer<ByteVar>(), explicitdescriptor.toCPointer<ByteVar>(), newdescriptor.toCPointer<ByteVar>(), isdirectoryobject, subjectcontext.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>(), pooltype)

public actual fun SeAssignSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeAssignSecurityEx(parentdescriptor.toCPointer<ByteVar>(), explicitdescriptor.toCPointer<ByteVar>(), newdescriptor.toCPointer<ByteVar>(), objecttype.toCPointer<ByteVar>(), isdirectoryobject, autoinheritflags, subjectcontext.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>(), pooltype)

public actual fun SeCaptureSubjectContext(subjectcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeCaptureSubjectContext(subjectcontext.toCPointer<ByteVar>())
}

public actual fun SeComputeAutoInheritByObjectType(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, parentsecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeComputeAutoInheritByObjectType(objecttype.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), parentsecuritydescriptor.toCPointer<ByteVar>())

public actual fun SeDeassignSecurity(securitydescriptor: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeDeassignSecurity(securitydescriptor.toCPointer<ByteVar>())

public actual fun SeEtwWriteKMCveEvent(cveid: Long, additionaldetails: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeEtwWriteKMCveEvent(cveid.toCPointer<ByteVar>(), additionaldetails.toCPointer<ByteVar>())

public actual fun SeLockSubjectContext(subjectcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeLockSubjectContext(subjectcontext.toCPointer<ByteVar>())
}

public actual fun SeRegisterImageVerificationCallback(imagetype: SE_IMAGE_TYPE, callbacktype: SE_IMAGE_VERIFICATION_CALLBACK_TYPE, callbackfunction: PSE_IMAGE_VERIFICATION_CALLBACK_FUNCTION, callbackcontext: Long, token: Long, callbackhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeRegisterImageVerificationCallback(imagetype, callbacktype, callbackfunction.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), callbackhandle.toCPointer<ByteVar>())

public actual fun SeReleaseSubjectContext(subjectcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeReleaseSubjectContext(subjectcontext.toCPointer<ByteVar>())
}

public actual fun SeReportSecurityEvent(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeReportSecurityEvent(flags, sourcename.toCPointer<ByteVar>(), usersid.toCPointer<ByteVar>(), auditparameters.toCPointer<ByteVar>())

public actual fun SeSetAuditParameter(auditparameters: Long, type: SE_ADT_PARAMETER_TYPE, index: UInt, data: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeSetAuditParameter(auditparameters.toCPointer<ByteVar>(), type, index, data.toCPointer<ByteVar>())

public actual fun SeSinglePrivilegeCheck(privilegevalue: LUID, previousmode: Byte): Boolean =
    false

public actual fun SeUnlockSubjectContext(subjectcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeUnlockSubjectContext(subjectcontext.toCPointer<ByteVar>())
}

public actual fun SeUnregisterImageVerificationCallback(callbackhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeUnregisterImageVerificationCallback(callbackhandle.toCPointer<ByteVar>())
}

public actual fun SeValidSecurityDescriptor(length: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_SeValidSecurityDescriptor(length, securitydescriptor.toCPointer<ByteVar>())

public actual fun TmCommitComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmCommitComplete(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun TmCommitEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmCommitEnlistment(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun TmCommitTransaction(transaction: Long, wait: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmCommitTransaction(transaction.toCPointer<ByteVar>(), wait)

public actual fun TmCreateEnlistment(enlistmenthandle: Long, previousmode: Byte, desiredaccess: UInt, objectattributes: Long, resourcemanager: Long, transaction: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmCreateEnlistment(enlistmenthandle.toCPointer<ByteVar>(), previousmode, desiredaccess, objectattributes.toCPointer<ByteVar>(), resourcemanager.toCPointer<ByteVar>(), transaction.toCPointer<ByteVar>(), createoptions, notificationmask, enlistmentkey.toCPointer<ByteVar>())

public actual fun TmDereferenceEnlistmentKey(enlistment: Long, lastreference: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmDereferenceEnlistmentKey(enlistment.toCPointer<ByteVar>(), lastreference.toCPointer<ByteVar>())

public actual fun TmEnableCallbacks(resourcemanager: Long, callbackroutine: PTM_RM_NOTIFICATION, rmkey: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmEnableCallbacks(resourcemanager.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), rmkey.toCPointer<ByteVar>())

public actual fun TmGetTransactionId(transaction: Long, transactionid: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmGetTransactionId(transaction.toCPointer<ByteVar>(), transactionid.toCPointer<ByteVar>())
}

public actual fun TmInitializeTransactionManager(transactionmanager: Long, logfilename: Long, tmid: Long, createoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmInitializeTransactionManager(transactionmanager.toCPointer<ByteVar>(), logfilename.toCPointer<ByteVar>(), tmid.toCPointer<ByteVar>(), createoptions)

public actual fun TmIsTransactionActive(transaction: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmIsTransactionActive(transaction.toCPointer<ByteVar>())

public actual fun TmPrePrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmPrePrepareComplete(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun TmPrePrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmPrePrepareEnlistment(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun TmPrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmPrepareComplete(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun TmPrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmPrepareEnlistment(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun TmPropagationComplete(resourcemanager: Long, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmPropagationComplete(resourcemanager.toCPointer<ByteVar>(), requestcookie, bufferlength, buffer.toCPointer<ByteVar>())

public actual fun TmPropagationFailed(resourcemanager: Long, requestcookie: UInt, status: NTSTATUS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmPropagationFailed(resourcemanager.toCPointer<ByteVar>(), requestcookie, status)

public actual fun TmReadOnlyEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmReadOnlyEnlistment(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun TmRecoverEnlistment(enlistment: Long, enlistmentkey: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmRecoverEnlistment(enlistment.toCPointer<ByteVar>(), enlistmentkey.toCPointer<ByteVar>())

public actual fun TmRecoverResourceManager(resourcemanager: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmRecoverResourceManager(resourcemanager.toCPointer<ByteVar>())

public actual fun TmRecoverTransactionManager(tm: Long, targetvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmRecoverTransactionManager(tm.toCPointer<ByteVar>(), targetvirtualclock.toCPointer<ByteVar>())

public actual fun TmReferenceEnlistmentKey(enlistment: Long, key: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmReferenceEnlistmentKey(enlistment.toCPointer<ByteVar>(), key.toCPointer<ByteVar>())

public actual fun TmRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmRenameTransactionManager(logfilename.toCPointer<ByteVar>(), existingtransactionmanagerguid.toCPointer<ByteVar>())

public actual fun TmRequestOutcomeEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmRequestOutcomeEnlistment(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun TmRollbackComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmRollbackComplete(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun TmRollbackEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmRollbackEnlistment(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun TmRollbackTransaction(transaction: Long, wait: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmRollbackTransaction(transaction.toCPointer<ByteVar>(), wait)

public actual fun TmSinglePhaseReject(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_TmSinglePhaseReject(enlistment.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun VslCreateSecureSection(handle: Long, targetprocess: PEPROCESS, mdl: Long, devicepageprotection: UInt, attributes: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_VslCreateSecureSection(handle.toCPointer<ByteVar>(), targetprocess, mdl.toCPointer<ByteVar>(), devicepageprotection, attributes)

public actual fun VslDeleteSecureSection(globalhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_VslDeleteSecureSection(globalhandle.toCPointer<ByteVar>())

public actual fun WheaAddErrorSource(errorsource: Long, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaAddErrorSource(errorsource.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun WheaAddErrorSourceDeviceDriver(context: Long, configuration: Long, numberpreallocatederrorreports: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaAddErrorSourceDeviceDriver(context.toCPointer<ByteVar>(), configuration.toCPointer<ByteVar>(), numberpreallocatederrorreports)

public actual fun WheaAddErrorSourceDeviceDriverV1(context: Long, configuration: Long, numbufferstopreallocate: UInt, maxdatalength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaAddErrorSourceDeviceDriverV1(context.toCPointer<ByteVar>(), configuration.toCPointer<ByteVar>(), numbufferstopreallocate, maxdatalength)

public actual fun WheaAddHwErrorReportSectionDeviceDriver(errorhandle: Long, sectiondatalength: UInt, bufferset: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaAddHwErrorReportSectionDeviceDriver(errorhandle.toCPointer<ByteVar>(), sectiondatalength, bufferset.toCPointer<ByteVar>())

public actual fun WheaConfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE, configuration: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaConfigureErrorSource(sourcetype, configuration.toCPointer<ByteVar>())

public actual fun WheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaCreateHwErrorReportDeviceDriver(errorsourceid, deviceobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun WheaErrorSourceGetState(errorsourceid: UInt): WHEA_ERROR_SOURCE_STATE =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaErrorSourceGetState(errorsourceid)

public actual fun WheaGetNotifyAllOfflinesPolicy(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaGetNotifyAllOfflinesPolicy()

public actual fun WheaHighIrqlLogSelEventHandlerRegister(handler: PFN_WHEA_HIGH_IRQL_LOG_SEL_EVENT_HANDLER, context: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaHighIrqlLogSelEventHandlerRegister(handler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun WheaHighIrqlLogSelEventHandlerUnregister() {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaHighIrqlLogSelEventHandlerUnregister()
}

public actual fun WheaHwErrorReportAbandonDeviceDriver(errorhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportAbandonDeviceDriver(errorhandle.toCPointer<ByteVar>())

public actual fun WheaHwErrorReportSetSectionNameDeviceDriver(bufferset: Long, namelength: UInt, name: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSetSectionNameDeviceDriver(bufferset.toCPointer<ByteVar>(), namelength, name.toCPointer<ByteVar>())

public actual fun WheaHwErrorReportSetSeverityDeviceDriver(errorhandle: Long, errorseverity: WHEA_ERROR_SEVERITY): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSetSeverityDeviceDriver(errorhandle.toCPointer<ByteVar>(), errorseverity)

public actual fun WheaHwErrorReportSubmitDeviceDriver(errorhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSubmitDeviceDriver(errorhandle.toCPointer<ByteVar>())

public actual fun WheaInitializeRecordHeader(header: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaInitializeRecordHeader(header.toCPointer<ByteVar>())

public actual fun WheaIsCriticalState(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaIsCriticalState()

public actual fun WheaLogInternalEvent(entry: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaLogInternalEvent(entry.toCPointer<ByteVar>())
}

public actual fun WheaRegisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaRegisterInUsePageOfflineNotification(callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun WheaRemoveErrorSource(errorsourceid: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaRemoveErrorSource(errorsourceid)
}

public actual fun WheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaRemoveErrorSourceDeviceDriver(errorsourceid)

public actual fun WheaReportHwError(errorpacket: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaReportHwError(errorpacket.toCPointer<ByteVar>())

public actual fun WheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: Long, errordata: Long, errordatalength: UInt, sectiontypeguid: Long, errorseverity: WHEA_ERROR_SEVERITY, devicefriendlyname: PCSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaReportHwErrorDeviceDriver(errorsourceid, deviceobject.toCPointer<ByteVar>(), errordata.toCPointer<ByteVar>(), errordatalength, sectiontypeguid.toCPointer<ByteVar>(), errorseverity, devicefriendlyname.toCPointer<ByteVar>())

public actual fun WheaUnconfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaUnconfigureErrorSource(sourcetype)

public actual fun WheaUnregisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WheaUnregisterInUsePageOfflineNotification(callback.toLong().toCPointer<ByteVar>())

public actual fun WmiQueryTraceInformation(traceinformationclass: TRACE_INFORMATION_CLASS, traceinformation: Long, traceinformationlength: UInt, requiredlength: Long, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_WmiQueryTraceInformation(traceinformationclass, traceinformation.toCPointer<ByteVar>(), traceinformationlength, requiredlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun ZwAllocateLocallyUniqueId(luid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwAllocateLocallyUniqueId(luid.toCPointer<ByteVar>())

public actual fun ZwClose(handle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwClose(handle.toCPointer<ByteVar>())

public actual fun ZwCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwCommitComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwCommitEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwCommitTransaction(transactionhandle.toCPointer<ByteVar>(), wait)

public actual fun ZwCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwCreateEnlistment(enlistmenthandle.toCPointer<ByteVar>(), desiredaccess, resourcemanagerhandle.toCPointer<ByteVar>(), transactionhandle.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>(), createoptions, notificationmask, enlistmentkey.toCPointer<ByteVar>())

public actual fun ZwCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwCreateFile(filehandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), allocationsize.toCPointer<ByteVar>(), fileattributes, shareaccess, createdisposition, createoptions, eabuffer.toCPointer<ByteVar>(), ealength)

public actual fun ZwCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwCreateResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), desiredaccess, tmhandle.toCPointer<ByteVar>(), resourcemanagerguid.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>(), createoptions, description.toCPointer<ByteVar>())

public actual fun ZwCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwCreateSection(sectionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), maximumsize.toCPointer<ByteVar>(), sectionpageprotection, allocationattributes, filehandle.toCPointer<ByteVar>())

public actual fun ZwCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwCreateTransaction(transactionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), uow.toCPointer<ByteVar>(), tmhandle.toCPointer<ByteVar>(), createoptions, isolationlevel, isolationflags, timeout.toCPointer<ByteVar>(), description.toCPointer<ByteVar>())

public actual fun ZwCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwCreateTransactionManager(tmhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), logfilename.toCPointer<ByteVar>(), createoptions, commitstrength)

public actual fun ZwDeviceIoControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun ZwDisplayString(string: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwDisplayString(string.toCPointer<ByteVar>())

public actual fun ZwEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwEnumerateTransactionObject(rootobjecthandle.toCPointer<ByteVar>(), querytype, objectcursor.toCPointer<ByteVar>(), objectcursorlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwGetNotificationResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), transactionnotification.toCPointer<ByteVar>(), notificationlength, timeout.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>(), asynchronous, asynchronouscontext)

public actual fun ZwLoadDriver(driverservicename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwLoadDriver(driverservicename.toCPointer<ByteVar>())

public actual fun ZwMakeTemporaryObject(handle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwMakeTemporaryObject(handle.toCPointer<ByteVar>())

public actual fun ZwManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwManagePartition(targethandle.toCPointer<ByteVar>(), sourcehandle.toCPointer<ByteVar>(), partitioninformationclass, partitioninformation.toCPointer<ByteVar>(), partitioninformationlength)

public actual fun ZwOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, rmhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwOpenEnlistment(enlistmenthandle.toCPointer<ByteVar>(), desiredaccess, rmhandle.toCPointer<ByteVar>(), enlistmentguid.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>())

public actual fun ZwOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwOpenFile(filehandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), shareaccess, openoptions)

public actual fun ZwOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwOpenResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), desiredaccess, tmhandle.toCPointer<ByteVar>(), resourcemanagerguid.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>())

public actual fun ZwOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwOpenSymbolicLinkObject(linkhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun ZwOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwOpenTransaction(transactionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), uow.toCPointer<ByteVar>(), tmhandle.toCPointer<ByteVar>())

public actual fun ZwOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwOpenTransactionManager(tmhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), logfilename.toCPointer<ByteVar>(), tmidentity.toCPointer<ByteVar>(), openoptions)

public actual fun ZwPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwPowerInformation(informationlevel, inputbuffer.toCPointer<ByteVar>(), inputbufferlength, outputbuffer.toCPointer<ByteVar>(), outputbufferlength)

public actual fun ZwPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwPrePrepareComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwPrePrepareEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwPrepareComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwPrepareEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwPropagationComplete(resourcemanagerhandle.toCPointer<ByteVar>(), requestcookie, bufferlength, buffer.toCPointer<ByteVar>())

public actual fun ZwPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwPropagationFailed(resourcemanagerhandle.toCPointer<ByteVar>(), requestcookie, propstatus)

public actual fun ZwQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwQueryInformationByName(objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass)

public actual fun ZwQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwQueryInformationEnlistment(enlistmenthandle.toCPointer<ByteVar>(), enlistmentinformationclass, enlistmentinformation.toCPointer<ByteVar>(), enlistmentinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwQueryInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass)

public actual fun ZwQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwQueryInformationResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), resourcemanagerinformationclass, resourcemanagerinformation.toCPointer<ByteVar>(), resourcemanagerinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwQueryInformationTransaction(transactionhandle.toCPointer<ByteVar>(), transactioninformationclass, transactioninformation.toCPointer<ByteVar>(), transactioninformationlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwQueryInformationTransactionManager(transactionmanagerhandle.toCPointer<ByteVar>(), transactionmanagerinformationclass, transactionmanagerinformation.toCPointer<ByteVar>(), transactionmanagerinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwQuerySymbolicLinkObject(linkhandle.toCPointer<ByteVar>(), linktarget.toCPointer<ByteVar>(), returnedlength.toCPointer<ByteVar>())

public actual fun ZwReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun ZwReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwReadOnlyEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwRecoverEnlistment(enlistmenthandle.toCPointer<ByteVar>(), enlistmentkey.toCPointer<ByteVar>())

public actual fun ZwRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwRecoverResourceManager(resourcemanagerhandle.toCPointer<ByteVar>())

public actual fun ZwRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwRecoverTransactionManager(transactionmanagerhandle.toCPointer<ByteVar>())

public actual fun ZwRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwRegisterProtocolAddressInformation(resourcemanager.toCPointer<ByteVar>(), protocolid.toCPointer<ByteVar>(), protocolinformationsize, protocolinformation.toCPointer<ByteVar>(), createoptions)

public actual fun ZwRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwRenameTransactionManager(logfilename.toCPointer<ByteVar>(), existingtransactionmanagerguid.toCPointer<ByteVar>())

public actual fun ZwRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwRollbackComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwRollbackEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwRollbackTransaction(transactionhandle.toCPointer<ByteVar>(), wait)

public actual fun ZwRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwRollforwardTransactionManager(transactionmanagerhandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwSetInformationEnlistment(enlistmenthandle.toCPointer<ByteVar>(), enlistmentinformationclass, enlistmentinformation.toCPointer<ByteVar>(), enlistmentinformationlength)

public actual fun ZwSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwSetInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass)

public actual fun ZwSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwSetInformationResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), resourcemanagerinformationclass, resourcemanagerinformation.toCPointer<ByteVar>(), resourcemanagerinformationlength)

public actual fun ZwSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwSetInformationTransaction(transactionhandle.toCPointer<ByteVar>(), transactioninformationclass, transactioninformation.toCPointer<ByteVar>(), transactioninformationlength)

public actual fun ZwSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwSetInformationTransactionManager(tmhandle.toCPointer<ByteVar>(), transactionmanagerinformationclass, transactionmanagerinformation.toCPointer<ByteVar>(), transactionmanagerinformationlength)

public actual fun ZwSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwSinglePhaseReject(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ZwUnloadDriver(driverservicename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_ZwUnloadDriver(driverservicename.toCPointer<ByteVar>())

public actual fun ZwWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_vDbgPrintEx(componentid, level, format.toCPointer<ByteVar>(), arglist.toCPointer<ByteVar>())

public actual fun vDbgPrintExWithPrefix(prefix: PCSTR, componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.cinterop.windowssys_windows_wdk_system_systemservices_vDbgPrintExWithPrefix(prefix.toCPointer<ByteVar>(), componentid, level, format.toCPointer<ByteVar>(), arglist.toCPointer<ByteVar>())
