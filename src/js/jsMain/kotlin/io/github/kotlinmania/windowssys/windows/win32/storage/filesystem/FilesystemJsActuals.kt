@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.io.LPOVERLAPPED_COMPLETION_ROUTINE

private val _windowsWin32StorageFilesystemNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AddLogContainer(hlog: HANDLE, pcbcontainer: Long, pwszcontainerpath: PCWSTR, preserved: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_AddLogContainer(hlog.toString(), pcbcontainer.toString(), pwszcontainerpath.toString(), preserved.toString()) as Int) else 0

public actual fun AddLogContainerSet(hlog: HANDLE, ccontainer: UShort, pcbcontainer: Long, rgwszcontainerpath: Long, preserved: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_AddLogContainerSet(hlog.toString(), ccontainer.toInt(), pcbcontainer.toString(), rgwszcontainerpath.toString(), preserved.toString()) as Int) else 0

public actual fun AddUsersToEncryptedFile(lpfilename: PCWSTR, pencryptioncertificates: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_AddUsersToEncryptedFile(lpfilename.toString(), pencryptioncertificates.toString()) as Int).toUInt() else 0u

public actual fun AdvanceLogBase(pvmarshal: Long, plsnbase: Long, fflags: UInt, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_AdvanceLogBase(pvmarshal.toString(), plsnbase.toString(), fflags.toInt(), poverlapped.toString()) as Int) else 0

public actual fun AlignReservedLog(pvmarshal: Long, creservedrecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_AlignReservedLog(pvmarshal.toString(), creservedrecords.toInt(), rgcbreservation.toString(), pcbalignreservation.toString()) as Int) else 0

public actual fun AllocReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_AllocReservedLog(pvmarshal.toString(), creservedrecords.toInt(), pcbadjustment.toString()) as Int) else 0

public actual fun AreFileApisANSI(): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_AreFileApisANSI() as Int) else 0

public actual fun AreShortNamesEnabled(handle: HANDLE, enabled: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_AreShortNamesEnabled(handle.toString(), enabled.toString()) as Int) else 0

public actual fun BackupRead(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_BackupRead(hfile.toString(), lpbuffer.toString(), nnumberofbytestoread.toInt(), lpnumberofbytesread.toString(), babort, bprocesssecurity, lpcontext.toString()) as Int) else 0

public actual fun BackupSeek(hfile: HANDLE, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: Long, lpdwhighbyteseeked: Long, lpcontext: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_BackupSeek(hfile.toString(), dwlowbytestoseek.toInt(), dwhighbytestoseek.toInt(), lpdwlowbyteseeked.toString(), lpdwhighbyteseeked.toString(), lpcontext.toString()) as Int) else 0

public actual fun BackupWrite(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_BackupWrite(hfile.toString(), lpbuffer.toString(), nnumberofbytestowrite.toInt(), lpnumberofbyteswritten.toString(), babort, bprocesssecurity, lpcontext.toString()) as Int) else 0

public actual fun BuildIoRingCancelRequest(ioring: HIORING, file: IORING_HANDLE_REF, optocancel: ULong, userdata: ULong): HRESULT =
    0

public actual fun BuildIoRingFlushFile(ioring: HIORING, fileref: IORING_HANDLE_REF, flushmode: FILE_FLUSH_MODE, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun BuildIoRingReadFile(ioring: HIORING, fileref: IORING_HANDLE_REF, dataref: IORING_BUFFER_REF, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun BuildIoRingRegisterBuffers(ioring: HIORING, count: UInt, buffers: Long, userdata: ULong): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_BuildIoRingRegisterBuffers(ioring.toString(), count.toInt(), buffers.toString(), userdata.toString()) as Int) else 0

public actual fun BuildIoRingRegisterFileHandles(ioring: HIORING, count: UInt, handles: Long, userdata: ULong): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_BuildIoRingRegisterFileHandles(ioring.toString(), count.toInt(), handles.toString(), userdata.toString()) as Int) else 0

public actual fun BuildIoRingWriteFile(ioring: HIORING, fileref: IORING_HANDLE_REF, bufferref: IORING_BUFFER_REF, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FILE_WRITE_FLAGS, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun CheckNameLegalDOS8Dot3A(lpname: PCSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CheckNameLegalDOS8Dot3A(lpname.toString(), lpoemname.toString(), oemnamesize.toInt(), pbnamecontainsspaces.toString(), pbnamelegal.toString()) as Int) else 0

public actual fun CheckNameLegalDOS8Dot3W(lpname: PCWSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CheckNameLegalDOS8Dot3W(lpname.toString(), lpoemname.toString(), oemnamesize.toInt(), pbnamecontainsspaces.toString(), pbnamelegal.toString()) as Int) else 0

public actual fun CloseAndResetLogFile(hlog: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CloseAndResetLogFile(hlog.toString()) as Int) else 0

public actual fun CloseEncryptedFileRaw(pvcontext: Long) {
    if (_windowsWin32StorageFilesystemNapiAddon != null) {
        _windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CloseEncryptedFileRaw(pvcontext.toString())
    }
}

public actual fun CloseIoRing(ioring: HIORING): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CloseIoRing(ioring.toString()) as Int) else 0

public actual fun CommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CommitComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun CommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CommitEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun CommitTransaction(transactionhandle: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CommitTransaction(transactionhandle.toString()) as Int) else 0

public actual fun CommitTransactionAsync(transactionhandle: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CommitTransactionAsync(transactionhandle.toString()) as Int) else 0

public actual fun CompareFileTime(lpfiletime1: Long, lpfiletime2: Long): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CompareFileTime(lpfiletime1.toString(), lpfiletime2.toString()) as Int) else 0

public actual fun CopyFile2(pwszexistingfilename: PCWSTR, pwsznewfilename: PCWSTR, pextendedparameters: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CopyFile2(pwszexistingfilename.toString(), pwsznewfilename.toString(), pextendedparameters.toString()) as Int) else 0

public actual fun CopyFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, bfailifexists: BOOL): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CopyFileA(lpexistingfilename.toString(), lpnewfilename.toString(), bfailifexists) as Int) else 0

public actual fun CopyFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CopyFileExA(lpexistingfilename.toString(), lpnewfilename.toString(), lpprogressroutine.toLong().toString(), lpdata.toString(), pbcancel.toString(), dwcopyflags.toInt()) as Int) else 0

public actual fun CopyFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CopyFileExW(lpexistingfilename.toString(), lpnewfilename.toString(), lpprogressroutine.toLong().toString(), lpdata.toString(), pbcancel.toString(), dwcopyflags.toInt()) as Int) else 0

public actual fun CopyFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CopyFileFromAppW(lpexistingfilename.toString(), lpnewfilename.toString(), bfailifexists) as Int) else 0

public actual fun CopyFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CopyFileTransactedA(lpexistingfilename.toString(), lpnewfilename.toString(), lpprogressroutine.toLong().toString(), lpdata.toString(), pbcancel.toString(), dwcopyflags.toInt(), htransaction.toString()) as Int) else 0

public actual fun CopyFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CopyFileTransactedW(lpexistingfilename.toString(), lpnewfilename.toString(), lpprogressroutine.toLong().toString(), lpdata.toString(), pbcancel.toString(), dwcopyflags.toInt(), htransaction.toString()) as Int) else 0

public actual fun CopyFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CopyFileW(lpexistingfilename.toString(), lpnewfilename.toString(), bfailifexists) as Int) else 0

public actual fun CopyLZFile(hfsource: Int, hfdest: Int): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CopyLZFile(hfsource, hfdest) as Int) else 0

public actual fun CreateDirectoryA(lppathname: PCSTR, lpsecurityattributes: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateDirectoryA(lppathname.toString(), lpsecurityattributes.toString()) as Int) else 0

public actual fun CreateDirectoryExA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateDirectoryExA(lptemplatedirectory.toString(), lpnewdirectory.toString(), lpsecurityattributes.toString()) as Int) else 0

public actual fun CreateDirectoryExW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateDirectoryExW(lptemplatedirectory.toString(), lpnewdirectory.toString(), lpsecurityattributes.toString()) as Int) else 0

public actual fun CreateDirectoryFromAppW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateDirectoryFromAppW(lppathname.toString(), lpsecurityattributes.toString()) as Int) else 0

public actual fun CreateDirectoryTransactedA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateDirectoryTransactedA(lptemplatedirectory.toString(), lpnewdirectory.toString(), lpsecurityattributes.toString(), htransaction.toString()) as Int) else 0

public actual fun CreateDirectoryTransactedW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateDirectoryTransactedW(lptemplatedirectory.toString(), lpnewdirectory.toString(), lpsecurityattributes.toString(), htransaction.toString()) as Int) else 0

public actual fun CreateDirectoryW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateDirectoryW(lppathname.toString(), lpsecurityattributes.toString()) as Int) else 0

public actual fun CreateEnlistment(lpenlistmentattributes: Long, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, notificationmask: UInt, createoptions: UInt, enlistmentkey: Long): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateEnlistment(lpenlistmentattributes.toString(), resourcemanagerhandle.toString(), transactionhandle.toString(), notificationmask.toInt(), createoptions.toInt(), enlistmentkey.toString()) as String).toLong() else 0L

public actual fun CreateFile2(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwcreationdisposition: FILE_CREATION_DISPOSITION, pcreateexparams: Long): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateFile2(lpfilename.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), pcreateexparams.toString()) as String).toLong() else 0L

public actual fun CreateFile2FromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: Long): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateFile2FromAppW(lpfilename.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), pcreateexparams.toString()) as String).toLong() else 0L

public actual fun CreateFileA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateFileA(lpfilename.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.toString()) as String).toLong() else 0L

public actual fun CreateFileFromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateFileFromAppW(lpfilename.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.toString()) as String).toLong() else 0L

public actual fun CreateFileTransactedA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateFileTransactedA(lpfilename.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.toString(), htransaction.toString(), pusminiversion.toString(), lpextendedparameter.toString()) as String).toLong() else 0L

public actual fun CreateFileTransactedW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateFileTransactedW(lpfilename.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.toString(), htransaction.toString(), pusminiversion.toString(), lpextendedparameter.toString()) as String).toLong() else 0L

public actual fun CreateFileW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateFileW(lpfilename.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.toString()) as String).toLong() else 0L

public actual fun CreateHardLinkA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateHardLinkA(lpfilename.toString(), lpexistingfilename.toString(), lpsecurityattributes.toString()) as Int) else 0

public actual fun CreateHardLinkTransactedA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateHardLinkTransactedA(lpfilename.toString(), lpexistingfilename.toString(), lpsecurityattributes.toString(), htransaction.toString()) as Int) else 0

public actual fun CreateHardLinkTransactedW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateHardLinkTransactedW(lpfilename.toString(), lpexistingfilename.toString(), lpsecurityattributes.toString(), htransaction.toString()) as Int) else 0

public actual fun CreateHardLinkW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateHardLinkW(lpfilename.toString(), lpexistingfilename.toString(), lpsecurityattributes.toString()) as Int) else 0

public actual fun CreateIoRing(ioringversion: IORING_VERSION, flags: IORING_CREATE_FLAGS, submissionqueuesize: UInt, completionqueuesize: UInt, h: Long): HRESULT =
    0

public actual fun CreateLogContainerScanContext(hlog: HANDLE, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateLogContainerScanContext(hlog.toString(), cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toInt(), pcxscan.toString(), poverlapped.toString()) as Int) else 0

public actual fun CreateLogFile(pszlogfilename: PCWSTR, fdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, psalogfile: Long, fcreatedisposition: FILE_CREATION_DISPOSITION, fflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateLogFile(pszlogfilename.toString(), fdesiredaccess.toInt(), dwsharemode.toInt(), psalogfile.toString(), fcreatedisposition.toInt(), fflagsandattributes.toInt()) as String).toLong() else 0L

public actual fun CreateLogMarshallingArea(hlog: HANDLE, pfnallocbuffer: CLFS_BLOCK_ALLOCATION, pfnfreebuffer: CLFS_BLOCK_DEALLOCATION, pvblockalloccontext: Long, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateLogMarshallingArea(hlog.toString(), pfnallocbuffer.toLong().toString(), pfnfreebuffer.toLong().toString(), pvblockalloccontext.toString(), cbmarshallingbuffer.toInt(), cmaxwritebuffers.toInt(), cmaxreadbuffers.toInt(), ppvmarshal.toString()) as Int) else 0

public actual fun CreateResourceManager(lpresourcemanagerattributes: Long, resourcemanagerid: Long, createoptions: UInt, tmhandle: HANDLE, description: PCWSTR): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateResourceManager(lpresourcemanagerattributes.toString(), resourcemanagerid.toString(), createoptions.toInt(), tmhandle.toString(), description.toString()) as String).toLong() else 0L

public actual fun CreateSymbolicLinkA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkA(lpsymlinkfilename.toString(), lptargetfilename.toString(), dwflags.toInt()) as Boolean) else false

public actual fun CreateSymbolicLinkTransactedA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkTransactedA(lpsymlinkfilename.toString(), lptargetfilename.toString(), dwflags.toInt(), htransaction.toString()) as Boolean) else false

public actual fun CreateSymbolicLinkTransactedW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkTransactedW(lpsymlinkfilename.toString(), lptargetfilename.toString(), dwflags.toInt(), htransaction.toString()) as Boolean) else false

public actual fun CreateSymbolicLinkW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkW(lpsymlinkfilename.toString(), lptargetfilename.toString(), dwflags.toInt()) as Boolean) else false

public actual fun CreateTapePartition(hdevice: HANDLE, dwpartitionmethod: CREATE_TAPE_PARTITION_METHOD, dwcount: UInt, dwsize: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateTapePartition(hdevice.toString(), dwpartitionmethod.toInt(), dwcount.toInt(), dwsize.toInt()) as Int).toUInt() else 0u

public actual fun CreateTransaction(lptransactionattributes: Long, uow: Long, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateTransaction(lptransactionattributes.toString(), uow.toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), description.toString()) as String).toLong() else 0L

public actual fun CreateTransactionManager(lptransactionattributes: Long, logfilename: PCWSTR, createoptions: UInt, commitstrength: UInt): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_CreateTransactionManager(lptransactionattributes.toString(), logfilename.toString(), createoptions.toInt(), commitstrength.toInt()) as String).toLong() else 0L

public actual fun DecryptFileA(lpfilename: PCSTR, dwreserved: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DecryptFileA(lpfilename.toString(), dwreserved.toInt()) as Int) else 0

public actual fun DecryptFileW(lpfilename: PCWSTR, dwreserved: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DecryptFileW(lpfilename.toString(), dwreserved.toInt()) as Int) else 0

public actual fun DefineDosDeviceA(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCSTR, lptargetpath: PCSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DefineDosDeviceA(dwflags.toInt(), lpdevicename.toString(), lptargetpath.toString()) as Int) else 0

public actual fun DefineDosDeviceW(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCWSTR, lptargetpath: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DefineDosDeviceW(dwflags.toInt(), lpdevicename.toString(), lptargetpath.toString()) as Int) else 0

public actual fun DeleteFileA(lpfilename: PCSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeleteFileA(lpfilename.toString()) as Int) else 0

public actual fun DeleteFileFromAppW(lpfilename: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeleteFileFromAppW(lpfilename.toString()) as Int) else 0

public actual fun DeleteFileTransactedA(lpfilename: PCSTR, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeleteFileTransactedA(lpfilename.toString(), htransaction.toString()) as Int) else 0

public actual fun DeleteFileTransactedW(lpfilename: PCWSTR, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeleteFileTransactedW(lpfilename.toString(), htransaction.toString()) as Int) else 0

public actual fun DeleteFileW(lpfilename: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeleteFileW(lpfilename.toString()) as Int) else 0

public actual fun DeleteLogByHandle(hlog: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeleteLogByHandle(hlog.toString()) as Int) else 0

public actual fun DeleteLogFile(pszlogfilename: PCWSTR, pvreserved: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeleteLogFile(pszlogfilename.toString(), pvreserved.toString()) as Int) else 0

public actual fun DeleteLogMarshallingArea(pvmarshal: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeleteLogMarshallingArea(pvmarshal.toString()) as Int) else 0

public actual fun DeleteVolumeMountPointA(lpszvolumemountpoint: PCSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeleteVolumeMountPointA(lpszvolumemountpoint.toString()) as Int) else 0

public actual fun DeleteVolumeMountPointW(lpszvolumemountpoint: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeleteVolumeMountPointW(lpszvolumemountpoint.toString()) as Int) else 0

public actual fun DeregisterManageableLogClient(hlog: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DeregisterManageableLogClient(hlog.toString()) as Int) else 0

public actual fun DuplicateEncryptionInfoFile(srcfilename: PCWSTR, dstfilename: PCWSTR, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_DuplicateEncryptionInfoFile(srcfilename.toString(), dstfilename.toString(), dwcreationdistribution.toInt(), dwattributes.toInt(), lpsecurityattributes.toString()) as Int).toUInt() else 0u

public actual fun EncryptFileA(lpfilename: PCSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_EncryptFileA(lpfilename.toString()) as Int) else 0

public actual fun EncryptFileW(lpfilename: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_EncryptFileW(lpfilename.toString()) as Int) else 0

public actual fun EncryptionDisable(dirpath: PCWSTR, disable: BOOL): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_EncryptionDisable(dirpath.toString(), disable) as Int) else 0

public actual fun EraseTape(hdevice: HANDLE, dwerasetype: ERASE_TAPE_TYPE, bimmediate: BOOL): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_EraseTape(hdevice.toString(), dwerasetype.toInt(), bimmediate) as Int).toUInt() else 0u

public actual fun FileEncryptionStatusA(lpfilename: PCSTR, lpstatus: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FileEncryptionStatusA(lpfilename.toString(), lpstatus.toString()) as Int) else 0

public actual fun FileEncryptionStatusW(lpfilename: PCWSTR, lpstatus: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FileEncryptionStatusW(lpfilename.toString(), lpstatus.toString()) as Int) else 0

public actual fun FileTimeToLocalFileTime(lpfiletime: Long, lplocalfiletime: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FileTimeToLocalFileTime(lpfiletime.toString(), lplocalfiletime.toString()) as Int) else 0

public actual fun FindClose(hfindfile: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindClose(hfindfile.toString()) as Int) else 0

public actual fun FindCloseChangeNotification(hchangehandle: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindCloseChangeNotification(hchangehandle.toString()) as Int) else 0

public actual fun FindFirstChangeNotificationA(lppathname: PCSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstChangeNotificationA(lppathname.toString(), bwatchsubtree, dwnotifyfilter.toInt()) as String).toLong() else 0L

public actual fun FindFirstChangeNotificationW(lppathname: PCWSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstChangeNotificationW(lppathname.toString(), bwatchsubtree, dwnotifyfilter.toInt()) as String).toLong() else 0L

public actual fun FindFirstFileA(lpfilename: PCSTR, lpfindfiledata: Long): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstFileA(lpfilename.toString(), lpfindfiledata.toString()) as String).toLong() else 0L

public actual fun FindFirstFileExA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstFileExA(lpfilename.toString(), finfolevelid, lpfindfiledata.toString(), fsearchop, lpsearchfilter.toString(), dwadditionalflags.toInt()) as String).toLong() else 0L

public actual fun FindFirstFileExFromAppW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstFileExFromAppW(lpfilename.toString(), finfolevelid, lpfindfiledata.toString(), fsearchop, lpsearchfilter.toString(), dwadditionalflags.toInt()) as String).toLong() else 0L

public actual fun FindFirstFileExW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstFileExW(lpfilename.toString(), finfolevelid, lpfindfiledata.toString(), fsearchop, lpsearchfilter.toString(), dwadditionalflags.toInt()) as String).toLong() else 0L

public actual fun FindFirstFileNameTransactedW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR, htransaction: HANDLE): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstFileNameTransactedW(lpfilename.toString(), dwflags.toInt(), stringlength.toString(), linkname.toString(), htransaction.toString()) as String).toLong() else 0L

public actual fun FindFirstFileNameW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstFileNameW(lpfilename.toString(), dwflags.toInt(), stringlength.toString(), linkname.toString()) as String).toLong() else 0L

public actual fun FindFirstFileTransactedA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstFileTransactedA(lpfilename.toString(), finfolevelid, lpfindfiledata.toString(), fsearchop, lpsearchfilter.toString(), dwadditionalflags.toInt(), htransaction.toString()) as String).toLong() else 0L

public actual fun FindFirstFileTransactedW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstFileTransactedW(lpfilename.toString(), finfolevelid, lpfindfiledata.toString(), fsearchop, lpsearchfilter.toString(), dwadditionalflags.toInt(), htransaction.toString()) as String).toLong() else 0L

public actual fun FindFirstFileW(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstFileW(lpfilename.toString(), lpfindfiledata.toString()) as String).toLong() else 0L

public actual fun FindFirstStreamTransactedW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt, htransaction: HANDLE): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstStreamTransactedW(lpfilename.toString(), infolevel, lpfindstreamdata.toString(), dwflags.toInt(), htransaction.toString()) as String).toLong() else 0L

public actual fun FindFirstStreamW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstStreamW(lpfilename.toString(), infolevel, lpfindstreamdata.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun FindFirstVolumeA(lpszvolumename: PSTR, cchbufferlength: UInt): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstVolumeA(lpszvolumename.toString(), cchbufferlength.toInt()) as String).toLong() else 0L

public actual fun FindFirstVolumeMountPointA(lpszrootpathname: PCSTR, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstVolumeMountPointA(lpszrootpathname.toString(), lpszvolumemountpoint.toString(), cchbufferlength.toInt()) as String).toLong() else 0L

public actual fun FindFirstVolumeMountPointW(lpszrootpathname: PCWSTR, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstVolumeMountPointW(lpszrootpathname.toString(), lpszvolumemountpoint.toString(), cchbufferlength.toInt()) as String).toLong() else 0L

public actual fun FindFirstVolumeW(lpszvolumename: PWSTR, cchbufferlength: UInt): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindFirstVolumeW(lpszvolumename.toString(), cchbufferlength.toInt()) as String).toLong() else 0L

public actual fun FindNextChangeNotification(hchangehandle: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindNextChangeNotification(hchangehandle.toString()) as Int) else 0

public actual fun FindNextFileA(hfindfile: HANDLE, lpfindfiledata: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindNextFileA(hfindfile.toString(), lpfindfiledata.toString()) as Int) else 0

public actual fun FindNextFileNameW(hfindstream: HANDLE, stringlength: Long, linkname: PWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindNextFileNameW(hfindstream.toString(), stringlength.toString(), linkname.toString()) as Int) else 0

public actual fun FindNextFileW(hfindfile: HANDLE, lpfindfiledata: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindNextFileW(hfindfile.toString(), lpfindfiledata.toString()) as Int) else 0

public actual fun FindNextStreamW(hfindstream: HANDLE, lpfindstreamdata: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindNextStreamW(hfindstream.toString(), lpfindstreamdata.toString()) as Int) else 0

public actual fun FindNextVolumeA(hfindvolume: HANDLE, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindNextVolumeA(hfindvolume.toString(), lpszvolumename.toString(), cchbufferlength.toInt()) as Int) else 0

public actual fun FindNextVolumeMountPointA(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindNextVolumeMountPointA(hfindvolumemountpoint.toString(), lpszvolumemountpoint.toString(), cchbufferlength.toInt()) as Int) else 0

public actual fun FindNextVolumeMountPointW(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindNextVolumeMountPointW(hfindvolumemountpoint.toString(), lpszvolumemountpoint.toString(), cchbufferlength.toInt()) as Int) else 0

public actual fun FindNextVolumeW(hfindvolume: HANDLE, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindNextVolumeW(hfindvolume.toString(), lpszvolumename.toString(), cchbufferlength.toInt()) as Int) else 0

public actual fun FindVolumeClose(hfindvolume: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindVolumeClose(hfindvolume.toString()) as Int) else 0

public actual fun FindVolumeMountPointClose(hfindvolumemountpoint: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FindVolumeMountPointClose(hfindvolumemountpoint.toString()) as Int) else 0

public actual fun FlushFileBuffers(hfile: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FlushFileBuffers(hfile.toString()) as Int) else 0

public actual fun FlushLogBuffers(pvmarshal: Long, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FlushLogBuffers(pvmarshal.toString(), poverlapped.toString()) as Int) else 0

public actual fun FlushLogToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FlushLogToLsn(pvmarshalcontext.toString(), plsnflush.toString(), plsnlastflushed.toString(), poverlapped.toString()) as Int) else 0

public actual fun FreeEncryptedFileMetadata(pbmetadata: Long) {
    if (_windowsWin32StorageFilesystemNapiAddon != null) {
        _windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FreeEncryptedFileMetadata(pbmetadata.toString())
    }
}

public actual fun FreeEncryptionCertificateHashList(pusers: Long) {
    if (_windowsWin32StorageFilesystemNapiAddon != null) {
        _windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FreeEncryptionCertificateHashList(pusers.toString())
    }
}

public actual fun FreeReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_FreeReservedLog(pvmarshal.toString(), creservedrecords.toInt(), pcbadjustment.toString()) as Int) else 0

public actual fun GetBinaryTypeA(lpapplicationname: PCSTR, lpbinarytype: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetBinaryTypeA(lpapplicationname.toString(), lpbinarytype.toString()) as Int) else 0

public actual fun GetBinaryTypeW(lpapplicationname: PCWSTR, lpbinarytype: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetBinaryTypeW(lpapplicationname.toString(), lpbinarytype.toString()) as Int) else 0

public actual fun GetCompressedFileSizeA(lpfilename: PCSTR, lpfilesizehigh: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeA(lpfilename.toString(), lpfilesizehigh.toString()) as Int).toUInt() else 0u

public actual fun GetCompressedFileSizeTransactedA(lpfilename: PCSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeTransactedA(lpfilename.toString(), lpfilesizehigh.toString(), htransaction.toString()) as Int).toUInt() else 0u

public actual fun GetCompressedFileSizeTransactedW(lpfilename: PCWSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeTransactedW(lpfilename.toString(), lpfilesizehigh.toString(), htransaction.toString()) as Int).toUInt() else 0u

public actual fun GetCompressedFileSizeW(lpfilename: PCWSTR, lpfilesizehigh: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeW(lpfilename.toString(), lpfilesizehigh.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentClockTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetCurrentClockTransactionManager(transactionmanagerhandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun GetDiskFreeSpaceA(lprootpathname: PCSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceA(lprootpathname.toString(), lpsectorspercluster.toString(), lpbytespersector.toString(), lpnumberoffreeclusters.toString(), lptotalnumberofclusters.toString()) as Int) else 0

public actual fun GetDiskFreeSpaceExA(lpdirectoryname: PCSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceExA(lpdirectoryname.toString(), lpfreebytesavailabletocaller.toString(), lptotalnumberofbytes.toString(), lptotalnumberoffreebytes.toString()) as Int) else 0

public actual fun GetDiskFreeSpaceExW(lpdirectoryname: PCWSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceExW(lpdirectoryname.toString(), lpfreebytesavailabletocaller.toString(), lptotalnumberofbytes.toString(), lptotalnumberoffreebytes.toString()) as Int) else 0

public actual fun GetDiskFreeSpaceW(lprootpathname: PCWSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceW(lprootpathname.toString(), lpsectorspercluster.toString(), lpbytespersector.toString(), lpnumberoffreeclusters.toString(), lptotalnumberofclusters.toString()) as Int) else 0

public actual fun GetDiskSpaceInformationA(rootpath: PCSTR, diskspaceinfo: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetDiskSpaceInformationA(rootpath.toString(), diskspaceinfo.toString()) as Int) else 0

public actual fun GetDiskSpaceInformationW(rootpath: PCWSTR, diskspaceinfo: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetDiskSpaceInformationW(rootpath.toString(), diskspaceinfo.toString()) as Int) else 0

public actual fun GetDriveTypeA(lprootpathname: PCSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetDriveTypeA(lprootpathname.toString()) as Int).toUInt() else 0u

public actual fun GetDriveTypeW(lprootpathname: PCWSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetDriveTypeW(lprootpathname.toString()) as Int).toUInt() else 0u

public actual fun GetEncryptedFileMetadata(lpfilename: PCWSTR, pcbmetadata: Long, ppbmetadata: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetEncryptedFileMetadata(lpfilename.toString(), pcbmetadata.toString(), ppbmetadata.toString()) as Int).toUInt() else 0u

public actual fun GetEnlistmentId(enlistmenthandle: HANDLE, enlistmentid: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetEnlistmentId(enlistmenthandle.toString(), enlistmentid.toString()) as Int) else 0

public actual fun GetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long, bufferused: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetEnlistmentRecoveryInformation(enlistmenthandle.toString(), buffersize.toInt(), buffer.toString(), bufferused.toString()) as Int) else 0

public actual fun GetExpandedNameA(lpszsource: PCSTR, lpszbuffer: PSTR): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetExpandedNameA(lpszsource.toString(), lpszbuffer.toString()) as Int) else 0

public actual fun GetExpandedNameW(lpszsource: PCWSTR, lpszbuffer: PWSTR): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetExpandedNameW(lpszsource.toString(), lpszbuffer.toString()) as Int) else 0

public actual fun GetFileAttributesA(lpfilename: PCSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileAttributesA(lpfilename.toString()) as Int).toUInt() else 0u

public actual fun GetFileAttributesExA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileAttributesExA(lpfilename.toString(), finfolevelid, lpfileinformation.toString()) as Int) else 0

public actual fun GetFileAttributesExFromAppW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileAttributesExFromAppW(lpfilename.toString(), finfolevelid, lpfileinformation.toString()) as Int) else 0

public actual fun GetFileAttributesExW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileAttributesExW(lpfilename.toString(), finfolevelid, lpfileinformation.toString()) as Int) else 0

public actual fun GetFileAttributesTransactedA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileAttributesTransactedA(lpfilename.toString(), finfolevelid, lpfileinformation.toString(), htransaction.toString()) as Int) else 0

public actual fun GetFileAttributesTransactedW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileAttributesTransactedW(lpfilename.toString(), finfolevelid, lpfileinformation.toString(), htransaction.toString()) as Int) else 0

public actual fun GetFileAttributesW(lpfilename: PCWSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileAttributesW(lpfilename.toString()) as Int).toUInt() else 0u

public actual fun GetFileBandwidthReservation(hfile: HANDLE, lpperiodmilliseconds: Long, lpbytesperperiod: Long, pdiscardable: Long, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileBandwidthReservation(hfile.toString(), lpperiodmilliseconds.toString(), lpbytesperperiod.toString(), pdiscardable.toString(), lptransfersize.toString(), lpnumoutstandingrequests.toString()) as Int) else 0

public actual fun GetFileInformationByHandle(hfile: HANDLE, lpfileinformation: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileInformationByHandle(hfile.toString(), lpfileinformation.toString()) as Int) else 0

public actual fun GetFileInformationByHandleEx(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileInformationByHandleEx(hfile.toString(), fileinformationclass, lpfileinformation.toString(), dwbuffersize.toInt()) as Int) else 0

public actual fun GetFileSize(hfile: HANDLE, lpfilesizehigh: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileSize(hfile.toString(), lpfilesizehigh.toString()) as Int).toUInt() else 0u

public actual fun GetFileSizeEx(hfile: HANDLE, lpfilesize: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileSizeEx(hfile.toString(), lpfilesize.toString()) as Int) else 0

public actual fun GetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileTime(hfile.toString(), lpcreationtime.toString(), lplastaccesstime.toString(), lplastwritetime.toString()) as Int) else 0

public actual fun GetFileType(hfile: HANDLE): FILE_TYPE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileType(hfile.toString()) as Int).toUInt() else 0u

public actual fun GetFileVersionInfoA(lptstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoA(lptstrfilename.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.toString()) as Int) else 0

public actual fun GetFileVersionInfoExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoExA(dwflags.toInt(), lpwstrfilename.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.toString()) as Int) else 0

public actual fun GetFileVersionInfoExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoExW(dwflags.toInt(), lpwstrfilename.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.toString()) as Int) else 0

public actual fun GetFileVersionInfoSizeA(lptstrfilename: PCSTR, lpdwhandle: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeA(lptstrfilename.toString(), lpdwhandle.toString()) as Int).toUInt() else 0u

public actual fun GetFileVersionInfoSizeExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, lpdwhandle: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeExA(dwflags.toInt(), lpwstrfilename.toString(), lpdwhandle.toString()) as Int).toUInt() else 0u

public actual fun GetFileVersionInfoSizeExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, lpdwhandle: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeExW(dwflags.toInt(), lpwstrfilename.toString(), lpdwhandle.toString()) as Int).toUInt() else 0u

public actual fun GetFileVersionInfoSizeW(lptstrfilename: PCWSTR, lpdwhandle: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeW(lptstrfilename.toString(), lpdwhandle.toString()) as Int).toUInt() else 0u

public actual fun GetFileVersionInfoW(lptstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoW(lptstrfilename.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.toString()) as Int) else 0

public actual fun GetFinalPathNameByHandleA(hfile: HANDLE, lpszfilepath: PSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFinalPathNameByHandleA(hfile.toString(), lpszfilepath.toString(), cchfilepath.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun GetFinalPathNameByHandleW(hfile: HANDLE, lpszfilepath: PWSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFinalPathNameByHandleW(hfile.toString(), lpszfilepath.toString(), cchfilepath.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun GetFullPathNameA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFullPathNameA(lpfilename.toString(), nbufferlength.toInt(), lpbuffer.toString(), lpfilepart.toString()) as Int).toUInt() else 0u

public actual fun GetFullPathNameTransactedA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long, htransaction: HANDLE): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFullPathNameTransactedA(lpfilename.toString(), nbufferlength.toInt(), lpbuffer.toString(), lpfilepart.toString(), htransaction.toString()) as Int).toUInt() else 0u

public actual fun GetFullPathNameTransactedW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long, htransaction: HANDLE): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFullPathNameTransactedW(lpfilename.toString(), nbufferlength.toInt(), lpbuffer.toString(), lpfilepart.toString(), htransaction.toString()) as Int).toUInt() else 0u

public actual fun GetFullPathNameW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetFullPathNameW(lpfilename.toString(), nbufferlength.toInt(), lpbuffer.toString(), lpfilepart.toString()) as Int).toUInt() else 0u

public actual fun GetIoRingInfo(ioring: HIORING, info: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetIoRingInfo(ioring.toString(), info.toString()) as Int) else 0

public actual fun GetLogContainerName(hlog: HANDLE, cidlogicalcontainer: UInt, pwstrcontainername: PCWSTR, clencontainername: UInt, pcactuallencontainername: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLogContainerName(hlog.toString(), cidlogicalcontainer.toInt(), pwstrcontainername.toString(), clencontainername.toInt(), pcactuallencontainername.toString()) as Int) else 0

public actual fun GetLogFileInformation(hlog: HANDLE, pinfobuffer: Long, cbbuffer: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLogFileInformation(hlog.toString(), pinfobuffer.toString(), cbbuffer.toString()) as Int) else 0

public actual fun GetLogIoStatistics(hlog: HANDLE, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLogIoStatistics(hlog.toString(), pvstatsbuffer.toString(), cbstatsbuffer.toInt(), estatsclass, pcbstatswritten.toString()) as Int) else 0

public actual fun GetLogReservationInfo(pvmarshal: Long, pcbrecordnumber: Long, pcbuserreservation: Long, pcbcommitreservation: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLogReservationInfo(pvmarshal.toString(), pcbrecordnumber.toString(), pcbuserreservation.toString(), pcbcommitreservation.toString()) as Int) else 0

public actual fun GetLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLogicalDriveStringsA(nbufferlength.toInt(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun GetLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLogicalDriveStringsW(nbufferlength.toInt(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun GetLogicalDrives(): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLogicalDrives() as Int).toUInt() else 0u

public actual fun GetLongPathNameA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLongPathNameA(lpszshortpath.toString(), lpszlongpath.toString(), cchbuffer.toInt()) as Int).toUInt() else 0u

public actual fun GetLongPathNameTransactedA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt, htransaction: HANDLE): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLongPathNameTransactedA(lpszshortpath.toString(), lpszlongpath.toString(), cchbuffer.toInt(), htransaction.toString()) as Int).toUInt() else 0u

public actual fun GetLongPathNameTransactedW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt, htransaction: HANDLE): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLongPathNameTransactedW(lpszshortpath.toString(), lpszlongpath.toString(), cchbuffer.toInt(), htransaction.toString()) as Int).toUInt() else 0u

public actual fun GetLongPathNameW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetLongPathNameW(lpszshortpath.toString(), lpszlongpath.toString(), cchbuffer.toInt()) as Int).toUInt() else 0u

public actual fun GetNextLogArchiveExtent(pvarchivecontext: Long, rgadextent: Long, cdescriptors: UInt, pcdescriptorsreturned: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetNextLogArchiveExtent(pvarchivecontext.toString(), rgadextent.toString(), cdescriptors.toInt(), pcdescriptorsreturned.toString()) as Int) else 0

public actual fun GetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, dwmilliseconds: UInt, returnlength: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetNotificationResourceManager(resourcemanagerhandle.toString(), transactionnotification.toString(), notificationlength.toInt(), dwmilliseconds.toInt(), returnlength.toString()) as Int) else 0

public actual fun GetNotificationResourceManagerAsync(resourcemanagerhandle: HANDLE, transactionnotification: Long, transactionnotificationlength: UInt, returnlength: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetNotificationResourceManagerAsync(resourcemanagerhandle.toString(), transactionnotification.toString(), transactionnotificationlength.toInt(), returnlength.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun GetShortPathNameA(lpszlongpath: PCSTR, lpszshortpath: PSTR, cchbuffer: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetShortPathNameA(lpszlongpath.toString(), lpszshortpath.toString(), cchbuffer.toInt()) as Int).toUInt() else 0u

public actual fun GetShortPathNameW(lpszlongpath: PCWSTR, lpszshortpath: PWSTR, cchbuffer: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetShortPathNameW(lpszlongpath.toString(), lpszshortpath.toString(), cchbuffer.toInt()) as Int).toUInt() else 0u

public actual fun GetTapeParameters(hdevice: HANDLE, dwoperation: GET_TAPE_DRIVE_PARAMETERS_OPERATION, lpdwsize: Long, lptapeinformation: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTapeParameters(hdevice.toString(), dwoperation.toInt(), lpdwsize.toString(), lptapeinformation.toString()) as Int).toUInt() else 0u

public actual fun GetTapePosition(hdevice: HANDLE, dwpositiontype: TAPE_POSITION_TYPE, lpdwpartition: Long, lpdwoffsetlow: Long, lpdwoffsethigh: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTapePosition(hdevice.toString(), dwpositiontype.toInt(), lpdwpartition.toString(), lpdwoffsetlow.toString(), lpdwoffsethigh.toString()) as Int).toUInt() else 0u

public actual fun GetTapeStatus(hdevice: HANDLE): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTapeStatus(hdevice.toString()) as Int).toUInt() else 0u

public actual fun GetTempFileNameA(lppathname: PCSTR, lpprefixstring: PCSTR, uunique: UInt, lptempfilename: PSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTempFileNameA(lppathname.toString(), lpprefixstring.toString(), uunique.toInt(), lptempfilename.toString()) as Int).toUInt() else 0u

public actual fun GetTempFileNameW(lppathname: PCWSTR, lpprefixstring: PCWSTR, uunique: UInt, lptempfilename: PWSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTempFileNameW(lppathname.toString(), lpprefixstring.toString(), uunique.toInt(), lptempfilename.toString()) as Int).toUInt() else 0u

public actual fun GetTempPath2A(bufferlength: UInt, buffer: PSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTempPath2A(bufferlength.toInt(), buffer.toString()) as Int).toUInt() else 0u

public actual fun GetTempPath2W(bufferlength: UInt, buffer: PWSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTempPath2W(bufferlength.toInt(), buffer.toString()) as Int).toUInt() else 0u

public actual fun GetTempPathA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTempPathA(nbufferlength.toInt(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun GetTempPathW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTempPathW(nbufferlength.toInt(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun GetTransactionId(transactionhandle: HANDLE, transactionid: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTransactionId(transactionhandle.toString(), transactionid.toString()) as Int) else 0

public actual fun GetTransactionInformation(transactionhandle: HANDLE, outcome: Long, isolationlevel: Long, isolationflags: Long, timeout: Long, bufferlength: UInt, description: PWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTransactionInformation(transactionhandle.toString(), outcome.toString(), isolationlevel.toString(), isolationflags.toString(), timeout.toString(), bufferlength.toInt(), description.toString()) as Int) else 0

public actual fun GetTransactionManagerId(transactionmanagerhandle: HANDLE, transactionmanagerid: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetTransactionManagerId(transactionmanagerhandle.toString(), transactionmanagerid.toString()) as Int) else 0

public actual fun GetVolumeInformationA(lprootpathname: PCSTR, lpvolumenamebuffer: PSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PSTR, nfilesystemnamesize: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetVolumeInformationA(lprootpathname.toString(), lpvolumenamebuffer.toString(), nvolumenamesize.toInt(), lpvolumeserialnumber.toString(), lpmaximumcomponentlength.toString(), lpfilesystemflags.toString(), lpfilesystemnamebuffer.toString(), nfilesystemnamesize.toInt()) as Int) else 0

public actual fun GetVolumeInformationByHandleW(hfile: HANDLE, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetVolumeInformationByHandleW(hfile.toString(), lpvolumenamebuffer.toString(), nvolumenamesize.toInt(), lpvolumeserialnumber.toString(), lpmaximumcomponentlength.toString(), lpfilesystemflags.toString(), lpfilesystemnamebuffer.toString(), nfilesystemnamesize.toInt()) as Int) else 0

public actual fun GetVolumeInformationW(lprootpathname: PCWSTR, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetVolumeInformationW(lprootpathname.toString(), lpvolumenamebuffer.toString(), nvolumenamesize.toInt(), lpvolumeserialnumber.toString(), lpmaximumcomponentlength.toString(), lpfilesystemflags.toString(), lpfilesystemnamebuffer.toString(), nfilesystemnamesize.toInt()) as Int) else 0

public actual fun GetVolumeNameForVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetVolumeNameForVolumeMountPointA(lpszvolumemountpoint.toString(), lpszvolumename.toString(), cchbufferlength.toInt()) as Int) else 0

public actual fun GetVolumeNameForVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetVolumeNameForVolumeMountPointW(lpszvolumemountpoint.toString(), lpszvolumename.toString(), cchbufferlength.toInt()) as Int) else 0

public actual fun GetVolumePathNameA(lpszfilename: PCSTR, lpszvolumepathname: PSTR, cchbufferlength: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetVolumePathNameA(lpszfilename.toString(), lpszvolumepathname.toString(), cchbufferlength.toInt()) as Int) else 0

public actual fun GetVolumePathNameW(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetVolumePathNameW(lpszfilename.toString(), lpszvolumepathname.toString(), cchbufferlength.toInt()) as Int) else 0

public actual fun GetVolumePathNamesForVolumeNameA(lpszvolumename: PCSTR, lpszvolumepathnames: PSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetVolumePathNamesForVolumeNameA(lpszvolumename.toString(), lpszvolumepathnames.toString(), cchbufferlength.toInt(), lpcchreturnlength.toString()) as Int) else 0

public actual fun GetVolumePathNamesForVolumeNameW(lpszvolumename: PCWSTR, lpszvolumepathnames: PWSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_GetVolumePathNamesForVolumeNameW(lpszvolumename.toString(), lpszvolumepathnames.toString(), cchbufferlength.toInt(), lpcchreturnlength.toString()) as Int) else 0

public actual fun HandleLogFull(hlog: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_HandleLogFull(hlog.toString()) as Int) else 0

public actual fun InstallLogPolicy(hlog: HANDLE, ppolicy: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_InstallLogPolicy(hlog.toString(), ppolicy.toString()) as Int) else 0

public actual fun IsIoRingOpSupported(ioring: HIORING, op: IORING_OP_CODE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_IsIoRingOpSupported(ioring.toString(), op) as Int) else 0

public actual fun LZClose(hfile: Int) {
    if (_windowsWin32StorageFilesystemNapiAddon != null) {
        _windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LZClose(hfile)
    }
}

public actual fun LZCopy(hfsource: Int, hfdest: Int): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LZCopy(hfsource, hfdest) as Int) else 0

public actual fun LZDone() {
    if (_windowsWin32StorageFilesystemNapiAddon != null) {
        _windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LZDone()
    }
}

public actual fun LZInit(hfsource: Int): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LZInit(hfsource) as Int) else 0

public actual fun LZOpenFileA(lpfilename: PCSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LZOpenFileA(lpfilename.toString(), lpreopenbuf.toString(), wstyle.toInt()) as Int) else 0

public actual fun LZOpenFileW(lpfilename: PCWSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LZOpenFileW(lpfilename.toString(), lpreopenbuf.toString(), wstyle.toInt()) as Int) else 0

public actual fun LZRead(hfile: Int, lpbuffer: PSTR, cbread: Int): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LZRead(hfile, lpbuffer.toString(), cbread) as Int) else 0

public actual fun LZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LZSeek(hfile, loffset, iorigin) as Int) else 0

public actual fun LZStart(): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LZStart() as Int) else 0

public actual fun LocalFileTimeToFileTime(lplocalfiletime: Long, lpfiletime: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LocalFileTimeToFileTime(lplocalfiletime.toString(), lpfiletime.toString()) as Int) else 0

public actual fun LockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LockFile(hfile.toString(), dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt()) as Int) else 0

public actual fun LockFileEx(hfile: HANDLE, dwflags: LOCK_FILE_FLAGS, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LockFileEx(hfile.toString(), dwflags.toInt(), dwreserved.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt(), lpoverlapped.toString()) as Int) else 0

public actual fun LogTailAdvanceFailure(hlog: HANDLE, dwreason: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LogTailAdvanceFailure(hlog.toString(), dwreason.toInt()) as Int) else 0

public actual fun LsnBlockOffset(plsn: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LsnBlockOffset(plsn.toString()) as Int).toUInt() else 0u

public actual fun LsnContainer(plsn: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LsnContainer(plsn.toString()) as Int).toUInt() else 0u

public actual fun LsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN =
    CLS_LSN()

public actual fun LsnEqual(plsn1: Long, plsn2: Long): Boolean =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LsnEqual(plsn1.toString(), plsn2.toString()) as Boolean) else false

public actual fun LsnGreater(plsn1: Long, plsn2: Long): Boolean =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LsnGreater(plsn1.toString(), plsn2.toString()) as Boolean) else false

public actual fun LsnIncrement(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun LsnInvalid(plsn: Long): Boolean =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LsnInvalid(plsn.toString()) as Boolean) else false

public actual fun LsnLess(plsn1: Long, plsn2: Long): Boolean =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LsnLess(plsn1.toString(), plsn2.toString()) as Boolean) else false

public actual fun LsnNull(plsn: Long): Boolean =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LsnNull(plsn.toString()) as Boolean) else false

public actual fun LsnRecordSequence(plsn: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_LsnRecordSequence(plsn.toString()) as Int).toUInt() else 0u

public actual fun MoveFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_MoveFileA(lpexistingfilename.toString(), lpnewfilename.toString()) as Int) else 0

public actual fun MoveFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, dwflags: MOVE_FILE_FLAGS): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_MoveFileExA(lpexistingfilename.toString(), lpnewfilename.toString(), dwflags.toInt()) as Int) else 0

public actual fun MoveFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: MOVE_FILE_FLAGS): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_MoveFileExW(lpexistingfilename.toString(), lpnewfilename.toString(), dwflags.toInt()) as Int) else 0

public actual fun MoveFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_MoveFileFromAppW(lpexistingfilename.toString(), lpnewfilename.toString()) as Int) else 0

public actual fun MoveFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_MoveFileTransactedA(lpexistingfilename.toString(), lpnewfilename.toString(), lpprogressroutine.toLong().toString(), lpdata.toString(), dwflags.toInt(), htransaction.toString()) as Int) else 0

public actual fun MoveFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_MoveFileTransactedW(lpexistingfilename.toString(), lpnewfilename.toString(), lpprogressroutine.toLong().toString(), lpdata.toString(), dwflags.toInt(), htransaction.toString()) as Int) else 0

public actual fun MoveFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_MoveFileW(lpexistingfilename.toString(), lpnewfilename.toString()) as Int) else 0

public actual fun MoveFileWithProgressA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_MoveFileWithProgressA(lpexistingfilename.toString(), lpnewfilename.toString(), lpprogressroutine.toLong().toString(), lpdata.toString(), dwflags.toInt()) as Int) else 0

public actual fun MoveFileWithProgressW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_MoveFileWithProgressW(lpexistingfilename.toString(), lpnewfilename.toString(), lpprogressroutine.toLong().toString(), lpdata.toString(), dwflags.toInt()) as Int) else 0

public actual fun NetConnectionEnum(servername: PCWSTR, qualifier: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetConnectionEnum(servername.toString(), qualifier.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetFileClose(servername: PCWSTR, fileid: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetFileClose(servername.toString(), fileid.toInt()) as Int).toUInt() else 0u

public actual fun NetFileEnum(servername: PCWSTR, basepath: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetFileEnum(servername.toString(), basepath.toString(), username.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetFileGetInfo(servername: PCWSTR, fileid: UInt, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetFileGetInfo(servername.toString(), fileid.toInt(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetServerAliasAdd(servername: PCWSTR, level: UInt, buf: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetServerAliasAdd(servername.toString(), level.toInt(), buf.toString()) as Int).toUInt() else 0u

public actual fun NetServerAliasDel(servername: PCWSTR, level: UInt, buf: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetServerAliasDel(servername.toString(), level.toInt(), buf.toString()) as Int).toUInt() else 0u

public actual fun NetServerAliasEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetServerAliasEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resumehandle.toString()) as Int).toUInt() else 0u

public actual fun NetSessionDel(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetSessionDel(servername.toString(), uncclientname.toString(), username.toString()) as Int).toUInt() else 0u

public actual fun NetSessionEnum(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetSessionEnum(servername.toString(), uncclientname.toString(), username.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetSessionGetInfo(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetSessionGetInfo(servername.toString(), uncclientname.toString(), username.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetShareAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetShareAdd(servername.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetShareCheck(servername: PCWSTR, device: PCWSTR, type: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetShareCheck(servername.toString(), device.toString(), type.toString()) as Int).toUInt() else 0u

public actual fun NetShareDel(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetShareDel(servername.toString(), netname.toString(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun NetShareDelEx(servername: PCWSTR, level: UInt, buf: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetShareDelEx(servername.toString(), level.toInt(), buf.toString()) as Int).toUInt() else 0u

public actual fun NetShareDelSticky(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetShareDelSticky(servername.toString(), netname.toString(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun NetShareEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetShareEnum(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetShareEnumSticky(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetShareEnumSticky(servername.toString(), level.toInt(), bufptr.toString(), prefmaxlen.toInt(), entriesread.toString(), totalentries.toString(), resume_handle.toString()) as Int).toUInt() else 0u

public actual fun NetShareGetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, bufptr: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetShareGetInfo(servername.toString(), netname.toString(), level.toInt(), bufptr.toString()) as Int).toUInt() else 0u

public actual fun NetShareSetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetShareSetInfo(servername.toString(), netname.toString(), level.toInt(), buf.toString(), parm_err.toString()) as Int).toUInt() else 0u

public actual fun NetStatisticsGet(servername: Long, service: Long, level: UInt, options: UInt, buffer: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_NetStatisticsGet(servername.toString(), service.toString(), level.toInt(), options.toInt(), buffer.toString()) as Int).toUInt() else 0u

public actual fun OpenEncryptedFileRawA(lpfilename: PCSTR, ulflags: UInt, pvcontext: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_OpenEncryptedFileRawA(lpfilename.toString(), ulflags.toInt(), pvcontext.toString()) as Int).toUInt() else 0u

public actual fun OpenEncryptedFileRawW(lpfilename: PCWSTR, ulflags: UInt, pvcontext: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_OpenEncryptedFileRawW(lpfilename.toString(), ulflags.toInt(), pvcontext.toString()) as Int).toUInt() else 0u

public actual fun OpenEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentid: Long): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_OpenEnlistment(dwdesiredaccess.toInt(), resourcemanagerhandle.toString(), enlistmentid.toString()) as String).toLong() else 0L

public actual fun OpenFile(lpfilename: PCSTR, lpreopenbuff: Long, ustyle: UInt): Int =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_OpenFile(lpfilename.toString(), lpreopenbuff.toString(), ustyle.toInt()) as Int) else 0

public actual fun OpenFileById(hvolumehint: HANDLE, lpfileid: Long, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_OpenFileById(hvolumehint.toString(), lpfileid.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.toString(), dwflagsandattributes.toInt()) as String).toLong() else 0L

public actual fun OpenResourceManager(dwdesiredaccess: UInt, tmhandle: HANDLE, resourcemanagerid: Long): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_OpenResourceManager(dwdesiredaccess.toInt(), tmhandle.toString(), resourcemanagerid.toString()) as String).toLong() else 0L

public actual fun OpenTransaction(dwdesiredaccess: UInt, transactionid: Long): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_OpenTransaction(dwdesiredaccess.toInt(), transactionid.toString()) as String).toLong() else 0L

public actual fun OpenTransactionManager(logfilename: PCWSTR, desiredaccess: UInt, openoptions: UInt): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_OpenTransactionManager(logfilename.toString(), desiredaccess.toInt(), openoptions.toInt()) as String).toLong() else 0L

public actual fun OpenTransactionManagerById(transactionmanagerid: Long, desiredaccess: UInt, openoptions: UInt): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_OpenTransactionManagerById(transactionmanagerid.toString(), desiredaccess.toInt(), openoptions.toInt()) as String).toLong() else 0L

public actual fun PopIoRingCompletion(ioring: HIORING, cqe: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_PopIoRingCompletion(ioring.toString(), cqe.toString()) as Int) else 0

public actual fun PrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_PrePrepareComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun PrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_PrePrepareEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun PrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_PrepareComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun PrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_PrepareEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun PrepareLogArchive(hlog: HANDLE, pszbaselogfilename: PWSTR, clen: UInt, plsnlow: Long, plsnhigh: Long, pcactuallength: Long, poffbaselogfiledata: Long, pcbbaselogfilelength: Long, plsnbase: Long, plsnlast: Long, plsncurrentarchivetail: Long, ppvarchivecontext: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_PrepareLogArchive(hlog.toString(), pszbaselogfilename.toString(), clen.toInt(), plsnlow.toString(), plsnhigh.toString(), pcactuallength.toString(), poffbaselogfiledata.toString(), pcbbaselogfilelength.toString(), plsnbase.toString(), plsnlast.toString(), plsncurrentarchivetail.toString(), ppvarchivecontext.toString()) as Int) else 0

public actual fun PrepareTape(hdevice: HANDLE, dwoperation: PREPARE_TAPE_OPERATION, bimmediate: BOOL): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_PrepareTape(hdevice.toString(), dwoperation.toInt(), bimmediate) as Int).toUInt() else 0u

public actual fun QueryDosDeviceA(lpdevicename: PCSTR, lptargetpath: PSTR, ucchmax: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_QueryDosDeviceA(lpdevicename.toString(), lptargetpath.toString(), ucchmax.toInt()) as Int).toUInt() else 0u

public actual fun QueryDosDeviceW(lpdevicename: PCWSTR, lptargetpath: PWSTR, ucchmax: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_QueryDosDeviceW(lpdevicename.toString(), lptargetpath.toString(), ucchmax.toInt()) as Int).toUInt() else 0u

public actual fun QueryIoRingCapabilities(capabilities: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_QueryIoRingCapabilities(capabilities.toString()) as Int) else 0

public actual fun QueryLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE, ppolicybuffer: Long, pcbpolicybuffer: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_QueryLogPolicy(hlog.toString(), epolicytype, ppolicybuffer.toString(), pcbpolicybuffer.toString()) as Int) else 0

public actual fun QueryRecoveryAgentsOnEncryptedFile(lpfilename: PCWSTR, precoveryagents: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_QueryRecoveryAgentsOnEncryptedFile(lpfilename.toString(), precoveryagents.toString()) as Int).toUInt() else 0u

public actual fun QueryUsersOnEncryptedFile(lpfilename: PCWSTR, pusers: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_QueryUsersOnEncryptedFile(lpfilename.toString(), pusers.toString()) as Int).toUInt() else 0u

public actual fun ReOpenFile(horiginalfile: HANDLE, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReOpenFile(horiginalfile.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwflagsandattributes.toInt()) as String).toLong() else 0L

public actual fun ReadDirectoryChangesExW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE, readdirectorynotifyinformationclass: READ_DIRECTORY_NOTIFY_INFORMATION_CLASS): BOOL =
    0

public actual fun ReadDirectoryChangesW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun ReadEncryptedFileRaw(pfexportcallback: PFE_EXPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReadEncryptedFileRaw(pfexportcallback.toLong().toString(), pvcallbackcontext.toString(), pvcontext.toString()) as Int).toUInt() else 0u

public actual fun ReadFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReadFile(hfile.toString(), lpbuffer.toString(), nnumberofbytestoread.toInt(), lpnumberofbytesread.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun ReadFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun ReadFileScatter(hfile: HANDLE, asegmentarray: Long, nnumberofbytestoread: UInt, lpreserved: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReadFileScatter(hfile.toString(), asegmentarray.toString(), nnumberofbytestoread.toInt(), lpreserved.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun ReadLogArchiveMetadata(pvarchivecontext: Long, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: Long, pcbbytesread: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReadLogArchiveMetadata(pvarchivecontext.toString(), cboffset.toInt(), cbbytestoread.toInt(), pbreadbuffer.toString(), pcbbytesread.toString()) as Int) else 0

public actual fun ReadLogNotification(hlog: HANDLE, pnotification: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReadLogNotification(hlog.toString(), pnotification.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun ReadLogRecord(pvmarshal: Long, plsnfirst: Long, econtextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReadLogRecord(pvmarshal.toString(), plsnfirst.toString(), econtextmode, ppvreadbuffer.toString(), pcbreadbuffer.toString(), perecordtype.toString(), plsnundonext.toString(), plsnprevious.toString(), ppvreadcontext.toString(), poverlapped.toString()) as Int) else 0

public actual fun ReadLogRestartArea(pvmarshal: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvcontext: Long, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReadLogRestartArea(pvmarshal.toString(), ppvrestartbuffer.toString(), pcbrestartbuffer.toString(), plsn.toString(), ppvcontext.toString(), poverlapped.toString()) as Int) else 0

public actual fun ReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReadNextLogRecord(pvreadcontext.toString(), ppvbuffer.toString(), pcbbuffer.toString(), perecordtype.toString(), plsnuser.toString(), plsnundonext.toString(), plsnprevious.toString(), plsnrecord.toString(), poverlapped.toString()) as Int) else 0

public actual fun ReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReadOnlyEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ReadPreviousLogRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReadPreviousLogRestartArea(pvreadcontext.toString(), ppvrestartbuffer.toString(), pcbrestartbuffer.toString(), plsnrestart.toString(), poverlapped.toString()) as Int) else 0

public actual fun RecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RecoverEnlistment(enlistmenthandle.toString(), enlistmentkey.toString()) as Int) else 0

public actual fun RecoverResourceManager(resourcemanagerhandle: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RecoverResourceManager(resourcemanagerhandle.toString()) as Int) else 0

public actual fun RecoverTransactionManager(transactionmanagerhandle: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RecoverTransactionManager(transactionmanagerhandle.toString()) as Int) else 0

public actual fun RegisterForLogWriteNotification(hlog: HANDLE, cbthreshold: UInt, fenable: BOOL): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RegisterForLogWriteNotification(hlog.toString(), cbthreshold.toInt(), fenable) as Int) else 0

public actual fun RegisterManageableLogClient(hlog: HANDLE, pcallbacks: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RegisterManageableLogClient(hlog.toString(), pcallbacks.toString()) as Int) else 0

public actual fun RemoveDirectoryA(lppathname: PCSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RemoveDirectoryA(lppathname.toString()) as Int) else 0

public actual fun RemoveDirectoryFromAppW(lppathname: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RemoveDirectoryFromAppW(lppathname.toString()) as Int) else 0

public actual fun RemoveDirectoryTransactedA(lppathname: PCSTR, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RemoveDirectoryTransactedA(lppathname.toString(), htransaction.toString()) as Int) else 0

public actual fun RemoveDirectoryTransactedW(lppathname: PCWSTR, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RemoveDirectoryTransactedW(lppathname.toString(), htransaction.toString()) as Int) else 0

public actual fun RemoveDirectoryW(lppathname: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RemoveDirectoryW(lppathname.toString()) as Int) else 0

public actual fun RemoveLogContainer(hlog: HANDLE, pwszcontainerpath: PCWSTR, fforce: BOOL, preserved: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RemoveLogContainer(hlog.toString(), pwszcontainerpath.toString(), fforce, preserved.toString()) as Int) else 0

public actual fun RemoveLogContainerSet(hlog: HANDLE, ccontainer: UShort, rgwszcontainerpath: Long, fforce: BOOL, preserved: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RemoveLogContainerSet(hlog.toString(), ccontainer.toInt(), rgwszcontainerpath.toString(), fforce, preserved.toString()) as Int) else 0

public actual fun RemoveLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RemoveLogPolicy(hlog.toString(), epolicytype) as Int) else 0

public actual fun RemoveUsersFromEncryptedFile(lpfilename: PCWSTR, phashes: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RemoveUsersFromEncryptedFile(lpfilename.toString(), phashes.toString()) as Int).toUInt() else 0u

public actual fun RenameTransactionManager(logfilename: PCWSTR, existingtransactionmanagerguid: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RenameTransactionManager(logfilename.toString(), existingtransactionmanagerguid.toString()) as Int) else 0

public actual fun ReplaceFileA(lpreplacedfilename: PCSTR, lpreplacementfilename: PCSTR, lpbackupfilename: PCSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReplaceFileA(lpreplacedfilename.toString(), lpreplacementfilename.toString(), lpbackupfilename.toString(), dwreplaceflags.toInt(), lpexclude.toString(), lpreserved.toString()) as Int) else 0

public actual fun ReplaceFileFromAppW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: UInt, lpexclude: Long, lpreserved: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReplaceFileFromAppW(lpreplacedfilename.toString(), lpreplacementfilename.toString(), lpbackupfilename.toString(), dwreplaceflags.toInt(), lpexclude.toString(), lpreserved.toString()) as Int) else 0

public actual fun ReplaceFileW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReplaceFileW(lpreplacedfilename.toString(), lpreplacementfilename.toString(), lpbackupfilename.toString(), dwreplaceflags.toInt(), lpexclude.toString(), lpreserved.toString()) as Int) else 0

public actual fun ReserveAndAppendLog(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReserveAndAppendLog(pvmarshal.toString(), rgwriteentries.toString(), cwriteentries.toInt(), plsnundonext.toString(), plsnprevious.toString(), creserverecords.toInt(), rgcbreservation.toString(), fflags.toInt(), plsn.toString(), poverlapped.toString()) as Int) else 0

public actual fun ReserveAndAppendLogAligned(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ReserveAndAppendLogAligned(pvmarshal.toString(), rgwriteentries.toString(), cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext.toString(), plsnprevious.toString(), creserverecords.toInt(), rgcbreservation.toString(), fflags.toInt(), plsn.toString(), poverlapped.toString()) as Int) else 0

public actual fun RollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RollbackComplete(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun RollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RollbackEnlistment(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun RollbackTransaction(transactionhandle: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RollbackTransaction(transactionhandle.toString()) as Int) else 0

public actual fun RollbackTransactionAsync(transactionhandle: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RollbackTransactionAsync(transactionhandle.toString()) as Int) else 0

public actual fun RollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_RollforwardTransactionManager(transactionmanagerhandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun ScanLogContainers(pcxscan: Long, escanmode: UByte, preserved: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ScanLogContainers(pcxscan.toString(), escanmode.toInt(), preserved.toString()) as Int) else 0

public actual fun SearchPathA(lppath: PCSTR, lpfilename: PCSTR, lpextension: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SearchPathA(lppath.toString(), lpfilename.toString(), lpextension.toString(), nbufferlength.toInt(), lpbuffer.toString(), lpfilepart.toString()) as Int).toUInt() else 0u

public actual fun SearchPathW(lppath: PCWSTR, lpfilename: PCWSTR, lpextension: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SearchPathW(lppath.toString(), lpfilename.toString(), lpextension.toString(), nbufferlength.toInt(), lpbuffer.toString(), lpfilepart.toString()) as Int).toUInt() else 0u

public actual fun SetEncryptedFileMetadata(lpfilename: PCWSTR, pboldmetadata: Long, pbnewmetadata: Long, pownerhash: Long, dwoperation: UInt, pcertificatesadded: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetEncryptedFileMetadata(lpfilename.toString(), pboldmetadata.toString(), pbnewmetadata.toString(), pownerhash.toString(), dwoperation.toInt(), pcertificatesadded.toString()) as Int).toUInt() else 0u

public actual fun SetEndOfFile(hfile: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetEndOfFile(hfile.toString()) as Int) else 0

public actual fun SetEndOfLog(hlog: HANDLE, plsnend: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetEndOfLog(hlog.toString(), plsnend.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun SetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetEnlistmentRecoveryInformation(enlistmenthandle.toString(), buffersize.toInt(), buffer.toString()) as Int) else 0

public actual fun SetFileApisToANSI() {
    if (_windowsWin32StorageFilesystemNapiAddon != null) {
        _windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileApisToANSI()
    }
}

public actual fun SetFileApisToOEM() {
    if (_windowsWin32StorageFilesystemNapiAddon != null) {
        _windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileApisToOEM()
    }
}

public actual fun SetFileAttributesA(lpfilename: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileAttributesA(lpfilename.toString(), dwfileattributes.toInt()) as Int) else 0

public actual fun SetFileAttributesFromAppW(lpfilename: PCWSTR, dwfileattributes: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileAttributesFromAppW(lpfilename.toString(), dwfileattributes.toInt()) as Int) else 0

public actual fun SetFileAttributesTransactedA(lpfilename: PCSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileAttributesTransactedA(lpfilename.toString(), dwfileattributes.toInt(), htransaction.toString()) as Int) else 0

public actual fun SetFileAttributesTransactedW(lpfilename: PCWSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileAttributesTransactedW(lpfilename.toString(), dwfileattributes.toInt(), htransaction.toString()) as Int) else 0

public actual fun SetFileAttributesW(lpfilename: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileAttributesW(lpfilename.toString(), dwfileattributes.toInt()) as Int) else 0

public actual fun SetFileBandwidthReservation(hfile: HANDLE, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: BOOL, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileBandwidthReservation(hfile.toString(), nperiodmilliseconds.toInt(), nbytesperperiod.toInt(), bdiscardable, lptransfersize.toString(), lpnumoutstandingrequests.toString()) as Int) else 0

public actual fun SetFileCompletionNotificationModes(filehandle: HANDLE, flags: UByte): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileCompletionNotificationModes(filehandle.toString(), flags.toInt()) as Int) else 0

public actual fun SetFileInformationByHandle(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileInformationByHandle(hfile.toString(), fileinformationclass, lpfileinformation.toString(), dwbuffersize.toInt()) as Int) else 0

public actual fun SetFileIoOverlappedRange(filehandle: HANDLE, overlappedrangestart: Long, length: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileIoOverlappedRange(filehandle.toString(), overlappedrangestart.toString(), length.toInt()) as Int) else 0

public actual fun SetFilePointer(hfile: HANDLE, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFilePointer(hfile.toString(), ldistancetomove, lpdistancetomovehigh.toString(), dwmovemethod.toInt()) as Int).toUInt() else 0u

public actual fun SetFilePointerEx(hfile: HANDLE, lidistancetomove: Long, lpnewfilepointer: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFilePointerEx(hfile.toString(), lidistancetomove.toString(), lpnewfilepointer.toString(), dwmovemethod.toInt()) as Int) else 0

public actual fun SetFileShortNameA(hfile: HANDLE, lpshortname: PCSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileShortNameA(hfile.toString(), lpshortname.toString()) as Int) else 0

public actual fun SetFileShortNameW(hfile: HANDLE, lpshortname: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileShortNameW(hfile.toString(), lpshortname.toString()) as Int) else 0

public actual fun SetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileTime(hfile.toString(), lpcreationtime.toString(), lplastaccesstime.toString(), lplastwritetime.toString()) as Int) else 0

public actual fun SetFileValidData(hfile: HANDLE, validdatalength: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetFileValidData(hfile.toString(), validdatalength.toString()) as Int) else 0

public actual fun SetIoRingCompletionEvent(ioring: HIORING, hevent: HANDLE): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetIoRingCompletionEvent(ioring.toString(), hevent.toString()) as Int) else 0

public actual fun SetLogArchiveMode(hlog: HANDLE, emode: CLFS_LOG_ARCHIVE_MODE): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetLogArchiveMode(hlog.toString(), emode) as Int) else 0

public actual fun SetLogArchiveTail(hlog: HANDLE, plsnarchivetail: Long, preserved: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetLogArchiveTail(hlog.toString(), plsnarchivetail.toString(), preserved.toString()) as Int) else 0

public actual fun SetLogFileSizeWithPolicy(hlog: HANDLE, pdesiredsize: Long, presultingsize: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetLogFileSizeWithPolicy(hlog.toString(), pdesiredsize.toString(), presultingsize.toString()) as Int) else 0

public actual fun SetResourceManagerCompletionPort(resourcemanagerhandle: HANDLE, iocompletionporthandle: HANDLE, completionkey: ULong): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetResourceManagerCompletionPort(resourcemanagerhandle.toString(), iocompletionporthandle.toString(), completionkey.toString()) as Int) else 0

public actual fun SetSearchPathMode(flags: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetSearchPathMode(flags.toInt()) as Int) else 0

public actual fun SetTapeParameters(hdevice: HANDLE, dwoperation: TAPE_INFORMATION_TYPE, lptapeinformation: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetTapeParameters(hdevice.toString(), dwoperation.toInt(), lptapeinformation.toString()) as Int).toUInt() else 0u

public actual fun SetTapePosition(hdevice: HANDLE, dwpositionmethod: TAPE_POSITION_METHOD, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: BOOL): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetTapePosition(hdevice.toString(), dwpositionmethod.toInt(), dwpartition.toInt(), dwoffsetlow.toInt(), dwoffsethigh.toInt(), bimmediate) as Int).toUInt() else 0u

public actual fun SetTransactionInformation(transactionhandle: HANDLE, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetTransactionInformation(transactionhandle.toString(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), description.toString()) as Int) else 0

public actual fun SetUserFileEncryptionKey(pencryptioncertificate: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetUserFileEncryptionKey(pencryptioncertificate.toString()) as Int).toUInt() else 0u

public actual fun SetUserFileEncryptionKeyEx(pencryptioncertificate: Long, dwcapabilities: UInt, dwflags: UInt, pvreserved: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetUserFileEncryptionKeyEx(pencryptioncertificate.toString(), dwcapabilities.toInt(), dwflags.toInt(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun SetVolumeLabelA(lprootpathname: PCSTR, lpvolumename: PCSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetVolumeLabelA(lprootpathname.toString(), lpvolumename.toString()) as Int) else 0

public actual fun SetVolumeLabelW(lprootpathname: PCWSTR, lpvolumename: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetVolumeLabelW(lprootpathname.toString(), lpvolumename.toString()) as Int) else 0

public actual fun SetVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PCSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetVolumeMountPointA(lpszvolumemountpoint.toString(), lpszvolumename.toString()) as Int) else 0

public actual fun SetVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PCWSTR): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SetVolumeMountPointW(lpszvolumemountpoint.toString(), lpszvolumename.toString()) as Int) else 0

public actual fun SinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SinglePhaseReject(enlistmenthandle.toString(), tmvirtualclock.toString()) as Int) else 0

public actual fun SubmitIoRing(ioring: HIORING, waitoperations: UInt, milliseconds: UInt, submittedentries: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_SubmitIoRing(ioring.toString(), waitoperations.toInt(), milliseconds.toInt(), submittedentries.toString()) as Int) else 0

public actual fun TerminateLogArchive(pvarchivecontext: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_TerminateLogArchive(pvarchivecontext.toString()) as Int) else 0

public actual fun TerminateReadLog(pvcursorcontext: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_TerminateReadLog(pvcursorcontext.toString()) as Int) else 0

public actual fun TruncateLog(pvmarshal: Long, plsnend: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_TruncateLog(pvmarshal.toString(), plsnend.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun TxfGetThreadMiniVersionForCreate(miniversion: Long) {
    if (_windowsWin32StorageFilesystemNapiAddon != null) {
        _windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_TxfGetThreadMiniVersionForCreate(miniversion.toString())
    }
}

public actual fun TxfLogCreateFileReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, txffileid: Long, txflogcontext: Long): BOOL =
    0

public actual fun TxfLogCreateRangeReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, beginningvirtualclock: Long, endingvirtualclock: Long, recordtypemask: UInt, txflogcontext: Long): BOOL =
    0

public actual fun TxfLogDestroyReadContext(txflogcontext: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_TxfLogDestroyReadContext(txflogcontext.toString()) as Int) else 0

public actual fun TxfLogReadRecords(txflogcontext: Long, bufferlength: UInt, buffer: Long, bytesused: Long, recordcount: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_TxfLogReadRecords(txflogcontext.toString(), bufferlength.toInt(), buffer.toString(), bytesused.toString(), recordcount.toString()) as Int) else 0

public actual fun TxfLogRecordGetFileName(recordbuffer: Long, recordbufferlengthinbytes: UInt, namebuffer: PWSTR, namebufferlengthinbytes: Long, txfid: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_TxfLogRecordGetFileName(recordbuffer.toString(), recordbufferlengthinbytes.toInt(), namebuffer.toString(), namebufferlengthinbytes.toString(), txfid.toString()) as Int) else 0

public actual fun TxfLogRecordGetGenericType(recordbuffer: Long, recordbufferlengthinbytes: UInt, generictype: Long, virtualclock: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_TxfLogRecordGetGenericType(recordbuffer.toString(), recordbufferlengthinbytes.toInt(), generictype.toString(), virtualclock.toString()) as Int) else 0

public actual fun TxfReadMetadataInfo(filehandle: HANDLE, txffileid: Long, lastlsn: Long, transactionstate: Long, lockingtransaction: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_TxfReadMetadataInfo(filehandle.toString(), txffileid.toString(), lastlsn.toString(), transactionstate.toString(), lockingtransaction.toString()) as Int) else 0

public actual fun TxfSetThreadMiniVersionForCreate(miniversion: UShort) {
    if (_windowsWin32StorageFilesystemNapiAddon != null) {
        _windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_TxfSetThreadMiniVersionForCreate(miniversion.toInt())
    }
}

public actual fun UnlockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_UnlockFile(hfile.toString(), dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt()) as Int) else 0

public actual fun UnlockFileEx(hfile: HANDLE, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_UnlockFileEx(hfile.toString(), dwreserved.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt(), lpoverlapped.toString()) as Int) else 0

public actual fun ValidateLog(pszlogfilename: PCWSTR, psalogfile: Long, pinfobuffer: Long, pcbbuffer: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_ValidateLog(pszlogfilename.toString(), psalogfile.toString(), pinfobuffer.toString(), pcbbuffer.toString()) as Int) else 0

public actual fun VerFindFileA(uflags: VER_FIND_FILE_FLAGS, szfilename: PCSTR, szwindir: PCSTR, szappdir: PCSTR, szcurdir: PSTR, pucurdirlen: Long, szdestdir: PSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_VerFindFileA(uflags.toInt(), szfilename.toString(), szwindir.toString(), szappdir.toString(), szcurdir.toString(), pucurdirlen.toString(), szdestdir.toString(), pudestdirlen.toString()) as Int).toUInt() else 0u

public actual fun VerFindFileW(uflags: VER_FIND_FILE_FLAGS, szfilename: PCWSTR, szwindir: PCWSTR, szappdir: PCWSTR, szcurdir: PWSTR, pucurdirlen: Long, szdestdir: PWSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_VerFindFileW(uflags.toInt(), szfilename.toString(), szwindir.toString(), szappdir.toString(), szcurdir.toString(), pucurdirlen.toString(), szdestdir.toString(), pudestdirlen.toString()) as Int).toUInt() else 0u

public actual fun VerInstallFileA(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCSTR, szdestfilename: PCSTR, szsrcdir: PCSTR, szdestdir: PCSTR, szcurdir: PCSTR, sztmpfile: PSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_VerInstallFileA(uflags.toInt(), szsrcfilename.toString(), szdestfilename.toString(), szsrcdir.toString(), szdestdir.toString(), szcurdir.toString(), sztmpfile.toString(), putmpfilelen.toString()) as Int).toUInt() else 0u

public actual fun VerInstallFileW(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCWSTR, szdestfilename: PCWSTR, szsrcdir: PCWSTR, szdestdir: PCWSTR, szcurdir: PCWSTR, sztmpfile: PWSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_VerInstallFileW(uflags.toInt(), szsrcfilename.toString(), szdestfilename.toString(), szsrcdir.toString(), szdestdir.toString(), szcurdir.toString(), sztmpfile.toString(), putmpfilelen.toString()) as Int).toUInt() else 0u

public actual fun VerLanguageNameA(wlang: UInt, szlang: PSTR, cchlang: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_VerLanguageNameA(wlang.toInt(), szlang.toString(), cchlang.toInt()) as Int).toUInt() else 0u

public actual fun VerLanguageNameW(wlang: UInt, szlang: PWSTR, cchlang: UInt): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_VerLanguageNameW(wlang.toInt(), szlang.toString(), cchlang.toInt()) as Int).toUInt() else 0u

public actual fun VerQueryValueA(pblock: Long, lpsubblock: PCSTR, lplpbuffer: Long, pulen: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_VerQueryValueA(pblock.toString(), lpsubblock.toString(), lplpbuffer.toString(), pulen.toString()) as Int) else 0

public actual fun VerQueryValueW(pblock: Long, lpsubblock: PCWSTR, lplpbuffer: Long, pulen: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_VerQueryValueW(pblock.toString(), lpsubblock.toString(), lplpbuffer.toString(), pulen.toString()) as Int) else 0

public actual fun WofEnumEntries(volumename: PCWSTR, provider: UInt, enumproc: WofEnumEntryProc, userdata: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofEnumEntries(volumename.toString(), provider.toInt(), enumproc.toLong().toString(), userdata.toString()) as Int) else 0

public actual fun WofFileEnumFiles(volumename: PCWSTR, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofFileEnumFiles(volumename.toString(), algorithm.toInt(), enumproc.toLong().toString(), userdata.toString()) as Int) else 0

public actual fun WofGetDriverVersion(fileorvolumehandle: HANDLE, provider: UInt, wofversion: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofGetDriverVersion(fileorvolumehandle.toString(), provider.toInt(), wofversion.toString()) as Int) else 0

public actual fun WofIsExternalFile(filepath: PCWSTR, isexternalfile: Long, provider: Long, externalfileinfo: Long, bufferlength: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofIsExternalFile(filepath.toString(), isexternalfile.toString(), provider.toString(), externalfileinfo.toString(), bufferlength.toString()) as Int) else 0

public actual fun WofSetFileDataLocation(filehandle: HANDLE, provider: UInt, externalfileinfo: Long, length: UInt): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofSetFileDataLocation(filehandle.toString(), provider.toInt(), externalfileinfo.toString(), length.toInt()) as Int) else 0

public actual fun WofShouldCompressBinaries(volume: PCWSTR, algorithm: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofShouldCompressBinaries(volume.toString(), algorithm.toString()) as Int) else 0

public actual fun WofWimAddEntry(volumename: PCWSTR, wimpath: PCWSTR, wimtype: UInt, wimindex: UInt, datasourceid: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofWimAddEntry(volumename.toString(), wimpath.toString(), wimtype.toInt(), wimindex.toInt(), datasourceid.toString()) as Int) else 0

public actual fun WofWimEnumFiles(volumename: PCWSTR, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofWimEnumFiles(volumename.toString(), datasourceid.toString(), enumproc.toLong().toString(), userdata.toString()) as Int) else 0

public actual fun WofWimRemoveEntry(volumename: PCWSTR, datasourceid: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofWimRemoveEntry(volumename.toString(), datasourceid.toString()) as Int) else 0

public actual fun WofWimSuspendEntry(volumename: PCWSTR, datasourceid: Long): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofWimSuspendEntry(volumename.toString(), datasourceid.toString()) as Int) else 0

public actual fun WofWimUpdateEntry(volumename: PCWSTR, datasourceid: Long, newwimpath: PCWSTR): HRESULT =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WofWimUpdateEntry(volumename.toString(), datasourceid.toString(), newwimpath.toString()) as Int) else 0

public actual fun Wow64DisableWow64FsRedirection(oldvalue: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_Wow64DisableWow64FsRedirection(oldvalue.toString()) as Int) else 0

public actual fun Wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_Wow64EnableWow64FsRedirection(wow64fsenableredirection) as Boolean) else false

public actual fun Wow64RevertWow64FsRedirection(olvalue: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_Wow64RevertWow64FsRedirection(olvalue.toString()) as Int) else 0

public actual fun WriteEncryptedFileRaw(pfimportcallback: PFE_IMPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WriteEncryptedFileRaw(pfimportcallback.toLong().toString(), pvcallbackcontext.toString(), pvcontext.toString()) as Int).toUInt() else 0u

public actual fun WriteFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WriteFile(hfile.toString(), lpbuffer.toString(), nnumberofbytestowrite.toInt(), lpnumberofbyteswritten.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun WriteFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun WriteFileGather(hfile: HANDLE, asegmentarray: Long, nnumberofbytestowrite: UInt, lpreserved: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WriteFileGather(hfile.toString(), asegmentarray.toString(), nnumberofbytestowrite.toInt(), lpreserved.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun WriteLogRestartArea(pvmarshal: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: CLFS_FLAG, pcbwritten: Long, plsnnext: Long, poverlapped: Long): BOOL =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WriteLogRestartArea(pvmarshal.toString(), pvrestartbuffer.toString(), cbrestartbuffer.toInt(), plsnbase.toString(), fflags.toInt(), pcbwritten.toString(), plsnnext.toString(), poverlapped.toString()) as Int) else 0

public actual fun WriteTapemark(hdevice: HANDLE, dwtapemarktype: TAPEMARK_TYPE, dwtapemarkcount: UInt, bimmediate: BOOL): UInt =
    if (_windowsWin32StorageFilesystemNapiAddon != null) (_windowsWin32StorageFilesystemNapiAddon.windowssys_windows_win32_storage_filesystem_WriteTapemark(hdevice.toString(), dwtapemarktype.toInt(), dwtapemarkcount.toInt(), bimmediate) as Int).toUInt() else 0u
