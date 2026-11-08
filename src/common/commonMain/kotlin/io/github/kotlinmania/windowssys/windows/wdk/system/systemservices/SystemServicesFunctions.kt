package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_CANCEL
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_CONTROL
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_NOTIFICATION_CALLBACK_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_REINITIALIZE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IO_PRIORITY_HINT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PCALLBACK_OBJECT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PESILO
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEX_RUNDOWN_REF_CACHE_AWARE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEX_TIMER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PFREE_FUNCTION
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PIO_COMPLETION_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PIO_WORKITEM
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKDEFERRED_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKINTERRUPT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKTHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POOL_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FILE_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_CONTEXT_MODE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_IOSTATS_CLASS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_MGMT_POLICY_TYPE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLS_LOG_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLS_LSN
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.BUGCHECK_ERROR
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EVENT_INFO_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.REGHANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EVENT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SUITE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.FIRMWARE_TYPE

public fun interface FnCallback {
    public operator fun invoke(): Long
}

public fun interface FnCallback1 {
    public operator fun invoke(logfile: Long, operationstatus: NTSTATUS, clientdata: Long)
}

public fun interface FnCallback2 {
    public operator fun invoke(): NTSTATUS
}

public fun interface FnCallback3 {
    public operator fun invoke(output: Long, componentid: UInt, level: UInt)
}

public fun interface FnCallback4 {
    public operator fun invoke()
}

public fun interface FnCallback5 {
    public operator fun invoke(columns: UInt, rows: UInt): Boolean
}

public fun interface FnCallback6 {
    public operator fun invoke(): Boolean
}

public fun interface FnCallback7 {
    public operator fun invoke(context: Long, pathname: Long, bustype: INTERFACE_TYPE, busnumber: UInt, businformation: Long, controllertype: CONFIGURATION_TYPE, controllernumber: UInt, controllerinformation: Long, peripheraltype: CONFIGURATION_TYPE, peripheralnumber: UInt, peripheralinformation: Long): NTSTATUS
}

public fun interface FnCallback8 {
    public operator fun invoke(status: NTSTATUS, context: Long)
}

public fun ClfsAddLogContainer(plfolog: Long, pcbcontainer: Long, puszcontainerpath: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsAddLogContainer", longArrayOf(plfolog, pcbcontainer, puszcontainerpath)).toInt()
}

public fun ClfsAddLogContainerSet(plfolog: Long, ccontainers: UShort, pcbcontainer: Long, rguszcontainerpath: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsAddLogContainerSet", longArrayOf(plfolog, ccontainers.toLong(), pcbcontainer, rguszcontainerpath)).toInt()
}

public fun ClfsAdvanceLogBase(pvmarshalcontext: Long, plsnbase: Long, fflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsAdvanceLogBase", longArrayOf(pvmarshalcontext, plsnbase, fflags.toLong())).toInt()
}

public fun ClfsAlignReservedLog(pvmarshalcontext: Long, crecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsAlignReservedLog", longArrayOf(pvmarshalcontext, crecords.toLong(), rgcbreservation, pcbalignreservation)).toInt()
}

public fun ClfsAllocReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsAllocReservedLog", longArrayOf(pvmarshalcontext, crecords.toLong(), pcbadjustment)).toInt()
}

public fun ClfsCloseAndResetLogFile(plfolog: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsCloseAndResetLogFile", longArrayOf(plfolog)).toInt()
}

public fun ClfsCloseLogFileObject(plfolog: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsCloseLogFileObject", longArrayOf(plfolog)).toInt()
}

public fun ClfsCreateLogFile(pplfolog: Long, puszlogfilename: Long, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PSECURITY_DESCRIPTOR, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsCreateLogFile", longArrayOf(pplfolog, puszlogfilename, fdesiredaccess.toLong(), dwsharemode.toLong(), psdlogfile, fcreatedisposition.toLong(), fcreateoptions.toLong(), fflagsandattributes.toLong(), flogoptionflag.toLong(), pvcontext, cbcontext.toLong())).toInt()
}

public fun ClfsCreateMarshallingArea(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsCreateMarshallingArea", longArrayOf(plfolog, epooltype.toLong(), Win32DynamicFfi.objectSlot(pfnallocbuffer), Win32DynamicFfi.objectSlot(pfnfreebuffer), cbmarshallingbuffer.toLong(), cmaxwritebuffers.toLong(), cmaxreadbuffers.toLong(), ppvmarshalcontext)).toInt()
}

public fun ClfsCreateMarshallingAreaEx(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsCreateMarshallingAreaEx", longArrayOf(plfolog, epooltype.toLong(), Win32DynamicFfi.objectSlot(pfnallocbuffer), Win32DynamicFfi.objectSlot(pfnfreebuffer), cbmarshallingbuffer.toLong(), cmaxwritebuffers.toLong(), cmaxreadbuffers.toLong(), calignmentsize.toLong(), fflags.toLong(), ppvmarshalcontext)).toInt()
}

public fun ClfsCreateScanContext(plfolog: Long, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsCreateScanContext", longArrayOf(plfolog, cfromcontainer.toLong(), ccontainers.toLong(), escanmode.toLong(), pcxscan)).toInt()
}

public fun ClfsDeleteLogByPointer(plfolog: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsDeleteLogByPointer", longArrayOf(plfolog)).toInt()
}

public fun ClfsDeleteLogFile(puszlogfilename: Long, pvreserved: Long, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsDeleteLogFile", longArrayOf(puszlogfilename, pvreserved, flogoptionflag.toLong(), pvcontext, cbcontext.toLong())).toInt()
}

public fun ClfsDeleteMarshallingArea(pvmarshalcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsDeleteMarshallingArea", longArrayOf(pvmarshalcontext)).toInt()
}

public fun ClfsEarlierLsn(plsn: Long): CLS_LSN {
    val rawRet = Win32DynamicFfi.invoke("clfs.sys", "ClfsEarlierLsn", longArrayOf(plsn))
    return CLS_LSN(Internal = rawRet.toULong())
}

public fun ClfsFinalize() {
    Win32DynamicFfi.invoke("clfs.sys", "ClfsFinalize", longArrayOf())
}

public fun ClfsFlushBuffers(pvmarshalcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsFlushBuffers", longArrayOf(pvmarshalcontext)).toInt()
}

public fun ClfsFlushToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsFlushToLsn", longArrayOf(pvmarshalcontext, plsnflush, plsnlastflushed)).toInt()
}

public fun ClfsFreeReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsFreeReservedLog", longArrayOf(pvmarshalcontext, crecords.toLong(), pcbadjustment)).toInt()
}

public fun ClfsGetContainerName(plfolog: Long, cidlogicalcontainer: UInt, puszcontainername: Long, pcactuallencontainername: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsGetContainerName", longArrayOf(plfolog, cidlogicalcontainer.toLong(), puszcontainername, pcactuallencontainername)).toInt()
}

public fun ClfsGetIoStatistics(plfolog: Long, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsGetIoStatistics", longArrayOf(plfolog, pvstatsbuffer, cbstatsbuffer.toLong(), estatsclass.toLong(), pcbstatswritten)).toInt()
}

public fun ClfsGetLogFileInformation(plfolog: Long, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsGetLogFileInformation", longArrayOf(plfolog, pinfobuffer, pcbinfobuffer)).toInt()
}

public fun ClfsInitialize(): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsInitialize", longArrayOf()).toInt()
}

public fun ClfsLaterLsn(plsn: Long): CLS_LSN {
    val rawRet = Win32DynamicFfi.invoke("clfs.sys", "ClfsLaterLsn", longArrayOf(plsn))
    return CLS_LSN(Internal = rawRet.toULong())
}

public fun ClfsLsnBlockOffset(plsn: Long): UInt {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsLsnBlockOffset", longArrayOf(plsn)).toUInt()
}

public fun ClfsLsnContainer(plsn: Long): UInt {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsLsnContainer", longArrayOf(plsn)).toUInt()
}

public fun ClfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN {
    val rawRet = Win32DynamicFfi.invoke("clfs.sys", "ClfsLsnCreate", longArrayOf(cidcontainer.toLong(), offblock.toLong(), crecord.toLong()))
    return CLS_LSN(Internal = rawRet.toULong())
}

public fun ClfsLsnDifference(plsnstart: Long, plsnfinish: Long, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsLsnDifference", longArrayOf(plsnstart, plsnfinish, cbcontainer.toLong(), cbmaxblock.toLong(), pcbdifference)).toInt()
}

public fun ClfsLsnEqual(plsn1: Long, plsn2: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("clfs.sys", "ClfsLsnEqual", longArrayOf(plsn1, plsn2))
    return (rawRet and 0xFFL) != 0L
}

public fun ClfsLsnGreater(plsn1: Long, plsn2: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("clfs.sys", "ClfsLsnGreater", longArrayOf(plsn1, plsn2))
    return (rawRet and 0xFFL) != 0L
}

public fun ClfsLsnInvalid(plsn: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("clfs.sys", "ClfsLsnInvalid", longArrayOf(plsn))
    return (rawRet and 0xFFL) != 0L
}

public fun ClfsLsnLess(plsn1: Long, plsn2: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("clfs.sys", "ClfsLsnLess", longArrayOf(plsn1, plsn2))
    return (rawRet and 0xFFL) != 0L
}

public fun ClfsLsnNull(plsn: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("clfs.sys", "ClfsLsnNull", longArrayOf(plsn))
    return (rawRet and 0xFFL) != 0L
}

public fun ClfsLsnRecordSequence(plsn: Long): UInt {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsLsnRecordSequence", longArrayOf(plsn)).toUInt()
}

public fun ClfsMgmtDeregisterManagedClient(clientcookie: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsMgmtDeregisterManagedClient", longArrayOf(clientcookie)).toInt()
}

public fun ClfsMgmtHandleLogFileFull(client: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsMgmtHandleLogFileFull", longArrayOf(client)).toInt()
}

public fun ClfsMgmtInstallPolicy(logfile: Long, policy: Long, policylength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsMgmtInstallPolicy", longArrayOf(logfile, policy, policylength.toLong())).toInt()
}

public fun ClfsMgmtQueryPolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE, policy: Long, policylength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsMgmtQueryPolicy", longArrayOf(logfile, policytype.toLong(), policy, policylength)).toInt()
}

public fun ClfsMgmtRegisterManagedClient(logfile: Long, registrationdata: Long, clientcookie: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsMgmtRegisterManagedClient", longArrayOf(logfile, registrationdata, clientcookie)).toInt()
}

public fun ClfsMgmtRemovePolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsMgmtRemovePolicy", longArrayOf(logfile, policytype.toLong())).toInt()
}

public fun ClfsMgmtSetLogFileSize(logfile: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsMgmtSetLogFileSize", longArrayOf(logfile, newsizeincontainers, resultingsizeincontainers, Win32DynamicFfi.objectSlot(completionroutine), completionroutinedata)).toInt()
}

public fun ClfsMgmtSetLogFileSizeAsClient(logfile: Long, clientcookie: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsMgmtSetLogFileSizeAsClient", longArrayOf(logfile, clientcookie, newsizeincontainers, resultingsizeincontainers, Win32DynamicFfi.objectSlot(completionroutine), completionroutinedata)).toInt()
}

public fun ClfsMgmtTailAdvanceFailure(client: Long, reason: NTSTATUS): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsMgmtTailAdvanceFailure", longArrayOf(client, reason.toLong())).toInt()
}

public fun ClfsQueryLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfoinputbuffer: Long, cbinfoinputbuffer: UInt, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsQueryLogFileInformation", longArrayOf(plfolog, einformationclass.toLong(), pinfoinputbuffer, cbinfoinputbuffer.toLong(), pinfobuffer, pcbinfobuffer)).toInt()
}

public fun ClfsReadLogRecord(pvmarshalcontext: Long, plsnfirst: Long, pecontextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsReadLogRecord", longArrayOf(pvmarshalcontext, plsnfirst, pecontextmode.toLong(), ppvreadbuffer, pcbreadbuffer, perecordtype, plsnundonext, plsnprevious, ppvreadcontext)).toInt()
}

public fun ClfsReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsReadNextLogRecord", longArrayOf(pvreadcontext, ppvbuffer, pcbbuffer, perecordtype, plsnuser, plsnundonext, plsnprevious, plsnrecord)).toInt()
}

public fun ClfsReadPreviousRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsReadPreviousRestartArea", longArrayOf(pvreadcontext, ppvrestartbuffer, pcbrestartbuffer, plsnrestart)).toInt()
}

public fun ClfsReadRestartArea(pvmarshalcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvreadcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsReadRestartArea", longArrayOf(pvmarshalcontext, ppvrestartbuffer, pcbrestartbuffer, plsn, ppvreadcontext)).toInt()
}

public fun ClfsRemoveLogContainer(plfolog: Long, puszcontainerpath: Long, fforce: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsRemoveLogContainer", longArrayOf(plfolog, puszcontainerpath, if (fforce) 1L else 0L)).toInt()
}

public fun ClfsRemoveLogContainerSet(plfolog: Long, ccontainers: UShort, rgwszcontainerpath: Long, fforce: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsRemoveLogContainerSet", longArrayOf(plfolog, ccontainers.toLong(), rgwszcontainerpath, if (fforce) 1L else 0L)).toInt()
}

public fun ClfsReserveAndAppendLog(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsReserveAndAppendLog", longArrayOf(pvmarshalcontext, rgwriteentries, cwriteentries.toLong(), plsnundonext, plsnprevious, creserverecords.toLong(), rgcbreservation, fflags.toLong(), plsn)).toInt()
}

public fun ClfsReserveAndAppendLogAligned(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsReserveAndAppendLogAligned", longArrayOf(pvmarshalcontext, rgwriteentries, cwriteentries.toLong(), cbentryalignment.toLong(), plsnundonext, plsnprevious, creserverecords.toLong(), rgcbreservation, fflags.toLong(), plsn)).toInt()
}

public fun ClfsScanLogContainers(pcxscan: Long, escanmode: UByte): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsScanLogContainers", longArrayOf(pcxscan, escanmode.toLong())).toInt()
}

public fun ClfsSetArchiveTail(plfolog: Long, plsnarchivetail: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsSetArchiveTail", longArrayOf(plfolog, plsnarchivetail)).toInt()
}

public fun ClfsSetEndOfLog(plfolog: Long, plsnend: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsSetEndOfLog", longArrayOf(plfolog, plsnend)).toInt()
}

public fun ClfsSetLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfobuffer: Long, cbbuffer: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsSetLogFileInformation", longArrayOf(plfolog, einformationclass.toLong(), pinfobuffer, cbbuffer.toLong())).toInt()
}

public fun ClfsTerminateReadLog(pvcursorcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsTerminateReadLog", longArrayOf(pvcursorcontext)).toInt()
}

public fun ClfsWriteRestartArea(pvmarshalcontext: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: UInt, pcbwritten: Long, plsnnext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("clfs.sys", "ClfsWriteRestartArea", longArrayOf(pvmarshalcontext, pvrestartbuffer, cbrestartbuffer.toLong(), plsnbase, fflags.toLong(), pcbwritten, plsnnext)).toInt()
}

public fun CmCallbackGetKeyObjectID(cookie: Long, obj: Long, objectid: Long, objectname: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CmCallbackGetKeyObjectID", longArrayOf(cookie, obj, objectid, objectname)).toInt()
}

public fun CmCallbackGetKeyObjectIDEx(cookie: Long, obj: Long, objectid: Long, objectname: Long, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CmCallbackGetKeyObjectIDEx", longArrayOf(cookie, obj, objectid, objectname, flags.toLong())).toInt()
}

public fun CmCallbackReleaseKeyObjectIDEx(objectname: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CmCallbackReleaseKeyObjectIDEx", longArrayOf(objectname))
}

public fun CmGetBoundTransaction(cookie: Long, obj: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CmGetBoundTransaction", longArrayOf(cookie, obj))
}

public fun CmGetCallbackVersion(major: Long, minor: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CmGetCallbackVersion", longArrayOf(major, minor))
}

public fun CmRegisterCallback(function: PEX_CALLBACK_FUNCTION, context: Long, cookie: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CmRegisterCallback", longArrayOf(Win32DynamicFfi.objectSlot(function), context, cookie)).toInt()
}

public fun CmRegisterCallbackEx(function: PEX_CALLBACK_FUNCTION, altitude: Long, driver: Long, context: Long, cookie: Long, reserved: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CmRegisterCallbackEx", longArrayOf(Win32DynamicFfi.objectSlot(function), altitude, driver, context, cookie, reserved)).toInt()
}

public fun CmSetCallbackObjectContext(obj: Long, cookie: Long, newcontext: Long, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CmSetCallbackObjectContext", longArrayOf(obj, cookie, newcontext, oldcontext)).toInt()
}

public fun CmUnRegisterCallback(cookie: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CmUnRegisterCallback", longArrayOf(cookie)).toInt()
}

public fun DbgBreakPointWithStatus(status: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "DbgBreakPointWithStatus", longArrayOf(status.toLong()))
}

public fun DbgPrint(format: PCSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "DbgPrint", longArrayOf(format) + variadicArgs).toUInt()
}

public fun DbgPrintEx(componentid: UInt, level: UInt, format: PCSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "DbgPrintEx", longArrayOf(componentid.toLong(), level.toLong(), format) + variadicArgs).toUInt()
}

public fun DbgPrintReturnControlC(format: PCSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "DbgPrintReturnControlC", longArrayOf(format) + variadicArgs).toUInt()
}

public fun DbgPrompt(prompt: PCSTR, response: PSTR, length: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "DbgPrompt", longArrayOf(prompt, response, length.toLong())).toUInt()
}

public fun DbgQueryDebugFilterState(componentid: UInt, level: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "DbgQueryDebugFilterState", longArrayOf(componentid.toLong(), level.toLong())).toInt()
}

public fun DbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "DbgSetDebugFilterState", longArrayOf(componentid.toLong(), level.toLong(), if (state) 1L else 0L)).toInt()
}

public fun DbgSetDebugPrintCallback(debugprintcallback: PDEBUG_PRINT_CALLBACK, enable: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "DbgSetDebugPrintCallback", longArrayOf(Win32DynamicFfi.objectSlot(debugprintcallback), if (enable) 1L else 0L)).toInt()
}

public fun EtwActivityIdControl(controlcode: UInt, activityid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "EtwActivityIdControl", longArrayOf(controlcode.toLong(), activityid)).toInt()
}

public fun EtwEventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "EtwEventEnabled", longArrayOf(reghandle, eventdescriptor))
    return (rawRet and 0xFFL) != 0L
}

public fun EtwProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "EtwProviderEnabled", longArrayOf(reghandle, level.toLong(), keyword.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun EtwRegister(providerid: Long, enablecallback: PETWENABLECALLBACK, callbackcontext: Long, reghandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "EtwRegister", longArrayOf(providerid, Win32DynamicFfi.objectSlot(enablecallback), callbackcontext, reghandle)).toInt()
}

public fun EtwSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "EtwSetInformation", longArrayOf(reghandle, informationclass.toLong(), eventinformation, informationlength.toLong())).toInt()
}

public fun EtwUnregister(reghandle: REGHANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "EtwUnregister", longArrayOf(reghandle)).toInt()
}

public fun EtwWrite(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "EtwWrite", longArrayOf(reghandle, eventdescriptor, activityid, userdatacount.toLong(), userdata)).toInt()
}

public fun EtwWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "EtwWriteEx", longArrayOf(reghandle, eventdescriptor, filter.toLong(), flags.toLong(), activityid, relatedactivityid, userdatacount.toLong(), userdata)).toInt()
}

public fun EtwWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, activityid: Long, string: PCWSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "EtwWriteString", longArrayOf(reghandle, level.toLong(), keyword.toLong(), activityid, string)).toInt()
}

public fun EtwWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "EtwWriteTransfer", longArrayOf(reghandle, eventdescriptor, activityid, relatedactivityid, userdatacount.toLong(), userdata)).toInt()
}

public fun ExAcquireFastMutex(fastmutex: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireFastMutex", longArrayOf(fastmutex))
}

public fun ExAcquireFastMutexUnsafe(fastmutex: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireFastMutexUnsafe", longArrayOf(fastmutex))
}

public fun ExAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquirePushLockExclusiveEx", longArrayOf(pushlock, flags.toLong()))
}

public fun ExAcquirePushLockSharedEx(pushlock: Long, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquirePushLockSharedEx", longArrayOf(pushlock, flags.toLong()))
}

public fun ExAcquireResourceExclusiveLite(resource: Long, wait: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireResourceExclusiveLite", longArrayOf(resource, if (wait) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun ExAcquireResourceSharedLite(resource: Long, wait: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireResourceSharedLite", longArrayOf(resource, if (wait) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun ExAcquireRundownProtection(runref: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireRundownProtection", longArrayOf(runref))
    return (rawRet and 0xFFL) != 0L
}

public fun ExAcquireRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireRundownProtectionCacheAware", longArrayOf(runrefcacheaware))
    return (rawRet and 0xFFL) != 0L
}

public fun ExAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireRundownProtectionCacheAwareEx", longArrayOf(runrefcacheaware, count.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun ExAcquireRundownProtectionEx(runref: Long, count: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireRundownProtectionEx", longArrayOf(runref, count.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun ExAcquireSharedStarveExclusive(resource: Long, wait: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireSharedStarveExclusive", longArrayOf(resource, if (wait) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun ExAcquireSharedWaitForExclusive(resource: Long, wait: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireSharedWaitForExclusive", longArrayOf(resource, if (wait) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun ExAcquireSpinLockExclusive(spinlock: Long): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireSpinLockExclusive", longArrayOf(spinlock)).toUByte()
}

public fun ExAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireSpinLockExclusiveAtDpcLevel", longArrayOf(spinlock))
}

public fun ExAcquireSpinLockShared(spinlock: Long): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireSpinLockShared", longArrayOf(spinlock)).toUByte()
}

public fun ExAcquireSpinLockSharedAtDpcLevel(spinlock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAcquireSpinLockSharedAtDpcLevel", longArrayOf(spinlock))
}

public fun ExAllocateCacheAwareRundownProtection(pooltype: POOL_TYPE, pooltag: UInt): PEX_RUNDOWN_REF_CACHE_AWARE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAllocateCacheAwareRundownProtection", longArrayOf(pooltype.toLong(), pooltag.toLong()))
}

public fun ExAllocatePool(pooltype: POOL_TYPE, numberofbytes: ULong): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAllocatePool", longArrayOf(pooltype.toLong(), numberofbytes.toLong()))
}

public fun ExAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAllocatePool2", longArrayOf(flags.toLong(), numberofbytes.toLong(), tag.toLong()))
}

public fun ExAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAllocatePool3", longArrayOf(flags.toLong(), numberofbytes.toLong(), tag.toLong(), extendedparameters, extendedparameterscount.toLong()))
}

public fun ExAllocatePoolWithQuota(pooltype: POOL_TYPE, numberofbytes: ULong): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAllocatePoolWithQuota", longArrayOf(pooltype.toLong(), numberofbytes.toLong()))
}

public fun ExAllocatePoolWithQuotaTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAllocatePoolWithQuotaTag", longArrayOf(pooltype.toLong(), numberofbytes.toLong(), tag.toLong()))
}

public fun ExAllocatePoolWithTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAllocatePoolWithTag", longArrayOf(pooltype.toLong(), numberofbytes.toLong(), tag.toLong()))
}

public fun ExAllocatePoolWithTagPriority(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt, priority: EX_POOL_PRIORITY): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAllocatePoolWithTagPriority", longArrayOf(pooltype.toLong(), numberofbytes.toLong(), tag.toLong(), priority.toLong()))
}

public fun ExAllocateTimer(callback: PEXT_CALLBACK, callbackcontext: Long, attributes: UInt): PEX_TIMER {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExAllocateTimer", longArrayOf(Win32DynamicFfi.objectSlot(callback), callbackcontext, attributes.toLong()))
}

public fun ExCancelTimer(timer: PEX_TIMER, parameters: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExCancelTimer", longArrayOf(timer, parameters))
    return (rawRet and 0xFFL) != 0L
}

public fun ExCleanupRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExCleanupRundownProtectionCacheAware", longArrayOf(runrefcacheaware))
}

public fun ExConvertExclusiveToSharedLite(resource: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExConvertExclusiveToSharedLite", longArrayOf(resource))
}

public fun ExCreateCallback(callbackobject: Long, objectattributes: Long, create: Boolean, allowmultiplecallbacks: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExCreateCallback", longArrayOf(callbackobject, objectattributes, if (create) 1L else 0L, if (allowmultiplecallbacks) 1L else 0L)).toInt()
}

public fun ExCreatePool(flags: UInt, tag: ULong, params: Long, poolhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExCreatePool", longArrayOf(flags.toLong(), tag.toLong(), params, poolhandle)).toInt()
}

public fun ExDeleteResourceLite(resource: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExDeleteResourceLite", longArrayOf(resource)).toInt()
}

public fun ExDeleteTimer(timer: PEX_TIMER, cancel: Boolean, wait: Boolean, parameters: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExDeleteTimer", longArrayOf(timer, if (cancel) 1L else 0L, if (wait) 1L else 0L, parameters))
    return (rawRet and 0xFFL) != 0L
}

public fun ExDestroyPool(poolhandle: HANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExDestroyPool", longArrayOf(poolhandle))
}

public fun ExEnterCriticalRegionAndAcquireResourceExclusive(resource: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExEnterCriticalRegionAndAcquireResourceExclusive", longArrayOf(resource))
}

public fun ExEnterCriticalRegionAndAcquireResourceShared(resource: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExEnterCriticalRegionAndAcquireResourceShared", longArrayOf(resource))
}

public fun ExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExEnterCriticalRegionAndAcquireSharedWaitForExclusive", longArrayOf(resource))
}

public fun ExEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExEnumerateSystemFirmwareTables", longArrayOf(firmwaretableprovidersignature.toLong(), firmwaretablebuffer, bufferlength.toLong(), returnlength)).toInt()
}

public fun ExExtendZone(zone: Long, segment: Long, segmentsize: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExExtendZone", longArrayOf(zone, segment, segmentsize.toLong())).toInt()
}

public fun ExFreeCacheAwareRundownProtection(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExFreeCacheAwareRundownProtection", longArrayOf(runrefcacheaware))
}

public fun ExFreePool(p: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExFreePool", longArrayOf(p))
}

public fun ExFreePool2(p: Long, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExFreePool2", longArrayOf(p, tag.toLong(), extendedparameters, extendedparameterscount.toLong()))
}

public fun ExFreePoolWithTag(p: Long, tag: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExFreePoolWithTag", longArrayOf(p, tag.toLong()))
}

public fun ExGetExclusiveWaiterCount(resource: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExGetExclusiveWaiterCount", longArrayOf(resource)).toUInt()
}

public fun ExGetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Long, attributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExGetFirmwareEnvironmentVariable", longArrayOf(variablename, vendorguid, value, valuelength, attributes)).toInt()
}

public fun ExGetFirmwareType(): FIRMWARE_TYPE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExGetFirmwareType", longArrayOf()).toInt()
}

public fun ExGetPreviousMode(): Byte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExGetPreviousMode", longArrayOf()).toByte()
}

public fun ExGetSharedWaiterCount(resource: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExGetSharedWaiterCount", longArrayOf(resource)).toUInt()
}

public fun ExGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExGetSystemFirmwareTable", longArrayOf(firmwaretableprovidersignature.toLong(), firmwaretableid.toLong(), firmwaretablebuffer, bufferlength.toLong(), returnlength)).toInt()
}

public fun ExInitializePushLock(pushlock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExInitializePushLock", longArrayOf(pushlock))
}

public fun ExInitializeResourceLite(resource: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExInitializeResourceLite", longArrayOf(resource)).toInt()
}

public fun ExInitializeRundownProtection(runref: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExInitializeRundownProtection", longArrayOf(runref))
}

public fun ExInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, runrefsize: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExInitializeRundownProtectionCacheAware", longArrayOf(runrefcacheaware, runrefsize.toLong()))
}

public fun ExInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExInitializeRundownProtectionCacheAwareEx", longArrayOf(runrefcacheaware, flags.toLong()))
}

public fun ExInitializeZone(zone: Long, blocksize: UInt, initialsegment: Long, initialsegmentsize: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExInitializeZone", longArrayOf(zone, blocksize.toLong(), initialsegment, initialsegmentsize.toLong())).toInt()
}

public fun ExInterlockedAddLargeInteger(addend: Long, increment: Long, lock: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExInterlockedAddLargeInteger", longArrayOf(addend, increment, lock))
}

public fun ExInterlockedExtendZone(zone: Long, segment: Long, segmentsize: UInt, lock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExInterlockedExtendZone", longArrayOf(zone, segment, segmentsize.toLong(), lock)).toInt()
}

public fun ExIsManufacturingModeEnabled(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExIsManufacturingModeEnabled", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun ExIsProcessorFeaturePresent(processorfeature: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExIsProcessorFeaturePresent", longArrayOf(processorfeature.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun ExIsResourceAcquiredExclusiveLite(resource: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExIsResourceAcquiredExclusiveLite", longArrayOf(resource))
    return (rawRet and 0xFFL) != 0L
}

public fun ExIsResourceAcquiredSharedLite(resource: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExIsResourceAcquiredSharedLite", longArrayOf(resource)).toUInt()
}

public fun ExIsSoftBoot(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExIsSoftBoot", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun ExLocalTimeToSystemTime(localtime: Long, systemtime: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExLocalTimeToSystemTime", longArrayOf(localtime, systemtime))
}

public fun ExNotifyCallback(callbackobject: Long, argument1: Long, argument2: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExNotifyCallback", longArrayOf(callbackobject, argument1, argument2))
}

public fun ExQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExQueryTimerResolution", longArrayOf(maximumtime, minimumtime, currenttime))
}

public fun ExQueueWorkItem(workitem: Long, queuetype: WORK_QUEUE_TYPE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExQueueWorkItem", longArrayOf(workitem, queuetype.toLong()))
}

public fun ExRaiseAccessViolation() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExRaiseAccessViolation", longArrayOf())
}

public fun ExRaiseDatatypeMisalignment() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExRaiseDatatypeMisalignment", longArrayOf())
}

public fun ExRaiseStatus(status: NTSTATUS) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExRaiseStatus", longArrayOf(status.toLong()))
}

public fun ExReInitializeRundownProtection(runref: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReInitializeRundownProtection", longArrayOf(runref))
}

public fun ExReInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReInitializeRundownProtectionCacheAware", longArrayOf(runrefcacheaware))
}

public fun ExRegisterCallback(callbackobject: PCALLBACK_OBJECT, callbackfunction: PCALLBACK_FUNCTION, callbackcontext: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExRegisterCallback", longArrayOf(callbackobject, Win32DynamicFfi.objectSlot(callbackfunction), callbackcontext))
}

public fun ExReinitializeResourceLite(resource: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReinitializeResourceLite", longArrayOf(resource)).toInt()
}

public fun ExReleaseFastMutex(fastmutex: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseFastMutex", longArrayOf(fastmutex))
}

public fun ExReleaseFastMutexUnsafe(fastmutex: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseFastMutexUnsafe", longArrayOf(fastmutex))
}

public fun ExReleasePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleasePushLockExclusiveEx", longArrayOf(pushlock, flags.toLong()))
}

public fun ExReleasePushLockSharedEx(pushlock: Long, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleasePushLockSharedEx", longArrayOf(pushlock, flags.toLong()))
}

public fun ExReleaseResourceAndLeaveCriticalRegion(resource: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseResourceAndLeaveCriticalRegion", longArrayOf(resource))
}

public fun ExReleaseResourceForThreadLite(resource: Long, resourcethreadid: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseResourceForThreadLite", longArrayOf(resource, resourcethreadid.toLong()))
}

public fun ExReleaseResourceLite(resource: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseResourceLite", longArrayOf(resource))
}

public fun ExReleaseRundownProtection(runref: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseRundownProtection", longArrayOf(runref))
}

public fun ExReleaseRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseRundownProtectionCacheAware", longArrayOf(runrefcacheaware))
}

public fun ExReleaseRundownProtectionCacheAwareEx(runref: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseRundownProtectionCacheAwareEx", longArrayOf(runref, count.toLong()))
}

public fun ExReleaseRundownProtectionEx(runref: Long, count: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseRundownProtectionEx", longArrayOf(runref, count.toLong()))
}

public fun ExReleaseSpinLockExclusive(spinlock: Long, oldirql: UByte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseSpinLockExclusive", longArrayOf(spinlock, oldirql.toLong()))
}

public fun ExReleaseSpinLockExclusiveFromDpcLevel(spinlock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseSpinLockExclusiveFromDpcLevel", longArrayOf(spinlock))
}

public fun ExReleaseSpinLockShared(spinlock: Long, oldirql: UByte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseSpinLockShared", longArrayOf(spinlock, oldirql.toLong()))
}

public fun ExReleaseSpinLockSharedFromDpcLevel(spinlock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExReleaseSpinLockSharedFromDpcLevel", longArrayOf(spinlock))
}

public fun ExRundownCompleted(runref: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExRundownCompleted", longArrayOf(runref))
}

public fun ExRundownCompletedCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExRundownCompletedCacheAware", longArrayOf(runrefcacheaware))
}

public fun ExSecurePoolUpdate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong, offset: ULong, size: ULong, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExSecurePoolUpdate", longArrayOf(securepoolhandle, tag.toLong(), allocation, cookie.toLong(), offset.toLong(), size.toLong(), buffer)).toInt()
}

public fun ExSecurePoolValidate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExSecurePoolValidate", longArrayOf(securepoolhandle, tag.toLong(), allocation, cookie.toLong())).toUInt()
}

public fun ExSetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: UInt, attributes: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExSetFirmwareEnvironmentVariable", longArrayOf(variablename, vendorguid, value, valuelength.toLong(), attributes.toLong())).toInt()
}

public fun ExSetResourceOwnerPointer(resource: Long, ownerpointer: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExSetResourceOwnerPointer", longArrayOf(resource, ownerpointer))
}

public fun ExSetResourceOwnerPointerEx(resource: Long, ownerpointer: Long, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExSetResourceOwnerPointerEx", longArrayOf(resource, ownerpointer, flags.toLong()))
}

public fun ExSetTimer(timer: PEX_TIMER, duetime: Long, period: Long, parameters: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExSetTimer", longArrayOf(timer, duetime, period, parameters))
    return (rawRet and 0xFFL) != 0L
}

public fun ExSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExSetTimerResolution", longArrayOf(desiredtime.toLong(), if (setresolution) 1L else 0L)).toUInt()
}

public fun ExSizeOfRundownProtectionCacheAware(): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExSizeOfRundownProtectionCacheAware", longArrayOf()).toULong()
}

public fun ExSystemTimeToLocalTime(systemtime: Long, localtime: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExSystemTimeToLocalTime", longArrayOf(systemtime, localtime))
}

public fun ExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExTryAcquireSpinLockExclusiveAtDpcLevel", longArrayOf(spinlock)).toUInt()
}

public fun ExTryAcquireSpinLockSharedAtDpcLevel(spinlock: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExTryAcquireSpinLockSharedAtDpcLevel", longArrayOf(spinlock)).toUInt()
}

public fun ExTryConvertSharedSpinLockExclusive(spinlock: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExTryConvertSharedSpinLockExclusive", longArrayOf(spinlock)).toUInt()
}

public fun ExTryToAcquireFastMutex(fastmutex: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExTryToAcquireFastMutex", longArrayOf(fastmutex))
    return (rawRet and 0xFFL) != 0L
}

public fun ExUnregisterCallback(callbackregistration: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExUnregisterCallback", longArrayOf(callbackregistration))
}

public fun ExUuidCreate(uuid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExUuidCreate", longArrayOf(uuid)).toInt()
}

public fun ExVerifySuite(suitetype: SUITE_TYPE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ExVerifySuite", longArrayOf(suitetype.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun ExWaitForRundownProtectionRelease(runref: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExWaitForRundownProtectionRelease", longArrayOf(runref))
}

public fun ExWaitForRundownProtectionReleaseCacheAware(runref: PEX_RUNDOWN_REF_CACHE_AWARE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExWaitForRundownProtectionReleaseCacheAware", longArrayOf(runref))
}

public fun FsRtlIsTotalDeviceFailure(status: NTSTATUS): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsTotalDeviceFailure", longArrayOf(status.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HalAcquireDisplayOwnership(resetdisplayparameters: PHAL_RESET_DISPLAY_PARAMETERS) {
    Win32DynamicFfi.invoke("hal.dll", "HalAcquireDisplayOwnership", longArrayOf(Win32DynamicFfi.objectSlot(resetdisplayparameters)))
}

public fun HalAllocateAdapterChannel(adapterobject: Long, wcb: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL): NTSTATUS {
    return Win32DynamicFfi.invoke("hal.dll", "HalAllocateAdapterChannel", longArrayOf(adapterobject, wcb, numberofmapregisters.toLong(), Win32DynamicFfi.objectSlot(executionroutine))).toInt()
}

public fun HalAllocateCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, cacheenabled: Boolean): Long {
    return Win32DynamicFfi.invoke("hal.dll", "HalAllocateCommonBuffer", longArrayOf(adapterobject, length.toLong(), logicaladdress, if (cacheenabled) 1L else 0L))
}

public fun HalAllocateCrashDumpRegisters(adapterobject: Long, numberofmapregisters: Long): Long {
    return Win32DynamicFfi.invoke("hal.dll", "HalAllocateCrashDumpRegisters", longArrayOf(adapterobject, numberofmapregisters))
}

public fun HalAllocateHardwareCounters(groupaffinty: Long, groupcount: UInt, resourcelist: Long, countersethandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("hal.dll", "HalAllocateHardwareCounters", longArrayOf(groupaffinty, groupcount.toLong(), resourcelist, countersethandle)).toInt()
}

public fun HalAssignSlotResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, bustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, allocatedresources: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("hal.dll", "HalAssignSlotResources", longArrayOf(registrypath, driverclassname, driverobject, deviceobject, bustype.toLong(), busnumber.toLong(), slotnumber.toLong(), allocatedresources)).toInt()
}

public fun HalBugCheckSystem(errorsource: Long, errorrecord: Long) {
    Win32DynamicFfi.invoke("hal.dll", "HalBugCheckSystem", longArrayOf(errorsource, errorrecord))
}

public fun HalDmaAllocateCrashDumpRegistersEx(adapter: Long, numberofmapregisters: UInt, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE, mapregisterbase: Long, mapregistersavailable: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("hal.dll", "HalDmaAllocateCrashDumpRegistersEx", longArrayOf(adapter, numberofmapregisters.toLong(), type.toLong(), mapregisterbase, mapregistersavailable)).toInt()
}

public fun HalDmaFreeCrashDumpRegistersEx(adapter: Long, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE): NTSTATUS {
    return Win32DynamicFfi.invoke("hal.dll", "HalDmaFreeCrashDumpRegistersEx", longArrayOf(adapter, type.toLong())).toInt()
}

public fun HalExamineMBR(deviceobject: Long, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "HalExamineMBR", longArrayOf(deviceobject, sectorsize.toLong(), mbrtypeidentifier.toLong(), buffer))
}

public fun HalFreeCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, virtualaddress: Long, cacheenabled: Boolean) {
    Win32DynamicFfi.invoke("hal.dll", "HalFreeCommonBuffer", longArrayOf(adapterobject, length.toLong(), logicaladdress, virtualaddress, if (cacheenabled) 1L else 0L))
}

public fun HalFreeHardwareCounters(countersethandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("hal.dll", "HalFreeHardwareCounters", longArrayOf(countersethandle)).toInt()
}

public fun HalGetAdapter(devicedescription: Long, numberofmapregisters: Long): Long {
    return Win32DynamicFfi.invoke("hal.dll", "HalGetAdapter", longArrayOf(devicedescription, numberofmapregisters))
}

public fun HalGetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt {
    return Win32DynamicFfi.invoke("hal.dll", "HalGetBusData", longArrayOf(busdatatype.toLong(), busnumber.toLong(), slotnumber.toLong(), buffer, length.toLong())).toUInt()
}

public fun HalGetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt {
    return Win32DynamicFfi.invoke("hal.dll", "HalGetBusDataByOffset", longArrayOf(busdatatype.toLong(), busnumber.toLong(), slotnumber.toLong(), buffer, offset.toLong(), length.toLong())).toUInt()
}

public fun HalGetInterruptVector(interfacetype: INTERFACE_TYPE, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: Long, affinity: Long): UInt {
    return Win32DynamicFfi.invoke("hal.dll", "HalGetInterruptVector", longArrayOf(interfacetype.toLong(), busnumber.toLong(), businterruptlevel.toLong(), businterruptvector.toLong(), irql, affinity)).toUInt()
}

public fun HalMakeBeep(frequency: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hal.dll", "HalMakeBeep", longArrayOf(frequency.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun HalReadDmaCounter(adapterobject: Long): UInt {
    return Win32DynamicFfi.invoke("hal.dll", "HalReadDmaCounter", longArrayOf(adapterobject)).toUInt()
}

public fun HalSetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt {
    return Win32DynamicFfi.invoke("hal.dll", "HalSetBusData", longArrayOf(busdatatype.toLong(), busnumber.toLong(), slotnumber.toLong(), buffer, length.toLong())).toUInt()
}

public fun HalSetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt {
    return Win32DynamicFfi.invoke("hal.dll", "HalSetBusDataByOffset", longArrayOf(busdatatype.toLong(), busnumber.toLong(), slotnumber.toLong(), buffer, offset.toLong(), length.toLong())).toUInt()
}

public fun HalTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hal.dll", "HalTranslateBusAddress", longArrayOf(interfacetype.toLong(), busnumber.toLong(), busaddress, addressspace, translatedaddress))
    return (rawRet and 0xFFL) != 0L
}

public fun HvlRegisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "HvlRegisterWheaErrorNotification", longArrayOf(Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun HvlUnregisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "HvlUnregisterWheaErrorNotification", longArrayOf(Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun IoAcquireCancelSpinLock(irql: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAcquireCancelSpinLock", longArrayOf(irql))
}

public fun IoAcquireKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, buffer: Long, size: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAcquireKsrPersistentMemory", longArrayOf(driverobject, physicaldeviceobject, buffer, size)).toInt()
}

public fun IoAcquireKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffer: Long, size: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAcquireKsrPersistentMemoryEx", longArrayOf(driverobject, physicaldeviceobject, physicaldeviceid, datatag, dataversion, buffer, size)).toInt()
}

public fun IoAcquireRemoveLockEx(removelock: Long, tag: Long, file: PCSTR, line: UInt, remlocksize: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAcquireRemoveLockEx", longArrayOf(removelock, tag, file, line.toLong(), remlocksize.toLong())).toInt()
}

public fun IoAllocateAdapterChannel(adapterobject: Long, deviceobject: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAllocateAdapterChannel", longArrayOf(adapterobject, deviceobject, numberofmapregisters.toLong(), Win32DynamicFfi.objectSlot(executionroutine), context)).toInt()
}

public fun IoAllocateController(controllerobject: Long, deviceobject: Long, executionroutine: DRIVER_CONTROL, context: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAllocateController", longArrayOf(controllerobject, deviceobject, Win32DynamicFfi.objectSlot(executionroutine), context))
}

public fun IoAllocateDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long, driverobjectextensionsize: UInt, driverobjectextension: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAllocateDriverObjectExtension", longArrayOf(driverobject, clientidentificationaddress, driverobjectextensionsize.toLong(), driverobjectextension)).toInt()
}

public fun IoAllocateErrorLogEntry(ioobject: Long, entrysize: UByte): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAllocateErrorLogEntry", longArrayOf(ioobject, entrysize.toLong()))
}

public fun IoAllocateIrp(stacksize: Byte, chargequota: Boolean): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAllocateIrp", longArrayOf(stacksize.toLong(), if (chargequota) 1L else 0L))
}

public fun IoAllocateIrpEx(deviceobject: Long, stacksize: Byte, chargequota: Boolean): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAllocateIrpEx", longArrayOf(deviceobject, stacksize.toLong(), if (chargequota) 1L else 0L))
}

public fun IoAllocateMdl(virtualaddress: Long, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAllocateMdl", longArrayOf(virtualaddress, length.toLong(), if (secondarybuffer) 1L else 0L, if (chargequota) 1L else 0L, irp))
}

public fun IoAllocateSfioStreamIdentifier(fileobject: Long, length: UInt, signature: Long, streamidentifier: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAllocateSfioStreamIdentifier", longArrayOf(fileobject, length.toLong(), signature, streamidentifier)).toInt()
}

public fun IoAllocateWorkItem(deviceobject: Long): PIO_WORKITEM {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAllocateWorkItem", longArrayOf(deviceobject))
}

public fun IoAssignResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, requestedresources: Long, allocatedresources: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAssignResources", longArrayOf(registrypath, driverclassname, driverobject, deviceobject, requestedresources, allocatedresources)).toInt()
}

public fun IoAttachDevice(sourcedevice: Long, targetdevice: Long, attacheddevice: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAttachDevice", longArrayOf(sourcedevice, targetdevice, attacheddevice)).toInt()
}

public fun IoAttachDeviceByPointer(sourcedevice: Long, targetdevice: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAttachDeviceByPointer", longArrayOf(sourcedevice, targetdevice)).toInt()
}

public fun IoAttachDeviceToDeviceStack(sourcedevice: Long, targetdevice: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAttachDeviceToDeviceStack", longArrayOf(sourcedevice, targetdevice))
}

public fun IoAttachDeviceToDeviceStackSafe(sourcedevice: Long, targetdevice: Long, attachedtodeviceobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAttachDeviceToDeviceStackSafe", longArrayOf(sourcedevice, targetdevice, attachedtodeviceobject)).toInt()
}

public fun IoBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, iostatusblock: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoBuildAsynchronousFsdRequest", longArrayOf(majorfunction.toLong(), deviceobject, buffer, length.toLong(), startingoffset, iostatusblock))
}

public fun IoBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: Long, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: Long, iostatusblock: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoBuildDeviceIoControlRequest", longArrayOf(iocontrolcode.toLong(), deviceobject, inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong(), if (internaldeviceiocontrol) 1L else 0L, event, iostatusblock))
}

public fun IoBuildPartialMdl(sourcemdl: Long, targetmdl: Long, virtualaddress: Long, length: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoBuildPartialMdl", longArrayOf(sourcemdl, targetmdl, virtualaddress, length.toLong()))
}

public fun IoBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, event: Long, iostatusblock: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoBuildSynchronousFsdRequest", longArrayOf(majorfunction.toLong(), deviceobject, buffer, length.toLong(), startingoffset, event, iostatusblock))
}

public fun IoCancelFileOpen(deviceobject: Long, fileobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCancelFileOpen", longArrayOf(deviceobject, fileobject))
}

public fun IoCancelIrp(irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCancelIrp", longArrayOf(irp))
    return (rawRet and 0xFFL) != 0L
}

public fun IoCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckLinkShareAccess", longArrayOf(desiredaccess.toLong(), desiredshareaccess.toLong(), fileobject, shareaccess, linkshareaccess, ioshareaccessflags.toLong())).toInt()
}

public fun IoCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckShareAccess", longArrayOf(desiredaccess.toLong(), desiredshareaccess.toLong(), fileobject, shareaccess, if (update) 1L else 0L)).toInt()
}

public fun IoCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean, writepermission: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckShareAccessEx", longArrayOf(desiredaccess.toLong(), desiredshareaccess.toLong(), fileobject, shareaccess, if (update) 1L else 0L, writepermission)).toInt()
}

public fun IoCleanupIrp(irp: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCleanupIrp", longArrayOf(irp))
}

public fun IoClearActivityIdThread(originalid: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoClearActivityIdThread", longArrayOf(originalid))
}

public fun IoClearIrpExtraCreateParameter(irp: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoClearIrpExtraCreateParameter", longArrayOf(irp))
}

public fun IoConnectInterrupt(interruptobject: Long, serviceroutine: PKSERVICE_ROUTINE, servicecontext: Long, spinlock: Long, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KINTERRUPT_MODE, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoConnectInterrupt", longArrayOf(interruptobject, Win32DynamicFfi.objectSlot(serviceroutine), servicecontext, spinlock, vector.toLong(), irql.toLong(), synchronizeirql.toLong(), interruptmode.toLong(), if (sharevector) 1L else 0L, processorenablemask.toLong(), if (floatingsave) 1L else 0L)).toInt()
}

public fun IoConnectInterruptEx(parameters: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoConnectInterruptEx", longArrayOf(parameters)).toInt()
}

public fun IoCreateController(size: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateController", longArrayOf(size.toLong()))
}

public fun IoCreateDevice(driverobject: Long, deviceextensionsize: UInt, devicename: Long, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateDevice", longArrayOf(driverobject, deviceextensionsize.toLong(), devicename, devicetype.toLong(), devicecharacteristics.toLong(), if (exclusive) 1L else 0L, deviceobject)).toInt()
}

public fun IoCreateDisk(deviceobject: Long, disk: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateDisk", longArrayOf(deviceobject, disk)).toInt()
}

public fun IoCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateFile", longArrayOf(filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), disposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong(), createfiletype.toLong(), internalparameters, options.toLong())).toInt()
}

public fun IoCreateFileEx(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, drivercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateFileEx", longArrayOf(filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), disposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong(), createfiletype.toLong(), internalparameters, options.toLong(), drivercontext)).toInt()
}

public fun IoCreateFileSpecifyDeviceObjectHint(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, deviceobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateFileSpecifyDeviceObjectHint", longArrayOf(filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), disposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong(), createfiletype.toLong(), internalparameters, options.toLong(), deviceobject)).toInt()
}

public fun IoCreateNotificationEvent(eventname: Long, eventhandle: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateNotificationEvent", longArrayOf(eventname, eventhandle))
}

public fun IoCreateSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateSymbolicLink", longArrayOf(symboliclinkname, devicename)).toInt()
}

public fun IoCreateSynchronizationEvent(eventname: Long, eventhandle: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateSynchronizationEvent", longArrayOf(eventname, eventhandle))
}

public fun IoCreateSystemThread(ioobject: Long, threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateSystemThread", longArrayOf(ioobject, threadhandle, desiredaccess.toLong(), objectattributes, processhandle, clientid, Win32DynamicFfi.objectSlot(startroutine), startcontext)).toInt()
}

public fun IoCreateUnprotectedSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateUnprotectedSymbolicLink", longArrayOf(symboliclinkname, devicename)).toInt()
}

public fun IoCsqInitialize(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCsqInitialize", longArrayOf(csq, Win32DynamicFfi.objectSlot(csqinsertirp), Win32DynamicFfi.objectSlot(csqremoveirp), Win32DynamicFfi.objectSlot(csqpeeknextirp), Win32DynamicFfi.objectSlot(csqacquirelock), Win32DynamicFfi.objectSlot(csqreleaselock), Win32DynamicFfi.objectSlot(csqcompletecanceledirp))).toInt()
}

public fun IoCsqInitializeEx(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP_EX, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCsqInitializeEx", longArrayOf(csq, Win32DynamicFfi.objectSlot(csqinsertirp), Win32DynamicFfi.objectSlot(csqremoveirp), Win32DynamicFfi.objectSlot(csqpeeknextirp), Win32DynamicFfi.objectSlot(csqacquirelock), Win32DynamicFfi.objectSlot(csqreleaselock), Win32DynamicFfi.objectSlot(csqcompletecanceledirp))).toInt()
}

public fun IoCsqInsertIrp(csq: Long, irp: Long, context: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCsqInsertIrp", longArrayOf(csq, irp, context))
}

public fun IoCsqInsertIrpEx(csq: Long, irp: Long, context: Long, insertcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCsqInsertIrpEx", longArrayOf(csq, irp, context, insertcontext)).toInt()
}

public fun IoCsqRemoveIrp(csq: Long, context: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCsqRemoveIrp", longArrayOf(csq, context))
}

public fun IoCsqRemoveNextIrp(csq: Long, peekcontext: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCsqRemoveNextIrp", longArrayOf(csq, peekcontext))
}

public fun IoDecrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoDecrementKeepAliveCount", longArrayOf(fileobject, process)).toInt()
}

public fun IoDeleteController(controllerobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoDeleteController", longArrayOf(controllerobject))
}

public fun IoDeleteDevice(deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoDeleteDevice", longArrayOf(deviceobject))
}

public fun IoDeleteSymbolicLink(symboliclinkname: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoDeleteSymbolicLink", longArrayOf(symboliclinkname)).toInt()
}

public fun IoDetachDevice(targetdevice: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoDetachDevice", longArrayOf(targetdevice))
}

public fun IoDisconnectInterrupt(interruptobject: PKINTERRUPT) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoDisconnectInterrupt", longArrayOf(interruptobject))
}

public fun IoDisconnectInterruptEx(parameters: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoDisconnectInterruptEx", longArrayOf(parameters))
}

public fun IoEnumerateKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, callback: PIO_PERSISTED_MEMORY_ENUMERATION_CALLBACK, callbackcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoEnumerateKsrPersistentMemoryEx", longArrayOf(driverobject, physicaldeviceobject, physicaldeviceid, Win32DynamicFfi.objectSlot(callback), callbackcontext)).toInt()
}

public fun IoFlushAdapterBuffers(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: UInt, writetodevice: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("hal.dll", "IoFlushAdapterBuffers", longArrayOf(adapterobject, mdl, mapregisterbase, currentva, length.toLong(), if (writetodevice) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun IoForwardIrpSynchronously(deviceobject: Long, irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoForwardIrpSynchronously", longArrayOf(deviceobject, irp))
    return (rawRet and 0xFFL) != 0L
}

public fun IoFreeAdapterChannel(adapterobject: Long) {
    Win32DynamicFfi.invoke("hal.dll", "IoFreeAdapterChannel", longArrayOf(adapterobject))
}

public fun IoFreeController(controllerobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoFreeController", longArrayOf(controllerobject))
}

public fun IoFreeErrorLogEntry(elentry: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoFreeErrorLogEntry", longArrayOf(elentry))
}

public fun IoFreeIrp(irp: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoFreeIrp", longArrayOf(irp))
}

public fun IoFreeKsrPersistentMemory(datahandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoFreeKsrPersistentMemory", longArrayOf(datahandle)).toInt()
}

public fun IoFreeMapRegisters(adapterobject: Long, mapregisterbase: Long, numberofmapregisters: UInt) {
    Win32DynamicFfi.invoke("hal.dll", "IoFreeMapRegisters", longArrayOf(adapterobject, mapregisterbase, numberofmapregisters.toLong()))
}

public fun IoFreeMdl(mdl: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoFreeMdl", longArrayOf(mdl))
}

public fun IoFreeSfioStreamIdentifier(fileobject: Long, signature: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoFreeSfioStreamIdentifier", longArrayOf(fileobject, signature)).toInt()
}

public fun IoFreeWorkItem(ioworkitem: PIO_WORKITEM) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoFreeWorkItem", longArrayOf(ioworkitem))
}

public fun IoGetActivityIdIrp(irp: Long, guid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetActivityIdIrp", longArrayOf(irp, guid)).toInt()
}

public fun IoGetActivityIdThread(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetActivityIdThread", longArrayOf())
}

public fun IoGetAffinityInterrupt(interruptobject: PKINTERRUPT, groupaffinity: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetAffinityInterrupt", longArrayOf(interruptobject, groupaffinity)).toInt()
}

public fun IoGetAttachedDeviceReference(deviceobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetAttachedDeviceReference", longArrayOf(deviceobject))
}

public fun IoGetBootDiskInformation(bootdiskinformation: Long, size: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetBootDiskInformation", longArrayOf(bootdiskinformation, size.toLong())).toInt()
}

public fun IoGetBootDiskInformationLite(bootdiskinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetBootDiskInformationLite", longArrayOf(bootdiskinformation)).toInt()
}

public fun IoGetConfigurationInformation(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetConfigurationInformation", longArrayOf())
}

public fun IoGetContainerInformation(informationclass: IO_CONTAINER_INFORMATION_CLASS, containerobject: Long, buffer: Long, bufferlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetContainerInformation", longArrayOf(informationclass.toLong(), containerobject, buffer, bufferlength.toLong())).toInt()
}

public fun IoGetCurrentProcess(): PEPROCESS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetCurrentProcess", longArrayOf())
}

public fun IoGetDeviceDirectory(physicaldeviceobject: Long, directorytype: DEVICE_DIRECTORY_TYPE, flags: UInt, reserved: Long, devicedirectoryhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDeviceDirectory", longArrayOf(physicaldeviceobject, directorytype.toLong(), flags.toLong(), reserved, devicedirectoryhandle)).toInt()
}

public fun IoGetDeviceInterfaceAlias(symboliclinkname: Long, aliasinterfaceclassguid: Long, aliassymboliclinkname: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDeviceInterfaceAlias", longArrayOf(symboliclinkname, aliasinterfaceclassguid, aliassymboliclinkname)).toInt()
}

public fun IoGetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDeviceInterfacePropertyData", longArrayOf(symboliclinkname, propertykey, lcid.toLong(), flags.toLong(), size.toLong(), data, requiredsize, type)).toInt()
}

public fun IoGetDeviceInterfaces(interfaceclassguid: Long, physicaldeviceobject: Long, flags: UInt, symboliclinklist: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDeviceInterfaces", longArrayOf(interfaceclassguid, physicaldeviceobject, flags.toLong(), symboliclinklist)).toInt()
}

public fun IoGetDeviceNumaNode(pdo: Long, nodenumber: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDeviceNumaNode", longArrayOf(pdo, nodenumber)).toInt()
}

public fun IoGetDeviceObjectPointer(objectname: Long, desiredaccess: UInt, fileobject: Long, deviceobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDeviceObjectPointer", longArrayOf(objectname, desiredaccess.toLong(), fileobject, deviceobject)).toInt()
}

public fun IoGetDeviceProperty(deviceobject: Long, deviceproperty: DEVICE_REGISTRY_PROPERTY, bufferlength: UInt, propertybuffer: Long, resultlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDeviceProperty", longArrayOf(deviceobject, deviceproperty.toLong(), bufferlength.toLong(), propertybuffer, resultlength)).toInt()
}

public fun IoGetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDevicePropertyData", longArrayOf(pdo, propertykey, lcid.toLong(), flags.toLong(), size.toLong(), data, requiredsize, type)).toInt()
}

public fun IoGetDmaAdapter(physicaldeviceobject: Long, devicedescription: Long, numberofmapregisters: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDmaAdapter", longArrayOf(physicaldeviceobject, devicedescription, numberofmapregisters))
}

public fun IoGetDriverDirectory(driverobject: Long, directorytype: DRIVER_DIRECTORY_TYPE, flags: UInt, driverdirectoryhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDriverDirectory", longArrayOf(driverobject, directorytype.toLong(), flags.toLong(), driverdirectoryhandle)).toInt()
}

public fun IoGetDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDriverObjectExtension", longArrayOf(driverobject, clientidentificationaddress))
}

public fun IoGetFileObjectGenericMapping(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetFileObjectGenericMapping", longArrayOf())
}

public fun IoGetFsZeroingOffset(irp: Long, zeroingoffset: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetFsZeroingOffset", longArrayOf(irp, zeroingoffset)).toInt()
}

public fun IoGetInitialStack(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetInitialStack", longArrayOf())
}

public fun IoGetInitiatorProcess(fileobject: Long): PEPROCESS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetInitiatorProcess", longArrayOf(fileobject))
}

public fun IoGetIoAttributionHandle(irp: Long, ioattributionhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetIoAttributionHandle", longArrayOf(irp, ioattributionhandle)).toInt()
}

public fun IoGetIoPriorityHint(irp: Long): IO_PRIORITY_HINT {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetIoPriorityHint", longArrayOf(irp)).toInt()
}

public fun IoGetIommuInterface(version: UInt, interfaceout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetIommuInterface", longArrayOf(version.toLong(), interfaceout)).toInt()
}

public fun IoGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetIommuInterfaceEx", longArrayOf(version.toLong(), flags.toLong(), interfaceout)).toInt()
}

public fun IoGetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetIrpExtraCreateParameter", longArrayOf(irp, extracreateparameter)).toInt()
}

public fun IoGetPagingIoPriority(irp: Long): IO_PAGING_PRIORITY {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetPagingIoPriority", longArrayOf(irp)).toInt()
}

public fun IoGetRelatedDeviceObject(fileobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetRelatedDeviceObject", longArrayOf(fileobject))
}

public fun IoGetSfioStreamIdentifier(fileobject: Long, signature: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetSfioStreamIdentifier", longArrayOf(fileobject, signature))
}

public fun IoGetSilo(fileobject: Long): PESILO {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetSilo", longArrayOf(fileobject))
}

public fun IoGetSiloParameters(fileobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetSiloParameters", longArrayOf(fileobject))
}

public fun IoGetStackLimits(lowlimit: Long, highlimit: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetStackLimits", longArrayOf(lowlimit, highlimit))
}

public fun IoGetTopLevelIrp(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetTopLevelIrp", longArrayOf())
}

public fun IoGetTransactionParameterBlock(fileobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetTransactionParameterBlock", longArrayOf(fileobject))
}

public fun IoIncrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIncrementKeepAliveCount", longArrayOf(fileobject, process)).toInt()
}

public fun IoInitializeIrp(irp: Long, packetsize: UShort, stacksize: Byte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoInitializeIrp", longArrayOf(irp, packetsize.toLong(), stacksize.toLong()))
}

public fun IoInitializeIrpEx(irp: Long, deviceobject: Long, packetsize: UShort, stacksize: Byte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoInitializeIrpEx", longArrayOf(irp, deviceobject, packetsize.toLong(), stacksize.toLong()))
}

public fun IoInitializeRemoveLockEx(lock: Long, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoInitializeRemoveLockEx", longArrayOf(lock, allocatetag.toLong(), maxlockedminutes.toLong(), highwatermark.toLong(), remlocksize.toLong()))
}

public fun IoInitializeTimer(deviceobject: Long, timerroutine: PIO_TIMER_ROUTINE, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoInitializeTimer", longArrayOf(deviceobject, Win32DynamicFfi.objectSlot(timerroutine), context)).toInt()
}

public fun IoInitializeWorkItem(ioobject: Long, ioworkitem: PIO_WORKITEM) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoInitializeWorkItem", longArrayOf(ioobject, ioworkitem))
}

public fun IoInvalidateDeviceRelations(deviceobject: Long, type: DEVICE_RELATION_TYPE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoInvalidateDeviceRelations", longArrayOf(deviceobject, type.toLong()))
}

public fun IoInvalidateDeviceState(physicaldeviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoInvalidateDeviceState", longArrayOf(physicaldeviceobject))
}

public fun IoIs32bitProcess(irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIs32bitProcess", longArrayOf(irp))
    return (rawRet and 0xFFL) != 0L
}

public fun IoIsFileObjectIgnoringSharing(fileobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsFileObjectIgnoringSharing", longArrayOf(fileobject))
    return (rawRet and 0xFFL) != 0L
}

public fun IoIsFileOriginRemote(fileobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsFileOriginRemote", longArrayOf(fileobject))
    return (rawRet and 0xFFL) != 0L
}

public fun IoIsInitiator32bitProcess(irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsInitiator32bitProcess", longArrayOf(irp))
    return (rawRet and 0xFFL) != 0L
}

public fun IoIsValidIrpStatus(status: NTSTATUS): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsValidIrpStatus", longArrayOf(status.toLong())).toUInt()
}

public fun IoIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsWdmVersionAvailable", longArrayOf(majorversion.toLong(), minorversion.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun IoMakeAssociatedIrp(irp: Long, stacksize: Byte): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoMakeAssociatedIrp", longArrayOf(irp, stacksize.toLong()))
}

public fun IoMakeAssociatedIrpEx(irp: Long, deviceobject: Long, stacksize: Byte): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoMakeAssociatedIrpEx", longArrayOf(irp, deviceobject, stacksize.toLong()))
}

public fun IoMapTransfer(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Long, writetodevice: Boolean): Long {
    return Win32DynamicFfi.invoke("hal.dll", "IoMapTransfer", longArrayOf(adapterobject, mdl, mapregisterbase, currentva, length, if (writetodevice) 1L else 0L))
}

public fun IoOpenDeviceInterfaceRegistryKey(symboliclinkname: Long, desiredaccess: UInt, deviceinterfaceregkey: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoOpenDeviceInterfaceRegistryKey", longArrayOf(symboliclinkname, desiredaccess.toLong(), deviceinterfaceregkey)).toInt()
}

public fun IoOpenDeviceRegistryKey(deviceobject: Long, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoOpenDeviceRegistryKey", longArrayOf(deviceobject, devinstkeytype.toLong(), desiredaccess.toLong(), deviceregkey)).toInt()
}

public fun IoOpenDriverRegistryKey(driverobject: Long, regkeytype: DRIVER_REGKEY_TYPE, desiredaccess: UInt, flags: UInt, driverregkey: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoOpenDriverRegistryKey", longArrayOf(driverobject, regkeytype.toLong(), desiredaccess.toLong(), flags.toLong(), driverregkey)).toInt()
}

public fun IoPropagateActivityIdToThread(irp: Long, propagatedid: Long, originalid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoPropagateActivityIdToThread", longArrayOf(irp, propagatedid, originalid)).toInt()
}

public fun IoQueryDeviceDescription(bustype: Long, busnumber: Long, controllertype: Long, controllernumber: Long, peripheraltype: Long, peripheralnumber: Long, calloutroutine: PIO_QUERY_DEVICE_ROUTINE, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryDeviceDescription", longArrayOf(bustype, busnumber, controllertype, controllernumber, peripheraltype, peripheralnumber, Win32DynamicFfi.objectSlot(calloutroutine), context)).toInt()
}

public fun IoQueryFullDriverPath(driverobject: Long, fullpath: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryFullDriverPath", longArrayOf(driverobject, fullpath)).toInt()
}

public fun IoQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, options: UInt, drivercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryInformationByName", longArrayOf(objectattributes, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), options.toLong(), drivercontext)).toInt()
}

public fun IoQueryKsrPersistentMemorySize(driverobject: Long, physicaldeviceobject: Long, buffersize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryKsrPersistentMemorySize", longArrayOf(driverobject, physicaldeviceobject, buffersize)).toInt()
}

public fun IoQueryKsrPersistentMemorySizeEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffersize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryKsrPersistentMemorySizeEx", longArrayOf(driverobject, physicaldeviceobject, physicaldeviceid, datatag, dataversion, buffersize)).toInt()
}

public fun IoQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueueWorkItem", longArrayOf(ioworkitem, Win32DynamicFfi.objectSlot(workerroutine), queuetype.toLong(), context))
}

public fun IoQueueWorkItemEx(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueueWorkItemEx", longArrayOf(ioworkitem, Win32DynamicFfi.objectSlot(workerroutine), queuetype.toLong(), context))
}

public fun IoRaiseHardError(irp: Long, vpb: Long, realdeviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRaiseHardError", longArrayOf(irp, vpb, realdeviceobject))
}

public fun IoRaiseInformationalHardError(errorstatus: NTSTATUS, string: Long, thread: PKTHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRaiseInformationalHardError", longArrayOf(errorstatus.toLong(), string, thread))
    return (rawRet and 0xFFL) != 0L
}

public fun IoReadDiskSignature(deviceobject: Long, bytespersector: UInt, signature: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReadDiskSignature", longArrayOf(deviceobject, bytespersector.toLong(), signature)).toInt()
}

public fun IoReadPartitionTable(deviceobject: Long, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReadPartitionTable", longArrayOf(deviceobject, sectorsize.toLong(), if (returnrecognizedpartitions) 1L else 0L, partitionbuffer)).toInt()
}

public fun IoReadPartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReadPartitionTableEx", longArrayOf(deviceobject, drivelayout)).toInt()
}

public fun IoRecordIoAttribution(opaquehandle: Long, attributioninformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRecordIoAttribution", longArrayOf(opaquehandle, attributioninformation)).toInt()
}

public fun IoRegisterBootDriverCallback(callbackfunction: PBOOT_DRIVER_CALLBACK_FUNCTION, callbackcontext: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterBootDriverCallback", longArrayOf(Win32DynamicFfi.objectSlot(callbackfunction), callbackcontext))
}

public fun IoRegisterBootDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterBootDriverReinitialization", longArrayOf(driverobject, Win32DynamicFfi.objectSlot(driverreinitializationroutine), context))
}

public fun IoRegisterContainerNotification(notificationclass: IO_CONTAINER_NOTIFICATION_CLASS, callbackfunction: PIO_CONTAINER_NOTIFICATION_FUNCTION, notificationinformation: Long, notificationinformationlength: UInt, callbackregistration: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterContainerNotification", longArrayOf(notificationclass.toLong(), Win32DynamicFfi.objectSlot(callbackfunction), notificationinformation, notificationinformationlength.toLong(), callbackregistration)).toInt()
}

public fun IoRegisterDeviceInterface(physicaldeviceobject: Long, interfaceclassguid: Long, referencestring: Long, symboliclinkname: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterDeviceInterface", longArrayOf(physicaldeviceobject, interfaceclassguid, referencestring, symboliclinkname)).toInt()
}

public fun IoRegisterDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterDriverReinitialization", longArrayOf(driverobject, Win32DynamicFfi.objectSlot(driverreinitializationroutine), context))
}

public fun IoRegisterLastChanceShutdownNotification(deviceobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterLastChanceShutdownNotification", longArrayOf(deviceobject)).toInt()
}

public fun IoRegisterPlugPlayNotification(eventcategory: IO_NOTIFICATION_EVENT_CATEGORY, eventcategoryflags: UInt, eventcategorydata: Long, driverobject: Long, callbackroutine: DRIVER_NOTIFICATION_CALLBACK_ROUTINE, context: Long, notificationentry: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterPlugPlayNotification", longArrayOf(eventcategory.toLong(), eventcategoryflags.toLong(), eventcategorydata, driverobject, Win32DynamicFfi.objectSlot(callbackroutine), context, notificationentry)).toInt()
}

public fun IoRegisterShutdownNotification(deviceobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterShutdownNotification", longArrayOf(deviceobject)).toInt()
}

public fun IoReleaseCancelSpinLock(irql: UByte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReleaseCancelSpinLock", longArrayOf(irql.toLong()))
}

public fun IoReleaseRemoveLockAndWaitEx(removelock: Long, tag: Long, remlocksize: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReleaseRemoveLockAndWaitEx", longArrayOf(removelock, tag, remlocksize.toLong()))
}

public fun IoReleaseRemoveLockEx(removelock: Long, tag: Long, remlocksize: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReleaseRemoveLockEx", longArrayOf(removelock, tag, remlocksize.toLong()))
}

public fun IoRemoveLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRemoveLinkShareAccess", longArrayOf(fileobject, shareaccess, linkshareaccess))
}

public fun IoRemoveLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRemoveLinkShareAccessEx", longArrayOf(fileobject, shareaccess, linkshareaccess, ioshareaccessflags.toLong()))
}

public fun IoRemoveShareAccess(fileobject: Long, shareaccess: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRemoveShareAccess", longArrayOf(fileobject, shareaccess))
}

public fun IoReplacePartitionUnit(targetpdo: Long, sparepdo: Long, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReplacePartitionUnit", longArrayOf(targetpdo, sparepdo, flags.toLong())).toInt()
}

public fun IoReportDetectedDevice(driverobject: Long, legacybustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, resourcelist: Long, resourcerequirements: Long, resourceassigned: Boolean, deviceobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReportDetectedDevice", longArrayOf(driverobject, legacybustype.toLong(), busnumber.toLong(), slotnumber.toLong(), resourcelist, resourcerequirements, if (resourceassigned) 1L else 0L, deviceobject)).toInt()
}

public fun IoReportInterruptActive(parameters: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReportInterruptActive", longArrayOf(parameters))
}

public fun IoReportInterruptInactive(parameters: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReportInterruptInactive", longArrayOf(parameters))
}

public fun IoReportResourceForDetection(driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, conflictdetected: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReportResourceForDetection", longArrayOf(driverobject, driverlist, driverlistsize.toLong(), deviceobject, devicelist, devicelistsize.toLong(), conflictdetected)).toInt()
}

public fun IoReportResourceUsage(driverclassname: Long, driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReportResourceUsage", longArrayOf(driverclassname, driverobject, driverlist, driverlistsize.toLong(), deviceobject, devicelist, devicelistsize.toLong(), if (overrideconflict) 1L else 0L, conflictdetected)).toInt()
}

public fun IoReportRootDevice(driverobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReportRootDevice", longArrayOf(driverobject)).toInt()
}

public fun IoReportTargetDeviceChange(physicaldeviceobject: Long, notificationstructure: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReportTargetDeviceChange", longArrayOf(physicaldeviceobject, notificationstructure)).toInt()
}

public fun IoReportTargetDeviceChangeAsynchronous(physicaldeviceobject: Long, notificationstructure: Long, callback: PDEVICE_CHANGE_COMPLETE_CALLBACK, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReportTargetDeviceChangeAsynchronous", longArrayOf(physicaldeviceobject, notificationstructure, Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun IoRequestDeviceEject(physicaldeviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRequestDeviceEject", longArrayOf(physicaldeviceobject))
}

public fun IoRequestDeviceEjectEx(physicaldeviceobject: Long, callback: PIO_DEVICE_EJECT_CALLBACK, context: Long, driverobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRequestDeviceEjectEx", longArrayOf(physicaldeviceobject, Win32DynamicFfi.objectSlot(callback), context, driverobject)).toInt()
}

public fun IoReserveKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, size: ULong, flags: UInt, datahandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReserveKsrPersistentMemory", longArrayOf(driverobject, physicaldeviceobject, size.toLong(), flags.toLong(), datahandle)).toInt()
}

public fun IoReserveKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: UInt, size: ULong, flags: UInt, datahandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReserveKsrPersistentMemoryEx", longArrayOf(driverobject, physicaldeviceobject, physicaldeviceid, datatag, dataversion.toLong(), size.toLong(), flags.toLong(), datahandle)).toInt()
}

public fun IoReuseIrp(irp: Long, iostatus: NTSTATUS) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReuseIrp", longArrayOf(irp, iostatus.toLong()))
}

public fun IoSetActivityIdIrp(irp: Long, guid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetActivityIdIrp", longArrayOf(irp, guid)).toInt()
}

public fun IoSetActivityIdThread(activityid: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetActivityIdThread", longArrayOf(activityid))
}

public fun IoSetCompletionRoutineEx(deviceobject: Long, irp: Long, completionroutine: PIO_COMPLETION_ROUTINE, context: Long, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetCompletionRoutineEx", longArrayOf(deviceobject, irp, Win32DynamicFfi.objectSlot(completionroutine), context, if (invokeonsuccess) 1L else 0L, if (invokeonerror) 1L else 0L, if (invokeoncancel) 1L else 0L)).toInt()
}

public fun IoSetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetDeviceInterfacePropertyData", longArrayOf(symboliclinkname, propertykey, lcid.toLong(), flags.toLong(), type.toLong(), size.toLong(), data)).toInt()
}

public fun IoSetDeviceInterfaceState(symboliclinkname: Long, enable: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetDeviceInterfaceState", longArrayOf(symboliclinkname, if (enable) 1L else 0L)).toInt()
}

public fun IoSetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetDevicePropertyData", longArrayOf(pdo, propertykey, lcid.toLong(), flags.toLong(), type.toLong(), size.toLong(), data)).toInt()
}

public fun IoSetFileObjectIgnoreSharing(fileobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetFileObjectIgnoreSharing", longArrayOf(fileobject)).toInt()
}

public fun IoSetFileOrigin(fileobject: Long, remote: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetFileOrigin", longArrayOf(fileobject, if (remote) 1L else 0L)).toInt()
}

public fun IoSetFsZeroingOffset(irp: Long, zeroingoffset: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetFsZeroingOffset", longArrayOf(irp, zeroingoffset.toLong())).toInt()
}

public fun IoSetFsZeroingOffsetRequired(irp: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetFsZeroingOffsetRequired", longArrayOf(irp)).toInt()
}

public fun IoSetHardErrorOrVerifyDevice(irp: Long, deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetHardErrorOrVerifyDevice", longArrayOf(irp, deviceobject))
}

public fun IoSetIoAttributionIrp(irp: Long, attributionsource: Long, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetIoAttributionIrp", longArrayOf(irp, attributionsource, flags.toLong())).toInt()
}

public fun IoSetIoPriorityHint(irp: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetIoPriorityHint", longArrayOf(irp, priorityhint.toLong())).toInt()
}

public fun IoSetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetIrpExtraCreateParameter", longArrayOf(irp, extracreateparameter)).toInt()
}

public fun IoSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetLinkShareAccess", longArrayOf(desiredaccess.toLong(), desiredshareaccess.toLong(), fileobject, shareaccess, linkshareaccess, ioshareaccessflags.toLong()))
}

public fun IoSetMasterIrpStatus(masterirp: Long, status: NTSTATUS) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetMasterIrpStatus", longArrayOf(masterirp, status.toLong()))
}

public fun IoSetPartitionInformation(deviceobject: Long, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetPartitionInformation", longArrayOf(deviceobject, sectorsize.toLong(), partitionnumber.toLong(), partitiontype.toLong())).toInt()
}

public fun IoSetPartitionInformationEx(deviceobject: Long, partitionnumber: UInt, partitioninfo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetPartitionInformationEx", longArrayOf(deviceobject, partitionnumber.toLong(), partitioninfo)).toInt()
}

public fun IoSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetShareAccess", longArrayOf(desiredaccess.toLong(), desiredshareaccess.toLong(), fileobject, shareaccess))
}

public fun IoSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, writepermission: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetShareAccessEx", longArrayOf(desiredaccess.toLong(), desiredshareaccess.toLong(), fileobject, shareaccess, writepermission))
}

public fun IoSetStartIoAttributes(deviceobject: Long, deferredstartio: Boolean, noncancelable: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetStartIoAttributes", longArrayOf(deviceobject, if (deferredstartio) 1L else 0L, if (noncancelable) 1L else 0L))
}

public fun IoSetSystemPartition(volumenamestring: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetSystemPartition", longArrayOf(volumenamestring)).toInt()
}

public fun IoSetThreadHardErrorMode(enableharderrors: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetThreadHardErrorMode", longArrayOf(if (enableharderrors) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun IoSetTopLevelIrp(irp: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetTopLevelIrp", longArrayOf(irp))
}

public fun IoSizeOfIrpEx(deviceobject: Long, stacksize: Byte): UShort {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSizeOfIrpEx", longArrayOf(deviceobject, stacksize.toLong())).toUShort()
}

public fun IoSizeofWorkItem(): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSizeofWorkItem", longArrayOf()).toUInt()
}

public fun IoStartNextPacket(deviceobject: Long, cancelable: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoStartNextPacket", longArrayOf(deviceobject, if (cancelable) 1L else 0L))
}

public fun IoStartNextPacketByKey(deviceobject: Long, cancelable: Boolean, key: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoStartNextPacketByKey", longArrayOf(deviceobject, if (cancelable) 1L else 0L, key.toLong()))
}

public fun IoStartPacket(deviceobject: Long, irp: Long, key: Long, cancelfunction: DRIVER_CANCEL) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoStartPacket", longArrayOf(deviceobject, irp, key, Win32DynamicFfi.objectSlot(cancelfunction)))
}

public fun IoStartTimer(deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoStartTimer", longArrayOf(deviceobject))
}

public fun IoStopTimer(deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoStopTimer", longArrayOf(deviceobject))
}

public fun IoSynchronousCallDriver(deviceobject: Long, irp: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSynchronousCallDriver", longArrayOf(deviceobject, irp)).toInt()
}

public fun IoTransferActivityId(activityid: Long, relatedactivityid: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoTransferActivityId", longArrayOf(activityid, relatedactivityid))
}

public fun IoTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoTranslateBusAddress", longArrayOf(interfacetype.toLong(), busnumber.toLong(), busaddress, addressspace, translatedaddress))
    return (rawRet and 0xFFL) != 0L
}

public fun IoTryQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoTryQueueWorkItem", longArrayOf(ioworkitem, Win32DynamicFfi.objectSlot(workerroutine), queuetype.toLong(), context))
    return (rawRet and 0xFFL) != 0L
}

public fun IoUninitializeWorkItem(ioworkitem: PIO_WORKITEM) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUninitializeWorkItem", longArrayOf(ioworkitem))
}

public fun IoUnregisterBootDriverCallback(callbackhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUnregisterBootDriverCallback", longArrayOf(callbackhandle))
}

public fun IoUnregisterContainerNotification(callbackregistration: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUnregisterContainerNotification", longArrayOf(callbackregistration))
}

public fun IoUnregisterPlugPlayNotification(notificationentry: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUnregisterPlugPlayNotification", longArrayOf(notificationentry)).toInt()
}

public fun IoUnregisterPlugPlayNotificationEx(notificationentry: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUnregisterPlugPlayNotificationEx", longArrayOf(notificationentry)).toInt()
}

public fun IoUnregisterShutdownNotification(deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUnregisterShutdownNotification", longArrayOf(deviceobject))
}

public fun IoUpdateLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUpdateLinkShareAccess", longArrayOf(fileobject, shareaccess, linkshareaccess))
}

public fun IoUpdateLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUpdateLinkShareAccessEx", longArrayOf(fileobject, shareaccess, linkshareaccess, ioshareaccessflags.toLong()))
}

public fun IoUpdateShareAccess(fileobject: Long, shareaccess: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUpdateShareAccess", longArrayOf(fileobject, shareaccess))
}

public fun IoValidateDeviceIoControlAccess(irp: Long, requiredaccess: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoValidateDeviceIoControlAccess", longArrayOf(irp, requiredaccess.toLong())).toInt()
}

public fun IoVerifyPartitionTable(deviceobject: Long, fixerrors: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoVerifyPartitionTable", longArrayOf(deviceobject, if (fixerrors) 1L else 0L)).toInt()
}

public fun IoVolumeDeviceNameToGuid(volumedevicename: Long, guid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoVolumeDeviceNameToGuid", longArrayOf(volumedevicename, guid)).toInt()
}

public fun IoVolumeDeviceNameToGuidPath(volumedevicename: Long, guidpath: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoVolumeDeviceNameToGuidPath", longArrayOf(volumedevicename, guidpath)).toInt()
}

public fun IoVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoVolumeDeviceToDosName", longArrayOf(volumedeviceobject, dosname)).toInt()
}

public fun IoVolumeDeviceToGuid(volumedeviceobject: Long, guid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoVolumeDeviceToGuid", longArrayOf(volumedeviceobject, guid)).toInt()
}

public fun IoVolumeDeviceToGuidPath(volumedeviceobject: Long, guidpath: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoVolumeDeviceToGuidPath", longArrayOf(volumedeviceobject, guidpath)).toInt()
}

public fun IoWMIAllocateInstanceIds(guid: Long, instancecount: UInt, firstinstanceid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIAllocateInstanceIds", longArrayOf(guid, instancecount.toLong(), firstinstanceid)).toInt()
}

public fun IoWMIDeviceObjectToInstanceName(datablockobject: Long, deviceobject: Long, instancename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIDeviceObjectToInstanceName", longArrayOf(datablockobject, deviceobject, instancename)).toInt()
}

public fun IoWMIExecuteMethod(datablockobject: Long, instancename: Long, methodid: UInt, inbuffersize: UInt, outbuffersize: Long, inoutbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIExecuteMethod", longArrayOf(datablockobject, instancename, methodid.toLong(), inbuffersize.toLong(), outbuffersize, inoutbuffer)).toInt()
}

public fun IoWMIHandleToInstanceName(datablockobject: Long, filehandle: HANDLE, instancename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIHandleToInstanceName", longArrayOf(datablockobject, filehandle, instancename)).toInt()
}

public fun IoWMIOpenBlock(guid: Long, desiredaccess: UInt, datablockobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIOpenBlock", longArrayOf(guid, desiredaccess.toLong(), datablockobject)).toInt()
}

public fun IoWMIQueryAllData(datablockobject: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIQueryAllData", longArrayOf(datablockobject, inoutbuffersize, outbuffer)).toInt()
}

public fun IoWMIQueryAllDataMultiple(datablockobjectlist: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIQueryAllDataMultiple", longArrayOf(datablockobjectlist, objectcount.toLong(), inoutbuffersize, outbuffer)).toInt()
}

public fun IoWMIQuerySingleInstance(datablockobject: Long, instancename: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIQuerySingleInstance", longArrayOf(datablockobject, instancename, inoutbuffersize, outbuffer)).toInt()
}

public fun IoWMIQuerySingleInstanceMultiple(datablockobjectlist: Long, instancenames: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIQuerySingleInstanceMultiple", longArrayOf(datablockobjectlist, instancenames, objectcount.toLong(), inoutbuffersize, outbuffer)).toInt()
}

public fun IoWMIRegistrationControl(deviceobject: Long, action: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIRegistrationControl", longArrayOf(deviceobject, action.toLong())).toInt()
}

public fun IoWMISetNotificationCallback(obj: Long, callback: WMI_NOTIFICATION_CALLBACK, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMISetNotificationCallback", longArrayOf(obj, Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun IoWMISetSingleInstance(datablockobject: Long, instancename: Long, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMISetSingleInstance", longArrayOf(datablockobject, instancename, version.toLong(), valuebuffersize.toLong(), valuebuffer)).toInt()
}

public fun IoWMISetSingleItem(datablockobject: Long, instancename: Long, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMISetSingleItem", longArrayOf(datablockobject, instancename, dataitemid.toLong(), version.toLong(), valuebuffersize.toLong(), valuebuffer)).toInt()
}

public fun IoWMISuggestInstanceName(physicaldeviceobject: Long, symboliclinkname: Long, combinenames: Boolean, suggestedinstancename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMISuggestInstanceName", longArrayOf(physicaldeviceobject, symboliclinkname, if (combinenames) 1L else 0L, suggestedinstancename)).toInt()
}

public fun IoWMIWriteEvent(wnodeeventitem: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWMIWriteEvent", longArrayOf(wnodeeventitem)).toInt()
}

public fun IoWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWithinStackLimits", longArrayOf(regionstart.toLong(), regionsize.toLong())).toUInt()
}

public fun IoWriteErrorLogEntry(elentry: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWriteErrorLogEntry", longArrayOf(elentry))
}

public fun IoWriteKsrPersistentMemory(datahandle: Long, buffer: Long, size: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWriteKsrPersistentMemory", longArrayOf(datahandle, buffer, size.toLong())).toInt()
}

public fun IoWritePartitionTable(deviceobject: Long, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWritePartitionTable", longArrayOf(deviceobject, sectorsize.toLong(), sectorspertrack.toLong(), numberofheads.toLong(), partitionbuffer)).toInt()
}

public fun IoWritePartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoWritePartitionTableEx", longArrayOf(deviceobject, drivelayout)).toInt()
}

public fun IofCallDriver(deviceobject: Long, irp: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IofCallDriver", longArrayOf(deviceobject, irp)).toInt()
}

public fun IofCompleteRequest(irp: Long, priorityboost: Byte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IofCompleteRequest", longArrayOf(irp, priorityboost.toLong()))
}

public fun KdChangeOption(option: KD_OPTION, inbufferbytes: UInt, inbuffer: Long, outbufferbytes: UInt, outbuffer: Long, outbufferneeded: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KdChangeOption", longArrayOf(option.toLong(), inbufferbytes.toLong(), inbuffer, outbufferbytes.toLong(), outbuffer, outbufferneeded)).toInt()
}

public fun KdDisableDebugger(): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KdDisableDebugger", longArrayOf()).toInt()
}

public fun KdEnableDebugger(): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KdEnableDebugger", longArrayOf()).toInt()
}

public fun KdRefreshDebuggerNotPresent(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KdRefreshDebuggerNotPresent", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun KeAcquireGuardedMutex(mutex: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireGuardedMutex", longArrayOf(mutex))
}

public fun KeAcquireGuardedMutexUnsafe(fastmutex: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireGuardedMutexUnsafe", longArrayOf(fastmutex))
}

public fun KeAcquireInStackQueuedSpinLock(spinlock: Long, lockhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireInStackQueuedSpinLock", longArrayOf(spinlock, lockhandle))
}

public fun KeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: Long, lockhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireInStackQueuedSpinLockAtDpcLevel", longArrayOf(spinlock, lockhandle))
}

public fun KeAcquireInStackQueuedSpinLockForDpc(spinlock: Long, lockhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireInStackQueuedSpinLockForDpc", longArrayOf(spinlock, lockhandle))
}

public fun KeAcquireInterruptSpinLock(interrupt: PKINTERRUPT): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireInterruptSpinLock", longArrayOf(interrupt)).toUByte()
}

public fun KeAcquireSpinLockForDpc(spinlock: Long): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireSpinLockForDpc", longArrayOf(spinlock)).toUByte()
}

public fun KeAddTriageDumpDataBlock(ktriagedumpdataarray: Long, address: Long, size: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAddTriageDumpDataBlock", longArrayOf(ktriagedumpdataarray, address, size.toLong())).toInt()
}

public fun KeAreAllApcsDisabled(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAreAllApcsDisabled", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun KeAreApcsDisabled(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAreApcsDisabled", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun KeBugCheck(bugcheckcode: BUGCHECK_ERROR) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeBugCheck", longArrayOf(bugcheckcode.toLong()))
}

public fun KeBugCheckEx(bugcheckcode: BUGCHECK_ERROR, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeBugCheckEx", longArrayOf(bugcheckcode.toLong(), bugcheckparameter1.toLong(), bugcheckparameter2.toLong(), bugcheckparameter3.toLong(), bugcheckparameter4.toLong()))
}

public fun KeCancelTimer(param0: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeCancelTimer", longArrayOf(param0))
    return (rawRet and 0xFFL) != 0L
}

public fun KeClearEvent(event: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeClearEvent", longArrayOf(event))
}

public fun KeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: Long, conversionerror: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeConvertAuxiliaryCounterToPerformanceCounter", longArrayOf(auxiliarycountervalue.toLong(), performancecountervalue, conversionerror)).toInt()
}

public fun KeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: Long, conversionerror: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeConvertPerformanceCounterToAuxiliaryCounter", longArrayOf(performancecountervalue.toLong(), auxiliarycountervalue, conversionerror)).toInt()
}

public fun KeDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeDelayExecutionThread", longArrayOf(waitmode.toLong(), if (alertable) 1L else 0L, interval)).toInt()
}

public fun KeDeregisterBoundCallback(handle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeDeregisterBoundCallback", longArrayOf(handle)).toInt()
}

public fun KeDeregisterBugCheckCallback(callbackrecord: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeDeregisterBugCheckCallback", longArrayOf(callbackrecord))
    return (rawRet and 0xFFL) != 0L
}

public fun KeDeregisterBugCheckReasonCallback(callbackrecord: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeDeregisterBugCheckReasonCallback", longArrayOf(callbackrecord))
    return (rawRet and 0xFFL) != 0L
}

public fun KeDeregisterNmiCallback(handle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeDeregisterNmiCallback", longArrayOf(handle)).toInt()
}

public fun KeDeregisterProcessorChangeCallback(callbackhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeDeregisterProcessorChangeCallback", longArrayOf(callbackhandle))
}

public fun KeEnterCriticalRegion() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeEnterCriticalRegion", longArrayOf())
}

public fun KeEnterGuardedRegion() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeEnterGuardedRegion", longArrayOf())
}

public fun KeExpandKernelStackAndCallout(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeExpandKernelStackAndCallout", longArrayOf(Win32DynamicFfi.objectSlot(callout), parameter, size.toLong())).toInt()
}

public fun KeExpandKernelStackAndCalloutEx(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong, wait: Boolean, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeExpandKernelStackAndCalloutEx", longArrayOf(Win32DynamicFfi.objectSlot(callout), parameter, size.toLong(), if (wait) 1L else 0L, context)).toInt()
}

public fun KeFlushIoBuffers(mdl: Long, readoperation: Boolean, dmaoperation: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeFlushIoBuffers", longArrayOf(mdl, if (readoperation) 1L else 0L, if (dmaoperation) 1L else 0L))
}

public fun KeFlushQueuedDpcs() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeFlushQueuedDpcs", longArrayOf())
}

public fun KeFlushWriteBuffer() {
    Win32DynamicFfi.invoke("hal.dll", "KeFlushWriteBuffer", longArrayOf())
}

public fun KeGetCurrentIrql(): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeGetCurrentIrql", longArrayOf()).toUByte()
}

public fun KeGetCurrentNodeNumber(): UShort {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeGetCurrentNodeNumber", longArrayOf()).toUShort()
}

public fun KeGetCurrentProcessorNumberEx(procnumber: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeGetCurrentProcessorNumberEx", longArrayOf(procnumber)).toUInt()
}

public fun KeGetProcessorIndexFromNumber(procnumber: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeGetProcessorIndexFromNumber", longArrayOf(procnumber)).toUInt()
}

public fun KeGetProcessorNumberFromIndex(procindex: UInt, procnumber: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeGetProcessorNumberFromIndex", longArrayOf(procindex.toLong(), procnumber)).toInt()
}

public fun KeGetRecommendedSharedDataAlignment(): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeGetRecommendedSharedDataAlignment", longArrayOf()).toUInt()
}

public fun KeInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: Long, buffersize: UInt, bufferneeded: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeCrashDumpHeader", longArrayOf(dumptype.toLong(), flags.toLong(), buffer, buffersize.toLong(), bufferneeded)).toInt()
}

public fun KeInitializeDeviceQueue(devicequeue: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeDeviceQueue", longArrayOf(devicequeue))
}

public fun KeInitializeDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeDpc", longArrayOf(dpc, Win32DynamicFfi.objectSlot(deferredroutine), deferredcontext))
}

public fun KeInitializeEvent(event: Long, type: EVENT_TYPE, state: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeEvent", longArrayOf(event, type.toLong(), if (state) 1L else 0L))
}

public fun KeInitializeGuardedMutex(mutex: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeGuardedMutex", longArrayOf(mutex))
}
