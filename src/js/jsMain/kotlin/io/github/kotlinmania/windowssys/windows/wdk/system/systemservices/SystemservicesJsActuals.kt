@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWdkSystemSystemservicesNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ClfsAddLogContainer(plfolog: Long, pcbcontainer: Long, puszcontainerpath: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsAddLogContainer(plfolog.toString(), pcbcontainer.toString(), puszcontainerpath.toString()) as Int) else 0

public actual fun ClfsAddLogContainerSet(plfolog: Long, ccontainers: UShort, pcbcontainer: Long, rguszcontainerpath: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsAddLogContainerSet(plfolog.toString(), ccontainers.toInt(), pcbcontainer.toString(), rguszcontainerpath.toString()) as Int) else 0

public actual fun ClfsAdvanceLogBase(pvmarshalcontext: Long, plsnbase: Long, fflags: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsAdvanceLogBase(pvmarshalcontext.toString(), plsnbase.toString(), fflags.toInt()) as Int) else 0

public actual fun ClfsAlignReservedLog(pvmarshalcontext: Long, crecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsAlignReservedLog(pvmarshalcontext.toString(), crecords.toInt(), rgcbreservation.toString(), pcbalignreservation.toString()) as Int) else 0

public actual fun ClfsAllocReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsAllocReservedLog(pvmarshalcontext.toString(), crecords.toInt(), pcbadjustment.toString()) as Int) else 0

public actual fun ClfsCloseAndResetLogFile(plfolog: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsCloseAndResetLogFile(plfolog.toString()) as Int) else 0

public actual fun ClfsCloseLogFileObject(plfolog: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsCloseLogFileObject(plfolog.toString()) as Int) else 0

public actual fun ClfsCreateLogFile(pplfolog: Long, puszlogfilename: Long, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PSECURITY_DESCRIPTOR, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsCreateLogFile(pplfolog.toString(), puszlogfilename.toString(), fdesiredaccess.toInt(), dwsharemode.toInt(), psdlogfile.toString(), fcreatedisposition.toInt(), fcreateoptions.toInt(), fflagsandattributes.toInt(), flogoptionflag.toInt(), pvcontext.toString(), cbcontext.toInt()) as Int) else 0

public actual fun ClfsCreateMarshallingArea(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: Long): NTSTATUS =
    0

public actual fun ClfsCreateMarshallingAreaEx(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: Long): NTSTATUS =
    0

public actual fun ClfsCreateScanContext(plfolog: Long, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsCreateScanContext(plfolog.toString(), cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toInt(), pcxscan.toString()) as Int) else 0

public actual fun ClfsDeleteLogByPointer(plfolog: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsDeleteLogByPointer(plfolog.toString()) as Int) else 0

public actual fun ClfsDeleteLogFile(puszlogfilename: Long, pvreserved: Long, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsDeleteLogFile(puszlogfilename.toString(), pvreserved.toString(), flogoptionflag.toInt(), pvcontext.toString(), cbcontext.toInt()) as Int) else 0

public actual fun ClfsDeleteMarshallingArea(pvmarshalcontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsDeleteMarshallingArea(pvmarshalcontext.toString()) as Int) else 0

public actual fun ClfsEarlierLsn(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun ClfsFinalize() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsFinalize()
    }
}

public actual fun ClfsFlushBuffers(pvmarshalcontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsFlushBuffers(pvmarshalcontext.toString()) as Int) else 0

public actual fun ClfsFlushToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsFlushToLsn(pvmarshalcontext.toString(), plsnflush.toString(), plsnlastflushed.toString()) as Int) else 0

public actual fun ClfsFreeReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsFreeReservedLog(pvmarshalcontext.toString(), crecords.toInt(), pcbadjustment.toString()) as Int) else 0

public actual fun ClfsGetContainerName(plfolog: Long, cidlogicalcontainer: UInt, puszcontainername: Long, pcactuallencontainername: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsGetContainerName(plfolog.toString(), cidlogicalcontainer.toInt(), puszcontainername.toString(), pcactuallencontainername.toString()) as Int) else 0

public actual fun ClfsGetIoStatistics(plfolog: Long, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsGetIoStatistics(plfolog.toString(), pvstatsbuffer.toString(), cbstatsbuffer.toInt(), estatsclass, pcbstatswritten.toString()) as Int) else 0

public actual fun ClfsGetLogFileInformation(plfolog: Long, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsGetLogFileInformation(plfolog.toString(), pinfobuffer.toString(), pcbinfobuffer.toString()) as Int) else 0

public actual fun ClfsInitialize(): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsInitialize() as Int) else 0

public actual fun ClfsLaterLsn(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun ClfsLsnBlockOffset(plsn: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsLsnBlockOffset(plsn.toString()) as Int).toUInt() else 0u

public actual fun ClfsLsnContainer(plsn: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsLsnContainer(plsn.toString()) as Int).toUInt() else 0u

public actual fun ClfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN =
    CLS_LSN()

public actual fun ClfsLsnDifference(plsnstart: Long, plsnfinish: Long, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsLsnDifference(plsnstart.toString(), plsnfinish.toString(), cbcontainer.toInt(), cbmaxblock.toInt(), pcbdifference.toString()) as Int) else 0

public actual fun ClfsLsnEqual(plsn1: Long, plsn2: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsLsnEqual(plsn1.toString(), plsn2.toString()) as Boolean) else false

public actual fun ClfsLsnGreater(plsn1: Long, plsn2: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsLsnGreater(plsn1.toString(), plsn2.toString()) as Boolean) else false

public actual fun ClfsLsnInvalid(plsn: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsLsnInvalid(plsn.toString()) as Boolean) else false

public actual fun ClfsLsnLess(plsn1: Long, plsn2: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsLsnLess(plsn1.toString(), plsn2.toString()) as Boolean) else false

public actual fun ClfsLsnNull(plsn: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsLsnNull(plsn.toString()) as Boolean) else false

public actual fun ClfsLsnRecordSequence(plsn: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsLsnRecordSequence(plsn.toString()) as Int).toUInt() else 0u

public actual fun ClfsMgmtDeregisterManagedClient(clientcookie: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsMgmtDeregisterManagedClient(clientcookie.toString()) as Int) else 0

public actual fun ClfsMgmtHandleLogFileFull(client: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsMgmtHandleLogFileFull(client.toString()) as Int) else 0

public actual fun ClfsMgmtInstallPolicy(logfile: Long, policy: Long, policylength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsMgmtInstallPolicy(logfile.toString(), policy.toString(), policylength.toInt()) as Int) else 0

public actual fun ClfsMgmtQueryPolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE, policy: Long, policylength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsMgmtQueryPolicy(logfile.toString(), policytype, policy.toString(), policylength.toString()) as Int) else 0

public actual fun ClfsMgmtRegisterManagedClient(logfile: Long, registrationdata: Long, clientcookie: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsMgmtRegisterManagedClient(logfile.toString(), registrationdata.toString(), clientcookie.toString()) as Int) else 0

public actual fun ClfsMgmtRemovePolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsMgmtRemovePolicy(logfile.toString(), policytype) as Int) else 0

public actual fun ClfsMgmtSetLogFileSize(logfile: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsMgmtSetLogFileSize(logfile.toString(), newsizeincontainers.toString(), resultingsizeincontainers.toString(), completionroutine.toLong().toString(), completionroutinedata.toString()) as Int) else 0

public actual fun ClfsMgmtSetLogFileSizeAsClient(logfile: Long, clientcookie: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsMgmtSetLogFileSizeAsClient(logfile.toString(), clientcookie.toString(), newsizeincontainers.toString(), resultingsizeincontainers.toString(), completionroutine.toLong().toString(), completionroutinedata.toString()) as Int) else 0

public actual fun ClfsMgmtTailAdvanceFailure(client: Long, reason: NTSTATUS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsMgmtTailAdvanceFailure(client.toString(), reason) as Int) else 0

public actual fun ClfsQueryLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfoinputbuffer: Long, cbinfoinputbuffer: UInt, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsQueryLogFileInformation(plfolog.toString(), einformationclass, pinfoinputbuffer.toString(), cbinfoinputbuffer.toInt(), pinfobuffer.toString(), pcbinfobuffer.toString()) as Int) else 0

public actual fun ClfsReadLogRecord(pvmarshalcontext: Long, plsnfirst: Long, pecontextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsReadLogRecord(pvmarshalcontext.toString(), plsnfirst.toString(), pecontextmode, ppvreadbuffer.toString(), pcbreadbuffer.toString(), perecordtype.toString(), plsnundonext.toString(), plsnprevious.toString(), ppvreadcontext.toString()) as Int) else 0

public actual fun ClfsReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsReadNextLogRecord(pvreadcontext.toString(), ppvbuffer.toString(), pcbbuffer.toString(), perecordtype.toString(), plsnuser.toString(), plsnundonext.toString(), plsnprevious.toString(), plsnrecord.toString()) as Int) else 0

public actual fun ClfsReadPreviousRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsReadPreviousRestartArea(pvreadcontext.toString(), ppvrestartbuffer.toString(), pcbrestartbuffer.toString(), plsnrestart.toString()) as Int) else 0

public actual fun ClfsReadRestartArea(pvmarshalcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvreadcontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsReadRestartArea(pvmarshalcontext.toString(), ppvrestartbuffer.toString(), pcbrestartbuffer.toString(), plsn.toString(), ppvreadcontext.toString()) as Int) else 0

public actual fun ClfsRemoveLogContainer(plfolog: Long, puszcontainerpath: Long, fforce: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsRemoveLogContainer(plfolog.toString(), puszcontainerpath.toString(), fforce) as Int) else 0

public actual fun ClfsRemoveLogContainerSet(plfolog: Long, ccontainers: UShort, rgwszcontainerpath: Long, fforce: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsRemoveLogContainerSet(plfolog.toString(), ccontainers.toInt(), rgwszcontainerpath.toString(), fforce) as Int) else 0

public actual fun ClfsReserveAndAppendLog(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsReserveAndAppendLog(pvmarshalcontext.toString(), rgwriteentries.toString(), cwriteentries.toInt(), plsnundonext.toString(), plsnprevious.toString(), creserverecords.toInt(), rgcbreservation.toString(), fflags.toInt(), plsn.toString()) as Int) else 0

public actual fun ClfsReserveAndAppendLogAligned(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsReserveAndAppendLogAligned(pvmarshalcontext.toString(), rgwriteentries.toString(), cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext.toString(), plsnprevious.toString(), creserverecords.toInt(), rgcbreservation.toString(), fflags.toInt(), plsn.toString()) as Int) else 0

public actual fun ClfsScanLogContainers(pcxscan: Long, escanmode: UByte): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsScanLogContainers(pcxscan.toString(), escanmode.toInt()) as Int) else 0

public actual fun ClfsSetArchiveTail(plfolog: Long, plsnarchivetail: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsSetArchiveTail(plfolog.toString(), plsnarchivetail.toString()) as Int) else 0

public actual fun ClfsSetEndOfLog(plfolog: Long, plsnend: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsSetEndOfLog(plfolog.toString(), plsnend.toString()) as Int) else 0

public actual fun ClfsSetLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfobuffer: Long, cbbuffer: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsSetLogFileInformation(plfolog.toString(), einformationclass, pinfobuffer.toString(), cbbuffer.toInt()) as Int) else 0

public actual fun ClfsTerminateReadLog(pvcursorcontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsTerminateReadLog(pvcursorcontext.toString()) as Int) else 0

public actual fun ClfsWriteRestartArea(pvmarshalcontext: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: UInt, pcbwritten: Long, plsnnext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ClfsWriteRestartArea(pvmarshalcontext.toString(), pvrestartbuffer.toString(), cbrestartbuffer.toInt(), plsnbase.toString(), fflags.toInt(), pcbwritten.toString(), plsnnext.toString()) as Int) else 0

public actual fun CmCallbackGetKeyObjectID(cookie: Long, obj: Long, objectid: Long, objectname: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_CmCallbackGetKeyObjectID(cookie.toString(), obj.toString(), objectid.toString(), objectname.toString()) as Int) else 0

public actual fun CmCallbackGetKeyObjectIDEx(cookie: Long, obj: Long, objectid: Long, objectname: Long, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_CmCallbackGetKeyObjectIDEx(cookie.toString(), obj.toString(), objectid.toString(), objectname.toString(), flags.toInt()) as Int) else 0

public actual fun CmCallbackReleaseKeyObjectIDEx(objectname: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_CmCallbackReleaseKeyObjectIDEx(objectname.toString())
    }
}

public actual fun CmGetBoundTransaction(cookie: Long, obj: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_CmGetBoundTransaction(cookie.toString(), obj.toString()) as String).toLong() else 0L

public actual fun CmGetCallbackVersion(major: Long, minor: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_CmGetCallbackVersion(major.toString(), minor.toString())
    }
}

public actual fun CmRegisterCallback(function: PEX_CALLBACK_FUNCTION, context: Long, cookie: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_CmRegisterCallback(function.toLong().toString(), context.toString(), cookie.toString()) as Int) else 0

public actual fun CmRegisterCallbackEx(function: PEX_CALLBACK_FUNCTION, altitude: Long, driver: Long, context: Long, cookie: Long, reserved: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_CmRegisterCallbackEx(function.toLong().toString(), altitude.toString(), driver.toString(), context.toString(), cookie.toString(), reserved.toString()) as Int) else 0

public actual fun CmSetCallbackObjectContext(obj: Long, cookie: Long, newcontext: Long, oldcontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_CmSetCallbackObjectContext(obj.toString(), cookie.toString(), newcontext.toString(), oldcontext.toString()) as Int) else 0

public actual fun CmUnRegisterCallback(cookie: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_CmUnRegisterCallback(cookie.toString()) as Int) else 0

public actual fun DbgBreakPointWithStatus(status: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_DbgBreakPointWithStatus(status.toInt())
    }
}

public actual fun DbgPrint(format: PCSTR): UInt =
    0u

public actual fun DbgPrintEx(componentid: UInt, level: UInt, format: PCSTR): UInt =
    0u

public actual fun DbgPrintReturnControlC(format: PCSTR): UInt =
    0u

public actual fun DbgPrompt(prompt: PCSTR, response: PSTR, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_DbgPrompt(prompt.toString(), response.toString(), length.toInt()) as Int).toUInt() else 0u

public actual fun DbgQueryDebugFilterState(componentid: UInt, level: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_DbgQueryDebugFilterState(componentid.toInt(), level.toInt()) as Int) else 0

public actual fun DbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_DbgSetDebugFilterState(componentid.toInt(), level.toInt(), state) as Int) else 0

public actual fun DbgSetDebugPrintCallback(debugprintcallback: PDEBUG_PRINT_CALLBACK, enable: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_DbgSetDebugPrintCallback(debugprintcallback.toLong().toString(), enable) as Int) else 0

public actual fun EtwActivityIdControl(controlcode: UInt, activityid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_EtwActivityIdControl(controlcode.toInt(), activityid.toString()) as Int) else 0

public actual fun EtwEventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_EtwEventEnabled(reghandle.toString(), eventdescriptor.toString()) as Boolean) else false

public actual fun EtwProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_EtwProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) as Boolean) else false

public actual fun EtwRegister(providerid: Long, enablecallback: PETWENABLECALLBACK, callbackcontext: Long, reghandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_EtwRegister(providerid.toString(), enablecallback.toLong().toString(), callbackcontext.toString(), reghandle.toString()) as Int) else 0

public actual fun EtwSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_EtwSetInformation(reghandle.toString(), informationclass, eventinformation.toString(), informationlength.toInt()) as Int) else 0

public actual fun EtwUnregister(reghandle: REGHANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_EtwUnregister(reghandle.toString()) as Int) else 0

public actual fun EtwWrite(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_EtwWrite(reghandle.toString(), eventdescriptor.toString(), activityid.toString(), userdatacount.toInt(), userdata.toString()) as Int) else 0

public actual fun EtwWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_EtwWriteEx(reghandle.toString(), eventdescriptor.toString(), filter.toString(), flags.toInt(), activityid.toString(), relatedactivityid.toString(), userdatacount.toInt(), userdata.toString()) as Int) else 0

public actual fun EtwWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, activityid: Long, string: PCWSTR): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_EtwWriteString(reghandle.toString(), level.toInt(), keyword.toString(), activityid.toString(), string.toString()) as Int) else 0

public actual fun EtwWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_EtwWriteTransfer(reghandle.toString(), eventdescriptor.toString(), activityid.toString(), relatedactivityid.toString(), userdatacount.toInt(), userdata.toString()) as Int) else 0

public actual fun ExAcquireFastMutex(fastmutex: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireFastMutex(fastmutex.toString())
    }
}

public actual fun ExAcquireFastMutexUnsafe(fastmutex: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireFastMutexUnsafe(fastmutex.toString())
    }
}

public actual fun ExAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquirePushLockExclusiveEx(pushlock.toString(), flags.toInt())
    }
}

public actual fun ExAcquirePushLockSharedEx(pushlock: Long, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquirePushLockSharedEx(pushlock.toString(), flags.toInt())
    }
}

public actual fun ExAcquireResourceExclusiveLite(resource: Long, wait: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireResourceExclusiveLite(resource.toString(), wait) as Boolean) else false

public actual fun ExAcquireResourceSharedLite(resource: Long, wait: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireResourceSharedLite(resource.toString(), wait) as Boolean) else false

public actual fun ExAcquireRundownProtection(runref: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtection(runref.toString()) as Boolean) else false

public actual fun ExAcquireRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionCacheAware(runrefcacheaware.toString()) as Boolean) else false

public actual fun ExAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionCacheAwareEx(runrefcacheaware.toString(), count.toInt()) as Boolean) else false

public actual fun ExAcquireRundownProtectionEx(runref: Long, count: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionEx(runref.toString(), count.toInt()) as Boolean) else false

public actual fun ExAcquireSharedStarveExclusive(resource: Long, wait: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireSharedStarveExclusive(resource.toString(), wait) as Boolean) else false

public actual fun ExAcquireSharedWaitForExclusive(resource: Long, wait: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireSharedWaitForExclusive(resource.toString(), wait) as Boolean) else false

public actual fun ExAcquireSpinLockExclusive(spinlock: Long): UByte =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockExclusive(spinlock.toString()) as Int).toUByte() else 0u

public actual fun ExAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockExclusiveAtDpcLevel(spinlock.toString())
    }
}

public actual fun ExAcquireSpinLockShared(spinlock: Long): UByte =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockShared(spinlock.toString()) as Int).toUByte() else 0u

public actual fun ExAcquireSpinLockSharedAtDpcLevel(spinlock: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockSharedAtDpcLevel(spinlock.toString())
    }
}

public actual fun ExAllocateCacheAwareRundownProtection(pooltype: POOL_TYPE, pooltag: UInt): PEX_RUNDOWN_REF_CACHE_AWARE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAllocateCacheAwareRundownProtection(pooltype, pooltag.toInt()) as String).toLong() else 0L

public actual fun ExAllocatePool(pooltype: POOL_TYPE, numberofbytes: ULong): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAllocatePool(pooltype, numberofbytes.toString()) as String).toLong() else 0L

public actual fun ExAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAllocatePool2(flags.toString(), numberofbytes.toString(), tag.toInt()) as String).toLong() else 0L

public actual fun ExAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAllocatePool3(flags.toString(), numberofbytes.toString(), tag.toInt(), extendedparameters.toString(), extendedparameterscount.toInt()) as String).toLong() else 0L

public actual fun ExAllocatePoolWithQuota(pooltype: POOL_TYPE, numberofbytes: ULong): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithQuota(pooltype, numberofbytes.toString()) as String).toLong() else 0L

public actual fun ExAllocatePoolWithQuotaTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithQuotaTag(pooltype, numberofbytes.toString(), tag.toInt()) as String).toLong() else 0L

public actual fun ExAllocatePoolWithTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithTag(pooltype, numberofbytes.toString(), tag.toInt()) as String).toLong() else 0L

public actual fun ExAllocatePoolWithTagPriority(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt, priority: EX_POOL_PRIORITY): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithTagPriority(pooltype, numberofbytes.toString(), tag.toInt(), priority) as String).toLong() else 0L

public actual fun ExAllocateTimer(callback: PEXT_CALLBACK, callbackcontext: Long, attributes: UInt): PEX_TIMER =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExAllocateTimer(callback.toLong().toString(), callbackcontext.toString(), attributes.toInt()) as String).toLong() else 0L

public actual fun ExCancelTimer(timer: PEX_TIMER, parameters: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExCancelTimer(timer.toString(), parameters.toString()) as Boolean) else false

public actual fun ExCleanupRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExCleanupRundownProtectionCacheAware(runrefcacheaware.toString())
    }
}

public actual fun ExConvertExclusiveToSharedLite(resource: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExConvertExclusiveToSharedLite(resource.toString())
    }
}

public actual fun ExCreateCallback(callbackobject: Long, objectattributes: Long, create: Boolean, allowmultiplecallbacks: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExCreateCallback(callbackobject.toString(), objectattributes.toString(), create, allowmultiplecallbacks) as Int) else 0

public actual fun ExCreatePool(flags: UInt, tag: ULong, params: Long, poolhandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExCreatePool(flags.toInt(), tag.toString(), params.toString(), poolhandle.toString()) as Int) else 0

public actual fun ExDeleteResourceLite(resource: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExDeleteResourceLite(resource.toString()) as Int) else 0

public actual fun ExDeleteTimer(timer: PEX_TIMER, cancel: Boolean, wait: Boolean, parameters: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExDeleteTimer(timer.toString(), cancel, wait, parameters.toString()) as Boolean) else false

public actual fun ExDestroyPool(poolhandle: HANDLE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExDestroyPool(poolhandle.toString())
    }
}

public actual fun ExEnterCriticalRegionAndAcquireResourceExclusive(resource: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireResourceExclusive(resource.toString()) as String).toLong() else 0L

public actual fun ExEnterCriticalRegionAndAcquireResourceShared(resource: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireResourceShared(resource.toString()) as String).toLong() else 0L

public actual fun ExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource.toString()) as String).toLong() else 0L

public actual fun ExEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExEnumerateSystemFirmwareTables(firmwaretableprovidersignature.toInt(), firmwaretablebuffer.toString(), bufferlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ExExtendZone(zone: Long, segment: Long, segmentsize: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExExtendZone(zone.toString(), segment.toString(), segmentsize.toInt()) as Int) else 0

public actual fun ExFreeCacheAwareRundownProtection(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExFreeCacheAwareRundownProtection(runrefcacheaware.toString())
    }
}

public actual fun ExFreePool(p: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExFreePool(p.toString())
    }
}

public actual fun ExFreePool2(p: Long, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExFreePool2(p.toString(), tag.toInt(), extendedparameters.toString(), extendedparameterscount.toInt())
    }
}

public actual fun ExFreePoolWithTag(p: Long, tag: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExFreePoolWithTag(p.toString(), tag.toInt())
    }
}

public actual fun ExGetExclusiveWaiterCount(resource: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExGetExclusiveWaiterCount(resource.toString()) as Int).toUInt() else 0u

public actual fun ExGetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Long, attributes: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExGetFirmwareEnvironmentVariable(variablename.toString(), vendorguid.toString(), value.toString(), valuelength.toString(), attributes.toString()) as Int) else 0

public actual fun ExGetFirmwareType(): FIRMWARE_TYPE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExGetFirmwareType() as Int) else 0

public actual fun ExGetPreviousMode(): Byte =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExGetPreviousMode() as Int).toByte() else 0

public actual fun ExGetSharedWaiterCount(resource: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExGetSharedWaiterCount(resource.toString()) as Int).toUInt() else 0u

public actual fun ExGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), firmwaretablebuffer.toString(), bufferlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ExInitializePushLock(pushlock: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExInitializePushLock(pushlock.toString())
    }
}

public actual fun ExInitializeResourceLite(resource: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExInitializeResourceLite(resource.toString()) as Int) else 0

public actual fun ExInitializeRundownProtection(runref: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtection(runref.toString())
    }
}

public actual fun ExInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, runrefsize: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtectionCacheAware(runrefcacheaware.toString(), runrefsize.toString())
    }
}

public actual fun ExInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtectionCacheAwareEx(runrefcacheaware.toString(), flags.toInt())
    }
}

public actual fun ExInitializeZone(zone: Long, blocksize: UInt, initialsegment: Long, initialsegmentsize: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExInitializeZone(zone.toString(), blocksize.toInt(), initialsegment.toString(), initialsegmentsize.toInt()) as Int) else 0

public actual fun ExInterlockedAddLargeInteger(addend: Long, increment: Long, lock: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExInterlockedAddLargeInteger(addend.toString(), increment.toString(), lock.toString()) as String).toLong() else 0L

public actual fun ExInterlockedExtendZone(zone: Long, segment: Long, segmentsize: UInt, lock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExInterlockedExtendZone(zone.toString(), segment.toString(), segmentsize.toInt(), lock.toString()) as Int) else 0

public actual fun ExIsManufacturingModeEnabled(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExIsManufacturingModeEnabled() as Boolean) else false

public actual fun ExIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExIsProcessorFeaturePresent(processorfeature.toInt()) as Boolean) else false

public actual fun ExIsResourceAcquiredExclusiveLite(resource: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExIsResourceAcquiredExclusiveLite(resource.toString()) as Boolean) else false

public actual fun ExIsResourceAcquiredSharedLite(resource: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExIsResourceAcquiredSharedLite(resource.toString()) as Int).toUInt() else 0u

public actual fun ExIsSoftBoot(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExIsSoftBoot() as Boolean) else false

public actual fun ExLocalTimeToSystemTime(localtime: Long, systemtime: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExLocalTimeToSystemTime(localtime.toString(), systemtime.toString())
    }
}

public actual fun ExNotifyCallback(callbackobject: Long, argument1: Long, argument2: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExNotifyCallback(callbackobject.toString(), argument1.toString(), argument2.toString())
    }
}

public actual fun ExQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExQueryTimerResolution(maximumtime.toString(), minimumtime.toString(), currenttime.toString())
    }
}

public actual fun ExQueueWorkItem(workitem: Long, queuetype: WORK_QUEUE_TYPE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExQueueWorkItem(workitem.toString(), queuetype)
    }
}

public actual fun ExRaiseAccessViolation() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExRaiseAccessViolation()
    }
}

public actual fun ExRaiseDatatypeMisalignment() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExRaiseDatatypeMisalignment()
    }
}

public actual fun ExRaiseStatus(status: NTSTATUS) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExRaiseStatus(status)
    }
}

public actual fun ExReInitializeRundownProtection(runref: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReInitializeRundownProtection(runref.toString())
    }
}

public actual fun ExReInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReInitializeRundownProtectionCacheAware(runrefcacheaware.toString())
    }
}

public actual fun ExRegisterCallback(callbackobject: PCALLBACK_OBJECT, callbackfunction: PCALLBACK_FUNCTION, callbackcontext: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExRegisterCallback(callbackobject.toString(), callbackfunction.toLong().toString(), callbackcontext.toString()) as String).toLong() else 0L

public actual fun ExReinitializeResourceLite(resource: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReinitializeResourceLite(resource.toString()) as Int) else 0

public actual fun ExReleaseFastMutex(fastmutex: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseFastMutex(fastmutex.toString())
    }
}

public actual fun ExReleaseFastMutexUnsafe(fastmutex: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseFastMutexUnsafe(fastmutex.toString())
    }
}

public actual fun ExReleasePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleasePushLockExclusiveEx(pushlock.toString(), flags.toInt())
    }
}

public actual fun ExReleasePushLockSharedEx(pushlock: Long, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleasePushLockSharedEx(pushlock.toString(), flags.toInt())
    }
}

public actual fun ExReleaseResourceAndLeaveCriticalRegion(resource: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseResourceAndLeaveCriticalRegion(resource.toString())
    }
}

public actual fun ExReleaseResourceForThreadLite(resource: Long, resourcethreadid: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseResourceForThreadLite(resource.toString(), resourcethreadid.toString())
    }
}

public actual fun ExReleaseResourceLite(resource: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseResourceLite(resource.toString())
    }
}

public actual fun ExReleaseRundownProtection(runref: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtection(runref.toString())
    }
}

public actual fun ExReleaseRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionCacheAware(runrefcacheaware.toString())
    }
}

public actual fun ExReleaseRundownProtectionCacheAwareEx(runref: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionCacheAwareEx(runref.toString(), count.toInt())
    }
}

public actual fun ExReleaseRundownProtectionEx(runref: Long, count: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionEx(runref.toString(), count.toInt())
    }
}

public actual fun ExReleaseSpinLockExclusive(spinlock: Long, oldirql: UByte) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockExclusive(spinlock.toString(), oldirql.toInt())
    }
}

public actual fun ExReleaseSpinLockExclusiveFromDpcLevel(spinlock: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockExclusiveFromDpcLevel(spinlock.toString())
    }
}

public actual fun ExReleaseSpinLockShared(spinlock: Long, oldirql: UByte) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockShared(spinlock.toString(), oldirql.toInt())
    }
}

public actual fun ExReleaseSpinLockSharedFromDpcLevel(spinlock: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockSharedFromDpcLevel(spinlock.toString())
    }
}

public actual fun ExRundownCompleted(runref: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExRundownCompleted(runref.toString())
    }
}

public actual fun ExRundownCompletedCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExRundownCompletedCacheAware(runrefcacheaware.toString())
    }
}

public actual fun ExSecurePoolUpdate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong, offset: ULong, size: ULong, buffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExSecurePoolUpdate(securepoolhandle.toString(), tag.toInt(), allocation.toString(), cookie.toString(), offset.toString(), size.toString(), buffer.toString()) as Int) else 0

public actual fun ExSecurePoolValidate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExSecurePoolValidate(securepoolhandle.toString(), tag.toInt(), allocation.toString(), cookie.toString()) as Int).toUInt() else 0u

public actual fun ExSetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: UInt, attributes: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExSetFirmwareEnvironmentVariable(variablename.toString(), vendorguid.toString(), value.toString(), valuelength.toInt(), attributes.toInt()) as Int) else 0

public actual fun ExSetResourceOwnerPointer(resource: Long, ownerpointer: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExSetResourceOwnerPointer(resource.toString(), ownerpointer.toString())
    }
}

public actual fun ExSetResourceOwnerPointerEx(resource: Long, ownerpointer: Long, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExSetResourceOwnerPointerEx(resource.toString(), ownerpointer.toString(), flags.toInt())
    }
}

public actual fun ExSetTimer(timer: PEX_TIMER, duetime: Long, period: Long, parameters: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExSetTimer(timer.toString(), duetime.toString(), period.toString(), parameters.toString()) as Boolean) else false

public actual fun ExSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExSetTimerResolution(desiredtime.toInt(), setresolution) as Int).toUInt() else 0u

public actual fun ExSizeOfRundownProtectionCacheAware(): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExSizeOfRundownProtectionCacheAware() as String).toULong() else 0uL

public actual fun ExSystemTimeToLocalTime(systemtime: Long, localtime: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExSystemTimeToLocalTime(systemtime.toString(), localtime.toString())
    }
}

public actual fun ExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock.toString()) as Int).toUInt() else 0u

public actual fun ExTryAcquireSpinLockSharedAtDpcLevel(spinlock: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExTryAcquireSpinLockSharedAtDpcLevel(spinlock.toString()) as Int).toUInt() else 0u

public actual fun ExTryConvertSharedSpinLockExclusive(spinlock: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExTryConvertSharedSpinLockExclusive(spinlock.toString()) as Int).toUInt() else 0u

public actual fun ExTryToAcquireFastMutex(fastmutex: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExTryToAcquireFastMutex(fastmutex.toString()) as Boolean) else false

public actual fun ExUnregisterCallback(callbackregistration: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExUnregisterCallback(callbackregistration.toString())
    }
}

public actual fun ExUuidCreate(uuid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExUuidCreate(uuid.toString()) as Int) else 0

public actual fun ExVerifySuite(suitetype: SUITE_TYPE): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExVerifySuite(suitetype) as Boolean) else false

public actual fun ExWaitForRundownProtectionRelease(runref: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExWaitForRundownProtectionRelease(runref.toString())
    }
}

public actual fun ExWaitForRundownProtectionReleaseCacheAware(runref: PEX_RUNDOWN_REF_CACHE_AWARE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ExWaitForRundownProtectionReleaseCacheAware(runref.toString())
    }
}

public actual fun FsRtlIsTotalDeviceFailure(status: NTSTATUS): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_FsRtlIsTotalDeviceFailure(status) as Boolean) else false

public actual fun HalAcquireDisplayOwnership(resetdisplayparameters: PHAL_RESET_DISPLAY_PARAMETERS) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalAcquireDisplayOwnership(resetdisplayparameters.toLong().toString())
    }
}

public actual fun HalAllocateAdapterChannel(adapterobject: Long, wcb: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL): NTSTATUS =
    0

public actual fun HalAllocateCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, cacheenabled: Boolean): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalAllocateCommonBuffer(adapterobject.toString(), length.toInt(), logicaladdress.toString(), cacheenabled) as String).toLong() else 0L

public actual fun HalAllocateCrashDumpRegisters(adapterobject: Long, numberofmapregisters: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalAllocateCrashDumpRegisters(adapterobject.toString(), numberofmapregisters.toString()) as String).toLong() else 0L

public actual fun HalAllocateHardwareCounters(groupaffinty: Long, groupcount: UInt, resourcelist: Long, countersethandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalAllocateHardwareCounters(groupaffinty.toString(), groupcount.toInt(), resourcelist.toString(), countersethandle.toString()) as Int) else 0

public actual fun HalAssignSlotResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, bustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, allocatedresources: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalAssignSlotResources(registrypath.toString(), driverclassname.toString(), driverobject.toString(), deviceobject.toString(), bustype, busnumber.toInt(), slotnumber.toInt(), allocatedresources.toString()) as Int) else 0

public actual fun HalBugCheckSystem(errorsource: Long, errorrecord: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalBugCheckSystem(errorsource.toString(), errorrecord.toString())
    }
}

public actual fun HalDmaAllocateCrashDumpRegistersEx(adapter: Long, numberofmapregisters: UInt, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE, mapregisterbase: Long, mapregistersavailable: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalDmaAllocateCrashDumpRegistersEx(adapter.toString(), numberofmapregisters.toInt(), type, mapregisterbase.toString(), mapregistersavailable.toString()) as Int) else 0

public actual fun HalDmaFreeCrashDumpRegistersEx(adapter: Long, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalDmaFreeCrashDumpRegistersEx(adapter.toString(), type) as Int) else 0

public actual fun HalExamineMBR(deviceobject: Long, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalExamineMBR(deviceobject.toString(), sectorsize.toInt(), mbrtypeidentifier.toInt(), buffer.toString())
    }
}

public actual fun HalFreeCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, virtualaddress: Long, cacheenabled: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalFreeCommonBuffer(adapterobject.toString(), length.toInt(), logicaladdress.toString(), virtualaddress.toString(), cacheenabled)
    }
}

public actual fun HalFreeHardwareCounters(countersethandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalFreeHardwareCounters(countersethandle.toString()) as Int) else 0

public actual fun HalGetAdapter(devicedescription: Long, numberofmapregisters: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalGetAdapter(devicedescription.toString(), numberofmapregisters.toString()) as String).toLong() else 0L

public actual fun HalGetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalGetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.toString(), length.toInt()) as Int).toUInt() else 0u

public actual fun HalGetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalGetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.toString(), offset.toInt(), length.toInt()) as Int).toUInt() else 0u

public actual fun HalGetInterruptVector(interfacetype: INTERFACE_TYPE, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: Long, affinity: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalGetInterruptVector(interfacetype, busnumber.toInt(), businterruptlevel.toInt(), businterruptvector.toInt(), irql.toString(), affinity.toString()) as Int).toUInt() else 0u

public actual fun HalMakeBeep(frequency: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalMakeBeep(frequency.toInt()) as Boolean) else false

public actual fun HalReadDmaCounter(adapterobject: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalReadDmaCounter(adapterobject.toString()) as Int).toUInt() else 0u

public actual fun HalSetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalSetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.toString(), length.toInt()) as Int).toUInt() else 0u

public actual fun HalSetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalSetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.toString(), offset.toInt(), length.toInt()) as Int).toUInt() else 0u

public actual fun HalTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HalTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress.toString(), addressspace.toString(), translatedaddress.toString()) as Boolean) else false

public actual fun HvlRegisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HvlRegisterWheaErrorNotification(callback.toLong().toString()) as Int) else 0

public actual fun HvlUnregisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_HvlUnregisterWheaErrorNotification(callback.toLong().toString()) as Int) else 0

public actual fun IoAcquireCancelSpinLock(irql: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAcquireCancelSpinLock(irql.toString())
    }
}

public actual fun IoAcquireKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, buffer: Long, size: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAcquireKsrPersistentMemory(driverobject.toString(), physicaldeviceobject.toString(), buffer.toString(), size.toString()) as Int) else 0

public actual fun IoAcquireKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffer: Long, size: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAcquireKsrPersistentMemoryEx(driverobject.toString(), physicaldeviceobject.toString(), physicaldeviceid.toString(), datatag.toString(), dataversion.toString(), buffer.toString(), size.toString()) as Int) else 0

public actual fun IoAcquireRemoveLockEx(removelock: Long, tag: Long, file: PCSTR, line: UInt, remlocksize: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAcquireRemoveLockEx(removelock.toString(), tag.toString(), file.toString(), line.toInt(), remlocksize.toInt()) as Int) else 0

public actual fun IoAllocateAdapterChannel(adapterobject: Long, deviceobject: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL, context: Long): NTSTATUS =
    0

public actual fun IoAllocateController(controllerobject: Long, deviceobject: Long, executionroutine: DRIVER_CONTROL, context: Long) {
}

public actual fun IoAllocateDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long, driverobjectextensionsize: UInt, driverobjectextension: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAllocateDriverObjectExtension(driverobject.toString(), clientidentificationaddress.toString(), driverobjectextensionsize.toInt(), driverobjectextension.toString()) as Int) else 0

public actual fun IoAllocateErrorLogEntry(ioobject: Long, entrysize: UByte): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAllocateErrorLogEntry(ioobject.toString(), entrysize.toInt()) as String).toLong() else 0L

public actual fun IoAllocateIrp(stacksize: Byte, chargequota: Boolean): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAllocateIrp(stacksize.toInt(), chargequota) as String).toLong() else 0L

public actual fun IoAllocateIrpEx(deviceobject: Long, stacksize: Byte, chargequota: Boolean): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAllocateIrpEx(deviceobject.toString(), stacksize.toInt(), chargequota) as String).toLong() else 0L

public actual fun IoAllocateMdl(virtualaddress: Long, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAllocateMdl(virtualaddress.toString(), length.toInt(), secondarybuffer, chargequota, irp.toString()) as String).toLong() else 0L

public actual fun IoAllocateSfioStreamIdentifier(fileobject: Long, length: UInt, signature: Long, streamidentifier: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAllocateSfioStreamIdentifier(fileobject.toString(), length.toInt(), signature.toString(), streamidentifier.toString()) as Int) else 0

public actual fun IoAllocateWorkItem(deviceobject: Long): PIO_WORKITEM =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAllocateWorkItem(deviceobject.toString()) as String).toLong() else 0L

public actual fun IoAssignResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, requestedresources: Long, allocatedresources: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAssignResources(registrypath.toString(), driverclassname.toString(), driverobject.toString(), deviceobject.toString(), requestedresources.toString(), allocatedresources.toString()) as Int) else 0

public actual fun IoAttachDevice(sourcedevice: Long, targetdevice: Long, attacheddevice: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAttachDevice(sourcedevice.toString(), targetdevice.toString(), attacheddevice.toString()) as Int) else 0

public actual fun IoAttachDeviceByPointer(sourcedevice: Long, targetdevice: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAttachDeviceByPointer(sourcedevice.toString(), targetdevice.toString()) as Int) else 0

public actual fun IoAttachDeviceToDeviceStack(sourcedevice: Long, targetdevice: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAttachDeviceToDeviceStack(sourcedevice.toString(), targetdevice.toString()) as String).toLong() else 0L

public actual fun IoAttachDeviceToDeviceStackSafe(sourcedevice: Long, targetdevice: Long, attachedtodeviceobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoAttachDeviceToDeviceStackSafe(sourcedevice.toString(), targetdevice.toString(), attachedtodeviceobject.toString()) as Int) else 0

public actual fun IoBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, iostatusblock: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoBuildAsynchronousFsdRequest(majorfunction.toInt(), deviceobject.toString(), buffer.toString(), length.toInt(), startingoffset.toString(), iostatusblock.toString()) as String).toLong() else 0L

public actual fun IoBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: Long, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: Long, iostatusblock: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoBuildDeviceIoControlRequest(iocontrolcode.toInt(), deviceobject.toString(), inputbuffer.toString(), inputbufferlength.toInt(), outputbuffer.toString(), outputbufferlength.toInt(), internaldeviceiocontrol, event.toString(), iostatusblock.toString()) as String).toLong() else 0L

public actual fun IoBuildPartialMdl(sourcemdl: Long, targetmdl: Long, virtualaddress: Long, length: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoBuildPartialMdl(sourcemdl.toString(), targetmdl.toString(), virtualaddress.toString(), length.toInt())
    }
}

public actual fun IoBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, event: Long, iostatusblock: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoBuildSynchronousFsdRequest(majorfunction.toInt(), deviceobject.toString(), buffer.toString(), length.toInt(), startingoffset.toString(), event.toString(), iostatusblock.toString()) as String).toLong() else 0L

public actual fun IoCancelFileOpen(deviceobject: Long, fileobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCancelFileOpen(deviceobject.toString(), fileobject.toString())
    }
}

public actual fun IoCancelIrp(irp: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCancelIrp(irp.toString()) as Boolean) else false

public actual fun IoCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCheckLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.toString(), shareaccess.toString(), linkshareaccess.toString(), ioshareaccessflags.toInt()) as Int) else 0

public actual fun IoCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCheckShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.toString(), shareaccess.toString(), update) as Int) else 0

public actual fun IoCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean, writepermission: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCheckShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.toString(), shareaccess.toString(), update, writepermission.toString()) as Int) else 0

public actual fun IoCleanupIrp(irp: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCleanupIrp(irp.toString())
    }
}

public actual fun IoClearActivityIdThread(originalid: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoClearActivityIdThread(originalid.toString())
    }
}

public actual fun IoClearIrpExtraCreateParameter(irp: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoClearIrpExtraCreateParameter(irp.toString())
    }
}

public actual fun IoConnectInterrupt(interruptobject: Long, serviceroutine: PKSERVICE_ROUTINE, servicecontext: Long, spinlock: Long, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KINTERRUPT_MODE, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoConnectInterrupt(interruptobject.toString(), serviceroutine.toLong().toString(), servicecontext.toString(), spinlock.toString(), vector.toInt(), irql.toInt(), synchronizeirql.toInt(), interruptmode, sharevector, processorenablemask.toString(), floatingsave) as Int) else 0

public actual fun IoConnectInterruptEx(parameters: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoConnectInterruptEx(parameters.toString()) as Int) else 0

public actual fun IoCreateController(size: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateController(size.toInt()) as String).toLong() else 0L

public actual fun IoCreateDevice(driverobject: Long, deviceextensionsize: UInt, devicename: Long, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateDevice(driverobject.toString(), deviceextensionsize.toInt(), devicename.toString(), devicetype.toInt(), devicecharacteristics.toInt(), exclusive, deviceobject.toString()) as Int) else 0

public actual fun IoCreateDisk(deviceobject: Long, disk: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateDisk(deviceobject.toString(), disk.toString()) as Int) else 0

public actual fun IoCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateFile(filehandle.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), allocationsize.toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.toString(), ealength.toInt(), createfiletype, internalparameters.toString(), options.toInt()) as Int) else 0

public actual fun IoCreateFileEx(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, drivercontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateFileEx(filehandle.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), allocationsize.toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.toString(), ealength.toInt(), createfiletype, internalparameters.toString(), options.toInt(), drivercontext.toString()) as Int) else 0

public actual fun IoCreateFileSpecifyDeviceObjectHint(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, deviceobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateFileSpecifyDeviceObjectHint(filehandle.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), allocationsize.toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.toString(), ealength.toInt(), createfiletype, internalparameters.toString(), options.toInt(), deviceobject.toString()) as Int) else 0

public actual fun IoCreateNotificationEvent(eventname: Long, eventhandle: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateNotificationEvent(eventname.toString(), eventhandle.toString()) as String).toLong() else 0L

public actual fun IoCreateSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateSymbolicLink(symboliclinkname.toString(), devicename.toString()) as Int) else 0

public actual fun IoCreateSynchronizationEvent(eventname: Long, eventhandle: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateSynchronizationEvent(eventname.toString(), eventhandle.toString()) as String).toLong() else 0L

public actual fun IoCreateSystemThread(ioobject: Long, threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateSystemThread(ioobject.toString(), threadhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), processhandle.toString(), clientid.toString(), startroutine.toLong().toString(), startcontext.toString()) as Int) else 0

public actual fun IoCreateUnprotectedSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCreateUnprotectedSymbolicLink(symboliclinkname.toString(), devicename.toString()) as Int) else 0

public actual fun IoCsqInitialize(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCsqInitialize(csq.toString(), csqinsertirp.toLong().toString(), csqremoveirp.toLong().toString(), csqpeeknextirp.toLong().toString(), csqacquirelock.toLong().toString(), csqreleaselock.toLong().toString(), csqcompletecanceledirp.toLong().toString()) as Int) else 0

public actual fun IoCsqInitializeEx(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP_EX, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCsqInitializeEx(csq.toString(), csqinsertirp.toLong().toString(), csqremoveirp.toLong().toString(), csqpeeknextirp.toLong().toString(), csqacquirelock.toLong().toString(), csqreleaselock.toLong().toString(), csqcompletecanceledirp.toLong().toString()) as Int) else 0

public actual fun IoCsqInsertIrp(csq: Long, irp: Long, context: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCsqInsertIrp(csq.toString(), irp.toString(), context.toString())
    }
}

public actual fun IoCsqInsertIrpEx(csq: Long, irp: Long, context: Long, insertcontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCsqInsertIrpEx(csq.toString(), irp.toString(), context.toString(), insertcontext.toString()) as Int) else 0

public actual fun IoCsqRemoveIrp(csq: Long, context: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCsqRemoveIrp(csq.toString(), context.toString()) as String).toLong() else 0L

public actual fun IoCsqRemoveNextIrp(csq: Long, peekcontext: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoCsqRemoveNextIrp(csq.toString(), peekcontext.toString()) as String).toLong() else 0L

public actual fun IoDecrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoDecrementKeepAliveCount(fileobject.toString(), process.toString()) as Int) else 0

public actual fun IoDeleteController(controllerobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoDeleteController(controllerobject.toString())
    }
}

public actual fun IoDeleteDevice(deviceobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoDeleteDevice(deviceobject.toString())
    }
}

public actual fun IoDeleteSymbolicLink(symboliclinkname: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoDeleteSymbolicLink(symboliclinkname.toString()) as Int) else 0

public actual fun IoDetachDevice(targetdevice: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoDetachDevice(targetdevice.toString())
    }
}

public actual fun IoDisconnectInterrupt(interruptobject: PKINTERRUPT) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoDisconnectInterrupt(interruptobject.toString())
    }
}

public actual fun IoDisconnectInterruptEx(parameters: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoDisconnectInterruptEx(parameters.toString())
    }
}

public actual fun IoEnumerateKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, callback: PIO_PERSISTED_MEMORY_ENUMERATION_CALLBACK, callbackcontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoEnumerateKsrPersistentMemoryEx(driverobject.toString(), physicaldeviceobject.toString(), physicaldeviceid.toString(), callback.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun IoFlushAdapterBuffers(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: UInt, writetodevice: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoFlushAdapterBuffers(adapterobject.toString(), mdl.toString(), mapregisterbase.toString(), currentva.toString(), length.toInt(), writetodevice) as Boolean) else false

public actual fun IoForwardIrpSynchronously(deviceobject: Long, irp: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoForwardIrpSynchronously(deviceobject.toString(), irp.toString()) as Boolean) else false

public actual fun IoFreeAdapterChannel(adapterobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoFreeAdapterChannel(adapterobject.toString())
    }
}

public actual fun IoFreeController(controllerobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoFreeController(controllerobject.toString())
    }
}

public actual fun IoFreeErrorLogEntry(elentry: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoFreeErrorLogEntry(elentry.toString())
    }
}

public actual fun IoFreeIrp(irp: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoFreeIrp(irp.toString())
    }
}

public actual fun IoFreeKsrPersistentMemory(datahandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoFreeKsrPersistentMemory(datahandle.toString()) as Int) else 0

public actual fun IoFreeMapRegisters(adapterobject: Long, mapregisterbase: Long, numberofmapregisters: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoFreeMapRegisters(adapterobject.toString(), mapregisterbase.toString(), numberofmapregisters.toInt())
    }
}

public actual fun IoFreeMdl(mdl: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoFreeMdl(mdl.toString())
    }
}

public actual fun IoFreeSfioStreamIdentifier(fileobject: Long, signature: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoFreeSfioStreamIdentifier(fileobject.toString(), signature.toString()) as Int) else 0

public actual fun IoFreeWorkItem(ioworkitem: PIO_WORKITEM) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoFreeWorkItem(ioworkitem.toString())
    }
}

public actual fun IoGetActivityIdIrp(irp: Long, guid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetActivityIdIrp(irp.toString(), guid.toString()) as Int) else 0

public actual fun IoGetActivityIdThread(): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetActivityIdThread() as String).toLong() else 0L

public actual fun IoGetAffinityInterrupt(interruptobject: PKINTERRUPT, groupaffinity: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetAffinityInterrupt(interruptobject.toString(), groupaffinity.toString()) as Int) else 0

public actual fun IoGetAttachedDeviceReference(deviceobject: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetAttachedDeviceReference(deviceobject.toString()) as String).toLong() else 0L

public actual fun IoGetBootDiskInformation(bootdiskinformation: Long, size: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetBootDiskInformation(bootdiskinformation.toString(), size.toInt()) as Int) else 0

public actual fun IoGetBootDiskInformationLite(bootdiskinformation: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetBootDiskInformationLite(bootdiskinformation.toString()) as Int) else 0

public actual fun IoGetConfigurationInformation(): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetConfigurationInformation() as String).toLong() else 0L

public actual fun IoGetContainerInformation(informationclass: IO_CONTAINER_INFORMATION_CLASS, containerobject: Long, buffer: Long, bufferlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetContainerInformation(informationclass, containerobject.toString(), buffer.toString(), bufferlength.toInt()) as Int) else 0

public actual fun IoGetCurrentProcess(): PEPROCESS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetCurrentProcess() as String).toLong() else 0L

public actual fun IoGetDeviceDirectory(physicaldeviceobject: Long, directorytype: DEVICE_DIRECTORY_TYPE, flags: UInt, reserved: Long, devicedirectoryhandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDeviceDirectory(physicaldeviceobject.toString(), directorytype, flags.toInt(), reserved.toString(), devicedirectoryhandle.toString()) as Int) else 0

public actual fun IoGetDeviceInterfaceAlias(symboliclinkname: Long, aliasinterfaceclassguid: Long, aliassymboliclinkname: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfaceAlias(symboliclinkname.toString(), aliasinterfaceclassguid.toString(), aliassymboliclinkname.toString()) as Int) else 0

public actual fun IoGetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfacePropertyData(symboliclinkname.toString(), propertykey.toString(), lcid.toInt(), flags.toInt(), size.toInt(), data.toString(), requiredsize.toString(), type.toString()) as Int) else 0

public actual fun IoGetDeviceInterfaces(interfaceclassguid: Long, physicaldeviceobject: Long, flags: UInt, symboliclinklist: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfaces(interfaceclassguid.toString(), physicaldeviceobject.toString(), flags.toInt(), symboliclinklist.toString()) as Int) else 0

public actual fun IoGetDeviceNumaNode(pdo: Long, nodenumber: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDeviceNumaNode(pdo.toString(), nodenumber.toString()) as Int) else 0

public actual fun IoGetDeviceObjectPointer(objectname: Long, desiredaccess: UInt, fileobject: Long, deviceobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDeviceObjectPointer(objectname.toString(), desiredaccess.toInt(), fileobject.toString(), deviceobject.toString()) as Int) else 0

public actual fun IoGetDeviceProperty(deviceobject: Long, deviceproperty: DEVICE_REGISTRY_PROPERTY, bufferlength: UInt, propertybuffer: Long, resultlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDeviceProperty(deviceobject.toString(), deviceproperty, bufferlength.toInt(), propertybuffer.toString(), resultlength.toString()) as Int) else 0

public actual fun IoGetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDevicePropertyData(pdo.toString(), propertykey.toString(), lcid.toInt(), flags.toInt(), size.toInt(), data.toString(), requiredsize.toString(), type.toString()) as Int) else 0

public actual fun IoGetDmaAdapter(physicaldeviceobject: Long, devicedescription: Long, numberofmapregisters: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDmaAdapter(physicaldeviceobject.toString(), devicedescription.toString(), numberofmapregisters.toString()) as String).toLong() else 0L

public actual fun IoGetDriverDirectory(driverobject: Long, directorytype: DRIVER_DIRECTORY_TYPE, flags: UInt, driverdirectoryhandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDriverDirectory(driverobject.toString(), directorytype, flags.toInt(), driverdirectoryhandle.toString()) as Int) else 0

public actual fun IoGetDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetDriverObjectExtension(driverobject.toString(), clientidentificationaddress.toString()) as String).toLong() else 0L

public actual fun IoGetFileObjectGenericMapping(): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetFileObjectGenericMapping() as String).toLong() else 0L

public actual fun IoGetFsZeroingOffset(irp: Long, zeroingoffset: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetFsZeroingOffset(irp.toString(), zeroingoffset.toString()) as Int) else 0

public actual fun IoGetInitialStack(): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetInitialStack() as String).toLong() else 0L

public actual fun IoGetInitiatorProcess(fileobject: Long): PEPROCESS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetInitiatorProcess(fileobject.toString()) as String).toLong() else 0L

public actual fun IoGetIoAttributionHandle(irp: Long, ioattributionhandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetIoAttributionHandle(irp.toString(), ioattributionhandle.toString()) as Int) else 0

public actual fun IoGetIoPriorityHint(irp: Long): IO_PRIORITY_HINT =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetIoPriorityHint(irp.toString()) as Int) else 0

public actual fun IoGetIommuInterface(version: UInt, interfaceout: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetIommuInterface(version.toInt(), interfaceout.toString()) as Int) else 0

public actual fun IoGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetIommuInterfaceEx(version.toInt(), flags.toString(), interfaceout.toString()) as Int) else 0

public actual fun IoGetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetIrpExtraCreateParameter(irp.toString(), extracreateparameter.toString()) as Int) else 0

public actual fun IoGetPagingIoPriority(irp: Long): IO_PAGING_PRIORITY =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetPagingIoPriority(irp.toString()) as Int) else 0

public actual fun IoGetRelatedDeviceObject(fileobject: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetRelatedDeviceObject(fileobject.toString()) as String).toLong() else 0L

public actual fun IoGetSfioStreamIdentifier(fileobject: Long, signature: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetSfioStreamIdentifier(fileobject.toString(), signature.toString()) as String).toLong() else 0L

public actual fun IoGetSilo(fileobject: Long): PESILO =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetSilo(fileobject.toString()) as String).toLong() else 0L

public actual fun IoGetSiloParameters(fileobject: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetSiloParameters(fileobject.toString()) as String).toLong() else 0L

public actual fun IoGetStackLimits(lowlimit: Long, highlimit: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetStackLimits(lowlimit.toString(), highlimit.toString())
    }
}

public actual fun IoGetTopLevelIrp(): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetTopLevelIrp() as String).toLong() else 0L

public actual fun IoGetTransactionParameterBlock(fileobject: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoGetTransactionParameterBlock(fileobject.toString()) as String).toLong() else 0L

public actual fun IoIncrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoIncrementKeepAliveCount(fileobject.toString(), process.toString()) as Int) else 0

public actual fun IoInitializeIrp(irp: Long, packetsize: UShort, stacksize: Byte) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoInitializeIrp(irp.toString(), packetsize.toInt(), stacksize.toInt())
    }
}

public actual fun IoInitializeIrpEx(irp: Long, deviceobject: Long, packetsize: UShort, stacksize: Byte) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoInitializeIrpEx(irp.toString(), deviceobject.toString(), packetsize.toInt(), stacksize.toInt())
    }
}

public actual fun IoInitializeRemoveLockEx(lock: Long, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoInitializeRemoveLockEx(lock.toString(), allocatetag.toInt(), maxlockedminutes.toInt(), highwatermark.toInt(), remlocksize.toInt())
    }
}

public actual fun IoInitializeTimer(deviceobject: Long, timerroutine: PIO_TIMER_ROUTINE, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoInitializeTimer(deviceobject.toString(), timerroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun IoInitializeWorkItem(ioobject: Long, ioworkitem: PIO_WORKITEM) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoInitializeWorkItem(ioobject.toString(), ioworkitem.toString())
    }
}

public actual fun IoInvalidateDeviceRelations(deviceobject: Long, type: DEVICE_RELATION_TYPE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoInvalidateDeviceRelations(deviceobject.toString(), type)
    }
}

public actual fun IoInvalidateDeviceState(physicaldeviceobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoInvalidateDeviceState(physicaldeviceobject.toString())
    }
}

public actual fun IoIs32bitProcess(irp: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoIs32bitProcess(irp.toString()) as Boolean) else false

public actual fun IoIsFileObjectIgnoringSharing(fileobject: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoIsFileObjectIgnoringSharing(fileobject.toString()) as Boolean) else false

public actual fun IoIsFileOriginRemote(fileobject: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoIsFileOriginRemote(fileobject.toString()) as Boolean) else false

public actual fun IoIsInitiator32bitProcess(irp: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoIsInitiator32bitProcess(irp.toString()) as Boolean) else false

public actual fun IoIsValidIrpStatus(status: NTSTATUS): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoIsValidIrpStatus(status) as Int).toUInt() else 0u

public actual fun IoIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoIsWdmVersionAvailable(majorversion.toInt(), minorversion.toInt()) as Boolean) else false

public actual fun IoMakeAssociatedIrp(irp: Long, stacksize: Byte): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoMakeAssociatedIrp(irp.toString(), stacksize.toInt()) as String).toLong() else 0L

public actual fun IoMakeAssociatedIrpEx(irp: Long, deviceobject: Long, stacksize: Byte): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoMakeAssociatedIrpEx(irp.toString(), deviceobject.toString(), stacksize.toInt()) as String).toLong() else 0L

public actual fun IoMapTransfer(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Long, writetodevice: Boolean): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoMapTransfer(adapterobject.toString(), mdl.toString(), mapregisterbase.toString(), currentva.toString(), length.toString(), writetodevice) as String).toLong() else 0L

public actual fun IoOpenDeviceInterfaceRegistryKey(symboliclinkname: Long, desiredaccess: UInt, deviceinterfaceregkey: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoOpenDeviceInterfaceRegistryKey(symboliclinkname.toString(), desiredaccess.toInt(), deviceinterfaceregkey.toString()) as Int) else 0

public actual fun IoOpenDeviceRegistryKey(deviceobject: Long, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoOpenDeviceRegistryKey(deviceobject.toString(), devinstkeytype.toInt(), desiredaccess.toInt(), deviceregkey.toString()) as Int) else 0

public actual fun IoOpenDriverRegistryKey(driverobject: Long, regkeytype: DRIVER_REGKEY_TYPE, desiredaccess: UInt, flags: UInt, driverregkey: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoOpenDriverRegistryKey(driverobject.toString(), regkeytype, desiredaccess.toInt(), flags.toInt(), driverregkey.toString()) as Int) else 0

public actual fun IoPropagateActivityIdToThread(irp: Long, propagatedid: Long, originalid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoPropagateActivityIdToThread(irp.toString(), propagatedid.toString(), originalid.toString()) as Int) else 0

public actual fun IoQueryDeviceDescription(bustype: Long, busnumber: Long, controllertype: Long, controllernumber: Long, peripheraltype: Long, peripheralnumber: Long, calloutroutine: PIO_QUERY_DEVICE_ROUTINE, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoQueryDeviceDescription(bustype.toString(), busnumber.toString(), controllertype.toString(), controllernumber.toString(), peripheraltype.toString(), peripheralnumber.toString(), calloutroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun IoQueryFullDriverPath(driverobject: Long, fullpath: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoQueryFullDriverPath(driverobject.toString(), fullpath.toString()) as Int) else 0

public actual fun IoQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, options: UInt, drivercontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoQueryInformationByName(objectattributes.toString(), iostatusblock.toString(), fileinformation.toString(), length.toInt(), fileinformationclass, options.toInt(), drivercontext.toString()) as Int) else 0

public actual fun IoQueryKsrPersistentMemorySize(driverobject: Long, physicaldeviceobject: Long, buffersize: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoQueryKsrPersistentMemorySize(driverobject.toString(), physicaldeviceobject.toString(), buffersize.toString()) as Int) else 0

public actual fun IoQueryKsrPersistentMemorySizeEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffersize: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoQueryKsrPersistentMemorySizeEx(driverobject.toString(), physicaldeviceobject.toString(), physicaldeviceid.toString(), datatag.toString(), dataversion.toString(), buffersize.toString()) as Int) else 0

public actual fun IoQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoQueueWorkItem(ioworkitem.toString(), workerroutine.toLong().toString(), queuetype, context.toString())
    }
}

public actual fun IoQueueWorkItemEx(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoQueueWorkItemEx(ioworkitem.toString(), workerroutine.toLong().toString(), queuetype, context.toString())
    }
}

public actual fun IoRaiseHardError(irp: Long, vpb: Long, realdeviceobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRaiseHardError(irp.toString(), vpb.toString(), realdeviceobject.toString())
    }
}

public actual fun IoRaiseInformationalHardError(errorstatus: NTSTATUS, string: Long, thread: PKTHREAD): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRaiseInformationalHardError(errorstatus, string.toString(), thread.toString()) as Boolean) else false

public actual fun IoReadDiskSignature(deviceobject: Long, bytespersector: UInt, signature: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReadDiskSignature(deviceobject.toString(), bytespersector.toInt(), signature.toString()) as Int) else 0

public actual fun IoReadPartitionTable(deviceobject: Long, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReadPartitionTable(deviceobject.toString(), sectorsize.toInt(), returnrecognizedpartitions, partitionbuffer.toString()) as Int) else 0

public actual fun IoReadPartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReadPartitionTableEx(deviceobject.toString(), drivelayout.toString()) as Int) else 0

public actual fun IoRecordIoAttribution(opaquehandle: Long, attributioninformation: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRecordIoAttribution(opaquehandle.toString(), attributioninformation.toString()) as Int) else 0

public actual fun IoRegisterBootDriverCallback(callbackfunction: PBOOT_DRIVER_CALLBACK_FUNCTION, callbackcontext: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRegisterBootDriverCallback(callbackfunction.toLong().toString(), callbackcontext.toString()) as String).toLong() else 0L

public actual fun IoRegisterBootDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long) {
}

public actual fun IoRegisterContainerNotification(notificationclass: IO_CONTAINER_NOTIFICATION_CLASS, callbackfunction: PIO_CONTAINER_NOTIFICATION_FUNCTION, notificationinformation: Long, notificationinformationlength: UInt, callbackregistration: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRegisterContainerNotification(notificationclass, callbackfunction.toLong().toString(), notificationinformation.toString(), notificationinformationlength.toInt(), callbackregistration.toString()) as Int) else 0

public actual fun IoRegisterDeviceInterface(physicaldeviceobject: Long, interfaceclassguid: Long, referencestring: Long, symboliclinkname: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRegisterDeviceInterface(physicaldeviceobject.toString(), interfaceclassguid.toString(), referencestring.toString(), symboliclinkname.toString()) as Int) else 0

public actual fun IoRegisterDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long) {
}

public actual fun IoRegisterLastChanceShutdownNotification(deviceobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRegisterLastChanceShutdownNotification(deviceobject.toString()) as Int) else 0

public actual fun IoRegisterPlugPlayNotification(eventcategory: IO_NOTIFICATION_EVENT_CATEGORY, eventcategoryflags: UInt, eventcategorydata: Long, driverobject: Long, callbackroutine: DRIVER_NOTIFICATION_CALLBACK_ROUTINE, context: Long, notificationentry: Long): NTSTATUS =
    0

public actual fun IoRegisterShutdownNotification(deviceobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRegisterShutdownNotification(deviceobject.toString()) as Int) else 0

public actual fun IoReleaseCancelSpinLock(irql: UByte) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReleaseCancelSpinLock(irql.toInt())
    }
}

public actual fun IoReleaseRemoveLockAndWaitEx(removelock: Long, tag: Long, remlocksize: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReleaseRemoveLockAndWaitEx(removelock.toString(), tag.toString(), remlocksize.toInt())
    }
}

public actual fun IoReleaseRemoveLockEx(removelock: Long, tag: Long, remlocksize: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReleaseRemoveLockEx(removelock.toString(), tag.toString(), remlocksize.toInt())
    }
}

public actual fun IoRemoveLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRemoveLinkShareAccess(fileobject.toString(), shareaccess.toString(), linkshareaccess.toString())
    }
}

public actual fun IoRemoveLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRemoveLinkShareAccessEx(fileobject.toString(), shareaccess.toString(), linkshareaccess.toString(), ioshareaccessflags.toInt())
    }
}

public actual fun IoRemoveShareAccess(fileobject: Long, shareaccess: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRemoveShareAccess(fileobject.toString(), shareaccess.toString())
    }
}

public actual fun IoReplacePartitionUnit(targetpdo: Long, sparepdo: Long, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReplacePartitionUnit(targetpdo.toString(), sparepdo.toString(), flags.toInt()) as Int) else 0

public actual fun IoReportDetectedDevice(driverobject: Long, legacybustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, resourcelist: Long, resourcerequirements: Long, resourceassigned: Boolean, deviceobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReportDetectedDevice(driverobject.toString(), legacybustype, busnumber.toInt(), slotnumber.toInt(), resourcelist.toString(), resourcerequirements.toString(), resourceassigned, deviceobject.toString()) as Int) else 0

public actual fun IoReportInterruptActive(parameters: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReportInterruptActive(parameters.toString())
    }
}

public actual fun IoReportInterruptInactive(parameters: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReportInterruptInactive(parameters.toString())
    }
}

public actual fun IoReportResourceForDetection(driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, conflictdetected: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReportResourceForDetection(driverobject.toString(), driverlist.toString(), driverlistsize.toInt(), deviceobject.toString(), devicelist.toString(), devicelistsize.toInt(), conflictdetected.toString()) as Int) else 0

public actual fun IoReportResourceUsage(driverclassname: Long, driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReportResourceUsage(driverclassname.toString(), driverobject.toString(), driverlist.toString(), driverlistsize.toInt(), deviceobject.toString(), devicelist.toString(), devicelistsize.toInt(), overrideconflict, conflictdetected.toString()) as Int) else 0

public actual fun IoReportRootDevice(driverobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReportRootDevice(driverobject.toString()) as Int) else 0

public actual fun IoReportTargetDeviceChange(physicaldeviceobject: Long, notificationstructure: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReportTargetDeviceChange(physicaldeviceobject.toString(), notificationstructure.toString()) as Int) else 0

public actual fun IoReportTargetDeviceChangeAsynchronous(physicaldeviceobject: Long, notificationstructure: Long, callback: PDEVICE_CHANGE_COMPLETE_CALLBACK, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReportTargetDeviceChangeAsynchronous(physicaldeviceobject.toString(), notificationstructure.toString(), callback.toLong().toString(), context.toString()) as Int) else 0

public actual fun IoRequestDeviceEject(physicaldeviceobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRequestDeviceEject(physicaldeviceobject.toString())
    }
}

public actual fun IoRequestDeviceEjectEx(physicaldeviceobject: Long, callback: PIO_DEVICE_EJECT_CALLBACK, context: Long, driverobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoRequestDeviceEjectEx(physicaldeviceobject.toString(), callback.toLong().toString(), context.toString(), driverobject.toString()) as Int) else 0

public actual fun IoReserveKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, size: ULong, flags: UInt, datahandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReserveKsrPersistentMemory(driverobject.toString(), physicaldeviceobject.toString(), size.toString(), flags.toInt(), datahandle.toString()) as Int) else 0

public actual fun IoReserveKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: UInt, size: ULong, flags: UInt, datahandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReserveKsrPersistentMemoryEx(driverobject.toString(), physicaldeviceobject.toString(), physicaldeviceid.toString(), datatag.toString(), dataversion.toInt(), size.toString(), flags.toInt(), datahandle.toString()) as Int) else 0

public actual fun IoReuseIrp(irp: Long, iostatus: NTSTATUS) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoReuseIrp(irp.toString(), iostatus)
    }
}

public actual fun IoSetActivityIdIrp(irp: Long, guid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetActivityIdIrp(irp.toString(), guid.toString()) as Int) else 0

public actual fun IoSetActivityIdThread(activityid: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetActivityIdThread(activityid.toString()) as String).toLong() else 0L

public actual fun IoSetCompletionRoutineEx(deviceobject: Long, irp: Long, completionroutine: PIO_COMPLETION_ROUTINE, context: Long, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): NTSTATUS =
    0

public actual fun IoSetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetDeviceInterfacePropertyData(symboliclinkname.toString(), propertykey.toString(), lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data.toString()) as Int) else 0

public actual fun IoSetDeviceInterfaceState(symboliclinkname: Long, enable: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetDeviceInterfaceState(symboliclinkname.toString(), enable) as Int) else 0

public actual fun IoSetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetDevicePropertyData(pdo.toString(), propertykey.toString(), lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data.toString()) as Int) else 0

public actual fun IoSetFileObjectIgnoreSharing(fileobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetFileObjectIgnoreSharing(fileobject.toString()) as Int) else 0

public actual fun IoSetFileOrigin(fileobject: Long, remote: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetFileOrigin(fileobject.toString(), remote) as Int) else 0

public actual fun IoSetFsZeroingOffset(irp: Long, zeroingoffset: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetFsZeroingOffset(irp.toString(), zeroingoffset.toInt()) as Int) else 0

public actual fun IoSetFsZeroingOffsetRequired(irp: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetFsZeroingOffsetRequired(irp.toString()) as Int) else 0

public actual fun IoSetHardErrorOrVerifyDevice(irp: Long, deviceobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetHardErrorOrVerifyDevice(irp.toString(), deviceobject.toString())
    }
}

public actual fun IoSetIoAttributionIrp(irp: Long, attributionsource: Long, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetIoAttributionIrp(irp.toString(), attributionsource.toString(), flags.toInt()) as Int) else 0

public actual fun IoSetIoPriorityHint(irp: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetIoPriorityHint(irp.toString(), priorityhint) as Int) else 0

public actual fun IoSetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetIrpExtraCreateParameter(irp.toString(), extracreateparameter.toString()) as Int) else 0

public actual fun IoSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.toString(), shareaccess.toString(), linkshareaccess.toString(), ioshareaccessflags.toInt())
    }
}

public actual fun IoSetMasterIrpStatus(masterirp: Long, status: NTSTATUS) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetMasterIrpStatus(masterirp.toString(), status)
    }
}

public actual fun IoSetPartitionInformation(deviceobject: Long, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetPartitionInformation(deviceobject.toString(), sectorsize.toInt(), partitionnumber.toInt(), partitiontype.toInt()) as Int) else 0

public actual fun IoSetPartitionInformationEx(deviceobject: Long, partitionnumber: UInt, partitioninfo: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetPartitionInformationEx(deviceobject.toString(), partitionnumber.toInt(), partitioninfo.toString()) as Int) else 0

public actual fun IoSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.toString(), shareaccess.toString())
    }
}

public actual fun IoSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, writepermission: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.toString(), shareaccess.toString(), writepermission.toString())
    }
}

public actual fun IoSetStartIoAttributes(deviceobject: Long, deferredstartio: Boolean, noncancelable: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetStartIoAttributes(deviceobject.toString(), deferredstartio, noncancelable)
    }
}

public actual fun IoSetSystemPartition(volumenamestring: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetSystemPartition(volumenamestring.toString()) as Int) else 0

public actual fun IoSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetThreadHardErrorMode(enableharderrors) as Boolean) else false

public actual fun IoSetTopLevelIrp(irp: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSetTopLevelIrp(irp.toString())
    }
}

public actual fun IoSizeOfIrpEx(deviceobject: Long, stacksize: Byte): UShort =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSizeOfIrpEx(deviceobject.toString(), stacksize.toInt()) as Int).toUShort() else 0u

public actual fun IoSizeofWorkItem(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSizeofWorkItem() as Int).toUInt() else 0u

public actual fun IoStartNextPacket(deviceobject: Long, cancelable: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoStartNextPacket(deviceobject.toString(), cancelable)
    }
}

public actual fun IoStartNextPacketByKey(deviceobject: Long, cancelable: Boolean, key: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoStartNextPacketByKey(deviceobject.toString(), cancelable, key.toInt())
    }
}

public actual fun IoStartPacket(deviceobject: Long, irp: Long, key: Long, cancelfunction: DRIVER_CANCEL) {
}

public actual fun IoStartTimer(deviceobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoStartTimer(deviceobject.toString())
    }
}

public actual fun IoStopTimer(deviceobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoStopTimer(deviceobject.toString())
    }
}

public actual fun IoSynchronousCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoSynchronousCallDriver(deviceobject.toString(), irp.toString()) as Int) else 0

public actual fun IoTransferActivityId(activityid: Long, relatedactivityid: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoTransferActivityId(activityid.toString(), relatedactivityid.toString())
    }
}

public actual fun IoTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress.toString(), addressspace.toString(), translatedaddress.toString()) as Boolean) else false

public actual fun IoTryQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoTryQueueWorkItem(ioworkitem.toString(), workerroutine.toLong().toString(), queuetype, context.toString()) as Boolean) else false

public actual fun IoUninitializeWorkItem(ioworkitem: PIO_WORKITEM) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoUninitializeWorkItem(ioworkitem.toString())
    }
}

public actual fun IoUnregisterBootDriverCallback(callbackhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoUnregisterBootDriverCallback(callbackhandle.toString())
    }
}

public actual fun IoUnregisterContainerNotification(callbackregistration: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoUnregisterContainerNotification(callbackregistration.toString())
    }
}

public actual fun IoUnregisterPlugPlayNotification(notificationentry: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoUnregisterPlugPlayNotification(notificationentry.toString()) as Int) else 0

public actual fun IoUnregisterPlugPlayNotificationEx(notificationentry: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoUnregisterPlugPlayNotificationEx(notificationentry.toString()) as Int) else 0

public actual fun IoUnregisterShutdownNotification(deviceobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoUnregisterShutdownNotification(deviceobject.toString())
    }
}

public actual fun IoUpdateLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoUpdateLinkShareAccess(fileobject.toString(), shareaccess.toString(), linkshareaccess.toString())
    }
}

public actual fun IoUpdateLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoUpdateLinkShareAccessEx(fileobject.toString(), shareaccess.toString(), linkshareaccess.toString(), ioshareaccessflags.toInt())
    }
}

public actual fun IoUpdateShareAccess(fileobject: Long, shareaccess: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoUpdateShareAccess(fileobject.toString(), shareaccess.toString())
    }
}

public actual fun IoValidateDeviceIoControlAccess(irp: Long, requiredaccess: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoValidateDeviceIoControlAccess(irp.toString(), requiredaccess.toInt()) as Int) else 0

public actual fun IoVerifyPartitionTable(deviceobject: Long, fixerrors: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoVerifyPartitionTable(deviceobject.toString(), fixerrors) as Int) else 0

public actual fun IoVolumeDeviceNameToGuid(volumedevicename: Long, guid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceNameToGuid(volumedevicename.toString(), guid.toString()) as Int) else 0

public actual fun IoVolumeDeviceNameToGuidPath(volumedevicename: Long, guidpath: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceNameToGuidPath(volumedevicename.toString(), guidpath.toString()) as Int) else 0

public actual fun IoVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToDosName(volumedeviceobject.toString(), dosname.toString()) as Int) else 0

public actual fun IoVolumeDeviceToGuid(volumedeviceobject: Long, guid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToGuid(volumedeviceobject.toString(), guid.toString()) as Int) else 0

public actual fun IoVolumeDeviceToGuidPath(volumedeviceobject: Long, guidpath: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToGuidPath(volumedeviceobject.toString(), guidpath.toString()) as Int) else 0

public actual fun IoWMIAllocateInstanceIds(guid: Long, instancecount: UInt, firstinstanceid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIAllocateInstanceIds(guid.toString(), instancecount.toInt(), firstinstanceid.toString()) as Int) else 0

public actual fun IoWMIDeviceObjectToInstanceName(datablockobject: Long, deviceobject: Long, instancename: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIDeviceObjectToInstanceName(datablockobject.toString(), deviceobject.toString(), instancename.toString()) as Int) else 0

public actual fun IoWMIExecuteMethod(datablockobject: Long, instancename: Long, methodid: UInt, inbuffersize: UInt, outbuffersize: Long, inoutbuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIExecuteMethod(datablockobject.toString(), instancename.toString(), methodid.toInt(), inbuffersize.toInt(), outbuffersize.toString(), inoutbuffer.toString()) as Int) else 0

public actual fun IoWMIHandleToInstanceName(datablockobject: Long, filehandle: HANDLE, instancename: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIHandleToInstanceName(datablockobject.toString(), filehandle.toString(), instancename.toString()) as Int) else 0

public actual fun IoWMIOpenBlock(guid: Long, desiredaccess: UInt, datablockobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIOpenBlock(guid.toString(), desiredaccess.toInt(), datablockobject.toString()) as Int) else 0

public actual fun IoWMIQueryAllData(datablockobject: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIQueryAllData(datablockobject.toString(), inoutbuffersize.toString(), outbuffer.toString()) as Int) else 0

public actual fun IoWMIQueryAllDataMultiple(datablockobjectlist: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIQueryAllDataMultiple(datablockobjectlist.toString(), objectcount.toInt(), inoutbuffersize.toString(), outbuffer.toString()) as Int) else 0

public actual fun IoWMIQuerySingleInstance(datablockobject: Long, instancename: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIQuerySingleInstance(datablockobject.toString(), instancename.toString(), inoutbuffersize.toString(), outbuffer.toString()) as Int) else 0

public actual fun IoWMIQuerySingleInstanceMultiple(datablockobjectlist: Long, instancenames: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIQuerySingleInstanceMultiple(datablockobjectlist.toString(), instancenames.toString(), objectcount.toInt(), inoutbuffersize.toString(), outbuffer.toString()) as Int) else 0

public actual fun IoWMIRegistrationControl(deviceobject: Long, action: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIRegistrationControl(deviceobject.toString(), action.toInt()) as Int) else 0

public actual fun IoWMISetNotificationCallback(obj: Long, callback: WMI_NOTIFICATION_CALLBACK, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMISetNotificationCallback(obj.toString(), callback.toLong().toString(), context.toString()) as Int) else 0

public actual fun IoWMISetSingleInstance(datablockobject: Long, instancename: Long, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMISetSingleInstance(datablockobject.toString(), instancename.toString(), version.toInt(), valuebuffersize.toInt(), valuebuffer.toString()) as Int) else 0

public actual fun IoWMISetSingleItem(datablockobject: Long, instancename: Long, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMISetSingleItem(datablockobject.toString(), instancename.toString(), dataitemid.toInt(), version.toInt(), valuebuffersize.toInt(), valuebuffer.toString()) as Int) else 0

public actual fun IoWMISuggestInstanceName(physicaldeviceobject: Long, symboliclinkname: Long, combinenames: Boolean, suggestedinstancename: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMISuggestInstanceName(physicaldeviceobject.toString(), symboliclinkname.toString(), combinenames, suggestedinstancename.toString()) as Int) else 0

public actual fun IoWMIWriteEvent(wnodeeventitem: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWMIWriteEvent(wnodeeventitem.toString()) as Int) else 0

public actual fun IoWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWithinStackLimits(regionstart.toString(), regionsize.toString()) as Int).toUInt() else 0u

public actual fun IoWriteErrorLogEntry(elentry: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWriteErrorLogEntry(elentry.toString())
    }
}

public actual fun IoWriteKsrPersistentMemory(datahandle: Long, buffer: Long, size: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWriteKsrPersistentMemory(datahandle.toString(), buffer.toString(), size.toString()) as Int) else 0

public actual fun IoWritePartitionTable(deviceobject: Long, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWritePartitionTable(deviceobject.toString(), sectorsize.toInt(), sectorspertrack.toInt(), numberofheads.toInt(), partitionbuffer.toString()) as Int) else 0

public actual fun IoWritePartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IoWritePartitionTableEx(deviceobject.toString(), drivelayout.toString()) as Int) else 0

public actual fun IofCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IofCallDriver(deviceobject.toString(), irp.toString()) as Int) else 0

public actual fun IofCompleteRequest(irp: Long, priorityboost: Byte) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_IofCompleteRequest(irp.toString(), priorityboost.toInt())
    }
}

public actual fun KdChangeOption(option: KD_OPTION, inbufferbytes: UInt, inbuffer: Long, outbufferbytes: UInt, outbuffer: Long, outbufferneeded: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KdChangeOption(option, inbufferbytes.toInt(), inbuffer.toString(), outbufferbytes.toInt(), outbuffer.toString(), outbufferneeded.toString()) as Int) else 0

public actual fun KdDisableDebugger(): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KdDisableDebugger() as Int) else 0

public actual fun KdEnableDebugger(): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KdEnableDebugger() as Int) else 0

public actual fun KdRefreshDebuggerNotPresent(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KdRefreshDebuggerNotPresent() as Boolean) else false

public actual fun KeAcquireGuardedMutex(mutex: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeAcquireGuardedMutex(mutex.toString())
    }
}

public actual fun KeAcquireGuardedMutexUnsafe(fastmutex: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeAcquireGuardedMutexUnsafe(fastmutex.toString())
    }
}

public actual fun KeAcquireInStackQueuedSpinLock(spinlock: Long, lockhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLock(spinlock.toString(), lockhandle.toString())
    }
}

public actual fun KeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: Long, lockhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock.toString(), lockhandle.toString())
    }
}

public actual fun KeAcquireInStackQueuedSpinLockForDpc(spinlock: Long, lockhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLockForDpc(spinlock.toString(), lockhandle.toString())
    }
}

public actual fun KeAcquireInterruptSpinLock(interrupt: PKINTERRUPT): UByte =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeAcquireInterruptSpinLock(interrupt.toString()) as Int).toUByte() else 0u

public actual fun KeAcquireSpinLockForDpc(spinlock: Long): UByte =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeAcquireSpinLockForDpc(spinlock.toString()) as Int).toUByte() else 0u

public actual fun KeAddTriageDumpDataBlock(ktriagedumpdataarray: Long, address: Long, size: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeAddTriageDumpDataBlock(ktriagedumpdataarray.toString(), address.toString(), size.toString()) as Int) else 0

public actual fun KeAreAllApcsDisabled(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeAreAllApcsDisabled() as Boolean) else false

public actual fun KeAreApcsDisabled(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeAreApcsDisabled() as Boolean) else false

public actual fun KeBugCheck(bugcheckcode: BUGCHECK_ERROR) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeBugCheck(bugcheckcode.toInt())
    }
}

public actual fun KeBugCheckEx(bugcheckcode: BUGCHECK_ERROR, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeBugCheckEx(bugcheckcode.toInt(), bugcheckparameter1.toString(), bugcheckparameter2.toString(), bugcheckparameter3.toString(), bugcheckparameter4.toString())
    }
}

public actual fun KeCancelTimer(param0: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeCancelTimer(param0.toString()) as Boolean) else false

public actual fun KeClearEvent(event: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeClearEvent(event.toString())
    }
}

public actual fun KeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: Long, conversionerror: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue.toString(), performancecountervalue.toString(), conversionerror.toString()) as Int) else 0

public actual fun KeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: Long, conversionerror: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue.toString(), auxiliarycountervalue.toString(), conversionerror.toString()) as Int) else 0

public actual fun KeDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeDelayExecutionThread(waitmode.toInt(), alertable, interval.toString()) as Int) else 0

public actual fun KeDeregisterBoundCallback(handle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeDeregisterBoundCallback(handle.toString()) as Int) else 0

public actual fun KeDeregisterBugCheckCallback(callbackrecord: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeDeregisterBugCheckCallback(callbackrecord.toString()) as Boolean) else false

public actual fun KeDeregisterBugCheckReasonCallback(callbackrecord: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeDeregisterBugCheckReasonCallback(callbackrecord.toString()) as Boolean) else false

public actual fun KeDeregisterNmiCallback(handle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeDeregisterNmiCallback(handle.toString()) as Int) else 0

public actual fun KeDeregisterProcessorChangeCallback(callbackhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeDeregisterProcessorChangeCallback(callbackhandle.toString())
    }
}

public actual fun KeEnterCriticalRegion() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeEnterCriticalRegion()
    }
}

public actual fun KeEnterGuardedRegion() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeEnterGuardedRegion()
    }
}

public actual fun KeExpandKernelStackAndCallout(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeExpandKernelStackAndCallout(callout.toLong().toString(), parameter.toString(), size.toString()) as Int) else 0

public actual fun KeExpandKernelStackAndCalloutEx(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong, wait: Boolean, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeExpandKernelStackAndCalloutEx(callout.toLong().toString(), parameter.toString(), size.toString(), wait, context.toString()) as Int) else 0

public actual fun KeFlushIoBuffers(mdl: Long, readoperation: Boolean, dmaoperation: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeFlushIoBuffers(mdl.toString(), readoperation, dmaoperation)
    }
}

public actual fun KeFlushQueuedDpcs() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeFlushQueuedDpcs()
    }
}

public actual fun KeFlushWriteBuffer() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeFlushWriteBuffer()
    }
}

public actual fun KeGetCurrentIrql(): UByte =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeGetCurrentIrql() as Int).toUByte() else 0u

public actual fun KeGetCurrentNodeNumber(): UShort =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeGetCurrentNodeNumber() as Int).toUShort() else 0u

public actual fun KeGetCurrentProcessorNumberEx(procnumber: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeGetCurrentProcessorNumberEx(procnumber.toString()) as Int).toUInt() else 0u

public actual fun KeGetProcessorIndexFromNumber(procnumber: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeGetProcessorIndexFromNumber(procnumber.toString()) as Int).toUInt() else 0u

public actual fun KeGetProcessorNumberFromIndex(procindex: UInt, procnumber: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeGetProcessorNumberFromIndex(procindex.toInt(), procnumber.toString()) as Int) else 0

public actual fun KeGetRecommendedSharedDataAlignment(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeGetRecommendedSharedDataAlignment() as Int).toUInt() else 0u

public actual fun KeInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: Long, buffersize: UInt, bufferneeded: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInitializeCrashDumpHeader(dumptype.toInt(), flags.toInt(), buffer.toString(), buffersize.toInt(), bufferneeded.toString()) as Int) else 0

public actual fun KeInitializeDeviceQueue(devicequeue: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInitializeDeviceQueue(devicequeue.toString())
    }
}

public actual fun KeInitializeDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long) {
}

public actual fun KeInitializeEvent(event: Long, type: EVENT_TYPE, state: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInitializeEvent(event.toString(), type, state)
    }
}

public actual fun KeInitializeGuardedMutex(mutex: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInitializeGuardedMutex(mutex.toString())
    }
}

public actual fun KeInitializeMutex(mutex: Long, level: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInitializeMutex(mutex.toString(), level.toInt())
    }
}

public actual fun KeInitializeSemaphore(semaphore: Long, count: Int, limit: Int) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInitializeSemaphore(semaphore.toString(), count, limit)
    }
}

public actual fun KeInitializeSpinLock(spinlock: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInitializeSpinLock(spinlock.toString())
    }
}

public actual fun KeInitializeThreadedDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long) {
}

public actual fun KeInitializeTimer(timer: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInitializeTimer(timer.toString())
    }
}

public actual fun KeInitializeTimerEx(timer: Long, type: TIMER_TYPE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInitializeTimerEx(timer.toString(), type)
    }
}

public actual fun KeInitializeTriageDumpDataArray(ktriagedumpdataarray: Long, size: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInitializeTriageDumpDataArray(ktriagedumpdataarray.toString(), size.toInt()) as Int) else 0

public actual fun KeInsertByKeyDeviceQueue(devicequeue: Long, devicequeueentry: Long, sortkey: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInsertByKeyDeviceQueue(devicequeue.toString(), devicequeueentry.toString(), sortkey.toInt()) as Boolean) else false

public actual fun KeInsertDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInsertDeviceQueue(devicequeue.toString(), devicequeueentry.toString()) as Boolean) else false

public actual fun KeInsertQueueDpc(dpc: Long, systemargument1: Long, systemargument2: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInsertQueueDpc(dpc.toString(), systemargument1.toString(), systemargument2.toString()) as Boolean) else false

public actual fun KeInvalidateAllCaches(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInvalidateAllCaches() as Boolean) else false

public actual fun KeInvalidateRangeAllCaches(baseaddress: Long, length: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeInvalidateRangeAllCaches(baseaddress.toString(), length.toInt())
    }
}

public actual fun KeIpiGenericCall(broadcastfunction: PKIPI_BROADCAST_WORKER, context: ULong): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeIpiGenericCall(broadcastfunction.toLong().toString(), context.toString()) as String).toULong() else 0uL

public actual fun KeIsExecutingDpc(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeIsExecutingDpc() as Int).toUInt() else 0u

public actual fun KeLeaveCriticalRegion() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeLeaveCriticalRegion()
    }
}

public actual fun KeLeaveGuardedRegion() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeLeaveGuardedRegion()
    }
}

public actual fun KePulseEvent(event: Long, increment: Int, wait: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KePulseEvent(event.toString(), increment, wait) as Int) else 0

public actual fun KeQueryActiveGroupCount(): UShort =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryActiveGroupCount() as Int).toUShort() else 0u

public actual fun KeQueryActiveProcessorCount(activeprocessors: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessorCount(activeprocessors.toString()) as Int).toUInt() else 0u

public actual fun KeQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessorCountEx(groupnumber.toInt()) as Int).toUInt() else 0u

public actual fun KeQueryActiveProcessors(): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessors() as String).toULong() else 0uL

public actual fun KeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency.toString()) as Int) else 0

public actual fun KeQueryDpcWatchdogInformation(watchdoginformation: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryDpcWatchdogInformation(watchdoginformation.toString()) as Int) else 0

public actual fun KeQueryGroupAffinity(groupnumber: UShort): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryGroupAffinity(groupnumber.toInt()) as String).toULong() else 0uL

public actual fun KeQueryHardwareCounterConfiguration(counterarray: Long, maximumcount: UInt, count: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryHardwareCounterConfiguration(counterarray.toString(), maximumcount.toInt(), count.toString()) as Int) else 0

public actual fun KeQueryHighestNodeNumber(): UShort =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryHighestNodeNumber() as Int).toUShort() else 0u

public actual fun KeQueryInterruptTimePrecise(qpctimestamp: Long): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryInterruptTimePrecise(qpctimestamp.toString()) as String).toULong() else 0uL

public actual fun KeQueryLogicalProcessorRelationship(processornumber: Long, relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, information: Long, length: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryLogicalProcessorRelationship(processornumber.toString(), relationshiptype, information.toString(), length.toString()) as Int) else 0

public actual fun KeQueryMaximumGroupCount(): UShort =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryMaximumGroupCount() as Int).toUShort() else 0u

public actual fun KeQueryMaximumProcessorCount(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryMaximumProcessorCount() as Int).toUInt() else 0u

public actual fun KeQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryMaximumProcessorCountEx(groupnumber.toInt()) as Int).toUInt() else 0u

public actual fun KeQueryNodeActiveAffinity(nodenumber: UShort, affinity: Long, count: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveAffinity(nodenumber.toInt(), affinity.toString(), count.toString())
    }
}

public actual fun KeQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: Long, groupaffinitiescount: UShort, groupaffinitiesrequired: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveAffinity2(nodenumber.toInt(), groupaffinities.toString(), groupaffinitiescount.toInt(), groupaffinitiesrequired.toString()) as Int) else 0

public actual fun KeQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveProcessorCount(nodenumber.toInt()) as Int).toUInt() else 0u

public actual fun KeQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryNodeMaximumProcessorCount(nodenumber.toInt()) as Int).toUShort() else 0u

public actual fun KeQueryPerformanceCounter(performancefrequency: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryPerformanceCounter(performancefrequency.toString()) as String).toLong() else 0L

public actual fun KeQueryPriorityThread(thread: PKTHREAD): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryPriorityThread(thread.toString()) as Int) else 0

public actual fun KeQueryRuntimeThread(thread: PKTHREAD, usertime: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryRuntimeThread(thread.toString(), usertime.toString()) as Int).toUInt() else 0u

public actual fun KeQuerySystemTimePrecise(currenttime: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQuerySystemTimePrecise(currenttime.toString())
    }
}

public actual fun KeQueryTimeIncrement(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryTimeIncrement() as Int).toUInt() else 0u

public actual fun KeQueryTotalCycleTimeThread(thread: PKTHREAD, cycletimestamp: Long): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryTotalCycleTimeThread(thread.toString(), cycletimestamp.toString()) as String).toULong() else 0uL

public actual fun KeQueryUnbiasedInterruptTime(): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryUnbiasedInterruptTime() as String).toULong() else 0uL

public actual fun KeQueryUnbiasedInterruptTimePrecise(qpctimestamp: Long): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeQueryUnbiasedInterruptTimePrecise(qpctimestamp.toString()) as String).toULong() else 0uL

public actual fun KeReadStateEvent(event: Long): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReadStateEvent(event.toString()) as Int) else 0

public actual fun KeReadStateMutex(mutex: Long): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReadStateMutex(mutex.toString()) as Int) else 0

public actual fun KeReadStateSemaphore(semaphore: Long): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReadStateSemaphore(semaphore.toString()) as Int) else 0

public actual fun KeReadStateTimer(timer: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReadStateTimer(timer.toString()) as Boolean) else false

public actual fun KeRegisterBoundCallback(callbackroutine: PBOUND_CALLBACK): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRegisterBoundCallback(callbackroutine.toLong().toString()) as String).toLong() else 0L

public actual fun KeRegisterBugCheckCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_CALLBACK_ROUTINE, buffer: Long, length: UInt, component: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRegisterBugCheckCallback(callbackrecord.toString(), callbackroutine.toLong().toString(), buffer.toString(), length.toInt(), component.toString()) as Boolean) else false

public actual fun KeRegisterBugCheckReasonCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_REASON_CALLBACK_ROUTINE, reason: KBUGCHECK_CALLBACK_REASON, component: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRegisterBugCheckReasonCallback(callbackrecord.toString(), callbackroutine.toLong().toString(), reason, component.toString()) as Boolean) else false

public actual fun KeRegisterNmiCallback(callbackroutine: PNMI_CALLBACK, context: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRegisterNmiCallback(callbackroutine.toLong().toString(), context.toString()) as String).toLong() else 0L

public actual fun KeRegisterProcessorChangeCallback(callbackfunction: PPROCESSOR_CALLBACK_FUNCTION, callbackcontext: Long, flags: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRegisterProcessorChangeCallback(callbackfunction.toLong().toString(), callbackcontext.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun KeReleaseGuardedMutex(mutex: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReleaseGuardedMutex(mutex.toString())
    }
}

public actual fun KeReleaseGuardedMutexUnsafe(fastmutex: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReleaseGuardedMutexUnsafe(fastmutex.toString())
    }
}

public actual fun KeReleaseInStackQueuedSpinLock(lockhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLock(lockhandle.toString())
    }
}

public actual fun KeReleaseInStackQueuedSpinLockForDpc(lockhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLockForDpc(lockhandle.toString())
    }
}

public actual fun KeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle.toString())
    }
}

public actual fun KeReleaseInterruptSpinLock(interrupt: PKINTERRUPT, oldirql: UByte) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReleaseInterruptSpinLock(interrupt.toString(), oldirql.toInt())
    }
}

public actual fun KeReleaseMutex(mutex: Long, wait: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReleaseMutex(mutex.toString(), wait) as Int) else 0

public actual fun KeReleaseSemaphore(semaphore: Long, increment: Int, adjustment: Int, wait: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReleaseSemaphore(semaphore.toString(), increment, adjustment, wait) as Int) else 0

public actual fun KeReleaseSpinLockForDpc(spinlock: Long, oldirql: UByte) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeReleaseSpinLockForDpc(spinlock.toString(), oldirql.toInt())
    }
}

public actual fun KeRemoveByKeyDeviceQueue(devicequeue: Long, sortkey: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRemoveByKeyDeviceQueue(devicequeue.toString(), sortkey.toInt()) as String).toLong() else 0L

public actual fun KeRemoveByKeyDeviceQueueIfBusy(devicequeue: Long, sortkey: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRemoveByKeyDeviceQueueIfBusy(devicequeue.toString(), sortkey.toInt()) as String).toLong() else 0L

public actual fun KeRemoveDeviceQueue(devicequeue: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRemoveDeviceQueue(devicequeue.toString()) as String).toLong() else 0L

public actual fun KeRemoveEntryDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRemoveEntryDeviceQueue(devicequeue.toString(), devicequeueentry.toString()) as Boolean) else false

public actual fun KeRemoveQueueDpc(dpc: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRemoveQueueDpc(dpc.toString()) as Boolean) else false

public actual fun KeRemoveQueueDpcEx(dpc: Long, waitifactive: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRemoveQueueDpcEx(dpc.toString(), waitifactive) as Boolean) else false

public actual fun KeResetEvent(event: Long): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeResetEvent(event.toString()) as Int) else 0

public actual fun KeRestoreExtendedProcessorState(xstatesave: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRestoreExtendedProcessorState(xstatesave.toString())
    }
}

public actual fun KeRevertToUserAffinityThread() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRevertToUserAffinityThread()
    }
}

public actual fun KeRevertToUserAffinityThreadEx(affinity: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRevertToUserAffinityThreadEx(affinity.toString())
    }
}

public actual fun KeRevertToUserGroupAffinityThread(previousaffinity: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeRevertToUserGroupAffinityThread(previousaffinity.toString())
    }
}

public actual fun KeSaveExtendedProcessorState(mask: ULong, xstatesave: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSaveExtendedProcessorState(mask.toString(), xstatesave.toString()) as Int) else 0

public actual fun KeSetBasePriorityThread(thread: PKTHREAD, increment: Int): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetBasePriorityThread(thread.toString(), increment) as Int) else 0

public actual fun KeSetCoalescableTimer(timer: Long, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetCoalescableTimer(timer.toString(), duetime.toString(), period.toInt(), tolerabledelay.toInt(), dpc.toString()) as Boolean) else false

public actual fun KeSetEvent(event: Long, increment: Int, wait: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetEvent(event.toString(), increment, wait) as Int) else 0

public actual fun KeSetHardwareCounterConfiguration(counterarray: Long, count: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetHardwareCounterConfiguration(counterarray.toString(), count.toInt()) as Int) else 0

public actual fun KeSetImportanceDpc(dpc: Long, importance: KDPC_IMPORTANCE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetImportanceDpc(dpc.toString(), importance)
    }
}

public actual fun KeSetPriorityThread(thread: PKTHREAD, priority: Int): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetPriorityThread(thread.toString(), priority) as Int) else 0

public actual fun KeSetSystemAffinityThread(affinity: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetSystemAffinityThread(affinity.toString())
    }
}

public actual fun KeSetSystemAffinityThreadEx(affinity: ULong): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetSystemAffinityThreadEx(affinity.toString()) as String).toULong() else 0uL

public actual fun KeSetSystemGroupAffinityThread(affinity: Long, previousaffinity: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetSystemGroupAffinityThread(affinity.toString(), previousaffinity.toString())
    }
}

public actual fun KeSetTargetProcessorDpc(dpc: Long, number: Byte) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetTargetProcessorDpc(dpc.toString(), number.toInt())
    }
}

public actual fun KeSetTargetProcessorDpcEx(dpc: Long, procnumber: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetTargetProcessorDpcEx(dpc.toString(), procnumber.toString()) as Int) else 0

public actual fun KeSetTimer(timer: Long, duetime: Long, dpc: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetTimer(timer.toString(), duetime.toString(), dpc.toString()) as Boolean) else false

public actual fun KeSetTimerEx(timer: Long, duetime: Long, period: Int, dpc: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSetTimerEx(timer.toString(), duetime.toString(), period, dpc.toString()) as Boolean) else false

public actual fun KeShouldYieldProcessor(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeShouldYieldProcessor() as Int).toUInt() else 0u

public actual fun KeStallExecutionProcessor(microseconds: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeStallExecutionProcessor(microseconds.toInt())
    }
}

public actual fun KeSynchronizeExecution(interrupt: PKINTERRUPT, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeSynchronizeExecution(interrupt.toString(), synchronizeroutine.toLong().toString(), synchronizecontext.toString()) as Boolean) else false

public actual fun KeTestSpinLock(spinlock: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeTestSpinLock(spinlock.toString()) as Boolean) else false

public actual fun KeTryToAcquireGuardedMutex(mutex: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeTryToAcquireGuardedMutex(mutex.toString()) as Boolean) else false

public actual fun KeTryToAcquireSpinLockAtDpcLevel(spinlock: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeTryToAcquireSpinLockAtDpcLevel(spinlock.toString()) as Boolean) else false

public actual fun KeWaitForMultipleObjects(count: UInt, obj: Long, waittype: WAIT_TYPE, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long, waitblockarray: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeWaitForMultipleObjects(count.toInt(), obj.toString(), waittype, waitreason, waitmode.toInt(), alertable, timeout.toString(), waitblockarray.toString()) as Int) else 0

public actual fun KeWaitForSingleObject(obj: Long, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KeWaitForSingleObject(obj.toString(), waitreason, waitmode.toInt(), alertable, timeout.toString()) as Int) else 0

public actual fun KfRaiseIrql(newirql: UByte): UByte =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_KfRaiseIrql(newirql.toInt()) as Int).toUByte() else 0u

public actual fun MmAddPhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAddPhysicalMemory(startaddress.toString(), numberofbytes.toString()) as Int) else 0

public actual fun MmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAddVerifierSpecialThunks(entryroutine.toString(), thunkbuffer.toString(), thunkbuffersize.toInt()) as Int) else 0

public actual fun MmAddVerifierThunks(thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAddVerifierThunks(thunkbuffer.toString(), thunkbuffersize.toInt()) as Int) else 0

public actual fun MmAdvanceMdl(mdl: Long, numberofbytes: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAdvanceMdl(mdl.toString(), numberofbytes.toInt()) as Int) else 0

public actual fun MmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemory(numberofbytes.toString(), highestacceptableaddress.toString()) as String).toLong() else 0L

public actual fun MmAllocateContiguousMemoryEx(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: Long, tag: UInt, flags: UInt, baseaddress: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemoryEx(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), preferrednode.toInt(), protect.toInt(), partitionobject.toString(), tag.toInt(), flags.toInt(), baseaddress.toString()) as Int) else 0

public actual fun MmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemorySpecifyCache(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), cachetype) as String).toLong() else 0L

public actual fun MmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE, preferrednode: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemorySpecifyCacheNode(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), cachetype, preferrednode.toInt()) as String).toLong() else 0L

public actual fun MmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousNodeMemory(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), protect.toInt(), preferrednode.toInt()) as String).toLong() else 0L

public actual fun MmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocateMappingAddress(numberofbytes.toString(), pooltag.toInt()) as String).toLong() else 0L

public actual fun MmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocateMappingAddressEx(numberofbytes.toString(), pooltag.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun MmAllocateMdlForIoSpace(physicaladdresslist: Long, numberofentries: ULong, newmdl: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocateMdlForIoSpace(physicaladdresslist.toString(), numberofentries.toString(), newmdl.toString()) as Int) else 0

public actual fun MmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocateNodePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, idealnode.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun MmAllocateNonCachedMemory(numberofbytes: ULong): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocateNonCachedMemory(numberofbytes.toString()) as String).toLong() else 0L

public actual fun MmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocatePagesForMdl(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString()) as String).toLong() else 0L

public actual fun MmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, flags: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocatePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, flags.toInt()) as String).toLong() else 0L

public actual fun MmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt, partitionobject: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAllocatePartitionNodePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, idealnode.toInt(), flags.toInt(), partitionobject.toString()) as String).toLong() else 0L

public actual fun MmAreMdlPagesCached(memorydescriptorlist: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmAreMdlPagesCached(memorydescriptorlist.toString()) as Int).toUInt() else 0u

public actual fun MmBuildMdlForNonPagedPool(memorydescriptorlist: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmBuildMdlForNonPagedPool(memorydescriptorlist.toString())
    }
}

public actual fun MmCopyMemory(targetaddress: Long, sourceaddress: MM_COPY_ADDRESS, numberofbytes: ULong, flags: UInt, numberofbytestransferred: Long): NTSTATUS =
    0

public actual fun MmCreateMdl(memorydescriptorlist: Long, base: Long, length: ULong): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmCreateMdl(memorydescriptorlist.toString(), base.toString(), length.toString()) as String).toLong() else 0L

public actual fun MmCreateMirror(): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmCreateMirror() as Int) else 0

public actual fun MmFreeContiguousMemory(baseaddress: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmFreeContiguousMemory(baseaddress.toString())
    }
}

public actual fun MmFreeContiguousMemorySpecifyCache(baseaddress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmFreeContiguousMemorySpecifyCache(baseaddress.toString(), numberofbytes.toString(), cachetype)
    }
}

public actual fun MmFreeMappingAddress(baseaddress: Long, pooltag: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmFreeMappingAddress(baseaddress.toString(), pooltag.toInt())
    }
}

public actual fun MmFreeNonCachedMemory(baseaddress: Long, numberofbytes: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmFreeNonCachedMemory(baseaddress.toString(), numberofbytes.toString())
    }
}

public actual fun MmFreePagesFromMdl(memorydescriptorlist: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmFreePagesFromMdl(memorydescriptorlist.toString())
    }
}

public actual fun MmFreePagesFromMdlEx(memorydescriptorlist: Long, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmFreePagesFromMdlEx(memorydescriptorlist.toString(), flags.toInt())
    }
}

public actual fun MmGetCacheAttribute(physicaladdress: Long, cachetype: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmGetCacheAttribute(physicaladdress.toString(), cachetype.toString()) as Int) else 0

public actual fun MmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmGetCacheAttributeEx(physicaladdress.toString(), flags.toInt(), cachetype.toString()) as Int) else 0

public actual fun MmGetPhysicalAddress(baseaddress: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmGetPhysicalAddress(baseaddress.toString()) as String).toLong() else 0L

public actual fun MmGetPhysicalMemoryRanges(): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRanges() as String).toLong() else 0L

public actual fun MmGetPhysicalMemoryRangesEx(partitionobject: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRangesEx(partitionobject.toString()) as String).toLong() else 0L

public actual fun MmGetPhysicalMemoryRangesEx2(partitionobject: Long, flags: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRangesEx2(partitionobject.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun MmGetSystemRoutineAddress(systemroutinename: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmGetSystemRoutineAddress(systemroutinename.toString()) as String).toLong() else 0L

public actual fun MmGetVirtualForPhysical(physicaladdress: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmGetVirtualForPhysical(physicaladdress.toString()) as String).toLong() else 0L

public actual fun MmIsAddressValid(virtualaddress: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmIsAddressValid(virtualaddress.toString()) as Boolean) else false

public actual fun MmIsDriverSuspectForVerifier(driverobject: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmIsDriverSuspectForVerifier(driverobject.toString()) as Int).toUInt() else 0u

public actual fun MmIsDriverVerifying(driverobject: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmIsDriverVerifying(driverobject.toString()) as Int).toUInt() else 0u

public actual fun MmIsDriverVerifyingByAddress(addresswithinsection: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmIsDriverVerifyingByAddress(addresswithinsection.toString()) as Int).toUInt() else 0u

public actual fun MmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmIsIoSpaceActive(startaddress.toString(), numberofbytes.toString()) as Int).toUInt() else 0u

public actual fun MmIsNonPagedSystemAddressValid(virtualaddress: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmIsNonPagedSystemAddressValid(virtualaddress.toString()) as Boolean) else false

public actual fun MmIsThisAnNtAsSystem(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmIsThisAnNtAsSystem() as Boolean) else false

public actual fun MmIsVerifierEnabled(verifierflags: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmIsVerifierEnabled(verifierflags.toString()) as Int) else 0

public actual fun MmLockPagableDataSection(addresswithinsection: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmLockPagableDataSection(addresswithinsection.toString()) as String).toLong() else 0L

public actual fun MmLockPagableSectionByHandle(imagesectionhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmLockPagableSectionByHandle(imagesectionhandle.toString())
    }
}

public actual fun MmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapIoSpace(physicaladdress.toString(), numberofbytes.toString(), cachetype) as String).toLong() else 0L

public actual fun MmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapIoSpaceEx(physicaladdress.toString(), numberofbytes.toString(), protect.toInt()) as String).toLong() else 0L

public actual fun MmMapLockedPages(memorydescriptorlist: Long, accessmode: Byte): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapLockedPages(memorydescriptorlist.toString(), accessmode.toInt()) as String).toLong() else 0L

public actual fun MmMapLockedPagesSpecifyCache(memorydescriptorlist: Long, accessmode: Byte, cachetype: MEMORY_CACHING_TYPE, requestedaddress: Long, bugcheckonfailure: UInt, priority: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapLockedPagesSpecifyCache(memorydescriptorlist.toString(), accessmode.toInt(), cachetype, requestedaddress.toString(), bugcheckonfailure.toInt(), priority.toInt()) as String).toLong() else 0L

public actual fun MmMapLockedPagesWithReservedMapping(mappingaddress: Long, pooltag: UInt, memorydescriptorlist: Long, cachetype: MEMORY_CACHING_TYPE): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapLockedPagesWithReservedMapping(mappingaddress.toString(), pooltag.toInt(), memorydescriptorlist.toString(), cachetype) as String).toLong() else 0L

public actual fun MmMapMdl(memorydescriptorlist: Long, protection: UInt, driverroutine: PMM_MDL_ROUTINE, drivercontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapMdl(memorydescriptorlist.toString(), protection.toInt(), driverroutine.toLong().toString(), drivercontext.toString()) as Int) else 0

public actual fun MmMapMemoryDumpMdlEx(va: Long, pagetotal: UInt, memorydumpmdl: Long, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapMemoryDumpMdlEx(va.toString(), pagetotal.toInt(), memorydumpmdl.toString(), flags.toInt()) as Int) else 0

public actual fun MmMapUserAddressesToPage(baseaddress: Long, numberofbytes: ULong, pageaddress: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapUserAddressesToPage(baseaddress.toString(), numberofbytes.toString(), pageaddress.toString()) as Int) else 0

public actual fun MmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapVideoDisplay(physicaladdress.toString(), numberofbytes.toString(), cachetype) as String).toLong() else 0L

public actual fun MmMapViewInSessionSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapViewInSessionSpace(section.toString(), mappedbase.toString(), viewsize.toString()) as Int) else 0

public actual fun MmMapViewInSessionSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapViewInSessionSpaceEx(section.toString(), mappedbase.toString(), viewsize.toString(), sectionoffset.toString(), flags.toString()) as Int) else 0

public actual fun MmMapViewInSystemSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapViewInSystemSpace(section.toString(), mappedbase.toString(), viewsize.toString()) as Int) else 0

public actual fun MmMapViewInSystemSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMapViewInSystemSpaceEx(section.toString(), mappedbase.toString(), viewsize.toString(), sectionoffset.toString(), flags.toString()) as Int) else 0

public actual fun MmMdlPageContentsState(memorydescriptorlist: Long, state: MM_MDL_PAGE_CONTENTS_STATE): MM_MDL_PAGE_CONTENTS_STATE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmMdlPageContentsState(memorydescriptorlist.toString(), state) as Int) else 0

public actual fun MmPageEntireDriver(addresswithinsection: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmPageEntireDriver(addresswithinsection.toString()) as String).toLong() else 0L

public actual fun MmProbeAndLockPages(memorydescriptorlist: Long, accessmode: Byte, operation: LOCK_OPERATION) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmProbeAndLockPages(memorydescriptorlist.toString(), accessmode.toInt(), operation)
    }
}

public actual fun MmProbeAndLockProcessPages(memorydescriptorlist: Long, process: PEPROCESS, accessmode: Byte, operation: LOCK_OPERATION) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmProbeAndLockProcessPages(memorydescriptorlist.toString(), process.toString(), accessmode.toInt(), operation)
    }
}

public actual fun MmProbeAndLockSelectedPages(memorydescriptorlist: Long, segmentarray: Long, accessmode: Byte, operation: LOCK_OPERATION) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmProbeAndLockSelectedPages(memorydescriptorlist.toString(), segmentarray.toString(), accessmode.toInt(), operation)
    }
}

public actual fun MmProtectDriverSection(addresswithinsection: Long, size: ULong, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmProtectDriverSection(addresswithinsection.toString(), size.toString(), flags.toInt()) as Int) else 0

public actual fun MmProtectMdlSystemAddress(memorydescriptorlist: Long, newprotect: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmProtectMdlSystemAddress(memorydescriptorlist.toString(), newprotect.toInt()) as Int) else 0

public actual fun MmQuerySystemSize(): MM_SYSTEMSIZE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmQuerySystemSize() as Int) else 0

public actual fun MmRemovePhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmRemovePhysicalMemory(startaddress.toString(), numberofbytes.toString()) as Int) else 0

public actual fun MmResetDriverPaging(addresswithinsection: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmResetDriverPaging(addresswithinsection.toString())
    }
}

public actual fun MmRotatePhysicalView(virtualaddress: Long, numberofbytes: Long, newmdl: Long, direction: MM_ROTATE_DIRECTION, copyfunction: PMM_ROTATE_COPY_CALLBACK_FUNCTION, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmRotatePhysicalView(virtualaddress.toString(), numberofbytes.toString(), newmdl.toString(), direction, copyfunction.toLong().toString(), context.toString()) as Int) else 0

public actual fun MmSecureVirtualMemory(address: Long, size: ULong, probemode: UInt): HANDLE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmSecureVirtualMemory(address.toString(), size.toString(), probemode.toInt()) as String).toLong() else 0L

public actual fun MmSecureVirtualMemoryEx(address: Long, size: ULong, probemode: UInt, flags: UInt): HANDLE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmSecureVirtualMemoryEx(address.toString(), size.toString(), probemode.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun MmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MEMORY_CACHING_TYPE, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmSetPermanentCacheAttribute(startaddress.toString(), numberofbytes.toString(), cachetype, flags.toInt()) as Int) else 0

public actual fun MmSizeOfMdl(base: Long, length: ULong): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmSizeOfMdl(base.toString(), length.toString()) as String).toULong() else 0uL

public actual fun MmUnlockPagableImageSection(imagesectionhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmUnlockPagableImageSection(imagesectionhandle.toString())
    }
}

public actual fun MmUnlockPages(memorydescriptorlist: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmUnlockPages(memorydescriptorlist.toString())
    }
}

public actual fun MmUnmapIoSpace(baseaddress: Long, numberofbytes: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmUnmapIoSpace(baseaddress.toString(), numberofbytes.toString())
    }
}

public actual fun MmUnmapLockedPages(baseaddress: Long, memorydescriptorlist: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmUnmapLockedPages(baseaddress.toString(), memorydescriptorlist.toString())
    }
}

public actual fun MmUnmapReservedMapping(baseaddress: Long, pooltag: UInt, memorydescriptorlist: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmUnmapReservedMapping(baseaddress.toString(), pooltag.toInt(), memorydescriptorlist.toString())
    }
}

public actual fun MmUnmapVideoDisplay(baseaddress: Long, numberofbytes: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmUnmapVideoDisplay(baseaddress.toString(), numberofbytes.toString())
    }
}

public actual fun MmUnmapViewInSessionSpace(mappedbase: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmUnmapViewInSessionSpace(mappedbase.toString()) as Int) else 0

public actual fun MmUnmapViewInSystemSpace(mappedbase: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmUnmapViewInSystemSpace(mappedbase.toString()) as Int) else 0

public actual fun MmUnsecureVirtualMemory(securehandle: HANDLE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_MmUnsecureVirtualMemory(securehandle.toString())
    }
}

public actual fun NtAllocateLocallyUniqueId(luid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtAllocateLocallyUniqueId(luid.toString()) as Int) else 0

public actual fun NtCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtCommitComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtCommitEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtCommitTransaction(transactionhandle.toString(), wait) as Int) else 0

public actual fun NtCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtCreateEnlistment(enlistmenthandle.toString(), desiredaccess.toInt(), resourcemanagerhandle.toString(), transactionhandle.toString(), objectattributes.toString(), createoptions.toInt(), notificationmask.toInt(), enlistmentkey.toString()) as Int) else 0

public actual fun NtCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, rmguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtCreateResourceManager(resourcemanagerhandle.toString(), desiredaccess.toInt(), tmhandle.toString(), rmguid.toString(), objectattributes.toString(), createoptions.toInt(), description.toString()) as Int) else 0

public actual fun NtCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtCreateTransaction(transactionhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), uow.toString(), tmhandle.toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toString(), description.toString()) as Int) else 0

public actual fun NtCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtCreateTransactionManager(tmhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), logfilename.toString(), createoptions.toInt(), commitstrength.toInt()) as Int) else 0

public actual fun NtDisplayString(string: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtDisplayString(string.toString()) as Int) else 0

public actual fun NtEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtEnumerateTransactionObject(rootobjecthandle.toString(), querytype, objectcursor.toString(), objectcursorlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun NtGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtGetNotificationResourceManager(resourcemanagerhandle.toString(), transactionnotification.toString(), notificationlength.toInt(), timeout.toString(), returnlength.toString(), asynchronous.toInt(), asynchronouscontext.toString()) as Int) else 0

public actual fun NtLoadDriver(driverservicename: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtLoadDriver(driverservicename.toString()) as Int) else 0

public actual fun NtMakeTemporaryObject(handle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtMakeTemporaryObject(handle.toString()) as Int) else 0

public actual fun NtManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtManagePartition(targethandle.toString(), sourcehandle.toString(), partitioninformationclass, partitioninformation.toString(), partitioninformationlength.toInt()) as Int) else 0

public actual fun NtOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtOpenEnlistment(enlistmenthandle.toString(), desiredaccess.toInt(), resourcemanagerhandle.toString(), enlistmentguid.toString(), objectattributes.toString()) as Int) else 0

public actual fun NtOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtOpenResourceManager(resourcemanagerhandle.toString(), desiredaccess.toInt(), tmhandle.toString(), resourcemanagerguid.toString(), objectattributes.toString()) as Int) else 0

public actual fun NtOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtOpenTransaction(transactionhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), uow.toString(), tmhandle.toString()) as Int) else 0

public actual fun NtOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtOpenTransactionManager(tmhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), logfilename.toString(), tmidentity.toString(), openoptions.toInt()) as Int) else 0

public actual fun NtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtPowerInformation(informationlevel, inputbuffer.toString(), inputbufferlength.toInt(), outputbuffer.toString(), outputbufferlength.toInt()) as Int) else 0

public actual fun NtPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtPrePrepareComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtPrePrepareEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtPrepareComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtPrepareEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtPropagationComplete(resourcemanagerhandle.toString(), requestcookie.toInt(), bufferlength.toInt(), buffer.toString()) as Int) else 0

public actual fun NtPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtPropagationFailed(resourcemanagerhandle.toString(), requestcookie.toInt(), propstatus) as Int) else 0

public actual fun NtQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtQueryInformationEnlistment(enlistmenthandle.toString(), enlistmentinformationclass, enlistmentinformation.toString(), enlistmentinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun NtQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtQueryInformationResourceManager(resourcemanagerhandle.toString(), resourcemanagerinformationclass, resourcemanagerinformation.toString(), resourcemanagerinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun NtQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtQueryInformationTransaction(transactionhandle.toString(), transactioninformationclass, transactioninformation.toString(), transactioninformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun NtQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtQueryInformationTransactionManager(transactionmanagerhandle.toString(), transactionmanagerinformationclass, transactionmanagerinformation.toString(), transactionmanagerinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun NtReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtReadOnlyEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtRecoverEnlistment(enlistmenthandle.toString(), enlistmentkey.toString()) as Int) else 0

public actual fun NtRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtRecoverResourceManager(resourcemanagerhandle.toString()) as Int) else 0

public actual fun NtRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtRecoverTransactionManager(transactionmanagerhandle.toString()) as Int) else 0

public actual fun NtRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtRegisterProtocolAddressInformation(resourcemanager.toString(), protocolid.toString(), protocolinformationsize.toInt(), protocolinformation.toString(), createoptions.toInt()) as Int) else 0

public actual fun NtRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtRenameTransactionManager(logfilename.toString(), existingtransactionmanagerguid.toString()) as Int) else 0

public actual fun NtRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtRollbackComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtRollbackEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtRollbackTransaction(transactionhandle.toString(), wait) as Int) else 0

public actual fun NtRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtRollforwardTransactionManager(transactionmanagerhandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtSetInformationEnlistment(enlistmenthandle.toString(), enlistmentinformationclass, enlistmentinformation.toString(), enlistmentinformationlength.toInt()) as Int) else 0

public actual fun NtSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtSetInformationResourceManager(resourcemanagerhandle.toString(), resourcemanagerinformationclass, resourcemanagerinformation.toString(), resourcemanagerinformationlength.toInt()) as Int) else 0

public actual fun NtSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtSetInformationTransaction(transactionhandle.toString(), transactioninformationclass, transactioninformation.toString(), transactioninformationlength.toInt()) as Int) else 0

public actual fun NtSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtSetInformationTransactionManager(tmhandle.toString(), transactionmanagerinformationclass, transactionmanagerinformation.toString(), transactionmanagerinformationlength.toInt()) as Int) else 0

public actual fun NtSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtSinglePhaseReject(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun NtUnloadDriver(driverservicename: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_NtUnloadDriver(driverservicename.toString()) as Int) else 0

public actual fun ObCloseHandle(handle: HANDLE, previousmode: Byte): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObCloseHandle(handle.toString(), previousmode.toInt()) as Int) else 0

public actual fun ObDereferenceObjectDeferDelete(obj: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObDereferenceObjectDeferDelete(obj.toString())
    }
}

public actual fun ObDereferenceObjectDeferDeleteWithTag(obj: Long, tag: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObDereferenceObjectDeferDeleteWithTag(obj.toString(), tag.toInt())
    }
}

public actual fun ObGetFilterVersion(): UShort =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObGetFilterVersion() as Int).toUShort() else 0u

public actual fun ObGetObjectSecurity(obj: Long, securitydescriptor: Long, memoryallocated: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObGetObjectSecurity(obj.toString(), securitydescriptor.toString(), memoryallocated.toString()) as Int) else 0

public actual fun ObReferenceObjectByHandle(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, obj: Long, handleinformation: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByHandle(handle.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), obj.toString(), handleinformation.toString()) as Int) else 0

public actual fun ObReferenceObjectByHandleWithTag(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, obj: Long, handleinformation: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByHandleWithTag(handle.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt(), obj.toString(), handleinformation.toString()) as Int) else 0

public actual fun ObReferenceObjectByPointer(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByPointer(obj.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt()) as Int) else 0

public actual fun ObReferenceObjectByPointerWithTag(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByPointerWithTag(obj.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt()) as Int) else 0

public actual fun ObReferenceObjectSafe(obj: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObReferenceObjectSafe(obj.toString()) as Boolean) else false

public actual fun ObReferenceObjectSafeWithTag(obj: Long, tag: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObReferenceObjectSafeWithTag(obj.toString(), tag.toInt()) as Boolean) else false

public actual fun ObRegisterCallbacks(callbackregistration: Long, registrationhandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObRegisterCallbacks(callbackregistration.toString(), registrationhandle.toString()) as Int) else 0

public actual fun ObReleaseObjectSecurity(securitydescriptor: PSECURITY_DESCRIPTOR, memoryallocated: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObReleaseObjectSecurity(securitydescriptor.toString(), memoryallocated)
    }
}

public actual fun ObUnRegisterCallbacks(registrationhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObUnRegisterCallbacks(registrationhandle.toString())
    }
}

public actual fun ObfDereferenceObject(obj: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObfDereferenceObject(obj.toString()) as String).toLong() else 0L

public actual fun ObfDereferenceObjectWithTag(obj: Long, tag: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObfDereferenceObjectWithTag(obj.toString(), tag.toInt()) as String).toLong() else 0L

public actual fun ObfReferenceObject(obj: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObfReferenceObject(obj.toString()) as String).toLong() else 0L

public actual fun ObfReferenceObjectWithTag(obj: Long, tag: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ObfReferenceObjectWithTag(obj.toString(), tag.toInt()) as String).toLong() else 0L

public actual fun PcwAddInstance(buffer: PPCW_BUFFER, name: Long, id: UInt, count: UInt, data: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PcwAddInstance(buffer.toString(), name.toString(), id.toInt(), count.toInt(), data.toString()) as Int) else 0

public actual fun PcwCloseInstance(instance: PPCW_INSTANCE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PcwCloseInstance(instance.toString())
    }
}

public actual fun PcwCreateInstance(instance: Long, registration: PPCW_REGISTRATION, name: Long, count: UInt, data: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PcwCreateInstance(instance.toString(), registration.toString(), name.toString(), count.toInt(), data.toString()) as Int) else 0

public actual fun PcwRegister(registration: Long, info: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PcwRegister(registration.toString(), info.toString()) as Int) else 0

public actual fun PcwUnregister(registration: PPCW_REGISTRATION) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PcwUnregister(registration.toString())
    }
}

public actual fun PoCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoCallDriver(deviceobject.toString(), irp.toString()) as Int) else 0

public actual fun PoClearPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoClearPowerRequest(powerrequest.toString(), type) as Int) else 0

public actual fun PoCreatePowerRequest(powerrequest: Long, deviceobject: Long, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoCreatePowerRequest(powerrequest.toString(), deviceobject.toString(), context.toString()) as Int) else 0

public actual fun PoCreateThermalRequest(thermalrequest: Long, targetdeviceobject: Long, policydeviceobject: Long, context: Long, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoCreateThermalRequest(thermalrequest.toString(), targetdeviceobject.toString(), policydeviceobject.toString(), context.toString(), flags.toInt()) as Int) else 0

public actual fun PoDeletePowerRequest(powerrequest: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoDeletePowerRequest(powerrequest.toString())
    }
}

public actual fun PoDeleteThermalRequest(thermalrequest: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoDeleteThermalRequest(thermalrequest.toString())
    }
}

public actual fun PoEndDeviceBusy(idlepointer: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoEndDeviceBusy(idlepointer.toString())
    }
}

public actual fun PoFxActivateComponent(handle: POHANDLE, component: UInt, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxActivateComponent(handle.toString(), component.toInt(), flags.toInt())
    }
}

public actual fun PoFxCompleteDevicePowerNotRequired(handle: POHANDLE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxCompleteDevicePowerNotRequired(handle.toString())
    }
}

public actual fun PoFxCompleteDirectedPowerDown(handle: POHANDLE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxCompleteDirectedPowerDown(handle.toString())
    }
}

public actual fun PoFxCompleteIdleCondition(handle: POHANDLE, component: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxCompleteIdleCondition(handle.toString(), component.toInt())
    }
}

public actual fun PoFxCompleteIdleState(handle: POHANDLE, component: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxCompleteIdleState(handle.toString(), component.toInt())
    }
}

public actual fun PoFxIdleComponent(handle: POHANDLE, component: UInt, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxIdleComponent(handle.toString(), component.toInt(), flags.toInt())
    }
}

public actual fun PoFxIssueComponentPerfStateChange(handle: POHANDLE, flags: UInt, component: UInt, perfchange: Long, context: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxIssueComponentPerfStateChange(handle.toString(), flags.toInt(), component.toInt(), perfchange.toString(), context.toString())
    }
}

public actual fun PoFxIssueComponentPerfStateChangeMultiple(handle: POHANDLE, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: Long, context: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxIssueComponentPerfStateChangeMultiple(handle.toString(), flags.toInt(), component.toInt(), perfchangescount.toInt(), perfchanges.toString(), context.toString())
    }
}

public actual fun PoFxNotifySurprisePowerOn(pdo: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxNotifySurprisePowerOn(pdo.toString())
    }
}

public actual fun PoFxPowerControl(handle: POHANDLE, powercontrolcode: Long, inbuffer: Long, inbuffersize: ULong, outbuffer: Long, outbuffersize: ULong, bytesreturned: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxPowerControl(handle.toString(), powercontrolcode.toString(), inbuffer.toString(), inbuffersize.toString(), outbuffer.toString(), outbuffersize.toString(), bytesreturned.toString()) as Int) else 0

public actual fun PoFxPowerOnCrashdumpDevice(handle: POHANDLE, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxPowerOnCrashdumpDevice(handle.toString(), context.toString()) as Int) else 0

public actual fun PoFxQueryCurrentComponentPerfState(handle: POHANDLE, flags: UInt, component: UInt, setindex: UInt, currentperf: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxQueryCurrentComponentPerfState(handle.toString(), flags.toInt(), component.toInt(), setindex.toInt(), currentperf.toString()) as Int) else 0

public actual fun PoFxRegisterComponentPerfStates(handle: POHANDLE, component: UInt, flags: ULong, componentperfstatecallback: PPO_FX_COMPONENT_PERF_STATE_CALLBACK, inputstateinfo: Long, outputstateinfo: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxRegisterComponentPerfStates(handle.toString(), component.toInt(), flags.toString(), componentperfstatecallback.toLong().toString(), inputstateinfo.toString(), outputstateinfo.toString()) as Int) else 0

public actual fun PoFxRegisterCrashdumpDevice(handle: POHANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxRegisterCrashdumpDevice(handle.toString()) as Int) else 0

public actual fun PoFxRegisterDevice(pdo: Long, device: Long, handle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxRegisterDevice(pdo.toString(), device.toString(), handle.toString()) as Int) else 0

public actual fun PoFxRegisterDripsWatchdogCallback(handle: POHANDLE, callback: PPO_FX_DRIPS_WATCHDOG_CALLBACK, includechilddevices: Boolean, matchingdriverobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxRegisterDripsWatchdogCallback(handle.toString(), callback.toLong().toString(), includechilddevices, matchingdriverobject.toString())
    }
}

public actual fun PoFxReportDevicePoweredOn(handle: POHANDLE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxReportDevicePoweredOn(handle.toString())
    }
}

public actual fun PoFxSetComponentLatency(handle: POHANDLE, component: UInt, latency: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxSetComponentLatency(handle.toString(), component.toInt(), latency.toString())
    }
}

public actual fun PoFxSetComponentResidency(handle: POHANDLE, component: UInt, residency: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxSetComponentResidency(handle.toString(), component.toInt(), residency.toString())
    }
}

public actual fun PoFxSetComponentWake(handle: POHANDLE, component: UInt, wakehint: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxSetComponentWake(handle.toString(), component.toInt(), wakehint)
    }
}

public actual fun PoFxSetDeviceIdleTimeout(handle: POHANDLE, idletimeout: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxSetDeviceIdleTimeout(handle.toString(), idletimeout.toString())
    }
}

public actual fun PoFxSetTargetDripsDevicePowerState(handle: POHANDLE, targetstate: DEVICE_POWER_STATE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxSetTargetDripsDevicePowerState(handle.toString(), targetstate) as Int) else 0

public actual fun PoFxStartDevicePowerManagement(handle: POHANDLE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxStartDevicePowerManagement(handle.toString())
    }
}

public actual fun PoFxUnregisterDevice(handle: POHANDLE) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoFxUnregisterDevice(handle.toString())
    }
}

public actual fun PoGetSystemWake(irp: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoGetSystemWake(irp.toString()) as Boolean) else false

public actual fun PoGetThermalRequestSupport(thermalrequest: Long, type: PO_THERMAL_REQUEST_TYPE): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoGetThermalRequestSupport(thermalrequest.toString(), type) as Boolean) else false

public actual fun PoQueryWatchdogTime(pdo: Long, secondsremaining: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoQueryWatchdogTime(pdo.toString(), secondsremaining.toString()) as Boolean) else false

public actual fun PoRegisterDeviceForIdleDetection(deviceobject: Long, conservationidletime: UInt, performanceidletime: UInt, state: DEVICE_POWER_STATE): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoRegisterDeviceForIdleDetection(deviceobject.toString(), conservationidletime.toInt(), performanceidletime.toInt(), state) as String).toLong() else 0L

public actual fun PoRegisterPowerSettingCallback(deviceobject: Long, settingguid: Long, callback: PPOWER_SETTING_CALLBACK, context: Long, handle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoRegisterPowerSettingCallback(deviceobject.toString(), settingguid.toString(), callback.toLong().toString(), context.toString(), handle.toString()) as Int) else 0

public actual fun PoRegisterSystemState(statehandle: Long, flags: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoRegisterSystemState(statehandle.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun PoRequestPowerIrp(deviceobject: Long, minorfunction: UByte, powerstate: POWER_STATE, completionfunction: PREQUEST_POWER_COMPLETE, context: Long, irp: Long): NTSTATUS =
    0

public actual fun PoSetDeviceBusyEx(idlepointer: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoSetDeviceBusyEx(idlepointer.toString())
    }
}

public actual fun PoSetHiberRange(memorymap: Long, flags: UInt, address: Long, length: ULong, tag: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoSetHiberRange(memorymap.toString(), flags.toInt(), address.toString(), length.toString(), tag.toInt())
    }
}

public actual fun PoSetPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoSetPowerRequest(powerrequest.toString(), type) as Int) else 0

public actual fun PoSetPowerState(deviceobject: Long, type: POWER_STATE_TYPE, state: POWER_STATE): POWER_STATE =
    POWER_STATE()

public actual fun PoSetSystemState(flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoSetSystemState(flags.toInt())
    }
}

public actual fun PoSetSystemWake(irp: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoSetSystemWake(irp.toString())
    }
}

public actual fun PoSetSystemWakeDevice(deviceobject: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoSetSystemWakeDevice(deviceobject.toString())
    }
}

public actual fun PoSetThermalActiveCooling(thermalrequest: Long, engaged: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoSetThermalActiveCooling(thermalrequest.toString(), engaged) as Int) else 0

public actual fun PoSetThermalPassiveCooling(thermalrequest: Long, throttle: UByte): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoSetThermalPassiveCooling(thermalrequest.toString(), throttle.toInt()) as Int) else 0

public actual fun PoStartDeviceBusy(idlepointer: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoStartDeviceBusy(idlepointer.toString())
    }
}

public actual fun PoStartNextPowerIrp(irp: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoStartNextPowerIrp(irp.toString())
    }
}

public actual fun PoUnregisterPowerSettingCallback(handle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoUnregisterPowerSettingCallback(handle.toString()) as Int) else 0

public actual fun PoUnregisterSystemState(statehandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PoUnregisterSystemState(statehandle.toString())
    }
}

public actual fun ProbeForRead(address: Long, length: ULong, alignment: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ProbeForRead(address.toString(), length.toString(), alignment.toInt())
    }
}

public actual fun ProbeForWrite(address: Long, length: ULong, alignment: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ProbeForWrite(address.toString(), length.toString(), alignment.toInt())
    }
}

public actual fun PsAcquireSiloHardReference(silo: PESILO): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsAcquireSiloHardReference(silo.toString()) as Int) else 0

public actual fun PsAllocSiloContextSlot(reserved: ULong, returnedcontextslot: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsAllocSiloContextSlot(reserved.toString(), returnedcontextslot.toString()) as Int) else 0

public actual fun PsAllocateAffinityToken(affinitytoken: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsAllocateAffinityToken(affinitytoken.toString()) as Int) else 0

public actual fun PsAttachSiloToCurrentThread(silo: PESILO): PESILO =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsAttachSiloToCurrentThread(silo.toString()) as String).toLong() else 0L

public actual fun PsCreateSiloContext(silo: PESILO, size: UInt, pooltype: POOL_TYPE, contextcleanupcallback: SILO_CONTEXT_CLEANUP_CALLBACK, returnedsilocontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsCreateSiloContext(silo.toString(), size.toInt(), pooltype, contextcleanupcallback.toLong().toString(), returnedsilocontext.toString()) as Int) else 0

public actual fun PsCreateSystemThread(threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsCreateSystemThread(threadhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), processhandle.toString(), clientid.toString(), startroutine.toLong().toString(), startcontext.toString()) as Int) else 0

public actual fun PsDereferenceSiloContext(silocontext: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsDereferenceSiloContext(silocontext.toString())
    }
}

public actual fun PsDetachSiloFromCurrentThread(previoussilo: PESILO) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsDetachSiloFromCurrentThread(previoussilo.toString())
    }
}

public actual fun PsFreeAffinityToken(affinitytoken: PAFFINITY_TOKEN) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsFreeAffinityToken(affinitytoken.toString())
    }
}

public actual fun PsFreeSiloContextSlot(contextslot: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsFreeSiloContextSlot(contextslot.toInt()) as Int) else 0

public actual fun PsGetCurrentProcessId(): HANDLE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetCurrentProcessId() as String).toLong() else 0L

public actual fun PsGetCurrentServerSilo(): PESILO =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetCurrentServerSilo() as String).toLong() else 0L

public actual fun PsGetCurrentServerSiloName(): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetCurrentServerSiloName() as String).toLong() else 0L

public actual fun PsGetCurrentSilo(): PESILO =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetCurrentSilo() as String).toLong() else 0L

public actual fun PsGetCurrentThreadId(): HANDLE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetCurrentThreadId() as String).toLong() else 0L

public actual fun PsGetCurrentThreadTeb(): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetCurrentThreadTeb() as String).toLong() else 0L

public actual fun PsGetEffectiveServerSilo(silo: PESILO): PESILO =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetEffectiveServerSilo(silo.toString()) as String).toLong() else 0L

public actual fun PsGetHostSilo(): PESILO =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetHostSilo() as String).toLong() else 0L

public actual fun PsGetJobServerSilo(job: PEJOB, serversilo: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetJobServerSilo(job.toString(), serversilo.toString()) as Int) else 0

public actual fun PsGetJobSilo(job: PEJOB, silo: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetJobSilo(job.toString(), silo.toString()) as Int) else 0

public actual fun PsGetParentSilo(job: PEJOB): PESILO =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetParentSilo(job.toString()) as String).toLong() else 0L

public actual fun PsGetPermanentSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetPermanentSiloContext(silo.toString(), contextslot.toInt(), returnedsilocontext.toString()) as Int) else 0

public actual fun PsGetProcessCreateTimeQuadPart(process: PEPROCESS): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetProcessCreateTimeQuadPart(process.toString()) as String).toLong() else 0L

public actual fun PsGetProcessExitStatus(process: PEPROCESS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetProcessExitStatus(process.toString()) as Int) else 0

public actual fun PsGetProcessId(process: PEPROCESS): HANDLE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetProcessId(process.toString()) as String).toLong() else 0L

public actual fun PsGetProcessStartKey(process: PEPROCESS): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetProcessStartKey(process.toString()) as String).toULong() else 0uL

public actual fun PsGetServerSiloServiceSessionId(silo: PESILO): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetServerSiloServiceSessionId(silo.toString()) as Int).toUInt() else 0u

public actual fun PsGetSiloContainerId(silo: PESILO): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetSiloContainerId(silo.toString()) as String).toLong() else 0L

public actual fun PsGetSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetSiloContext(silo.toString(), contextslot.toInt(), returnedsilocontext.toString()) as Int) else 0

public actual fun PsGetSiloMonitorContextSlot(monitor: PSILO_MONITOR): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetSiloMonitorContextSlot(monitor.toString()) as Int).toUInt() else 0u

public actual fun PsGetThreadCreateTime(thread: PETHREAD): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetThreadCreateTime(thread.toString()) as String).toLong() else 0L

public actual fun PsGetThreadExitStatus(thread: PETHREAD): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetThreadExitStatus(thread.toString()) as Int) else 0

public actual fun PsGetThreadId(thread: PETHREAD): HANDLE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetThreadId(thread.toString()) as String).toLong() else 0L

public actual fun PsGetThreadProcessId(thread: PETHREAD): HANDLE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetThreadProcessId(thread.toString()) as String).toLong() else 0L

public actual fun PsGetThreadProperty(thread: PETHREAD, key: ULong, flags: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetThreadProperty(thread.toString(), key.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun PsGetThreadServerSilo(thread: PETHREAD): PESILO =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetThreadServerSilo(thread.toString()) as String).toLong() else 0L

public actual fun PsGetVersion(majorversion: Long, minorversion: Long, buildnumber: Long, csdversion: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsGetVersion(majorversion.toString(), minorversion.toString(), buildnumber.toString(), csdversion.toString()) as Boolean) else false

public actual fun PsInsertPermanentSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsInsertPermanentSiloContext(silo.toString(), contextslot.toInt(), silocontext.toString()) as Int) else 0

public actual fun PsInsertSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsInsertSiloContext(silo.toString(), contextslot.toInt(), silocontext.toString()) as Int) else 0

public actual fun PsIsCurrentThreadInServerSilo(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsIsCurrentThreadInServerSilo() as Boolean) else false

public actual fun PsIsCurrentThreadPrefetching(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsIsCurrentThreadPrefetching() as Boolean) else false

public actual fun PsIsHostSilo(silo: PESILO): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsIsHostSilo(silo.toString()) as Boolean) else false

public actual fun PsMakeSiloContextPermanent(silo: PESILO, contextslot: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsMakeSiloContextPermanent(silo.toString(), contextslot.toInt()) as Int) else 0

public actual fun PsQueryTotalCycleTimeProcess(process: PEPROCESS, cycletimestamp: Long): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsQueryTotalCycleTimeProcess(process.toString(), cycletimestamp.toString()) as String).toULong() else 0uL

public actual fun PsReferenceSiloContext(silocontext: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsReferenceSiloContext(silocontext.toString())
    }
}

public actual fun PsRegisterSiloMonitor(registration: Long, returnedmonitor: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsRegisterSiloMonitor(registration.toString(), returnedmonitor.toString()) as Int) else 0

public actual fun PsReleaseSiloHardReference(silo: PESILO) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsReleaseSiloHardReference(silo.toString())
    }
}

public actual fun PsRemoveCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsRemoveCreateThreadNotifyRoutine(notifyroutine.toLong().toString()) as Int) else 0

public actual fun PsRemoveLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsRemoveLoadImageNotifyRoutine(notifyroutine.toLong().toString()) as Int) else 0

public actual fun PsRemoveSiloContext(silo: PESILO, contextslot: UInt, removedsilocontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsRemoveSiloContext(silo.toString(), contextslot.toInt(), removedsilocontext.toString()) as Int) else 0

public actual fun PsReplaceSiloContext(silo: PESILO, contextslot: UInt, newsilocontext: Long, oldsilocontext: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsReplaceSiloContext(silo.toString(), contextslot.toInt(), newsilocontext.toString(), oldsilocontext.toString()) as Int) else 0

public actual fun PsRevertToUserMultipleGroupAffinityThread(affinitytoken: PAFFINITY_TOKEN) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsRevertToUserMultipleGroupAffinityThread(affinitytoken.toString())
    }
}

public actual fun PsSetCreateProcessNotifyRoutine(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE, remove: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutine(notifyroutine.toLong().toString(), remove) as Int) else 0

public actual fun PsSetCreateProcessNotifyRoutineEx(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE_EX, remove: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutineEx(notifyroutine.toLong().toString(), remove) as Int) else 0

public actual fun PsSetCreateProcessNotifyRoutineEx2(notifytype: PSCREATEPROCESSNOTIFYTYPE, notifyinformation: Long, remove: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutineEx2(notifytype, notifyinformation.toString(), remove) as Int) else 0

public actual fun PsSetCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsSetCreateThreadNotifyRoutine(notifyroutine.toLong().toString()) as Int) else 0

public actual fun PsSetCreateThreadNotifyRoutineEx(notifytype: PSCREATETHREADNOTIFYTYPE, notifyinformation: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsSetCreateThreadNotifyRoutineEx(notifytype, notifyinformation.toString()) as Int) else 0

public actual fun PsSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsSetCurrentThreadPrefetching(prefetching) as Boolean) else false

public actual fun PsSetLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsSetLoadImageNotifyRoutine(notifyroutine.toLong().toString()) as Int) else 0

public actual fun PsSetLoadImageNotifyRoutineEx(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE, flags: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsSetLoadImageNotifyRoutineEx(notifyroutine.toLong().toString(), flags.toString()) as Int) else 0

public actual fun PsSetSystemMultipleGroupAffinityThread(groupaffinities: Long, groupcount: UShort, affinitytoken: PAFFINITY_TOKEN): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsSetSystemMultipleGroupAffinityThread(groupaffinities.toString(), groupcount.toInt(), affinitytoken.toString()) as Int) else 0

public actual fun PsStartSiloMonitor(monitor: PSILO_MONITOR): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsStartSiloMonitor(monitor.toString()) as Int) else 0

public actual fun PsTerminateServerSilo(serversilo: PESILO, exitstatus: NTSTATUS) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsTerminateServerSilo(serversilo.toString(), exitstatus)
    }
}

public actual fun PsTerminateSystemThread(exitstatus: NTSTATUS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsTerminateSystemThread(exitstatus) as Int) else 0

public actual fun PsUnregisterSiloMonitor(monitor: PSILO_MONITOR) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsUnregisterSiloMonitor(monitor.toString())
    }
}

public actual fun PsWrapApcWow64Thread(apccontext: Long, apcroutine: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PsWrapApcWow64Thread(apccontext.toString(), apcroutine.toString()) as Int) else 0

public actual fun PshedAllocateMemory(size: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PshedAllocateMemory(size.toInt()) as String).toLong() else 0L

public actual fun PshedFreeMemory(address: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PshedFreeMemory(address.toString())
    }
}

public actual fun PshedIsSystemWheaEnabled(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PshedIsSystemWheaEnabled() as Boolean) else false

public actual fun PshedRegisterPlugin(packet: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PshedRegisterPlugin(packet.toString()) as Int) else 0

public actual fun PshedSynchronizeExecution(errorsource: Long, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PshedSynchronizeExecution(errorsource.toString(), synchronizeroutine.toLong().toString(), synchronizecontext.toString()) as Boolean) else false

public actual fun PshedUnregisterPlugin(pluginhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_PshedUnregisterPlugin(pluginhandle.toString())
    }
}

public actual fun RtlAppendUnicodeStringToString(destination: Long, source: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlAppendUnicodeStringToString(destination.toString(), source.toString()) as Int) else 0

public actual fun RtlAppendUnicodeToString(destination: Long, source: PCWSTR): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlAppendUnicodeToString(destination.toString(), source.toString()) as Int) else 0

public actual fun RtlAreBitsClear(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlAreBitsClear(bitmapheader.toString(), startingindex.toInt(), length.toInt()) as Boolean) else false

public actual fun RtlAreBitsSet(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlAreBitsSet(bitmapheader.toString(), startingindex.toInt(), length.toInt()) as Boolean) else false

public actual fun RtlAssert(voidfailedassertion: Long, voidfilename: Long, linenumber: UInt, mutablemessage: PCSTR) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlAssert(voidfailedassertion.toString(), voidfilename.toString(), linenumber.toInt(), mutablemessage.toString())
    }
}

public actual fun RtlCheckRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCheckRegistryKey(relativeto.toInt(), path.toString()) as Int) else 0

public actual fun RtlClearAllBits(bitmapheader: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlClearAllBits(bitmapheader.toString())
    }
}

public actual fun RtlClearBit(bitmapheader: Long, bitnumber: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlClearBit(bitmapheader.toString(), bitnumber.toInt())
    }
}

public actual fun RtlClearBits(bitmapheader: Long, startingindex: UInt, numbertoclear: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlClearBits(bitmapheader.toString(), startingindex.toInt(), numbertoclear.toInt())
    }
}

public actual fun RtlCmDecodeMemIoResource(descriptor: Long, start: Long): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCmDecodeMemIoResource(descriptor.toString(), start.toString()) as String).toULong() else 0uL

public actual fun RtlCmEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, start: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCmEncodeMemIoResource(descriptor.toString(), type.toInt(), length.toString(), start.toString()) as Int) else 0

public actual fun RtlCompareString(string1: Long, string2: Long, caseinsensitive: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCompareString(string1.toString(), string2.toString(), caseinsensitive) as Int) else 0

public actual fun RtlCompareUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCompareUnicodeString(string1.toString(), string2.toString(), caseinsensitive) as Int) else 0

public actual fun RtlCompareUnicodeStrings(string1: Long, string1length: ULong, string2: Long, string2length: ULong, caseinsensitive: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCompareUnicodeStrings(string1.toString(), string1length.toString(), string2.toString(), string2length.toString(), caseinsensitive) as Int) else 0

public actual fun RtlContractHashTable(hashtable: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlContractHashTable(hashtable.toString()) as Boolean) else false

public actual fun RtlCopyBitMap(source: Long, destination: Long, targetbit: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCopyBitMap(source.toString(), destination.toString(), targetbit.toInt())
    }
}

public actual fun RtlCopyString(destinationstring: Long, sourcestring: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCopyString(destinationstring.toString(), sourcestring.toString())
    }
}

public actual fun RtlCopyUnicodeString(destinationstring: Long, sourcestring: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCopyUnicodeString(destinationstring.toString(), sourcestring.toString())
    }
}

public actual fun RtlCreateHashTable(hashtable: Long, shift: UInt, flags: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCreateHashTable(hashtable.toString(), shift.toInt(), flags.toInt()) as Boolean) else false

public actual fun RtlCreateHashTableEx(hashtable: Long, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCreateHashTableEx(hashtable.toString(), initialsize.toInt(), shift.toInt(), flags.toInt()) as Boolean) else false

public actual fun RtlCreateRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCreateRegistryKey(relativeto.toInt(), path.toString()) as Int) else 0

public actual fun RtlCreateSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, revision: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlCreateSecurityDescriptor(securitydescriptor.toString(), revision.toInt()) as Int) else 0

public actual fun RtlDelete(links: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlDelete(links.toString()) as String).toLong() else 0L

public actual fun RtlDeleteElementGenericTable(table: Long, buffer: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTable(table.toString(), buffer.toString()) as Boolean) else false

public actual fun RtlDeleteElementGenericTableAvl(table: Long, buffer: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTableAvl(table.toString(), buffer.toString()) as Boolean) else false

public actual fun RtlDeleteElementGenericTableAvlEx(table: Long, nodeorparent: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTableAvlEx(table.toString(), nodeorparent.toString())
    }
}

public actual fun RtlDeleteHashTable(hashtable: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlDeleteHashTable(hashtable.toString())
    }
}

public actual fun RtlDeleteNoSplay(links: Long, root: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlDeleteNoSplay(links.toString(), root.toString())
    }
}

public actual fun RtlDeleteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlDeleteRegistryValue(relativeto.toInt(), path.toString(), valuename.toString()) as Int) else 0

public actual fun RtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlDowncaseUnicodeChar(sourcecharacter.toInt()) as Int).toUShort() else 0u

public actual fun RtlEndEnumerationHashTable(hashtable: Long, enumerator: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEndEnumerationHashTable(hashtable.toString(), enumerator.toString())
    }
}

public actual fun RtlEndStrongEnumerationHashTable(hashtable: Long, enumerator: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEndStrongEnumerationHashTable(hashtable.toString(), enumerator.toString())
    }
}

public actual fun RtlEndWeakEnumerationHashTable(hashtable: Long, enumerator: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEndWeakEnumerationHashTable(hashtable.toString(), enumerator.toString())
    }
}

public actual fun RtlEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEnumerateEntryHashTable(hashtable.toString(), enumerator.toString()) as String).toLong() else 0L

public actual fun RtlEnumerateGenericTable(table: Long, restart: Boolean): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTable(table.toString(), restart) as String).toLong() else 0L

public actual fun RtlEnumerateGenericTableAvl(table: Long, restart: Boolean): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableAvl(table.toString(), restart) as String).toLong() else 0L

public actual fun RtlEnumerateGenericTableLikeADirectory(table: Long, matchfunction: PRTL_AVL_MATCH_FUNCTION, matchdata: Long, nextflag: UInt, restartkey: Long, deletecount: Long, buffer: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableLikeADirectory(table.toString(), matchfunction.toLong().toString(), matchdata.toString(), nextflag.toInt(), restartkey.toString(), deletecount.toString(), buffer.toString()) as String).toLong() else 0L

public actual fun RtlEnumerateGenericTableWithoutSplaying(table: Long, restartkey: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableWithoutSplaying(table.toString(), restartkey.toString()) as String).toLong() else 0L

public actual fun RtlEnumerateGenericTableWithoutSplayingAvl(table: Long, restartkey: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableWithoutSplayingAvl(table.toString(), restartkey.toString()) as String).toLong() else 0L

public actual fun RtlEqualString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEqualString(string1.toString(), string2.toString(), caseinsensitive) as Boolean) else false

public actual fun RtlEqualUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlEqualUnicodeString(string1.toString(), string2.toString(), caseinsensitive) as Boolean) else false

public actual fun RtlExpandHashTable(hashtable: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlExpandHashTable(hashtable.toString()) as Boolean) else false

public actual fun RtlExtractBitMap(source: Long, destination: Long, targetbit: UInt, numberofbits: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlExtractBitMap(source.toString(), destination.toString(), targetbit.toInt(), numberofbits.toInt())
    }
}

public actual fun RtlFindClearBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindClearBits(bitmapheader.toString(), numbertofind.toInt(), hintindex.toInt()) as Int).toUInt() else 0u

public actual fun RtlFindClearBitsAndSet(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindClearBitsAndSet(bitmapheader.toString(), numbertofind.toInt(), hintindex.toInt()) as Int).toUInt() else 0u

public actual fun RtlFindClearRuns(bitmapheader: Long, runarray: Long, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindClearRuns(bitmapheader.toString(), runarray.toString(), sizeofrunarray.toInt(), locatelongestruns) as Int).toUInt() else 0u

public actual fun RtlFindClosestEncodableLength(sourcelength: ULong, targetlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindClosestEncodableLength(sourcelength.toString(), targetlength.toString()) as Int) else 0

public actual fun RtlFindFirstRunClear(bitmapheader: Long, startingindex: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindFirstRunClear(bitmapheader.toString(), startingindex.toString()) as Int).toUInt() else 0u

public actual fun RtlFindLastBackwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindLastBackwardRunClear(bitmapheader.toString(), fromindex.toInt(), startingrunindex.toString()) as Int).toUInt() else 0u

public actual fun RtlFindLeastSignificantBit(set: ULong): Byte =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindLeastSignificantBit(set.toString()) as Int).toByte() else 0

public actual fun RtlFindLongestRunClear(bitmapheader: Long, startingindex: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindLongestRunClear(bitmapheader.toString(), startingindex.toString()) as Int).toUInt() else 0u

public actual fun RtlFindMostSignificantBit(set: ULong): Byte =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindMostSignificantBit(set.toString()) as Int).toByte() else 0

public actual fun RtlFindNextForwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindNextForwardRunClear(bitmapheader.toString(), fromindex.toInt(), startingrunindex.toString()) as Int).toUInt() else 0u

public actual fun RtlFindSetBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindSetBits(bitmapheader.toString(), numbertofind.toInt(), hintindex.toInt()) as Int).toUInt() else 0u

public actual fun RtlFindSetBitsAndClear(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFindSetBitsAndClear(bitmapheader.toString(), numbertofind.toInt(), hintindex.toInt()) as Int).toUInt() else 0u

public actual fun RtlFreeUTF8String(utf8string: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlFreeUTF8String(utf8string.toString())
    }
}

public actual fun RtlGUIDFromString(guidstring: Long, guid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGUIDFromString(guidstring.toString(), guid.toString()) as Int) else 0

public actual fun RtlGenerateClass5Guid(namespaceguid: Long, buffer: Long, buffersize: UInt, guid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGenerateClass5Guid(namespaceguid.toString(), buffer.toString(), buffersize.toInt(), guid.toString()) as Int) else 0

public actual fun RtlGetActiveConsoleId(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetActiveConsoleId() as Int).toUInt() else 0u

public actual fun RtlGetCallersAddress(callersaddress: Long, callerscaller: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetCallersAddress(callersaddress.toString(), callerscaller.toString())
    }
}

public actual fun RtlGetConsoleSessionForegroundProcessId(): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetConsoleSessionForegroundProcessId() as String).toULong() else 0uL

public actual fun RtlGetElementGenericTable(table: Long, i: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetElementGenericTable(table.toString(), i.toInt()) as String).toLong() else 0L

public actual fun RtlGetElementGenericTableAvl(table: Long, i: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetElementGenericTableAvl(table.toString(), i.toInt()) as String).toLong() else 0L

public actual fun RtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetEnabledExtendedFeatures(featuremask.toString()) as String).toULong() else 0uL

public actual fun RtlGetNextEntryHashTable(hashtable: Long, context: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetNextEntryHashTable(hashtable.toString(), context.toString()) as String).toLong() else 0L

public actual fun RtlGetNtProductType(ntproducttype: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetNtProductType(ntproducttype.toString()) as Boolean) else false

public actual fun RtlGetNtSystemRoot(): PCWSTR =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetNtSystemRoot() as String).toLong() else 0L

public actual fun RtlGetPersistedStateLocation(sourceid: PCWSTR, customvalue: PCWSTR, defaultpath: PCWSTR, statelocationtype: STATE_LOCATION_TYPE, targetpath: PWSTR, bufferlengthin: UInt, bufferlengthout: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetPersistedStateLocation(sourceid.toString(), customvalue.toString(), defaultpath.toString(), statelocationtype, targetpath.toString(), bufferlengthin.toInt(), bufferlengthout.toString()) as Int) else 0

public actual fun RtlGetSuiteMask(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetSuiteMask() as Int).toUInt() else 0u

public actual fun RtlGetVersion(lpversioninformation: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlGetVersion(lpversioninformation.toString()) as Int) else 0

public actual fun RtlHashUnicodeString(string: Long, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlHashUnicodeString(string.toString(), caseinsensitive, hashalgorithm.toInt(), hashvalue.toString()) as Int) else 0

public actual fun RtlInitEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInitEnumerationHashTable(hashtable.toString(), enumerator.toString()) as Boolean) else false

public actual fun RtlInitStrongEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInitStrongEnumerationHashTable(hashtable.toString(), enumerator.toString()) as Boolean) else false

public actual fun RtlInitUTF8String(destinationstring: Long, sourcestring: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInitUTF8String(destinationstring.toString(), sourcestring.toString())
    }
}

public actual fun RtlInitUTF8StringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInitUTF8StringEx(destinationstring.toString(), sourcestring.toString()) as Int) else 0

public actual fun RtlInitWeakEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInitWeakEnumerationHashTable(hashtable.toString(), enumerator.toString()) as Boolean) else false

public actual fun RtlInitializeBitMap(bitmapheader: Long, bitmapbuffer: Long, sizeofbitmap: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInitializeBitMap(bitmapheader.toString(), bitmapbuffer.toString(), sizeofbitmap.toInt())
    }
}

public actual fun RtlInitializeGenericTable(table: Long, compareroutine: PRTL_GENERIC_COMPARE_ROUTINE, allocateroutine: PRTL_GENERIC_ALLOCATE_ROUTINE, freeroutine: PRTL_GENERIC_FREE_ROUTINE, tablecontext: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInitializeGenericTable(table.toString(), compareroutine.toLong().toString(), allocateroutine.toLong().toString(), freeroutine.toLong().toString(), tablecontext.toString())
    }
}

public actual fun RtlInitializeGenericTableAvl(table: Long, compareroutine: PRTL_AVL_COMPARE_ROUTINE, allocateroutine: PRTL_AVL_ALLOCATE_ROUTINE, freeroutine: PRTL_AVL_FREE_ROUTINE, tablecontext: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInitializeGenericTableAvl(table.toString(), compareroutine.toLong().toString(), allocateroutine.toLong().toString(), freeroutine.toLong().toString(), tablecontext.toString())
    }
}

public actual fun RtlInsertElementGenericTable(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTable(table.toString(), buffer.toString(), buffersize.toInt(), newelement.toString()) as String).toLong() else 0L

public actual fun RtlInsertElementGenericTableAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableAvl(table.toString(), buffer.toString(), buffersize.toInt(), newelement.toString()) as String).toLong() else 0L

public actual fun RtlInsertElementGenericTableFull(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableFull(table.toString(), buffer.toString(), buffersize.toInt(), newelement.toString(), nodeorparent.toString(), searchresult) as String).toLong() else 0L

public actual fun RtlInsertElementGenericTableFullAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableFullAvl(table.toString(), buffer.toString(), buffersize.toInt(), newelement.toString(), nodeorparent.toString(), searchresult) as String).toLong() else 0L

public actual fun RtlInsertEntryHashTable(hashtable: Long, entry: Long, signature: ULong, context: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInsertEntryHashTable(hashtable.toString(), entry.toString(), signature.toString(), context.toString()) as Boolean) else false

public actual fun RtlInt64ToUnicodeString(value: ULong, base: UInt, string: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlInt64ToUnicodeString(value.toString(), base.toInt(), string.toString()) as Int) else 0

public actual fun RtlIntegerToUnicodeString(value: UInt, base: UInt, string: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIntegerToUnicodeString(value.toInt(), base.toInt(), string.toString()) as Int) else 0

public actual fun RtlIoDecodeMemIoResource(descriptor: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): ULong =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIoDecodeMemIoResource(descriptor.toString(), alignment.toString(), minimumaddress.toString(), maximumaddress.toString()) as String).toULong() else 0uL

public actual fun RtlIoEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIoEncodeMemIoResource(descriptor.toString(), type.toInt(), length.toString(), alignment.toString(), minimumaddress.toString(), maximumaddress.toString()) as Int) else 0

public actual fun RtlIsApiSetImplemented(apisetname: PCSTR): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIsApiSetImplemented(apisetname.toString()) as Int) else 0

public actual fun RtlIsGenericTableEmpty(table: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIsGenericTableEmpty(table.toString()) as Boolean) else false

public actual fun RtlIsGenericTableEmptyAvl(table: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIsGenericTableEmptyAvl(table.toString()) as Boolean) else false

public actual fun RtlIsMultiSessionSku(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIsMultiSessionSku() as Boolean) else false

public actual fun RtlIsMultiUsersInSessionSku(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIsMultiUsersInSessionSku() as Boolean) else false

public actual fun RtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIsNtDdiVersionAvailable(version.toInt()) as Boolean) else false

public actual fun RtlIsServicePackVersionInstalled(version: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIsServicePackVersionInstalled(version.toInt()) as Boolean) else false

public actual fun RtlIsStateSeparationEnabled(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIsStateSeparationEnabled() as Boolean) else false

public actual fun RtlIsUntrustedObject(handle: HANDLE, obj: Long, untrustedobject: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlIsUntrustedObject(handle.toString(), obj.toString(), untrustedobject.toString()) as Int) else 0

public actual fun RtlLengthSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlLengthSecurityDescriptor(securitydescriptor.toString()) as Int).toUInt() else 0u

public actual fun RtlLookupElementGenericTable(table: Long, buffer: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTable(table.toString(), buffer.toString()) as String).toLong() else 0L

public actual fun RtlLookupElementGenericTableAvl(table: Long, buffer: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableAvl(table.toString(), buffer.toString()) as String).toLong() else 0L

public actual fun RtlLookupElementGenericTableFull(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableFull(table.toString(), buffer.toString(), nodeorparent.toString(), searchresult.toString()) as String).toLong() else 0L

public actual fun RtlLookupElementGenericTableFullAvl(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableFullAvl(table.toString(), buffer.toString(), nodeorparent.toString(), searchresult.toString()) as String).toLong() else 0L

public actual fun RtlLookupEntryHashTable(hashtable: Long, signature: ULong, context: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlLookupEntryHashTable(hashtable.toString(), signature.toString(), context.toString()) as String).toLong() else 0L

public actual fun RtlLookupFirstMatchingElementGenericTableAvl(table: Long, buffer: Long, restartkey: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlLookupFirstMatchingElementGenericTableAvl(table.toString(), buffer.toString(), restartkey.toString()) as String).toLong() else 0L

public actual fun RtlMapGenericMask(accessmask: Long, genericmapping: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlMapGenericMask(accessmask.toString(), genericmapping.toString())
    }
}

public actual fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlNormalizeSecurityDescriptor(securitydescriptor.toString(), securitydescriptorlength.toInt(), newsecuritydescriptor.toString(), newsecuritydescriptorlength.toString(), checkonly) as Boolean) else false

public actual fun RtlNumberGenericTableElements(table: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlNumberGenericTableElements(table.toString()) as Int).toUInt() else 0u

public actual fun RtlNumberGenericTableElementsAvl(table: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlNumberGenericTableElementsAvl(table.toString()) as Int).toUInt() else 0u

public actual fun RtlNumberOfClearBits(bitmapheader: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlNumberOfClearBits(bitmapheader.toString()) as Int).toUInt() else 0u

public actual fun RtlNumberOfClearBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlNumberOfClearBitsInRange(bitmapheader.toString(), startingindex.toInt(), length.toInt()) as Int).toUInt() else 0u

public actual fun RtlNumberOfSetBits(bitmapheader: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBits(bitmapheader.toString()) as Int).toUInt() else 0u

public actual fun RtlNumberOfSetBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBitsInRange(bitmapheader.toString(), startingindex.toInt(), length.toInt()) as Int).toUInt() else 0u

public actual fun RtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBitsUlongPtr(target.toString()) as Int).toUInt() else 0u

public actual fun RtlPrefetchMemoryNonTemporal(source: Long, length: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlPrefetchMemoryNonTemporal(source.toString(), length.toString())
    }
}

public actual fun RtlPrefixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlPrefixUnicodeString(string1.toString(), string2.toString(), caseinsensitive) as Boolean) else false

public actual fun RtlQueryRegistryValueWithFallback(primaryhandle: HANDLE, fallbackhandle: HANDLE, valuename: Long, valuelength: UInt, valuetype: Long, valuedata: Long, resultlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlQueryRegistryValueWithFallback(primaryhandle.toString(), fallbackhandle.toString(), valuename.toString(), valuelength.toInt(), valuetype.toString(), valuedata.toString(), resultlength.toString()) as Int) else 0

public actual fun RtlQueryRegistryValues(relativeto: UInt, path: PCWSTR, querytable: Long, context: Long, environment: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlQueryRegistryValues(relativeto.toInt(), path.toString(), querytable.toString(), context.toString(), environment.toString()) as Int) else 0

public actual fun RtlQueryValidationRunlevel(componentname: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlQueryValidationRunlevel(componentname.toString()) as Int).toUInt() else 0u

public actual fun RtlRealPredecessor(links: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlRealPredecessor(links.toString()) as String).toLong() else 0L

public actual fun RtlRealSuccessor(links: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlRealSuccessor(links.toString()) as String).toLong() else 0L

public actual fun RtlRemoveEntryHashTable(hashtable: Long, entry: Long, context: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlRemoveEntryHashTable(hashtable.toString(), entry.toString(), context.toString()) as Boolean) else false

public actual fun RtlRunOnceBeginInitialize(runonce: Long, flags: UInt, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlRunOnceBeginInitialize(runonce.toString(), flags.toInt(), context.toString()) as Int) else 0

public actual fun RtlRunOnceComplete(runonce: Long, flags: UInt, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlRunOnceComplete(runonce.toString(), flags.toInt(), context.toString()) as Int) else 0

public actual fun RtlRunOnceExecuteOnce(runonce: Long, initfn: PRTL_RUN_ONCE_INIT_FN, parameter: Long, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlRunOnceExecuteOnce(runonce.toString(), initfn.toLong().toString(), parameter.toString(), context.toString()) as Int) else 0

public actual fun RtlRunOnceInitialize(runonce: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlRunOnceInitialize(runonce.toString())
    }
}

public actual fun RtlSetAllBits(bitmapheader: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlSetAllBits(bitmapheader.toString())
    }
}

public actual fun RtlSetBit(bitmapheader: Long, bitnumber: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlSetBit(bitmapheader.toString(), bitnumber.toInt())
    }
}

public actual fun RtlSetBits(bitmapheader: Long, startingindex: UInt, numbertoset: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlSetBits(bitmapheader.toString(), startingindex.toInt(), numbertoset.toInt())
    }
}

public actual fun RtlSetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Boolean, dacl: Long, dacldefaulted: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlSetDaclSecurityDescriptor(securitydescriptor.toString(), daclpresent, dacl.toString(), dacldefaulted) as Int) else 0

public actual fun RtlSetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlSetSystemGlobalData(dataid, buffer.toString(), size.toInt()) as Int) else 0

public actual fun RtlSplay(links: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlSplay(links.toString()) as String).toLong() else 0L

public actual fun RtlStringFromGUID(guid: Long, guidstring: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlStringFromGUID(guid.toString(), guidstring.toString()) as Int) else 0

public actual fun RtlStronglyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlStronglyEnumerateEntryHashTable(hashtable.toString(), enumerator.toString()) as String).toLong() else 0L

public actual fun RtlSubtreePredecessor(links: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlSubtreePredecessor(links.toString()) as String).toLong() else 0L

public actual fun RtlSubtreeSuccessor(links: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlSubtreeSuccessor(links.toString()) as String).toLong() else 0L

public actual fun RtlSuffixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlSuffixUnicodeString(string1.toString(), string2.toString(), caseinsensitive) as Boolean) else false

public actual fun RtlTestBit(bitmapheader: Long, bitnumber: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlTestBit(bitmapheader.toString(), bitnumber.toInt()) as Boolean) else false

public actual fun RtlTimeFieldsToTime(timefields: Long, time: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlTimeFieldsToTime(timefields.toString(), time.toString()) as Boolean) else false

public actual fun RtlTimeToTimeFields(time: Long, timefields: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlTimeToTimeFields(time.toString(), timefields.toString())
    }
}

public actual fun RtlUTF8StringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlUTF8StringToUnicodeString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlUTF8ToUnicodeN(unicodestringdestination: PWSTR, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: Long, utf8stringsource: PCSTR, utf8stringbytecount: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlUTF8ToUnicodeN(unicodestringdestination.toString(), unicodestringmaxbytecount.toInt(), unicodestringactualbytecount.toString(), utf8stringsource.toString(), utf8stringbytecount.toInt()) as Int) else 0

public actual fun RtlUnicodeStringToInt64(string: Long, base: UInt, number: Long, endpointer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToInt64(string.toString(), base.toInt(), number.toString(), endpointer.toString()) as Int) else 0

public actual fun RtlUnicodeStringToInteger(string: Long, base: UInt, value: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToInteger(string.toString(), base.toInt(), value.toString()) as Int) else 0

public actual fun RtlUnicodeStringToUTF8String(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToUTF8String(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlUnicodeToUTF8N(utf8stringdestination: PSTR, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: Long, unicodestringsource: Long, unicodestringbytecount: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlUnicodeToUTF8N(utf8stringdestination.toString(), utf8stringmaxbytecount.toInt(), utf8stringactualbytecount.toString(), unicodestringsource.toString(), unicodestringbytecount.toInt()) as Int) else 0

public actual fun RtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlUpcaseUnicodeChar(sourcecharacter.toInt()) as Int).toUShort() else 0u

public actual fun RtlUpcaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlUpcaseUnicodeString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlUpperChar(character: Byte): Byte =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlUpperChar(character.toInt()) as Int).toByte() else 0

public actual fun RtlUpperString(destinationstring: Long, sourcestring: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlUpperString(destinationstring.toString(), sourcestring.toString())
    }
}

public actual fun RtlValidRelativeSecurityDescriptor(securitydescriptorinput: PSECURITY_DESCRIPTOR, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlValidRelativeSecurityDescriptor(securitydescriptorinput.toString(), securitydescriptorlength.toInt(), requiredinformation.toInt()) as Boolean) else false

public actual fun RtlValidSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlValidSecurityDescriptor(securitydescriptor.toString()) as Boolean) else false

public actual fun RtlVerifyVersionInfo(versioninfo: Long, typemask: UInt, conditionmask: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlVerifyVersionInfo(versioninfo.toString(), typemask.toInt(), conditionmask.toString()) as Int) else 0

public actual fun RtlVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlVolumeDeviceToDosName(volumedeviceobject.toString(), dosname.toString()) as Int) else 0

public actual fun RtlWalkFrameChain(callers: Long, count: UInt, flags: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlWalkFrameChain(callers.toString(), count.toInt(), flags.toInt()) as Int).toUInt() else 0u

public actual fun RtlWeaklyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlWeaklyEnumerateEntryHashTable(hashtable.toString(), enumerator.toString()) as String).toLong() else 0L

public actual fun RtlWriteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuelength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlWriteRegistryValue(relativeto.toInt(), path.toString(), valuename.toString(), valuetype.toInt(), valuedata.toString(), valuelength.toInt()) as Int) else 0

public actual fun RtlxAnsiStringToUnicodeSize(ansistring: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlxAnsiStringToUnicodeSize(ansistring.toString()) as Int).toUInt() else 0u

public actual fun RtlxUnicodeStringToAnsiSize(unicodestring: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_RtlxUnicodeStringToAnsiSize(unicodestring.toString()) as Int).toUInt() else 0u

public actual fun SeAccessCheck(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeAccessCheck(securitydescriptor.toString(), subjectsecuritycontext.toString(), subjectcontextlocked, desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.toString(), genericmapping.toString(), accessmode.toInt(), grantedaccess.toString(), accessstatus.toString()) as Boolean) else false

public actual fun SeAssignSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: Boolean, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeAssignSecurity(parentdescriptor.toString(), explicitdescriptor.toString(), newdescriptor.toString(), isdirectoryobject, subjectcontext.toString(), genericmapping.toString(), pooltype) as Int) else 0

public actual fun SeAssignSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeAssignSecurityEx(parentdescriptor.toString(), explicitdescriptor.toString(), newdescriptor.toString(), objecttype.toString(), isdirectoryobject, autoinheritflags.toInt(), subjectcontext.toString(), genericmapping.toString(), pooltype) as Int) else 0

public actual fun SeCaptureSubjectContext(subjectcontext: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeCaptureSubjectContext(subjectcontext.toString())
    }
}

public actual fun SeComputeAutoInheritByObjectType(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, parentsecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeComputeAutoInheritByObjectType(objecttype.toString(), securitydescriptor.toString(), parentsecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun SeDeassignSecurity(securitydescriptor: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeDeassignSecurity(securitydescriptor.toString()) as Int) else 0

public actual fun SeEtwWriteKMCveEvent(cveid: Long, additionaldetails: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeEtwWriteKMCveEvent(cveid.toString(), additionaldetails.toString()) as Int) else 0

public actual fun SeLockSubjectContext(subjectcontext: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeLockSubjectContext(subjectcontext.toString())
    }
}

public actual fun SeRegisterImageVerificationCallback(imagetype: SE_IMAGE_TYPE, callbacktype: SE_IMAGE_VERIFICATION_CALLBACK_TYPE, callbackfunction: PSE_IMAGE_VERIFICATION_CALLBACK_FUNCTION, callbackcontext: Long, token: Long, callbackhandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeRegisterImageVerificationCallback(imagetype, callbacktype, callbackfunction.toLong().toString(), callbackcontext.toString(), token.toString(), callbackhandle.toString()) as Int) else 0

public actual fun SeReleaseSubjectContext(subjectcontext: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeReleaseSubjectContext(subjectcontext.toString())
    }
}

public actual fun SeReportSecurityEvent(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeReportSecurityEvent(flags.toInt(), sourcename.toString(), usersid.toString(), auditparameters.toString()) as Int) else 0

public actual fun SeSetAuditParameter(auditparameters: Long, type: SE_ADT_PARAMETER_TYPE, index: UInt, data: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeSetAuditParameter(auditparameters.toString(), type, index.toInt(), data.toString()) as Int) else 0

public actual fun SeSinglePrivilegeCheck(privilegevalue: LUID, previousmode: Byte): Boolean =
    false

public actual fun SeUnlockSubjectContext(subjectcontext: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeUnlockSubjectContext(subjectcontext.toString())
    }
}

public actual fun SeUnregisterImageVerificationCallback(callbackhandle: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeUnregisterImageVerificationCallback(callbackhandle.toString())
    }
}

public actual fun SeValidSecurityDescriptor(length: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_SeValidSecurityDescriptor(length.toInt(), securitydescriptor.toString()) as Boolean) else false

public actual fun TmCommitComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmCommitComplete(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun TmCommitEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmCommitEnlistment(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun TmCommitTransaction(transaction: Long, wait: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmCommitTransaction(transaction.toString(), wait) as Int) else 0

public actual fun TmCreateEnlistment(enlistmenthandle: Long, previousmode: Byte, desiredaccess: UInt, objectattributes: Long, resourcemanager: Long, transaction: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmCreateEnlistment(enlistmenthandle.toString(), previousmode.toInt(), desiredaccess.toInt(), objectattributes.toString(), resourcemanager.toString(), transaction.toString(), createoptions.toInt(), notificationmask.toInt(), enlistmentkey.toString()) as Int) else 0

public actual fun TmDereferenceEnlistmentKey(enlistment: Long, lastreference: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmDereferenceEnlistmentKey(enlistment.toString(), lastreference.toString()) as Int) else 0

public actual fun TmEnableCallbacks(resourcemanager: Long, callbackroutine: PTM_RM_NOTIFICATION, rmkey: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmEnableCallbacks(resourcemanager.toString(), callbackroutine.toLong().toString(), rmkey.toString()) as Int) else 0

public actual fun TmGetTransactionId(transaction: Long, transactionid: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmGetTransactionId(transaction.toString(), transactionid.toString())
    }
}

public actual fun TmInitializeTransactionManager(transactionmanager: Long, logfilename: Long, tmid: Long, createoptions: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmInitializeTransactionManager(transactionmanager.toString(), logfilename.toString(), tmid.toString(), createoptions.toInt()) as Int) else 0

public actual fun TmIsTransactionActive(transaction: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmIsTransactionActive(transaction.toString()) as Boolean) else false

public actual fun TmPrePrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmPrePrepareComplete(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun TmPrePrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmPrePrepareEnlistment(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun TmPrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmPrepareComplete(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun TmPrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmPrepareEnlistment(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun TmPropagationComplete(resourcemanager: Long, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmPropagationComplete(resourcemanager.toString(), requestcookie.toInt(), bufferlength.toInt(), buffer.toString()) as Int) else 0

public actual fun TmPropagationFailed(resourcemanager: Long, requestcookie: UInt, status: NTSTATUS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmPropagationFailed(resourcemanager.toString(), requestcookie.toInt(), status) as Int) else 0

public actual fun TmReadOnlyEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmReadOnlyEnlistment(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun TmRecoverEnlistment(enlistment: Long, enlistmentkey: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmRecoverEnlistment(enlistment.toString(), enlistmentkey.toString()) as Int) else 0

public actual fun TmRecoverResourceManager(resourcemanager: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmRecoverResourceManager(resourcemanager.toString()) as Int) else 0

public actual fun TmRecoverTransactionManager(tm: Long, targetvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmRecoverTransactionManager(tm.toString(), targetvirtualclock.toString()) as Int) else 0

public actual fun TmReferenceEnlistmentKey(enlistment: Long, key: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmReferenceEnlistmentKey(enlistment.toString(), key.toString()) as Int) else 0

public actual fun TmRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmRenameTransactionManager(logfilename.toString(), existingtransactionmanagerguid.toString()) as Int) else 0

public actual fun TmRequestOutcomeEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmRequestOutcomeEnlistment(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun TmRollbackComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmRollbackComplete(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun TmRollbackEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmRollbackEnlistment(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun TmRollbackTransaction(transaction: Long, wait: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmRollbackTransaction(transaction.toString(), wait) as Int) else 0

public actual fun TmSinglePhaseReject(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_TmSinglePhaseReject(enlistment.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun VslCreateSecureSection(handle: Long, targetprocess: PEPROCESS, mdl: Long, devicepageprotection: UInt, attributes: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_VslCreateSecureSection(handle.toString(), targetprocess.toString(), mdl.toString(), devicepageprotection.toInt(), attributes.toInt()) as Int) else 0

public actual fun VslDeleteSecureSection(globalhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_VslDeleteSecureSection(globalhandle.toString()) as Int) else 0

public actual fun WheaAddErrorSource(errorsource: Long, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaAddErrorSource(errorsource.toString(), context.toString()) as Int) else 0

public actual fun WheaAddErrorSourceDeviceDriver(context: Long, configuration: Long, numberpreallocatederrorreports: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaAddErrorSourceDeviceDriver(context.toString(), configuration.toString(), numberpreallocatederrorreports.toInt()) as Int) else 0

public actual fun WheaAddErrorSourceDeviceDriverV1(context: Long, configuration: Long, numbufferstopreallocate: UInt, maxdatalength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaAddErrorSourceDeviceDriverV1(context.toString(), configuration.toString(), numbufferstopreallocate.toInt(), maxdatalength.toInt()) as Int) else 0

public actual fun WheaAddHwErrorReportSectionDeviceDriver(errorhandle: Long, sectiondatalength: UInt, bufferset: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaAddHwErrorReportSectionDeviceDriver(errorhandle.toString(), sectiondatalength.toInt(), bufferset.toString()) as Int) else 0

public actual fun WheaConfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE, configuration: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaConfigureErrorSource(sourcetype, configuration.toString()) as Int) else 0

public actual fun WheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: Long): Long =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaCreateHwErrorReportDeviceDriver(errorsourceid.toInt(), deviceobject.toString()) as String).toLong() else 0L

public actual fun WheaErrorSourceGetState(errorsourceid: UInt): WHEA_ERROR_SOURCE_STATE =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaErrorSourceGetState(errorsourceid.toInt()) as Int) else 0

public actual fun WheaGetNotifyAllOfflinesPolicy(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaGetNotifyAllOfflinesPolicy() as Boolean) else false

public actual fun WheaHighIrqlLogSelEventHandlerRegister(handler: PFN_WHEA_HIGH_IRQL_LOG_SEL_EVENT_HANDLER, context: Long): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaHighIrqlLogSelEventHandlerRegister(handler.toLong().toString(), context.toString()) as Boolean) else false

public actual fun WheaHighIrqlLogSelEventHandlerUnregister() {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaHighIrqlLogSelEventHandlerUnregister()
    }
}

public actual fun WheaHwErrorReportAbandonDeviceDriver(errorhandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportAbandonDeviceDriver(errorhandle.toString()) as Int) else 0

public actual fun WheaHwErrorReportSetSectionNameDeviceDriver(bufferset: Long, namelength: UInt, name: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSetSectionNameDeviceDriver(bufferset.toString(), namelength.toInt(), name.toString()) as Int) else 0

public actual fun WheaHwErrorReportSetSeverityDeviceDriver(errorhandle: Long, errorseverity: WHEA_ERROR_SEVERITY): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSetSeverityDeviceDriver(errorhandle.toString(), errorseverity) as Int) else 0

public actual fun WheaHwErrorReportSubmitDeviceDriver(errorhandle: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSubmitDeviceDriver(errorhandle.toString()) as Int) else 0

public actual fun WheaInitializeRecordHeader(header: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaInitializeRecordHeader(header.toString()) as Int) else 0

public actual fun WheaIsCriticalState(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaIsCriticalState() as Boolean) else false

public actual fun WheaLogInternalEvent(entry: Long) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaLogInternalEvent(entry.toString())
    }
}

public actual fun WheaRegisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY, context: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaRegisterInUsePageOfflineNotification(callback.toLong().toString(), context.toString()) as Int) else 0

public actual fun WheaRemoveErrorSource(errorsourceid: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAddon != null) {
        _windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaRemoveErrorSource(errorsourceid.toInt())
    }
}

public actual fun WheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaRemoveErrorSourceDeviceDriver(errorsourceid.toInt()) as Int) else 0

public actual fun WheaReportHwError(errorpacket: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaReportHwError(errorpacket.toString()) as Int) else 0

public actual fun WheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: Long, errordata: Long, errordatalength: UInt, sectiontypeguid: Long, errorseverity: WHEA_ERROR_SEVERITY, devicefriendlyname: PCSTR): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaReportHwErrorDeviceDriver(errorsourceid.toInt(), deviceobject.toString(), errordata.toString(), errordatalength.toInt(), sectiontypeguid.toString(), errorseverity, devicefriendlyname.toString()) as Int) else 0

public actual fun WheaUnconfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaUnconfigureErrorSource(sourcetype) as Int) else 0

public actual fun WheaUnregisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WheaUnregisterInUsePageOfflineNotification(callback.toLong().toString()) as Int) else 0

public actual fun WmiQueryTraceInformation(traceinformationclass: TRACE_INFORMATION_CLASS, traceinformation: Long, traceinformationlength: UInt, requiredlength: Long, buffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_WmiQueryTraceInformation(traceinformationclass, traceinformation.toString(), traceinformationlength.toInt(), requiredlength.toString(), buffer.toString()) as Int) else 0

public actual fun ZwAllocateLocallyUniqueId(luid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwAllocateLocallyUniqueId(luid.toString()) as Int) else 0

public actual fun ZwClose(handle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwClose(handle.toString()) as Int) else 0

public actual fun ZwCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwCommitComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwCommitEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwCommitTransaction(transactionhandle.toString(), wait) as Int) else 0

public actual fun ZwCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwCreateEnlistment(enlistmenthandle.toString(), desiredaccess.toInt(), resourcemanagerhandle.toString(), transactionhandle.toString(), objectattributes.toString(), createoptions.toInt(), notificationmask.toInt(), enlistmentkey.toString()) as Int) else 0

public actual fun ZwCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwCreateFile(filehandle.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), allocationsize.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.toString(), ealength.toInt()) as Int) else 0

public actual fun ZwCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwCreateResourceManager(resourcemanagerhandle.toString(), desiredaccess.toInt(), tmhandle.toString(), resourcemanagerguid.toString(), objectattributes.toString(), createoptions.toInt(), description.toString()) as Int) else 0

public actual fun ZwCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwCreateSection(sectionhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), maximumsize.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.toString()) as Int) else 0

public actual fun ZwCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwCreateTransaction(transactionhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), uow.toString(), tmhandle.toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toString(), description.toString()) as Int) else 0

public actual fun ZwCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwCreateTransactionManager(tmhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), logfilename.toString(), createoptions.toInt(), commitstrength.toInt()) as Int) else 0

public actual fun ZwDeviceIoControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun ZwDisplayString(string: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwDisplayString(string.toString()) as Int) else 0

public actual fun ZwEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwEnumerateTransactionObject(rootobjecthandle.toString(), querytype, objectcursor.toString(), objectcursorlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ZwGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwGetNotificationResourceManager(resourcemanagerhandle.toString(), transactionnotification.toString(), notificationlength.toInt(), timeout.toString(), returnlength.toString(), asynchronous.toInt(), asynchronouscontext.toString()) as Int) else 0

public actual fun ZwLoadDriver(driverservicename: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwLoadDriver(driverservicename.toString()) as Int) else 0

public actual fun ZwMakeTemporaryObject(handle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwMakeTemporaryObject(handle.toString()) as Int) else 0

public actual fun ZwManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwManagePartition(targethandle.toString(), sourcehandle.toString(), partitioninformationclass, partitioninformation.toString(), partitioninformationlength.toInt()) as Int) else 0

public actual fun ZwOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, rmhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwOpenEnlistment(enlistmenthandle.toString(), desiredaccess.toInt(), rmhandle.toString(), enlistmentguid.toString(), objectattributes.toString()) as Int) else 0

public actual fun ZwOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwOpenFile(filehandle.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), shareaccess.toInt(), openoptions.toInt()) as Int) else 0

public actual fun ZwOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwOpenResourceManager(resourcemanagerhandle.toString(), desiredaccess.toInt(), tmhandle.toString(), resourcemanagerguid.toString(), objectattributes.toString()) as Int) else 0

public actual fun ZwOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwOpenSymbolicLinkObject(linkhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun ZwOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwOpenTransaction(transactionhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), uow.toString(), tmhandle.toString()) as Int) else 0

public actual fun ZwOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwOpenTransactionManager(tmhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), logfilename.toString(), tmidentity.toString(), openoptions.toInt()) as Int) else 0

public actual fun ZwPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwPowerInformation(informationlevel, inputbuffer.toString(), inputbufferlength.toInt(), outputbuffer.toString(), outputbufferlength.toInt()) as Int) else 0

public actual fun ZwPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwPrePrepareComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwPrePrepareEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwPrepareComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwPrepareEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwPropagationComplete(resourcemanagerhandle.toString(), requestcookie.toInt(), bufferlength.toInt(), buffer.toString()) as Int) else 0

public actual fun ZwPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwPropagationFailed(resourcemanagerhandle.toString(), requestcookie.toInt(), propstatus) as Int) else 0

public actual fun ZwQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwQueryInformationByName(objectattributes.toString(), iostatusblock.toString(), fileinformation.toString(), length.toInt(), fileinformationclass) as Int) else 0

public actual fun ZwQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwQueryInformationEnlistment(enlistmenthandle.toString(), enlistmentinformationclass, enlistmentinformation.toString(), enlistmentinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ZwQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwQueryInformationFile(filehandle.toString(), iostatusblock.toString(), fileinformation.toString(), length.toInt(), fileinformationclass) as Int) else 0

public actual fun ZwQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwQueryInformationResourceManager(resourcemanagerhandle.toString(), resourcemanagerinformationclass, resourcemanagerinformation.toString(), resourcemanagerinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ZwQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwQueryInformationTransaction(transactionhandle.toString(), transactioninformationclass, transactioninformation.toString(), transactioninformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ZwQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwQueryInformationTransactionManager(transactionmanagerhandle.toString(), transactionmanagerinformationclass, transactionmanagerinformation.toString(), transactionmanagerinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ZwQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwQuerySymbolicLinkObject(linkhandle.toString(), linktarget.toString(), returnedlength.toString()) as Int) else 0

public actual fun ZwReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun ZwReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwReadOnlyEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwRecoverEnlistment(enlistmenthandle.toString(), enlistmentkey.toString()) as Int) else 0

public actual fun ZwRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwRecoverResourceManager(resourcemanagerhandle.toString()) as Int) else 0

public actual fun ZwRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwRecoverTransactionManager(transactionmanagerhandle.toString()) as Int) else 0

public actual fun ZwRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwRegisterProtocolAddressInformation(resourcemanager.toString(), protocolid.toString(), protocolinformationsize.toInt(), protocolinformation.toString(), createoptions.toInt()) as Int) else 0

public actual fun ZwRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwRenameTransactionManager(logfilename.toString(), existingtransactionmanagerguid.toString()) as Int) else 0

public actual fun ZwRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwRollbackComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwRollbackEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwRollbackTransaction(transactionhandle.toString(), wait) as Int) else 0

public actual fun ZwRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwRollforwardTransactionManager(transactionmanagerhandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwSetInformationEnlistment(enlistmenthandle.toString(), enlistmentinformationclass, enlistmentinformation.toString(), enlistmentinformationlength.toInt()) as Int) else 0

public actual fun ZwSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwSetInformationFile(filehandle.toString(), iostatusblock.toString(), fileinformation.toString(), length.toInt(), fileinformationclass) as Int) else 0

public actual fun ZwSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwSetInformationResourceManager(resourcemanagerhandle.toString(), resourcemanagerinformationclass, resourcemanagerinformation.toString(), resourcemanagerinformationlength.toInt()) as Int) else 0

public actual fun ZwSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwSetInformationTransaction(transactionhandle.toString(), transactioninformationclass, transactioninformation.toString(), transactioninformationlength.toInt()) as Int) else 0

public actual fun ZwSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwSetInformationTransactionManager(tmhandle.toString(), transactionmanagerinformationclass, transactionmanagerinformation.toString(), transactionmanagerinformationlength.toInt()) as Int) else 0

public actual fun ZwSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwSinglePhaseReject(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ZwUnloadDriver(driverservicename: Long): NTSTATUS =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_ZwUnloadDriver(driverservicename.toString()) as Int) else 0

public actual fun ZwWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_vDbgPrintEx(componentid.toInt(), level.toInt(), format.toString(), arglist.toString()) as Int).toUInt() else 0u

public actual fun vDbgPrintExWithPrefix(prefix: PCSTR, componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAddon != null) (_windowsWdkSystemSystemservicesNapiAddon.windowssys_windows_wdk_system_systemservices_vDbgPrintExWithPrefix(prefix.toString(), componentid.toInt(), level.toInt(), format.toString(), arglist.toString()) as Int).toUInt() else 0u
