package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.io.LPOVERLAPPED_COMPLETION_ROUTINE

public fun interface FnCallback {
    public operator fun invoke(totalfilesize: Long, totalbytestransferred: Long, streamsize: Long, streambytestransferred: Long, dwstreamnumber: UInt, dwcallbackreason: LPPROGRESS_ROUTINE_CALLBACK_REASON, hsourcefile: HANDLE, hdestinationfile: HANDLE, lpdata: Long): COPYPROGRESSROUTINE_PROGRESS
}

public fun interface FnCallback1 {
    public operator fun invoke(cbbufferlength: UInt, pvusercontext: Long): Long
}

public fun interface FnCallback2 {
    public operator fun invoke(pvbuffer: Long, pvusercontext: Long)
}

public fun interface FnCallback3 {
    public operator fun invoke(pbdata: Long, pvcallbackcontext: Long, ullength: UInt): UInt
}

public fun interface FnCallback4 {
    public operator fun invoke(entryinfo: Long, userdata: Long): BOOL
}

public fun interface FnCallback5 {
    public operator fun invoke(filepath: PCWSTR, externalfileinfo: Long, userdata: Long): BOOL
}

public fun interface FnCallback6 {
    public operator fun invoke(pbdata: Long, pvcallbackcontext: Long, ullength: Long): UInt
}

public fun AddLogContainer(hlog: HANDLE, pcbcontainer: Long, pwszcontainerpath: PCWSTR, preserved: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "AddLogContainer", longArrayOf(hlog, pcbcontainer, pwszcontainerpath, preserved)).toInt()
}

public fun AddLogContainerSet(hlog: HANDLE, ccontainer: UShort, pcbcontainer: Long, rgwszcontainerpath: Long, preserved: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "AddLogContainerSet", longArrayOf(hlog, ccontainer.toLong(), pcbcontainer, rgwszcontainerpath, preserved)).toInt()
}

public fun AddUsersToEncryptedFile(lpfilename: PCWSTR, pencryptioncertificates: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "AddUsersToEncryptedFile", longArrayOf(lpfilename, pencryptioncertificates)).toUInt()
}

public fun AdvanceLogBase(pvmarshal: Long, plsnbase: Long, fflags: UInt, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "AdvanceLogBase", longArrayOf(pvmarshal, plsnbase, fflags.toLong(), poverlapped)).toInt()
}

public fun AlignReservedLog(pvmarshal: Long, creservedrecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "AlignReservedLog", longArrayOf(pvmarshal, creservedrecords.toLong(), rgcbreservation, pcbalignreservation)).toInt()
}

public fun AllocReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "AllocReservedLog", longArrayOf(pvmarshal, creservedrecords.toLong(), pcbadjustment)).toInt()
}

public fun AreFileApisANSI(): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AreFileApisANSI", longArrayOf()).toInt()
}

public fun AreShortNamesEnabled(handle: HANDLE, enabled: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AreShortNamesEnabled", longArrayOf(handle, enabled)).toInt()
}

public fun BackupRead(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "BackupRead", longArrayOf(hfile, lpbuffer, nnumberofbytestoread.toLong(), lpnumberofbytesread, babort.toLong(), bprocesssecurity.toLong(), lpcontext)).toInt()
}

public fun BackupSeek(hfile: HANDLE, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: Long, lpdwhighbyteseeked: Long, lpcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "BackupSeek", longArrayOf(hfile, dwlowbytestoseek.toLong(), dwhighbytestoseek.toLong(), lpdwlowbyteseeked, lpdwhighbyteseeked, lpcontext)).toInt()
}

public fun BackupWrite(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "BackupWrite", longArrayOf(hfile, lpbuffer, nnumberofbytestowrite.toLong(), lpnumberofbyteswritten, babort.toLong(), bprocesssecurity.toLong(), lpcontext)).toInt()
}

public fun BuildIoRingCancelRequest(ioring: HIORING, file: IORING_HANDLE_REF, optocancel: ULong, userdata: ULong): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "BuildIoRingCancelRequest", longArrayOf(ioring, Win32DynamicFfi.objectSlot(file), optocancel.toLong(), userdata.toLong())).toInt()
}

public fun BuildIoRingFlushFile(ioring: HIORING, fileref: IORING_HANDLE_REF, flushmode: FILE_FLUSH_MODE, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "BuildIoRingFlushFile", longArrayOf(ioring, Win32DynamicFfi.objectSlot(fileref), flushmode.toLong(), userdata.toLong(), sqeflags.toLong())).toInt()
}

public fun BuildIoRingReadFile(ioring: HIORING, fileref: IORING_HANDLE_REF, dataref: IORING_BUFFER_REF, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "BuildIoRingReadFile", longArrayOf(ioring, Win32DynamicFfi.objectSlot(fileref), Win32DynamicFfi.objectSlot(dataref), numberofbytestoread.toLong(), fileoffset.toLong(), userdata.toLong(), sqeflags.toLong())).toInt()
}

public fun BuildIoRingRegisterBuffers(ioring: HIORING, count: UInt, buffers: Long, userdata: ULong): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "BuildIoRingRegisterBuffers", longArrayOf(ioring, count.toLong(), buffers, userdata.toLong())).toInt()
}

public fun BuildIoRingRegisterFileHandles(ioring: HIORING, count: UInt, handles: Long, userdata: ULong): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "BuildIoRingRegisterFileHandles", longArrayOf(ioring, count.toLong(), handles, userdata.toLong())).toInt()
}

public fun BuildIoRingWriteFile(ioring: HIORING, fileref: IORING_HANDLE_REF, bufferref: IORING_BUFFER_REF, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FILE_WRITE_FLAGS, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "BuildIoRingWriteFile", longArrayOf(ioring, Win32DynamicFfi.objectSlot(fileref), Win32DynamicFfi.objectSlot(bufferref), numberofbytestowrite.toLong(), fileoffset.toLong(), writeflags.toLong(), userdata.toLong(), sqeflags.toLong())).toInt()
}

public fun CheckNameLegalDOS8Dot3A(lpname: PCSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CheckNameLegalDOS8Dot3A", longArrayOf(lpname, lpoemname, oemnamesize.toLong(), pbnamecontainsspaces, pbnamelegal)).toInt()
}

public fun CheckNameLegalDOS8Dot3W(lpname: PCWSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CheckNameLegalDOS8Dot3W", longArrayOf(lpname, lpoemname, oemnamesize.toLong(), pbnamecontainsspaces, pbnamelegal)).toInt()
}

public fun CloseAndResetLogFile(hlog: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "CloseAndResetLogFile", longArrayOf(hlog)).toInt()
}

public fun CloseEncryptedFileRaw(pvcontext: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "CloseEncryptedFileRaw", longArrayOf(pvcontext))
}

public fun CloseIoRing(ioring: HIORING): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "CloseIoRing", longArrayOf(ioring)).toInt()
}

public fun CommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "CommitComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun CommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "CommitEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun CommitTransaction(transactionhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "CommitTransaction", longArrayOf(transactionhandle)).toInt()
}

public fun CommitTransactionAsync(transactionhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "CommitTransactionAsync", longArrayOf(transactionhandle)).toInt()
}

public fun CompareFileTime(lpfiletime1: Long, lpfiletime2: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "CompareFileTime", longArrayOf(lpfiletime1, lpfiletime2)).toInt()
}

public fun CopyFile2(pwszexistingfilename: PCWSTR, pwsznewfilename: PCWSTR, pextendedparameters: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CopyFile2", longArrayOf(pwszexistingfilename, pwsznewfilename, pextendedparameters)).toInt()
}

public fun CopyFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, bfailifexists: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CopyFileA", longArrayOf(lpexistingfilename, lpnewfilename, bfailifexists.toLong())).toInt()
}

public fun CopyFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CopyFileExA", longArrayOf(lpexistingfilename, lpnewfilename, Win32DynamicFfi.objectSlot(lpprogressroutine), lpdata, pbcancel, dwcopyflags.toLong())).toInt()
}

public fun CopyFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CopyFileExW", longArrayOf(lpexistingfilename, lpnewfilename, Win32DynamicFfi.objectSlot(lpprogressroutine), lpdata, pbcancel, dwcopyflags.toLong())).toInt()
}

public fun CopyFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "CopyFileFromAppW", longArrayOf(lpexistingfilename, lpnewfilename, bfailifexists.toLong())).toInt()
}

public fun CopyFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CopyFileTransactedA", longArrayOf(lpexistingfilename, lpnewfilename, Win32DynamicFfi.objectSlot(lpprogressroutine), lpdata, pbcancel, dwcopyflags.toLong(), htransaction)).toInt()
}

public fun CopyFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CopyFileTransactedW", longArrayOf(lpexistingfilename, lpnewfilename, Win32DynamicFfi.objectSlot(lpprogressroutine), lpdata, pbcancel, dwcopyflags.toLong(), htransaction)).toInt()
}

public fun CopyFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CopyFileW", longArrayOf(lpexistingfilename, lpnewfilename, bfailifexists.toLong())).toInt()
}

public fun CopyLZFile(hfsource: Int, hfdest: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "CopyLZFile", longArrayOf(hfsource.toLong(), hfdest.toLong())).toInt()
}

public fun CreateDirectoryA(lppathname: PCSTR, lpsecurityattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateDirectoryA", longArrayOf(lppathname, lpsecurityattributes)).toInt()
}

public fun CreateDirectoryExA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateDirectoryExA", longArrayOf(lptemplatedirectory, lpnewdirectory, lpsecurityattributes)).toInt()
}

public fun CreateDirectoryExW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateDirectoryExW", longArrayOf(lptemplatedirectory, lpnewdirectory, lpsecurityattributes)).toInt()
}

public fun CreateDirectoryFromAppW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "CreateDirectoryFromAppW", longArrayOf(lppathname, lpsecurityattributes)).toInt()
}

public fun CreateDirectoryTransactedA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateDirectoryTransactedA", longArrayOf(lptemplatedirectory, lpnewdirectory, lpsecurityattributes, htransaction)).toInt()
}

public fun CreateDirectoryTransactedW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateDirectoryTransactedW", longArrayOf(lptemplatedirectory, lpnewdirectory, lpsecurityattributes, htransaction)).toInt()
}

public fun CreateDirectoryW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateDirectoryW", longArrayOf(lppathname, lpsecurityattributes)).toInt()
}

public fun CreateEnlistment(lpenlistmentattributes: Long, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, notificationmask: UInt, createoptions: UInt, enlistmentkey: Long): HANDLE {
    return Win32DynamicFfi.invoke("ktmw32.dll", "CreateEnlistment", longArrayOf(lpenlistmentattributes, resourcemanagerhandle, transactionhandle, notificationmask.toLong(), createoptions.toLong(), enlistmentkey))
}

public fun CreateFile2(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwcreationdisposition: FILE_CREATION_DISPOSITION, pcreateexparams: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFile2", longArrayOf(lpfilename, dwdesiredaccess.toLong(), dwsharemode.toLong(), dwcreationdisposition.toLong(), pcreateexparams))
}

public fun CreateFile2FromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: Long): HANDLE {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "CreateFile2FromAppW", longArrayOf(lpfilename, dwdesiredaccess.toLong(), dwsharemode.toLong(), dwcreationdisposition.toLong(), pcreateexparams))
}

public fun CreateFileA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFileA", longArrayOf(lpfilename, dwdesiredaccess.toLong(), dwsharemode.toLong(), lpsecurityattributes, dwcreationdisposition.toLong(), dwflagsandattributes.toLong(), htemplatefile))
}

public fun CreateFileFromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "CreateFileFromAppW", longArrayOf(lpfilename, dwdesiredaccess.toLong(), dwsharemode.toLong(), lpsecurityattributes, dwcreationdisposition.toLong(), dwflagsandattributes.toLong(), htemplatefile))
}

public fun CreateFileTransactedA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFileTransactedA", longArrayOf(lpfilename, dwdesiredaccess.toLong(), dwsharemode.toLong(), lpsecurityattributes, dwcreationdisposition.toLong(), dwflagsandattributes.toLong(), htemplatefile, htransaction, pusminiversion, lpextendedparameter))
}

public fun CreateFileTransactedW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFileTransactedW", longArrayOf(lpfilename, dwdesiredaccess.toLong(), dwsharemode.toLong(), lpsecurityattributes, dwcreationdisposition.toLong(), dwflagsandattributes.toLong(), htemplatefile, htransaction, pusminiversion, lpextendedparameter))
}

public fun CreateFileW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFileW", longArrayOf(lpfilename, dwdesiredaccess.toLong(), dwsharemode.toLong(), lpsecurityattributes, dwcreationdisposition.toLong(), dwflagsandattributes.toLong(), htemplatefile))
}

public fun CreateHardLinkA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateHardLinkA", longArrayOf(lpfilename, lpexistingfilename, lpsecurityattributes)).toInt()
}

public fun CreateHardLinkTransactedA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateHardLinkTransactedA", longArrayOf(lpfilename, lpexistingfilename, lpsecurityattributes, htransaction)).toInt()
}

public fun CreateHardLinkTransactedW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateHardLinkTransactedW", longArrayOf(lpfilename, lpexistingfilename, lpsecurityattributes, htransaction)).toInt()
}

public fun CreateHardLinkW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateHardLinkW", longArrayOf(lpfilename, lpexistingfilename, lpsecurityattributes)).toInt()
}

public fun CreateIoRing(ioringversion: IORING_VERSION, flags: IORING_CREATE_FLAGS, submissionqueuesize: UInt, completionqueuesize: UInt, h: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "CreateIoRing", longArrayOf(ioringversion.toLong(), ((flags.Required.toLong() and 0xFFFF_FFFFL) or ((flags.Advisory.toLong() and 0xFFFF_FFFFL) shl 32)), submissionqueuesize.toLong(), completionqueuesize.toLong(), h)).toInt()
}

public fun CreateLogContainerScanContext(hlog: HANDLE, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "CreateLogContainerScanContext", longArrayOf(hlog, cfromcontainer.toLong(), ccontainers.toLong(), escanmode.toLong(), pcxscan, poverlapped)).toInt()
}

public fun CreateLogFile(pszlogfilename: PCWSTR, fdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, psalogfile: Long, fcreatedisposition: FILE_CREATION_DISPOSITION, fflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE {
    return Win32DynamicFfi.invoke("clfsw32.dll", "CreateLogFile", longArrayOf(pszlogfilename, fdesiredaccess.toLong(), dwsharemode.toLong(), psalogfile, fcreatedisposition.toLong(), fflagsandattributes.toLong()))
}

public fun CreateLogMarshallingArea(hlog: HANDLE, pfnallocbuffer: CLFS_BLOCK_ALLOCATION, pfnfreebuffer: CLFS_BLOCK_DEALLOCATION, pvblockalloccontext: Long, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "CreateLogMarshallingArea", longArrayOf(hlog, Win32DynamicFfi.objectSlot(pfnallocbuffer), Win32DynamicFfi.objectSlot(pfnfreebuffer), pvblockalloccontext, cbmarshallingbuffer.toLong(), cmaxwritebuffers.toLong(), cmaxreadbuffers.toLong(), ppvmarshal)).toInt()
}

public fun CreateResourceManager(lpresourcemanagerattributes: Long, resourcemanagerid: Long, createoptions: UInt, tmhandle: HANDLE, description: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("ktmw32.dll", "CreateResourceManager", longArrayOf(lpresourcemanagerattributes, resourcemanagerid, createoptions.toLong(), tmhandle, description))
}

public fun CreateSymbolicLinkA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "CreateSymbolicLinkA", longArrayOf(lpsymlinkfilename, lptargetfilename, dwflags.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun CreateSymbolicLinkTransactedA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "CreateSymbolicLinkTransactedA", longArrayOf(lpsymlinkfilename, lptargetfilename, dwflags.toLong(), htransaction))
    return (rawRet and 0xFFL) != 0L
}

public fun CreateSymbolicLinkTransactedW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "CreateSymbolicLinkTransactedW", longArrayOf(lpsymlinkfilename, lptargetfilename, dwflags.toLong(), htransaction))
    return (rawRet and 0xFFL) != 0L
}

public fun CreateSymbolicLinkW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "CreateSymbolicLinkW", longArrayOf(lpsymlinkfilename, lptargetfilename, dwflags.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun CreateTapePartition(hdevice: HANDLE, dwpartitionmethod: CREATE_TAPE_PARTITION_METHOD, dwcount: UInt, dwsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateTapePartition", longArrayOf(hdevice, dwpartitionmethod.toLong(), dwcount.toLong(), dwsize.toLong())).toUInt()
}

public fun CreateTransaction(lptransactionattributes: Long, uow: Long, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("ktmw32.dll", "CreateTransaction", longArrayOf(lptransactionattributes, uow, createoptions.toLong(), isolationlevel.toLong(), isolationflags.toLong(), timeout.toLong(), description))
}

public fun CreateTransactionManager(lptransactionattributes: Long, logfilename: PCWSTR, createoptions: UInt, commitstrength: UInt): HANDLE {
    return Win32DynamicFfi.invoke("ktmw32.dll", "CreateTransactionManager", longArrayOf(lptransactionattributes, logfilename, createoptions.toLong(), commitstrength.toLong()))
}

public fun DecryptFileA(lpfilename: PCSTR, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "DecryptFileA", longArrayOf(lpfilename, dwreserved.toLong())).toInt()
}

public fun DecryptFileW(lpfilename: PCWSTR, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "DecryptFileW", longArrayOf(lpfilename, dwreserved.toLong())).toInt()
}

public fun DefineDosDeviceA(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCSTR, lptargetpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DefineDosDeviceA", longArrayOf(dwflags.toLong(), lpdevicename, lptargetpath)).toInt()
}

public fun DefineDosDeviceW(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCWSTR, lptargetpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DefineDosDeviceW", longArrayOf(dwflags.toLong(), lpdevicename, lptargetpath)).toInt()
}

public fun DeleteFileA(lpfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteFileA", longArrayOf(lpfilename)).toInt()
}

public fun DeleteFileFromAppW(lpfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "DeleteFileFromAppW", longArrayOf(lpfilename)).toInt()
}

public fun DeleteFileTransactedA(lpfilename: PCSTR, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteFileTransactedA", longArrayOf(lpfilename, htransaction)).toInt()
}

public fun DeleteFileTransactedW(lpfilename: PCWSTR, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteFileTransactedW", longArrayOf(lpfilename, htransaction)).toInt()
}

public fun DeleteFileW(lpfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteFileW", longArrayOf(lpfilename)).toInt()
}

public fun DeleteLogByHandle(hlog: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "DeleteLogByHandle", longArrayOf(hlog)).toInt()
}

public fun DeleteLogFile(pszlogfilename: PCWSTR, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "DeleteLogFile", longArrayOf(pszlogfilename, pvreserved)).toInt()
}

public fun DeleteLogMarshallingArea(pvmarshal: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "DeleteLogMarshallingArea", longArrayOf(pvmarshal)).toInt()
}

public fun DeleteVolumeMountPointA(lpszvolumemountpoint: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteVolumeMountPointA", longArrayOf(lpszvolumemountpoint)).toInt()
}

public fun DeleteVolumeMountPointW(lpszvolumemountpoint: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteVolumeMountPointW", longArrayOf(lpszvolumemountpoint)).toInt()
}

public fun DeregisterManageableLogClient(hlog: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "DeregisterManageableLogClient", longArrayOf(hlog)).toInt()
}

public fun DuplicateEncryptionInfoFile(srcfilename: PCWSTR, dstfilename: PCWSTR, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "DuplicateEncryptionInfoFile", longArrayOf(srcfilename, dstfilename, dwcreationdistribution.toLong(), dwattributes.toLong(), lpsecurityattributes)).toUInt()
}

public fun EncryptFileA(lpfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EncryptFileA", longArrayOf(lpfilename)).toInt()
}

public fun EncryptFileW(lpfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EncryptFileW", longArrayOf(lpfilename)).toInt()
}

public fun EncryptionDisable(dirpath: PCWSTR, disable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EncryptionDisable", longArrayOf(dirpath, disable.toLong())).toInt()
}

public fun EraseTape(hdevice: HANDLE, dwerasetype: ERASE_TAPE_TYPE, bimmediate: BOOL): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "EraseTape", longArrayOf(hdevice, dwerasetype.toLong(), bimmediate.toLong())).toUInt()
}

public fun FileEncryptionStatusA(lpfilename: PCSTR, lpstatus: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "FileEncryptionStatusA", longArrayOf(lpfilename, lpstatus)).toInt()
}

public fun FileEncryptionStatusW(lpfilename: PCWSTR, lpstatus: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "FileEncryptionStatusW", longArrayOf(lpfilename, lpstatus)).toInt()
}

public fun FileTimeToLocalFileTime(lpfiletime: Long, lplocalfiletime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FileTimeToLocalFileTime", longArrayOf(lpfiletime, lplocalfiletime)).toInt()
}

public fun FindClose(hfindfile: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindClose", longArrayOf(hfindfile)).toInt()
}

public fun FindCloseChangeNotification(hchangehandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindCloseChangeNotification", longArrayOf(hchangehandle)).toInt()
}

public fun FindFirstChangeNotificationA(lppathname: PCSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstChangeNotificationA", longArrayOf(lppathname, bwatchsubtree.toLong(), dwnotifyfilter.toLong()))
}

public fun FindFirstChangeNotificationW(lppathname: PCWSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstChangeNotificationW", longArrayOf(lppathname, bwatchsubtree.toLong(), dwnotifyfilter.toLong()))
}

public fun FindFirstFileA(lpfilename: PCSTR, lpfindfiledata: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstFileA", longArrayOf(lpfilename, lpfindfiledata))
}

public fun FindFirstFileExA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstFileExA", longArrayOf(lpfilename, finfolevelid.toLong(), lpfindfiledata, fsearchop.toLong(), lpsearchfilter, dwadditionalflags.toLong()))
}

public fun FindFirstFileExFromAppW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt): HANDLE {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "FindFirstFileExFromAppW", longArrayOf(lpfilename, finfolevelid.toLong(), lpfindfiledata, fsearchop.toLong(), lpsearchfilter, dwadditionalflags.toLong()))
}

public fun FindFirstFileExW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstFileExW", longArrayOf(lpfilename, finfolevelid.toLong(), lpfindfiledata, fsearchop.toLong(), lpsearchfilter, dwadditionalflags.toLong()))
}

public fun FindFirstFileNameTransactedW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR, htransaction: HANDLE): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstFileNameTransactedW", longArrayOf(lpfilename, dwflags.toLong(), stringlength, linkname, htransaction))
}

public fun FindFirstFileNameW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstFileNameW", longArrayOf(lpfilename, dwflags.toLong(), stringlength, linkname))
}

public fun FindFirstFileTransactedA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstFileTransactedA", longArrayOf(lpfilename, finfolevelid.toLong(), lpfindfiledata, fsearchop.toLong(), lpsearchfilter, dwadditionalflags.toLong(), htransaction))
}

public fun FindFirstFileTransactedW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstFileTransactedW", longArrayOf(lpfilename, finfolevelid.toLong(), lpfindfiledata, fsearchop.toLong(), lpsearchfilter, dwadditionalflags.toLong(), htransaction))
}

public fun FindFirstFileW(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstFileW", longArrayOf(lpfilename, lpfindfiledata))
}

public fun FindFirstStreamTransactedW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt, htransaction: HANDLE): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstStreamTransactedW", longArrayOf(lpfilename, infolevel.toLong(), lpfindstreamdata, dwflags.toLong(), htransaction))
}

public fun FindFirstStreamW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstStreamW", longArrayOf(lpfilename, infolevel.toLong(), lpfindstreamdata, dwflags.toLong()))
}

public fun FindFirstVolumeA(lpszvolumename: PSTR, cchbufferlength: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstVolumeA", longArrayOf(lpszvolumename, cchbufferlength.toLong()))
}

public fun FindFirstVolumeMountPointA(lpszrootpathname: PCSTR, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstVolumeMountPointA", longArrayOf(lpszrootpathname, lpszvolumemountpoint, cchbufferlength.toLong()))
}

public fun FindFirstVolumeMountPointW(lpszrootpathname: PCWSTR, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstVolumeMountPointW", longArrayOf(lpszrootpathname, lpszvolumemountpoint, cchbufferlength.toLong()))
}

public fun FindFirstVolumeW(lpszvolumename: PWSTR, cchbufferlength: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindFirstVolumeW", longArrayOf(lpszvolumename, cchbufferlength.toLong()))
}

public fun FindNextChangeNotification(hchangehandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNextChangeNotification", longArrayOf(hchangehandle)).toInt()
}

public fun FindNextFileA(hfindfile: HANDLE, lpfindfiledata: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNextFileA", longArrayOf(hfindfile, lpfindfiledata)).toInt()
}

public fun FindNextFileNameW(hfindstream: HANDLE, stringlength: Long, linkname: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNextFileNameW", longArrayOf(hfindstream, stringlength, linkname)).toInt()
}

public fun FindNextFileW(hfindfile: HANDLE, lpfindfiledata: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNextFileW", longArrayOf(hfindfile, lpfindfiledata)).toInt()
}

public fun FindNextStreamW(hfindstream: HANDLE, lpfindstreamdata: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNextStreamW", longArrayOf(hfindstream, lpfindstreamdata)).toInt()
}

public fun FindNextVolumeA(hfindvolume: HANDLE, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNextVolumeA", longArrayOf(hfindvolume, lpszvolumename, cchbufferlength.toLong())).toInt()
}

public fun FindNextVolumeMountPointA(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNextVolumeMountPointA", longArrayOf(hfindvolumemountpoint, lpszvolumemountpoint, cchbufferlength.toLong())).toInt()
}

public fun FindNextVolumeMountPointW(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNextVolumeMountPointW", longArrayOf(hfindvolumemountpoint, lpszvolumemountpoint, cchbufferlength.toLong())).toInt()
}

public fun FindNextVolumeW(hfindvolume: HANDLE, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindNextVolumeW", longArrayOf(hfindvolume, lpszvolumename, cchbufferlength.toLong())).toInt()
}

public fun FindVolumeClose(hfindvolume: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindVolumeClose", longArrayOf(hfindvolume)).toInt()
}

public fun FindVolumeMountPointClose(hfindvolumemountpoint: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindVolumeMountPointClose", longArrayOf(hfindvolumemountpoint)).toInt()
}

public fun FlushFileBuffers(hfile: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FlushFileBuffers", longArrayOf(hfile)).toInt()
}

public fun FlushLogBuffers(pvmarshal: Long, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "FlushLogBuffers", longArrayOf(pvmarshal, poverlapped)).toInt()
}

public fun FlushLogToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "FlushLogToLsn", longArrayOf(pvmarshalcontext, plsnflush, plsnlastflushed, poverlapped)).toInt()
}

public fun FreeEncryptedFileMetadata(pbmetadata: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "FreeEncryptedFileMetadata", longArrayOf(pbmetadata))
}

public fun FreeEncryptionCertificateHashList(pusers: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "FreeEncryptionCertificateHashList", longArrayOf(pusers))
}

public fun FreeReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "FreeReservedLog", longArrayOf(pvmarshal, creservedrecords.toLong(), pcbadjustment)).toInt()
}

public fun GetBinaryTypeA(lpapplicationname: PCSTR, lpbinarytype: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetBinaryTypeA", longArrayOf(lpapplicationname, lpbinarytype)).toInt()
}

public fun GetBinaryTypeW(lpapplicationname: PCWSTR, lpbinarytype: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetBinaryTypeW", longArrayOf(lpapplicationname, lpbinarytype)).toInt()
}

public fun GetCompressedFileSizeA(lpfilename: PCSTR, lpfilesizehigh: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCompressedFileSizeA", longArrayOf(lpfilename, lpfilesizehigh)).toUInt()
}

public fun GetCompressedFileSizeTransactedA(lpfilename: PCSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCompressedFileSizeTransactedA", longArrayOf(lpfilename, lpfilesizehigh, htransaction)).toUInt()
}

public fun GetCompressedFileSizeTransactedW(lpfilename: PCWSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCompressedFileSizeTransactedW", longArrayOf(lpfilename, lpfilesizehigh, htransaction)).toUInt()
}

public fun GetCompressedFileSizeW(lpfilename: PCWSTR, lpfilesizehigh: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCompressedFileSizeW", longArrayOf(lpfilename, lpfilesizehigh)).toUInt()
}

public fun GetCurrentClockTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "GetCurrentClockTransactionManager", longArrayOf(transactionmanagerhandle, tmvirtualclock)).toInt()
}

public fun GetDiskFreeSpaceA(lprootpathname: PCSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDiskFreeSpaceA", longArrayOf(lprootpathname, lpsectorspercluster, lpbytespersector, lpnumberoffreeclusters, lptotalnumberofclusters)).toInt()
}

public fun GetDiskFreeSpaceExA(lpdirectoryname: PCSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDiskFreeSpaceExA", longArrayOf(lpdirectoryname, lpfreebytesavailabletocaller, lptotalnumberofbytes, lptotalnumberoffreebytes)).toInt()
}

public fun GetDiskFreeSpaceExW(lpdirectoryname: PCWSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDiskFreeSpaceExW", longArrayOf(lpdirectoryname, lpfreebytesavailabletocaller, lptotalnumberofbytes, lptotalnumberoffreebytes)).toInt()
}

public fun GetDiskFreeSpaceW(lprootpathname: PCWSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDiskFreeSpaceW", longArrayOf(lprootpathname, lpsectorspercluster, lpbytespersector, lpnumberoffreeclusters, lptotalnumberofclusters)).toInt()
}

public fun GetDiskSpaceInformationA(rootpath: PCSTR, diskspaceinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDiskSpaceInformationA", longArrayOf(rootpath, diskspaceinfo)).toInt()
}

public fun GetDiskSpaceInformationW(rootpath: PCWSTR, diskspaceinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDiskSpaceInformationW", longArrayOf(rootpath, diskspaceinfo)).toInt()
}

public fun GetDriveTypeA(lprootpathname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDriveTypeA", longArrayOf(lprootpathname)).toUInt()
}

public fun GetDriveTypeW(lprootpathname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDriveTypeW", longArrayOf(lprootpathname)).toUInt()
}

public fun GetEncryptedFileMetadata(lpfilename: PCWSTR, pcbmetadata: Long, ppbmetadata: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetEncryptedFileMetadata", longArrayOf(lpfilename, pcbmetadata, ppbmetadata)).toUInt()
}

public fun GetEnlistmentId(enlistmenthandle: HANDLE, enlistmentid: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "GetEnlistmentId", longArrayOf(enlistmenthandle, enlistmentid)).toInt()
}

public fun GetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long, bufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "GetEnlistmentRecoveryInformation", longArrayOf(enlistmenthandle, buffersize.toLong(), buffer, bufferused)).toInt()
}

public fun GetExpandedNameA(lpszsource: PCSTR, lpszbuffer: PSTR): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetExpandedNameA", longArrayOf(lpszsource, lpszbuffer)).toInt()
}

public fun GetExpandedNameW(lpszsource: PCWSTR, lpszbuffer: PWSTR): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetExpandedNameW", longArrayOf(lpszsource, lpszbuffer)).toInt()
}

public fun GetFileAttributesA(lpfilename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileAttributesA", longArrayOf(lpfilename)).toUInt()
}

public fun GetFileAttributesExA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileAttributesExA", longArrayOf(lpfilename, finfolevelid.toLong(), lpfileinformation)).toInt()
}

public fun GetFileAttributesExFromAppW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "GetFileAttributesExFromAppW", longArrayOf(lpfilename, finfolevelid.toLong(), lpfileinformation)).toInt()
}

public fun GetFileAttributesExW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileAttributesExW", longArrayOf(lpfilename, finfolevelid.toLong(), lpfileinformation)).toInt()
}

public fun GetFileAttributesTransactedA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileAttributesTransactedA", longArrayOf(lpfilename, finfolevelid.toLong(), lpfileinformation, htransaction)).toInt()
}

public fun GetFileAttributesTransactedW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileAttributesTransactedW", longArrayOf(lpfilename, finfolevelid.toLong(), lpfileinformation, htransaction)).toInt()
}

public fun GetFileAttributesW(lpfilename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileAttributesW", longArrayOf(lpfilename)).toUInt()
}

public fun GetFileBandwidthReservation(hfile: HANDLE, lpperiodmilliseconds: Long, lpbytesperperiod: Long, pdiscardable: Long, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileBandwidthReservation", longArrayOf(hfile, lpperiodmilliseconds, lpbytesperperiod, pdiscardable, lptransfersize, lpnumoutstandingrequests)).toInt()
}

public fun GetFileInformationByHandle(hfile: HANDLE, lpfileinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileInformationByHandle", longArrayOf(hfile, lpfileinformation)).toInt()
}

public fun GetFileInformationByHandleEx(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileInformationByHandleEx", longArrayOf(hfile, fileinformationclass.toLong(), lpfileinformation, dwbuffersize.toLong())).toInt()
}

public fun GetFileSize(hfile: HANDLE, lpfilesizehigh: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileSize", longArrayOf(hfile, lpfilesizehigh)).toUInt()
}

public fun GetFileSizeEx(hfile: HANDLE, lpfilesize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileSizeEx", longArrayOf(hfile, lpfilesize)).toInt()
}

public fun GetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileTime", longArrayOf(hfile, lpcreationtime, lplastaccesstime, lplastwritetime)).toInt()
}

public fun GetFileType(hfile: HANDLE): FILE_TYPE {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFileType", longArrayOf(hfile)).toUInt()
}

public fun GetFileVersionInfoA(lptstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL {
    return Win32DynamicFfi.invoke("version.dll", "GetFileVersionInfoA", longArrayOf(lptstrfilename, dwhandle.toLong(), dwlen.toLong(), lpdata)).toInt()
}

public fun GetFileVersionInfoExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL {
    return Win32DynamicFfi.invoke("version.dll", "GetFileVersionInfoExA", longArrayOf(dwflags.toLong(), lpwstrfilename, dwhandle.toLong(), dwlen.toLong(), lpdata)).toInt()
}

public fun GetFileVersionInfoExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL {
    return Win32DynamicFfi.invoke("version.dll", "GetFileVersionInfoExW", longArrayOf(dwflags.toLong(), lpwstrfilename, dwhandle.toLong(), dwlen.toLong(), lpdata)).toInt()
}

public fun GetFileVersionInfoSizeA(lptstrfilename: PCSTR, lpdwhandle: Long): UInt {
    return Win32DynamicFfi.invoke("version.dll", "GetFileVersionInfoSizeA", longArrayOf(lptstrfilename, lpdwhandle)).toUInt()
}

public fun GetFileVersionInfoSizeExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, lpdwhandle: Long): UInt {
    return Win32DynamicFfi.invoke("version.dll", "GetFileVersionInfoSizeExA", longArrayOf(dwflags.toLong(), lpwstrfilename, lpdwhandle)).toUInt()
}

public fun GetFileVersionInfoSizeExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, lpdwhandle: Long): UInt {
    return Win32DynamicFfi.invoke("version.dll", "GetFileVersionInfoSizeExW", longArrayOf(dwflags.toLong(), lpwstrfilename, lpdwhandle)).toUInt()
}

public fun GetFileVersionInfoSizeW(lptstrfilename: PCWSTR, lpdwhandle: Long): UInt {
    return Win32DynamicFfi.invoke("version.dll", "GetFileVersionInfoSizeW", longArrayOf(lptstrfilename, lpdwhandle)).toUInt()
}

public fun GetFileVersionInfoW(lptstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL {
    return Win32DynamicFfi.invoke("version.dll", "GetFileVersionInfoW", longArrayOf(lptstrfilename, dwhandle.toLong(), dwlen.toLong(), lpdata)).toInt()
}

public fun GetFinalPathNameByHandleA(hfile: HANDLE, lpszfilepath: PSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFinalPathNameByHandleA", longArrayOf(hfile, lpszfilepath, cchfilepath.toLong(), dwflags.toLong())).toUInt()
}

public fun GetFinalPathNameByHandleW(hfile: HANDLE, lpszfilepath: PWSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFinalPathNameByHandleW", longArrayOf(hfile, lpszfilepath, cchfilepath.toLong(), dwflags.toLong())).toUInt()
}

public fun GetFullPathNameA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFullPathNameA", longArrayOf(lpfilename, nbufferlength.toLong(), lpbuffer, lpfilepart)).toUInt()
}

public fun GetFullPathNameTransactedA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long, htransaction: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFullPathNameTransactedA", longArrayOf(lpfilename, nbufferlength.toLong(), lpbuffer, lpfilepart, htransaction)).toUInt()
}

public fun GetFullPathNameTransactedW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long, htransaction: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFullPathNameTransactedW", longArrayOf(lpfilename, nbufferlength.toLong(), lpbuffer, lpfilepart, htransaction)).toUInt()
}

public fun GetFullPathNameW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFullPathNameW", longArrayOf(lpfilename, nbufferlength.toLong(), lpbuffer, lpfilepart)).toUInt()
}

public fun GetIoRingInfo(ioring: HIORING, info: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "GetIoRingInfo", longArrayOf(ioring, info)).toInt()
}

public fun GetLogContainerName(hlog: HANDLE, cidlogicalcontainer: UInt, pwstrcontainername: PCWSTR, clencontainername: UInt, pcactuallencontainername: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "GetLogContainerName", longArrayOf(hlog, cidlogicalcontainer.toLong(), pwstrcontainername, clencontainername.toLong(), pcactuallencontainername)).toInt()
}

public fun GetLogFileInformation(hlog: HANDLE, pinfobuffer: Long, cbbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "GetLogFileInformation", longArrayOf(hlog, pinfobuffer, cbbuffer)).toInt()
}

public fun GetLogIoStatistics(hlog: HANDLE, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "GetLogIoStatistics", longArrayOf(hlog, pvstatsbuffer, cbstatsbuffer.toLong(), estatsclass.toLong(), pcbstatswritten)).toInt()
}

public fun GetLogReservationInfo(pvmarshal: Long, pcbrecordnumber: Long, pcbuserreservation: Long, pcbcommitreservation: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "GetLogReservationInfo", longArrayOf(pvmarshal, pcbrecordnumber, pcbuserreservation, pcbcommitreservation)).toInt()
}

public fun GetLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLogicalDriveStringsA", longArrayOf(nbufferlength.toLong(), lpbuffer)).toUInt()
}

public fun GetLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLogicalDriveStringsW", longArrayOf(nbufferlength.toLong(), lpbuffer)).toUInt()
}

public fun GetLogicalDrives(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLogicalDrives", longArrayOf()).toUInt()
}

public fun GetLongPathNameA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLongPathNameA", longArrayOf(lpszshortpath, lpszlongpath, cchbuffer.toLong())).toUInt()
}

public fun GetLongPathNameTransactedA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt, htransaction: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLongPathNameTransactedA", longArrayOf(lpszshortpath, lpszlongpath, cchbuffer.toLong(), htransaction)).toUInt()
}

public fun GetLongPathNameTransactedW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt, htransaction: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLongPathNameTransactedW", longArrayOf(lpszshortpath, lpszlongpath, cchbuffer.toLong(), htransaction)).toUInt()
}

public fun GetLongPathNameW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLongPathNameW", longArrayOf(lpszshortpath, lpszlongpath, cchbuffer.toLong())).toUInt()
}

public fun GetNextLogArchiveExtent(pvarchivecontext: Long, rgadextent: Long, cdescriptors: UInt, pcdescriptorsreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "GetNextLogArchiveExtent", longArrayOf(pvarchivecontext, rgadextent, cdescriptors.toLong(), pcdescriptorsreturned)).toInt()
}

public fun GetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, dwmilliseconds: UInt, returnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "GetNotificationResourceManager", longArrayOf(resourcemanagerhandle, transactionnotification, notificationlength.toLong(), dwmilliseconds.toLong(), returnlength)).toInt()
}

public fun GetNotificationResourceManagerAsync(resourcemanagerhandle: HANDLE, transactionnotification: Long, transactionnotificationlength: UInt, returnlength: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "GetNotificationResourceManagerAsync", longArrayOf(resourcemanagerhandle, transactionnotification, transactionnotificationlength.toLong(), returnlength, lpoverlapped)).toInt()
}

public fun GetShortPathNameA(lpszlongpath: PCSTR, lpszshortpath: PSTR, cchbuffer: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetShortPathNameA", longArrayOf(lpszlongpath, lpszshortpath, cchbuffer.toLong())).toUInt()
}

public fun GetShortPathNameW(lpszlongpath: PCWSTR, lpszshortpath: PWSTR, cchbuffer: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetShortPathNameW", longArrayOf(lpszlongpath, lpszshortpath, cchbuffer.toLong())).toUInt()
}

public fun GetTapeParameters(hdevice: HANDLE, dwoperation: GET_TAPE_DRIVE_PARAMETERS_OPERATION, lpdwsize: Long, lptapeinformation: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTapeParameters", longArrayOf(hdevice, dwoperation.toLong(), lpdwsize, lptapeinformation)).toUInt()
}

public fun GetTapePosition(hdevice: HANDLE, dwpositiontype: TAPE_POSITION_TYPE, lpdwpartition: Long, lpdwoffsetlow: Long, lpdwoffsethigh: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTapePosition", longArrayOf(hdevice, dwpositiontype.toLong(), lpdwpartition, lpdwoffsetlow, lpdwoffsethigh)).toUInt()
}

public fun GetTapeStatus(hdevice: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTapeStatus", longArrayOf(hdevice)).toUInt()
}

public fun GetTempFileNameA(lppathname: PCSTR, lpprefixstring: PCSTR, uunique: UInt, lptempfilename: PSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTempFileNameA", longArrayOf(lppathname, lpprefixstring, uunique.toLong(), lptempfilename)).toUInt()
}

public fun GetTempFileNameW(lppathname: PCWSTR, lpprefixstring: PCWSTR, uunique: UInt, lptempfilename: PWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTempFileNameW", longArrayOf(lppathname, lpprefixstring, uunique.toLong(), lptempfilename)).toUInt()
}

public fun GetTempPath2A(bufferlength: UInt, buffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTempPath2A", longArrayOf(bufferlength.toLong(), buffer)).toUInt()
}

public fun GetTempPath2W(bufferlength: UInt, buffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTempPath2W", longArrayOf(bufferlength.toLong(), buffer)).toUInt()
}

public fun GetTempPathA(nbufferlength: UInt, lpbuffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTempPathA", longArrayOf(nbufferlength.toLong(), lpbuffer)).toUInt()
}

public fun GetTempPathW(nbufferlength: UInt, lpbuffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetTempPathW", longArrayOf(nbufferlength.toLong(), lpbuffer)).toUInt()
}

public fun GetTransactionId(transactionhandle: HANDLE, transactionid: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "GetTransactionId", longArrayOf(transactionhandle, transactionid)).toInt()
}

public fun GetTransactionInformation(transactionhandle: HANDLE, outcome: Long, isolationlevel: Long, isolationflags: Long, timeout: Long, bufferlength: UInt, description: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "GetTransactionInformation", longArrayOf(transactionhandle, outcome, isolationlevel, isolationflags, timeout, bufferlength.toLong(), description)).toInt()
}

public fun GetTransactionManagerId(transactionmanagerhandle: HANDLE, transactionmanagerid: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "GetTransactionManagerId", longArrayOf(transactionmanagerhandle, transactionmanagerid)).toInt()
}

public fun GetVolumeInformationA(lprootpathname: PCSTR, lpvolumenamebuffer: PSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PSTR, nfilesystemnamesize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVolumeInformationA", longArrayOf(lprootpathname, lpvolumenamebuffer, nvolumenamesize.toLong(), lpvolumeserialnumber, lpmaximumcomponentlength, lpfilesystemflags, lpfilesystemnamebuffer, nfilesystemnamesize.toLong())).toInt()
}

public fun GetVolumeInformationByHandleW(hfile: HANDLE, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVolumeInformationByHandleW", longArrayOf(hfile, lpvolumenamebuffer, nvolumenamesize.toLong(), lpvolumeserialnumber, lpmaximumcomponentlength, lpfilesystemflags, lpfilesystemnamebuffer, nfilesystemnamesize.toLong())).toInt()
}

public fun GetVolumeInformationW(lprootpathname: PCWSTR, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVolumeInformationW", longArrayOf(lprootpathname, lpvolumenamebuffer, nvolumenamesize.toLong(), lpvolumeserialnumber, lpmaximumcomponentlength, lpfilesystemflags, lpfilesystemnamebuffer, nfilesystemnamesize.toLong())).toInt()
}

public fun GetVolumeNameForVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVolumeNameForVolumeMountPointA", longArrayOf(lpszvolumemountpoint, lpszvolumename, cchbufferlength.toLong())).toInt()
}

public fun GetVolumeNameForVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVolumeNameForVolumeMountPointW", longArrayOf(lpszvolumemountpoint, lpszvolumename, cchbufferlength.toLong())).toInt()
}

public fun GetVolumePathNameA(lpszfilename: PCSTR, lpszvolumepathname: PSTR, cchbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVolumePathNameA", longArrayOf(lpszfilename, lpszvolumepathname, cchbufferlength.toLong())).toInt()
}

public fun GetVolumePathNameW(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVolumePathNameW", longArrayOf(lpszfilename, lpszvolumepathname, cchbufferlength.toLong())).toInt()
}

public fun GetVolumePathNamesForVolumeNameA(lpszvolumename: PCSTR, lpszvolumepathnames: PSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVolumePathNamesForVolumeNameA", longArrayOf(lpszvolumename, lpszvolumepathnames, cchbufferlength.toLong(), lpcchreturnlength)).toInt()
}

public fun GetVolumePathNamesForVolumeNameW(lpszvolumename: PCWSTR, lpszvolumepathnames: PWSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetVolumePathNamesForVolumeNameW", longArrayOf(lpszvolumename, lpszvolumepathnames, cchbufferlength.toLong(), lpcchreturnlength)).toInt()
}

public fun HandleLogFull(hlog: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "HandleLogFull", longArrayOf(hlog)).toInt()
}

public fun InstallLogPolicy(hlog: HANDLE, ppolicy: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "InstallLogPolicy", longArrayOf(hlog, ppolicy)).toInt()
}

public fun IsIoRingOpSupported(ioring: HIORING, op: IORING_OP_CODE): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "IsIoRingOpSupported", longArrayOf(ioring, op.toLong())).toInt()
}

public fun LZClose(hfile: Int) {
    Win32DynamicFfi.invoke("kernel32.dll", "LZClose", longArrayOf(hfile.toLong()))
}

public fun LZCopy(hfsource: Int, hfdest: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LZCopy", longArrayOf(hfsource.toLong(), hfdest.toLong())).toInt()
}

public fun LZDone() {
    Win32DynamicFfi.invoke("kernel32.dll", "LZDone", longArrayOf())
}

public fun LZInit(hfsource: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LZInit", longArrayOf(hfsource.toLong())).toInt()
}

public fun LZOpenFileA(lpfilename: PCSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LZOpenFileA", longArrayOf(lpfilename, lpreopenbuf, wstyle.toLong())).toInt()
}

public fun LZOpenFileW(lpfilename: PCWSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LZOpenFileW", longArrayOf(lpfilename, lpreopenbuf, wstyle.toLong())).toInt()
}

public fun LZRead(hfile: Int, lpbuffer: PSTR, cbread: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LZRead", longArrayOf(hfile.toLong(), lpbuffer, cbread.toLong())).toInt()
}

public fun LZSeek(hfile: Int, loffset: Int, iorigin: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LZSeek", longArrayOf(hfile.toLong(), loffset.toLong(), iorigin.toLong())).toInt()
}

public fun LZStart(): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "LZStart", longArrayOf()).toInt()
}

public fun LocalFileTimeToFileTime(lplocalfiletime: Long, lpfiletime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalFileTimeToFileTime", longArrayOf(lplocalfiletime, lpfiletime)).toInt()
}

public fun LockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LockFile", longArrayOf(hfile, dwfileoffsetlow.toLong(), dwfileoffsethigh.toLong(), nnumberofbytestolocklow.toLong(), nnumberofbytestolockhigh.toLong())).toInt()
}

public fun LockFileEx(hfile: HANDLE, dwflags: LOCK_FILE_FLAGS, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LockFileEx", longArrayOf(hfile, dwflags.toLong(), dwreserved.toLong(), nnumberofbytestolocklow.toLong(), nnumberofbytestolockhigh.toLong(), lpoverlapped)).toInt()
}

public fun LogTailAdvanceFailure(hlog: HANDLE, dwreason: UInt): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "LogTailAdvanceFailure", longArrayOf(hlog, dwreason.toLong())).toInt()
}

public fun LsnBlockOffset(plsn: Long): UInt {
    return Win32DynamicFfi.invoke("clfsw32.dll", "LsnBlockOffset", longArrayOf(plsn)).toUInt()
}

public fun LsnContainer(plsn: Long): UInt {
    return Win32DynamicFfi.invoke("clfsw32.dll", "LsnContainer", longArrayOf(plsn)).toUInt()
}

public fun LsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN {
    val rawRet = Win32DynamicFfi.invoke("clfsw32.dll", "LsnCreate", longArrayOf(cidcontainer.toLong(), offblock.toLong(), crecord.toLong()))
    return CLS_LSN(Internal = rawRet.toULong())
}

public fun LsnEqual(plsn1: Long, plsn2: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("clfsw32.dll", "LsnEqual", longArrayOf(plsn1, plsn2))
    return (rawRet and 0xFFL) != 0L
}

public fun LsnGreater(plsn1: Long, plsn2: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("clfsw32.dll", "LsnGreater", longArrayOf(plsn1, plsn2))
    return (rawRet and 0xFFL) != 0L
}

public fun LsnIncrement(plsn: Long): CLS_LSN {
    val rawRet = Win32DynamicFfi.invoke("clfsw32.dll", "LsnIncrement", longArrayOf(plsn))
    return CLS_LSN(Internal = rawRet.toULong())
}

public fun LsnInvalid(plsn: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("clfsw32.dll", "LsnInvalid", longArrayOf(plsn))
    return (rawRet and 0xFFL) != 0L
}

public fun LsnLess(plsn1: Long, plsn2: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("clfsw32.dll", "LsnLess", longArrayOf(plsn1, plsn2))
    return (rawRet and 0xFFL) != 0L
}

public fun LsnNull(plsn: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("clfsw32.dll", "LsnNull", longArrayOf(plsn))
    return (rawRet and 0xFFL) != 0L
}

public fun LsnRecordSequence(plsn: Long): UInt {
    return Win32DynamicFfi.invoke("clfsw32.dll", "LsnRecordSequence", longArrayOf(plsn)).toUInt()
}

public fun MoveFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "MoveFileA", longArrayOf(lpexistingfilename, lpnewfilename)).toInt()
}

public fun MoveFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, dwflags: MOVE_FILE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "MoveFileExA", longArrayOf(lpexistingfilename, lpnewfilename, dwflags.toLong())).toInt()
}

public fun MoveFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: MOVE_FILE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "MoveFileExW", longArrayOf(lpexistingfilename, lpnewfilename, dwflags.toLong())).toInt()
}

public fun MoveFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "MoveFileFromAppW", longArrayOf(lpexistingfilename, lpnewfilename)).toInt()
}

public fun MoveFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "MoveFileTransactedA", longArrayOf(lpexistingfilename, lpnewfilename, Win32DynamicFfi.objectSlot(lpprogressroutine), lpdata, dwflags.toLong(), htransaction)).toInt()
}

public fun MoveFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "MoveFileTransactedW", longArrayOf(lpexistingfilename, lpnewfilename, Win32DynamicFfi.objectSlot(lpprogressroutine), lpdata, dwflags.toLong(), htransaction)).toInt()
}

public fun MoveFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "MoveFileW", longArrayOf(lpexistingfilename, lpnewfilename)).toInt()
}

public fun MoveFileWithProgressA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "MoveFileWithProgressA", longArrayOf(lpexistingfilename, lpnewfilename, Win32DynamicFfi.objectSlot(lpprogressroutine), lpdata, dwflags.toLong())).toInt()
}

public fun MoveFileWithProgressW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "MoveFileWithProgressW", longArrayOf(lpexistingfilename, lpnewfilename, Win32DynamicFfi.objectSlot(lpprogressroutine), lpdata, dwflags.toLong())).toInt()
}

public fun NetConnectionEnum(servername: PCWSTR, qualifier: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetConnectionEnum", longArrayOf(servername, qualifier, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetFileClose(servername: PCWSTR, fileid: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetFileClose", longArrayOf(servername, fileid.toLong())).toUInt()
}

public fun NetFileEnum(servername: PCWSTR, basepath: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetFileEnum", longArrayOf(servername, basepath, username, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetFileGetInfo(servername: PCWSTR, fileid: UInt, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetFileGetInfo", longArrayOf(servername, fileid.toLong(), level.toLong(), bufptr)).toUInt()
}

public fun NetServerAliasAdd(servername: PCWSTR, level: UInt, buf: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerAliasAdd", longArrayOf(servername, level.toLong(), buf)).toUInt()
}

public fun NetServerAliasDel(servername: PCWSTR, level: UInt, buf: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerAliasDel", longArrayOf(servername, level.toLong(), buf)).toUInt()
}

public fun NetServerAliasEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetServerAliasEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resumehandle)).toUInt()
}

public fun NetSessionDel(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetSessionDel", longArrayOf(servername, uncclientname, username)).toUInt()
}

public fun NetSessionEnum(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetSessionEnum", longArrayOf(servername, uncclientname, username, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetSessionGetInfo(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetSessionGetInfo", longArrayOf(servername, uncclientname, username, level.toLong(), bufptr)).toUInt()
}

public fun NetShareAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetShareAdd", longArrayOf(servername, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetShareCheck(servername: PCWSTR, device: PCWSTR, type: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetShareCheck", longArrayOf(servername, device, type)).toUInt()
}

public fun NetShareDel(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetShareDel", longArrayOf(servername, netname, reserved.toLong())).toUInt()
}

public fun NetShareDelEx(servername: PCWSTR, level: UInt, buf: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetShareDelEx", longArrayOf(servername, level.toLong(), buf)).toUInt()
}

public fun NetShareDelSticky(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetShareDelSticky", longArrayOf(servername, netname, reserved.toLong())).toUInt()
}

public fun NetShareEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetShareEnum", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetShareEnumSticky(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetShareEnumSticky", longArrayOf(servername, level.toLong(), bufptr, prefmaxlen.toLong(), entriesread, totalentries, resume_handle)).toUInt()
}

public fun NetShareGetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, bufptr: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetShareGetInfo", longArrayOf(servername, netname, level.toLong(), bufptr)).toUInt()
}

public fun NetShareSetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetShareSetInfo", longArrayOf(servername, netname, level.toLong(), buf, parm_err)).toUInt()
}

public fun NetStatisticsGet(servername: Long, service: Long, level: UInt, options: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetStatisticsGet", longArrayOf(servername, service, level.toLong(), options.toLong(), buffer)).toUInt()
}

public fun OpenEncryptedFileRawA(lpfilename: PCSTR, ulflags: UInt, pvcontext: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenEncryptedFileRawA", longArrayOf(lpfilename, ulflags.toLong(), pvcontext)).toUInt()
}

public fun OpenEncryptedFileRawW(lpfilename: PCWSTR, ulflags: UInt, pvcontext: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenEncryptedFileRawW", longArrayOf(lpfilename, ulflags.toLong(), pvcontext)).toUInt()
}

public fun OpenEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentid: Long): HANDLE {
    return Win32DynamicFfi.invoke("ktmw32.dll", "OpenEnlistment", longArrayOf(dwdesiredaccess.toLong(), resourcemanagerhandle, enlistmentid))
}

public fun OpenFile(lpfilename: PCSTR, lpreopenbuff: Long, ustyle: UInt): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenFile", longArrayOf(lpfilename, lpreopenbuff, ustyle.toLong())).toInt()
}

public fun OpenFileById(hvolumehint: HANDLE, lpfileid: Long, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenFileById", longArrayOf(hvolumehint, lpfileid, dwdesiredaccess.toLong(), dwsharemode.toLong(), lpsecurityattributes, dwflagsandattributes.toLong()))
}

public fun OpenResourceManager(dwdesiredaccess: UInt, tmhandle: HANDLE, resourcemanagerid: Long): HANDLE {
    return Win32DynamicFfi.invoke("ktmw32.dll", "OpenResourceManager", longArrayOf(dwdesiredaccess.toLong(), tmhandle, resourcemanagerid))
}

public fun OpenTransaction(dwdesiredaccess: UInt, transactionid: Long): HANDLE {
    return Win32DynamicFfi.invoke("ktmw32.dll", "OpenTransaction", longArrayOf(dwdesiredaccess.toLong(), transactionid))
}

public fun OpenTransactionManager(logfilename: PCWSTR, desiredaccess: UInt, openoptions: UInt): HANDLE {
    return Win32DynamicFfi.invoke("ktmw32.dll", "OpenTransactionManager", longArrayOf(logfilename, desiredaccess.toLong(), openoptions.toLong()))
}

public fun OpenTransactionManagerById(transactionmanagerid: Long, desiredaccess: UInt, openoptions: UInt): HANDLE {
    return Win32DynamicFfi.invoke("ktmw32.dll", "OpenTransactionManagerById", longArrayOf(transactionmanagerid, desiredaccess.toLong(), openoptions.toLong()))
}

public fun PopIoRingCompletion(ioring: HIORING, cqe: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "PopIoRingCompletion", longArrayOf(ioring, cqe)).toInt()
}

public fun PrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "PrePrepareComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun PrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "PrePrepareEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun PrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "PrepareComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun PrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "PrepareEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun PrepareLogArchive(hlog: HANDLE, pszbaselogfilename: PWSTR, clen: UInt, plsnlow: Long, plsnhigh: Long, pcactuallength: Long, poffbaselogfiledata: Long, pcbbaselogfilelength: Long, plsnbase: Long, plsnlast: Long, plsncurrentarchivetail: Long, ppvarchivecontext: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "PrepareLogArchive", longArrayOf(hlog, pszbaselogfilename, clen.toLong(), plsnlow, plsnhigh, pcactuallength, poffbaselogfiledata, pcbbaselogfilelength, plsnbase, plsnlast, plsncurrentarchivetail, ppvarchivecontext)).toInt()
}

public fun PrepareTape(hdevice: HANDLE, dwoperation: PREPARE_TAPE_OPERATION, bimmediate: BOOL): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "PrepareTape", longArrayOf(hdevice, dwoperation.toLong(), bimmediate.toLong())).toUInt()
}

public fun QueryDosDeviceA(lpdevicename: PCSTR, lptargetpath: PSTR, ucchmax: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryDosDeviceA", longArrayOf(lpdevicename, lptargetpath, ucchmax.toLong())).toUInt()
}

public fun QueryDosDeviceW(lpdevicename: PCWSTR, lptargetpath: PWSTR, ucchmax: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryDosDeviceW", longArrayOf(lpdevicename, lptargetpath, ucchmax.toLong())).toUInt()
}

public fun QueryIoRingCapabilities(capabilities: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "QueryIoRingCapabilities", longArrayOf(capabilities)).toInt()
}

public fun QueryLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE, ppolicybuffer: Long, pcbpolicybuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "QueryLogPolicy", longArrayOf(hlog, epolicytype.toLong(), ppolicybuffer, pcbpolicybuffer)).toInt()
}

public fun QueryRecoveryAgentsOnEncryptedFile(lpfilename: PCWSTR, precoveryagents: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryRecoveryAgentsOnEncryptedFile", longArrayOf(lpfilename, precoveryagents)).toUInt()
}

public fun QueryUsersOnEncryptedFile(lpfilename: PCWSTR, pusers: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryUsersOnEncryptedFile", longArrayOf(lpfilename, pusers)).toUInt()
}

public fun ReOpenFile(horiginalfile: HANDLE, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReOpenFile", longArrayOf(horiginalfile, dwdesiredaccess.toLong(), dwsharemode.toLong(), dwflagsandattributes.toLong()))
}

public fun ReadDirectoryChangesExW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE, readdirectorynotifyinformationclass: READ_DIRECTORY_NOTIFY_INFORMATION_CLASS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadDirectoryChangesExW", longArrayOf(hdirectory, lpbuffer, nbufferlength.toLong(), bwatchsubtree.toLong(), dwnotifyfilter.toLong(), lpbytesreturned, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine), readdirectorynotifyinformationclass.toLong())).toInt()
}

public fun ReadDirectoryChangesW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadDirectoryChangesW", longArrayOf(hdirectory, lpbuffer, nbufferlength.toLong(), bwatchsubtree.toLong(), dwnotifyfilter.toLong(), lpbytesreturned, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine))).toInt()
}

public fun ReadEncryptedFileRaw(pfexportcallback: PFE_EXPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "ReadEncryptedFileRaw", longArrayOf(Win32DynamicFfi.objectSlot(pfexportcallback), pvcallbackcontext, pvcontext)).toUInt()
}

public fun ReadFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadFile", longArrayOf(hfile, lpbuffer, nnumberofbytestoread.toLong(), lpnumberofbytesread, lpoverlapped)).toInt()
}

public fun ReadFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadFileEx", longArrayOf(hfile, lpbuffer, nnumberofbytestoread.toLong(), lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine))).toInt()
}

public fun ReadFileScatter(hfile: HANDLE, asegmentarray: Long, nnumberofbytestoread: UInt, lpreserved: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadFileScatter", longArrayOf(hfile, asegmentarray, nnumberofbytestoread.toLong(), lpreserved, lpoverlapped)).toInt()
}

public fun ReadLogArchiveMetadata(pvarchivecontext: Long, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: Long, pcbbytesread: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "ReadLogArchiveMetadata", longArrayOf(pvarchivecontext, cboffset.toLong(), cbbytestoread.toLong(), pbreadbuffer, pcbbytesread)).toInt()
}

public fun ReadLogNotification(hlog: HANDLE, pnotification: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "ReadLogNotification", longArrayOf(hlog, pnotification, lpoverlapped)).toInt()
}

public fun ReadLogRecord(pvmarshal: Long, plsnfirst: Long, econtextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "ReadLogRecord", longArrayOf(pvmarshal, plsnfirst, econtextmode.toLong(), ppvreadbuffer, pcbreadbuffer, perecordtype, plsnundonext, plsnprevious, ppvreadcontext, poverlapped)).toInt()
}

public fun ReadLogRestartArea(pvmarshal: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvcontext: Long, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "ReadLogRestartArea", longArrayOf(pvmarshal, ppvrestartbuffer, pcbrestartbuffer, plsn, ppvcontext, poverlapped)).toInt()
}

public fun ReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "ReadNextLogRecord", longArrayOf(pvreadcontext, ppvbuffer, pcbbuffer, perecordtype, plsnuser, plsnundonext, plsnprevious, plsnrecord, poverlapped)).toInt()
}

public fun ReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "ReadOnlyEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ReadPreviousLogRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "ReadPreviousLogRestartArea", longArrayOf(pvreadcontext, ppvrestartbuffer, pcbrestartbuffer, plsnrestart, poverlapped)).toInt()
}

public fun RecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "RecoverEnlistment", longArrayOf(enlistmenthandle, enlistmentkey)).toInt()
}

public fun RecoverResourceManager(resourcemanagerhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "RecoverResourceManager", longArrayOf(resourcemanagerhandle)).toInt()
}

public fun RecoverTransactionManager(transactionmanagerhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "RecoverTransactionManager", longArrayOf(transactionmanagerhandle)).toInt()
}

public fun RegisterForLogWriteNotification(hlog: HANDLE, cbthreshold: UInt, fenable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "RegisterForLogWriteNotification", longArrayOf(hlog, cbthreshold.toLong(), fenable.toLong())).toInt()
}

public fun RegisterManageableLogClient(hlog: HANDLE, pcallbacks: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "RegisterManageableLogClient", longArrayOf(hlog, pcallbacks)).toInt()
}

public fun RemoveDirectoryA(lppathname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RemoveDirectoryA", longArrayOf(lppathname)).toInt()
}

public fun RemoveDirectoryFromAppW(lppathname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "RemoveDirectoryFromAppW", longArrayOf(lppathname)).toInt()
}

public fun RemoveDirectoryTransactedA(lppathname: PCSTR, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RemoveDirectoryTransactedA", longArrayOf(lppathname, htransaction)).toInt()
}

public fun RemoveDirectoryTransactedW(lppathname: PCWSTR, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RemoveDirectoryTransactedW", longArrayOf(lppathname, htransaction)).toInt()
}

public fun RemoveDirectoryW(lppathname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RemoveDirectoryW", longArrayOf(lppathname)).toInt()
}

public fun RemoveLogContainer(hlog: HANDLE, pwszcontainerpath: PCWSTR, fforce: BOOL, preserved: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "RemoveLogContainer", longArrayOf(hlog, pwszcontainerpath, fforce.toLong(), preserved)).toInt()
}

public fun RemoveLogContainerSet(hlog: HANDLE, ccontainer: UShort, rgwszcontainerpath: Long, fforce: BOOL, preserved: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "RemoveLogContainerSet", longArrayOf(hlog, ccontainer.toLong(), rgwszcontainerpath, fforce.toLong(), preserved)).toInt()
}

public fun RemoveLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "RemoveLogPolicy", longArrayOf(hlog, epolicytype.toLong())).toInt()
}

public fun RemoveUsersFromEncryptedFile(lpfilename: PCWSTR, phashes: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "RemoveUsersFromEncryptedFile", longArrayOf(lpfilename, phashes)).toUInt()
}

public fun RenameTransactionManager(logfilename: PCWSTR, existingtransactionmanagerguid: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "RenameTransactionManager", longArrayOf(logfilename, existingtransactionmanagerguid)).toInt()
}

public fun ReplaceFileA(lpreplacedfilename: PCSTR, lpreplacementfilename: PCSTR, lpbackupfilename: PCSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReplaceFileA", longArrayOf(lpreplacedfilename, lpreplacementfilename, lpbackupfilename, dwreplaceflags.toLong(), lpexclude, lpreserved)).toInt()
}

public fun ReplaceFileFromAppW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: UInt, lpexclude: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "ReplaceFileFromAppW", longArrayOf(lpreplacedfilename, lpreplacementfilename, lpbackupfilename, dwreplaceflags.toLong(), lpexclude, lpreserved)).toInt()
}

public fun ReplaceFileW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReplaceFileW", longArrayOf(lpreplacedfilename, lpreplacementfilename, lpbackupfilename, dwreplaceflags.toLong(), lpexclude, lpreserved)).toInt()
}

public fun ReserveAndAppendLog(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "ReserveAndAppendLog", longArrayOf(pvmarshal, rgwriteentries, cwriteentries.toLong(), plsnundonext, plsnprevious, creserverecords.toLong(), rgcbreservation, fflags.toLong(), plsn, poverlapped)).toInt()
}

public fun ReserveAndAppendLogAligned(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "ReserveAndAppendLogAligned", longArrayOf(pvmarshal, rgwriteentries, cwriteentries.toLong(), cbentryalignment.toLong(), plsnundonext, plsnprevious, creserverecords.toLong(), rgcbreservation, fflags.toLong(), plsn, poverlapped)).toInt()
}

public fun RollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "RollbackComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun RollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "RollbackEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun RollbackTransaction(transactionhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "RollbackTransaction", longArrayOf(transactionhandle)).toInt()
}

public fun RollbackTransactionAsync(transactionhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "RollbackTransactionAsync", longArrayOf(transactionhandle)).toInt()
}

public fun RollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "RollforwardTransactionManager", longArrayOf(transactionmanagerhandle, tmvirtualclock)).toInt()
}

public fun ScanLogContainers(pcxscan: Long, escanmode: UByte, preserved: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "ScanLogContainers", longArrayOf(pcxscan, escanmode.toLong(), preserved)).toInt()
}

public fun SearchPathA(lppath: PCSTR, lpfilename: PCSTR, lpextension: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SearchPathA", longArrayOf(lppath, lpfilename, lpextension, nbufferlength.toLong(), lpbuffer, lpfilepart)).toUInt()
}

public fun SearchPathW(lppath: PCWSTR, lpfilename: PCWSTR, lpextension: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SearchPathW", longArrayOf(lppath, lpfilename, lpextension, nbufferlength.toLong(), lpbuffer, lpfilepart)).toUInt()
}

public fun SetEncryptedFileMetadata(lpfilename: PCWSTR, pboldmetadata: Long, pbnewmetadata: Long, pownerhash: Long, dwoperation: UInt, pcertificatesadded: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetEncryptedFileMetadata", longArrayOf(lpfilename, pboldmetadata, pbnewmetadata, pownerhash, dwoperation.toLong(), pcertificatesadded)).toUInt()
}

public fun SetEndOfFile(hfile: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetEndOfFile", longArrayOf(hfile)).toInt()
}

public fun SetEndOfLog(hlog: HANDLE, plsnend: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "SetEndOfLog", longArrayOf(hlog, plsnend, lpoverlapped)).toInt()
}

public fun SetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "SetEnlistmentRecoveryInformation", longArrayOf(enlistmenthandle, buffersize.toLong(), buffer)).toInt()
}

public fun SetFileApisToANSI() {
    Win32DynamicFfi.invoke("kernel32.dll", "SetFileApisToANSI", longArrayOf())
}

public fun SetFileApisToOEM() {
    Win32DynamicFfi.invoke("kernel32.dll", "SetFileApisToOEM", longArrayOf())
}

public fun SetFileAttributesA(lpfilename: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileAttributesA", longArrayOf(lpfilename, dwfileattributes.toLong())).toInt()
}

public fun SetFileAttributesFromAppW(lpfilename: PCWSTR, dwfileattributes: UInt): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-file-fromapp-l1-1-0.dll", "SetFileAttributesFromAppW", longArrayOf(lpfilename, dwfileattributes.toLong())).toInt()
}

public fun SetFileAttributesTransactedA(lpfilename: PCSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileAttributesTransactedA", longArrayOf(lpfilename, dwfileattributes.toLong(), htransaction)).toInt()
}

public fun SetFileAttributesTransactedW(lpfilename: PCWSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileAttributesTransactedW", longArrayOf(lpfilename, dwfileattributes.toLong(), htransaction)).toInt()
}

public fun SetFileAttributesW(lpfilename: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileAttributesW", longArrayOf(lpfilename, dwfileattributes.toLong())).toInt()
}

public fun SetFileBandwidthReservation(hfile: HANDLE, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: BOOL, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileBandwidthReservation", longArrayOf(hfile, nperiodmilliseconds.toLong(), nbytesperperiod.toLong(), bdiscardable.toLong(), lptransfersize, lpnumoutstandingrequests)).toInt()
}

public fun SetFileCompletionNotificationModes(filehandle: HANDLE, flags: UByte): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileCompletionNotificationModes", longArrayOf(filehandle, flags.toLong())).toInt()
}

public fun SetFileInformationByHandle(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileInformationByHandle", longArrayOf(hfile, fileinformationclass.toLong(), lpfileinformation, dwbuffersize.toLong())).toInt()
}

public fun SetFileIoOverlappedRange(filehandle: HANDLE, overlappedrangestart: Long, length: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileIoOverlappedRange", longArrayOf(filehandle, overlappedrangestart, length.toLong())).toInt()
}

public fun SetFilePointer(hfile: HANDLE, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFilePointer", longArrayOf(hfile, ldistancetomove.toLong(), lpdistancetomovehigh, dwmovemethod.toLong())).toUInt()
}

public fun SetFilePointerEx(hfile: HANDLE, lidistancetomove: Long, lpnewfilepointer: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFilePointerEx", longArrayOf(hfile, lidistancetomove, lpnewfilepointer, dwmovemethod.toLong())).toInt()
}

public fun SetFileShortNameA(hfile: HANDLE, lpshortname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileShortNameA", longArrayOf(hfile, lpshortname)).toInt()
}

public fun SetFileShortNameW(hfile: HANDLE, lpshortname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileShortNameW", longArrayOf(hfile, lpshortname)).toInt()
}

public fun SetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileTime", longArrayOf(hfile, lpcreationtime, lplastaccesstime, lplastwritetime)).toInt()
}

public fun SetFileValidData(hfile: HANDLE, validdatalength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFileValidData", longArrayOf(hfile, validdatalength)).toInt()
}

public fun SetIoRingCompletionEvent(ioring: HIORING, hevent: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "SetIoRingCompletionEvent", longArrayOf(ioring, hevent)).toInt()
}

public fun SetLogArchiveMode(hlog: HANDLE, emode: CLFS_LOG_ARCHIVE_MODE): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "SetLogArchiveMode", longArrayOf(hlog, emode.toLong())).toInt()
}

public fun SetLogArchiveTail(hlog: HANDLE, plsnarchivetail: Long, preserved: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "SetLogArchiveTail", longArrayOf(hlog, plsnarchivetail, preserved)).toInt()
}

public fun SetLogFileSizeWithPolicy(hlog: HANDLE, pdesiredsize: Long, presultingsize: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "SetLogFileSizeWithPolicy", longArrayOf(hlog, pdesiredsize, presultingsize)).toInt()
}

public fun SetResourceManagerCompletionPort(resourcemanagerhandle: HANDLE, iocompletionporthandle: HANDLE, completionkey: ULong): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "SetResourceManagerCompletionPort", longArrayOf(resourcemanagerhandle, iocompletionporthandle, completionkey.toLong())).toInt()
}

public fun SetSearchPathMode(flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetSearchPathMode", longArrayOf(flags.toLong())).toInt()
}

public fun SetTapeParameters(hdevice: HANDLE, dwoperation: TAPE_INFORMATION_TYPE, lptapeinformation: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetTapeParameters", longArrayOf(hdevice, dwoperation.toLong(), lptapeinformation)).toUInt()
}

public fun SetTapePosition(hdevice: HANDLE, dwpositionmethod: TAPE_POSITION_METHOD, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: BOOL): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetTapePosition", longArrayOf(hdevice, dwpositionmethod.toLong(), dwpartition.toLong(), dwoffsetlow.toLong(), dwoffsethigh.toLong(), bimmediate.toLong())).toUInt()
}

public fun SetTransactionInformation(transactionhandle: HANDLE, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "SetTransactionInformation", longArrayOf(transactionhandle, isolationlevel.toLong(), isolationflags.toLong(), timeout.toLong(), description)).toInt()
}

public fun SetUserFileEncryptionKey(pencryptioncertificate: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetUserFileEncryptionKey", longArrayOf(pencryptioncertificate)).toUInt()
}

public fun SetUserFileEncryptionKeyEx(pencryptioncertificate: Long, dwcapabilities: UInt, dwflags: UInt, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetUserFileEncryptionKeyEx", longArrayOf(pencryptioncertificate, dwcapabilities.toLong(), dwflags.toLong(), pvreserved)).toUInt()
}

public fun SetVolumeLabelA(lprootpathname: PCSTR, lpvolumename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetVolumeLabelA", longArrayOf(lprootpathname, lpvolumename)).toInt()
}

public fun SetVolumeLabelW(lprootpathname: PCWSTR, lpvolumename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetVolumeLabelW", longArrayOf(lprootpathname, lpvolumename)).toInt()
}

public fun SetVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetVolumeMountPointA", longArrayOf(lpszvolumemountpoint, lpszvolumename)).toInt()
}

public fun SetVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetVolumeMountPointW", longArrayOf(lpszvolumemountpoint, lpszvolumename)).toInt()
}

public fun SinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("ktmw32.dll", "SinglePhaseReject", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun SubmitIoRing(ioring: HIORING, waitoperations: UInt, milliseconds: UInt, submittedentries: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-ioring-l1-1-0.dll", "SubmitIoRing", longArrayOf(ioring, waitoperations.toLong(), milliseconds.toLong(), submittedentries)).toInt()
}

public fun TerminateLogArchive(pvarchivecontext: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "TerminateLogArchive", longArrayOf(pvarchivecontext)).toInt()
}

public fun TerminateReadLog(pvcursorcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "TerminateReadLog", longArrayOf(pvcursorcontext)).toInt()
}

public fun TruncateLog(pvmarshal: Long, plsnend: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "TruncateLog", longArrayOf(pvmarshal, plsnend, lpoverlapped)).toInt()
}

public fun TxfGetThreadMiniVersionForCreate(miniversion: Long) {
    Win32DynamicFfi.invoke("txfw32.dll", "TxfGetThreadMiniVersionForCreate", longArrayOf(miniversion))
}

public fun TxfLogCreateFileReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, txffileid: Long, txflogcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("txfw32.dll", "TxfLogCreateFileReadContext", longArrayOf(logpath, beginninglsn.Internal.toLong(), endinglsn.Internal.toLong(), txffileid, txflogcontext)).toInt()
}

public fun TxfLogCreateRangeReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, beginningvirtualclock: Long, endingvirtualclock: Long, recordtypemask: UInt, txflogcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("txfw32.dll", "TxfLogCreateRangeReadContext", longArrayOf(logpath, beginninglsn.Internal.toLong(), endinglsn.Internal.toLong(), beginningvirtualclock, endingvirtualclock, recordtypemask.toLong(), txflogcontext)).toInt()
}

public fun TxfLogDestroyReadContext(txflogcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("txfw32.dll", "TxfLogDestroyReadContext", longArrayOf(txflogcontext)).toInt()
}

public fun TxfLogReadRecords(txflogcontext: Long, bufferlength: UInt, buffer: Long, bytesused: Long, recordcount: Long): BOOL {
    return Win32DynamicFfi.invoke("txfw32.dll", "TxfLogReadRecords", longArrayOf(txflogcontext, bufferlength.toLong(), buffer, bytesused, recordcount)).toInt()
}

public fun TxfLogRecordGetFileName(recordbuffer: Long, recordbufferlengthinbytes: UInt, namebuffer: PWSTR, namebufferlengthinbytes: Long, txfid: Long): BOOL {
    return Win32DynamicFfi.invoke("txfw32.dll", "TxfLogRecordGetFileName", longArrayOf(recordbuffer, recordbufferlengthinbytes.toLong(), namebuffer, namebufferlengthinbytes, txfid)).toInt()
}

public fun TxfLogRecordGetGenericType(recordbuffer: Long, recordbufferlengthinbytes: UInt, generictype: Long, virtualclock: Long): BOOL {
    return Win32DynamicFfi.invoke("txfw32.dll", "TxfLogRecordGetGenericType", longArrayOf(recordbuffer, recordbufferlengthinbytes.toLong(), generictype, virtualclock)).toInt()
}

public fun TxfReadMetadataInfo(filehandle: HANDLE, txffileid: Long, lastlsn: Long, transactionstate: Long, lockingtransaction: Long): BOOL {
    return Win32DynamicFfi.invoke("txfw32.dll", "TxfReadMetadataInfo", longArrayOf(filehandle, txffileid, lastlsn, transactionstate, lockingtransaction)).toInt()
}

public fun TxfSetThreadMiniVersionForCreate(miniversion: UShort) {
    Win32DynamicFfi.invoke("txfw32.dll", "TxfSetThreadMiniVersionForCreate", longArrayOf(miniversion.toLong()))
}

public fun UnlockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnlockFile", longArrayOf(hfile, dwfileoffsetlow.toLong(), dwfileoffsethigh.toLong(), nnumberofbytestounlocklow.toLong(), nnumberofbytestounlockhigh.toLong())).toInt()
}

public fun UnlockFileEx(hfile: HANDLE, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnlockFileEx", longArrayOf(hfile, dwreserved.toLong(), nnumberofbytestounlocklow.toLong(), nnumberofbytestounlockhigh.toLong(), lpoverlapped)).toInt()
}

public fun ValidateLog(pszlogfilename: PCWSTR, psalogfile: Long, pinfobuffer: Long, pcbbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "ValidateLog", longArrayOf(pszlogfilename, psalogfile, pinfobuffer, pcbbuffer)).toInt()
}

public fun VerFindFileA(uflags: VER_FIND_FILE_FLAGS, szfilename: PCSTR, szwindir: PCSTR, szappdir: PCSTR, szcurdir: PSTR, pucurdirlen: Long, szdestdir: PSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS {
    return Win32DynamicFfi.invoke("version.dll", "VerFindFileA", longArrayOf(uflags.toLong(), szfilename, szwindir, szappdir, szcurdir, pucurdirlen, szdestdir, pudestdirlen)).toUInt()
}

public fun VerFindFileW(uflags: VER_FIND_FILE_FLAGS, szfilename: PCWSTR, szwindir: PCWSTR, szappdir: PCWSTR, szcurdir: PWSTR, pucurdirlen: Long, szdestdir: PWSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS {
    return Win32DynamicFfi.invoke("version.dll", "VerFindFileW", longArrayOf(uflags.toLong(), szfilename, szwindir, szappdir, szcurdir, pucurdirlen, szdestdir, pudestdirlen)).toUInt()
}

public fun VerInstallFileA(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCSTR, szdestfilename: PCSTR, szsrcdir: PCSTR, szdestdir: PCSTR, szcurdir: PCSTR, sztmpfile: PSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS {
    return Win32DynamicFfi.invoke("version.dll", "VerInstallFileA", longArrayOf(uflags.toLong(), szsrcfilename, szdestfilename, szsrcdir, szdestdir, szcurdir, sztmpfile, putmpfilelen)).toUInt()
}

public fun VerInstallFileW(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCWSTR, szdestfilename: PCWSTR, szsrcdir: PCWSTR, szdestdir: PCWSTR, szcurdir: PCWSTR, sztmpfile: PWSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS {
    return Win32DynamicFfi.invoke("version.dll", "VerInstallFileW", longArrayOf(uflags.toLong(), szsrcfilename, szdestfilename, szsrcdir, szdestdir, szcurdir, sztmpfile, putmpfilelen)).toUInt()
}

public fun VerLanguageNameA(wlang: UInt, szlang: PSTR, cchlang: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "VerLanguageNameA", longArrayOf(wlang.toLong(), szlang, cchlang.toLong())).toUInt()
}

public fun VerLanguageNameW(wlang: UInt, szlang: PWSTR, cchlang: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "VerLanguageNameW", longArrayOf(wlang.toLong(), szlang, cchlang.toLong())).toUInt()
}

public fun VerQueryValueA(pblock: Long, lpsubblock: PCSTR, lplpbuffer: Long, pulen: Long): BOOL {
    return Win32DynamicFfi.invoke("version.dll", "VerQueryValueA", longArrayOf(pblock, lpsubblock, lplpbuffer, pulen)).toInt()
}

public fun VerQueryValueW(pblock: Long, lpsubblock: PCWSTR, lplpbuffer: Long, pulen: Long): BOOL {
    return Win32DynamicFfi.invoke("version.dll", "VerQueryValueW", longArrayOf(pblock, lpsubblock, lplpbuffer, pulen)).toInt()
}

public fun WofEnumEntries(volumename: PCWSTR, provider: UInt, enumproc: WofEnumEntryProc, userdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofEnumEntries", longArrayOf(volumename, provider.toLong(), Win32DynamicFfi.objectSlot(enumproc), userdata)).toInt()
}

public fun WofFileEnumFiles(volumename: PCWSTR, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofFileEnumFiles", longArrayOf(volumename, algorithm.toLong(), Win32DynamicFfi.objectSlot(enumproc), userdata)).toInt()
}

public fun WofGetDriverVersion(fileorvolumehandle: HANDLE, provider: UInt, wofversion: Long): HRESULT {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofGetDriverVersion", longArrayOf(fileorvolumehandle, provider.toLong(), wofversion)).toInt()
}

public fun WofIsExternalFile(filepath: PCWSTR, isexternalfile: Long, provider: Long, externalfileinfo: Long, bufferlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofIsExternalFile", longArrayOf(filepath, isexternalfile, provider, externalfileinfo, bufferlength)).toInt()
}

public fun WofSetFileDataLocation(filehandle: HANDLE, provider: UInt, externalfileinfo: Long, length: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofSetFileDataLocation", longArrayOf(filehandle, provider.toLong(), externalfileinfo, length.toLong())).toInt()
}

public fun WofShouldCompressBinaries(volume: PCWSTR, algorithm: Long): BOOL {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofShouldCompressBinaries", longArrayOf(volume, algorithm)).toInt()
}

public fun WofWimAddEntry(volumename: PCWSTR, wimpath: PCWSTR, wimtype: UInt, wimindex: UInt, datasourceid: Long): HRESULT {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofWimAddEntry", longArrayOf(volumename, wimpath, wimtype.toLong(), wimindex.toLong(), datasourceid)).toInt()
}

public fun WofWimEnumFiles(volumename: PCWSTR, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofWimEnumFiles", longArrayOf(volumename, datasourceid, Win32DynamicFfi.objectSlot(enumproc), userdata)).toInt()
}

public fun WofWimRemoveEntry(volumename: PCWSTR, datasourceid: Long): HRESULT {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofWimRemoveEntry", longArrayOf(volumename, datasourceid)).toInt()
}

public fun WofWimSuspendEntry(volumename: PCWSTR, datasourceid: Long): HRESULT {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofWimSuspendEntry", longArrayOf(volumename, datasourceid)).toInt()
}

public fun WofWimUpdateEntry(volumename: PCWSTR, datasourceid: Long, newwimpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("wofutil.dll", "WofWimUpdateEntry", longArrayOf(volumename, datasourceid, newwimpath)).toInt()
}

public fun Wow64DisableWow64FsRedirection(oldvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Wow64DisableWow64FsRedirection", longArrayOf(oldvalue)).toInt()
}

public fun Wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "Wow64EnableWow64FsRedirection", longArrayOf(if (wow64fsenableredirection) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun Wow64RevertWow64FsRedirection(olvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Wow64RevertWow64FsRedirection", longArrayOf(olvalue)).toInt()
}

public fun WriteEncryptedFileRaw(pfimportcallback: PFE_IMPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "WriteEncryptedFileRaw", longArrayOf(Win32DynamicFfi.objectSlot(pfimportcallback), pvcallbackcontext, pvcontext)).toUInt()
}

public fun WriteFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteFile", longArrayOf(hfile, lpbuffer, nnumberofbytestowrite.toLong(), lpnumberofbyteswritten, lpoverlapped)).toInt()
}

public fun WriteFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteFileEx", longArrayOf(hfile, lpbuffer, nnumberofbytestowrite.toLong(), lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine))).toInt()
}

public fun WriteFileGather(hfile: HANDLE, asegmentarray: Long, nnumberofbytestowrite: UInt, lpreserved: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteFileGather", longArrayOf(hfile, asegmentarray, nnumberofbytestowrite.toLong(), lpreserved, lpoverlapped)).toInt()
}

public fun WriteLogRestartArea(pvmarshal: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: CLFS_FLAG, pcbwritten: Long, plsnnext: Long, poverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("clfsw32.dll", "WriteLogRestartArea", longArrayOf(pvmarshal, pvrestartbuffer, cbrestartbuffer.toLong(), plsnbase, fflags.toLong(), pcbwritten, plsnnext, poverlapped)).toInt()
}

public fun WriteTapemark(hdevice: HANDLE, dwtapemarktype: TAPEMARK_TYPE, dwtapemarkcount: UInt, bimmediate: BOOL): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteTapemark", longArrayOf(hdevice, dwtapemarktype.toLong(), dwtapemarkcount.toLong(), bimmediate.toLong())).toUInt()
}
